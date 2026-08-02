package io.agora.iris.pip;

import android.app.PictureInPictureUiState;
import android.content.res.Configuration;

/* loaded from: classes2.dex */
public interface AgoraPIPActivityListener {
    void onPictureInPictureModeChanged(boolean z10, Configuration configuration);

    boolean onPictureInPictureRequested();

    void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState);

    void onUserLeaveHint();
}
