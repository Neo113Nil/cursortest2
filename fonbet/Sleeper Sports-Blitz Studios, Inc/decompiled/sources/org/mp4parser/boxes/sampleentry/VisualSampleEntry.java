package org.mp4parser.boxes.sampleentry;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.Arrays;
import org.mp4parser.BoxParser;
import org.mp4parser.Container;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;
import org.mp4parser.tools.Utf8;

/* loaded from: classes10.dex */
public final class VisualSampleEntry extends AbstractSampleEntry implements Container {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String TYPE1 = "mp4v";
    public static final String TYPE2 = "s263";
    public static final String TYPE3 = "avc1";
    public static final String TYPE4 = "avc3";
    public static final String TYPE5 = "drmi";
    public static final String TYPE6 = "hvc1";
    public static final String TYPE7 = "hev1";
    public static final String TYPE_ENCRYPTED = "encv";
    private String compressorname;
    private int depth;
    private int frameCount;
    private int height;
    private double horizresolution;
    private long[] predefined;
    private double vertresolution;
    private int width;

    public VisualSampleEntry() {
        super(TYPE3);
        this.horizresolution = 72.0d;
        this.vertresolution = 72.0d;
        this.frameCount = 1;
        this.compressorname = "";
        this.depth = 24;
        this.predefined = new long[3];
    }

    public VisualSampleEntry(String str) {
        super(str);
        this.horizresolution = 72.0d;
        this.vertresolution = 72.0d;
        this.frameCount = 1;
        this.compressorname = "";
        this.depth = 24;
        this.predefined = new long[3];
    }

    public void setType(String str) {
        this.type = str;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public double getHorizresolution() {
        return this.horizresolution;
    }

    public void setHorizresolution(double d) {
        this.horizresolution = d;
    }

    public double getVertresolution() {
        return this.vertresolution;
    }

    public void setVertresolution(double d) {
        this.vertresolution = d;
    }

    public int getFrameCount() {
        return this.frameCount;
    }

    public void setFrameCount(int i) {
        this.frameCount = i;
    }

    public String getCompressorname() {
        return this.compressorname;
    }

    public void setCompressorname(String str) {
        this.compressorname = str;
    }

    public int getDepth() {
        return this.depth;
    }

    public void setDepth(int i) {
        this.depth = i;
    }

    @Override // org.mp4parser.boxes.sampleentry.AbstractSampleEntry, org.mp4parser.support.AbstractContainerBox, org.mp4parser.ParsableBox
    public void parse(ReadableByteChannel readableByteChannel, ByteBuffer byteBuffer, long j, BoxParser boxParser) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(78);
        readableByteChannel.read(allocate);
        allocate.position(6);
        this.dataReferenceIndex = IsoTypeReader.readUInt16(allocate);
        IsoTypeReader.readUInt16(allocate);
        IsoTypeReader.readUInt16(allocate);
        this.predefined[0] = IsoTypeReader.readUInt32(allocate);
        this.predefined[1] = IsoTypeReader.readUInt32(allocate);
        this.predefined[2] = IsoTypeReader.readUInt32(allocate);
        this.width = IsoTypeReader.readUInt16(allocate);
        this.height = IsoTypeReader.readUInt16(allocate);
        this.horizresolution = IsoTypeReader.readFixedPoint1616(allocate);
        this.vertresolution = IsoTypeReader.readFixedPoint1616(allocate);
        IsoTypeReader.readUInt32(allocate);
        this.frameCount = IsoTypeReader.readUInt16(allocate);
        int readUInt8 = IsoTypeReader.readUInt8(allocate);
        if (readUInt8 > 31) {
            readUInt8 = 31;
        }
        byte[] bArr = new byte[readUInt8];
        allocate.get(bArr);
        this.compressorname = Utf8.convert(bArr);
        if (readUInt8 < 31) {
            allocate.get(new byte[31 - readUInt8]);
        }
        this.depth = IsoTypeReader.readUInt16(allocate);
        IsoTypeReader.readUInt16(allocate);
        initContainer(readableByteChannel, j - 78, boxParser);
    }

    @Override // org.mp4parser.boxes.sampleentry.AbstractSampleEntry, org.mp4parser.support.AbstractContainerBox, org.mp4parser.Box
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(getHeader());
        ByteBuffer allocate = ByteBuffer.allocate(78);
        allocate.position(6);
        IsoTypeWriter.writeUInt16(allocate, this.dataReferenceIndex);
        IsoTypeWriter.writeUInt16(allocate, 0);
        IsoTypeWriter.writeUInt16(allocate, 0);
        IsoTypeWriter.writeUInt32(allocate, this.predefined[0]);
        IsoTypeWriter.writeUInt32(allocate, this.predefined[1]);
        IsoTypeWriter.writeUInt32(allocate, this.predefined[2]);
        IsoTypeWriter.writeUInt16(allocate, getWidth());
        IsoTypeWriter.writeUInt16(allocate, getHeight());
        IsoTypeWriter.writeFixedPoint1616(allocate, getHorizresolution());
        IsoTypeWriter.writeFixedPoint1616(allocate, getVertresolution());
        IsoTypeWriter.writeUInt32(allocate, 0L);
        IsoTypeWriter.writeUInt16(allocate, getFrameCount());
        IsoTypeWriter.writeUInt8(allocate, Utf8.utf8StringLengthInBytes(getCompressorname()));
        allocate.put(Utf8.convert(getCompressorname()));
        int utf8StringLengthInBytes = Utf8.utf8StringLengthInBytes(getCompressorname());
        while (utf8StringLengthInBytes < 31) {
            utf8StringLengthInBytes++;
            allocate.put((byte) 0);
        }
        IsoTypeWriter.writeUInt16(allocate, getDepth());
        IsoTypeWriter.writeUInt16(allocate, 65535);
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        writeContainer(writableByteChannel);
    }

    @Override // org.mp4parser.support.AbstractContainerBox, org.mp4parser.Box
    public long getSize() {
        long containerSize = getContainerSize();
        return 78 + containerSize + ((this.largeBox || containerSize + 86 >= 4294967296L) ? 16 : 8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VisualSampleEntry visualSampleEntry = (VisualSampleEntry) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            getBox(Channels.newChannel(byteArrayOutputStream));
            try {
                visualSampleEntry.getBox(Channels.newChannel(byteArrayOutputStream2));
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
