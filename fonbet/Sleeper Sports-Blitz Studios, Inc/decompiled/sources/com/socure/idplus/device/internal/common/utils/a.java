package com.socure.idplus.device.internal.common.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.Handler;
import com.socure.idplus.device.error.SigmaDeviceError;
import com.socure.idplus.device.internal.thread.b;
import com.socure.idplus.device.internal.thread.c;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public abstract class a {
    public static boolean a(Context context) {
        PackageManager.PackageInfoFlags of;
        PackageInfo packageInfo;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter("io.flutter.embedding.android", "value");
        PackageManager packageManager = context.getPackageManager();
        try {
        } catch (PackageManager.NameNotFoundException e) {
            String msg = String.valueOf(e.getMessage());
            Intrinsics.checkNotNullParameter("Utils", "tag");
            Intrinsics.checkNotNullParameter(msg, "msg");
            com.socure.idplus.device.internal.logger.a aVar = com.socure.idplus.device.internal.logger.a.f870a;
        }
        if (Build.VERSION.SDK_INT < 33) {
            if (packageManager.getPackageInfo("io.flutter.embedding.android", 0) != null) {
                return true;
            }
            return false;
        }
        of = PackageManager.PackageInfoFlags.of(128L);
        packageInfo = packageManager.getPackageInfo("io.flutter.embedding.android", of);
        Intrinsics.checkNotNullExpressionValue(packageInfo, "getPackageInfo(...)");
        return true;
    }

    public static String b(String otherValue) {
        StringBuilder sb;
        Intrinsics.checkNotNullParameter(otherValue, "otherValue");
        if (otherValue.length() > 20) {
            otherValue = otherValue.substring(0, 20);
            Intrinsics.checkNotNullExpressionValue(otherValue, "substring(...)");
            sb = new StringBuilder("other - ");
        } else {
            sb = new StringBuilder("other - ");
        }
        sb.append(otherValue);
        return sb.toString();
    }

    public static final void b(Context context, b socureThread, int i, Function0 onSuccess, Function2 onError) {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(socureThread, "$socureThread");
        Intrinsics.checkNotNullParameter(onSuccess, "$onSuccess");
        Intrinsics.checkNotNullParameter(onError, "$onError");
        a(context, socureThread, i + 1, onSuccess, onError);
    }

    public static String a(String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        return "Bearer " + token;
    }

    public static boolean a() {
        Intrinsics.checkNotNullParameter("androidx.compose.ui.platform.ViewRootForTest", "className");
        try {
            Class.forName("androidx.compose.ui.platform.ViewRootForTest");
            return true;
        } catch (ClassNotFoundException e) {
            com.socure.idplus.device.internal.logger.b.a("Utils", "Class androidx.compose.ui.platform.ViewRootForTest not found with exception: " + e.getMessage());
            return false;
        }
    }

    public static void a(final Context context, final b bVar, final int i, final Function0 function0, final Function2 function2) {
        NetworkCapabilities networkCapabilities;
        if (i < 3) {
            Object systemService = context.getSystemService("connectivity");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null && (networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(3))) {
                ((c) bVar).a(new Runnable() { // from class: com.socure.idplus.device.internal.common.utils.a$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.a(Function0.this);
                    }
                });
                return;
            }
            Runnable runnable = new Runnable() { // from class: com.socure.idplus.device.internal.common.utils.a$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    a.b(context, bVar, i, function0, function2);
                }
            };
            long j = i * 2000;
            c cVar = (c) bVar;
            cVar.getClass();
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            Handler handler = cVar.f899a;
            if (handler != null) {
                handler.postDelayed(runnable, j);
                return;
            }
            return;
        }
        function2.invoke(SigmaDeviceError.NetworkConnectionError, "Network not available");
    }

    public static final void a(Function0 onSuccess) {
        Intrinsics.checkNotNullParameter(onSuccess, "$onSuccess");
        onSuccess.invoke();
    }
}
