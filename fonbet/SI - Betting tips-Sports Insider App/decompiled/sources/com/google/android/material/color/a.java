package com.google.android.material.color;

import android.os.Build;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static ColorResourcesOverride a() {
        int i5 = Build.VERSION.SDK_INT;
        if (30 <= i5 && i5 <= 33) {
            return ResourcesLoaderColorResourcesOverride.getInstance();
        }
        if (i5 >= 34) {
            return ResourcesLoaderColorResourcesOverride.getInstance();
        }
        return null;
    }
}
