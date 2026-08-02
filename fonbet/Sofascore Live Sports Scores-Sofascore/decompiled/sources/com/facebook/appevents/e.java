package com.facebook.appevents;

import android.os.Bundle;
import com.facebook.internal.a0;
import com.facebook.w;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.f1;
import defpackage.cw3;
import defpackage.ex5;
import defpackage.f7a;
import defpackage.fx5;
import defpackage.i5k;
import defpackage.o2g;
import defpackage.sub;
import defpackage.tub;
import defpackage.xrf;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class e implements Serializable {
    public static final HashSet f = new HashSet();
    public final JSONObject a;
    public final JSONObject b;
    public final boolean c;
    public final boolean d;
    public final String e;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00f4, code lost:
    
        if (r11 != null) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e(String str, String str2, Double d, Bundle bundle, boolean z, boolean z2, UUID uuid, p pVar) {
        JSONObject jSONObject;
        String str3;
        str.getClass();
        str2.getClass();
        this.c = z;
        this.d = z2;
        this.e = str2;
        String str4 = null;
        if (pVar != null) {
            try {
                LinkedHashMap linkedHashMap = pVar.a;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(sub.c(linkedHashMap.size()));
                for (Object obj : linkedHashMap.entrySet()) {
                    ((q) ((Map.Entry) obj).getKey()).getClass();
                    linkedHashMap2.put("iap_parameters", ((Map.Entry) obj).getValue());
                }
                jSONObject = new JSONObject(tub.p(linkedHashMap2));
            } catch (Exception unused) {
                jSONObject = null;
            }
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
        } else {
            jSONObject = new JSONObject();
        }
        this.b = jSONObject;
        f1.u(str2);
        JSONObject jSONObject2 = new JSONObject();
        o2g o2gVar = o2g.a;
        Set set = cw3.a;
        if (!set.contains(o2g.class)) {
            try {
            } catch (Throwable th) {
                cw3.a(o2g.class, th);
            }
            if (o2g.b) {
                o2g o2gVar2 = o2g.a;
                boolean z3 = false;
                if (!set.contains(o2gVar2)) {
                    try {
                        z3 = o2g.d.contains(str2);
                    } catch (Throwable th2) {
                        cw3.a(o2gVar2, th2);
                    }
                }
                if (z3) {
                    str3 = "_removed_";
                    if (Intrinsics.c(str3, str2)) {
                        xrf xrfVar = xrf.a;
                        Set set2 = cw3.a;
                        if (!set2.contains(xrf.class)) {
                            try {
                                if (xrf.b) {
                                    xrf xrfVar2 = xrf.a;
                                    if (!set2.contains(xrfVar2)) {
                                        try {
                                            Iterator it = xrf.c.keySet().iterator();
                                            while (true) {
                                                if (!it.hasNext()) {
                                                    break;
                                                }
                                                String str5 = (String) it.next();
                                                HashSet hashSet = (HashSet) xrf.c.get(str5);
                                                if (hashSet != null && hashSet.contains(str2)) {
                                                    str4 = str5;
                                                    break;
                                                }
                                            }
                                        } catch (Throwable th3) {
                                            cw3.a(xrfVar2, th3);
                                        }
                                    }
                                }
                            } catch (Throwable th4) {
                                cw3.a(xrf.class, th4);
                            }
                            str3 = str2;
                        }
                        str2 = str4;
                        str3 = str2;
                    }
                    jSONObject2.put("_eventName", str3);
                    jSONObject2.put("_logTime", System.currentTimeMillis() / 1000);
                    jSONObject2.put("_ui", str);
                    if (uuid != null) {
                        jSONObject2.put("_session_id", uuid);
                    }
                    if (bundle != null) {
                        String str6 = this.e;
                        HashMap hashMap = new HashMap();
                        for (String str7 : bundle.keySet()) {
                            str7.getClass();
                            f1.u(str7);
                            Object obj2 = bundle.get(str7);
                            if (!(obj2 instanceof String) && !(obj2 instanceof Number)) {
                                throw new com.facebook.q(String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", Arrays.copyOf(new Object[]{obj2, str7}, 2)));
                            }
                            hashMap.put(str7, obj2.toString());
                        }
                        if (!cw3.a.contains(f7a.class)) {
                            try {
                                if (f7a.c && !hashMap.isEmpty()) {
                                    try {
                                        List<String> S0 = CollectionsKt.S0(hashMap.keySet());
                                        JSONObject jSONObject3 = new JSONObject();
                                        for (String str8 : S0) {
                                            Object obj3 = hashMap.get(str8);
                                            if (obj3 == null) {
                                                throw new IllegalStateException("Required value was null.");
                                            }
                                            String str9 = (String) obj3;
                                            f7a f7aVar = f7a.b;
                                            if (!f7aVar.u(str8) && !f7aVar.u(str9)) {
                                            }
                                            hashMap.remove(str8);
                                            if (!f7a.d) {
                                                str9 = "";
                                            }
                                            jSONObject3.put(str8, str9);
                                        }
                                        if (jSONObject3.length() != 0) {
                                            String jSONObject4 = jSONObject3.toString();
                                            jSONObject4.getClass();
                                            hashMap.put("_onDeviceParams", jSONObject4);
                                        }
                                    } catch (Exception unused2) {
                                    }
                                }
                            } catch (Throwable th5) {
                                cw3.a(f7a.class, th5);
                            }
                        }
                        Map c = i5k.c(hashMap);
                        o2g o2gVar3 = o2g.a;
                        if (!cw3.a.contains(o2g.class)) {
                            try {
                                c.getClass();
                                str6.getClass();
                                if (o2g.b) {
                                    HashMap hashMap2 = new HashMap();
                                    Iterator it2 = new ArrayList(c.keySet()).iterator();
                                    while (it2.hasNext()) {
                                        String str10 = (String) it2.next();
                                        String a = o2g.a.a(str6, str10);
                                        if (a != null) {
                                            hashMap2.put(str10, a);
                                            c.remove(str10);
                                        }
                                    }
                                    if (!hashMap2.isEmpty()) {
                                        try {
                                            JSONObject jSONObject5 = new JSONObject();
                                            for (Map.Entry entry : hashMap2.entrySet()) {
                                                jSONObject5.put((String) entry.getKey(), (String) entry.getValue());
                                            }
                                            c.put("_restrictedParams", jSONObject5.toString());
                                        } catch (JSONException unused3) {
                                        }
                                    }
                                }
                            } catch (Throwable th6) {
                                cw3.a(o2g.class, th6);
                            }
                        }
                        Map c2 = i5k.c(hashMap);
                        fx5 fx5Var = fx5.a;
                        if (!cw3.a.contains(fx5.class)) {
                            try {
                                c2.getClass();
                                str6.getClass();
                                if (fx5.b) {
                                    ArrayList arrayList = new ArrayList(c2.keySet());
                                    Iterator it3 = new ArrayList(fx5.c).iterator();
                                    while (it3.hasNext()) {
                                        ex5 ex5Var = (ex5) it3.next();
                                        if (Intrinsics.c(ex5Var.a, str6)) {
                                            Iterator it4 = arrayList.iterator();
                                            while (it4.hasNext()) {
                                                String str11 = (String) it4.next();
                                                if (ex5Var.b.contains(str11)) {
                                                    c2.remove(str11);
                                                }
                                            }
                                        }
                                    }
                                }
                            } catch (Throwable th7) {
                                cw3.a(fx5.class, th7);
                            }
                        }
                        for (String str12 : hashMap.keySet()) {
                            jSONObject2.put(str12, hashMap.get(str12));
                        }
                    }
                    if (d != null) {
                        jSONObject2.put("_valueToSum", d.doubleValue());
                    }
                    if (this.d) {
                        jSONObject2.put("_inBackground", "1");
                    }
                    if (this.c) {
                        jSONObject2.put("_implicitlyLogged", "1");
                    } else {
                        com.facebook.b bVar = a0.a;
                        jSONObject2.toString().getClass();
                        synchronized (w.b) {
                        }
                    }
                    this.a = jSONObject2;
                }
            }
            str3 = str2;
            if (Intrinsics.c(str3, str2)) {
            }
            jSONObject2.put("_eventName", str3);
            jSONObject2.put("_logTime", System.currentTimeMillis() / 1000);
            jSONObject2.put("_ui", str);
            if (uuid != null) {
            }
            if (bundle != null) {
            }
            if (d != null) {
            }
            if (this.d) {
            }
            if (this.c) {
            }
            this.a = jSONObject2;
        }
        str3 = null;
        if (Intrinsics.c(str3, str2)) {
        }
        jSONObject2.put("_eventName", str3);
        jSONObject2.put("_logTime", System.currentTimeMillis() / 1000);
        jSONObject2.put("_ui", str);
        if (uuid != null) {
        }
        if (bundle != null) {
        }
        if (d != null) {
        }
        if (this.d) {
        }
        if (this.c) {
        }
        this.a = jSONObject2;
    }

    private final Object writeReplace() throws ObjectStreamException {
        String jSONObject = this.a.toString();
        jSONObject.getClass();
        String jSONObject2 = this.b.toString();
        jSONObject2.getClass();
        return new d(jSONObject, jSONObject2, this.c, this.d);
    }

    public final String toString() {
        JSONObject jSONObject = this.a;
        return String.format("\"%s\", implicit: %b, json: %s", Arrays.copyOf(new Object[]{jSONObject.optString("_eventName"), Boolean.valueOf(this.c), jSONObject.toString()}, 3));
    }

    public e(String str, String str2, boolean z, boolean z2) {
        JSONObject jSONObject = new JSONObject(str);
        this.a = jSONObject;
        this.b = new JSONObject(str2);
        this.c = z;
        String optString = jSONObject.optString("_eventName");
        optString.getClass();
        this.e = optString;
        this.d = z2;
    }
}
