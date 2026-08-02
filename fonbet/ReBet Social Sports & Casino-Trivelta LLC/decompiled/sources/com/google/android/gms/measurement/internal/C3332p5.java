package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.facebook.react.devsupport.StackTraceHelper;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.internal.measurement.zzdf;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.measurement.internal.p5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3332p5 extends AbstractC3225c2 {

    /* renamed from: c, reason: collision with root package name */
    public volatile C3268h5 f34222c;

    /* renamed from: d, reason: collision with root package name */
    public volatile C3268h5 f34223d;

    /* renamed from: e, reason: collision with root package name */
    public C3268h5 f34224e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f34225f;

    /* renamed from: g, reason: collision with root package name */
    public zzdf f34226g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f34227h;

    /* renamed from: i, reason: collision with root package name */
    public volatile C3268h5 f34228i;

    /* renamed from: j, reason: collision with root package name */
    public C3268h5 f34229j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f34230k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f34231l;

    public C3332p5(C3298l3 c3298l3) {
        super(c3298l3);
        this.f34231l = new Object();
        this.f34225f = new ConcurrentHashMap();
    }

    public final /* synthetic */ void A(Bundle bundle, C3268h5 c3268h5, C3268h5 c3268h52, long j10) {
        bundle.remove("screen_name");
        bundle.remove("screen_class");
        G(c3268h5, c3268h52, j10, true, this.f33578a.C().t(null, "screen_view", bundle, null, false));
    }

    public final /* synthetic */ void B(C3268h5 c3268h5, C3268h5 c3268h52, long j10, boolean z10, Bundle bundle) {
        G(c3268h5, c3268h52, j10, z10, null);
    }

    public final /* synthetic */ void C(C3268h5 c3268h5, boolean z10, long j10) {
        o(c3268h5, false, j10);
    }

    public final /* synthetic */ C3268h5 D() {
        return this.f34229j;
    }

    public final /* synthetic */ void E(C3268h5 c3268h5) {
        this.f34229j = null;
    }

    public final void F(String str, C3268h5 c3268h5, boolean z10) {
        C3268h5 c3268h52;
        C3268h5 c3268h53 = this.f34222c == null ? this.f34223d : this.f34222c;
        if (c3268h5.f34036b == null) {
            c3268h52 = new C3268h5(c3268h5.f34035a, str != null ? r(str, "Activity") : null, c3268h5.f34037c, c3268h5.f34039e, c3268h5.f34040f);
        } else {
            c3268h52 = c3268h5;
        }
        this.f34223d = this.f34222c;
        this.f34222c = c3268h52;
        C3298l3 c3298l3 = this.f33578a;
        c3298l3.b().t(new RunnableC3284j5(this, c3268h52, c3268h53, c3298l3.e().b(), z10));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G(C3268h5 c3268h5, C3268h5 c3268h52, long j10, boolean z10, Bundle bundle) {
        boolean z11;
        long j11;
        h();
        boolean z12 = false;
        if (c3268h52 != null) {
            if (c3268h52.f34037c == c3268h5.f34037c && Objects.equals(c3268h52.f34036b, c3268h5.f34036b) && Objects.equals(c3268h52.f34035a, c3268h5.f34035a)) {
                z11 = false;
                if (z10 && this.f34224e != null) {
                    z12 = true;
                }
                if (z11) {
                    Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
                    b7.k0(c3268h5, bundle2, true);
                    if (c3268h52 != null) {
                        String str = c3268h52.f34035a;
                        if (str != null) {
                            bundle2.putString("_pn", str);
                        }
                        String str2 = c3268h52.f34036b;
                        if (str2 != null) {
                            bundle2.putString("_pc", str2);
                        }
                        bundle2.putLong("_pi", c3268h52.f34037c);
                    }
                    if (z12) {
                        C3333p6 c3333p6 = this.f33578a.z().f34270f;
                        long j12 = j10 - c3333p6.f34233b;
                        c3333p6.f34233b = j10;
                        if (j12 > 0) {
                            this.f33578a.C().Z(bundle2, j12);
                        }
                    }
                    C3298l3 c3298l3 = this.f33578a;
                    if (!c3298l3.w().N()) {
                        bundle2.putLong("_mst", 1L);
                    }
                    boolean z13 = c3268h5.f34039e;
                    String str3 = true != z13 ? "auto" : "app";
                    long a10 = c3298l3.e().a();
                    if (z13) {
                        long j13 = c3268h5.f34040f;
                        if (j13 != 0) {
                            j11 = j13;
                            this.f33578a.B().u(str3, "_vs", j11, bundle2);
                        }
                    }
                    j11 = a10;
                    this.f33578a.B().u(str3, "_vs", j11, bundle2);
                }
                if (z12) {
                    o(this.f34224e, true, j10);
                }
                this.f34224e = c3268h5;
                if (c3268h5.f34039e) {
                    this.f34229j = c3268h5;
                }
                this.f33578a.J().u(c3268h5);
            }
        }
        z11 = true;
        if (z10) {
            z12 = true;
        }
        if (z11) {
        }
        if (z12) {
        }
        this.f34224e = c3268h5;
        if (c3268h5.f34039e) {
        }
        this.f33578a.J().u(c3268h5);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC3225c2
    public final boolean m() {
        return false;
    }

    public final void o(C3268h5 c3268h5, boolean z10, long j10) {
        C3298l3 c3298l3 = this.f33578a;
        c3298l3.M().k(c3298l3.e().b());
        if (!c3298l3.z().f34270f.d(c3268h5 != null && c3268h5.f34038d, z10, j10) || c3268h5 == null) {
            return;
        }
        c3268h5.f34038d = false;
    }

    public final C3268h5 p(zzdf zzdfVar) {
        AbstractC3191o.m(zzdfVar);
        Integer valueOf = Integer.valueOf(zzdfVar.zza);
        Map map = this.f34225f;
        C3268h5 c3268h5 = (C3268h5) map.get(valueOf);
        if (c3268h5 == null) {
            C3268h5 c3268h52 = new C3268h5(null, r(zzdfVar.zzb, "Activity"), this.f33578a.C().p0());
            map.put(valueOf, c3268h52);
            c3268h5 = c3268h52;
        }
        return this.f34228i != null ? this.f34228i : c3268h5;
    }

    public final C3268h5 q(boolean z10) {
        j();
        h();
        if (!z10) {
            return this.f34224e;
        }
        C3268h5 c3268h5 = this.f34224e;
        return c3268h5 != null ? c3268h5 : this.f34229j;
    }

    public final String r(String str, String str2) {
        if (str == null) {
            return "Activity";
        }
        String[] split = str.split("\\.");
        int length = split.length;
        String str3 = length > 0 ? split[length - 1] : "";
        C3298l3 c3298l3 = this.f33578a;
        return str3.length() > c3298l3.w().x(null, false) ? str3.substring(0, c3298l3.w().x(null, false)) : str3;
    }

    public final void s(Bundle bundle, long j10) {
        synchronized (this.f34231l) {
            try {
                if (!this.f34230k) {
                    this.f33578a.a().t().a("Cannot log screen view event when the app is in the background.");
                    return;
                }
                String string = bundle.getString("screen_name");
                if (string != null && (string.length() <= 0 || string.length() > this.f33578a.w().x(null, false))) {
                    this.f33578a.a().t().b("Invalid screen name length for screen view. Length", Integer.valueOf(string.length()));
                    return;
                }
                String string2 = bundle.getString("screen_class");
                if (string2 != null && (string2.length() <= 0 || string2.length() > this.f33578a.w().x(null, false))) {
                    this.f33578a.a().t().b("Invalid screen class length for screen view. Length", Integer.valueOf(string2.length()));
                    return;
                }
                if (string2 == null) {
                    zzdf zzdfVar = this.f34226g;
                    string2 = zzdfVar != null ? r(zzdfVar.zzb, "Activity") : "Activity";
                }
                C3268h5 c3268h5 = this.f34222c;
                if (this.f34227h && c3268h5 != null) {
                    this.f34227h = false;
                    boolean equals = Objects.equals(c3268h5.f34036b, string2);
                    boolean equals2 = Objects.equals(c3268h5.f34035a, string);
                    if (equals && equals2) {
                        this.f33578a.a().t().a("Ignoring call to log screen view event with duplicate parameters.");
                        return;
                    }
                }
                C3298l3 c3298l3 = this.f33578a;
                c3298l3.a().w().c("Logging screen view with name, class", string == null ? "null" : string, string2 == null ? "null" : string2);
                C3268h5 c3268h52 = this.f34222c == null ? this.f34223d : this.f34222c;
                C3268h5 c3268h53 = new C3268h5(string, string2, c3298l3.C().p0(), true, j10);
                this.f34222c = c3268h53;
                this.f34223d = c3268h52;
                this.f34228i = c3268h53;
                c3298l3.b().t(new RunnableC3276i5(this, bundle, c3268h53, c3268h52, c3298l3.e().b()));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void t(zzdf zzdfVar, String str, String str2) {
        C3298l3 c3298l3 = this.f33578a;
        if (!c3298l3.w().N()) {
            c3298l3.a().t().a("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        C3268h5 c3268h5 = this.f34222c;
        if (c3268h5 == null) {
            c3298l3.a().t().a("setCurrentScreen cannot be called while no activity active");
            return;
        }
        Map map = this.f34225f;
        Integer valueOf = Integer.valueOf(zzdfVar.zza);
        if (map.get(valueOf) == null) {
            c3298l3.a().t().a("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = r(zzdfVar.zzb, "Activity");
        }
        String str3 = c3268h5.f34036b;
        String str4 = c3268h5.f34035a;
        boolean equals = Objects.equals(str3, str2);
        boolean equals2 = Objects.equals(str4, str);
        if (equals && equals2) {
            c3298l3.a().t().a("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null && (str.length() <= 0 || str.length() > c3298l3.w().x(null, false))) {
            c3298l3.a().t().b("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            return;
        }
        if (str2 != null && (str2.length() <= 0 || str2.length() > c3298l3.w().x(null, false))) {
            c3298l3.a().t().b("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            return;
        }
        c3298l3.a().w().c("Setting current screen to name, class", str == null ? "null" : str, str2);
        C3268h5 c3268h52 = new C3268h5(str, str2, c3298l3.C().p0());
        map.put(valueOf, c3268h52);
        F(zzdfVar.zzb, c3268h52, true);
    }

    public final C3268h5 u() {
        return this.f34222c;
    }

    public final void v(zzdf zzdfVar, Bundle bundle) {
        Bundle bundle2;
        if (!this.f33578a.w().N() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f34225f.put(Integer.valueOf(zzdfVar.zza), new C3268h5(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong(StackTraceHelper.ID_KEY)));
    }

    public final void w(zzdf zzdfVar) {
        Object obj = this.f34231l;
        synchronized (obj) {
            this.f34230k = true;
            if (!Objects.equals(zzdfVar, this.f34226g)) {
                synchronized (obj) {
                    this.f34226g = zzdfVar;
                    this.f34227h = false;
                    C3298l3 c3298l3 = this.f33578a;
                    if (c3298l3.w().N()) {
                        this.f34228i = null;
                        c3298l3.b().t(new RunnableC3324o5(this));
                    }
                }
            }
        }
        C3298l3 c3298l32 = this.f33578a;
        if (!c3298l32.w().N()) {
            this.f34222c = this.f34228i;
            c3298l32.b().t(new RunnableC3292k5(this));
            return;
        }
        F(zzdfVar.zzb, p(zzdfVar), false);
        C3406z0 M10 = this.f33578a.M();
        C3298l3 c3298l33 = M10.f33578a;
        c3298l33.b().t(new Y(M10, c3298l33.e().b()));
    }

    public final void x(zzdf zzdfVar) {
        synchronized (this.f34231l) {
            this.f34230k = false;
            this.f34227h = true;
        }
        C3298l3 c3298l3 = this.f33578a;
        long b10 = c3298l3.e().b();
        if (!c3298l3.w().N()) {
            this.f34222c = null;
            c3298l3.b().t(new RunnableC3300l5(this, b10));
        } else {
            C3268h5 p10 = p(zzdfVar);
            this.f34223d = this.f34222c;
            this.f34222c = null;
            c3298l3.b().t(new RunnableC3308m5(this, p10, b10));
        }
    }

    public final void y(zzdf zzdfVar, Bundle bundle) {
        C3268h5 c3268h5;
        if (!this.f33578a.w().N() || bundle == null || (c3268h5 = (C3268h5) this.f34225f.get(Integer.valueOf(zzdfVar.zza))) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong(StackTraceHelper.ID_KEY, c3268h5.f34037c);
        bundle2.putString("name", c3268h5.f34035a);
        bundle2.putString("referrer_name", c3268h5.f34036b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    public final void z(zzdf zzdfVar) {
        synchronized (this.f34231l) {
            try {
                if (Objects.equals(this.f34226g, zzdfVar)) {
                    this.f34226g = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (this.f33578a.w().N()) {
            this.f34225f.remove(Integer.valueOf(zzdfVar.zza));
        }
    }
}
