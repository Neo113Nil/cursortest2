//Fixing IE9 console missing
if (!window.console) {
    window.console = {};
}
if (!window.console.log) {
    window.console.log = function () { };
}

/**
 * @namespace
 */
var CIE = {};

CIE.enabledLog = false;

/**
 * Safely logs to console.log.
 */
CIE.oneLog = function()
{
    if (!CIE.enabledLog) return;

    try {
        console.log.apply(console, arguments);
    } catch(ex) {
        // Do nothing.
    }
};

/**
 * Helper class Utility
 * @namespace
 */
CIE.Utility = {};

/**
 * Detection mobile devices
 * @returns {boolean}
 */
CIE.Utility.isMobileDevice = function() {
    return /Android|webOS|iPhone|iPad|iPod|BlackBerry|IEMobile|Opera Mini/i.test(navigator.userAgent);
};
/**
 * Rotate iFrame wrapper for PWA
 * @returns void
 */
CIE.Utility.rotateIFrameWrapper = function() {
    // The popup content is designed landscape; when the viewport is portrait we rotate the
    // wrapper 90deg so it still reads landscape. Use the actual viewport shape instead of
    // window.orientation: that property is deprecated and on modern iOS/Android WebViews
    // reports 0 even while the app is displayed landscape, which rotated the landscape
    // popup into a portrait box.
    var isPortraitViewport = window.innerHeight > window.innerWidth;
    var rotateAngle = isPortraitViewport ? 90 : 0;
    var rotateBox = document.getElementById('OneRewardDiv');
    if (rotateBox) {
        rotateBox.style.transform = "rotate(" + rotateAngle + "deg)";
    }
};

/**
 * Helper class for WAF response preparation
 * @param response
 * @constructor
 */
CIE.WAF = function (response) {
    var _response = response;
    var _responseData = {
        errorDescription: '',
        supportId: ''
    };
    var _hasError = false;

    this._init = (function () {
        var response = {};
        try {
            response = JSON.parse(_response);
        } catch (e) { }

        if ((typeof response === 'object') && response.hasOwnProperty('service')) {
            _responseData.errorDescription = response.service.hasOwnProperty('error_desc') ? response.service.error_desc : '';
            _responseData.supportId = response.service.hasOwnProperty('support_id') ? response.service.support_id : '';
            _hasError = _responseData.errorDescription === 'MAINTENANCE';
        }
    })();

    /**
     * @returns {boolean}
     */
    this.hasError = function() {
        return _hasError;
    };

    /**
     * @returns {{errorDescription: string, supportId: string}}
     */
    this.getResponseData = function() {
        return _responseData;
    };
};
/**
 * @return {string} Universal unique identifier.
 * @see https://en.wikipedia.org/wiki/Universally_unique_identifier
 */
CIE.UUID = function()
{
    var d = new Date().getTime();
    var uuid;
    uuid = 'xxxxxxxx-xxxx-4xxx-yxxx-xxxxxxxxxxxx'.replace(/[xy]/g, function (c) {
        var r = (d + Math.random() * 16) % 16 | 0;
        d = Math.floor(d / 16);
        return (c == 'x' ? r : (r & 0x7 | 0x8)).toString(16);
    });
    return uuid;
};
/**
 * Represent pair of linked instances.
 * @param first {*} First instance.
 * @param second {*} Second instance.
 * @constructor
 */

CIE.Pair = function(first, second)
{
	/**
	 * First instance of pair.
	 * @type {*}
	 */
	this.first = first;
	/**
	 * Second instance of pair.
	 * @type {*}
	 */
	this.second = second;
};
/**
 * @callback CIE.OneRewardEndPointCallerResult
 * @param {CIE.AsyncHTTPJSONRequest} Loader object.
 */

/**
 * Helper class for handling HTTP requests.
 * @param url {string} URL to load.
 * @param callback {CIE.OneRewardEndPointCallerResult} Function to trigger when loading finished.
 * @optional
 * @param params {Object|string} Params to send. In case of Object it will be converted to JSON string with
 * {@link JSON.stringify in case of string it will be used as is.
 * If absent or incorrect JSON stringifying value "{}" will be used.
 * @optional
 * @param type {string} HTTP method for request. If absent "POST" will be used.
 * @optional
 * @constructor
 */
CIE.AsyncHTTPJSONRequest = function(url, callback, params, type, isApplicationJsonHeader) {
    var _self = this;
    var _url = url;
    var _callback = callback;
    var _params = params;
    var _type = type;
    var _isApplicationJsonHeader = isApplicationJsonHeader;
    var _isTimeout = false;
    var _isError   = false;
    var _response  = "";
    var _status    = 0;    

    if(_type == undefined){
        _type = "POST";
    }

    /**
     * Report error to data warehouse.
     * @param code {Number} Error code from {@link CIE.ErrorCodes}.
     */
    this.reportError = function(code)
    {
        CIE.DataWarehouse.logLoadingError(code, _url, _isTimeout, _status, JSON.stringify(_params), _response);
    };

    var _runWAFProcess = function () {
        var waf = new CIE.WAF(_response);
        if (waf.hasError() && (typeof waf.showPopup !== 'undefined')) {
            waf.showPopup();
        }
    };

    function _getXML () {
        if (typeof XMLHttpRequest !== 'undefined') {
            var xhr = new XMLHttpRequest();
            if ("withCredentials" in xhr) {
                return xhr;
            }
        }

        if(typeof XDomainRequest != "undefined") {
            var xdr = new XDomainRequest();
            xdr.onload = function(){
                if(_callback != undefined){
                    _response = xdr.responseText;
                    _callback( _self );
                }
            };
            xdr.onerror = function(){
                if(_callback != undefined){
                    _isError = true;
                    _response = xdr.responseText;
                    _self.reportError(CIE.ErrorCodes.IO_ERROR);
                    _callback( _self );
                    _runWAFProcess();
                }
            };
            xdr.onprogress = function () { };
            xdr.ontimeout = function () {
                if(_callback != undefined){
                    _isError = true;
                    _isTimeout = true;
                    _response = xdr.responseText;
                    _self.reportError(CIE.ErrorCodes.IO_ERROR);
                    _callback( _self );
                    _runWAFProcess();
                }
            };
            return xdr;
        }
        
        var versions = [
            "MSXML2.XmlHttp.6.0",
            "MSXML2.XmlHttp.3.0",   
            "Microsoft.XmlHttp"
        ];

        var xhr;
        for(var i = 0; i < versions.length; i++) {  
            try {  
                xhr = new ActiveXObject(versions[i]);  
                break;  
            } catch (e) {
            }  
        }
        return xhr;
    }

    /**
     * Start HTTP request.
     */
    this.load = function() {
        try {
            var _xml = _getXML();
            _xml.open(_type, _url, true);
            if (_callback != undefined) {
                _xml.onreadystatechange = function () {
                    if (_xml.readyState == 4) {
                        _status = _xml.status;
                        _response = _xml.responseText;
                        if (_status == 200) {                            
                            _callback( _self );
                        }
                        else {
                            _isError = true;
                            _self.reportError(CIE.ErrorCodes.IO_ERROR);
                            _callback( _self );
                            _runWAFProcess();
                        }
                    }
                };

                _xml.ontimeout = function () {
                    _isError = true;
                    _isTimeout = true;
                    _response = _xml.responseText;
                    _self.reportError(CIE.ErrorCodes.IO_ERROR);
                    _callback( _self );
                    _runWAFProcess();
                };
            }
            if (_isApplicationJsonHeader) {
              _xml.setRequestHeader('Content-type', 'application/json');
            } else {
              _xml.setRequestHeader('Content-type', 'application/x-www-form-urlencoded');
            }

            if (typeof _params === 'string') {
                // this is a string
            }
            else if (_params == undefined) {
                _params = "{}";
            }
            else {
                try {
                    _params = JSON.stringify(_params);
                }
                catch (error) {
                    _params = "{}";
                    CIE.oneLog(error);
                }
            }

            _xml.send(_params);
        }
        catch(error){CIE.oneLog(error);}
    };

    /**
     * @returns {string} Retrieve response if any or empty string.
     */
    this.getResponse = function(){
        return _response;
    };

    /**
     * @returns {boolean} true in case request failed with timeout and false otherwise.
     */
    this.getIsTimeout = function(){
        return _isTimeout;
    };

    /**
     * @returns {boolean} true in case request failed with error and false otherwise.
     */
    this.getIsError = function(){
        return _isError;
    };

    /**
     * @returns {number} HTTP status of response.
     */
    this.getStatus = function(){
        return _status;
    };

    /**
     * @returns {string} Request URL.
     */
    this.getUrl = function(){
        return _url;
    };

    /**
     * @returns {string} Stringified params.
     */
    this.getParams = function(){
        return _params;
    };
};
/**
 * @namespace
 */
CIE.DataWarehouse = {};

(function() {

    /**
     * URL for logging.
     * @type {string}
     * @private
     */
    var _url = null;
    /**
     * App key for log message.
     * @type {string}
     * @private
     */
    var _appKey = null;
    /**
     * App user id for log message.
     * @type {string}
     * @private
     */
    var _appUserId = null;
    /**
     * App session id for log message.
     * @type {string}
     * @private
     */
    var _sessionId = null;

    /**
     * Set DWH url for logging.
     * @param url {string}
     */
    CIE.DataWarehouse.setUrl = function (url) { _url = url; };

    /**
     * @returns {string} DWH url.
     */
    CIE.DataWarehouse.getUrl = function() { return _url; }

    /**
     * Set app key for sign log messages.
     * @param appKey {string}
     */
    CIE.DataWarehouse.setAppKey = function (appKey) { _appKey = appKey; };

    /**
     * @returns {string} App key for message signing.
     */
    CIE.DataWarehouse.getAppKey = function () { return _appKey; };

    /**
     * @param appUserId {string} App user ID for message signing.
     */
    CIE.DataWarehouse.setAppUserId = function (appUserId) { _appUserId = appUserId; };

    /**
     * @returns {string} App user ID for message signing.
     */
    CIE.DataWarehouse.getAppUserId = function () { return _appUserId; };

    /**
     * @param appSessionId {string} App session ID for message signing.
     */
    CIE.DataWarehouse.setAppSessionId = function (appSessionId) { _sessionId = appSessionId; };

    /**
     * @returns {string} App session ID for message signing.
     */
    CIE.DataWarehouse.getAppSessionId = function () { return _sessionId; };

}());

/**
 * Log to data warehouse using pre initialized appKey, userId, sessionID.
 * @param name {string} Name of event.
 * @param extraParams {Object} Extra params for event.
 * @optional
 * For appKey use {@link CIE.DataWarehouse.getAppKey}, for appUserId use {@link CIE.DataWarehouse.getAppUserId},
 * for appSessionId use {@link CIE.DataWarehouse.getAppSessionId}
 */
CIE.DataWarehouse.logDWH = function (name, extraParams)
{
    CIE.DataWarehouse.log(name, CIE.DataWarehouse.getAppKey(), CIE.DataWarehouse.getAppUserId(), CIE.DataWarehouse.getAppSessionId(), extraParams);
};

/**
 * Log event to DWH.
 * @param name {string} Event to log.
 * @param appKey {string} Application key to sign log message.
 * If absent {@link CIE.DataWarehouse.getAppKey} will be used.
 * @optional
 * @param appUserId {string} User ID to sign log message.
 * If absent {@link CIE.DataWarehouse.getAppUserId} will be used.
 * @optional
 * @param sessionId {string} Session ID to sign log message.
 * If absent {@link CIE.DataWarehouse.getAppSessionId} will be used.
 * @optional
 * @param extraParams {Object} Additional params to add to log message.
 * @optional
 */
CIE.DataWarehouse.log = function(name, appKey, appUserId, sessionId, extraParams)
{
    appKey = appKey || CIE.DataWarehouse.getAppKey();
    appUserId = appUserId || CIE.DataWarehouse.getAppUserId();
    sessionId = sessionId || CIE.DataWarehouse.getAppSessionId();
    var url = CIE.DataWarehouse.getUrl();

    if (!url || !appKey || !appUserId || !sessionId)
    {
        CIE.oneLog("DW not setup!", name, appKey, appUserId, sessionId, extraParams);
        return;
    }

    var d = {};
    d.uuid = CIE.UUID();
    d.sessionId = sessionId;

    d.event = {};
    d.event.type = "user";
    d.event.category = "reward";
    d.event.subtype = "action";

    d.appUserId = appUserId;
    d.name = "oneRewardUserAction";
    d.actionname = name;

    if(extraParams != null)
    {
        for(var s in extraParams)
        {
            if (extraParams.hasOwnProperty(s))
            {
                d[s] = extraParams[s];
            }
        }
    }

    new CIE.AsyncHTTPJSONRequest(url + "?appKey=" + appKey, null, d).load();
    CIE.oneLog("DW Logging:", name, appKey, appUserId, sessionId, extraParams);
};

/**
 * Log loading error.
 * Nothing is happened in case of try to log DWH logging error to avoid cycles.
 * @param code {Number} Code of One Error ({@link CIE.ErrorCodes})
 * @param url {string} Url of request.
 * @param isTimeout {boolean} true if response failed by timeout.
 * @param status {number} Http status code.
 * @param request {string} Request.
 * @param response {string} Response.
 */
CIE.DataWarehouse.logLoadingError = function(code, url, isTimeout, status, request, response)
{
    if (url.indexOf(CIE.DataWarehouse.getUrl()) != -1)
    {
        return;
    }

    CIE.DataWarehouse.logDWH("loadError", {
        error:
        {
            code: code,
            url: url,
            isTimeout: isTimeout,
            httpstatus: status,
            request: request,
            response: response
        }
    });
};
/**
 * Contain ONE error codes.
 * @namespace
 */
CIE.ErrorCodes = {};
/**
 * IO error code.
 * @type {number}
 * @constant
 */
CIE.ErrorCodes.IO_ERROR = 1;
/**
 * JSON Malformed error code.
 * @type {number}
 * @constant
 */
CIE.ErrorCodes.JSON_MALFORMED = 2;
/**
 * App credential not set error code.
 * @type {number}
 * @constant
 */
CIE.ErrorCodes.APP_CREDENTIALS_NOT_SET = 3;
/**
 * One reward data is missing. Typically triggered in case
 * call {@link CIE.OneReward.retrieveTotalRewardsData} before loading of One Reward data.
 * @type {number}
 * @constant
 */
