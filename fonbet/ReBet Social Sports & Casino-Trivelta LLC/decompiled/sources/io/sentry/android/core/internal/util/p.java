package io.sentry.android.core.internal.util;

import io.sentry.protocol.C4804f;

/* loaded from: classes3.dex */
public abstract class p {
    public static C4804f.b a(int i10) {
        if (i10 == 1) {
            return C4804f.b.PORTRAIT;
        }
        if (i10 != 2) {
            return null;
        }
        return C4804f.b.LANDSCAPE;
    }
}
