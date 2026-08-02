package j$.util.stream;

import java.util.function.IntBinaryOperator;

/* loaded from: classes2.dex */
public final class n4 extends x3 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ IntBinaryOperator f18004h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f18005i;

    @Override // j$.util.stream.x3
    public final s4 C0() {
        return new m4(this.f18005i, this.f18004h);
    }

    public n4(d7 d7Var, IntBinaryOperator intBinaryOperator, int i5) {
        this.f18004h = intBinaryOperator;
        this.f18005i = i5;
    }
}
