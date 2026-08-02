package io.agora.rtc2.video;

import io.agora.rtc2.Constants;

/* loaded from: classes3.dex */
public class ContentInspectConfig {
    public static final int CONTENT_INSPECT_TYPE_IMAGE_MODERATION = 3;
    public static final int CONTENT_INSPECT_TYPE_INVALID = 0;

    @Deprecated
    public static final int CONTENT_INSPECT_TYPE_MODERATION = 1;
    public static final int CONTENT_INSPECT_TYPE_SUPERVISE = 2;
    public static final int MAX_CONTENT_INSPECT_MODULE_COUNT = 32;
    public String extraInfo;
    public int moduleCount;
    public ContentInspectModule[] modules = new ContentInspectModule[32];
    public String serverConfig;

    public static class ContentInspectModule {
        public int type = 0;
        public int interval = 0;
        public Constants.VideoModulePosition position = Constants.VideoModulePosition.VIDEO_MODULE_POSITION_PRE_ENCODER;
    }

    public ContentInspectConfig() {
        for (int i10 = 0; i10 < 32; i10++) {
            this.modules[i10] = new ContentInspectModule();
        }
        this.moduleCount = 0;
    }
}
