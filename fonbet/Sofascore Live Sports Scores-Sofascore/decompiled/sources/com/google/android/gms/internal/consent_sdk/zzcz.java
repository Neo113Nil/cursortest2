package com.google.android.gms.internal.consent_sdk;

import android.os.Handler;
import android.os.Looper;
import defpackage.a70;
import defpackage.xx3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcz {
    public static final Handler a = new Handler(Looper.getMainLooper());
    public static final xx3 b = new xx3();

    public static void a() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        a70.r("Method must be call on main thread.");
    }
}
