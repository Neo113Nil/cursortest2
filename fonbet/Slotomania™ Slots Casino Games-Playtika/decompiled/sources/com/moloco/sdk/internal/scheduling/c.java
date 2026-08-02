package com.moloco.sdk.internal.scheduling;

import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* loaded from: classes7.dex */
public final class c {
    public static final c a = new c();
    public static final CoroutineScope b = CoroutineScopeKt.CoroutineScope(b.a().getIo());
    public static final CoroutineScope c = CoroutineScopeKt.CoroutineScope(b.a().getDefault());
    public static final int d = 8;

    public final CoroutineScope a() {
        return c;
    }

    public final CoroutineScope b() {
        return b;
    }
}
