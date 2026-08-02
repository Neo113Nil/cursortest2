package kotlin.jvm.internal;

import kotlin.reflect.n;

/* loaded from: classes.dex */
public abstract class B extends H implements kotlin.reflect.n {
    public B() {
    }

    @Override // kotlin.jvm.internal.AbstractC7724f
    protected kotlin.reflect.c computeReflected() {
        return N.g(this);
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return get();
    }

    public B(Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, i11);
    }

    @Override // kotlin.reflect.m
    public n.a getGetter() {
        return ((kotlin.reflect.n) getReflected()).getGetter();
    }
}
