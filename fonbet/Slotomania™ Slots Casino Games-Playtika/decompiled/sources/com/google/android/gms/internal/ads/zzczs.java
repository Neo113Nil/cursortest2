package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzczs implements zzdfl, zzdky {
    private zzcak zza;
    private final Context zzc;
    private final zzfpv zzd;
    private final VersionInfoParcel zze;
    private final Executor zzf;
    private boolean zzg = false;
    private boolean zzh = false;
    private final AtomicBoolean zzb = new AtomicBoolean();

    zzczs(Context context, zzfpv zzfpvVar, VersionInfoParcel versionInfoParcel, Executor executor) {
        this.zzc = context;
        this.zzd = zzfpvVar;
        this.zze = versionInfoParcel;
        this.zzf = executor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
    
        if (android.text.TextUtils.equals(r0, androidx.core.app.NotificationCompat.CATEGORY_SERVICE) != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzc() {
        zzcak zzcakVar;
        int i;
        int i2;
        zzbtw zzb;
        if (!this.zzb.getAndSet(true)) {
            if (!((Boolean) zzbke.zzo.zze()).booleanValue()) {
                i = 3;
                if (!((Boolean) zzbke.zzp.zze()).booleanValue()) {
                    if (((Boolean) zzbke.zzn.zze()).booleanValue()) {
                        try {
                            String optString = new JSONObject(com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzd()).optString("local_flag_write");
                            if (TextUtils.equals(optString, "client")) {
                            }
                        } catch (JSONException unused) {
                        }
                    }
                    i = 1;
                }
                i2 = i - 1;
                if (i2 != 1) {
                    zzb = com.google.android.gms.ads.internal.zzt.zzr().zzb(this.zzc, VersionInfoParcel.forPackage(), this.zzd);
                } else if (i2 == 2) {
                    zzb = com.google.android.gms.ads.internal.zzt.zzr().zza(this.zzc, VersionInfoParcel.forPackage(), this.zzd);
                }
                zzbtq zzbtqVar = zzbtt.zza;
                this.zza = new zzcan(this.zzc, zzb.zza("google.afma.sdkConstants.getSdkConstants", zzbtqVar, zzbtqVar), this.zze, this.zzf);
                this.zzg = true;
            }
            i = 2;
            i2 = i - 1;
            if (i2 != 1) {
            }
            zzbtq zzbtqVar2 = zzbtt.zza;
            this.zza = new zzcan(this.zzc, zzb.zza("google.afma.sdkConstants.getSdkConstants", zzbtqVar2, zzbtqVar2), this.zze, this.zzf);
            this.zzg = true;
        }
        if (this.zzg && (zzcakVar = this.zza) != null) {
            ListenableFuture zzb2 = zzcakVar.zzb();
            if (!this.zzh && ((Boolean) zzbjw.zzi.zze()).booleanValue()) {
                zzb2.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzczr
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzczs.this.zzf();
                    }
                }, this.zzf);
            }
            zzcfi.zza(zzb2, "persistFlagsClient", zzcff.zzh);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdky
    public final void zzd(com.google.android.gms.ads.nonagon.signalgeneration.zzbc zzbcVar) {
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzdfl
    public final void zzdP(zzcar zzcarVar) {
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzdfl
    public final void zzdQ(zzfke zzfkeVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdky
    public final void zze(String str) {
        zzc();
    }

    final /* synthetic */ void zzf() {
        zzbhp.zze(this.zzc);
        this.zzh = true;
    }
}