CIE.ErrorCodes.ONE_REWARD_DATA_MISSING = 4;
/**
 * Total reward is disabled.
 * @type {number}
 * @constant
 */
CIE.ErrorCodes.TR_DISABLED = 5;
/**
 * In case of calling {@link CIE.OneReward.retrieveTotalRewardsData} when user not belong to Total Reward system.
 * @type {number}
 * @constant
 */
CIE.ErrorCodes.TR_ACCOUNT_ID_NOT_FOUND = 6;
/**
 * Error during Total Rewards errors.
 * @type {number}
 * @constant
 */
CIE.ErrorCodes.TR_DATA_ERROR = 7;
/**
 * One Reward server in maintenance.
 * @type {number}
 * @constant
 */
CIE.ErrorCodes.SERVER_MAINTENANCE = 8;

/**
 * Retrieve description by passed error code.
 * @param errorCode {Number} Error code.
 * @returns {string} Description for passed error code.
 */
CIE.ErrorCodes.getDescription = function(errorCode)
{
    switch(errorCode){
        case 1: return "IO Error, there was a problem with the server, retry later.";
        case 2: return "Wrong JSON, JSON parser could not parse the response because it was malformed, retry later.";
        case 3: return "App credentials not set";
        case 4: return "One Reward Data is missing, before to call retrieveTotalRewardsData() wait for oneRewardData to be retrieved.";
        case 5: return "Caesars Rewards is disabled, call is not going to go through.";
        case 6: return "Caesars Rewards Account ID not found, make sure to register or login to Caesars Rewards before to make this call.";
        case 7: return "Caesars Rewards Data error, dispatched if the resultCode from Caesars Rewards is different than 0";
        case 8: return "Server returned 503 status and it is in maintenance mode.";
    }

    return "Error description missing...";
};
CIE.OneRewardPopup = function(){};

CIE.OneRewardPopup.isInitialized = false;
CIE.OneRewardPopup.isClosed = true;
CIE.OneRewardPopup.isGDPR = false;
CIE.OneRewardPopup.iframeW = 720;
CIE.OneRewardPopup.iframeH = 480;
CIE.OneRewardPopup.iframeAspectRatio = 1.5;
CIE.OneRewardPopup.iframeContentLoaded = false;
CIE.OneRewardPopup.additionalMarginHeight = 0;
CIE.OneRewardPopup.gameDivId = "gameDiv";
CIE.OneRewardPopup.onDataFromPopupCallback = undefined; //only for HTML5 games
CIE.OneRewardPopup.version = "1.5";
CIE.OneRewardPopup.manualLeft = null;
CIE.OneRewardPopup.manualTop = null;

CIE.OneRewardPopup.open = function(cdnWebsiteUrl, oneRewardUrl, appKey, userId, sessionId, currency, platform, deeplink, lang){
    if(CIE.OneRewardPopup.isClosed == false) return;

    CIE.OneRewardPopup.isClosed = false;
    CIE.OneRewardPopup.isGDPR = deeplink == "GDPR";
    if(CIE.OneRewardPopup.isInitialized == false){
        CIE.OneRewardPopup.isInitialized = true;
        var eventMethod = window.addEventListener ? "addEventListener" : "attachEvent";
        var eventer = window[eventMethod];
        var messageEvent = eventMethod == "attachEvent" ? "onmessage" : "message";

        // Listen to message from child IFrame window
        eventer(messageEvent, function (e) {
            if (typeof e.data === "object") return;

            CIE.oneLog("OneReward Popup: "+e.data);
            if(e.data == "close"){
                CIE.OneRewardPopup.close();
            }
            if(e.data == "closeByGdprAccept") {
                CIE.OneRewardPopup.close(true);
            }
            else if(e.data == "complete"){
                CIE.OneRewardPopup.iframeContentLoaded = true;
            }
            else if(e.data.substr(0, 10) == "popupdata?"){
                onDataFromPopup( e.data.substring(10) );
            }
        }, false);

        function onDataFromPopup( str ){
            if(CIE.OneReward != undefined && CIE.OneRewardPopup.onDataFromPopupCallback != undefined){
                CIE.OneRewardPopup.onDataFromPopupCallback(str);
            }
            else {
                CIE.oneLog("CIE.OneRewardPopup.gameDivId "+CIE.OneRewardPopup.gameDivId);
                if(document.getElementById(CIE.OneRewardPopup.gameDivId)) {
                    if (document.getElementById(CIE.OneRewardPopup.gameDivId)["onDataFromPopup"] != null) {
                        document.getElementById(CIE.OneRewardPopup.gameDivId)["onDataFromPopup"](str);
                    }
                    else {
                        CIE.oneLog("onDataFromPopup callback not defined!");
                    }
                }
                else{
                    CIE.oneLog(CIE.OneRewardPopup.gameDivId+" UNDEFINED!");
                }
            }
        }

        function getMarginLeft(){
            if(CIE.OneRewardPopup.manualLeft == null){
                return (-CIE.OneRewardPopup.iframeW/2) + "px";
            }
            else return 0;
        }

        function getLeft(){
            if(CIE.OneRewardPopup.manualLeft == null){
                return "50%";
            }
            else return CIE.OneRewardPopup.manualLeft + "px";
        }

        function getMarginTop(){
            if(CIE.OneRewardPopup.manualTop == null){
                return CIE.OneRewardPopup.additionalMarginHeight-(CIE.OneRewardPopup.iframeH/2) + "px";
            }
            else return 0;
        }

        function getTop(){
            if(CIE.OneRewardPopup.manualTop == null){
                return "50%";
            }
            else return CIE.OneRewardPopup.manualTop + "px";
        }

        function getLeftSpinner(){
            if(CIE.OneRewardPopup.manualLeft == null){
                return "50%";
            }
            else return CIE.OneRewardPopup.manualLeft + (CIE.OneRewardPopup.iframeW/2) + "px";
        }

        function getTopSpinner(){
            if(CIE.OneRewardPopup.manualTop == null){
                return "50%";
            }
            else return CIE.OneRewardPopup.manualTop + (CIE.OneRewardPopup.iframeH/2) + "px";
        }

        var css = '#overlay { display: block; top: 0; text-align:center; z-index: 1999; background-color: #000; height: 100%; left: 0; opacity: 0.7;position: fixed;top: 0;width: 100%;}'+
                  '#overlay a{ text-decoration: none;color: #FFF;position: absolute;right:0;margin:50px;}'+
                  '#OneRewardDiv{display:hidden; z-index:2000; background-color:none; position:absolute; margin-left:'+getMarginLeft()+'; left:'+getLeft()+'; margin-top:'+getMarginTop()+'; top:'+getTop()+';}'+

                  '@keyframes spin { to { transform: rotate(1turn); }}'+
                  '@-webkit-keyframes spin {to { -webkit-transform: rotate(1turn); }}'+
                  '.oneprogress {left:'+getLeftSpinner()+'; top:'+getTopSpinner()+'; margin-top:'+(CIE.OneRewardPopup.additionalMarginHeight-50)+'px; margin-left:-50px; display:inline-block; width:5em; height: 5em; overflow:hidden; animation:spin 1s infinite steps(8); -webkit-animation:spin 1s infinite steps(8); position:absolute; }'+
                  '.large.oneprogress {font-size: 24px;}'+
                  '.oneprogress:before,.oneprogress:after,.oneprogress > div:before,.oneprogress > div:after {content: \'\';position: absolute;top: 0;left: 2.25em;width: .5em;height: 1.5em;border-radius: .2em;background: #eee;box-shadow: 0 3.5em #eee;transform-origin: 50% 2.5em;  -webkit-transform-origin: 50% 2.5em;}'+
                  '.oneprogress:before {background: #555;}'+
                  '.oneprogress:after {transform: rotate(-45deg); -webkit-transform: rotate(-45deg); background: #777;}'+
                  '.oneprogress > div:before { transform: rotate(-90deg);-webkit-transform: rotate(-90deg);background: #999;}'+
                  '.oneprogress > div:after {transform: rotate(-135deg);-webkit-transform: rotate(-135deg); background: #bbb;}';


        var head = document.head || document.getElementsByTagName('head')[0];
        var style = document.createElement('style');
        style.type = 'text/css';

        if (style.styleSheet){
          style.styleSheet.cssText = css;
        } else {
          style.appendChild(document.createTextNode(css));
        }

        head.appendChild(style);
    }

    var overlayDiv = document.createElement('div');
    overlayDiv.id = 'overlay';
    overlayDiv.innerHTML = '<div id="spinner" class="large oneprogress"></div>';
    if (!CIE.OneRewardPopup.isGDPR) {
        overlayDiv.innerHTML =
            '<a id="closeOverlay" href="javascript:CIE.OneRewardPopup.close();" ><span>X</span></a>'
            + overlayDiv.innerHTML;
    }
    document.getElementsByTagName('body')[0].appendChild(overlayDiv);

    var iframe = document.createElement('iframe');
    iframe.id = 'onerewardiframe';
    iframe.name = 'onerewardiframe';

    iframe.width = 0;
    iframe.height = 0;
    iframe.style.border ='none';

    var iframeUrl = cdnWebsiteUrl+"/index.html?oneRewardUrl="+oneRewardUrl+"&appKey="+appKey+"&userId="+userId+"&sessionId="+sessionId+"&currency="+currency+"&platform="+platform+"&deeplink="+deeplink;

    if (lang) {
        iframeUrl += "&lang=" + lang;
    }

    iframe.src = iframeUrl;

    var iframeLoadedCheck = function(startTime){
        var intervalCont = null;
        if(window["onerewardiframe"] != undefined){

            intervalCont = setInterval(function(){
                var endTime = new Date().getTime();
                if(endTime - startTime > 30000 || document.getElementById("onerewardiframe") == null){
                    CIE.oneLog("OneReward iframe ready but content failed to load in 30 sec!");
                    CIE.DataWarehouse.logDWH("libraryTimeoutReached", {data: {startTime: startTime, endTime: endTime}});
                    clearInterval(intervalCont);
                    window.postMessage('popupdata?'+'OneRewardPopupEvent.timeout', '*');
                    CIE.OneRewardPopup.close();
                }
                else if(CIE.OneRewardPopup.iframeContentLoaded){
                    if(document.getElementById('onerewardiframe') == null){
                        clearInterval(intervalCont);
                        return;
                    }

                    CIE.oneLog("OneReward iframe content loaded!");
                    CIE.DataWarehouse.logDWH("libraryIFrameContentLoaded", {data: {
                        width: CIE.OneRewardPopup.iframeW, 
                        height: CIE.OneRewardPopup.iframeH,
                        iFrameUrlToLoad: encodeURIComponent(iframeUrl)}});

                    document.getElementById('onerewardiframe').width = CIE.OneRewardPopup.iframeW;
                    document.getElementById('onerewardiframe').height = CIE.OneRewardPopup.setWidth(CIE.OneRewardPopup.iframeW);
                    clearInterval(intervalCont);

                    //Hide X and Spinner
                    var elX = document.getElementById("closeOverlay");
                    if (elX) {
                        elX.parentNode.removeChild(elX);
                    }
                    var spinner = document.getElementById("spinner");
                    if (spinner) {
                        spinner.parentNode.removeChild(spinner);
                    }
                    CIE.OneRewardPopup.iframeContentLoaded = false;
                }
            }, 50);
        }
        else{
            if(interval != null) {
                clearInterval(intervalCont);
            }
        }
    };

    var iframeReady = false;
    var startTime = new Date().getTime();
    var interval = setInterval(function(){
        if(window["onerewardiframe"] != undefined){
            var endTime = new Date().getTime();
            if(endTime - startTime > 30000){
                CIE.oneLog("Failed to load OneReward iframe, 30 sec passed!");
                CIE.DataWarehouse.logDWH("libraryTimeoutReached", {data: {startTime: startTime, endTime: endTime}});
                clearInterval(interval);
                window.postMessage('popupdata?'+'OneRewardPopupEvent.timeout', '*');
                CIE.OneRewardPopup.close();
            }else if(iframeReady){
                CIE.oneLog("OneReward iframe is ready... Waiting on content!");
                CIE.DataWarehouse.logDWH("libraryIframeReady", {data: {startTime: startTime, endTime: endTime}});
                clearInterval(interval);
                iframeLoadedCheck(startTime);
                iframe.focus();
            }
        }
        else{
            clearInterval(interval);
        }
    }, 50);

    if (iframe.addEventListener) {
        iframe.addEventListener("load", function() {iframeReady = true;});
    }
    else {
        iframe.attachEvent("onload", function() {iframeReady = true;});
    }

    if (CIE.Utility.isMobileDevice()) {
        CIE.Utility.rotateIFrameWrapper();
        window.addEventListener("orientationchange", CIE.Utility.rotateIFrameWrapper);
    }
    document.getElementById('OneRewardDiv').appendChild(iframe);
    document.getElementById("OneRewardDiv").style.display = "block";
};

CIE.OneRewardPopup.close = function(isGdprAccepted){
    
    CIE.DataWarehouse.logDWH("libraryPopupClosed", {data: {
        isClosed: CIE.OneRewardPopup.isClosed,
        isGDPR: CIE.OneRewardPopup.isGDPR, 
        isGDPRAccepted: isGdprAccepted}});

    if(CIE.OneRewardPopup.isClosed == false
        && (!CIE.OneRewardPopup.isGDPR || (CIE.OneRewardPopup.isGDPR && isGdprAccepted))){
        window.postMessage('popupdata?'+'OneRewardPopupEvent.close', '*');

        var el = document.getElementById("overlay");
        var elem = document.getElementById("onerewardiframe");

        if(el != null){
            el.parentNode.removeChild(el);
        }

        if(elem != null){
           elem.parentNode.removeChild(elem);
        }

        document.getElementById("OneRewardDiv").style.display = "none";
        CIE.OneRewardPopup.isClosed = true;
    }
};

CIE.OneRewardPopup.setWidth = function(width){
    CIE.OneRewardPopup.iframeW = width;
    CIE.OneRewardPopup.iframeH = CIE.OneRewardPopup.iframeW/CIE.OneRewardPopup.iframeAspectRatio;
    return CIE.OneRewardPopup.iframeH;
};

CIE.OneRewardPopup.setAdditionalMarginHeight = function(additionalMarginHeight){
    CIE.OneRewardPopup.additionalMarginHeight = additionalMarginHeight;
};

CIE.OneRewardPopup.setManualLeft = function(value){
    CIE.OneRewardPopup.manualLeft = value;
};

CIE.OneRewardPopup.setManualTop = function(value){
    CIE.OneRewardPopup.manualTop = value;
};

