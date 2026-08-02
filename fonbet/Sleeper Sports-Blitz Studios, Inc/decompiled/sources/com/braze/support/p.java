package com.braze.support;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.braze.support.BrazeLogger;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final p f788a = new p();

    public static final boolean a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Class.forName("com.google.android.gms.common.GoogleApiAvailability");
            final int isGooglePlayServicesAvailable = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context);
            if (isGooglePlayServicesAvailable == 0) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) f788a, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.support.p$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return p.b();
                    }
                }, 7, (Object) null);
                return true;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) f788a, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.support.p$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return p.a(isGooglePlayServicesAvailable);
                }
            }, 7, (Object) null);
            return false;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) f788a, BrazeLogger.Priority.I, (Throwable) e, false, new Function0() { // from class: com.braze.support.p$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return p.a();
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public static final String b() {
        return "Google Play Services is available.";
    }

    public static final String c() {
        return "Unexpected exception while checking for com.google.android.gsf";
    }

    public static final boolean b(Context context) {
        PackageManager.PackageInfoFlags of;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            if (Build.VERSION.SDK_INT < 33) {
                context.getPackageManager().getPackageInfo(GooglePlayServicesUtilLight.GOOGLE_SERVICES_FRAMEWORK_PACKAGE, 0);
                return true;
            }
            PackageManager packageManager = context.getPackageManager();
            of = PackageManager.PackageInfoFlags.of(0L);
            packageManager.getPackageInfo(GooglePlayServicesUtilLight.GOOGLE_SERVICES_FRAMEWORK_PACKAGE, of);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) f788a, BrazeLogger.Priority.W, (Throwable) e, false, new Function0() { // from class: com.braze.support.p$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return p.c();
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public static final String a() {
        return "Google Play Services Availability API not found. Google Play Services not enabled.";
    }

    public static final String a(int i) {
        return "Google Play Services is unavailable. Connection result: " + i;
    }
}
