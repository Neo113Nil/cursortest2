package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.pc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0405pc extends X4 implements Ma, La {

    /* renamed from: w, reason: collision with root package name */
    public final C0309lg f14472w;

    /* renamed from: x, reason: collision with root package name */
    public final C0409pg f14473x;

    /* renamed from: y, reason: collision with root package name */
    public final E6 f14474y;

    public C0405pc(@NonNull Context context, @NonNull C0161fm c0161fm, @NonNull Q4 q42, @NonNull C0372o4 c0372o4, @NonNull C0309lg c0309lg, @NonNull E6 e62, @NonNull V4 v42) {
        this(context, q42, c0372o4, new C0268k0(), new TimePassedChecker(), new C0454rc(context, q42, c0372o4, v42, c0161fm, new C0280kc(e62), C0353na.k().w().c(), PackageManagerUtils.getAppVersionCodeInt(context), C0353na.k().w(), C0353na.k().l(), new C0125ec()), c0309lg, e62);
    }

    @Override // io.appmetrica.analytics.impl.X4
    public final void C() {
        this.f14472w.a(this.f14473x);
    }

    public final boolean D() {
        boolean optBoolean;
        xo xoVar = this.f13159t;
        synchronized (xoVar) {
            optBoolean = xoVar.f14934a.a().optBoolean("referrer_handled", false);
        }
        return optBoolean;
    }

    @Override // io.appmetrica.analytics.impl.X4, io.appmetrica.analytics.impl.Pa, io.appmetrica.analytics.impl.Ea
    public final synchronized void a(@NonNull C0372o4 c0372o4) {
        super.a(c0372o4);
        this.f14474y.a(c0372o4.f14389i);
    }

    @Override // io.appmetrica.analytics.impl.X4, io.appmetrica.analytics.impl.Ea
    @NonNull
    public final CounterConfigurationReporterType c() {
        return CounterConfigurationReporterType.MAIN;
    }

    @Override // io.appmetrica.analytics.impl.La
    public final void a() {
        xo xoVar = this.f13159t;
        synchronized (xoVar) {
            yo yoVar = xoVar.f14934a;
            yoVar.a(yoVar.a().put("referrer_handled", true));
        }
    }

    public C0405pc(Context context, Q4 q42, C0372o4 c0372o4, C0268k0 c0268k0, TimePassedChecker timePassedChecker, C0454rc c0454rc, C0309lg c0309lg, E6 e62) {
        super(context, q42, c0268k0, timePassedChecker, c0454rc, c0372o4);
        this.f14472w = c0309lg;
        X8 k6 = k();
        k6.a(EnumC0047bb.EVENT_TYPE_REGULAR, new Hg(k6.b()));
        this.f14473x = c0454rc.a(this);
        this.f14474y = e62;
        C0353na.k().x().onMainReporterCreated(new C0562vk(this, c0372o4));
    }
}
