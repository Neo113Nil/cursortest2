package com.moloco.sdk.internal;

import com.moloco.sdk.service_locator.a;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes7.dex */
public final class y {
    public static final Lazy a = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.internal.y$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return y.a();
        }
    });
    public static final String b = "[ERROR_CODE]";
    public static final String c = "[HAPPENED_AT_TS]";

    public static final x a() {
        return new x(a.i.a.c());
    }

    public static final w b() {
        return c();
    }

    public static final x c() {
        return (x) a.getValue();
    }
}
