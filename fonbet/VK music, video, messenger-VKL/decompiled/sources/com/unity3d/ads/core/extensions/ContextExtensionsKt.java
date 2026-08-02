package com.unity3d.ads.core.extensions;

import android.content.Context;
import com.unity3d.services.UnityAdsConstants;
import java.io.File;

/* compiled from: ContextExtensions.kt */
/* loaded from: classes14.dex */
public final class ContextExtensionsKt {
    public static final File unityAdsDataStoreFile(Context context, String str) {
        return new File(context.getApplicationContext().getFilesDir(), UnityAdsConstants.Cache.DATASTORE_PATH.concat(str));
    }
}
