package ke;

import je.F0;
import je.L0;
import je.N;
import je.Y;
import je.r0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ke.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C7671c extends r0.c.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC7670b f71484a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ F0 f71485b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7671c(InterfaceC7670b interfaceC7670b, F0 f02) {
        super(0);
        this.f71484a = interfaceC7670b;
        this.f71485b = f02;
    }

    @Override // je.r0.c
    public final ne.h a(r0 state, ne.g type) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(type, "type");
        InterfaceC7670b interfaceC7670b = this.f71484a;
        N j11 = this.f71485b.j(interfaceC7670b.I(type), L0.INVARIANT);
        Intrinsics.checkNotNullExpressionValue(j11, "safeSubstitute(...)");
        Y u11 = interfaceC7670b.u(j11);
        Intrinsics.f(u11);
        return u11;
    }
}
