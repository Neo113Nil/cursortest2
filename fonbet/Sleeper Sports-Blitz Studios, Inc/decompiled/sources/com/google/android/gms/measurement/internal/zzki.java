package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.android.gms.internal.measurement.zzok;
import com.google.firebase.messaging.Constants;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.1 */
/* loaded from: classes7.dex */
final class zzki implements Application.ActivityLifecycleCallbacks {
    private final /* synthetic */ zziz zza;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00ad A[Catch: RuntimeException -> 0x0193, TRY_ENTER, TryCatch #0 {RuntimeException -> 0x0193, blocks: (B:3:0x000b, B:5:0x0018, B:8:0x0029, B:14:0x00ad, B:16:0x00b9, B:19:0x00ca, B:21:0x00d2, B:24:0x00df, B:26:0x00e5, B:27:0x00f8, B:29:0x0104, B:34:0x010c, B:38:0x012f, B:39:0x014b, B:41:0x013c, B:42:0x0151, B:44:0x0157, B:46:0x015d, B:48:0x0163, B:50:0x0169, B:52:0x0171, B:54:0x0179, B:56:0x017f, B:59:0x0185, B:61:0x003e, B:64:0x0046, B:66:0x004e, B:68:0x0054, B:70:0x005a, B:72:0x0060, B:74:0x0068, B:76:0x0070, B:78:0x0078, B:80:0x0080, B:81:0x008c, B:83:0x00a4), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010c A[Catch: RuntimeException -> 0x0193, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x0193, blocks: (B:3:0x000b, B:5:0x0018, B:8:0x0029, B:14:0x00ad, B:16:0x00b9, B:19:0x00ca, B:21:0x00d2, B:24:0x00df, B:26:0x00e5, B:27:0x00f8, B:29:0x0104, B:34:0x010c, B:38:0x012f, B:39:0x014b, B:41:0x013c, B:42:0x0151, B:44:0x0157, B:46:0x015d, B:48:0x0163, B:50:0x0169, B:52:0x0171, B:54:0x0179, B:56:0x017f, B:59:0x0185, B:61:0x003e, B:64:0x0046, B:66:0x004e, B:68:0x0054, B:70:0x005a, B:72:0x0060, B:74:0x0068, B:76:0x0070, B:78:0x0078, B:80:0x0080, B:81:0x008c, B:83:0x00a4), top: B:2:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ void zza(zzki zzkiVar, boolean z, Uri uri, String str, String str2) {
        Bundle zza;
        zzkiVar.zza.zzt();
        try {
            zznt zzq = zzkiVar.zza.zzq();
            boolean z2 = zzok.zza() && zzkiVar.zza.zze().zza(zzbh.zzco);
            if (!TextUtils.isEmpty(str2)) {
                if (str2.contains("gclid") || ((z2 && str2.contains("gbraid")) || str2.contains("utm_campaign") || str2.contains("utm_source") || str2.contains("utm_medium") || str2.contains("utm_id") || str2.contains("dclid") || str2.contains("srsltid") || str2.contains("sfmc_id"))) {
                    zza = zzq.zza(Uri.parse("https://google.com/search?" + str2), z2);
                    if (zza != null) {
                        zza.putString("_cis", "referrer");
                    }
                    if (z) {
                        Bundle zza2 = zzkiVar.zza.zzq().zza(uri, zzok.zza() && zzkiVar.zza.zze().zza(zzbh.zzco));
                        if (zza2 != null) {
                            zza2.putString("_cis", SDKConstants.PARAM_INTENT);
                            if (!zza2.containsKey("gclid") && zza != null && zza.containsKey("gclid")) {
                                zza2.putString("_cer", String.format("gclid=%s", zza.getString("gclid")));
                            }
                            zzkiVar.zza.zzc(str, Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN, zza2);
                            zzkiVar.zza.zza.zza(str, zza2);
                        }
                    }
                    if (TextUtils.isEmpty(str2)) {
                        zzkiVar.zza.zzj().zzc().zza("Activity created with referrer", str2);
                        if (zzkiVar.zza.zze().zza(zzbh.zzbk)) {
                            if (zza != null) {
                                zzkiVar.zza.zzc(str, Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN, zza);
                                zzkiVar.zza.zza.zza(str, zza);
                            } else {
                                zzkiVar.zza.zzj().zzc().zza("Referrer does not contain valid parameters", str2);
                            }
                            zzkiVar.zza.zza("auto", "_ldl", (Object) null, true);
                            return;
                        }
                        if (!str2.contains("gclid") || (!str2.contains("utm_campaign") && !str2.contains("utm_source") && !str2.contains("utm_medium") && !str2.contains("utm_term") && !str2.contains("utm_content"))) {
                            zzkiVar.zza.zzj().zzc().zza("Activity created with data 'referrer' without required params");
                            return;
                        } else {
                            if (TextUtils.isEmpty(str2)) {
                                return;
                            }
                            zzkiVar.zza.zza("auto", "_ldl", (Object) str2, true);
                            return;
                        }
                    }
                    return;
                }
                zzq.zzj().zzc().zza("Activity created with data 'referrer' without required params");
            }
            zza = null;
            if (z) {
            }
            if (TextUtils.isEmpty(str2)) {
            }
        } catch (RuntimeException e) {
            zzkiVar.zza.zzj().zzg().zza("Throwable caught in handleReferrerForOnActivityCreated", e);
        }
    }

    zzki(zziz zzizVar) {
        this.zza = zzizVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zzki zzkiVar;
        String str;
        try {
            this.zza.zzj().zzp().zza("onActivityCreated");
            Intent intent = activity.getIntent();
            if (intent == null) {
                this.zza.zzn().zza(activity, bundle);
                return;
            }
            Uri data = intent.getData();
            if (data == null || !data.isHierarchical()) {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    String string = extras.getString("com.android.vending.referral_url");
                    if (!TextUtils.isEmpty(string)) {
                        data = Uri.parse(string);
                    }
                }
                data = null;
            }
            Uri uri = data;
            if (uri != null && uri.isHierarchical()) {
                this.zza.zzq();
                if (zznt.zza(intent)) {
                    str = "gs";
                } else {
                    str = "auto";
                }
                String str2 = str;
                String queryParameter = uri.getQueryParameter("referrer");
                zzkiVar = this;
                try {
                    try {
                        this.zza.zzl().zzb(new zzkl(zzkiVar, bundle == null, uri, str2, queryParameter));
                        zzkiVar.zza.zzn().zza(activity, bundle);
                        return;
                    } catch (RuntimeException e) {
                        e = e;
                        zzkiVar.zza.zzj().zzg().zza("Throwable caught in onActivityCreated", e);
                        zzkiVar.zza.zzn().zza(activity, bundle);
                        return;
                    }
                } catch (Throwable th) {
                    th = th;
                    zzkiVar.zza.zzn().zza(activity, bundle);
                    throw th;
                }
            }
            this.zza.zzn().zza(activity, bundle);
        } catch (RuntimeException e2) {
            e = e2;
            zzkiVar = this;
        } catch (Throwable th2) {
            th = th2;
            zzkiVar = this;
            zzkiVar.zza.zzn().zza(activity, bundle);
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.zza.zzn().zza(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.zza.zzn().zzb(activity);
        zzml zzp = this.zza.zzp();
        zzp.zzl().zzb(new zzmn(zzp, zzp.zzb().elapsedRealtime()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        zzml zzp = this.zza.zzp();
        zzp.zzl().zzb(new zzmk(zzp, zzp.zzb().elapsedRealtime()));
        this.zza.zzn().zzc(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.zza.zzn().zzb(activity, bundle);
    }
}
