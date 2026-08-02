
!function(){try{var e="undefined"!=typeof window?window:"undefined"!=typeof global?global:"undefined"!=typeof self?self:{},n=(new Error).stack;n&&(e._sentryDebugIds=e._sentryDebugIds||{},e._sentryDebugIds[n]="9b7c46e6-d1e8-5328-928f-e2c9d569c3ce")}catch(e){}}();
define(["exports","../playtika/std-legacy-12b02668"],function(O,E){"use strict";O.B=void 0,function(_){_[_.UNKNOWN=0]="UNKNOWN",_[_.FREE_COINS=1]="FREE_COINS",_[_.MEGA_BONUS=2]="MEGA_BONUS",_[_.LOTTO_BONUS=3]="LOTTO_BONUS",_[_.TIMER=4]="TIMER",_[_.LOTTO_TIMER=5]="LOTTO_TIMER",_[_.DICE_BONUS=6]="DICE_BONUS",_[_.GOLDEN_DICE_BONUS=7]="GOLDEN_DICE_BONUS",_[_.STAR_DICE_TIMER=8]="STAR_DICE_TIMER"}(O.B||(O.B={})),E.C.registerEnum(10165,O.B);class N{constructor(){this._busyCount=0}keep(){this._busyCount++}release(){this._busyCount--,this._busyCount<0&&(this._busyCount=0)}get isFree(){return this._busyCount==0}get isBusy(){return!this.isFree}}E.C.register(10075,N),O.P=N});
//# sourceMappingURL=panels-common-1ed67c8e.js.map

//# debugId=9b7c46e6-d1e8-5328-928f-e2c9d569c3ce
