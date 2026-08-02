package com.facebook.ads.internal.util.common;

import android.os.Looper;
import androidx.annotation.Keep;
import com.facebook.infer.annotation.Nullsafe;
import defpackage.a70;
import defpackage.cp4;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes2.dex */
public final class Preconditions {
    public static void checkIsOnMainThread() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        cp4.h("Must be called from the UiThread");
    }

    public static void checkIsTrue(boolean z, String str) {
        if (z) {
            return;
        }
        a70.p(str);
    }

    public static <T> T checkNotNull(T t, String str) {
        if (t != null) {
            return t;
        }
        a70.p(str);
        return null;
    }
}
