package com.google.android.gms.ads.internal.util;

import android.view.View;
import android.view.ViewParent;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzab {
    public static boolean zza(View view) {
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent.getClass().getName().startsWith("androidx.compose.ui")) {
                return true;
            }
        }
        return false;
    }
}
