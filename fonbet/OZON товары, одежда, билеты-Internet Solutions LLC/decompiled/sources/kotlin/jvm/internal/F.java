package kotlin.jvm.internal;

import kotlin.reflect.p;

/* loaded from: classes.dex */
public abstract class F extends H implements kotlin.reflect.p {
    @Override // kotlin.jvm.internal.AbstractC7724f
    protected final kotlin.reflect.c computeReflected() {
        return N.i(this);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((G) this).getGetter().call(obj, obj2);
    }

    @Override // kotlin.reflect.m
    public final p.a getGetter() {
        return ((kotlin.reflect.p) getReflected()).getGetter();
    }
}
