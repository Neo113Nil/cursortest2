
!function(){try{var e="undefined"!=typeof window?window:"undefined"!=typeof global?global:"undefined"!=typeof self?self:{},n=(new Error).stack;n&&(e._sentryDebugIds=e._sentryDebugIds||{},e._sentryDebugIds[n]="b808fdb8-5cb6-5693-a43a-be9027404d27")}catch(e){}}();
define(["exports","./playtika/std-legacy-12b02668","./slotomania/machine-core-legacy-e333ecb3"],function(n,r,t){"use strict";class e extends t.hF{static isNextSpinCoinGrab(s){return s.currentResponse.respin.nextSpinWillBeRespin?s.currentResponse.respin.respinPassed==0:!1}constructor(){super()}customDetect(s){return e.isNextSpinCoinGrab(s)}}r.C.register(21070,e),n.D=e});
//# sourceMappingURL=DeluxeCoinsGrabFeatureDetector-8b1390ac.js.map

//# debugId=b808fdb8-5cb6-5693-a43a-be9027404d27
