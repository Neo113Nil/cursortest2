package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfbf implements zzfdg {
    public final zzflc a;

    public zzfbf(zzflc zzflcVar) {
        this.a = zzflcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfdg
    public final void zza(Object obj) {
        boolean z;
        boolean z2;
        Bundle bundle = (Bundle) obj;
        zzflc zzflcVar = this.a;
        if (zzflcVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Ed)).booleanValue()) {
                return;
            }
            synchronized (zzflcVar.c) {
                zzflcVar.b();
                z = zzflcVar.e == 2;
            }
            bundle.putBoolean("render_in_browser", z);
            synchronized (zzflcVar.c) {
                zzflcVar.b();
                z2 = zzflcVar.e == 3;
            }
            bundle.putBoolean("disable_ml", z2);
        }
    }
}
