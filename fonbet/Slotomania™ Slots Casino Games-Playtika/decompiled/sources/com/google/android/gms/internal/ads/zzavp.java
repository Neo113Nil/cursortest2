package com.google.android.gms.internal.ads;

import java.util.function.Supplier;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final /* synthetic */ class zzavp implements Supplier {
    private final /* synthetic */ int zzc;
    public static final /* synthetic */ zzavp zzb = new zzavp(1);
    static final /* synthetic */ zzavp zza = new zzavp(0);

    private /* synthetic */ zzavp(int i) {
        this.zzc = i;
    }

    @Override // java.util.function.Supplier
    public final /* synthetic */ Object get() {
        return this.zzc != 0 ? zzawf.zza(null) : new zzavs();
    }
}
