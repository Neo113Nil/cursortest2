package com.unity3d.ads.core.configuration;

import android.content.Context;

/* compiled from: AndroidManifestStringPropertyReader.kt */
/* loaded from: classes14.dex */
public final class AndroidManifestStringPropertyReader {
    private final Context context;

    public AndroidManifestStringPropertyReader(Context context) {
        this.context = context;
    }

    public final String getPropertyByName(String str) {
        try {
            return this.context.getPackageManager().getApplicationInfo(this.context.getPackageName(), 128).metaData.getString(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
