package com.google.android.play.core.integrity;

import Qa.AbstractC1518h;
import android.content.Context;

/* loaded from: classes3.dex */
final class z {

    /* renamed from: a, reason: collision with root package name */
    private static s f36657a;

    public static synchronized s a(Context context) {
        s sVar;
        synchronized (z.class) {
            try {
                if (f36657a == null) {
                    q qVar = new q(null);
                    qVar.a(AbstractC1518h.a(context));
                    f36657a = qVar.b();
                }
                sVar = f36657a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sVar;
    }
}
