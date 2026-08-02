package io.agora.iris.pip;

import android.app.PictureInPictureParams;
import android.content.Context;

/* loaded from: classes2.dex */
public interface AgoraPIPActivityProxy {
    void enterPictureInPictureMode();

    boolean enterPictureInPictureMode(PictureInPictureParams pictureInPictureParams);

    Context getApplicationContext();

    boolean isInPictureInPictureMode();

    boolean moveTaskToBack(boolean z10);

    void setAgoraPIPActivityListener(AgoraPIPActivityListener agoraPIPActivityListener);

    void setPictureInPictureParams(PictureInPictureParams pictureInPictureParams);
}
