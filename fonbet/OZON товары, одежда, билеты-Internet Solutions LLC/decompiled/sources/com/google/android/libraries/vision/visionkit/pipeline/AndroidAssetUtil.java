package com.google.android.libraries.vision.visionkit.pipeline;

import android.content.Context;
import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public final class AndroidAssetUtil {
    public static synchronized boolean a(@NonNull Context context) {
        boolean nativeInitializeAssetManager;
        synchronized (AndroidAssetUtil.class) {
            nativeInitializeAssetManager = nativeInitializeAssetManager(context, context.getCacheDir().getAbsolutePath());
        }
        return nativeInitializeAssetManager;
    }

    private static native boolean nativeInitializeAssetManager(Context context, String str);
}
