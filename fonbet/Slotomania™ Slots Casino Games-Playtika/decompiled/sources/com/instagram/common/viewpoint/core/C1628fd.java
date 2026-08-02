package com.instagram.common.viewpoint.core;

import android.widget.MediaController;

/* renamed from: com.facebook.ads.redexgen.X.fd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1628fd implements MediaController.MediaPlayerControl {
    public final /* synthetic */ TextureViewSurfaceTextureListenerC0695Cz A00;

    public C1628fd(TextureViewSurfaceTextureListenerC0695Cz textureViewSurfaceTextureListenerC0695Cz) {
        this.A00 = textureViewSurfaceTextureListenerC0695Cz;
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
        C1622fX c1622fX;
        C1622fX c1622fX2;
        c1622fX = this.A00.A0C;
        if (c1622fX == null) {
            return 0;
        }
        c1622fX2 = this.A00.A0C;
        return c1622fX2.A04();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getBufferPercentage() {
        C1622fX c1622fX;
        C1622fX c1622fX2;
        c1622fX = this.A00.A0C;
        if (c1622fX == null) {
            return 0;
        }
        c1622fX2 = this.A00.A0C;
        return c1622fX2.A05();
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
        C1622fX c1622fX;
        C1622fX c1622fX2;
        c1622fX = this.A00.A0C;
        if (c1622fX != null) {
            c1622fX2 = this.A00.A0C;
            if (c1622fX2.A0J()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void pause() {
        InterfaceC1638fn interfaceC1638fn;
        InterfaceC1638fn interfaceC1638fn2;
        interfaceC1638fn = this.A00.A0F;
        if (interfaceC1638fn != null) {
            interfaceC1638fn2 = this.A00.A0F;
            interfaceC1638fn2.AEo();
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void seekTo(int i) {
        this.A00.seekTo(i);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void start() {
        InterfaceC1638fn interfaceC1638fn;
        InterfaceC1638fn interfaceC1638fn2;
        interfaceC1638fn = this.A00.A0F;
        if (interfaceC1638fn != null) {
            interfaceC1638fn2 = this.A00.A0F;
            interfaceC1638fn2.AEp();
        }
    }
}
