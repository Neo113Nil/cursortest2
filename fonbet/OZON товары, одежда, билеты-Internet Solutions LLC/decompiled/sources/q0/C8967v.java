package q0;

import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: q0.v, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C8967v extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C8950e f81363b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f81364c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ AbstractC7737t f81365d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C8967v(C8950e c8950e, androidx.compose.ui.e eVar, Function1<? super C8957l, Unit> function1) {
        super(2);
        this.f81363b = c8950e;
        this.f81364c = eVar;
        this.f81365d = (AbstractC7737t) function1;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            ?? r02 = this.f81365d;
            C8950e c8950e = this.f81363b;
            C8969x.a(c8950e, this.f81364c, a1.c.c(1156688164, new C8966u(r02, c8950e), interfaceC3967k2), interfaceC3967k2, 384);
        }
        return Unit.f71690a;
    }
}
