
!function(){try{var e="undefined"!=typeof window?window:"undefined"!=typeof global?global:"undefined"!=typeof self?self:{},n=(new Error).stack;n&&(e._sentryDebugIds=e._sentryDebugIds||{},e._sentryDebugIds[n]="d4365e71-ae9a-512a-93c0-47b2bbb53c71")}catch(e){}}();
define(["exports","../playtika/std-legacy-12b02668","../playtika/core-legacy-586f780f","../playtika/monosyne-e5151f3b"],function(e,t,o,s){"use strict";e.P=void 0,function(n){n[n.OTHER=0]="OTHER",n[n.ONE=1]="ONE"}(e.P||(e.P={})),t.C.registerEnum(1303,e.P);class i{static isHasAllPluralText(c,f){for(const l of t.d.getValues(e.P)){const r=o.$.formatSingle(f,t.d.toString(e.P,l).toLowerCase());if(c.findByIdAs(s.B,r)==null)return!1}return!0}}t.C.register(10702,i),e.a=i});
//# sourceMappingURL=localization-api-983cb85f.js.map

//# debugId=d4365e71-ae9a-512a-93c0-47b2bbb53c71
