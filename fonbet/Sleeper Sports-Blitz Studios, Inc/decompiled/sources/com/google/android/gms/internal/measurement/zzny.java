package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.1 */
/* loaded from: classes7.dex */
public final class zzny implements Supplier<zznx> {
    private static zzny zza = new zzny();
    private final Supplier<zznx> zzb = Suppliers.ofInstance(new zzoa());

    @Override // com.google.common.base.Supplier
    public final /* synthetic */ zznx get() {
        return this.zzb.get();
    }

    @SideEffectFree
    public static boolean zza() {
        return ((zznx) zza.get()).zza();
    }

    @SideEffectFree
    public static boolean zzb() {
        return ((zznx) zza.get()).zzb();
    }

    @SideEffectFree
    public static boolean zzc() {
        return ((zznx) zza.get()).zzc();
    }
}
