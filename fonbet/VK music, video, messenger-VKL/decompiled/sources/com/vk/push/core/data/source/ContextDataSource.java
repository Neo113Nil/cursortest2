package com.vk.push.core.data.source;

import android.content.Context;
import com.vk.push.core.utils.PackageExtenstionsKt;

/* compiled from: ContextDataSource.kt */
/* loaded from: classes.dex */
public final class ContextDataSource {
    public final Context a;

    public ContextDataSource(Context context) {
        this.a = context;
    }

    public final String getPackageName() {
        return this.a.getPackageName();
    }

    public final boolean isIgnoringBatteryOptimizations() {
        return PackageExtenstionsKt.isIgnoringBatteryOptimizations$default(this.a, null, 1, null);
    }
}
