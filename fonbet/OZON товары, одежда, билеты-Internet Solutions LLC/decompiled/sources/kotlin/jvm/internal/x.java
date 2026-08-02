package kotlin.jvm.internal;

import kotlin.reflect.k;
import kotlin.reflect.o;

/* loaded from: classes.dex */
public abstract class x extends z implements kotlin.reflect.k {
    @Override // kotlin.jvm.internal.AbstractC7724f
    protected final kotlin.reflect.c computeReflected() {
        return N.f(this);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((y) this).get(obj);
    }

    @Override // kotlin.reflect.m
    public final o.a getGetter() {
        return ((kotlin.reflect.k) getReflected()).getGetter();
    }

    @Override // kotlin.reflect.i
    public final k.a getSetter() {
        return ((kotlin.reflect.k) getReflected()).getSetter();
    }
}
