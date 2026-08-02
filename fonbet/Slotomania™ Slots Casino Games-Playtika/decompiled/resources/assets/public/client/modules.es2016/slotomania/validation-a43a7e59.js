
!function(){try{var e="undefined"!=typeof window?window:"undefined"!=typeof global?global:"undefined"!=typeof self?self:{},n=(new Error).stack;n&&(e._sentryDebugIds=e._sentryDebugIds||{},e._sentryDebugIds[n]="f0206847-fe26-5270-b4bb-f6896fcfd26b")}catch(e){}}();
define(["exports","../group-std-a36d2e63","./big-int-7ca10c9f"],function(t,s,f){"use strict";const d={keyword:"bigInteger",type:"string",schemaType:"boolean",modifying:!0,validate:(e,r,n,u)=>(e&&(r.indexOf(".")!==-1&&(r=r.split(".")[0]),u.parentData[u.parentDataProperty]=new f.B(r)),!0),errors:!1},i=new s.ag({coerceTypes:!0,useDefaults:!0});i.addKeyword(d);function o(e){return e.__compiledValidateFn||(e.__compiledValidateFn=i.compile(e))}function l(e){const n=o(e).errors;if(!!n)return i.errorsText(n)}function a(e,r){if(o(r)(e))return e}function c(e,r){if(typeof e!="string"||e==="")return;let n;try{n=JSON.parse(e)}catch{}return r?a(n,r):n}function p(e,r){return c(e,r)}function g(e){return c(e)}t.a=g,t.g=l,t.p=p,t.v=a});
//# sourceMappingURL=validation-a43a7e59.js.map

//# debugId=f0206847-fe26-5270-b4bb-f6896fcfd26b
