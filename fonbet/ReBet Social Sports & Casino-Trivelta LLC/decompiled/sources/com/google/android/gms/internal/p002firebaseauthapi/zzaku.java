package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzalf;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzaku {
    static final zzaku zza = new zzaku(true);
    private static volatile boolean zzb = false;
    private final Map<zzakt, zzalf.zzf<?, ?>> zzc;

    public zzaku() {
        this.zzc = new HashMap();
    }

    public static zzaku zza() {
        return zza;
    }

    public final <ContainingType extends zzamm> zzalf.zzf<ContainingType, ?> zza(ContainingType containingtype, int i10) {
        return (zzalf.zzf) this.zzc.get(new zzakt(containingtype, i10));
    }

    private zzaku(boolean z10) {
        this.zzc = Collections.EMPTY_MAP;
    }
}
