package pe0;

import Ae.C0;
import Ae.C2399j;
import Ae.C2405m;
import Ae.C2408n0;
import Ae.E0;
import Ae.InterfaceC2395h;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import we0.p;
import xe.B0;
import xe.H0;
import xe.M;
import ze.EnumC11113a;

/* renamed from: pe0.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8912h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC2395h f80459a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC2395h<p> f80460b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C0 f80461c;

    /* renamed from: d, reason: collision with root package name */
    private p f80462d;

    /* renamed from: e, reason: collision with root package name */
    private B0 f80463e;

    public C8912h(@NotNull InterfaceC2395h<p> userRawLocationFlow) {
        Intrinsics.checkNotNullParameter(userRawLocationFlow, "userRawLocationFlow");
        Intrinsics.checkNotNullParameter(userRawLocationFlow, "userRawLocationFlow");
        this.f80459a = userRawLocationFlow;
        this.f80460b = userRawLocationFlow;
        this.f80461c = E0.b(0, 400, EnumC11113a.DROP_OLDEST, 1);
    }

    static C8911g f(C8912h c8912h, C2405m c2405m) {
        c8912h.getClass();
        return new C8911g(c2405m);
    }

    public final void c() {
        B0 b02 = this.f80463e;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
    }

    @NotNull
    public final C0 d() {
        return this.f80461c;
    }

    public final Unit e(@NotNull M m11) {
        this.f80463e = C2399j.C(new C2408n0(C2399j.y(this.f80460b, new C8909e(this, null)), new C8910f(this, null)), m11);
        return Unit.f71690a;
    }
}
