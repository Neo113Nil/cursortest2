package com.braze.requests;

import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class m {
    public static final String b(String str) {
        return "No RequestEndpointDestination found for name: " + str;
    }

    public final n a(final String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        try {
            return n.valueOf(name);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.requests.m$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return m.b(name);
                }
            }, 4, (Object) null);
            return null;
        }
    }
}
