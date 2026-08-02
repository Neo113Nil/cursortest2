package com.vk.push.core.data.source;

import android.content.Context;
import com.vk.push.core.utils.PackageExtenstionsKt;
import com.vk.push.core.utils.ProcessUtilsKt;

/* compiled from: CallingAppDataSource.kt */
/* loaded from: classes5.dex */
public final class CallingAppDataSource {
    public final Context a;

    public CallingAppDataSource(Context context) {
        this.a = context;
    }

    public final String getPackageNameForPid(int i) {
        return ProcessUtilsKt.getPackageNameForPid(this.a, i);
    }

    public final String getPackageNameForUid(int i) {
        return this.a.getPackageManager().getNameForUid(i);
    }

    public final String getSignatureForPackageName(String str) {
        return PackageExtenstionsKt.getApplicationSignature(this.a, str);
    }
}
