package io.sentry.android.core;

import io.sentry.AbstractC4842u3;

/* loaded from: classes3.dex */
public final class h1 extends AbstractC4842u3 {
    @Override // io.sentry.AbstractC4842u3
    public void g(boolean z10) {
        super.g(z10);
        if (z10) {
            l();
        } else {
            m();
        }
    }

    @Override // io.sentry.AbstractC4842u3
    public void k() {
    }

    public final void l() {
        a("android.webkit.WebView");
        a("android.widget.VideoView");
        a("androidx.camera.view.PreviewView");
        a("androidx.media3.ui.PlayerView");
        a("com.google.android.exoplayer2.ui.PlayerView");
        a("com.google.android.exoplayer2.ui.StyledPlayerView");
    }

    public final void m() {
        c().remove("android.webkit.WebView");
        c().remove("android.widget.VideoView");
        c().remove("androidx.camera.view.PreviewView");
        c().remove("androidx.media3.ui.PlayerView");
        c().remove("com.google.android.exoplayer2.ui.PlayerView");
        c().remove("com.google.android.exoplayer2.ui.StyledPlayerView");
    }
}
