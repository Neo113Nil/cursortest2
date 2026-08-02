package com.vk.medianative;

import androidx.annotation.Keep;
import com.vk.log.L;
import com.vk.metrics.eventtracking.b;

/* loaded from: classes.dex */
public class NativeLogger {
    public static boolean a = false;

    /* loaded from: classes3.dex */
    public static class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    @Keep
    public static void logExceptionFromNative(String str) {
        a aVar = new a(str);
        if (a) {
            b.a.q(aVar);
        } else {
            L.i(aVar);
        }
    }
}
