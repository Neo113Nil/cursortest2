package org.mp4parser.boxes.sampleentry;

import androidx.media3.extractor.metadata.id3.InternalFrame;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.mp4parser.Box;
import org.mp4parser.BoxParser;
import org.mp4parser.tools.CastUtils;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* loaded from: classes10.dex */
public final class AudioSampleEntry extends AbstractSampleEntry {
    private static Logger LOG = LoggerFactory.getLogger((Class<?>) AudioSampleEntry.class);
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

    public void setType(String str) {
        this.type = str;
    }

    public int getChannelCount() {
        return this.channelCount;
    }

    public void setChannelCount(int i) {
        this.channelCount = i;
    }

    public int getSampleSize() {
        return this.sampleSize;
    }

    public void setSampleSize(int i) {
        this.sampleSize = i;
    }

    public long getSampleRate() {
        return this.sampleRate;
    }

    public void setSampleRate(long j) {
        this.sampleRate = j;
    }

    public int getSoundVersion() {
        return this.soundVersion;
    }

    public void setSoundVersion(int i) {
        this.soundVersion = i;
    }

    public int getCompressionId() {
        return this.compressionId;
    }

    public void setCompressionId(int i) {
        this.compressionId = i;
    }

    public int getPacketSize() {
        return this.packetSize;
    }

    public void setPacketSize(int i) {
        this.packetSize = i;
    }

    public long getSamplesPerPacket() {
        return this.samplesPerPacket;
    }

    public void setSamplesPerPacket(long j) {
        this.samplesPerPacket = j;
    }

    public long getBytesPerPacket() {
        return this.bytesPerPacket;
    }

    public void setBytesPerPacket(long j) {
        this.bytesPerPacket = j;
    }

    public long getBytesPerFrame() {
        return this.bytesPerFrame;
    }

    public void setBytesPerFrame(long j) {
        this.bytesPerFrame = j;
    }

    public long getBytesPerSample() {
        return this.bytesPerSample;
    }

    public void setBytesPerSample(long j) {
        this.bytesPerSample = j;
    }

    public byte[] getSoundVersion2Data() {
        return this.soundVersion2Data;
    }

    public void setSoundVersion2Data(byte[] bArr) {
        this.soundVersion2Data = bArr;
    }

    public int getReserved1() {
        return this.reserved1;
    }

    public void setReserved1(int i) {
        this.reserved1 = i;
    }

    public long getReserved2() {
        return this.reserved2;
    }

    public void setReserved2(long j) {
        this.reserved2 = j;
    }

