package com.braze.support;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.braze.support.BrazeLogger;
import com.google.android.gms.common.GoogleApiAvailability;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f29484a = new g();

    public static final boolean a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        final int i10 = GoogleApiAvailability.r().i(context);
        if (i10 == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) f29484a, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Y3.p1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.support.g.b();
                }
            }, 7, (Object) null);
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) f29484a, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Y3.q1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.support.g.a(i10);
            }
        }, 7, (Object) null);
        return false;
    }

    public static final String b() {
        return "Google Play Services is available.";
    }

    public static final String c() {
        return "Unexpected exception while checking for com.google.android.gsf";
    }

    public static final boolean b(Context context) {
        PackageManager.PackageInfoFlags of2;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            if (Build.VERSION.SDK_INT < 33) {
                context.getPackageManager().getPackageInfo("com.google.android.gsf", 0);
                return true;
            }
            PackageManager packageManager = context.getPackageManager();
            of2 = PackageManager.PackageInfoFlags.of(0L);
            packageManager.getPackageInfo("com.google.android.gsf", of2);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) f29484a, BrazeLogger.Priority.f29473W, (Throwable) e10, false, new Function0() { // from class: Y3.o1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.support.g.c();
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public static final String a(int i10) {
        return "Google Play Services is unavailable. Connection result: " + i10;
    }
}
