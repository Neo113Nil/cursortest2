package y0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class a0 extends AbstractC7737t implements Function0<Integer> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ b0 f105734b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a0(b0 b0Var) {
        super(0);
        this.f105734b = b0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        int o11;
        b0 b0Var = this.f105734b;
        o11 = b0Var.o(!b0Var.a() ? b0Var.r() : b0.h(b0Var) != -1 ? b0.h(b0Var) : Math.abs(b0Var.s()) >= Math.abs(b0Var.I()) ? b0Var.y() ? b0Var.u() + 1 : b0Var.u() : b0Var.r());
        return Integer.valueOf(o11);
    }
}
