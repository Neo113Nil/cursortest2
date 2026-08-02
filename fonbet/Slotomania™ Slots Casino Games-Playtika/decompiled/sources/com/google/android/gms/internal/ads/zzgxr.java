package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
final class zzgxr extends zzgxt implements Serializable {
    static final zzgxr zza = new zzgxr();

    private zzgxr() {
    }

    @Override // com.google.android.gms.internal.ads.zzgxt, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final zzgxt zza() {
        return zzgyb.zza;
    }
}
