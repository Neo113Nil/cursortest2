package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@InterfaceC4307sb
/* loaded from: classes4.dex */
public final class La implements InterfaceC4396xa {

    @NotNull
    private final C4243p0 a;

    @NotNull
    private final U2 b;

    @NotNull
    private final L2 c;

    @Nullable
    private InterfaceC4414ya d;

    @NotNull
    private Qa e;

    @Nullable
    private J2 f;

    @NotNull
    private final L0 g;

    @NotNull
    private final InterfaceC4422z0 h;

    @NotNull
    private final M2 i;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements M2 {
        public a() {
        }

        public void a() {
            InterfaceC4414ya m = La.this.m();
            if (m != null) {
                m.onAdLeftApplication();
            }
        }

        public void b() {
            InterfaceC4414ya m = La.this.m();
            if (m != null) {
                m.k();
            }
        }

        public void c() {
            InterfaceC4414ya m = La.this.m();
            if (m != null) {
                m.i();
            }
        }

        @Override // com.ironsource.J0
        public void e() {
            InterfaceC4414ya m = La.this.m();
            if (m != null) {
                m.onAdClicked();
            }
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
            La.this.l().a(c4332u0);
        }

        @Override // com.ironsource.L0
        public void b(@Nullable IronSourceError ironSourceError) {
            La.this.l().b(ironSourceError);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class c implements InterfaceC4422z0 {
        public c() {
        }

        @Override // com.ironsource.InterfaceC4422z0
        public void a(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
            levelPlayAdInfo.getClass();
            InterfaceC4414ya m = La.this.m();
            if (m != null) {
                m.onAdDisplayed(levelPlayAdInfo);
            }
        }

        @Override // com.ironsource.InterfaceC4422z0
        public void c(@Nullable IronSourceError ironSourceError) {
            InterfaceC4414ya m = La.this.m();
            if (m != null) {
                m.d(ironSourceError);
            }
        }
    }

    public La(@NotNull C4243p0 c4243p0, @NotNull U2 u2, @NotNull L2 l2) {
        c4243p0.getClass();
        u2.getClass();
        l2.getClass();
        this.a = c4243p0;
        this.b = u2;
        this.c = l2;
        this.e = new Ma(this);
        this.g = new b();
        this.h = new c();
        this.i = new a();
    }

    public final void a(@NotNull String str) {
        str.getClass();
        this.a.f().h().f("Banner Single Ad Unit Strategy - " + str);
    }

    @Override // com.ironsource.InterfaceC4396xa
    public void b() {
        this.e.b();
    }

    @Override // com.ironsource.InterfaceC4396xa
    public void c() {
        this.e.c();
    }

    @NotNull
    public final M2 e() {
        return this.i;
    }

    @NotNull
    public final L0 g() {
        return this.g;
    }

    @NotNull
    public final InterfaceC4422z0 h() {
        return this.h;
    }

    @NotNull
    public final L2 i() {
        return this.c;
    }

    @NotNull
    public final U2 j() {
        return this.b;
    }

    @Nullable
    public final J2 k() {
        return this.f;
    }

    @NotNull
    public final Qa l() {
        return this.e;
    }

    @Nullable
    public final InterfaceC4414ya m() {
        return this.d;
    }

    public final void b(@Nullable InterfaceC4414ya interfaceC4414ya) {
        this.d = interfaceC4414ya;
    }

    @Override // com.ironsource.InterfaceC4396xa
    public void d() {
    }

    @Override // com.ironsource.InterfaceC4396xa
    public void f() {
    }

    public final void a(@NotNull Qa qa) {
        qa.getClass();
        this.e = qa;
    }

    public final void a(@Nullable J2 j2) {
        this.f = j2;
    }

    @NotNull
    public final C4243p0 a() {
        return this.a;
    }

    public final void a(@NotNull C4332u0 c4332u0, @NotNull J2 j2) {
        InterfaceC4414ya interfaceC4414ya;
        c4332u0.getClass();
        j2.getClass();
        j2.a(this.b.getViewBinder(), this.h);
        LevelPlayAdInfo c2 = c4332u0.c();
        if (c2 == null || (interfaceC4414ya = this.d) == null) {
            return;
        }
        interfaceC4414ya.onAdLoaded(c2);
    }

    public final void a(@Nullable IronSourceError ironSourceError) {
        InterfaceC4414ya interfaceC4414ya = this.d;
        if (interfaceC4414ya != null) {
            interfaceC4414ya.a(ironSourceError);
        }
    }

    @Override // com.ironsource.InterfaceC4396xa
    public void a(@NotNull InterfaceC4414ya interfaceC4414ya) {
        interfaceC4414ya.getClass();
        this.d = interfaceC4414ya;
    }
}
