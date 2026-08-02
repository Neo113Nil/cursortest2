package l0;

import S0.A1;
import S0.InterfaceC3967k;
import a1.C4912a;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: l0.j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C7766j extends AbstractC7737t implements InterfaceC6511n<H, InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c1.u<Object> f72097b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f72098c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C7774s<Object> f72099d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C4912a f72100e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7766j(c1.u uVar, Object obj, C7774s c7774s, C4912a c4912a) {
        super(3);
        this.f72097b = uVar;
        this.f72098c = obj;
        this.f72099d = c7774s;
        this.f72100e = c4912a;
    }

    @Override // fd.InterfaceC6511n
    public final Unit invoke(H h11, InterfaceC3967k interfaceC3967k, Integer num) {
        H h12 = h11;
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        int intValue = num.intValue();
        if ((intValue & 6) == 0) {
            intValue |= (intValue & 8) == 0 ? interfaceC3967k2.n(h12) : interfaceC3967k2.F(h12) ? 4 : 2;
        }
        if ((intValue & 19) == 18 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            c1.u<Object> uVar = this.f72097b;
            boolean n11 = interfaceC3967k2.n(uVar);
            Object obj = this.f72098c;
            boolean F11 = n11 | interfaceC3967k2.F(obj);
            C7774s<Object> c7774s = this.f72099d;
            boolean F12 = F11 | interfaceC3967k2.F(c7774s);
            Object C11 = interfaceC3967k2.C();
            if (F12 || C11 == InterfaceC3967k.a.a()) {
                C11 = new C7765i(uVar, obj, c7774s);
                interfaceC3967k2.x(C11);
            }
            S0.Q.c(h12, (Function1) C11, interfaceC3967k2);
            androidx.collection.L<Object, A1<Z1.q>> f7 = c7774s.f();
            Intrinsics.g(h12, "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl");
            f7.i(obj, ((I) h12).a());
            Object C12 = interfaceC3967k2.C();
            if (C12 == InterfaceC3967k.a.a()) {
                C12 = new C7773q(h12);
                interfaceC3967k2.x(C12);
            }
            this.f72100e.invoke((C7773q) C12, obj, interfaceC3967k2, 0);
        }
        return Unit.f71690a;
    }
}
