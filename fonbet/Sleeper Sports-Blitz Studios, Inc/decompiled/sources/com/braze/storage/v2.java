package com.braze.storage;

import android.content.Context;
import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class v2 {

    /* renamed from: a, reason: collision with root package name */
    public final u2 f761a;

    public v2(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f761a = new u2(context);
    }

    public final boolean a() {
        return Intrinsics.areEqual(this.f761a.readBoolean(DataStoreKey.SDK_ENABLEMENT, Boolean.FALSE), Boolean.TRUE);
    }

    public final void b(final boolean z) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.storage.v2$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return v2.a(z);
            }
        }, 6, (Object) null);
        this.f761a.writeData(DataStoreKey.SDK_ENABLEMENT, Boolean.valueOf(z));
    }

    public static final String a(boolean z) {
        return "Setting Braze SDK disabled to: " + z;
    }
}