    @Override // org.mp4parser.boxes.sampleentry.AbstractSampleEntry, org.mp4parser.support.AbstractContainerBox, org.mp4parser.ParsableBox
    public void parse(ReadableByteChannel readableByteChannel, ByteBuffer byteBuffer, long j, BoxParser boxParser) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(28);
        readableByteChannel.read(allocate);
        allocate.position(6);
        this.dataReferenceIndex = IsoTypeReader.readUInt16(allocate);
        this.soundVersion = IsoTypeReader.readUInt16(allocate);
        this.reserved1 = IsoTypeReader.readUInt16(allocate);
        this.reserved2 = IsoTypeReader.readUInt32(allocate);
        this.channelCount = IsoTypeReader.readUInt16(allocate);
        this.sampleSize = IsoTypeReader.readUInt16(allocate);
        this.compressionId = IsoTypeReader.readUInt16(allocate);
        this.packetSize = IsoTypeReader.readUInt16(allocate);
        this.sampleRate = IsoTypeReader.readUInt32(allocate);
        if (!this.type.equals(TYPE10)) {
            this.sampleRate >>>= 16;
        }
        if (this.soundVersion == 1) {
            ByteBuffer allocate2 = ByteBuffer.allocate(16);
            readableByteChannel.read(allocate2);
            allocate2.rewind();
            this.samplesPerPacket = IsoTypeReader.readUInt32(allocate2);
            this.bytesPerPacket = IsoTypeReader.readUInt32(allocate2);
            this.bytesPerFrame = IsoTypeReader.readUInt32(allocate2);
            this.bytesPerSample = IsoTypeReader.readUInt32(allocate2);
        }
        if (this.soundVersion == 2) {
            ByteBuffer allocate3 = ByteBuffer.allocate(36);
            readableByteChannel.read(allocate3);
            allocate3.rewind();
            this.samplesPerPacket = IsoTypeReader.readUInt32(allocate3);
            this.bytesPerPacket = IsoTypeReader.readUInt32(allocate3);
            this.bytesPerFrame = IsoTypeReader.readUInt32(allocate3);
            this.bytesPerSample = IsoTypeReader.readUInt32(allocate3);
            byte[] bArr = new byte[20];
            this.soundVersion2Data = bArr;
            allocate3.get(bArr);
        }
        if (TYPE7.equals(this.type)) {
            LOG.error(TYPE7);
            long j2 = j - 28;
            int i = this.soundVersion;
            final long j3 = (j2 - (i != 1 ? 0 : 16)) - (i != 2 ? 0 : 36);
            final ByteBuffer allocate4 = ByteBuffer.allocate(CastUtils.l2i(j3));
            readableByteChannel.read(allocate4);
            addBox(new Box() { // from class: org.mp4parser.boxes.sampleentry.AudioSampleEntry.1
                @Override // org.mp4parser.Box
                public long getSize() {
                    return j3;
                }

                @Override // org.mp4parser.Box
                public String getType() {
                    return InternalFrame.ID;
                }

                @Override // org.mp4parser.Box
                public void getBox(WritableByteChannel writableByteChannel) throws IOException {
                    allocate4.rewind();
                    writableByteChannel.write(allocate4);
                }
            });
            return;
        }
        long j4 = j - 28;
        int i2 = this.soundVersion;
        initContainer(readableByteChannel, (j4 - (i2 != 1 ? 0 : 16)) - (i2 != 2 ? 0 : 36), boxParser);
    }

    @Override // org.mp4parser.boxes.sampleentry.AbstractSampleEntry, org.mp4parser.support.AbstractContainerBox, org.mp4parser.Box
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(getHeader());
        int i = this.soundVersion;
        ByteBuffer allocate = ByteBuffer.allocate((i == 1 ? 16 : 0) + 28 + (i == 2 ? 36 : 0));
        allocate.position(6);
        IsoTypeWriter.writeUInt16(allocate, this.dataReferenceIndex);
        IsoTypeWriter.writeUInt16(allocate, this.soundVersion);
        IsoTypeWriter.writeUInt16(allocate, this.reserved1);
        IsoTypeWriter.writeUInt32(allocate, this.reserved2);
        IsoTypeWriter.writeUInt16(allocate, this.channelCount);
        IsoTypeWriter.writeUInt16(allocate, this.sampleSize);
        IsoTypeWriter.writeUInt16(allocate, this.compressionId);
        IsoTypeWriter.writeUInt16(allocate, this.packetSize);
        if (this.type.equals(TYPE10)) {
            IsoTypeWriter.writeUInt32(allocate, getSampleRate());
        } else {
            IsoTypeWriter.writeUInt32(allocate, getSampleRate() << 16);
        }
        if (this.soundVersion == 1) {
            IsoTypeWriter.writeUInt32(allocate, this.samplesPerPacket);
            IsoTypeWriter.writeUInt32(allocate, this.bytesPerPacket);
            IsoTypeWriter.writeUInt32(allocate, this.bytesPerFrame);
            IsoTypeWriter.writeUInt32(allocate, this.bytesPerSample);
        }
        if (this.soundVersion == 2) {
            IsoTypeWriter.writeUInt32(allocate, this.samplesPerPacket);
            IsoTypeWriter.writeUInt32(allocate, this.bytesPerPacket);
            IsoTypeWriter.writeUInt32(allocate, this.bytesPerFrame);
            IsoTypeWriter.writeUInt32(allocate, this.bytesPerSample);
            allocate.put(this.soundVersion2Data);
        }
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        writeContainer(writableByteChannel);
    }

    @Override // org.mp4parser.support.AbstractContainerBox, org.mp4parser.Box
    public long getSize() {
        int i = this.soundVersion;
        int i2 = 16;
        long containerSize = (i == 1 ? 16 : 0) + 28 + (i == 2 ? 36 : 0) + getContainerSize();
        if (!this.largeBox && 8 + containerSize < 4294967296L) {
            i2 = 8;
        }
        return containerSize + i2;
    }

    @Override // org.mp4parser.BasicContainer
    public String toString() {
        return "AudioSampleEntry{bytesPerSample=" + this.bytesPerSample + ", bytesPerFrame=" + this.bytesPerFrame + ", bytesPerPacket=" + this.bytesPerPacket + ", samplesPerPacket=" + this.samplesPerPacket + ", packetSize=" + this.packetSize + ", compressionId=" + this.compressionId + ", soundVersion=" + this.soundVersion + ", sampleRate=" + this.sampleRate + ", sampleSize=" + this.sampleSize + ", channelCount=" + this.channelCount + ", boxes=" + getBoxes() + AbstractJsonLexerKt.END_OBJ;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AudioSampleEntry audioSampleEntry = (AudioSampleEntry) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            getBox(Channels.newChannel(byteArrayOutputStream));
            try {
                audioSampleEntry.getBox(Channels.newChannel(byteArrayOutputStream2));
                return Arrays.equals(byteArrayOutputStream.toByteArray(), byteArrayOutputStream2.toByteArray());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    public int hashCode() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            getBox(Channels.newChannel(byteArrayOutputStream));
            return Arrays.hashCode(byteArrayOutputStream.toByteArray());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
