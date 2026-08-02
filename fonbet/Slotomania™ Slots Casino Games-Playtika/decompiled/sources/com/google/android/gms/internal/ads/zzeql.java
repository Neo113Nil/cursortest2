package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes.dex */
final class zzeql extends zzcvg {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzeql(zzeqp zzeqpVar, View view, zzcki zzckiVar, zzcxf zzcxfVar, zzfju zzfjuVar) {
        super(view, null, zzcxfVar, zzfjuVar);
        Objects.requireNonNull(zzeqpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcvg
    public final zzddr zze(Set set) {
        return new zzddr(Collections.emptySet());
    }
}
