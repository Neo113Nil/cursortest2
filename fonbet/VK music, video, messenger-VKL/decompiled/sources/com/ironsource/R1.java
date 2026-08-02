package com.ironsource;

import android.os.Looper;
import android.util.Log;
import xsna.epx;
import xsna.zcl;

/* loaded from: classes13.dex */
public final class R1 {
    public static final a a = new a(null);

    public static final class a {
        public /* synthetic */ a(zcl zclVar) {
            this();
        }

        public final void a() {
            if (epx.f(Looper.myLooper(), Looper.getMainLooper())) {
                Log.e("AssertThread", "ALERT UI THREAD: " + Thread.currentThread().getStackTrace()[4].getMethodName());
            }
        }

        private a() {
        }
    }

    public static final void a() {
        a.a();
    }
}
