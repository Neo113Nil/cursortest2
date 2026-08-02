package p6;

import T7.J;
import ai.verisoul.sdk.Core;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import c8.C2895a;
import g6.N;
import h6.C4470F;
import h6.p;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final n f63097a = new n();

    /* renamed from: b, reason: collision with root package name */
    public static final String f63098b = n.class.getCanonicalName();

    @NotNull
    private static final long[] INACTIVE_SECONDS_QUANTA = {Core.sensorDataTimeout, 900000, 1800000, 3600000, 21600000, 43200000, 86400000, 172800000, 259200000, 604800000, 1209600000, 1814400000, 2419200000L, 5184000000L, 7776000000L, 10368000000L, 12960000000L, 15552000000L, 31536000000L};

    public static final int b(long j10) {
        if (Y7.a.d(n.class)) {
            return 0;
        }
        int i10 = 0;
        while (true) {
            try {
                long[] jArr = INACTIVE_SECONDS_QUANTA;
                if (i10 >= jArr.length || jArr[i10] >= j10) {
                    break;
                }
                i10++;
            } catch (Throwable th2) {
                Y7.a.b(th2, n.class);
                return 0;
            }
        }
        return i10;
    }

    public static final void c(String activityName, o oVar, String str, Context context) {
        String oVar2;
        if (Y7.a.d(n.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activityName, "activityName");
            Intrinsics.checkNotNullParameter(context, "context");
            String str2 = "Unclassified";
            if (oVar != null && (oVar2 = oVar.toString()) != null) {
                str2 = oVar2;
            }
            Bundle bundle = new Bundle();
            bundle.putString("fb_mobile_launch_source", str2);
            bundle.putString("fb_mobile_pckg_fp", f63097a.a(context));
            bundle.putString("fb_mobile_app_cert_hash", C2895a.a(context));
            C4470F.a aVar = C4470F.f47729b;
            C4470F b10 = aVar.b(activityName, str, null);
            b10.d("fb_mobile_activate_app", bundle);
            if (aVar.d() != p.b.EXPLICIT_ONLY) {
                b10.a();
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, n.class);
        }
    }

    public static final void e(String activityName, m mVar, String str) {
        long longValue;
        String oVar;
        if (Y7.a.d(n.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activityName, "activityName");
            if (mVar == null) {
                return;
            }
            Long b10 = mVar.b();
            long j10 = 0;
            if (b10 == null) {
                Long e10 = mVar.e();
                longValue = 0 - (e10 == null ? 0L : e10.longValue());
            } else {
                longValue = b10.longValue();
            }
            if (longValue < 0) {
                f63097a.d();
                longValue = 0;
            }
            long f10 = mVar.f();
            if (f10 < 0) {
                f63097a.d();
                f10 = 0;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("fb_mobile_app_interruptions", mVar.c());
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format(Locale.ROOT, "session_quanta_%d", Arrays.copyOf(new Object[]{Integer.valueOf(b(longValue))}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
            bundle.putString("fb_mobile_time_between_sessions", format);
            o g10 = mVar.g();
            String str2 = "Unclassified";
            if (g10 != null && (oVar = g10.toString()) != null) {
                str2 = oVar;
            }
            bundle.putString("fb_mobile_launch_source", str2);
            Long e11 = mVar.e();
            if (e11 != null) {
                j10 = e11.longValue();
            }
            bundle.putLong("_logTime", j10 / 1000);
            C4470F.f47729b.b(activityName, str, null).c("fb_mobile_deactivate_app", f10 / 1000, bundle);
        } catch (Throwable th2) {
            Y7.a.b(th2, n.class);
        }
    }

    public final String a(Context context) {
        if (Y7.a.d(this)) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            String stringPlus = Intrinsics.stringPlus("PCKGCHKSUM;", packageManager.getPackageInfo(context.getPackageName(), 0).versionName);
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            String string = sharedPreferences.getString(stringPlus, null);
            if (string != null && string.length() == 32) {
                return string;
            }
            String c10 = l.c(context, null);
            if (c10 == null) {
                ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 0);
                Intrinsics.checkNotNullExpressionValue(applicationInfo, "pm.getApplicationInfo(context.packageName, 0)");
                c10 = l.b(applicationInfo.sourceDir);
            }
            sharedPreferences.edit().putString(stringPlus, c10).apply();
            return c10;
        } catch (Exception unused) {
            return null;
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return null;
        }
    }

    public final void d() {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            J.a aVar = J.f10993e;
            N n10 = N.APP_EVENTS;
            String str = f63098b;
            Intrinsics.checkNotNull(str);
            aVar.b(n10, str, "Clock skew detected");
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }
}
