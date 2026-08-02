package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
class zzgty extends zzgup implements zzgwu {
    protected zzgty(Map map) {
        super(map);
    }

    @Override // com.google.android.gms.internal.ads.zzgup
    final Collection zza(Collection collection) {
        return Collections.unmodifiableList((List) collection);
    }

    @Override // com.google.android.gms.internal.ads.zzgup
    final Collection zzb(Object obj, Collection collection) {
        return zzg(obj, (List) collection, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgup
    /* bridge */ /* synthetic */ Collection zzc() {
        throw null;
    }
}
