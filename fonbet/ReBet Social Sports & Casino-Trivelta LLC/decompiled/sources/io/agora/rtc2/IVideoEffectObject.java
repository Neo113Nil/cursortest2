package io.agora.rtc2;

/* loaded from: classes3.dex */
public interface IVideoEffectObject {

    public enum VIDEO_EFFECT_ACTION {
        SAVE(1),
        RESET(2);

        private final int value;

        VIDEO_EFFECT_ACTION(int i10) {
            this.value = i10;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum VIDEO_EFFECT_NODE_ID {
        BEAUTY(1),
        STYLE_MAKEUP(2),
        FILTER(4);

        private final int value;

        VIDEO_EFFECT_NODE_ID(int i10) {
            this.value = i10;
        }

        public int getValue() {
            return this.value;
        }
    }

    int addOrUpdateVideoEffect(int i10, String str);

    boolean getVideoEffectBoolParam(String str, String str2);

    float getVideoEffectFloatParam(String str, String str2);

    int getVideoEffectIntParam(String str, String str2);

    int performVideoEffectAction(int i10, VIDEO_EFFECT_ACTION video_effect_action);

    int removeVideoEffect(int i10);

    int setVideoEffectBoolParam(String str, String str2, boolean z10);

    int setVideoEffectFloatParam(String str, String str2, float f10);

    int setVideoEffectIntParam(String str, String str2, int i10);
}
