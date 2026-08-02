package com.google.android.gms.internal.measurement;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.1 */
/* loaded from: classes7.dex */
final class zzhz implements Comparator<zzhx> {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(zzhx zzhxVar, zzhx zzhxVar2) {
        zzhx zzhxVar3 = zzhxVar;
        zzhx zzhxVar4 = zzhxVar2;
        zzid zzidVar = (zzid) zzhxVar3.iterator();
        zzid zzidVar2 = (zzid) zzhxVar4.iterator();
        while (zzidVar.hasNext() && zzidVar2.hasNext()) {
            int compareTo = Integer.valueOf(zzhx.zza(zzidVar.zza())).compareTo(Integer.valueOf(zzhx.zza(zzidVar2.zza())));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(zzhxVar3.zzb()).compareTo(Integer.valueOf(zzhxVar4.zzb()));
    }

    zzhz() {
    }
}
