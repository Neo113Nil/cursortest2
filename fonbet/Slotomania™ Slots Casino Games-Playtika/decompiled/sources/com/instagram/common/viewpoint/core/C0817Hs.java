package com.instagram.common.viewpoint.core;

import com.google.android.exoplayer2.ExoPlayer;

/* renamed from: com.facebook.ads.redexgen.X.Hs, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0817Hs extends AbstractRunnableC1182Wc {
    public final /* synthetic */ C5F A00;

    public C0817Hs(C5F c5f) {
        this.A00 = c5f;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1182Wc
    public final void A07() {
        C1444cd c1444cd;
        c1444cd = this.A00.A0H;
        YB.A0F(1000, c1444cd);
        this.A00.postDelayed(this, ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
    }
}
