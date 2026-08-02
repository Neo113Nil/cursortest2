package io.agora.rtc2;

import io.agora.base.internal.CalledByNative;

@Deprecated
/* loaded from: classes3.dex */
public enum DirectCdnStreamingState {
    IDLE(0),
    RUNNING(1),
    STOPPED(2),
    FAILED(3),
    RECOVERING(4);

    private int value;

    DirectCdnStreamingState(int i10) {
        this.value = i10;
    }

    @CalledByNative
    public static DirectCdnStreamingState fromInt(int i10) {
        for (DirectCdnStreamingState directCdnStreamingState : values()) {
            if (directCdnStreamingState.getValue() == i10) {
                return directCdnStreamingState;
            }
        }
        return FAILED;
    }

    public int getValue() {
        return this.value;
    }
}
