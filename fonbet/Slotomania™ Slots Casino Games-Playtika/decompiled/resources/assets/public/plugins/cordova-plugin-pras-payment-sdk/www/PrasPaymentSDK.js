cordova.define("cordova-plugin-pras-payment-sdk.PrasPaymentSDK", function(require, exports, module) { 
/* global module, require */

const exec = require("cordova/exec");

const CVD_NAME = "PrasPaymentSDK";

module.exports = {
    initialize: function (authInfo, stageName, packageName, advertisingId, useVerticalWidget, success, fail) {
        exec(success, fail, CVD_NAME, "initialize", [authInfo, stageName, packageName, advertisingId, useVerticalWidget]);
    },
    getProductDetails: function (skus, locale, success, fail) {
        exec(success, fail, CVD_NAME, "getProductDetails", [skus, locale]);
    },
    startPurchase: function (sku, developerPayload, extras, success, fail) {
        exec(success, fail, CVD_NAME, "startPurchase", [sku, developerPayload, extras]);
    },
    consumePurchase: function (purchaseToken, success, fail) {
        exec(success, fail, CVD_NAME, "consumePurchase", [purchaseToken]);
    },
    getApprovedUnacknowledgedTransactions: function (success, fail) {
        exec(success, fail, CVD_NAME, "getApprovedUnacknowledgedTransactions", []);
    },
    openPaymentSettings: function (locale, success, fail) {
        exec(success, fail, CVD_NAME, "openPaymentSettings", [locale]);
    },
};
});