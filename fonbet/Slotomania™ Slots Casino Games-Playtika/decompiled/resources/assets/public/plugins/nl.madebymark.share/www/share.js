cordova.define("nl.madebymark.share.Share", function(require, exports, module) { 
const exec = require("cordova/exec");

module.exports = {
    share: function (text, title, mimetype, successCallback, errorCallback) {
        if (typeof text !== "string") {
            text = "";
        }
        if (typeof title !== "string") {
            title = "Share";
        }
        if (typeof mimetype !== "string") {
            mimetype = "text/plain";
        }
        exec(successCallback, errorCallback, "Share", "share", [text, title, mimetype]);
    },
    messengerShare: function (url, successCallback, errorCallback) {
        exec(successCallback, errorCallback, "Share", "messengerShare", [url]);
    },
};
});