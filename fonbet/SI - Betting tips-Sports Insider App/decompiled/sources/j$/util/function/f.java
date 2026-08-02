package j$.util.function;

import java.util.function.Predicate;

/* loaded from: classes2.dex */
public final /* synthetic */ class f implements Predicate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17723a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Predicate f17724b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Predicate f17725c;

    public /* synthetic */ f(Predicate predicate, Predicate predicate2, int i5) {
        this.f17723a = i5;
        this.f17724b = predicate;
        this.f17725c = predicate2;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.f17723a) {
        }
        return Predicate$CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        switch (this.f17723a) {
        }
        return Predicate$CC.$default$negate(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.f17723a) {
        }
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f17723a) {
            case 0:
                return this.f17724b.test(obj) && this.f17725c.test(obj);
            default:
                return this.f17724b.test(obj) || this.f17725c.test(obj);
        }
    }
}