CIE.OneRewardPopup.setGameDivId = function(gameDivId){
    CIE.OneRewardPopup.gameDivId = gameDivId;
};

CIE.OneRewardPopup.centerPopupOnDiv = function(){
    var game 		= document.getElementById( CIE.OneRewardPopup.gameDivId );
    var gameHeight	= game.clientHeight;

    // calculate game offset from the top
    for (var gameTop = 0, el = game; el != null; gameTop += el.offsetTop, el = el.offsetParent){}

    var docHeight 	= window.innerHeight;
    var gameBottom  = docHeight - gameHeight - gameTop;

    CIE.OneRewardPopup.additionalMarginHeight = ( gameTop - gameBottom ) / 2;
};

/**
 * @class
 * @extends {CIE.EventDispatcher}
 */
CIE.OneReward = function(){
	CIE.EventDispatcher.call(this); //extension

    var _self = this;

    /**
     *
     * @type {number}
     * @private
     */
	var _serverClientTimeDiff = 0;

    /**
     * @type {number}
     * @private
     */
	var _currentRetry = 0;

    /**
     * @type {boolean}
     * @private
     */
	var _checkingForStatusChange = false;

    /**
     * @type {CIE.OneRewardResponseModel}
     * @private
     */
	var _oneRewardResponseData = null;

    /**
     * @type {CIE.TotalRewardsResponseModel}
     * @private
     */
	var _totalRewardsResponseData = null;

    /**
     * @type {String}
     * @private
     */
	var _appKey;

    /**
     * @type {String}
     * @private
     */
	var _userId;

    /**
     * @type {String}
     * @private
     */
	var _sessionId;

    /**
     * ISO 4217
     * @type {String}
     * @private
     */
	var _currency;

    /**
     * @type {String}
     * @private
     */
    var _platform;

    /**
     * @type {String}
     * @private
     */
    var _lang;

    /**
     * @type {String}
     * @private
     */
	var _oneRewardUrl;

    /**
     * @type {CIE.ExchangeRate}
     * @private
     */
    var _exchangeRate = new CIE.ExchangeRate( this );

    /**
     * @type {boolean}
     * @private
     */
	var _isReady = false;

    /**
     * @type {boolean}
     * @private
     */
    var _isPopup = false;

    /**
     * @type {String}
     * @private
     */
    var _version = "1.26.8";
    CIE.oneLog("OneReward version: "+_version);

    /**
     * @type {boolean}
     */
    this.autoRetrieveTotalRewardsOnInit = false;

    /**
     * @param deeplink
     */
	this.openPopup = function(deeplink){
		if(_oneRewardResponseData!=null && _oneRewardResponseData.getConfig() != null){
			CIE.OneRewardPopup.open(_oneRewardResponseData.getConfig().getCdnWebsiteUrl(), _oneRewardUrl, _appKey, _userId, _sessionId, _currency, _platform, deeplink, _lang);
		}
        else{
            CIE.oneLog("Data not initialized for opening popup!");
        }
	};

    this.closePopup = function(isGdprAccepted){
        CIE.OneRewardPopup.close(isGdprAccepted);
    };

    /**
     * @returns {Object}
     */
	var generateBaseRequestParams = function(){
		var obj = {};
		obj.userId = _userId;
		obj.sessionId = _sessionId;
		obj.currency = _currency;
        obj.platform = _platform;
		return obj;
	};

    /**
     * @param name
     * @param extraParams
     */
    this.logDW = function(name, extraParams) {
        CIE.DataWarehouse.logDWH(name, extraParams);
    };

	this.checkForStatusChange = function(){
		if(_isReady && _checkingForStatusChange == false){
			_currentRetry = 0;
			_checkingForStatusChange = true;
			this.retrieveOneRewardData();
		}
	};

	function onDataFromPopup(data) {
        if (data == CIE.OneRewardPopupEvent.UPDATE_WIDGET_DATA) {
            this.retrieveOneRewardData();
        }
        else{
	        this.dispatchEventToListeners( new CIE.OneRewardPopupEvent(CIE.OneRewardPopupEvent.DATA_RECEIVED, data) );
        }
	}

    CIE.OneRewardPopup.onDataFromPopupCallback = function( data ) { onDataFromPopup.call( _self, data ); };

    /**
     * @param oneRewardUrl
     * @param appKey
     * @param userId
     * @param sessionId
     * @param currency
     * @param platform
     * @param lang
     */
    this.init = function(oneRewardUrl, appKey, userId, sessionId, currency, platform, lang) {
        CIE.oneLog("OneReward INIT - oneRewardUrl:"+oneRewardUrl+", appKey:"+appKey+", userId:"+userId+", sessionId:"+sessionId+", currency:"+currency+", platform:"+platform+", lang:"+lang);
        _oneRewardResponseData = null;
        _totalRewardsResponseData = null;
		_oneRewardUrl = oneRewardUrl;
		_appKey = appKey;
		_userId = userId;
		_sessionId = sessionId;
		_currency = currency;
        _platform = platform;
        _lang = lang;

        CIE.DataWarehouse.setAppKey(appKey);
        CIE.DataWarehouse.setAppUserId(userId);
        CIE.DataWarehouse.setAppSessionId(sessionId);

        var _dwUrl = oneRewardUrl.trim();
        if(_dwUrl.charAt(_dwUrl.length-1) != "/")
            _dwUrl += "/";
        _dwUrl += "instrument";
        CIE.DataWarehouse.setUrl(_dwUrl);

        if(_isPopup != true) {
            this.logDW("libraryInit", {library: {version: _version, language:"js"}});
        }

		this.retrieveOneRewardData();
	};

	this.retrieveOneRewardData = function (){
		if (_userId != undefined && _sessionId != undefined) {
            _self.callOneRewardEndpoint("widgetData", function( request ) { _self.onOneRewardData( request ); });
		}
		else {
			CIE.oneLog("APP credentials not set!");
			_self.dispatchEventToListeners( new CIE.OneRewardEvent(CIE.OneRewardEvent.ERROR, null).addError( CIE.ErrorCodes.APP_CREDENTIALS_NOT_SET ) );
		}
	};

    /**
     * @callback CIE.OneRewardEndpointCaller
     * @param endpoint {string} Endpoint to call.
     * @param callback {CIE.OneRewardEndPointCallerResult} Result callback.
     * @param extraParams {Object} Params which will be added to request body.
     */

    /**
     * @param endpoint {string} Endpoint to call.
     * @param callback {CIE.OneRewardEndPointCallerResult} Result callback.
     * @param extraParams {Object} Params which will be added to request body.
     * @optional
     */
    this.callOneRewardEndpoint = function(endpoint, callback, extraParams){
        var params = generateBaseRequestParams();
        if(extraParams){
            for (var key in extraParams){
                params[key] = extraParams[key];
            }
        }
        new CIE.AsyncHTTPJSONRequest(_oneRewardUrl + "/"+endpoint+"?appKey="+_appKey+"&rnd="+Math.random(), callback, params).load();
    };

    this.retrieveTotalRewardsData = function() {
        if (_oneRewardResponseData == null || _oneRewardResponseData.getStatus() == undefined || _oneRewardResponseData.getConfig() == undefined) {
            CIE.oneLog("ONE REWARD DATA NOT FOUND!");
            this.dispatchEventToListeners( new CIE.TotalRewardsEvent(CIE.TotalRewardsEvent.ERROR, null).addError( CIE.ErrorCodes.ONE_REWARD_DATA_MISSING ) );
            return;
        }
        else if (_oneRewardResponseData.getStatus().getTrEnabled() == false) {
            CIE.oneLog("CAESARS REWARDS DISABLES!");
            this.dispatchEventToListeners( new CIE.TotalRewardsEvent(CIE.TotalRewardsEvent.ERROR, null).addError( CIE.ErrorCodes.TR_DISABLED ) );
            return;
        }
        else if (_oneRewardResponseData.getStatus().getTrAccountId() == "") {
            CIE.oneLog("CAESARS REWARDS ACCOUNT MISSING!");
            this.dispatchEventToListeners( new CIE.TotalRewardsEvent(CIE.TotalRewardsEvent.ERROR, null).addError( CIE.ErrorCodes.TR_ACCOUNT_ID_NOT_FOUND ) );
            return;
        }

        var params = {};
        params["userId"] = CIE.DataWarehouse.getAppUserId();
        params["sessionId"] = CIE.DataWarehouse.getAppSessionId();

        new CIE.AsyncHTTPJSONRequest(
            _oneRewardUrl + "/getTRUserInfo?appKey=" + _appKey,
            function (response) {
                _self.onTotalRewardsData(response);
            },
            params,
            "POST",
            true
        ).load();
    };

    /**
     * @param request
     */
    this.onOneRewardData = function(request)
    {
        var e = request.getResponse();
        var responseStatus = request.getStatus();

        if (request.getIsError()) {
            if(responseStatus == 503){
                CIE.oneLog("_onOneRewardData SERVER_MAINTENANCE");
                this.dispatchEventToListeners( new CIE.OneRewardEvent(CIE.OneRewardEvent.ERROR, null).addError( CIE.ErrorCodes.SERVER_MAINTENANCE ) );
            }
            else{
                CIE.oneLog("_onOneRewardData IO_ERROR");
               this.dispatchEventToListeners( new CIE.OneRewardEvent(CIE.OneRewardEvent.ERROR, null).addError( CIE.ErrorCodes.IO_ERROR ) );
            }
        }
        else{
            try {
                CIE.oneLog("_onOneRewardData DATA");
                var obj = JSON.parse( e );

                if (obj["config"] != null) {
                    _isReady = true;

                    _oneRewardResponseData = new CIE.OneRewardResponseModel( obj );
                    _oneRewardResponseData.rawData = e;

                    if(_isPopup != true) {
                        this.logDW("libraryDataLoaded");
                    }

                    _serverClientTimeDiff = (new Date().getTime()/1000) - _oneRewardResponseData.getTimestamp();

                    this.dispatchEventToListeners( new CIE.OneRewardEvent(CIE.OneRewardEvent.RECEIVED, _oneRewardResponseData) );

                    if (this.autoRetrieveTotalRewardsOnInit && _totalRewardsResponseData == null) {
                        if(_oneRewardResponseData && _oneRewardResponseData.getStatus() && _oneRewardResponseData.getStatus().getTrEnabled() && _oneRewardResponseData.getStatus().getTrAccountId() != ""){
                            this.retrieveTotalRewardsData();
                        }
                    }

                    if (_oneRewardResponseData.statusChangeEvent != null) {
                        _checkingForStatusChange = false;
                        this.dispatchEventToListeners( new CIE.OneRewardEvent(CIE.OneRewardEvent.STATUS_CHANGE, _oneRewardResponseData) );
                    }
                    else if (_checkingForStatusChange == true) {
                        if( _currentRetry < _oneRewardResponseData.getConfig().getStatusChangeRetryCount()) {
                            _currentRetry++;
                            setTimeout(_self.retrieveOneRewardData, (_currentRetry * _currentRetry) * _oneRewardResponseData.getConfig().getRetryBackoff() * 1000);
                        }
                        else {
                            _checkingForStatusChange = false;
                        }
                    }
                }
                else{
                    CIE.oneLog("_onOneRewardData IO_ERROR");
                    this.dispatchEventToListeners( new CIE.OneRewardEvent(CIE.OneRewardEvent.ERROR, null).addError( CIE.ErrorCodes.IO_ERROR ) );
                    request.reportError(CIE.ErrorCodes.IO_ERROR);
                }
            }
            catch (error) {
                var msg = "Unable to decode JSON: " + error;
                CIE.oneLog(msg);
                this.dispatchEventToListeners( new CIE.OneRewardEvent(CIE.OneRewardEvent.ERROR, null).addError( CIE.ErrorCodes.JSON_MALFORMED ) );
                request.reportError(CIE.ErrorCodes.JSON_MALFORMED);
            }
        }
    };

    /**
     * @param request
     */
    this.onTotalRewardsData = function(request)
    {
        var e = request.getResponse();
        var responseStatus = request.getStatus();

        if (request.getIsError()) {
            CIE.oneLog("_onTotalRewardsData IO_ERROR");
            this.dispatchEventToListeners( new CIE.TotalRewardsEvent(CIE.TotalRewardsEvent.ERROR, null).addError( CIE.ErrorCodes.IO_ERROR) );
        }
        else{
            try {
                CIE.oneLog("_onTotalRewardsData DATA");
                var obj = JSON.parse(e);
                _totalRewardsResponseData = new CIE.TotalRewardsResponseModel( obj );
                _totalRewardsResponseData.rawData = e;

                if(_totalRewardsResponseData.getResultCode() == 0){
                    this.dispatchEventToListeners( new CIE.TotalRewardsEvent(CIE.TotalRewardsEvent.RECEIVED, _totalRewardsResponseData) );
                }
                else{
                    this.dispatchEventToListeners( new CIE.TotalRewardsEvent(CIE.TotalRewardsEvent.ERROR, null).addError( CIE.ErrorCodes.TR_DATA_ERROR ) );
                    request.reportError(CIE.ErrorCodes.TR_DATA_ERROR);
                }
            }
            catch (error) {
                CIE.oneLog("Unable to decode JSON: " + error);
                this.dispatchEventToListeners( new CIE.TotalRewardsEvent(CIE.TotalRewardsEvent.ERROR, null).addError( CIE.ErrorCodes.JSON_MALFORMED) );
                request.reportError(CIE.ErrorCodes.JSON_MALFORMED);
            }
        }
    };

    /**
     * @param id
     * @returns {String}
     */
    this.getStatusNameById = function(id){
        if(_oneRewardResponseData != null){
            var statuses = _oneRewardResponseData.getConfig().getStatuses();
            for(var i=0; i<statuses.length; i++){
                if(statuses[i].getStatusId() == id){
                    return statuses[i].getStatusLabel();
                }
            }
        }
        return "";
    };

    /**
     * @param id
     * @returns {int}
     */
    this.getStatusMinPointsById = function(id){
        if(_oneRewardResponseData != null){
            var statuses = _oneRewardResponseData.getConfig().getStatuses();
            for(var i=0; i<statuses.length; i++){
                if(statuses[i].getStatusId() == id){
                    return statuses[i].getMinPoints();
                }
            }
        }
        return 200000000; //Royal Diamond virtual cap
    };

    /**
     * @param id
     */
    this.removeClientStep = function(id){
        var arr = _oneRewardResponseData.getClientStepsCompleted();
        if(arr){
            var index;
            for(var i = 0; i<arr.length; i++ ){
                if(arr[i] == id){
                    index = i;
                    break;
                }
            }
            if(index != undefined) _oneRewardResponseData.getClientStepsCompleted()[index] = null;
            CIE.oneLog("Removing step: "+id);
        }
    };

    /**
     * @param id
     */
    this.completeClientStep = function(id){
        this.callOneRewardEndpoint("updateClientSteps", null, {stepId:id});
        if(!this.clientStepsContains(id) && _oneRewardResponseData.getClientStepsCompleted() != null){
            _oneRewardResponseData.getClientStepsCompleted().push(id);
        }
        CIE.oneLog("Completing step: "+id);
    };

    /**
     * @param id
     * @returns {boolean}
     */
    this.clientStepsContains = function(id){
        var arr = _oneRewardResponseData.getClientStepsCompleted();
        if(arr){
            for(var i = 0; i<arr.length; i++ ){
                if(arr[i] == id){
                    return true;
                }
            }
        }
        return false;
    };

    /**
     * @returns {int}
     * */
    this.getStatusIdFromPoints = function(points){
        /**
         * @type {CIE.StatusBracketModel[]}
         */
        var arr = _oneRewardResponseData.getConfig().getStatuses();
        for (var i=arr.length-1; i>=0; i--){
            if(points >= arr[i].getMinPoints()){
                return arr[i].getStatusId();
            }
        }
    };

    /**
     * Returns a users statusId combined with total statusBoostFactor
     * @returns {number} statusId
     * */
    this.getStatusId = function()
    {
        return _oneRewardResponseData.getStatus().getStatusId()
            + _oneRewardResponseData.getPromotionsModel().getActiveStatusBoostFactor();
    };

    /**
     * Returns a users non-boosted statusId
     * @returns {int} statusId
     * */
    this.getOriginalStatusId = function()
    {
        return _oneRewardResponseData.getStatus().getStatusId();
    };

    /**
     * @returns {CIE.OneRewardResponseModel}
     * */
    this.getOneRewardResponseData = function() {return _oneRewardResponseData;};

    /**
     * @returns {CIE.TotalRewardsResponseModel}
     * */
    this.getTotalRewardsResponseData = function() {return _totalRewardsResponseData;};

    /**
     * @returns {String}
     * */
    this.getUserId = function() {return _userId;};

    /**
     * @returns {String}
     * */
    this.getSessionId = function() {return _sessionId;};

    /**
     * @returns {String}
     * */
    this.getCurrency = function() {return _currency;};

    /**
     * @returns {String}
     * */
    this.getPlatform = function() {return _platform;};

    /**
     * @returns {String}
     * */
    this.getOneRewardUrl = function() {return _oneRewardUrl;};

    /**
     * @returns {CIE.ExchangeRate}
     */
    this.getExchangeRate = function() {return _exchangeRate;};

    /**
     * @returns {String}
     * */
    this.getAppKey = function() {return _appKey;};

    /**
     * @returns {String}
     */
    this.getLang = function() { return _lang; };

    /**
     * Returns true if the OneReward library has completed loading remote data
     * @returns {boolean}
     */
    this.getIsReady = function() { return _isReady; };

    /**
     * @returns {Number}
     */
    this.getServerClientTimeDiff = function() {
        return _serverClientTimeDiff;
    };

    /**
     * @returns {number} Currect timestamp in seconds.
     */
    this.getCurrentTimestamp = function () { return Math.floor(new Date().getTime() / 1000)};

    /**
     * @returns {number}
     */
    this.getCurrentTimestampOnServer = function() {
        return this.getCurrentTimestamp() - _serverClientTimeDiff;
    };

    /**
     * @returns {number}
     */
    this.getExpiration = function() {
        return (_oneRewardResponseData.getExpiration() - _self.getCurrentTimestampOnServer());
    };

    /**
     * @returns {String}
     */
    this.getVersion = function() { return _version; };

    /**
     * @param value {Boolean}
     */
    this.setIsPopup = function(value){ _isPopup = value;};

    /**
     * @returns {number} Retrieve max status ID depend on using API version.
     */
    this.getMaxStatusId = function()
    {
        return _oneRewardResponseData.isObsoleteAPI()
            ? CIE.StatusIds.ROYAL_DIAMOND
            : CIE.StatusIds.BLACK_DIAMOND;
    };

    /**
     * URL of the one message endpoint.
     * @returns {string}
     */
    this.getOneMessageEndPoint = function()
    {
        if(_oneRewardResponseData && _oneRewardResponseData.getConfig())
            return _oneRewardResponseData.getConfig().getOneMessageUrl();
        return null;
    }
};

