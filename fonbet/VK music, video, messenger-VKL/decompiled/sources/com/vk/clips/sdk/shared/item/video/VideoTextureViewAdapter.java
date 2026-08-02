package com.vk.clips.sdk.shared.item.video;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.clips.sdk.shared.item.clip.subtitles.SdkSubtitlesConfigurationMode;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import xsna.asp;
import xsna.kih0;
import xsna.y0r;
import xsna.zrp;

/* compiled from: VideoTextureViewAdapter.kt */
/* loaded from: classes17.dex */
public interface VideoTextureViewAdapter {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoTextureViewAdapter.kt */
    public static final class ScaleType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ScaleType[] $VALUES;
        public static final ScaleType CROP;
        public static final ScaleType FIT;

        static {
            ScaleType scaleType = new ScaleType("FIT", 0);
            FIT = scaleType;
            ScaleType scaleType2 = new ScaleType("CROP", 1);
            CROP = scaleType2;
            ScaleType[] scaleTypeArr = {scaleType, scaleType2};
            $VALUES = scaleTypeArr;
            $ENTRIES = new asp(scaleTypeArr);
        }

        public ScaleType() {
            throw null;
        }

        public static ScaleType valueOf(String str) {
            return (ScaleType) Enum.valueOf(ScaleType.class, str);
        }

        public static ScaleType[] values() {
            return (ScaleType[]) $VALUES.clone();
        }
    }

    /* compiled from: VideoTextureViewAdapter.kt */
    public static final class a {
        public static /* synthetic */ void a(VideoTextureViewAdapter videoTextureViewAdapter, kih0 kih0Var, String str, RecyclerView.e0 e0Var, y0r y0rVar, SdkSubtitlesConfigurationMode sdkSubtitlesConfigurationMode, int i) {
            if ((i & 4) != 0) {
                e0Var = null;
            }
            if ((i & 8) != 0) {
                y0rVar = null;
            }
            if ((i & 16) != 0) {
                sdkSubtitlesConfigurationMode = SdkSubtitlesConfigurationMode.ALWAYS_DISABLED;
            }
            videoTextureViewAdapter.e(kih0Var, str, e0Var, y0rVar, sdkSubtitlesConfigurationMode);
        }
    }

    void a(ScaleType scaleType);

    void b(kih0 kih0Var);

    void c();

    void d(int i, int i2);

    void e(kih0 kih0Var, String str, RecyclerView.e0 e0Var, y0r y0rVar, SdkSubtitlesConfigurationMode sdkSubtitlesConfigurationMode);

    VideoTextureView getView();
}
