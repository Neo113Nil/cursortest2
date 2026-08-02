package com.coremedia.iso.boxes.sampleentry;

import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.InternalFrame;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import xsna.aqw;
import xsna.crx0;
import xsna.ga8;
import xsna.pa8;
import xsna.up2;
import xsna.xuk;
import xsna.yej;

/* loaded from: classes12.dex */
public final class AudioSampleEntry extends AbstractSampleEntry {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String TYPE1 = "samr";
    public static final String TYPE10 = "mlpa";
    public static final String TYPE11 = "dtsl";
    public static final String TYPE12 = "dtsh";
    public static final String TYPE13 = "dtse";
    public static final String TYPE2 = "sawb";
    public static final String TYPE3 = "mp4a";
    public static final String TYPE4 = "drms";
    public static final String TYPE5 = "alac";
    public static final String TYPE7 = "owma";
    public static final String TYPE8 = "ac-3";
    public static final String TYPE9 = "ec-3";
    public static final String TYPE_ENCRYPTED = "enca";
    private long bytesPerFrame;
    private long bytesPerPacket;
    private long bytesPerSample;
    private int channelCount;
    private int compressionId;
    private int packetSize;
    private int reserved1;
    private long reserved2;
    private long sampleRate;
    private int sampleSize;
    private long samplesPerPacket;
    private int soundVersion;
    private byte[] soundVersion2Data;

