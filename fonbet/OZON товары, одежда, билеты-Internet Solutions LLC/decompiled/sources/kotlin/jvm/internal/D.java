package kotlin.jvm.internal;

import kotlin.reflect.o;

/* loaded from: classes.dex */
public abstract class D extends H implements kotlin.reflect.o {
    public D() {
    }

    @Override // kotlin.jvm.internal.AbstractC7724f
    protected kotlin.reflect.c computeReflected() {
        return N.h(this);
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return get(obj);
    }

    public D(Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, i11);
    }

    @Override // kotlin.reflect.m
    public o.a getGetter() {
        return ((kotlin.reflect.o) getReflected()).getGetter();
    }
}
