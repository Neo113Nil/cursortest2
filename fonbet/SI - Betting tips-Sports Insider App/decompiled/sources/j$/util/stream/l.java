package j$.util.stream;

import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final class l implements Collector {

    /* renamed from: a, reason: collision with root package name */
    public final Supplier f17957a;

    /* renamed from: b, reason: collision with root package name */
    public final BiConsumer f17958b;

    /* renamed from: c, reason: collision with root package name */
    public final BinaryOperator f17959c;

    /* renamed from: d, reason: collision with root package name */
    public final Function f17960d;

    /* renamed from: e, reason: collision with root package name */
    public final Set f17961e;

    public l(Supplier supplier, BiConsumer biConsumer, BinaryOperator binaryOperator, Function function, Set set) {
        this.f17957a = supplier;
        this.f17958b = biConsumer;
        this.f17959c = binaryOperator;
        this.f17960d = function;
        this.f17961e = set;
    }

    @Override // j$.util.stream.Collector
    public final BiConsumer accumulator() {
        return this.f17958b;
    }

    @Override // j$.util.stream.Collector
    public final Supplier supplier() {
        return this.f17957a;
    }

    @Override // j$.util.stream.Collector
    public final BinaryOperator combiner() {
        return this.f17959c;
    }

    @Override // j$.util.stream.Collector
    public final Function finisher() {
        return this.f17960d;
    }

    @Override // j$.util.stream.Collector
    public final Set characteristics() {
        return this.f17961e;
    }
}
