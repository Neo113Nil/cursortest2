package com.moloco.sdk.internal;

import com.moloco.sdk.service_locator.a;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes7.dex */
public final class h {
    public static final Lazy a = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.internal.h$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return h.b();
        }
    });

    public static final f a() {
        return c();
    }

    public static final g b() {
        return new g(a.i.a.c());
    }

    public static final g c() {
        return (g) a.getValue();
    }
}
