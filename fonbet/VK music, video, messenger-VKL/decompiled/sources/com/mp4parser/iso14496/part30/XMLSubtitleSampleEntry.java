package com.mp4parser.iso14496.part30;

import com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import xsna.aqw;
import xsna.crx0;
import xsna.k73;
import xsna.pa8;
import xsna.xuk;

/* loaded from: classes14.dex */
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

    public String getAuxiliaryMimeTypes() {
        return this.auxiliaryMimeTypes;
    }

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, xsna.ga8, com.coremedia.iso.boxes.FullBox
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(getHeader());
        ByteBuffer allocate = ByteBuffer.allocate(this.auxiliaryMimeTypes.length() + this.schemaLocation.length() + this.namespace.length() + 8 + 3);
        allocate.position(6);
        aqw.u(this.dataReferenceIndex, allocate);
        aqw.x(this.namespace, allocate);
        aqw.x(this.schemaLocation, allocate);
        aqw.x(this.auxiliaryMimeTypes, allocate);
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        writeContainer(writableByteChannel);
    }

    public String getNamespace() {
        return this.namespace;
    }

    public String getSchemaLocation() {
        return this.schemaLocation;
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, xsna.ga8, com.coremedia.iso.boxes.FullBox
    public long getSize() {
        long containerSize = getContainerSize() + k73.a(this.schemaLocation.length() + this.namespace.length() + 8, 3, this.auxiliaryMimeTypes);
        return containerSize + ((this.largeBox || 8 + containerSize >= 4294967296L) ? 16 : 8);
    }

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, xsna.ga8, com.coremedia.iso.boxes.FullBox
    public void parse(xuk xukVar, ByteBuffer byteBuffer, long j, pa8 pa8Var) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        xukVar.read((ByteBuffer) allocate.rewind());
        allocate.position(6);
        this.dataReferenceIndex = crx0.u(allocate);
        long position = xukVar.position();
        ByteBuffer allocate2 = ByteBuffer.allocate(1024);
        xukVar.read((ByteBuffer) allocate2.rewind());
        this.namespace = crx0.t((ByteBuffer) allocate2.rewind());
        xukVar.position(r3.length() + position + 1);
        xukVar.read((ByteBuffer) allocate2.rewind());
        this.schemaLocation = crx0.t((ByteBuffer) allocate2.rewind());
        xukVar.position(this.namespace.length() + position + this.schemaLocation.length() + 2);
        xukVar.read((ByteBuffer) allocate2.rewind());
        this.auxiliaryMimeTypes = crx0.t((ByteBuffer) allocate2.rewind());
        xukVar.position(position + this.namespace.length() + this.schemaLocation.length() + this.auxiliaryMimeTypes.length() + 3);
        initContainer(xukVar, j - k73.a(this.schemaLocation.length() + (this.namespace.length() + byteBuffer.remaining()), 3, this.auxiliaryMimeTypes), pa8Var);
    }

    public void setAuxiliaryMimeTypes(String str) {
        this.auxiliaryMimeTypes = str;
    }

    public void setNamespace(String str) {
        this.namespace = str;
    }

    public void setSchemaLocation(String str) {
        this.schemaLocation = str;
    }
}
