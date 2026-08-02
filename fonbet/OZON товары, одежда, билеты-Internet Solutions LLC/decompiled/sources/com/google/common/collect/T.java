package com.google.common.collect;

import I3.C3229d;
import java.util.Comparator;

/* loaded from: classes.dex */
public abstract class T<T> implements Comparator<T> {
    protected T() {
    }

    public static T b(C3229d c3229d) {
        return new C5873q(c3229d);
    }

    public static <C extends Comparable> T<C> d() {
        return Q.f59029a;
    }

    public final <U extends T> T<U> a(Comparator<? super U> comparator) {
        return new C5874s(this, comparator);
    }

    public final <F> T<F> e(O7.e<F, ? extends T> eVar) {
        return new C5865i(eVar, this);
    }

    public <S extends T> T<S> f() {
        return new Y(this);
    }
}
