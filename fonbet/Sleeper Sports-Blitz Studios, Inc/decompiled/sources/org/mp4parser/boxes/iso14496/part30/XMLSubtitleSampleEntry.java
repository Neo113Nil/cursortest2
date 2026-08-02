package org.mp4parser.boxes.iso14496.part30;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import org.mp4parser.BoxParser;
import org.mp4parser.boxes.sampleentry.AbstractSampleEntry;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;
import org.mp4parser.tools.Mp4Arrays;
import org.mp4parser.tools.Utf8;

/* loaded from: classes10.dex */
public class XMLSubtitleSampleEntry extends AbstractSampleEntry {
    public static final String TYPE = "stpp";
    private String auxiliaryMimeTypes;
    private String namespace;
    private String schemaLocation;

    public XMLSubtitleSampleEntry() {
        super(TYPE);
        this.namespace = "";
        this.schemaLocation = "";
        this.auxiliaryMimeTypes = "";
    }

    @Override // org.mp4parser.support.AbstractContainerBox, org.mp4parser.Box
    public long getSize() {
        long containerSize = getContainerSize() + this.namespace.length() + 8 + this.schemaLocation.length() + this.auxiliaryMimeTypes.length() + 3;
        return containerSize + ((this.largeBox || 8 + containerSize >= 4294967296L) ? 16 : 8);
    }

    @Override // org.mp4parser.boxes.sampleentry.AbstractSampleEntry, org.mp4parser.support.AbstractContainerBox, org.mp4parser.ParsableBox
    public void parse(ReadableByteChannel readableByteChannel, ByteBuffer byteBuffer, long j, BoxParser boxParser) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        readableByteChannel.read((ByteBuffer) allocate.rewind());
        allocate.position(6);
        this.dataReferenceIndex = IsoTypeReader.readUInt16(allocate);
        byte[] bArr = new byte[0];
        while (true) {
            int read = Channels.newInputStream(readableByteChannel).read();
            if (read == 0) {
                break;
            } else {
                bArr = Mp4Arrays.copyOfAndAppend(bArr, (byte) read);
            }
        }
        this.namespace = Utf8.convert(bArr);
        byte[] bArr2 = new byte[0];
        while (true) {
            int read2 = Channels.newInputStream(readableByteChannel).read();
            if (read2 == 0) {
                break;
            } else {
                bArr2 = Mp4Arrays.copyOfAndAppend(bArr2, (byte) read2);
            }
        }
        this.schemaLocation = Utf8.convert(bArr2);
        byte[] bArr3 = new byte[0];
        while (true) {
            int read3 = Channels.newInputStream(readableByteChannel).read();
            if (read3 != 0) {
                bArr3 = Mp4Arrays.copyOfAndAppend(bArr3, (byte) read3);
            } else {
                this.auxiliaryMimeTypes = Utf8.convert(bArr3);
                initContainer(readableByteChannel, j - ((((byteBuffer.remaining() + this.namespace.length()) + this.schemaLocation.length()) + this.auxiliaryMimeTypes.length()) + 3), boxParser);
                return;
            }
        }
    }

    @Override // org.mp4parser.boxes.sampleentry.AbstractSampleEntry, org.mp4parser.support.AbstractContainerBox, org.mp4parser.Box
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(getHeader());
        ByteBuffer allocate = ByteBuffer.allocate(this.namespace.length() + 8 + this.schemaLocation.length() + this.auxiliaryMimeTypes.length() + 3);
        allocate.position(6);
        IsoTypeWriter.writeUInt16(allocate, this.dataReferenceIndex);
        IsoTypeWriter.writeZeroTermUtf8String(allocate, this.namespace);
        IsoTypeWriter.writeZeroTermUtf8String(allocate, this.schemaLocation);
        IsoTypeWriter.writeZeroTermUtf8String(allocate, this.auxiliaryMimeTypes);
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        writeContainer(writableByteChannel);
    }

    public String getNamespace() {
        return this.namespace;
    }

    public void setNamespace(String str) {
        this.namespace = str;
    }

    public String getSchemaLocation() {
        return this.schemaLocation;
    }

    public void setSchemaLocation(String str) {
        this.schemaLocation = str;
    }

    public String getAuxiliaryMimeTypes() {
        return this.auxiliaryMimeTypes;
    }

    public void setAuxiliaryMimeTypes(String str) {
        this.auxiliaryMimeTypes = str;
    }
}
