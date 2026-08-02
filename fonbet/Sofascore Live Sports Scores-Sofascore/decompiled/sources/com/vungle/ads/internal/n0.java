package com.vungle.ads.internal;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class n0 {
    public final Context a;
    public final DisplayMetrics b;

    public n0(Context context) {
        context.getClass();
        this.a = context;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.b = displayMetrics;
        Object systemService = context.getSystemService("window");
        systemService.getClass();
        ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n0) && Intrinsics.c(this.a, ((n0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("DeviceScreenInfo(context=");
        a.append(this.a);
        a.append(')');
        return a.toString();
    }
}
