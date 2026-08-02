package com.vk.di.scope;

import xsna.pwj0;
import xsna.uaj0;
import xsna.x7m;

/* compiled from: SharedScope.kt */
/* loaded from: classes18.dex */
public final class SharedScope extends x7m<uaj0, pwj0> {
    public static final SharedScope a = new SharedScope();
    public static final uaj0 b = new uaj0();
    public static final SingletonScope c = SingletonScope.a;

    private SharedScope() {
    }

    @Override // xsna.x7m
    public final pwj0 a() {
        return b;
    }

    @Override // xsna.x7m
    public final x7m<pwj0, ?> b() {
        return c;
    }
}
