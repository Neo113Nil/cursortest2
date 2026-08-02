package y0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import r0.InterfaceC9106G;

/* loaded from: classes8.dex */
final class U extends AbstractC7737t implements Function2<InterfaceC9106G, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ b0 f105719b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    U(b0 b0Var) {
        super(2);
        this.f105719b = b0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC9106G interfaceC9106G, Integer num) {
        this.f105719b.W(num.intValue());
        return Unit.f71690a;
    }
}
