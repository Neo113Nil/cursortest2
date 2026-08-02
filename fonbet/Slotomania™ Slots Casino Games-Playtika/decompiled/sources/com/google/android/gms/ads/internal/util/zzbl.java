package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.internal.ads.zzasf;
import com.google.android.gms.internal.ads.zzata;
import com.google.android.gms.internal.ads.zzauc;
import com.google.android.gms.internal.ads.zzbie;
import com.google.android.gms.internal.ads.zzcfk;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes7.dex */
public final class zzbl {
    private static zzata zza;
    private static final Object zzb = new Object();

    public zzbl(Context context) {
        zzata zza2;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (zzb) {
            if (zza == null) {
                zzbie.zza(context);
                if (!ClientLibraryUtils.isPackageSide()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzfq)).booleanValue()) {
                        zza2 = zzay.zzb(context);
                        zza = zza2;
                    }
                }
                zza2 = zzauc.zza(context, null);
                zza = zza2;
            }
        }
    }

    public final ListenableFuture zza(String str) {
        zzcfk zzcfkVar = new zzcfk();
        zza.zzb(new zzbk(str, null, zzcfkVar));
        return zzcfkVar;
    }

    public final ListenableFuture zzb(int i, String str, Map map, byte[] bArr) {
        zzbi zzbiVar = new zzbi(null);
        zzbg zzbgVar = new zzbg(this, str, zzbiVar);
        com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
        zzbh zzbhVar = new zzbh(this, i, str, zzbiVar, zzbgVar, bArr, map, zzlVar);
        if (com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
            try {
                zzlVar.zzb(str, "GET", zzbhVar.zzm(), zzbhVar.zzn());
            } catch (zzasf e) {
                String message = e.getMessage();
                int i2 = zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi(message);
            }
        }
        zza.zzb(zzbhVar);
        return zzbiVar;
    }
}
