package c6;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.TypedValue;
import androidx.appcompat.widget.c1;
import androidx.fragment.app.k1;
import androidx.fragment.app.p0;
import c0.u;
import c0.w;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.zab;
import e6.y;
import g6.v;
import io.sentry.android.core.w0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class c extends d {

    /* renamed from: d, reason: collision with root package name */
    public static final Object f3656d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static final c f3657e = new c();

    /* renamed from: c, reason: collision with root package name */
    public i6.d f3658c;

    public static AlertDialog d(Activity activity, int i5, g6.n nVar, DialogInterface.OnCancelListener onCancelListener) {
        if (i5 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(g6.k.b(activity, i5));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        String string = i5 != 1 ? i5 != 2 ? i5 != 3 ? resources.getString(R.string.ok) : resources.getString(com.sports.insider.R.string.common_google_play_services_enable_button) : resources.getString(com.sports.insider.R.string.common_google_play_services_update_button) : resources.getString(com.sports.insider.R.string.common_google_play_services_install_button);
        if (string != null) {
            builder.setPositiveButton(string, nVar);
        }
        String a7 = g6.k.a(activity, i5);
        if (a7 != null) {
            builder.setTitle(a7);
        }
        w0.n("GoogleApiAvailability", c1.i(i5, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    public static void h(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof p0) {
                k1 r5 = ((p0) activity).r();
                i iVar = new i();
                v.i(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                iVar.f3669a = alertDialog;
                if (onCancelListener != null) {
                    iVar.f3670b = onCancelListener;
                }
                iVar.show(r5, str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        b bVar = new b();
        v.i(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        bVar.f3653a = alertDialog;
        if (onCancelListener != null) {
            bVar.f3654b = onCancelListener;
        }
        bVar.show(fragmentManager, str);
    }

    public final void c(GoogleApiActivity googleApiActivity, int i5, GoogleApiActivity googleApiActivity2) {
        AlertDialog d10 = d(googleApiActivity, i5, new g6.l(super.a(googleApiActivity, i5, "d"), googleApiActivity), googleApiActivity2);
        if (d10 == null) {
            return;
        }
        h(googleApiActivity, d10, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void e(Activity activity, e6.h hVar, int i5, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog d10 = d(activity, i5, new g6.m(super.a(activity, i5, "d"), hVar), onCancelListener);
        if (d10 == null) {
            return;
        }
        h(activity, d10, "GooglePlayServicesErrorDialog", onCancelListener);
    }

    public final void f(Context context, ConnectionResult connectionResult) {
        int i5;
        int i10 = connectionResult.f4441b;
        w0.n("GoogleApiAvailability", d9.e.f(i10, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
        if (i10 == 18) {
            new j(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        PendingIntent pendingIntent = connectionResult.f4442c;
        if (pendingIntent == null) {
            if (i10 == 6) {
                w0.m("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String e7 = i10 == 6 ? g6.k.e(context, "common_google_play_services_resolution_required_title") : g6.k.a(context, i10);
        if (e7 == null) {
            e7 = context.getResources().getString(com.sports.insider.R.string.common_google_play_services_try_again_title);
        }
        String d10 = (i10 == 6 || i10 == 19) ? g6.k.d(context, "common_google_play_services_resolution_required_text", g6.k.c(context)) : g6.k.b(context, i10);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        v.h(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        w wVar = new w(context, null);
        wVar.f3320o = true;
        wVar.c(16, true);
        wVar.f3311e = w.b(e7);
        u uVar = new u();
        uVar.f3306b = w.b(d10);
        wVar.e(uVar);
        PackageManager packageManager = context.getPackageManager();
        if (q6.b.f22042c == null) {
            q6.b.f22042c = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        boolean booleanValue = q6.b.f22042c.booleanValue();
        int i11 = R.drawable.stat_sys_warning;
        if (booleanValue) {
            int i12 = context.getApplicationInfo().icon;
            if (i12 != 0) {
                i11 = i12;
            }
            wVar.f3326v.icon = i11;
            wVar.j = 2;
            if (q6.b.g(context)) {
                wVar.f3308b.add(new c0.q(resources.getString(com.sports.insider.R.string.common_open_on_phone), pendingIntent));
            } else {
                wVar.f3313g = pendingIntent;
            }
        } else {
            wVar.f3326v.icon = R.drawable.stat_sys_warning;
            wVar.f3326v.tickerText = w.b(resources.getString(com.sports.insider.R.string.common_google_play_services_notification_ticker));
            wVar.f3326v.when = System.currentTimeMillis();
            wVar.f3313g = pendingIntent;
            wVar.f3312f = w.b(d10);
        }
        if (q6.b.e()) {
            if (!q6.b.e()) {
                throw new IllegalStateException();
            }
            synchronized (f3656d) {
            }
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(com.sports.insider.R.string.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
            } else if (!string.contentEquals(notificationChannel.getName())) {
                notificationChannel.setName(string);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            wVar.f3324t = "com.google.android.gms.availability";
        }
        Notification a7 = wVar.a();
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            g.f3661a.set(false);
            i5 = 10436;
        } else {
            i5 = 39789;
        }
        notificationManager.notify(i5, a7);
        g(context, connectionResult, false);
    }

    public final void g(Context context, ConnectionResult connectionResult, boolean z5) {
        Integer num = connectionResult.f4444e;
        zab zabVar = new zab(num == null ? -1 : num.intValue(), connectionResult.f4441b, System.currentTimeMillis(), context.getPackageName(), z5);
        if (this.f3658c == null) {
            this.f3658c = new i6.d(context, null, i6.d.f10998l, d6.b.f8244d0, d6.f.f8246c);
        }
        i6.d dVar = this.f3658c;
        dVar.getClass();
        e6.m a7 = y.a();
        a7.f8725d = new Feature[]{h7.b.f10387b};
        a7.f8724c = true;
        a7.f8723b = false;
        a7.f8722a = new i2.d(1, zabVar);
        dVar.c(2, a7.a());
    }
}
