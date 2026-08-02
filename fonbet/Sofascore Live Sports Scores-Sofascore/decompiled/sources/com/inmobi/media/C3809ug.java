package com.inmobi.media;

import com.appsflyer.sdk_base.referrer.Payload;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.sofascore.model.newNetwork.FootballShotmapItem;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.core.network.model.HttpRequest;
import defpackage.a70;
import defpackage.fc6;
import defpackage.km5;
import defpackage.lu3;
import defpackage.sq3;
import defpackage.y6a;
import java.lang.ref.WeakReference;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.ug, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3809ug implements InterfaceC3835vg {
    public final InterfaceC3731rg a;
    public final Hi b;
    public final String c;
    public final AtomicBoolean d;

    public C3809ug(InterfaceC3731rg interfaceC3731rg, Hi hi) {
        this.a = interfaceC3731rg;
        this.b = hi;
        String C = fc6.C();
        this.c = C;
        this.d = new AtomicBoolean(false);
        N8 n8 = C3550kg.b;
        if (n8 != null) {
            C.getClass();
            n8.b.put(C, new WeakReference(this));
            Iterator it = n8.b.entrySet().iterator();
            while (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                if (((WeakReference) ((Map.Entry) next).getValue()).get() == null) {
                    it.remove();
                }
            }
        }
        C3876x5 c3876x5 = C3550kg.c;
        if (c3876x5 != null) {
            C.getClass();
            c3876x5.b.put(C, new WeakReference(this));
            Iterator it2 = c3876x5.b.entrySet().iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                next2.getClass();
                if (((WeakReference) ((Map.Entry) next2).getValue()).get() == null) {
                    it2.remove();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v8, types: [com.inmobi.media.hg] */
    public final List a(String str) {
        JSONArray jSONArray = new JSONArray(str);
        if (jSONArray.length() == 0) {
            a(this, (short) 2253);
            InterfaceC3731rg interfaceC3731rg = this.a;
            if (interfaceC3731rg != null) {
                EnumC3463h6[] enumC3463h6Arr = EnumC3463h6.a;
                ((C3785ti) interfaceC3731rg).a("", -105, "Ping array is empty", System.currentTimeMillis(), 0);
            }
            return km5.a;
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject == null) {
                a(this, (short) 2254);
            } else {
                String optString = optJSONObject.optString("id");
                if (optString == null || StringsKt.R(optString)) {
                    optString.getClass();
                    a(this, (short) 2255);
                    InterfaceC3731rg interfaceC3731rg2 = this.a;
                    if (interfaceC3731rg2 != null) {
                        EnumC3463h6[] enumC3463h6Arr2 = EnumC3463h6.a;
                        ((C3785ti) interfaceC3731rg2).a(optString, -101, "Ping ID is missing", System.currentTimeMillis(), 0);
                    }
                } else {
                    String optString2 = optJSONObject.optString("url");
                    if (a(optString, optString2)) {
                        JSONObject optJSONObject2 = optJSONObject.optJSONObject("headers");
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (optJSONObject2 != null) {
                            Iterator<String> keys = optJSONObject2.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                linkedHashMap.put(next, optJSONObject2.optString(next, ""));
                            }
                        }
                        boolean optBoolean = optJSONObject.optBoolean("allowRedirects", true);
                        String optString3 = optJSONObject.optString(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "normal");
                        boolean optBoolean2 = optJSONObject.optBoolean("ackRequired", false);
                        optString2.getClass();
                        String str2 = optString3 == null ? "normal" : optString3;
                        String str3 = this.c;
                        Hi hi = this.b;
                        r7 = new C3473hg(optString2, optString, linkedHashMap, optBoolean, str2, optBoolean2, 0, str3, System.currentTimeMillis(), null, hi != null ? hi.a : null);
                    }
                }
            }
            if (r7 != null) {
                arrayList.add(r7);
            }
        }
        return arrayList;
    }

    public final void b(String str) {
        Hi hi = this.b;
        if (hi != null) {
            str.getClass();
            Map a = hi.a();
            a.put("trigger", str);
            AbstractC3939zg.a("PingStarted", a);
        }
    }

    public static Object a(C3473hg c3473hg, C3783tg c3783tg) {
        Objects.toString(c3473hg);
        if (Intrinsics.c(c3473hg.e, FootballShotmapItem.GOAL_HIGH)) {
            N8 n8 = C3550kg.b;
            if (n8 != null) {
                Object b = n8.b(c3473hg, c3783tg);
                lu3 lu3Var = lu3.a;
                if (b != lu3Var) {
                    b = Unit.a;
                }
                return b == lu3Var ? b : Unit.a;
            }
        } else {
            C3876x5 c3876x5 = C3550kg.c;
            if (c3876x5 != null) {
                Object a = c3876x5.a(c3473hg, c3783tg);
                lu3 lu3Var2 = lu3.a;
                if (a != lu3Var2) {
                    a = Unit.a;
                }
                return a == lu3Var2 ? a : Unit.a;
            }
        }
        return Unit.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(2:10|11)(2:25|26))(2:27|28)|12|(3:15|(2:17|18)(1:20)|13)|21|22|23))|41|6|7|(0)(0)|12|(1:13)|21|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x002f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0081, code lost:
    
        a(r7, (short) 2243);
        r7 = r7.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0088, code lost:
    
        if (r7 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008a, code lost:
    
        r9 = com.inmobi.media.EnumC3463h6.a;
        ((com.inmobi.media.C3785ti) r7).a("", -104, "Ping JSON is invalid", java.lang.System.currentTimeMillis(), 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009d, code lost:
    
        r0.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x002c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0073, code lost:
    
        a(r7, (short) 2244);
        r0.getMessage();
        r7 = com.inmobi.media.AbstractC3286aa.a;
        com.inmobi.media.AbstractC3776t9.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0029, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0060, code lost:
    
        a(r7, (short) 2245);
        r0.getMessage();
        r7 = com.inmobi.media.AbstractC3286aa.a;
        com.inmobi.media.AbstractC3286aa.a(new com.inmobi.media.Q2(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004a A[Catch: NoClassDefFoundError -> 0x0029, Exception -> 0x002c, JSONException -> 0x002f, TRY_LEAVE, TryCatch #2 {JSONException -> 0x002f, Exception -> 0x002c, NoClassDefFoundError -> 0x0029, blocks: (B:11:0x0025, B:13:0x0044, B:15:0x004a, B:28:0x003c), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, sq3 sq3Var) {
        C3783tg c3783tg;
        int i;
        Iterator it;
        if (sq3Var instanceof C3783tg) {
            c3783tg = (C3783tg) sq3Var;
            int i2 = c3783tg.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c3783tg.d = i2 - Integer.MIN_VALUE;
                Object obj = c3783tg.b;
                lu3 lu3Var = lu3.a;
                i = c3783tg.d;
                if (i != 0) {
                    y6a.M(obj);
                    it = a(str).iterator();
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = c3783tg.a;
                    y6a.M(obj);
                }
                while (it.hasNext()) {
                    C3473hg c3473hg = (C3473hg) it.next();
                    b(c3473hg.e);
                    c3783tg.a = it;
                    c3783tg.d = 1;
                    if (a(c3473hg, c3783tg) == lu3Var) {
                        return lu3Var;
                    }
                }
                return Unit.a;
            }
        }
        c3783tg = new C3783tg(this, sq3Var);
        Object obj2 = c3783tg.b;
        lu3 lu3Var2 = lu3.a;
        i = c3783tg.d;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        return Unit.a;
    }

    public final boolean a(String str, String str2) {
        String host;
        if (str2 != null && !StringsKt.R(str2)) {
            try {
                URI uri = new URI(str2);
                if ((Intrinsics.c(uri.getScheme(), "http") || Intrinsics.c(uri.getScheme(), HttpRequest.DEFAULT_SCHEME)) && (host = uri.getHost()) != null) {
                    if (!StringsKt.R(host)) {
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
            a(this, (short) 2256);
            InterfaceC3731rg interfaceC3731rg = this.a;
            if (interfaceC3731rg != null) {
                EnumC3463h6[] enumC3463h6Arr = EnumC3463h6.a;
                ((C3785ti) interfaceC3731rg).a(str, -102, "Ping url is invalid", System.currentTimeMillis(), 0);
            }
            return false;
        }
        a(this, (short) 2252);
        InterfaceC3731rg interfaceC3731rg2 = this.a;
        if (interfaceC3731rg2 != null) {
            EnumC3463h6[] enumC3463h6Arr2 = EnumC3463h6.a;
            ((C3785ti) interfaceC3731rg2).a(str, -103, "Ping URL is missing", System.currentTimeMillis(), 0);
        }
        return false;
    }

    public final void a(C3473hg c3473hg, int i, long j) {
        c3473hg.getClass();
        if (this.d.get()) {
            return;
        }
        String str = c3473hg.a;
        if (FootballShotmapItem.GOAL_HIGH.equals(c3473hg.e) && c3473hg.f) {
            String str2 = c3473hg.b;
            InterfaceC3731rg interfaceC3731rg = this.a;
            if (interfaceC3731rg != null) {
                ((C3785ti) interfaceC3731rg).a(str2, i, null, j, c3473hg.g);
            }
        }
        String str3 = c3473hg.e;
        long currentTimeMillis = System.currentTimeMillis() - c3473hg.i;
        Hi hi = this.b;
        if (hi != null) {
            str3.getClass();
            Map a = hi.a();
            a.put("trigger", str3);
            a.put(Payload.LATENCY, Long.valueOf(currentTimeMillis));
            AbstractC3939zg.a("PingSuccess", a);
        }
    }

    public final void a(C3473hg c3473hg, int i, String str, int i2, long j) {
        int i3;
        c3473hg.getClass();
        if (this.d.get()) {
            return;
        }
        String str2 = c3473hg.a;
        if (FootballShotmapItem.GOAL_HIGH.equals(c3473hg.e) && c3473hg.f && (i3 = c3473hg.g) < 1) {
            String str3 = c3473hg.b;
            InterfaceC3731rg interfaceC3731rg = this.a;
            if (interfaceC3731rg != null) {
                ((C3785ti) interfaceC3731rg).a(str3, i, str, j, i3);
            }
        }
        String str4 = c3473hg.e;
        Hi hi = this.b;
        if (hi != null) {
            if (str4 == null) {
                str4 = "unknown";
            }
            Map a = hi.a();
            a.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2247);
            a.put("trigger", str4);
            a.put("retryCount", String.valueOf(i2));
            AbstractC3939zg.a("PingFailed", a);
        }
    }

    public static void a(C3809ug c3809ug, short s) {
        Hi hi = c3809ug.b;
        if (hi != null) {
            Map a = hi.a();
            a.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s));
            a.put("trigger", "unknown");
            a.put("retryCount", String.valueOf(0));
            AbstractC3939zg.a("PingFailed", a);
        }
    }
}
