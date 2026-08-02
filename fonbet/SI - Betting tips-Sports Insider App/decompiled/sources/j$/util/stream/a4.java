package j$.util.stream;

import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

/* loaded from: classes2.dex */
public final class a4 extends x3 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f17789h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f17790i;

    public /* synthetic */ a4(d7 d7Var, Object obj, int i5) {
        this.f17789h = i5;
        this.f17790i = obj;
    }

    @Override // j$.util.stream.x3
    public final s4 C0() {
        switch (this.f17789h) {
            case 0:
                return new r4((LongBinaryOperator) this.f17790i);
            case 1:
                return new d4((DoubleBinaryOperator) this.f17790i);
            case 2:
                return new i4((BinaryOperator) this.f17790i);
            default:
                return new o4((IntBinaryOperator) this.f17790i);
        }
    }
}
