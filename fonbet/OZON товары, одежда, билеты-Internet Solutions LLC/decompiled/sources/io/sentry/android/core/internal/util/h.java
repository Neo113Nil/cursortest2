package io.sentry.android.core.internal.util;

import io.sentry.protocol.C7189e;

/* loaded from: classes10.dex */
public final class h {
    public static C7189e.b a(int i11) {
        if (i11 == 1) {
            return C7189e.b.PORTRAIT;
        }
        if (i11 != 2) {
            return null;
        }
        return C7189e.b.LANDSCAPE;
    }
}
