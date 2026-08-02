package com.ironsource;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.os.Build;
import android.os.ext.SdkExtensions;
import defpackage.sw9;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.l0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4171l0 {

    @NotNull
    public static final C4171l0 a = new C4171l0();

    private C4171l0() {
    }

    @Nullable
    public static final MeasurementManager a(@NotNull Context context) {
        context.getClass();
        if (Build.VERSION.SDK_INT >= 30 && a() >= 4) {
            try {
                return sw9.c(context.getSystemService(sw9.g()));
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static /* synthetic */ void b() {
    }

    public static final int a() {
        if (Build.VERSION.SDK_INT < 30) {
            return 0;
        }
        try {
            return SdkExtensions.getExtensionVersion(1000000);
        } catch (Exception e) {
            C4157k4.d().a(e);
            return 0;
        }
    }
}
