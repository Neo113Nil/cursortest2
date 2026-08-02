package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzbbd {
    private List zza = Collections.emptyList();

    public final void zza(List list) {
        this.zza = new ArrayList(list);
    }

    public final List zzb() {
        List list = this.zza;
        this.zza = Collections.emptyList();
        return list;
    }
}
