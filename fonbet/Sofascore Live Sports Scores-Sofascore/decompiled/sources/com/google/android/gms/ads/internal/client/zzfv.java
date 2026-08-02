package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.VideoController;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfv extends zzec {
    public final VideoController.VideoLifecycleCallbacks a;

    public zzfv(VideoController.VideoLifecycleCallbacks videoLifecycleCallbacks) {
        this.a = videoLifecycleCallbacks;
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zze() {
        this.a.onVideoStart();
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zzf() {
        this.a.onVideoPlay();
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zzg() {
        this.a.onVideoPause();
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zzh() {
        this.a.onVideoEnd();
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zzi(boolean z) {
        this.a.onVideoMute(z);
    }
}
