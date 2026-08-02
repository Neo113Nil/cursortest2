package j$.util.function;

import java.util.function.Function;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17716a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function f17717b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function f17718c;

    public /* synthetic */ c(Function function, Function function2, int i5) {
        this.f17716a = i5;
        this.f17717b = function;
        this.f17718c = function2;
    }

    public final /* synthetic */ Function andThen(Function function) {
        switch (this.f17716a) {
        }
        return Function$CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.f17716a) {
        }
        return Function$CC.$default$compose(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f17716a) {
            case 0:
                return this.f17718c.apply(this.f17717b.apply(obj));
            default:
                return this.f17717b.apply(this.f17718c.apply(obj));
        }
    }
}
