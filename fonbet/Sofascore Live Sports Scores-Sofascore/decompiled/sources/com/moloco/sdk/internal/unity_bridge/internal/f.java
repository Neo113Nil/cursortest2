package com.moloco.sdk.internal.unity_bridge.internal;

import android.os.Handler;
import android.os.Looper;
import defpackage.a70;
import defpackage.wh3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class f {
    public final wh3 a = new wh3();

    public static Handler a() {
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            return new Handler(myLooper);
        }
        a70.l(Thread.currentThread(), " that has not called Looper.prepare()", "Can't create handler inside thread ");
        return null;
    }
}
