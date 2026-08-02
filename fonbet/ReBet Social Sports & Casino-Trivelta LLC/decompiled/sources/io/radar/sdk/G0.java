package io.radar.sdk;

import Y2.AbstractC1817h;
import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.util.Log;
import io.radar.sdk.C4589c;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class G0 {

    /* renamed from: b, reason: collision with root package name */
    public static final a f49666b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final Context f49667a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public G0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f49667a = context;
    }

    public static /* synthetic */ void b(G0 g02, String str, C4589c.EnumC4600l enumC4600l, Throwable th2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            enumC4600l = null;
        }
        if ((i10 & 4) != 0) {
            th2 = null;
        }
        g02.a(str, enumC4600l, th2);
    }

    public static /* synthetic */ void d(G0 g02, String str, C4589c.EnumC4600l enumC4600l, Throwable th2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            enumC4600l = null;
        }
        if ((i10 & 4) != 0) {
            th2 = null;
        }
        g02.c(str, enumC4600l, th2);
    }

    public static /* synthetic */ void g(G0 g02, String str, C4589c.EnumC4600l enumC4600l, Throwable th2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            enumC4600l = null;
        }
        if ((i10 & 4) != 0) {
            th2 = null;
        }
        g02.f(str, enumC4600l, th2);
    }

    public static /* synthetic */ void l(G0 g02, String str, C4589c.EnumC4600l enumC4600l, Throwable th2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            enumC4600l = null;
        }
        if ((i10 & 4) != 0) {
            th2 = null;
        }
        g02.k(str, enumC4600l, th2);
    }

    public final void a(String message, C4589c.EnumC4600l enumC4600l, Throwable th2) {
        Intrinsics.checkNotNullParameter(message, "message");
        C4589c.EnumC4599k k10 = L0.f49705a.k(this.f49667a);
        C4589c.EnumC4599k enumC4599k = C4589c.EnumC4599k.DEBUG;
        if (k10.compareTo(enumC4599k) >= 0) {
            C4589c.r0(C4589c.f49918a, enumC4599k, message, enumC4600l, null, 8, null);
        }
    }

    public final void c(String message, C4589c.EnumC4600l enumC4600l, Throwable th2) {
        Intrinsics.checkNotNullParameter(message, "message");
        C4589c.EnumC4599k k10 = L0.f49705a.k(this.f49667a);
        C4589c.EnumC4599k enumC4599k = C4589c.EnumC4599k.ERROR;
        if (k10.compareTo(enumC4599k) >= 0) {
            Log.e("RadarLogger", message, th2);
            C4589c.r0(C4589c.f49918a, enumC4599k, message, enumC4600l, null, 8, null);
        }
    }

    public final float e() {
        Intent registerReceiver = this.f49667a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        return (registerReceiver != null ? registerReceiver.getIntExtra("level", -1) : -1) / (registerReceiver != null ? registerReceiver.getIntExtra("scale", -1) : -1);
    }

    public final void f(String message, C4589c.EnumC4600l enumC4600l, Throwable th2) {
        Intrinsics.checkNotNullParameter(message, "message");
        C4589c.EnumC4599k k10 = L0.f49705a.k(this.f49667a);
        C4589c.EnumC4599k enumC4599k = C4589c.EnumC4599k.INFO;
        if (k10.compareTo(enumC4599k) >= 0) {
            Log.i("RadarLogger", message, th2);
            C4589c.r0(C4589c.f49918a, enumC4599k, message, enumC4600l, null, 8, null);
        }
    }

    public final void h() {
        float e10 = e();
        b(this, "App entering background | at " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date()) + " | with " + (e10 * 100) + "% battery", null, null, 6, null);
    }

    public final void i() {
        List historicalProcessExitReasons;
        long timestamp;
        String description;
        long timestamp2;
        long timestamp3;
        if (L0.f49705a.k(this.f49667a) != C4589c.EnumC4599k.DEBUG) {
            return;
        }
        Object systemService = this.f49667a.getSystemService("activity");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
        }
        ActivityManager activityManager = (ActivityManager) systemService;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses != null) {
            List<ActivityManager.RunningAppProcessInfo> list = runningAppProcesses;
            if ((list instanceof Collection) && list.isEmpty()) {
                return;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : list) {
                if (runningAppProcessInfo.importance == 100 && Intrinsics.areEqual(runningAppProcessInfo.processName, this.f49667a.getPackageName())) {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
                    SharedPreferences sharedPreferences = this.f49667a.getSharedPreferences("RadarSDK", 0);
                    long j10 = sharedPreferences.getLong("last_timestamp", 0L);
                    long currentTimeMillis = System.currentTimeMillis();
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.putLong("last_timestamp", currentTimeMillis);
                    edit.apply();
                    float e10 = e();
                    historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(null, 0, 10);
                    Intrinsics.checkNotNullExpressionValue(historicalProcessExitReasons, "activityManager.getHisto…sExitReasons(null, 0, 10)");
                    if (historicalProcessExitReasons.isEmpty()) {
                        return;
                    }
                    Iterator it = historicalProcessExitReasons.iterator();
                    while (it.hasNext()) {
                        ApplicationExitInfo a10 = AbstractC1817h.a(it.next());
                        timestamp = a10.getTimestamp();
                        if (timestamp > j10) {
                            C4589c c4589c = C4589c.f49918a;
                            C4589c.EnumC4599k enumC4599k = C4589c.EnumC4599k.DEBUG;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("App terminating | with reason: ");
                            description = a10.getDescription();
                            sb2.append(description);
                            sb2.append(" | at ");
                            timestamp2 = a10.getTimestamp();
                            sb2.append(simpleDateFormat.format(new Date(timestamp2)));
                            sb2.append(" | with ");
                            sb2.append(e10 * 100);
                            sb2.append("% battery");
                            String sb3 = sb2.toString();
                            timestamp3 = a10.getTimestamp();
                            c4589c.q0(enumC4599k, sb3, null, new Date(timestamp3));
                            return;
                        }
                    }
                    return;
                }
            }
        }
    }

    public final void j() {
        float e10 = e();
        b(this, "App resigning active | at " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date()) + " | with " + (e10 * 100) + "% battery", null, null, 6, null);
    }

    public final void k(String message, C4589c.EnumC4600l enumC4600l, Throwable th2) {
        Intrinsics.checkNotNullParameter(message, "message");
        C4589c.EnumC4599k k10 = L0.f49705a.k(this.f49667a);
        C4589c.EnumC4599k enumC4599k = C4589c.EnumC4599k.WARNING;
        if (k10.compareTo(enumC4599k) >= 0) {
            Log.w("RadarLogger", message, th2);
            C4589c.r0(C4589c.f49918a, enumC4599k, message, enumC4600l, null, 8, null);
        }
    }
}
