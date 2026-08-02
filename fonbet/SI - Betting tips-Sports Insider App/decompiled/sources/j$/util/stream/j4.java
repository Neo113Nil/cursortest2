package j$.util.stream;

import j$.util.stream.Collector;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final class j4 extends x3 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ BinaryOperator f17938h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ BiConsumer f17939i;
    public final /* synthetic */ Supplier j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Collector f17940k;

    @Override // j$.util.stream.x3
    public final s4 C0() {
        return new k4(this.j, this.f17939i, this.f17938h);
    }

    @Override // j$.util.stream.x3, j$.util.stream.i8
    public final int v() {
        if (this.f17940k.characteristics().contains(Collector.Characteristics.UNORDERED)) {
            return c7.f17837r;
        }
        return 0;
    }

    public j4(d7 d7Var, BinaryOperator binaryOperator, BiConsumer biConsumer, Supplier supplier, Collector collector) {
        this.f17938h = binaryOperator;
        this.f17939i = biConsumer;
        this.j = supplier;
        this.f17940k = collector;
    }
}
