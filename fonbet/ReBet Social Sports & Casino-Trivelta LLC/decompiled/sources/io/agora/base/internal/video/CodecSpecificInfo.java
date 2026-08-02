package io.agora.base.internal.video;

import io.agora.base.internal.CalledByNative;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public class CodecSpecificInfo {
    private ByteBuffer compressed_alpha_buffer;
    public long elapsedRealtime;
    public int lumaBitDepth;
    private final ByteBuffer metadata;
    public long opaque;

    public static class CodecSpecificInfoH264 extends CodecSpecificInfo {
    }

    public class CodecSpecificInfoHEVC extends CodecSpecificInfo {
        private VideoCodecProfile profile;

        public CodecSpecificInfoHEVC(VideoCodecProfile videoCodecProfile) {
            this.profile = videoCodecProfile;
        }

        @Override // io.agora.base.internal.video.CodecSpecificInfo
        public VideoCodecProfile getVideoCodecProfile() {
            return this.profile;
        }

        @Override // io.agora.base.internal.video.CodecSpecificInfo
        public VideoCodecType getVideoCodecType() {
            return VideoCodecType.H265;
        }
    }

    public static class CodecSpecificInfoVP8 extends CodecSpecificInfo {
    }

    public static class CodecSpecificInfoVP9 extends CodecSpecificInfo {
    }

    public CodecSpecificInfo() {
        this(null, null, 0, 0L);
    }

    @CalledByNative
    public ByteBuffer getCompressedAlphadata() {
        return this.compressed_alpha_buffer;
    }

    @CalledByNative
    public ByteBuffer getMetadata() {
        return this.metadata;
    }

    @CalledByNative
    public long getOpaque() {
        return this.opaque;
    }

    public VideoCodecProfile getVideoCodecProfile() {
        return VideoCodecProfile.UNKNOWN;
    }

    public VideoCodecType getVideoCodecType() {
        return VideoCodecType.UNKNOWN;
    }

    @CalledByNative
    public CodecSpecificInfo(int i10, long j10) {
        this.lumaBitDepth = i10;
        this.metadata = null;
        this.compressed_alpha_buffer = null;
        this.opaque = j10;
    }

    @CalledByNative
    public CodecSpecificInfo(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i10, long j10) {
        this.lumaBitDepth = i10;
        this.metadata = byteBuffer;
        this.compressed_alpha_buffer = byteBuffer2;
        this.opaque = j10;
    }

    public CodecSpecificInfo(ByteBuffer byteBuffer, long j10) {
        this.metadata = byteBuffer;
        this.elapsedRealtime = j10;
        this.opaque = 0L;
    }
}