/**
 * Total Rewards response.
 * @param totalRewardResponseObj {Object} Parsed response json.
 * @constructor
 * @throws {CIE.Error} In case of violated contract for totalRewardResponseObj.
 */
CIE.TotalRewardsResponseModel = function(totalRewardResponseObj)
{
    var modelValidator = new CIE.ModelValidator();

    modelValidator.notNull(totalRewardResponseObj, "totalRewardResponseObj");

    /**
     * @deprecated
     * @type {number}
     * @private
     * @default = 0
     */
    var _resultCode = 0;

    var _trAccountId = null;
    var _firstName = null;
    var _lastName = null;
    var _tierCode = null;
    var _postedRewardCreditsBalance = null;
    var _unpostedRewardCreditsBalance = null;
    var _rewardCreditsBalance = null;
    var _isIDVerified = null;
    var _trNumber = null;

    if (_resultCode == 0)
    {
        var _body = totalRewardResponseObj;
        _trAccountId = modelValidator.existStringField(_body, "accountId");
        _firstName = modelValidator.existStringField(_body, "firstName");
        _lastName = modelValidator.existStringField(_body, "lastName");
        _tierCode = modelValidator.existStringField(_body, "tierCode");
        _trNumber = modelValidator.existStringField(_body, "trNumber");
        _postedRewardCreditsBalance = modelValidator.notNegativeNumberField(_body, "postedRCBalance");
        _unpostedRewardCreditsBalance = modelValidator.notNegativeNumberField(_body, "unpostedRCBalance");
        _rewardCreditsBalance = _postedRewardCreditsBalance + _unpostedRewardCreditsBalance;
        _isIDVerified = _body["isIdVerified"] == 1;
    }

    /**
     * @returns {number} Response result code.
     */
    this.getResultCode = function(){ return _resultCode; };

    /**
     * @returns {string} Response result message.
     */
    this.getResultMessage = function(){ return ""; };

    /**
     * In case of response error {@link #getResultCode()} != 0 return null.
     * @returns {string} TR user first name.
     */
    this.getFirstName = function(){ return _firstName; };

    /**
     * In case of response error {@link #getResultCode()} != 0 return null.
     * @returns {string} TR user last name.
     */
    this.getLastName = function(){ return _lastName; };

    /**
     * In case of response error {@link #getResultCode()} != 0 return null.
     * @returns {string} tier code.
     */
    this.getTierCode = function(){ return _tierCode; };

    /**
     * In case of response error {@link #getResultCode()} != 0 return null.
     * @returns {?number} Posted to Total Rewards RC balance.
     */
    this.getPostedRCBalance = function(){ return _postedRewardCreditsBalance; };

    /**
     * In case of response error {@link #getResultCode()} != 0 return null.
     * @returns {?number} Unposted to Total Rewards RC balance.
     */
    this.getUnpostedRCBalance = function(){ return _unpostedRewardCreditsBalance; };

    /**
     * In case of response error {@link #getResultCode()} != 0 return null.
     * @returns {?number} Sum of posted and not posted RC balance.
     */
    this.getRewardCreditsBalance = function(){ return _rewardCreditsBalance; };

    /**
     * In case of response error {@link #getResultCode()} != 0 return null.
     * @returns {?boolean} true in case TR id verified and false otherwise.
     */
    this.getIsIDVerified = function(){ return _isIDVerified; };

    /**
     * Get the Total Rewards internal ID.
     * @returns {string}
     */
    this.getTrAccountId = function() { return _trAccountId; };

    /**
     * Set the Total Rewards internal ID.
     * @param value {string}
     */
    this.setTrAccountId = function(value) { _trAccountId = value; };

    /**
     * Get the Total Rewards ID. Used for UI display.
     * @returns {string}
     */
    this.getTrNumber = function() { return _trNumber; };

    /**
     * Set the Total Rewards ID
     * @param value {string}
     */
    this.setTrNumber = function(value) { _trNumber = value; };
};

/**
 * Factory for creating PromotionModel
 * @constructor
 */
CIE.PromotionModelCreator = function(){
    /**
     * Creates concrete 'PromotionModel' object depending on 'type'
     * @param promotionObj {Object} json object.
     * @param modelValidator {CIE.ModelValidator} Validation helper for model.
     * @param statusModel
     * @returns {CIE.PromotionModel}
     */
    this.createModel = function(promotionObj, modelValidator, statusModel){
        modelValidator.notNull(promotionObj,"promotionObj");
        var promoType = modelValidator.existStringField(promotionObj, "type");
        var modelClass = CIE.PromotionModel;
        if(promoType == CIE.PromotionType.RC_FOR_TR_SIGN_IN)
        {
            modelClass = CIE.SignInPromotionModel;
        }
        else
        {
            modelClass = CIE.PromotionModel;
        }
        return new modelClass(promotionObj, modelValidator, statusModel);
    }
}

/**
 * Contains all used promotions types.
 * @namespace
 */
CIE.PromotionType = {};

/**
 * Represent promotion type for status boost campaign.
 * @type {string}
 * @constant
 */
CIE.PromotionType.STATUS_BOOST = "STATUS_BOOST";

/**
 * Represent promotion type for multiply status points campaign.
 * @type {string}
 * @constant
 */
CIE.PromotionType.SP_MULTIPLIER = "SP_MULTIPLIER";

/**
 * Represent promotion type for multiply reward credits campaign.
 * @type {string}
 * @constant
 */
CIE.PromotionType.RC_MULTIPLIER = "RC_MULTIPLIER";

/**
 * Represent promotion type for boosted benefits campaign.
 * @type {string}
 * @constant
 */
CIE.PromotionType.BOOSTED_BENEFITS = "BENEFIT_BOOST";

/**
 * Represents promotion type for TR sign-in campaign
 * @type {string}
 * @constant
 */
CIE.PromotionType.RC_FOR_TR_SIGN_IN = "RC_FOR_TR_SIGN_IN";

/**
 * All possible promotion types.
 * @type {Array.<string>}
 * @constant
 */
CIE.PromotionType.ALL = [CIE.PromotionType.STATUS_BOOST, CIE.PromotionType.SP_MULTIPLIER, CIE.PromotionType.RC_MULTIPLIER, CIE.PromotionType.BOOSTED_BENEFITS];
/**
 * Represent exchange rate model.
 * @param pricePointObj {Object} Parsed json object.
 * @param modelValidator {CIE.ModelValidator} Validation helper for model.
 * @constructor
 * @throws {CIE.Error} In case of violated contract for pricePointObj.
 */
CIE.PricePointModel = function(pricePointObj, modelValidator) {

    modelValidator.notNull(pricePointObj, "pricePointObj");

    var lowerBound = modelValidator.numberField(pricePointObj, "lowerBound");
    var upperBound = modelValidator.numberField(pricePointObj, "upperBound");
    var baseRate = modelValidator.numberField(pricePointObj, "baseRate");
    modelValidator.assert(lowerBound <= upperBound, "Lower bounds must equal or lower than upper bounds.");

    /**
     * The minimum value of currency to be spent in order for the base
     * rate in this array element to be applicable. This field is an inclusive bound,
     * i.e. the price must be greater than or equal to this value in order for the rate to apply.
     * @returns {Number}
     */
    this.getLowerBound = function() { return lowerBound; };

    /**
     * The maximum value of currency to be spent in order for the base rate in this array element to be applicable.
     * This field is an exclusive bound, i.e. the price needs to be less than this value in order for the rate to apply.
     * @returns {Number}
     */
    this.getUpperBound = function() { return upperBound; };

    /**
     * The base rate for converting between a currency value and Status Points.
     * For example, if the base rate is 10 and the user spends $5.00,
     * they will be eligible to receive at least $5.00 x 10.0 = 50
     * Status Points. Note that the base rate may be 0, in which case no points are awarded.
     * @returns {Number}
     */
    this.getBaseRate = function() { return baseRate; };

    /**
     * @param price {Number} Price to check.
     * @returns {boolean} true if price belong to current bounds and false otherwise.
     */
    this.isPriceInBounds = function(price)
    {
        var priceAmount = Math.floor(price * 100);
        var lowerBound = Math.floor(this.getLowerBound() * 100);
        var upperBound = Math.floor(this.getUpperBound() * 100);
        return priceAmount >= lowerBound && priceAmount <= upperBound;
    };
};
/**
 * An object that provides the current status of the user within the ONE Reward system.
 * Represent status section in {CIE.OneRewardResponseModel}.
 * @param statusObj {!Object} Parsed response object.
 * @param modelValidator {CIE.ModelValidator} Validation helper for model.
 * @constructor
 * @throws {CIE.Error} in case of invalid parameters.
 */
