package com.appsflyer.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import com.appsflyer.AppsFlyerLib;

/* loaded from: classes8.dex */
public final class AFg1nSDK extends AFa1pSDK {
    /* JADX WARN: Illegal instructions before constructor call */
    @SuppressLint({"VisibleForTests"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AFg1nSDK(Context context) {
        super("Register", r0.toString(), Boolean.FALSE);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format(AFg1oSDK.AFInAppEventParameterName, AppsFlyerLib.getInstance().getHostPrefix(), AFb1tSDK.valueOf().getHostName()));
        sb2.append(context.getPackageName());
    }

    @Override // com.appsflyer.internal.AFa1pSDK
    public final AFf1zSDK AFKeystoreWrapper() {
        return AFf1zSDK.REGISTER;
    }

    @Override // com.appsflyer.internal.AFa1pSDK
    public final boolean e() {
        return false;
    }
}
