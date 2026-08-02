package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public final class zzib {
    private zzib zza;
    private Map<String, zzqw> zzb;

    private zzib(zzib zzibVar) {
        this.zzb = null;
        this.zza = zzibVar;
    }

    public final zzib zza() {
        return new zzib(this);
    }

    public final zzqw<?> zzb(String str) {
        Map<String, zzqw> map = this.zzb;
        if (map != null && map.containsKey(str)) {
            return this.zzb.get(str);
        }
        zzib zzibVar = this.zza;
        if (zzibVar != null) {
            return zzibVar.zzb(str);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() != 0 ? "Trying to get a non existent symbol: ".concat(valueOf) : new String("Trying to get a non existent symbol: "));
    }

    public final void zzc(String str, zzqw<?> zzqwVar) {
        if (this.zzb == null) {
            this.zzb = new HashMap();
        }
        this.zzb.put(str, zzqwVar);
    }

    public final void zzd(String str) {
        Preconditions.checkState(zzf("gtm.globals.eventName"));
        Map<String, zzqw> map = this.zzb;
        if (map == null || !map.containsKey("gtm.globals.eventName")) {
            this.zza.zzd("gtm.globals.eventName");
        } else {
            this.zzb.remove("gtm.globals.eventName");
        }
    }

    public final void zze(String str, zzqw<?> zzqwVar) {
        Map<String, zzqw> map = this.zzb;
        if (map != null && map.containsKey(str)) {
            this.zzb.put(str, zzqwVar);
            return;
        }
        zzib zzibVar = this.zza;
        if (zzibVar == null) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Trying to modify a non existent symbol: ".concat(valueOf) : new String("Trying to modify a non existent symbol: "));
        }
        zzibVar.zze(str, zzqwVar);
    }

    public final boolean zzf(String str) {
        Map<String, zzqw> map = this.zzb;
        if (map != null && map.containsKey(str)) {
            return true;
        }
        zzib zzibVar = this.zza;
        if (zzibVar != null) {
            return zzibVar.zzf(str);
        }
        return false;
    }

    public zzib() {
        this(null);
    }
}
