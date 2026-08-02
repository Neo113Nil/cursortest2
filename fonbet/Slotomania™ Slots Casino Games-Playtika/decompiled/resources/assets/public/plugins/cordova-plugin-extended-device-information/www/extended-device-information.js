cordova.define("cordova-plugin-extended-device-information.device", function(require, exports, module) { 
var argscheck = require('cordova/argscheck'),
    channel = require('cordova/channel'),
    utils = require('cordova/utils'),
    exec = require('cordova/exec'),
    cordova = require('cordova');

channel.createSticky('onCordovaInformationReady');
channel.waitForInitialization('onCordovaInformationReady');

function getDeviceModelName(successCallback) {
    var device = window.device;
    device.getInfo(function(info) {
        var result = cordova.platformId === 'ios'
            ? mapiOSDeviceModelName(info.model)
            : info.model;
        successCallback(result);
    });
}

function mapiOSDeviceModelName (modelName) {
    
    // https://stash.playtika.com/projects/MON/repos/core/browse/Src/Core.IOS/Utils/HardwareUtil.cs

    var modelsMap = {
        'iPhone1,1': 'iPhone 1G',
        'iPhone1,2': 'iPhone 3G',
        'iPhone2,1': 'iPhone 3GS',
        'iPhone3,1': 'iPhone 4',
        'iPhone3,2': 'iPhone 4',
        'iPhone3,3': 'iPhone 4',
        'iPhone4,1': 'iPhone 4S',
        'iPhone5,1': 'iPhone 5',
        'iPhone5,2': 'iPhone 5',
        'iPhone5,3': 'iPhone 5C',
        'iPhone5,4': 'iPhone 5C',
        'iPhone6,1': 'iPhone 5S',
        'iPhone6,2': 'iPhone 5S',
        'iPhone7,1': 'iPhone 6 Plus',
        'iPhone7,2': 'iPhone 6',
        'iPhone8,1': 'iPhone 6S',
        'iPhone8,2': 'iPhone 6S Plus',
        'iPhone8,4': 'iPhone SE',
        'iPhone9,1': 'iPhone 7',
        'iPhone9,2': 'iPhone 7 Plus',
        'iPhone9,3': 'iPhone 7',
        'iPhone9,4': 'iPhone 7 Plus',
        'iPhone10,1': 'iPhone 8',
        'iPhone10,2': 'iPhone 8 Plus',
        'iPhone10,3': 'iPhone X',
        'iPhone10,4': 'iPhone 8',
        'iPhone10,5': 'iPhone 8 Plus',
        'iPhone10,6': 'iPhone X',
        'iPhone11,2': 'iPhone XS',
        'iPhone11,4': 'iPhone XS Max',
        'iPhone11,6': 'iPhone XS Max',
        'iPhone11,8': 'iPhone XR',
        'iPhone12,1': 'iPhone 11',
        'iPhone12,3': 'iPhone 11 Pro',
        'iPhone12,5': 'iPhone 11 Pro Max',
        'iPhone12,8': 'iPhone SE 2nd Gen',
        'iPhone13,1': 'iPhone 12 Mini',
        'iPhone13,2': 'iPhone 12',
        'iPhone13,3': 'iPhone 12 Pro',
        'iPhone13,4': 'iPhone 12 Pro Max',
        'iPod1,1': 'iPod 1st gen.',
        'iPod2,1': 'iPod 2nd gen.',
        'iPod3,1': 'iPod 3rd gen.',
        'iPod4,1': 'iPod 4th gen.',
        'iPod5,1': 'iPod 5th gen.',
        'iPod7,1': 'iPod 6th gen.',
        'iPod9,1': 'iPod 7th gen.',
        'iPad1,1': 'iPad',
        'iPad2,1': 'iPad 2',
        'iPad2,2': 'iPad 2',
        'iPad2,3': 'iPad 2',
        'iPad2,4': 'iPad 2',
        'iPad2,5': 'iPad Mini',
        'iPad2,6': 'iPad Mini',
        'iPad2,7': 'iPad Mini',
        'iPad3,1': 'iPad 3',
        'iPad3,2': 'iPad 3',
        'iPad3,3': 'iPad 3',
        'iPad3,4': 'iPad 4',
        'iPad3,5': 'iPad 4',
        'iPad3,6': 'iPad 4',
        'iPad4,1': 'iPad Air',
        'iPad4,2': 'iPad Air',
        'iPad4,3': 'iPad Air',
        'iPad4,4': 'iPad Mini 2',
        'iPad4,5': 'iPad Mini 2',
        'iPad4,6': 'iPad Mini 2',
        'iPad4,7': 'iPad Mini 3',
        'iPad4,8': 'iPad Mini 3',
        'iPad4,9': 'iPad Mini 3',
        'iPad5,1': 'iPad Mini 4',
        'iPad5,2': 'iPad Mini 4',
        'iPad5,3': 'iPad Air 2',
        'iPad5,4': 'iPad Air 2',
        'iPad6,3': 'iPad Pro 9.7',
        'iPad6,4': 'iPad Pro 9.7',
        'iPad6,7': 'iPad Pro 12.9',
        'iPad6,8': 'iPad Pro 12.9',
        'iPad6,11': 'iPad Air 2017',
        'iPad6,12': 'iPad Air 2017',
        'iPad7,1': 'iPad Pro 12.9 2nd gen.',
        'iPad7,2': 'iPad Pro 12.9 2nd gen.',
        'iPad7,3': 'iPad Pro 10.5',
        'iPad7,4': 'iPad Pro 10.5',
        'iPad7,5': 'iPad Air 2018',
        'iPad7,6': 'iPad Air 2018',
        'iPad7,11': 'iPad 7th Gen 10.2-inch',
        'iPad7,12': 'iPad 7th Gen 10.2-inch',
        'iPad8,1': 'iPad Pro 11 inch 3rd Gen',
        'iPad8,2': 'iPad Pro 11 inch 3rd Gen',
        'iPad8,3': 'iPad Pro 11 inch 3rd Gen',
        'iPad8,4': 'iPad Pro 11 inch 3rd Gen',
        'iPad8,5': 'iPad Pro 12.9 inch 3rd Gen',
        'iPad8,6': 'iPad Pro 12.9 inch 3rd Gen',
        'iPad8,7': 'iPad Pro 12.9 inch 3rd Gen',
        'iPad8,8': 'iPad Pro 12.9 inch 3rd Gen',
        'iPad8,9': 'iPad Pro 11 inch 4th Gen',
        'iPad8,10': 'iPad Pro 11 inch 4th Gen',
        'iPad8,11': 'iPad Pro 12.9 inch 4th Gen',
        'iPad8,12': 'iPad Pro 12.9 inch 4th Gen',
        'iPad11,1': 'iPad mini 5th Gen',
        'iPad11,2': 'iPad mini 5th Gen',
        'iPad11,3': 'iPad Air 3rd Gen',
        'iPad11,4': 'iPad Air 3rd Gen',
        'iPad11,6': 'iPad 8th Gen',
        'iPad11,7': 'iPad 8th Gen',
        'iPad13,1': 'iPad air 4th Gen',
        'iPad13,2': 'iPad air 4th Gen',
        'MacBookPro17,1': 'MacBook Pro 13-inch, M1, 2020',
        'i386': 'simulator',
        'x86_64': 'simulator',
    };

    var m = modelsMap[modelName];
    if (m) {
        return m;
    }

    return modelName;
}

/**
 * This represents the mobile device, and provides properties for inspecting the model, version, UUID of the
 * phone, etc.
 * @constructor
 */
function ExtendedDevice() {
    this.memory = null;
    this.cpumhz = null;
    this.totalstorage = null;
    this.freestorage = null;
    this.hardwareId = null;
    this.deviceUniqueIdString = null;
    this.deviceFriendlyName = null;
    this.deviceModelName = null;
    this.openUDID = null;

    var me = this;

    channel.onCordovaReady.subscribe(function () {
        if(cordova.platformId === 'android' || cordova.platformId === 'ios' || cordova.platformId === "windows") {
            me.getInfo(function(info){
                console.log('Device Data', info);
                me.memory = info.memory || 'unknown';
                me.cpumhz = info.cpumhz || 'unknown';
                me.totalstorage = info.totalstorage || 'unknown';
                me.freestorage = info.freestorage || 'unknown';
                me.hardwareId = info.hardwareId;
                me.deviceUniqueIdString = info.deviceUniqueIdString;
                me.deviceFriendlyName = info.deviceFriendlyName;
                if (cordova.platformId === 'ios') {
                    me.openUDID = info.openUDID;
                }

                getDeviceModelName(function(model){
                    me.deviceModelName = model;
                    channel.onCordovaInformationReady.fire();
                });
            }, function(e){
                utils.alert('[ERROR] Error initializing Cordova: ' + e);
            });
        } else {
            channel.onCordovaInformationReady.fire();
        }
    });

}

/**
 * Get device info
 *
 * @param {Function} successCallback The function to call when the heading data is available
 * @param {Function} errorCallback The function to call when there is an error getting the heading data. (OPTIONAL)
 */
ExtendedDevice.prototype.getInfo = function (successCallback, errorCallback) {
    argscheck.checkArgs('fF', 'ExtendedDevice.getInfo', arguments);
    exec(successCallback, errorCallback, "ExtendedDevice", "getExtendedDeviceInfo", []);
};

/**
 * Get performance metrics
 *
 * @param {Function} successCallback The function to call when the heading data is available
 * @param {Function} errorCallback The function to call when there is an error getting the heading data. (OPTIONAL)
 */
ExtendedDevice.prototype.getPerformanceMetrics = function (successCallback, errorCallback) {
    argscheck.checkArgs('fF', 'ExtendedDevice.getPerformanceMetrics', arguments);
    exec(successCallback, errorCallback, "ExtendedDevice", "getPerformanceMetrics", []);
};



module.exports = new ExtendedDevice();
});