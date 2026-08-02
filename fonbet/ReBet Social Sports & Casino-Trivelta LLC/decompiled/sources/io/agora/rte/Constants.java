package io.agora.rte;

/* loaded from: classes3.dex */
public class Constants {

    public enum AbrFallbackLayer {
        DISABLED(0),
        LOW(1),
        AUDIO_ONLY(2),
        LAYER1(3),
        LAYER2(4),
        LAYER3(5),
        LAYER4(6),
        LAYER5(7),
        LAYER6(8);

        private int value;

        AbrFallbackLayer(int i10) {
            this.value = i10;
        }

        public static AbrFallbackLayer fromInt(int i10) {
            for (AbrFallbackLayer abrFallbackLayer : values()) {
                if (getValue(abrFallbackLayer) == i10) {
                    return abrFallbackLayer;
                }
            }
            return null;
        }

        public static int getValue(AbrFallbackLayer abrFallbackLayer) {
            return abrFallbackLayer.value;
        }
    }

    public enum AbrSubscriptionLayer {
        HIGH(0),
        LOW(1),
        LAYER1(2),
        LAYER2(3),
        LAYER3(4),
        LAYER4(5),
        LAYER5(6),
        LAYER6(7);

        private int value;

        AbrSubscriptionLayer(int i10) {
            this.value = i10;
        }

        public static AbrSubscriptionLayer fromInt(int i10) {
            for (AbrSubscriptionLayer abrSubscriptionLayer : values()) {
                if (getValue(abrSubscriptionLayer) == i10) {
                    return abrSubscriptionLayer;
                }
            }
            return null;
        }

        public static int getValue(AbrSubscriptionLayer abrSubscriptionLayer) {
            return abrSubscriptionLayer.value;
        }
    }

    public enum ErrorCode {
        OK(0),
        DEFAULT(1),
        INVALID_ARGUMENT(2),
        INVALID_OPERATION(3),
        NETWORK_ERROR(4),
        AUTHENTICATION_FAILED(5),
        STREAM_NOT_FOUND(6);

        private int value;

        ErrorCode(int i10) {
            this.value = i10;
        }

        public static ErrorCode fromInt(int i10) {
            for (ErrorCode errorCode : values()) {
                if (getValue(errorCode) == i10) {
                    return errorCode;
                }
            }
            return null;
        }

        public static int getValue(ErrorCode errorCode) {
            return errorCode.value;
        }
    }

    public enum PlayerEvent {
        SEEK_BEGIN(0),
        SEEK_COMPLETE(1),
        SEEK_ERROR(2),
        BUFFER_LOW(3),
        BUFFER_RECOVER(4),
        FREEZE_START(5),
        FREEZE_STOP(6),
        ONE_LOOP_PLAYBACK_COMPLETED(7),
        AUTHENTICATION_WILL_EXPIRE(8),
        ABR_FALLBACK_TO_AUDIO_ONLY_LAYER(9),
        ABR_RECOVER_FROM_AUDIO_ONLY_LAYER(10),
        SWITCH_BEGIN(11),
        SWITCH_COMPLETE(12),
        SWITCH_ERROR(13),
        FIRST_DISPLAYED(14),
        REACH_CACHE_FILE_MAX_COUNT(15),
        REACH_CACHE_FILE_MAX_SIZE(16),
        TRY_OPEN_START(17),
        TRY_OPEN_SUCCEED(18),
        TRY_OPEN_FAILED(19),
        AUDIO_TRACK_CHANGED(20);

        private int value;

        PlayerEvent(int i10) {
            this.value = i10;
        }

        public static PlayerEvent fromInt(int i10) {
            for (PlayerEvent playerEvent : values()) {
                if (getValue(playerEvent) == i10) {
                    return playerEvent;
                }
            }
            return null;
        }

        public static int getValue(PlayerEvent playerEvent) {
            return playerEvent.value;
        }
    }

    public enum PlayerMetadataType {
        SEI(0);

        private int value;

        PlayerMetadataType(int i10) {
            this.value = i10;
        }

        public static PlayerMetadataType fromInt(int i10) {
            for (PlayerMetadataType playerMetadataType : values()) {
                if (getValue(playerMetadataType) == i10) {
                    return playerMetadataType;
                }
            }
            return null;
        }

        public static int getValue(PlayerMetadataType playerMetadataType) {
            return playerMetadataType.value;
        }
    }

    public enum PlayerState {
        IDLE(0),
        OPENING(1),
        OPEN_COMPLETED(2),
        PLAYING(3),
        PAUSED(4),
        PLAYBACK_COMPLETED(5),
        STOPPED(6),
        FAILED(7);

        private int value;

        PlayerState(int i10) {
            this.value = i10;
        }

        public static PlayerState fromInt(int i10) {
            for (PlayerState playerState : values()) {
                if (getValue(playerState) == i10) {
                    return playerState;
                }
            }
            return null;
        }

        public static int getValue(PlayerState playerState) {
            return playerState.value;
        }
    }

    public enum VideoMirrorMode {
        AUTO(0),
        ENABLED(1),
        DISABLED(2);

        private int value;

        VideoMirrorMode(int i10) {
            this.value = i10;
        }

        public static VideoMirrorMode fromInt(int i10) {
            for (VideoMirrorMode videoMirrorMode : values()) {
                if (getValue(videoMirrorMode) == i10) {
                    return videoMirrorMode;
                }
            }
            return null;
        }

        public static int getValue(VideoMirrorMode videoMirrorMode) {
            return videoMirrorMode.value;
        }
    }

    public enum VideoRenderMode {
        HIDDEN(0),
        FIT(1);

        private int value;

        VideoRenderMode(int i10) {
            this.value = i10;
        }

        public static VideoRenderMode fromInt(int i10) {
            for (VideoRenderMode videoRenderMode : values()) {
                if (getValue(videoRenderMode) == i10) {
                    return videoRenderMode;
                }
            }
            return null;
        }

        public static int getValue(VideoRenderMode videoRenderMode) {
            return videoRenderMode.value;
        }
    }
}
