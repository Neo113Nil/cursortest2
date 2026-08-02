package com.inmobi.media;

import android.content.ContentValues;
import com.inmobi.media.core.config.models.TelemetryConfig;
import defpackage.a70;
import defpackage.fc6;
import defpackage.fsm;
import defpackage.h2d;
import defpackage.j2d;
import defpackage.joa;
import defpackage.lm5;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.sq3;
import defpackage.tub;
import defpackage.w1l;
import defpackage.xqm;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.yda;
import defpackage.ypa;
import defpackage.zzl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.vk, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3839vk implements Zf {
    public static final C3839vk a = new C3839vk();
    public static final h2d b = new j2d();
    public static final String c = "vk";
    public static final List d;
    public static final joa e;
    public static final AtomicBoolean f;
    public static C3773t6 g;
    public static volatile Ik h;
    public static final Function1 i;
    public static Ek j;

    static {
        ArrayList l = kotlin.collections.b.l("AdLoadCalled", "AdLoadDroppedAtSDK", "AdLoadSuccessful", "AdLoadFailed", "BannerSetBannerSizeUsed", "ServerFill", "ServerNoFill", "ServerError", "AssetDownloaded", "AdShowCalled", "AdShowSuccessful", "AdShowFailed", "AdGetSignalsCalled", "AdRequestPayloadCalled", "AdGetSignalsSucceeded", "AdGetSignalsFailed", "UnifiedIdNetworkCallRequested", "UnifiedIdNetworkResponseFailure", "FetchApiInvoked", "FetchCallbackFailure", "AdImpressionSuccessful", "RenderSuccess", "ParseSuccess", "PageStarted", "WebViewLoadFinished", "FireAdReady", "WebViewLoadCalled", "FireAdFailed", "ResourceCacheMiss", "ResourceCacheHit", "ResourceDiskCacheFileMissing", "ResourceDiskCacheFileEvicted", "LowAvailableSpaceForCache", "WebViewRenderProcessGoneEvent", "clickStartCalled", "landingsStartSuccess", "landingsStartFailed", "browserOpenFailed", "landingsPageStarted", "landingsCompleteSuccess", "landingsCompleteFailed", "ImmersiveNotSupported", "AdNotReady", "IAPFetchFailed", "BillingClientConnectionError", "BillingClientNotCompatible", "PingFailed", "PingStarted", "PingSuccess", "CompanionWebViewLoadCalled", "CompanionWebViewLoadFailed", "CompanionFireAdReady", "CompanionFireAdFailed", "CompanionWebViewPageStarted", "CompanionWebViewLoadFinished", "AttachedToWindow", "VideoLoadStarted", "VideoLoadSuccess", "VideoLoadFailure", "VideoStart", "VideoFirstQuartile", "VideoSecondQuartile", "VideoThirdQuartile", "VideoComplete", "VideoDestroyed", "HtmlUrlPrefetchStarted", "HtmlUrlPrefetchCompleted", "InAppBrowserLoaderShown", "InAppBrowserLoaderHidden");
        d = l;
        e = ypa.b(new xqm(7));
        f = new AtomicBoolean(false);
        C3813uk c3813uk = new C3813uk();
        i = new fsm(6);
        TelemetryConfig b2 = b();
        h = new Ik(new C3891xk(b2.getEnabled(), b2.getAssetReporting().isImageEnabled(), b2.getAssetReporting().isGifEnabled(), b2.getAssetReporting().isVideoEnabled(), b2.getDisableAllGeneralEvents(), b2.getPriorityEventsList(), b2.getSamplingFactor()), CollectionsKt.S0(l));
        AbstractC3435g4.a("telemetry", c3813uk);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(sq3 sq3Var) {
        C3761sk c3761sk;
        int i2;
        if (sq3Var instanceof C3761sk) {
            c3761sk = (C3761sk) sq3Var;
            int i3 = c3761sk.b;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c3761sk.b = i3 - Integer.MIN_VALUE;
                Object obj = c3761sk.a;
                lu3 lu3Var = lu3.a;
                i2 = c3761sk.b;
                if (i2 != 0) {
                    y6a.M(obj);
                    if (!f.getAndSet(true)) {
                        C3839vk c3839vk = a;
                        c3761sk.b = 1;
                        if (c3839vk.a((sq3) c3761sk) == lu3Var) {
                            return lu3Var;
                        }
                    }
                    return Unit.a;
                }
                if (i2 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                ((Kc) AbstractC3424fj.e.getValue()).a(new int[]{2, 1, 150, 152, 151}, i);
                j = new Ek(b());
                return Unit.a;
            }
        }
        c3761sk = new C3761sk(sq3Var);
        Object obj2 = c3761sk.a;
        lu3 lu3Var2 = lu3.a;
        i2 = c3761sk.b;
        if (i2 != 0) {
        }
        ((Kc) AbstractC3424fj.e.getValue()).a(new int[]{2, 1, 150, 152, 151}, i);
        j = new Ek(b());
        return Unit.a;
    }

    public static final Ck c() {
        return new Ck(AbstractC3750s9.b());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.inmobi.media.Zf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(rq3 rq3Var) {
        C3710qk c3710qk;
        int i2;
        ArrayList U0;
        lm5 lm5Var;
        String str;
        if (rq3Var instanceof C3710qk) {
            c3710qk = (C3710qk) rq3Var;
            int i3 = c3710qk.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c3710qk.c = i3 - Integer.MIN_VALUE;
                Object obj = c3710qk.a;
                lu3 lu3Var = lu3.a;
                i2 = c3710qk.c;
                if (i2 != 0) {
                    y6a.M(obj);
                    F5.a.getClass();
                    int a2 = F5.n() == 1 ? b().getWifiConfig().a() : b().getMobileConfig().a();
                    Ck ck = (Ck) e.getValue();
                    c3710qk.c = 1;
                    obj = ck.b(a2, c3710qk);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                U0 = CollectionsKt.U0((Collection) obj);
                lm5Var = lm5.a;
                lm5Var.getClass();
                if (!a("DatabaseMaxLimitReachedV2", lm5Var, EnumC3943zk.SDK) && Ak.a() > 0) {
                    Ak.a();
                    int a3 = Ak.a();
                    Dk dk = new Dk("DatabaseMaxLimitReachedV2", null, "sdk");
                    String jSONObject = new JSONObject(tub.f(new Pair("eventId", fc6.C()), new Pair("eventType", "DatabaseMaxLimitReachedV2"), new Pair("samplingRate", 100), new Pair("isTemplateEvent", Boolean.FALSE), new Pair("eventLostCount", Integer.valueOf(a3)))).toString();
                    jSONObject.getClass();
                    dk.b = jSONObject;
                    Ak.c = new Integer(dk.d);
                    U0.add(dk);
                }
                if (!U0.isEmpty()) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = U0.iterator();
                while (it.hasNext()) {
                    w1l.A(arrayList, ((Dk) it.next()).d);
                }
                try {
                    String str2 = AbstractC3424fj.c;
                    if (str2 == null) {
                        str2 = "";
                    }
                    LinkedHashMap i4 = tub.i(new Pair("im-accid", str2), new Pair("version", "4.0.0"), new Pair("mk-version", AbstractC3450gj.a()), new Pair("u-appbid", E1.a), new Pair("tp", AbstractC3450gj.b));
                    String str3 = AbstractC3450gj.a;
                    if (str3 != null) {
                        i4.put("tp-v", str3);
                    }
                    JSONObject jSONObject2 = new JSONObject(i4);
                    JSONArray jSONArray = new JSONArray();
                    Iterator it2 = U0.iterator();
                    while (it2.hasNext()) {
                        Dk dk2 = (Dk) it2.next();
                        String str4 = dk2.b;
                        if (str4 == null) {
                            str4 = "";
                        }
                        if (StringsKt.l0(str4).toString().length() > 0) {
                            String str5 = dk2.b;
                            if (str5 == null) {
                                str5 = "";
                            }
                            JSONObject jSONObject3 = new JSONObject(str5);
                            jSONObject3.put("dts", dk2.c);
                            jSONArray.put(jSONObject3);
                        }
                    }
                    jSONObject2.put("payload", jSONArray);
                    str = jSONObject2.toString();
                } catch (JSONException unused) {
                    str = null;
                }
                if (str != null) {
                    return new C3592m6(str, arrayList);
                }
                return null;
            }
        }
        c3710qk = new C3710qk(this, (sq3) rq3Var);
        Object obj2 = c3710qk.a;
        lu3 lu3Var2 = lu3.a;
        i2 = c3710qk.c;
        if (i2 != 0) {
        }
        U0 = CollectionsKt.U0((Collection) obj2);
        lm5Var = lm5.a;
        lm5Var.getClass();
        if (!a("DatabaseMaxLimitReachedV2", lm5Var, EnumC3943zk.SDK)) {
            Ak.a();
            int a32 = Ak.a();
            Dk dk3 = new Dk("DatabaseMaxLimitReachedV2", null, "sdk");
            String jSONObject4 = new JSONObject(tub.f(new Pair("eventId", fc6.C()), new Pair("eventType", "DatabaseMaxLimitReachedV2"), new Pair("samplingRate", 100), new Pair("isTemplateEvent", Boolean.FALSE), new Pair("eventLostCount", Integer.valueOf(a32)))).toString();
            jSONObject4.getClass();
            dk3.b = jSONObject4;
            Ak.c = new Integer(dk3.d);
            U0.add(dk3);
        }
        if (!U0.isEmpty()) {
        }
    }

    public static final void b(String str, Map map, EnumC3943zk enumC3943zk) {
        str.getClass();
        map.getClass();
        enumC3943zk.getClass();
        xw3.L(L9.c, null, null, new C3787tk(str, map, enumC3943zk, null), 3);
    }

    public static TelemetryConfig b() {
        return (TelemetryConfig) AbstractC3435g4.a.a(TelemetryConfig.class);
    }

    public static boolean a(String str, Map map, EnumC3943zk enumC3943zk) {
        Ik ik = h;
        if (ik != null) {
            enumC3943zk.getClass();
            map.getClass();
            str.getClass();
            boolean z = false;
            if (ik.a.a) {
                int ordinal = enumC3943zk.ordinal();
                if (ordinal == 0) {
                    z = ik.b.a(str, map);
                } else {
                    if (ordinal != 1) {
                        zzl.b();
                        return false;
                    }
                    z = true;
                }
            }
            return !z;
        }
        Intrinsics.i("mTelemetryValidator");
        throw null;
    }

    public static final Unit a(N2 n2) {
        n2.getClass();
        int i2 = n2.a;
        if (i2 != 1 && i2 != 2) {
            switch (i2) {
                case 150:
                    Ek ek = j;
                    if (ek != null) {
                        Map map = n2.c;
                        Object obj = map != null ? map.get("data") : null;
                        ek.a("CrashEventOccurred", obj instanceof C3307b5 ? (C3307b5) obj : null);
                        break;
                    }
                    break;
                case 151:
                    Ek ek2 = j;
                    if (ek2 != null) {
                        Map map2 = n2.c;
                        Object obj2 = map2 != null ? map2.get("data") : null;
                        C3869wo c3869wo = obj2 instanceof C3869wo ? (C3869wo) obj2 : null;
                        if (c3869wo != null && Hl.a(c3869wo)) {
                            F5.a.getClass();
                            if (!F5.t()) {
                                ek2.a("MainThreadBlockedEvent", c3869wo);
                                break;
                            }
                        }
                    }
                    break;
                case 152:
                    Ek ek3 = j;
                    if (ek3 != null) {
                        Map map3 = n2.c;
                        Object obj3 = map3 != null ? map3.get("data") : null;
                        ek3.a(obj3 instanceof D1 ? (D1) obj3 : null);
                        break;
                    }
                    break;
            }
        } else {
            f.set(false);
            C3773t6 c3773t6 = g;
            if (c3773t6 != null) {
                c3773t6.f.set(false);
                c3773t6.g.set(true);
                yda ydaVar = c3773t6.j;
                if (ydaVar != null) {
                    ydaVar.e(null);
                }
                c3773t6.j = null;
                c3773t6.i = null;
            }
            g = null;
            j = null;
            ((Kc) AbstractC3424fj.e.getValue()).a(i);
        }
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(sq3 sq3Var) {
        C3684pk c3684pk;
        Object obj;
        int i2;
        if (sq3Var instanceof C3684pk) {
            c3684pk = (C3684pk) sq3Var;
            int i3 = c3684pk.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c3684pk.c = i3 - Integer.MIN_VALUE;
                obj = c3684pk.a;
                lu3 lu3Var = lu3.a;
                i2 = c3684pk.c;
                if (i2 != 0) {
                    y6a.M(obj);
                    Ck ck = (Ck) e.getValue();
                    c3684pk.c = 1;
                    obj = ck.a(c3684pk);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                if (((Number) obj).intValue() > 0) {
                    a();
                }
                return Unit.a;
            }
        }
        c3684pk = new C3684pk(this, sq3Var);
        obj = c3684pk.a;
        lu3 lu3Var2 = lu3.a;
        i2 = c3684pk.c;
        if (i2 != 0) {
        }
        if (((Number) obj).intValue() > 0) {
        }
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e6, code lost:
    
        if (r7 == r9) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0087, code lost:
    
        if (r7.a(r8, (defpackage.sq3) r0) == r9) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Dk dk, sq3 sq3Var) {
        C3735rk c3735rk;
        lu3 lu3Var;
        int i2;
        int i3;
        Dk dk2;
        int intValue;
        String str;
        Object a2;
        if (sq3Var instanceof C3735rk) {
            c3735rk = (C3735rk) sq3Var;
            int i4 = c3735rk.e;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c3735rk.e = i4 - Integer.MIN_VALUE;
                Object obj = c3735rk.c;
                lu3Var = lu3.a;
                i2 = c3735rk.e;
                if (i2 != 0) {
                    y6a.M(obj);
                    int maxEventsToPersist = b().getMaxEventsToPersist();
                    Ck ck = (Ck) e.getValue();
                    c3735rk.a = dk;
                    c3735rk.b = maxEventsToPersist;
                    c3735rk.e = 1;
                    Object a3 = ck.a(c3735rk);
                    if (a3 != lu3Var) {
                        i3 = maxEventsToPersist;
                        obj = a3;
                        dk2 = dk;
                    }
                    return lu3Var;
                }
                if (i2 == 1) {
                    i3 = c3735rk.b;
                    dk2 = c3735rk.a;
                    y6a.M(obj);
                } else {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    intValue = c3735rk.b;
                    dk2 = c3735rk.a;
                    y6a.M(obj);
                    int a4 = Ak.a() + intValue;
                    if (a4 != -1) {
                        Ak.b = a4;
                        Qa qa = Ak.a;
                        if (qa != null) {
                            ConcurrentHashMap concurrentHashMap = Qa.b;
                            qa.a("count", a4, false);
                        }
                    }
                    Ck ck2 = (Ck) e.getValue();
                    c3735rk.a = null;
                    c3735rk.e = 3;
                    C3724r9 c3724r9 = ck2.b;
                    String str2 = ck2.a;
                    dk2.getClass();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("eventType", dk2.a);
                    str = dk2.b;
                    if (str == null) {
                        str = "";
                    }
                    contentValues.put("payload", str);
                    contentValues.put("eventSource", dk2.e);
                    contentValues.put("ts", String.valueOf(dk2.c));
                    a2 = c3724r9.a(str2, contentValues, 4, c3735rk);
                    if (a2 != lu3Var) {
                        a2 = Unit.a;
                    }
                }
                intValue = (((Number) obj).intValue() + 1) - i3;
                if (intValue > 0) {
                    Ck ck3 = (Ck) e.getValue();
                    c3735rk.a = dk2;
                    c3735rk.b = intValue;
                    c3735rk.e = 2;
                }
                Ck ck22 = (Ck) e.getValue();
                c3735rk.a = null;
                c3735rk.e = 3;
                C3724r9 c3724r92 = ck22.b;
                String str22 = ck22.a;
                dk2.getClass();
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("eventType", dk2.a);
                str = dk2.b;
                if (str == null) {
                }
                contentValues2.put("payload", str);
                contentValues2.put("eventSource", dk2.e);
                contentValues2.put("ts", String.valueOf(dk2.c));
                a2 = c3724r92.a(str22, contentValues2, 4, c3735rk);
                if (a2 != lu3Var) {
                }
            }
        }
        c3735rk = new C3735rk(this, sq3Var);
        Object obj2 = c3735rk.c;
        lu3Var = lu3.a;
        i2 = c3735rk.e;
        if (i2 != 0) {
        }
        intValue = (((Number) obj2).intValue() + 1) - i3;
        if (intValue > 0) {
        }
        Ck ck222 = (Ck) e.getValue();
        c3735rk.a = null;
        c3735rk.e = 3;
        C3724r9 c3724r922 = ck222.b;
        String str222 = ck222.a;
        dk2.getClass();
        ContentValues contentValues22 = new ContentValues();
        contentValues22.put("eventType", dk2.a);
        str = dk2.b;
        if (str == null) {
        }
        contentValues22.put("payload", str);
        contentValues22.put("eventSource", dk2.e);
        contentValues22.put("ts", String.valueOf(dk2.c));
        a2 = c3724r922.a(str222, contentValues22, 4, c3735rk);
        if (a2 != lu3Var) {
        }
    }

    public final void a() {
        if (f.get()) {
            C3540k6 eventConfig = b().getEventConfig();
            eventConfig.k = b().getTelemetryUrl();
            C3773t6 c3773t6 = g;
            if (c3773t6 == null) {
                C3773t6 c3773t62 = new C3773t6("telemetry", (Ck) e.getValue(), this, eventConfig, this);
                g = c3773t62;
                c3773t6 = c3773t62;
            } else {
                c3773t6.i = eventConfig;
            }
            if (c3773t6 != null) {
                c3773t6.a(true);
            }
        }
    }
}
