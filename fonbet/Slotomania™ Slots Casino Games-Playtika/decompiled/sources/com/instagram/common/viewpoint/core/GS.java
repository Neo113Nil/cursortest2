package com.instagram.common.viewpoint.core;

import android.os.Handler;
import com.google.android.exoplayer2.ExoPlayer;

/* loaded from: assets/audience_network/classes2.dex */
public class GS implements InterfaceC1210Xh {
    public final /* synthetic */ C4V A00;

    public GS(C4V c4v) {
        this.A00 = c4v;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1210Xh
    public final void AF5(String str) {
        Handler handler;
        handler = this.A00.A0G;
        handler.postDelayed(new RunnableC1520ds(this), ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1210Xh
    public final void AF6(String str) {
        this.A00.A0H(VH.A0c);
    }
}
