package com.facebook.ads.redexgen.core;

import android.widget.MediaController;

/* renamed from: com.facebook.ads.redexgen.X.fd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2585fd implements MediaController.MediaPlayerControl {
    public final /* synthetic */ TextureViewSurfaceTextureListenerC1652Cz A00;

    public C2585fd(TextureViewSurfaceTextureListenerC1652Cz textureViewSurfaceTextureListenerC1652Cz) {
        this.A00 = textureViewSurfaceTextureListenerC1652Cz;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canPause() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekBackward() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekForward() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getAudioSessionId() {
        C2579fX c2579fX;
        C2579fX c2579fX2;
        c2579fX = this.A00.A0C;
        if (c2579fX == null) {
            return 0;
        }
        c2579fX2 = this.A00.A0C;
        return c2579fX2.A04();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getBufferPercentage() {
        C2579fX c2579fX;
        C2579fX c2579fX2;
        c2579fX = this.A00.A0C;
        if (c2579fX == null) {
            return 0;
        }
        c2579fX2 = this.A00.A0C;
        return c2579fX2.A05();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getCurrentPosition() {
        return this.A00.getCurrentPosition();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getDuration() {
        return this.A00.getDuration();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean isPlaying() {
        C2579fX c2579fX;
        C2579fX c2579fX2;
        c2579fX = this.A00.A0C;
        if (c2579fX != null) {
            c2579fX2 = this.A00.A0C;
            if (c2579fX2.A0J()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void pause() {
        InterfaceC2595fn interfaceC2595fn;
        InterfaceC2595fn interfaceC2595fn2;
        interfaceC2595fn = this.A00.A0F;
        if (interfaceC2595fn != null) {
            interfaceC2595fn2 = this.A00.A0F;
            interfaceC2595fn2.AEo();
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void seekTo(int i) {
        this.A00.seekTo(i);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void start() {
        InterfaceC2595fn interfaceC2595fn;
        InterfaceC2595fn interfaceC2595fn2;
        interfaceC2595fn = this.A00.A0F;
        if (interfaceC2595fn != null) {
            interfaceC2595fn2 = this.A00.A0F;
            interfaceC2595fn2.AEp();
        }
    }
}
