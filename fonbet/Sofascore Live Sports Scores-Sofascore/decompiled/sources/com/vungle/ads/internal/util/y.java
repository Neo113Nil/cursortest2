package com.vungle.ads.internal.util;

import android.os.Handler;
import android.os.Looper;
import defpackage.iy;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class y {
    public static final Handler a = new Handler(Looper.getMainLooper());

    public static void a(Function0 function0) {
        function0.getClass();
        if (a()) {
            function0.invoke();
        } else {
            a.post(new iy(11, function0));
        }
    }

    public static final void b(Function0 function0) {
        function0.getClass();
        function0.invoke();
    }

    public static boolean a() {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper == null) {
            return false;
        }
        return mainLooper.isCurrentThread();
    }
}
