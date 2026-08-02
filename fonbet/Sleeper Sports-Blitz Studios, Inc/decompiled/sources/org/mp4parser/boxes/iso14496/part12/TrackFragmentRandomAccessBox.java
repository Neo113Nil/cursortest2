package org.mp4parser.boxes.iso14496.part12;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeReaderVariable;
import org.mp4parser.tools.IsoTypeWriter;
import org.mp4parser.tools.IsoTypeWriterVariable;
import org.objectweb.asm.Opcodes;

/* loaded from: classes10.dex */
public class TrackFragmentRandomAccessBox extends AbstractFullBox {
    public static final String TYPE = "tfra";
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_10;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_11;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_12;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_3;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_4;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_5;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_6;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_7;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_8;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_9;
    private List<Entry> entries;
    private int lengthSizeOfSampleNum;
    private int lengthSizeOfTrafNum;
    private int lengthSizeOfTrunNum;
    private int reserved;
    private long trackId;

    static {
        ajc$preClinit();
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("TrackFragmentRandomAccessBox.java", TrackFragmentRandomAccessBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getTrackId", "org.mp4parser.boxes.iso14496.part12.TrackFragmentRandomAccessBox", "", "", "", "long"), 126);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setTrackId", "org.mp4parser.boxes.iso14496.part12.TrackFragmentRandomAccessBox", "long", "trackId", "", "void"), 130);
        ajc$tjp_10 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getEntries", "org.mp4parser.boxes.iso14496.part12.TrackFragmentRandomAccessBox", "", "", "", "java.util.List"), Opcodes.IF_ACMPNE);
        ajc$tjp_11 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setEntries", "org.mp4parser.boxes.iso14496.part12.TrackFragmentRandomAccessBox", "java.util.List", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "", "void"), Opcodes.TABLESWITCH);
        ajc$tjp_12 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", InAppPurchaseConstants.METHOD_TO_STRING, "org.mp4parser.boxes.iso14496.part12.TrackFragmentRandomAccessBox", "", "", "", "java.lang.String"), Opcodes.DRETURN);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getReserved", "org.mp4parser.boxes.iso14496.part12.TrackFragmentRandomAccessBox", "", "", "", "int"), 134);
        ajc$tjp_3 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getLengthSizeOfTrafNum", "org.mp4parser.boxes.iso14496.part12.TrackFragmentRandomAccessBox", "", "", "", "int"), 138);
        ajc$tjp_4 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setLengthSizeOfTrafNum", "org.mp4parser.boxes.iso14496.part12.TrackFragmentRandomAccessBox", "int", "lengthSizeOfTrafNum", "", "void"), 142);
        ajc$tjp_5 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getLengthSizeOfTrunNum", "org.mp4parser.boxes.iso14496.part12.TrackFragmentRandomAccessBox", "", "", "", "int"), 146);
        ajc$tjp_6 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setLengthSizeOfTrunNum", "org.mp4parser.boxes.iso14496.part12.TrackFragmentRandomAccessBox", "int", "lengthSizeOfTrunNum", "", "void"), 150);
        ajc$tjp_7 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getLengthSizeOfSampleNum", "org.mp4parser.boxes.iso14496.part12.TrackFragmentRandomAccessBox", "", "", "", "int"), 154);
        ajc$tjp_8 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setLengthSizeOfSampleNum", "org.mp4parser.boxes.iso14496.part12.TrackFragmentRandomAccessBox", "int", "lengthSizeOfSampleNum", "", "void"), 158);
        ajc$tjp_9 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getNumberOfEntries", "org.mp4parser.boxes.iso14496.part12.TrackFragmentRandomAccessBox", "", "", "", "long"), Opcodes.IF_ICMPGE);
    }

    public TrackFragmentRandomAccessBox() {
        super(TYPE);
        this.lengthSizeOfTrafNum = 2;
        this.lengthSizeOfTrunNum = 2;
        this.lengthSizeOfSampleNum = 2;
        this.entries = Collections.EMPTY_LIST;
    }

    @Override // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        int size;
        if (getVersion() == 1) {
            size = this.entries.size() * 16;
        } else {
            size = this.entries.size() * 8;
        }
        return 16 + size + (this.lengthSizeOfTrafNum * this.entries.size()) + (this.lengthSizeOfTrunNum * this.entries.size()) + (this.lengthSizeOfSampleNum * this.entries.size());
    }

    @Override // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.trackId = IsoTypeReader.readUInt32(byteBuffer);
        long readUInt32 = IsoTypeReader.readUInt32(byteBuffer);
        this.reserved = (int) (readUInt32 >> 6);
        this.lengthSizeOfTrafNum = (((int) (63 & readUInt32)) >> 4) + 1;
        this.lengthSizeOfTrunNum = (((int) (12 & readUInt32)) >> 2) + 1;
        this.lengthSizeOfSampleNum = ((int) (readUInt32 & 3)) + 1;
        long readUInt322 = IsoTypeReader.readUInt32(byteBuffer);
        this.entries = new ArrayList();
        for (int i = 0; i < readUInt322; i++) {
            Entry entry = new Entry();
            if (getVersion() == 1) {
                entry.time = IsoTypeReader.readUInt64(byteBuffer);
                entry.moofOffset = IsoTypeReader.readUInt64(byteBuffer);
            } else {
                entry.time = IsoTypeReader.readUInt32(byteBuffer);
                entry.moofOffset = IsoTypeReader.readUInt32(byteBuffer);
            }
            entry.trafNumber = IsoTypeReaderVariable.read(byteBuffer, this.lengthSizeOfTrafNum);
            entry.trunNumber = IsoTypeReaderVariable.read(byteBuffer, this.lengthSizeOfTrunNum);
            entry.sampleNumber = IsoTypeReaderVariable.read(byteBuffer, this.lengthSizeOfSampleNum);
            this.entries.add(entry);
        }
    }

    @Override // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.writeUInt32(byteBuffer, this.trackId);
        IsoTypeWriter.writeUInt32(byteBuffer, (this.reserved << 6) | (((this.lengthSizeOfTrafNum - 1) & 3) << 4) | (((this.lengthSizeOfTrunNum - 1) & 3) << 2) | ((this.lengthSizeOfSampleNum - 1) & 3));
        IsoTypeWriter.writeUInt32(byteBuffer, this.entries.size());
        for (Entry entry : this.entries) {
            if (getVersion() == 1) {
                IsoTypeWriter.writeUInt64(byteBuffer, entry.time);
                IsoTypeWriter.writeUInt64(byteBuffer, entry.moofOffset);
            } else {
                IsoTypeWriter.writeUInt32(byteBuffer, entry.time);
                IsoTypeWriter.writeUInt32(byteBuffer, entry.moofOffset);
            }
            IsoTypeWriterVariable.write(entry.trafNumber, byteBuffer, this.lengthSizeOfTrafNum);
            IsoTypeWriterVariable.write(entry.trunNumber, byteBuffer, this.lengthSizeOfTrunNum);
            IsoTypeWriterVariable.write(entry.sampleNumber, byteBuffer, this.lengthSizeOfSampleNum);
        }
    }

    public long getTrackId() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_0, this, this));
        return this.trackId;
    }

    public void setTrackId(long j) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_1, this, this, Conversions.longObject(j)));
        this.trackId = j;
    }

    public int getReserved() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_2, this, this));
        return this.reserved;
    }

    public int getLengthSizeOfTrafNum() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_3, this, this));
        return this.lengthSizeOfTrafNum;
    }

    public void setLengthSizeOfTrafNum(int i) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_4, this, this, Conversions.intObject(i)));
        this.lengthSizeOfTrafNum = i;
    }

    public int getLengthSizeOfTrunNum() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_5, this, this));
        return this.lengthSizeOfTrunNum;
    }

    public void setLengthSizeOfTrunNum(int i) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_6, this, this, Conversions.intObject(i)));
        this.lengthSizeOfTrunNum = i;
    }

    public int getLengthSizeOfSampleNum() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_7, this, this));
        return this.lengthSizeOfSampleNum;
    }

    public void setLengthSizeOfSampleNum(int i) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_8, this, this, Conversions.intObject(i)));
        this.lengthSizeOfSampleNum = i;
    }

    public long getNumberOfEntries() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_9, this, this));
        return this.entries.size();
    }

    public List<Entry> getEntries() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_10, this, this));
        return Collections.unmodifiableList(this.entries);
    }

    public void setEntries(List<Entry> list) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_11, this, this, list));
        this.entries = list;
    }

    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_12, this, this));
        return "TrackFragmentRandomAccessBox{trackId=" + this.trackId + ", entries=" + this.entries + AbstractJsonLexerKt.END_OBJ;
    }

    public static class Entry {
        private long moofOffset;
        private long sampleNumber;
        private long time;
        private long trafNumber;
        private long trunNumber;

        public Entry() {
        }

        public Entry(long j, long j2, long j3, long j4, long j5) {
            this.moofOffset = j2;
            this.sampleNumber = j5;
            this.time = j;
            this.trafNumber = j3;
            this.trunNumber = j4;
        }

        public long getTime() {
            return this.time;
        }

        public void setTime(long j) {
            this.time = j;
        }

        public long getMoofOffset() {
            return this.moofOffset;
        }

        public void setMoofOffset(long j) {
            this.moofOffset = j;
        }

        public long getTrafNumber() {
            return this.trafNumber;
        }

        public void setTrafNumber(long j) {
            this.trafNumber = j;
        }

        public long getTrunNumber() {
            return this.trunNumber;
        }

        public void setTrunNumber(long j) {
            this.trunNumber = j;
        }

        public long getSampleNumber() {
            return this.sampleNumber;
        }

        public void setSampleNumber(long j) {
            this.sampleNumber = j;
        }

        public String toString() {
            return "Entry{time=" + this.time + ", moofOffset=" + this.moofOffset + ", trafNumber=" + this.trafNumber + ", trunNumber=" + this.trunNumber + ", sampleNumber=" + this.sampleNumber + AbstractJsonLexerKt.END_OBJ;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Entry entry = (Entry) obj;
            return this.moofOffset == entry.moofOffset && this.sampleNumber == entry.sampleNumber && this.time == entry.time && this.trafNumber == entry.trafNumber && this.trunNumber == entry.trunNumber;
        }

        public int hashCode() {
            long j = this.time;
            long j2 = this.moofOffset;
            int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.trafNumber;
            int i2 = (i + ((int) (j3 ^ (j3 >>> 32)))) * 31;
            long j4 = this.trunNumber;
            int i3 = (i2 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
            long j5 = this.sampleNumber;
            return i3 + ((int) ((j5 >>> 32) ^ j5));
        }
    }
}
