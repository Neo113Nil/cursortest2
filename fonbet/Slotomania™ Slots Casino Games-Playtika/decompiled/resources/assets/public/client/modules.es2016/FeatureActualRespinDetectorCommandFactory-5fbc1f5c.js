
!function(){try{var e="undefined"!=typeof window?window:"undefined"!=typeof global?global:"undefined"!=typeof self?self:{},n=(new Error).stack;n&&(e._sentryDebugIds=e._sentryDebugIds||{},e._sentryDebugIds[n]="d52f0cfc-111b-5ac2-ba1f-6ebf1dd78c44")}catch(e){}}();
define(["exports","./playtika/std-legacy-12b02668","./playtika/core-legacy-586f780f","./slotomania/gamenre-ef7be57f","./slotomania/machine-core-legacy-e333ecb3"],function(n,i,o,u,t){"use strict";class s{constructor(e){this.result=!1,this._responseEx=e}execute(){const e=this._responseEx.spin.nextSpinWillBeFreeSpin?1:0,r=o.m.firstOrDefault(t.N.getValues(this._responseEx.featuresTrigger,u.F.APPLIED_RESPINS));this.result=t.cl.getCommandResult(new t.rj(this._responseEx,t.C.CURRENT_VALUE,e))>0||(r==null?void 0:r.respinCount)>0}}i.C.register(21107,s);class l{constructor(){}getRespinDetectorCommand(e){return new s(e)}}i.C.register(21130,l),n.F=l,n.a=s});
//# sourceMappingURL=FeatureActualRespinDetectorCommandFactory-5fbc1f5c.js.map

//# debugId=d52f0cfc-111b-5ac2-ba1f-6ebf1dd78c44
