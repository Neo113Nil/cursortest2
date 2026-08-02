package io.agora.rtc2.video;

import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.View;
import io.agora.rtc2.Constants;

/* loaded from: classes3.dex */
public class VideoCanvas {
    public static final int RENDER_MODE_ADAPTIVE = 3;
    public static final int RENDER_MODE_FIT = 2;
    public static final int RENDER_MODE_HIDDEN = 1;
    public static final int VIEW_SETUP_MODE_ADD = 1;
    public static final int VIEW_SETUP_MODE_REMOVE = 2;
    public static final int VIEW_SETUP_MODE_REPLACE = 0;
    public int backgroundColor;
    public boolean enableAlphaMask;
    public int mediaPlayerId;
    public int mirrorMode;
    public Constants.VideoModulePosition position;
    public Rect rect;
    public int renderMode;
    public int setupMode;
    public int sourceType;
    public int subviewUid;
    public SurfaceTexture surfaceTexture;
    public int uid;
    public View view;

    public VideoCanvas(View view) {
        this.setupMode = 0;
        this.position = Constants.VideoModulePosition.VIDEO_MODULE_POSITION_POST_CAPTURER;
        this.uid = 0;
        this.view = view;
        this.renderMode = 1;
        this.backgroundColor = 0;
    }

    public VideoCanvas(View view, int i10, int i11) {
        this.setupMode = 0;
        this.position = Constants.VideoModulePosition.VIDEO_MODULE_POSITION_POST_CAPTURER;
        this.uid = i11;
        this.view = view;
        this.renderMode = i10;
        this.backgroundColor = 0;
    }

    public VideoCanvas(View view, int i10, int i11, int i12) {
        this.setupMode = 0;
        this.position = Constants.VideoModulePosition.VIDEO_MODULE_POSITION_POST_CAPTURER;
        this.uid = i11;
        this.subviewUid = i12;
        this.view = view;
        this.renderMode = i10;
        this.backgroundColor = 0;
    }
}
