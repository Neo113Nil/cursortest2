package com.vk.di.scope;

import xsna.pwj0;
import xsna.x7m;

/* compiled from: SingletonScope.kt */
/* loaded from: classes.dex */
public final class SingletonScope extends x7m<pwj0, pwj0> {
    public static final SingletonScope a = new SingletonScope();
    public static final pwj0 b = new pwj0();

    private SingletonScope() {
    }

    @Override // xsna.x7m
    public final pwj0 a() {
        return b;
    }

    @Override // xsna.x7m
    public final x7m<pwj0, ?> b() {
        return null;
    }
}
