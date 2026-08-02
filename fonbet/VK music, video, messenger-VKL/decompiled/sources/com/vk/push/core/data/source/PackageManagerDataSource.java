package com.vk.push.core.data.source;

import android.content.pm.PackageManager;
import com.vk.push.core.utils.PackageExtenstionsKt;
import java.util.List;

/* compiled from: PackageManagerDataSource.kt */
/* loaded from: classes5.dex */
public final class PackageManagerDataSource {
    public final PackageManager a;

    public PackageManagerDataSource(PackageManager packageManager) {
        this.a = packageManager;
    }

    public final boolean checkPackageNameIsInstalled(String str) {
        return PackageExtenstionsKt.checkAppInstalled(this.a, str);
    }

    public final List<String> getInitializedClientPackages() {
        return PackageExtenstionsKt.getPackagesWithDeviceId(this.a);
    }

    public final List<String> getInitializedHostPackages() {
        return PackageExtenstionsKt.getInitializedHostPackages(this.a);
    }
}
