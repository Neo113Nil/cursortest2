package l0;

import fd.InterfaceC6511n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import m0.D0;

/* loaded from: classes.dex */
final class D extends AbstractC7737t implements InterfaceC6511n<B1.Y, B1.U, Z1.b, B1.W> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC7737t f72011b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ D0<Object> f72012c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    D(Function1<Object, Boolean> function1, D0<Object> d02) {
        super(3);
        this.f72011b = (AbstractC7737t) function1;
        this.f72012c = d02;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    @Override // fd.InterfaceC6511n
    public final B1.W invoke(B1.Y y11, B1.U u11, Z1.b bVar) {
        long a11;
        B1.W z02;
        B1.Y y12 = y11;
        B1.m0 a02 = u11.a0(bVar.p());
        if (y12.R0()) {
            if (!((Boolean) this.f72011b.invoke(this.f72012c.n())).booleanValue()) {
                a11 = 0;
                z02 = y12.z0((int) (a11 >> 32), (int) (a11 & 4294967295L), kotlin.collections.U.c(), new C(a02));
                return z02;
            }
        }
        a11 = Z1.r.a(a02.u0(), a02.l0());
        z02 = y12.z0((int) (a11 >> 32), (int) (a11 & 4294967295L), kotlin.collections.U.c(), new C(a02));
        return z02;
    }
}
