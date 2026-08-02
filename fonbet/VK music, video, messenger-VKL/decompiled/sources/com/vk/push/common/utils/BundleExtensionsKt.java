package com.vk.push.common.utils;

import android.os.Build;
import android.os.Bundle;
import xsna.epx;

/* compiled from: BundleExtensions.kt */
/* loaded from: classes5.dex */
public final class BundleExtensionsKt {
    public static final <T> T getParcelableCompat(Bundle bundle, String str) {
        if (Build.VERSION.SDK_INT < 33) {
            return (T) bundle.getParcelable(str);
        }
        epx.k();
        throw null;
    }
}
