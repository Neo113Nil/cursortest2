package y0;

import S0.A1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: y0.j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C10803j extends AbstractC7737t implements Function0<F> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ A1<D> f105828b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ b0 f105829c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10803j(A1<D> a12, b0 b0Var) {
        super(0);
        this.f105828b = a12;
        this.f105829c = b0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final F invoke() {
        D value = this.f105828b.getValue();
        b0 b0Var = this.f105829c;
        return new F(b0Var, value, new x0.a0(b0Var.B(), value));
    }
}
