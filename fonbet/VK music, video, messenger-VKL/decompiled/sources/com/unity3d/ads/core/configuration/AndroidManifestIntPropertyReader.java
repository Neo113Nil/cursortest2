package com.unity3d.ads.core.configuration;

import android.content.Context;
import android.os.Bundle;

/* compiled from: AndroidManifestIntPropertyReader.kt */
/* loaded from: classes14.dex */
public final class AndroidManifestIntPropertyReader {
    private final Context context;

    public AndroidManifestIntPropertyReader(Context context) {
        this.context = context;
    }

    public final Integer getPropertyByName(String str) {
        Bundle bundle;
        Integer valueOf;
        try {
            bundle = this.context.getPackageManager().getApplicationInfo(this.context.getPackageName(), 128).metaData;
            valueOf = Integer.valueOf(bundle.getInt(str));
        } catch (Exception unused) {
        }
        if (bundle.containsKey(str)) {
            return valueOf;
        }
        return null;
    }
}
