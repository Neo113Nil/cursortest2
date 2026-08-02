package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final class c4 extends x3 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f17822h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f17823i;
    public final /* synthetic */ Object j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f17824k;

    public /* synthetic */ c4(d7 d7Var, Object obj, Object obj2, Object obj3, int i5) {
        this.f17822h = i5;
        this.j = obj;
        this.f17824k = obj2;
        this.f17823i = obj3;
    }

    @Override // j$.util.stream.x3
    public final s4 C0() {
        switch (this.f17822h) {
            case 0:
                return new z3((Supplier) this.f17823i, (ObjLongConsumer) this.f17824k, (q) this.j);
            case 1:
                return new f4((Supplier) this.f17823i, (ObjDoubleConsumer) this.f17824k, (q) this.j);
            case 2:
                return new h4(this.f17823i, (BiFunction) this.f17824k, (BinaryOperator) this.j);
            case 3:
                return new l4((Supplier) this.f17823i, (BiConsumer) this.f17824k, (BiConsumer) this.j);
            default:
                return new p4((Supplier) this.f17823i, (ObjIntConsumer) this.f17824k, (q) this.j);
        }
    }
}