CIE.StatusModel = function(statusObj, modelValidator) {

    modelValidator.notNull(statusObj, "statusObj");

    var statusId = modelValidator.statusIdField(statusObj, "statusId");
    var statusPoints = modelValidator.notNegativeNumberField(statusObj, "statusPoints");
    var statusPointsUntilStatusUp = modelValidator.notNegativeNumberField(statusObj, "statusPointsUntilStatusUp");
    var statusExpiration = modelValidator.notNegativeNumberField(statusObj, "statusExpiration");
    var statusPointsExpiration = modelValidator.notNegativeNumberField(statusObj, "statusPointsExpiration");

    var statusPointsInCurrentYear = modelValidator.notNegativeNumberField(
        statusObj,
        modelValidator.isObsoleteAPI() ? "statusPointsCurrent" : "statusPointsCurrentYear"
    );

    var statusPointsCarryForward = "statusPointsCarryForward" in statusObj ? modelValidator.notNegativeNumberField(statusObj, "statusPointsCarryForward") : 0;
    var statusIdPostExpiration = modelValidator.statusIdField(statusObj, "statusIdPostExpiration");
    var lastStatusChangeTime = modelValidator.notNegativeNumberField(statusObj, "lastStatusChangeTime");
    var trEnabled = statusObj["trEnabled"] == 1;
    var trHidden = statusObj["trHidden"] == 1;
    var trAccountId = (statusObj["trAccountId"] || "") + "";
    var trNumber = (statusObj["trNumber"] || "") + "";

    var _isLifeTimePlayer = isLifeTimePlayer(statusObj, modelValidator.isObsoleteAPI(), statusExpiration);

    var statusFeatures = statusObj["features"];
    if(!statusFeatures)
        statusFeatures = [];

    /**
     * An integer identifier for the user’s current
     * status level. Valid values for this field:
     * * 1 (Bronze)
     * * 2 (Silver)
     * * 3 (Gold)
     * * 4 (Platinum)
     * * 5 (Diamond)
     * * 6 (Royal Diamond)
     * * 7 (Black Diamond) (For API version greater than 1.1)
     * @returns {Number}
     */
    this.getStatusId = function() { return statusId; };

    /**
     * The overall number of status points in the user’s account.
     * @returns {Number}
     */
    this.getStatusPoints = function() { return statusPoints; };

    /**
     * The number of status points needed by the user to reach the next status-up.
     * @returns {Number}
     */
    this.getStatusPointsUntilStatusUp = function() { return statusPointsUntilStatusUp; };

    /**
     * A Unix timestamp for the date and time when the user’s current status expires.
     * Expiration may be due to end of year or end of temporary promotion. Expressed in seconds since Unix epoch.
     * @returns {Number}
     */
    this.getStatusExpiration = function(){ return statusExpiration; };

    /**
     *A Unix timestamp for the date and time when the user’s current status points expire.
     * Points typically expire at the end of the year. Expressed in seconds since Unix epoch.
     * @returns {Number}
     */
    this.getStatusPointsExpiration = function(){ return statusPointsExpiration; };

    /**
     * This year’s number of accumulated status points in the user’s account.
     * In case of API < 1.2 always retrieve 0;
     * @require API >= 1.2
     * @returns {Number}
     */
    this.getStatusPointsInCurrentYear = function() { return statusPointsInCurrentYear; };

    /**
     * The number of status points retained from a previous year.
     * Currently, users do not retain any status points from the previous year
     * (Actual value will be received starts from 2016).
     * @returns {Number}
     */
    this.getStatusPointsCarryForward = function() { return statusPointsCarryForward; };

    /**
     * An integer identifier for the status level that the user will revert to at the end of
     * the current period. The values for this field are the same as those for the statusId field.
     * @returns {Number}
     */
    this.getStatusIdPostExpiration = function() { return statusIdPostExpiration; };

    /**
     * A Unix timestamp for the last time the user's status was changed.
     * @returns {Number}
     */
    this.getLastStatusChangeTime = function() { return lastStatusChangeTime; };

    /**
     * Indicates whether the user is eligible to participate in Caesar’s Total Rewards.
     * The user may be ineligible to participate in Total Rewards because of their country, or the platform.
     * @returns {boolean}
     */
    this.getTrEnabled = function() { return trEnabled; };

    /**
     * Indicates if Caesar's Total Rewards information can be displayed for current configuration.
     * For example it can be disabled be Market restrictions.
     * @returns {boolean}
     */
    this.getTrHidden = function() { return trHidden; };

    /**
     * The Caesar's Total Rewards internal ID.
     * @returns {string}
     */
    this.getTrAccountId = function() { return trAccountId; };

    /**
     * The Caesar's Total Rewards internal ID.
     * @param value {string}
     */
    this.setTrAccountId = function(value) { trAccountId = value; };

    /**
     * The consumer-facing Caesar's Total Rewards ID. Used for UI display.
     * @returns {string}
     */
    this.getTrNumber = function() { return trNumber; };

    /**
     * The consumer-facing Caesar's Total Rewards ID. Used for UI display.
     * @param value {string}
     */
    this.setTrNumber = function(value) { trNumber = value; };

    /**
     * Added since API 1.2. In obsolete API null is retrieved.
     * @returns {?boolean} true if user is user with life granted status and false otherwise.
     */
    this.isLifeTimePlayer = function() { return _isLifeTimePlayer; };

    /**
     * Returns true is feature with specified ID is turned on
     * @param featureId
     */
    this.isFeatureTurnedOn = function(featureId)
    {
        return statusFeatures.indexOf(featureId) != -1;
    };

    function isLifeTimePlayer(response, isObsoleteAPI, statusExpiration)
    {
        if (!isObsoleteAPI)
        {
            return response["ltPlayer"] == 1;
        }

        return statusExpiration >= 4070908800; // 01.01.2099 00:00:00
    }

};
/**
 * Contains constants for different statuses.
 * @namespace
 * @since 1.26
 */
CIE.StatusIds = {};
/**
 * Bronze ID constant.
 * @type {number}
 * @constant
 */
CIE.StatusIds.BRONZE = 1;
/**
 * Silver ID constant.
 * @type {number}
 * @constant
 */
CIE.StatusIds.SILVER = 2;
/**
 * Gold ID constant.
 * @type {number}
 * @constant
 */
CIE.StatusIds.GOLD = 3;
/**
 * Platinum ID constant.
 * @type {number}
 * @constant
 */
CIE.StatusIds.PLATINUM = 4;
/**
 * Diamond ID constant.
 * @type {number}
 * @constant
 */
CIE.StatusIds.DIAMOND = 5;
/**
 * Royal Diamond ID constant.
 * @type {number}
 * @constant
 */
CIE.StatusIds.ROYAL_DIAMOND = 6;
/**
 * Royal Diamond ID during status boost.
 * @type {number}
 * @constant
 */
CIE.StatusIds.ROYAL_DIAMOND_BOOSTED = CIE.StatusIds.ROYAL_DIAMOND + 1;
/**
 * Black Diamond ID.
 * @type {number}
 * @constant
 */
CIE.StatusIds.BLACK_DIAMOND = 7;
/**
 * Black Diamond ID during status boost.
 * @type {number}
 * @constant
 */
CIE.StatusIds.BLACK_DIAMOND_BOOSTED = CIE.StatusIds.BLACK_DIAMOND + 1;

/**
 * Created by AlexanderLa on 11/18/2016.
 *
 * Expiration result information
 * @param expirationResultNotificationObj {Object} Parsed json object
 * @model validator {CIE.ModelValidator} Validation helper for model
 * @constructor
 * @throws {CIE.Error} In case of violated contract for model
 */
CIE.ExpirationResultNotificationModel = function(expirationResultNotificationObj, modelValidator)
{
    modelValidator.notNull(expirationResultNotificationObj, "expirationResultNotificationObj");

    var lastYearSPs = modelValidator.notNegativeNumberField(expirationResultNotificationObj, "lastYearSPs");
    var lastYearPercent = modelValidator.notNegativeNumberField(expirationResultNotificationObj, "lastYearPercent");
    var decSPs = modelValidator.notNegativeNumberField(expirationResultNotificationObj, "decSPs");
    var decPercent = modelValidator.notNegativeNumberField(expirationResultNotificationObj, "decPercent");
    var statusIdBeforeExpiration = modelValidator.notNegativeNumberField(expirationResultNotificationObj, "statusIdBeforeExpiration");

    /**
     * The number of Status Points earned last year
     * @returns {Number}
     */
    this.getLastYearSPs = function()
    {
        return lastYearSPs;
    }

    /**
     * The percent of Status Points earned last year (part of the Kickstarter bonus)
     * @returns {Number}
     */
    this.getLastYearPercent = function()
    {
        return lastYearPercent;
    }

    /**
     * The number of Status Points earned last december
     * @returns {Number}
     */
    this.getDecSPs = function()
    {
        return decSPs;
    }

    /**
     * Progressive percentage of December Status Points (part of the Kickstarter bonus)
     * @returns {Number}
     */
    this.getDecPercent = function()
    {
        return decPercent;
    }

    /**
     * Status user had before expiration
     * @returns {Number}
     */
    this.getStatusIdBeforeExpiration = function()
    {
        return statusIdBeforeExpiration;
    }
}


/**
 * The TRS related benefits, i.e. Status Points and Reward
 * Credits, the user will get based on in-game activity, e.g.
 * Level Up.
 * @param appRewardsObj {Object} Parsed json object.s
 * @param modelValidator {CIE.ModelValidator} Validation helper for model.
 * @constructor
 * @throws {CIE.Error} In case violated contract for appRewardsObj.
 */
CIE.AppRewardsModel = function(appRewardsObj, modelValidator)
{
    modelValidator.notNull(appRewardsObj, "appRewardsObj");
    var levelUp = modelValidator.existField(appRewardsObj, "levelUp");
    var levelUpSP = modelValidator.notNegativeNumberField(levelUp, "statusPoints");

    /**
     * An integer that states how many Status Points were awarded for this transaction.
     * @returns {Number}
     */
    this.getLevelUpStatusPoints = function() { return levelUpSP; };
};
/**
 * Last status change information.
 * @param statusChangeObj {Object} Parsed json object.
 * @param modelValidator {CIE.ModelValidator} Validation helper for model.
 * @constructor
 * @throws {CIE.Error} In case of violated contract for model.
 */
CIE.StatusChangeModel = function (statusChangeObj, modelValidator)
{
    modelValidator.notNull(statusChangeObj, "statusChangeObj");
    var previousStatusId = modelValidator.statusIdField(statusChangeObj, "previousStatusId");

    var statusChangeEvent = new CIE.TransactionEventModel(
        modelValidator.existField(statusChangeObj, "event"),
        modelValidator
    );

    var isStatusGifted = statusChangeObj["isStatusGifted"] == 1;

    /**
     * Previous status Id.
     * @returns {number}
     */
    this.getPreviousStatusId = function() { return previousStatusId; };

    /**
     * Event describing status change reasons.
     * @returns {CIE.TransactionEventModel}
     */
    this.getEvent = function() { return statusChangeEvent; };


    /**
     * Check if new status is gifted
     * @returns {Boolean} true if new status is gifted
     */
    this.getIsStatusGifted = function()
    {
        return isStatusGifted;
    }
};
/**
 * Represent widgetData response model.
 * @param oneRewardResponseObj {Object} Parsed response json. Not null.
 * @constructor
 * @throws {CIE.Error} In case incorrect response format.
 */
CIE.OneRewardResponseModel = function(oneRewardResponseObj){

    var modelValidator = new CIE.ModelValidator();
    var _obj = modelValidator.notNull(oneRewardResponseObj, "oneRewardResponseObj");

    var _apiVersion = oneRewardResponseObj["oneApiVersion"];
    if (!_apiVersion)
    {
        _apiVersion = "1.0";
    }
    modelValidator.setAPIVersion(_apiVersion);

    var _timestamp = modelValidator.notNegativeNumberField(oneRewardResponseObj, "timestamp");
    modelValidator.setCurrentServerTime(_timestamp);

    var _oneRewardConfig = new CIE.OneRewardConfigModel(
        modelValidator.existField(oneRewardResponseObj, "config"),
        modelValidator
    );

    var _oneMessage = new CIE.OneMessageModel(oneRewardResponseObj["message"]);

    var _statusChangeEvent = oneRewardResponseObj["statusChangeEvent"]
        ? new CIE.StatusChangeModel(oneRewardResponseObj["statusChangeEvent"], modelValidator)
        : null;

    var _statusModel = new CIE.StatusModel(
        modelValidator.existField(oneRewardResponseObj, "status"),
        modelValidator
    );

    var _expirationResultNotification = oneRewardResponseObj["expirationResultNotification"]
        ? new CIE.ExpirationResultNotificationModel(oneRewardResponseObj["expirationResultNotification"], modelValidator)
        : null;

    var _promotionsModel = new CIE.PromotionsModel(
        oneRewardResponseObj["promotions"],
        modelValidator,
        _statusModel
    );

    var _exchangeRate = new CIE.ExchangeRateModel(
        modelValidator.existField(oneRewardResponseObj, "exchangeRate"),
        modelValidator
    );

    var _expiration = modelValidator.notNegativeNumberField(oneRewardResponseObj, "expiration");

    var _clientStepsCompleted = modelValidator.existField(oneRewardResponseObj, "clientStepsCompleted");

    var _appRewards = new CIE.AppRewardsModel(
        modelValidator.existField(oneRewardResponseObj, "appRewards"),
        modelValidator
    );

    /**
     * @returns {number} Current timestamp on server.
     */
    this.getTimestamp = function(){ return _timestamp; };

    /**
     * @todo To clarifying.
     * @returns {number} Expiration of response.
     */
    this.getExpiration = function(){ return _expiration; };

    /**
     * @returns {Array.<Number>} Array of completed tutorial steps.
     */
    this.getClientStepsCompleted = function(){ return _clientStepsCompleted; };

    /**
     * Configuration of ONE Reward system.
     * @returns {CIE.OneRewardConfigModel}
     */
    this.getConfig = function() { return _oneRewardConfig; };

    /**
     * Contains all information about messages.
     * @returns {CIE.OneMessageModel}
     */
    this.getOneMessage = function () { return _oneMessage; };

    /**
     * Returns unread message count for the current user and application
     * The same as {@link getOneMessage().getUnreadMessagesCount()}.
     * @returns {Number}
     */
    this.getUnreadMessageCount = function () { return _oneMessage.getUnreadMessagesCount(); };

    /**
     * @returns {CIE.StatusChangeModel}
     */
    this.getStatusChangeEvent = function(){ return _statusChangeEvent; };

    /**
     * @return {CIE.ExpirationResultNotificationModel}
     */
    this.getExpirationResultNotification = function()
    {
        return _expirationResultNotification;
    };

    /**
     * Current user status information.
     * @returns {CIE.StatusModel}
     */
    this.getStatus = function(){ return _statusModel; };

    /**
     * Returns active promotions
     * @returns {Array.<CIE.PromotionModel>}
     * */
    this.getPromotions = function(){ return _promotionsModel.getPromotions(); };

    /**
     * Return promotions model.
     * @returns {CIE.PromotionsModel}
     */
    this.getPromotionsModel = function() { return _promotionsModel; };

    /**
     * The TRS related benefits, i.e. Status Points and Reward Credits, the user will get based on in-game activity,
     * e.g. Level Up.
     * @returns {CIE.AppRewardsModel}
     */
    this.getAppRewards = function() { return _appRewards; };

    /**
     * An object that provides the conversion factors between realmoney purchases and
     * ONE Reward status points and Caesar's Total Reward credits.
     * @returns {CIE.ExchangeRateModel}
     */
    this.getExchangeRate = function() { return _exchangeRate; };

    this.getObj = function(){ return _obj; };

    /**
     * Current used API version.
     * @returns {String}
     */
    this.getAPIVersion = function () { return _apiVersion; };

    /**
     * @returns {boolean} true in case of API version equal to "1.0" or "1.1" and false otherwise.
     */
    this.isObsoleteAPI = function () { return _apiVersion == "1.0" || _apiVersion == "1.1"; };

    this.rawData = null;
};
/**
 * An object that provides the conversion factors between realmoney purchases and
 * ONE Reward status points and Caesar's Total Reward credits.
 * @param exchangeRateObj {Object} Parsed json object.
 * @param modelValidator {CIE.ModelValidator}
 * @constructor
 * @throws {CIE.Error} In case violated contract for exchangeRateObj.
 */
