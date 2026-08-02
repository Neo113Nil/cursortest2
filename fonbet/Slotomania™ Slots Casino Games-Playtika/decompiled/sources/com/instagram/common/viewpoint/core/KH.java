package com.instagram.common.viewpoint.core;

import com.google.android.exoplayer2.ExoPlayer;

/* loaded from: assets/audience_network/classes2.dex */
public class KH extends AbstractRunnableC1182Wc {
    public final /* synthetic */ KE A00;

    public KH(KE ke) {
        this.A00 = ke;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1182Wc
    public final void A07() {
        boolean z;
        C1444cd c1444cd;
        z = this.A00.A0Y;
        if (!z) {
            c1444cd = this.A00.A0K;
            YB.A0F(1000, c1444cd);
        }
        this.A00.postDelayed(this, ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
    }
}
