package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Wl {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f13120a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f13121b;

    /* renamed from: c, reason: collision with root package name */
    public final Tl f13122c;

    /* renamed from: d, reason: collision with root package name */
    public List f13123d;

    /* renamed from: e, reason: collision with root package name */
    public HashMap f13124e;

    /* renamed from: f, reason: collision with root package name */
    public long f13125f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f13126g;

    /* renamed from: h, reason: collision with root package name */
    public long f13127h;

    /* renamed from: i, reason: collision with root package name */
    public final Ve f13128i;
    public final P j;

    /* renamed from: k, reason: collision with root package name */
    public final C3 f13129k;

    /* renamed from: l, reason: collision with root package name */
    public final C0598x6 f13130l;

    /* renamed from: m, reason: collision with root package name */
    public final T9 f13131m;

    /* renamed from: n, reason: collision with root package name */
    public final S9 f13132n;

    /* renamed from: o, reason: collision with root package name */
    public final po f13133o;

    public Wl(Context context, Ve ve2) {
        this(ve2, new P(), new C3(), C0040b4.l().a(context), new C0598x6(), new T9(), new S9(), new po());
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
    
        if (r8.f13126g != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean a(List list) {
        boolean z5;
        boolean z7;
        try {
            boolean a7 = a(CollectionsKt.H(list, AbstractC0084cm.f13542a));
            Iterator it = list.iterator();
            while (true) {
                z5 = false;
                if (!it.hasNext()) {
                    z7 = false;
                    break;
                }
                if (this.f13120a.contains((String) it.next())) {
                    z7 = true;
                    break;
                }
            }
            boolean z10 = AbstractC0084cm.f13543b.currentTimeSeconds() > this.f13127h;
            if (a7 && !z7 && !z10) {
            }
            z5 = true;
        } finally {
        }
        return z5;
    }

    public final void b(IdentifiersResult identifiersResult) {
        if (a(identifiersResult)) {
            return;
        }
        this.f13121b.put("appmetrica_clids", identifiersResult);
    }

    public final void c(IdentifiersResult identifiersResult) {
        if (identifiersResult != null) {
            po poVar = this.f13133o;
            String str = identifiersResult.f15009id;
            poVar.getClass();
            if (po.a(str)) {
                this.f13121b.put(StartupParamsCallback.APPMETRICA_UUID, identifiersResult);
            }
        }
    }

    public final synchronized boolean b() {
        return a(Arrays.asList("appmetrica_clids", StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, StartupParamsCallback.APPMETRICA_DEVICE_ID, "appmetrica_get_ad_url", "appmetrica_report_ad_url", StartupParamsCallback.APPMETRICA_UUID));
    }

    public final void c() {
        V9 v92;
        Ve d10 = this.f13128i.i((IdentifiersResult) this.f13121b.get(StartupParamsCallback.APPMETRICA_UUID)).e((IdentifiersResult) this.f13121b.get(StartupParamsCallback.APPMETRICA_DEVICE_ID)).d((IdentifiersResult) this.f13121b.get(StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH)).a((IdentifiersResult) this.f13121b.get("appmetrica_get_ad_url")).b((IdentifiersResult) this.f13121b.get("appmetrica_report_ad_url")).e(this.f13125f).h((IdentifiersResult) this.f13121b.get("appmetrica_clids")).j(Fm.a((Map) this.f13124e)).f((IdentifiersResult) this.f13121b.get("appmetrica_google_adv_id")).g((IdentifiersResult) this.f13121b.get("appmetrica_huawei_oaid")).j((IdentifiersResult) this.f13121b.get("appmetrica_yandex_adv_id")).b(this.f13126g).c(this.f13130l.f14911d).d(this.f13127h);
        T9 t92 = this.f13131m;
        synchronized (t92) {
            v92 = t92.f12915b;
        }
        d10.a(v92).b();
    }

    public Wl(Ve ve2, P p10, C3 c32, C0555vd c0555vd, C0598x6 c0598x6, T9 t92, S9 s92, po poVar) {
        HashSet hashSet = new HashSet();
        this.f13120a = hashSet;
        this.f13121b = new HashMap();
        this.f13122c = new Tl();
        hashSet.add("appmetrica_google_adv_id");
        hashSet.add("appmetrica_huawei_oaid");
        hashSet.add("appmetrica_yandex_adv_id");
        this.f13128i = ve2;
        this.j = p10;
        this.f13129k = c32;
        this.f13130l = c0598x6;
        this.f13131m = t92;
        this.f13132n = s92;
        this.f13133o = poVar;
        c(c0555vd.a());
        a(StartupParamsCallback.APPMETRICA_DEVICE_ID, ve2.j());
        a(StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, ve2.i());
        a("appmetrica_get_ad_url", ve2.d());
        a("appmetrica_report_ad_url", ve2.e());
        b(ve2.o());
        a("appmetrica_google_adv_id", ve2.l());
        a("appmetrica_huawei_oaid", ve2.m());
        a("appmetrica_yandex_adv_id", ve2.r());
        c0598x6.a(ve2.h());
        t92.a(ve2.k());
        this.f13123d = ve2.g();
        String i5 = ve2.i((String) null);
        this.f13124e = i5 != null ? Fm.a(i5) : null;
        this.f13126g = ve2.a(true);
        this.f13125f = ve2.b(0L);
        this.f13127h = ve2.n();
        c();
    }

    public final boolean a() {
        IdentifiersResult identifiersResult = (IdentifiersResult) this.f13121b.get("appmetrica_clids");
        if (!a(identifiersResult) && identifiersResult.f15009id.isEmpty()) {
            return lo.a((Map) this.f13124e);
        }
        return true;
    }

    public static boolean a(IdentifiersResult identifiersResult) {
        return identifiersResult == null || identifiersResult.f15009id == null;
    }

    public final void a(String str, IdentifiersResult identifiersResult) {
        if (identifiersResult == null || TextUtils.isEmpty(identifiersResult.f15009id)) {
            return;
        }
        this.f13121b.put(str, identifiersResult);
    }

    public final synchronized boolean a(Collection collection) {
        Boolean bool;
        String str;
        try {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                IdentifiersResult identifiersResult = (IdentifiersResult) this.f13121b.get(str2);
                if (identifiersResult == null) {
                    identifiersResult = (IdentifiersResult) this.f13130l.f14910c.get(str2);
                }
                if (identifiersResult == null) {
                    V9 v92 = this.f13131m.f12915b;
                    if (!Intrinsics.areEqual(str2, "appmetrica_lib_ssl_enabled") || (bool = v92.f13030a) == null) {
                        identifiersResult = null;
                    } else {
                        boolean booleanValue = bool.booleanValue();
                        IdentifierStatus identifierStatus = v92.f13031b;
                        String str3 = v92.f13032c;
                        if (booleanValue) {
                            str = "true";
                        } else if (!booleanValue) {
                            str = "false";
                        } else {
                            throw new gf.m();
                        }
                        identifiersResult = new IdentifiersResult(str, identifierStatus, str3);
                    }
                }
                if ("appmetrica_clids".equals(str2)) {
                    if (this.f13126g || a(identifiersResult) || (identifiersResult.f15009id.isEmpty() && !lo.a((Map) this.f13124e))) {
                        return false;
                    }
                } else if ("appmetrica_lib_ssl_enabled".equals(str2)) {
                    if (identifiersResult == null) {
                        return false;
                    }
                } else if (identifiersResult == null || TextUtils.isEmpty(identifiersResult.f15009id)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
