package com.moloco.sdk.internal.services;

import android.os.SystemClock;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

/* loaded from: classes6.dex */
public final class K implements J {
    public static final int a = 0;

    @Override // com.moloco.sdk.internal.services.J
    public long a() {
        return System.currentTimeMillis();
    }

    @Override // com.moloco.sdk.internal.services.J
    public long elapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.moloco.sdk.internal.services.J
    @Deprecated(message = "Use currentTime() instead", replaceWith = @ReplaceWith(expression = "currentTime()", imports = {}))
    public long invoke() {
        return System.currentTimeMillis();
    }
}
