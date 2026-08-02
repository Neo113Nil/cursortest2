package j$.util;

import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.IntStream;
import j$.util.stream.Stream;
import j$.util.stream.b7;
import j$.util.stream.g8;
import j$.util.stream.n5;
import j$.util.stream.n7;
import j$.util.stream.p7;
import j$.util.stream.r7;
import j$.util.stream.z6;
import java.util.EnumMap;
import java.util.Map;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.LongFunction;
import java.util.function.Predicate;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

/* loaded from: classes2.dex */
public final /* synthetic */ class p implements Consumer, Predicate, DoubleFunction, Function, LongFunction, BooleanSupplier {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17765a;

    /* renamed from: b, reason: collision with root package name */
    public Object f17766b;

    public /* synthetic */ p(int i5) {
        this.f17765a = i5;
    }

    public /* synthetic */ p(int i5, Object obj) {
        this.f17765a = i5;
        this.f17766b = obj;
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate$CC.$default$and(this, predicate);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f17765a) {
            case 0:
                break;
            case 5:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public /* synthetic */ Function andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    public /* synthetic */ Predicate negate() {
        return Predicate$CC.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public boolean test(Object obj) {
        return !((Predicate) this.f17766b).test(obj);
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        Object apply = ((Function) this.f17766b).apply(obj);
        if (apply == null) {
            return null;
        }
        if (apply instanceof Stream) {
            return Stream.Wrapper.convert((Stream) apply);
        }
        if (apply instanceof java.util.stream.Stream) {
            return z6.f((java.util.stream.Stream) apply);
        }
        if (apply instanceof IntStream) {
            return IntStream.Wrapper.convert((IntStream) apply);
        }
        if (apply instanceof java.util.stream.IntStream) {
            return IntStream.VivifiedWrapper.convert((java.util.stream.IntStream) apply);
        }
        if (apply instanceof j$.util.stream.e0) {
            return j$.util.stream.d0.f((j$.util.stream.e0) apply);
        }
        if (apply instanceof DoubleStream) {
            return j$.util.stream.c0.f((DoubleStream) apply);
        }
        if (apply instanceof j$.util.stream.n1) {
            return j$.util.stream.m1.f((j$.util.stream.n1) apply);
        }
        if (apply instanceof LongStream) {
            return j$.util.stream.l1.f((LongStream) apply);
        }
        f.a(apply.getClass(), "java.util.stream.*Stream");
        throw null;
    }

    @Override // java.util.function.DoubleFunction
    public Object apply(double d10) {
        Object apply = ((DoubleFunction) this.f17766b).apply(d10);
        if (apply == null) {
            return null;
        }
        if (apply instanceof j$.util.stream.e0) {
            return j$.util.stream.d0.f((j$.util.stream.e0) apply);
        }
        if (apply instanceof DoubleStream) {
            return j$.util.stream.c0.f((DoubleStream) apply);
        }
        f.a(apply.getClass(), "java.util.stream.DoubleStream");
        throw null;
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j) {
        Object apply = ((LongFunction) this.f17766b).apply(j);
        if (apply == null) {
            return null;
        }
        if (apply instanceof j$.util.stream.n1) {
            return j$.util.stream.m1.f((j$.util.stream.n1) apply);
        }
        if (apply instanceof LongStream) {
            return j$.util.stream.l1.f((LongStream) apply);
        }
        f.a(apply.getClass(), "java.util.stream.LongStream");
        throw null;
    }

    @Override // java.util.function.BooleanSupplier
    public boolean getAsBoolean() {
        switch (this.f17765a) {
            case 8:
                n7 n7Var = (n7) this.f17766b;
                return n7Var.f17878d.tryAdvance(n7Var.f17879e);
            case 9:
                p7 p7Var = (p7) this.f17766b;
                return p7Var.f17878d.tryAdvance(p7Var.f17879e);
            case 10:
                r7 r7Var = (r7) this.f17766b;
                return r7Var.f17878d.tryAdvance(r7Var.f17879e);
            default:
                g8 g8Var = (g8) this.f17766b;
                return g8Var.f17878d.tryAdvance(g8Var.f17879e);
        }
    }

    public void a(b7 b7Var) {
        ((EnumMap) ((java.util.Map) this.f17766b)).put((EnumMap) b7Var, (b7) 1);
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        switch (this.f17765a) {
            case 0:
                ((Consumer) this.f17766b).accept(new q((Map.Entry) obj));
                break;
            case 5:
                ((n5) this.f17766b).accept((n5) obj);
                break;
            default:
                ((java.util.List) this.f17766b).add(obj);
                break;
        }
    }
}
