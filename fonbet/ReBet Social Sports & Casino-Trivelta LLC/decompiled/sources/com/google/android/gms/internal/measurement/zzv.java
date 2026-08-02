package com.google.android.gms.internal.measurement;

import com.twilio.voice.EventKeys;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzv extends zzai {
    private final zzz zza;

    public zzv(zzz zzzVar) {
        super("internal.registerCallback");
        this.zza = zzzVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzao zza(zzg zzgVar, List list) {
        zzh.zza(this.zzd, 3, list);
        String zzc = zzgVar.zza((zzao) list.get(0)).zzc();
        zzao zza = zzgVar.zza((zzao) list.get(1));
        if (!(zza instanceof zzan)) {
            throw new IllegalArgumentException("Invalid callback type");
        }
        zzao zza2 = zzgVar.zza((zzao) list.get(2));
        if (!(zza2 instanceof zzal)) {
            throw new IllegalArgumentException("Invalid callback params");
        }
        zzal zzalVar = (zzal) zza2;
        if (!zzalVar.zzj("type")) {
            throw new IllegalArgumentException("Undefined rule type");
        }
        this.zza.zza(zzc, zzalVar.zzj(EventKeys.PRIORITY) ? zzh.zzg(zzalVar.zzk(EventKeys.PRIORITY).zzd().doubleValue()) : 1000, (zzan) zza, zzalVar.zzk("type").zzc());
        return zzao.zzf;
    }
}
