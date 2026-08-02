package io.sentry.android.core;

import io.sentry.P2;

/* loaded from: classes.dex */
public final class n0 extends P2 {
    @Override // io.sentry.P2
    public final void d(boolean z11) {
        super.d(z11);
        if (z11) {
            a("android.webkit.WebView");
            a("android.widget.VideoView");
            a("androidx.camera.view.PreviewView");
            a("androidx.media3.ui.PlayerView");
            a("com.google.android.exoplayer2.ui.PlayerView");
            a("com.google.android.exoplayer2.ui.StyledPlayerView");
            return;
        }
        b().remove("android.webkit.WebView");
        b().remove("android.widget.VideoView");
        b().remove("androidx.camera.view.PreviewView");
        b().remove("androidx.media3.ui.PlayerView");
        b().remove("com.google.android.exoplayer2.ui.PlayerView");
        b().remove("com.google.android.exoplayer2.ui.StyledPlayerView");
    }

    @Override // io.sentry.P2
    public final void f() {
    }
}
