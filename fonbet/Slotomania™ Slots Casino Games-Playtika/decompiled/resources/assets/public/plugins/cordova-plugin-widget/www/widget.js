cordova.define("cordova-plugin-widget.widget", function(require, exports, module) { 
const exec = require('cordova/exec');

const PLUGIN_NAME = 'SlotomaniaWidget';

/**
 * @param {Object} opts
 * @param {string} opts.state  'timer' | 'collect'
 * @param {number} [opts.nextHourlyBonusTimeMillis]  Unix time ms when hourly bonus is ready (0 to clear)
 * @param {string} [opts.deeplink]  Deeplink URL for widget tap
 * @param {string} [opts.imageUrl]  URL of hourly bonus image (empty string to reset to default)
 * @param {Function} [success]
 * @param {Function} [error]
 */
exports.updateHourlyBonusState = function (opts, success, error) {
    exec(success, error, PLUGIN_NAME, 'updateHourlyBonusState', [opts]);
};

/**
 * @param {Object} opts
 * @param {string} opts.state  'regular' | 'hourly_bonus'
 * @param {Function} [success]
 * @param {Function} [error]
 */
exports.setWidgetState = function (opts, success, error) {
    exec(success, error, PLUGIN_NAME, 'setWidgetState', [opts]);
};

/**
 * @param {Object} opts  { deeplink: string }
 * @param {Function} [success]
 * @param {Function} [error]
 */
exports.setDeeplink = function (opts, success, error) {
    exec(success, error, PLUGIN_NAME, 'setDeeplink', [opts]);
};

/**
 * @param {Object} opts  { imageUrl: string }
 * @param {Function} [success]
 * @param {Function} [error]
 */
exports.setImageUrl = function (opts, success, error) {
    exec(success, error, PLUGIN_NAME, 'setImageUrl', [opts]);
};

/**
 * @param {Function} [success]
 * @param {Function} [error]
 */
exports.refreshWidget = function (success, error) {
    exec(success, error, PLUGIN_NAME, 'refreshWidget', []);
};

/**
 * @param {Function} success  receives { requested: boolean }
 * @param {Function} [error]
 */
exports.requestPinWidget = function (success, error) {
    exec(success, error, PLUGIN_NAME, 'requestPinWidget', []);
};

/**
 * @param {Function} success  receives { isOnHomeScreen: boolean }
 * @param {Function} [error]
 */
exports.isWidgetOnHomeScreen = function (success, error) {
    exec(success, error, PLUGIN_NAME, 'isWidgetOnHomeScreen', []);
};

/**
 * @param {Function} success  receives { supported: boolean }
 * @param {Function} [error]
 */
exports.isPinSupported = function (success, error) {
    exec(success, error, PLUGIN_NAME, 'isPinSupported', []);
};
});