package com.google.common.collect;

/* loaded from: classes3.dex */
public class r extends A {

    /* renamed from: g, reason: collision with root package name */
    public static final r f36858g = new r();
    private static final long serialVersionUID = 0;

    public r() {
        super(B.m(), 0);
    }

    private Object readResolve() {
        return f36858g;
    }

    @Override // com.google.common.collect.D, com.google.common.collect.AbstractC3426f, com.google.common.collect.O
    /* renamed from: m */
    public B asMap() {
        return super.asMap();
    }
}
