package com.vk.clips.editor.base.api;

import android.content.Context;
import com.vk.clips.editor.base.api.ClipsEditorScreen;
import one.video.view.OneVideoPlayerView;
import xsna.g1t0;
import xsna.hwd;
import xsna.nal0;
import xsna.wn2;

/* compiled from: ClipsEditorContract.kt */
/* loaded from: classes16.dex */
public interface a {
    hwd getAlertsHandler();

    wn2 getAnimationDelegate();

    Context getCtx();

    ClipsEditorScreen.State getCurrentScreen();

    OneVideoPlayerView getPlayerView();

    nal0 getStickersInteractor();

    g1t0 getVideoOverlayInteractor();
}
