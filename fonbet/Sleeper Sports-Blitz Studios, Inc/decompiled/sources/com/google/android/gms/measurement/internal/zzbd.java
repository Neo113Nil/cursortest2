package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.1 */
/* loaded from: classes7.dex */
final class zzbd implements Iterator<String> {
    private Iterator<String> zza;
    private final /* synthetic */ zzba zzb;

    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.zza.next();
    }

    zzbd(zzba zzbaVar) {
        Bundle bundle;
        this.zzb = zzbaVar;
        bundle = zzbaVar.zza;
        this.zza = bundle.keySet().iterator();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }
}
