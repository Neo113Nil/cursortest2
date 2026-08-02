package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import androidx.exifinterface.media.ExifInterface;
import com.braze.Constants;
import com.google.common.util.concurrent.ListenableFuture;
import com.safedk.android.analytics.brandsafety.m;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzgkd implements zzfyk {
    private final Context zza;
    private final zzgop zzb;
    private final String zzc;
    private final long zzd;
    private final long zze;

    zzgkd(Context context, zzgco zzgcoVar, zzgop zzgopVar) {
        this.zza = context;
        this.zzc = zzgcoVar.zzd();
        this.zzd = zzgcoVar.zzl();
        this.zze = zzgcoVar.zzm();
        this.zzb = zzgopVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void zza(Map map) {
        String str;
        ListenableFuture listenableFuture;
        zzayf zzayfVar;
        map.put("v", this.zzc);
        map.put(Constants.BRAZE_PUSH_TITLE_KEY, new Throwable());
        try {
            listenableFuture = (ListenableFuture) map.get("gs");
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused) {
        }
        if (listenableFuture != null && ((Build.VERSION.SDK_INT < 31 || listenableFuture.isDone()) && (zzayfVar = (zzayf) listenableFuture.get(this.zzd, TimeUnit.MILLISECONDS)) != null && zzayfVar.zzb().length() > 1)) {
            str = zzayfVar.zzb();
            if (str.equals(ExifInterface.LONGITUDE_EAST)) {
                try {
                    ListenableFuture listenableFuture2 = (ListenableFuture) map.get("ai");
                    if (listenableFuture2 != null) {
                        String str2 = (String) listenableFuture2.get(this.zze, TimeUnit.MILLISECONDS);
                        if (!zzgtn.zzc(str2)) {
                            str = str2;
                        }
                    }
                } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused2) {
                }
            }
            map.put(m.w, str);
        }
        str = ExifInterface.LONGITUDE_EAST;
        if (str.equals(ExifInterface.LONGITUDE_EAST)) {
        }
        map.put(m.w, str);
    }

    @Override // com.google.android.gms.internal.ads.zzfyk
    public final Map zzb() {
        Map zzb = this.zzb.zzb();
        zza(zzb);
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfyk
    public final Map zzc() {
        Map zzc = this.zzb.zzc(this.zza, null);
        zza(zzc);
        return zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfyk
    public final Map zzd() {
        Map zzd = this.zzb.zzd();
        zza(zzd);
        return zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzfyk
    public final Map zze() {
        HashMap hashMap = new HashMap();
        hashMap.put(Constants.BRAZE_PUSH_TITLE_KEY, new Throwable());
        return hashMap;
    }
}
