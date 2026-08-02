package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsIntent;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes5.dex */
public final class zzemt implements zzelg {
    private final Context zza;
    private final zzdmu zzb;
    private final Executor zzc;
    private final zzfjs zzd;
    private final zzdyz zze;

    public zzemt(Context context, Executor executor, zzdmu zzdmuVar, zzfjs zzfjsVar, zzdyz zzdyzVar) {
        this.zza = context;
        this.zzb = zzdmuVar;
        this.zzc = executor;
        this.zzd = zzfjsVar;
        this.zze = zzdyzVar;
    }

    private static String zze(zzfjt zzfjtVar) {
        try {
            return zzfjtVar.zzv.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzelg
    public final boolean zza(zzfke zzfkeVar, zzfjt zzfjtVar) {
        Context context = this.zza;
        return (context instanceof Activity) && zzbjf.zza(context) && !TextUtils.isEmpty(zze(zzfjtVar));
    }

    @Override // com.google.android.gms.internal.ads.zzelg
    public final ListenableFuture zzb(final zzfke zzfkeVar, final zzfjt zzfjtVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzoA)).booleanValue()) {
            zzdyy zza = this.zze.zza();
            zza.zzc("action", "cstm_tbs_rndr");
            zza.zzd();
        }
        String zze = zze(zzfjtVar);
        final Uri parse = zze != null ? Uri.parse(zze) : null;
        final zzfjw zzfjwVar = zzfkeVar.zzb.zzb;
        return zzhbi.zzj(zzhbi.zza(null), new zzhaq() { // from class: com.google.android.gms.internal.ads.zzems
            @Override // com.google.android.gms.internal.ads.zzhaq
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzemt.this.zzc(parse, zzfkeVar, zzfjtVar, zzfjwVar, obj);
            }
        }, this.zzc);
    }

    final /* synthetic */ ListenableFuture zzc(Uri uri, zzfke zzfkeVar, zzfjt zzfjtVar, zzfjw zzfjwVar, Object obj) {
        try {
            CustomTabsIntent build = new CustomTabsIntent.Builder().build();
            build.intent.setData(uri);
            com.google.android.gms.ads.internal.overlay.zzc zzcVar = new com.google.android.gms.ads.internal.overlay.zzc(build.intent, null);
            zzcfk zzcfkVar = new zzcfk();
            zzdlo zzd = this.zzb.zzd(new zzcxx(zzfkeVar, zzfjtVar, null), new zzdlr(new zzemr(this, zzcfkVar, zzfjtVar), null));
            zzcfkVar.zzc(new AdOverlayInfoParcel(zzcVar, null, zzd.zzi(), null, new VersionInfoParcel(0, 0, false), null, null, zzfjwVar.zzb));
            this.zzd.zzd();
            return zzhbi.zza(zzd.zzh());
        } catch (Throwable th) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error in CustomTabsAdRenderer", th);
            throw th;
        }
    }

    final /* synthetic */ zzdyz zzd() {
        return this.zze;
    }
}
