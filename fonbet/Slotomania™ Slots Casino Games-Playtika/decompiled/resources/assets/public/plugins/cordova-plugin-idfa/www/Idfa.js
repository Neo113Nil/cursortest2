cordova.define("cordova-plugin-idfa.Idfa", function(require, exports, module) { 
var exec = require("cordova/exec");
var PLUGIN_NAME = "Idfa";

module.exports = {
    getInfo: function() {
        return new Promise(function(resolve, reject) {
            exec(resolve, reject, PLUGIN_NAME, "getInfo", []);
        });
    },
    idfaRequestEnabled: function() {
        return new Promise(function(resolve, reject) {
            exec(resolve, reject, PLUGIN_NAME, "idfaRequestEnabled", []);
        });
    },
    idfaDialogAvailable: function() {
        return new Promise(function(resolve, reject) {
            exec(resolve, reject, PLUGIN_NAME, "idfaDialogAvailable", []);
        });
    },
    getStatus: function() {
        return new Promise(function(resolve, reject) {
            exec(resolve, reject, PLUGIN_NAME, "getStatus", []);
        });
    },
    showIdfaDialog: function() {
        return new Promise(function(resolve, reject) {
            exec(resolve, reject, PLUGIN_NAME, "showIdfaDialog", []);
        });
    }
};
});