package io.sentry;

import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j3 implements c2 {
    public final Map A;
    public ConcurrentHashMap C;

    /* renamed from: a, reason: collision with root package name */
    public final File f16539a;

    /* renamed from: b, reason: collision with root package name */
    public final Callable f16540b;

    /* renamed from: c, reason: collision with root package name */
    public int f16541c;

    /* renamed from: e, reason: collision with root package name */
    public String f16543e;

    /* renamed from: f, reason: collision with root package name */
    public String f16544f;

    /* renamed from: g, reason: collision with root package name */
    public String f16545g;

    /* renamed from: h, reason: collision with root package name */
    public String f16546h;

    /* renamed from: i, reason: collision with root package name */
    public String f16547i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public String f16548k;

    /* renamed from: m, reason: collision with root package name */
    public String f16550m;

    /* renamed from: n, reason: collision with root package name */
    public String f16551n;

    /* renamed from: o, reason: collision with root package name */
    public String f16552o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f16553p;
    public String q;

    /* renamed from: r, reason: collision with root package name */
    public String f16554r;

    /* renamed from: s, reason: collision with root package name */
    public String f16555s;

    /* renamed from: t, reason: collision with root package name */
    public String f16556t;

    /* renamed from: u, reason: collision with root package name */
    public String f16557u;

    /* renamed from: v, reason: collision with root package name */
    public String f16558v;

    /* renamed from: w, reason: collision with root package name */
    public String f16559w;

    /* renamed from: x, reason: collision with root package name */
    public String f16560x;

    /* renamed from: y, reason: collision with root package name */
    public String f16561y;

    /* renamed from: z, reason: collision with root package name */
    public Date f16562z;

    /* renamed from: l, reason: collision with root package name */
    public List f16549l = new ArrayList();
    public String B = null;

    /* renamed from: d, reason: collision with root package name */
    public String f16542d = Locale.getDefault().toString();

    public j3(File file, Date date, ArrayList arrayList, String str, String str2, String str3, String str4, int i5, String str5, Callable callable, String str6, String str7, String str8, Boolean bool, String str9, String str10, String str11, String str12, String str13, Map map) {
        this.f16539a = file;
        this.f16562z = date;
        this.f16548k = str5;
        this.f16540b = callable;
        this.f16541c = i5;
        this.f16543e = str6 == null ? "" : str6;
        this.f16544f = str7 == null ? "" : str7;
        this.f16547i = str8 != null ? str8 : "";
        this.j = bool != null ? bool.booleanValue() : false;
        this.f16550m = str9 != null ? str9 : CommonUrlParts.Values.FALSE_INTEGER;
        this.f16545g = "";
        this.f16546h = ConstantDeviceInfo.APP_PLATFORM;
        this.f16551n = ConstantDeviceInfo.APP_PLATFORM;
        this.f16552o = str10 != null ? str10 : "";
        this.f16553p = arrayList;
        this.q = str.isEmpty() ? "unknown" : str;
        this.f16554r = str4;
        this.f16555s = "";
        this.f16556t = str11 != null ? str11 : "";
        this.f16557u = str2;
        this.f16558v = str3;
        this.f16559w = io.sentry.config.a.n();
        this.f16560x = str12 != null ? str12 : "production";
        this.f16561y = str13;
        if (!str13.equals("normal") && !this.f16561y.equals("timeout") && !this.f16561y.equals("backgrounded")) {
            this.f16561y = "normal";
        }
        this.A = map;
    }

    @Override // io.sentry.c2
    public final void serialize(b3 b3Var, ILogger iLogger) {
        l1.a aVar = (l1.a) b3Var;
        aVar.j();
        aVar.u("android_api_level");
        aVar.H(iLogger, Integer.valueOf(this.f16541c));
        aVar.u("device_locale");
        aVar.H(iLogger, this.f16542d);
        aVar.u("device_manufacturer");
        aVar.K(this.f16543e);
        aVar.u("device_model");
        aVar.K(this.f16544f);
        aVar.u("device_os_build_number");
        aVar.K(this.f16545g);
        aVar.u("device_os_name");
        aVar.K(this.f16546h);
        aVar.u("device_os_version");
        aVar.K(this.f16547i);
        aVar.u("device_is_emulator");
        aVar.L(this.j);
        aVar.u("architecture");
        aVar.H(iLogger, this.f16548k);
        aVar.u("device_cpu_frequencies");
        aVar.H(iLogger, this.f16549l);
        aVar.u("device_physical_memory_bytes");
        aVar.K(this.f16550m);
        aVar.u("platform");
        aVar.K(this.f16551n);
        aVar.u("build_id");
        aVar.K(this.f16552o);
        aVar.u("transaction_name");
        aVar.K(this.q);
        aVar.u("duration_ns");
        aVar.K(this.f16554r);
        aVar.u("version_name");
        aVar.K(this.f16556t);
        aVar.u("version_code");
        aVar.K(this.f16555s);
        ArrayList arrayList = this.f16553p;
        if (!arrayList.isEmpty()) {
            aVar.u("transactions");
            aVar.H(iLogger, arrayList);
        }
        aVar.u("transaction_id");
        aVar.K(this.f16557u);
        aVar.u("trace_id");
        aVar.K(this.f16558v);
        aVar.u("profile_id");
        aVar.K(this.f16559w);
        aVar.u("environment");
        aVar.K(this.f16560x);
        aVar.u("truncation_reason");
        aVar.K(this.f16561y);
        if (this.B != null) {
            aVar.u("sampled_profile");
            aVar.K(this.B);
        }
        String str = ((io.sentry.vendor.gson.stream.c) aVar.f19314b).f17221d;
        aVar.C("");
        aVar.u("measurements");
        aVar.H(iLogger, this.A);
        aVar.C(str);
        aVar.u("timestamp");
        aVar.H(iLogger, this.f16562z);
        ConcurrentHashMap concurrentHashMap = this.C;
        if (concurrentHashMap != null) {
            for (K k6 : concurrentHashMap.keySet()) {
                d9.e.v(this.C, k6, aVar, k6, iLogger);
            }
        }
        aVar.o();
    }
}
