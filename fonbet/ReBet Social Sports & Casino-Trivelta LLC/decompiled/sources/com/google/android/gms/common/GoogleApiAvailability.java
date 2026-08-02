package com.google.android.gms.common;

import T3.AbstractC1585a0;
import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.core.app.o;
import androidx.fragment.app.AbstractActivityC2168s;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.AbstractC3158u0;
import com.google.android.gms.common.api.internal.B0;
import com.google.android.gms.common.api.internal.C3160v0;
import com.google.android.gms.common.api.internal.InterfaceC3138k;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.internal.AbstractC3201z;
import com.google.android.gms.internal.base.zad;
import com.google.android.gms.internal.base.zae;
import com.google.android.gms.internal.base.zao;
import com.google.android.gms.internal.base.zap;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.errorprone.annotations.RestrictedInheritance;

@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms.*", allowlistAnnotations = {zad.class, zae.class}, explanation = "Sub classing of GMS Core's APIs are restricted to GMS Core client libs and testing fakes.", link = "go/gmscore-restrictedinheritance")
/* loaded from: classes2.dex */
public class GoogleApiAvailability extends C3171d {

    /* renamed from: c, reason: collision with root package name */
    public String f32240c;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f32238e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public static final GoogleApiAvailability f32239f = new GoogleApiAvailability();

    /* renamed from: d, reason: collision with root package name */
    public static final int f32237d = C3171d.f32607a;

    public static GoogleApiAvailability r() {
        return f32239f;
    }

    public final void A(Context context) {
        new p(this, context).sendEmptyMessageDelayed(1, 120000L);
    }

    public final boolean B(Activity activity, InterfaceC3138k interfaceC3138k, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        Dialog v10 = v(activity, i10, com.google.android.gms.common.internal.C.c(interfaceC3138k, d(activity, i10, W9.d.f13160a), 2), onCancelListener, null);
        if (v10 == null) {
            return false;
        }
        y(activity, v10, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public final boolean C(Context context, ConnectionResult connectionResult, int i10) {
        PendingIntent q10;
        if (M9.b.a(context) || (q10 = q(context, connectionResult)) == null) {
            return false;
        }
        z(context, connectionResult.h(), null, PendingIntent.getActivity(context, 0, GoogleApiActivity.a(context, q10, i10, true), zap.zaa | 134217728));
        return true;
    }

    @Override // com.google.android.gms.common.C3171d
    public Intent d(Context context, int i10, String str) {
        return super.d(context, i10, str);
    }

    @Override // com.google.android.gms.common.C3171d
    public PendingIntent e(Context context, int i10, int i11) {
        return super.e(context, i10, i11);
    }

    @Override // com.google.android.gms.common.C3171d
    public final String g(int i10) {
        return super.g(i10);
    }

    @Override // com.google.android.gms.common.C3171d
    public int i(Context context) {
        return super.i(context);
    }

    @Override // com.google.android.gms.common.C3171d
    public int j(Context context, int i10) {
        return super.j(context, i10);
    }

    @Override // com.google.android.gms.common.C3171d
    public final boolean m(int i10) {
        return super.m(i10);
    }

    public Dialog o(Activity activity, int i10, int i11) {
        return p(activity, i10, i11, null);
    }

    public Dialog p(Activity activity, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        return v(activity, i10, com.google.android.gms.common.internal.C.b(activity, d(activity, i10, W9.d.f13160a), i11), onCancelListener, null);
    }

    public PendingIntent q(Context context, ConnectionResult connectionResult) {
        return connectionResult.k() ? connectionResult.j() : e(context, connectionResult.h(), 0);
    }

    public Task s(Activity activity) {
        int i10 = f32237d;
        AbstractC3191o.f("makeGooglePlayServicesAvailable must be called from the main thread");
        int j10 = j(activity, i10);
        if (j10 == 0) {
            return Tasks.forResult(null);
        }
        B0 i11 = B0.i(activity);
        i11.h(new ConnectionResult(j10, null), 0);
        return i11.j();
    }

    public boolean t(Activity activity, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        Dialog p10 = p(activity, i10, i11, onCancelListener);
        if (p10 == null) {
            return false;
        }
        y(activity, p10, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public void u(Context context, int i10) {
        z(context, i10, null, f(context, i10, 0, "n"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Dialog v(Context context, int i10, com.google.android.gms.common.internal.C c10, DialogInterface.OnCancelListener onCancelListener, DialogInterface.OnClickListener onClickListener) {
        if (i10 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(AbstractC3201z.c(context, i10));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String b10 = AbstractC3201z.b(context, i10);
        if (b10 != null) {
            if (c10 == null) {
                c10 = onClickListener;
            }
            builder.setPositiveButton(b10, c10);
        }
        String f10 = AbstractC3201z.f(context, i10);
        if (f10 != null) {
            builder.setTitle(f10);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i10)), new IllegalArgumentException());
        return builder.create();
    }

    public final Dialog w(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleLarge);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(AbstractC3201z.c(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        y(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    public final C3160v0 x(Context context, AbstractC3158u0 abstractC3158u0) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        C3160v0 c3160v0 = new C3160v0(abstractC3158u0);
        zao.zaa(context, c3160v0, intentFilter);
        c3160v0.a(context);
        if (l(context, "com.google.android.gms")) {
            return c3160v0;
        }
        abstractC3158u0.a();
        c3160v0.b();
        return null;
    }

    public final void y(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof AbstractActivityC2168s) {
                n.f0(dialog, onCancelListener).show(((AbstractActivityC2168s) activity).getSupportFragmentManager(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        DialogFragmentC3169b.a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    public final void z(Context context, int i10, String str, PendingIntent pendingIntent) {
        int i11;
        String str2;
        NotificationChannel notificationChannel;
        CharSequence name;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i10), null), new IllegalArgumentException());
        if (i10 == 18) {
            A(context);
            return;
        }
        if (pendingIntent == null) {
            if (i10 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String e10 = AbstractC3201z.e(context, i10);
        String d10 = AbstractC3201z.d(context, i10);
        Resources resources = context.getResources();
        NotificationManager notificationManager = (NotificationManager) AbstractC3191o.m(context.getSystemService("notification"));
        o.e G10 = new o.e(context).w(true).g(true).m(e10).G(new o.c().a(d10));
        if (K9.i.c(context)) {
            AbstractC3191o.p(K9.n.b());
            G10.E(context.getApplicationInfo().icon).A(2);
            if (K9.i.d(context)) {
                G10.a(C9.b.f1515a, resources.getString(C9.c.f1534o), pendingIntent);
            } else {
                G10.k(pendingIntent);
            }
        } else {
            G10.E(R.drawable.stat_sys_warning).I(resources.getString(C9.c.f1527h)).N(System.currentTimeMillis()).k(pendingIntent).l(d10);
        }
        if (K9.n.e()) {
            AbstractC3191o.p(K9.n.e());
            synchronized (f32238e) {
                str2 = this.f32240c;
            }
            if (str2 == null) {
                str2 = "com.google.android.gms.availability";
                notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String string = context.getResources().getString(C9.c.f1526g);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(AbstractC1585a0.a("com.google.android.gms.availability", string, 4));
                } else {
                    name = notificationChannel.getName();
                    if (!string.contentEquals(name)) {
                        notificationChannel.setName(string);
                        notificationManager.createNotificationChannel(notificationChannel);
                    }
                }
            }
            G10.i(str2);
        }
        Notification d11 = G10.d();
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            AbstractC3175h.f32613b.set(false);
            i11 = 10436;
        } else {
            i11 = 39789;
        }
        notificationManager.notify(i11, d11);
    }
}
