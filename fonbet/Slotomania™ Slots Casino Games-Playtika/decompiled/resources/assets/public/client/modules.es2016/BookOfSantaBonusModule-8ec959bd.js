
!function(){try{var e="undefined"!=typeof window?window:"undefined"!=typeof global?global:"undefined"!=typeof self?self:{},n=(new Error).stack;n&&(e._sentryDebugIds=e._sentryDebugIds||{},e._sentryDebugIds[n]="522b72db-e030-5b11-b816-751d86741615")}catch(e){}}();
define(["exports","./playtika/std-legacy-12b02668","./playtika/core-legacy-586f780f","./slotomania/bonusgamecore-1adc3422","./slotomania/sf-6e5149f2","./slotomania/bookofsantabonus-dc4331f4"],function(A,S,P,T,U,e){"use strict";class h{register(B){for(const r of e.B.BONUS_TYPES)P.R.registerType(B,e.a).as([S.r(22688)]).withMetadata("type",r);P.R.registerType(B,e.b).externallyOwned();for(let r=0;r<e.B.JACKPOT_POPUPS_AMOUNT;r++)P.R.register(B,T.y,O=>new T.y(e.b,P.k.resolve(O,S.r(1069)),P.k.resolve(O,U.bk),P.k.resolve(O,S.r(625)),e.B.JP_POPUP_ASSETS_TAG,`${e.B.JP_POPUP_RESOURCE_PATH}scene@_${r}.object`,U.g.snapshotWithFadeBackShowingBehavior())).as([S.r(22689)]).withMetadata("id",`${e.B.JP_POPUP_ASSETS_TAG}_${r}`).withMetadata("types",e.B.BONUS_TYPES)}}S.C.register(34549,h),A.BookOfSantaBonusModule=h});
//# sourceMappingURL=BookOfSantaBonusModule-8ec959bd.js.map

//# debugId=522b72db-e030-5b11-b816-751d86741615
