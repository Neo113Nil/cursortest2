package j$.util.stream;

import java.util.function.LongBinaryOperator;

/* loaded from: classes2.dex */
public final class y3 extends x3 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ LongBinaryOperator f18162h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f18163i;

    @Override // j$.util.stream.x3
    public final s4 C0() {
        return new q4(this.f18163i, this.f18162h);
    }

    public y3(d7 d7Var, LongBinaryOperator longBinaryOperator, long j) {
        this.f18162h = longBinaryOperator;
        this.f18163i = j;
    }
}
