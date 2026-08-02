package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzgts {
    public static zzgto zza(zzgto zzgtoVar) {
        return ((zzgtoVar instanceof zzgtr) || (zzgtoVar instanceof zzgtp)) ? zzgtoVar : zzgtoVar instanceof Serializable ? new zzgtp(zzgtoVar) : new zzgtr(zzgtoVar);
    }
}
