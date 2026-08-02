package com.google.android.gms.internal.gtm;

import android.net.Uri;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;

/* loaded from: classes9.dex */
public final class zzpc extends zzjv {
    private final zzha zza;

    public zzpc(zzha zzhaVar) {
        this.zza = zzhaVar;
    }

    @Override // com.google.android.gms.internal.gtm.zzjv
    protected final zzqw<?> zza(zzib zzibVar, zzqw<?>... zzqwVarArr) {
        boolean z11 = true;
        Preconditions.checkArgument(true);
        int length = zzqwVarArr.length;
        Preconditions.checkArgument(length > 0);
        zzqw<?> zzqwVar = zzqwVarArr[0];
        Preconditions.checkArgument(!(zzqwVar instanceof zzra));
        zzqw<?> zzqwVar2 = length > 1 ? zzqwVarArr[1] : zzra.zze;
        zzra zzraVar = zzra.zze;
        Preconditions.checkArgument(zzqwVar2 == zzraVar || (zzqwVar2 instanceof zzrd));
        zzqw<?> zzqwVar3 = length > 2 ? zzqwVarArr[2] : zzraVar;
        if (zzqwVar3 != zzraVar && (zzqwVar3 instanceof zzra)) {
            z11 = false;
        }
        Preconditions.checkArgument(z11);
        Uri.Builder buildUpon = Uri.parse(zzju.zzd(zzqwVar)).buildUpon();
        if (zzqwVar2 != zzraVar) {
            for (zzqw<?> zzqwVar4 : ((zzrd) zzqwVar2).zzk()) {
                Preconditions.checkArgument(zzqwVar4 instanceof zzre);
                for (Map.Entry<String, zzqw<?>> entry : ((zzre) zzqwVar4).zzi().entrySet()) {
                    buildUpon.appendQueryParameter(entry.getKey().toString(), zzju.zzd(zzri.zzc(zzibVar, entry.getValue())));
                }
            }
        }
        String uri = buildUpon.build().toString();
        zzra zzraVar2 = zzra.zze;
        if (zzqwVar3 == zzraVar2) {
            ((zzgv) this.zza).zzb(uri, null, null, null, null);
            String valueOf = String.valueOf(uri);
            zzhl.zzd(valueOf.length() != 0 ? "SendPixel: url = ".concat(valueOf) : new String("SendPixel: url = "));
            return zzraVar2;
        }
        String zzd = zzju.zzd(zzqwVar3);
        ((zzgv) this.zza).zzb(uri, null, zzd, null, null);
        StringBuilder sb2 = new StringBuilder(String.valueOf(uri).length() + 30 + String.valueOf(zzd).length());
        sb2.append("SendPixel: url = ");
        sb2.append(uri);
        sb2.append(", uniqueId = ");
        sb2.append(zzd);
        zzhl.zzd(sb2.toString());
        return zzraVar2;
    }
}
