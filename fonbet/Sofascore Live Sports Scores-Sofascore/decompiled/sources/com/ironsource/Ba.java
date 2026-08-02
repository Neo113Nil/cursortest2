package com.ironsource;

import android.graphics.Rect;
import android.view.ViewTreeObserver;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import defpackage.kx0;
import defpackage.lx0;
import defpackage.mx0;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@InterfaceC4307sb
/* loaded from: classes4.dex */
public final class Ba implements InterfaceC4396xa {

    @NotNull
    private final C4243p0 a;

    @NotNull
    private final U2 b;
    private final long c;
    private final long d;

    @NotNull
    private InterfaceC4414ya e;

    @NotNull
    private final L2 f;

    @NotNull
    private final Df g;

    @NotNull
    private final InterfaceC4193m4 h;
    private final boolean i;

    @NotNull
    private L0 j;

    @NotNull
    private InterfaceC4422z0 k;

    @NotNull
    private M2 l;

    @NotNull
    private Ka m;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements M2 {
        public a() {
        }

        public void a() {
            Ba.this.m().onAdLeftApplication();
        }

        public void b() {
            Ba.this.m().k();
        }

        public void c() {
            Ba.this.m().i();
        }

        @Override // com.ironsource.J0
        public void e() {
            Ba.this.m().onAdClicked();
        }

        @Override // com.ironsource.M2
        public /* bridge */ /* synthetic */ Unit g() {
            a();
            return Unit.a;
        }

        @Override // com.ironsource.M2
        public /* bridge */ /* synthetic */ Unit h() {
            c();
            return Unit.a;
        }

        @Override // com.ironsource.M2
        public /* bridge */ /* synthetic */ Unit j() {
            b();
            return Unit.a;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class b implements L0 {
        public b() {
        }

        @Override // com.ironsource.L0
        public void a(@NotNull C4332u0 c4332u0) {
            c4332u0.getClass();
            Ba.this.l().a(c4332u0);
        }

        @Override // com.ironsource.L0
        public void b(@Nullable IronSourceError ironSourceError) {
            Ba.this.l().b(ironSourceError);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class c implements InterfaceC4422z0 {
        public c() {
        }

        @Override // com.ironsource.InterfaceC4422z0
        public void a(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
            levelPlayAdInfo.getClass();
            Ba.this.m().onAdDisplayed(levelPlayAdInfo);
        }

        @Override // com.ironsource.InterfaceC4422z0
        public void c(@Nullable IronSourceError ironSourceError) {
            Ba.this.m().d(ironSourceError);
        }
    }

    public Ba(@NotNull C4243p0 c4243p0, @NotNull U2 u2, long j, long j2, @NotNull InterfaceC4414ya interfaceC4414ya, @NotNull L2 l2, @NotNull Df df, @NotNull InterfaceC4193m4 interfaceC4193m4, boolean z) {
        c4243p0.getClass();
        u2.getClass();
        interfaceC4414ya.getClass();
        l2.getClass();
        df.getClass();
        interfaceC4193m4.getClass();
        this.a = c4243p0;
        this.b = u2;
        this.c = j;
        this.d = j2;
        this.e = interfaceC4414ya;
        this.f = l2;
        this.g = df;
        this.h = interfaceC4193m4;
        this.i = z;
        this.j = new b();
        this.k = new c();
        this.l = new a();
        this.m = new Ca(this, false, 2, null);
    }

    public final void a(@NotNull C4332u0 c4332u0, @NotNull J2 j2, @Nullable J2 j22, @NotNull AbstractC4031d3 abstractC4031d3, boolean z, @Nullable Long l) {
        Unit unit;
        c4332u0.getClass();
        j2.getClass();
        abstractC4031d3.getClass();
        j2.a(this.b.getViewBinder(), this.k);
        LevelPlayAdInfo c2 = c4332u0.c();
        if (c2 != null) {
            this.e.onAdLoaded(c2);
            unit = Unit.a;
        } else {
            unit = null;
        }
        if (unit == null) {
            IronLog.INTERNAL.error(C4243p0.a(this.a, "adInfo is null in handleLoadSuccess", (String) null, 2, (Object) null));
        }
        if (j22 != null) {
            j22.a(false);
        }
        if (z) {
            this.m = new Ga(this, j2);
        } else {
            a(j2, abstractC4031d3, l);
        }
    }

    public final void b(@NotNull InterfaceC4414ya interfaceC4414ya) {
        interfaceC4414ya.getClass();
        this.e = interfaceC4414ya;
    }

    @Override // com.ironsource.InterfaceC4396xa
    public void c() {
        this.m.c();
    }

    @Override // com.ironsource.InterfaceC4396xa
    public void d() {
        this.m.d();
    }

    @NotNull
    public final M2 e() {
        return this.l;
    }

    @Override // com.ironsource.InterfaceC4396xa
    public void f() {
        this.m.f();
    }

    @NotNull
    public final L0 g() {
        return this.j;
    }

    @NotNull
    public final InterfaceC4422z0 h() {
        return this.k;
    }

    @NotNull
    public final L2 i() {
        return this.f;
    }

    @NotNull
    public final U2 j() {
        return this.b;
    }

    public final long k() {
        return this.c;
    }

    @NotNull
    public final Ka l() {
        return this.m;
    }

    @NotNull
    public final InterfaceC4414ya m() {
        return this.e;
    }

    @NotNull
    public final Df n() {
        return this.g;
    }

    @NotNull
    public final InterfaceC4193m4 o() {
        return this.h;
    }

    public final long p() {
        return this.d;
    }

    public final void q() {
        this.a.f().h().h("Banner view is not visible");
    }

    @Override // com.ironsource.InterfaceC4396xa
    public void b() {
        this.m.b();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class d implements ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ J2 b;
        final /* synthetic */ AbstractC4031d3 c;
        final /* synthetic */ Long d;

        public d(J2 j2, AbstractC4031d3 abstractC4031d3, Long l) {
            this.b = j2;
            this.c = abstractC4031d3;
            this.d = l;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(Ba ba, J2 j2, AbstractC4031d3 abstractC4031d3) {
            ba.getClass();
            j2.getClass();
            abstractC4031d3.getClass();
            Ba.a(ba, j2, abstractC4031d3, false, 4, (Object) null);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Ba.this.j().getViewTreeObserver().isAlive()) {
                Ba.this.j().getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
            boolean a = Fg.a(Ba.this.j(), new Rect());
            Ba ba = Ba.this;
            if (a) {
                ba.a().a(new lx0(Ba.this, this.b, this.c, 1));
            } else {
                ba.a().a(new mx0(Ba.this, this.b, this.d, 1));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(Ba ba, J2 j2, Long l) {
            ba.getClass();
            j2.getClass();
            ba.a((Ka) new Ea(ba, j2, l));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ Ba(C4243p0 c4243p0, U2 u2, long j, long j2, InterfaceC4414ya interfaceC4414ya, L2 l2, Df df, InterfaceC4193m4 interfaceC4193m4, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c4243p0, u2, j, j2, interfaceC4414ya, l2, r11, interfaceC4193m4, z);
        Df df2;
        if ((i & 64) != 0) {
            df2 = new Cf(null, null, null, 7, null);
        } else {
            df2 = df;
        }
    }

    public final void a(@NotNull L0 l0) {
        l0.getClass();
        this.j = l0;
    }

    public final void a(@NotNull InterfaceC4422z0 interfaceC4422z0) {
        interfaceC4422z0.getClass();
        this.k = interfaceC4422z0;
    }

    public final void a(@NotNull M2 m2) {
        m2.getClass();
        this.l = m2;
    }

    public final void a(@NotNull Ka ka) {
        ka.getClass();
        this.m = ka;
    }

    public final void a(@NotNull String str) {
        str.getClass();
        this.a.f().h().f("Banner Reload Strategy - " + str);
    }

    @NotNull
    public final C4243p0 a() {
        return this.a;
    }

    public final void a(@Nullable IronSourceError ironSourceError, @NotNull J2 j2, @NotNull AbstractC4031d3 abstractC4031d3, boolean z, boolean z2, @Nullable Long l) {
        j2.getClass();
        abstractC4031d3.getClass();
        this.e.a(ironSourceError);
        if (z2) {
            this.m = new Ga(this, j2);
        } else if (z) {
            a(j2, abstractC4031d3, l);
        } else {
            a(j2, abstractC4031d3, this.i);
        }
    }

    public final void a(@NotNull J2 j2, @NotNull AbstractC4031d3 abstractC4031d3, @Nullable Long l) {
        j2.getClass();
        abstractC4031d3.getClass();
        this.a.b(new kx0(this, j2, abstractC4031d3, l, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Ba ba, J2 j2, AbstractC4031d3 abstractC4031d3, Long l) {
        ba.getClass();
        j2.getClass();
        abstractC4031d3.getClass();
        int i = 0;
        if (Fg.a(ba.b, new Rect())) {
            ba.a.a(new lx0(ba, j2, abstractC4031d3, i));
        } else if (!ba.b.getViewTreeObserver().isAlive()) {
            ba.a.a(new mx0(ba, j2, l, i));
        } else {
            ba.b.getViewTreeObserver().addOnGlobalLayoutListener(ba.new d(j2, abstractC4031d3, l));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Ba ba, J2 j2, AbstractC4031d3 abstractC4031d3) {
        ba.getClass();
        j2.getClass();
        abstractC4031d3.getClass();
        a(ba, j2, abstractC4031d3, false, 4, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Ba ba, J2 j2, Long l) {
        ba.getClass();
        j2.getClass();
        ba.m = new Ea(ba, j2, l);
    }

    public static /* synthetic */ void a(Ba ba, J2 j2, AbstractC4031d3 abstractC4031d3, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        ba.a(j2, abstractC4031d3, z);
    }

    public final void a(@NotNull J2 j2, @NotNull AbstractC4031d3 abstractC4031d3, boolean z) {
        j2.getClass();
        abstractC4031d3.getClass();
        J2 a2 = this.f.a(false);
        Ha ha = new Ha(this, j2, a2, this.h.a(), z);
        a(abstractC4031d3);
        this.m = ha;
        a2.a(this.j);
    }

    private final void a(AbstractC4031d3 abstractC4031d3) {
        this.a.f().h().a(abstractC4031d3.c(), abstractC4031d3.b(), abstractC4031d3.a());
    }

    @Override // com.ironsource.InterfaceC4396xa
    public void a(@NotNull InterfaceC4414ya interfaceC4414ya) {
        interfaceC4414ya.getClass();
        this.e = interfaceC4414ya;
    }
}
