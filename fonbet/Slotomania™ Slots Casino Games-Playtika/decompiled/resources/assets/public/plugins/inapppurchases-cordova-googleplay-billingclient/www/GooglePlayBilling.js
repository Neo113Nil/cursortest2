cordova.define("inapppurchases-cordova-googleplay-billingclient.GooglePlayBilling", function(require, exports, module) { 
/* global module, require */

const exec = require("cordova/exec");

const CVD_NAME = "GooglePlayBilling";

module.exports = {
    API_VERSION: 3,
    initialize: function (success, fail) {
        exec(success, fail, CVD_NAME, "initialize", []);
    },
    acknowledgePurchase: function (purchaseToken, success, fail) {
        exec(success, fail, CVD_NAME, "acknowledgePurchase", [purchaseToken]);
    },
    consumePurchase: function (purchaseToken, success, fail) {
        exec(success, fail, CVD_NAME, "consumePurchase", [purchaseToken]);
    },
    queryPurchases: function (type, success, fail) {
        exec(success, fail, CVD_NAME, "queryPurchases", [type]);
    },
    querySkuDetails: function (skuList, type, success, fail) {
        exec(success, fail, CVD_NAME, "querySkuDetails", [skuList, type]);
    },
    launchBillingFlow: function (skuDetails, success, fail) {
        exec(success, fail, CVD_NAME, "launchBillingFlow", [skuDetails]);
    },
    addPurchaseObserver: function (success, fail) {
        exec(success, fail, CVD_NAME, "addPurchaseObserver", []);
    },
    getBillingConfigAsync: function (success, fail) {
        exec(success, fail, CVD_NAME, "getBillingConfigAsync", []);
    },
    isExternalContentLinkProgramAvailable: function (success, fail) {
        exec(success, fail, CVD_NAME, "isExternalContentLinkProgramAvailable", []);
    },
    getExternalTransactionToken: function (success, fail) {
        exec(success, fail, CVD_NAME, "getExternalTransactionToken", []);
    },
    launchExternalLink: function (uri, type, mode, success, fail) {
        exec(success, fail, CVD_NAME, "launchExternalLink", [uri, type, mode]);
    },
    dispose: function (success, fail) {
        exec(success, fail, CVD_NAME, "dispose", []);
    },
};
});