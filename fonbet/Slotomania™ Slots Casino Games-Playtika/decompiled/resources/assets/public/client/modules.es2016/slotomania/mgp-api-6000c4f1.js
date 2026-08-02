
!function(){try{var e="undefined"!=typeof window?window:"undefined"!=typeof global?global:"undefined"!=typeof self?self:{},n=(new Error).stack;n&&(e._sentryDebugIds=e._sentryDebugIds||{},e._sentryDebugIds[n]="e511f486-fe21-556e-8f77-99ecbbe42b68")}catch(e){}}();
define(["exports","../playtika/std-legacy-12b02668"],function(C,n){"use strict";class N{constructor(i,o,c,E){this.isSuccessful=i,this.serviceCode=o,this.gameId=c,this.exception=E}clone(){return new N(this.isSuccessful,this.serviceCode,this.gameId,this.exception)}copyFrom(i){return this.isSuccessful=i.isSuccessful,this.exception=i.exception,this.gameId=i.gameId,this.serviceCode=i.serviceCode,this}}n.C.register(27241,N),C.M=void 0,function(s){s[s.DISCONNECTED=0]="DISCONNECTED",s[s.CONNECTING=1]="CONNECTING",s[s.CONNECTED=2]="CONNECTED",s[s.CONNECT_ATTEMPT_FAILED=3]="CONNECT_ATTEMPT_FAILED",s[s.DISCONNECTING=4]="DISCONNECTING"}(C.M||(C.M={})),n.C.registerEnum(27342,C.M);class u{constructor(i,o){this._source=i,this._action=o}dispose(){this._source.unsubscribe(this._action)}}n.C.register(27242,u),C.a=N,C.b=u});
//# sourceMappingURL=mgp-api-6000c4f1.js.map

//# debugId=e511f486-fe21-556e-8f77-99ecbbe42b68
