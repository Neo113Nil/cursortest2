package org.chromium.net.impl;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import org.chromium.net.impl.I;
import xf.C10769a;

/* loaded from: classes6.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    private static I f78866a;

    private J() {
    }

    public static I a(Context context, I.d dVar) {
        I i11;
        synchronized (J.class) {
            if (f78866a == null && Build.VERSION.SDK_INT >= 30 && K.b(context, dVar)) {
                try {
                    f78866a = new C10769a();
                } catch (Exception e11) {
                    Log.e("J", "Exception creating an instance of CronetLoggerImpl", e11);
                }
            }
            if (f78866a == null) {
                f78866a = new X();
            }
            i11 = f78866a;
        }
        return i11;
    }
}
