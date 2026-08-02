package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
final class zzhar extends zzhat {
    zzhar(zzgvv zzgvvVar, boolean z) {
        super(zzgvvVar, z);
        zze();
    }

    @Override // com.google.android.gms.internal.ads.zzhat
    public final /* bridge */ /* synthetic */ Object zzD(List list) {
        ArrayList zzb = zzgwz.zzb(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzhas zzhasVar = (zzhas) it.next();
            zzb.add(zzhasVar != null ? zzhasVar.zza : null);
        }
        return Collections.unmodifiableList(zzb);
    }
}
