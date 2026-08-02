package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.BinaryOperator;
import java.util.function.LongFunction;

/* loaded from: classes2.dex */
public final class n2 extends o2 {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f18003k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n2(x3 x3Var, Spliterator spliterator, LongFunction longFunction, BinaryOperator binaryOperator, int i5) {
        super(x3Var, spliterator, longFunction, binaryOperator);
        this.f18003k = i5;
    }

    @Override // j$.util.stream.o2, j$.util.stream.e
    public final e c(Spliterator spliterator) {
        switch (this.f18003k) {
        }
        return new o2(this, spliterator);
    }

    @Override // j$.util.stream.o2, j$.util.stream.e
    public final /* bridge */ /* synthetic */ Object a() {
        switch (this.f18003k) {
        }
        return a();
    }
}