    public AudioSampleEntry(String str) {
        super(str);
    }

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, xsna.ga8, com.coremedia.iso.boxes.FullBox
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(getHeader());
        int i = this.soundVersion;
        ByteBuffer allocate = ByteBuffer.allocate((i == 1 ? 16 : 0) + 28 + (i == 2 ? 36 : 0));
        allocate.position(6);
        aqw.u(this.dataReferenceIndex, allocate);
        aqw.u(this.soundVersion, allocate);
        aqw.u(this.reserved1, allocate);
        allocate.putInt((int) this.reserved2);
        aqw.u(this.channelCount, allocate);
        aqw.u(this.sampleSize, allocate);
        aqw.u(this.compressionId, allocate);
        aqw.u(this.packetSize, allocate);
        if (this.type.equals(TYPE10)) {
            allocate.putInt((int) getSampleRate());
        } else {
            allocate.putInt((int) (getSampleRate() << 16));
        }
        if (this.soundVersion == 1) {
            allocate.putInt((int) this.samplesPerPacket);
            allocate.putInt((int) this.bytesPerPacket);
            allocate.putInt((int) this.bytesPerFrame);
            allocate.putInt((int) this.bytesPerSample);
        }
        if (this.soundVersion == 2) {
            allocate.putInt((int) this.samplesPerPacket);
            allocate.putInt((int) this.bytesPerPacket);
            allocate.putInt((int) this.bytesPerFrame);
            allocate.putInt((int) this.bytesPerSample);
            allocate.put(this.soundVersion2Data);
        }
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        writeContainer(writableByteChannel);
    }

    public long getBytesPerFrame() {
        return this.bytesPerFrame;
    }

    public long getBytesPerPacket() {
        return this.bytesPerPacket;
    }

    public long getBytesPerSample() {
        return this.bytesPerSample;
    }

    public int getChannelCount() {
        return this.channelCount;
    }

    public int getCompressionId() {
        return this.compressionId;
    }

    public int getPacketSize() {
        return this.packetSize;
    }

    public int getReserved1() {
        return this.reserved1;
    }

    public long getReserved2() {
        return this.reserved2;
    }

    public long getSampleRate() {
        return this.sampleRate;
    }

    public int getSampleSize() {
        return this.sampleSize;
    }

    public long getSamplesPerPacket() {
        return this.samplesPerPacket;
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, xsna.ga8, com.coremedia.iso.boxes.FullBox
    public long getSize() {
        int i = this.soundVersion;
        int i2 = 16;
        long containerSize = getContainerSize() + (i == 1 ? 16 : 0) + 28 + (i == 2 ? 36 : 0);
        if (!this.largeBox && 8 + containerSize < 4294967296L) {
            i2 = 8;
        }
        return containerSize + i2;
    }

    public int getSoundVersion() {
        return this.soundVersion;
    }

    public byte[] getSoundVersion2Data() {
        return this.soundVersion2Data;
    }

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, xsna.ga8, com.coremedia.iso.boxes.FullBox
    public void parse(xuk xukVar, ByteBuffer byteBuffer, long j, pa8 pa8Var) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(28);
        xukVar.read(allocate);
        allocate.position(6);
        this.dataReferenceIndex = crx0.u(allocate);
        this.soundVersion = crx0.u(allocate);
        this.reserved1 = crx0.u(allocate);
        this.reserved2 = crx0.w(allocate);
        this.channelCount = crx0.u(allocate);
        this.sampleSize = crx0.u(allocate);
        this.compressionId = crx0.u(allocate);
        this.packetSize = crx0.u(allocate);
        this.sampleRate = crx0.w(allocate);
        if (!this.type.equals(TYPE10)) {
            this.sampleRate >>>= 16;
        }
        if (this.soundVersion == 1) {
            ByteBuffer allocate2 = ByteBuffer.allocate(16);
            xukVar.read(allocate2);
            allocate2.rewind();
            this.samplesPerPacket = crx0.w(allocate2);
            this.bytesPerPacket = crx0.w(allocate2);
            this.bytesPerFrame = crx0.w(allocate2);
            this.bytesPerSample = crx0.w(allocate2);
        }
        if (this.soundVersion == 2) {
            ByteBuffer allocate3 = ByteBuffer.allocate(36);
            xukVar.read(allocate3);
            allocate3.rewind();
            this.samplesPerPacket = crx0.w(allocate3);
            this.bytesPerPacket = crx0.w(allocate3);
            this.bytesPerFrame = crx0.w(allocate3);
            this.bytesPerSample = crx0.w(allocate3);
            byte[] bArr = new byte[20];
            this.soundVersion2Data = bArr;
            allocate3.get(bArr);
        }
        if (!TYPE7.equals(this.type)) {
            long j2 = j - 28;
            int i = this.soundVersion;
            initContainer(xukVar, (j2 - (i != 1 ? 0 : 16)) - (i != 2 ? 0 : 36), pa8Var);
            return;
        }
        System.err.println(TYPE7);
        long j3 = j - 28;
        int i2 = this.soundVersion;
        final long j4 = (j3 - (i2 != 1 ? 0 : 16)) - (i2 != 2 ? 0 : 36);
        final ByteBuffer allocate4 = ByteBuffer.allocate(up2.p(j4));
        xukVar.read(allocate4);
        addBox(new ga8() { // from class: com.coremedia.iso.boxes.sampleentry.AudioSampleEntry.1
            @Override // xsna.ga8, com.coremedia.iso.boxes.FullBox
            public void getBox(WritableByteChannel writableByteChannel) throws IOException {
                allocate4.rewind();
                writableByteChannel.write(allocate4);
            }

            public long getOffset() {
                return 0L;
            }

            @Override // xsna.ga8
            public yej getParent() {
                return AudioSampleEntry.this;
            }

            @Override // xsna.ga8, com.coremedia.iso.boxes.FullBox
            public long getSize() {
                return j4;
            }

            @Override // xsna.ga8
            public String getType() {
                return InternalFrame.ID;
            }

            @Override // xsna.ga8, com.coremedia.iso.boxes.FullBox
            public void parse(xuk xukVar2, ByteBuffer byteBuffer2, long j5, pa8 pa8Var2) throws IOException {
                throw new RuntimeException("NotImplemented");
            }

            @Override // xsna.ga8
            public void setParent(yej yejVar) {
                if (!AudioSampleEntry.$assertionsDisabled && yejVar != AudioSampleEntry.this) {
                    throw new AssertionError("you cannot diswown this special box");
                }
            }
        });
    }

    public void setBytesPerFrame(long j) {
        this.bytesPerFrame = j;
    }

    public void setBytesPerPacket(long j) {
        this.bytesPerPacket = j;
    }

    public void setBytesPerSample(long j) {
        this.bytesPerSample = j;
    }

    public void setChannelCount(int i) {
        this.channelCount = i;
    }

    public void setCompressionId(int i) {
        this.compressionId = i;
    }

    public void setPacketSize(int i) {
        this.packetSize = i;
    }

    public void setReserved1(int i) {
        this.reserved1 = i;
    }

    public void setReserved2(long j) {
        this.reserved2 = j;
    }

    public void setSampleRate(long j) {
        this.sampleRate = j;
    }

    public void setSampleSize(int i) {
        this.sampleSize = i;
    }

    public void setSamplesPerPacket(long j) {
        this.samplesPerPacket = j;
    }

    public void setSoundVersion(int i) {
        this.soundVersion = i;
    }

    public void setSoundVersion2Data(byte[] bArr) {
        this.soundVersion2Data = bArr;
    }

    public void setType(String str) {
        this.type = str;
    }

    @Override // com.googlecode.mp4parser.BasicContainer
    public String toString() {
        return "AudioSampleEntry{bytesPerSample=" + this.bytesPerSample + ", bytesPerFrame=" + this.bytesPerFrame + ", bytesPerPacket=" + this.bytesPerPacket + ", samplesPerPacket=" + this.samplesPerPacket + ", packetSize=" + this.packetSize + ", compressionId=" + this.compressionId + ", soundVersion=" + this.soundVersion + ", sampleRate=" + this.sampleRate + ", sampleSize=" + this.sampleSize + ", channelCount=" + this.channelCount + ", boxes=" + getBoxes() + '}';
    }
}
