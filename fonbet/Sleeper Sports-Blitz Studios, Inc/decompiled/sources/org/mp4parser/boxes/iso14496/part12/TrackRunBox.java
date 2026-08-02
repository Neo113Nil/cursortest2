package org.mp4parser.boxes.iso14496.part12;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import javazoom.jl.decoder.BitstreamErrors;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.CastUtils;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;
import org.objectweb.asm.Opcodes;

/* loaded from: classes10.dex */
public class TrackRunBox extends AbstractFullBox {
    public static final String TYPE = "trun";
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_10;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_11;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_12;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_13;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_14;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_15;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_16;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_17;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_18;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_19;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_3;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_4;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_5;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_6;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_7;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_8;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_9;
    private int dataOffset;
    private List<Entry> entries;
    private SampleFlags firstSampleFlags;

    static {
        ajc$preClinit();
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("TrackRunBox.java", TrackRunBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getEntries", "org.mp4parser.boxes.iso14496.part12.TrackRunBox", "", "", "", "java.util.List"), 60);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setEntries", "org.mp4parser.boxes.iso14496.part12.TrackRunBox", "java.util.List", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "", "void"), 64);
        ajc$tjp_10 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setSampleDurationPresent", "org.mp4parser.boxes.iso14496.part12.TrackRunBox", "boolean", "v", "", "void"), 210);
        ajc$tjp_11 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "isSampleFlagsPresent", "org.mp4parser.boxes.iso14496.part12.TrackRunBox", "", "", "", "boolean"), 219);
        ajc$tjp_12 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setSampleFlagsPresent", "org.mp4parser.boxes.iso14496.part12.TrackRunBox", "boolean", "v", "", "void"), 223);
        ajc$tjp_13 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "isSampleCompositionTimeOffsetPresent", "org.mp4parser.boxes.iso14496.part12.TrackRunBox", "", "", "", "boolean"), 231);
        ajc$tjp_14 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setSampleCompositionTimeOffsetPresent", "org.mp4parser.boxes.iso14496.part12.TrackRunBox", "boolean", "v", "", "void"), 235);
        ajc$tjp_15 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getDataOffset", "org.mp4parser.boxes.iso14496.part12.TrackRunBox", "", "", "", "int"), 244);
        ajc$tjp_16 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setDataOffset", "org.mp4parser.boxes.iso14496.part12.TrackRunBox", "int", "dataOffset", "", "void"), 248);
        ajc$tjp_17 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getFirstSampleFlags", "org.mp4parser.boxes.iso14496.part12.TrackRunBox", "", "", "", "org.mp4parser.boxes.iso14496.part12.SampleFlags"), 257);
        ajc$tjp_18 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setFirstSampleFlags", "org.mp4parser.boxes.iso14496.part12.TrackRunBox", "org.mp4parser.boxes.iso14496.part12.SampleFlags", "firstSampleFlags", "", "void"), BitstreamErrors.INVALIDFRAME);
        ajc$tjp_19 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", InAppPurchaseConstants.METHOD_TO_STRING, "org.mp4parser.boxes.iso14496.part12.TrackRunBox", "", "", "", "java.lang.String"), 271);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getSampleCompositionTimeOffsets", "org.mp4parser.boxes.iso14496.part12.TrackRunBox", "", "", "", "[J"), 68);
        ajc$tjp_3 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getSampleCount", "org.mp4parser.boxes.iso14496.part12.TrackRunBox", "", "", "", "long"), Opcodes.LRETURN);
        ajc$tjp_4 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "isDataOffsetPresent", "org.mp4parser.boxes.iso14496.part12.TrackRunBox", "", "", "", "boolean"), Opcodes.RETURN);
        ajc$tjp_5 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setDataOffsetPresent", "org.mp4parser.boxes.iso14496.part12.TrackRunBox", "boolean", "v", "", "void"), Opcodes.PUTFIELD);
        ajc$tjp_6 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "isFirstSampleFlagsPresent", "org.mp4parser.boxes.iso14496.part12.TrackRunBox", "", "", "", "boolean"), 189);
        ajc$tjp_7 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "isSampleSizePresent", "org.mp4parser.boxes.iso14496.part12.TrackRunBox", "", "", "", "boolean"), Opcodes.MONITORENTER);
        ajc$tjp_8 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setSampleSizePresent", "org.mp4parser.boxes.iso14496.part12.TrackRunBox", "boolean", "v", "", "void"), Opcodes.IFNULL);
        ajc$tjp_9 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "isSampleDurationPresent", "org.mp4parser.boxes.iso14496.part12.TrackRunBox", "", "", "", "boolean"), 206);
    }

    public TrackRunBox() {
        super(TYPE);
        this.entries = new ArrayList();
    }

    public List<Entry> getEntries() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_0, this, this));
        return this.entries;
    }

    public void setEntries(List<Entry> list) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_1, this, this, list));
        this.entries = list;
    }

    public long[] getSampleCompositionTimeOffsets() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_2, this, this));
        if (!isSampleCompositionTimeOffsetPresent()) {
            return null;
        }
        int size = this.entries.size();
        long[] jArr = new long[size];
        for (int i = 0; i < size; i++) {
            jArr[i] = this.entries.get(i).getSampleCompositionTimeOffset();
        }
        return jArr;
    }

    @Override // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        int flags = getFlags();
        long j = (flags & 1) == 1 ? 12L : 8L;
        if ((flags & 4) == 4) {
            j += 4;
        }
        long j2 = (flags & 256) == 256 ? 4L : 0L;
        if ((flags & 512) == 512) {
            j2 += 4;
        }
        if ((flags & 1024) == 1024) {
            j2 += 4;
        }
        if ((flags & 2048) == 2048) {
            j2 += 4;
        }
        return j + (j2 * this.entries.size());
    }

    @Override // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.writeUInt32(byteBuffer, this.entries.size());
        int flags = getFlags();
        if ((flags & 1) == 1) {
            IsoTypeWriter.writeUInt32(byteBuffer, this.dataOffset);
        }
        if ((flags & 4) == 4) {
            this.firstSampleFlags.getContent(byteBuffer);
        }
        for (Entry entry : this.entries) {
            if ((flags & 256) == 256) {
                IsoTypeWriter.writeUInt32(byteBuffer, entry.sampleDuration);
            }
            if ((flags & 512) == 512) {
                IsoTypeWriter.writeUInt32(byteBuffer, entry.sampleSize);
            }
            if ((flags & 1024) == 1024) {
                entry.sampleFlags.getContent(byteBuffer);
            }
            if ((flags & 2048) == 2048) {
                if (getVersion() == 0) {
                    IsoTypeWriter.writeUInt32(byteBuffer, entry.sampleCompositionTimeOffset);
                } else {
                    byteBuffer.putInt((int) entry.sampleCompositionTimeOffset);
                }
            }
        }
    }

    @Override // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        long readUInt32 = IsoTypeReader.readUInt32(byteBuffer);
        if ((getFlags() & 1) == 1) {
            this.dataOffset = CastUtils.l2i(IsoTypeReader.readUInt32(byteBuffer));
        } else {
            this.dataOffset = -1;
        }
        if ((getFlags() & 4) == 4) {
            this.firstSampleFlags = new SampleFlags(byteBuffer);
        }
        for (int i = 0; i < readUInt32; i++) {
            Entry entry = new Entry();
            if ((getFlags() & 256) == 256) {
                entry.sampleDuration = IsoTypeReader.readUInt32(byteBuffer);
            }
            if ((getFlags() & 512) == 512) {
                entry.sampleSize = IsoTypeReader.readUInt32(byteBuffer);
            }
            if ((getFlags() & 1024) == 1024) {
                entry.sampleFlags = new SampleFlags(byteBuffer);
            }
            if ((getFlags() & 2048) == 2048) {
                entry.sampleCompositionTimeOffset = byteBuffer.getInt();
            }
            this.entries.add(entry);
        }
    }

    public long getSampleCount() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_3, this, this));
        return this.entries.size();
    }

    public boolean isDataOffsetPresent() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_4, this, this));
        return (getFlags() & 1) == 1;
    }

    public void setDataOffsetPresent(boolean z) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_5, this, this, Conversions.booleanObject(z)));
        if (z) {
            setFlags(getFlags() | 1);
        } else {
            setFlags(getFlags() & 16777214);
        }
    }

    public boolean isFirstSampleFlagsPresent() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_6, this, this));
        return (getFlags() & 4) == 4;
    }

    public boolean isSampleSizePresent() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_7, this, this));
        return (getFlags() & 512) == 512;
    }

    public void setSampleSizePresent(boolean z) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_8, this, this, Conversions.booleanObject(z)));
        if (z) {
            setFlags(getFlags() | 512);
        } else {
            setFlags(getFlags() & 16776703);
        }
    }

    public boolean isSampleDurationPresent() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_9, this, this));
        return (getFlags() & 256) == 256;
    }

    public void setSampleDurationPresent(boolean z) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_10, this, this, Conversions.booleanObject(z)));
        if (z) {
            setFlags(getFlags() | 256);
        } else {
            setFlags(getFlags() & 16776959);
        }
    }

    public boolean isSampleFlagsPresent() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_11, this, this));
        return (getFlags() & 1024) == 1024;
    }

    public void setSampleFlagsPresent(boolean z) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_12, this, this, Conversions.booleanObject(z)));
        if (z) {
            setFlags(getFlags() | 1024);
        } else {
            setFlags(getFlags() & 16776191);
        }
    }

    public boolean isSampleCompositionTimeOffsetPresent() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_13, this, this));
        return (getFlags() & 2048) == 2048;
    }

    public void setSampleCompositionTimeOffsetPresent(boolean z) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_14, this, this, Conversions.booleanObject(z)));
        if (z) {
            setFlags(getFlags() | 2048);
        } else {
            setFlags(getFlags() & 16775167);
        }
    }

    public int getDataOffset() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_15, this, this));
        return this.dataOffset;
    }

    public void setDataOffset(int i) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_16, this, this, Conversions.intObject(i)));
        if (i == -1) {
            setFlags(getFlags() & 16777214);
        } else {
            setFlags(getFlags() | 1);
        }
        this.dataOffset = i;
    }

    public SampleFlags getFirstSampleFlags() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_17, this, this));
        return this.firstSampleFlags;
    }

    public void setFirstSampleFlags(SampleFlags sampleFlags) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_18, this, this, sampleFlags));
        if (sampleFlags == null) {
            setFlags(getFlags() & 16777211);
        } else {
            setFlags(getFlags() | 4);
        }
        this.firstSampleFlags = sampleFlags;
    }

    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_19, this, this));
        return "TrackRunBox{sampleCount=" + this.entries.size() + ", dataOffset=" + this.dataOffset + ", dataOffsetPresent=" + isDataOffsetPresent() + ", sampleSizePresent=" + isSampleSizePresent() + ", sampleDurationPresent=" + isSampleDurationPresent() + ", sampleFlagsPresentPresent=" + isSampleFlagsPresent() + ", sampleCompositionTimeOffsetPresent=" + isSampleCompositionTimeOffsetPresent() + ", firstSampleFlags=" + this.firstSampleFlags + AbstractJsonLexerKt.END_OBJ;
    }

    public static class Entry {
        private long sampleCompositionTimeOffset;
        private long sampleDuration;
        private SampleFlags sampleFlags;
        private long sampleSize;

        public Entry() {
        }

        public Entry(long j, long j2, SampleFlags sampleFlags, int i) {
            this.sampleDuration = j;
            this.sampleSize = j2;
            this.sampleFlags = sampleFlags;
            this.sampleCompositionTimeOffset = i;
        }

        public long getSampleDuration() {
            return this.sampleDuration;
        }

        public void setSampleDuration(long j) {
            this.sampleDuration = j;
        }

        public long getSampleSize() {
            return this.sampleSize;
        }

        public void setSampleSize(long j) {
            this.sampleSize = j;
        }

        public SampleFlags getSampleFlags() {
            return this.sampleFlags;
        }

        public void setSampleFlags(SampleFlags sampleFlags) {
            this.sampleFlags = sampleFlags;
        }

        public long getSampleCompositionTimeOffset() {
            return this.sampleCompositionTimeOffset;
        }

        public void setSampleCompositionTimeOffset(int i) {
            this.sampleCompositionTimeOffset = i;
        }

        public String toString() {
            return "Entry{duration=" + this.sampleDuration + ", size=" + this.sampleSize + ", dlags=" + this.sampleFlags + ", compTimeOffset=" + this.sampleCompositionTimeOffset + AbstractJsonLexerKt.END_OBJ;
        }
    }
}
