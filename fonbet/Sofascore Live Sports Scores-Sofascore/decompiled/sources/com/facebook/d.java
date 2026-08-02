package com.facebook;

import defpackage.cw3;
import defpackage.yz1;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements z {
    public final /* synthetic */ int a;
    public final /* synthetic */ Serializable b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ d(Serializable serializable, Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = serializable;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // com.facebook.z
    public final void a(g0 g0Var) {
        JSONArray optJSONArray;
        int i = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Serializable serializable = this.b;
        switch (i) {
            case 0:
                AtomicBoolean atomicBoolean = (AtomicBoolean) serializable;
                HashSet hashSet = (HashSet) obj3;
                HashSet hashSet2 = (HashSet) obj2;
                HashSet hashSet3 = (HashSet) obj;
                g0Var.getClass();
                JSONObject jSONObject = g0Var.d;
                if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray("data")) != null) {
                    atomicBoolean.set(true);
                    int length = optJSONArray.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                        if (optJSONObject != null) {
                            String optString = optJSONObject.optString("permission");
                            String optString2 = optJSONObject.optString("status");
                            if (!com.facebook.internal.k0.A(optString) && !com.facebook.internal.k0.A(optString2)) {
                                optString2.getClass();
                                Locale locale = Locale.US;
                                String k = com.appsflyer.internal.i.k(locale, optString2, locale);
                                int hashCode = k.hashCode();
                                if (hashCode != -1309235419) {
                                    if (hashCode != 280295099) {
                                        if (hashCode == 568196142 && k.equals("declined")) {
                                            hashSet2.add(optString);
                                        }
                                    } else if (k.equals("granted")) {
                                        hashSet.add(optString);
                                    }
                                } else if (k.equals("expired")) {
                                    hashSet3.add(optString);
                                }
                            }
                        }
                    }
                    break;
                }
                break;
            default:
                com.facebook.appevents.b bVar = (com.facebook.appevents.b) serializable;
                d0 d0Var = (d0) obj3;
                com.facebook.appevents.t tVar = (com.facebook.appevents.t) obj2;
                yz1 yz1Var = (yz1) obj;
                if (!cw3.a.contains(com.facebook.appevents.i.class)) {
                    try {
                        g0Var.getClass();
                        com.facebook.appevents.i.e(bVar, d0Var, g0Var, tVar, yz1Var);
                        break;
                    } catch (Throwable th) {
                        cw3.a(com.facebook.appevents.i.class, th);
                    }
                }
                break;
        }
    }
}
