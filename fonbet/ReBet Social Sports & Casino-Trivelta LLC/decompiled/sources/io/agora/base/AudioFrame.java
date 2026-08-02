package io.agora.base;

import io.agora.base.internal.CalledByNative;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public class AudioFrame {
    public ByteBuffer buffer;
    public int bytesPerSample;
    public int channelNums;
    public int sampleRataHz;
    public int samplesPerChannel;
    public long timestamp;

    @CalledByNative
    public AudioFrame(ByteBuffer byteBuffer, int i10, int i11, int i12, int i13, long j10) {
        this.sampleRataHz = i10;
        this.bytesPerSample = i11;
        this.channelNums = i12;
        this.samplesPerChannel = i13;
        this.timestamp = j10;
        this.buffer = byteBuffer;
    }

    @CalledByNative
    public ByteBuffer getByteBuffer() {
        return this.buffer;
    }

    @CalledByNative
    public int getBytesPerSample() {
        return this.bytesPerSample;
    }

    @CalledByNative
    public int getChannelNums() {
        return this.channelNums;
    }

    @CalledByNative
    public int getSampleRataHz() {
        return this.sampleRataHz;
    }

    @CalledByNative
    public int getSamplesPerChannel() {
        return this.samplesPerChannel;
    }

    @CalledByNative
    public long getTimestamp() {
        return this.timestamp;
    }

    public String toString() {
        return "AudioFrame{sampleRataHz=" + this.sampleRataHz + ", bytesPerSample=" + this.bytesPerSample + ", channelNums=" + this.channelNums + ", samplesPerChannel=" + this.samplesPerChannel + ", timestamp=" + this.timestamp + '}';
    }
}
