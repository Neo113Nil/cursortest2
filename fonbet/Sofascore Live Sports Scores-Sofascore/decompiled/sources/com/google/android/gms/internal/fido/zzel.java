package com.google.android.gms.internal.fido;

import android.os.Build;
import dalvik.system.VMStack;
import defpackage.m4o;
import defpackage.n4o;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzel extends zzeg {
    static {
        try {
            Class.forName("dalvik.system.VMStack").getMethod("getStackClass2", null);
            n4o.class.getName().equals(a());
        } catch (Throwable unused) {
        }
        String str = Build.FINGERPRINT;
        if (str != null) {
            "robolectric".equals(str);
        }
        new m4o();
    }

    public static String a() {
        try {
            return VMStack.getStackClass2().getName();
        } catch (Throwable unused) {
            return null;
        }
    }
}
