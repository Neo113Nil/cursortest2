package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.system.SystemPropertiesHelper;
import java.io.File;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.b4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0040b4 {

    /* renamed from: w, reason: collision with root package name */
    public static volatile C0040b4 f13371w;

    /* renamed from: a, reason: collision with root package name */
    public final C0448r6 f13372a;

    /* renamed from: b, reason: collision with root package name */
    public final D7 f13373b;

    /* renamed from: c, reason: collision with root package name */
    public final R3 f13374c;

    /* renamed from: d, reason: collision with root package name */
    public final F1 f13375d;

    /* renamed from: e, reason: collision with root package name */
    public final C0367o f13376e;

    /* renamed from: f, reason: collision with root package name */
    public final Wk f13377f;

    /* renamed from: g, reason: collision with root package name */
    public final E5 f13378g;

    /* renamed from: h, reason: collision with root package name */
    public final C0317m f13379h;

    /* renamed from: i, reason: collision with root package name */
    public final C0341mn f13380i;
    public C0555vd j;

    /* renamed from: k, reason: collision with root package name */
    public final C0442r0 f13381k;

    /* renamed from: l, reason: collision with root package name */
    public volatile Y3 f13382l;

    /* renamed from: m, reason: collision with root package name */
    public final Sc f13383m;

    /* renamed from: n, reason: collision with root package name */
    public volatile Ve f13384n;

    /* renamed from: o, reason: collision with root package name */
    public C0055bj f13385o;

    /* renamed from: p, reason: collision with root package name */
    public final C0642z0 f13386p;
    public final K1 q;

    /* renamed from: r, reason: collision with root package name */
    public final C0072ca f13387r;

    /* renamed from: s, reason: collision with root package name */
    public volatile C0036b0 f13388s;

    /* renamed from: t, reason: collision with root package name */
    public volatile M9 f13389t;

    /* renamed from: u, reason: collision with root package name */
    public volatile G7 f13390u;

    /* renamed from: v, reason: collision with root package name */
    public volatile C0066c4 f13391v;

    public C0040b4(C0448r6 c0448r6, C0367o c0367o, R3 r32) {
        this(c0448r6, c0367o, r32, new C0317m(c0367o));
    }

    public static C0040b4 l() {
        if (f13371w == null) {
            synchronized (C0040b4.class) {
                try {
                    if (f13371w == null) {
                        f13371w = new C0040b4(new C0448r6(), new C0367o(), new R3());
                    }
                } finally {
                }
            }
        }
        return f13371w;
    }

    public final C0367o a() {
        return this.f13376e;
    }

    public final Ve b(Context context) {
        Ve ve2;
        Ve ve3 = this.f13384n;
        if (ve3 != null) {
            return ve3;
        }
        synchronized (this) {
            try {
                ve2 = this.f13384n;
                if (ve2 == null) {
                    ve2 = new Ve(c(context).a(context));
                    this.f13384n = ve2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return ve2;
    }

    public final C0442r0 c() {
        return this.f13381k;
    }

    public final C0642z0 d() {
        return this.f13386p;
    }

    public final F1 e() {
        return this.f13375d;
    }

    public final K1 f() {
        return this.q;
    }

    public final R3 g() {
        return this.f13374c;
    }

    public final E5 h() {
        return this.f13378g;
    }

    public final C0448r6 i() {
        return this.f13372a;
    }

    public final D7 j() {
        return this.f13373b;
    }

    public final C0072ca k() {
        return this.f13387r;
    }

    public final Y3 m() {
        Y3 y32;
        Y3 y33 = this.f13382l;
        if (y33 != null) {
            return y33;
        }
        synchronized (this) {
            try {
                y32 = this.f13382l;
                if (y32 == null) {
                    y32 = new Y3();
                    this.f13382l = y32;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return y32;
    }

    public final C0448r6 n() {
        return this.f13372a;
    }

    public final Wk o() {
        return this.f13377f;
    }

    public C0040b4(C0448r6 c0448r6, C0367o c0367o, R3 r32, C0317m c0317m) {
        this(c0448r6, new D7(), r32, c0317m, new F1(), c0367o, new Wk(c0367o, c0317m), new E5(c0367o), new C0341mn(), new C0442r0());
    }

    public final synchronized C0555vd a(Context context) {
        try {
            if (this.j == null) {
                this.j = new C0555vd(context, new mo());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.j;
    }

    public final C0066c4 c(Context context) {
        C0066c4 c0066c4;
        File file;
        C0066c4 c0066c42 = this.f13391v;
        if (c0066c42 != null) {
            return c0066c42;
        }
        synchronized (this) {
            c0066c4 = this.f13391v;
            if (c0066c4 == null) {
                String readSystemProperty = SystemPropertiesHelper.readSystemProperty("ro.yndx.metrica.db.dir");
                String readSystemProperty2 = SystemPropertiesHelper.readSystemProperty("debug.yndx.iaa.db.dir");
                if (StringsKt.H(readSystemProperty)) {
                    readSystemProperty = readSystemProperty2;
                }
                if (!StringsKt.H(readSystemProperty)) {
                    file = new File(readSystemProperty, context.getPackageName());
                    try {
                        file.mkdirs();
                    } catch (Exception unused) {
                    }
                    c0066c4 = new C0066c4(file);
                    this.f13391v = c0066c4;
                }
                file = null;
                c0066c4 = new C0066c4(file);
                this.f13391v = c0066c4;
            }
        }
        return c0066c4;
    }

    public C0040b4(C0448r6 c0448r6, D7 d72, R3 r32, C0317m c0317m, F1 f12, C0367o c0367o, Wk wk, E5 e52, C0341mn c0341mn, C0442r0 c0442r0) {
        this.f13383m = new Sc();
        this.f13386p = new C0642z0();
        this.q = new K1();
        this.f13387r = new C0072ca();
        new C7();
        this.f13390u = new G7();
        this.f13372a = c0448r6;
        this.f13373b = d72;
        this.f13374c = r32;
        this.f13379h = c0317m;
        this.f13375d = f12;
        this.f13376e = c0367o;
        this.f13377f = wk;
        this.f13378g = e52;
        this.f13380i = c0341mn;
        this.f13381k = c0442r0;
    }

    public final C0036b0 b() {
        C0036b0 c0036b0;
        C0036b0 c0036b02 = this.f13388s;
        if (c0036b02 != null) {
            return c0036b02;
        }
        synchronized (this) {
            try {
                c0036b0 = this.f13388s;
                if (c0036b0 == null) {
                    c0036b0 = new C0036b0(this.f13386p, this.f13377f, this.f13374c);
                    this.f13388s = c0036b0;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c0036b0;
    }
}
