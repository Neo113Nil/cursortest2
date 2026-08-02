package q0;

import S0.InterfaceC3967k;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import u0.InterfaceC9895d;

/* renamed from: q0.u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C8966u extends AbstractC7737t implements InterfaceC6511n<InterfaceC9895d, InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC7737t f81361b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C8950e f81362c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C8966u(Function1<? super C8957l, Unit> function1, C8950e c8950e) {
        super(3);
        this.f81361b = (AbstractC7737t) function1;
        this.f81362c = c8950e;
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    @Override // fd.InterfaceC6511n
    public final Unit invoke(InterfaceC9895d interfaceC9895d, InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 17) == 16 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            Object C11 = interfaceC3967k2.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = new C8957l();
                interfaceC3967k2.x(C11);
            }
            C8957l c8957l = (C8957l) C11;
            c8957l.b();
            this.f81361b.invoke(c8957l);
            c8957l.a(this.f81362c, interfaceC3967k2, 0);
        }
        return Unit.f71690a;
    }
}
