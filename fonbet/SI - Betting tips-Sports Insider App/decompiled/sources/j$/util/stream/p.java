package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class p extends d5 {
    public static m2 S0(x3 x3Var, Spliterator spliterator) {
        k kVar = new k(3);
        j$.time.x xVar = new j$.time.x(11);
        j$.time.x xVar2 = new j$.time.x(12);
        Objects.requireNonNull(kVar);
        Objects.requireNonNull(xVar);
        Objects.requireNonNull(xVar2);
        return new m2((Collection) new c4(d7.REFERENCE, xVar2, xVar, kVar, 3).i(x3Var, spliterator));
    }

    @Override // j$.util.stream.b
    public final i2 L0(x3 x3Var, Spliterator spliterator, IntFunction intFunction) {
        b bVar = (b) x3Var;
        if (c7.DISTINCT.n(bVar.f17804m)) {
            return x3Var.j0(spliterator, false, intFunction);
        }
        if (c7.ORDERED.n(bVar.f17804m)) {
            return S0(x3Var, spliterator);
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        j$.util.concurrent.r rVar = new j$.util.concurrent.r(4, atomicBoolean, concurrentHashMap);
        Objects.requireNonNull(rVar);
        new q0(rVar, false).a(x3Var, spliterator);
        Collection keySet = concurrentHashMap.keySet();
        if (atomicBoolean.get()) {
            HashSet hashSet = new HashSet(keySet);
            hashSet.add(null);
            keySet = hashSet;
        }
        return new m2(keySet);
    }

    @Override // j$.util.stream.b
    public final Spliterator M0(b bVar, Spliterator spliterator) {
        if (c7.DISTINCT.n(bVar.f17804m)) {
            return bVar.F0(spliterator);
        }
        if (c7.ORDERED.n(bVar.f17804m)) {
            return S0(bVar, spliterator).spliterator();
        }
        return new l7(bVar.F0(spliterator), new ConcurrentHashMap());
    }

    @Override // j$.util.stream.b
    public final n5 O0(int i5, n5 n5Var) {
        Objects.requireNonNull(n5Var);
        if (c7.DISTINCT.n(i5)) {
            return n5Var;
        }
        if (c7.SORTED.n(i5)) {
            return new n(n5Var);
        }
        return new o(n5Var);
    }
}
