package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import androidx.exifinterface.media.ExifInterface;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
final class zzghr extends zzgik {
    private final Map zza;
    private final Context zzb;
    private final zzgdl zzc;
    private final long zzd;
    private final long zze;

    zzghr(zzaxf zzaxfVar, zzghg zzghgVar, Map map, Context context, zzgdl zzgdlVar, zzgco zzgcoVar, zzgpu zzgpuVar) {
        super("qC3t5rqyZK3UVuTioyfkLPUa2Vl6xhGq+RS3oEawYIo3RNg/b2c47ta/5BZxAt/J", "T+NY2maS9vnAY3yIpCoV7Pi6OACCsjaRr2E9COij6/Y=", zzaxfVar, zzghgVar, zzgpuVar.zza(113));
        this.zzb = context;
        this.zza = map;
        this.zzc = zzgdlVar;
        this.zzd = zzgcoVar.zzl();
        this.zze = zzgcoVar.zzm();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzgik
    protected final void zza(Method method, zzaxf zzaxfVar) throws IllegalAccessException, InvocationTargetException {
        zzayf zzayfVar;
        Object[] objArr = (Object[]) method.invoke("", this.zzb, Integer.valueOf(this.zzc.ordinal()));
        objArr.getClass();
        Object[] objArr2 = objArr;
        String str = ExifInterface.LONGITUDE_EAST;
        int i = 1;
        try {
            ListenableFuture listenableFuture = (ListenableFuture) this.zza.get("gs");
            if (listenableFuture != null && ((Build.VERSION.SDK_INT < 31 || listenableFuture.isDone()) && (zzayfVar = (zzayf) listenableFuture.get(this.zzd, TimeUnit.MILLISECONDS)) != null && zzayfVar.zzb().length() > 1)) {
                str = zzayfVar.zzb();
            }
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused) {
        }
        if (str.equals(ExifInterface.LONGITUDE_EAST)) {
            try {
                ListenableFuture listenableFuture2 = (ListenableFuture) this.zza.get("ai");
                if (listenableFuture2 != null) {
                    String str2 = (String) listenableFuture2.get(this.zze, TimeUnit.MILLISECONDS);
                    if (!zzgtn.zzc(str2)) {
                        str = str2;
                    }
                }
            } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused2) {
            }
        }
        Boolean bool = (Boolean) objArr2[5];
        synchronized (zzaxfVar) {
            zzaxfVar.zzu(((Long) objArr2[0]).longValue());
            zzaxfVar.zzt((String) objArr2[1]);
            zzaxfVar.zzD((String) objArr2[2]);
            zzaxfVar.zzE((String) objArr2[3]);
            zzgyu zzi = zzgyu.zzn().zzi();
            byte[] bArr = (byte[]) objArr2[4];
            zzaxfVar.zzp(zzi.zzj(bArr, 0, bArr.length));
            zzaxfVar.zzo(str);
            if (bool != null) {
                if (true == bool.booleanValue()) {
                    i = 2;
                }
                zzaxfVar.zzai(i);
            }
        }
    }
}
