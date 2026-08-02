package com.ironsource;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.os.Build;
import android.os.ext.SdkExtensions;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.l0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2516l0 {
    public static final C2516l0 a = new C2516l0();

    private C2516l0() {
    }

    public static final int a() {
        if (Build.VERSION.SDK_INT < 30) {
            return 0;
        }
        try {
            return SdkExtensions.getExtensionVersion(1000000);
        } catch (Exception e) {
            C2556n4.d().a(e);
            return 0;
        }
    }

    @JvmStatic
    public static /* synthetic */ void b() {
    }

    @JvmStatic
    public static final MeasurementManager a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (Build.VERSION.SDK_INT >= 30 && a() >= 4) {
            try {
                return (MeasurementManager) context.getSystemService(MeasurementManager.class);
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
