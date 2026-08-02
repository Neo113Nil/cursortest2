package io.agora.rtc2;

import io.agora.base.internal.CalledByNative;

@Deprecated
/* loaded from: classes3.dex */
public enum DirectCdnStreamingReason {
    OK(0),
    FAILED(1),
    AUDIO_PUBLICATION(2),
    VIDEO_PUBLICATION(3),
    NET_CONNECT(4),
    BAD_NAME(5);

    private int value;

    DirectCdnStreamingReason(int i10) {
        this.value = i10;
    }

    @CalledByNative
    public static DirectCdnStreamingReason fromInt(int i10) {
        for (DirectCdnStreamingReason directCdnStreamingReason : values()) {
            if (directCdnStreamingReason.getValue() == i10) {
                return directCdnStreamingReason;
            }
        }
        return FAILED;
    }

    public int getValue() {
        return this.value;
    }
}
