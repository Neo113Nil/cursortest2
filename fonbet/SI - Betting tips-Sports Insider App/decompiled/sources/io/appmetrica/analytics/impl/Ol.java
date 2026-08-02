package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.AdvIdentifiersResult;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.internal.IdentifiersResult;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Ol implements Pl {

    /* renamed from: k, reason: collision with root package name */
    public static final Map f12704k = DesugarCollections.unmodifiableMap(new Ll());

    /* renamed from: a, reason: collision with root package name */
    public final List f12705a;

    /* renamed from: b, reason: collision with root package name */
    public final C0585wi f12706b;

    /* renamed from: c, reason: collision with root package name */
    public final Wl f12707c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f12708d;

    /* renamed from: e, reason: collision with root package name */
    public PublicLogger f12709e;

    /* renamed from: f, reason: collision with root package name */
    public final Ml f12710f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f12711g;

    /* renamed from: h, reason: collision with root package name */
    public final WeakHashMap f12712h;

    /* renamed from: i, reason: collision with root package name */
    public HashMap f12713i;
    public boolean j;

    public Ol(@NonNull Context context, C0585wi c0585wi, Ve ve2, @NonNull Handler handler) {
        this(c0585wi, new Wl(context, ve2), handler);
    }

    public final void a(@NonNull StartupParamsCallback startupParamsCallback, @NonNull List<String> list, Map<String, String> map) {
        synchronized (this.f12711g) {
            try {
                Wl wl = this.f12707c;
                wl.getClass();
                if (!lo.a((Map) map) && !lo.a(map, wl.f13124e)) {
                    wl.f13124e = new HashMap(map);
                    wl.f13126g = true;
                    wl.c();
                }
                a(startupParamsCallback, list);
                if (this.f12707c.a((List) list)) {
                    a(list, new Nl(this, startupParamsCallback), map, true);
                } else {
                    a(new Bundle(), startupParamsCallback);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00b4 A[Catch: all -> 0x007f, TryCatch #0 {all -> 0x007f, blocks: (B:4:0x0063, B:6:0x0071, B:9:0x0085, B:11:0x00b4, B:12:0x00bb, B:14:0x00c1, B:15:0x00c8, B:17:0x00dd, B:19:0x00e8, B:20:0x00f4, B:26:0x00e2, B:27:0x0082), top: B:3:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00c1 A[Catch: all -> 0x007f, TryCatch #0 {all -> 0x007f, blocks: (B:4:0x0063, B:6:0x0071, B:9:0x0085, B:11:0x00b4, B:12:0x00bb, B:14:0x00c1, B:15:0x00c8, B:17:0x00dd, B:19:0x00e8, B:20:0x00f4, B:26:0x00e2, B:27:0x0082), top: B:3:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00dd A[Catch: all -> 0x007f, TryCatch #0 {all -> 0x007f, blocks: (B:4:0x0063, B:6:0x0071, B:9:0x0085, B:11:0x00b4, B:12:0x00bb, B:14:0x00c1, B:15:0x00c8, B:17:0x00dd, B:19:0x00e8, B:20:0x00f4, B:26:0x00e2, B:27:0x0082), top: B:3:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e8 A[Catch: all -> 0x007f, TryCatch #0 {all -> 0x007f, blocks: (B:4:0x0063, B:6:0x0071, B:9:0x0085, B:11:0x00b4, B:12:0x00bb, B:14:0x00c1, B:15:0x00c8, B:17:0x00dd, B:19:0x00e8, B:20:0x00f4, B:26:0x00e2, B:27:0x0082), top: B:3:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e2 A[Catch: all -> 0x007f, TryCatch #0 {all -> 0x007f, blocks: (B:4:0x0063, B:6:0x0071, B:9:0x0085, B:11:0x00b4, B:12:0x00bb, B:14:0x00c1, B:15:0x00c8, B:17:0x00dd, B:19:0x00e8, B:20:0x00f4, B:26:0x00e2, B:27:0x0082), top: B:3:0x0063 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Bundle bundle) {
        HashMap hashMap;
        HashMap a7;
        IdentifiersResult a10 = S3.a(bundle, "Uuid");
        IdentifiersResult a11 = S3.a(bundle, "DeviceId");
        IdentifiersResult a12 = S3.a(bundle, "DeviceIdHash");
        IdentifiersResult a13 = S3.a(bundle, "AdUrlReport");
        IdentifiersResult a14 = S3.a(bundle, "AdUrlGet");
        IdentifiersResult a15 = S3.a(bundle, "Clids");
        IdentifiersResult a16 = S3.a(bundle, "RequestClids");
        IdentifiersResult a17 = S3.a(bundle, "GAID");
        IdentifiersResult a18 = S3.a(bundle, "HOAID");
        IdentifiersResult a19 = S3.a(bundle, "YANDEX_ADV_ID");
        IdentifiersResult a20 = S3.a(bundle, "CUSTOM_SDK_HOSTS");
        long j = bundle.getLong("ServerTimeOffset");
        long j6 = bundle.getLong("NextStartupTime");
        V9 a21 = S3.a(bundle);
        Bundle bundle2 = bundle.getBundle("module_configs");
        Wl wl = this.f12707c;
        synchronized (wl) {
            try {
                IdentifiersResult identifiersResult = (IdentifiersResult) wl.f13121b.get(StartupParamsCallback.APPMETRICA_UUID);
                if (identifiersResult != null) {
                    po poVar = wl.f13133o;
                    String str = identifiersResult.f15009id;
                    poVar.getClass();
                    if (po.a(str)) {
                        wl.a(StartupParamsCallback.APPMETRICA_DEVICE_ID, a11);
                        wl.a(StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, a12);
                        wl.f13121b.put("appmetrica_google_adv_id", a17);
                        wl.f13121b.put("appmetrica_huawei_oaid", a18);
                        wl.f13121b.put("appmetrica_yandex_adv_id", a19);
                        wl.f13130l.a(a20);
                        wl.f13131m.a(a21);
                        if (!Wl.a(a14)) {
                            wl.f13121b.put("appmetrica_get_ad_url", a14);
                        }
                        if (!Wl.a(a13)) {
                            wl.f13121b.put("appmetrica_report_ad_url", a13);
                        }
                        wl.f13125f = j;
                        C3 c32 = wl.f13129k;
                        hashMap = wl.f13124e;
                        a7 = AbstractC0176gb.a(a16.f15009id);
                        c32.getClass();
                        if (!lo.a((Map) hashMap) ? lo.a((Map) a7) : hashMap.equals(a7)) {
                            wl.f13121b.put("appmetrica_clids", a15);
                            wl.f13126g = false;
                        }
                        wl.f13127h = j6;
                        wl.c();
                    }
                }
                wl.c(a10);
                wl.a(StartupParamsCallback.APPMETRICA_DEVICE_ID, a11);
                wl.a(StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, a12);
                wl.f13121b.put("appmetrica_google_adv_id", a17);
                wl.f13121b.put("appmetrica_huawei_oaid", a18);
                wl.f13121b.put("appmetrica_yandex_adv_id", a19);
                wl.f13130l.a(a20);
                wl.f13131m.a(a21);
                if (!Wl.a(a14)) {
                }
                if (!Wl.a(a13)) {
                }
                wl.f13125f = j;
                C3 c322 = wl.f13129k;
                hashMap = wl.f13124e;
                a7 = AbstractC0176gb.a(a16.f15009id);
                c322.getClass();
                if (!lo.a((Map) hashMap) ? lo.a((Map) a7) : hashMap.equals(a7)) {
                }
                wl.f13127h = j6;
                wl.c();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        C0040b4.l().m().a(bundle2, new SdkIdentifiers(a10.f15009id, a11.f15009id, a12.f15009id));
        h();
    }

    @NonNull
    public final A6 c() {
        return this.f12710f;
    }

    public final String d() {
        IdentifiersResult identifiersResult = (IdentifiersResult) this.f12707c.f13121b.get(StartupParamsCallback.APPMETRICA_DEVICE_ID);
        if (identifiersResult == null) {
            return null;
        }
        return identifiersResult.f15009id;
    }

    @NonNull
    public final X9 e() {
        V9 v92;
        Wl wl = this.f12707c;
        S9 s92 = wl.f13132n;
        T9 t92 = wl.f13131m;
        synchronized (t92) {
            v92 = t92.f12915b;
        }
        s92.getClass();
        Boolean bool = v92.f13030a;
        return new X9();
    }

    public final long f() {
        return this.f12707c.f13125f;
    }

    public final String g() {
        IdentifiersResult identifiersResult = (IdentifiersResult) this.f12707c.f13121b.get(StartupParamsCallback.APPMETRICA_UUID);
        if (identifiersResult == null) {
            return null;
        }
        return identifiersResult.f15009id;
    }

    public final void h() {
        WeakHashMap weakHashMap = new WeakHashMap();
        for (Map.Entry entry : this.f12712h.entrySet()) {
            List list = (List) entry.getValue();
            if (this.f12707c.a((Collection) list)) {
                weakHashMap.put((StartupParamsCallback) entry.getKey(), list);
            }
        }
        Iterator it = weakHashMap.entrySet().iterator();
        while (it.hasNext()) {
            StartupParamsCallback startupParamsCallback = (StartupParamsCallback) ((Map.Entry) it.next()).getKey();
            if (startupParamsCallback != null) {
                a(new Bundle(), startupParamsCallback);
            }
        }
        weakHashMap.clear();
    }

    public final void i() {
        synchronized (this.f12711g) {
            try {
                if (this.j) {
                    if (this.f12707c.b()) {
                    }
                }
                this.j = true;
                a(this.f12705a, this.f12710f, this.f12713i, false);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public Ol(C0585wi c0585wi, Wl wl, Handler handler) {
        this.f12705a = Arrays.asList(StartupParamsCallback.APPMETRICA_UUID, StartupParamsCallback.APPMETRICA_DEVICE_ID, StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, "appmetrica_get_ad_url", "appmetrica_report_ad_url", "appmetrica_clids");
        this.f12711g = new Object();
        this.f12712h = new WeakHashMap();
        this.j = false;
        this.f12706b = c0585wi;
        this.f12707c = wl;
        this.f12708d = handler;
        this.f12710f = new Ml(this);
    }

    public final void a(@NonNull Bundle bundle) {
        b(bundle, null);
    }

    public final void a(@NonNull PublicLogger publicLogger) {
        this.f12709e = publicLogger;
    }

    public final void a(List list, A6 a62, Map map, boolean z5) {
        B6 b62 = new B6(this.f12708d, a62);
        C0585wi c0585wi = this.f12706b;
        c0585wi.getClass();
        Bundle bundle = new Bundle();
        bundle.putParcelable("io.appmetrica.analytics.impl.IdentifiersData", new Xa(b62, list, map, z5));
        EnumC0047bb enumC0047bb = EnumC0047bb.EVENT_TYPE_UNDEFINED;
        PublicLogger anonymousInstance = PublicLogger.getAnonymousInstance();
        Set set = AbstractC0576w9.f14825a;
        M3 m32 = new M3("", "", 1536, 0, anonymousInstance);
        m32.f12738m = bundle;
        F4 f42 = c0585wi.f14844a;
        c0585wi.a(C0585wi.a(m32, f42), f42, 1, (Map) null);
    }

    public final void a(Map<String, String> map) {
        if (lo.a((Map) map)) {
            return;
        }
        synchronized (this.f12711g) {
            try {
                HashMap b10 = Fm.b(map);
                this.f12713i = b10;
                this.f12706b.a(b10);
                Wl wl = this.f12707c;
                wl.getClass();
                if (!lo.a((Map) b10) && !lo.a(b10, wl.f13124e)) {
                    wl.f13124e = new HashMap(b10);
                    wl.f13126g = true;
                    wl.c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a(String str) {
        synchronized (this.f12711g) {
            this.f12706b.a(str);
        }
    }

    public final void a(Bundle bundle, StartupParamsCallback startupParamsCallback) {
        Jl jl;
        if (this.f12712h.containsKey(startupParamsCallback)) {
            List list = (List) this.f12712h.get(startupParamsCallback);
            if (this.f12707c.a((Collection) list)) {
                startupParamsCallback.onReceive(a(list));
            } else {
                StartupParamsCallback.Reason reason = null;
                if (bundle.containsKey("startup_error_key_code")) {
                    int i5 = bundle.getInt("startup_error_key_code");
                    jl = Jl.UNKNOWN;
                    if (i5 == 1) {
                        jl = Jl.NETWORK;
                    } else if (i5 == 2) {
                        jl = Jl.PARSE;
                    }
                } else {
                    jl = null;
                }
                if (jl == null) {
                    if (!this.f12707c.a()) {
                        PublicLogger publicLogger = this.f12709e;
                        if (publicLogger != null) {
                            publicLogger.warning("Clids error. Passed clids: %s, and clids from server are empty.", this.f12713i);
                        }
                        reason = new StartupParamsCallback.Reason("INCONSISTENT_CLIDS");
                    } else {
                        jl = Jl.UNKNOWN;
                    }
                }
                if (reason == null) {
                    reason = (StartupParamsCallback.Reason) CollectionUtils.getOrDefault(f12704k, jl, StartupParamsCallback.Reason.UNKNOWN);
                }
                startupParamsCallback.onRequestError(reason, a(list));
            }
            this.f12712h.remove(startupParamsCallback);
            if (this.f12712h.isEmpty()) {
                C0393p0 c0393p0 = this.f12706b.f14847d;
                synchronized (c0393p0.f14443f) {
                    c0393p0.f14440c = false;
                    c0393p0.c();
                }
            }
        }
    }

    public final void b(@NonNull Bundle bundle, StartupParamsCallback startupParamsCallback) {
        synchronized (this.f12711g) {
            try {
                b(bundle);
                h();
                if (startupParamsCallback != null) {
                    a(bundle, startupParamsCallback);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(List<String> list) {
        synchronized (this.f12711g) {
            try {
                List list2 = this.f12707c.f13123d;
                if (lo.a((Collection) list)) {
                    if (!lo.a((Collection) list2)) {
                        Wl wl = this.f12707c;
                        wl.f13123d = null;
                        wl.f13128i.a((List<String>) null);
                        this.f12706b.a((List) null);
                    }
                } else if (!lo.a(list, list2)) {
                    Wl wl2 = this.f12707c;
                    wl2.f13123d = list;
                    wl2.f13128i.a(list);
                    this.f12706b.a(list);
                } else {
                    this.f12706b.a(list2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final StartupParamsCallback.Result a(List list) {
        HashMap hashMap = new HashMap();
        Wl wl = this.f12707c;
        synchronized (wl) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    IdentifiersResult identifiersResult = (IdentifiersResult) wl.f13121b.get(str);
                    if (identifiersResult != null) {
                        hashMap.put(str, wl.f13122c.a(identifiersResult));
                    }
                }
                wl.f13130l.a(list, hashMap);
                wl.f13131m.a(list, hashMap);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return new StartupParamsCallback.Result(hashMap);
    }

    public final void b(String str) {
        synchronized (this.f12711g) {
            this.f12706b.b(str);
        }
    }

    public final Map<String, String> b() {
        IdentifiersResult identifiersResult = (IdentifiersResult) this.f12707c.f13121b.get("appmetrica_clids");
        String str = identifiersResult == null ? null : identifiersResult.f15009id;
        if (!TextUtils.isEmpty(str)) {
            return AbstractC0176gb.a(str);
        }
        return this.f12713i;
    }

    public final void a(StartupParamsCallback startupParamsCallback, List list) {
        if (this.f12712h.isEmpty()) {
            C0393p0 c0393p0 = this.f12706b.f14847d;
            synchronized (c0393p0.f14443f) {
                c0393p0.f14440c = true;
                c0393p0.b();
            }
        }
        this.f12712h.put(startupParamsCallback, list);
    }

    @NonNull
    public final AdvIdentifiersResult a() {
        Wl wl = this.f12707c;
        P p10 = wl.j;
        IdentifiersResult identifiersResult = (IdentifiersResult) wl.f13121b.get("appmetrica_google_adv_id");
        IdentifiersResult identifiersResult2 = (IdentifiersResult) wl.f13121b.get("appmetrica_huawei_oaid");
        IdentifiersResult identifiersResult3 = (IdentifiersResult) wl.f13121b.get("appmetrica_yandex_adv_id");
        p10.getClass();
        return new AdvIdentifiersResult(P.a(identifiersResult), P.a(identifiersResult2), P.a(identifiersResult3));
    }
}
