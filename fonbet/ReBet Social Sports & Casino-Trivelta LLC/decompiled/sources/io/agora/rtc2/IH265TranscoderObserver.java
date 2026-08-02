package io.agora.rtc2;

import io.agora.base.internal.CalledByNative;

/* loaded from: classes3.dex */
public interface IH265TranscoderObserver {

    public enum H265TranscodeResult {
        UNKNOWN(-1),
        SUCCESS(0),
        REQUEST_INVALID(1),
        UNAUTHORIZED(2),
        TOKEN_EXPIRED(3),
        FORBIDDEN(4),
        NOT_FOUND(5),
        CONFLICTED(6),
        NOT_SUPPORTED(7),
        TOO_OFTEN(8),
        SERVER_INTERNAL_ERROR(9),
        SERVICE_UNAVAILABLE(10);

        private int value;

        H265TranscodeResult(int i10) {
            this.value = i10;
        }

        public static H265TranscodeResult fromInt(int i10) {
            for (H265TranscodeResult h265TranscodeResult : values()) {
                if (h265TranscodeResult.getValue() == i10) {
                    return h265TranscodeResult;
                }
            }
            return null;
        }

        public int getValue() {
            return this.value;
        }
    }

    @CalledByNative
    void onEnableTranscode(int i10);

    @CalledByNative
    void onQueryChannel(int i10, String str, String str2);

    @CalledByNative
    void onTriggerTranscode(int i10);
}
