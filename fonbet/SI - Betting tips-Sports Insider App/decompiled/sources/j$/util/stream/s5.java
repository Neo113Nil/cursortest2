package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final /* synthetic */ class s5 implements IntFunction, Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18077a;

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfRef$$ExternalSyntheticLambda0(Object obj) {
    }

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfRef$$ExternalSyntheticLambda1(Object obj) {
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        int i5 = this.f18077a;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f18077a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i5) {
        switch (this.f18077a) {
            case 0:
                return new Long[i5];
            case 1:
                return new Double[i5];
            case 2:
            case 3:
            default:
                return new Double[i5];
            case 4:
                return new Integer[i5];
            case 5:
                return new Integer[i5];
            case 6:
                return new Long[i5];
            case 7:
                return new Long[i5];
            case 8:
                return new Double[i5];
        }
    }
}
