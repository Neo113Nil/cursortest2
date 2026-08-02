package y0;

import hd.C6915b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import r0.C9112M;

/* loaded from: classes8.dex */
final class g0 extends AbstractC7737t implements Function1<Float, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h0 f105822b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g0(h0 h0Var, C9112M.a aVar) {
        super(1);
        this.f105822b = h0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Float f7) {
        float floatValue = f7.floatValue();
        h0 h0Var = this.f105822b;
        h0Var.c().W(h0Var.c().r() + C6915b.c(h0Var.c().E() != 0 ? floatValue / h0Var.c().E() : 0.0f));
        return Unit.f71690a;
    }
}
