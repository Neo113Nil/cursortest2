package com.vk.media.recorder.impl;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* loaded from: classes3.dex */
public final class BufferItem {
    public final long a;
    public long b = -1;
    public final byte[] c;
    public long d;
    public long e;
    public final FrameType f;
    public byte[] g;
    public int h;
    public long i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class FrameType {
        private static final /* synthetic */ FrameType[] $VALUES;
        public static final FrameType AUDIO;
        public static final FrameType VIDEO;

        static {
            FrameType frameType = new FrameType(SignalingProtocol.MEDIA_OPTION_VIDEO, 0);
            VIDEO = frameType;
            FrameType frameType2 = new FrameType(SignalingProtocol.MEDIA_OPTION_AUDIO, 1);
            AUDIO = frameType2;
            $VALUES = new FrameType[]{frameType, frameType2};
        }

        public FrameType() {
            throw null;
        }

        public static FrameType valueOf(String str) {
            return (FrameType) Enum.valueOf(FrameType.class, str);
        }

        public static FrameType[] values() {
            return (FrameType[]) $VALUES.clone();
        }
    }

    public BufferItem(long j, FrameType frameType, int i) {
        this.a = j;
        this.f = frameType;
        this.c = new byte[i];
    }

    public final boolean a() {
        if (FrameType.VIDEO != this.f) {
            throw new IllegalArgumentException("not applicable to audio frame");
        }
        if ((this.h & 1) != 0) {
            return true;
        }
        byte b = this.c[0];
        return ((b >> 5) & 3) != 0 && (b & 31) == 5;
    }
}
