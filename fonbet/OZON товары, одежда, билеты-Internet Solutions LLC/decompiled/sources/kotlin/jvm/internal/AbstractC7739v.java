package kotlin.jvm.internal;

import kotlin.reflect.j;
import kotlin.reflect.n;

/* renamed from: kotlin.jvm.internal.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7739v extends z implements kotlin.reflect.j {
    public AbstractC7739v() {
    }

    @Override // kotlin.jvm.internal.AbstractC7724f
    protected kotlin.reflect.c computeReflected() {
        return N.e(this);
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return get();
    }

    public AbstractC7739v(Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, i11);
    }

    @Override // kotlin.reflect.m
    public n.a getGetter() {
        return ((kotlin.reflect.j) getReflected()).getGetter();
    }

    @Override // kotlin.reflect.i
    public j.a getSetter() {
        return ((kotlin.reflect.j) getReflected()).getSetter();
    }
}
