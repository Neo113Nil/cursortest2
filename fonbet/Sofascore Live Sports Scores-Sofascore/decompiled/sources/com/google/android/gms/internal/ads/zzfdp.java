package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfdp implements zzfdg {
    public final int a;
    public final int b;

    public zzfdp(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzfdg
    public final void zza(Object obj) {
        int i;
        Bundle bundle = (Bundle) obj;
        int i2 = this.a;
        if (i2 == -1 || (i = this.b) == -1) {
            return;
        }
        bundle.putInt("sessions_without_flags", i2);
        bundle.putInt("crashes_without_flags", i);
        com.google.android.gms.ads.internal.client.zzay zzayVar = com.google.android.gms.ads.internal.client.zzay.g;
        if (com.google.android.gms.ads.internal.client.zzba.zzc().j) {
            bundle.putBoolean("did_reset", true);
        }
    }
}
