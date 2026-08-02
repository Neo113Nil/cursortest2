package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
final class zzgon implements zzgok {
    private final zzgpu zza;
    private final long zzb;

    zzgon(zzgbx zzgbxVar, zzgpu zzgpuVar, long j) {
        this.zza = zzgpuVar;
        this.zzb = j;
    }

    private static boolean zzc(zzgfd zzgfdVar) {
        int zza = zzgfdVar.zzb().zza().zza();
        int zzb = zzgfdVar.zzb().zza().zzb();
        byte[] versionArray = zzaut.zza();
        Intrinsics.checkNotNullParameter(versionArray, "versionArray");
        ByteBuffer allocate = ByteBuffer.allocate(6);
        Intrinsics.checkNotNullExpressionValue(allocate, "allocate(...)");
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.putShort((short) zza);
        allocate.putInt(zzb);
        byte[] array = allocate.array();
        Intrinsics.checkNotNullExpressionValue(array, "array(...)");
        return Arrays.equals(array, versionArray);
    }

    @Override // com.google.android.gms.internal.ads.zzgok
    public final boolean zza(zzgfd zzgfdVar) {
        if (zzgfdVar == null || zzgfdVar.equals(zzgfd.zzg())) {
            this.zza.zzb(20202);
            return true;
        }
        if (!zzc(zzgfdVar)) {
            this.zza.zzb(20205);
            return true;
        }
        boolean z = zzgfdVar.zzb().zzc() - System.currentTimeMillis() <= this.zzb;
        if (z) {
            this.zza.zzb(20203);
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzgok
    public final boolean zzb(zzgfd zzgfdVar) {
        if (zzgfdVar == null || zzgfdVar.equals(zzgfd.zzg())) {
            this.zza.zzb(20204);
            return false;
        }
        if (zzc(zzgfdVar)) {
            return true;
        }
        this.zza.zzb(20206);
        return false;
    }
}
