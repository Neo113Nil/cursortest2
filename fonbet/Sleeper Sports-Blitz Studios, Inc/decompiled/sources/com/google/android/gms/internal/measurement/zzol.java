package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.1 */
/* loaded from: classes7.dex */
public final class zzol implements Supplier<zzoo> {
    private static zzol zza = new zzol();
    private final Supplier<zzoo> zzb = Suppliers.ofInstance(new zzon());

    @Override // com.google.common.base.Supplier
    public final /* synthetic */ zzoo get() {
        return this.zzb.get();
    }

    @SideEffectFree
    public static boolean zza() {
        return ((zzoo) zza.get()).zza();
    }

    @SideEffectFree
    public static boolean zzb() {
        return ((zzoo) zza.get()).zzb();
    }
}
