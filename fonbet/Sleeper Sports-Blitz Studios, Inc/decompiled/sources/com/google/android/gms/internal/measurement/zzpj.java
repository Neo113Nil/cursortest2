package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.1 */
/* loaded from: classes7.dex */
public final class zzpj implements Supplier<zzpm> {
    private static zzpj zza = new zzpj();
    private final Supplier<zzpm> zzb = Suppliers.ofInstance(new zzpl());

    @Override // com.google.common.base.Supplier
    public final /* synthetic */ zzpm get() {
        return this.zzb.get();
    }

    @SideEffectFree
    public static boolean zza() {
        return ((zzpm) zza.get()).zza();
    }

    @SideEffectFree
    public static boolean zzb() {
        return ((zzpm) zza.get()).zzb();
    }
}
