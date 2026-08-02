package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.os.Build;
import com.appsflyer.AFLogger;
import com.huawei.appgallery.serviceverifykit.api.ServiceVerifyKit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class AFi1dSDK implements AFi1aSDK {
    @Override // com.appsflyer.internal.AFi1aSDK
    public final boolean getMediationNetwork(Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return A_(context) != null;
    }

    @Override // com.appsflyer.internal.AFi1aSDK
    public final boolean getMonetizationNetwork(Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        ProviderInfo A_ = A_(context);
        if (A_ == null) {
            return false;
        }
        try {
            return new ServiceVerifyKit.PkgVerifyBuilder(context).setPackageName(((PackageItemInfo) A_).packageName).setCertChainKey("com.huawei.appgallery.sign_certchain").setCertSignerKey("com.huawei.appgallery.fingerprint_signature").addLegacyInfo("com.huawei.appmarket", "FFE391E0EA186D0734ED601E4E70E3224B7309D48E2075BAC46D8C667EAE7212").addLegacyInfo("com.huawei.appmarket", "3BAF59A2E5331C30675FAB35FF5FFF0D116142D3D4664F1C3CB804068B40614F").isValidPkg();
        } catch (Throwable th) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFh1xSDK aFh1xSDK = AFh1xSDK.REFERRER;
            String message = th.getMessage();
            AFh1wSDK.e$default(aFLogger, aFh1xSDK, message == null ? "" : message, th, false, false, false, false, 96, null);
            return false;
        }
    }

    private static ProviderInfo A_(Context context) {
        PackageManager.ComponentInfoFlags of;
        ProviderInfo resolveContentProvider;
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                PackageManager packageManager = context.getPackageManager();
                of = PackageManager.ComponentInfoFlags.of(0L);
                resolveContentProvider = packageManager.resolveContentProvider("com.huawei.appmarket.commondata", of);
                return resolveContentProvider;
            }
            return context.getPackageManager().resolveContentProvider("com.huawei.appmarket.commondata", 0);
        } catch (Throwable th) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFh1xSDK aFh1xSDK = AFh1xSDK.REFERRER;
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            AFh1wSDK.e$default(aFLogger, aFh1xSDK, message, th, false, false, false, false, 96, null);
            return null;
        }
    }
}
