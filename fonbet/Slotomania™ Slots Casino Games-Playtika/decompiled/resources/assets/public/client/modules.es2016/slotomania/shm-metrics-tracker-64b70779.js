
!function(){try{var e="undefined"!=typeof window?window:"undefined"!=typeof global?global:"undefined"!=typeof self?self:{},n=(new Error).stack;n&&(e._sentryDebugIds=e._sentryDebugIds||{},e._sentryDebugIds[n]="56e434ef-f979-58eb-8a73-d16e4579b109")}catch(e){}}();
define(["exports","../playtika/core-legacy-586f780f","../playtika/std-legacy-12b02668"],function(i,e,n){"use strict";class s{constructor(){this._metadata={},this._starts=new Map}get metadata(){return Object.assign({},this._metadata)}start(t){this._starts.set(t,Date.now())}end(t){const a=this._starts.get(t);a!==void 0&&(this._metadata[t]=Date.now()-a,this._starts.delete(t))}record(t,a){this._metadata[t]=a}mark(t){this._metadata[t]=Date.now()}reset(){this._metadata={},this._starts.clear()}static callPostponedTypeInfo(){s.typeInfo=new e.T(e.a.bi(9827)).__initialize__(e.a.ci(null),[e.a.ii(25)],[])}static __instantiate__(t,a){return new s}}n.C.register(9827,s),i.S=s});
//# sourceMappingURL=shm-metrics-tracker-64b70779.js.map

//# debugId=56e434ef-f979-58eb-8a73-d16e4579b109
