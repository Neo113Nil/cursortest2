package j$.util.concurrent;

import j$.util.Spliterator;
import j$.util.function.BiConsumer$CC;
import j$.util.function.BiFunction$CC;
import j$.util.function.Consumer$CC;
import j$.util.stream.c7;
import j$.util.stream.d7;
import j$.util.stream.i8;
import j$.util.stream.l7;
import j$.util.stream.u1;
import j$.util.stream.v1;
import j$.util.stream.w1;
import j$.util.stream.x3;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final /* synthetic */ class r implements BiConsumer, BiFunction, Consumer, i8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17682a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f17683b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f17684c;

    public /* synthetic */ r(int i5, Object obj, Object obj2) {
        this.f17682a = i5;
        this.f17683b = obj;
        this.f17684c = obj2;
    }

    public /* synthetic */ r(BiFunction biFunction, Function function) {
        this.f17682a = 2;
        this.f17684c = biFunction;
        this.f17683b = function;
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.f17682a) {
        }
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction$CC.$default$andThen(this, function);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f17682a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        return ((Function) this.f17683b).apply(((BiFunction) this.f17684c).apply(obj, obj2));
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.f17682a) {
            case 0:
                ConcurrentMap concurrentMap = (ConcurrentMap) this.f17683b;
                BiFunction biFunction = (BiFunction) this.f17684c;
                while (!concurrentMap.replace(obj, obj2, biFunction.apply(obj, obj2)) && (obj2 = concurrentMap.get(obj)) != null) {
                }
            default:
                BiConsumer biConsumer = (BiConsumer) this.f17683b;
                BiConsumer biConsumer2 = (BiConsumer) this.f17684c;
                biConsumer.accept(obj, obj2);
                biConsumer2.accept(obj, obj2);
                break;
        }
    }

    public r(d7 d7Var, v1 v1Var, Supplier supplier) {
        this.f17682a = 5;
        this.f17683b = v1Var;
        this.f17684c = supplier;
    }

    @Override // j$.util.stream.i8
    public int v() {
        return c7.f17840u | c7.f17837r;
    }

    @Override // j$.util.stream.i8
    public Object f(j$.util.stream.b bVar, Spliterator spliterator) {
        u1 u1Var = (u1) ((Supplier) this.f17684c).get();
        bVar.D0(spliterator, u1Var);
        return Boolean.valueOf(u1Var.f18098b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j$.util.stream.i8
    public Object i(x3 x3Var, Spliterator spliterator) {
        return (Boolean) new w1(this, (j$.util.stream.b) x3Var, spliterator).invoke();
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public void n(Object obj) {
        switch (this.f17682a) {
            case 3:
                Consumer consumer = (Consumer) this.f17683b;
                Consumer consumer2 = (Consumer) this.f17684c;
                consumer.n(obj);
                consumer2.n(obj);
                break;
            case 4:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f17683b;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f17684c;
                if (obj != null) {
                    concurrentHashMap.putIfAbsent(obj, Boolean.TRUE);
                    break;
                } else {
                    atomicBoolean.set(true);
                    break;
                }
            case 5:
            default:
                l7 l7Var = (l7) this.f17683b;
                Consumer consumer3 = (Consumer) this.f17684c;
                if (l7Var.f17978b.putIfAbsent(obj != null ? obj : l7.f17976d, Boolean.TRUE) == null) {
                    consumer3.n(obj);
                    break;
                }
                break;
            case 6:
                ((BiConsumer) this.f17683b).accept(this.f17684c, obj);
                break;
        }
    }
}
