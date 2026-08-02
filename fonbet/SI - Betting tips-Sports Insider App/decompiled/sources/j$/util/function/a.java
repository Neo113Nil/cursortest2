package j$.util.function;

import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements BinaryOperator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17712a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Comparator f17713b;

    public /* synthetic */ a(Comparator comparator, int i5) {
        this.f17712a = i5;
        this.f17713b = comparator;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        switch (this.f17712a) {
        }
        return BiFunction$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        switch (this.f17712a) {
            case 0:
                if (this.f17713b.compare(obj, obj2) < 0) {
                    break;
                }
                break;
            default:
                if (this.f17713b.compare(obj, obj2) > 0) {
                    break;
                }
                break;
        }
        return obj2;
    }
}
