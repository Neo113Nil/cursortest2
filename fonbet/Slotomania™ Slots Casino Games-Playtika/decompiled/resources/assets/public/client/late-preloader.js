
!function(){try{var e="undefined"!=typeof window?window:"undefined"!=typeof global?global:"undefined"!=typeof self?self:{},n=(new Error).stack;n&&(e._sentryDebugIds=e._sentryDebugIds||{},e._sentryDebugIds[n]="31081322-cbeb-5f9a-8683-e97c93fc1358")}catch(e){}}();
(function () {
    'use strict';

    class PlatformEnv {
      constructor() {
        this.language = "en";
        this.marketVersion = "";
        this.market = "";
        this.marketId = 0;
        this.languagesConfig = "";
        this.platform = "";
        this.marketUrl = "";
        this.clientVersion = "";
        this.release = false;
        this.resolution = 640;
        this.productId = "";
        this.branchHash = "";
        this.versionFromTpl = "";
        this.linkCdnProd = "";
        this.linkProd = "";
        this.linkCdnPreprod = "";
        this.linkConfigProd = "";
        this.linkConfigPreprod = "";
        this.appName = "";
        this.appNameShort = "";
        this.linkSentry = "";
        this.stageConfigUrlTemplate = "";
        this.appNameNoSpaces = "";
        if (!window.app_vars || !window.app_vars.earlyPreloaderEnv) {
          return;
        }
        const storageValue = JSON.parse(window.app_vars.earlyPreloaderEnv);
        this.language = storageValue.language;
        this.marketVersion = storageValue.marketVersion;
        this.market = storageValue.market;
        this.marketId = storageValue.marketId;
        this.languagesConfig = storageValue.languagesConfig;
        this.platform = storageValue.platform;
        this.marketUrl = storageValue.marketUrl;
        this.clientVersion = storageValue.clientVersion;
        this.release = storageValue.release;
        this.resolution = storageValue.resolution;
        this.branchHash = storageValue.branchHash;
        this.versionFromTpl = storageValue.versionFromTpl;
        this.linkCdnProd = storageValue.linkCdnProd;
        this.linkProd = storageValue.linkProd;
        this.linkCdnPreprod = storageValue.linkCdnPreprod;
        this.linkConfigProd = storageValue.linkConfigProd;
        this.linkConfigPreprod = storageValue.linkConfigPreprod;
        this.appName = storageValue.appName;
        this.appNameShort = storageValue.appNameShort;
        this.stageConfigUrlTemplate = storageValue.stageConfigUrlTemplate;
        this.appNameNoSpaces = storageValue.appNameNoSpaces;
      }
      static getInstance() {
        if (!PlatformEnv.instance) {
          PlatformEnv.instance = new PlatformEnv();
        }
        return PlatformEnv.instance;
      }
    }

    function createNativeLogger() {
      var _a;
      if (PlatformEnv.getInstance().platform !== "windows" && ((_a = window.__native) == null ? void 0 : _a.logger)) {
        return window.__native.logger;
      }
      const legacyLog = window.log;
      const logFn = typeof legacyLog === "function" ? legacyLog : () => {
      };
      return {
        info: logFn,
        debug: logFn,
        warn: logFn,
        error: logFn
      };
    }
    const nativeLogger = createNativeLogger();

    const EVENT_STREAM_DATA = "esdata";
    const LANGUAGE_IS_SELECTED = "LANGUAGE_IS_SELECTED";
    const LANGUAGE_SELECTOR_POPUP_IMPRESSION_SUCCESS = "LANGUAGE_SELECTOR_POPUP_IMPRESSION_SUCCESS";
    const LANGUAGE_SELECTOR_FLOW_FAILURE = "LANGUAGE_SELECTOR_FLOW_FAILURE";
    const LANGUAGE_SELECTOR_LANGUAGE_SELECTED = "LANGUAGE_SELECTOR_LANGUAGE_SELECTED";
    const DYNAMIC_CLIENT_LOADING_START = "DYNAMIC_CLIENT_LOADING_START";
    const DYNAMIC_CLIENT_LOADING_END = "DYNAMIC_CLIENT_LOADING_END";
    const DYNAMIC_CLIENT_UPDATED = "DYNAMIC_CLIENT_UPDATED";
    const DYNAMIC_CLIENT_ERROR = "DYNAMIC_CLIENT_ERROR";
    class EventStreamClientProxy {
      addEvent(eventName, data) {
        let eventStreamData = window.app_vars[EVENT_STREAM_DATA];
        if (eventStreamData == null) {
          eventStreamData = window.app_vars[EVENT_STREAM_DATA] = {};
        }
        if (eventStreamData.hasOwnProperty(eventName)) {
          eventStreamData[eventName].push(data);
        } else {
          eventStreamData[eventName] = [data];
        }
      }
      trackSelectedLanguage(profileLanguage, supportedLanguages, preferredLanguages, userSelectedLanguage, isLanguageForced) {
        this.addEvent(LANGUAGE_IS_SELECTED, {
          profileLanguage,
          supportedLanguages,
          preferredLanguages,
          currentLanguage: userSelectedLanguage,
          isLanguageForced
        });
      }
      trackLanguageSelectorPopupImpressionSuccess(triggerSource, availableLanguages) {
        this.addEvent(LANGUAGE_SELECTOR_POPUP_IMPRESSION_SUCCESS, {
          source: triggerSource,
          availableLanguages
        });
      }
      trackLanguageSelectorFlowFailure() {
        this.addEvent(LANGUAGE_SELECTOR_FLOW_FAILURE, {});
      }
      trackLanguageSelectorLanguageSelected(triggerSource, currentLang, newLang) {
        this.addEvent(LANGUAGE_SELECTOR_LANGUAGE_SELECTED, {
          source: triggerSource,
          currentLanguage: currentLang,
          newLanguage: newLang
        });
      }
      trackDynamicClientLoadingStart() {
        this.addEvent(DYNAMIC_CLIENT_LOADING_START, {
          start_time_ms: this.getTimeFromAppStart()
        });
      }
      trackDynamicClientLoadingEnd() {
        this.addEvent(DYNAMIC_CLIENT_LOADING_END, {
          start_time_ms: this.getTimeFromAppStart()
        });
      }
      trackDynamicClientInfo(clientVersion, wasUpdate, isUpdatePlanned, plannedUpdateToVersion, severity, userLevel) {
        this.addEvent(DYNAMIC_CLIENT_UPDATED, {
          clientVersion,
          wasUpdate,
          isUpdatePlanned,
          plannedUpdateToVersion,
          severity,
          userLevel,
          start_time_ms: this.getTimeFromAppStart()
        });
      }
      trackDynamicClientError(errorMessage) {
        this.addEvent(DYNAMIC_CLIENT_ERROR, {
          errorMessage,
          start_time_ms: this.getTimeFromAppStart()
        });
      }
      getTimeFromAppStart() {
        return Date.now() - window.app_vars.application_start_timestamp;
      }
    }
    const analyticsProxy = new EventStreamClientProxy();

    const SCREEN_HEIGHT_UNITS = 480;
    const STATIC_COLLECTION_ID = "static";
    const DEFAULT_LANGUAGE = PlatformEnv.getInstance().language;
    var EventType = /* @__PURE__ */ ((EventType2) => {
      EventType2["MOUSE_DOWN"] = "mousedown";
      EventType2["MOUSE_MOVE"] = "mousemove";
      EventType2["MOUSE_UP"] = "mouseup";
      EventType2["MOUSE_OUT"] = "mouseout";
      EventType2["CLICK"] = "click";
      EventType2["ENTER_FRAME"] = "enterframe";
      EventType2["ADDED_TO_CONTAINER"] = "addedToContainer";
      EventType2["REMOVED_FROM_CONTAINER"] = "removedFromContainer";
      EventType2["LANGUAGE_CHANGED"] = "languageChanged";
      EventType2["SPRITE_READY"] = "spriteReady";
      EventType2["SPRITES_COLLECTION_COMPLETED"] = "spritesCollectionComplited";
      EventType2["ERROR"] = "error";
      EventType2["SHOW_OVERLAY"] = "showOverlay";
      EventType2["HIDE_OVERLAY"] = "hideOverlay";
      return EventType2;
    })(EventType || {});
    var ResourceType = /* @__PURE__ */ ((ResourceType2) => {
      ResourceType2[ResourceType2["UNKNOWN"] = 0] = "UNKNOWN";
      ResourceType2[ResourceType2["IMAGE"] = 1] = "IMAGE";
      ResourceType2[ResourceType2["SOUND"] = 2] = "SOUND";
      ResourceType2[ResourceType2["VIDEO"] = 3] = "VIDEO";
      ResourceType2[ResourceType2["TEXT"] = 4] = "TEXT";
      ResourceType2[ResourceType2["FONT"] = 5] = "FONT";
      ResourceType2[ResourceType2["WBIP"] = 6] = "WBIP";
      ResourceType2[ResourceType2["SCRIPT"] = 7] = "SCRIPT";
      ResourceType2[ResourceType2["PVR"] = 8] = "PVR";
      ResourceType2[ResourceType2["ARCHIVE"] = 9] = "ARCHIVE";
      return ResourceType2;
    })(ResourceType || {});
    var ScreenId = /* @__PURE__ */ ((ScreenId2) => {
      ScreenId2["EMPTY"] = "empty";
      ScreenId2["SPLASH_SCREEN"] = "splash";
      ScreenId2["SPLASH_SCREEN_DEFAULT"] = "splashDefault";
      ScreenId2["LOGIN_SCREEN"] = "login";
      ScreenId2["LANGUAGE_SWITCHER"] = "languageSwitcher";
      ScreenId2["LOGIN_ERROR_POPUP"] = "loginError";
      ScreenId2["GENERIC_ERROR_POPUP"] = "genericError";
      ScreenId2["CONNECTION_ERROR_POPUP"] = "connectionError";
      return ScreenId2;
    })(ScreenId || {});
    var LOGIN_TYPES = /* @__PURE__ */ ((LOGIN_TYPES2) => {
      LOGIN_TYPES2[LOGIN_TYPES2["NOT_CHOSEN"] = 0] = "NOT_CHOSEN";
      LOGIN_TYPES2[LOGIN_TYPES2["STANDALONE"] = 1] = "STANDALONE";
      LOGIN_TYPES2[LOGIN_TYPES2["FACEBOOK"] = 2] = "FACEBOOK";
      LOGIN_TYPES2[LOGIN_TYPES2["APPLE_SIGN_IN"] = 13] = "APPLE_SIGN_IN";
      LOGIN_TYPES2[LOGIN_TYPES2["GOOGLE_PLAY_GAMES"] = 14] = "GOOGLE_PLAY_GAMES";
      return LOGIN_TYPES2;
    })(LOGIN_TYPES || {});
    var PLATFORM_TYPES = /* @__PURE__ */ ((PLATFORM_TYPES2) => {
      PLATFORM_TYPES2["WWW"] = "www";
      PLATFORM_TYPES2["HTML_5"] = "html5";
      PLATFORM_TYPES2["WINDOWS_8"] = "windows-8";
      PLATFORM_TYPES2["WINDOWS_10"] = "windows-10";
      PLATFORM_TYPES2["PRAS"] = "PRAS";
      PLATFORM_TYPES2["ANDROID"] = "android";
      PLATFORM_TYPES2["IOS"] = "ios";
      PLATFORM_TYPES2["WINDOWS_10UWP"] = "windows-10-uwp";
      PLATFORM_TYPES2["MACOS"] = "macOS";
      return PLATFORM_TYPES2;
    })(PLATFORM_TYPES || {});
    var MARKET_TYPES = /* @__PURE__ */ ((MARKET_TYPES2) => {
      MARKET_TYPES2["GOOGLE_PLAY"] = "googleplay";
      MARKET_TYPES2["APP_STORE"] = "appstore";
      MARKET_TYPES2["AMAZON"] = "amazon";
      MARKET_TYPES2["PAY_PAL"] = "paypal";
      MARKET_TYPES2["PRAS"] = "pras";
      MARKET_TYPES2["MICROSOFT_STORE"] = "microsoftstore";
      MARKET_TYPES2["FACEBOOK"] = "facebook";
      MARKET_TYPES2["SAMSUNG"] = "samsung";
      return MARKET_TYPES2;
    })(MARKET_TYPES || {});

    const trackingGroups = {
      CLIENT_INSTRUMENTATION_GROUP: "CLIENT_INSTRUMENTATION"
    };
    const trackingSubGroups = {
      CAPTCHA_SUB_GROUP: "captcha",
      LOADING_SUB_GROUP: "SM_LOADING",
      FACEBOOK_SUB_GROUP: "FACEBOOK"
    };
    const EVENT_STREAM_PRELOADER_DATA = "esdata";

    const _PlaytikaClientType = class {
      static setup() {
        window.app_vars.pltk_client_type = _PlaytikaClientType.resolvePlaytikaClientType();
      }
      static tryAddHeader(req) {
        const type = _PlaytikaClientType.resolvePlaytikaClientType();
        if (type) {
          req.setRequestHeader(_PlaytikaClientType.HEADER_KEY, type);
        }
      }
      static resolvePlaytikaClientType() {
        const uitest = window.uitest;
        const platform = PlatformEnv.getInstance().platform;
        if (uitest != null) {
          return _PlaytikaClientType.AUTOTESTS;
        }
        switch (platform) {
          case "android":
            return _PlaytikaClientType.ANDROID;
          case "ios":
            return _PlaytikaClientType.IOS;
          case "windows":
            return _PlaytikaClientType.UWP;
          default:
            nativeLogger.warn(`Unable to define Playtika client type. OS: ${platform}, uitest: ${Boolean(uitest)}`);
            return "";
        }
      }
    };
    let PlaytikaClientType = _PlaytikaClientType;
    PlaytikaClientType.HEADER_KEY = "X-PLTK-Client-Type";
    PlaytikaClientType.ANDROID = "Android";
    PlaytikaClientType.IOS = "IOS";
    PlaytikaClientType.UWP = "UWP";
    PlaytikaClientType.AUTOTESTS = "autotests";

    function getNoCacheId$1() {
      const d = new Date();
      d.setMinutes(0, 0, 0);
      return d.getTime();
    }
    function getAppVars() {
      return window.app_vars;
    }
    function getFlashVars() {
      return window.flash_vars;
    }
    function compareVersions(a, b) {
      const left = a.split(".");
      const right = b.split(".");
      const maxParts = Math.max(left.length, right.length);
      for (let i = 0; i < maxParts; i++) {
        const l = parseInt(left[i]) || 0;
        const r = parseInt(right[i]) || 0;
        const diff = l - r;
        if (diff !== 0)
          return Math.sign(diff);
      }
      return 0;
    }
    const LATE_CONFIG_LOADING_TIMEOUT = 1e4;
    class JsonLoader {
      loadAsync(url) {
        return new Promise((resolve, reject) => {
          try {
            this.load(url, (response, req) => {
              if (req.status >= 200 && req.status < 300) {
                resolve(response);
              } else {
                const xGrn = req.getResponseHeader("x-grn");
                reject(new Error(`Unable to load json. Network error: ${req.errorCode}, X-Grn: ${xGrn}, Status: ${req.status}, Url: ${url}`));
              }
            }, (error, urlLocal, req) => {
              const xGrn = req.getResponseHeader("x-grn");
              reject(new Error(`Unable to load json. Network error: ${req.errorCode}, X-Grn: ${xGrn}, Status: ${req.status}, Url: ${urlLocal}`));
            });
          } catch (e) {
            const er = e;
            reject(new Error(`Unable to load json. ${er.stack}`));
          }
        });
      }
      load(url, callback, onError) {
        const req = new XMLHttpRequest();
        req.onload = () => callback(req.response, req);
        req.onerror = (error) => onError(error, url, req);
        req.open("GET", url);
        req.timeout = LATE_CONFIG_LOADING_TIMEOUT;
        req.ontimeout = () => {
          onError(new Error("Request aborted by timeout."), url, req);
        };
        PlaytikaClientType.tryAddHeader(req);
        req.send();
      }
    }

    function usePreloader(action) {
      if (window.__nativePreloader) {
        action(window.__nativePreloader);
      } else {
        nativeLogger.warn("WARN: Preloader instance is already destroyed, unable to execute action");
      }
    }
    function addScript(src) {
      return new Promise((resolve, reject) => {
        const script = document.createElement("script");
        script.setAttribute("type", "text/javascript");
        script.setAttribute("src", src);
        script.onload = () => resolve();
        script.onerror = () => {
          const message = `Failed to load script ${src}`;
          nativeLogger.error(`ERROR: ${message}`);
          reject(new Error(message));
        };
        document.body.appendChild(script);
      });
    }
    function getPixelRatio() {
      return window.devicePixelRatio || 1;
    }
    function isNil$1(value) {
      return value == null;
    }
    function isNilOrEmpty(value) {
      return isNil$1(value) || isEmpty$1(value);
    }
    function isEmpty$1(val) {
      if (val === void 0)
        return true;
      if (typeof val === "function" || typeof val === "number" || typeof val === "boolean" || Object.prototype.toString.call(val) === "[object Date]")
        return false;
      if (val == null || val.length === 0)
        return true;
      if (typeof val === "object") {
        let r = true;
        for (const f in val)
          r = false;
        return r;
      }
      return false;
    }
    function isNewerVersion(oldVer, newVer) {
      const oldParts = oldVer.split(".");
      const newParts = newVer.split(".");
      for (let i = 0; i < newParts.length; i++) {
        const a = ~~newParts[i];
        const b = ~~oldParts[i];
        if (a > b)
          return true;
        if (a < b)
          return false;
      }
      return false;
    }
    function serializeHaxeString(str) {
      str = encodeURIComponent(str);
      return `y${str.length}:${str}`;
    }
    function deserializeHaxeString(str) {
      const m = str.match(/[y](\d+)[:](\S+)/);
      return m !== null ? decodeURIComponent(m[2].split("+").join(" ")) : "";
    }
    function isEnabledByPercentage(percentageValue) {
      const guid = getGuid$2();
      const hexString = "0x" + guid.substring(guid.length - 2);
      const intValue = parseInt(hexString, 16);
      return percentageValue > 0 && Math.round(intValue * 100 / 255) <= percentageValue;
    }
    function getNoCacheId() {
      const d = new Date();
      d.setMinutes(0, 0, 0);
      return d.getTime();
    }
    function getIosDeviceType() {
      const isIosTablet = /(ipad)/i.test(navigator.userAgent);
      const isIpad = Boolean(navigator.maxTouchPoints) && (/MacIntel/.test(navigator.platform) && navigator.maxTouchPoints > 1 || /"Mac OS X"/.test(navigator.platform) && navigator.maxTouchPoints > 2);
      return isIosTablet || isIpad ? "IPAD" : "IPHONE";
    }
    function parseURLSearchParams(url) {
      const searchParams = url.includes("?") ? url.split("?")[1] : url;
      const paramsMap = /* @__PURE__ */ new Map();
      if (searchParams) {
        for (const param of searchParams.split("&")) {
          const [encodedKey, encodedValue] = param.split("=");
          const decodedKey = decodeURIComponent(encodedKey);
          const decodedValue = decodeURIComponent(encodedValue || "");
          paramsMap.set(decodedKey, decodedValue);
        }
      }
      return paramsMap;
    }
    function generateUUID() {
      let d = new Date().getTime();
      let d2 = window.performance && window.performance.now && window.performance.now() * 1e3 || 0;
      return "xxxxxxxx-xxxx-4xxx-yxxx-xxxxxxxxxxxx".replace(/[xy]/g, (c) => {
        let r = Math.random() * 16;
        if (d > 0) {
          r = (d + r) % 16 | 0;
          d = Math.floor(d / 16);
        } else {
          r = (d2 + r) % 16 | 0;
          d2 = Math.floor(d2 / 16);
        }
        return (c === "x" ? r : r & 3 | 0).toString(16);
      });
    }
    function getGuid$2() {
      let guid = window.localStorage.getItem("guid");
      if (!isNil$1(guid)) {
        return guid;
      }
      const guidHaxe = window.localStorage.getItem("smh_nullSettings:Guid");
      if (guidHaxe) {
        guid = deserializeHaxeString(guidHaxe);
        if (!isNil$1(guid)) {
          return guid;
        }
      }
      guid = generateUUID();
      return guid;
    }

    const GUID_ES_SETTINGS_KEY = "guid_ES";
    class Tracking {
      static getInstance() {
        if (!Tracking._instance) {
          Tracking._instance = new Tracking();
        }
        return Tracking._instance;
      }
      constructor() {
        this.eventStreamServerPath = void 0;
        this.funnelId = this.guidGenerator();
        this.initClientRuntimeGuid();
      }
      initClientRuntimeGuid() {
        let currClientRuntimeGuid = window.localStorage.getItem("client_runtime_guid");
        if (!currClientRuntimeGuid) {
          currClientRuntimeGuid = this.guidGenerator();
          window.localStorage.setItem("client_runtime_guid", currClientRuntimeGuid);
        }
        getAppVars().client_runtime_guid = currClientRuntimeGuid;
      }
      directSend(trackingData) {
        if (!this.eventStreamServerPath) {
          nativeLogger.error(`[EventStream] ERROR: Sending failed! eventStreamServerPath is Empty!`);
          return;
        }
        if (!trackingData.hasOwnProperty("time_elapsed_ms")) {
          trackingData.time_elapsed_ms = !!window.performance && !!window.performance.timing ? window.performance.timing.domContentLoadedEventEnd - window.performance.timing.navigationStart : 0;
        }
        trackingData.client_timestamp = Date.now();
        trackingData.user_guid = this.getGuid();
        trackingData.facility = "sm_client";
        trackingData.client_type = getAppVars().client_type_id;
        this.sendRequest(this.eventStreamServerPath, "[" + JSON.stringify(trackingData) + "]");
      }
      sendRequest(url, data) {
        const request = new XMLHttpRequest();
        request.open("POST", url);
        request.setRequestHeader("Content-Type", "application/json");
        request.send(data);
      }
      getDefaultEventStreamDataObject(eventGroup, eventSubGroup, eventType) {
        return {
          event_group: eventGroup,
          event_sub_group: eventSubGroup,
          event_type: eventType,
          event_name: eventType,
          language: getAppVars().language,
          click_url: document.location.href,
          os_version: navigator.platform,
          user_agent: navigator.userAgent,
          client_runtime_guid: getAppVars().client_runtime_guid,
          app_version: getAppVars().client.version
        };
      }
      withTimeStampFromAppStart(dataObject) {
        if (dataObject.hasOwnProperty("start_time_ms"))
          return this;
        dataObject.start_time_ms = this.getElapsedTimeMs();
        return this;
      }
      withFunnelId(dataObject) {
        dataObject.funnel_id = this.funnelId;
        return this;
      }
      getElapsedTimeMs() {
        return Date.now() - getAppVars().application_start_timestamp;
      }
      guidGenerator() {
        const S4 = function() {
          return ((1 + Math.random()) * 65536 | 0).toString(16).substring(1);
        };
        return S4() + S4() + "-" + S4() + "-" + S4() + "-" + S4() + "-" + S4() + S4() + S4();
      }
      initialize(url) {
        this.eventStreamServerPath = url;
      }
      getGuid() {
        let guid = window.getSettingsInstance().getItem(GUID_ES_SETTINGS_KEY);
        if (!guid) {
          guid = generateUUID();
          window.getSettingsInstance().setItem(GUID_ES_SETTINGS_KEY, guid);
        }
        return guid;
      }
    }

    class EventStreamEvents {
      constructor() {
        this.trackingEvents = {
          CAPTCHA_SHOWN: "captcha_shown",
          CAPTCHA_PASSED: "captcha_passed",
          CAPTCHA_ERROR: "captcha_error",
          APPLICATION_OPENED: "application_opened",
          CONFIGURATION_LOADED: "configuration_loaded",
          FACEBOOK_LOGIN_START: "FACEBOOK_LOGIN_START",
          FACEBOOK_LOGIN_SUCCESS: "FACEBOOK_LOGIN_SUCCESS",
          FACEBOOK_LOGIN_ERROR: "FACEBOOK_LOGIN_ERROR",
          FACEBOOK_LOGIN_EXCEPTION: "FACEBOOK_LOGIN_EXCEPTION",
          FACEBOOK_ACCESS_TOKEN_TRACKING: "FACEBOOK_ACCESS_TOKEN_TRACKING",
          FACEBOOK_ACCESS_TOKEN_EXCHANGE: "FACEBOOK_ACCESS_TOKEN_EXCHANGE",
          FACEBOOK_ACCESS_TOKEN_EXCHANGE_SUCCESS: "FACEBOOK_ACCESS_TOKEN_EXCHANGE_SUCCESS",
          FACEBOOK_ACCESS_TOKEN_EXCHANGE_ERROR: "FACEBOOK_ACCESS_TOKEN_EXCHANGE_ERROR",
          FACEBOOK_ACCESS_TOKEN_UPDATE_ERROR: "FACEBOOK_ACCESS_TOKEN_UPDATE_ERROR",
          FACEBOOK_LOGIN_STATUS_TRACKING: "FACEBOOK_LOGIN_STATUS_TRACKING",
          FACEBOOK_LOGIN_USER_CANCELLED_DIALOG: "FACEBOOK_LOGIN_USER_CANCELLED_DIALOG",
          FALLBACK_TO_STANDALONE: "FALLBACK_TO_STANDALONE",
          LOGIN_SCREEN_DISPLAYED: "LOGIN_SCREEN_DISPLAYED",
          LOGIN_SCREEN_NOT_SKIPPED: "LOGIN_SCREEN_NOT_SKIPPED",
          LOGIN_SCREEN_SKIPPED: "LOGIN_SCREEN_SKIPPED",
          INITIAL_USER_LOGIN_MODE_SELECTION: "initial_user_login_mode_selection",
          DYNAMIC_CLIENT_LOADING_START: "DYNAMIC_CLIENT_LOADING_START",
          DYNAMIC_CLIENT_LOADING_END: "DYNAMIC_CLIENT_LOADING_END",
          DYNAMIC_CLIENT_UPDATED: "DYNAMIC_CLIENT_UPDATED",
          DYNAMIC_CLIENT_ERROR: "DYNAMIC_CLIENT_ERROR",
          FILE_STORAGE_INIT: "FILE_STORAGE_INIT",
          SUCCEED_LAUNCH_FROM_APPSFLYER: "SUCCEED_LAUNCH_FROM_APPSFLYER",
          FAILED_LAUNCH_FROM_APPSFLYER: "FAILED_LAUNCH_FROM_APPSFLYER"
        };
        this.dynamicLoadingTrackingEvents = [
          this.trackingEvents.DYNAMIC_CLIENT_LOADING_START,
          this.trackingEvents.DYNAMIC_CLIENT_LOADING_END,
          this.trackingEvents.DYNAMIC_CLIENT_UPDATED,
          this.trackingEvents.DYNAMIC_CLIENT_ERROR
        ];
      }
      static getInstance() {
        if (!EventStreamEvents._instance) {
          EventStreamEvents._instance = new EventStreamEvents();
        }
        return EventStreamEvents._instance;
      }
      trackLocalStorageInit(storageData) {
        const eventData = Tracking.getInstance().getDefaultEventStreamDataObject(trackingGroups.CLIENT_INSTRUMENTATION_GROUP, trackingSubGroups.LOADING_SUB_GROUP, this.trackingEvents.FILE_STORAGE_INIT);
        eventData.storageData = storageData;
        Tracking.getInstance().withFunnelId(eventData).directSend(eventData);
      }
      trackInitialAppEvents() {
        this.trackApplicationOpened();
        this.trackDynamicClientLoadingEventsFromPreloader();
        this.trackConfigurationLoaded();
      }
      trackApplicationOpened() {
        const eventData = Tracking.getInstance().getDefaultEventStreamDataObject(trackingGroups.CLIENT_INSTRUMENTATION_GROUP, trackingSubGroups.LOADING_SUB_GROUP, this.trackingEvents.APPLICATION_OPENED);
        eventData.start_time_ms = 0;
        Tracking.getInstance().withFunnelId(eventData).directSend(eventData);
      }
      trackDynamicClientLoadingEventsFromPreloader() {
        const preloaderEvents = window.app_vars[EVENT_STREAM_PRELOADER_DATA];
        if (!preloaderEvents) {
          return;
        }
        const dynamicLoaderEvents = Object.keys(preloaderEvents).filter((key) => this.dynamicLoadingTrackingEvents.includes(key)).reduce((newEventsObject, key) => {
          newEventsObject[key] = preloaderEvents[key];
          delete preloaderEvents[key];
          return newEventsObject;
        }, {});
        for (const event in dynamicLoaderEvents) {
          const eventData = Tracking.getInstance().getDefaultEventStreamDataObject(trackingGroups.CLIENT_INSTRUMENTATION_GROUP, trackingSubGroups.LOADING_SUB_GROUP, event);
          const eventParamsArr = dynamicLoaderEvents[event];
          for (const eventParamObject of eventParamsArr) {
            for (const [paramName, paramValue] of Object.entries(eventParamObject)) {
              eventData[paramName] = paramValue;
            }
          }
          Tracking.getInstance().withFunnelId(eventData).withTimeStampFromAppStart(eventData).directSend(eventData);
        }
      }
      trackConfigurationLoaded() {
        const eventData = Tracking.getInstance().getDefaultEventStreamDataObject(trackingGroups.CLIENT_INSTRUMENTATION_GROUP, trackingSubGroups.LOADING_SUB_GROUP, this.trackingEvents.CONFIGURATION_LOADED);
        Tracking.getInstance().withFunnelId(eventData).withTimeStampFromAppStart(eventData).directSend(eventData);
      }
      trackFacebookLoginStart(loginMode) {
        const eventData = Tracking.getInstance().getDefaultEventStreamDataObject(trackingGroups.CLIENT_INSTRUMENTATION_GROUP, trackingSubGroups.FACEBOOK_SUB_GROUP, this.trackingEvents.FACEBOOK_LOGIN_START);
        eventData.login_mode = loginMode;
        Tracking.getInstance().withFunnelId(eventData).withTimeStampFromAppStart(eventData).directSend(eventData);
      }
      trackFacebookLoginSuccess(loginMode, hashKey) {
        const eventData = Tracking.getInstance().getDefaultEventStreamDataObject(trackingGroups.CLIENT_INSTRUMENTATION_GROUP, trackingSubGroups.FACEBOOK_SUB_GROUP, this.trackingEvents.FACEBOOK_LOGIN_SUCCESS);
        eventData.login_mode = loginMode;
        eventData.hash_key = hashKey;
        Tracking.getInstance().withFunnelId(eventData).withTimeStampFromAppStart(eventData).directSend(eventData);
      }
      trackFacebookLoginError(loginMode, error) {
        const eventData = Tracking.getInstance().getDefaultEventStreamDataObject(trackingGroups.CLIENT_INSTRUMENTATION_GROUP, trackingSubGroups.FACEBOOK_SUB_GROUP, this.trackingEvents.FACEBOOK_LOGIN_ERROR);
        eventData.login_mode = loginMode;
        eventData.error = typeof error === "string" ? error : JSON.stringify(error);
        Tracking.getInstance().withFunnelId(eventData).withTimeStampFromAppStart(eventData).directSend(eventData);
      }
      trackFacebookLoginException(loginMode, error) {
        const eventData = Tracking.getInstance().getDefaultEventStreamDataObject(trackingGroups.CLIENT_INSTRUMENTATION_GROUP, trackingSubGroups.FACEBOOK_SUB_GROUP, this.trackingEvents.FACEBOOK_LOGIN_EXCEPTION);
        eventData.login_mode = loginMode;
        eventData.error = typeof error === "string" ? error : JSON.stringify(error);
        Tracking.getInstance().withFunnelId(eventData).withTimeStampFromAppStart(eventData).directSend(eventData);
      }
      trackFacebookAccessToken(expiresIn, tokenSource, hashKey) {
        const eventData = Tracking.getInstance().getDefaultEventStreamDataObject(trackingGroups.CLIENT_INSTRUMENTATION_GROUP, trackingSubGroups.FACEBOOK_SUB_GROUP, this.trackingEvents.FACEBOOK_ACCESS_TOKEN_TRACKING);
        eventData.expires_in = expiresIn;
        eventData.token_source = tokenSource;
        eventData.hash_key = hashKey;
        Tracking.getInstance().withFunnelId(eventData).withTimeStampFromAppStart(eventData).directSend(eventData);
      }
      trackFacebookAccessTokenExchange(expiresIn, hashKey) {
        const eventData = Tracking.getInstance().getDefaultEventStreamDataObject(trackingGroups.CLIENT_INSTRUMENTATION_GROUP, trackingSubGroups.FACEBOOK_SUB_GROUP, this.trackingEvents.FACEBOOK_ACCESS_TOKEN_EXCHANGE);
        eventData.expires_in = expiresIn;
        eventData.hash_key = hashKey;
        Tracking.getInstance().withFunnelId(eventData).withTimeStampFromAppStart(eventData).directSend(eventData);
      }
      trackFacebookAccessTokenExchangeSuccess(expiresIn, hashKey) {
        const eventData = Tracking.getInstance().getDefaultEventStreamDataObject(trackingGroups.CLIENT_INSTRUMENTATION_GROUP, trackingSubGroups.FACEBOOK_SUB_GROUP, this.trackingEvents.FACEBOOK_ACCESS_TOKEN_EXCHANGE_SUCCESS);
        eventData.expires_in = expiresIn;
        eventData.hash_key = hashKey;
        Tracking.getInstance().withFunnelId(eventData).withTimeStampFromAppStart(eventData).directSend(eventData);
      }
      trackFacebookAccessTokenExchangeError(error, hashKey) {
        const eventData = Tracking.getInstance().getDefaultEventStreamDataObject(trackingGroups.CLIENT_INSTRUMENTATION_GROUP, trackingSubGroups.FACEBOOK_SUB_GROUP, this.trackingEvents.FACEBOOK_ACCESS_TOKEN_EXCHANGE_ERROR);
        eventData.error = error;
        eventData.hash_key = hashKey;
        Tracking.getInstance().withFunnelId(eventData).withTimeStampFromAppStart(eventData).directSend(eventData);
      }
      trackFacebookAccessTokenUpdateError(error, hashKey) {
        const eventData = Tracking.getInstance().getDefaultEventStreamDataObject(trackingGroups.CLIENT_INSTRUMENTATION_GROUP, trackingSubGroups.FACEBOOK_SUB_GROUP, this.trackingEvents.FACEBOOK_ACCESS_TOKEN_UPDATE_ERROR);
        eventData.error = error;
        eventData.hash_key = hashKey;
        Tracking.getInstance().withFunnelId(eventData).withTimeStampFromAppStart(eventData).directSend(eventData);
      }
      trackFacebookLoginStatus(loginStatus, loginMode, expiresIn, hashKey) {
        const eventData = Tracking.getInstance().getDefaultEventStreamDataObject(trackingGroups.CLIENT_INSTRUMENTATION_GROUP, trackingSubGroups.FACEBOOK_SUB_GROUP, this.trackingEvents.FACEBOOK_LOGIN_STATUS_TRACKING);
        eventData.login_status = loginStatus;
        eventData.login_mode = loginMode;
        eventData.expires_in = expiresIn;
        eventData.hash_key = hashKey;
        Tracking.getInstance().withFunnelId(eventData).withTimeStampFromAppStart(eventData).directSend(eventData);
      }
      trackFacebookLoginUserCancelledDialog() {
        const eventData = Tracking.getInstance().getDefaultEventStreamDataObject(trackingGroups.CLIENT_INSTRUMENTATION_GROUP, trackingSubGroups.FACEBOOK_SUB_GROUP, this.trackingEvents.FACEBOOK_LOGIN_USER_CANCELLED_DIALOG);
        Tracking.getInstance().withFunnelId(eventData).withTimeStampFromAppStart(eventData).directSend(eventData);
      }
      trackFallbackToStandalone(error) {
        const eventData = Tracking.getInstance().getDefaultEventStreamDataObject(trackingGroups.CLIENT_INSTRUMENTATION_GROUP, trackingSubGroups.FACEBOOK_SUB_GROUP, this.trackingEvents.FALLBACK_TO_STANDALONE);
        eventData.error = typeof error === "string" ? error : JSON.stringify(error);
        Tracking.getInstance().withFunnelId(eventData).withTimeStampFromAppStart(eventData).directSend(eventData);
      }
      trackLoginScreenDisplayed() {
        const eventData = Tracking.getInstance().getDefaultEventStreamDataObject(trackingGroups.CLIENT_INSTRUMENTATION_GROUP, trackingSubGroups.LOADING_SUB_GROUP, this.trackingEvents.LOGIN_SCREEN_DISPLAYED);
        Tracking.getInstance().withFunnelId(eventData).withTimeStampFromAppStart(eventData).directSend(eventData);
      }
      trackLoginScreenSkipped() {
        const eventData = Tracking.getInstance().getDefaultEventStreamDataObject(trackingGroups.CLIENT_INSTRUMENTATION_GROUP, trackingSubGroups.LOADING_SUB_GROUP, this.trackingEvents.LOGIN_SCREEN_SKIPPED);
        Tracking.getInstance().withFunnelId(eventData).withTimeStampFromAppStart(eventData).directSend(eventData);
      }
      trackLoginModeSelected(chosenLoginMode) {
        const eventData = Tracking.getInstance().getDefaultEventStreamDataObject(trackingGroups.CLIENT_INSTRUMENTATION_GROUP, trackingSubGroups.LOADING_SUB_GROUP, this.trackingEvents.INITIAL_USER_LOGIN_MODE_SELECTION);
        eventData.login_mode = chosenLoginMode;
        Tracking.getInstance().withFunnelId(eventData).withTimeStampFromAppStart(eventData).directSend(eventData);
      }
      trackLaunchFromAF(pluginResponse, deeplinkToLaunch) {
        const eventData = Tracking.getInstance().getDefaultEventStreamDataObject(trackingGroups.CLIENT_INSTRUMENTATION_GROUP, trackingSubGroups.LOADING_SUB_GROUP, this.trackingEvents.SUCCEED_LAUNCH_FROM_APPSFLYER);
        eventData.plugin_response = pluginResponse;
        eventData.deeplink_to_launch = deeplinkToLaunch;
        Tracking.getInstance().withFunnelId(eventData).withTimeStampFromAppStart(eventData).directSend(eventData);
      }
      trackFailedLaunchFromAF(pluginResponse) {
        const eventData = Tracking.getInstance().getDefaultEventStreamDataObject(trackingGroups.CLIENT_INSTRUMENTATION_GROUP, trackingSubGroups.LOADING_SUB_GROUP, this.trackingEvents.FAILED_LAUNCH_FROM_APPSFLYER);
        eventData.plugin_response = pluginResponse;
        Tracking.getInstance().withFunnelId(eventData).withTimeStampFromAppStart(eventData).directSend(eventData);
      }
      trackCaptchaShown() {
        nativeLogger.info(`[EventStream] trackCaptchaShown`);
        const eventData = Tracking.getInstance().getDefaultEventStreamDataObject(trackingGroups.CLIENT_INSTRUMENTATION_GROUP, trackingSubGroups.CAPTCHA_SUB_GROUP, this.trackingEvents.CAPTCHA_SHOWN);
        eventData.time_elapsed_ms = Tracking.getInstance().getElapsedTimeMs();
        Tracking.getInstance().withFunnelId(eventData).directSend(eventData);
      }
      trackCaptchaPassed() {
        nativeLogger.info(`[EventStream] trackCaptchaPassed`);
        const eventData = Tracking.getInstance().getDefaultEventStreamDataObject(trackingGroups.CLIENT_INSTRUMENTATION_GROUP, trackingSubGroups.CAPTCHA_SUB_GROUP, this.trackingEvents.CAPTCHA_PASSED);
        eventData.time_elapsed_ms = Tracking.getInstance().getElapsedTimeMs();
        Tracking.getInstance().withFunnelId(eventData).withTimeStampFromAppStart(eventData).directSend(eventData);
      }
      postponeEvent(id, payload) {
        window.app_vars[EVENT_STREAM_PRELOADER_DATA] = window.app_vars[EVENT_STREAM_PRELOADER_DATA] || {};
        window.app_vars[EVENT_STREAM_PRELOADER_DATA][id] = [payload || {}];
      }
    }

    var __async$s = (__this, __arguments, generator) => {
      return new Promise((resolve, reject) => {
        var fulfilled = (value) => {
          try {
            step(generator.next(value));
          } catch (e) {
            reject(e);
          }
        };
        var rejected = (value) => {
          try {
            step(generator.throw(value));
          } catch (e) {
            reject(e);
          }
        };
        var step = (x) => x.done ? resolve(x.value) : Promise.resolve(x.value).then(fulfilled, rejected);
        step((generator = generator.apply(__this, __arguments)).next());
      });
    };
    var _a$1, _b$1;
    const _AppsFlyerServiceCommon = class {
      constructor() {
        this.appsFlyerId = "test";
        this.devKey = "";
        this.isGalaxyCloudEnv = false;
        this.app = (_b$1 = (_a$1 = window.Capacitor) == null ? void 0 : _a$1.Plugins) == null ? void 0 : _b$1.App;
      }
      initService() {
        return __async$s(this, null, function* () {
          this.initializePlugin();
          window.initAppsFlyerFromHaxe = () => this.initAppsFlyerFromHaxe();
          getAppVars().appsFlyerPostponedLogs = "";
          if (PlatformEnv.getInstance().market === "galaxy") {
            getAppVars().appsFlyerPostponedLogs += "|market is galaxy|";
            if (window.SamsungGalaxyCloudPlugin) {
              getAppVars().appsFlyerPostponedLogs += "|SamsungGalaxyCloudPlugin is not null|";
              const pluginResponse = yield window.SamsungGalaxyCloudPlugin.isCloudEnvironment();
              this.isGalaxyCloudEnv = pluginResponse.isCloudEnvironment;
              getAppVars().appsFlyerPostponedLogs += "|isGalaxyCloudEnv is " + this.isGalaxyCloudEnv;
              nativeLogger.info(getAppVars().appsFlyerPostponedLogs);
            } else {
              getAppVars().appsFlyerPostponedLogs += "|error : window.SamsungGalaxyCloudPlugin is null.|";
              nativeLogger.error(getAppVars().appsFlyerPostponedLogs);
            }
          } else {
            getAppVars().appsFlyerPostponedLogs += "|market is NOT galaxy|";
          }
        });
      }
      setSettings(devKey) {
        this.devKey = devKey;
      }
      initializePlugin() {
        this.appsFlyerPlugin = window.plugins.appsFlyer;
        if (PlatformEnv.getInstance().platform !== "windows") {
          this.processAppsFlyerUId();
        }
      }
      initAppsFlyerFromHaxe() {
        const vendorType = window.deviceInfo.vendor_type;
        const options = {
          devKey: this.devKey,
          isDebug: !PlatformEnv.getInstance().release,
          collectIMEI: vendorType !== "Google",
          collectAndroidID: vendorType !== "Google",
          onInstallConversionDataListener: true,
          waitForATTUserAuthorization: 60,
          appId: "",
          customerUserId: null,
          onDeepLinkListener: true
        };
        if (PlatformEnv.getInstance().platform === "ios") {
          options.appId = "447553564";
        }
        this.initAppsFlyerData(options);
        if (PlatformEnv.getInstance().platform === "windows") {
          this.processAppsFlyerUId();
        }
      }
      initAppsFlyerData(options) {
        var _a2, _b2, _c;
        if (PlatformEnv.getInstance().platform !== "windows") {
          (_a2 = this.appsFlyerPlugin) == null ? void 0 : _a2.setAppUserId(getGuid$2());
        }
        if (!this.appsFlyerPlugin) {
          getAppVars().appsFlyerPostponedLogs += "|appsFlyerPlugin is null!|";
        }
        if (PlatformEnv.getInstance().market === "galaxy") {
          if (window.SamsungGalaxyCloudPlugin) {
            const storeName = this.isGalaxyCloudEnv ? "GalaxyStoreCloud" : "GalaxyStoreNative";
            (_b2 = this.appsFlyerPlugin) == null ? void 0 : _b2.setOutOfStore(storeName);
            getAppVars().appsFlyerPostponedLogs += "|setOutOfStore was invoked with parameter: " + storeName;
            nativeLogger.info(getAppVars().appsFlyerPostponedLogs);
          } else {
            getAppVars().appsFlyerPostponedLogs += "|error : window.SamsungGalaxyCloudPlugin is null.|";
            nativeLogger.error(getAppVars().appsFlyerPostponedLogs);
          }
        }
        if (PlatformEnv.getInstance().market !== MARKET_TYPES.MICROSOFT_STORE && options.onDeepLinkListener && this.appsFlyerPlugin && this.appsFlyerPlugin.registerDeepLink !== void 0) {
          this.appsFlyerPlugin.registerDeepLink((data) => {
            var _a3;
            const pluginResponseString = data.toString();
            const pluginResponse = JSON.parse(pluginResponseString);
            if (pluginResponse.status != "success") {
              nativeLogger.error("this.appsFlyerPlugin?.registerDeepLink failed");
              EventStreamEvents.getInstance().trackFailedLaunchFromAF(pluginResponseString);
              return;
            }
            if (!pluginResponse.data) {
              nativeLogger.warn("pluginResponse.data is empty");
              EventStreamEvents.getInstance().trackFailedLaunchFromAF(`pluginResponse.data is empty. Full response: ${pluginResponseString}`);
              return;
            }
            if (!pluginResponse.data.deep_link_value) {
              nativeLogger.warn("pluginResponse.data.deep_link_value is empty");
              EventStreamEvents.getInstance().trackFailedLaunchFromAF("pluginResponse.data.deep_link_value is empty");
              return;
            }
            if (pluginResponse.data.deep_link_value.toString().startsWith(_AppsFlyerServiceCommon.SLOTOMANIA_URL_SCHEME + "?")) {
              return;
            }
            const initialValue = _AppsFlyerServiceCommon.SLOTOMANIA_URL_SCHEME + "?" + pluginResponse.data.deep_link_value;
            let deepLinkToProcess = initialValue;
            let index = 1;
            let value = pluginResponse.data[`${_AppsFlyerServiceCommon.AF_DEEPLINK_PROP_NAME}${index}`];
            do {
              if (!value) {
                break;
              }
              if (index % 2 === 0) {
                deepLinkToProcess += "&" + value;
              } else {
                deepLinkToProcess += "=" + value;
              }
              index++;
              value = pluginResponse.data[`${_AppsFlyerServiceCommon.AF_DEEPLINK_PROP_NAME}${index}`];
            } while (value != null);
            if (deepLinkToProcess != initialValue) {
              nativeLogger.info("running from deeplink: " + deepLinkToProcess);
              EventStreamEvents.getInstance().trackLaunchFromAF(data.toString(), deepLinkToProcess);
              (_a3 = this.app) == null ? void 0 : _a3.openUrl({ url: deepLinkToProcess });
            }
          });
        }
        (_c = this.appsFlyerPlugin) == null ? void 0 : _c.initSdk(options, (result) => this.onInitSuccess(result), (err) => this.onInitError(err));
      }
      onInitSuccess(result) {
        try {
          const conversionData = JSON.parse(result);
          const data = conversionData.data;
          this.sendEvent("onConversionDataSuccess", convertToUriQuery(data));
          if (conversionData.data != null) {
            if (conversionData.data.is_first_launch === "true") {
              if (conversionData.data.af_status === "Non-organic") {
                const mediaSource = conversionData.data.media_source;
                const campaign = conversionData.data.campaign;
                nativeLogger.info("This is a Non-Organic install. Media source: " + mediaSource + " Campaign: " + campaign);
              } else if (conversionData.data.af_status === "Organic") {
                nativeLogger.info("Organic Install");
              }
            } else if (conversionData.data.is_first_launch === "false") {
            }
          }
          this.onInitSuccessPluginHandler();
        } catch (ex) {
          nativeLogger.error("Initialization AppsFlyer is failed");
        }
      }
      onInitSuccessPluginHandler() {
        var _a2;
        (_a2 = this.appsFlyerPlugin) == null ? void 0 : _a2.registerOnAppOpenAttribution((result) => this.onAppOpenAttributionSuccess(result), (err) => this.onAppOpenAttributionError(err));
      }
      onInitError(err) {
        this.sendEvent("onConversionDataFail", encodeURIComponent(err));
      }
      processAppsFlyerUId() {
        var _a2;
        (_a2 = this.appsFlyerPlugin) == null ? void 0 : _a2.getAppsFlyerUID((id) => this.onGetUserId(id));
      }
      onGetUserId(id) {
        var _a2;
        this.appsFlyerId = id;
        getAppVars().appsFlyerUID = this.appsFlyerId;
        (_a2 = this.appsFlyerPlugin) == null ? void 0 : _a2.getSdkVersion((responce) => {
          getAppVars().appsFlyerSdk = responce.toString();
        });
      }
      sendEvent(eventName, result) {
        document.dispatchEvent(new CustomEvent(eventName, { detail: result }));
      }
      onAppOpenAttributionSuccess(result) {
        nativeLogger.info("onAppOpenAttributionSuccess", result);
        const attributionResult = JSON.parse(result);
        const data = attributionResult.data;
        this.sendEvent("onAppOpenAttribution", convertToUriQuery(data));
      }
      onAppOpenAttributionError(err) {
        nativeLogger.error("onAppOpenAttributionError", err);
        this.sendEvent("onAttributionFailure", encodeURIComponent(err));
      }
    };
    let AppsFlyerServiceCommon = _AppsFlyerServiceCommon;
    AppsFlyerServiceCommon.SLOTOMANIA_URL_SCHEME = "slotomania://";
    AppsFlyerServiceCommon.AF_DEEPLINK_PROP_NAME = `deep_link_sub`;
    class AppsFlyerServiceWindows extends AppsFlyerServiceCommon {
      initAppsFlyerFromHaxe() {
        const guid = localStorage.getItem("guid");
        const options = {
          isDebug: !PlatformEnv.getInstance().release,
          devKey: this.devKey,
          customerUserId: guid,
          appId: PlatformEnv.getInstance().productId,
          collectIMEI: false,
          collectAndroidID: false,
          onInstallConversionDataListener: false,
          waitForATTUserAuthorization: 0,
          onDeepLinkListener: false
        };
        nativeLogger.info("AppsFlyer appId: ", PlatformEnv.getInstance().productId);
        this.initAppsFlyerData(options);
      }
      onInitSuccess(result) {
        nativeLogger.info("AppsFlyer init result: ", result);
      }
      onInitError(err) {
        nativeLogger.error("AppsFlyer init failed: ", err);
      }
    }
    function convertToUriQuery(obj) {
      return obj != null ? "?" + Object.keys(obj).map((key) => key + "=" + encodeURIComponent(obj[key])).join("&") : "";
    }
    let _instance$1;
    function getAppsFlyerServiceInstance() {
      if (!_instance$1) {
        if (PlatformEnv.getInstance().platform === "windows") {
          _instance$1 = new AppsFlyerServiceWindows();
        } else {
          _instance$1 = new AppsFlyerServiceCommon();
        }
      }
      return _instance$1;
    }

    var __async$r = (__this, __arguments, generator) => {
      return new Promise((resolve, reject) => {
        var fulfilled = (value) => {
          try {
            step(generator.next(value));
          } catch (e) {
            reject(e);
          }
        };
        var rejected = (value) => {
          try {
            step(generator.throw(value));
          } catch (e) {
            reject(e);
          }
        };
        var step = (x) => x.done ? resolve(x.value) : Promise.resolve(x.value).then(fulfilled, rejected);
        step((generator = generator.apply(__this, __arguments)).next());
      });
    };
    class CaptchaController {
      constructor() {
        this.captchaPercentageRollKey = "captcha_percentage_roll";
        this.isCaptchaNeededByDeeplinkKey = "captcha_needed_by_deeplink";
        this.wasCaptchaShownKey = "captcha_was_shown";
        this.wasCaptchaResolvedKey = "captcha_was_passed";
        this.captchaForAll = "cpcltpall";
        this.captchaForStandalone = "cpcltpmain";
        this.showPercentage = 0;
        this.deeplinkUrl = "";
      }
      static getInstance() {
        if (!CaptchaController._instance) {
          CaptchaController._instance = new CaptchaController();
        }
        return CaptchaController._instance;
      }
      verifyUser(loginType) {
        return __async$r(this, null, function* () {
          var _a, _b, _c;
          if ((_a = this.settingsInstance) == null ? void 0 : _a.getBooleanItem(this.wasCaptchaResolvedKey)) {
            nativeLogger.info(`CAPTCHA | Is already resolved`);
            return;
          }
          if (PlatformEnv.getInstance().platform === PLATFORM_TYPES.IOS || PlatformEnv.getInstance().market === MARKET_TYPES.PRAS || PlatformEnv.getInstance().market === MARKET_TYPES.AMAZON) {
            nativeLogger.info(`CAPTCHA | Skipping this ${PlatformEnv.getInstance().market} for ${PlatformEnv.getInstance().platform}`);
            return;
          }
          if (this.isCaptchaNeededByDeeplink(loginType) || this.isCaptchaNeededByRandomRoll()) {
            nativeLogger.info(`CAPTCHA | Opening Captcha window`);
            (_b = this.settingsInstance) == null ? void 0 : _b.setItem(this.wasCaptchaShownKey, "true");
            const inst = window.getEventStreamEventsInstance();
            inst.trackCaptchaShown();
            yield window.Captcha.open();
            inst.trackCaptchaPassed();
            (_c = this.settingsInstance) == null ? void 0 : _c.setItem(this.wasCaptchaResolvedKey, "true");
            nativeLogger.info(`CAPTCHA | Resolved successfully`);
          }
        });
      }
      setPercentage(captchaPercentage) {
        this.showPercentage = captchaPercentage || 0;
      }
      setDeeplink(deepLink) {
        this.deeplinkUrl = deepLink || "";
      }
      setSettingsInstance(instance) {
        this.settingsInstance = instance;
      }
      isCaptchaNeededByRandomRoll() {
        var _a, _b;
        let captchaRoll = parseFloat(((_a = this.settingsInstance) == null ? void 0 : _a.getItem(this.captchaPercentageRollKey)) || "");
        if (!captchaRoll || isNaN(captchaRoll)) {
          captchaRoll = Math.random() * 100;
          (_b = this.settingsInstance) == null ? void 0 : _b.setItem(this.captchaPercentageRollKey, captchaRoll.toString());
        }
        const isCaptchaNeeded = captchaRoll <= this.showPercentage;
        nativeLogger.info(`Captcha | rolled value is: ${captchaRoll} | percentage is: ${this.showPercentage} | outcome is: ${isCaptchaNeeded}`);
        return isCaptchaNeeded;
      }
      isCaptchaNeededByDeeplink(loginType) {
        var _a, _b;
        const rawUrl = this.deeplinkUrl;
        if ((_a = this.settingsInstance) == null ? void 0 : _a.getBooleanItem(this.isCaptchaNeededByDeeplinkKey)) {
          nativeLogger.info("Captcha | was requested by previous deeplink value but was not completed");
          return true;
        }
        let shouldVerifyUser = false;
        if (rawUrl) {
          const deepLinkValue = parseURLSearchParams(rawUrl).get("deep_link_value");
          if (deepLinkValue) {
            const params = parseURLSearchParams(decodeURIComponent(deepLinkValue));
            const cap = params.get("cap");
            nativeLogger.info(`Captcha | deeplink value is: ${cap} | login type is: ${loginType}`);
            shouldVerifyUser = cap === this.captchaForAll || cap === this.captchaForStandalone && loginType === LOGIN_TYPES.STANDALONE;
            if (shouldVerifyUser) {
              (_b = this.settingsInstance) == null ? void 0 : _b.setItem(this.isCaptchaNeededByDeeplinkKey, "true");
            }
          } else {
            nativeLogger.warn("Captcha | no deeplink values found");
          }
        } else {
          nativeLogger.warn("Captcha | deeplink URL is not provided");
        }
        nativeLogger.info(`Captcha | should verify user by deeplink: ${shouldVerifyUser}`);
        return shouldVerifyUser;
      }
    }

    var ClientType = /* @__PURE__ */ ((ClientType2) => {
      ClientType2[ClientType2["FB_WEB"] = 4] = "FB_WEB";
      ClientType2[ClientType2["STANDALONE_WEB_EMAIL"] = 5] = "STANDALONE_WEB_EMAIL";
      ClientType2[ClientType2["STANDALONE_WEB_FB"] = 26] = "STANDALONE_WEB_FB";
      ClientType2[ClientType2["STANDALONE_WEB_VK"] = 413] = "STANDALONE_WEB_VK";
      ClientType2[ClientType2["STANDALONE_WEB_ONE_CONNECT"] = 225] = "STANDALONE_WEB_ONE_CONNECT";
      ClientType2[ClientType2["STANDALONE_RU_WEB_ONE_CONNECT"] = 312] = "STANDALONE_RU_WEB_ONE_CONNECT";
      ClientType2[ClientType2["I_PHONE"] = 3] = "I_PHONE";
      ClientType2[ClientType2["I_PHONE_STANDALONE"] = 29] = "I_PHONE_STANDALONE";
      ClientType2[ClientType2["ANDROID_AMAZON"] = 6] = "ANDROID_AMAZON";
      ClientType2[ClientType2["ANDROID_GOOGLE"] = 7] = "ANDROID_GOOGLE";
      ClientType2[ClientType2["ANDROID_AMAZON_STANDALONE"] = 35] = "ANDROID_AMAZON_STANDALONE";
      ClientType2[ClientType2["ANDROID_GOOGLE_STANDALONE"] = 36] = "ANDROID_GOOGLE_STANDALONE";
      ClientType2[ClientType2["WINDOWS_PHONE_STANDALONE"] = 103] = "WINDOWS_PHONE_STANDALONE";
      ClientType2[ClientType2["WINDOWS_PHONE"] = 104] = "WINDOWS_PHONE";
      ClientType2[ClientType2["WINDOWS_10_STANDALONE"] = 146] = "WINDOWS_10_STANDALONE";
      ClientType2[ClientType2["WINDOWS_10"] = 147] = "WINDOWS_10";
      ClientType2[ClientType2["PRAS"] = 152] = "PRAS";
      ClientType2[ClientType2["PRAS_STANDALONE"] = 153] = "PRAS_STANDALONE";
      ClientType2[ClientType2["I_PHONE_ONE"] = 227] = "I_PHONE_ONE";
      ClientType2[ClientType2["ANDROID_GOOGLE_ONE"] = 229] = "ANDROID_GOOGLE_ONE";
      ClientType2[ClientType2["ANDROID_AMAZON_ONE"] = 228] = "ANDROID_AMAZON_ONE";
      ClientType2[ClientType2["PRAS_ONE"] = 233] = "PRAS_ONE";
      ClientType2[ClientType2["WINDOWS_10_ONE"] = 232] = "WINDOWS_10_ONE";
      ClientType2[ClientType2["PWA_IOS_FB"] = 308] = "PWA_IOS_FB";
      ClientType2[ClientType2["PWA_IOS_ONE_CONNECT"] = 309] = "PWA_IOS_ONE_CONNECT";
      ClientType2[ClientType2["PWA_ANDROID_FB"] = 323] = "PWA_ANDROID_FB";
      ClientType2[ClientType2["PWA_ANDROID_ONE_CONNECT"] = 324] = "PWA_ANDROID_ONE_CONNECT";
      ClientType2[ClientType2["JAPANESE_IPHONE_FB"] = 340] = "JAPANESE_IPHONE_FB";
      ClientType2[ClientType2["JAPANESE_IPHONE_STANDALONE"] = 341] = "JAPANESE_IPHONE_STANDALONE";
      ClientType2[ClientType2["JAPANESE_IPHONE_ONE"] = 342] = "JAPANESE_IPHONE_ONE";
      ClientType2[ClientType2["JAPANESE_ANDROID_GOOGLE_FB"] = 346] = "JAPANESE_ANDROID_GOOGLE_FB";
      ClientType2[ClientType2["JAPANESE_ANDROID_GOOGLE_STANDALONE"] = 347] = "JAPANESE_ANDROID_GOOGLE_STANDALONE";
      ClientType2[ClientType2["JAPANESE_ANDROID_GOOGLE_ONE"] = 348] = "JAPANESE_ANDROID_GOOGLE_ONE";
      ClientType2[ClientType2["RUSSIAN_ANDROID_GOOGLE_MM"] = 355] = "RUSSIAN_ANDROID_GOOGLE_MM";
      ClientType2[ClientType2["RUSSIAN_ANDROID_GOOGLE_OD"] = 358] = "RUSSIAN_ANDROID_GOOGLE_OD";
      ClientType2[ClientType2["RUSSIAN_ANDROID_GOOGLE_VK"] = 361] = "RUSSIAN_ANDROID_GOOGLE_VK";
      ClientType2[ClientType2["RUSSIAN_ANDROID_GOOGLE_STANDALONE"] = 365] = "RUSSIAN_ANDROID_GOOGLE_STANDALONE";
      ClientType2[ClientType2["RUSSIAN_ANDROID_GOOGLE_ONE"] = 366] = "RUSSIAN_ANDROID_GOOGLE_ONE";
      ClientType2[ClientType2["RUSSIAN_APPLE_MM"] = 354] = "RUSSIAN_APPLE_MM";
      ClientType2[ClientType2["RUSSIAN_APPLE_OD"] = 357] = "RUSSIAN_APPLE_OD";
      ClientType2[ClientType2["RUSSIAN_APPLE_VK"] = 360] = "RUSSIAN_APPLE_VK";
      ClientType2[ClientType2["RUSSIAN_APPLE_STANDALONE"] = 363] = "RUSSIAN_APPLE_STANDALONE";
      ClientType2[ClientType2["RUSSIAN_APPLE_ONE"] = 364] = "RUSSIAN_APPLE_ONE";
      ClientType2[ClientType2["RUSSIAN_WEB_MM"] = 356] = "RUSSIAN_WEB_MM";
      ClientType2[ClientType2["RUSSIAN_WEB_OD"] = 359] = "RUSSIAN_WEB_OD";
      ClientType2[ClientType2["RUSSIAN_WEB_VK"] = 362] = "RUSSIAN_WEB_VK";
      ClientType2[ClientType2["JAPANESE_YJ_WEB"] = 368] = "JAPANESE_YJ_WEB";
      ClientType2[ClientType2["TAIWAN_APPLE_OC"] = 397] = "TAIWAN_APPLE_OC";
      ClientType2[ClientType2["TAIWAN_APPLE_FB"] = 401] = "TAIWAN_APPLE_FB";
      ClientType2[ClientType2["TAIWAN_APPLE_SA"] = 405] = "TAIWAN_APPLE_SA";
      ClientType2[ClientType2["TAIWAN_ANDROID_GOOGLE_OC"] = 399] = "TAIWAN_ANDROID_GOOGLE_OC";
      ClientType2[ClientType2["TAIWAN_ANDROID_GOOGLE_FB"] = 403] = "TAIWAN_ANDROID_GOOGLE_FB";
      ClientType2[ClientType2["TAIWAN_ANDROID_GOOGLE_SA"] = 407] = "TAIWAN_ANDROID_GOOGLE_SA";
      ClientType2[ClientType2["TAIWAN_ANDROID_PRAS_OC"] = 398] = "TAIWAN_ANDROID_PRAS_OC";
      ClientType2[ClientType2["TAIWAN_ANDROID_PRAS_FB"] = 402] = "TAIWAN_ANDROID_PRAS_FB";
      ClientType2[ClientType2["TAIWAN_ANDROID_PRAS_SA"] = 406] = "TAIWAN_ANDROID_PRAS_SA";
      ClientType2[ClientType2["TAIWAN_WEB_OC"] = 300] = "TAIWAN_WEB_OC";
      ClientType2[ClientType2["TAIWAN_WEB_FB"] = 304] = "TAIWAN_WEB_FB";
      ClientType2[ClientType2["APPLE_SIGN_IN"] = 319] = "APPLE_SIGN_IN";
      ClientType2[ClientType2["RUSSIAN_APPLE_SIGN_IN"] = 420] = "RUSSIAN_APPLE_SIGN_IN";
      ClientType2[ClientType2["TAIWAN_APPLE_SIGN_IN"] = 421] = "TAIWAN_APPLE_SIGN_IN";
      ClientType2[ClientType2["JAPANESE_APPLE_SIGN_IN"] = 422] = "JAPANESE_APPLE_SIGN_IN";
      ClientType2[ClientType2["ANDROID_GALAXY_FB"] = 431] = "ANDROID_GALAXY_FB";
      ClientType2[ClientType2["ANDROID_GALAXY_STANDALONE"] = 432] = "ANDROID_GALAXY_STANDALONE";
      ClientType2[ClientType2["ANDROID_GOOGLE_GPG"] = 476] = "ANDROID_GOOGLE_GPG";
      ClientType2[ClientType2["WEB_GUEST"] = 477] = "WEB_GUEST";
      ClientType2[ClientType2["FB_INSTANT_GAME"] = 481] = "FB_INSTANT_GAME";
      return ClientType2;
    })(ClientType || {});

    function getFacebook() {
      const market = PlatformEnv.getInstance().market;
      switch (market) {
        case "appstore":
          return ClientType.I_PHONE;
        case "googleplay":
          return ClientType.ANDROID_GOOGLE;
        case "amazon":
          return ClientType.ANDROID_AMAZON;
        case "pras":
          return ClientType.PRAS;
        case "microsoftstore":
          return ClientType.WINDOWS_10;
        case "galaxy":
          return ClientType.ANDROID_GALAXY_FB;
        default:
          throw new Error(`There is no defined facebook client type for market ${market}`);
      }
    }
    function getStandalone() {
      const market = PlatformEnv.getInstance().market;
      switch (market) {
        case "appstore":
          return ClientType.I_PHONE_STANDALONE;
        case "googleplay":
          return ClientType.ANDROID_GOOGLE_STANDALONE;
        case "amazon":
          return ClientType.ANDROID_AMAZON_STANDALONE;
        case "pras":
          return ClientType.PRAS_STANDALONE;
        case "microsoftstore":
          return ClientType.WINDOWS_10_STANDALONE;
        case "galaxy":
          return ClientType.ANDROID_GALAXY_STANDALONE;
        default:
          throw new Error(`There is no defined standalone client type for market ${market}`);
      }
    }
    function getSmAppleSignIn() {
      const market = PlatformEnv.getInstance().market;
      switch (market) {
        case "appstore":
          return ClientType.APPLE_SIGN_IN;
        default:
          throw new Error(`There is no defined AppleSignIn client type for market ${market}`);
      }
    }
    function getAndroidGooglePlayGames() {
      return ClientType.ANDROID_GOOGLE_GPG;
    }

    var _a, _b;
    class Deeplinks {
      constructor() {
        this.app = (_b = (_a = window.Capacitor) == null ? void 0 : _a.Plugins) == null ? void 0 : _b.App;
      }
      static getInstance() {
        if (!this._instance) {
          this._instance = new Deeplinks();
        }
        return this._instance;
      }
      initialize() {
        if (!this.app) {
          nativeLogger.error("failed to initialize deeplinks, App plugin is not available");
          return;
        }
        this.app.addListener("appUrlOpen", (data) => {
          if (data) {
            let url = data.url;
            if (typeof url !== "string") {
              return;
            }
            if (url.slice(-1) === "#") {
              url = url.slice(0, -1);
            }
            this.handleLink(url);
          }
        });
        this.checkAndProcessDeeplinkToMachineFromPush();
      }
      handleLink(link) {
        nativeLogger.info("DeepLinks | did launch application from the link: " + link);
        if (PlatformEnv.getInstance().platform === "windows") {
          if (link.indexOf("<options") === 0) {
            const arr = link.split(" ");
            let i = 0;
            while (i < arr.length) {
              if (arr[i].indexOf("messageType") === 0) {
                link = arr[i];
                break;
              }
              i++;
            }
          }
        }
        if (PlatformEnv.getInstance().platform === "android") {
          if (link.includes("//epayments?")) {
            link = link.replace("//epayments?", "//?epayments=true&");
          }
        }
        if (PlatformEnv.getInstance().platform === "ios") {
          if (link.includes("//epayments?")) {
            link = link.replace("//epayments?", "//?epayments=true&");
          } else if (link.includes("/payment-return?")) {
            link = link.replace("/payment-return?", "/?payment-return=true&");
          }
        }
        document.dispatchEvent(new CustomEvent("deeplinksUpdate", { detail: link }));
        try {
          const url = new URL(link);
          let deepLinkValue = url.searchParams.get("deep_link_value");
          if (deepLinkValue) {
            deepLinkValue = decodeURIComponent(deepLinkValue);
            url.searchParams.set("deep_link_value", deepLinkValue);
            link = url.toString();
            nativeLogger.info("DeepLinks | extra URL decode applied to deep_link_value=" + deepLinkValue);
          }
        } catch (e) {
          nativeLogger.warn(`DeepLinks | failed to parse URL: ${link}`);
        }
        window.app_vars.deeplinksUrl = link;
      }
      dispose() {
        if (this.app) {
          this.app.removeAllListeners();
        }
      }
      checkAndProcessDeeplinkToMachineFromPush() {
        if (!window.app_vars.intentParams || !window.app_vars.intentParams.dict) {
          return;
        }
        const dict = window.app_vars.intentParams.dict;
        const pushChannel = dict.ch;
        if (pushChannel && dict.gameid) {
          window.app_vars.pushToMachine = dict.gameid;
        }
      }
    }

    function getConnectionInstance() {
      return window.Connection;
    }
    function getDeviceInfoInstance() {
      return window.device;
    }
    function getExtendedDeviceInfoInstance() {
      return window.cordova.plugins["extended-device-information"];
    }
    function getIdfaInstance() {
      return window.cordova.plugins.idfa;
    }
    function getScreenSizeInstance() {
      return window.plugins.screensize;
    }
    function initializeCdvPurchaseAppleStore() {
      window.CdvPurchase.store.initialize([window.CdvPurchase.Platform.APPLE_APPSTORE]);
    }
    function getSigninWithApple() {
      return window.signinWithApple;
    }
    function getGooglePlayGamesServicesPlugin() {
      var _a, _b;
      return (_b = (_a = window.Capacitor) == null ? void 0 : _a.Plugins) == null ? void 0 : _b.GooglePlayGamesServicesPlugin;
    }

    var __async$q = (__this, __arguments, generator) => {
      return new Promise((resolve, reject) => {
        var fulfilled = (value) => {
          try {
            step(generator.next(value));
          } catch (e) {
            reject(e);
          }
        };
        var rejected = (value) => {
          try {
            step(generator.throw(value));
          } catch (e) {
            reject(e);
          }
        };
        var step = (x) => x.done ? resolve(x.value) : Promise.resolve(x.value).then(fulfilled, rejected);
        step((generator = generator.apply(__this, __arguments)).next());
      });
    };
    const getDeviceInfo = () => {
      switch (PlatformEnv.getInstance().market) {
        case "googleplay":
          return new DeviceInfoAndroid();
        case "pras":
          return new DeviceInfoPras();
        case "amazon":
          return new DeviceInfoAmazon();
        case "galaxy":
          return new DeviceInfoAndroid();
        case "microsoftstore":
          return new DeviceInfoWindows();
        case "appstore":
          return new DeviceInfoIOS();
        default:
          return new DeviceInfoAndroid();
      }
    };
    class DeviceInfoBase {
      constructor() {
        this.connection = {};
        this.device_info = {};
        this.ext_device_info = { memory: 0, deviceFriendlyName: "", hardwareId: "", deviceUniqueIdString: "" };
        this.screen_info = {};
        this.mac = "02:00:00:00:00:00";
        this.id_for_vendor = "";
        this.imei = "";
        this.advertising_id = "";
        this.networkState = { prev: "", current: "", isConnect: true };
        this.dataDispatcher = {};
        this.dataListeners = {};
      }
      initialize() {
        return __async$q(this, null, function* () {
          this.connection = getConnectionInstance();
          nativeLogger.info("INFO: connection", this.connection);
          this.device_info = getDeviceInfoInstance();
          nativeLogger.info("INFO: device_info", this.device_info);
          this.ext_device_info = getExtendedDeviceInfoInstance();
          nativeLogger.info("INFO: ext_device_info", this.ext_device_info);
          this.checkConnection(true);
          document.addEventListener("offline", () => this.offlineCarrier(), false);
          document.addEventListener("online", () => this.onlineCarrier(), false);
          yield this.initScreenSize();
          this.onInfoReady();
        });
      }
      initIdfa() {
        return __async$q(this, null, function* () {
          const info = yield getIdfaInstance().getInfo();
          if (!info.limitAdTracking) {
            this.consumeIdfaData(info);
          }
        });
      }
      generateId(id) {
        if (this.isNewUserForDebug()) {
          return id == null || id.length < 10 ? String(id) : this.getTestId(id);
        }
        return id || "";
      }
      consumeIdfaData(info) {
        const advertising_id = info.idfa || info.aaid || info.advertisingId;
        if (advertising_id) {
          this.advertising_id = advertising_id;
        }
        nativeLogger.info("INFO: info.idfa || info.aaid ===> ", this.advertising_id);
      }
      initScreenSize() {
        return new Promise((resolve, reject) => {
          getScreenSizeInstance().get((result) => {
            this.onScreenSizeReady(result);
            resolve();
          }, (err) => {
            nativeLogger.error("ERROR: Error get screen info => ", err);
            reject(err);
          });
        });
      }
      offlineCarrier() {
        nativeLogger.info("INFO: init offline");
        this.checkConnection(false);
        document.dispatchEvent(new CustomEvent("offlineCarrier"));
      }
      onlineCarrier() {
        nativeLogger.info("INFO: init online");
        this.checkConnection(true);
        document.dispatchEvent(new CustomEvent("onlineCarrier"));
      }
      onScreenSizeReady(result) {
        this.screen_info = result;
        nativeLogger.info("INFO: Screen info => ", this.screen_info);
      }
      onInfoReady() {
        const app_vars = window.app_vars;
        window.deviceInfo = this.getInfo();
        app_vars.deviceInfo = window.deviceInfo;
        app_vars.platform = 6;
        app_vars.device = app_vars.deviceInfo.model;
        app_vars.os = app_vars.deviceInfo.os;
        app_vars.tz = new Date().getTimezoneOffset();
        app_vars.carrier = app_vars.deviceInfo.carrier;
        nativeLogger.info("INFO: app_vars.deviceInfo => ", app_vars.deviceInfo);
      }
      checkConnection(isConnect) {
        const networkState = PlatformEnv.getInstance().platform === "windows" ? navigator.network.connection.type : navigator.connection.type;
        this.networkState.prev = this.networkState.prev === "" ? networkState : this.networkState.current;
        this.networkState.current = networkState;
        this.networkState.isConnect = isConnect;
        return this.networkState;
      }
      getMacAddress() {
        return this.mac;
      }
      getImei() {
        return this.imei;
      }
      getRamSize() {
        return this.ext_device_info.memory;
      }
      getInfo() {
        return {
          available: this.device_info.available,
          platform: this.device_info.platform,
          version: this.device_info.version,
          uuid: this.device_info.uuid,
          androidId: this.generateId(this.device_info.uuid),
          id_for_vendor: this.device_info.uuid,
          cordova: this.device_info.cordova,
          model: this.device_info.model,
          manufacturer: this.device_info.manufacturer,
          vendor_type: "Google",
          isVirtual: this.device_info.isVirtual,
          serial: this.generateId(this.device_info.serial),
          carrier: this.networkState,
          mac_address: this.getMacAddress(),
          connection: this.connection,
          imei: this.getImei(),
          advertising_id: this.advertising_id,
          screen_info: this.screen_info,
          os: `${this.device_info.platform} ${this.device_info.version}`,
          getRamSize: () => {
            return this.ext_device_info.memory;
          }
        };
      }
      isNewUserForDebug() {
        return !PlatformEnv.getInstance().release && window.__debugCreateNewUser;
      }
      getTestId(id) {
        return `${id}test${Date.now()}`;
      }
    }
    class DeviceInfoAndroid extends DeviceInfoBase {
      initialize() {
        var __superGet = (key) => super[key];
        return __async$q(this, null, function* () {
          yield this.initIdfa();
          yield __superGet("initialize").call(this);
        });
      }
      onInfoReady() {
        super.onInfoReady();
        const app_vars = window.app_vars;
        app_vars.device = `${app_vars.deviceInfo.manufacturer} ${app_vars.deviceInfo.model}`;
      }
    }
    class DeviceInfoAmazon extends DeviceInfoBase {
      initialize() {
        var __superGet = (key) => super[key];
        return __async$q(this, null, function* () {
          yield this.initAdvertisingId();
          yield __superGet("initialize").call(this);
        });
      }
      initAdvertisingId() {
        return __async$q(this, null, function* () {
          return new Promise((resolve) => {
            window.cordova.plugins.aid.getInfo((info) => {
              if (!info.limitAdTracking) {
                this.advertising_id = info.id;
                nativeLogger.info("INFO: Advertising ID:", info.id);
              }
              resolve();
            }, (err) => {
              nativeLogger.warn("WARN: Error during Advertising ID initialization:", err);
              resolve();
            });
          });
        });
      }
      onInfoReady() {
        super.onInfoReady();
        const app_vars = window.app_vars;
        app_vars.platform = 7;
        app_vars.device = `${app_vars.deviceInfo.manufacturer} ${app_vars.deviceInfo.model}`;
      }
    }
    class DeviceInfoPras extends DeviceInfoAndroid {
      onInfoReady() {
        super.onInfoReady();
        window.app_vars.platform = 16;
      }
    }
    class DeviceInfoIOS extends DeviceInfoBase {
      initialize() {
        var __superGet = (key) => super[key];
        return __async$q(this, null, function* () {
          yield this.initIdfa();
          yield __superGet("initialize").call(this);
        });
      }
      consumeIdfaData(info) {
        this.advertising_id = info.idfa;
        nativeLogger.info("INFO: advertising_id ===> ", this.advertising_id);
      }
      onInfoReady() {
        super.onInfoReady();
        const app_vars = window.app_vars;
        app_vars.os = this.device_info.version;
        app_vars.id_for_advertiser = this.advertising_id;
        app_vars.mac_address = app_vars.deviceInfo.mac_address;
        app_vars.id_for_vendor = app_vars.deviceInfo.id_for_vendor;
        app_vars.device = app_vars.deviceInfo.model;
        app_vars.ouid = "Deprecated";
        app_vars.platform = 2;
      }
    }
    class DeviceInfoWindows extends DeviceInfoBase {
      initialize() {
        var __superGet = (key) => super[key];
        return __async$q(this, null, function* () {
          yield this.initIdfa();
          yield __superGet("initialize").call(this);
          if (window.device.getInfo) {
            window.device.getInfo((_) => {
            }, (__) => {
            });
          }
        });
      }
      onInfoReady() {
        super.onInfoReady();
        const app_vars = window.app_vars;
        app_vars.deviceInfo.uuid = window.device.uuid;
        app_vars.deviceInfo.manufacturer = window.device.manufacturer;
        app_vars.deviceInfo.model = window.device.model;
        app_vars.deviceInfo.cordova = window.device.cordova;
        app_vars.os = this.device_info.version;
        app_vars.hardwareId = this.ext_device_info.hardwareId;
        app_vars.udid = this.getDeviceUdid();
        app_vars.id_for_advertiser = this.advertising_id;
        app_vars.device = this.ext_device_info.deviceFriendlyName;
        const guid = window.device.uuid;
        nativeLogger.info("INFO: app_vars.deviceInfo localStorage.setItem @23@", guid);
        window.localStorage.setItem("guid", guid);
        nativeLogger.info("INFO: app_vars.deviceInfo (final) => ", app_vars.deviceInfo);
      }
      getDeviceUdid() {
        const udid = this.ext_device_info.deviceUniqueIdString;
        return this.isNewUserForDebug() ? this.getTestId(udid) : udid;
      }
    }
    let _instance;
    function getDeviceInfoPlatformInstance() {
      if (!_instance) {
        _instance = getDeviceInfo();
      }
      return _instance;
    }

    function decToHexDigit(dec) {
      return (dec | 0).toString(16);
    }
    function hexCharToDec(ch) {
      return Number(`0x${ch}`);
    }

    const _StorageAdapter = class {
      constructor(storage) {
        this._setDataOnDiskHandler = (e) => {
          const detail = e.detail;
          if (!detail) {
            return;
          }
          try {
            const data = {};
            for (const key of detail.keys()) {
              data[key] = detail.get(key);
            }
            if (data.dir && data.val !== null && data.val !== void 0) {
              this.setFile(data.dir, data.key, data.val.toString());
            }
          } catch (ex) {
            nativeLogger.error(` Exception in _setDataOnDiskHandler : ${ex}`);
            if (detail.h && detail.val !== null && detail.val !== void 0) {
              this.setFile(detail.h.dir, detail.h.key, detail.h.val.toString());
            }
          }
        };
        this._setObjDataOnDiskHandler = (e) => {
          const detail = e.detail;
          if (!detail) {
            return;
          }
          if (detail.dir && detail.val !== null && detail.val !== void 0) {
            this.setFile(detail.dir, detail.key, detail.val.toString());
          }
        };
        this._keysUsedInPreloader = [
          "smh_Settings:Guid",
          "smh_Settings:SocialNetwork.Id",
          "smh_Settings:NotificationsEnabled",
          "smh_Settings:LastLoginType",
          "smh_Settings:isStandaloneAfterFacebookFailed"
        ];
        this._localStorage = storage;
      }
      getPublicDataString() {
        let retString = "";
        const notificationsEnabled = this._localStorage.getItem("smh_Settings:NotificationsEnabled");
        if (notificationsEnabled) {
          retString += `smh_Settings:notificationsEnabled: ${this.deserializeValue(notificationsEnabled)} 
`;
        }
        const lastLoginType = this._localStorage.getItem("smh_Settings:LastLoginType");
        if (lastLoginType) {
          retString += `smh_Settings:LastLoginType: ${this.deserializeValue(lastLoginType)} 
`;
        }
        const isStandaloneAfterFacebookFailed = this._localStorage.getItem("smh_Settings:isStandaloneAfterFacebookFailed");
        if (isStandaloneAfterFacebookFailed) {
          retString += `smh_Settings:isStandaloneAfterFacebookFailed: ${this.deserializeValue(isStandaloneAfterFacebookFailed)} 
`;
        }
        const keysFromBackup = this._localStorage.getItem(_StorageAdapter.BACKUP_KEYS_LIST_PATH);
        if (keysFromBackup && keysFromBackup != "") {
          const keysArr = keysFromBackup.split(";");
          keysArr.forEach((key) => {
            const value = this._localStorage.getItem(_StorageAdapter.BACKUP_PREFIX + key);
            if (value && !key.includes("Guid") && !key.includes("Authentication") && !key.includes("SocialNetwork.Id")) {
              retString += `smh_nullSettings:${key} : ${value.toString()} 
`;
            }
          });
        }
        return retString;
      }
      initialize() {
        try {
          this.handleEvent();
        } catch (e) {
          nativeLogger.error(`*** SimpleStorageAdapter has exception : ${e == null ? void 0 : e.message} `);
        }
      }
      dispose() {
        document.removeEventListener("setDataOnDisk", this._setDataOnDiskHandler);
        document.removeEventListener("setObjDataOnDisk", this._setObjDataOnDiskHandler);
      }
      getValue(key) {
        var _a;
        const localKey = `smh_Settings:${key}`;
        if (this._keysUsedInPreloader.includes(localKey)) {
          let retValue = this._localStorage.getItem(localKey) ? (_a = this._localStorage.getItem(localKey)) == null ? void 0 : _a.toString() : "";
          if (retValue) {
            retValue = this.deserializeValue(retValue);
          }
          nativeLogger.info(`*** LocalStorageAdapter getValue from htmlStorage : key:${key} ~ retValue:${retValue}`);
          return retValue;
        } else {
          nativeLogger.info(`ISimpleStorage.getValue was invoked for key:${key} which is not present in _keysUsedInPreloader, trying to get it from backup`);
          const retValue = this._localStorage.getItem(`${_StorageAdapter.BACKUP_PREFIX}:${key}`);
          return retValue;
        }
      }
      setFile(dir, fileName, text) {
        nativeLogger.info(`*** LocalStorageAdapter setFile : dir:${dir} ~ fileName:${fileName} ~ text:${text}`);
        const key = `smh_${dir}:${fileName}`;
        if (this._keysUsedInPreloader.includes(key)) {
          const oldValue = this._localStorage.getItem(key);
          if (!oldValue) {
            this._localStorage.setItem(key, this.serializeValue(text));
          } else {
            const value = this.deserializeValue(oldValue);
            if (text !== value) {
              this._localStorage.setItem(key, this.serializeValue(text));
            }
          }
        }
        this._localStorage.setItem(`${_StorageAdapter.BACKUP_PREFIX}${fileName}`, text);
        let keysFromBackup = this._localStorage.getItem(_StorageAdapter.BACKUP_KEYS_LIST_PATH);
        if (keysFromBackup && keysFromBackup != "") {
          const keysArr = keysFromBackup.split(";");
          if (!keysArr.includes(fileName)) {
            keysFromBackup += fileName + ";";
            this._localStorage.setItem(_StorageAdapter.BACKUP_KEYS_LIST_PATH, keysFromBackup);
          }
        } else {
          this._localStorage.setItem(_StorageAdapter.BACKUP_KEYS_LIST_PATH, fileName + ";");
        }
      }
      loadSettings() {
        getAppVars().guid = this.getValue("Guid");
        window.afterSettingsReady();
      }
      resetDiskValue() {
      }
      handleEvent() {
        document.addEventListener("setDataOnDisk", this._setDataOnDiskHandler);
        document.addEventListener("setObjDataOnDisk", this._setObjDataOnDiskHandler);
      }
      serializeValue(value) {
        if (isNaN(Number(value))) {
          return `y${value.length.toString()}:${value}`;
        } else {
          return `i${value}`;
        }
      }
      deserializeValue(value) {
        if (value.startsWith("i")) {
          return value.substring(1);
        } else {
          return value.substring(value.lastIndexOf(":") + 1, value.length);
        }
      }
    };
    let StorageAdapter = _StorageAdapter;
    StorageAdapter.BACKUP_PREFIX = "smh_nullSettings:";
    StorageAdapter.BACKUP_KEYS_LIST_PATH = "smh_nullSettings:SavedItemNames";

    class StorageProxy {
      static getStorageInstance() {
        if (!StorageProxy._storageInstance) {
          StorageProxy._storageInstance = new StorageAdapter(window.localStorage);
        }
        return StorageProxy._storageInstance;
      }
    }

    const BLACK_LIST_SERIAL_NUMBER = "0123456789abcdef";
    const BLACK_LIST_ANDRID_ID = "9774d56d682e549c";
    const SERIAL_NO = "1";
    const ANDROID_ID = "2";
    const GENERATED_ID = "3";
    function prepareAndroidDeviceIdParams() {
      const udid = getUdid();
      const app_vars = getAppVars();
      app_vars.udid = udid;
      app_vars.serial_number = app_vars.deviceInfo.serial;
      app_vars.android_id = app_vars.deviceInfo.androidId;
      app_vars.ouid = app_vars.deviceInfo.imei;
      app_vars.id_for_advertiser = app_vars.deviceInfo.advertising_id;
      if (isNil$1(getAppVars().guid)) {
        const guid = getGuid$1();
        getAppVars().guid = guid;
        StorageProxy.getStorageInstance().setFile("Settings", "Guid", guid);
      }
    }
    function getGuid$1() {
      let guid = window.localStorage.getItem("guid");
      if (!isNil$1(guid)) {
        return guid;
      }
      guid = generateUUID();
      window.localStorage.setItem("guid", guid);
      return guid;
    }
    function getUdid() {
      nativeLogger.info("INFO:getUdid");
      const app_vars = getAppVars();
      let serialNo = "";
      let androidId = "";
      androidId = app_vars.deviceInfo.androidId;
      serialNo = app_vars.deviceInfo.serial;
      let udid = window.localStorage.getItem("udid");
      if (!isNil$1(udid)) {
        nativeLogger.info("INFO:stored udid " + udid);
        return udid;
      }
      let tmpUdid = "";
      if (serialNo != null && serialNo.length >= 10 && serialNo.toLowerCase() !== BLACK_LIST_SERIAL_NUMBER) {
        nativeLogger.info("INFO:serialNo: " + serialNo);
        tmpUdid = encryptUDID(serialNo);
        udid = SERIAL_NO + tmpUdid;
      } else if (androidId != null && androidId.length >= 10 && androidId !== BLACK_LIST_ANDRID_ID) {
        nativeLogger.info("INFO:androidId: " + androidId);
        tmpUdid = encryptUDID(androidId);
        udid = ANDROID_ID + tmpUdid;
      } else {
        const guid = getGuid$1();
        nativeLogger.info("INFO:guid: " + guid);
        tmpUdid = encryptUDID(guid);
        udid = GENERATED_ID + tmpUdid;
      }
      window.localStorage.setItem("udid", udid);
      return udid;
    }
    function encryptUDID(value) {
      let sb = "";
      value = value.toUpperCase();
      for (let idx = 0; idx < value.length; idx++) {
        const ch = value.charAt(idx);
        if (ch >= "0" && ch <= "9" || ch >= "A" && ch <= "F") {
          let code = hexCharToDec(ch);
          code = code + idx & 15;
          code = code >> 2 ^ 2 | (code & 3 ^ 1) << 2;
          const resCh = decToHexDigit(code);
          sb += resCh.toUpperCase();
        } else {
          sb += ch.toUpperCase();
        }
      }
      return sb;
    }

    var __async$p = (__this, __arguments, generator) => {
      return new Promise((resolve, reject) => {
        var fulfilled = (value) => {
          try {
            step(generator.next(value));
          } catch (e) {
            reject(e);
          }
        };
        var rejected = (value) => {
          try {
            step(generator.throw(value));
          } catch (e) {
            reject(e);
          }
        };
        var step = (x) => x.done ? resolve(x.value) : Promise.resolve(x.value).then(fulfilled, rejected);
        step((generator = generator.apply(__this, __arguments)).next());
      });
    };
    function setupIdfa(idfaRequestEnabledPercentage, idfaRequestEnabledPercentageBeforeLogin) {
      return __async$p(this, null, function* () {
        window.getIdfaInfo = function() {
          return __async$p(this, null, function* () {
            const idfaInfo = yield getIdfaInstance().getInfo();
            if (!idfaInfo.limitAdTracking) {
              getAppVars().id_for_advertiser = idfaInfo.idfa;
            }
            return yield getIdfaInstance().getStatus();
          });
        };
        window.getIdfaRequestEnabled = function() {
          return __async$p(this, null, function* () {
            return yield getIdfaInstance().idfaRequestEnabled();
          });
        };
        getAppVars().idfaRequestEnabledByPercentage = true;
        getAppVars().idfaRequestEnabledByPercentageBeforeLogin = true;
      });
    }
    function showIdfaDialogIfEnabled() {
      return __async$p(this, null, function* () {
        const IDFA_SYSTEM_POPUP_NONE = 0;
        const IDFA_SYSTEM_POPUP_SHOWN = 1;
        const IDFA_SYSTEM_POPUP_ACCEPTED = 2;
        const IDFA_SYSTEM_POPUP_DECLINED = 4;
        const IDFA_SYSTEM_POPUP_RESTRICTED = 8;
        let idfa_system_popup_value = IDFA_SYSTEM_POPUP_NONE;
        const idfaRequestEnabledByVersion = yield getIdfaInstance().idfaRequestEnabled();
        const idfaDialogAvailable = yield getIdfaInstance().idfaDialogAvailable();
        const idfaRequestEnabledByPercentageBeforeLogin = true;
        if (idfaRequestEnabledByVersion && idfaDialogAvailable && idfaRequestEnabledByPercentageBeforeLogin) {
          idfa_system_popup_value |= IDFA_SYSTEM_POPUP_SHOWN;
          yield getIdfaInstance().showIdfaDialog();
          const idfaStatus = yield getIdfaInstance().getStatus();
          idfa_system_popup_value |= idfaStatus === 3 ? IDFA_SYSTEM_POPUP_ACCEPTED : idfaStatus === 2 ? IDFA_SYSTEM_POPUP_DECLINED : IDFA_SYSTEM_POPUP_RESTRICTED;
        }
        getAppVars().idfa_system_popup_value = idfa_system_popup_value;
      });
    }

    var __async$o = (__this, __arguments, generator) => {
      return new Promise((resolve, reject) => {
        var fulfilled = (value) => {
          try {
            step(generator.next(value));
          } catch (e) {
            reject(e);
          }
        };
        var rejected = (value) => {
          try {
            step(generator.throw(value));
          } catch (e) {
            reject(e);
          }
        };
        var step = (x) => x.done ? resolve(x.value) : Promise.resolve(x.value).then(fulfilled, rejected);
        step((generator = generator.apply(__this, __arguments)).next());
      });
    };
    function prepareIOSDeviceIdParams(simpleStorage, secureStorage) {
      return __async$o(this, null, function* () {
        let keyChainGuid = yield secureStorage.storageGet("Guid");
        if (isNilOrEmpty(keyChainGuid)) {
          keyChainGuid = yield secureStorage.storageGet("");
        }
        let guid = getAppVars().guid;
        if (isNilOrEmpty(keyChainGuid) && isNilOrEmpty(guid) || isNewUser()) {
          guid = getGuid();
        } else if (!isNilOrEmpty(keyChainGuid)) {
          guid = keyChainGuid;
        }
        saveGuid(guid, simpleStorage, secureStorage);
      });
    }
    function isNewUser() {
      return !PlatformEnv.getInstance().release && window.__debugCreateNewUser;
    }
    function getGuid() {
      let guid = window.localStorage.getItem("guid");
      if (!isNilOrEmpty(guid)) {
        return guid;
      }
      const guidHaxe = window.localStorage.getItem("smh_nullSettings:Guid");
      if (guidHaxe) {
        guid = deserializeHaxeString(guidHaxe);
        if (!isNilOrEmpty(guid)) {
          return guid;
        }
      }
      guid = generateUUID();
      return guid;
    }
    function saveGuid(guid, simpleStorage, secureStorage) {
      return __async$o(this, null, function* () {
        localStorage.setItem("guid", guid);
        localStorage.setItem("smh_nullSettings:Guid", serializeHaxeString(guid));
        getAppVars().guid = guid;
        simpleStorage.setFile("Settings", "Guid", guid);
        yield secureStorage.storageSet("Guid", guid);
      });
    }

    class Version {
      constructor(version) {
        if (!version) {
          throw new Error(`Version can not be null or undefined`);
        }
        const versionParts = version.match(/[0-9]+/g);
        if (!versionParts || versionParts.length < 3) {
          throw new Error(`Version ${version} is not correct`);
        }
        this.majorVersion = parseInt(versionParts[0]);
        this.minorVersion = parseInt(versionParts[1]);
        this.patchVersion = parseInt(versionParts[2]);
      }
      compareVersion(major, minor, patch) {
        if (this.majorVersion != major) {
          return major > this.majorVersion ? 1 : -1;
        } else if (this.minorVersion != minor) {
          return minor > this.minorVersion ? 1 : -1;
        } else if (this.patchVersion != patch) {
          return patch > this.patchVersion ? 1 : -1;
        }
        return 0;
      }
    }

    class DynamicConfig {
      static getInstance() {
        if (!this._instance) {
          this._instance = new DynamicConfig();
        }
        return this._instance;
      }
      constructor() {
        this.dynamicConfig = null;
        this.prefixes = [];
        this.prefixMap = /* @__PURE__ */ new Map();
        this.clientVersion = null;
      }
      setData(dynamicConfig) {
        this.dynamicConfig = dynamicConfig;
      }
      setClientVersion(clientVersion) {
        this.clientVersion = new Version(clientVersion);
      }
      addPrefix(prefix) {
        this.prefixes.push(prefix);
        this.prefixMap.set(prefix, true);
      }
      getKey(section, configKey) {
        if (!this.dynamicConfig) {
          return null;
        }
        const configSection = this.dynamicConfig[section];
        if (!configSection) {
          return null;
        }
        const keys = Object.keys(configSection);
        let maxPrefixes = -1;
        let noPrefixedValue = null;
        let bestMatchPrefixedValue = null;
        for (let i = 0; i < keys.length; i++) {
          const keyValue = keys[i];
          const keyParts = keyValue.split("-");
          const key = keyParts[keyParts.length - 1];
          if (key === configKey) {
            const tagMatches = keyValue.match(/(?<=\-)[0-z]+?(?=\-)/g);
            const tagPrefixes = tagMatches != null ? Array.from(tagMatches) : [];
            const versionMatches = keyValue.match(/\(.*?\)/g);
            const versionPrefixes = versionMatches != null ? Array.from(versionMatches) : [];
            const prefixes = tagPrefixes.concat(versionPrefixes);
            let currentPrefix = -1;
            if (prefixes.length > 0) {
              currentPrefix = 0;
              for (let j = 0; j < prefixes.length; j++) {
                if (this.isAllowedPrefix(prefixes[j])) {
                  currentPrefix++;
                } else {
                  currentPrefix = -1;
                  break;
                }
              }
            } else {
              noPrefixedValue = configSection[keyValue];
            }
            if (currentPrefix > maxPrefixes) {
              maxPrefixes = currentPrefix;
              bestMatchPrefixedValue = configSection[keyValue];
            }
          }
        }
        return bestMatchPrefixedValue != null ? bestMatchPrefixedValue : noPrefixedValue;
      }
      getBool(section, configKey) {
        const value = this.getKey(section, configKey);
        return String(value).toLowerCase() === "true";
      }
      isAllowedPrefix(prefix) {
        const isVersionPrefix = prefix.charAt(0) === "(" && prefix.charAt(prefix.length - 1) === ")";
        if (isVersionPrefix) {
          return this.isAllowedVersionPrefix(prefix);
        }
        return this.isAllowedTagPrefix(prefix);
      }
      isAllowedTagPrefix(prefix) {
        return !!this.prefixMap.get(prefix);
      }
      isAllowedVersionPrefix(prefix) {
        var _a;
        const isLBeforeVersionPrefix = prefix.indexOf("(-") == 0;
        const isAfternVersionPrefix = prefix.indexOf("-)") > 0;
        const prefixVersion = prefix.match(/[0-9]+/g);
        if (!prefixVersion || prefixVersion.length < 3) {
          return false;
        }
        const compareResult = (_a = this.clientVersion) == null ? void 0 : _a.compareVersion(parseInt(prefixVersion[0]), parseInt(prefixVersion[1]), parseInt(prefixVersion[2]));
        if (isLBeforeVersionPrefix) {
          return compareResult == 0 || compareResult == 1;
        } else if (isAfternVersionPrefix) {
          return compareResult == 0 || compareResult == -1;
        }
        return compareResult == 0;
      }
    }

    var commonjsGlobal = typeof globalThis !== 'undefined' ? globalThis : typeof window !== 'undefined' ? window : typeof global !== 'undefined' ? global : typeof self !== 'undefined' ? self : {};

    function getDefaultExportFromCjs (x) {
    	return x && x.__esModule && Object.prototype.hasOwnProperty.call(x, 'default') ? x['default'] : x;
    }

    /** Used for built-in method references. */

    var _isPrototype;
    var hasRequired_isPrototype;

    function require_isPrototype () {
    	if (hasRequired_isPrototype) return _isPrototype;
    	hasRequired_isPrototype = 1;
    	var objectProto = Object.prototype;

    	/**
    	 * Checks if `value` is likely a prototype object.
    	 *
    	 * @private
    	 * @param {*} value The value to check.
    	 * @returns {boolean} Returns `true` if `value` is a prototype, else `false`.
    	 */
    	function isPrototype(value) {
    	  var Ctor = value && value.constructor,
    	      proto = (typeof Ctor == 'function' && Ctor.prototype) || objectProto;

    	  return value === proto;
    	}

    	_isPrototype = isPrototype;
    	return _isPrototype;
    }

    /**
     * Creates a unary function that invokes `func` with its argument transformed.
     *
     * @private
     * @param {Function} func The function to wrap.
     * @param {Function} transform The argument transform.
     * @returns {Function} Returns the new function.
     */

    var _overArg;
    var hasRequired_overArg;

    function require_overArg () {
    	if (hasRequired_overArg) return _overArg;
    	hasRequired_overArg = 1;
    	function overArg(func, transform) {
    	  return function(arg) {
    	    return func(transform(arg));
    	  };
    	}

    	_overArg = overArg;
    	return _overArg;
    }

    var _nativeKeys;
    var hasRequired_nativeKeys;

    function require_nativeKeys () {
    	if (hasRequired_nativeKeys) return _nativeKeys;
    	hasRequired_nativeKeys = 1;
    	var overArg = require_overArg();

    	/* Built-in method references for those with the same name as other `lodash` methods. */
    	var nativeKeys = overArg(Object.keys, Object);

    	_nativeKeys = nativeKeys;
    	return _nativeKeys;
    }

    var _baseKeys;
    var hasRequired_baseKeys;

    function require_baseKeys () {
    	if (hasRequired_baseKeys) return _baseKeys;
    	hasRequired_baseKeys = 1;
    	var isPrototype = require_isPrototype(),
    	    nativeKeys = require_nativeKeys();

    	/** Used for built-in method references. */
    	var objectProto = Object.prototype;

    	/** Used to check objects for own properties. */
    	var hasOwnProperty = objectProto.hasOwnProperty;

    	/**
    	 * The base implementation of `_.keys` which doesn't treat sparse arrays as dense.
    	 *
    	 * @private
    	 * @param {Object} object The object to query.
    	 * @returns {Array} Returns the array of property names.
    	 */
    	function baseKeys(object) {
    	  if (!isPrototype(object)) {
    	    return nativeKeys(object);
    	  }
    	  var result = [];
    	  for (var key in Object(object)) {
    	    if (hasOwnProperty.call(object, key) && key != 'constructor') {
    	      result.push(key);
    	    }
    	  }
    	  return result;
    	}

    	_baseKeys = baseKeys;
    	return _baseKeys;
    }

    /** Detect free variable `global` from Node.js. */

    var _freeGlobal;
    var hasRequired_freeGlobal;

    function require_freeGlobal () {
    	if (hasRequired_freeGlobal) return _freeGlobal;
    	hasRequired_freeGlobal = 1;
    	var freeGlobal = typeof commonjsGlobal == 'object' && commonjsGlobal && commonjsGlobal.Object === Object && commonjsGlobal;

    	_freeGlobal = freeGlobal;
    	return _freeGlobal;
    }

    var _root;
    var hasRequired_root;

    function require_root () {
    	if (hasRequired_root) return _root;
    	hasRequired_root = 1;
    	var freeGlobal = require_freeGlobal();

    	/** Detect free variable `self`. */
    	var freeSelf = typeof self == 'object' && self && self.Object === Object && self;

    	/** Used as a reference to the global object. */
    	var root = freeGlobal || freeSelf || Function('return this')();

    	_root = root;
    	return _root;
    }

    var _Symbol;
    var hasRequired_Symbol;

    function require_Symbol () {
    	if (hasRequired_Symbol) return _Symbol;
    	hasRequired_Symbol = 1;
    	var root = require_root();

    	/** Built-in value references. */
    	var Symbol = root.Symbol;

    	_Symbol = Symbol;
    	return _Symbol;
    }

    var _getRawTag;
    var hasRequired_getRawTag;

    function require_getRawTag () {
    	if (hasRequired_getRawTag) return _getRawTag;
    	hasRequired_getRawTag = 1;
    	var Symbol = require_Symbol();

    	/** Used for built-in method references. */
    	var objectProto = Object.prototype;

    	/** Used to check objects for own properties. */
    	var hasOwnProperty = objectProto.hasOwnProperty;

    	/**
    	 * Used to resolve the
    	 * [`toStringTag`](http://ecma-international.org/ecma-262/7.0/#sec-object.prototype.tostring)
    	 * of values.
    	 */
    	var nativeObjectToString = objectProto.toString;

    	/** Built-in value references. */
    	var symToStringTag = Symbol ? Symbol.toStringTag : undefined;

    	/**
    	 * A specialized version of `baseGetTag` which ignores `Symbol.toStringTag` values.
    	 *
    	 * @private
    	 * @param {*} value The value to query.
    	 * @returns {string} Returns the raw `toStringTag`.
    	 */
    	function getRawTag(value) {
    	  var isOwn = hasOwnProperty.call(value, symToStringTag),
    	      tag = value[symToStringTag];

    	  try {
    	    value[symToStringTag] = undefined;
    	    var unmasked = true;
    	  } catch (e) {}

    	  var result = nativeObjectToString.call(value);
    	  if (unmasked) {
    	    if (isOwn) {
    	      value[symToStringTag] = tag;
    	    } else {
    	      delete value[symToStringTag];
    	    }
    	  }
    	  return result;
    	}

    	_getRawTag = getRawTag;
    	return _getRawTag;
    }

    /** Used for built-in method references. */

    var _objectToString;
    var hasRequired_objectToString;

    function require_objectToString () {
    	if (hasRequired_objectToString) return _objectToString;
    	hasRequired_objectToString = 1;
    	var objectProto = Object.prototype;

    	/**
    	 * Used to resolve the
    	 * [`toStringTag`](http://ecma-international.org/ecma-262/7.0/#sec-object.prototype.tostring)
    	 * of values.
    	 */
    	var nativeObjectToString = objectProto.toString;

    	/**
    	 * Converts `value` to a string using `Object.prototype.toString`.
    	 *
    	 * @private
    	 * @param {*} value The value to convert.
    	 * @returns {string} Returns the converted string.
    	 */
    	function objectToString(value) {
    	  return nativeObjectToString.call(value);
    	}

    	_objectToString = objectToString;
    	return _objectToString;
    }

    var _baseGetTag;
    var hasRequired_baseGetTag;

    function require_baseGetTag () {
    	if (hasRequired_baseGetTag) return _baseGetTag;
    	hasRequired_baseGetTag = 1;
    	var Symbol = require_Symbol(),
    	    getRawTag = require_getRawTag(),
    	    objectToString = require_objectToString();

    	/** `Object#toString` result references. */
    	var nullTag = '[object Null]',
    	    undefinedTag = '[object Undefined]';

    	/** Built-in value references. */
    	var symToStringTag = Symbol ? Symbol.toStringTag : undefined;

    	/**
    	 * The base implementation of `getTag` without fallbacks for buggy environments.
    	 *
    	 * @private
    	 * @param {*} value The value to query.
    	 * @returns {string} Returns the `toStringTag`.
    	 */
    	function baseGetTag(value) {
    	  if (value == null) {
    	    return value === undefined ? undefinedTag : nullTag;
    	  }
    	  return (symToStringTag && symToStringTag in Object(value))
    	    ? getRawTag(value)
    	    : objectToString(value);
    	}

    	_baseGetTag = baseGetTag;
    	return _baseGetTag;
    }

    /**
     * Checks if `value` is the
     * [language type](http://www.ecma-international.org/ecma-262/7.0/#sec-ecmascript-language-types)
     * of `Object`. (e.g. arrays, functions, objects, regexes, `new Number(0)`, and `new String('')`)
     *
     * @static
     * @memberOf _
     * @since 0.1.0
     * @category Lang
     * @param {*} value The value to check.
     * @returns {boolean} Returns `true` if `value` is an object, else `false`.
     * @example
     *
     * _.isObject({});
     * // => true
     *
     * _.isObject([1, 2, 3]);
     * // => true
     *
     * _.isObject(_.noop);
     * // => true
     *
     * _.isObject(null);
     * // => false
     */

    var isObject_1;
    var hasRequiredIsObject;

    function requireIsObject () {
    	if (hasRequiredIsObject) return isObject_1;
    	hasRequiredIsObject = 1;
    	function isObject(value) {
    	  var type = typeof value;
    	  return value != null && (type == 'object' || type == 'function');
    	}

    	isObject_1 = isObject;
    	return isObject_1;
    }

    var isFunction_1;
    var hasRequiredIsFunction;

    function requireIsFunction () {
    	if (hasRequiredIsFunction) return isFunction_1;
    	hasRequiredIsFunction = 1;
    	var baseGetTag = require_baseGetTag(),
    	    isObject = requireIsObject();

    	/** `Object#toString` result references. */
    	var asyncTag = '[object AsyncFunction]',
    	    funcTag = '[object Function]',
    	    genTag = '[object GeneratorFunction]',
    	    proxyTag = '[object Proxy]';

    	/**
    	 * Checks if `value` is classified as a `Function` object.
    	 *
    	 * @static
    	 * @memberOf _
    	 * @since 0.1.0
    	 * @category Lang
    	 * @param {*} value The value to check.
    	 * @returns {boolean} Returns `true` if `value` is a function, else `false`.
    	 * @example
    	 *
    	 * _.isFunction(_);
    	 * // => true
    	 *
    	 * _.isFunction(/abc/);
    	 * // => false
    	 */
    	function isFunction(value) {
    	  if (!isObject(value)) {
    	    return false;
    	  }
    	  // The use of `Object#toString` avoids issues with the `typeof` operator
    	  // in Safari 9 which returns 'object' for typed arrays and other constructors.
    	  var tag = baseGetTag(value);
    	  return tag == funcTag || tag == genTag || tag == asyncTag || tag == proxyTag;
    	}

    	isFunction_1 = isFunction;
    	return isFunction_1;
    }

    var _coreJsData;
    var hasRequired_coreJsData;

    function require_coreJsData () {
    	if (hasRequired_coreJsData) return _coreJsData;
    	hasRequired_coreJsData = 1;
    	var root = require_root();

    	/** Used to detect overreaching core-js shims. */
    	var coreJsData = root['__core-js_shared__'];

    	_coreJsData = coreJsData;
    	return _coreJsData;
    }

    var _isMasked;
    var hasRequired_isMasked;

    function require_isMasked () {
    	if (hasRequired_isMasked) return _isMasked;
    	hasRequired_isMasked = 1;
    	var coreJsData = require_coreJsData();

    	/** Used to detect methods masquerading as native. */
    	var maskSrcKey = (function() {
    	  var uid = /[^.]+$/.exec(coreJsData && coreJsData.keys && coreJsData.keys.IE_PROTO || '');
    	  return uid ? ('Symbol(src)_1.' + uid) : '';
    	}());

    	/**
    	 * Checks if `func` has its source masked.
    	 *
    	 * @private
    	 * @param {Function} func The function to check.
    	 * @returns {boolean} Returns `true` if `func` is masked, else `false`.
    	 */
    	function isMasked(func) {
    	  return !!maskSrcKey && (maskSrcKey in func);
    	}

    	_isMasked = isMasked;
    	return _isMasked;
    }

    /** Used for built-in method references. */

    var _toSource;
    var hasRequired_toSource;

    function require_toSource () {
    	if (hasRequired_toSource) return _toSource;
    	hasRequired_toSource = 1;
    	var funcProto = Function.prototype;

    	/** Used to resolve the decompiled source of functions. */
    	var funcToString = funcProto.toString;

    	/**
    	 * Converts `func` to its source code.
    	 *
    	 * @private
    	 * @param {Function} func The function to convert.
    	 * @returns {string} Returns the source code.
    	 */
    	function toSource(func) {
    	  if (func != null) {
    	    try {
    	      return funcToString.call(func);
    	    } catch (e) {}
    	    try {
    	      return (func + '');
    	    } catch (e) {}
    	  }
    	  return '';
    	}

    	_toSource = toSource;
    	return _toSource;
    }

    var _baseIsNative;
    var hasRequired_baseIsNative;

    function require_baseIsNative () {
    	if (hasRequired_baseIsNative) return _baseIsNative;
    	hasRequired_baseIsNative = 1;
    	var isFunction = requireIsFunction(),
    	    isMasked = require_isMasked(),
    	    isObject = requireIsObject(),
    	    toSource = require_toSource();

    	/**
    	 * Used to match `RegExp`
    	 * [syntax characters](http://ecma-international.org/ecma-262/7.0/#sec-patterns).
    	 */
    	var reRegExpChar = /[\\^$.*+?()[\]{}|]/g;

    	/** Used to detect host constructors (Safari). */
    	var reIsHostCtor = /^\[object .+?Constructor\]$/;

    	/** Used for built-in method references. */
    	var funcProto = Function.prototype,
    	    objectProto = Object.prototype;

    	/** Used to resolve the decompiled source of functions. */
    	var funcToString = funcProto.toString;

    	/** Used to check objects for own properties. */
    	var hasOwnProperty = objectProto.hasOwnProperty;

    	/** Used to detect if a method is native. */
    	var reIsNative = RegExp('^' +
    	  funcToString.call(hasOwnProperty).replace(reRegExpChar, '\\$&')
    	  .replace(/hasOwnProperty|(function).*?(?=\\\()| for .+?(?=\\\])/g, '$1.*?') + '$'
    	);

    	/**
    	 * The base implementation of `_.isNative` without bad shim checks.
    	 *
    	 * @private
    	 * @param {*} value The value to check.
    	 * @returns {boolean} Returns `true` if `value` is a native function,
    	 *  else `false`.
    	 */
    	function baseIsNative(value) {
    	  if (!isObject(value) || isMasked(value)) {
    	    return false;
    	  }
    	  var pattern = isFunction(value) ? reIsNative : reIsHostCtor;
    	  return pattern.test(toSource(value));
    	}

    	_baseIsNative = baseIsNative;
    	return _baseIsNative;
    }

    /**
     * Gets the value at `key` of `object`.
     *
     * @private
     * @param {Object} [object] The object to query.
     * @param {string} key The key of the property to get.
     * @returns {*} Returns the property value.
     */

    var _getValue;
    var hasRequired_getValue;

    function require_getValue () {
    	if (hasRequired_getValue) return _getValue;
    	hasRequired_getValue = 1;
    	function getValue(object, key) {
    	  return object == null ? undefined : object[key];
    	}

    	_getValue = getValue;
    	return _getValue;
    }

    var _getNative;
    var hasRequired_getNative;

    function require_getNative () {
    	if (hasRequired_getNative) return _getNative;
    	hasRequired_getNative = 1;
    	var baseIsNative = require_baseIsNative(),
    	    getValue = require_getValue();

    	/**
    	 * Gets the native function at `key` of `object`.
    	 *
    	 * @private
    	 * @param {Object} object The object to query.
    	 * @param {string} key The key of the method to get.
    	 * @returns {*} Returns the function if it's native, else `undefined`.
    	 */
    	function getNative(object, key) {
    	  var value = getValue(object, key);
    	  return baseIsNative(value) ? value : undefined;
    	}

    	_getNative = getNative;
    	return _getNative;
    }

    var _DataView;
    var hasRequired_DataView;

    function require_DataView () {
    	if (hasRequired_DataView) return _DataView;
    	hasRequired_DataView = 1;
    	var getNative = require_getNative(),
    	    root = require_root();

    	/* Built-in method references that are verified to be native. */
    	var DataView = getNative(root, 'DataView');

    	_DataView = DataView;
    	return _DataView;
    }

    var _Map;
    var hasRequired_Map;

    function require_Map () {
    	if (hasRequired_Map) return _Map;
    	hasRequired_Map = 1;
    	var getNative = require_getNative(),
    	    root = require_root();

    	/* Built-in method references that are verified to be native. */
    	var Map = getNative(root, 'Map');

    	_Map = Map;
    	return _Map;
    }

    var _Promise;
    var hasRequired_Promise;

    function require_Promise () {
    	if (hasRequired_Promise) return _Promise;
    	hasRequired_Promise = 1;
    	var getNative = require_getNative(),
    	    root = require_root();

    	/* Built-in method references that are verified to be native. */
    	var Promise = getNative(root, 'Promise');

    	_Promise = Promise;
    	return _Promise;
    }

    var _Set;
    var hasRequired_Set;

    function require_Set () {
    	if (hasRequired_Set) return _Set;
    	hasRequired_Set = 1;
    	var getNative = require_getNative(),
    	    root = require_root();

    	/* Built-in method references that are verified to be native. */
    	var Set = getNative(root, 'Set');

    	_Set = Set;
    	return _Set;
    }

    var _WeakMap;
    var hasRequired_WeakMap;

    function require_WeakMap () {
    	if (hasRequired_WeakMap) return _WeakMap;
    	hasRequired_WeakMap = 1;
    	var getNative = require_getNative(),
    	    root = require_root();

    	/* Built-in method references that are verified to be native. */
    	var WeakMap = getNative(root, 'WeakMap');

    	_WeakMap = WeakMap;
    	return _WeakMap;
    }

    var _getTag;
    var hasRequired_getTag;

    function require_getTag () {
    	if (hasRequired_getTag) return _getTag;
    	hasRequired_getTag = 1;
    	var DataView = require_DataView(),
    	    Map = require_Map(),
    	    Promise = require_Promise(),
    	    Set = require_Set(),
    	    WeakMap = require_WeakMap(),
    	    baseGetTag = require_baseGetTag(),
    	    toSource = require_toSource();

    	/** `Object#toString` result references. */
    	var mapTag = '[object Map]',
    	    objectTag = '[object Object]',
    	    promiseTag = '[object Promise]',
    	    setTag = '[object Set]',
    	    weakMapTag = '[object WeakMap]';

    	var dataViewTag = '[object DataView]';

    	/** Used to detect maps, sets, and weakmaps. */
    	var dataViewCtorString = toSource(DataView),
    	    mapCtorString = toSource(Map),
    	    promiseCtorString = toSource(Promise),
    	    setCtorString = toSource(Set),
    	    weakMapCtorString = toSource(WeakMap);

    	/**
    	 * Gets the `toStringTag` of `value`.
    	 *
    	 * @private
    	 * @param {*} value The value to query.
    	 * @returns {string} Returns the `toStringTag`.
    	 */
    	var getTag = baseGetTag;

    	// Fallback for data views, maps, sets, and weak maps in IE 11 and promises in Node.js < 6.
    	if ((DataView && getTag(new DataView(new ArrayBuffer(1))) != dataViewTag) ||
    	    (Map && getTag(new Map) != mapTag) ||
    	    (Promise && getTag(Promise.resolve()) != promiseTag) ||
    	    (Set && getTag(new Set) != setTag) ||
    	    (WeakMap && getTag(new WeakMap) != weakMapTag)) {
    	  getTag = function(value) {
    	    var result = baseGetTag(value),
    	        Ctor = result == objectTag ? value.constructor : undefined,
    	        ctorString = Ctor ? toSource(Ctor) : '';

    	    if (ctorString) {
    	      switch (ctorString) {
    	        case dataViewCtorString: return dataViewTag;
    	        case mapCtorString: return mapTag;
    	        case promiseCtorString: return promiseTag;
    	        case setCtorString: return setTag;
    	        case weakMapCtorString: return weakMapTag;
    	      }
    	    }
    	    return result;
    	  };
    	}

    	_getTag = getTag;
    	return _getTag;
    }

    /**
     * Checks if `value` is object-like. A value is object-like if it's not `null`
     * and has a `typeof` result of "object".
     *
     * @static
     * @memberOf _
     * @since 4.0.0
     * @category Lang
     * @param {*} value The value to check.
     * @returns {boolean} Returns `true` if `value` is object-like, else `false`.
     * @example
     *
     * _.isObjectLike({});
     * // => true
     *
     * _.isObjectLike([1, 2, 3]);
     * // => true
     *
     * _.isObjectLike(_.noop);
     * // => false
     *
     * _.isObjectLike(null);
     * // => false
     */

    var isObjectLike_1;
    var hasRequiredIsObjectLike;

    function requireIsObjectLike () {
    	if (hasRequiredIsObjectLike) return isObjectLike_1;
    	hasRequiredIsObjectLike = 1;
    	function isObjectLike(value) {
    	  return value != null && typeof value == 'object';
    	}

    	isObjectLike_1 = isObjectLike;
    	return isObjectLike_1;
    }

    var _baseIsArguments;
    var hasRequired_baseIsArguments;

    function require_baseIsArguments () {
    	if (hasRequired_baseIsArguments) return _baseIsArguments;
    	hasRequired_baseIsArguments = 1;
    	var baseGetTag = require_baseGetTag(),
    	    isObjectLike = requireIsObjectLike();

    	/** `Object#toString` result references. */
    	var argsTag = '[object Arguments]';

    	/**
    	 * The base implementation of `_.isArguments`.
    	 *
    	 * @private
    	 * @param {*} value The value to check.
    	 * @returns {boolean} Returns `true` if `value` is an `arguments` object,
    	 */
    	function baseIsArguments(value) {
    	  return isObjectLike(value) && baseGetTag(value) == argsTag;
    	}

    	_baseIsArguments = baseIsArguments;
    	return _baseIsArguments;
    }

    var isArguments_1;
    var hasRequiredIsArguments;

    function requireIsArguments () {
    	if (hasRequiredIsArguments) return isArguments_1;
    	hasRequiredIsArguments = 1;
    	var baseIsArguments = require_baseIsArguments(),
    	    isObjectLike = requireIsObjectLike();

    	/** Used for built-in method references. */
    	var objectProto = Object.prototype;

    	/** Used to check objects for own properties. */
    	var hasOwnProperty = objectProto.hasOwnProperty;

    	/** Built-in value references. */
    	var propertyIsEnumerable = objectProto.propertyIsEnumerable;

    	/**
    	 * Checks if `value` is likely an `arguments` object.
    	 *
    	 * @static
    	 * @memberOf _
    	 * @since 0.1.0
    	 * @category Lang
    	 * @param {*} value The value to check.
    	 * @returns {boolean} Returns `true` if `value` is an `arguments` object,
    	 *  else `false`.
    	 * @example
    	 *
    	 * _.isArguments(function() { return arguments; }());
    	 * // => true
    	 *
    	 * _.isArguments([1, 2, 3]);
    	 * // => false
    	 */
    	var isArguments = baseIsArguments(function() { return arguments; }()) ? baseIsArguments : function(value) {
    	  return isObjectLike(value) && hasOwnProperty.call(value, 'callee') &&
    	    !propertyIsEnumerable.call(value, 'callee');
    	};

    	isArguments_1 = isArguments;
    	return isArguments_1;
    }

    /**
     * Checks if `value` is classified as an `Array` object.
     *
     * @static
     * @memberOf _
     * @since 0.1.0
     * @category Lang
     * @param {*} value The value to check.
     * @returns {boolean} Returns `true` if `value` is an array, else `false`.
     * @example
     *
     * _.isArray([1, 2, 3]);
     * // => true
     *
     * _.isArray(document.body.children);
     * // => false
     *
     * _.isArray('abc');
     * // => false
     *
     * _.isArray(_.noop);
     * // => false
     */

    var isArray_1;
    var hasRequiredIsArray;

    function requireIsArray () {
    	if (hasRequiredIsArray) return isArray_1;
    	hasRequiredIsArray = 1;
    	var isArray = Array.isArray;

    	isArray_1 = isArray;
    	return isArray_1;
    }

    /** Used as references for various `Number` constants. */

    var isLength_1;
    var hasRequiredIsLength;

    function requireIsLength () {
    	if (hasRequiredIsLength) return isLength_1;
    	hasRequiredIsLength = 1;
    	var MAX_SAFE_INTEGER = 9007199254740991;

    	/**
    	 * Checks if `value` is a valid array-like length.
    	 *
    	 * **Note:** This method is loosely based on
    	 * [`ToLength`](http://ecma-international.org/ecma-262/7.0/#sec-tolength).
    	 *
    	 * @static
    	 * @memberOf _
    	 * @since 4.0.0
    	 * @category Lang
    	 * @param {*} value The value to check.
    	 * @returns {boolean} Returns `true` if `value` is a valid length, else `false`.
    	 * @example
    	 *
    	 * _.isLength(3);
    	 * // => true
    	 *
    	 * _.isLength(Number.MIN_VALUE);
    	 * // => false
    	 *
    	 * _.isLength(Infinity);
    	 * // => false
    	 *
    	 * _.isLength('3');
    	 * // => false
    	 */
    	function isLength(value) {
    	  return typeof value == 'number' &&
    	    value > -1 && value % 1 == 0 && value <= MAX_SAFE_INTEGER;
    	}

    	isLength_1 = isLength;
    	return isLength_1;
    }

    var isArrayLike_1;
    var hasRequiredIsArrayLike;

    function requireIsArrayLike () {
    	if (hasRequiredIsArrayLike) return isArrayLike_1;
    	hasRequiredIsArrayLike = 1;
    	var isFunction = requireIsFunction(),
    	    isLength = requireIsLength();

    	/**
    	 * Checks if `value` is array-like. A value is considered array-like if it's
    	 * not a function and has a `value.length` that's an integer greater than or
    	 * equal to `0` and less than or equal to `Number.MAX_SAFE_INTEGER`.
    	 *
    	 * @static
    	 * @memberOf _
    	 * @since 4.0.0
    	 * @category Lang
    	 * @param {*} value The value to check.
    	 * @returns {boolean} Returns `true` if `value` is array-like, else `false`.
    	 * @example
    	 *
    	 * _.isArrayLike([1, 2, 3]);
    	 * // => true
    	 *
    	 * _.isArrayLike(document.body.children);
    	 * // => true
    	 *
    	 * _.isArrayLike('abc');
    	 * // => true
    	 *
    	 * _.isArrayLike(_.noop);
    	 * // => false
    	 */
    	function isArrayLike(value) {
    	  return value != null && isLength(value.length) && !isFunction(value);
    	}

    	isArrayLike_1 = isArrayLike;
    	return isArrayLike_1;
    }

    var isBuffer = {exports: {}};

    /**
     * This method returns `false`.
     *
     * @static
     * @memberOf _
     * @since 4.13.0
     * @category Util
     * @returns {boolean} Returns `false`.
     * @example
     *
     * _.times(2, _.stubFalse);
     * // => [false, false]
     */

    var stubFalse_1;
    var hasRequiredStubFalse;

    function requireStubFalse () {
    	if (hasRequiredStubFalse) return stubFalse_1;
    	hasRequiredStubFalse = 1;
    	function stubFalse() {
    	  return false;
    	}

    	stubFalse_1 = stubFalse;
    	return stubFalse_1;
    }

    isBuffer.exports;

    var hasRequiredIsBuffer;

    function requireIsBuffer () {
    	if (hasRequiredIsBuffer) return isBuffer.exports;
    	hasRequiredIsBuffer = 1;
    	(function (module, exports) {
    		var root = require_root(),
    		    stubFalse = requireStubFalse();

    		/** Detect free variable `exports`. */
    		var freeExports = exports && !exports.nodeType && exports;

    		/** Detect free variable `module`. */
    		var freeModule = freeExports && 'object' == 'object' && module && !module.nodeType && module;

    		/** Detect the popular CommonJS extension `module.exports`. */
    		var moduleExports = freeModule && freeModule.exports === freeExports;

    		/** Built-in value references. */
    		var Buffer = moduleExports ? root.Buffer : undefined;

    		/* Built-in method references for those with the same name as other `lodash` methods. */
    		var nativeIsBuffer = Buffer ? Buffer.isBuffer : undefined;

    		/**
    		 * Checks if `value` is a buffer.
    		 *
    		 * @static
    		 * @memberOf _
    		 * @since 4.3.0
    		 * @category Lang
    		 * @param {*} value The value to check.
    		 * @returns {boolean} Returns `true` if `value` is a buffer, else `false`.
    		 * @example
    		 *
    		 * _.isBuffer(new Buffer(2));
    		 * // => true
    		 *
    		 * _.isBuffer(new Uint8Array(2));
    		 * // => false
    		 */
    		var isBuffer = nativeIsBuffer || stubFalse;

    		module.exports = isBuffer; 
    	} (isBuffer, isBuffer.exports));
    	return isBuffer.exports;
    }

    var _baseIsTypedArray;
    var hasRequired_baseIsTypedArray;

    function require_baseIsTypedArray () {
    	if (hasRequired_baseIsTypedArray) return _baseIsTypedArray;
    	hasRequired_baseIsTypedArray = 1;
    	var baseGetTag = require_baseGetTag(),
    	    isLength = requireIsLength(),
    	    isObjectLike = requireIsObjectLike();

    	/** `Object#toString` result references. */
    	var argsTag = '[object Arguments]',
    	    arrayTag = '[object Array]',
    	    boolTag = '[object Boolean]',
    	    dateTag = '[object Date]',
    	    errorTag = '[object Error]',
    	    funcTag = '[object Function]',
    	    mapTag = '[object Map]',
    	    numberTag = '[object Number]',
    	    objectTag = '[object Object]',
    	    regexpTag = '[object RegExp]',
    	    setTag = '[object Set]',
    	    stringTag = '[object String]',
    	    weakMapTag = '[object WeakMap]';

    	var arrayBufferTag = '[object ArrayBuffer]',
    	    dataViewTag = '[object DataView]',
    	    float32Tag = '[object Float32Array]',
    	    float64Tag = '[object Float64Array]',
    	    int8Tag = '[object Int8Array]',
    	    int16Tag = '[object Int16Array]',
    	    int32Tag = '[object Int32Array]',
    	    uint8Tag = '[object Uint8Array]',
    	    uint8ClampedTag = '[object Uint8ClampedArray]',
    	    uint16Tag = '[object Uint16Array]',
    	    uint32Tag = '[object Uint32Array]';

    	/** Used to identify `toStringTag` values of typed arrays. */
    	var typedArrayTags = {};
    	typedArrayTags[float32Tag] = typedArrayTags[float64Tag] =
    	typedArrayTags[int8Tag] = typedArrayTags[int16Tag] =
    	typedArrayTags[int32Tag] = typedArrayTags[uint8Tag] =
    	typedArrayTags[uint8ClampedTag] = typedArrayTags[uint16Tag] =
    	typedArrayTags[uint32Tag] = true;
    	typedArrayTags[argsTag] = typedArrayTags[arrayTag] =
    	typedArrayTags[arrayBufferTag] = typedArrayTags[boolTag] =
    	typedArrayTags[dataViewTag] = typedArrayTags[dateTag] =
    	typedArrayTags[errorTag] = typedArrayTags[funcTag] =
    	typedArrayTags[mapTag] = typedArrayTags[numberTag] =
    	typedArrayTags[objectTag] = typedArrayTags[regexpTag] =
    	typedArrayTags[setTag] = typedArrayTags[stringTag] =
    	typedArrayTags[weakMapTag] = false;

    	/**
    	 * The base implementation of `_.isTypedArray` without Node.js optimizations.
    	 *
    	 * @private
    	 * @param {*} value The value to check.
    	 * @returns {boolean} Returns `true` if `value` is a typed array, else `false`.
    	 */
    	function baseIsTypedArray(value) {
    	  return isObjectLike(value) &&
    	    isLength(value.length) && !!typedArrayTags[baseGetTag(value)];
    	}

    	_baseIsTypedArray = baseIsTypedArray;
    	return _baseIsTypedArray;
    }

    /**
     * The base implementation of `_.unary` without support for storing metadata.
     *
     * @private
     * @param {Function} func The function to cap arguments for.
     * @returns {Function} Returns the new capped function.
     */

    var _baseUnary;
    var hasRequired_baseUnary;

    function require_baseUnary () {
    	if (hasRequired_baseUnary) return _baseUnary;
    	hasRequired_baseUnary = 1;
    	function baseUnary(func) {
    	  return function(value) {
    	    return func(value);
    	  };
    	}

    	_baseUnary = baseUnary;
    	return _baseUnary;
    }

    var _nodeUtil = {exports: {}};

    _nodeUtil.exports;

    var hasRequired_nodeUtil;

    function require_nodeUtil () {
    	if (hasRequired_nodeUtil) return _nodeUtil.exports;
    	hasRequired_nodeUtil = 1;
    	(function (module, exports) {
    		var freeGlobal = require_freeGlobal();

    		/** Detect free variable `exports`. */
    		var freeExports = exports && !exports.nodeType && exports;

    		/** Detect free variable `module`. */
    		var freeModule = freeExports && 'object' == 'object' && module && !module.nodeType && module;

    		/** Detect the popular CommonJS extension `module.exports`. */
    		var moduleExports = freeModule && freeModule.exports === freeExports;

    		/** Detect free variable `process` from Node.js. */
    		var freeProcess = moduleExports && freeGlobal.process;

    		/** Used to access faster Node.js helpers. */
    		var nodeUtil = (function() {
    		  try {
    		    // Use `util.types` for Node.js 10+.
    		    var types = freeModule && freeModule.require && freeModule.require('util').types;

    		    if (types) {
    		      return types;
    		    }

    		    // Legacy `process.binding('util')` for Node.js < 10.
    		    return freeProcess && freeProcess.binding && freeProcess.binding('util');
    		  } catch (e) {}
    		}());

    		module.exports = nodeUtil; 
    	} (_nodeUtil, _nodeUtil.exports));
    	return _nodeUtil.exports;
    }

    var isTypedArray_1;
    var hasRequiredIsTypedArray;

    function requireIsTypedArray () {
    	if (hasRequiredIsTypedArray) return isTypedArray_1;
    	hasRequiredIsTypedArray = 1;
    	var baseIsTypedArray = require_baseIsTypedArray(),
    	    baseUnary = require_baseUnary(),
    	    nodeUtil = require_nodeUtil();

    	/* Node.js helper references. */
    	var nodeIsTypedArray = nodeUtil && nodeUtil.isTypedArray;

    	/**
    	 * Checks if `value` is classified as a typed array.
    	 *
    	 * @static
    	 * @memberOf _
    	 * @since 3.0.0
    	 * @category Lang
    	 * @param {*} value The value to check.
    	 * @returns {boolean} Returns `true` if `value` is a typed array, else `false`.
    	 * @example
    	 *
    	 * _.isTypedArray(new Uint8Array);
    	 * // => true
    	 *
    	 * _.isTypedArray([]);
    	 * // => false
    	 */
    	var isTypedArray = nodeIsTypedArray ? baseUnary(nodeIsTypedArray) : baseIsTypedArray;

    	isTypedArray_1 = isTypedArray;
    	return isTypedArray_1;
    }

    var isEmpty_1;
    var hasRequiredIsEmpty;

    function requireIsEmpty () {
    	if (hasRequiredIsEmpty) return isEmpty_1;
    	hasRequiredIsEmpty = 1;
    	var baseKeys = require_baseKeys(),
    	    getTag = require_getTag(),
    	    isArguments = requireIsArguments(),
    	    isArray = requireIsArray(),
    	    isArrayLike = requireIsArrayLike(),
    	    isBuffer = requireIsBuffer(),
    	    isPrototype = require_isPrototype(),
    	    isTypedArray = requireIsTypedArray();

    	/** `Object#toString` result references. */
    	var mapTag = '[object Map]',
    	    setTag = '[object Set]';

    	/** Used for built-in method references. */
    	var objectProto = Object.prototype;

    	/** Used to check objects for own properties. */
    	var hasOwnProperty = objectProto.hasOwnProperty;

    	/**
    	 * Checks if `value` is an empty object, collection, map, or set.
    	 *
    	 * Objects are considered empty if they have no own enumerable string keyed
    	 * properties.
    	 *
    	 * Array-like values such as `arguments` objects, arrays, buffers, strings, or
    	 * jQuery-like collections are considered empty if they have a `length` of `0`.
    	 * Similarly, maps and sets are considered empty if they have a `size` of `0`.
    	 *
    	 * @static
    	 * @memberOf _
    	 * @since 0.1.0
    	 * @category Lang
    	 * @param {*} value The value to check.
    	 * @returns {boolean} Returns `true` if `value` is empty, else `false`.
    	 * @example
    	 *
    	 * _.isEmpty(null);
    	 * // => true
    	 *
    	 * _.isEmpty(true);
    	 * // => true
    	 *
    	 * _.isEmpty(1);
    	 * // => true
    	 *
    	 * _.isEmpty([1, 2, 3]);
    	 * // => false
    	 *
    	 * _.isEmpty({ 'a': 1 });
    	 * // => false
    	 */
    	function isEmpty(value) {
    	  if (value == null) {
    	    return true;
    	  }
    	  if (isArrayLike(value) &&
    	      (isArray(value) || typeof value == 'string' || typeof value.splice == 'function' ||
    	        isBuffer(value) || isTypedArray(value) || isArguments(value))) {
    	    return !value.length;
    	  }
    	  var tag = getTag(value);
    	  if (tag == mapTag || tag == setTag) {
    	    return !value.size;
    	  }
    	  if (isPrototype(value)) {
    	    return !baseKeys(value).length;
    	  }
    	  for (var key in value) {
    	    if (hasOwnProperty.call(value, key)) {
    	      return false;
    	    }
    	  }
    	  return true;
    	}

    	isEmpty_1 = isEmpty;
    	return isEmpty_1;
    }

    var isEmptyExports = requireIsEmpty();
    var isEmpty = /*@__PURE__*/getDefaultExportFromCjs(isEmptyExports);

    var __async$n = (__this, __arguments, generator) => {
      return new Promise((resolve, reject) => {
        var fulfilled = (value) => {
          try {
            step(generator.next(value));
          } catch (e) {
            reject(e);
          }
        };
        var rejected = (value) => {
          try {
            step(generator.throw(value));
          } catch (e) {
            reject(e);
          }
        };
        var step = (x) => x.done ? resolve(x.value) : Promise.resolve(x.value).then(fulfilled, rejected);
        step((generator = generator.apply(__this, __arguments)).next());
      });
    };
    class LoadConfig {
      constructor() {
        this.webDynamicConfig = null;
        this.client_version = "";
        this.domain = "";
      }
      static getInstance() {
        if (!this._instance) {
          this._instance = new LoadConfig();
        }
        return this._instance;
      }
      initialize(webDynamicConfig, domain, version) {
        this.webDynamicConfig = webDynamicConfig;
        this.client_version = version;
        this.domain = domain;
      }
      onProdJsonLoaded() {
        var _a;
        if (this.isWindows) {
          (_a = window.uwp_preloader) == null ? void 0 : _a.removeLoginPanelAndAddCanvas();
        }
        this.setStartOptions();
        this.setServerPath();
        this.setStubLogin();
        this.getJS();
      }
      setStartOptions() {
        var _a;
        getAppVars().isUserMigrationRegistrationEnabled = !!((_a = this.webDynamicConfig) == null ? void 0 : _a.getKey("mobile_user_registration", "is_migration_registration_enabled"));
        getAppVars().targetMarket = PlatformEnv.getInstance().marketId;
        getAppVars().applicationMembership = 3;
        getAppVars().is_low_performance = this.isLowPerformance();
        getAppVars().ram_size = this.getRamSize();
        getAppVars().is_pwa = window.getSettingsInstance().getBooleanItem("is_pwa");
        getAppVars().is_mobile = true;
        if (window.getSettingsInstance().isEmpty("selected_assets_version")) {
          window.getSettingsInstance().setItem("selected_assets_version", "default");
        }
        getAppVars().mobileAssetsVersion = window.getSettingsInstance().getItem("selected_assets_version");
        const embeddedAssetsGroup = this.getEmbeddedAssetsGroup();
        const remoteAssetsGroup = this.getDynamicAssetsGroup();
        getAppVars().embedded_assets_group = embeddedAssetsGroup;
        getAppVars().haxe_assets_group = remoteAssetsGroup;
        nativeLogger.info(`Embedded resolution: ${embeddedAssetsGroup}, remote resolution: ${remoteAssetsGroup}`);
      }
      setServerPath() {
        var _a;
        getFlashVars().web_server_path = (_a = this.webDynamicConfig) == null ? void 0 : _a.getKey("stage_data", "og_composer_url");
        getAppVars().assets_server_path = this.domain.replace(/\/stage\//g, "/playtika/") + "vs_fb_en/assets_haxe/";
        getAppVars().haxe_assets_server = getAppVars().assets_server_path + `cid_{0}/_hx_assets_${getAppVars().haxe_assets_group}/`;
        getAppVars().new_haxe_assets_server = getAppVars().assets_server_path.replace("vs_fb_en/assets_haxe", "vs_fb_en_haxe/assets");
      }
      setStubLogin() {
        getFlashVars().gsud = "30000";
        getFlashVars().viewer_id = "";
        getFlashVars().viewer_first_name = "Name";
        getFlashVars().viewer_last_name = "Surename";
        getFlashVars().smid_token = "f849010d810ea0e57a94499334c100e2";
        getFlashVars().ocid = "123123124";
        getFlashVars().ocidEmail = "email@mail.com";
      }
      getJS() {
        return __async$n(this, null, function* () {
          const client = getAppVars().client;
          const embeddedVersion = PlatformEnv.getInstance().clientVersion;
          nativeLogger.info(`DC_INFO: Client src: ${client.location}, embeddedVersion: ${embeddedVersion}, version to start: ${client.version}`);
          const entryPoint = "VideoSlots.js";
          const vendors = [
            "webgl-memory.js"
          ];
          if (this.isWindows) {
            const isLoadFromStage = window.getSettingsInstance().getBooleanItem("is_load_from_stage");
            const baseUrl = isLoadFromStage ? `${this.domain}vs_fb_en_haxe/clients/Slotomania/${this.client_version}` : "client";
            yield Promise.all(["lib/webfont.js", "lib/pako.js"].map((script) => addScript(`${baseUrl}/${script}`)));
            yield Promise.all(vendors.map((src) => addScript(`${baseUrl}/${src}`)));
            yield addScript(`${isLoadFromStage ? baseUrl : client.location}/${entryPoint}`);
          } else {
            yield Promise.all(vendors.map((src) => addScript(`${client.location}/${src}`)));
            yield addScript(`${client.location}/${entryPoint}`);
          }
        });
      }
      detectAssetsGroup() {
        if (this.isWindows) {
          return this.detectWindowsAssetsGroup();
        } else if (this.isGooglePlay) {
          return this.detectGooglePlayAssetsGroup();
        } else {
          return this.detectAndroidAssetsGroup();
        }
      }
      detectWindowsAssetsGroup() {
        const screenInfo = app_vars.deviceInfo.screen_info;
        const embeddedResolution = PlatformEnv.getInstance().resolution;
        if (!isEmpty(embeddedResolution) || embeddedResolution > 0) {
          return embeddedResolution;
        }
        const resource = window.getSettingsInstance().getItem("resource");
        if (!resource || isEmpty(resource) || resource === "default") {
          const density = screenInfo == null ? void 0 : screenInfo.densityBucket;
          if (getAppVars().is_low_performance || ["mdpi", "hdpi", "xhdpi"].includes(density)) {
            return 480;
          }
          return 640;
        }
        return parseInt(resource, 10);
      }
      detectGooglePlayAssetsGroup() {
        const embeddedResolutions = getAppVars().embeddedResolutions;
        if (embeddedResolutions && embeddedResolutions.length) {
          return embeddedResolutions.reduce((prev, curr) => Math.max(prev, curr));
        }
        return this.detectAndroidAssetsGroup();
      }
      detectAndroidAssetsGroup() {
        const screenInfo = app_vars.deviceInfo.screen_info;
        const density = screenInfo ? screenInfo.densityBucket : null;
        return ["xxxhdpi", "xxhdpi"].includes(density) ? 640 : 480;
      }
      getEmbeddedAssetsGroup() {
        return PlatformEnv.getInstance().resolution || this.detectAssetsGroup();
      }
      isLowPerformance() {
        var _a;
        if (this.isWindows) {
          return false;
        }
        if (this.isGooglePlay) {
          const embeddedResolutions = getAppVars().embeddedResolutions;
          if (embeddedResolutions && embeddedResolutions.length) {
            return embeddedResolutions.includes(480);
          }
        }
        const ramSizeMb = this.getRamSize();
        const lowPerformanceThresholdValue = (_a = this.webDynamicConfig) == null ? void 0 : _a.getKey("config", "low_performance_threshold");
        const lowPerformanceThreshold = typeof lowPerformanceThresholdValue === "string" ? parseInt(lowPerformanceThresholdValue) : lowPerformanceThresholdValue;
        if (!lowPerformanceThreshold) {
          return false;
        }
        return lowPerformanceThreshold > 0 && ramSizeMb > 0 && ramSizeMb <= lowPerformanceThreshold;
      }
      getDynamicAssetsGroup() {
        if (this.isLowPerformance()) {
          nativeLogger.info("Low performance mode detected, falling back to 480p remote assets.");
          return 480;
        }
        return this.getEmbeddedAssetsGroup();
      }
      getRamSize() {
        const market = PlatformEnv.getInstance().market;
        let ramSize = getAppVars().deviceInfo.getRamSize();
        if (market === "appstore") {
          ramSize = ramSize / 1048576;
        }
        return ramSize;
      }
      get isGooglePlay() {
        return PlatformEnv.getInstance().market === "googleplay";
      }
      get isWindows() {
        return PlatformEnv.getInstance().platform === "windows";
      }
    }

    /**
     * Checks if `value` is `null` or `undefined`.
     *
     * @static
     * @memberOf _
     * @since 4.0.0
     * @category Lang
     * @param {*} value The value to check.
     * @returns {boolean} Returns `true` if `value` is nullish, else `false`.
     * @example
     *
     * _.isNil(null);
     * // => true
     *
     * _.isNil(void 0);
     * // => true
     *
     * _.isNil(NaN);
     * // => false
     */

    var isNil_1;
    var hasRequiredIsNil;

    function requireIsNil () {
    	if (hasRequiredIsNil) return isNil_1;
    	hasRequiredIsNil = 1;
    	function isNil(value) {
    	  return value == null;
    	}

    	isNil_1 = isNil;
    	return isNil_1;
    }

    var isNilExports = requireIsNil();
    var isNil = /*@__PURE__*/getDefaultExportFromCjs(isNilExports);

    function md5(value) {
      function RotateLeft(lValue, iShiftBits) {
        return lValue << iShiftBits | lValue >>> 32 - iShiftBits;
      }
      function AddUnsigned(lX, lY) {
        const lX8 = lX & 2147483648;
        const lY8 = lY & 2147483648;
        const lX4 = lX & 1073741824;
        const lY4 = lY & 1073741824;
        const lResult = (lX & 1073741823) + (lY & 1073741823);
        if (lX4 & lY4) {
          return lResult ^ 2147483648 ^ lX8 ^ lY8;
        }
        if (lX4 | lY4) {
          if (lResult & 1073741824) {
            return lResult ^ 3221225472 ^ lX8 ^ lY8;
          } else {
            return lResult ^ 1073741824 ^ lX8 ^ lY8;
          }
        } else {
          return lResult ^ lX8 ^ lY8;
        }
      }
      function F(x2, y, z) {
        return x2 & y | ~x2 & z;
      }
      function G(x2, y, z) {
        return x2 & z | y & ~z;
      }
      function H(x2, y, z) {
        return x2 ^ y ^ z;
      }
      function I(x2, y, z) {
        return y ^ (x2 | ~z);
      }
      function FF(a2, b2, c2, d2, x2, s, ac) {
        a2 = AddUnsigned(a2, AddUnsigned(AddUnsigned(F(b2, c2, d2), x2), ac));
        return AddUnsigned(RotateLeft(a2, s), b2);
      }
      function GG(a2, b2, c2, d2, x2, s, ac) {
        a2 = AddUnsigned(a2, AddUnsigned(AddUnsigned(G(b2, c2, d2), x2), ac));
        return AddUnsigned(RotateLeft(a2, s), b2);
      }
      function HH(a2, b2, c2, d2, x2, s, ac) {
        a2 = AddUnsigned(a2, AddUnsigned(AddUnsigned(H(b2, c2, d2), x2), ac));
        return AddUnsigned(RotateLeft(a2, s), b2);
      }
      function II(a2, b2, c2, d2, x2, s, ac) {
        a2 = AddUnsigned(a2, AddUnsigned(AddUnsigned(I(b2, c2, d2), x2), ac));
        return AddUnsigned(RotateLeft(a2, s), b2);
      }
      function ConvertToWordArray(str) {
        let lWordCount;
        const lMessageLength = str.length;
        const lNumberOfWords_temp1 = lMessageLength + 8;
        const lNumberOfWords_temp2 = (lNumberOfWords_temp1 - lNumberOfWords_temp1 % 64) / 64;
        const lNumberOfWords = (lNumberOfWords_temp2 + 1) * 16;
        const lWordArray = Array(lNumberOfWords - 1);
        let lBytePosition = 0;
        let lByteCount = 0;
        while (lByteCount < lMessageLength) {
          lWordCount = (lByteCount - lByteCount % 4) / 4;
          lBytePosition = lByteCount % 4 * 8;
          lWordArray[lWordCount] = lWordArray[lWordCount] | str.charCodeAt(lByteCount) << lBytePosition;
          lByteCount++;
        }
        lWordCount = (lByteCount - lByteCount % 4) / 4;
        lBytePosition = lByteCount % 4 * 8;
        lWordArray[lWordCount] = lWordArray[lWordCount] | 128 << lBytePosition;
        lWordArray[lNumberOfWords - 2] = lMessageLength << 3;
        lWordArray[lNumberOfWords - 1] = lMessageLength >>> 29;
        return lWordArray;
      }
      function WordToHex(lValue) {
        let wordToHexValue = "";
        let wordToHexValue_temp = "";
        let lByte, lCount;
        for (lCount = 0; lCount <= 3; lCount++) {
          lByte = lValue >>> lCount * 8 & 255;
          wordToHexValue_temp = "0" + lByte.toString(16);
          wordToHexValue = wordToHexValue + wordToHexValue_temp.substr(wordToHexValue_temp.length - 2, 2);
        }
        return wordToHexValue;
      }
      function Utf8Encode(string) {
        string = string.replace(/\r\n/g, "\n");
        let utftext = "";
        for (let n = 0; n < string.length; n++) {
          const c2 = string.charCodeAt(n);
          if (c2 < 128) {
            utftext += String.fromCharCode(c2);
          } else if (c2 > 127 && c2 < 2048) {
            utftext += String.fromCharCode(c2 >> 6 | 192);
            utftext += String.fromCharCode(c2 & 63 | 128);
          } else {
            utftext += String.fromCharCode(c2 >> 12 | 224);
            utftext += String.fromCharCode(c2 >> 6 & 63 | 128);
            utftext += String.fromCharCode(c2 & 63 | 128);
          }
        }
        return utftext;
      }
      let x = [];
      let k, AA, BB, CC, DD, a, b, c, d;
      const S11 = 7;
      const S12 = 12;
      const S13 = 17;
      const S14 = 22;
      const S21 = 5;
      const S22 = 9;
      const S23 = 14;
      const S24 = 20;
      const S31 = 4;
      const S32 = 11;
      const S33 = 16;
      const S34 = 23;
      const S41 = 6;
      const S42 = 10;
      const S43 = 15;
      const S44 = 21;
      value = Utf8Encode(value);
      x = ConvertToWordArray(value);
      a = 1732584193;
      b = 4023233417;
      c = 2562383102;
      d = 271733878;
      for (k = 0; k < x.length; k += 16) {
        AA = a;
        BB = b;
        CC = c;
        DD = d;
        a = FF(a, b, c, d, x[k + 0], S11, 3614090360);
        d = FF(d, a, b, c, x[k + 1], S12, 3905402710);
        c = FF(c, d, a, b, x[k + 2], S13, 606105819);
        b = FF(b, c, d, a, x[k + 3], S14, 3250441966);
        a = FF(a, b, c, d, x[k + 4], S11, 4118548399);
        d = FF(d, a, b, c, x[k + 5], S12, 1200080426);
        c = FF(c, d, a, b, x[k + 6], S13, 2821735955);
        b = FF(b, c, d, a, x[k + 7], S14, 4249261313);
        a = FF(a, b, c, d, x[k + 8], S11, 1770035416);
        d = FF(d, a, b, c, x[k + 9], S12, 2336552879);
        c = FF(c, d, a, b, x[k + 10], S13, 4294925233);
        b = FF(b, c, d, a, x[k + 11], S14, 2304563134);
        a = FF(a, b, c, d, x[k + 12], S11, 1804603682);
        d = FF(d, a, b, c, x[k + 13], S12, 4254626195);
        c = FF(c, d, a, b, x[k + 14], S13, 2792965006);
        b = FF(b, c, d, a, x[k + 15], S14, 1236535329);
        a = GG(a, b, c, d, x[k + 1], S21, 4129170786);
        d = GG(d, a, b, c, x[k + 6], S22, 3225465664);
        c = GG(c, d, a, b, x[k + 11], S23, 643717713);
        b = GG(b, c, d, a, x[k + 0], S24, 3921069994);
        a = GG(a, b, c, d, x[k + 5], S21, 3593408605);
        d = GG(d, a, b, c, x[k + 10], S22, 38016083);
        c = GG(c, d, a, b, x[k + 15], S23, 3634488961);
        b = GG(b, c, d, a, x[k + 4], S24, 3889429448);
        a = GG(a, b, c, d, x[k + 9], S21, 568446438);
        d = GG(d, a, b, c, x[k + 14], S22, 3275163606);
        c = GG(c, d, a, b, x[k + 3], S23, 4107603335);
        b = GG(b, c, d, a, x[k + 8], S24, 1163531501);
        a = GG(a, b, c, d, x[k + 13], S21, 2850285829);
        d = GG(d, a, b, c, x[k + 2], S22, 4243563512);
        c = GG(c, d, a, b, x[k + 7], S23, 1735328473);
        b = GG(b, c, d, a, x[k + 12], S24, 2368359562);
        a = HH(a, b, c, d, x[k + 5], S31, 4294588738);
        d = HH(d, a, b, c, x[k + 8], S32, 2272392833);
        c = HH(c, d, a, b, x[k + 11], S33, 1839030562);
        b = HH(b, c, d, a, x[k + 14], S34, 4259657740);
        a = HH(a, b, c, d, x[k + 1], S31, 2763975236);
        d = HH(d, a, b, c, x[k + 4], S32, 1272893353);
        c = HH(c, d, a, b, x[k + 7], S33, 4139469664);
        b = HH(b, c, d, a, x[k + 10], S34, 3200236656);
        a = HH(a, b, c, d, x[k + 13], S31, 681279174);
        d = HH(d, a, b, c, x[k + 0], S32, 3936430074);
        c = HH(c, d, a, b, x[k + 3], S33, 3572445317);
        b = HH(b, c, d, a, x[k + 6], S34, 76029189);
        a = HH(a, b, c, d, x[k + 9], S31, 3654602809);
        d = HH(d, a, b, c, x[k + 12], S32, 3873151461);
        c = HH(c, d, a, b, x[k + 15], S33, 530742520);
        b = HH(b, c, d, a, x[k + 2], S34, 3299628645);
        a = II(a, b, c, d, x[k + 0], S41, 4096336452);
        d = II(d, a, b, c, x[k + 7], S42, 1126891415);
        c = II(c, d, a, b, x[k + 14], S43, 2878612391);
        b = II(b, c, d, a, x[k + 5], S44, 4237533241);
        a = II(a, b, c, d, x[k + 12], S41, 1700485571);
        d = II(d, a, b, c, x[k + 3], S42, 2399980690);
        c = II(c, d, a, b, x[k + 10], S43, 4293915773);
        b = II(b, c, d, a, x[k + 1], S44, 2240044497);
        a = II(a, b, c, d, x[k + 8], S41, 1873313359);
        d = II(d, a, b, c, x[k + 15], S42, 4264355552);
        c = II(c, d, a, b, x[k + 6], S43, 2734768916);
        b = II(b, c, d, a, x[k + 13], S44, 1309151649);
        a = II(a, b, c, d, x[k + 4], S41, 4149444226);
        d = II(d, a, b, c, x[k + 11], S42, 3174756917);
        c = II(c, d, a, b, x[k + 2], S43, 718787259);
        b = II(b, c, d, a, x[k + 9], S44, 3951481745);
        a = AddUnsigned(a, AA);
        b = AddUnsigned(b, BB);
        c = AddUnsigned(c, CC);
        d = AddUnsigned(d, DD);
      }
      const temp = WordToHex(a) + WordToHex(b) + WordToHex(c) + WordToHex(d);
      return temp.toLowerCase();
    }

    const sentry = window.SentryProxy;
    function loadUrlWithCallback(url, callback, randomize, isPost, responseType, additionalParams) {
      const request = new XMLHttpRequest();
      if (randomize) {
        url += "?ver=" + getNoCacheId();
      }
      if (responseType) {
        request.responseType = responseType;
      }
      if (isPost) {
        request.open("POST", url);
      } else {
        request.open("GET", url);
      }
      request.onload = () => {
        callback(request, additionalParams);
      };
      request.onerror = (e) => {
        sentry.captureException(new Error(`OOPS POPUP INITIATOR ${request.status} ${url}`));
        if (e && e.status == 0) {
          usePreloader((preloader) => {
            preloader.showConnectionError(e);
          });
        } else {
          usePreloader((preloader) => {
            preloader.showGenericError(e);
          });
        }
      };
      request.send();
    }
    function loadUrlWithRetry(url, callback, randomize, retryCount, isPost, responseType, additionalParams, failCallback) {
      let count = retryCount;
      const retryCallback = function(request) {
        if (request.status === 0 || request.status >= 200 && request.status < 400 || count <= 0) {
          if (failCallback && count <= 0) {
            failCallback(url, request.status, request.response);
          }
          callback(request);
        } else {
          count--;
          loadUrlWithCallback(url, retryCallback, randomize, isPost, responseType, additionalParams);
        }
      };
      loadUrlWithCallback(url, retryCallback, randomize, isPost, responseType, additionalParams);
    }
    function sendHttpRequest(url, method, body, onResult, onError, headers) {
      const request = new XMLHttpRequest();
      request.open(method, url);
      if (headers) {
        for (const keyValue of headers) {
          request.setRequestHeader(keyValue[0], keyValue[1]);
        }
      }
      request.onload = () => {
        if (request.status >= 200 && request.status < 400) {
          const result = JSON.parse(request.response);
          onResult(result);
        } else {
          onError(new Error(`HttpRequest failed. Status: ${request.status}`));
        }
      };
      request.onerror = () => {
        onError(new Error(`HttpRequest error. ErrorCode: ${request.errorCode}`));
      };
      request.send(JSON.stringify(body));
    }

    class Standalone {
      static login() {
        nativeLogger.info("INFO: Login::SA");
        const isStandaloneAfterFacebookFailed = false;
        getAppVars().isStandaloneAfterFacebookFailed = isStandaloneAfterFacebookFailed;
        const info = { key: "isStandaloneAfterFacebookFailed", val: isStandaloneAfterFacebookFailed, dir: "Settings" };
        document.dispatchEvent(new CustomEvent("setObjDataOnDisk", { detail: info }));
        window.setLoginType(LOGIN_TYPES.STANDALONE);
        window.startApp();
      }
      static loginAfterFacebookFailed() {
        nativeLogger.info("INFO: Login::SA after Facebook failed");
        const isStandaloneAfterFacebookFailed = true;
        getAppVars().isStandaloneAfterFacebookFailed = isStandaloneAfterFacebookFailed;
        const info = { key: "isStandaloneAfterFacebookFailed", val: isStandaloneAfterFacebookFailed, dir: "Settings" };
        document.dispatchEvent(new CustomEvent("setObjDataOnDisk", { detail: info }));
        window.setLoginType(LOGIN_TYPES.STANDALONE);
        window.startApp();
      }
    }

    var __async$m = (__this, __arguments, generator) => {
      return new Promise((resolve, reject) => {
        var fulfilled = (value) => {
          try {
            step(generator.next(value));
          } catch (e) {
            reject(e);
          }
        };
        var rejected = (value) => {
          try {
            step(generator.throw(value));
          } catch (e) {
            reject(e);
          }
        };
        var step = (x) => x.done ? resolve(x.value) : Promise.resolve(x.value).then(fulfilled, rejected);
        step((generator = generator.apply(__this, __arguments)).next());
      });
    };
    class Facebook {
      constructor() {
        this.MIN_IOS_IDFA_AVAILABLE_VERSION = "14.4.99";
        this.params = "";
      }
      initialize(deviceInfo, simpleStorage) {
        return __async$m(this, null, function* () {
          yield this.commonInitialization(deviceInfo, simpleStorage);
        });
      }
      FBlogin(loginFromSettings) {
        return __async$m(this, null, function* () {
          var _a, _b;
          if (window.facebookConnectPlugin) {
            if (PlatformEnv.getInstance().platform === "ios" && isNewerVersion(this.MIN_IOS_IDFA_AVAILABLE_VERSION, ((_b = (_a = this.deviceInfo) == null ? void 0 : _a.device_info) == null ? void 0 : _b.version) || "") && this.loginViaLimitedFlow) {
              const IDFA_CONFIRMED_STATUS = 3;
              const idfaStatus = yield window.cordova.plugins.idfa.getStatus();
              if (idfaStatus !== IDFA_CONFIRMED_STATUS) {
                nativeLogger.info("INFO: executeFBLimitedLogin");
                this.executeFBLimitedLogin(loginFromSettings);
              } else {
                this.executeFBLogin(loginFromSettings);
              }
            } else {
              this.executeFBLogin(loginFromSettings);
            }
          }
        });
      }
      setFacebookAppParameters(fb_app_id, fb_client_token, fb_app_namespace) {
        return new Promise((resolve) => {
          window.facebookConnectPlugin.setApplicationId(fb_app_id, () => {
            nativeLogger.info("INFO: Application ID changed successfully");
          }, (error) => {
            nativeLogger.error(`ERROR: ${error}`);
          });
          if (window.facebookConnectPlugin.setClientToken) {
            window.facebookConnectPlugin.setClientToken(fb_client_token, () => {
              nativeLogger.info("INFO: Client Token changed successfully");
            }, (err) => {
              nativeLogger.error(`ERROR: ${err}`);
            });
          }
          window.facebookConnectPlugin.setApplicationName(fb_app_namespace, () => {
            nativeLogger.info("INFO: Application Name changed successfully");
            resolve();
          }, (err) => {
            this.handleFacebookError(err);
            resolve();
          });
        });
      }
      checkLoginStatus(loginFromSettings) {
        nativeLogger.info("INFO: Facebook - checkLoginStatus");
        if (PlatformEnv.getInstance().platform === "windows") {
          this.checkLoginStatusWindowsHandling(loginFromSettings);
        }
        window.facebookConnectPlugin.getLoginStatus((response) => {
          this.fbLoginStatusSuccess(response, loginFromSettings);
        }, (err) => {
          this.handleFacebookError(err);
        });
      }
      commonInitialization(deviceInfo, simpleStorage) {
        return __async$m(this, null, function* () {
          this.deviceInfo = deviceInfo;
          this.simpleStorage = simpleStorage;
          this.params = "id,gender,email,name,last_name,first_name,friends.limit(" + 1e3 + "){id},permissions,picture.width(" + 65 + ").height(" + 65 + "){url},location{location},likes{id}";
          this.loginViaLimitedFlow = false;
          if (window.getIdfaRequestEnabled) {
            this.loginViaLimitedFlow = yield window.getIdfaRequestEnabled();
          }
          document.addEventListener("facebookLogout", () => this.logout(true), false);
        });
      }
      logout(isReloadApp = true) {
        window.facebookConnectPlugin.logout((data) => {
          window.setLoginType(LOGIN_TYPES.NOT_CHOSEN);
          nativeLogger.info(`INFO: ${JSON.stringify(data)}`);
          if (isReloadApp)
            this.reload();
        }, (error) => {
          this.handleFacebookError(JSON.stringify(error));
        });
      }
      handleFacebookError(err) {
        nativeLogger.error("ERROR: Facebook login error => ", err);
        window.setLoginType(LOGIN_TYPES.NOT_CHOSEN);
        const isUserCancelledDialogError = this.isUserCancelledDialogError(err);
        if (isUserCancelledDialogError) {
          EventStreamEvents.getInstance().trackFacebookLoginUserCancelledDialog();
          usePreloader((preloader) => {
            preloader.setStage(ScreenId.LOGIN_SCREEN);
          });
        } else {
          EventStreamEvents.getInstance().trackFallbackToStandalone(err);
          Standalone.loginAfterFacebookFailed();
        }
      }
      reload() {
        document.location.reload();
      }
      executeFBLogin(loginFromSettings) {
        nativeLogger.info("INFO: Facebook - executeFBLogin");
        const isShortLivedAccessToken = (response) => {
          if (response.status === "connected" && response.authResponse && response.authResponse.expiresIn) {
            const matchResult = response.authResponse.expiresIn.match(/[0-9]+(\.)*[0-9]*/g);
            const isNumberFormat = matchResult && matchResult.length === 1;
            return isNumberFormat && parseInt(response.authResponse.expiresIn) <= 86400;
          }
          return false;
        };
        try {
          EventStreamEvents.getInstance().trackFacebookLoginStart("regular" /* REGULAR */);
          window.facebookConnectPlugin.login(["email", "public_profile"], (response) => {
            var _a, _b, _c;
            nativeLogger.info("INFO: Logging in with FB ... response => ", response);
            const hashKey = md5((_b = (_a = response.authResponse) == null ? void 0 : _a.userID) != null ? _b : "");
            const expiresIn = String((_c = response.authResponse) == null ? void 0 : _c.expiresIn);
            EventStreamEvents.getInstance().trackFacebookLoginSuccess("regular" /* REGULAR */, hashKey);
            EventStreamEvents.getInstance().trackFacebookAccessToken(expiresIn, "FB-SDK" /* FB_SDK */, hashKey);
            if ((PlatformEnv.getInstance().platform === "ios" || PlatformEnv.getInstance().platform === "android") && isShortLivedAccessToken(response) && window.facebookConnectPlugin.updateAccessTokenString) {
              EventStreamEvents.getInstance().trackFacebookAccessTokenExchange(expiresIn, hashKey);
              this.exchangeShortLivedAccessToken(response.authResponse.accessToken).then((result) => {
                const expIn = String(result.expiresIn);
                EventStreamEvents.getInstance().trackFacebookAccessTokenExchangeSuccess(expIn, hashKey);
                EventStreamEvents.getInstance().trackFacebookAccessToken(expIn, "exchange-service" /* EXCHANGE_SERVICE */, hashKey);
                window.facebookConnectPlugin.updateAccessTokenString(result.longLivedFacebookAccessToken, String(result.expiresIn), () => this.checkLoginStatus(loginFromSettings), (error) => {
                  EventStreamEvents.getInstance().trackFacebookAccessTokenUpdateError(JSON.stringify(error != null ? error : "none"), hashKey);
                  this.checkLoginStatus(loginFromSettings);
                });
              }).catch((error) => {
                EventStreamEvents.getInstance().trackFacebookAccessTokenExchangeError(error.toString(), hashKey);
                this.checkLoginStatus(loginFromSettings);
              });
            } else {
              this.checkLoginStatus(loginFromSettings);
            }
          }, (res) => {
            EventStreamEvents.getInstance().trackFacebookLoginError("regular" /* REGULAR */, res);
            this.handleFacebookError(res);
          });
        } catch (err) {
          EventStreamEvents.getInstance().trackFacebookLoginException("regular" /* REGULAR */, err);
          this.handleFacebookError(err);
        }
      }
      executeFBLimitedLogin(loginFromSettings) {
        nativeLogger.info("INFO: Facebook - executeFBLimitedLogin");
        try {
          EventStreamEvents.getInstance().trackFacebookLoginStart("limited" /* LIMITED */);
          window.facebookConnectPlugin.limitedLogin(["email", "public_profile"], "", (response) => {
            var _a, _b;
            nativeLogger.info("INFO: Logging in with FB ... response => ", response);
            EventStreamEvents.getInstance().trackFacebookLoginSuccess("limited" /* LIMITED */, md5((_b = (_a = response.authResponse) == null ? void 0 : _a.userID) != null ? _b : ""));
            this.checkLoginStatus(loginFromSettings);
          }, (res) => {
            EventStreamEvents.getInstance().trackFacebookLoginError("limited" /* LIMITED */, res);
            this.handleFacebookError(res);
          });
        } catch (err) {
          EventStreamEvents.getInstance().trackFacebookLoginException("limited" /* LIMITED */, err);
          this.handleFacebookError(err);
        }
      }
      exchangeShortLivedAccessToken(tokenString) {
        return new Promise((resolve, reject) => {
          const url = DynamicConfig.getInstance().getKey("stage_data", "fb_mobile_exchange_token_path") + "accesstoken";
          const headers = /* @__PURE__ */ new Map();
          headers.set("Content-Type", "application/json");
          sendHttpRequest(url, "POST", { shortLivedFacebookAccessToken: tokenString }, (result) => {
            if (result.longLivedFacebookAccessToken && result.expiresIn) {
              resolve(result);
            } else {
              reject(new Error(`Incorrect response data: ${JSON.stringify(result)}`));
            }
          }, (error) => {
            reject(error);
          }, headers);
        });
      }
      isUserCancelledDialogError(error) {
        const userCanceledDialogErrorCode = 4201;
        if (typeof error === "string") {
          return error.toLowerCase().includes("user cancelled");
        } else if (typeof error === "object" && error !== null) {
          return !Number.isNaN(error.errorCode) && Number(error.errorCode) === userCanceledDialogErrorCode;
        }
        return false;
      }
      checkLoginStatusWindowsHandling(loginFromSettings) {
        var _a, _b, _c;
        if (isNil(window.getSettingsInstance().getItem("facebookLoginStatus"))) {
          try {
            let fbResponse = {};
            const id = (_a = this.simpleStorage) == null ? void 0 : _a.getValue("SocialNetwork.Id");
            if (!isNil(id)) {
              nativeLogger.info("Facebook migration - Social Network ID:", id);
              const sharpSession = (_b = this.simpleStorage) == null ? void 0 : _b.getValue(window.appID);
              if (!isNil(sharpSession)) {
                const endDate = Date.parse(((_c = sharpSession.AccessToken) == null ? void 0 : _c.ExpirationTime) || "");
                const nowDate = Date.now();
                const expiresIn = Math.floor((endDate - nowDate) / 1e3);
                nativeLogger.info("Facebook migration - Sharp session:", sharpSession);
                const authRespone = {
                  session_key: true,
                  accessToken: sharpSession.AccessToken.Token,
                  expiresIn,
                  userID: id
                };
                fbResponse = { status: "connected", authResponse: authRespone };
                nativeLogger.info("Facebook migration - FB response:", fbResponse);
                window.getSettingsInstance().setItem("facebookLoginStatus", JSON.stringify(fbResponse));
                this.fbLoginStatusSuccess(fbResponse, loginFromSettings);
              }
            }
          } catch (e) {
            nativeLogger.error("Facebook migration failed:", e);
          }
        }
      }
      fbLoginStatusSuccess(response, loginFromSettings) {
        var _a, _b, _c, _d, _e;
        const responseStatus = response.status;
        let isAccessTokenExpired = false;
        if (response.authResponse && response.authResponse.accessToken) {
          const expiresIn2 = parseInt(response.authResponse.expiresIn);
          isAccessTokenExpired = expiresIn2 === 0;
        }
        const isConnected = responseStatus === "connected";
        const loginStatus = typeof responseStatus === "string" ? responseStatus : (_a = JSON.stringify(responseStatus)) != null ? _a : "undefined";
        const loginMode = isConnected && response.authResponse ? response.authResponse.authToken ? "limited" /* LIMITED */ : "regular" /* REGULAR */ : "none" /* NONE */;
        const expiresIn = (_c = (_b = response.authResponse) == null ? void 0 : _b.expiresIn) != null ? _c : "undefined";
        const hashKey = md5((_e = (_d = response.authResponse) == null ? void 0 : _d.userID) != null ? _e : "");
        EventStreamEvents.getInstance().trackFacebookLoginStatus(loginStatus, loginMode, expiresIn, hashKey);
        if (isConnected && !isAccessTokenExpired) {
          getAppVars().social_access_token = response.authResponse.accessToken;
          getFlashVars().user_access_token = response.authResponse.accessToken;
          getAppVars().social_auth_token = response.authResponse.authToken;
          getFlashVars().user_auth_token = response.authResponse.authToken;
          this.fbApiSuccess(response.authResponse, loginFromSettings);
        } else if (responseStatus !== null) {
          this.FBlogin(false);
        } else {
          nativeLogger.error("FB fbLoginStatusSuccess error" + responseStatus);
        }
      }
      fbApiSuccess(result, loginFromSettings) {
        const appVarsUpdateAndStart = () => {
          getAppVars().user_sn_id = result.id;
          getAppVars().social_sn_id = result.id;
          getAppVars().social_name = result.name;
          getAppVars().social_first_name = result.first_name;
          getAppVars().social_last_name = result.last_name;
          if (result.picture) {
            getAppVars().social_picture_url = result.picture.data.url;
          }
          window.startApp();
        };
        nativeLogger.info("INFO: User Authenticated!! user data => ", result);
        window.setLoginType(LOGIN_TYPES.FACEBOOK);
        if (loginFromSettings) {
          this.reload();
          return;
        }
        if (window.isAppStarted()) {
          nativeLogger.warn("WARN: Application has already started, late FB api response will be ignored.");
          return;
        }
        if (PlatformEnv.getInstance().platform === "windows") {
          appVarsUpdateAndStart();
        } else {
          usePreloader((preloader) => {
            preloader.setStage("splash");
            appVarsUpdateAndStart();
          });
        }
      }
    }

    class FirebaseAnalytics {
      static getInstance() {
        if (!this._instance) {
          this._instance = new FirebaseAnalytics();
        }
        return this._instance;
      }
      initialize() {
        if (PlatformEnv.getInstance().market === "googleplay") {
          nativeLogger.info("FirebaseAnalytics::initialize");
          document.addEventListener("analyticsLogEvent", (e) => {
            this.logEvent(e);
          }, false);
        }
      }
      logEvent(e) {
        try {
          const event = e.detail;
          window.cordova.plugins.firebase.analytics.logEvent(event.name, event.params);
        } catch (err) {
          nativeLogger.error(`FirebaseAnalytics::logEvent | event ${e}`, err);
        }
      }
    }

    function initializeGalaxyCloudSDK() {
      try {
        const { SamsungGalaxyCloud } = window.Capacitor.Plugins;
        if (SamsungGalaxyCloud) {
          window.SamsungGalaxyCloudPlugin = SamsungGalaxyCloud;
        } else {
          nativeLogger.warn(`window.Capacitor.Plugins.SamsungGalaxyCloudPlugin is empty`);
        }
      } catch (e) {
        nativeLogger.error(`ERROR: Init Galaxy SDK failed - ${e}`);
      }
    }

    const PRODUCTION_MODE = 0;
    const TEST_MODE = 1;
    function initializeGalaxyBilling(isRelease) {
      try {
        const { SamsungGalaxyIap } = window.Capacitor.Plugins;
        if (SamsungGalaxyIap) {
          SamsungGalaxyIap.setOperationMode({ operationMode: isRelease ? PRODUCTION_MODE : TEST_MODE });
          window.SamsungGalaxyBilling = SamsungGalaxyIap;
        }
      } catch (e) {
        nativeLogger.error(`ERROR: Init Galaxy IAP failed - ${e}`);
      }
    }

    var esm = {};

    var hasRequiredEsm;

    function requireEsm () {
    	if (hasRequiredEsm) return esm;
    	hasRequiredEsm = 1;
    	Object.defineProperty(esm, "__esModule", { value: true });
    	esm.ConnectionResult = void 0;
    	var ConnectionResult;
    	(function (ConnectionResult) {
    	    ConnectionResult[ConnectionResult["UNKNOWN"] = -1] = "UNKNOWN";
    	    ConnectionResult[ConnectionResult["SUCCESS"] = 0] = "SUCCESS";
    	    ConnectionResult[ConnectionResult["SERVICE_MISSING"] = 1] = "SERVICE_MISSING";
    	    ConnectionResult[ConnectionResult["SERVICE_VERSION_UPDATE_REQUIRED"] = 2] = "SERVICE_VERSION_UPDATE_REQUIRED";
    	    ConnectionResult[ConnectionResult["SERVICE_DISABLED"] = 3] = "SERVICE_DISABLED";
    	    ConnectionResult[ConnectionResult["SIGN_IN_REQUIRED"] = 4] = "SIGN_IN_REQUIRED";
    	    ConnectionResult[ConnectionResult["INVALID_ACCOUNT"] = 5] = "INVALID_ACCOUNT";
    	    ConnectionResult[ConnectionResult["RESOLUTION_REQUIRED"] = 6] = "RESOLUTION_REQUIRED";
    	    ConnectionResult[ConnectionResult["NETWORK_ERROR"] = 7] = "NETWORK_ERROR";
    	    ConnectionResult[ConnectionResult["INTERNAL_ERROR"] = 8] = "INTERNAL_ERROR";
    	    ConnectionResult[ConnectionResult["SERVICE_INVALID"] = 9] = "SERVICE_INVALID";
    	    ConnectionResult[ConnectionResult["DEVELOPER_ERROR"] = 10] = "DEVELOPER_ERROR";
    	    ConnectionResult[ConnectionResult["LICENSE_CHECK_FAILED"] = 11] = "LICENSE_CHECK_FAILED";
    	    ConnectionResult[ConnectionResult["CANCELED"] = 13] = "CANCELED";
    	    ConnectionResult[ConnectionResult["TIMEOUT"] = 14] = "TIMEOUT";
    	    ConnectionResult[ConnectionResult["INTERRUPTED"] = 15] = "INTERRUPTED";
    	    ConnectionResult[ConnectionResult["API_UNAVAILABLE"] = 16] = "API_UNAVAILABLE";
    	    ConnectionResult[ConnectionResult["SIGN_IN_FAILED"] = 17] = "SIGN_IN_FAILED";
    	    ConnectionResult[ConnectionResult["SERVICE_UPDATING"] = 18] = "SERVICE_UPDATING";
    	    ConnectionResult[ConnectionResult["SERVICE_MISSING_PERMISSION"] = 19] = "SERVICE_MISSING_PERMISSION";
    	    ConnectionResult[ConnectionResult["RESTRICTED_PROFILE"] = 20] = "RESTRICTED_PROFILE";
    	    ConnectionResult[ConnectionResult["RESOLUTION_ACTIVITY_NOT_FOUND"] = 22] = "RESOLUTION_ACTIVITY_NOT_FOUND";
    	    ConnectionResult[ConnectionResult["API_DISABLED"] = 23] = "API_DISABLED";
    	    ConnectionResult[ConnectionResult["API_DISABLED_FOR_CONNECTION"] = 24] = "API_DISABLED_FOR_CONNECTION";
    	})(ConnectionResult || (esm.ConnectionResult = ConnectionResult = {}));
    	return esm;
    }

    var esmExports = requireEsm();

    var __async$l = (__this, __arguments, generator) => {
      return new Promise((resolve, reject) => {
        var fulfilled = (value) => {
          try {
            step(generator.next(value));
          } catch (e) {
            reject(e);
          }
        };
        var rejected = (value) => {
          try {
            step(generator.throw(value));
          } catch (e) {
            reject(e);
          }
        };
        var step = (x) => x.done ? resolve(x.value) : Promise.resolve(x.value).then(fulfilled, rejected);
        step((generator = generator.apply(__this, __arguments)).next());
      });
    };
    class GooglePlayGamesServices {
      constructor(_plugin, _eventStream) {
        this._plugin = _plugin;
        this._eventStream = _eventStream;
      }
      isGooglePlayServicesAvailable() {
        return __async$l(this, null, function* () {
          return this._plugin.isGooglePlayServicesAvailable();
        });
      }
      isAuthenticated() {
        return __async$l(this, null, function* () {
          try {
            const authResult = yield this._plugin.isAuthenticated();
            this._eventStream.trackIsAuthenticatedStatus(authResult);
            return { success: true, data: authResult };
          } catch (error) {
            this._eventStream.trackIsAuthenticatedError(error);
            return { success: false, error };
          }
        });
      }
      signIn() {
        return __async$l(this, null, function* () {
          try {
            const authResult = yield this._plugin.signIn();
            this._eventStream.trackSignInStatus(authResult);
            return { success: true, data: authResult };
          } catch (error) {
            this._eventStream.trackSignInError(error);
            return { success: false, error };
          }
        });
      }
      requestServerSideAccess(params) {
        return __async$l(this, null, function* () {
          try {
            const authResponse = yield this._plugin.requestServerSideAccess(params);
            this._eventStream.trackServerSideAccessStatus(authResponse);
            return { success: true, data: authResponse };
          } catch (error) {
            this._eventStream.trackServerSideAccessError(error);
            return { success: false, error };
          }
        });
      }
      getCurrentPlayer() {
        return __async$l(this, null, function* () {
          try {
            const player = yield this._plugin.getCurrentPlayer();
            this._eventStream.trackCurrentPlayer(player);
            return { success: true, data: player };
          } catch (error) {
            this._eventStream.trackCurrentPlayerError(error);
            return { success: false, error };
          }
        });
      }
    }

    var __async$k = (__this, __arguments, generator) => {
      return new Promise((resolve, reject) => {
        var fulfilled = (value) => {
          try {
            step(generator.next(value));
          } catch (e) {
            reject(e);
          }
        };
        var rejected = (value) => {
          try {
            step(generator.throw(value));
          } catch (e) {
            reject(e);
          }
        };
        var step = (x) => x.done ? resolve(x.value) : Promise.resolve(x.value).then(fulfilled, rejected);
        step((generator = generator.apply(__this, __arguments)).next());
      });
    };
    class GooglePlayGames {
      constructor(_googlePlayGamesServices) {
        this._googlePlayGamesServices = _googlePlayGamesServices;
      }
      static init(plugin, eventStream, settings) {
        return __async$k(this, null, function* () {
          let googlePlayGamesServices;
          if (plugin) {
            googlePlayGamesServices = new GooglePlayGamesServices(plugin, eventStream);
            const availabilityResult = yield googlePlayGamesServices.isGooglePlayServicesAvailable();
            settings.isGooglePlayServicesAvailable = availabilityResult.resultCode === esmExports.ConnectionResult.SUCCESS;
            settings.hasPlugin = true;
          }
          eventStream.trackStatus(settings);
          return settings.isEnabled && googlePlayGamesServices ? new GooglePlayGames(googlePlayGamesServices) : void 0;
        });
      }
      isAuthenticated() {
        return this._googlePlayGamesServices.isAuthenticated();
      }
      login(params) {
        return __async$k(this, null, function* () {
          let signInResult = yield this.isAuthenticated();
          if (signInResult.success && !signInResult.data.isAuthenticated) {
            signInResult = yield this._googlePlayGamesServices.signIn();
          }
          if (signInResult.success && signInResult.data.isAuthenticated) {
            return this._googlePlayGamesServices.requestServerSideAccess(params);
          }
          const error = signInResult.success ? "not authenticated" : signInResult.error;
          return Promise.resolve({ success: false, error });
        });
      }
      getCurrentPlayer() {
        return this._googlePlayGamesServices.getCurrentPlayer();
      }
    }

    const _GooglePlayGamesSettings = class {
      constructor(_dynamicConfig) {
        this._dynamicConfig = _dynamicConfig;
        this.hasPlugin = false;
        this.isGooglePlayServicesAvailable = false;
        this._configKey = "google_play_games";
        const isEnabled = this._dynamicConfig.getBool(this._configKey, "enabled");
        this.isEnabledByConfig = isEnabled && this.isInPercentRollout();
      }
      static init(dynamicConfig) {
        _GooglePlayGamesSettings._instance = new _GooglePlayGamesSettings(dynamicConfig);
      }
      static get instance() {
        if (!_GooglePlayGamesSettings._instance) {
          throw new Error("GooglePlayGamesSettings not initialized. Call GooglePlayGamesSettings.init() first.");
        }
        return _GooglePlayGamesSettings._instance;
      }
      get isEnabled() {
        return this.isEnabledByConfig && this.hasPlugin && this.isGooglePlayServicesAvailable;
      }
      isInPercentRollout() {
        const percentage = Number(this._dynamicConfig.getKey(this._configKey, "enabled_percentage"));
        if (!percentage) {
          nativeLogger.error("ERROR: GooglePlayGamesSettings enabled_percentage is not set");
          return false;
        }
        return this.getRolloutBucket() <= percentage;
      }
      getRolloutBucket() {
        let rolloutBucket = Number(window.localStorage.getItem(_GooglePlayGamesSettings.ROLLOUT_BUCKET_KEY));
        if (!rolloutBucket) {
          rolloutBucket = Math.max(Number.EPSILON, Math.floor(Math.random() * 100));
          window.localStorage.setItem(_GooglePlayGamesSettings.ROLLOUT_BUCKET_KEY, rolloutBucket.toString());
        }
        return rolloutBucket;
      }
    };
    let GooglePlayGamesSettings = _GooglePlayGamesSettings;
    GooglePlayGamesSettings.ROLLOUT_BUCKET_KEY = "gpg_rollout_bucket";

    const eventTypes = {
      GPG_STATUS: "GPG_STATUS",
      GPG_IS_AUTHENTICATED: "GPG_IS_AUTHENTICATED",
      GPG_IS_AUTHENTICATED_ERROR: "GPG_IS_AUTHENTICATED_ERROR",
      GPG_SIGN_IN: "GPG_SIGN_IN",
      GPG_SIGN_IN_ERROR: "GPG_SIGN_IN_ERROR",
      GPG_SERVER_SIDE_ACCESS: "GPG_SERVER_SIDE_ACCESS",
      GPG_SERVER_SIDE_ACCESS_ERROR: "GPG_SERVER_SIDE_ACCESS_ERROR",
      GPG_CURRENT_PLAYER: "GPG_CURRENT_PLAYER",
      GPG_CURRENT_PLAYER_ERROR: "GPG_CURRENT_PLAYER_ERROR"
    };
    class GooglePlayGamesEventStream {
      constructor(_tracking) {
        this._tracking = _tracking;
      }
      trackStatus(settings) {
        const event = this.getBaseEventData(eventTypes.GPG_STATUS);
        event.has_plugin = settings.hasPlugin;
        event.google_play_services_available = settings.isGooglePlayServicesAvailable;
        event.enabled_by_config = settings.isEnabledByConfig;
        event.settings_enabled = settings.isEnabled;
        event.rollout_bucket = String(window.localStorage.getItem(GooglePlayGamesSettings.ROLLOUT_BUCKET_KEY));
        this.logAndSendEvent(event);
      }
      trackIsAuthenticatedStatus(authResult) {
        const event = this.getBaseEventData(eventTypes.GPG_IS_AUTHENTICATED);
        event.is_authenticated = authResult.isAuthenticated;
        this.logAndSendEvent(event);
      }
      trackIsAuthenticatedError(error) {
        const event = this.getBaseEventData(eventTypes.GPG_IS_AUTHENTICATED_ERROR);
        event.error = String(error);
        this.logAndSendEvent(event);
      }
      trackSignInStatus(authResult) {
        const event = this.getBaseEventData(eventTypes.GPG_SIGN_IN);
        event.is_authenticated = authResult.isAuthenticated;
        this.logAndSendEvent(event);
      }
      trackSignInError(error) {
        const event = this.getBaseEventData(eventTypes.GPG_SIGN_IN_ERROR);
        event.error = String(error);
        this.logAndSendEvent(event);
      }
      trackServerSideAccessStatus(authResponse) {
        const authCode = authResponse.authCode || "";
        const maskedAuthCode = authCode.slice(0, 4) + "*".repeat(Math.max(0, authCode.length - 7)) + authCode.slice(-3);
        const event = this.getBaseEventData(eventTypes.GPG_SERVER_SIDE_ACCESS);
        event.auth_code = maskedAuthCode;
        event.granted_scopes = authResponse.grantedScopes.join(",");
        this.logAndSendEvent(event);
      }
      trackServerSideAccessError(error) {
        const event = this.getBaseEventData(eventTypes.GPG_SERVER_SIDE_ACCESS_ERROR);
        event.error = String(error);
        this.logAndSendEvent(event);
      }
      trackCurrentPlayer(player) {
        const event = this.getBaseEventData(eventTypes.GPG_CURRENT_PLAYER);
        event.player_id = player.playerId;
        event.display_name = player.displayName;
        this.logAndSendEvent(event);
      }
      trackCurrentPlayerError(error) {
        const event = this.getBaseEventData(eventTypes.GPG_CURRENT_PLAYER_ERROR);
        event.error = String(error);
        this.logAndSendEvent(event);
      }
      getBaseEventData(eventType) {
        return this._tracking.getDefaultEventStreamDataObject(trackingGroups.CLIENT_INSTRUMENTATION_GROUP, "GOOGLE_PLAY_GAMES", eventType);
      }
      logAndSendEvent(event) {
        this._tracking.directSend(event);
        if (window.__isDebugBuild()) {
          nativeLogger.info(JSON.stringify(event));
        }
      }
    }

    const defaultTimeoutSeconds = 180;
    let keepScreenOn = false;
    let countdownTimer = null;
    const KEEP_SCREEN_ON_EVENT = "keepScreenTurnOn";
    const KEEP_SCREEN_OFF_EVENT = "keepScreenTurnOff";
    const APP_RESUMED_EVENT = "onAppResumed";
    const APP_PAUSED_EVENT = "onAppPaused";
    const MOUSE_UP_EVENT = "mouseup";
    function initializeKeepScreenOn() {
      startAllowSleepTimer();
      document.addEventListener(KEEP_SCREEN_OFF_EVENT, () => {
        keepScreenOn = false;
        startAllowSleepTimer();
      }, false);
      document.addEventListener(KEEP_SCREEN_ON_EVENT, () => {
        keepScreenOn = true;
        if (countdownTimer) {
          clearTimeout(countdownTimer);
        }
        keepAwake();
      }, false);
      const gameView = document.getElementById("gameview");
      if (gameView) {
        gameView.addEventListener(MOUSE_UP_EVENT, () => {
          startAllowSleepTimer();
        }, false);
      }
      document.addEventListener(APP_RESUMED_EVENT, () => {
        startAllowSleepTimer();
      }, false);
      document.addEventListener(APP_PAUSED_EVENT, () => {
        if (countdownTimer) {
          clearTimeout(countdownTimer);
        }
      }, false);
    }
    function startAllowSleepTimer() {
      if (keepScreenOn) {
        return;
      }
      keepAwake();
      if (countdownTimer) {
        clearTimeout(countdownTimer);
      }
      countdownTimer = window.setTimeout(() => {
        var _a;
        if (PlatformEnv.getInstance().platform === "windows") {
          window.plugins.keepScreenOn.disable();
        } else {
          (_a = window.__native) == null ? void 0 : _a.allowSleep();
        }
        nativeLogger.info("Allow screen lock");
        if (countdownTimer) {
          clearTimeout(countdownTimer);
        }
      }, defaultTimeoutSeconds * 1e3);
    }
    function keepAwake() {
      var _a;
      if (PlatformEnv.getInstance().platform === "windows") {
        window.plugins.keepScreenOn.enable();
      } else {
        (_a = window.__native) == null ? void 0 : _a.keepAwake();
      }
      nativeLogger.info("Disable screen lock");
    }

    class LaunchReview {
      isRateUsAvailable() {
        if (!window.LaunchReview) {
          return false;
        }
        return window.LaunchReview.isRatingSupported();
      }
      invokeNativeRateUs(success, error) {
        window.LaunchReview && window.LaunchReview.rating(success, error);
      }
      openNativeMarket(success, error) {
        window.LaunchReview && window.LaunchReview.launch(success, error);
      }
    }
    class LaunchReviewStub extends LaunchReview {
      invokeNativeRateUs(success, error) {
      }
      openNativeMarket(success, error) {
      }
      isRateUsAvailable() {
        return false;
      }
    }

    let __id = 0;
    function getNextId() {
      __id = (__id + 1) % 1e3;
      return Math.floor(Date.now() / 1e3) * 1e3 + __id;
    }
    class LocalNotifications {
      constructor() {
        this.cancelNotificationsHandler = () => {
          this.cancelNotifications();
        };
        this.scheduleNotificationsHandler = (e) => {
          this.scheduleNotifications(e);
        };
      }
      initialize() {
        var _a;
        nativeLogger.info("INFO:Init local notifications");
        this.plugin = (_a = window.cordova) == null ? void 0 : _a.plugins.notification.local;
        nativeLogger.info("INFO:Init local notifications events");
        if (this.plugin) {
          this.initializeEvents();
        } else {
          nativeLogger.error("Error: Local notifications plugin not found");
        }
        window.isAppNotificationsEnabled = () => {
          var _a2;
          if (this.plugin) {
            return (_a2 = this.plugin) == null ? void 0 : _a2.hasPermission();
          }
          return false;
        };
      }
      scheduleNotifications(message) {
        var _a, _b;
        try {
          const notifications = message.detail;
          if (notifications.length > 0) {
            const notificationsList = [];
            const actionsToSet = [];
            if (PlatformEnv.getInstance().platform == "windows") {
              actionsToSet.push({
                id: "like",
                type: "button",
                title: "Open app",
                launch: true
              });
            }
            for (const notification of notifications) {
              notificationsList.push({
                id: getNextId(),
                title: notification.message.title,
                text: notification.message.message,
                messageType: notification.message.messageType,
                customLayout: true,
                foreground: true,
                badge: 1,
                trigger: { at: notification.time.getDate ? notification.time.getDate() : notification.time.date },
                sound: null,
                actions: actionsToSet
              });
            }
            if (PlatformEnv.getInstance().platform === "ios") {
              (_a = this.plugin) == null ? void 0 : _a.schedule(notificationsList, null, null, { skipPermission: true });
            } else {
              (_b = this.plugin) == null ? void 0 : _b.schedule(notificationsList);
            }
          }
        } catch (ex) {
          nativeLogger.error("ERROR:Error while schedule localNotification: ", ex instanceof Error ? ex.message : "Unknown error");
        }
      }
      cancelNotifications() {
        var _a;
        (_a = this.plugin) == null ? void 0 : _a.cancelAll();
      }
      initializeEvents() {
        var _a, _b;
        document.addEventListener("scheduleNotifications", this.scheduleNotificationsHandler);
        document.addEventListener("cancelNotifications", this.cancelNotificationsHandler);
        if (PlatformEnv.getInstance().platform !== "ios") {
          (_a = this.plugin) == null ? void 0 : _a.on("click", (e) => {
            nativeLogger.info("INFO:Local notification clicked:" + e.text);
            window.__onIntent({
              dict: {
                Title: e.title,
                Message: e.text,
                Time: e.trigger && e.trigger.at || null,
                messagetype: e.messageType
              }
            });
          });
          (_b = this.plugin) == null ? void 0 : _b.fireQueuedEvents();
        }
      }
      dispose() {
        document.removeEventListener("scheduleNotifications", this.scheduleNotificationsHandler);
        document.removeEventListener("cancelNotifications", this.cancelNotificationsHandler);
      }
    }

    class Event {
      constructor(type) {
        this.type = type;
        this.target = null;
        this.currentTarget = null;
      }
    }
    class MouseEvent extends Event {
      constructor(type, x, y) {
        super(type);
        this.x = x;
        this.y = y;
      }
    }
    class ObserverTarget {
      constructor(autoUnsubscribe = false) {
        this.autoUnsubscribe = autoUnsubscribe;
        this.observersMap = {};
      }
      subscribe(eventId, observer) {
        if (this.observersMap[eventId] == null) {
          this.observersMap[eventId] = [observer];
        } else {
          const index = this.observersMap[eventId].indexOf(observer);
          if (index == -1) {
            this.observersMap[eventId].push(observer);
          }
        }
      }
      unsubscribe(eventId, observer) {
        if (observer == null) {
          delete this.observersMap[eventId];
          return;
        }
        const observersList = this.observersMap[eventId];
        if (observersList !== void 0) {
          const index = observersList.indexOf(observer);
          if (~index) {
            this.removeSubscriptionOn(observersList, eventId, index);
          }
        }
      }
      unsubsctibeAll(eventId) {
        delete this.observersMap[eventId];
      }
      notify(eventId, data) {
        const observersList = this.observersMap[eventId];
        if (observersList !== void 0) {
          let i = observersList.length;
          while (--i >= 0) {
            const observer = observersList[i];
            try {
              observer(data);
            } catch (e) {
              throw new Error(`ERROR: during ${eventId} subscriber call: ${e}`);
            }
            if (this.autoUnsubscribe) {
              this.removeSubscriptionOn(observersList, eventId, i);
            }
          }
        }
      }
      removeSubscriptionOn(list, eventId, index) {
        list.splice(index, 1);
        if (list.length === 0) {
          delete this.observersMap[eventId];
        }
      }
      dispose() {
        this.observersMap = null;
      }
    }
    class PromiseDefer {
      constructor() {
        this.promise = new Promise((resolve, reject) => {
          this.resolve = resolve;
          this.reject = reject;
        });
        this.isPending = true;
      }
      tryResolve(value) {
        if (this.isPending) {
          this.resolve(value);
          this.isPending = false;
        }
      }
      tryReject(reason) {
        if (this.isPending) {
          this.reject(reason);
          this.isPending = false;
        }
      }
    }
    class Point {
      constructor(x = 0, y = 0) {
        this.x = x;
        this.y = y;
      }
      set(x, y) {
        this.x = x;
        this.y = y;
        return this;
      }
      distanceTo(p) {
        const kx = this.x - p.x;
        const ky = this.y - p.y;
        return Math.sqrt(kx * kx + ky * ky);
      }
    }
    function createEvent(type) {
      return new Event(type);
    }
    function createMouseEvent(type, x, y) {
      return new MouseEvent(type, x, y);
    }
    function isEvent(instance) {
      return "type" in instance && "target" in instance && "currentTarget" in instance;
    }
    function isMouseEvent(instance) {
      return isEvent(instance) && "x" in instance && "y" in instance;
    }
    function processAll(itemsList, process) {
      const tasks = [];
      for (const item of itemsList) {
        tasks.push(process(item));
      }
      return Promise.all(tasks);
    }

    class EventTarget {
      constructor() {
        this.observerTarget = new ObserverTarget();
      }
      addEventListener(eventType, handler) {
        this.observerTarget.subscribe(eventType, handler);
      }
      removeEventListener(eventType, handler) {
        this.observerTarget.unsubscribe(eventType, handler);
      }
      removeAllEventListeners(eventType) {
        this.observerTarget.unsubsctibeAll(eventType);
      }
      dispatchEvent(e) {
        if (!e.target) {
          e.target = this;
        }
        this.captureEvent(e);
      }
      isConsumerOf(e) {
        return e.currentTarget === this;
      }
      captureEvent(e) {
        this.consumeEvent(e);
      }
      consumeEvent(e) {
        if (isMouseEvent(e)) {
          e.currentTarget = this;
          this.bubbleEvent(e);
        } else {
          this.handleEvent(e);
        }
      }
      bubbleEvent(e) {
        this.handleEvent(e);
      }
      handleEvent(e) {
        this.observerTarget.notify(e.type, e);
      }
      release() {
        var _a;
        (_a = this.observerTarget) == null ? void 0 : _a.dispose();
      }
    }

    class Coordinate extends EventTarget {
      constructor(x = 0, y = 0) {
        super();
        this.position = new Point(x, y);
        this.scale = new Point(1, 1);
        this._parent = null;
      }
      setParent(parentCoordinate) {
        this._parent = parentCoordinate;
      }
      cleanParent() {
        this._parent = null;
      }
      localToGlobal(localPoint, globalPointResult = new Point()) {
        globalPointResult.x = this.x + localPoint.x * this.scaleX;
        globalPointResult.y = this.y + localPoint.y * this.scaleY;
        if (this._parent !== null) {
          return this._parent.localToGlobal(globalPointResult, globalPointResult);
        }
        return globalPointResult;
      }
      globalToLocal(globalPoint, localPointResult = new Point(globalPoint.x, globalPoint.y)) {
        if (this._parent !== null) {
          this._parent.globalToLocal(globalPoint, localPointResult);
        }
        localPointResult.x = -this.x / this.scaleX + localPointResult.x / this.scaleX;
        localPointResult.y = -this.y / this.scaleY + localPointResult.y / this.scaleY;
        return localPointResult;
      }
      get x() {
        return this.position.x;
      }
      set x(v) {
        this.position.x = v;
      }
      get y() {
        return this.position.y;
      }
      set y(v) {
        this.position.y = v;
      }
      get scaleX() {
        return this.scale.x;
      }
      set scaleX(v) {
        this.scale.x = v;
      }
      get scaleY() {
        return this.scale.y;
      }
      set scaleY(v) {
        this.scale.y = v;
      }
      get parent() {
        return this._parent == null ? null : this._parent;
      }
      bubbleEvent(e) {
        super.bubbleEvent(e);
        const isThisIsTarget = this !== e.target;
        if (this._parent != null && isThisIsTarget) {
          this._parent.bubbleEvent(e);
        }
      }
      release() {
        super.release();
        this._parent = null;
      }
    }

    class Container extends Coordinate {
      constructor(x = 0, y = 0) {
        super(x, y);
        this.children = [];
        this.childrenCounter = 0;
      }
      addChildAt(child, index) {
        if (index < 0) {
          throw new Error(`[Container] Impossible to use ${index} layer for child.`);
        }
        const _child = child;
        const existingChild = this.children[index];
        if (existingChild != null) {
          throw new Error(`[Container] Index ${index} already occupied by other child "[${existingChild == null ? void 0 : existingChild.constructor.name}]".`);
        }
        const prevParent = _child.parent;
        if (prevParent !== null && this.isContainer(prevParent)) {
          prevParent.removeChildAt(prevParent.getChildIndex(child));
        }
        this.children[index] = _child;
        _child.setParent(this);
        this.childrenCounter++;
        child.dispatchEvent(createEvent(EventType.ADDED_TO_CONTAINER));
      }
      removeChildAt(index) {
        if (!this.children || this.children.length == 0) {
          return;
        }
        const child = this.children[index];
        if (child != null) {
          child.cleanParent();
          this.children[index] = null;
          this.childrenCounter--;
          child.dispatchEvent(createEvent(EventType.REMOVED_FROM_CONTAINER));
        }
      }
      getChildAt(index) {
        const child = this.children[index];
        return child == null ? null : child;
      }
      removeChildren() {
        const removedChildren = [];
        this.forEach((child) => removedChildren.push(child));
        this.children = [];
        this.childrenCounter = 0;
        return removedChildren;
      }
      getChildIndex(child) {
        return this.children.indexOf(child);
      }
      getChildren() {
        const children = [];
        this.forEach((c) => children.push(c));
        return children;
      }
      forEach(operation) {
        for (let i = 0; i < this.children.length; i++) {
          const child = this.children[i];
          if (child != null) {
            operation(child);
          }
        }
      }
      captureEvent(e) {
        const lastIndex = this.children.length - 1;
        for (let i = lastIndex; i >= 0; i--) {
          const child = this.children[i];
          if (child != null) {
            child.captureEvent(e);
            if (e.currentTarget !== null && isMouseEvent(e)) {
              break;
            }
          }
        }
        if (!isMouseEvent(e) || e.type === EventType.MOUSE_OUT) {
          super.captureEvent(e);
        } else if (e.type !== EventType.MOUSE_OUT && e.currentTarget == null) {
          this.dispatchEvent(createMouseEvent(EventType.MOUSE_OUT, e.x, e.y));
        }
      }
      dispatchOutToChildren(e) {
        for (const child of this.children) {
          if (child != null && isMouseEvent(e) && !child.isConsumerOf(e)) {
            child.dispatchEvent(createMouseEvent(EventType.MOUSE_OUT, e.x, e.y));
          }
        }
      }
      isConsumerOf(e) {
        return e.currentTarget != null && this.children.some((child) => child != null && child.isConsumerOf(e));
      }
      get childrenCount() {
        return this.childrenCounter;
      }
      bubbleEvent(e) {
        super.bubbleEvent(e);
        this.dispatchOutToChildren(e);
      }
      isContainer(instance) {
        return "getChildIndex" in instance && "addChildAt" in instance && "removeChildAt" in instance;
      }
      release() {
        super.release();
        this.forEach((child) => child.release());
        this.children = [];
      }
    }

    const TIMEOUT_ERROR = "TIMEOUT_ERROR";
    const NATIVE_ERROR = "NATIVE_ERROR";
    let defaultTimeout = 3e5;
    function loadUnknown(uri, timeout = defaultTimeout) {
      return loadResource(uri, ResourceType.UNKNOWN, timeout);
    }
    function loadImage(uri, timeout = defaultTimeout) {
      return loadResource(uri, ResourceType.IMAGE, timeout);
    }
    function loadArchive(uri, timeout = defaultTimeout) {
      return loadArchiveInternal(uri, ResourceType.ARCHIVE, timeout);
    }
    function loadSound() {
      throw new Error("Has to be implemented.");
    }
    function loadVideo() {
      throw new Error("Has to be implemented.");
    }
    function loadText(uri, timeout = defaultTimeout) {
      return loadResource(uri, ResourceType.TEXT, timeout);
    }
    function loadFont() {
      throw new Error("Has to be implemented.");
    }
    function loadWbip() {
      throw new Error("Has to be implemented.");
    }
    function loadScript() {
      throw new Error("Has to be implemented.");
    }
    function loadByType(uri, type = ResourceType.UNKNOWN, timeout = defaultTimeout) {
      switch (type) {
        case ResourceType.IMAGE:
          return loadImage(uri, timeout);
        case ResourceType.SOUND:
          return loadSound();
        case ResourceType.VIDEO:
          return loadVideo();
        case ResourceType.TEXT:
          return loadText(uri, timeout);
        case ResourceType.FONT:
          return loadFont();
        case ResourceType.WBIP:
          return loadWbip();
        case ResourceType.SCRIPT:
          return loadScript();
        case ResourceType.ARCHIVE:
          return loadArchive(uri);
        default:
          return loadUnknown(uri, timeout);
      }
    }
    function loadResource(uri, resourceType, timeout) {
      return new Promise((resolve, reject) => {
        const timeoutId = setTimeout(() => {
          reject(buildError(TIMEOUT_ERROR, `Resource loading timeout ${timeout}ms exceeded`, uri, resourceType));
        }, timeout);
        try {
          if (PlatformEnv.getInstance().platform === "windows") {
            loadResourceWindows(uri, resourceType, resolve, reject);
          } else {
            window.__native.preloadResource(uri, resourceType, () => {
              clearTimeout(timeoutId);
              let resource;
              try {
                resource = window.__native.openResource(uri, resourceType);
              } catch (e) {
                reject(buildError(NATIVE_ERROR, "Failed opening of resource", uri, resourceType, e));
                return;
              }
              if (resource == null) {
                reject(buildError(NATIVE_ERROR, "Unable to open resource", uri, resourceType));
                return;
              }
              resolve(resource);
            });
          }
        } catch (e) {
          clearTimeout(timeoutId);
          reject(buildError(NATIVE_ERROR, "Failed preload call of resource", uri, resourceType, e));
        }
      });
    }
    function loadResourceWindows(uri, resourceType, resolve, reject) {
      if (resourceType == ResourceType.IMAGE) {
        const image = window.document.createElement("img");
        image.onload = () => {
          const result = {
            id: image,
            type: 1,
            height: image.height,
            width: image.width
          };
          resolve(result);
        };
        image.onerror = (error) => {
          nativeLogger.error("Image loading error:", error);
          reject(error);
        };
        image.crossOrigin = "";
        image.src = uri;
      } else if (resourceType == ResourceType.TEXT) {
        const req = new XMLHttpRequest();
        req.onload = () => {
          resolve(req.response);
        };
        req.onerror = (error) => {
          nativeLogger.error("XMLHttpRequest error:", error);
          reject(error);
        };
        req.open("GET", uri);
        req.send();
      } else {
        reject(new Error("Unsupported resource type for loading."));
      }
    }
    function loadArchiveInternal(uri, resourceType, timeout) {
      if (PlatformEnv.getInstance().platform === "windows") {
        throw new Error("preloadResource() and openResource() are not used for win platform.");
      }
      return new Promise((resolve, reject) => {
        const timeoutId = setTimeout(() => {
          reject(buildError(TIMEOUT_ERROR, `Resource loading timeout ${timeout}ms exceeded`, uri, resourceType));
        }, timeout);
        try {
          window.__native.preloadResource(uri, resourceType, (statusCode) => {
            clearTimeout(timeoutId);
            nativeLogger.info(`DC_INFO: Archive downloading status code: ${statusCode}`);
            resolve(statusCode);
          });
        } catch (e) {
          clearTimeout(timeoutId);
          reject(buildError(NATIVE_ERROR, "DC_ERROR: Archive loading failed", uri, resourceType, e));
        }
      });
    }
    function buildError(name, reason, uri, resourceType, message) {
      let errorMessage = `${reason}, resource type ${ResourceType[resourceType]}, uri "${uri}".`;
      if (message) {
        errorMessage += message;
      }
      const error = new Error(errorMessage);
      error.name = name;
      return error;
    }

    function loadAssetsManifest(host) {
      const fullUri = "public/assets/configs/login_assets.json";
      return new Promise((resolve, reject) => {
        loadText(fullUri).then((manifestJson) => parseJson(manifestJson, fullUri, resolve, reject)).catch((e) => {
          reject(new Error(`Failed to load assets manifest by uri ${fullUri}.
                    ${e.message}
                `));
        });
      });
    }
    function parseJson(manifestJson, fullUri, resolve, reject) {
      let manifest = null;
      try {
        manifest = JSON.parse(manifestJson);
      } catch (e) {
        reject(new Error(`Failed to parse manifest JSON. URI to manifest "${fullUri}".
            ${e}
            Manifest JSON:
            ${manifestJson}
        `));
      }
      if (manifest != null) {
        validateManifest(manifest, manifestJson, fullUri, reject);
        nativeLogger.info(`INFO: Assets manifest loaded successfuly "${fullUri}"`);
        resolve(manifest);
      } else {
        reject(new Error(`Parsing manifest result is NULL. URI to manifest ${fullUri}
            Manifest JSON:
            ${manifestJson}
        `));
      }
    }
    function validateManifest(manifest, manifestJson, fullUri, invalidCaseCallback) {
      if (!manifest.hasOwnProperty(STATIC_COLLECTION_ID)) {
        invalidCaseCallback(new Error(`Manifest has to contain "${STATIC_COLLECTION_ID}" assets package. URI to manifest ${fullUri}
            Manifest JSON:
            ${manifestJson}
        `));
      }
      manifest.hasOwnProperty(DEFAULT_LANGUAGE);
      for (const packageId of Object.keys(manifest)) {
        if (packageId !== STATIC_COLLECTION_ID && packageId !== DEFAULT_LANGUAGE) {
          const pack = manifest[packageId];
          for (const assetId of Object.keys(pack)) {
            const defaultLangPack = manifest[DEFAULT_LANGUAGE];
            if (defaultLangPack == null || !defaultLangPack.hasOwnProperty(assetId)) {
              invalidCaseCallback(new Error(`Asset "${assetId}" from "${packageId}" language pack is not presented in "${DEFAULT_LANGUAGE}" package as default
                        Please, add default version of this asset to "${DEFAULT_LANGUAGE}" package
                        or relocate this asset to "${STATIC_COLLECTION_ID}" package
                        Manifest URI: ${fullUri},
                        Manifest JSON:
                        ${manifestJson}`));
            }
          }
        }
      }
    }

    var __async$j = (__this, __arguments, generator) => {
      return new Promise((resolve, reject) => {
        var fulfilled = (value) => {
          try {
            step(generator.next(value));
          } catch (e) {
            reject(e);
          }
        };
        var rejected = (value) => {
          try {
            step(generator.throw(value));
          } catch (e) {
            reject(e);
          }
        };
        var step = (x) => x.done ? resolve(x.value) : Promise.resolve(x.value).then(fulfilled, rejected);
        step((generator = generator.apply(__this, __arguments)).next());
      });
    };
    class DisplayRoot extends Container {
      constructor(canvas, rootFactory, splashScreenPath = "") {
        super();
        this.canvas = canvas;
        this.parameters = rootFactory.createScreenParams(canvas.width, canvas.height);
        this.outdatedParameters = rootFactory.createScreenParams(canvas.width, canvas.height);
        this._eventProxy = rootFactory.createEventsProxy(canvas, this, this.parameters);
        this._renderer = rootFactory.createRenderer(canvas, this.parameters.scale);
        this._resources = rootFactory.createResourcesRepository(DEFAULT_LANGUAGE);
        this._images = rootFactory.createImageRepository(this._resources, DEFAULT_LANGUAGE);
        this._spritesBuilder = rootFactory.createSpritesBuilder(this._images);
        this._languages = rootFactory.createLanguagesManager(DEFAULT_LANGUAGE, this._resources, this._images, this);
        const scenesFactory = rootFactory.createScenesFactory();
        const splashScreenScene = scenesFactory.createSplashScreen(this, splashScreenPath);
        const splashScreenSceneDefault = scenesFactory.createSplashScreen(this, "");
        const loginScene = scenesFactory.createLoginScreen(this);
        const languageSwitcherScene = scenesFactory.createLanguageSwitcher(this);
        const genericError = scenesFactory.createGenericErrorPopup(this);
        const connectionError = scenesFactory.createConnectionErrorPopup(this);
        const loginError = scenesFactory.createLoginErrorPopup(this);
        const overlay = scenesFactory.createOverlay(this);
        this.screensManager = rootFactory.createScreensManager(this, overlay, genericError, connectionError);
        this.screensManager.registerScreen(ScreenId.SPLASH_SCREEN, splashScreenScene);
        this.screensManager.registerScreen(ScreenId.SPLASH_SCREEN_DEFAULT, splashScreenSceneDefault);
        this.screensManager.registerScreen(ScreenId.LOGIN_SCREEN, loginScene);
        this.screensManager.registerScreen(ScreenId.LANGUAGE_SWITCHER, loginScene, languageSwitcherScene);
        this.screensManager.registerScreen(ScreenId.GENERIC_ERROR_POPUP, genericError);
        this.screensManager.registerScreen(ScreenId.CONNECTION_ERROR_POPUP, connectionError);
        this.screensManager.registerScreen(ScreenId.LOGIN_ERROR_POPUP, splashScreenScene, loginError);
        this.languagesConsumer = languageSwitcherScene;
        this.languageSwitcherActivator = loginScene;
        this.dutyPoint = new Point();
        this.resizeListener = () => {
          this.outdatedParameters = this.parameters;
          this.parameters = rootFactory.createScreenParams(canvas.width, canvas.height);
          this.eventProxy.setScreenParams(this.parameters);
          this._renderer.setScale(this.parameters.scale);
          const topSpriteHeight = this.getMaximumTopValue(this);
          this.y = (canvas.height / this.parameters.scale - topSpriteHeight) / 2;
        };
        if (PlatformEnv.getInstance().platform === "windows") {
          window.addEventListener("resize", this.resizeListener);
        }
      }
      showOverlay(enableBackground = true) {
        this.screenManager.showOverlay(enableBackground);
      }
      hideOverlay() {
        this.screensManager.hideOverlay();
      }
      initialize() {
        return __async$j(this, null, function* () {
          this.screensManager.initialize();
          this.setStage(ScreenId.SPLASH_SCREEN_DEFAULT);
        });
      }
      loadManifest(host) {
        return __async$j(this, null, function* () {
          try {
            const manifest = yield loadAssetsManifest(host);
            if (manifest != null) {
              this._resources.initialize(manifest);
            }
          } catch (e) {
            this.showGenericError(e);
          }
        });
      }
      setLanguages(currentLanguage, supportedLanguages) {
        return __async$j(this, null, function* () {
          yield this._languages.switchToLanguage(currentLanguage);
          this.languagesConsumer.setLanguages(currentLanguage, supportedLanguages);
          this.languageSwitcherActivator.showLanguageSwitcherButton();
        });
      }
      reloadLocalization(langIso) {
        return __async$j(this, null, function* () {
          this.screensManager.showOverlay();
          return this.languages.switchToLanguage(langIso).catch((e) => this.showGenericError(e)).finally(() => this.screensManager.hideOverlay());
        });
      }
      setStage(screenId) {
        return this.screensManager.showScreen(screenId);
      }
      draw() {
        this.dispatchEvent(createEvent(EventType.ENTER_FRAME));
        this._renderer.startFrame();
        this.drawSprites(this);
        this._renderer.endFrame();
      }
      drawSprites(target) {
        const p = this.dutyPoint;
        if (implementsSprite(target) && target.visible) {
          const { image, localLeft, localBottom, localTop, localRight, shaderProgram } = target;
          const { x, y } = target.localToGlobal(p.set(localLeft, localBottom), p);
          target.localToGlobal(p.set(localRight, localTop), p);
          const width = p.x - x;
          const height = p.y - y;
          this._renderer.drawImage(image, x, y, width, height, shaderProgram);
          return;
        }
        if (implementsContainer(target)) {
          target.forEach((child) => this.drawSprites(child));
        }
      }
      getMaximumTopValue(target) {
        if (implementsSprite(target) && target.visible) {
          const childSprite = target;
          return childSprite.top;
        }
        if (implementsContainer(target)) {
          let topValue = 0;
          target.forEach((child) => {
            const iterationValue = this.getMaximumTopValue(child);
            if (iterationValue > topValue) {
              topValue = iterationValue;
            }
          });
          return topValue;
        } else {
          return 0;
        }
      }
      showGenericError(e) {
        this.screensManager.showGenericError(e);
      }
      showConnectionError(e) {
        this.screensManager.showConnectionError(e);
      }
      showLoginError() {
        this.screensManager.showScreen(ScreenId.LOGIN_ERROR_POPUP);
      }
      get screenWidth() {
        return this.parameters.width;
      }
      get screenHeight() {
        return this.parameters.height;
      }
      get screenScale() {
        return this.parameters.scale;
      }
      get eventProxy() {
        return this._eventProxy;
      }
      get renderer() {
        return this._renderer;
      }
      get screenManager() {
        return this.screensManager;
      }
      get resources() {
        return this._resources;
      }
      get images() {
        return this._images;
      }
      get spritesBuilder() {
        return this._spritesBuilder;
      }
      get languages() {
        return this._languages;
      }
      release() {
        this._eventProxy.release();
        this._languages.release();
        this._images.release();
        super.release();
        this.canvas = null;
        this.parameters = null;
        this._renderer = null;
        this._eventProxy = null;
        this.screensManager = null;
        this._resources = null;
        this._images = null;
        this._spritesBuilder = null;
        this._languages = null;
        this.languagesConsumer = null;
        this.languageSwitcherActivator = null;
        delete window.__drawPreloader;
        delete window.__nativePreloader;
        if (PlatformEnv.getInstance().platform === "windows") {
          window.removeEventListener("resize", this.resizeListener);
        }
      }
    }
    function implementsContainer(target) {
      return "addChildAt" in target;
    }
    function implementsSprite(target) {
      return "setState" in target;
    }

    const DEFAULT_PROGRAM = "default";
    class NativeRenderer {
      constructor(canvas, scale) {
        this.canvas = canvas;
        this.scale = scale;
        const gl = canvas.getContext("webgl");
        if (gl == null) {
          throw new Error(`Failed to get "webgl" context from HTMLCanvasElement`);
        }
        this.gl = gl;
        this.isGLBufferOccupied = false;
        this.images = [];
        this.programs = {};
        this.currentProgramId = DEFAULT_PROGRAM;
        this.aPosition = null;
        this.aTexture = null;
        const spritevs_src = `
        attribute highp vec4 aPosition;
        attribute highp vec2 aTexture;
        varying highp vec2 vTexture;
        void main() {
            vTexture = aTexture;
            gl_Position = aPosition;
        }
        `;
        const spritefs_src = `
        varying highp vec2 vTexture;
        uniform lowp sampler2D u_texture;
        void main() {
            gl_FragColor = texture2D(u_texture, vTexture);
        }
        `;
        this.compileProgram(DEFAULT_PROGRAM, spritevs_src, spritefs_src);
      }
      startFrame() {
        this.gl.viewport(0, 0, this.canvas.width, this.canvas.height);
        this.gl.clearColor(0, 0, 0, 0);
        if (this.isGLBufferOccupied) {
          this.gl.clear(this.gl.COLOR_BUFFER_BIT);
          this.isGLBufferOccupied = false;
        }
        this.gl.enable(this.gl.BLEND);
        this.gl.blendFunc(this.gl.SRC_ALPHA, this.gl.ONE_MINUS_SRC_ALPHA);
        if (PlatformEnv.getInstance().platform === "windows") {
          this.gl.blendFunc(this.gl.ONE, this.gl.ONE_MINUS_SRC_ALPHA);
        }
        this.useProgram(DEFAULT_PROGRAM);
      }
      drawImage(image, x, y, width, height, shaderProgramId = DEFAULT_PROGRAM) {
        if (!image.isTextureAllocated) {
          this.allocateTexture(image);
        }
        if (shaderProgramId != this.currentProgramId) {
          this.useProgram(shaderProgramId);
        }
        if (this.aPosition == null || this.aTexture == null) {
          return;
        }
        x = x * this.scale;
        y = y * this.scale;
        width = width * this.scale;
        height = height * this.scale;
        this.gl.bindTexture(this.gl.TEXTURE_2D, image.texture);
        this.gl.bindBuffer(this.gl.ARRAY_BUFFER, image.vertexBuffer);
        const posX1 = this.normalize(x, this.canvas.width, -1, 1);
        const posY1 = this.normalize(y, this.canvas.height, -1, 1);
        const posX2 = this.normalize(x + width, this.canvas.width, -1, 1);
        const posY2 = this.normalize(y + height, this.canvas.height, -1, 1);
        const u1 = 0;
        const u2 = 1;
        const v1 = 1;
        const v2 = 0;
        const vertices = new Float32Array([
          posX1,
          posY1,
          u1,
          v1,
          posX2,
          posY1,
          u2,
          v1,
          posX1,
          posY2,
          u1,
          v2,
          posX1,
          posY2,
          u1,
          v2,
          posX2,
          posY1,
          u2,
          v1,
          posX2,
          posY2,
          u2,
          v2
        ]);
        this.gl.bufferData(this.gl.ARRAY_BUFFER, vertices, this.gl.DYNAMIC_DRAW);
        this.gl.vertexAttribPointer(this.aPosition, 2, this.gl.FLOAT, this.gl.FALSE, 4 * 4, 0);
        this.gl.vertexAttribPointer(this.aTexture, 2, this.gl.FLOAT, this.gl.FALSE, 4 * 4, 4 * 2);
        this.gl.drawArrays(this.gl.TRIANGLES, 0, 6);
        this.isGLBufferOccupied = true;
      }
      endFrame() {
        this.clearTexture();
      }
      setScale(scale) {
        this.scale = scale;
      }
      clearTexture() {
        if (PlatformEnv.getInstance().platform === "windows") {
          this.gl.bindTexture(this.gl.TEXTURE_2D, null);
        } else {
          this.gl.bindTexture(this.gl.TEXTURE_2D, 0);
        }
      }
      allocateTexture(image) {
        if (image.isTextureAllocated) {
          return;
        }
        const texture = this.gl.createTexture();
        const vertexBuffer = this.gl.createBuffer();
        if (texture == null || vertexBuffer == null) {
          throw new Error(`Unable to create Image. NULL texture (${texture}) or vertexBuffer (${vertexBuffer}) from WebGL.`);
        }
        this.gl.bindTexture(this.gl.TEXTURE_2D, texture);
        if (PlatformEnv.getInstance().platform === "windows") {
          this.gl.pixelStorei(this.gl.UNPACK_PREMULTIPLY_ALPHA_WEBGL, true);
          this.gl.texImage2D(this.gl.TEXTURE_2D, 0, this.gl.RGBA, this.gl.RGBA, this.gl.UNSIGNED_BYTE, image.resource.id);
        } else {
          this.gl.texImage2D(this.gl.TEXTURE_2D, 0, this.gl.RGBA, image.width, image.height, 0, this.gl.RGBA, this.gl.UNSIGNED_BYTE, image.resource.id);
        }
        this.gl.texParameteri(this.gl.TEXTURE_2D, this.gl.TEXTURE_MAG_FILTER, this.gl.LINEAR);
        this.gl.texParameteri(this.gl.TEXTURE_2D, this.gl.TEXTURE_MIN_FILTER, this.gl.LINEAR);
        this.gl.texParameteri(this.gl.TEXTURE_2D, this.gl.TEXTURE_WRAP_S, this.gl.CLAMP_TO_EDGE);
        this.gl.texParameteri(this.gl.TEXTURE_2D, this.gl.TEXTURE_WRAP_T, this.gl.CLAMP_TO_EDGE);
        this.clearTexture();
        image.texture = texture;
        image.vertexBuffer = vertexBuffer;
        this.images.push(image);
      }
      deallocateTexture(image) {
        this.gl.deleteTexture(image.texture);
        this.gl.deleteBuffer(image.vertexBuffer);
        image.texture = null;
        image.vertexBuffer = null;
        const index = this.images.indexOf(image);
        if (~index) {
          this.images.splice(index);
        }
      }
      getCanvasX(x) {
        return this.normalize(x * this.scale, this.canvas.width, -1, 1);
      }
      getCanvasY(y) {
        return this.normalize(y * this.scale, this.canvas.height, -1, 1);
      }
      compileProgram(id, vertexShader, fragmentShader) {
        const gl = this.gl;
        const fshaderid = gl.createShader(gl.FRAGMENT_SHADER);
        if (fshaderid == null) {
          nativeLogger.error(`Unable to compile shader program "${id}". WebGL returned NULL fragment WebGLShader instance.`);
          return;
        }
        const vshaderid = gl.createShader(gl.VERTEX_SHADER);
        if (vshaderid == null) {
          nativeLogger.error(`Unable to compile shader program "${id}". WebGL returned NULL vertex WebGLShader instance.`);
          return;
        }
        this.compileShader(id, "vertex", vshaderid, vertexShader);
        this.compileShader(id, "fragment", fshaderid, fragmentShader);
        const program = gl.createProgram();
        if (program == null) {
          nativeLogger.error(`Unable to compile shader program "${id}". WebGL returned NULL WebGLProgram instance`);
          return;
        }
        gl.attachShader(program, vshaderid);
        gl.attachShader(program, fshaderid);
        gl.linkProgram(program);
        gl.deleteShader(vshaderid);
        gl.deleteShader(fshaderid);
        this.programs[id] = program;
      }
      normalize(value, max, start, end) {
        return start + (end - start) * (value / max);
      }
      compileShader(programId, type, shader, shader_src) {
        this.gl.shaderSource(shader, shader_src);
        this.gl.compileShader(shader);
        if (!this.gl.getShaderParameter(shader, this.gl.COMPILE_STATUS)) {
          throw new Error(`${type} shader of program "${programId}" compile error: ${this.gl.getShaderInfoLog(shader)}`);
        }
      }
      useProgram(programId) {
        const program = this.programs[programId];
        if (program == null) {
          throw new Error(`Shader program "${programId}" was not compiled!`);
        }
        this.aPosition = this.gl.getAttribLocation(program, "aPosition");
        this.aTexture = this.gl.getAttribLocation(program, "aTexture");
        const uTexture = this.gl.getUniformLocation(program, "u_texture");
        this.gl.useProgram(program);
        this.gl.uniform1i(uTexture, 0);
        this.gl.enableVertexAttribArray(this.aPosition);
        this.gl.enableVertexAttribArray(this.aTexture);
        this.gl.activeTexture(this.gl.TEXTURE0);
        this.currentProgramId = programId;
      }
      dispose() {
        for (const programId in this.programs) {
          this.gl.deleteProgram(this.programs[programId]);
        }
        let i = this.images.length;
        while (--i >= 0) {
          this.deallocateTexture(this.images[i]);
        }
        this.canvas = null;
        this.aPosition = null;
        this.aTexture = null;
        this.images = null;
        this.gl = null;
        this.programs = null;
      }
    }

    let Image$1 = class Image {
      constructor(resource) {
        this.resource = resource;
        this.width = resource.width;
        this.height = resource.height;
        this.texture = null;
        this.vertexBuffer = null;
      }
      get isTextureAllocated() {
        return this.texture != null && this.vertexBuffer != null;
      }
    };

    var __async$i = (__this, __arguments, generator) => {
      return new Promise((resolve, reject) => {
        var fulfilled = (value) => {
          try {
            step(generator.next(value));
          } catch (e) {
            reject(e);
          }
        };
        var rejected = (value) => {
          try {
            step(generator.throw(value));
          } catch (e) {
            reject(e);
          }
        };
        var step = (x) => x.done ? resolve(x.value) : Promise.resolve(x.value).then(fulfilled, rejected);
        step((generator = generator.apply(__this, __arguments)).next());
      });
    };
    class ImageRepository {
      constructor(resourcesRepo, defaultCollection) {
        this.resourcesRepo = resourcesRepo;
        this.defaultCollection = defaultCollection;
        this.images = {};
      }
      loadImage(resourceId) {
        return __async$i(this, null, function* () {
          const image = this.images[resourceId];
          if (image != null) {
            return image;
          }
          return this.loadImageInternal(resourceId);
        });
      }
      reloadImage(resourceId, collectionId) {
        return __async$i(this, null, function* () {
          let image = this.getImage(resourceId);
          try {
            yield this.loadImageInternal(resourceId, collectionId);
            image = this.getImage(resourceId);
            if (image != null) {
              this.images[resourceId] = image;
            }
          } catch (e) {
            const er = e;
            if (collectionId !== this.defaultCollection) {
              nativeLogger.error(`ERROR: [ImageRepository] Reloading of "${resourceId}" failed. Switching to default "${this.defaultCollection}". ${er.stack}`);
              return this.reloadImage(resourceId, this.defaultCollection);
            }
            throw new Error(`Faile to reload image for resource "${resourceId}" ${er.stack}`);
          }
          if (image == null) {
            throw new Error(`Image "${resourceId}" is still absent after reload`);
          }
          return image;
        });
      }
      getImage(resourceId) {
        const image = this.images[resourceId];
        return image == null ? null : image;
      }
      loadImageInternal(resourceId, collectionId) {
        return __async$i(this, null, function* () {
          let resource;
          try {
            resource = yield this.resourcesRepo.loadResource(resourceId, ResourceType.IMAGE, collectionId);
            return this.images[resourceId] = new Image$1(resource);
          } catch (e) {
            const er = e;
            throw new Error(`Failed to load resource "${resourceId}" for image creation. ${er.stack}`);
          }
        });
      }
      release() {
        this.images = {};
      }
    }

    var __async$h = (__this, __arguments, generator) => {
      return new Promise((resolve, reject) => {
        var fulfilled = (value) => {
          try {
            step(generator.next(value));
          } catch (e) {
            reject(e);
          }
        };
        var rejected = (value) => {
          try {
            step(generator.throw(value));
          } catch (e) {
            reject(e);
          }
        };
        var step = (x) => x.done ? resolve(x.value) : Promise.resolve(x.value).then(fulfilled, rejected);
        step((generator = generator.apply(__this, __arguments)).next());
      });
    };
    class ResourceCollection {
      constructor(id, manifest) {
        this.id = id;
        this.manifest = manifest;
        this.loadingRequests = {};
        this.loadedResources = {};
      }
      loadResource(resourceId, resourceType) {
        return __async$h(this, null, function* () {
          if (!this.manifest.hasOwnProperty(resourceId)) {
            throw new Error(`Unable to load "${resourceId}". Resources collection "${this.id}" doesn't include info about this resource`);
          }
          let task = this.loadingRequests[resourceId];
          if (task != null) {
            return task;
          }
          const uri = this.manifest[resourceId];
          task = new Promise((resolve, reject) => {
            loadByType(uri, resourceType).then((resource) => {
              this.loadedResources[resourceId] = resource;
              resolve(resource);
            }).catch((e) => {
              reject(new Error(`Failed to load "${resourceId}" registered in "${this.id}" package ${e.stack}`));
            });
          });
          this.loadingRequests[resourceId] = task;
          return task;
        });
      }
      getResource(resourceId) {
        const resource = this.loadedResources[resourceId];
        return resource == null ? null : resource;
      }
      includes(resourceId) {
        return this.manifest.hasOwnProperty(resourceId);
      }
      getResourcesIds() {
        return Object.keys(this.manifest);
      }
      dispose() {
        this.loadingRequests = null;
        this.loadedResources = null;
      }
      toString() {
        return this.id;
      }
    }

    var __async$g = (__this, __arguments, generator) => {
      return new Promise((resolve, reject) => {
        var fulfilled = (value) => {
          try {
            step(generator.next(value));
          } catch (e) {
            reject(e);
          }
        };
        var rejected = (value) => {
          try {
            step(generator.throw(value));
          } catch (e) {
            reject(e);
          }
        };
        var step = (x) => x.done ? resolve(x.value) : Promise.resolve(x.value).then(fulfilled, rejected);
        step((generator = generator.apply(__this, __arguments)).next());
      });
    };
    class ResourceRepository {
      constructor(defaultDynamicCollectionId) {
        this.defaultDynamicCollectionId = defaultDynamicCollectionId;
        this.collections = {};
        this.staticCollection = null;
        this.defaultCollection = null;
        this.dynamicCollection = null;
        this._initPromise = new PromiseDefer();
      }
      initialize(manifest) {
        for (const collectionId of Object.keys(manifest)) {
          const collectionManifest = manifest[collectionId];
          this.collections[collectionId] = new ResourceCollection(collectionId, collectionManifest);
        }
        this.staticCollection = this.collections[STATIC_COLLECTION_ID];
        this.defaultCollection = this.collections[this.defaultDynamicCollectionId];
        this.dynamicCollection = this.defaultCollection;
        this._initPromise.tryResolve();
      }
      loadResource(resourceId, type, collectionId) {
        return __async$g(this, null, function* () {
          yield this.initPromise;
          let collection;
          if (collectionId != null) {
            collection = this.tryGetCollectionById(collectionId);
          }
          if (collection == null) {
            collection = this.findCollectionOfResource(resourceId);
          }
          return collection.loadResource(resourceId, type);
        });
      }
      changeDynamicCollection(collectionId) {
        var _a;
        nativeLogger.info(`[ResourcesRepository] Trying to change current dynamic collection from "${this.currentDynamicCollectionId}" to "${collectionId}"`);
        if (!this.hasCollection(collectionId)) {
          nativeLogger.warn(`WARNING: [ResourcesRepository] Resources collection "${collectionId}" wasn't registered in manifest.`);
        } else if (((_a = this.dynamicCollection) == null ? void 0 : _a.id) !== collectionId) {
          nativeLogger.info(`[ResourceRepository] Active dynamic collection changed to "${collectionId}"`);
          this.dynamicCollection = this.collections[collectionId];
          return this.dynamicCollection.getResourcesIds();
        }
        return [];
      }
      isRegistered(...resourceIds) {
        for (const resourceId of resourceIds) {
          try {
            const collection = this.findCollectionOfResource(resourceId);
            if (!collection.includes(resourceId)) {
              return false;
            }
          } catch (e) {
            return false;
          }
        }
        return true;
      }
      get(resourceId) {
        try {
          const collection = this.findCollectionOfResource(resourceId);
          return collection.getResource(resourceId);
        } catch (e) {
          return null;
        }
      }
      hasCollection(collectionId) {
        return this.collections.hasOwnProperty(collectionId);
      }
      get currentDynamicCollectionId() {
        if (this.dynamicCollection == null) {
          throw new Error("Failed to get current dynamic collection ID. ResourceRepository has to be initilized before");
        }
        return this.dynamicCollection.id;
      }
      get initPromise() {
        return this._initPromise.promise;
      }
      findCollectionOfResource(resourceId) {
        var _a, _b, _c, _d, _e;
        if ((_a = this.staticCollection) == null ? void 0 : _a.includes(resourceId)) {
          return this.staticCollection;
        }
        if ((_b = this.dynamicCollection) == null ? void 0 : _b.includes(resourceId)) {
          return this.dynamicCollection;
        }
        let packagesString;
        if (((_c = this.dynamicCollection) == null ? void 0 : _c.id) !== ((_d = this.defaultCollection) == null ? void 0 : _d.id)) {
          nativeLogger.warn(`[WARNING] asset "${resourceId}" is not presented in "${this.dynamicCollection}" dynamic collection. Using "${this.defaultCollection}" analogue instead.`);
          if ((_e = this.defaultCollection) == null ? void 0 : _e.includes(resourceId)) {
            return this.defaultCollection;
          }
          packagesString = `"${this.staticCollection}", "${this.dynamicCollection}" and "${this.defaultCollection}"`;
        } else {
          packagesString = `"${this.staticCollection}" and "${this.dynamicCollection}"`;
        }
        throw new Error(`Unable to find asset URI by asset ID "${resourceId}" in collections ${packagesString}"`);
      }
      tryGetCollectionById(collectionId) {
        const collection = this.collections[collectionId];
        if (collection == null) {
          nativeLogger.warn(`WARNING: [ResourcesRepository] Collection with ID "${collectionId}" is absent in manifest.`);
          return null;
        }
        return collection;
      }
      dispose() {
        this._initPromise.tryReject(new Error("ResourceRepository wasn't initialized and was disposed"));
        Object.values(this.collections).forEach((c) => c.dispose());
        this.collections = null;
        this.staticCollection = null;
        this.defaultCollection = null;
        this.dynamicCollection = null;
      }
    }

    class TouchArea extends Coordinate {
      constructor(x = 0, y = 0, _width = 0, _height = 0) {
        super(x, y);
        this._width = _width;
        this._height = _height;
        this.touchable = true;
        this.prevMouseEventType = EventType.MOUSE_OUT;
        this.pressedAndInside = false;
        this.dutyPoint = new Point();
      }
      containsPoint(px, py) {
        const { x, y } = this.globalToLocal(this.dutyPoint.set(px, py), this.dutyPoint);
        const { localLeft, localBottom, localRight, localTop } = this;
        return x >= localLeft && y >= localBottom && x <= localRight && y <= localTop;
      }
      get width() {
        return this._width;
      }
      set width(value) {
        this._width = value;
      }
      get height() {
        return this._height;
      }
      set height(value) {
        this._height = value;
      }
      get left() {
        return 0;
      }
      get right() {
        return this.left + this.width;
      }
      get bottom() {
        return 0;
      }
      get top() {
        return this.bottom + this.height;
      }
      get localWidth() {
        return this._width;
      }
      set localWidth(value) {
        this._width = value;
      }
      get localHeight() {
        return this._height;
      }
      set localHeight(value) {
        this._height = value;
      }
      get localLeft() {
        return 0;
      }
      get localRight() {
        return this.localLeft + this.localWidth;
      }
      get localBottom() {
        return 0;
      }
      get localTop() {
        return this.localBottom + this.localHeight;
      }
      captureEvent(e) {
        if (isMouseEvent(e)) {
          this.captureMouseEvent(e);
        } else {
          super.captureEvent(e);
        }
      }
      consumeEvent(e) {
        if (isMouseEvent(e)) {
          this.prevMouseEventType = e.type;
        }
        super.consumeEvent(e);
      }
      captureMouseEvent(e) {
        if (!this.touchable) {
          return;
        }
        if (e.type === EventType.MOUSE_OUT) {
          if (this.prevMouseEventType !== EventType.MOUSE_OUT) {
            this.pressedAndInside = false;
            this.consumeEvent(e);
          }
          return;
        }
        if (this.containsPoint(e.x, e.y)) {
          switch (e.type) {
            case EventType.MOUSE_DOWN:
              this.pressedAndInside = true;
              this.consumeEvent(e);
              break;
            case EventType.MOUSE_UP:
              this.consumeEvent(e);
              if (this.pressedAndInside) {
                this.pressedAndInside = false;
                const clickEvent = createMouseEvent(EventType.CLICK, e.x, e.y);
                this.dispatchEvent(clickEvent);
              }
              break;
            default:
              this.consumeEvent(e);
          }
        }
      }
    }

    class SpriteDefinition {
      constructor(spriteId, ...assetsIds) {
        this.spriteId = spriteId;
        this.validateInputs(spriteId, assetsIds);
        this.assetsIds = assetsIds.length !== 0 ? assetsIds : [spriteId];
      }
      validateInputs(spriteId, assetsIds) {
        if (spriteId == null) {
          throw new Error("spriteId can't be NULL.");
        }
        if (assetsIds.some((assetId) => typeof assetId !== "string")) {
          throw new Error("assetsIds should contain only strings.");
        }
      }
    }
    class Sprite extends TouchArea {
      constructor(id) {
        super();
        this.id = id;
        this.anchorX = this.anchorY = 0;
        this.visible = true;
        this.shaderProgram = "default";
        this.statesMap = {};
        this._currentState = null;
      }
      addStateImage(stateId, image) {
        this.statesMap[stateId] = image;
        if (this._currentState == null) {
          this._currentState = stateId;
        }
      }
      getStateImage(stateId) {
        const image = this.statesMap[stateId];
        return image == null ? null : image;
      }
      getStates() {
        return Object.keys(this.statesMap);
      }
      getImages() {
        return Object.values(this.statesMap);
      }
      setState(stateId) {
        if (!this.statesMap.hasOwnProperty(stateId)) {
          throw new Error(`Sprite "${this.id}" doesn't contain state "${stateId}"`);
        }
        this._currentState = stateId;
      }
      get left() {
        return this.x - this.anchorX * this.width;
      }
      get bottom() {
        return this.y - this.anchorY * this.height;
      }
      get width() {
        return this.image.width * this.scaleX;
      }
      set width(val) {
        this.scaleX = val / this.image.width;
      }
      get height() {
        return this.image.height * this.scaleY;
      }
      set height(val) {
        this.scaleY = val / this.image.height;
      }
      get localLeft() {
        return -this.anchorX * this.localWidth;
      }
      get localBottom() {
        return -this.anchorY * this.localHeight;
      }
      get localWidth() {
        return this.image.width;
      }
      get localHeight() {
        return this.image.height;
      }
      get image() {
        if (this._currentState == null) {
          throw new Error("Sprite has to contain at least one state.");
        }
        return this.statesMap[this._currentState];
      }
      get currentState() {
        return this._currentState;
      }
      deallocateTextures(cleaner) {
        for (const image of Object.values(this.statesMap)) {
          cleaner.deallocateTexture(image);
        }
      }
      release() {
        this.statesMap = null;
      }
    }

    class LanguageChangedEvent extends Event {
      constructor(newLanguageIso) {
        super(EventType.LANGUAGE_CHANGED);
        this.newLanguageIso = newLanguageIso;
      }
    }
    class SpriteReadyEvent extends Event {
      constructor(sprite) {
        super(EventType.SPRITE_READY);
        this.sprite = sprite;
      }
    }
    class SpritesCollectionCompletedEvent extends Event {
      constructor(spritesCollection) {
        super(EventType.SPRITES_COLLECTION_COMPLETED);
        this.spritesCollection = spritesCollection;
      }
    }
    class ErrorEvent extends Event {
      constructor(error) {
        super(EventType.ERROR);
        this.error = error;
      }
    }

    var __async$f = (__this, __arguments, generator) => {
      return new Promise((resolve, reject) => {
        var fulfilled = (value) => {
          try {
            step(generator.next(value));
          } catch (e) {
            reject(e);
          }
        };
        var rejected = (value) => {
          try {
            step(generator.throw(value));
          } catch (e) {
            reject(e);
          }
        };
        var step = (x) => x.done ? resolve(x.value) : Promise.resolve(x.value).then(fulfilled, rejected);
        step((generator = generator.apply(__this, __arguments)).next());
      });
    };
    class SpriteCollection extends EventTarget {
      constructor(spritesBuilder, ...requiredSprites) {
        super();
        this.spritesBuilder = spritesBuilder;
        this.requiredSprites = requiredSprites;
        this.sprites = {};
      }
      load() {
        return __async$f(this, null, function* () {
          yield processAll(this.requiredSprites, (def) => {
            return this.spritesBuilder.requestSprite(def).then((sprite) => this.addSprite(sprite, def)).catch((e) => this.dispatchEvent(new ErrorEvent(e)));
          });
        });
      }
      awaitSprite(spriteId, listener) {
        this.awaitSprites([spriteId], (collection) => listener(collection, collection.get(spriteId)));
      }
      awaitSprites(spritesIDs, listener) {
        const thisObj = this;
        const spritesLeft = spritesIDs.slice();
        function onSpriteReady(e) {
          if (isSpriteReadyEvent(e)) {
            e.sprite;
            const index = spritesLeft.indexOf(e.sprite.id);
            if (~index) {
              spritesLeft.splice(index, 1);
              if (spritesLeft.length === 0) {
                try {
                  listener(thisObj);
                } catch (error) {
                  const er = error;
                  nativeLogger.error(`Sprites "${spritesIDs}" callback was thrown. ${er.stack}`);
                } finally {
                  thisObj.removeEventListener(EventType.SPRITE_READY, onSpriteReady);
                }
              }
            }
          }
        }
        this.addEventListener(EventType.SPRITE_READY, onSpriteReady);
      }
      actualizeSpritesContent() {
        for (const sprite of Object.values(this.sprites)) {
          this.spritesBuilder.rebuildSprite(sprite);
        }
      }
      deallocateTextures(cleaner) {
        for (const sprite of Object.values(this.sprites)) {
          sprite.deallocateTextures(cleaner);
        }
      }
      get(spriteId) {
        const sprite = this.sprites[spriteId];
        if (sprite == null) {
          throw new Error(`Sprite with ID "${spriteId}" wasn't prepared for this collection.`);
        }
        return sprite;
      }
      isSpritesLoaded(...spriteIds) {
        return spriteIds.every((id) => this.sprites.hasOwnProperty(id));
      }
      getSpritesIds() {
        return this.requiredSprites.map((def) => def.spriteId);
      }
      get isLoaded() {
        return this.requiredSprites.length === 0;
      }
      addSprite(sprite, def) {
        const index = this.requiredSprites.indexOf(def);
        if (~index) {
          this.sprites[sprite.id] = sprite;
          this.requiredSprites.splice(index, 1);
          this.dispatchEvent(new SpriteReadyEvent(sprite));
          if (this.isLoaded) {
            this.dispatchEvent(new SpritesCollectionCompletedEvent(this));
          }
        }
      }
      release() {
        super.release();
        this.requiredSprites = null;
        this.sprites = null;
      }
    }
    function isSpriteReadyEvent(e) {
      return "sprite" in e;
    }

    var __async$e = (__this, __arguments, generator) => {
      return new Promise((resolve, reject) => {
        var fulfilled = (value) => {
          try {
            step(generator.next(value));
          } catch (e) {
            reject(e);
          }
        };
        var rejected = (value) => {
          try {
            step(generator.throw(value));
          } catch (e) {
            reject(e);
          }
        };
        var step = (x) => x.done ? resolve(x.value) : Promise.resolve(x.value).then(fulfilled, rejected);
        step((generator = generator.apply(__this, __arguments)).next());
      });
    };
    class SpriteBuilder extends EventTarget {
      constructor(imagesRepo) {
        super();
        this.imagesRepo = imagesRepo;
      }
      requestSprite(def) {
        return __async$e(this, null, function* () {
          const spriteId = def.spriteId;
          yield processAll(def.assetsIds, (assetId) => this.imagesRepo.loadImage(assetId));
          const sprite = new Sprite(spriteId);
          this.buildSprite(sprite, def.assetsIds);
          return sprite;
        });
      }
      rebuildSprite(sprite) {
        const s = sprite;
        this.buildSprite(s, s.getStates());
      }
      buildCollection(...requiredSprites) {
        return new SpriteCollection(this, ...requiredSprites);
      }
      buildSprite(sprite, assetsIDs) {
        for (const assetId of assetsIDs) {
          const image = this.imagesRepo.getImage(assetId);
          if (image == null) {
            throw new Error(`[SpritesBuilder] Failed to build Sprite "${sprite.id}". "${assetId}" image received as NULL`);
          }
          sprite.addStateImage(assetId, image);
        }
      }
    }

    class EventProxy {
      constructor(canvas, eventTarget, screenParams) {
        this.canvas = canvas;
        this.eventTarget = eventTarget;
        this.screenParams = screenParams;
        this.mouseDownListener = (e) => this.onMouseEvent(e);
        this.mouseMoveListener = (e) => this.onMouseEvent(e);
        this.mouseUpListener = (e) => this.onMouseEvent(e);
        this.canvas.addEventListener(EventType.MOUSE_DOWN, this.mouseDownListener);
        this.canvas.addEventListener(EventType.MOUSE_MOVE, this.mouseMoveListener);
        this.canvas.addEventListener(EventType.MOUSE_UP, this.mouseUpListener);
        this.canvas.addEventListener(EventType.MOUSE_OUT, this.mouseUpListener);
        this.documentListeners = {};
      }
      setScreenParams(newParams) {
        this.screenParams = newParams;
      }
      addDocumentEventListener(eventName, listener, options) {
        document.addEventListener(eventName, listener, options);
        if (!this.documentListeners.hasOwnProperty(eventName)) {
          this.documentListeners[eventName] = [listener];
        } else {
          this.documentListeners[eventName].push(listener);
        }
      }
      removeDocumentEventListener(eventName, listener, options) {
        if (!this.documentListeners) {
          return;
        }
        const listeners = this.documentListeners[eventName];
        if (listeners != null) {
          const index = listeners.indexOf(listener);
          if (~index) {
            document.removeEventListener(eventName, listener, options);
            listeners.splice(index, 1);
            if (listeners.length === 0) {
              delete this.documentListeners[eventName];
            }
          }
        }
      }
      onMouseEvent(e) {
        const { height, scale } = this.screenParams;
        const x = e.clientX / scale;
        const y = height - e.clientY / scale;
        this.eventTarget.dispatchEvent(createMouseEvent(e.type, x, y));
      }
      release() {
        for (const eventName of Object.keys(this.documentListeners)) {
          const listeners = this.documentListeners[eventName];
          for (const listener of listeners) {
            document.removeEventListener(eventName, listener);
          }
        }
        this.canvas.removeEventListener(EventType.MOUSE_DOWN, this.mouseDownListener);
        this.canvas.removeEventListener(EventType.MOUSE_MOVE, this.mouseMoveListener);
        this.canvas.removeEventListener(EventType.MOUSE_UP, this.mouseUpListener);
        this.canvas.removeEventListener(EventType.MOUSE_OUT, this.mouseUpListener);
        this.mouseDownListener = null;
        this.mouseMoveListener = null;
        this.mouseUpListener = null;
        this.documentListeners = null;
      }
    }

    var __async$d = (__this, __arguments, generator) => {
      return new Promise((resolve, reject) => {
        var fulfilled = (value) => {
          try {
            step(generator.next(value));
          } catch (e) {
            reject(e);
          }
        };
        var rejected = (value) => {
          try {
            step(generator.throw(value));
          } catch (e) {
            reject(e);
          }
        };
        var step = (x) => x.done ? resolve(x.value) : Promise.resolve(x.value).then(fulfilled, rejected);
        step((generator = generator.apply(__this, __arguments)).next());
      });
    };
    class LanguageManager {
      constructor(defaultLanguage, resourcesRepo, imagesRepo, eventTarget) {
        this.defaultLanguage = defaultLanguage;
        this.resourcesRepo = resourcesRepo;
        this.imagesRepo = imagesRepo;
        this.eventTarget = eventTarget;
        this._currentLanguage = defaultLanguage;
      }
      switchToLanguage(languageIso) {
        return __async$d(this, null, function* () {
          if (languageIso !== this.currentLanguage) {
            this._currentLanguage = languageIso;
            yield this.resourcesRepo.initPromise;
            const updateList = this.resourcesRepo.changeDynamicCollection(languageIso);
            yield processAll(updateList, (assetId) => this.imagesRepo.reloadImage(assetId).catch((e) => nativeLogger.error(`ERROR: Failed to load image "${assetId}" for "${languageIso}" language. ${this.defaultLanguage} version will be used instead as default`)));
            this.eventTarget.dispatchEvent(new LanguageChangedEvent(languageIso));
          }
        });
      }
      get currentLanguage() {
        return this._currentLanguage;
      }
      release() {
        this.resourcesRepo = null;
        this.imagesRepo = null;
        this.eventTarget = null;
      }
    }

    var __async$c = (__this, __arguments, generator) => {
      return new Promise((resolve, reject) => {
        var fulfilled = (value) => {
          try {
            step(generator.next(value));
          } catch (e) {
            reject(e);
          }
        };
        var rejected = (value) => {
          try {
            step(generator.throw(value));
          } catch (e) {
            reject(e);
          }
        };
        var step = (x) => x.done ? resolve(x.value) : Promise.resolve(x.value).then(fulfilled, rejected);
        step((generator = generator.apply(__this, __arguments)).next());
      });
    };
    class Scene extends Container {
      constructor(root) {
        super();
        this.root = root;
        this._isInitialized = false;
      }
      showOverlay(enableBackground = true) {
        this.root.showOverlay(enableBackground);
      }
      hideOverlay() {
        this.root.hideOverlay();
      }
      initialize() {
        return __async$c(this, null, function* () {
          if (this._isInitialized) {
            return;
          }
          this.addEventListener(EventType.ADDED_TO_CONTAINER, () => this.onShown());
          this.addEventListener(EventType.REMOVED_FROM_CONTAINER, () => this.onHidden());
          this.addEventListener(EventType.LANGUAGE_CHANGED, (e) => this.onLanguageChanged(e.newLanguageIso));
          yield this.onInitialize();
          this._isInitialized = true;
        });
      }
      loadCollection(collection, onCollectionReady) {
        if (onCollectionReady != null) {
          collection.addEventListener(EventType.SPRITES_COLLECTION_COMPLETED, (e) => onCollectionReady(collection));
        }
        collection.addEventListener(EventType.ERROR, (e) => this.onError(e.error));
        return collection.load();
      }
      getCanvasX(x) {
        return this.root.renderer.getCanvasX(x);
      }
      getCanvasY(y) {
        return this.root.renderer.getCanvasY(y);
      }
      compileProgram(id, vertexShader, fragmentShader) {
        this.root.renderer.compileProgram(id, vertexShader, fragmentShader);
      }
      showGenericError(e) {
        this.root.showGenericError(e);
      }
      reloadLocalization(langIso) {
        this.root.reloadLocalization(langIso);
      }
      get id() {
        return this.constructor.name;
      }
      get isInitialized() {
        return this._isInitialized;
      }
      get resources() {
        return this.root.resources;
      }
      get languages() {
        return this.root.languages;
      }
      get eventProxy() {
        return this.root.eventProxy;
      }
      get renderer() {
        return this.root.renderer;
      }
      get screenManager() {
        return this.root.screenManager;
      }
      get images() {
        return this.root.images;
      }
      get spritesBuilder() {
        return this.root.spritesBuilder;
      }
      get screenWidth() {
        return this.root.screenWidth;
      }
      get screenHeight() {
        return this.root.screenHeight;
      }
      get screenScale() {
        return this.root.screenScale;
      }
      onInitialize() {
        return Promise.resolve();
      }
      onShown() {
      }
      onHidden() {
      }
      onLanguageChanged(languageIso) {
      }
      onError(e) {
        this.showGenericError(e);
      }
      setupButton(button, onClick, idleState = null, pressState = null) {
        const defaultScale = button.scaleX;
        function change(scale, state) {
          button.scaleX = button.scaleY = scale;
          if (state != null) {
            button.setState(state);
          }
        }
        button.addEventListener(EventType.MOUSE_DOWN, (e) => {
          change(defaultScale * 1.1, pressState);
        });
        button.addEventListener(EventType.MOUSE_OUT, (e) => {
          change(defaultScale, idleState);
        });
        button.addEventListener(EventType.MOUSE_UP, (e) => {
          change(defaultScale, idleState);
        });
        button.addEventListener(EventType.CLICK, (e) => {
          change(defaultScale, idleState);
          onClick();
        });
      }
      toString() {
        return this.constructor.name;
      }
      release() {
        super.release();
        this.root = null;
      }
    }

    var __async$b = (__this, __arguments, generator) => {
      return new Promise((resolve, reject) => {
        var fulfilled = (value) => {
          try {
            step(generator.next(value));
          } catch (e) {
            reject(e);
          }
        };
        var rejected = (value) => {
          try {
            step(generator.throw(value));
          } catch (e) {
            reject(e);
          }
        };
        var step = (x) => x.done ? resolve(x.value) : Promise.resolve(x.value).then(fulfilled, rejected);
        step((generator = generator.apply(__this, __arguments)).next());
      });
    };
    class ErrorSceneBase extends Scene {
      constructor() {
        super(...arguments);
        this._type = "BASE";
        this._locationPrefix = "public/assets/images/";
        this._layerUrls = {
          Overlay: "overlay.png",
          Base: "",
          Btn: ""
        };
        this._sprites = [];
      }
      onInitialize() {
        return __async$b(this, null, function* () {
          this.removeChildren();
          yield Promise.all([
            this.loadAndCreate(this._locationPrefix + this._layerUrls.Overlay, this.setupOverlay),
            this.loadAndCreate(this._locationPrefix + this._layerUrls.Base, this.setupBase),
            this.loadAndCreate(this._locationPrefix + this._layerUrls.Btn, this.setupButtonAction)
          ]);
        });
      }
      onHidden() {
        this._sprites.forEach((sprite) => sprite.deallocateTextures(this.root.renderer));
      }
      buttonAction() {
        window.location.reload();
      }
      loadAndCreate(url, setup) {
        return __async$b(this, null, function* () {
          return loadImage(url).then((resource) => {
            const sprite = new Sprite(url);
            sprite.addStateImage(url, new Image$1(resource));
            setup.call(this, sprite);
            this._sprites.push(sprite);
          }).catch((e) => {
            nativeLogger.error(`Failed to show ${this._type} ERROR POPUP. ${e.stack}`);
          });
        });
      }
      setupOverlay(sprite) {
        sprite.width = this.screenWidth;
        sprite.height = this.screenHeight;
        this.addChildAt(sprite, 0 /* Overlay */);
      }
      setupBase(sprite) {
        sprite.anchorX = 0.5;
        sprite.height = 420;
        sprite.scaleX = sprite.scaleY;
        sprite.x = this.screenWidth / 2;
        sprite.y = 30;
        this.addChildAt(sprite, 1 /* Base */);
      }
      setupButtonAction(sprite) {
        sprite.anchorX = sprite.anchorY = 0.5;
        sprite.height = 70;
        sprite.scaleX = sprite.scaleY;
        sprite.y = 110 + sprite.height / 2;
        sprite.x = this.screenWidth / 2;
        this.setupButton(sprite, () => this.buttonAction());
        this.addChildAt(sprite, 2 /* Btn */);
      }
    }

    class ConnectionErrorScene extends ErrorSceneBase {
      constructor(root) {
        super(root);
        this._type = "CONNECTION";
        this._layerUrls.Base = "connection_error_popup.webp";
        this._layerUrls.Btn = "generic_error_popup_btn.webp";
      }
    }

    class GenericErrorScene extends ErrorSceneBase {
      constructor(root) {
        super(root);
        this._type = "GENERIC";
        this._layerUrls.Base = "generic_error_popup.webp";
        this._layerUrls.Btn = "generic_error_popup_btn.webp";
      }
    }

    const CANCELLATION_THRESHOLD = 2;
    class ScrollArea extends Container {
      constructor(x, y, areaWidth = 0, areaHeight = 0) {
        super(x, y);
        this.touchArea = new TouchArea(0, 0, areaWidth, areaHeight);
        super.addChildAt(this.touchArea, 0);
        this.scrollContainer = new Container();
        super.addChildAt(this.scrollContainer, 1);
        this.startOffset = new Point();
        this.startMovePoint = new Point();
        this.targetOffset = new Point();
        this.limits = new Point();
        this._isScrolling = false;
        this.fading = 1;
        this.addEventListener(EventType.MOUSE_DOWN, (e) => this.startMovement(e));
        this.addEventListener(EventType.MOUSE_MOVE, (e) => this.movement(e));
        this.addEventListener(EventType.MOUSE_UP, (e) => this.stopMovement(e));
        this.addEventListener(EventType.MOUSE_OUT, (e) => this.stopMovement(e));
        this.addEventListener(EventType.ENTER_FRAME, (e) => this.onEnterFrame());
      }
      addChildAt(child, index) {
        this.scrollContainer.addChildAt(child, index);
      }
      removeChildAt(index) {
        this.scrollContainer.removeChildAt(index);
      }
      getChildAt(index) {
        return this.scrollContainer.getChildAt(index);
      }
      getChildIndex(child) {
        return this.scrollContainer.getChildIndex(child);
      }
      removeChildren() {
        return this.scrollContainer.removeChildren();
      }
      forEach(operation) {
        this.scrollContainer.forEach(operation);
      }
      getChildren() {
        return this.scrollContainer.getChildren();
      }
      setScrollLimitX(value) {
        this.limits.x = value;
      }
      setScrollLimitY(value) {
        this.limits.y = value;
      }
      setFading(value) {
        this.fading = value;
      }
      get childrenCount() {
        return this.scrollContainer.childrenCount;
      }
      get isScrolling() {
        return this._isScrolling;
      }
      get offsetRatioX() {
        return this.limits.x === 0 ? 0 : this.targetOffset.x / this.limits.x;
      }
      set offsetRatioX(value) {
        this.targetOffset.x = this.limits.x * value;
      }
      get offsetRatioY() {
        return this.limits.y === 0 ? 0 : this.targetOffset.y / this.limits.y;
      }
      set offsetRatioY(value) {
        this.targetOffset.y = this.limits.y * value;
      }
      get moveOffset() {
        if (this._isScrolling) {
          return this.targetOffset.distanceTo(this.startOffset);
        }
        return 0;
      }
      get width() {
        return this.touchArea.width;
      }
      get height() {
        return this.touchArea.height;
      }
      startMovement(e) {
        this._isScrolling = true;
        this.startOffset.x = this.targetOffset.x = this.scrollContainer.x;
        this.startOffset.y = this.targetOffset.y = this.scrollContainer.y;
        this.startMovePoint.set(e.x, e.y);
      }
      movement(e) {
        if (this._isScrolling) {
          const x = this.startOffset.x + (e.x - this.startMovePoint.x);
          const y = this.startOffset.y + (e.y - this.startMovePoint.y);
          this.targetOffset.x = Math.max(Math.min(x, this.limits.x), 0);
          this.targetOffset.y = Math.max(Math.min(y, this.limits.y), 0);
          if (this.moveOffset > CANCELLATION_THRESHOLD) {
            this.scrollContainer.dispatchOutToChildren(createMouseEvent(EventType.MOUSE_OUT, e.x, e.y));
          }
        }
      }
      onEnterFrame() {
        this.scrollContainer.x += (this.targetOffset.x - this.scrollContainer.x) * this.fading;
        this.scrollContainer.y += (this.targetOffset.y - this.scrollContainer.y) * this.fading;
      }
      stopMovement(e) {
        this._isScrolling = false;
      }
      release() {
        var _a, _b;
        super.release();
        (_a = this.touchArea) == null ? void 0 : _a.release();
        (_b = this.scrollContainer) == null ? void 0 : _b.release();
        this.touchArea = null;
        this.scrollContainer = null;
      }
    }

    var __async$a = (__this, __arguments, generator) => {
      return new Promise((resolve, reject) => {
        var fulfilled = (value) => {
          try {
            step(generator.next(value));
          } catch (e) {
            reject(e);
          }
        };
        var rejected = (value) => {
          try {
            step(generator.throw(value));
          } catch (e) {
            reject(e);
          }
        };
        var step = (x) => x.done ? resolve(x.value) : Promise.resolve(x.value).then(fulfilled, rejected);
        step((generator = generator.apply(__this, __arguments)).next());
      });
    };
    const SPRITE_LANG_BUTTON = (langIso) => `lang_button_${langIso}`;
    const IMG_LANG_BUTTON_VACANT = (langIso) => `lang_switcher_${langIso}_vacant`;
    const IMG_LANG_BUTTON_ACTIVE = (langIso) => `lang_switcher_${langIso}_active`;
    const CONTAINER_LANGUAGES = "languages_list_container";
    const EVENT_DISABLE_LANG_BUTTONS = "disable_lang_buttons";
    const LANG_BUTTONS_SHADER_ID = "lang_switcher_buttons_mask";
    const TRIGGER_SOURCE = "Login Page";
    const BORDERS_MIN_INDENT = 5;
    const BASE_ASPECT_RATIO = 1.514;
    const TITLE_WIDTH_RATIO = 0.75;
    const TITLE_VS_TOP_INDENT = 25;
    const CAPTION_VS_OK_INDENT = 5;
    const SCROLLBAR_VS_BORDER_RIGHT_INDENT = 15;
    const SCROLLBAR_VS_BORDER_BOTTOM_INDENT = 30;
    const SCROLLBAR_VS_BORDER_TOP_INDENT = 100;
    const SCROLLBAR_THUMB_TOCUH_WIDTH = 100;
    const SCROLLBAR_THUMB_TOUCH_HEIGHT_ADD = 30;
    const LANG_BUTTONS_VS_TITLE_INDENT = 15;
    const LANG_BUTTON_RATIO = 0.28;
    const HORIZIONTAL_CAPTION_LANG_BUTTONS = 10;
    const VERTICAL_INDENT_LANG_BUTTONS = 10;
    const ALPHA_MASKING_HEIGHT = 30;
    const LAYERS_ORDER$1 = [
      "overlay" /* OVERLAY */,
      "lang_switcher_bg" /* POPUP_BG */,
      CONTAINER_LANGUAGES,
      "lang_switcher_scrollbar_track" /* SCROLLBAR_TRACK */,
      "lang_switcher_scrollbar_thumb" /* SCROLLBAR_THUMB */,
      "x_button" /* X_BUTTON */,
      "ok_button" /* OK_BUTTON */,
      "lang_switcher_title" /* TITLE_TEXT */,
      "lang_switcher_caption" /* CAPTION_TEXT */
    ];
    class LanguageSwitcherScene extends Scene {
      constructor(root) {
        super(root);
        this.mainCollection = null;
        this.langsCollection = null;
        this.langButtonsIso = [];
        this.scrollMaxLimit = 0;
        this.borders = null;
        this.scroll = null;
        this.scrollbarScroll = null;
        this.currentLanguage = null;
        this.choosenLanguage = null;
        this.supportedLanguages = null;
      }
      onInitialize() {
        return __async$a(this, null, function* () {
          this.buildBorders();
          this.mainCollection = new SpriteCollection(this.spritesBuilder, new SpriteDefinition("overlay" /* OVERLAY */), new SpriteDefinition("lang_switcher_bg" /* POPUP_BG */), new SpriteDefinition("lang_switcher_title" /* TITLE_TEXT */), new SpriteDefinition("lang_switcher_caption" /* CAPTION_TEXT */), new SpriteDefinition("x_button" /* X_BUTTON */, "lang_switcher_btn_x_up" /* X_BUTTON_UP */, "lang_switcher_btn_x_down" /* X_BUTTON_DOWN */), new SpriteDefinition("ok_button" /* OK_BUTTON */, "lang_switcher_btn_ok_on" /* OK_BUTTON_ON */, "lang_switcher_btn_ok_off" /* OK_BUTTON_OFF */), new SpriteDefinition("lang_switcher_scrollbar_thumb" /* SCROLLBAR_THUMB */), new SpriteDefinition("lang_switcher_scrollbar_track" /* SCROLLBAR_TRACK */));
          this.mainCollection.awaitSprite("overlay" /* OVERLAY */, (c, s) => this.setupOverlay(s));
          this.mainCollection.awaitSprite("lang_switcher_bg" /* POPUP_BG */, (c, s) => this.setupBg(s));
          this.mainCollection.awaitSprite("lang_switcher_title" /* TITLE_TEXT */, (c, s) => this.setupTitle(s));
          this.mainCollection.awaitSprite("lang_switcher_caption" /* CAPTION_TEXT */, (c, s) => this.setupCaptionText(s));
          this.mainCollection.awaitSprite("x_button" /* X_BUTTON */, (c, s) => this.setupXButton(s));
          this.mainCollection.awaitSprite("ok_button" /* OK_BUTTON */, (c, s) => this.setupOkButton(s));
          yield this.loadCollection(this.mainCollection);
          this.onLoadedMain(this.mainCollection);
          yield this.buildLanguagesTable(this.mainCollection);
        });
      }
      onLanguageChanged(language) {
        if (this.mainCollection != null) {
          this.mainCollection.actualizeSpritesContent();
          this.alignMain(this.mainCollection);
        }
        if (this.langsCollection != null) {
          this.langsCollection.actualizeSpritesContent();
          this.alignLangButtons(this.langsCollection);
        }
      }
      onError(e) {
        analyticsProxy.trackLanguageSelectorFlowFailure();
        super.onError(e);
      }
      onLoadedMain(collection) {
        analyticsProxy.trackLanguageSelectorPopupImpressionSuccess(TRIGGER_SOURCE, this.supportedLanguages);
        this.alignMain(collection);
      }
      setLanguages(currentLanguage, supportedLanguages) {
        this.currentLanguage = currentLanguage;
        this.choosenLanguage = currentLanguage;
        this.supportedLanguages = supportedLanguages;
      }
      chooseLanguage(langIso) {
        this.choosenLanguage = langIso;
        this.updateOkButtonState();
      }
      onOkButtonClick() {
        analyticsProxy.trackLanguageSelectorLanguageSelected(TRIGGER_SOURCE, this.currentLanguage, this.choosenLanguage);
        this.reloadLocalization(this.choosenLanguage);
        this.currentLanguage = this.choosenLanguage;
        this.updateOkButtonState();
      }
      updateOkButtonState() {
        if (this.mainCollection == null) {
          return;
        }
        const okBtn = this.mainCollection.get("ok_button" /* OK_BUTTON */);
        okBtn.setState(this.choosenLanguage !== this.currentLanguage ? "lang_switcher_btn_ok_on" /* OK_BUTTON_ON */ : "lang_switcher_btn_ok_off" /* OK_BUTTON_OFF */);
        okBtn.touchable = this.choosenLanguage !== this.currentLanguage;
      }
      buildBorders() {
        let h = this.screenHeight - BORDERS_MIN_INDENT * 2;
        let w = h * BASE_ASPECT_RATIO;
        if (w > this.screenWidth - BASE_ASPECT_RATIO * 2) {
          w = this.screenWidth - BASE_ASPECT_RATIO * 2;
          h = w / BASE_ASPECT_RATIO;
        }
        const height = h;
        const width = w;
        const left = this.screenWidth / 2 - width / 2;
        const bottom = this.screenHeight / 2 - height / 2;
        this.borders = {
          left,
          bottom,
          width,
          height,
          right: left + width,
          top: bottom + height,
          midX: left + width / 2,
          midY: bottom + height / 2
        };
      }
      setupXButton(xBtn) {
        this.setupButton(xBtn, () => {
          this.root.screenManager.showScreen(ScreenId.SPLASH_SCREEN);
          this.root.screenManager.showScreen(ScreenId.LOGIN_SCREEN);
        }, "lang_switcher_btn_x_up" /* X_BUTTON_UP */, "lang_switcher_btn_x_down" /* X_BUTTON_DOWN */);
        this.addChildAt(xBtn, LAYERS_ORDER$1.indexOf("x_button" /* X_BUTTON */));
      }
      setupOkButton(okBtn) {
        okBtn.setState("lang_switcher_btn_ok_off" /* OK_BUTTON_OFF */);
        okBtn.touchable = false;
        this.setupButton(okBtn, () => this.onOkButtonClick());
        this.addChildAt(okBtn, LAYERS_ORDER$1.indexOf("ok_button" /* OK_BUTTON */));
      }
      setupTitle(titleTxt) {
        titleTxt.touchable = false;
        this.addChildAt(titleTxt, LAYERS_ORDER$1.indexOf("lang_switcher_title" /* TITLE_TEXT */));
      }
      setupCaptionText(captionTxt) {
        this.addChildAt(captionTxt, LAYERS_ORDER$1.indexOf("lang_switcher_caption" /* CAPTION_TEXT */));
      }
      setupBg(bg) {
        this.addChildAt(bg, LAYERS_ORDER$1.indexOf("lang_switcher_bg" /* POPUP_BG */));
      }
      setupOverlay(overlay) {
        this.addChildAt(overlay, LAYERS_ORDER$1.indexOf("overlay" /* OVERLAY */));
      }
      alignMain(collection) {
        this.alignOverlay(collection);
        this.alignBg(collection);
        this.alignTitle(collection);
        this.alignXButton(collection);
        this.alignOkButton(collection);
        this.alignCaptionText(collection);
      }
      alignXButton(collection) {
        const xBtn = collection.get("x_button" /* X_BUTTON */);
        xBtn.anchorX = xBtn.anchorY = 0.5;
        xBtn.x = this.borders.right - xBtn.width / 2 + 10;
        xBtn.y = this.borders.top - xBtn.height / 2 + 10;
      }
      alignOkButton(collection) {
        const okBtn = collection.get("ok_button" /* OK_BUTTON */);
        okBtn.anchorX = okBtn.anchorY = 0.5;
        okBtn.x = this.borders.midX;
        okBtn.y = this.borders.bottom + 50;
      }
      alignTitle(collection) {
        const titleTxt = collection.get("lang_switcher_title" /* TITLE_TEXT */);
        titleTxt.anchorX = 0.5;
        titleTxt.anchorY = 1;
        titleTxt.x = this.borders.midX;
        titleTxt.y = this.borders.top - TITLE_VS_TOP_INDENT;
        titleTxt.height = 50;
        titleTxt.scaleX = titleTxt.scaleY;
        if (titleTxt.width > this.borders.width * TITLE_WIDTH_RATIO) {
          titleTxt.width = this.borders.width * TITLE_WIDTH_RATIO;
          titleTxt.scaleY = titleTxt.scaleX;
        }
      }
      alignCaptionText(collection) {
        const captionTxt = collection.get("lang_switcher_caption" /* CAPTION_TEXT */);
        const okBtn = collection.get("ok_button" /* OK_BUTTON */);
        captionTxt.anchorX = 0.5;
        captionTxt.x = this.borders.midX;
        captionTxt.y = okBtn.top + CAPTION_VS_OK_INDENT;
        captionTxt.touchable = false;
      }
      alignBg(collection) {
        const bg = collection.get("lang_switcher_bg" /* POPUP_BG */);
        bg.anchorX = bg.anchorY = 0.5;
        bg.x = this.borders.midX;
        bg.y = this.borders.midY;
        bg.width = this.borders.width;
        bg.height = this.borders.height;
      }
      alignOverlay(collection) {
        const overlay = collection.get("overlay" /* OVERLAY */);
        overlay.width = this.screenWidth;
        overlay.height = this.screenHeight;
      }
      buildLanguagesTable(mainCollection) {
        this.buildLanguagesScrollArea(mainCollection);
        const definitions = [];
        for (const langIso of this.supportedLanguages) {
          const spriteId = SPRITE_LANG_BUTTON(langIso);
          const activeImgAlias = IMG_LANG_BUTTON_ACTIVE(langIso);
          const vacantImgAlias = IMG_LANG_BUTTON_VACANT(langIso);
          if (this.resources.isRegistered(activeImgAlias, vacantImgAlias)) {
            definitions.push(new SpriteDefinition(spriteId, vacantImgAlias, activeImgAlias));
            this.langButtonsIso.push(langIso);
          } else {
            nativeLogger.warn(`[LanguageSwitcher] one or both assets "${activeImgAlias}" and "${vacantImgAlias}" are absent in preloader assets manifest.
                "${langIso}" will not be present for choose.`);
          }
        }
        this.langsCollection = new SpriteCollection(this.spritesBuilder, ...definitions);
        return this.loadCollection(this.langsCollection, (collection) => this.onLangButtonsReady(mainCollection, collection));
      }
      onLangButtonsReady(mainCollection, langsCollection) {
        this.alignLangButtons(langsCollection);
        this.setupLangButtons(langsCollection);
        this.tryActivateScrollBehaviour(mainCollection, langsCollection);
      }
      buildLanguagesScrollArea(mainCollection) {
        const titleTxtBottom = mainCollection.get("lang_switcher_title" /* TITLE_TEXT */).bottom;
        const captionTxtTop = mainCollection.get("lang_switcher_caption" /* CAPTION_TEXT */).top;
        const areaX = this.borders.left;
        const areaY = captionTxtTop;
        const areaWidth = this.borders.width;
        const areaHeight = titleTxtBottom - LANG_BUTTONS_VS_TITLE_INDENT - captionTxtTop;
        this.scroll = new ScrollArea(areaX, areaY, areaWidth, areaHeight);
        this.scroll.setFading(0.2);
        this.addChildAt(this.scroll, LAYERS_ORDER$1.indexOf(CONTAINER_LANGUAGES));
      }
      setupLangButtons(collection) {
        for (let i = 0; i < this.langButtonsIso.length; i++) {
          const langIso = this.langButtonsIso[i];
          const spriteId = SPRITE_LANG_BUTTON(langIso);
          const sprite = collection.get(spriteId);
          const vacantImgAlias = IMG_LANG_BUTTON_VACANT(langIso);
          const activeImgAlias = IMG_LANG_BUTTON_ACTIVE(langIso);
          this.setupLangButton(sprite, langIso, vacantImgAlias, activeImgAlias);
        }
      }
      setupLangButton(btn, langIso, vacantStateId, activeStateId) {
        btn.setState(this.currentLanguage === langIso ? activeStateId : vacantStateId);
        this.setupButton(btn, () => {
          this.scroll.dispatchEvent(createEvent(EVENT_DISABLE_LANG_BUTTONS));
          btn.setState(activeStateId);
          this.chooseLanguage(langIso);
        });
        btn.addEventListener(EVENT_DISABLE_LANG_BUTTONS, (e) => btn.setState(vacantStateId));
        this.scroll.addChildAt(btn, this.scroll.childrenCount);
        const outDistance = -btn.bottom + btn.height / 2;
        if (outDistance > 0 && outDistance > this.scrollMaxLimit) {
          this.scrollMaxLimit = outDistance;
          this.scroll.setScrollLimitY(this.scrollMaxLimit);
        }
      }
      alignLangButtons(langsCollection) {
        for (let i = 0; i < this.langButtonsIso.length; i++) {
          const langIso = this.langButtonsIso[i];
          const spriteId = SPRITE_LANG_BUTTON(langIso);
          const sprite = langsCollection.get(spriteId);
          this.alignLangButton(sprite, i);
        }
      }
      alignLangButton(btn, index) {
        const lineNumber = Math.floor(index / 3);
        const lineOffset = lineNumber * (btn.height + VERTICAL_INDENT_LANG_BUTTONS);
        const scrollMidX = this.scroll.width / 2;
        btn.anchorX = btn.anchorY = 0.5;
        btn.width = this.borders.width * LANG_BUTTON_RATIO;
        btn.scaleY = btn.scaleX;
        btn.x = scrollMidX + (btn.width + HORIZIONTAL_CAPTION_LANG_BUTTONS) * (index % 3 - 1);
        btn.y = this.scroll.height - lineOffset - btn.height / 2;
      }
      tryActivateScrollBehaviour(mainCollection, langsCollection) {
        if (this.scrollMaxLimit > 0) {
          this.setupScrollbar(mainCollection);
          this.registerShaderProgram(mainCollection);
          for (const langIso of this.langButtonsIso) {
            const langBtn = langsCollection.get(SPRITE_LANG_BUTTON(langIso));
            langBtn.shaderProgram = LANG_BUTTONS_SHADER_ID;
          }
        }
      }
      setupScrollbar(collection) {
        if (!collection.isSpritesLoaded("lang_switcher_scrollbar_track" /* SCROLLBAR_TRACK */, "lang_switcher_scrollbar_thumb" /* SCROLLBAR_THUMB */)) {
          return;
        }
        const track = collection.get("lang_switcher_scrollbar_track" /* SCROLLBAR_TRACK */);
        const thumb = collection.get("lang_switcher_scrollbar_thumb" /* SCROLLBAR_THUMB */);
        if (track == null || thumb == null)
          return;
        const trackTop = this.borders.top - SCROLLBAR_VS_BORDER_TOP_INDENT;
        const trackBot = this.borders.bottom + SCROLLBAR_VS_BORDER_BOTTOM_INDENT;
        track.anchorX = 1;
        track.anchorY = 1;
        track.x = this.borders.right - SCROLLBAR_VS_BORDER_RIGHT_INDENT;
        track.y = trackTop;
        track.height = trackTop - trackBot;
        track.scaleX = track.scaleY;
        thumb.scaleX = thumb.scaleY = track.scaleX;
        thumb.anchorX = 0.5;
        const thumbContainer = new Container();
        const thumbTouchArea = new TouchArea(-track.width / 2 - 10, -SCROLLBAR_THUMB_TOUCH_HEIGHT_ADD, SCROLLBAR_THUMB_TOCUH_WIDTH, thumb.height + SCROLLBAR_THUMB_TOUCH_HEIGHT_ADD * 2);
        thumbContainer.addChildAt(thumbTouchArea, 0);
        thumbContainer.addChildAt(thumb, 1);
        const scroll = new ScrollArea(track.x - track.width / 2, track.bottom);
        scroll.setScrollLimitY(track.height - thumb.height);
        scroll.addChildAt(thumbContainer, 0);
        this.scrollbarScroll = scroll;
        this.addChildAt(track, LAYERS_ORDER$1.indexOf("lang_switcher_scrollbar_track" /* SCROLLBAR_TRACK */));
        this.addChildAt(scroll, LAYERS_ORDER$1.indexOf("lang_switcher_scrollbar_thumb" /* SCROLLBAR_THUMB */));
        this.scrollbarScroll.offsetRatioY = 1;
        this.addEventListener("enterframe", (e) => {
          if (this.scroll.isScrolling) {
            this.scrollbarScroll.offsetRatioY = 1 - this.scroll.offsetRatioY;
          }
          if (this.scrollbarScroll.isScrolling) {
            this.scroll.offsetRatioY = 1 - this.scrollbarScroll.offsetRatioY;
          }
        });
      }
      registerShaderProgram(mainCollection) {
        const title = mainCollection.get("lang_switcher_title" /* TITLE_TEXT */);
        const caption = mainCollection.get("lang_switcher_caption" /* CAPTION_TEXT */);
        const topOutEnd = this.getCanvasY(title.bottom);
        const topOutStart = this.getCanvasY(title.bottom - ALPHA_MASKING_HEIGHT);
        const botOutEnd = this.getCanvasY(caption.top);
        const botOutStart = this.getCanvasY(caption.top + ALPHA_MASKING_HEIGHT);
        const toe = topOutEnd.toFixed(1);
        const tos = topOutStart.toFixed(1);
        const bos = botOutStart.toFixed(1);
        const boe = botOutEnd.toFixed(1);
        const topOffset = Math.abs(topOutEnd - topOutStart).toFixed(1);
        const botOffset = Math.abs(botOutStart - botOutEnd).toFixed(1);
        const spritevs_src = `
            attribute highp vec4 aPosition;
            attribute highp vec2 aTexture;
            varying highp vec4 vPosition;
            varying highp vec2 vTexture;
            void main() {
                vTexture = aTexture;
                vPosition = aPosition;
                gl_Position = aPosition;
            }
        `;
        const spritefs_src = `
            precision highp float;
            varying highp vec2 vTexture;
            varying highp vec4 vPosition;
            uniform lowp sampler2D u_texture;
            void main() {
                vec4 color = texture2D(u_texture, vTexture);
                if (vPosition.y > ${tos}) {
                    color.w *= (${toe} - vPosition.y) / ${topOffset};
                }
                if (vPosition.y < ${bos}) {
                    color.w *= (vPosition.y - ${boe}) / ${botOffset};
                }
                gl_FragColor = color;
            }
        `;
        this.compileProgram(LANG_BUTTONS_SHADER_ID, spritevs_src, spritefs_src);
      }
      onHidden() {
        var _a, _b;
        (_a = this.mainCollection) == null ? void 0 : _a.deallocateTextures(this.root.renderer);
        (_b = this.langsCollection) == null ? void 0 : _b.deallocateTextures(this.root.renderer);
      }
      release() {
        var _a, _b, _c, _d;
        super.release();
        (_a = this.mainCollection) == null ? void 0 : _a.release();
        (_b = this.langsCollection) == null ? void 0 : _b.release();
        (_c = this.scrollbarScroll) == null ? void 0 : _c.release();
        (_d = this.scroll) == null ? void 0 : _d.release();
        this.mainCollection = null;
        this.langsCollection = null;
        this.scrollbarScroll = null;
        this.scroll = null;
      }
    }

    const BASE_HEIGHT = 640;
    const ImageId = {
      LOGIN_BACKGROUND: "login_bg_embedded_text",
      FACEBOOK_BTN: "facebook_signin_btn",
      GOOGLE_PLAY_GAMES_BTN: "google_play_games_signin_btn",
      APPLE_BTN: "apple_signin_btn",
      LATER_BTN: "guest_signin_btn",
      LANGUAGE_SWITCHER_BTN: "switch"
    };
    const LAYERS_ORDER = [
      ImageId.LOGIN_BACKGROUND,
      ImageId.FACEBOOK_BTN,
      ImageId.GOOGLE_PLAY_GAMES_BTN,
      ImageId.APPLE_BTN,
      ImageId.LATER_BTN,
      ImageId.LANGUAGE_SWITCHER_BTN
    ];
    const SHOW_APPLE_SING_IN_BUTTON = "showAppleSignInButton";
    class LoginScene extends Scene {
      constructor(root) {
        super(root);
        this.collection = this.spritesBuilder.buildCollection(new SpriteDefinition(ImageId.LOGIN_BACKGROUND), new SpriteDefinition(ImageId.FACEBOOK_BTN), new SpriteDefinition(ImageId.GOOGLE_PLAY_GAMES_BTN), new SpriteDefinition(ImageId.APPLE_BTN), new SpriteDefinition(ImageId.LATER_BTN), new SpriteDefinition(ImageId.LANGUAGE_SWITCHER_BTN));
        this.showAppleListener = () => {
          this.isShowAppleButtonCalled = true;
          this.tryToShowAppleButton();
        };
        this.isLangSwitcherEnabled = false;
        this.isShowAppleButtonCalled = false;
      }
      onInitialize() {
        this.collection.awaitSprite(ImageId.LOGIN_BACKGROUND, (c, s) => this.setupLoginBackground(s));
        this.collection.awaitSprite(ImageId.FACEBOOK_BTN, (c, s) => this.setupFacebookButton(s));
        this.collection.awaitSprite(ImageId.GOOGLE_PLAY_GAMES_BTN, (c, s) => this.setupGooglePlayGamesButton(s));
        this.collection.awaitSprite(ImageId.LATER_BTN, (c, s) => this.setupLaterButton(s));
        this.collection.awaitSprite(ImageId.LANGUAGE_SWITCHER_BTN, (c, s) => this.setupLanguageSwitcherButton(s));
        this.collection.awaitSprites([ImageId.APPLE_BTN, ImageId.LATER_BTN], (c) => this.tryToShowAppleButton());
        this.eventProxy.addDocumentEventListener(SHOW_APPLE_SING_IN_BUTTON, this.showAppleListener, false);
        return this.loadCollection(this.collection, (collection) => this.alignAll(collection));
      }
      showLanguageSwitcherButton() {
        this.isLangSwitcherEnabled = true;
        this.updateLanguageSwitcherState();
      }
      get isAppleButtonEnabled() {
        return getAppVars().apple_sign_in_available || this.isShowAppleButtonCalled;
      }
      onLanguageChanged() {
        if (this.collection != null) {
          this.collection.actualizeSpritesContent();
          this.alignAll(this.collection);
        }
      }
      onHidden() {
        this.collection.deallocateTextures(this.root.renderer);
      }
      tryToShowAppleButton() {
        if (this.collection.isSpritesLoaded(ImageId.APPLE_BTN, ImageId.LATER_BTN)) {
          this.alignAppleButton(this.collection);
          this.setupAppleButton(this.collection);
        }
      }
      setupLoginBackground(sprite) {
        this.addChildAt(sprite, LAYERS_ORDER.indexOf(ImageId.LOGIN_BACKGROUND));
      }
      setupFacebookButton(sprite) {
        this.alignFacebookButton(sprite);
        this.setupButton(sprite, () => window.onFacebookClick());
        this.addChildAt(sprite, LAYERS_ORDER.indexOf(ImageId.FACEBOOK_BTN));
      }
      setupGooglePlayGamesButton(sprite) {
        if (!GooglePlayGamesSettings.instance.isEnabled || !this.collection.isSpritesLoaded(ImageId.GOOGLE_PLAY_GAMES_BTN)) {
          return;
        }
        this.alignGooglePlayGamesButton(sprite);
        this.setupButton(sprite, () => window.onGooglePlayGamesClick());
        this.addChildAt(sprite, LAYERS_ORDER.indexOf(ImageId.GOOGLE_PLAY_GAMES_BTN));
      }
      setupAppleButton(collection) {
        const apple = collection.get(ImageId.APPLE_BTN);
        if (this.isAppleButtonEnabled && apple.parent == null) {
          this.setupButton(apple, () => {
            if (typeof window.onAppleClick === "function") {
              window.onAppleClick();
            }
          });
          this.addChildAt(apple, LAYERS_ORDER.indexOf(ImageId.APPLE_BTN));
          this.eventProxy.removeDocumentEventListener(SHOW_APPLE_SING_IN_BUTTON, this.showAppleListener, false);
        }
      }
      setupLaterButton(sprite) {
        this.alignLaterButton(sprite);
        this.setupButton(sprite, () => window.onLaterClick());
        this.addChildAt(sprite, LAYERS_ORDER.indexOf(ImageId.LATER_BTN));
      }
      setupLanguageSwitcherButton(sprite) {
        this.updateLanguageSwitcherState();
        this.alignLanguageSwitcherButton(sprite);
        this.setupButton(sprite, () => {
          this.root.screenManager.showScreen(ScreenId.LANGUAGE_SWITCHER);
        });
        this.addChildAt(sprite, LAYERS_ORDER.indexOf(ImageId.LANGUAGE_SWITCHER_BTN));
      }
      alignAll(collection) {
        this.alignLoginBackground(collection.get(ImageId.LOGIN_BACKGROUND));
        this.alignFacebookButton(collection.get(ImageId.FACEBOOK_BTN));
        this.alignLaterButton(collection.get(ImageId.LATER_BTN));
        this.alignAppleButton(collection);
        this.alignLanguageSwitcherButton(collection.get(ImageId.LANGUAGE_SWITCHER_BTN));
      }
      alignLoginBackground(sprite) {
        sprite.anchorX = 0.5;
        sprite.x = this.screenWidth / 2;
        sprite.height = this.screenHeight;
        sprite.scaleX = sprite.scaleY;
      }
      alignFacebookButton(sprite) {
        const btnYPercent = 0.553125;
        const scale = this.screenHeight / BASE_HEIGHT;
        sprite.anchorX = 0.5;
        sprite.anchorY = 1;
        sprite.scaleY = scale;
        sprite.scaleX = scale;
        sprite.x = this.screenWidth / 2;
        sprite.y = this.screenHeight * (1 - btnYPercent);
      }
      alignGooglePlayGamesButton(sprite) {
        const btnYPercent = 0.66875;
        const scale = this.screenHeight / BASE_HEIGHT;
        sprite.anchorX = 0.5;
        sprite.anchorY = 1;
        sprite.scaleY = scale;
        sprite.scaleX = scale;
        sprite.x = this.screenWidth / 2;
        sprite.y = this.screenHeight * (1 - btnYPercent);
      }
      alignAppleButton(collection) {
        if (!this.isAppleButtonEnabled) {
          return;
        }
        const btnYPercent = 0.66875;
        const scale = this.screenHeight / BASE_HEIGHT;
        const apple = collection.get(ImageId.APPLE_BTN);
        apple.anchorX = 0.5;
        apple.anchorY = 1;
        apple.scaleY = scale;
        apple.scaleX = scale;
        apple.x = this.screenWidth / 2;
        apple.y = this.screenHeight * (1 - btnYPercent);
      }
      alignLaterButton(sprite) {
        const btnYPercentSlot0 = 0.85;
        const scale = this.screenHeight / BASE_HEIGHT;
        sprite.anchorX = 0.5;
        sprite.anchorY = 1;
        sprite.scaleY = scale;
        sprite.scaleX = scale;
        sprite.x = this.screenWidth / 2;
        sprite.y = this.screenHeight * (1 - btnYPercentSlot0);
      }
      alignLanguageSwitcherButton(sprite) {
        sprite.anchorX = 0.5;
        sprite.anchorY = 0.5;
        sprite.width = sprite.height = 80;
        sprite.x = this.screenWidth - 30 - sprite.width / 2;
        sprite.y = this.screenHeight - 30 - sprite.height / 2;
      }
      updateLanguageSwitcherState() {
        if (this.collection.isSpritesLoaded(ImageId.LANGUAGE_SWITCHER_BTN)) {
          const langSwitcherBtn = this.collection.get(ImageId.LANGUAGE_SWITCHER_BTN);
          langSwitcherBtn.visible = this.isLangSwitcherEnabled;
          langSwitcherBtn.touchable = this.isLangSwitcherEnabled;
        }
      }
      release() {
        var _a;
        if (this.showAppleListener != null) {
          this.eventProxy.removeDocumentEventListener(SHOW_APPLE_SING_IN_BUTTON, this.showAppleListener, false);
        }
        super.release();
        (_a = this.collection) == null ? void 0 : _a.release();
        this.collection = null;
      }
    }

    class LoginErrorScene extends ErrorSceneBase {
      constructor(root) {
        super(root);
        this._type = "LOGIN";
        this._layerUrls.Base = "login_error_popup.webp";
        this._layerUrls.Btn = "login_error_popup_btn.webp";
      }
      buttonAction() {
        this.root.screenManager.showScreen(ScreenId.LOGIN_SCREEN);
      }
    }

    var __async$9 = (__this, __arguments, generator) => {
      return new Promise((resolve, reject) => {
        var fulfilled = (value) => {
          try {
            step(generator.next(value));
          } catch (e) {
            reject(e);
          }
        };
        var rejected = (value) => {
          try {
            step(generator.throw(value));
          } catch (e) {
            reject(e);
          }
        };
        var step = (x) => x.done ? resolve(x.value) : Promise.resolve(x.value).then(fulfilled, rejected);
        step((generator = generator.apply(__this, __arguments)).next());
      });
    };
    class LoadingTextControl extends Container {
      constructor(scene) {
        super();
        this.scene = scene;
        this.framesIndexer = 0;
        this.dotsState = 0;
        this.collection = new SpriteCollection(scene.spritesBuilder, new SpriteDefinition("loading_text" /* LOADING_TEXT */), new SpriteDefinition("loading_dot1" /* LOADING_DOT1 */, "loading_dot" /* LOADING_DOT */), new SpriteDefinition("loading_dot2" /* LOADING_DOT2 */, "loading_dot" /* LOADING_DOT */), new SpriteDefinition("loading_dot3" /* LOADING_DOT3 */, "loading_dot" /* LOADING_DOT */));
        this.addEventListener(EventType.ENTER_FRAME, (e) => this.onEnterFrame());
      }
      initialize() {
        return __async$9(this, null, function* () {
          this.collection.awaitSprites(["loading_text" /* LOADING_TEXT */, "loading_dot1" /* LOADING_DOT1 */, "loading_dot2" /* LOADING_DOT2 */, "loading_dot3" /* LOADING_DOT3 */], (c) => this.setupLoadingText(c));
          return this.scene.loadCollection(this.collection);
        });
      }
      onEnterFrame() {
        this.framesIndexer++;
        if (this.framesIndexer > 50) {
          this.framesIndexer = 0;
          this.updateDots();
        }
      }
      setupLoadingText(spritesCollection) {
        const textSprite = spritesCollection.get("loading_text" /* LOADING_TEXT */);
        textSprite.anchorX = 0.5;
        textSprite.anchorY = 0.5;
        textSprite.y = this.scene.screenHeight / 12;
        textSprite.x = this.scene.screenWidth / 2;
        this.addChildAt(textSprite, 1 /* LOADING_TEXT */);
        const dotSprite1 = spritesCollection.get("loading_dot1" /* LOADING_DOT1 */);
        dotSprite1.anchorX = 0.5;
        dotSprite1.anchorY = 0.5;
        dotSprite1.y = this.scene.screenHeight / 12 - textSprite.height / 2 + 12;
        dotSprite1.x = this.scene.screenWidth / 2 + textSprite.width / 2 + 4;
        this.addChildAt(dotSprite1, 2 /* LOADING_DOT1 */);
        const dotSprite2 = spritesCollection.get("loading_dot2" /* LOADING_DOT2 */);
        dotSprite2.anchorX = 0.5;
        dotSprite2.anchorY = 0.5;
        dotSprite2.y = this.scene.screenHeight / 12 - textSprite.height / 2 + 12;
        dotSprite2.x = this.scene.screenWidth / 2 + textSprite.width / 2 + dotSprite2.width + 4;
        this.addChildAt(dotSprite2, 3 /* LOADING_DOT2 */);
        const dotSprite3 = spritesCollection.get("loading_dot3" /* LOADING_DOT3 */);
        dotSprite3.anchorX = 0.5;
        dotSprite3.anchorY = 0.5;
        dotSprite3.y = this.scene.screenHeight / 12 - textSprite.height / 2 + 12;
        dotSprite3.x = this.scene.screenWidth / 2 + textSprite.width / 2 + dotSprite2.width * 2 + 4;
        this.addChildAt(dotSprite3, 4 /* LOADING_DOT3 */);
      }
      updateDots() {
        const dotSprite1 = this.collection.get("loading_dot1" /* LOADING_DOT1 */);
        const dotSprite2 = this.collection.get("loading_dot2" /* LOADING_DOT2 */);
        const dotSprite3 = this.collection.get("loading_dot3" /* LOADING_DOT3 */);
        this.dotsState++;
        this.dotsState = this.dotsState % 4;
        dotSprite1.visible = this.dotsState > 0;
        dotSprite2.visible = this.dotsState > 1;
        dotSprite3.visible = this.dotsState > 2;
      }
      release() {
        super.release();
        this.collection.release();
        this.scene = null;
      }
    }

    var __async$8 = (__this, __arguments, generator) => {
      return new Promise((resolve, reject) => {
        var fulfilled = (value) => {
          try {
            step(generator.next(value));
          } catch (e) {
            reject(e);
          }
        };
        var rejected = (value) => {
          try {
            step(generator.throw(value));
          } catch (e) {
            reject(e);
          }
        };
        var step = (x) => x.done ? resolve(x.value) : Promise.resolve(x.value).then(fulfilled, rejected);
        step((generator = generator.apply(__this, __arguments)).next());
      });
    };
    class OverlayScene extends Scene {
      constructor(root) {
        super(root);
        this.collection = new SpriteCollection(this.spritesBuilder);
        this.loadingTextControl = new LoadingTextControl(this);
      }
      onInitialize() {
        return __async$8(this, null, function* () {
          this.collection = new SpriteCollection(this.spritesBuilder, new SpriteDefinition("overlay" /* OVERLAY */));
          this.collection.awaitSprite("overlay" /* OVERLAY */, (c, s) => this.setupOverlay(s));
          yield this.loadingTextControl.initialize();
          this.addChildAt(this.loadingTextControl, 1 /* LOADING_TEXT_CONTROL */);
          return this.loadCollection(this.collection);
        });
      }
      showOverlay(enableBackground = true) {
        if (this.collection.isSpritesLoaded("overlay" /* OVERLAY */))
          this.collection.get("overlay" /* OVERLAY */).visible = enableBackground;
      }
      setupOverlay(sprite) {
        sprite.width = this.screenWidth;
        sprite.height = this.screenHeight;
        this.addChildAt(sprite, 0 /* OVERLAY */);
      }
    }

    const SPLASH_SCREEN_URI = "public/assets/images/splash.webp";
    class SplashScreenScene extends Scene {
      constructor(root, splashScreenPath) {
        super(root);
        this.sprite = null;
        this.splashScreenPath = "";
        this.splashScreenPath = splashScreenPath;
        this.loadingTextControl = new LoadingTextControl(this);
      }
      onInitialize() {
        const splashScreenUri = this.splashScreenPath != "" ? this.splashScreenPath : SPLASH_SCREEN_URI;
        return loadImage(splashScreenUri).then((resource) => {
          const sprite = new Sprite(splashScreenUri);
          sprite.addStateImage(splashScreenUri, new Image$1(resource));
          this.setupScreen(sprite);
        }).catch((e) => {
          nativeLogger.error(`Failed to show SPLASH SCREEN. ${e.stack}`);
        });
      }
      setupScreen(sprite) {
        this.sprite = sprite;
        sprite.anchorX = 0.5;
        sprite.x = this.screenWidth / 2;
        sprite.height = this.screenHeight;
        sprite.scaleX = sprite.scaleY;
        this.addChildAt(sprite, 0 /* OVERLAY */);
      }
      onHidden() {
        var _a;
        (_a = this.sprite) == null ? void 0 : _a.deallocateTextures(this.renderer);
      }
      release() {
        var _a;
        super.release();
        (_a = this.sprite) == null ? void 0 : _a.release();
        this.sprite = null;
      }
    }

    class SceneFactory {
      createOverlay(root) {
        return new OverlayScene(root);
      }
      createGenericErrorPopup(root) {
        return new GenericErrorScene(root);
      }
      createConnectionErrorPopup(root) {
        return new ConnectionErrorScene(root);
      }
      createSplashScreen(root, splashScreenPath) {
        return new SplashScreenScene(root, splashScreenPath);
      }
      createLoginScreen(root) {
        return new LoginScene(root);
      }
      createLanguageSwitcher(root) {
        return new LanguageSwitcherScene(root);
      }
      createLoginErrorPopup(root) {
        return new LoginErrorScene(root);
      }
    }

    class ScreenParams {
      constructor(canvasWidth, canvasHeight) {
        if (PlatformEnv.getInstance().platform === "windows") {
          const screenWidthUnits = 16 * SCREEN_HEIGHT_UNITS / 9;
          this.width = screenWidthUnits;
          this.scale = canvasWidth / screenWidthUnits;
          this.height = Math.ceil(canvasHeight * (screenWidthUnits / canvasWidth));
        } else {
          this.height = SCREEN_HEIGHT_UNITS;
          this.width = Math.ceil(canvasWidth * (this.height / canvasHeight));
          this.scale = canvasHeight / this.height;
        }
      }
    }

    var __async$7 = (__this, __arguments, generator) => {
      return new Promise((resolve, reject) => {
        var fulfilled = (value) => {
          try {
            step(generator.next(value));
          } catch (e) {
            reject(e);
          }
        };
        var rejected = (value) => {
          try {
            step(generator.throw(value));
          } catch (e) {
            reject(e);
          }
        };
        var step = (x) => x.done ? resolve(x.value) : Promise.resolve(x.value).then(fulfilled, rejected);
        step((generator = generator.apply(__this, __arguments)).next());
      });
    };
    class ScreenStateManager {
      constructor(root, overlay, genericError, connectionError) {
        this.root = root;
        this.overlay = overlay;
        this.genericError = genericError;
        this.connectionError = connectionError;
        this.validateCtorInput(root);
        this.scenesContainer = new Container();
        this.screensMap = {};
        this._currentScreenId = ScreenId.EMPTY;
      }
      initialize() {
        this.overlay.initialize();
        this.genericError.initialize();
        this.connectionError.initialize();
        this.root.addChildAt(this.scenesContainer, 0);
      }
      registerScreen(screenId, ...screen) {
        this.screensMap[screenId] = screen;
      }
      showScreen(screenId) {
        return __async$7(this, null, function* () {
          if (!this.screensMap.hasOwnProperty(screenId)) {
            throw new Error(`Failed to show Screen with id "${screenId}, it wasn't registered in ScreenManager."`);
          }
          if (screenId === this._currentScreenId || this._currentScreenId === ScreenId.GENERIC_ERROR_POPUP) {
            return;
          }
          this._currentScreenId = screenId;
          const scenes = this.screensMap[screenId];
          processAll(scenes, (scene) => scene.initialize()).then(() => {
            this.scenesContainer.removeChildren();
            for (let i = 0; i < scenes.length; i++) {
              const scene = scenes[i];
              this.scenesContainer.addChildAt(scene, i);
            }
          }).catch((e) => {
            this.showGenericError(`ERROR during scene(s) ${scenes} initialization ${e.stack}`);
          }).finally(() => {
            if (PlatformEnv.getInstance().platform === "windows") {
              window.dispatchEvent(new CustomEvent("resize"));
            }
          });
        });
      }
      showGenericError(e) {
        if (e != null) {
          nativeLogger.error("Displaying GENERIC ERROR by the next reason: " + (e instanceof Error ? e.stack : e));
        }
        this.root.removeChildAt(2);
        this.root.addChildAt(this.genericError, 2);
      }
      showConnectionError(e) {
        if (e != null) {
          nativeLogger.error("Displaying CONNECTION ERROR by the next reason: " + (e instanceof Error ? e.stack : e));
        }
        this.root.removeChildAt(2);
        this.root.addChildAt(this.connectionError, 2);
      }
      showOverlay(enableBackground = true) {
        if (this.overlay.parent == null) {
          this.root.addChildAt(this.overlay, 1);
          this.overlay.showOverlay(enableBackground);
        }
      }
      hideOverlay() {
        this.root.removeChildAt(1);
      }
      get frontScene() {
        const screen = this.screensMap[this._currentScreenId];
        return screen == null ? null : screen[screen.length - 1];
      }
      get currentScreenId() {
        return this._currentScreenId;
      }
      validateCtorInput(root) {
        if (root.getChildAt(0) != null || root.getChildAt(1) != null) {
          throw new Error("Root container has to be empty");
        }
      }
      dispose() {
        this.root = null;
        this.overlay = null;
        this.genericError = null;
        this.screensMap = null;
        this.scenesContainer = null;
      }
    }

    class RootComponentFactory {
      createScreenParams(canvasWidth, canvasHeight) {
        return new ScreenParams(canvasWidth, canvasHeight);
      }
      createRenderer(canvas, scale) {
        return new NativeRenderer(canvas, scale);
      }
      createEventsProxy(canvas, eventTarget, screenParams) {
        return new EventProxy(canvas, eventTarget, screenParams);
      }
      createScreensManager(root, overlay, genericError, connectionError) {
        return new ScreenStateManager(root, overlay, genericError, connectionError);
      }
      createResourcesRepository(defaultDynamicCollectionId) {
        return new ResourceRepository(defaultDynamicCollectionId);
      }
      createImageRepository(resourcesRepo, defaultCollection) {
        return new ImageRepository(resourcesRepo, defaultCollection);
      }
      createSpritesBuilder(imagesRepo) {
        return new SpriteBuilder(imagesRepo);
      }
      createLanguagesManager(defaultLanguage, resourcesRepo, imagesRepo, eventTarget) {
        return new LanguageManager(defaultLanguage, resourcesRepo, imagesRepo, eventTarget);
      }
      createScenesFactory() {
        return new SceneFactory();
      }
    }

    class NativeSettings {
      initialize() {
        window.openSMNotificationSettings = () => {
          window.cordova.plugins.settings.open("notification_id&path=com.playtika.slotomania", () => {
            nativeLogger.info("openSMNotificationSettings");
          }, () => {
            nativeLogger.error("ERROR: openSMNotificationSettings");
          });
        };
        document.addEventListener("openNativeSettings", (e) => {
          var _a;
          window.cordova.plugins.settings.open((_a = e.detail) == null ? void 0 : _a.setting, () => {
            nativeLogger.info("openNativeSettings");
          }, () => {
            nativeLogger.error("ERROR: openNativeSettings");
          });
        });
      }
    }

    class Permissions {
      static getInstance() {
        if (!Permissions._instance) {
          Permissions._instance = new Permissions();
        }
        return Permissions._instance;
      }
      initialize() {
        if (["googleplay", "pras", "amazon", "galaxy"].includes(PlatformEnv.getInstance().market)) {
          document.addEventListener("checkPermission", (e) => {
            var _a;
            try {
              const permission = (_a = e.detail) == null ? void 0 : _a.permission;
              window.cordova.plugins.permissions.checkPermission(permission, (status) => document.dispatchEvent(this.getEvent(permission, status.hasPermission, void 0)), (error) => document.dispatchEvent(this.getEvent(permission, void 0, error)));
            } catch (err) {
              nativeLogger.error("ERROR: Permissions", err);
            }
          });
        }
      }
      getEvent(permission, hasPermission, error) {
        return new CustomEvent("permissionStatus", { detail: { permission, hasPermission, error } });
      }
    }

    class SmPushNotifications {
      constructor() {
        this.appBoyInstance = window.AppboyPlugin;
      }
      initialize(notificationEnabled) {
        var _a;
        window.registerPushNotifications = function() {
          if (PlatformEnv.getInstance().platform === "ios") {
            window.AppboyPlugin.registerPushNotifications();
          } else if (PlatformEnv.getInstance().platform === "android") {
            window.AppboyPlugin.requestPostNotificationPermission();
          }
        };
        document.addEventListener("UpdPushUserInfo", (e) => {
          const ce = e;
          const detail = {};
          try {
            for (const key of ce.detail.keys()) {
              detail[key] = ce.detail.get(key);
            }
            this.setupUserData(detail);
          } catch (ex) {
            this.setupUserData(ce.detail.h);
          }
        }, false);
        nativeLogger.info("INFO: Appboy notifications enabled - " + notificationEnabled);
        if (notificationEnabled && PlatformEnv.getInstance().platform === "ios") {
          this.appBoyInstance.registerPushNotifications();
        } else if (PlatformEnv.getInstance().platform !== "ios" && PlatformEnv.getInstance().platform !== "windows") {
          (_a = this.appBoyInstance) == null ? void 0 : _a.addBroadcastListener((appboyData) => {
            nativeLogger.info("INFO: log for appboy data: ", appboyData);
            if (appboyData != null && appboyData.__silent) {
              document.dispatchEvent(new CustomEvent("notificationReceivedSilently", { detail: appboyData }));
            }
          });
        }
        window.unregisterPushNotifications = function() {
          if (PlatformEnv.getInstance().platform === "ios") {
            window.AppboyPlugin.unregisterPushNotifications();
          }
        };
      }
      setupUserData(e) {
        nativeLogger.info("INFO: setupUserData");
        this.pushUserInfo = {
          Alias: e.Alias,
          Balance: e.Balance,
          Level: e.Level,
          XP: e.Experience,
          StatusPoints: e.StatusPoints,
          SocialNetwork: e.SocialNetwork,
          SocialStatus: e.SocialStatus,
          SocialNetworkField: e.SocialNetworkField,
          UserName: e.UserName,
          Tier: e.Tier
        };
        this.setupUser();
        this.setupCustomFields();
        this.sendDataToAppboy();
      }
      setupUser() {
        try {
          if (this.pushUserInfo) {
            this.appBoyInstance.changeUser(this.pushUserInfo.Alias);
            nativeLogger.info(`INFO: Set user ${this.pushUserInfo.Alias} on Appboy`);
          }
        } catch (e) {
          nativeLogger.info("INFO: Fail to set user on Appboy", e);
        }
      }
      setupCustomFields() {
        try {
          const info = this.pushUserInfo;
          if (info) {
            for (const i in info) {
              this.appBoyInstance.setCustomUserAttribute(i, info[i]);
            }
          }
        } catch (e) {
          nativeLogger.error("ERROR: Fail to set Custom user attributes on Appboy", e);
        }
      }
      sendDataToAppboy() {
        try {
          this.appBoyInstance.requestImmediateDataFlush();
        } catch (e) {
          nativeLogger.error("ERROR: Failed to send data to Appboy", e);
        }
      }
    }
    class SmPushNotificationsStub {
      initialize() {
        nativeLogger.info("For current platform pushNotifications haven't been working");
      }
      setupUserData(_) {
      }
      setupUser() {
      }
      setupCustomFields() {
      }
      sendDataToAppboy() {
      }
    }

    class Redirect {
      static getInstance() {
        if (!Redirect._instance) {
          Redirect._instance = new Redirect();
        }
        return Redirect._instance;
      }
      initialize() {
        document.addEventListener("openRatePage", () => {
          this.redirectTo(PlatformEnv.getInstance().marketUrl);
        }, false);
        document.addEventListener("openUpdatePage", () => {
          this.redirectTo(PlatformEnv.getInstance().marketUrl);
        }, false);
      }
      redirectTo(url) {
        if (!url) {
          throw new Error("Redirect to market is not supported.");
        }
        window.open(url, "_system");
      }
    }

    function getCordovaSecureStorageInstance(store) {
      let secureStorageInstance;
      try {
        secureStorageInstance = new window.cordova.plugins.SecureStorage(() => {
          nativeLogger.info("Success init secure storage");
        }, (error) => {
          if (error.message) {
            nativeLogger.error("Error init secure storage" + error.message);
          }
        }, store != null ? store : "");
      } catch (e) {
        nativeLogger.error("Error init secure storage", e);
      }
      return secureStorageInstance;
    }

    class SecureStorage {
      constructor() {
      }
      static getInstance() {
        if (!this._instance) {
          this._instance = new SecureStorage();
        }
        return this._instance;
      }
      initialize(store) {
        this.secureStorage = getCordovaSecureStorageInstance(store);
      }
      storageKeys() {
        return Promise.resolve();
      }
      storageSet(key, value) {
        return new Promise((resolve) => {
          if (!this.secureStorage) {
            resolve();
            return;
          }
          this.secureStorage.set((k) => {
            nativeLogger.info("Success set value in secure storage" + k);
            resolve();
          }, (error) => {
            nativeLogger.error("Error set value in secure storage" + error.message);
            resolve();
          }, key, value);
        });
      }
      storageGet(key) {
        return new Promise((resolve) => {
          if (!this.secureStorage) {
            resolve(void 0);
            return;
          }
          this.secureStorage.get((value) => {
            nativeLogger.info("Success get value in secure storage " + value);
            resolve(value);
          }, (error) => {
            nativeLogger.error("Error get value in secure storage " + error);
            resolve(void 0);
          }, key);
        });
      }
      storageRemove(key) {
        return new Promise((resolve) => {
          if (!this.secureStorage) {
            resolve();
            return;
          }
          this.secureStorage.remove((k) => {
            nativeLogger.info("Success Removed value in secure storage" + k);
            resolve();
          }, (error) => {
            nativeLogger.error("Error removed value in secure storage " + error);
            resolve();
          }, key);
        });
      }
      storageClear() {
        return new Promise((resolve) => {
          if (!this.secureStorage) {
            resolve();
            return;
          }
          this.secureStorage.clear(() => {
            nativeLogger.info("Cleared");
            resolve();
          }, (error) => {
            nativeLogger.error("Error, " + error);
            resolve();
          });
        });
      }
    }

    class Settings {
      static getSettingsInstance() {
        if (!this._settingsInstance) {
          this._settingsInstance = new Settings();
        }
        return this._settingsInstance;
      }
      getBooleanItem(key) {
        const value = this.getItem(key);
        return value === "true";
      }
      removeItem(key) {
        window.localStorage.removeItem(key);
      }
      getItem(key) {
        return window.localStorage.getItem(key);
      }
      setItem(key, value) {
        window.localStorage.setItem(key, String(value));
      }
      setItemInArray(key, value) {
        const item = window.localStorage.getItem(key);
        if (item && !isNil(item)) {
          const tmpArray = JSON.parse(item);
          tmpArray.push(value);
          window.localStorage.setItem(key, JSON.stringify(tmpArray));
        } else {
          window.localStorage.setItem(key, JSON.stringify(value));
        }
      }
      isEmpty(key) {
        const value = this.getItem(key);
        return isNil(value);
      }
      clear() {
        window.localStorage.clear();
      }
    }

    var __async$6 = (__this, __arguments, generator) => {
      return new Promise((resolve, reject) => {
        var fulfilled = (value) => {
          try {
            step(generator.next(value));
          } catch (e) {
            reject(e);
          }
        };
        var rejected = (value) => {
          try {
            step(generator.throw(value));
          } catch (e) {
            reject(e);
          }
        };
        var step = (x) => x.done ? resolve(x.value) : Promise.resolve(x.value).then(fulfilled, rejected);
        step((generator = generator.apply(__this, __arguments)).next());
      });
    };
    const firstNameKeyChainKey = "AppleIdUserFirstNameKey";
    const lastNameKeyChainKey = "AppleIdUserLastNameKey";
    const emailKeyChainKey = "AppleIdUserEmailKey";
    const userIdentifierKeyChainKey = "AppleIdUserIdentifierKey";
    const identityTokenKeyChainKey = "AppleIdUserIdentityTokenKey";
    const authCodeKeyChainKey = "AppleIdUserAuthCodeKey";
    class SignInWithApple {
      constructor() {
        this.useAuthcode = false;
      }
      static getInstance() {
        if (!this._instance) {
          this._instance = new SignInWithApple();
        }
        return this._instance;
      }
      initialize(deviceInfo, secureStorageInstance, useAuthcode, percent) {
        if (isNewerVersion("12.99.0", deviceInfo.device_info.version)) {
          this.useAuthcode = useAuthcode && isEnabledByPercentage(~~percent);
          this.signInWithAppleInstance = getSigninWithApple();
          this.secureStorage = secureStorageInstance;
          window.app_vars.apple_sign_in_available = true;
          window.app_vars.apple_sign_in_use_authcode = this.useAuthcode;
          document.dispatchEvent(new CustomEvent("showAppleSignInButton"));
        } else {
          nativeLogger.warn("Apple Sign In is not available on this OS version => ", deviceInfo.device_info.version);
        }
      }
      validCredentials() {
        if (this.signInWithAppleInstance) {
          return this.executeValidCredentials();
        }
        return Promise.resolve();
      }
      login(fromLoginScreen) {
        if (this.signInWithAppleInstance) {
          return this.executeSignInWithApple(fromLoginScreen);
        }
        return Promise.resolve();
      }
      executeSignInWithApple(fromLoginScreen) {
        return new Promise((resolve, reject) => {
          this.signInWithAppleInstance.auth({ scopes: "fullName, email" }, (succ) => {
            this.handleSingInWithAppleSuccess(succ, fromLoginScreen).then(() => {
              resolve(succ);
            });
          }, (err) => {
            this.handleSignInWithAppleError(err.description ? err.description : err, fromLoginScreen);
            reject(err);
          });
        });
      }
      executeValidCredentials() {
        return __async$6(this, null, function* () {
          const userId = yield this.secureStorage.storageGet(userIdentifierKeyChainKey);
          if (userId) {
            yield this.signInWithAppleInstance.validCredential({ userID: userId }, () => {
              this.handleValidCredentialsAppleSuccess();
            }, (err) => {
              const revokedErrorCode = -4;
              if (err.code == revokedErrorCode) {
                this.dispatchRequestLogout();
                return;
              }
              this.executeSignInWithApple(true);
            });
          } else {
            this.handleSignInWithAppleError("Failed to validate user", true);
          }
        });
      }
      handleSignInWithAppleError(err, fromLoginScreen) {
        window.setLoginType(LOGIN_TYPES.NOT_CHOSEN);
        if (!err.includes("1001")) {
          this.showErrorDialog();
        } else {
          if (fromLoginScreen) {
            document.location.reload();
          }
        }
      }
      showErrorDialog() {
        usePreloader((preloader) => {
          preloader.showLoginError();
        });
      }
      handleValidCredentialsAppleSuccess() {
        return this.finishLogin(true);
      }
      handleSingInWithAppleSuccess(succ, fromLoginScreen) {
        return __async$6(this, null, function* () {
          yield this.checkAndClearCredentials(succ.userIdentifier);
          if (succ.email) {
            yield this.secureStorage.storageRemove(emailKeyChainKey);
            yield this.secureStorage.storageSet(emailKeyChainKey, succ.email);
          }
          if (succ.userIdentifier) {
            yield this.secureStorage.storageRemove(userIdentifierKeyChainKey);
            yield this.secureStorage.storageSet(userIdentifierKeyChainKey, succ.userIdentifier);
          }
          if (succ.identityToken) {
            yield this.secureStorage.storageRemove(identityTokenKeyChainKey);
            yield this.secureStorage.storageSet(identityTokenKeyChainKey, succ.identityToken);
          }
          if (succ.authCode) {
            yield this.secureStorage.storageRemove(authCodeKeyChainKey);
            yield this.secureStorage.storageSet(authCodeKeyChainKey, succ.authCode);
          }
          if (succ.givenName) {
            yield this.secureStorage.storageRemove(firstNameKeyChainKey);
            yield this.secureStorage.storageSet(firstNameKeyChainKey, succ.givenName);
          }
          if (succ.familyName) {
            yield this.secureStorage.storageRemove(lastNameKeyChainKey);
            yield this.secureStorage.storageSet(lastNameKeyChainKey, succ.familyName);
          }
          yield this.finishLogin(fromLoginScreen);
        });
      }
      checkAndClearCredentials(userId) {
        return __async$6(this, null, function* () {
          const userIdFromKeychain = yield this.secureStorage.storageGet(userIdentifierKeyChainKey);
          if (userIdFromKeychain && userIdFromKeychain !== userId) {
            yield this.clearCredentials();
          }
        });
      }
      clearCredentials() {
        return __async$6(this, null, function* () {
          yield this.secureStorage.storageRemove(userIdentifierKeyChainKey);
          yield this.secureStorage.storageRemove(emailKeyChainKey);
          yield this.secureStorage.storageRemove(firstNameKeyChainKey);
          yield this.secureStorage.storageRemove(lastNameKeyChainKey);
          yield this.secureStorage.storageRemove(identityTokenKeyChainKey);
          yield this.secureStorage.storageRemove(authCodeKeyChainKey);
        });
      }
      finishLogin(fromLoginScreen) {
        return __async$6(this, null, function* () {
          nativeLogger.info("Login::Apple");
          window.app_vars.user_sn_id = yield this.secureStorage.storageGet(userIdentifierKeyChainKey);
          window.app_vars.user_email = yield this.secureStorage.storageGet(emailKeyChainKey);
          window.app_vars.social_first_name = yield this.secureStorage.storageGet(firstNameKeyChainKey);
          window.app_vars.social_last_name = yield this.secureStorage.storageGet(lastNameKeyChainKey);
          window.app_vars.identity_token = yield this.secureStorage.storageGet(identityTokenKeyChainKey);
          window.app_vars.auth_code = yield this.secureStorage.storageGet(authCodeKeyChainKey);
          window.setLoginType(LOGIN_TYPES.APPLE_SIGN_IN);
          if (fromLoginScreen) {
            this.signInWithAppleInstance.setRevokedCb(this.dispatchRequestLogout);
            window.startApp();
          } else {
            document.location.reload();
          }
        });
      }
      dispatchRequestLogout() {
        document.dispatchEvent(new CustomEvent("requestLogout"));
      }
    }

    class Resolution {
      static get KNOWN() {
        return knownResolutions;
      }
      constructor(width, height) {
        this.width = width;
        this.height = height;
      }
      getHeight() {
        return this.height;
      }
      getWidth() {
        return this.width;
      }
      equalsTo(other) {
        return other != null && other.width === this.width && other.height === this.height;
      }
      toString() {
        return `${this.width}x${this.height}`;
      }
      toDirname() {
        return `${this.height}W`;
      }
      static parse(height) {
        return this.KNOWN.find((r) => r.height === height);
      }
    }
    const knownResolutions = [new Resolution(854, 480), new Resolution(1136, 640), new Resolution(1280, 720)];

    var __async$5 = (__this, __arguments, generator) => {
      return new Promise((resolve, reject) => {
        var fulfilled = (value) => {
          try {
            step(generator.next(value));
          } catch (e) {
            reject(e);
          }
        };
        var rejected = (value) => {
          try {
            step(generator.throw(value));
          } catch (e) {
            reject(e);
          }
        };
        var step = (x) => x.done ? resolve(x.value) : Promise.resolve(x.value).then(fulfilled, rejected);
        step((generator = generator.apply(__this, __arguments)).next());
      });
    };
    const MAP_FILENAME = "tiny.assets.json";
    const embeddedAssets = {};
    const TEX_SOURCE_TAG = "EMBEDDED ASSETS [PVR/ASTC source]";
    function logTextureSource(message) {
      nativeLogger.debug(`${TEX_SOURCE_TAG} ${message}`);
    }
    function normalizeIosNativeFilesystemPath(path) {
      let result = path.trim().replace(/\/+$/, "");
      if (result.startsWith("file://")) {
        try {
          result = decodeURIComponent(new URL(result).pathname);
        } catch (e) {
          result = result.replace(/^file:\/\/?/i, "");
          if (!result.startsWith("/")) {
            result = `/${result}`;
          }
        }
      }
      if (!result.startsWith("/") && /^(private\/|var\/|Users\/)/i.test(result)) {
        result = `/${result}`;
      }
      result = result.replace(/^\/+/, "/");
      return result;
    }
    function getIosApplicationSupportBase() {
      if (PlatformEnv.getInstance().platform !== "ios") {
        return null;
      }
      try {
        const p = window.__native.getAppDataPath();
        if (typeof p !== "string" || p.length === 0) {
          return null;
        }
        return normalizeIosNativeFilesystemPath(p);
      } catch (e) {
        nativeLogger.warn(`WARN: EMBEDDED ASSETS: getAppDataPath() failed: ${e}`);
        return null;
      }
    }
    function rewriteIosEmbeddedAssetPath(path) {
      if (PlatformEnv.getInstance().platform !== "ios" || typeof path !== "string" || path.length === 0) {
        return path;
      }
      const base = getIosApplicationSupportBase();
      if (!base) {
        return path;
      }
      const absPublicAssetsRoot = `${base}/public/assets/`;
      let p = path.replace(/\\/g, "/");
      const original = p;
      if (p.startsWith("public/assets/")) {
        p = absPublicAssetsRoot + p.slice("public/assets/".length);
        logTextureSource(`iOS rewrite public/assets \u2192 Application Support: ${original} \u2192 ${p}`);
        return p;
      }
      const inBundle = ".app/public/assets/";
      const bundleIdx = p.indexOf(inBundle);
      if (bundleIdx !== -1) {
        p = absPublicAssetsRoot + p.slice(bundleIdx + inBundle.length);
        logTextureSource(`iOS rewrite .app bundle \u2192 Application Support: ${original} \u2192 ${p}`);
        return p;
      }
      const marker = "/public/assets/";
      const idx = p.indexOf(marker);
      if (idx !== -1 && p.includes(".app")) {
        p = absPublicAssetsRoot + p.slice(idx + marker.length);
        logTextureSource(`iOS rewrite .app/public/assets \u2192 Application Support: ${original} \u2192 ${p}`);
        return p;
      }
      return p;
    }
    function getPathRoot() {
      if (PlatformEnv.getInstance().platform === "windows") {
        return ``;
      }
      if (PlatformEnv.getInstance().platform === "ios") {
        const base = getIosApplicationSupportBase();
        if (base) {
          return `${base}/public/`;
        }
        nativeLogger.warn("WARN: EMBEDDED ASSETS: __native.getAppDataPath() missing; using relative public/ \u2014 ensure openResource maps public/assets to Application Support.");
        return `public/`;
      }
      return `public/`;
    }
    function buildRoot(map) {
      const root = {};
      for (const type of Object.keys(map)) {
        for (const obj of map[type]) {
          root[obj.id] = { versions: [obj.version], language: "en", type };
          Object.keys(obj).forEach((key) => {
            if (key.endsWith("-version")) {
              root[obj.id].versions.push(obj[key]);
            }
          });
        }
      }
      return root;
    }
    function readVersioningFileCommon(res) {
      const root = getPathRoot();
      let filePath = root + `assets/${res.toDirname()}/${MAP_FILENAME}`;
      filePath = rewriteIosEmbeddedAssetPath(filePath);
      nativeLogger.info("INFO: EMBEDDED ASSETS: opening versioning file " + filePath);
      const text = window.__native.openResource(filePath, 4);
      if (!text) {
        nativeLogger.warn("WARN: EMBEDDED ASSETS: versioning file wasn't resolved.");
        return;
      }
      try {
        const map = JSON.parse(text);
        const built = buildRoot(map);
        embeddedAssets[res.toString()] = built;
        nativeLogger.info("INFO: EMBEDDED ASSETS: versioning file processed successfully.");
      } catch (err) {
        nativeLogger.warn(`WARN: EMBEDDED ASSETS: versioning file at ${filePath} could not be parsed; falling back to remote assets. Error: ${err}`);
      }
    }
    function readVersioningFileWindows(res) {
      return new Promise((resolve) => {
        const filePath = `assets/${res.toDirname()}/${MAP_FILENAME}`;
        const request = new XMLHttpRequest();
        request.responseType = "text";
        request.open("GET", filePath);
        request.send();
        request.onload = function() {
          try {
            const map = JSON.parse(request.response);
            const root = buildRoot(map);
            embeddedAssets[res.toString()] = root;
            nativeLogger.info("INFO: EMBEDDED ASSETS: versioning file processed successfully.");
            resolve();
          } catch (err) {
            resolve();
          }
        };
        request.onerror = function(err) {
          nativeLogger.error("ERROR: EMBEDDED ASSETS: failed to create a file object.", err);
          resolve();
        };
      });
    }
    function initializeWindows() {
      return __async$5(this, null, function* () {
        try {
          nativeLogger.info("INFO: EMBEDDED ASSETS: loading assets versioning files.");
          const promises = Resolution.KNOWN.map((res) => readVersioningFileWindows(res));
          yield Promise.all(promises);
        } catch (err) {
          nativeLogger.error(`ERROR: ${err}`);
          throw err;
        }
        updateAppVarsByResolverAndResolutions();
      });
    }
    function initializeCommon() {
      nativeLogger.info("INFO: EMBEDDED ASSETS: loading assets versioning files.");
      for (const res of Resolution.KNOWN) {
        readVersioningFileCommon(res);
      }
      updateAppVarsByResolverAndResolutions();
    }
    function updateAppVarsByResolverAndResolutions() {
      getAppVars().assetsPathResolver = resolveAsset;
      getAppVars().embeddedResolutions = Object.keys(embeddedAssets).map((res) => Number.parseInt(res.split("x")[1]));
    }
    function resolveAsset(id, version, language) {
      const currentRes = Resolution.parse(getAppVars().haxe_assets_group);
      if (!currentRes) {
        logTextureSource(`no current resolution (haxe_assets_group) \u2192 compressed textures use remote/internet URL, id=${id || "localization"} v=${version} lang=${language}`);
        return null;
      }
      const assetsPerResolution = embeddedAssets[currentRes.toString()];
      if (!assetsPerResolution) {
        logTextureSource(`no embedded map for ${currentRes} \u2192 .astc/.pvr for id=${id || "localization"} v=${version} lang=${language} load from remote/internet`);
        return null;
      }
      const configId = id === "" ? "localization" : id;
      const asset = assetsPerResolution[configId];
      if (!asset || !asset.versions.includes(version) || asset.language !== language) {
        const reason = !asset ? "id not in tiny.assets.json" : !asset.versions.includes(version) ? `version mismatch (embedded: ${asset.versions.join(",")})` : `language mismatch (embedded: ${asset.language})`;
        logTextureSource(`${reason} \u2192 id=${configId} v=${version} lang=${language} not embedded; .astc/.pvr from remote/internet`);
        return null;
      }
      const root = getPathRoot();
      let path = root + `assets/${currentRes.toDirname()}/${asset.type}`;
      if (id !== "") {
        path += "/" + id;
      }
      path += `/${version}/${asset.language}`;
      path = rewriteIosEmbeddedAssetPath(path);
      return path;
    }
    function initialize() {
      return __async$5(this, null, function* () {
        try {
          if (PlatformEnv.getInstance().platform === "windows") {
            return yield initializeWindows();
          } else {
            return initializeCommon();
          }
        } catch (e) {
          nativeLogger.warn(`WARN: EMBEDDED ASSETS: initialize() failed; falling back to remote assets. Error: ${e}`);
          updateAppVarsByResolverAndResolutions();
        }
      });
    }

    var __async$4 = (__this, __arguments, generator) => {
      return new Promise((resolve, reject) => {
        var fulfilled = (value) => {
          try {
            step(generator.next(value));
          } catch (e) {
            reject(e);
          }
        };
        var rejected = (value) => {
          try {
            step(generator.throw(value));
          } catch (e) {
            reject(e);
          }
        };
        var step = (x) => x.done ? resolve(x.value) : Promise.resolve(x.value).then(fulfilled, rejected);
        step((generator = generator.apply(__this, __arguments)).next());
      });
    };
    class TextCommunicator {
      sendSms(text) {
        const option = "?";
        window.open(`sms:${option}body=${encodeURIComponent(text)}`);
      }
      initialize() {
        return __async$4(this, null, function* () {
        });
      }
      sendEmail(title, body) {
        window.open(`mailto:?subject=${encodeURIComponent(title)}&body=${encodeURIComponent(body)}`);
      }
      sendWhatsApp(text) {
        window.open(`whatsapp://send?text=${encodeURIComponent(text)}`);
      }
      canSendSms() {
        return true;
      }
      canSendEmail() {
        return true;
      }
      canSendWhatsApp() {
        return PlatformEnv.getInstance().market !== "galaxy";
      }
      isWhatsAppSupported() {
        return true;
      }
    }
    class TextCommunicatorWindows {
      constructor() {
        this.canSendSmsField = false;
        this.canSendEmailField = false;
        this.canSendWhatsAppField = false;
        this.isWhatsAppSupportedField = false;
        this.windowsTextCommunicatorInstance = window.windowsTextCommunicatorPlugin;
      }
      initialize() {
        return __async$4(this, null, function* () {
          this.canSendSmsField = yield this.windowsTextCommunicatorInstance.canSendSms();
          this.canSendEmailField = yield this.windowsTextCommunicatorInstance.canSendEmail();
          this.canSendWhatsAppField = yield this.windowsTextCommunicatorInstance.canSendWhatsApp();
          this.isWhatsAppSupportedField = yield this.windowsTextCommunicatorInstance.isWhatsAppSupported();
        });
      }
      canSendSms() {
        return this.canSendSmsField;
      }
      canSendEmail() {
        return this.canSendEmailField;
      }
      canSendWhatsApp() {
        return this.canSendWhatsAppField;
      }
      isWhatsAppSupported() {
        return this.isWhatsAppSupportedField;
      }
      sendSms(text) {
        this.windowsTextCommunicatorInstance.sendSms(text);
      }
      sendEmail(title, body) {
        this.windowsTextCommunicatorInstance.sendEmail(title, body);
      }
      sendWhatsApp(text) {
        this.windowsTextCommunicatorInstance.sendWhatsApp(text);
      }
    }

    var __async$3 = (__this, __arguments, generator) => {
      return new Promise((resolve, reject) => {
        var fulfilled = (value) => {
          try {
            step(generator.next(value));
          } catch (e) {
            reject(e);
          }
        };
        var rejected = (value) => {
          try {
            step(generator.throw(value));
          } catch (e) {
            reject(e);
          }
        };
        var step = (x) => x.done ? resolve(x.value) : Promise.resolve(x.value).then(fulfilled, rejected);
        step((generator = generator.apply(__this, __arguments)).next());
      });
    };
    const LOCAL_STORAGE_USER_SELECTED_LANGUAGE = "userSelectedLanguage";
    const LOCAL_STORAGE_LANGUAGE_RANDOM_ROLL = "languageRandomRoll";
    const LOCAL_STORAGE_FORCED_RANDOM_ROLL = "forcedRandomRoll";
    const CONFIG_PATH = "vs_fb_en_haxe/config/" + PlatformEnv.getInstance().languagesConfig;
    const INTERNAL_OPENING_ARG = "internalLanguages";
    const INTERNAL_OPENING_ARG_CLEAN = "internalLanguagesClean";
    class UserLanguage {
      constructor(jsonLoader) {
        this.jsonLoader = jsonLoader;
        this.clientVersion = null;
        this.market = null;
        this.deviceLanguage = null;
      }
      initialize(clientVersion, market) {
        return __async$3(this, null, function* () {
          this.clientVersion = clientVersion;
          this.market = market == null ? void 0 : market.toLowerCase();
          getAppVars().languageForced = false;
          getAppVars().buildLanguage = DEFAULT_LANGUAGE;
          document.addEventListener("deeplinksUpdate", (data) => this.setInternalListFlags(data));
          try {
            this.deviceLanguage = yield this.getDeviceLanguage();
            this.deviceLanguage = this.deviceLanguage.slice(0, 2).toLowerCase();
            nativeLogger.info("INFO: Languages initialization. Client version: " + clientVersion + ". Device language: " + this.deviceLanguage + ". Platform: " + market);
            const config = yield this.getLanguagesConfig();
            this.defineLanguage(config);
          } catch (e) {
            nativeLogger.error("ERROR: Language detecting flow failed! Fallback to English. Exception: " + e);
            getAppVars().language = DEFAULT_LANGUAGE;
          }
        });
      }
      getDeviceLanguage() {
        return new Promise((resolve) => {
          if (PlatformEnv.getInstance().platform === "windows") {
            resolve(DEFAULT_LANGUAGE);
          }
          try {
            global.navigator.globalization.getPreferredLanguage((language) => {
              resolve(language.value);
            }, () => {
              nativeLogger.error(`ERROR: Failed to receive device language. Assigned "${DEFAULT_LANGUAGE}" as default.`);
              resolve(DEFAULT_LANGUAGE);
            });
          } catch (e) {
            const er = e;
            nativeLogger.error(`ERROR: Failed to receive device language. Assigned "${DEFAULT_LANGUAGE}" as default. ${er.stack}`);
            resolve(DEFAULT_LANGUAGE);
          }
        });
      }
      setCurrentLanguage(langIso) {
        getAppVars().language = langIso;
        this.setProfileLanguage(langIso);
      }
      getLanguagesConfig() {
        return __async$3(this, null, function* () {
          const cache = PlatformEnv.getInstance().release ? "" : `?cache=${getNoCacheId$1()}`;
          const languageConfigUrl = this.getDomain() + CONFIG_PATH + cache;
          nativeLogger.info("INFO: Languages config url: " + languageConfigUrl);
          const response = yield this.jsonLoader.loadAsync(languageConfigUrl);
          nativeLogger.info("INFO: Load languages response: \n" + JSON.stringify(response));
          return JSON.parse(response);
        });
      }
      defineLanguage(languagesConfig) {
        const app_vars2 = getAppVars();
        const preferredLanguages = this.getPreferredLanguages(this.deviceLanguage);
        app_vars2.preferredLanguages = preferredLanguages;
        const profileLanguage = this.getProfileLanguage();
        nativeLogger.info("INFO: Profile language: " + profileLanguage);
        const supportedLanguages = this.getSupportedLanguages(this.clientVersion, languagesConfig, preferredLanguages);
        const supportedLanguagesIso = this.getSupportedLanguagesIso(supportedLanguages);
        nativeLogger.info("INFO: Supported languages: " + JSON.stringify(supportedLanguagesIso));
        app_vars2.language = this.getCurrentLanguage(supportedLanguages, preferredLanguages, profileLanguage);
        app_vars2.supportedLanguages = supportedLanguages;
        app_vars2.supportedLanguagesIso = supportedLanguagesIso;
        analyticsProxy.trackSelectedLanguage(profileLanguage, supportedLanguagesIso, app_vars2.preferredLanguages, app_vars2.language, app_vars2.languageForced);
        nativeLogger.info("INFO: CurrentLanguage is set to " + app_vars2.language + ". Is language forced: " + app_vars2.languageForced);
      }
      getCurrentLanguage(supportedLanguages, preferredLanguages, profileLanguage) {
        let selectedForcedLanguage = DEFAULT_LANGUAGE;
        if (supportedLanguages.length === 0) {
          nativeLogger.error("ERROR: No supported languages for user, fallback to EN");
        } else {
          if (profileLanguage && this.isLanguageSupported(profileLanguage, supportedLanguages)) {
            selectedForcedLanguage = profileLanguage;
          } else {
            const selectedLanguage = this.getSelectedInSupported(preferredLanguages, supportedLanguages);
            if (selectedLanguage != null) {
              const selectedLanguageIsoCode = selectedLanguage.isoCode.toLowerCase();
              nativeLogger.info("INFO: Selected language is " + selectedLanguageIsoCode);
              if (selectedLanguageIsoCode !== DEFAULT_LANGUAGE) {
                selectedForcedLanguage = this.shouldLanguageBeForced(selectedLanguage) ? selectedLanguageIsoCode : DEFAULT_LANGUAGE;
                if (selectedForcedLanguage !== DEFAULT_LANGUAGE) {
                  this.setProfileLanguage(selectedForcedLanguage);
                  getAppVars().languageForced = true;
                }
              }
            }
          }
        }
        return selectedForcedLanguage;
      }
      getApplicationLanguage() {
        return app_vars.language;
      }
      getPreferredLanguages(deviceLanguage) {
        const preferred = deviceLanguage || DEFAULT_LANGUAGE;
        return [preferred];
      }
      setProfileLanguage(lang) {
        nativeLogger.info("INFO: Saving profile language as " + lang);
        localStorage.setItem(LOCAL_STORAGE_USER_SELECTED_LANGUAGE, lang);
      }
      getProfileLanguage() {
        return localStorage.getItem(LOCAL_STORAGE_USER_SELECTED_LANGUAGE);
      }
      isLanguageSupported(language, supportedLanguages) {
        if (language != null) {
          for (const supportedLanguage of supportedLanguages) {
            if (this.areLanguageCodesEqual(supportedLanguage.isoCode, language)) {
              return true;
            }
          }
        }
        nativeLogger.warn("WARN: Language ' " + language + "' is not supported!");
        return false;
      }
      getSelectedInSupported(preferredLanguages, supportedLanguages) {
        const preferredLanguagesExt = this.getPreferredExtendedLanguage(preferredLanguages);
        return this.getPreferredSupportedLanguage(preferredLanguagesExt, supportedLanguages);
      }
      getPreferredExtendedLanguage(preferredLanguages) {
        const languagesMap = { ja: "jp" };
        const result = [];
        for (const currentExtendedLang in languagesMap) {
          for (let i = 0; i < preferredLanguages.length; i++) {
            const currentPreferredLang = preferredLanguages[i];
            result.push(currentPreferredLang);
            if (currentExtendedLang.toUpperCase() === currentPreferredLang.toUpperCase() || currentExtendedLang.toUpperCase() === currentPreferredLang.slice(0, 2).toUpperCase()) {
              result.push(languagesMap[currentExtendedLang]);
            }
          }
        }
        return result;
      }
      getPreferredSupportedLanguage(preferredLanguages, supportedLanguages) {
        const matched = [];
        for (let i = 0; i < preferredLanguages.length; i++) {
          const preferredLanguage = preferredLanguages[i];
          for (const supportedLanguage of supportedLanguages) {
            if (this.areLanguageCodesEqual(supportedLanguage.isoCode, preferredLanguage)) {
              matched.push(supportedLanguage);
            }
          }
        }
        return matched.length > 0 && matched[0] ? matched[0] : null;
      }
      getSupportedLanguagesIso(languages) {
        if (languages == null) {
          return [];
        }
        return languages.map((lang) => lang.isoCode);
      }
      getSupportedLanguages(clientVersion, languagesConfig, preferredLanguages) {
        nativeLogger.info("INFO: Config: " + JSON.stringify(languagesConfig));
        const allClientsLanguages = this.getAvailableLanguages(languagesConfig);
        let availableLanguages = this.getFilteredByMarketLanguages(allClientsLanguages, this.market);
        availableLanguages = this.getFilteredByPreferredLanguages(availableLanguages, preferredLanguages);
        availableLanguages = this.getFilteredByVersionLanguages(availableLanguages, clientVersion);
        this.setPercentagesForUser(availableLanguages, this.isNewUser());
        availableLanguages = this.getFilteredByPercentageLanguages(availableLanguages, this.getRandomRoll(LOCAL_STORAGE_LANGUAGE_RANDOM_ROLL));
        nativeLogger.info("INFO: Filtered languages: " + JSON.stringify(availableLanguages));
        return availableLanguages;
      }
      getAvailableLanguages(languagesConfig) {
        const availableLanguages = [];
        for (const lang of languagesConfig.languages) {
          availableLanguages.push(lang);
        }
        return availableLanguages;
      }
      getFilteredByMarketLanguages(availableLanguages, marketName) {
        const supportedLanguages = [];
        for (const language of availableLanguages) {
          for (const params of language.platformParams) {
            if (params.clientTypeGroup.toLowerCase() === marketName) {
              supportedLanguages.push({
                isoCode: language.isoCode,
                name: language.name,
                platformParams: params
              });
            }
          }
        }
        return supportedLanguages;
      }
      getFilteredByPreferredLanguages(availableLanguages, preferredLanguages) {
        const filtered = [];
        for (const language of availableLanguages) {
          if (language.platformParams.availableOnlyIfPreferred) {
            if (preferredLanguages.some((l) => this.areLanguageCodesEqual(l, language.isoCode))) {
              filtered.push(language);
            }
          } else {
            filtered.push(language);
          }
        }
        return filtered;
      }
      areLanguageCodesEqual(code1, code2) {
        return code1.slice(0, 2).toLowerCase() === code2.slice(0, 2).toLowerCase();
      }
      getFilteredByVersionLanguages(availableLanguages, clientVersion) {
        const supportedLanguages = [];
        for (const language of availableLanguages) {
          if (compareVersions(clientVersion, language.platformParams.availableFromVersion) > -1) {
            supportedLanguages.push(language);
          }
        }
        return supportedLanguages;
      }
      setPercentagesForUser(availableLanguages, isNewUser) {
        nativeLogger.info("INFO: Is new user: " + isNewUser);
        for (const lang of availableLanguages) {
          lang.platformParams.percentage = isNewUser ? lang.platformParams.percentageOpenedNewUser : lang.platformParams.percentageOpenedOldUser;
          lang.platformParams.percentageForced = isNewUser ? lang.platformParams.percentageForcedNewUser : lang.platformParams.percentageForcedOldUser;
        }
      }
      getFilteredByPercentageLanguages(availableLanguages, userPercentage) {
        if (this.isUserInInternalList()) {
          nativeLogger.warn("WARN: User is in internal list. Filtering by percentages won't be applied!");
          return availableLanguages;
        }
        nativeLogger.info("INFO: User percentages is " + userPercentage + ". Languages opened by this value and more will be available for user");
        const supportedLanguages = [];
        for (const lang of availableLanguages) {
          if (userPercentage <= lang.platformParams.percentage) {
            supportedLanguages.push(lang);
          }
        }
        return supportedLanguages;
      }
      getRandomRoll(key) {
        let randomRollString = localStorage.getItem(key);
        if (randomRollString == null) {
          nativeLogger.info("INFO: New RandomRoll");
          randomRollString = this.getRandomInt(1, 100).toString();
          localStorage.setItem(key, randomRollString);
        }
        const randomRollInt = Number.parseInt(randomRollString);
        nativeLogger.info("INFO: RandomRoll for '" + key + "': " + randomRollInt);
        return randomRollInt;
      }
      getRandomInt(min, max) {
        return Math.max(min, Math.floor(Math.random() * max));
      }
      isUserInInternalList() {
        return localStorage.getItem(INTERNAL_OPENING_ARG) === "true";
      }
      setInternalListFlags(eventData) {
        if (eventData == null || eventData.detail == null) {
          return;
        }
        const deeplink = eventData.detail;
        nativeLogger.info("INFO: Deeplink data: " + deeplink);
        const internalFlag = deeplink.includes(INTERNAL_OPENING_ARG);
        if (internalFlag) {
          nativeLogger.info("INFO: Save flag " + INTERNAL_OPENING_ARG);
          localStorage.setItem(INTERNAL_OPENING_ARG, "true");
        }
        const internalCleanFlag = deeplink.includes(INTERNAL_OPENING_ARG_CLEAN);
        if (internalCleanFlag) {
          nativeLogger.info("INFO: Save flag " + INTERNAL_OPENING_ARG_CLEAN);
          localStorage.setItem(INTERNAL_OPENING_ARG, "false");
        }
      }
      shouldLanguageBeForced(selectedLanguage) {
        const forcedRoll = this.getRandomRoll(LOCAL_STORAGE_FORCED_RANDOM_ROLL);
        return forcedRoll <= selectedLanguage.platformParams.percentageForced;
      }
      getDomain() {
        return localStorage.getItem("stage");
      }
      isNewUser() {
        return !localStorage.getItem(LOCAL_STORAGE_LANGUAGE_RANDOM_ROLL);
      }
    }

    var __async$2 = (__this, __arguments, generator) => {
      return new Promise((resolve, reject) => {
        var fulfilled = (value) => {
          try {
            step(generator.next(value));
          } catch (e) {
            reject(e);
          }
        };
        var rejected = (value) => {
          try {
            step(generator.throw(value));
          } catch (e) {
            reject(e);
          }
        };
        var step = (x) => x.done ? resolve(x.value) : Promise.resolve(x.value).then(fulfilled, rejected);
        step((generator = generator.apply(__this, __arguments)).next());
      });
    };
    class WinPreloader {
      constructor() {
        this.isFullscreen = false;
        this.angleInDegrees = 0;
        this.isCycling = true;
        this.isResizeSupported = true;
        this.screenFile = "assets/screen.jpg";
        this.circleFile = "assets/cycle.png";
        this.handleEvent();
        window.app_vars.application_start_timestamp = new Date().getTime();
        window.isWeb = ["localhost", PlatformEnv.getInstance().linkProd].includes(document.domain);
      }
      removeLoginPanelAndAddCanvas() {
        return __async$2(this, null, function* () {
          const view = this.createCanvas("gameview");
          view.addEventListener("toggleFullScreen", () => {
            if (this.isFullscreen) {
              window.exitFullScreen();
              view.onFullScreenChanged(false);
              this.isFullscreen = false;
            } else {
              window.enterFullScreen();
              view.onFullScreenChanged(true);
              this.isFullscreen = true;
            }
          });
          this.handleFullScreen(view);
          if (this.isResizeSupported) {
            window.addEventListener("resize", () => {
              this.handleFullScreen(view);
              view.dispatchEvent(new CustomEvent("resize"));
            });
          }
          yield this.drawBackground();
          this.removeSettings();
          yield this.drawCircle();
        });
      }
      removeSettings() {
        const element = document.getElementById("main_con");
        if (element && element.parentNode)
          element.parentNode.removeChild(element);
      }
      createBackgroundCanvas() {
        const canvas = this.createCanvas("backgrounCanvas");
        if (PlatformEnv.getInstance().platform === "ios") {
          canvas.width = window.screen.availWidth;
          canvas.height = window.screen.availHeight;
        } else {
          canvas.width = window.innerWidth;
          canvas.height = window.innerHeight;
        }
        canvas.style.position = "absolute";
        canvas.style.top = "0px";
        canvas.style.left = "0px";
        return canvas;
      }
      createCircleCanvas() {
        const canvas = this.createCanvas("circleCanvas");
        canvas.width = 100;
        canvas.height = 100;
        canvas.style.position = "absolute";
        canvas.style.margin = "auto";
        canvas.style.paddingLeft = "calc(env(safe-area-inset-right) * 2)";
        canvas.style.top = "0px";
        canvas.style.right = "0px";
        canvas.style.bottom = "0px";
        canvas.style.left = "0px";
        canvas.style.zIndex = "10000";
        return canvas;
      }
      createCanvas(id) {
        const canvas = document.createElement("canvas");
        canvas.id = id;
        document.body.appendChild(canvas);
        return canvas;
      }
      handleEvent() {
        document.addEventListener("baseLoadingEnd", (e) => {
          this.dispose();
          window.updateSize();
        }, false);
      }
      handleFullScreen(gameView) {
        if (this.isResizeSupported) {
          const ratio = window.devicePixelRatio;
          let width = window.innerWidth;
          let height = window.innerHeight;
          if (PlatformEnv.getInstance().platform === "ios") {
            width = window.screen.availWidth;
            height = window.screen.availHeight;
          }
          getAppVars().device_pixel_ratio = ratio;
          gameView.style.cssText = `width: ${width}px; height: ${height}px;`;
          gameView.height = height * ratio;
          gameView.width = width * ratio;
          return;
        }
        getAppVars().device_pixel_ratio = window.devicePixelRatio;
        const widthToSet = window.innerWidth * window.devicePixelRatio;
        const heightToSet = window.innerHeight * window.devicePixelRatio;
        if (window.isWeb) {
          gameView.height = window.innerHeight;
          gameView.width = window.innerWidth;
          return;
        }
        gameView.style.cssText = "width: 100%; height: 100%;";
        gameView.height = heightToSet;
        gameView.width = widthToSet;
        this.isFullscreen = false;
      }
      loadImage(src) {
        return new Promise((resolve, reject) => {
          const image = new Image();
          image.onload = () => resolve(image);
          image.onerror = (err) => reject(err);
          image.src = src;
        });
      }
      drawBackground() {
        return __async$2(this, null, function* () {
          this.backgroundCanvas = this.createBackgroundCanvas();
          const background = yield this.loadImage(this.screenFile);
          this.drawCroppedImage(this.backgroundCanvas, background);
        });
      }
      drawCircle() {
        return __async$2(this, null, function* () {
          this.circleCanvas = this.createCircleCanvas();
          const circle = yield this.loadImage(this.circleFile);
          const circleCtx = this.circleCanvas.getContext("2d");
          circleCtx == null ? void 0 : circleCtx.drawImage(circle, 0, 0, this.circleCanvas.width, this.circleCanvas.height);
          this.preloaderLoop(circle, this.circleCanvas, circleCtx);
        });
      }
      cropCentered(width, height, ratio) {
        const imgRatio = width / height;
        const result = { width, height, x: 0, y: 0 };
        if (imgRatio > ratio) {
          result.width = height * ratio;
        } else if (imgRatio < ratio) {
          result.height = width / ratio;
        } else ;
        result.x = (width - result.width) / 2;
        result.y = (height - result.height) / 2;
        return result;
      }
      drawCroppedImage(canvas, img) {
        const rect = this.cropCentered(img.naturalWidth, img.naturalHeight, canvas.width / canvas.height);
        const ctx = canvas.getContext("2d");
        ctx == null ? void 0 : ctx.drawImage(img, rect.x, rect.y, rect.width, rect.height, 0, 0, canvas.width, canvas.height);
      }
      preloaderLoop(img, canvas, context) {
        const timeValue = setInterval(() => {
          this.angleInDegrees += 5;
          if (context) {
            this.rotateCircle(this.angleInDegrees, img, canvas, context);
          }
          if (!this.isCycling) {
            clearInterval(timeValue);
          }
        }, 30);
      }
      rotateCircle(degrees, img, canvas, context) {
        context.globalCompositeOperation = "lighter";
        context.globalAlpha = 0.9;
        context.clearRect(0, 0, canvas.width, canvas.height);
        context.save();
        const w = canvas.width / 2;
        const h = canvas.height / 2;
        context.translate(w, h);
        context.rotate(degrees * Math.PI / 180);
        context.drawImage(img, -w, -w, canvas.width, canvas.height);
        context.restore();
      }
      dispose() {
        var _a, _b, _c, _d;
        this.isCycling = false;
        (_b = (_a = this.backgroundCanvas) == null ? void 0 : _a.parentNode) == null ? void 0 : _b.removeChild(this.backgroundCanvas);
        (_d = (_c = this.circleCanvas) == null ? void 0 : _c.parentNode) == null ? void 0 : _d.removeChild(this.circleCanvas);
      }
    }

    class ApplovinMAX {
      constructor() {
      }
      initialize(sdkKey, callback, adUnitIds) {
        if (this.plugin) {
          this.plugin.initialize(sdkKey, callback, adUnitIds);
        }
      }
      isInitialized() {
        if (this.plugin) {
          return this.plugin.isInitialized();
        }
        return false;
      }
      showMediationDebugger() {
        if (this.plugin) {
          this.plugin.showMediationDebugger();
        }
      }
      setCreativeDebuggerEnabled(enabled) {
        if (this.plugin) {
          this.plugin.setCreativeDebuggerEnabled(enabled);
        }
      }
      setHasUserConsent(hasUserConsent) {
        if (this.plugin) {
          this.plugin.setHasUserConsent(hasUserConsent);
        }
      }
      hasUserConsent() {
        if (this.plugin) {
          return this.plugin.hasUserConsent();
        }
        return false;
      }
      setDoNotSell(isDoNotSell) {
        if (this.plugin) {
          this.plugin.setDoNotSell(isDoNotSell);
        }
      }
      isDoNotSell() {
        if (this.plugin) {
          return this.plugin.isDoNotSell();
        }
        return false;
      }
      isTablet() {
        if (this.plugin) {
          return this.plugin.isTablet();
        }
        return false;
      }
      setUserId(userId) {
        if (this.plugin) {
          this.plugin.setUserId(userId);
        }
      }
      setMuted(muted) {
        if (this.plugin) {
          this.plugin.setMuted(muted);
        }
      }
      setVerboseLogging(verboseLoggingEnabled) {
        if (this.plugin) {
          this.plugin.setVerboseLogging(verboseLoggingEnabled);
        }
      }
      setTestDeviceAdvertisingIds(advertisingIds) {
        if (this.plugin) {
          this.plugin.setTestDeviceAdvertisingIds(advertisingIds);
        }
      }
      addSegment(key, values) {
        if (this.plugin) {
          this.plugin.addSegment(key, values);
        }
      }
      trackEvent(event, parameters = null) {
        if (this.plugin) {
          this.plugin.trackEvent(event, parameters);
        }
      }
      loadRewardedAd(adUnitId) {
        if (this.plugin) {
          this.plugin.loadRewardedAd(adUnitId);
        }
      }
      isRewardedAdReady(adUnitId) {
        if (this.plugin) {
          return this.plugin.isRewardedAdReady(adUnitId);
        }
        return false;
      }
      showRewardedAd(adUnitId, placement = null, customData = null) {
        if (this.plugin) {
          this.plugin.showRewardedAd(adUnitId, placement, customData);
        }
      }
      setRewardedAdExtraParameter(adUnitId, key, value) {
        if (this.plugin) {
          this.plugin.setRewardedAdExtraParameter(adUnitId, key, value);
        }
      }
      loadInterstitial(adUnitId) {
        if (this.plugin) {
          this.plugin.loadInterstitial(adUnitId);
        }
      }
      isInterstitialReady(adUnitId) {
        if (this.plugin) {
          return this.plugin.isInterstitialReady(adUnitId);
        }
        return false;
      }
      showInterstitial(adUnitId, placement = null, customData = null) {
        if (this.plugin) {
          this.plugin.showInterstitial(adUnitId, placement, customData);
        }
      }
      initializePlugin() {
        this.plugin = window.applovin;
      }
    }

    class Usercentrics {
      constructor() {
      }
      configure(options) {
        return new Promise((resolve, reject) => {
          if (this.plugin) {
            this.plugin.initialize(options, () => {
              resolve(true);
            }, (error) => {
              reject(error);
            });
          } else {
            resolve(false);
          }
        });
      }
      isReady() {
        return new Promise((resolve, reject) => {
          if (this.plugin) {
            return this.plugin.isReady(resolve, reject);
          }
          resolve({
            shouldCollectConsent: false
          });
        });
      }
      showFirstLayer() {
        return new Promise((resolve, reject) => {
          if (this.plugin) {
            return this.plugin.showFirstLayer(resolve, reject);
          }
          resolve({
            userInteraction: "",
            controllerId: "",
            consents: []
          });
        });
      }
      showSecondLayer() {
        return new Promise((resolve, reject) => {
          if (this.plugin) {
            return this.plugin.showSecondLayer(resolve, reject);
          }
          resolve({
            userInteraction: "",
            controllerId: "",
            consents: []
          });
        });
      }
      getConsents() {
        return new Promise((resolve, reject) => {
          if (this.plugin) {
            return this.plugin.getConsents(resolve, reject);
          }
          resolve([]);
        });
      }
      acceptAll() {
        return new Promise((resolve, reject) => {
          if (this.plugin) {
            return this.plugin.acceptAll(resolve, reject);
          }
          resolve([]);
        });
      }
      denyAll() {
        return new Promise((resolve, reject) => {
          if (this.plugin) {
            return this.plugin.denyAll(resolve, reject);
          }
          resolve([]);
        });
      }
      clearUserSession() {
        return new Promise((resolve, reject) => {
          if (this.plugin) {
            return this.plugin.clearUserSession(() => {
              resolve();
            }, reject);
          }
          resolve();
        });
      }
      initializePlugin() {
        var _a, _b;
        this.plugin = (_b = (_a = window.cordova) == null ? void 0 : _a.plugins) == null ? void 0 : _b.usercentrics;
      }
    }

    var __async$1 = (__this, __arguments, generator) => {
      return new Promise((resolve, reject) => {
        var fulfilled = (value) => {
          try {
            step(generator.next(value));
          } catch (e) {
            reject(e);
          }
        };
        var rejected = (value) => {
          try {
            step(generator.throw(value));
          } catch (e) {
            reject(e);
          }
        };
        var step = (x) => x.done ? resolve(x.value) : Promise.resolve(x.value).then(fulfilled, rejected);
        step((generator = generator.apply(__this, __arguments)).next());
      });
    };
    function syncLocalStorage() {
      return __async$1(this, null, function* () {
        var _a;
        const storageKey = "localStorageBackup";
        const syncFields = ["FirstLogin", "LastLoginType", "LastLoginDateTime", "Authentication"];
        const localStorageBackupString = (_a = yield SecureStorage.getInstance().storageGet(storageKey)) != null ? _a : "{}";
        const localStorageBackup = JSON.parse(localStorageBackupString);
        for (let i = 0; i < window.localStorage.length; i++) {
          const key = String(window.localStorage.key(i));
          for (const fieldName of syncFields) {
            if (key.includes(fieldName)) {
              localStorageBackup[key] = String(window.localStorage.getItem(key));
              break;
            }
          }
        }
        for (const key in localStorageBackup) {
          if (!window.localStorage.hasOwnProperty(key)) {
            window.localStorage.setItem(key, localStorageBackup[key]);
          }
        }
        yield SecureStorage.getInstance().storageSet(storageKey, JSON.stringify(localStorageBackup));
      });
    }

    var __async = (__this, __arguments, generator) => {
      return new Promise((resolve, reject) => {
        var fulfilled = (value) => {
          try {
            step(generator.next(value));
          } catch (e) {
            reject(e);
          }
        };
        var rejected = (value) => {
          try {
            step(generator.throw(value));
          } catch (e) {
            reject(e);
          }
        };
        var step = (x) => x.done ? resolve(x.value) : Promise.resolve(x.value).then(fulfilled, rejected);
        step((generator = generator.apply(__this, __arguments)).next());
      });
    };
    const PREPROD_LABEL = "Preprod";
    if (PlatformEnv.getInstance().platform === "windows") {
      window.__isDebugBuild = () => {
        return !PlatformEnv.getInstance().release;
      };
    }
    class Main {
      constructor() {
        this.facebookInstance = new Facebook();
        var _a, _b;
        window.getDeviceInfo = getDeviceInfoPlatformInstance;
        this.applovinPlugin = new ApplovinMAX();
        this.usercentricsPlugin = new Usercentrics();
        this.localNotification = new LocalNotifications();
        this.pushNotificationsInstance = PlatformEnv.getInstance().market === "amazon" ? new SmPushNotificationsStub() : new SmPushNotifications();
        this.sendAnalytics();
        let canvas = null;
        let IsFeatureOnInLastSessionValue = "";
        let UrlInLastSessionValue = "";
        if (PlatformEnv.getInstance().platform === "windows") {
          canvas = document.getElementById("gameview");
        } else {
          window.__native.getAppDataPath();
          canvas = window.__native.getGameView();
          IsFeatureOnInLastSessionValue = (_a = window.localStorage.getItem("smh_nullSettings:IsFeatureOnInLastSession")) != null ? _a : "";
          UrlInLastSessionValue = (_b = window.localStorage.getItem("smh_nullSettings:UrlInLastSession")) != null ? _b : "";
        }
        let splashScreenPath = IsFeatureOnInLastSessionValue === "true" ? UrlInLastSessionValue : "";
        if (splashScreenPath.length > 0 && splashScreenPath.startsWith('"')) {
          splashScreenPath = splashScreenPath.replace(/"/g, "");
        }
        this.displayRoot = window.__nativePreloader = new DisplayRoot(canvas, new RootComponentFactory(), splashScreenPath);
        const jsonLoader = new JsonLoader();
        this.userLanguage = new UserLanguage(jsonLoader);
        window.__drawPreloader = () => this.drawPreloader();
        window.hideLatePreloader = () => this.hideLatePreloader();
        this.launchReview = PlatformEnv.getInstance().platform === "ios" || PlatformEnv.getInstance().platform === "android" ? new LaunchReview() : new LaunchReviewStub();
      }
      run() {
        return __async(this, null, function* () {
          var _a;
          const uiInitTask = this.displayRoot.initialize();
          this.displayRoot.addEventListener(EventType.LANGUAGE_CHANGED, (e) => {
            this.userLanguage.setCurrentLanguage(e.newLanguageIso);
          });
          const stage = (_a = localStorage.getItem("stage")) != null ? _a : PlatformEnv.getInstance().linkCdnProd;
          if (window.__isDebugBuild()) {
            if (localStorage.getItem("stage_config_url") && localStorage.getItem("debug_do_not_ask")) {
              yield this.finishLoading(stage);
              return;
            }
          }
          yield this.finishLoading(stage);
          return uiInitTask;
        });
      }
      sendAnalytics() {
        try {
          this.sendClientInfo();
          this.sendDynamicClientErrors();
        } catch (e) {
          nativeLogger.error("Failed to send analytics: " + e);
        }
      }
      sendClientInfo() {
        const value = getAppVars().analyticsData;
        if (!value) {
          return;
        }
        const analyticsData = JSON.parse(value);
        analyticsProxy.trackDynamicClientInfo(analyticsData.clientVersion, analyticsData.wasUpdate, analyticsData.isUpdatePlanned, analyticsData.plannedUpdateToVersion, analyticsData.severity, analyticsData.userLevel);
        window.app_vars.analyticsData = null;
      }
      sendDynamicClientErrors() {
        const value = window.app_vars.dynamicClientErrors;
        if (!value) {
          return;
        }
        analyticsProxy.trackDynamicClientError(value);
        window.app_vars.dynamicClientErrors = null;
      }
      loadNativeGlue() {
        if (PlatformEnv.getInstance().platform === "windows") {
          PlaytikaClientType.setup();
        }
        this.index();
      }
      finishLoading(stage) {
        return __async(this, null, function* () {
          this.displayRoot.loadManifest(stage);
          analyticsProxy.trackDynamicClientLoadingStart();
          try {
            window.preloaderMonitoringService.startPreloaderSpan();
            if (!PlatformEnv.getInstance().release && PlatformEnv.getInstance().platform === "windows" && window.__debugCreateNewUser) {
              yield getDeviceInfoPlatformInstance().initialize();
            }
            if (PlatformEnv.getInstance().platform === "windows") {
              window.getDeviceInfo().initialize().then(() => __async(this, null, function* () {
                window.SentryProxy.setUser(getAppVars().deviceInfo.uuid);
                yield this.initializeNativeBridge();
                this.initializeLocalization().catch((e) => {
                  this.displayRoot.showGenericError(e);
                });
              }));
            } else {
              yield this.initializeNativeBridge();
              this.initializeLocalization().catch((e) => {
                this.displayRoot.showGenericError(e);
              });
            }
          } catch (error) {
            window.SentryProxy.captureException(error);
            nativeLogger.error(`ERROR: ${error}`);
          } finally {
            analyticsProxy.trackDynamicClientLoadingEnd();
          }
        });
      }
      initializeNativeBridge() {
        return __async(this, null, function* () {
          window.showHaxeErrorPopup = function(message) {
            window.SentryProxy.captureException(new Error(`${"OOPS POPUP INITIATOR"} showHaxeErrorPopup: [${message}]`));
            usePreloader((preloader) => {
              preloader.showGenericError();
            });
          };
          this.applovinPlugin.initializePlugin();
          window.appLovinPlugin = this.applovinPlugin;
          this.usercentricsPlugin.initializePlugin();
          window.usercentricsPlugin = this.usercentricsPlugin;
          window.getDynamicConfigInstance = () => DynamicConfig.getInstance();
          window.getLoadConfigInstance = () => LoadConfig.getInstance();
          window.getRedirectInstance = () => Redirect.getInstance();
          this.initializeSimpleStorage();
          initializeKeepScreenOn();
          this.initializeLocalNotification();
          yield this.loadDynamicConfig();
          this.initializeEventStream();
          EventStreamEvents.getInstance().trackInitialAppEvents();
          window.invokeNativeRateUs = (success, error) => this.launchReview.invokeNativeRateUs(success, error);
          window.launchNativeMarket = (success, error) => this.launchReview.openNativeMarket(success, error);
          window.isNativeRateUsAvailable = () => this.launchReview.isRateUsAvailable();
          window.getSecureStorageInstance = () => {
            return SecureStorage.getInstance();
          };
          window.getSignInWithAppleInstance = () => SignInWithApple.getInstance();
          window.getDeepLinksInstance = () => Deeplinks.getInstance();
          if (PlatformEnv.getInstance().platform === "windows") {
            window.getDeepLinksInstance().initialize();
            window.handleOpenURL = window.getDeepLinksInstance().handleLink;
            if (window.app_vars.deeplinksUrl) {
              window.getDeepLinksInstance().handleLink(window.app_vars.deeplinksUrl);
            }
            window.uwp_preloader = new WinPreloader();
          }
          window.getNativeSettingsInstance = () => new NativeSettings();
          window.getPermissionsInstance = () => Permissions.getInstance();
          window.getAppsFlyerInstance = () => getAppsFlyerServiceInstance();
          if (PlatformEnv.getInstance().market === "galaxy") {
            initializeGalaxyBilling(PlatformEnv.getInstance().release);
            initializeGalaxyCloudSDK();
          }
          const textCommunicator = PlatformEnv.getInstance().platform === "windows" ? new TextCommunicatorWindows() : new TextCommunicator();
          window.getTextCommunicatorInstance = () => textCommunicator;
          const notificationsEnabled = Boolean(StorageProxy.getStorageInstance().getValue("NotificationsEnabled"));
          this.pushNotificationsInstance.initialize(notificationsEnabled);
          window.getPushNotificationsInstance = () => this.pushNotificationsInstance;
          window.getCaptchaControllerInstance = () => CaptchaController.getInstance();
          window.getFirebaseAnalyticsInstance = () => FirebaseAnalytics.getInstance();
          window.getFacebookInstance = () => this.facebookInstance;
          window.getAgeSignalsPlugin = () => {
            if (PlatformEnv.getInstance().platform === "windows") {
              return void 0;
            } else {
              return window.Capacitor.Plugins.AgeSignalsPlugin;
            }
          };
        });
      }
      initializeLocalNotification() {
        try {
          this.localNotification.initialize();
        } catch (e) {
          window.SentryProxy.captureException(e);
          nativeLogger.error("ERROR: init localNotification");
        }
      }
      initializeEventStream() {
        const tracking = Tracking.getInstance();
        const eventStreamUrl = this.resolveEventStreamUrl();
        tracking.initialize(eventStreamUrl);
        window.getEventStreamTrackingInstance = () => tracking;
        getAppVars().funnel_id = tracking.funnelId;
        window.getEventStreamEventsInstance = () => EventStreamEvents.getInstance();
      }
      resolveEventStreamUrl() {
        const eventStreamUrl = DynamicConfig.getInstance().getKey("event_streaming", "service_url");
        if (!eventStreamUrl && PlatformEnv.getInstance().release) {
          return "https://sm-api-dsa.playtika.com/event-stream/events";
        }
        return eventStreamUrl || "";
      }
      initializeSimpleStorage() {
        try {
          window.getSettingsInstance = () => Settings.getSettingsInstance();
          window.getSimpleStorageInstance = () => StorageProxy.getStorageInstance();
        } catch (e) {
          if (window.SentryProxy) {
            window.SentryProxy.captureException(e);
            nativeLogger.error("ERROR: init simple storage");
          }
        }
      }
      initializeLocalization() {
        return __async(this, null, function* () {
          yield this.userLanguage.initialize(PlatformEnv.getInstance().marketVersion, PlatformEnv.getInstance().market);
          const supportedLanguages = window.app_vars.supportedLanguagesIso;
          if ((supportedLanguages == null ? void 0 : supportedLanguages.length) > 1) {
            const appLanguage = this.userLanguage.getApplicationLanguage();
            this.displayRoot.setLanguages(appLanguage, supportedLanguages);
          }
          this.loadNativeGlue();
        });
      }
      getDynamicConfigUrl() {
        var _a;
        let domain = (_a = Settings.getSettingsInstance().getItem("stage")) != null ? _a : PlatformEnv.getInstance().linkCdnProd;
        let siteName = Settings.getSettingsInstance().getItem("stage_label");
        if (siteName == null) {
          siteName = "Production";
        }
        if (siteName === "Preprod") {
          domain = PlatformEnv.getInstance().linkCdnPreprod;
        } else if (siteName === "Production") {
          domain = PlatformEnv.getInstance().linkCdnProd;
        }
        const clientVersion = PlatformEnv.getInstance().platform === "windows" ? PlatformEnv.getInstance().versionFromTpl : PlatformEnv.getInstance().clientVersion;
        return domain + `vs_fb_en_haxe/assets/${getAppVars().branchHash ? `${clientVersion}.${getAppVars().branchHash}/` : ""}dynamicConfig.json`;
      }
      loadDynamicConfig() {
        return __async(this, null, function* () {
          if (PlatformEnv.getInstance().platform === "windows") {
            return;
          }
          const webDynamicConfig = DynamicConfig.getInstance();
          getAppVars().config_url = this.getDynamicConfigUrl();
          const failCallback = function(url, status, response) {
            const error = new Error(`Url:${url}    Status:${status}    Response:${response}`);
            error.name = "DynamicConfigServiceError";
            window.SentryProxy.captureException(error);
            usePreloader((preloader) => {
              preloader.showConnectionError();
            });
          };
          const dynamic_config_promise = new Promise((resolve, reject) => {
            loadUrlWithRetry(getAppVars().config_url, resolve, false, 3, false, "json", null, failCallback);
          });
          const loadDynamicConfigResult = yield dynamic_config_promise;
          const webDynamicConfigResponse = loadDynamicConfigResult.response;
          if (isEmpty$1(webDynamicConfigResponse)) {
            nativeLogger.error("ERROR: Fail loading Dynamic Config");
            const error = new Error(`Empty response from Dynamic Config service. Url:${getAppVars().config_url}`);
            error.name = "DynamicConfigServiceError";
            window.SentryProxy.captureException(error);
            return;
          }
          webDynamicConfig.setClientVersion(PlatformEnv.getInstance().marketVersion);
          webDynamicConfig.setData(webDynamicConfigResponse);
          if (PlatformEnv.getInstance().market === "googleplay") {
            webDynamicConfig.addPrefix("Google");
          } else if (PlatformEnv.getInstance().platform === "ios") {
            const deviceType = getIosDeviceType();
            getAppVars().ios_device_type = deviceType;
            webDynamicConfig.addPrefix(deviceType);
            webDynamicConfig.addPrefix("IOS");
          } else if (PlatformEnv.getInstance().market === "pras") {
            webDynamicConfig.addPrefix("PRAS");
          } else if (PlatformEnv.getInstance().market === "amazon") {
            webDynamicConfig.addPrefix("Amazon");
          } else if (PlatformEnv.getInstance().market === "galaxy") {
            webDynamicConfig.addPrefix("Galaxy");
          }
          if (window.__isDebugBuild()) {
            webDynamicConfig.addPrefix("DEV");
          }
          webDynamicConfig.addPrefix("JS");
          webDynamicConfig.addPrefix("EN");
          const tracking = Tracking.getInstance();
          const eventStreamUrl = this.resolveEventStreamUrl();
          tracking.initialize(eventStreamUrl);
          window.getEventStreamTrackingInstance = () => tracking;
          getAppVars().funnel_id = tracking.funnelId;
        });
      }
      getStageRoot(config) {
        if (config.name === PREPROD_LABEL) {
          return "https://preprod-cdn.playtika.com/playtika/";
        }
        const root = /.+?(?=vs_crossplatform|vs_pltf_shared)/.exec(config.configUrl)[0];
        return root.replace("/stage/", "/playtika/");
      }
      drawPreloader() {
        this.displayRoot.draw();
      }
      hideLatePreloader() {
        this.displayRoot.release();
        this.displayRoot = null;
        nativeLogger.info("hide preloader");
      }
      index() {
        let appState = "appResumed";
        let _isStarted = false;
        let client_version = "";
        let domain = "";
        if (typeof window.flash_vars === "undefined") {
          window.flash_vars = {};
        }
        window.getPixelRatio = getPixelRatio;
        const stageName = Settings.getSettingsInstance().getItem("stage_label");
        if (PlatformEnv.getInstance().release) {
          console.log = function() {
          };
          console.error = function() {
          };
          console.info = function() {
          };
          console.warn = function() {
          };
          console.debug = function() {
          };
        }
        if (PlatformEnv.getInstance().platform === "windows") {
          window.__onCrashContextUpdated = (_userId, _userLevel, _userTierName, _sessionId) => {
            nativeLogger.warn(`WARN: Crash context updated: _userId - ${_userId} _userLevel - ${_userLevel} _userTierName - ${_userTierName} _sessionId - ${_sessionId}`);
          };
        }
        if (!PlatformEnv.getInstance().release) ;
        getAppVars().isEmbededStaticRes = null;
        getAppVars().containerVersion = PlatformEnv.getInstance().marketVersion;
        getAppVars().branchHash = stageName === "Preprod" || stageName === "Production" ? null : PlatformEnv.getInstance().branchHash;
        if (!isEmpty$1(PlatformEnv.getInstance().resolution)) {
          Settings.getSettingsInstance().setItem("resource", PlatformEnv.getInstance().resolution);
        }
        window.loginDataAvailable = () => false;
        window.getBrowserLanguageInIso = () => "en";
        window.getMarketVersion = () => PlatformEnv.getInstance().marketVersion;
        window.getEmbeddedClientVersion = () => PlatformEnv.getInstance().clientVersion;
        window.displayFlashScreenshot = (_) => {
        };
        window.hideFlashScreenshot = (_) => {
        };
        if (PlatformEnv.getInstance().platform !== "windows") {
          window.handleOpenURL = (url) => {
            Deeplinks.getInstance().handleLink(url);
          };
        }
        const onStageConfigLoaded = (response, callback) => {
          nativeLogger.info("INFO: Stage config loaded");
          setFacebookAppParameters(response).then();
          callback();
        };
        const webDynamicConfig = DynamicConfig.getInstance();
        const setFacebookAppParameters = (response) => __async(this, null, function* () {
          let fb_app_id = webDynamicConfig.getKey("stage_data", "facebook_app_id");
          let fb_client_token = webDynamicConfig.getKey("stage_data", "facebook_client_token");
          let fb_app_namespace = webDynamicConfig.getKey("stage_data", "facebook_namespace");
          if (!fb_app_id || !fb_client_token || !fb_app_namespace) {
            try {
              const config = JSON.parse(response.response);
              fb_app_id = config.stage_data.facebook_app_id;
              fb_client_token = config.stage_data.facebook_client_token;
              fb_app_namespace = config.stage_data.facebook_namespace;
            } catch (e) {
              nativeLogger.warn("WARN: Unable to get fb params from stage config");
            }
          }
          if (!fb_app_id || !fb_client_token || !fb_app_namespace) {
            fb_app_id = "228389400532645";
            fb_client_token = "dd54b4850849ad1bf406b0693bb6abcc";
            fb_app_namespace = "slots_stage_three";
          }
          nativeLogger.info("INFO: fb params", fb_app_id, fb_app_namespace);
          yield this.facebookInstance.setFacebookAppParameters(fb_app_id, fb_client_token, fb_app_namespace);
        });
        const wrapErrorMessage = (prefix, e) => {
          if (e) {
            if (typeof e === "string") {
              return `${prefix} ${e}`;
            } else {
              e.message = e.message ? `${prefix} ${e.message}` : prefix;
              return e;
            }
          } else {
            return new Error(prefix);
          }
        };
        const wrapErrorMessageForPlugin = (target, e) => {
          return wrapErrorMessage(`${"PLUGIN INIT ERROR"}: [ ${target} ].`, e);
        };
        window.onload = () => __async(this, null, function* () {
          if (PlatformEnv.getInstance().platform !== "windows") {
            return;
          }
          document.addEventListener("gl_context_lost", () => {
            window.SentryProxy.captureException(new Error("webglcontextlost"));
            window.restartBrowser();
          }, false);
        });
        const onDeviceReady = () => __async(this, null, function* () {
          var _a, _b, _c;
          if ((_a = window.Capacitor) == null ? void 0 : _a.Plugins) {
            const { Browser, Clipboard, App } = (_b = window.Capacitor) == null ? void 0 : _b.Plugins;
            window.clipboardPaste = function() {
              return __async(this, null, function* () {
                try {
                  const result = yield Clipboard.read();
                  return result.type === "text/plain" ? result.value : "";
                } catch (e) {
                  nativeLogger.error("ERROR: Clipboard paste error", e);
                }
                return "";
              });
            };
            window.clipboardCopy = function(text) {
              return __async(this, null, function* () {
                try {
                  yield Clipboard.write({
                    string: text
                  });
                } catch (e) {
                  nativeLogger.error("ERROR: Clipboard copy error", e);
                }
              });
            };
            window.openExternalLink = function(url) {
              Browser.open({ url });
            };
            window.openExternalBrowser = function(url) {
              App.openUrl({ url });
            };
          } else {
            window.clipboardCopy = () => __async(this, null, function* () {
              nativeLogger.error("ERROR: Clipboard capasitor plugin isn't initialized");
            });
            window.clipboardPaste = () => __async(this, null, function* () {
              nativeLogger.error("ERROR: Clipboard capasitor plugin isn't initialized");
              return "";
            });
            if (window.openExternalLink == null) {
              window.openExternalLink = () => {
                nativeLogger.error("ERROR: Browser capasitor plugin isn't initialized");
              };
            }
          }
          document.removeEventListener("deviceready", onDeviceReady);
          nativeLogger.info("INFO:onDeviceReady");
          window.sendSentryMsg = window.SentryProxy.captureException;
          try {
            try {
              yield getAppsFlyerServiceInstance().initService();
            } catch (e) {
              window.SentryProxy.captureException(wrapErrorMessageForPlugin("AppsFlyerService", e));
            }
            const textCommunicatorInstance = window.getTextCommunicatorInstance();
            try {
              yield textCommunicatorInstance.initialize();
            } catch (e) {
              window.SentryProxy.captureException(wrapErrorMessageForPlugin("textCommunicatorInstance", e));
            }
            try {
              Redirect.getInstance().initialize();
            } catch (e) {
              window.SentryProxy.captureException(wrapErrorMessageForPlugin("Redirect", e));
            }
            try {
              initializeKeepScreenOn();
            } catch (e) {
              window.SentryProxy.captureException(wrapErrorMessageForPlugin("KeepScreenOn", e));
            }
            yield getDeviceInfoPlatformInstance().initialize();
            try {
              StorageProxy.getStorageInstance().initialize();
            } catch (e) {
              window.SentryProxy.captureException(wrapErrorMessageForPlugin("SimpleStorage", e));
            }
            try {
              if (PlatformEnv.getInstance().platform === "windows") {
                this.localNotification.initialize();
              }
            } catch (e) {
              window.SentryProxy.captureException(wrapErrorMessageForPlugin("LocalNotifications", e));
            }
            try {
              window.getNativeSettingsInstance().initialize();
            } catch (e) {
              window.SentryProxy.captureException(wrapErrorMessageForPlugin("NativeSettings", e));
            }
            try {
              FirebaseAnalytics.getInstance().initialize();
            } catch (e) {
              window.SentryProxy.captureException(wrapErrorMessageForPlugin("FirebaseAnalytics", e));
            }
            Permissions.getInstance().initialize();
            getAppVars().textCommunicator = textCommunicatorInstance;
            yield initialize();
            domain = (_c = Settings.getSettingsInstance().getItem("stage")) != null ? _c : "";
            getAppVars().mobile_platform = PlatformEnv.getInstance().platform;
            getAppVars().mobile_market = PlatformEnv.getInstance().market;
            GooglePlayGamesSettings.init(webDynamicConfig);
            if (PlatformEnv.getInstance().platform === "ios") {
              initializeCdvPurchaseAppleStore();
              SecureStorage.getInstance().initialize();
              SignInWithApple.getInstance().initialize(getDeviceInfoPlatformInstance(), SecureStorage.getInstance(), webDynamicConfig.getKey("user_service", "applesignin_use_authcode"), webDynamicConfig.getKey("user_service", "applesignin_use_authcode_enabled_percentage"));
              yield prepareIOSDeviceIdParams(StorageProxy.getStorageInstance(), SecureStorage.getInstance());
              const idfaRequestEnabledPercentage = webDynamicConfig.getKey("idfa", "request_enabled_percentage");
              const idfaRequestEnabledPercentageBeforeLogin = webDynamicConfig.getKey("idfa", "request_enabled_percentage_before_login");
              yield setupIdfa(Number(idfaRequestEnabledPercentage) || 0, Number(idfaRequestEnabledPercentageBeforeLogin) || 0);
              yield showIdfaDialogIfEnabled();
            } else if (PlatformEnv.getInstance().platform === "windows") {
              SecureStorage.getInstance().initialize("uwpSecure");
              yield syncLocalStorage();
            } else {
              prepareAndroidDeviceIdParams();
              const googlePlayGames = yield GooglePlayGames.init(getGooglePlayGamesServicesPlugin(), new GooglePlayGamesEventStream(Tracking.getInstance()), GooglePlayGamesSettings.instance);
              window.googlePlayGames = googlePlayGames;
            }
            yield this.facebookInstance.initialize(getDeviceInfoPlatformInstance(), StorageProxy.getStorageInstance());
            Settings.getSettingsInstance().setItem("is_auto_load", true);
            Settings.getSettingsInstance().setItem("is_load_from_stage", false);
            Settings.getSettingsInstance().setItem("is_local_build", false);
            Settings.getSettingsInstance().setItem("selected_assets_version", "default");
            Settings.getSettingsInstance().setItem("client_version", "");
            const captchaPercentage = webDynamicConfig.getKey("captcha", "captcha_percentage");
            CaptchaController.getInstance().setPercentage(captchaPercentage);
            CaptchaController.getInstance().setDeeplink(getAppVars().deeplinksUrl);
            CaptchaController.getInstance().setSettingsInstance(Settings.getSettingsInstance());
            if (PlatformEnv.getInstance().platform !== "windows") {
              Settings.getSettingsInstance().setItem("is_pwa", true);
              Settings.getSettingsInstance().setItem("client_version", "");
              if (!PlatformEnv.getInstance().release && window.__debugCreateNewUser) {
                window.afterSettingsReady();
              } else {
                StorageProxy.getStorageInstance().loadSettings();
              }
            }
            document.addEventListener("requestLogout", () => {
              Settings.getSettingsInstance().setItem("is_auto_load", false);
              window.setLoginType(LOGIN_TYPES.NOT_CHOSEN);
              document.location.reload();
            }, false);
            getAppVars().mobile_platform = PlatformEnv.getInstance().platform;
            getAppVars().mobile_market = PlatformEnv.getInstance().market;
            document.addEventListener("pause", onPause, false);
            document.addEventListener("resume", onResume, false);
            try {
              if (PlatformEnv.getInstance().platform !== "windows") {
                Deeplinks.getInstance().initialize();
              }
            } catch (e) {
              window.SentryProxy.captureException(wrapErrorMessageForPlugin("DeepLinks", e));
            }
            setTimeout(() => {
              postponedInitializationOfWindows();
            }, 0);
          } catch (ex) {
            const e = wrapErrorMessage("OOPS POPUP INITIATOR", ex);
            window.SentryProxy.captureException(e);
            nativeLogger.error("ERROR:device ready error", e.message, e.stack);
            usePreloader((preloader) => {
              preloader.showGenericError(e);
            });
          }
          if (PlatformEnv.getInstance().market === "galaxy") {
            initializeGalaxyBilling(PlatformEnv.getInstance().release);
          }
        });
        const onPause = () => {
          nativeLogger.info("paused");
          appState = "appPaused";
          sendEvent("onAppPaused");
        };
        const onResume = () => {
          nativeLogger.info("resumed");
          appState = "appResumed";
          sendEvent("onAppResumed");
        };
        const sendEvent = (eventName, result = void 0) => {
          document.dispatchEvent(new CustomEvent(eventName, { detail: result }));
        };
        window.getAppState = () => {
          return appState;
        };
        const listenCloseEvents = () => {
          document.addEventListener("closeHeyThere", () => document.location.reload(true), false);
          function closeApp() {
            function onConfirm(buttonIndex) {
              if (buttonIndex !== 2)
                navigator.app.exitApp();
            }
            if (PlatformEnv.getInstance().platform !== "windows") {
              navigator.notification.confirm("Are you sure you want to exit the application? ", onConfirm, "Exit Slotomania?", ["yes", "no"]);
            }
          }
          document.addEventListener("closeApp", closeApp, false);
        };
        const postponedInitializationOfWindows = () => __async(this, null, function* () {
          if (PlatformEnv.getInstance().platform !== "windows") {
            return;
          }
          if (PlatformEnv.getInstance().release) {
            Settings.getSettingsInstance().setItem("stage_label", "Production");
            Settings.getSettingsInstance().setItem("stage_config_url", `${PlatformEnv.getInstance().linkCdnProd}/vs_crossplatform/config/prod.json`);
            Settings.getSettingsInstance().setItem("selected_assets_version", "default");
          }
          listenCloseEvents();
          StorageProxy.getStorageInstance().initialize();
          window.SentryProxy.setUser(getAppVars().deviceInfo.uuid);
          this.localNotification.initialize();
          document.dispatchEvent(new CustomEvent("cancelNotifications", { detail: {} }));
          StorageProxy.getStorageInstance().loadSettings();
        });
        const getDynamicConfigUrlForWindows = () => {
          const clientVersion = PlatformEnv.getInstance().platform === "windows" ? PlatformEnv.getInstance().versionFromTpl : PlatformEnv.getInstance().clientVersion;
          return domain + `vs_fb_en_haxe/assets/${getAppVars().branchHash ? `${clientVersion}.${getAppVars().branchHash}/` : ""}dynamicConfig.json`;
        };
        window.connectToSN = () => {
          nativeLogger.info("INFO: connectToSN");
          loginToFacebook(true);
        };
        window.connectToApple = () => {
          loadEnvironmentConfigIfNeeded(() => SignInWithApple.getInstance().login(false));
        };
        window.connectToAppleAsync = () => {
          let promise = Promise.resolve();
          loadEnvironmentConfigIfNeeded(() => {
            promise = SignInWithApple.getInstance().login(false);
          });
          return promise;
        };
        const loginToFacebook = (loginFromSettings) => {
          loadEnvironmentConfigIfNeeded(() => this.facebookInstance.FBlogin(loginFromSettings));
        };
        window.getLoginType = () => {
          if (!Settings.getSettingsInstance().isEmpty("Settings_LastLoginTypeBackup")) {
            window.setLoginType(Number(Settings.getSettingsInstance().getItem("Settings_LastLoginTypeBackup")) || 0);
          }
          const value = StorageProxy.getStorageInstance().getValue("LastLoginType");
          return Number(value) || 0;
        };
        window.setLoginType = (loginType) => {
          const app_vars = getAppVars();
          if (loginType === LOGIN_TYPES.APPLE_SIGN_IN) {
            getFlashVars().client_type_id = getSmAppleSignIn();
            app_vars.mobile_login_type = "apple";
            app_vars.chosenSocialPlatformForDotcom = 7;
          }
          if (loginType === LOGIN_TYPES.FACEBOOK) {
            getFlashVars().client_type_id = getFacebook();
            app_vars.mobile_login_type = "facebook";
            app_vars.chosenSocialPlatformForDotcom = 2;
          }
          if (loginType === LOGIN_TYPES.STANDALONE) {
            getFlashVars().client_type_id = getStandalone();
            app_vars.mobile_login_type = "standalone";
            app_vars.chosenSocialPlatformForDotcom = 0;
          }
          if (loginType === LOGIN_TYPES.GOOGLE_PLAY_GAMES) {
            getFlashVars().client_type_id = getAndroidGooglePlayGames();
            app_vars.mobile_login_type = "google-play-games";
            app_vars.chosenSocialPlatformForDotcom = 0;
          }
          StorageProxy.getStorageInstance().setFile("Settings", "LastLoginType", loginType.toString());
          Settings.getSettingsInstance().setItem("Settings_LastLoginType", loginType);
          Settings.getSettingsInstance().setItem("Settings_LastLoginTypeBackup", loginType);
        };
        window.afterSettingsReady = () => {
          EventStreamEvents.getInstance().trackLocalStorageInit(window.getSimpleStorageInstance().getPublicDataString());
          if (!PlatformEnv.getInstance().release && window.__debugCreateNewUser) {
            window.setLoginType(PlatformEnv.getInstance().platform === "windows" ? LOGIN_TYPES.NOT_CHOSEN : LOGIN_TYPES.STANDALONE);
          }
          const loginType = window.getLoginType();
          nativeLogger.info(`INFO: Login::LastLoginType is ${loginType}`);
          if (isEmpty$1(loginType) || loginType === LOGIN_TYPES.NOT_CHOSEN) {
            if (!StorageProxy.getStorageInstance().getValue("SocialNetwork.Id") && window.isPassThroughEnabled("lobby")) {
              EventStreamEvents.getInstance().postponeEvent(EventStreamEvents.getInstance().trackingEvents.LOGIN_SCREEN_SKIPPED);
              window.onLaterClick();
            } else {
              nativeLogger.info("INFO: Login::Show login stage");
              usePreloader((preloader) => {
                EventStreamEvents.getInstance().trackLoginScreenDisplayed();
                EventStreamEvents.getInstance().postponeEvent(EventStreamEvents.getInstance().trackingEvents.LOGIN_SCREEN_NOT_SKIPPED);
                preloader.setStage("login");
              });
            }
            return;
          }
          const isFacebookInBackupMode = webDynamicConfig.getBool("facebook", "backup_mode");
          if (needToRecoverFacebookLogin(loginType)) {
            if (isFacebookInBackupMode) {
              loadEnvironmentConfigIfNeeded(() => Standalone.loginAfterFacebookFailed());
            } else {
              loginToFacebook(false);
            }
            return;
          }
          if (loginType == LOGIN_TYPES.FACEBOOK && isFacebookInBackupMode) {
            loadEnvironmentConfigIfNeeded(() => Standalone.loginAfterFacebookFailed());
          } else if (loginType == LOGIN_TYPES.FACEBOOK) {
            checkFacebookStatus();
          } else if (loginType == LOGIN_TYPES.APPLE_SIGN_IN) {
            loadEnvironmentConfigIfNeeded(() => SignInWithApple.getInstance().validCredentials());
          } else if (loginType === LOGIN_TYPES.GOOGLE_PLAY_GAMES) {
            resumeAppWithGooglePlayGames();
          } else {
            loadEnvironmentConfigIfNeeded(() => {
              if (window.isPassThroughEnabled("lobby")) {
                EventStreamEvents.getInstance().trackLoginScreenSkipped();
              }
              Standalone.login();
            });
          }
        };
        const needToRecoverFacebookLogin = (loginType) => {
          const value = StorageProxy.getStorageInstance().getValue("isStandaloneAfterFacebookFailed");
          return loginType === LOGIN_TYPES.STANDALONE && ((value == null ? void 0 : value.toString().toLowerCase()) == "true" || (value == null ? void 0 : value.toString().toLowerCase()) == "t");
        };
        const onNotAuthenticated = (message) => {
          nativeLogger.warn(message);
          window.setLoginType(LOGIN_TYPES.NOT_CHOSEN);
          usePreloader((preloader) => preloader.setStage(ScreenId.LOGIN_SCREEN));
        };
        const initGooglePlayGamesPlayerData = () => __async(this, null, function* () {
          var _a;
          const player = yield (_a = window.googlePlayGames) == null ? void 0 : _a.getCurrentPlayer();
          if (player && player.success) {
            getAppVars().user_sn_id = player.data.playerId;
            getAppVars().social_name = player.data.displayName;
          } else {
            nativeLogger.error("ERROR: Login::GooglePlayGames getCurrentPlayer failed: " + String(player == null ? void 0 : player.error));
          }
        });
        const resumeAppWithGooglePlayGames = () => __async(this, null, function* () {
          if (!GooglePlayGamesSettings.instance.isEnabledByConfig) {
            onNotAuthenticated("WARN: Login::GooglePlayGames is not enabled by config");
            return;
          }
          yield initGooglePlayGamesPlayerData();
          window.startApp();
        });
        window.onGooglePlayGamesClick = () => __async(this, null, function* () {
          EventStreamEvents.getInstance().trackLoginModeSelected("google-play-games");
          if (!window.googlePlayGames) {
            window.showHaxeErrorPopup("GooglePlayGames is not initialized");
            return;
          }
          usePreloader((preloader) => preloader.setStage(ScreenId.SPLASH_SCREEN));
          const result = yield window.googlePlayGames.login({ forceRefreshToken: false, scopes: ["EMAIL"] });
          if (!result.success) {
            onNotAuthenticated("ERROR: Login::GooglePlayGames error: " + String(result.error));
            return;
          }
          yield initGooglePlayGamesPlayerData();
          nativeLogger.info("INFO: Login::GooglePlayGames authenticated");
          getAppVars().google_auth_code = result.data.authCode;
          window.setLoginType(LOGIN_TYPES.GOOGLE_PLAY_GAMES);
          window.startApp();
        });
        window.onLaterClick = () => __async(this, null, function* () {
          EventStreamEvents.getInstance().trackLoginModeSelected("sa");
          yield CaptchaController.getInstance().verifyUser(LOGIN_TYPES.STANDALONE);
          usePreloader((preloader) => {
            preloader.setStage("splash");
            loadEnvironmentConfigIfNeeded(() => Standalone.login());
          });
        });
        window.onFacebookClick = () => __async(this, null, function* () {
          EventStreamEvents.getInstance().trackLoginModeSelected("fb");
          yield CaptchaController.getInstance().verifyUser(LOGIN_TYPES.FACEBOOK);
          usePreloader((preloader) => {
            preloader.setStage("splash");
            if (webDynamicConfig.getBool("facebook", "backup_mode")) {
              nativeLogger.info("INFO:Login::SA due to Facebook backup mode is enabled");
              loadEnvironmentConfigIfNeeded(() => Standalone.loginAfterFacebookFailed());
              return;
            }
            loginToFacebook(false);
          });
        });
        window.onAppleClick = () => {
          if (PlatformEnv.getInstance().platform == "windows") {
            return;
          }
          EventStreamEvents.getInstance().trackLoginModeSelected("apple");
          usePreloader((preloader) => {
            preloader.setStage("splash");
            loadEnvironmentConfigIfNeeded(() => SignInWithApple.getInstance().login(true));
          });
        };
        const checkFacebookStatus = () => {
          nativeLogger.info("INFO: Login::Facebook");
          loadEnvironmentConfigIfNeeded(() => this.facebookInstance.checkLoginStatus(false));
        };
        window.sendError = (ex) => {
          window.SentryProxy.captureException(ex);
        };
        window.sendMessage = (msg) => {
          window.SentryProxy.captureMessage(msg);
        };
        const loadEnvironmentConfigIfNeeded = (callback) => {
          const siteName = String(Settings.getSettingsInstance().getItem("stage_label"));
          if (siteName !== "Production") {
            const configUrl = String(Settings.getSettingsInstance().getItem("stage_config_url"));
            loadUrlWithCallback(configUrl, (res) => {
              onStageConfigLoaded(res, callback);
            });
          } else {
            callback();
          }
        };
        window.isAppStarted = function() {
          return _isStarted;
        };
        window.startApp = function() {
          var _a;
          const { linkCdnPreprod, linkCdnProd, platform } = PlatformEnv.getInstance();
          if (platform === "windows") {
            domain = (_a = Settings.getSettingsInstance().getItem("stage")) != null ? _a : linkCdnProd;
            let siteName = Settings.getSettingsInstance().getItem("stage_label");
            if (siteName == null) {
              siteName = "Production";
            }
            if (siteName === "Preprod") {
              domain = linkCdnPreprod;
            } else if (siteName === "Production") {
              domain = linkCdnProd;
            }
          }
          if (_isStarted) {
            nativeLogger.error("ERROR: Application has already started.");
            return;
          }
          setupServices();
          loadConfigAndSetVersion();
        };
        const loadConfigAndSetVersion = () => {
          var _a;
          if (_isStarted) {
            return;
          }
          client_version = (_a = Settings.getSettingsInstance().getItem("client_version") || webDynamicConfig.getKey("config", "version")) != null ? _a : "";
          if (PlatformEnv.getInstance().platform === "windows") {
            getAppVars().config_url = getDynamicConfigUrlForWindows();
            loadUrlWithCallback(getAppVars().config_url, onWebDynamicConfigLoadedWindows, false);
            window.enableFrameProcessing = false;
          } else {
            try {
              LoadConfig.getInstance().initialize(webDynamicConfig, domain, client_version);
              LoadConfig.getInstance().onProdJsonLoaded();
              _isStarted = true;
            } catch (e) {
              nativeLogger.error("ERROR: Failed to initialize load config:", e.message);
              window.showHaxeErrorPopup("Failed to initialize load config");
            }
          }
        };
        function setupServices() {
          var _a;
          getAppsFlyerServiceInstance().setSettings(webDynamicConfig.getKey("apps_flyer", "apps_flyer_key"));
          webDynamicConfig.getKey("adwords", "conversion_id");
          webDynamicConfig.getKey("adwords", "install_label");
          webDynamicConfig.getKey("adwords", "payment_label");
          webDynamicConfig.getKey("adwords", "fire_adwords_payment_conversion");
          if (PlatformEnv.getInstance().platform !== "windows") {
            const sentryLogAttachNativePercent = (_a = webDynamicConfig.getKey("crash_log", "sentry_log_attach_native_percent")) != null ? _a : "";
            window.__accountKeyValueStorage.set("SentryLogAttachNativePercent", sentryLogAttachNativePercent);
            nativeLogger.info("INFO: SentryLogAttachNativePercent is set via the dynamic config to " + sentryLogAttachNativePercent);
          }
        }
        if (document.deviceready) {
          setTimeout(() => {
            onDeviceReady();
          }, 100);
        } else {
          document.addEventListener("deviceready", onDeviceReady, false);
        }
        const onAppResumed = () => {
          window.SentryProxy.resetSessionStartTime();
        };
        document.addEventListener("onAppResumed", onAppResumed, false);
        const onNativeLoaderFail = (ev) => {
          const e = ev;
          let xGrn;
          if (typeof e.detail.headers === "string") {
            const m = e.detail.headers.match(/x-grn:(.*)[\r\n]+/);
            if (m) {
              xGrn = m[1].trim();
            }
          }
          window.SentryProxy.sendMessage(`NativeLoaderFail Network error: ${e.detail.errorCode}, X-Grn: ${xGrn}, Status: ${e.detail.status}, Url: ${e.detail.url}`);
        };
        document.addEventListener("nativeLoaderFail", onNativeLoaderFail, false);
        document.addEventListener("crashContextUpdated", (ev) => {
          const event = ev;
          window.SentryProxy.setUser(event.detail.userId);
          window.__onCrashContextUpdated(event.detail.userId, String(event.detail.userLevel), event.detail.userTierName, event.detail.sessionId);
        });
        window.isOnline = (path) => {
          const xhr = new XMLHttpRequest();
          xhr.open("HEAD", `${path}?rand=${Math.floor((1 + Math.random()) * 65536)} `, true);
          return new Promise((resolve) => {
            xhr.onreadystatechange = () => {
              if (xhr.readyState === 4) {
                if (xhr.status >= 200 && (xhr.status < 300 || xhr.status === 304)) {
                  return resolve(true);
                }
                resolve(false);
              }
            };
            xhr.send(null);
          });
        };
        const onWebDynamicConfigLoadedWindows = (response) => {
          const webDynamicConfigResponse = JSON.parse(response.response);
          if (isEmpty$1(webDynamicConfigResponse)) {
            nativeLogger.error("ERROR: Fail loading Dynamic Config");
            const error = new Error(`Empty response from Dynamic Config service. Url:${getAppVars().config_url}`);
            error.name = "DynamicConfigServiceError";
            window.SentryProxy.captureException(error);
            return;
          }
          webDynamicConfig.setData(webDynamicConfigResponse);
          webDynamicConfig.addPrefix("Google");
          webDynamicConfig.addPrefix("JS");
          client_version = Settings.getSettingsInstance().getItem("client_version") || PlatformEnv.getInstance().versionFromTpl;
          getAppsFlyerServiceInstance().setSettings(webDynamicConfig.getKey("apps_flyer", "apps_flyer_key"));
          window.app_vars.download_webm = webDynamicConfigResponse.video_player["-W10-add-webm-load"];
          LoadConfig.getInstance().initialize(webDynamicConfig, domain, client_version);
          EventStreamEvents.getInstance().trackInitialAppEvents();
          LoadConfig.getInstance().onProdJsonLoaded();
          _isStarted = true;
        };
        const getUUIDPercentage = () => {
          const maxValue = 18446744073709552e3;
          const uuidValue = parseInt(getDeviceInfoPlatformInstance().getInfo().uuid.replace(/-/g, "").substring(0, 16), 16);
          return uuidValue / maxValue;
        };
        const normalizePercentage = (value) => {
          return isNaN(value) ? 0 : Math.min(Math.max(value, 0), 100) / 100;
        };
        const getPassThroughThreshold = (area) => {
          const blocks = webDynamicConfig.getKey("pass_through_access", area);
          if (blocks == null || !Array.isArray(blocks)) {
            return 0;
          }
          let block = blocks.find((b) => b.platform === window.app_vars.mobile_platform);
          if (block == null || block.percentage == null) {
            return 0;
          }
          let threshold = normalizePercentage(block.percentage);
          while (block && block.relative_to) {
            block = webDynamicConfig.getKey("pass_through_access", block.relative_to).find((b) => b.platform == window.app_vars.mobile_platform);
            if (block == null || block.percentage == null) {
              return 0;
            }
            threshold *= normalizePercentage(block.percentage);
          }
          return threshold;
        };
        window.isPassThroughEnabled = function(area) {
          return window.app_vars.mobile_market !== "pras" && getPassThroughThreshold(area) >= getUUIDPercentage();
        };
      }
    }
    window.pageReloadWithLocale = function(language) {
      nativeLogger.info("INFO: set profile language", language);
      main.userLanguage.setProfileLanguage(language);
      return window.pageReload();
    };
    window.setUserLevel = function(userLevel) {
      nativeLogger.info(`DC_INFO: Set user level to local storage: ${userLevel}`);
      localStorage.setItem("userLevel", userLevel.toString());
    };
    const main = new Main();
    main.run();

})();
//# sourceMappingURL=late-preloader.js.map

//# debugId=31081322-cbeb-5f9a-8683-e97c93fc1358
