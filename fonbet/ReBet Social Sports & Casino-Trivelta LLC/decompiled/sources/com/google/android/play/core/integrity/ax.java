package com.google.android.play.core.integrity;

import Qa.AbstractC1518h;
import android.content.Context;

/* loaded from: classes3.dex */
final class ax {

    /* renamed from: a, reason: collision with root package name */
    private static aw f36573a;

    public static synchronized aw a(Context context) {
        aw awVar;
        synchronized (ax.class) {
            try {
                if (f36573a == null) {
                    u uVar = new u(null);
                    uVar.a(AbstractC1518h.a(context));
                    f36573a = uVar.b();
                }
                awVar = f36573a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return awVar;
    }
}
