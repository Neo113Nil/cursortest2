package io.sentry.android.core;

import android.content.Context;
import io.sentry.InterfaceC4839u0;

/* loaded from: classes3.dex */
public abstract class X {
    public static InterfaceC4839u0 a(Context context, C4683i0 c4683i0) {
        return c4683i0.d() >= 30 ? new AnrV2Integration(context) : new AnrIntegration(context);
    }
}
