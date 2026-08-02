package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.graphics.drawable.IconCompat;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.ads.AdService;
import com.google.android.gms.ads.NotificationHandlerActivity;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzu;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.ironsource.Ua;
import defpackage.b1l;
import defpackage.efd;
import defpackage.f0o;
import defpackage.fgd;
import defpackage.j4o;
import defpackage.lv4;
import defpackage.n15;
import defpackage.njo;
import defpackage.q4o;
import defpackage.r4o;
import defpackage.s4o;
import defpackage.t4o;
import defpackage.t94;
import defpackage.zed;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzelp extends zzbzl {
    public static final /* synthetic */ int i = 0;
    public final HashMap b = new HashMap();
    public final Context c;
    public final zzeaj d;
    public final zzu e;
    public final zzele f;
    public String g;
    public String h;

    public zzelp(Context context, zzele zzeleVar, zzu zzuVar, zzeaj zzeajVar) {
        this.c = context;
        this.d = zzeajVar;
        this.e = zzuVar;
        this.f = zzeleVar;
    }

    public static void F4(Context context, zzeaj zzeajVar, zzele zzeleVar, String str, String str2, Map map) {
        String str3;
        String str4 = true != com.google.android.gms.ads.internal.zzt.zzh().i(context) ? "offline" : t94.ONLINE_EXTRAS_KEY;
        if (zzeajVar != null) {
            zzeai a = zzeajVar.a();
            a.b("gqi", str);
            a.b("action", str2);
            a.b("device_connectivity", str4);
            a.b("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().a()));
            for (Map.Entry entry : map.entrySet()) {
                a.b((String) entry.getKey(), (String) entry.getValue());
            }
            str3 = a.b.a.f.generateUrl(a.a);
        } else {
            str3 = "";
        }
        zzelg zzelgVar = new zzelg(2, str, com.google.android.gms.ads.internal.zzt.zzk().a(), str3);
        zzeleVar.getClass();
        zzeleVar.e(new f0o(8, zzeleVar, zzelgVar));
    }

    public static final PendingIntent G4(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setAction(str);
        intent.putExtra("offline_notification_action", str);
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str3);
        if (Build.VERSION.SDK_INT < 29 || !str.equals("offline_notification_clicked")) {
            intent.setClassName(context, AdService.CLASS_NAME);
            return PendingIntent.getService(context, 0, zzgrj.a(intent, 1140850688), 1140850688);
        }
        intent.setClassName(context, NotificationHandlerActivity.CLASS_NAME);
        return PendingIntent.getActivity(context, 0, zzgrj.a(intent, 201326592), 201326592);
    }

    public static String L4(int i2, String str) {
        Resources c = com.google.android.gms.ads.internal.zzt.zzh().c();
        if (c == null) {
            return str;
        }
        try {
            return c.getString(i2);
        } catch (Resources.NotFoundException unused) {
            return str;
        }
    }

    public final void E4(String str, zzdqr zzdqrVar) {
        zzbmv zzbmvVar;
        String str2 = "";
        String f = zzdqrVar.f();
        String a = zzdqrVar.a();
        if (TextUtils.isEmpty(f)) {
            f = a != null ? a : "";
        }
        zzbmv b = zzdqrVar.b();
        if (b != null) {
            try {
                str2 = b.zzb().toString();
            } catch (RemoteException unused) {
            }
        }
        synchronized (zzdqrVar) {
            zzbmvVar = zzdqrVar.s;
        }
        Drawable drawable = null;
        if (zzbmvVar != null) {
            try {
                IObjectWrapper zza = zzbmvVar.zza();
                if (zza != null) {
                    drawable = (Drawable) ObjectWrapper.Z1(zza);
                }
            } catch (RemoteException unused2) {
            }
        }
        this.b.put(str, new j4o(f, str2, drawable));
    }

    public final void H4(Activity activity, com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        com.google.android.gms.ads.internal.zzt.zzc();
        if (new fgd(activity).b.areNotificationsEnabled()) {
            I4();
            J4(activity, zzmVar);
        } else {
            if (Build.VERSION.SDK_INT >= 33) {
                activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 12345);
                K4(this.g, "asnpdi", njo.g);
                return;
            }
            com.google.android.gms.ads.internal.zzt.zzc();
            AlertDialog.Builder zzN = com.google.android.gms.ads.internal.util.zzs.zzN(activity);
            int i2 = 1;
            zzN.setTitle(L4(R.string.notifications_permission_title, "Allow app to send you notifications?")).setPositiveButton(L4(R.string.notifications_permission_confirm, "Allow"), new t4o(this, activity, zzmVar, 0)).setNegativeButton(L4(R.string.notifications_permission_decline, "Don't allow"), new r4o(this, zzmVar, i2)).setOnCancelListener(new s4o(this, zzmVar, i2));
            zzN.create().show();
            K4(this.g, "rtsdi", njo.g);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I4() {
        boolean z;
        boolean z2;
        try {
            com.google.android.gms.ads.internal.zzt.zzc();
            Context context = this.c;
            com.google.android.gms.ads.internal.util.zzbo zzC = com.google.android.gms.ads.internal.util.zzs.zzC(context);
            ObjectWrapper objectWrapper = new ObjectWrapper(context);
            String str = this.h;
            String str2 = this.g;
            j4o j4oVar = (j4o) this.b.get(str2);
            z = zzC.zzg(objectWrapper, new com.google.android.gms.ads.internal.offline.buffering.zza(str, str2, j4oVar == null ? "" : j4oVar.b));
            if (z) {
                z2 = true;
            } else {
                try {
                    z2 = zzC.zze(new ObjectWrapper(context), this.h, this.g);
                } catch (RemoteException e) {
                    e = e;
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    zzo.zzg("Failed to schedule offline notification poster.", e);
                    z2 = z;
                    if (z2) {
                    }
                }
            }
        } catch (RemoteException e2) {
            e = e2;
            z = false;
        }
        if (z2) {
            this.f.f(this.g);
            K4(this.g, "offline_notification_worker_not_scheduled", njo.g);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0036 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J4(Activity activity, com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        XmlResourceParser layout;
        AlertDialog create;
        com.google.android.gms.ads.internal.zzt.zzc();
        AlertDialog.Builder onCancelListener = com.google.android.gms.ads.internal.util.zzs.zzN(activity).setOnCancelListener(new n15(zzmVar, 4));
        int i2 = R.layout.offline_ads_dialog;
        Resources c = com.google.android.gms.ads.internal.zzt.zzh().c();
        if (c != null) {
            try {
                layout = c.getLayout(i2);
            } catch (Resources.NotFoundException unused) {
            }
            if (layout != null) {
                onCancelListener.setMessage(L4(R.string.offline_dialog_text, "Thanks for your interest.\nWe will share more once you're back online."));
                create = onCancelListener.create();
            } else {
                try {
                    View inflate = activity.getLayoutInflater().inflate(layout, (ViewGroup) null);
                    onCancelListener.setView(inflate);
                    String str = this.g;
                    HashMap hashMap = this.b;
                    j4o j4oVar = (j4o) hashMap.get(str);
                    String str2 = j4oVar == null ? "" : j4oVar.a;
                    if (!TextUtils.isEmpty(str2)) {
                        TextView textView = (TextView) inflate.findViewById(R.id.offline_dialog_advertiser_name);
                        textView.setVisibility(0);
                        textView.setText(str2);
                    }
                    j4o j4oVar2 = (j4o) hashMap.get(this.g);
                    Drawable drawable = j4oVar2 != null ? j4oVar2.c : null;
                    if (drawable != null) {
                        ((ImageView) inflate.findViewById(R.id.offline_dialog_image)).setImageDrawable(drawable);
                    }
                    create = onCancelListener.create();
                    create.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                } catch (Resources.NotFoundException unused2) {
                    onCancelListener.setMessage(L4(R.string.offline_dialog_text, "Thanks for your interest.\nWe will share more once you're back online."));
                    create = onCancelListener.create();
                }
            }
            create.show();
            Timer timer = new Timer();
            timer.schedule(new q4o(this, create, timer, zzmVar), Ua.C);
        }
        layout = null;
        if (layout != null) {
        }
        create.show();
        Timer timer2 = new Timer();
        timer2.schedule(new q4o(this, create, timer2, zzmVar), Ua.C);
    }

    @Override // com.google.android.gms.internal.ads.zzbzm
    public final void K(Intent intent) {
        zzele zzeleVar = this.f;
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra != null) {
            if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
                String stringExtra2 = intent.getStringExtra("gws_query_id");
                String stringExtra3 = intent.getStringExtra("uri");
                zzcfv zzh = com.google.android.gms.ads.internal.zzt.zzh();
                Context context = this.c;
                boolean i2 = zzh.i(context);
                HashMap hashMap = new HashMap();
                if (stringExtra.equals("offline_notification_clicked")) {
                    hashMap.put("offline_notification_action", "offline_notification_clicked");
                    r10 = true == i2 ? (char) 1 : (char) 2;
                    hashMap.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
                    hashMap.put("olaih", String.valueOf(stringExtra3.startsWith("http")));
                    try {
                        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                        if (launchIntentForPackage == null) {
                            launchIntentForPackage = new Intent("android.intent.action.VIEW");
                            launchIntentForPackage.setData(Uri.parse(stringExtra3));
                        }
                        launchIntentForPackage.addFlags(268435456);
                        context.startActivity(launchIntentForPackage);
                        hashMap.put("olaa", "olas");
                    } catch (ActivityNotFoundException unused) {
                        hashMap.put("olaa", "olaf");
                    }
                } else {
                    hashMap.put("offline_notification_action", "offline_notification_dismissed");
                }
                K4(stringExtra2, "offline_notification_action", hashMap);
                try {
                    SQLiteDatabase writableDatabase = zzeleVar.getWritableDatabase();
                    if (r10 != 1) {
                        writableDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{stringExtra2, Integer.toString(0)});
                    } else {
                        zzeleVar.b.execute(new lv4(writableDatabase, stringExtra2, this.e, false, 26));
                    }
                } catch (SQLiteException e) {
                    String concat = "Failed to get writable offline buffering database: ".concat(e.toString());
                    int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                    zzo.zzf(concat);
                }
            }
        }
    }

    public final void K4(String str, String str2, Map map) {
        F4(this.c, this.d, this.f, str, str2, map);
    }

    @Override // com.google.android.gms.internal.ads.zzbzm
    public final void T1(String[] strArr, int[] iArr, IObjectWrapper iObjectWrapper) {
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (strArr[i2].equals("android.permission.POST_NOTIFICATIONS")) {
                zzelr zzelrVar = (zzelr) ObjectWrapper.Z1(iObjectWrapper);
                Activity a = zzelrVar.a();
                com.google.android.gms.ads.internal.overlay.zzm b = zzelrVar.b();
                HashMap hashMap = new HashMap();
                if (iArr[i2] == 0) {
                    hashMap.put("dialog_action", "confirm");
                    I4();
                    J4(a, b);
                } else {
                    hashMap.put("dialog_action", "dismiss");
                    if (b != null) {
                        b.zza();
                    }
                }
                K4(this.g, "asnpdc", hashMap);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzm
    public final void t(IObjectWrapper iObjectWrapper) {
        zzelr zzelrVar = (zzelr) ObjectWrapper.Z1(iObjectWrapper);
        Activity a = zzelrVar.a();
        com.google.android.gms.ads.internal.overlay.zzm b = zzelrVar.b();
        this.g = zzelrVar.c();
        this.h = zzelrVar.d();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Q9)).booleanValue()) {
            H4(a, b);
            return;
        }
        K4(this.g, "dialog_impression", njo.g);
        com.google.android.gms.ads.internal.zzt.zzc();
        AlertDialog.Builder zzN = com.google.android.gms.ads.internal.util.zzs.zzN(a);
        int i2 = 0;
        zzN.setTitle(L4(R.string.offline_opt_in_title, "Open ad when you're back online.")).setMessage(L4(R.string.offline_opt_in_message, "We'll send you a notification with a link to the advertiser site.")).setPositiveButton(L4(R.string.offline_opt_in_confirm, Payload.RESPONSE_OK), new t4o(this, a, b, 1)).setNegativeButton(L4(R.string.offline_opt_in_decline, "No thanks"), new r4o(this, b, i2)).setOnCancelListener(new s4o(this, b, i2));
        zzN.create().show();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(1:3)(1:32)|4|(1:6)(1:31)|7|(9:11|12|(2:24|25)|14|15|16|17|18|19)|30|(0)|14|15|16|17|18|19) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00e4, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00e5, code lost:
    
        r9.put("notification_not_shown_reason", r8.getMessage());
        r8 = "offline_notification_failed";
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzbzm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w4(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.offline.buffering.zza zzaVar) {
        Bitmap bitmap;
        Context context = (Context) ObjectWrapper.Z1(iObjectWrapper);
        String str = zzaVar.zza;
        String str2 = zzaVar.zzb;
        String str3 = zzaVar.zzc;
        j4o j4oVar = (j4o) this.b.get(this.g);
        String str4 = j4oVar == null ? "" : j4oVar.a;
        com.google.android.gms.ads.internal.zzt.zzf().zze(context, "offline_notification_channel", "AdMob Offline Notifications");
        PendingIntent G4 = G4(context, "offline_notification_clicked", str2, str);
        PendingIntent G42 = G4(context, "offline_notification_dismissed", str2, str);
        efd efdVar = new efd(context, "offline_notification_channel");
        if (TextUtils.isEmpty(str4)) {
            efdVar.d(L4(R.string.offline_notification_title, "You are back online! Let's pick up where we left off"));
        } else {
            efdVar.d(String.format(L4(R.string.offline_notification_title_with_advertiser, "You are back online! Continue learning about %s"), str4));
        }
        efdVar.e(16, true);
        Notification notification = efdVar.v;
        notification.deleteIntent = G42;
        efdVar.g = G4;
        notification.icon = context.getApplicationInfo().icon;
        efdVar.j = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.R9)).intValue();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.T9)).booleanValue() && !str3.isEmpty()) {
            try {
                bitmap = BitmapFactory.decodeStream(new URL(str3).openConnection().getInputStream());
            } catch (IOException unused) {
            }
            if (bitmap != null) {
                try {
                    efdVar.f(bitmap);
                    zed zedVar = new zed();
                    IconCompat iconCompat = new IconCompat(1);
                    iconCompat.b = bitmap;
                    zedVar.c = iconCompat;
                    zedVar.d = null;
                    zedVar.e = true;
                    efdVar.g(zedVar);
                } catch (Resources.NotFoundException unused2) {
                }
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            HashMap hashMap = new HashMap();
            notificationManager.notify(str2, 54321, efdVar.b());
            String str5 = "offline_notification_impression";
            K4(str2, str5, hashMap);
        }
        bitmap = null;
        if (bitmap != null) {
        }
        NotificationManager notificationManager2 = (NotificationManager) context.getSystemService("notification");
        HashMap hashMap2 = new HashMap();
        notificationManager2.notify(str2, 54321, efdVar.b());
        String str52 = "offline_notification_impression";
        K4(str2, str52, hashMap2);
    }

    @Override // com.google.android.gms.internal.ads.zzbzm
    public final void zzg() {
        this.f.e(new b1l(this.e, 18));
    }
}
