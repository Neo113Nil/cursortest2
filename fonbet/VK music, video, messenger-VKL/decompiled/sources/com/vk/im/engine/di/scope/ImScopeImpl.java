package com.vk.im.engine.di.scope;

import com.vk.di.scope.SharedScope;
import xsna.acw;
import xsna.pwj0;
import xsna.uaj0;
import xsna.x7m;

/* compiled from: ImScopeImpl.kt */
/* loaded from: classes2.dex */
public final class ImScopeImpl extends ImScope {
    public final acw a;
    public final SharedScope b = SharedScope.a;

    public ImScopeImpl(acw acwVar) {
        this.a = acwVar;
    }

    @Override // xsna.x7m
    public final pwj0 a() {
        return this.a;
    }

    @Override // xsna.x7m
    public final x7m<uaj0, ?> b() {
        return this.b;
    }
}
