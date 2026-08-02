package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.1 */
/* loaded from: classes7.dex */
public final class zznm implements Supplier<zznl> {
    private static zznm zza = new zznm();
    private final Supplier<zznl> zzb = Suppliers.ofInstance(new zzno());

    @Override // com.google.common.base.Supplier
    public final /* synthetic */ zznl get() {
        return this.zzb.get();
    }

    @SideEffectFree
    public static boolean zza() {
        return ((zznl) zza.get()).zza();
    }

    @SideEffectFree
    public static boolean zzb() {
        return ((zznl) zza.get()).zzb();
    }
}
