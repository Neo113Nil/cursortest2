package io.agora.rtc.ng.react;

import android.app.PictureInPictureParams;
import android.app.PictureInPictureUiState;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import com.facebook.react.ReactActivity;
import io.agora.iris.pip.AgoraPIPActivityListener;
import io.agora.iris.pip.AgoraPIPActivityProxy;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public class AgoraPIPActivity extends ReactActivity implements AgoraPIPActivityProxy {
    private WeakReference<AgoraPIPActivityListener> mListener;

    @Override // android.app.Activity, io.agora.iris.pip.AgoraPIPActivityProxy
    public boolean enterPictureInPictureMode(PictureInPictureParams pictureInPictureParams) {
        return super.enterPictureInPictureMode(pictureInPictureParams);
    }

    @Override // android.content.ContextWrapper, android.content.Context, io.agora.iris.pip.AgoraPIPActivityProxy
    public Context getApplicationContext() {
        return super.getApplicationContext();
    }

    @Override // android.app.Activity, io.agora.iris.pip.AgoraPIPActivityProxy
    public boolean isInPictureInPictureMode() {
        return super.isInPictureInPictureMode();
    }

    @Override // android.app.Activity, io.agora.iris.pip.AgoraPIPActivityProxy
    public boolean moveTaskToBack(boolean z10) {
        return super.moveTaskToBack(z10);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onPictureInPictureModeChanged(boolean z10, Configuration configuration) {
        AgoraPIPActivityListener agoraPIPActivityListener;
        super.onPictureInPictureModeChanged(z10, configuration);
        WeakReference<AgoraPIPActivityListener> weakReference = this.mListener;
        if (weakReference == null || (agoraPIPActivityListener = weakReference.get()) == null) {
            return;
        }
        agoraPIPActivityListener.onPictureInPictureModeChanged(z10, configuration);
    }

    @Override // android.app.Activity
    public boolean onPictureInPictureRequested() {
        AgoraPIPActivityListener agoraPIPActivityListener;
        if (Build.VERSION.SDK_INT < 31) {
            return false;
        }
        WeakReference<AgoraPIPActivityListener> weakReference = this.mListener;
        return (weakReference == null || (agoraPIPActivityListener = weakReference.get()) == null) ? super.onPictureInPictureRequested() : agoraPIPActivityListener.onPictureInPictureRequested();
    }

    @Override // android.app.Activity
    public void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState) {
        AgoraPIPActivityListener agoraPIPActivityListener;
        super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        WeakReference<AgoraPIPActivityListener> weakReference = this.mListener;
        if (weakReference == null || (agoraPIPActivityListener = weakReference.get()) == null) {
            return;
        }
        agoraPIPActivityListener.onPictureInPictureUiStateChanged(pictureInPictureUiState);
    }

    @Override // com.facebook.react.ReactActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onUserLeaveHint() {
        AgoraPIPActivityListener agoraPIPActivityListener;
        super.onUserLeaveHint();
        WeakReference<AgoraPIPActivityListener> weakReference = this.mListener;
        if (weakReference == null || (agoraPIPActivityListener = weakReference.get()) == null) {
            return;
        }
        agoraPIPActivityListener.onUserLeaveHint();
    }

    @Override // io.agora.iris.pip.AgoraPIPActivityProxy
    public void setAgoraPIPActivityListener(AgoraPIPActivityListener agoraPIPActivityListener) {
        this.mListener = new WeakReference<>(agoraPIPActivityListener);
    }

    @Override // android.app.Activity, io.agora.iris.pip.AgoraPIPActivityProxy
    public void setPictureInPictureParams(PictureInPictureParams pictureInPictureParams) {
        super.setPictureInPictureParams(pictureInPictureParams);
    }

    @Override // android.app.Activity, io.agora.iris.pip.AgoraPIPActivityProxy
    public void enterPictureInPictureMode() {
        super.enterPictureInPictureMode();
    }
}