CIE.ExchangeRateModel = function(exchangeRateObj, modelValidator)
{
    modelValidator.notNull(exchangeRateObj, "exchangeRateObj");

    var _statusPoints = new CIE.BonusMultiplierModel(
        modelValidator.existField(exchangeRateObj, "statusPoints"),
        modelValidator
    );

    var _rewardCredits = new CIE.BonusMultiplierModel(
        modelValidator.existField(exchangeRateObj, "rewardCredits"),
        modelValidator
    );

    var _expiration = modelValidator.notNegativeIntegerField(exchangeRateObj, "expiration");
    var _currency = modelValidator.existStringField(exchangeRateObj, "currency");

    /**
     * The value in this field indicates the time at which exchange rates in this object become invalid.
     * By default, exchange rates expire every 12 hours, but could expire sooner due to a promotion ending or
     * the beginning of a new promotion. Expressed in seconds since Unix epoch.
     * @returns {Number}
     */
    this.getExpiration = function(){ return _expiration; };

    /**
     * This is the currency that was passed to the ONE Reward server endpoint or client-side widget Init method.
     * Exchange rates will always be returned in the requested currency.
     * Expressed as a three-letter ISO 4217 currency code.
     * @returns {string}
     */
    this.getCurrency = function(){ return _currency; };

    /**
     * A nested object containing conversion information for ONE Reward Status Points.
     * @returns {CIE.BonusMultiplierModel}
     */
    this.getStatusPoints = function(){ return _statusPoints; };

    /**
     * A nested object containing conversion information for Caesar's Reward Credits.
     * @returns {CIE.BonusMultiplierModel}
     */
    this.getRewardCredits = function(){ return _rewardCredits; };
};
/**
 * TR sign-in promotion model
 * @param promotionObj {Object} json object.
 * @param modelValidator {CIE.ModelValidator} Validation helper for model.
 * @param statusModel {CIE.StatusModel}
 * @constructor
 */
CIE.SignInPromotionModel = function (promotionObj, modelValidator, statusModel)
{

    CIE.PromotionModel.call(this,promotionObj, modelValidator);

    modelValidator.assert(this.getType() == CIE.PromotionType.RC_FOR_TR_SIGN_IN,"wrong type " + this.getType());

    /**
     * Returns true if user is not signed-in yet
     */
    function isUserSignedIn(){
        return statusModel && statusModel.getTrAccountId()!="";
    }

    /**
     * Check status of the promo, true if promotion is active
     * Sign-in promo can be active only if user is not signed-in
     * @returns {boolean}
     */
    this.isActiveAdditionalChecking = function(){
        if(isUserSignedIn())
            return false;
        return true;
    }

}

/**
 * Promotion model.
 * @param promotionObj {Object} json object.
 * @param modelValidator {CIE.ModelValidator} Validation helper for model.
 * @constructor
 * @throws {CIE.Error} In case of violated contract for promotionObj.
 */
CIE.PromotionModel = function (promotionObj, modelValidator) {

    modelValidator.notNull(promotionObj, "promotionObj");

    var promoId = modelValidator.existStringField(promotionObj, "id");

    var promoType = modelValidator.existStringField(promotionObj, "type");
    if (promoType == "DOUBLE_SP") // Handle of obsolete multiply SP promotion type.
    {
        promoType = CIE.PromotionType.SP_MULTIPLIER;
    }

    var promoName = modelValidator.existStringField(promotionObj, "name");
    var description = modelValidator.existStringField(promotionObj, "description");

    var statusBoostFactor;
    if (promoType == CIE.PromotionType.STATUS_BOOST)
    {
        statusBoostFactor = modelValidator.notNegativeIntegerField(promotionObj, "statusBoostFactor");
    }
    else
    {
        statusBoostFactor = 0;
    }

    var statusPointsMultiplier;
    if (promoType == CIE.PromotionType.SP_MULTIPLIER)
    {
        statusPointsMultiplier = getPromotionMultiplier(
            promotionObj,
            modelValidator.isObsoleteAPI()
                ? "statusPointsFactor"
                : "statusPointsMultiplier"
        );
    }
    else
    {
        statusPointsMultiplier = 1;
    }

    var rewardCreditsMultiplier;
    if (promoType == CIE.PromotionType.RC_MULTIPLIER)
    {
        rewardCreditsMultiplier = getPromotionMultiplier(
            promotionObj,
            modelValidator.isObsoleteAPI()
                ? "rewardCreditsFactor"
                : "rewardCreditsMultiplier"
        );
    }
    else
    {
        rewardCreditsMultiplier = 1;
    }

    var startTime = modelValidator.notNegativeIntegerField(promotionObj, "startTime");
    var endTime = modelValidator.notNegativeIntegerField(promotionObj, "endTime");

    var spEventType = promotionObj["eventType"];
    if(!spEventType)
    {
        spEventType = CIE.SPMultiplierPromotionType.ALL;
    }

    /**
     * @private
     * @returns {number}
     */
    function getPromotionMultiplier(responseObject, fieldName)
    {
        var value = modelValidator.notNegativeNumberField(responseObject, fieldName);
        if (modelValidator.isObsoleteAPI())
        {
            value += 1;
        }
        return value;
    }

    /**
     * Additional checking of promotion status
     * true if promotion is active
     * @returns {boolean}
     */
    this.isActiveAdditionalChecking = function(){
        return true;
    }

    /**
     * An identifier for the promotion.
     * @returns {string}
     */
    this.getId = function() { return promoId; };

    /**
     * The type of the campaign. There are 3 types:
     * 1. STATUS_BOOST
     * 2. SP_MULTIPLIER
     * 3. RC_MULTIPLIER
     * @returns {string}
     * @see {@link CIE.PromotionType}
     */
    this.getType = function() { return promoType; };

    /**
     * Name of the campaign.
     * @returns {string}
     */
    this.getName = function() { return promoName; };

    /**
     * Description of the campaign.
     * @returns {string}
     */
    this.getDescription = function() { return description; };

    /**
     * An Integer representing the number of status levels the user will be boosted during a Status Boost campaign,
     * e.g. for 1, Gold users will be boosted to Platinum.
     * “1” for Bronze to Diamond users and “0” for RD and BD since their status is not boosted, only the benefits’ values.
     * @returns {Number}
     */
    this.getStatusBoostFactor = function(){ return statusBoostFactor; };

    /**
     * A decimal value for the Status Points multiplier during an SP Multiplier campaign.
     * 1.00 means that there is no active campaign.
     * For example if we receive value `2.0` it's means that 2x SP multiplier promotion active.
     * @since 1.26
     * @returns {number}
     */
    this.getStatusPointsMultiplier = function() { return statusPointsMultiplier; };

    /**
     * A decimal value for the Reward Credits multiplier during an RC Multiplier campaign.
     * 1.00 means that there is no active campaign.
     * For example if we receive value `2.0` it's means that 2x RC multiplier promotion active.
     * @since 1.26
     * @returns {number}
     */
    this.getRewardCreditsMultiplier = function() { return rewardCreditsMultiplier; };

    /**
     * A decimal value for the Status Points multiplier during an SP Multiplier campaign.
     * 0 means that there is no active campaign.
     * For example if we receive value `1.0` means that 2x SP multiplier promotion active.
     * @deprecated Please use {@link CIE.PromotionModel.getStatusPointsMultiplier}
     * @returns {number}
     */
    this.getStatusPointsFactor = function() { return this.getStatusPointsMultiplier() - 1; };

    /**
     * A decimal value for the Status Points multiplier during an SP Multiplier campaign.
     * 0 means that there is no active campaign.
     * For example if we receive value `1.0` means that 2x SP multiplier promotion active.
     * @deprecated Please use {@link CIE.PromotionModel.getRewardCreditsMultiplier}
     * @returns {number}
     */
    this.getRewardCreditsFactor = function() { return this.getRewardCreditsMultiplier() - 1; };

    /**
     * A UNIX timestamp for the date and time when the promotion is planned to start.
     * In seconds. Based on server time.
     * @returns {number}
     */
    this.getStartTime = function() { return startTime; };

    /**
     * A UNIX timestamp for the date and time when the promotion is planned to end.
     * In seconds. Based on server time.
     * @returns {number}
     */
    this.getEndTime = function() { return endTime; };

    /**
     * Always retrieve 0.
     * @deprecated
     * @returns {number}
     */
    this.getStatusPointsPromotionMultiplier = function() { return 0; };

    /**
     * Type of the SP multiplier campaign. There are possible 3 types:
     * 1. all (default value)
     * 2. levelup
     * 3. purchase
     * @returns {String}
     * @see {@link CIE.SPMultiplierPromotionType}
     */
    this.getStatusPointsMultiplierType = function()
    {
        return spEventType
    };

    /**
     * Always retrieve 0.
     * @deprecated
     * @returns {number}
     */
    this.getRewardCreditsPromotionMultiplier = function() { return 0; };

    /**
     * @since 1.26
     * @returns {boolean} true in case promotion is active now and false otherwise.
     */
    this.isActive = function() {
        var currentTimestamp = modelValidator.getCurrentTimestampOnServer();
        return (
            this.getStartTime() <= currentTimestamp &&
            this.getEndTime() >= currentTimestamp &&
            this.getStartTime() < this.getEndTime() &&
            this.isActiveAdditionalChecking()
        );
    };

    /**
     * In case of active promotion retrieve amount of seconds until promotion will be finished.
     * In case of not active promotion null will be retrieved.
     * @since 1.26
     * @returns {?Number}
     */
    this.getTimeTillFinish = function() {
        if (!this.isActive())
        {
            return null;
        }
        return this.getEndTime() - modelValidator.getCurrentTimestampOnServer();
    };

    /**
     * @since 1.26
     * @returns {boolean} true in case promotion is start in future and false otherwise.
     */
    this.isStartInFuture = function()
    {
        return (
            this.getStartTime() > modelValidator.getCurrentTimestampOnServer() &&
            this.getEndTime() > this.getStartTime()
        );
    };

    /**
     * In case of starting in future promotion retrieve amount of seconds until start.
     * In case of absent promotion null will be retrieved.
     * @since 1.26
     * @returns {?Number}
     */
    this.getTimeTillStart = function() {
        if (!this.isStartInFuture())
        {
            return null;
        }
        return this.getStartTime() - modelValidator.getCurrentTimestampOnServer();
    }

};

/**
 * Represent transaction event.
 * @param transactionEventObj {Object} Parsed json object.
 * @param modelValidator {CIE.ModelValidator} Validation helper for model.
 * @constructor
 * @throws {CIE.Error} In case of violated contract for transactionEventObj.
 */
CIE.TransactionEventModel = function(transactionEventObj, modelValidator)
{
    modelValidator.notNull(transactionEventObj, "transactionEventObj");

    var _timestamp = modelValidator.notNegativeNumberField(transactionEventObj, "timestamp");
    var _sourceAppName = modelValidator.existStringField(transactionEventObj, "sourceApp");
    var _source = modelValidator.existStringField(transactionEventObj, "source");
    var _amount = modelValidator.notNegativeNumberField(transactionEventObj, "amount");
    var _currency = modelValidator.existStringField(transactionEventObj, "currency");
    var _transactionId = modelValidator.existStringField(transactionEventObj, "transactionId");

    /**
     * The time of event appearing.
     * UNIX timestamp in seconds.
     * @returns {number}
     */
    this.getTimestamp = function(){ return _timestamp; };

    /**
     * The name of app - origin of event.
     * @returns {string}
     */
    this.getSourceApp = function(){ return _sourceAppName; };

    /**
     * The action which triggered event. For example purchase or level up.
     * @returns {string}
     */
    this.getSource = function(){ return _source; };

    /**
     * Amount of units caused event.
     * For example in case of purchase it's contains amount of money.
     * For level up amount of level ups caused event (typically 1).
     * @returns {number}
     */
    this.getAmount = function(){ return _amount; };

    /**
     * In case of purchase source it's contains name of currency.
     * @returns {string}
     */
    this.getCurrency = function(){ return _currency; };

    /**
     * Source transaction ID. Unique identifier of source action.
     * @returns {string}
     */
    this.getTransactionId = function(){ return _transactionId; };
};
/**
 * Contains util methods for response validation.
 * @param apiVersion {string} API version of response.
 * @optional
 * @default 0
 * @param clientServerTimeDiff {Number} Difference between client and server time in seconds.
 * @optional
 * @default "1.0"
 * @constructor
 */
