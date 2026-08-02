cordova.define("cordova-plugin-applovin-max.AppLovinMAX", function(require, exports, module) { 
const exec = require("cordova/exec");
const cordova = require("cordova");

const VERSION = "2.2.0";

const AdFormat = {
    BANNER: "banner",
    MREC: "mrec",
};

const AdViewPosition = {
    TOP_CENTER: "top_center",
    TOP_RIGHT: "top_right",
    CENTERED: "centered",
    CENTER_LEFT: "center_left",
    CENTER_RIGHT: "center_right",
    BOTTOM_LEFT: "bottom_left",
    BOTTOM_CENTER: "bottom_center",
    BOTTOM_RIGHT: "bottom_right",
};

function isFunction(functionObj) {
    return typeof functionObj === "function";
}

function callNative(name, params = [], successCallback = null, errorCallback = null) {
    cordova.exec(successCallback, errorCallback, "AppLovinMAX", name, params);
}

var AppLovinMAX = {
    VERSION,
    AdFormat,
    AdViewPosition,

    // NOTE: We have to store states in JS as workaround for callback-based API
    // since Cordova does not allow for synchronous returns
    initialized: false,

    hasUserConsentValue: null,
    isAgeRestrictedUserValue: null,
    isDoNotSellValue: null,
    isTabletValue: null,
    isAdReadyValues: {},

    initialize: function (sdkKey, callback, adUnitIds) {
        const params = [VERSION, sdkKey];
        if (Array.isArray(adUnitIds) && adUnitIds.length > 0) {
            params.push(adUnitIds);
        }
        callNative("initialize", params, (config) => {
            AppLovinMAX.initialized = true;

            AppLovinMAX.hasUserConsentValue = config.hasUserConsent;
            AppLovinMAX.isAgeRestrictedUserValue = config.isAgeRestrictedUser;
            AppLovinMAX.isDoNotSellValue = config.isDoNotSell;
            AppLovinMAX.isTabletValue = config.isTablet;

            if (isFunction(callback)) {
                callback(config);
            }
        });
    },

    isInitialized: function () {
        return this.initialized;
    },

    showMediationDebugger: function () {
        callNative("showMediationDebugger");
    },

    /* -------------- */
    /* PRIVACY APIs */
    /* -------------- */

    setHasUserConsent: function (hasUserConsent) {
        this.hasUserConsentValue = hasUserConsent;
        callNative("setHasUserConsent", [hasUserConsent]);
    },

    hasUserConsent: function () {
        return this.hasUserConsentValue;
    },

    setDoNotSell: function (isDoNotSell) {
        this.isDoNotSellValue = isDoNotSell;
        callNative("setDoNotSell", [isDoNotSell]);
    },

    isDoNotSell: function () {
        return this.isDoNotSellValue;
    },

    /* -------------------- */
    /* GENERAL PUBLIC API */
    /* -------------------- */

    isTablet: function () {
        return this.isTabletValue;
    },

    setUserId: function (userId) {
        callNative("setUserId", [userId]);
    },

    setMuted: function (muted) {
        callNative("setMuted", [muted]);
    },

    setVerboseLogging: function (verboseLoggingEnabled) {
        callNative("setVerboseLogging", [verboseLoggingEnabled]);
    },

    setTestDeviceAdvertisingIds: function (advertisingIds) {
        callNative("setTestDeviceAdvertisingIds", [advertisingIds]);
    },

    setCreativeDebuggerEnabled: function (enabled) {
        callNative("setCreativeDebuggerEnabled", [enabled]);
    },

    /* ------------------- */
    /* SEGMENT TARGETING */
    /* ------------------- */

    addSegment: function (key, values) {
        callNative("addSegment", [key, values]);
    },

    /* ---------------- */
    /* EVENT TRACKING */
    /* ---------------- */

    trackEvent: function (event, parameters = null) {
        const parametersToSend = [event];

        if (parameters != null) {
            parametersToSend.push(parameters);
        }

        callNative("trackEvent", parametersToSend);
    },

    /* --------- */
    /* BANNERS */
    /* --------- */

    createBanner: function (adUnitId, bannerPosition) {
        callNative("createBanner", [adUnitId, bannerPosition]);
    },

    setBannerBackgroundColor: function (adUnitId, hexColorCode) {
        callNative("setBannerBackgroundColor", [adUnitId, hexColorCode]);
    },

    setBannerPlacement: function (adUnitId, placement) {
        callNative("setBannerPlacement", [adUnitId, placement]);
    },

    updateBannerPosition: function (adUnitId, bannerPosition) {
        callNative("updateBannerPosition", [adUnitId, bannerPosition]);
    },

    setBannerExtraParameter: function (adUnitId, key, value) {
        callNative("setBannerExtraParameter", [adUnitId, key, value]);
    },

    showBanner: function (adUnitId) {
        callNative("showBanner", [adUnitId]);
    },

    hideBanner: function (adUnitId) {
        callNative("hideBanner", [adUnitId]);
    },

    destroyBanner: function (adUnitId) {
        callNative("destroyBanner", [adUnitId]);
    },

    /* ------- */
    /* MRECS */
    /* ------- */

    createMRec: function (adUnitId, mrecPosition) {
        callNative("createMRec", [adUnitId, mrecPosition]);
    },

    setMRecBackgroundColor: function (adUnitId, hexColorCode) {
        callNative("setMRecBackgroundColor", [adUnitId, hexColorCode]);
    },

    setMRecPlacement: function (adUnitId, placement) {
        callNative("setMRecPlacement", [adUnitId, placement]);
    },

    updateMRecPosition: function (adUnitId, mrecPosition) {
        callNative("updateMRecPosition", [adUnitId, mrecPosition]);
    },

    setMRecExtraParameter: function (adUnitId, key, value) {
        callNative("setMRecExtraParameter", [adUnitId, key, value]);
    },

    showMRec: function (adUnitId) {
        callNative("showMRec", [adUnitId]);
    },

    hideMRec: function (adUnitId) {
        callNative("hideMRec", [adUnitId]);
    },

    destroyMRec: function (adUnitId) {
        callNative("destroyMRec", [adUnitId]);
    },

    /* --------------- */
    /* INTERSTITIALS */
    /* --------------- */

    loadInterstitial: function (adUnitId) {
        callNative("loadInterstitial", [adUnitId]);
    },

    isInterstitialReady: function (adUnitId) {
        const isReady = this.isAdReadyValues[adUnitId];
        return typeof isReady === "boolean" && isReady === true;
    },

    showInterstitial: function (adUnitId, placement = null, customData = null) {
        const parameters = [adUnitId, placement != null ? String(placement) : null, customData != null ? String(customData) : null];

        callNative("showInterstitial", parameters);
    },

    setInterstitialExtraParameter: function (adUnitId, key, value) {
        callNative("setInterstitialExtraParameter", [adUnitId, key, value]);
    },

    /* ---------- */
    /* REWARDED */
    /* ---------- */

    loadRewardedAd: function (adUnitId) {
        callNative("loadRewardedAd", [adUnitId]);
    },

    isRewardedAdReady: function (adUnitId) {
        const isReady = this.isAdReadyValues[adUnitId];
        return typeof isReady === "boolean" && isReady === true;
    },

    showRewardedAd: function (adUnitId, placement = null, customData = null) {
        const parameters = [adUnitId, placement != null ? String(placement) : null, customData != null ? String(customData) : null];

        callNative("showRewardedAd", parameters);
    },

    setRewardedAdExtraParameter: function (adUnitId, key, value) {
        callNative("setRewardedAdExtraParameter", [adUnitId, key, value]);
    },
};

// Attach listeners for ad readiness state management

window.addEventListener("OnInterstitialLoadedEvent", (adInfo) => {
    AppLovinMAX.isAdReadyValues[adInfo.adUnitId] = true;
});
window.addEventListener("OnInterstitialLoadFailedEvent", (adInfo) => {
    AppLovinMAX.isAdReadyValues[adInfo.adUnitId] = false;
});
window.addEventListener("OnInterstitialDisplayedEvent", (adInfo) => {
    AppLovinMAX.isAdReadyValues[adInfo.adUnitId] = false;
});
window.addEventListener("OnInterstitialAdFailedToDisplayEvent", (adInfo) => {
    AppLovinMAX.isAdReadyValues[adInfo.adUnitId] = false;
});
window.addEventListener("OnRewardedAdLoadedEvent", (adInfo) => {
    AppLovinMAX.isAdReadyValues[adInfo.adUnitId] = true;
});
window.addEventListener("OnRewardedAdLoadFailedEvent", (adInfo) => {
    AppLovinMAX.isAdReadyValues[adInfo.adUnitId] = false;
});
window.addEventListener("OnRewardedAdDisplayedEvent", (adInfo) => {
    AppLovinMAX.isAdReadyValues[adInfo.adUnitId] = false;
});
window.addEventListener("OnRewardedAdFailedToDisplayEvent", (adInfo) => {
    AppLovinMAX.isAdReadyValues[adInfo.adUnitId] = false;
});
window.addEventListener("OnRewardedAdReceivedRewardEvent", (adInfo) => {
    AppLovinMAX.isAdReadyValues[adInfo.adUnitId] = false;
});

if (typeof module !== "undefined" && module.exports) {
    module.exports = AppLovinMAX;
}
});