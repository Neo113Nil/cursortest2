package com.google.android.gms.common;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.zabr;
import com.google.android.gms.common.internal.zab;
import com.unity3d.services.UnityAdsConstants;
import xsna.anj;
import xsna.coz0;
import xsna.de;
import xsna.e43;
import xsna.exc0;
import xsna.fau;
import xsna.hin0;
import xsna.jvp;
import xsna.opz0;
import xsna.roz0;
import xsna.smz0;
import xsna.t4z;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes.dex */
public class GoogleApiAvailability extends a {
    public static final Object d = new Object();
    public static final GoogleApiAvailability e = new GoogleApiAvailability();

    @Nullable
    public opz0 c;

    @Nullable
    public static AlertDialog f(@NonNull Activity activity, int i, @Nullable roz0 roz0Var, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(coz0.c(i, activity));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String e2 = coz0.e(i, activity);
        if (e2 != null) {
            builder.setPositiveButton(e2, roz0Var);
        }
        String a = coz0.a(i, activity);
        if (a != null) {
            builder.setTitle(a);
        }
        new IllegalArgumentException();
        return builder.create();
    }

    @NonNull
    public static GoogleApiAvailability getInstance() {
        return e;
    }

    @Nullable
    public static zabr j(Context context, de deVar) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        zabr zabrVar = new zabr(deVar);
        anj.d(context, zabrVar, intentFilter, null, 2);
        zabrVar.a(context);
        if (fau.c(context)) {
            return zabrVar;
        }
        deVar.p0();
        zabrVar.b();
        return null;
    }

    public static void k(Activity activity, AlertDialog alertDialog, String str, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof FragmentActivity) {
                hin0.Dn(alertDialog, onCancelListener).Td(((FragmentActivity) activity).getSupportFragmentManager(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        jvp.a(alertDialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    public final void e(@NonNull GoogleApiActivity googleApiActivity, int i, @Nullable GoogleApiActivity googleApiActivity2) {
        AlertDialog f = f(googleApiActivity, i, roz0.b(super.b(googleApiActivity, i, "d"), googleApiActivity), googleApiActivity2);
        if (f == null) {
            return;
        }
        k(googleApiActivity, f, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void g(@NonNull Activity activity, @NonNull t4z t4zVar, int i, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog f = f(activity, i, roz0.c(super.b(activity, i, "d"), t4zVar), onCancelListener);
        if (f == null) {
            return;
        }
        k(activity, f, "GooglePlayServicesErrorDialog", onCancelListener);
    }

    public final void h(Context context, ConnectionResult connectionResult) {
        int i;
        int i2 = connectionResult.c;
        new IllegalArgumentException();
        if (i2 == 18) {
            new smz0(this, context).sendEmptyMessageDelayed(1, UnityAdsConstants.Timeout.INIT_TIMEOUT_MS);
            return;
        }
        PendingIntent pendingIntent = connectionResult.d;
        if (pendingIntent == null) {
            return;
        }
        String b = coz0.b(i2, context);
        String d2 = coz0.d(i2, context);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        exc0.i(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        NotificationCompat.h hVar = new NotificationCompat.h(context);
        hVar.s();
        hVar.e(true);
        hVar.k(b);
        NotificationCompat.f fVar = new NotificationCompat.f();
        fVar.e(d2);
        hVar.B(fVar);
        boolean i3 = e43.i(context);
        int i4 = R.drawable.stat_sys_warning;
        if (i3) {
            int i5 = context.getApplicationInfo().icon;
            if (i5 != 0) {
                i4 = i5;
            }
            hVar.z(i4);
            hVar.v(2);
            if (e43.j(context)) {
                hVar.a(com.vkontakte.android.R.drawable.common_full_open_on_phone, pendingIntent, resources.getString(com.vkontakte.android.R.string.common_open_on_phone));
            } else {
                hVar.i(pendingIntent);
            }
        } else {
            hVar.z(R.drawable.stat_sys_warning);
            hVar.D(resources.getString(com.vkontakte.android.R.string.common_google_play_services_notification_ticker));
            hVar.E(System.currentTimeMillis());
            hVar.i(pendingIntent);
            hVar.j(d2);
        }
        synchronized (d) {
        }
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
        String string = context.getResources().getString(com.vkontakte.android.R.string.common_google_play_services_notification_channel_name);
        if (notificationChannel == null) {
            notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
        } else if (!string.contentEquals(notificationChannel.getName())) {
            notificationChannel.setName(string);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        hVar.g();
        Notification c = hVar.c();
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            fau.a.set(false);
            i = 10436;
        } else {
            i = 39789;
        }
        notificationManager.notify(i, c);
        i(context, connectionResult, false);
    }

    public final void i(@NonNull Context context, @NonNull ConnectionResult connectionResult, boolean z) {
        Integer num = connectionResult.f;
        zab zabVar = new zab(num == null ? -1 : num.intValue(), context.getPackageName(), System.currentTimeMillis(), connectionResult.c, z);
        if (this.c == null) {
            this.c = new opz0(context);
        }
        this.c.a(zabVar);
    }

    @Override // com.google.android.gms.common.a
    public int isGooglePlayServicesAvailable(@NonNull Context context) {
        return super.isGooglePlayServicesAvailable(context);
    }
}
