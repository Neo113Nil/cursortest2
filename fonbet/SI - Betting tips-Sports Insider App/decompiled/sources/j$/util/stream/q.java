package j$.util.stream;

import j$.util.function.BiFunction$CC;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/* loaded from: classes2.dex */
public final /* synthetic */ class q implements BinaryOperator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18042a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BiConsumer f18043b;

    public /* synthetic */ q(BiConsumer biConsumer, int i5) {
        this.f18042a = i5;
        this.f18043b = biConsumer;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        switch (this.f18042a) {
        }
        return BiFunction$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        switch (this.f18042a) {
            case 0:
                this.f18043b.accept(obj, obj2);
                break;
            case 1:
                this.f18043b.accept(obj, obj2);
                break;
            default:
                this.f18043b.accept(obj, obj2);
                break;
        }
        return obj;
    }
}
