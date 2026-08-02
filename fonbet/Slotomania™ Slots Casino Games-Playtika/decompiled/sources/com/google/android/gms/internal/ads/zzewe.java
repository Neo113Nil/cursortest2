package com.google.android.gms.internal.ads;

import android.os.Bundle;
import io.sentry.protocol.Device;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes2.dex */
public final class zzewe implements zzfbw {
    private final double zza;
    private final boolean zzb;

    public zzewe(double d, boolean z) {
        this.zza = d;
        this.zzb = z;
    }

    @Override // com.google.android.gms.internal.ads.zzfbw
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle zza = zzflb.zza(bundle, "device");
        bundle.putBundle("device", zza);
        Bundle zza2 = zzflb.zza(zza, "battery");
        zza.putBundle("battery", zza2);
        zza2.putBoolean("is_charging", this.zzb);
        zza2.putDouble(Device.JsonKeys.BATTERY_LEVEL, this.zza);
    }
}