CIE.ModelValidator = function(apiVersion, clientServerTimeDiff) {

    /**
     * @type {string}
     * @private
     */
    var _apiVersion = apiVersion || "1.0";

    /**
     * Difference between server and client time in seconds.
     * @type {Number}
     * @private
     */
    var _serverClientTimeDiff = clientServerTimeDiff || 0;

    /**
     * @returns {boolean} true in case of API version is equal to 1.0 or 1.1 and false otherwise.
     */
    this.isObsoleteAPI = function() {

        return _apiVersion == "1.0" || _apiVersion == "1.1";
    };

    /**
     * @returns {number} Max status id for current API version.
     */
    this.getMaxStatusId = function() {
        return this.isObsoleteAPI() ? CIE.StatusIds.ROYAL_DIAMOND : CIE.StatusIds.BLACK_DIAMOND;
    };

    /**
     * @returns {string} Value of API version.
     */
    this.getAPIVersion = function() {

        return _apiVersion;
    };

    /**
     * Set API version.
     * @param apiVersion {string} Value of API version.
     */
    this.setAPIVersion = function(apiVersion) {

        _apiVersion = apiVersion;
    };

    /**
     * Initialize client server time difference through server time.
     * @param currentServerTime {Number} Server timestamp in seconds.
     */
    this.setCurrentServerTime = function(currentServerTime) {
        this.setServerClientTimeDiff(this.getCurrentTimestamp() - currentServerTime);
    };

    /**
     * Difference between server and client time in seconds.
     * @param serverClientTimeDiff {Number} seconds.
     */
    this.setServerClientTimeDiff = function(serverClientTimeDiff) {

        _serverClientTimeDiff = serverClientTimeDiff;
    };

    /**
     * Difference between server and client time in seconds.
     * @returns {number}
     */
    this.getServerClientTimeDiff = function() {

        return _serverClientTimeDiff;
    };

    /**
     * Current timestamp on server.
     * @returns {number}
     */
    this.getCurrentTimestampOnServer = function() {

        return this.getCurrentTimestamp() - _serverClientTimeDiff;
    };

    /**
     * Return current UNIX timestamp in seconds.
     * @returns {number}
     */
    this.getCurrentTimestamp = function() {

        return Math.floor(new Date().getTime() / 1000);
    };

    /**
     * Fail with custom message.
     * @param fieldName {string} Name of validating field.
     * @param reason {string} Reason of failure.
     * @throws {CIE.Error}
     */
    this.error = function (fieldName, reason) {

        throw new CIE.Error(fieldName + " validation failed (expected " + reason + ").");
    };

    /**
     * Check that true value is true.
     * @param trueValue {*} true value to check.
     * @param message {string} Exception message.
     * @optional
     * @returns {*} passed true value without changing.
     * @throws {CIE.Error} in case of passed trueValue is not true.
     */
    this.assert = function (trueValue, message) {

        message = message || "Expected true value during assertion.";
        if (!trueValue)
        {
            throw new CIE.Error(message);
        }
        return trueValue;
    };

    /**
     * Check passed value and fail in case of it's equal (==) to null.
     * @param notNullValue {*} Passed not null value.
     * @param fieldName {string} Exist field name.
     * @returns {*} Passed not null value.
     * @throws {CIE.Error} In case of passed value is null.
     */
    this.notNull = function (notNullValue, fieldName) {

        if (notNullValue == null)
        {
            this.error(fieldName || "value", "not null") ;
        }
        return notNullValue;
    };

    /**
     * Try to get exist field (not null and not undefined).
     * @param response {Object} Object with exist field.
     * @param fieldName {string} Field name.
     * @returns {*} Field value.
     * @throws {CIE.Error} In case of failure attempt.
     */
    this.existField = function (response, fieldName) {

        return this.notNull(response[fieldName], fieldName);
    };

    /**
     * Try to get string field.
     * @param response {Object} Object with string field.
     * @param fieldName {string} Field name.
     * @returns {string} Field value.
     * @throws {CIE.Error} In case of failure attempt.
     */
    this.existStringField = function (response, fieldName) {

        return this.existField(response, fieldName) + "";
    };

    /**
     * Try to get string value.
     * @param response {Object} Object with not empty string field.
     * @param fieldName {string} Field name.
     * @returns {string} Not empty string.
     * @throws {CIE.Error} In case failure attempt.
     */
    this.notEmptyString = function (response, fieldName) {
        var value = this.existStringField(response, fieldName);
        if (!value)
        {
            this.error(fieldName, "not empty string");
        }
        return value;
    };

    /**
     * Try to get number field.
     * @param response {Object} Object with number field.
     * @param fieldName {string} Number field name.
     * @returns {number} Field value.
     * @throws {CIE.Error} In case of failure attempt.
     */
    this.numberField = function (response, fieldName) {

        var value = +response[fieldName];
        if (response[fieldName] == null || response[fieldName] === "" || isNaN(value))
        {
            this.error(fieldName, "number field");
        }
        return value;
    };

    /**
     * Try to get not negative number field.
     * @param response {Object} Object with not negative number field.
     * @param fieldName {string} Not negative number field name.
     * @returns {number} Field value.
     * @throws {CIE.Error} In case of failure attempt.
     */
    this.notNegativeNumberField = function (response, fieldName) {

        var value = this.numberField(response, fieldName);
        if (value < 0)
        {
            this.error(fieldName, "not negative number");
        }
        return value;
    };

    /**
     * Try to get integer field.
     * @param response {Object} Object with integer field.
     * @param fieldName {string} Integer field name.
     * @returns {number} Field value.
     * @throws {CIE.Error} In case of failure attempt.
     */
    this.integerField = function (response, fieldName) {

        var value = this.numberField(response, fieldName);
        var flooredValue = Math.floor(value);

        if (value !== flooredValue)
        {
            this.error(fieldName, "integer number");
        }
        return flooredValue;
    };

    /**
     * Try to get not negative integer field.
     * @param response {Object} Object with integer field.
     * @param fieldName {string} Integer field name.
     * @returns {number} Field value.
     * @throws {CIE.Error} In case of failure attempts.
     */
    this.notNegativeIntegerField = function(response, fieldName)
    {
        var value = this.integerField(response, fieldName);
        if (value < 0)
        {
            this.error(fieldName, "not negative integer");
        }
        return value;
    };

    /**
     * Try to get status id field.
     * @param response {Object} Object with status id field.
     * @param fieldName {string} Status id field name.
     * @returns {number} Field value.
     * @throws {CIE.Error} In case of failure attempt.
     */
    this.statusIdField = function (response, fieldName) {

        var maxStatusId = this.getMaxStatusId();
        var value = this.integerField(response, fieldName);
        if (value < 1 || value > maxStatusId)
        {
            this.error(fieldName, "status id [1, " + maxStatusId + "]");
        }
        return value;
    };

    this.toClientTimestampField = function(response, fieldName)
    {
        return this.notNegativeIntegerField(response, fieldName) + this.getServerClientTimeDiff();

    };

};

/**
 * Contains current OneReward configuration.
 * @param oneRewardConfigModelObj {Object} Parsed json object.
 * @param modelValidator {CIE.ModelValidator} Validation helper for model.
 * @constructor
 * @throws {CIE.Error} In case violated contract for oneRewardConfigModelObj
 */
CIE.OneRewardConfigModel = function(oneRewardConfigModelObj, modelValidator)
{
    modelValidator.notNull(oneRewardConfigModelObj, "oneRewardConfigModelObj");

    var _trVersion = modelValidator.existStringField(oneRewardConfigModelObj, "trVersion");
    var _cdnWebsiteUrl = modelValidator.notEmptyString(oneRewardConfigModelObj, "cdnWebsiteUrl");
    var _statusChangeRetryCount = modelValidator.notNegativeNumberField(oneRewardConfigModelObj, "statusChangeRetryCount");
    var _retryBackoff = modelValidator.notNegativeNumberField(oneRewardConfigModelObj, "retryBackoff");
    var _trUrl = modelValidator.notEmptyString(oneRewardConfigModelObj, "trUrl");
    var _trApiKey = modelValidator.existStringField(oneRewardConfigModelObj, "trApiKey");
    var _gdprUrl = modelValidator.notEmptyString(oneRewardConfigModelObj, "consentManagementServiceUrl");
    var _newUserStatusPoints = modelValidator.notNegativeNumberField(oneRewardConfigModelObj, "newUserStatusPoints");
    var _rewardCreditsCap = modelValidator.notNegativeNumberField(oneRewardConfigModelObj, "rewardCreditsCap");
    var _oneMessageUrl =  oneRewardConfigModelObj["oneMessageUrl"];

    var _statuses = [];
    var _statusesSources = modelValidator.existField(oneRewardConfigModelObj, "statuses");
    for (var i = 0, statusesAmount = _statusesSources.length; i < statusesAmount; i++)
    {
        _statuses.push(new CIE.StatusBracketModel(_statusesSources[i], modelValidator));
    }

    /**
     * TR version.
     * @returns {string}
     */
    this.getTrVersion = function(){ return _trVersion; };

    /**
     * URL for current widget resources.
     * @returns {string}
     */
    this.getCdnWebsiteUrl = function(){ return _cdnWebsiteUrl; };

    /**
     * URL of the one message endpoint.
     * @returns {string}
     */
    this.getOneMessageUrl = function(){ return _oneMessageUrl; };

    /**
     * Maximal amount of widgetData request when waiting for status changes info.
     * @returns {number}
     */
    this.getStatusChangeRetryCount = function(){ return _statusChangeRetryCount; };

    /**
     * Number of seconds between two status changes requests.
     * @returns {number}
     */
    this.getRetryBackoff = function(){ return _retryBackoff };

    /**
     * URL to Total Rewards services.
     * @returns {string}
     */
    this.getTrUrl = function(){ return _trUrl; };

    /**
     * URL to Total Rewards services.
     * @returns {string}
     */
    this.getGdprUrl = function(){ return _gdprUrl; };

    /**
     * Total Rewards API key.
     * @returns {string}
     */
    this.getTrApiKey = function(){ return _trApiKey; };

    /**
     * Statuses amount configurations.
     * @returns {Array}
     */
    this.getStatuses = function(){ return _statuses; };

    /**
     * Limit for Reward Credits operations.
     * If during Reward Credits bonus calculations result amount
     * will be greater rewardCreditsCap, rewardCreditsCap will be used as result.
     * @returns {number}
     * @see {CIE.ExchangeRate.getRewardCreditsForAmount}
     */
    this.getRewardCreditsCap = function(){ return _rewardCreditsCap; };

    /**
     * Status points amount granted for new user.
     * @returns {number}
     */
    this.getNewUserStatusPoints = function(){ return _newUserStatusPoints; };
};
/**
 * Represent promotions collection.
 * @param promotionsArray {Array.<Object>} Array of parsed promotion json.
 * @param modelValidator {CIE.ModelValidator} Validation helper for model.
 * @constructor
 * @since 1.26
 */
CIE.PromotionsModel = function(promotionsArray, modelValidator, statusModel)
{
    if (!promotionsArray || !promotionsArray.length)
    {
        promotionsArray = [];
    }

    /**
     * @type {Array.<CIE.PromotionModel>}
     * @private
     */
    var promotions = [];

    /**
     * @type {boolean}
     * @private
     */
    var isObsoleteAPI = modelValidator.isObsoleteAPI();
    var modelCreator = new CIE.PromotionModelCreator();

    for(var i = 0, promotionsLength = promotionsArray.length; i < promotionsLength; i++)
    {
        var promotionObj = promotionsArray[i];
        if (!promotionObj)
        {
            continue;
        }

        var promotion;
        try
        {
            promotion = modelCreator.createModel(promotionObj, modelValidator, statusModel);
        }
        catch(e)
        {
            CIE.oneLog("PromotionsModel: Error during parsing promotion " + promotionObj + ". Skip." );
            continue;
        }

        promotions.push(promotion);
    }

    /**
     * All promotions.
     * @returns {Array.<CIE.PromotionModel>}
     */
    this.getPromotions = function() { return promotions; };

    /**
     * Retrieve active promotions.
     * @param promotionType If present filter promotions also by type.
     * Otherwise will be added active promotions with any type.
     * @optional
     * @returns {Array.<CIE.PromotionModel>}
     * @see {@link CIE.PromotionType}
     */
    this.getActivePromotions = function(promotionType)
    {
        var result = [];
        for (var i = 0, promotionsCount = promotions.length; i < promotionsCount; i++)
        {
            var promotion = promotions[i];
            if (promotion.isActive() && (!promotionType || promotionType == promotion.getType()))
            {
                result.push(promotion);
            }
        }
        return result;
    };

    /**
     * Get cumulative information about all active status boost promotions.
     * @example <caption>Calculating boosted status ID.</caption>
     * currentStatusId + promotionsModel.getActiveStatusBoostFactor()
     * @returns {number} Additive factor to current status id to receive boosted status ID.
     * Now supported only +1 status boost.
     */
    this.getActiveStatusBoostFactor = function()
    {
        var result = 0;
        var activePromotions = this.getActivePromotions(CIE.PromotionType.STATUS_BOOST);
        for (var i = 0, promotionsCount = activePromotions.length; i < promotionsCount; i++)
        {
            var promotion = activePromotions[i];
            result += promotion.getStatusBoostFactor();
        }
        return result;
    };

    /**
     * Get cumulative multiplier of all active multiply status points promotions.
     * If any MSP promotion is active retrieved number > 1 and 1 otherwise.
     * @returns {number}
     */
    this.getActiveStatusPointsMultiplier = function()
    {
        var result = 1;
        var activePromotions = this.getActivePromotions(CIE.PromotionType.SP_MULTIPLIER);
        for (var i = 0, promotionsCount = activePromotions.length; i < promotionsCount; i++)
        {
            var promotion = activePromotions[i];
            var effect = promotion.getStatusPointsMultiplier();
            if (isObsoleteAPI)
            {
                result += (effect - 1);
            }
            else
            {
                result *= effect;
            }
        }
        return result;
    };

    //TODO: Alexanderla - handle and process case of several SP promotion in the same time
    /**
     * Type of the active SP multiplier campaign - 'levelup','purchase' or 'all'
     * @returns {string}
     */
    this.getActiveStatusPointsMultiplierType = function()
    {
        var activePromo = this.getActivePromotions(CIE.PromotionType.SP_MULTIPLIER)[0];
        return activePromo?activePromo.getStatusPointsMultiplierType():CIE.SPMultiplierPromotionType.ALL;
    }

    /**
     * Get cumulative multiplier of all active multiply reward credits promotions.
     * If any MRC promotion is active retrieved number > 1 and 1 otherwise.
     * @returns {number}
     */
    this.getActiveRewardCreditsMultiplier = function()
    {
        var result = 1;
        var activePromotions = this.getActivePromotions(CIE.PromotionType.RC_MULTIPLIER);
        for (var i = 0, promotionsCount = activePromotions.length; i < promotionsCount; i++)
        {
            var promotion = activePromotions[i];
            var effect = promotion.getRewardCreditsMultiplier();
            if (isObsoleteAPI)
            {
                result += (effect - 1);
            }
            else
            {
                result *= effect;
            }
        }
        return result;
    };

    /**
     * @returns {boolean} true in case of active status boost and false otherwise.
     */
    this.isStatusBoostActive = function()
    {
        return this.getActivePromotions(CIE.PromotionType.STATUS_BOOST).length > 0;
    };

    /**
     * @returns {boolean} true in case of active multiply status points promotion and false otherwise.
     */
    this.isMultiplyStatusPointsActive = function()
    {
        return this.getActiveStatusPointsMultiplier() > 1;
    };

    /**
     * @returns {boolean} true in case of active multiply reward credits promotion and false otherwise.
     */
    this.isMultiplyRewardCreditsActive = function()
    {
        return this.getActiveRewardCreditsMultiplier() > 1;
    };

    /**
     * @returns {boolean} true in case of active boosted benefits promotion and false otherwise.
     */
    this.isBoostedBenefitsPromotionActive = function()
    {
        return this.getActivePromotions(CIE.PromotionType.BOOSTED_BENEFITS).length > 0;
    };

    /**
     * @returns {boolean} true in case of active TR sign-in promotion and false otherwise.
     */
    this.isRewardCreditsSignInPromotionActive = function()
    {
        return this.getActivePromotions(CIE.PromotionType.RC_FOR_TR_SIGN_IN).length > 0;
    };

    /**
     * Retrieve promotion of specified type with the lowest time till finish.
     * @param promotionType {string} Type of promotion.
     * @returns {CIE.PromotionModel} Promotion with lowest ttf if any or null.
     */
    this.getNearestFinishingPromotion = function(promotionType)
    {
        var nearestPromotion = null;

        for (var i = 0, length = promotions.length; i < length; i++)
        {
            var promotion = promotions[i];
            if (!promotion.isActive() || promotion.getType() != promotionType)
            {
                continue;
            }

            if (!nearestPromotion || (promotion.getTimeTillFinish() < nearestPromotion.getTimeTillFinish()))
            {
                nearestPromotion = promotion;
            }
        }

        return nearestPromotion;
    };

    /**
     * Retrieve promotion of specified type with the lowest time till start.
     * @param promotionType {string} Type of promotion.
     * @returns {CIE.PromotionModel} Promotion with lowest tts if any or null.
     */
    this.getNearestStartingPromotion = function(promotionType)
    {
        var nearestPromotion = null;

        for (var i = 0, length = promotions.length; i < length; i++)
        {
            var promotion = promotions[i];
            if (!promotion.isStartInFuture() || promotion.getType() != promotionType)
            {
                continue;
            }

            if (!nearestPromotion || (promotion.getTimeTillStart() < nearestPromotion.getTimeTillStart()))
            {
                nearestPromotion = promotion;
            }
        }

        return nearestPromotion;
    };

};




