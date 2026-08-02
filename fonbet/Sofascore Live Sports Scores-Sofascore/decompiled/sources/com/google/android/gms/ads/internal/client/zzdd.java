package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.MuteThisAdListener;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdd extends zzdb {
    public final MuteThisAdListener a;

    public zzdd(MuteThisAdListener muteThisAdListener) {
        this.a = muteThisAdListener;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdc
    public final void zze() {
        this.a.onAdMuted();
    }
}
