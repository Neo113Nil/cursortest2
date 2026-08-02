package com.google.android.gms.internal.gtm;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public class zzuj {
    static final zzuj zza = new zzuj(true);
    private static volatile boolean zzb = false;
    private static volatile zzuj zzc;
    private static volatile zzuj zzd;
    private final Map<zzui, zzux<?, ?>> zze;

    zzuj() {
        this.zze = new HashMap();
    }

    public static zzuj zza() {
        zzuj zzujVar;
        zzuj zzujVar2 = zzc;
        if (zzujVar2 != null) {
            return zzujVar2;
        }
        synchronized (zzuj.class) {
            try {
                zzujVar = zzc;
                if (zzujVar == null) {
                    zzujVar = zza;
                    zzc = zzujVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzujVar;
    }

    public static zzuj zzb() {
        zzuj zzujVar = zzd;
        if (zzujVar != null) {
            return zzujVar;
        }
        synchronized (zzuj.class) {
            try {
                zzuj zzujVar2 = zzd;
                if (zzujVar2 != null) {
                    return zzujVar2;
                }
                zzuj zzb2 = zzur.zzb(zzuj.class);
                zzd = zzb2;
                return zzb2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public <ContainingType extends zzwk> zzux<ContainingType, ?> zzc(ContainingType containingtype, int i11) {
        return (zzux) this.zze.get(new zzui(containingtype, i11));
    }

    zzuj(boolean z11) {
        this.zze = Collections.EMPTY_MAP;
    }
}