/**
 * Contains possible types of SP multiplier campaign
 * @namespace
 */
CIE.SPMultiplierPromotionType = {};

/**
 * Represents SP multiplier campaign based purchase and level up events at the same time; default type
 * @type {string}
 * @constant
 */
CIE.SPMultiplierPromotionType.ALL = "all";

/**
 * Represents SP multiplier campaign based on level up events only
 * @type {string}
 * @constant
 */
CIE.SPMultiplierPromotionType.LEVEL_UP = "level_up";

/**
 * Represents SP multiplier campaign based on purchases only
 * @type {string}
 * @constant
 */
CIE.SPMultiplierPromotionType.PURCHASE = "purchase";
/**
 * Status configuration model.
 * @param statusBracketObj {Object} Parsed json response object.
 * @param modelValidator {CIE.ModelValidator} Validation helper for model.
 * @constructor
 * @throws {CIE.Error} in case of absent on invalid fields or in case of null passed response object.
 */
CIE.StatusBracketModel = function(statusBracketObj, modelValidator)
{
    modelValidator.notNull(statusBracketObj, "statusBracketObj");

    var statusId = modelValidator.notNegativeIntegerField(statusBracketObj, "statusId");
    var statusLabel = modelValidator.existStringField(statusBracketObj, "statusLabel");
    var minPoints = modelValidator.notNegativeNumberField(statusBracketObj, "minPoints");

    /**
     * An integer identifier for the user’s current status level.
     * @returns {Number}
     */
    this.getStatusId = function(){ return statusId; };

    /**
     * Name of status.
     * @returns {string}
     */
    this.getStatusLabel = function(){ return statusLabel; };

    /**
     * Minimal amount of status points need for status.
     */
    this.getMinPoints = function(){ return minPoints; };
};

/**
 * An object that provides the conversion factors between real-money purchases and
 * ONE Reward status points or Caesar's Total Reward credits.
 * @param bonusMultiplierObj {Object} Parsed json object.
 * @param modelValidator {CIE.ModelValidator} Validation helper for model.
 * @constructor
 * @throws {CIE.Error} In case of violated contract for bonusMultiplierObj.
 */
CIE.BonusMultiplierModel = function(bonusMultiplierObj, modelValidator) {

    modelValidator.notNull(bonusMultiplierObj, "bonusMultiplierObj");

    /**
     * @type {Array.<CIE.PricePointModel>}
     * @private
     */
    var _rates = [];

    var _ratesSource = modelValidator.existField(bonusMultiplierObj, "rates");
    for (var i = 0, ratesAmount = _ratesSource.length; i < ratesAmount; i++)
    {
        _rates.push(new CIE.PricePointModel(_ratesSource[i], modelValidator));
    }

    var _bonusMultiplier = modelValidator.notNegativeNumberField(bonusMultiplierObj, "bonusMultiplier");

    /**
     * Additional multiplier for calculating amount of Status Points or Reward Credits.
     * @returns {number}
     */
    this.getBonusMultiplier = function() { return _bonusMultiplier; };

    /**
     * Array of base exchange rates, once per each price range.
     * @returns {Array.<CIE.PricePointModel>}
     */
    this.getRates = function() { return _rates; };

    /**
     * @param price {Number} Price.
     * @returns {CIE.PricePointModel} Base rate for current passed price.
     */
    this.getExchangeRangeForAmount = function(price)
    {
        for (var i = 0, length = _rates.length - 1; i < length; i++)
        {            if (_rates[i].isPriceInBounds(price))
            {
                return _rates[i];
            }
        }
        return _rates[length];
    }

};
/**
 * Represent messages model.
 * @param oneMessageObj {Object} Parsed json object.
 * @constructor
 */
CIE.OneMessageModel = function (oneMessageObj) {

    if (!oneMessageObj)
    {
        oneMessageObj = {};
    }

    var unreadMessageCount = +oneMessageObj["unreadMessagesCount"];
    if (isNaN(unreadMessageCount))
    {
        unreadMessageCount = 0;
    }

    var _isEnabled = !!oneMessageObj["isEnabled"];

    /**
     * Unread message count for the current user and application.
     * @returns {number}
     */
    this.getUnreadMessagesCount = function() { return unreadMessageCount; };

    /**
     * @returns {boolean} true if messages enabled and false otherwise.
     */
    this.isEnabled = function() { return _isEnabled; };
};
/**
 * Error.
 * @param message {string}
 * @constructor
 */
CIE.Error = function(message) {

    /**
     * Error message.
     * @returns {string}
     */
    this.getMessage = function() {
        return message;
    };

    /**
     * String representation of Error.
     * @override
     * @returns {string}
     */
    this.toString = function() {
        return "CIE.Error: " + this.getMessage();
    };
};

CIE.ExchangeRate = function( oneReward )
{
    var _oneReward = oneReward;

    /**
     * @returns {boolean} true in case of exchange rates expires and false otherwise.
     */
    this.isExchangeRateExpired = function()
    {
        return _oneReward.getCurrentTimestampOnServer() >= _oneReward.getOneRewardResponseData().getExchangeRate().getExpiration();
    };

    /**
     * Retrieve amount of earned Status Points for spent real money.
     * @param amountSpent {number} Spent real monet amount.
     * @returns {number} Amount of Status Points for passed amount of real money.
     */
    this.getStatusPointsForAmount = function(amountSpent)
    {
        var statusPointsExchangeRate = _oneReward.getOneRewardResponseData().getExchangeRate().getStatusPoints();

        // Status Points to be rewarded. Need add 1 for receiving multiplier.
        var X = (1.0 + statusPointsExchangeRate.getBonusMultiplier());
        var exchangeRange = statusPointsExchangeRate.getExchangeRangeForAmount(amountSpent);
        if (exchangeRange)
        {
            X = exchangeRange.getBaseRate() * amountSpent * X;
        }

        return Math.round( X );
    };

    /**
     * Retrieve amount of earned Reward Credits for spent real money.
     * @param amountSpent {Number} Spent real monet amount.
     * @returns {Number} Amount of Reward Credits for passed amount of real money.
     */
    this.getRewardCreditsForAmount = function(amountSpent)
    {
        var rewardCreditsExchangeRate = _oneReward.getOneRewardResponseData().getExchangeRate().getRewardCredits();

        //Reward credits to be rewarded. Need add 1 for receiving multiplier.
        var X = (1.0 + rewardCreditsExchangeRate.getBonusMultiplier());
        var exchangeRange = rewardCreditsExchangeRate.getExchangeRangeForAmount(amountSpent);
        if (exchangeRange)
        {
            X = exchangeRange.getBaseRate() * amountSpent * X;
        }

        X = Math.round(X);

        var rcCap = _oneReward.getOneRewardResponseData().getConfig().getRewardCreditsCap();

        if(X > rcCap)
        {
            if(CIE.OneRewardPopup.onDataFromPopupCallback)
            {
                CIE.OneRewardPopup.onDataFromPopupCallback(CIE.OneRewardPopupEvent.RC_CAPPED);
            }
            return rcCap;
        }

        return X;
    }
};
/**
 * Represent event related to total rewards.
 * @params {string} Type of Total Rewards event.
 * @params {*} Data passed with Total Reward event.
 * @constructor
 * @extends {CIE.Event}
 */
CIE.TotalRewardsEvent = function(type, data)
{
    CIE.Event.call(this, type, data);
};

/**
 * Trigger in case of Total Reward data received.
 * @type {string}
 * @constant
 */
CIE.TotalRewardsEvent.RECEIVED = "TotalRewardsEvent.RECEIVED";

/**
 * Triggered in case of occurred error during Total Rewards data loadings.
 * @type {string}
 * @constant
 */
CIE.TotalRewardsEvent.ERROR = "TotalRewardsEvent.ERROR";
/**
 * Represent event related to Total Rewards Social.
 * @param type {string} Type of OneReward Event.
 * @param data {*} Data passed with One Reward event.
 * @constructor
 * @extends {CIE.Event}
 */
CIE.OneRewardEvent = function(type, data)
{
    CIE.Event.call(this, type, data);
};

/**
 * Trigger in case of One Reward data received.
 * @type {string}
 * @constant
 */
CIE.OneRewardEvent.RECEIVED = "OneRewardEvent.RECEIVED";

/**
 * Trigger in case of occurred error during One Reward data loading.
 * @type {string}
 * @constant
 */
CIE.OneRewardEvent.ERROR = "OneRewardEvent.ERROR";

/**
 * Trigger in case of user status changed.
 * @type {string}
 * @constant
 */
CIE.OneRewardEvent.STATUS_CHANGE = "OneRewardEvent.STATUS_CHANGE";
/**
 * Represent event related to One Reward popup.
 * @param type {string} One Reward Popup event type.
 * @param data {*} Data passed with event.
 * @constructor
 * @extends {CIE.Event}
 */
CIE.OneRewardPopupEvent = function(type, data)
{
    CIE.Event.call(this, type, data);
};

/**
 * Trigger in case of received data.
 * @type {string}
 * @constant
 */
CIE.OneRewardPopupEvent.DATA_RECEIVED = "OneRewardPopupEvent.DATA_RECEIVED";

/**
 * Trigger in case need to update One Reward data.
 * @type {string}
 * @constant
 */
CIE.OneRewardPopupEvent.UPDATE_WIDGET_DATA = "OneRewardPopupEvent.updateWidgetData";

/**
 * Trigger when popup is opened completely.
 * @type {string}
 * @constant
 */
CIE.OneRewardPopupEvent.COMPLETE = "OneRewardPopupEvent.complete";

/**
 * Trigger when need to close One Reward Widget.
 * Typicaly when user click on close button.
 * @type {string}
 * @constant
 */
CIE.OneRewardPopupEvent.CLOSE = "OneRewardPopupEvent.close";

CIE.OneRewardPopupEvent.RC_CAPPED = "OneRewardPopupEvent.rcCapped";
CIE.OneRewardPopupEvent.TR_LINKED = "OneRewardPopupEvent.trLinked";
/**
 * Event.
 * @param type {string} Type of event.
 * @param data {*} Data passed with event.
 * @optional
 * @constructor
 */
CIE.Event = function(type, data)
{
    var _type = type;
    var _data = data;
    var _errorCode;

    /**
     * Allow to add error code for event.
     * @param errorCode {Number} Error code to event. {@link CIE.ErrorCodes}
     * @returns {CIE.Event}
     */
    this.addError = function(errorCode)
    {
        _errorCode = errorCode;
        return this;
    };

    /**
     * @returns {string} Type of event.
     */
    this.getType = function() { return _type; };

    /**
     * @returns {*} Passed with event data.
     */
    this.getData = function() { return _data; };

    /**
     * @returns {Number} Error code attached to event.
     */
    this.getErrorCode = function() { return _errorCode; };

    /**
     * @returns {string} Description of error based on attached to event errorCode.
     */
    this.getErrorDescription = function()
    {
        return "ERROR " + _errorCode + ": " + CIE.ErrorCodes.getDescription(_errorCode);
    };
};
/**
 * @callback CIE.EventListener
 * @param {CIE.Event}
 */

/**
 * @class
 * Handle emitting of events and containing of event listeners.
 */
CIE.EventDispatcher = function ()
{
    var _events = null;

    /**
     * Add event listener.
     * @param type {string} Type of event.
     * @param callback {CIE.EventListener} Method to call when event will be triggered.
     */
    this.addListener = function (type, callback)
    {
        if (_events == null)
        {
            _events = [];
        }

        for (var i = 0, length = _events.length; i < length; i++)
        {
            var pair = _events[i];
            if (pair.first == type && pair.second == callback)
            {
                return;
            }
        }

        _events.push(new CIE.Pair(type, callback));
    };

    /**
     * Remove event listener.
     * @param type {string} Type of event.
     * @param callback {CIE.EventListener} Method to call when event will be triggered.
     */
    this.removeListener = function (type, callback)
    {
        if (_events != null)
        {
            for (var i = 0; i < _events.length; i++)
            {
                var pair = _events[i];
                if (pair.first == type && pair.second == callback)
                {
                    _events.splice(i, 1);
                    i--;
                }
            }
        }
    };

    /**
     * Dispatch event.
     * @param event {CIE.Event} Event to dispatch.
     */
    this.dispatchEventToListeners = function (event)
    {
        if (!_events)
        {
            return;
        }

        var eventType = event.getType();

        for (var i = 0; i < _events.length; i++)
        {
            var pair = _events[i];
            if (pair.first == eventType)
            {
                pair.second(event);
            }
        }
    };
};
