package com.oblador.keychain;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f39119a = new b();

    public static final boolean e(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("keyguard");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.KeyguardManager");
        if (((KeyguardManager) systemService).isKeyguardSecure()) {
            return Build.VERSION.SDK_INT >= 28 ? context.checkSelfPermission("android.permission.USE_BIOMETRIC") == 0 : context.checkSelfPermission("android.permission.USE_FINGERPRINT") == 0;
        }
        return false;
    }

    public final boolean a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return Build.VERSION.SDK_INT >= 30 && androidx.biometric.e.g(context).a(32768) == 0;
    }

    public final boolean b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getPackageManager().hasSystemFeature("android.hardware.biometrics.face");
    }

    public final boolean c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getPackageManager().hasSystemFeature("android.hardware.fingerprint");
    }

    public final boolean d(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getPackageManager().hasSystemFeature("android.hardware.biometrics.iris");
    }

    public final boolean f(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return androidx.biometric.e.g(context).a(15) == 0;
    }

    public final boolean g(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (Build.VERSION.SDK_INT >= 28) {
            return context.getPackageManager().hasSystemFeature("android.hardware.strongbox_keystore");
        }
        return false;
    }
}
