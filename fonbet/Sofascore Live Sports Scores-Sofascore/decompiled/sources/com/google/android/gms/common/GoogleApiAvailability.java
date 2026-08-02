package com.google.android.gms.common;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.util.TypedValue;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.service.zaq;
import com.google.android.gms.common.internal.zab;
import com.google.android.gms.common.internal.zaf;
import com.google.android.gms.common.internal.zaj;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.internal.base.zad;
import com.unity3d.services.UnityAdsConstants;
import defpackage.afd;
import defpackage.d4a;
import defpackage.efd;
import defpackage.fp8;
import defpackage.r2n;
import defpackage.s2n;
import defpackage.u2n;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class GoogleApiAvailability extends GoogleApiAvailabilityLight {
    public static final Object d = new Object();
    public static final GoogleApiAvailability e = new GoogleApiAvailability();
    public zaq c;

    public static AlertDialog d(Activity activity, int i, zaj zajVar, DialogInterface.OnCancelListener onCancelListener) {
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(android.R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(zaf.b(i, activity));
        builder.setOnCancelListener(onCancelListener);
        Resources resources = activity.getResources();
        String string = i != 1 ? i != 2 ? i != 3 ? resources.getString(android.R.string.ok) : resources.getString(com.sofascore.results.R.string.common_google_play_services_enable_button) : resources.getString(com.sofascore.results.R.string.common_google_play_services_update_button) : resources.getString(com.sofascore.results.R.string.common_google_play_services_install_button);
        if (string != null) {
            builder.setPositiveButton(string, zajVar);
        }
        String a = zaf.a(i, activity);
        if (a != null) {
            builder.setTitle(a);
        }
        new IllegalArgumentException();
        return builder.create();
    }

    public static void h(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof FragmentActivity) {
                fp8 k = ((FragmentActivity) activity).k();
                SupportErrorDialogFragment supportErrorDialogFragment = new SupportErrorDialogFragment();
                Preconditions.j(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                supportErrorDialogFragment.q = alertDialog;
                supportErrorDialogFragment.r = onCancelListener;
                supportErrorDialogFragment.p(k, str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        ErrorDialogFragment errorDialogFragment = new ErrorDialogFragment();
        Preconditions.j(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        errorDialogFragment.a = alertDialog;
        errorDialogFragment.b = onCancelListener;
        errorDialogFragment.show(fragmentManager, str);
    }

    public final void c(GoogleApiActivity googleApiActivity, int i, GoogleApiActivity googleApiActivity2) {
        AlertDialog d2 = d(googleApiActivity, i, new s2n(super.a(googleApiActivity, i, "d"), googleApiActivity), googleApiActivity2);
        if (d2 == null) {
            return;
        }
        h(googleApiActivity, d2, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void e(Activity activity, LifecycleFragment lifecycleFragment, int i, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog d2 = d(activity, i, new u2n(super.a(activity, i, "d"), lifecycleFragment), onCancelListener);
        if (d2 == null) {
            return;
        }
        h(activity, d2, "GooglePlayServicesErrorDialog", onCancelListener);
    }

    public final void f(Context context, int i, PendingIntent pendingIntent) {
        int i2;
        new IllegalArgumentException();
        if (i == 18) {
            new r2n(this, context).sendEmptyMessageDelayed(1, UnityAdsConstants.Timeout.INIT_TIMEOUT_MS);
            return;
        }
        if (pendingIntent == null) {
            return;
        }
        String e2 = i == 6 ? zaf.e(context, "common_google_play_services_resolution_required_title") : zaf.a(i, context);
        if (e2 == null) {
            e2 = context.getResources().getString(com.sofascore.results.R.string.common_google_play_services_notification_ticker);
        }
        String d2 = (i == 6 || i == 19) ? zaf.d(context, "common_google_play_services_resolution_required_text", zaf.c(context)) : zaf.b(i, context);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        Preconditions.i(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        efd efdVar = new efd(context, null);
        efdVar.m = true;
        efdVar.e(16, true);
        efdVar.e = efd.c(e2);
        afd afdVar = new afd(0);
        afdVar.d = efd.c(d2);
        efdVar.g(afdVar);
        boolean b = DeviceProperties.b(context);
        int i3 = android.R.drawable.stat_sys_warning;
        if (b) {
            int i4 = context.getApplicationInfo().icon;
            if (i4 != 0) {
                i3 = i4;
            }
            efdVar.v.icon = i3;
            efdVar.j = 2;
            if (DeviceProperties.c(context)) {
                efdVar.a(2131231319, pendingIntent, resources.getString(com.sofascore.results.R.string.common_open_on_phone));
            } else {
                efdVar.g = pendingIntent;
            }
        } else {
            efdVar.v.icon = android.R.drawable.stat_sys_warning;
            efdVar.v.tickerText = efd.c(resources.getString(com.sofascore.results.R.string.common_google_play_services_notification_ticker));
            efdVar.v.when = System.currentTimeMillis();
            efdVar.g = pendingIntent;
            efdVar.f = efd.c(d2);
        }
        synchronized (d) {
        }
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
        String string = context.getResources().getString(com.sofascore.results.R.string.common_google_play_services_notification_channel_name);
        if (notificationChannel == null) {
            notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
        } else if (!string.contentEquals(notificationChannel.getName())) {
            notificationChannel.setName(string);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        efdVar.s = "com.google.android.gms.availability";
        Notification b2 = efdVar.b();
        if (i == 1 || i == 2 || i == 3) {
            GooglePlayServicesUtilLight.a.set(false);
            i2 = 10436;
        } else {
            i2 = 39789;
        }
        notificationManager.notify(i2, b2);
    }

    public final void g(Context context, ConnectionResult connectionResult, boolean z) {
        Integer num = connectionResult.e;
        int intValue = num == null ? -1 : num.intValue();
        zab zabVar = new zab(intValue, connectionResult.b, System.currentTimeMillis(), context.getPackageName(), z);
        zaq zaqVar = this.c;
        if (zaqVar == null) {
            zaqVar = new zaq(context, zaq.l, Api.ApiOptions.E7, GoogleApi.Settings.c);
            this.c = zaqVar;
        }
        TaskApiCall.Builder a = TaskApiCall.a();
        a.c = new Feature[]{zad.b};
        a.b = false;
        a.a = new d4a(zabVar, 26);
        zaqVar.h(2, a.a());
    }
}
