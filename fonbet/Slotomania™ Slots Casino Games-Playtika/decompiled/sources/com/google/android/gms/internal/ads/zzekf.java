package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.Context;
import android.content.DialogInterface;
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
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import com.google.android.gms.ads.AdService;
import com.google.android.gms.ads.NotificationHandlerActivity;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.net.HttpHeaders;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.internal.partials.AdMobNetworkBridge;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes4.dex */
public final class zzekf extends zzbyh {
    final Map zza = new HashMap();
    private final Context zzb;
    private final zzdyz zzc;
    private final com.google.android.gms.ads.internal.util.client.zzu zzd;
    private final zzeju zze;
    private String zzf;
    private String zzg;

    public zzekf(Context context, zzeju zzejuVar, com.google.android.gms.ads.internal.util.client.zzu zzuVar, zzdyz zzdyzVar) {
        this.zzb = context;
        this.zzc = zzdyzVar;
        this.zzd = zzuVar;
        this.zze = zzejuVar;
    }

    public static void safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(Activity p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, h.h);
        p0.startActivity(p1);
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, h.h);
        p0.startActivity(p1);
    }

    public static void zzd(Context context, zzdyz zzdyzVar, zzeju zzejuVar, String str, String str2) {
        zzk(context, zzdyzVar, zzejuVar, str, str2, new HashMap());
    }

    public static void zzk(Context context, zzdyz zzdyzVar, zzeju zzejuVar, String str, String str2, Map map) {
        String str3;
        String str4 = true != com.google.android.gms.ads.internal.zzt.zzh().zzs(context) ? "offline" : "online";
        if (zzdyzVar != null) {
            zzdyy zza = zzdyzVar.zza();
            zza.zzc("gqi", str);
            zza.zzc("action", str2);
            zza.zzc("device_connectivity", str4);
            zza.zzc("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis()));
            for (Map.Entry entry : map.entrySet()) {
                zza.zzc((String) entry.getKey(), (String) entry.getValue());
            }
            str3 = zza.zzg();
        } else {
            str3 = "";
        }
        zzejuVar.zze(new zzejw(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis(), str, str3, 2));
    }

    public static final PendingIntent zzr(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setAction(str);
        intent.putExtra("offline_notification_action", str);
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str3);
        if (Build.VERSION.SDK_INT >= 29 && str.equals("offline_notification_clicked")) {
            intent.setClassName(context, NotificationHandlerActivity.CLASS_NAME);
            return zzgpw.zza(context, 0, intent, 201326592);
        }
        intent.setClassName(context, AdService.CLASS_NAME);
        ClipData clipData = zzgpw.zza;
        return zzgpw.zzb(context, 0, intent, 1140850688, 0);
    }

    private final void zzs(final Activity activity, final com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        com.google.android.gms.ads.internal.zzt.zzc();
        if (NotificationManagerCompat.from(activity).areNotificationsEnabled()) {
            zzt();
            zzu(activity, zzmVar);
        } else {
            if (Build.VERSION.SDK_INT >= 33) {
                activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 12345);
                zzw(this.zzf, "asnpdi", zzgwc.zza());
                return;
            }
            com.google.android.gms.ads.internal.zzt.zzc();
            AlertDialog.Builder zzN = com.google.android.gms.ads.internal.util.zzs.zzN(activity);
            zzN.setTitle(zzx(R.string.notifications_permission_title, "Allow app to send you notifications?")).setPositiveButton(zzx(R.string.notifications_permission_confirm, HttpHeaders.ALLOW), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzeka
                @Override // android.content.DialogInterface.OnClickListener
                public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i) {
                    zzekf.this.zzo(activity, zzmVar, dialogInterface, i);
                }
            }).setNegativeButton(zzx(R.string.notifications_permission_decline, "Don't allow"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzekb
                @Override // android.content.DialogInterface.OnClickListener
                public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i) {
                    zzekf.this.zzp(zzmVar, dialogInterface, i);
                }
            }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzekc
                @Override // android.content.DialogInterface.OnCancelListener
                public final /* synthetic */ void onCancel(DialogInterface dialogInterface) {
                    zzekf.this.zzq(zzmVar, dialogInterface);
                }
            });
            zzN.create().show();
            zzw(this.zzf, "rtsdi", zzgwc.zza());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzt() {
        boolean z;
        boolean z2;
        try {
            com.google.android.gms.ads.internal.zzt.zzc();
            Context context = this.zzb;
            com.google.android.gms.ads.internal.util.zzbo zzC = com.google.android.gms.ads.internal.util.zzs.zzC(context);
            IObjectWrapper wrap = ObjectWrapper.wrap(context);
            String str = this.zzg;
            String str2 = this.zzf;
            zzejm zzejmVar = (zzejm) this.zza.get(str2);
            z = zzC.zzg(wrap, new com.google.android.gms.ads.internal.offline.buffering.zza(str, str2, zzejmVar == null ? "" : zzejmVar.zzb()));
            if (z) {
                z2 = true;
            } else {
                try {
                    z2 = zzC.zze(ObjectWrapper.wrap(context), this.zzg, this.zzf);
                } catch (RemoteException e) {
                    e = e;
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to schedule offline notification poster.", e);
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
            this.zze.zzd(this.zzf);
            zzw(this.zzf, "offline_notification_worker_not_scheduled", zzgwc.zza());
        }
    }

    private final void zzu(Activity activity, com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        AlertDialog zzv = zzv(activity, zzmVar);
        zzv.show();
        Timer timer = new Timer();
        timer.schedule(new zzejx(this, zzv, timer, zzmVar), 3000L);
    }

    private final AlertDialog zzv(Activity activity, final com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        com.google.android.gms.ads.internal.zzt.zzc();
        AlertDialog.Builder onCancelListener = com.google.android.gms.ads.internal.util.zzs.zzN(activity).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzekd
            @Override // android.content.DialogInterface.OnCancelListener
            public final /* synthetic */ void onCancel(DialogInterface dialogInterface) {
                com.google.android.gms.ads.internal.overlay.zzm zzmVar2 = com.google.android.gms.ads.internal.overlay.zzm.this;
                if (zzmVar2 != null) {
                    zzmVar2.zzb();
                }
            }
        });
        XmlResourceParser zzy = zzy(R.layout.offline_ads_dialog);
        if (zzy == null) {
            onCancelListener.setMessage(zzx(R.string.offline_dialog_text, "Thanks for your interest.\nWe will share more once you're back online."));
            return onCancelListener.create();
        }
        try {
            View inflate = activity.getLayoutInflater().inflate(zzy, (ViewGroup) null);
            onCancelListener.setView(inflate);
            String zzz = zzz();
            if (!TextUtils.isEmpty(zzz)) {
                TextView textView = (TextView) inflate.findViewById(R.id.offline_dialog_advertiser_name);
                textView.setVisibility(0);
                textView.setText(zzz);
            }
            zzejm zzejmVar = (zzejm) this.zza.get(this.zzf);
            Drawable zzc = zzejmVar != null ? zzejmVar.zzc() : null;
            if (zzc != null) {
                ((ImageView) inflate.findViewById(R.id.offline_dialog_image)).setImageDrawable(zzc);
            }
            AlertDialog create = onCancelListener.create();
            create.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            return create;
        } catch (Resources.NotFoundException unused) {
            onCancelListener.setMessage(zzx(R.string.offline_dialog_text, "Thanks for your interest.\nWe will share more once you're back online."));
            return onCancelListener.create();
        }
    }

    private final void zzw(String str, String str2, Map map) {
        zzk(this.zzb, this.zzc, this.zze, str, str2, map);
    }

    private static String zzx(int i, String str) {
        Resources zzf = com.google.android.gms.ads.internal.zzt.zzh().zzf();
        if (zzf != null) {
            try {
                return zzf.getString(i);
            } catch (Resources.NotFoundException unused) {
            }
        }
        return str;
    }

    private static XmlResourceParser zzy(int i) {
        Resources zzf = com.google.android.gms.ads.internal.zzt.zzh().zzf();
        if (zzf == null) {
            return null;
        }
        try {
            return zzf.getLayout(i);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    private final String zzz() {
        zzejm zzejmVar = (zzejm) this.zza.get(this.zzf);
        return zzejmVar == null ? "" : zzejmVar.zza();
    }

    public final void zzc(String str, zzdph zzdphVar) {
        String zzQ = zzdphVar.zzQ();
        String zzB = zzdphVar.zzB();
        String str2 = "";
        if (TextUtils.isEmpty(zzQ)) {
            zzQ = zzB != null ? zzB : "";
        }
        zzbls zzD = zzdphVar.zzD();
        if (zzD != null) {
            try {
                str2 = zzD.zzc().toString();
            } catch (RemoteException unused) {
            }
        }
        zzbls zzP = zzdphVar.zzP();
        Drawable drawable = null;
        if (zzP != null) {
            try {
                IObjectWrapper zzb = zzP.zzb();
                if (zzb != null) {
                    drawable = (Drawable) ObjectWrapper.unwrap(zzb);
                }
            } catch (RemoteException unused2) {
            }
        }
        this.zza.put(str, new zzejj(zzQ, str2, drawable));
    }

    @Override // com.google.android.gms.internal.ads.zzbyi
    public final void zze(Intent intent) {
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra != null) {
            if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
                String stringExtra2 = intent.getStringExtra("gws_query_id");
                String stringExtra3 = intent.getStringExtra("uri");
                Context context = this.zzb;
                boolean zzs = com.google.android.gms.ads.internal.zzt.zzh().zzs(context);
                HashMap hashMap = new HashMap();
                if (stringExtra.equals("offline_notification_clicked")) {
                    hashMap.put("offline_notification_action", "offline_notification_clicked");
                    r9 = true == zzs ? (char) 1 : (char) 2;
                    hashMap.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
                    hashMap.put("olaih", String.valueOf(stringExtra3.startsWith("http")));
                    try {
                        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                        if (launchIntentForPackage == null) {
                            launchIntentForPackage = new Intent("android.intent.action.VIEW");
                            launchIntentForPackage.setData(Uri.parse(stringExtra3));
                        }
                        launchIntentForPackage.addFlags(268435456);
                        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, launchIntentForPackage);
                        hashMap.put("olaa", "olas");
                    } catch (ActivityNotFoundException unused) {
                        hashMap.put("olaa", "olaf");
                    }
                } else {
                    hashMap.put("offline_notification_action", "offline_notification_dismissed");
                }
                zzw(stringExtra2, "offline_notification_action", hashMap);
                try {
                    SQLiteDatabase writableDatabase = this.zze.getWritableDatabase();
                    if (r9 == 1) {
                        this.zze.zzb(writableDatabase, this.zzd, stringExtra2);
                    } else {
                        zzeju.zzi(writableDatabase, stringExtra2);
                    }
                } catch (SQLiteException e) {
                    String concat = "Failed to get writable offline buffering database: ".concat(e.toString());
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzf(concat);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyi
    public final void zzf(IObjectWrapper iObjectWrapper, String str, String str2) {
        zzj(iObjectWrapper, new com.google.android.gms.ads.internal.offline.buffering.zza(str, str2, ""));
    }

    @Override // com.google.android.gms.internal.ads.zzbyi
    public final void zzg() {
        final com.google.android.gms.ads.internal.util.client.zzu zzuVar = this.zzd;
        this.zze.zza(new zzfny() { // from class: com.google.android.gms.internal.ads.zzejs
            @Override // com.google.android.gms.internal.ads.zzfny
            public final /* synthetic */ Object zza(Object obj) {
                zzeju.zzf(com.google.android.gms.ads.internal.util.client.zzu.this, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbyi
    public final void zzh(IObjectWrapper iObjectWrapper) {
        zzekh zzekhVar = (zzekh) ObjectWrapper.unwrap(iObjectWrapper);
        final Activity zza = zzekhVar.zza();
        final com.google.android.gms.ads.internal.overlay.zzm zzb = zzekhVar.zzb();
        this.zzf = zzekhVar.zzc();
        this.zzg = zzekhVar.zzd();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzjI)).booleanValue()) {
            zzs(zza, zzb);
            return;
        }
        zzw(this.zzf, "dialog_impression", zzgwc.zza());
        com.google.android.gms.ads.internal.zzt.zzc();
        AlertDialog.Builder zzN = com.google.android.gms.ads.internal.util.zzs.zzN(zza);
        zzN.setTitle(zzx(R.string.offline_opt_in_title, "Open ad when you're back online.")).setMessage(zzx(R.string.offline_opt_in_message, "We'll send you a notification with a link to the advertiser site.")).setPositiveButton(zzx(R.string.offline_opt_in_confirm, "OK"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzeke
            @Override // android.content.DialogInterface.OnClickListener
            public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i) {
                zzekf.this.zzl(zza, zzb, dialogInterface, i);
            }
        }).setNegativeButton(zzx(R.string.offline_opt_in_decline, "No thanks"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzejy
            @Override // android.content.DialogInterface.OnClickListener
            public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i) {
                zzekf.this.zzm(zzb, dialogInterface, i);
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzejz
            @Override // android.content.DialogInterface.OnCancelListener
            public final /* synthetic */ void onCancel(DialogInterface dialogInterface) {
                zzekf.this.zzn(zzb, dialogInterface);
            }
        });
        zzN.create().show();
    }

    @Override // com.google.android.gms.internal.ads.zzbyi
    public final void zzi(String[] strArr, int[] iArr, IObjectWrapper iObjectWrapper) {
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals("android.permission.POST_NOTIFICATIONS")) {
                zzekh zzekhVar = (zzekh) ObjectWrapper.unwrap(iObjectWrapper);
                Activity zza = zzekhVar.zza();
                com.google.android.gms.ads.internal.overlay.zzm zzb = zzekhVar.zzb();
                HashMap hashMap = new HashMap();
                if (iArr[i] == 0) {
                    hashMap.put("dialog_action", "confirm");
                    zzt();
                    zzu(zza, zzb);
                } else {
                    hashMap.put("dialog_action", "dismiss");
                    if (zzb != null) {
                        zzb.zzb();
                    }
                }
                zzw(this.zzf, "asnpdc", hashMap);
                return;
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(1:3)(1:28)|4|(9:8|9|(2:21|22)|11|12|13|14|15|16)|27|(0)|11|12|13|14|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00da, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00db, code lost:
    
        r9.put("notification_not_shown_reason", r8.getMessage());
        r8 = "offline_notification_failed";
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzbyi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzj(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.offline.buffering.zza zzaVar) {
        Bitmap bitmap;
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        String str = zzaVar.zza;
        String str2 = zzaVar.zzb;
        String str3 = zzaVar.zzc;
        String zzz = zzz();
        com.google.android.gms.ads.internal.zzt.zzf().zzg(context, "offline_notification_channel", "AdMob Offline Notifications");
        PendingIntent zzr = zzr(context, "offline_notification_clicked", str2, str);
        PendingIntent zzr2 = zzr(context, "offline_notification_dismissed", str2, str);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, "offline_notification_channel");
        if (TextUtils.isEmpty(zzz)) {
            builder.setContentTitle(zzx(R.string.offline_notification_title, "You are back online! Let's pick up where we left off"));
        } else {
            builder.setContentTitle(String.format(zzx(R.string.offline_notification_title_with_advertiser, "You are back online! Continue learning about %s"), zzz));
        }
        builder.setAutoCancel(true).setDeleteIntent(zzr2).setContentIntent(zzr).setSmallIcon(context.getApplicationInfo().icon).setPriority(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzjJ)).intValue());
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzjL)).booleanValue() && !str3.isEmpty()) {
            try {
                bitmap = BitmapFactory.decodeStream(AdMobNetworkBridge.urlConnectionGetInputStream(new URL(str3).openConnection()));
            } catch (IOException unused) {
            }
            if (bitmap != null) {
                try {
                    builder.setLargeIcon(bitmap).setStyle(new NotificationCompat.BigPictureStyle().bigPicture(bitmap).bigLargeIcon((Bitmap) null));
                } catch (Resources.NotFoundException unused2) {
                }
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            HashMap hashMap = new HashMap();
            notificationManager.notify(str2, 54321, builder.build());
            String str4 = "offline_notification_impression";
            zzw(str2, str4, hashMap);
        }
        bitmap = null;
        if (bitmap != null) {
        }
        NotificationManager notificationManager2 = (NotificationManager) context.getSystemService("notification");
        HashMap hashMap2 = new HashMap();
        notificationManager2.notify(str2, 54321, builder.build());
        String str42 = "offline_notification_impression";
        zzw(str2, str42, hashMap2);
    }

    final /* synthetic */ void zzl(Activity activity, com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "confirm");
        zzw(this.zzf, "dialog_click", hashMap);
        zzs(activity, zzmVar);
    }

    final /* synthetic */ void zzm(com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface, int i) {
        this.zze.zzd(this.zzf);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzw(this.zzf, "dialog_click", hashMap);
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    final /* synthetic */ void zzn(com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface) {
        this.zze.zzd(this.zzf);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzw(this.zzf, "dialog_click", hashMap);
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    final /* synthetic */ void zzo(Activity activity, com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "confirm");
        zzw(this.zzf, "rtsdc", hashMap);
        safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(activity, com.google.android.gms.ads.internal.zzt.zzf().zzi(activity));
        zzt();
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    final /* synthetic */ void zzp(com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface, int i) {
        this.zze.zzd(this.zzf);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzw(this.zzf, "rtsdc", hashMap);
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    final /* synthetic */ void zzq(com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface) {
        this.zze.zzd(this.zzf);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzw(this.zzf, "rtsdc", hashMap);
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }
}
