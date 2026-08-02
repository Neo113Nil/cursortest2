package com.fyber.inneractive.sdk.flow.vast;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.r;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.fyber.inneractive.sdk.model.vast.l;
import com.fyber.inneractive.sdk.network.t;
import com.fyber.inneractive.sdk.network.u;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.network.x;
import com.fyber.inneractive.sdk.util.IAlog;
import com.ironsource.C4331u;
import com.ironsource.L6;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class j {
    /* JADX WARN: Removed duplicated region for block: B:18:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static InneractiveErrorCode a(InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.g gVar, r rVar) {
        t tVar;
        InneractiveErrorCode inneractiveErrorCode;
        InneractiveErrorCode inneractiveErrorCode2;
        t tVar2;
        x a;
        Set<com.fyber.inneractive.sdk.model.vast.r> keySet;
        String str;
        String str2 = gVar.i;
        if (!"VastErrorInvalidFile".equals(str2)) {
            if ("ErrorNoCompatibleMediaFile".equals(str2)) {
                inneractiveErrorCode2 = InneractiveErrorCode.SERVER_INVALID_RESPONSE;
                tVar2 = t.VAST_ERROR_NO_COMPATIBLE_MEDIA_FILE;
                LinkedHashMap linkedHashMap = gVar.O;
                if (linkedHashMap != null && (keySet = linkedHashMap.keySet()) != null && keySet.size() > 0) {
                    x xVar = new x();
                    JSONArray jSONArray = new JSONArray();
                    for (com.fyber.inneractive.sdk.model.vast.r rVar2 : keySet) {
                        try {
                            f fVar = (f) linkedHashMap.get(rVar2);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("url", rVar2.g);
                            jSONObject.put("bitrate", rVar2.e);
                            jSONObject.put("mime", TextUtils.isEmpty(rVar2.d) ? "na" : rVar2.d);
                            jSONObject.put(C4331u.g, rVar2.a);
                            e eVar = fVar.a;
                            jSONObject.put("reason", eVar != null ? eVar.value : 0);
                            jSONObject.put("required_value", fVar.b);
                            jSONArray.put(jSONObject);
                        } catch (JSONException unused) {
                            IAlog.a("VastResponseValidator: Failed converting media file data to Extra data json!", new Object[0]);
                        }
                    }
                    xVar.a(jSONArray, "media_files");
                    inneractiveErrorCode = inneractiveErrorCode2;
                    tVar = tVar2;
                    a = xVar;
                    if (tVar != null) {
                    }
                    if (gVar.n != UnitDisplayType.NATIVE) {
                    }
                    if (gVar.N != null) {
                    }
                    return inneractiveErrorCode;
                }
            } else if ("VastErrorTooManyWrappers".equals(str2)) {
                inneractiveErrorCode2 = InneractiveErrorCode.SERVER_INVALID_RESPONSE;
                tVar2 = t.VAST_ERROR_TOO_MANY_WRAPPERS;
                a = new x().a(Integer.valueOf(IAConfigManager.N.i.b), InneractiveMediationNameConsts.MAX);
            } else if ("ErrorNoMediaFiles".equals(str2)) {
                inneractiveErrorCode2 = InneractiveErrorCode.SERVER_INVALID_RESPONSE;
                tVar2 = t.VAST_ERROR_NO_MEDIA_FILES;
            } else if ("ErrorConfigurationMismatch".equals(str2)) {
                inneractiveErrorCode2 = InneractiveErrorCode.ERROR_CONFIGURATION_MISMATCH;
                tVar2 = t.INTERNAL_CONFIG_MISMATCH;
            } else {
                if (!"VastErrorUnsecure".equals(str2)) {
                    tVar = null;
                    inneractiveErrorCode = null;
                    a = null;
                    if (tVar != null) {
                    }
                    if (gVar.n != UnitDisplayType.NATIVE) {
                    }
                    if (gVar.N != null) {
                    }
                    return inneractiveErrorCode;
                }
                inneractiveErrorCode2 = InneractiveErrorCode.SERVER_INVALID_RESPONSE;
                tVar2 = t.VAST_ERROR_UNSECURE_URL;
            }
            t tVar3 = tVar2;
            inneractiveErrorCode = inneractiveErrorCode2;
            tVar = tVar3;
            a = null;
            if (tVar != null) {
            }
            if (gVar.n != UnitDisplayType.NATIVE) {
            }
            if (gVar.N != null) {
            }
            return inneractiveErrorCode;
        }
        inneractiveErrorCode2 = InneractiveErrorCode.SERVER_INVALID_RESPONSE;
        tVar2 = t.VAST_ERROR_INVALID_RESPONSE;
        if (gVar.j != null) {
            a = new x().a(gVar.j, "exception");
        }
        t tVar32 = tVar2;
        inneractiveErrorCode = inneractiveErrorCode2;
        tVar = tVar32;
        a = null;
        if (tVar != null) {
            JSONArray b = rVar == null ? null : rVar.b();
            w wVar = new w(gVar);
            wVar.b = tVar;
            wVar.a = inneractiveAdRequest;
            wVar.d = b;
            if (a != null) {
                wVar.f.put(a.a);
            }
            wVar.a((String) null);
        }
        if (gVar.n != UnitDisplayType.NATIVE) {
            ArrayList arrayList = gVar.P;
            if (arrayList != null && arrayList.size() > 0) {
                u uVar = u.VAST_EVENT_COMPANION_FILTERED;
                JSONArray b2 = rVar == null ? null : rVar.b();
                w wVar2 = new w(gVar);
                wVar2.c = uVar;
                wVar2.a = inneractiveAdRequest;
                wVar2.d = b2;
                JSONObject jSONObject2 = new JSONObject();
                JSONArray jSONArray2 = new JSONArray();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    com.fyber.inneractive.sdk.model.vast.h hVar = (com.fyber.inneractive.sdk.model.vast.h) it.next();
                    hVar.getClass();
                    JSONObject jSONObject3 = new JSONObject();
                    try {
                        jSONObject3.put("w", hVar.a);
                        jSONObject3.put(com.mbridge.msdk.foundation.same.report.h.b, hVar.b);
                        jSONObject3.put(L6.K0, hVar.g);
                        jSONObject3.put("clt", hVar.h);
                        String str3 = hVar.f;
                        if (str3 != null) {
                            jSONObject3.put(HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT, str3);
                            str = "HTMLResource";
                        } else {
                            str = null;
                        }
                        l lVar = hVar.d;
                        if (lVar != null) {
                            jSONObject3.put(HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT, lVar.b);
                            jSONObject3.put("creativeType", hVar.d.a);
                            str = "StaticResource";
                        }
                        if (!TextUtils.isEmpty(hVar.e)) {
                            jSONObject3.put(HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT, hVar.e);
                            str = "iFrameResource";
                        }
                        if (str != null) {
                            jSONObject3.put("type", str);
                        }
                        b bVar = hVar.i;
                        if (bVar != null) {
                            jSONObject3.put("reason", bVar.a);
                            jSONObject3.put("exception", hVar.i.getMessage());
                        }
                    } catch (JSONException e) {
                        IAlog.a("Failed creating Companion json object: %s", e.getMessage());
                        jSONObject3 = null;
                    }
                    jSONArray2.put(jSONObject3);
                }
                try {
                    jSONObject2.put("companion_data", jSONArray2);
                } catch (Exception unused2) {
                    IAlog.f("Got exception adding param to json object: %s, %s", "companion_data", jSONArray2);
                }
                wVar2.f.put(jSONObject2);
                wVar2.a((String) null);
            }
            com.fyber.inneractive.sdk.model.vast.b bVar2 = gVar.N;
            int size = bVar2 != null ? bVar2.g.size() : 0;
            ArrayList arrayList2 = gVar.P;
            int size2 = arrayList2 != null ? arrayList2.size() : 0;
            u uVar2 = u.NUMBER_OF_COMPANIONS;
            JSONArray b3 = rVar == null ? null : rVar.b();
            w wVar3 = new w(gVar);
            wVar3.c = uVar2;
            wVar3.a = inneractiveAdRequest;
            wVar3.d = b3;
            JSONObject jSONObject4 = new JSONObject();
            Integer valueOf = Integer.valueOf(size + size2);
            try {
                jSONObject4.put("number_of_endcards", valueOf);
            } catch (Exception unused3) {
                IAlog.f("Got exception adding param to json object: %s, %s", "number_of_endcards", valueOf);
            }
            wVar3.f.put(jSONObject4);
            wVar3.a((String) null);
        }
        if (gVar.N != null) {
            i iVar = new i(gVar);
            if (iVar.size() > 0) {
                JSONObject jSONObject5 = new JSONObject();
                JSONArray jSONArray3 = new JSONArray();
                u uVar3 = u.OMID_VAST_DETECTION;
                JSONArray b4 = rVar == null ? null : rVar.b();
                w wVar4 = new w(gVar);
                wVar4.c = uVar3;
                wVar4.a = inneractiveAdRequest;
                wVar4.d = b4;
                Iterator it2 = iVar.iterator();
                while (it2.hasNext()) {
                    com.fyber.inneractive.sdk.measurement.h hVar2 = (com.fyber.inneractive.sdk.measurement.h) it2.next();
                    hVar2.getClass();
                    JSONObject jSONObject6 = new JSONObject();
                    try {
                        jSONObject6.put("success", String.valueOf(hVar2.b()));
                        if (!hVar2.b()) {
                            jSONObject6.put("error_reason", hVar2.a());
                        }
                    } catch (JSONException unused4) {
                        jSONObject6 = null;
                    }
                    if (jSONObject6 != null) {
                        jSONArray3.put(jSONObject6);
                    }
                }
                try {
                    jSONObject5.put("verifications", jSONArray3);
                } catch (Exception unused5) {
                    IAlog.f("Got exception adding param to json object: %s, %s", "verifications", jSONArray3);
                }
                wVar4.f.put(jSONObject5);
                wVar4.a((String) null);
            }
        }
        return inneractiveErrorCode;
        t tVar4 = tVar2;
        inneractiveErrorCode = inneractiveErrorCode2;
        tVar = tVar4;
        if (tVar != null) {
        }
        if (gVar.n != UnitDisplayType.NATIVE) {
        }
        if (gVar.N != null) {
        }
        return inneractiveErrorCode;
    }
}
