package y0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class Z extends AbstractC7737t implements Function0<Integer> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ b0 f105731b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Z(b0 b0Var) {
        super(0);
        this.f105731b = b0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        b0 b0Var = this.f105731b;
        return Integer.valueOf(b0Var.a() ? b0.i(b0Var) : b0Var.r());
    }
}
