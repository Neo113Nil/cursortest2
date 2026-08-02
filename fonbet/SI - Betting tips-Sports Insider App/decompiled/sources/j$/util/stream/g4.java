package j$.util.stream;

import java.util.function.DoubleBinaryOperator;

/* loaded from: classes2.dex */
public final class g4 extends x3 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ DoubleBinaryOperator f17910h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ double f17911i;

    @Override // j$.util.stream.x3
    public final s4 C0() {
        return new b4(this.f17911i, this.f17910h);
    }

    public g4(d7 d7Var, DoubleBinaryOperator doubleBinaryOperator, double d10) {
        this.f17910h = doubleBinaryOperator;
        this.f17911i = d10;
    }
}
