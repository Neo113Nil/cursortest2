cordova.define("cordova-plugin-facebook4.FacebookConnectPlugin", function(require, exports, module) { 
var exec = require('cordova/exec')
var cordova = require('cordova')

exports.getLoginStatus = function getLoginStatus (s, f) {
  exec(s, f, 'FacebookConnectPlugin', 'getLoginStatus', [])
}

exports.showDialog = function showDialog (options, s, f) {
  if (cordova.platformId === 'ios' && options && options.method === 'share_open_graph') {
    if (!options.object) {
      f("Missing required parameter 'object'.");
      return;
    }
    try {
      var object = JSON.parse(options.object);
    } catch (e) {
      f("Incorrect 'object' format: " + e.message);
      return;
    }
    options.method = 'share';
    options.share_feedWeb = true;
    if(!options.href) {
      options.href = object['og:url'];
    }
    if(!options.description) {
      options.description = object['og:description'];
    }
  }

  exec(s, f, 'FacebookConnectPlugin', 'showDialog', [options])
}

exports.login = function login (permissions, s, f) {
  exec(s, f, 'FacebookConnectPlugin', 'login', permissions)
}

exports.limitedLogin = function limitedLogin (permissions, nonce, s, f) {
  exec(s, f, 'FacebookConnectPlugin', 'limitedLogin', [permissions, nonce])
}

exports.checkHasCorrectPermissions = function checkHasCorrectPermissions (permissions, s, f) {
  exec(s, f, 'FacebookConnectPlugin', 'checkHasCorrectPermissions', permissions)
}

exports.logEvent = function logEvent (name, params, valueToSum, s, f) {
  // Prevent NSNulls getting into iOS, messes up our [command.argument count]
  if (!params && !valueToSum) {
    exec(s, f, 'FacebookConnectPlugin', 'logEvent', [name])
  } else if (params && !valueToSum) {
    exec(s, f, 'FacebookConnectPlugin', 'logEvent', [name, params])
  } else if (params && valueToSum) {
    exec(s, f, 'FacebookConnectPlugin', 'logEvent', [name, params, valueToSum])
  } else {
    f('Invalid arguments')
  }
}

exports.logPurchase = function logPurchase (value, currency, s, f) {
  exec(s, f, 'FacebookConnectPlugin', 'logPurchase', [value, currency])
}

exports.getAccessToken = function getAccessToken (s, f) {
  exec(s, f, 'FacebookConnectPlugin', 'getAccessToken', [])
}

exports.updateAccessTokenString = function (tokenString, expiresIn, s, f) {
  exec(s, f, 'FacebookConnectPlugin', 'updateAccessTokenString', [tokenString, expiresIn])
}

exports.logout = function logout (s, f) {
  exec(s, f, 'FacebookConnectPlugin', 'logout', [])
}

exports.api = function api (graphPath, permissions, s, f) {
  permissions = permissions || []
  exec(s, f, 'FacebookConnectPlugin', 'graphApi', [graphPath, permissions])
}

exports.getDeferredApplink = function (s, f) {
  exec(s, f, 'FacebookConnectPlugin', 'getDeferredApplink', [])
}

exports.activateApp = function (s, f) {
  exec(s, f, 'FacebookConnectPlugin', 'activateApp', [])
}

exports.getApplicationId = function (s, f) {
  exec(s, f, 'FacebookConnectPlugin', 'getApplicationId', [])
}

exports.setApplicationId = function (id, s, f) {
  exec(s, f, 'FacebookConnectPlugin', 'setApplicationId', [id])
}

exports.getApplicationName = function (s, f) {
  exec(s, f, 'FacebookConnectPlugin', 'getApplicationName', [])
}

exports.setApplicationName = function (name, s, f) {
  exec(s, f, 'FacebookConnectPlugin', 'setApplicationName', [name])
}

exports.getClientToken = function (s, f) {
  exec(s, f, 'FacebookConnectPlugin', 'getClientToken', [])
}

exports.setClientToken = function (token, s, f) {
  exec(s, f, 'FacebookConnectPlugin', 'setClientToken', [token])
}

exports.setDataProcessingOptions = function (options, country, state, s, f) {
  if (!(country >= 0 && state >= 0)) {
    exec(s, f, 'FacebookConnectPlugin', 'setDataProcessingOptions', [options]);
  } else {
    exec(s, f, 'FacebookConnectPlugin', 'setDataProcessingOptions', [options, country, state]);
  }
}
});