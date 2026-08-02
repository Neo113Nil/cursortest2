package org.mp4parser.boxes.iso14496.part15;

import java.nio.ByteBuffer;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.mp4parser.boxes.samplegrouping.GroupEntry;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;

/* loaded from: classes10.dex */
public class SyncSampleEntry extends GroupEntry {
    public static final String TYPE = "sync";
    int nalUnitType;
    int reserved;

    @Override // org.mp4parser.boxes.samplegrouping.GroupEntry
    public void parse(ByteBuffer byteBuffer) {
        int readUInt8 = IsoTypeReader.readUInt8(byteBuffer);
        this.reserved = (readUInt8 & 192) >> 6;
        this.nalUnitType = readUInt8 & 63;
    }

    @Override // org.mp4parser.boxes.samplegrouping.GroupEntry
    public ByteBuffer get() {
        ByteBuffer allocate = ByteBuffer.allocate(1);
        IsoTypeWriter.writeUInt8(allocate, this.nalUnitType + (this.reserved << 6));
        return (ByteBuffer) allocate.rewind();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SyncSampleEntry syncSampleEntry = (SyncSampleEntry) obj;
        return this.nalUnitType == syncSampleEntry.nalUnitType && this.reserved == syncSampleEntry.reserved;
    }

    public int hashCode() {
        return (this.reserved * 31) + this.nalUnitType;
    }

    public int getReserved() {
        return this.reserved;
    }

    public void setReserved(int i) {
        this.reserved = i;
    }

    public int getNalUnitType() {
        return this.nalUnitType;
    }

    public void setNalUnitType(int i) {
        this.nalUnitType = i;
    }

    @Override // org.mp4parser.boxes.samplegrouping.GroupEntry
    public String getType() {
        return "sync";
    }

    public String toString() {
        return "SyncSampleEntry{reserved=" + this.reserved + ", nalUnitType=" + this.nalUnitType + AbstractJsonLexerKt.END_OBJ;
    }
}
