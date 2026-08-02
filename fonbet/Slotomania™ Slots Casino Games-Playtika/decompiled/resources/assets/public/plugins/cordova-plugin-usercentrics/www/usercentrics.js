cordova.define("cordova-plugin-usercentrics.Usercentrics", function(require, exports, module) { 
const exec = require("cordova/exec");
const pluginName = "Usercentrics";

module.exports = {
    initialize: function (options, callback, errorCallback) {
        exec(callback, errorCallback, pluginName, "initialize", [options]);
    },

    isReady: function (callback, errorCallback) {
        exec(callback, errorCallback, pluginName, "isReady", []);
    },

    showFirstLayer: function (callback, errorCallback) {
        exec(callback, errorCallback, pluginName, "showFirstLayer", []);
    },

    showSecondLayer: function (callback, errorCallback) {
        exec(callback, errorCallback, pluginName, "showSecondLayer", []);
    },

    getConsents: function (callback, errorCallback) {
        exec(callback, errorCallback, pluginName, "getConsents", []);
    },

    acceptAll: function (callback, errorCallback) {
        exec(callback, errorCallback, pluginName, "acceptAll", []);
    },

    denyAll: function (callback, errorCallback) {
        exec(callback, errorCallback, pluginName, "denyAll", []);
    },

    clearUserSession: function (callback, errorCallback) {
        exec(callback, errorCallback, pluginName, "clearUserSession", []);
    },
};
});