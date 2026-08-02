package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbfv extends com.google.android.gms.ads.internal.client.zzck {
    public final AppEventListener a;

    public zzbfv(AppEventListener appEventListener) {
        this.a = appEventListener;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcl
    public final void zza(String str, String str2) {
        this.a.onAppEvent(str, str2);
    }
}
