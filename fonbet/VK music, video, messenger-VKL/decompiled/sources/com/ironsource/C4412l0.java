package com.ironsource;

import android.adservices.measurement.MeasurementManager;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.ext.SdkExtensions;
import xsna.a91;
import xsna.z81;

/* renamed from: com.ironsource.l0, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4412l0 {
    public static final C4412l0 a = new C4412l0();

    private C4412l0() {
    }

    @SuppressLint({"WrongConstant", "NewApi"})
    public static final int a() {
        int extensionVersion;
        if (Build.VERSION.SDK_INT < 30) {
            return 0;
        }
        try {
            extensionVersion = SdkExtensions.getExtensionVersion(1000000);
            return extensionVersion;
        } catch (Exception e) {
            C4452n4.d().a(e);
            return 0;
        }
    }

    @SuppressLint({"NewApi"})
    public static final MeasurementManager a(Context context) {
        if (Build.VERSION.SDK_INT < 30 || a() < 4) {
            return null;
        }
        try {
            return a91.a(context.getSystemService(z81.m()));
        } catch (Exception unused) {
            return null;
        }
    }

    public static /* synthetic */ void b() {
    }
}
