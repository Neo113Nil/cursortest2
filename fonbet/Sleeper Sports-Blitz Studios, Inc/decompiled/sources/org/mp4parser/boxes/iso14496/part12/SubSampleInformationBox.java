package org.mp4parser.boxes.iso14496.part12;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.CastUtils;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;

/* loaded from: classes10.dex */
public class SubSampleInformationBox extends AbstractFullBox {
    public static final String TYPE = "subs";
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    private List<SubSampleEntry> entries;

    static {
        ajc$preClinit();
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("SubSampleInformationBox.java", SubSampleInformationBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getEntries", "org.mp4parser.boxes.iso14496.part12.SubSampleInformationBox", "", "", "", "java.util.List"), 49);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setEntries", "org.mp4parser.boxes.iso14496.part12.SubSampleInformationBox", "java.util.List", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "", "void"), 53);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", InAppPurchaseConstants.METHOD_TO_STRING, "org.mp4parser.boxes.iso14496.part12.SubSampleInformationBox", "", "", "", "java.lang.String"), 123);
    }

    public SubSampleInformationBox() {
        super("subs");
        this.entries = new ArrayList();
    }

    public List<SubSampleEntry> getEntries() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_0, this, this));
        return this.entries;
    }

    public void setEntries(List<SubSampleEntry> list) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_1, this, this, list));
        this.entries = list;
    }

    @Override // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        long j = 8;
        for (SubSampleEntry subSampleEntry : this.entries) {
            j += 6;
            for (int i = 0; i < subSampleEntry.getSubsampleEntries().size(); i++) {
                j = j + (getVersion() == 1 ? 4L : 2L) + 6;
            }
        }
        return j;
    }

    @Override // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        long readUInt32 = IsoTypeReader.readUInt32(byteBuffer);
        for (int i = 0; i < readUInt32; i++) {
            SubSampleEntry subSampleEntry = new SubSampleEntry();
            subSampleEntry.setSampleDelta(IsoTypeReader.readUInt32(byteBuffer));
            int readUInt16 = IsoTypeReader.readUInt16(byteBuffer);
            for (int i2 = 0; i2 < readUInt16; i2++) {
                SubSampleEntry.SubsampleEntry subsampleEntry = new SubSampleEntry.SubsampleEntry();
                subsampleEntry.setSubsampleSize(getVersion() == 1 ? IsoTypeReader.readUInt32(byteBuffer) : IsoTypeReader.readUInt16(byteBuffer));
                subsampleEntry.setSubsamplePriority(IsoTypeReader.readUInt8(byteBuffer));
                subsampleEntry.setDiscardable(IsoTypeReader.readUInt8(byteBuffer));
                subsampleEntry.setReserved(IsoTypeReader.readUInt32(byteBuffer));
                subSampleEntry.getSubsampleEntries().add(subsampleEntry);
            }
            this.entries.add(subSampleEntry);
        }
    }

    @Override // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.writeUInt32(byteBuffer, this.entries.size());
        for (SubSampleEntry subSampleEntry : this.entries) {
            IsoTypeWriter.writeUInt32(byteBuffer, subSampleEntry.getSampleDelta());
            IsoTypeWriter.writeUInt16(byteBuffer, subSampleEntry.getSubsampleCount());
            for (SubSampleEntry.SubsampleEntry subsampleEntry : subSampleEntry.getSubsampleEntries()) {
                if (getVersion() == 1) {
                    IsoTypeWriter.writeUInt32(byteBuffer, subsampleEntry.getSubsampleSize());
                } else {
                    IsoTypeWriter.writeUInt16(byteBuffer, CastUtils.l2i(subsampleEntry.getSubsampleSize()));
                }
                IsoTypeWriter.writeUInt8(byteBuffer, subsampleEntry.getSubsamplePriority());
                IsoTypeWriter.writeUInt8(byteBuffer, subsampleEntry.getDiscardable());
                IsoTypeWriter.writeUInt32(byteBuffer, subsampleEntry.getReserved());
            }
        }
    }

    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_2, this, this));
        return "SubSampleInformationBox{entryCount=" + this.entries.size() + ", entries=" + this.entries + AbstractJsonLexerKt.END_OBJ;
    }

    public static class SubSampleEntry {
        private long sampleDelta;
        private List<SubsampleEntry> subsampleEntries = new ArrayList();

        public long getSampleDelta() {
            return this.sampleDelta;
        }

        public void setSampleDelta(long j) {
            this.sampleDelta = j;
        }

        public int getSubsampleCount() {
            return this.subsampleEntries.size();
        }

        public List<SubsampleEntry> getSubsampleEntries() {
            return this.subsampleEntries;
        }

        public String toString() {
            return "SampleEntry{sampleDelta=" + this.sampleDelta + ", subsampleCount=" + this.subsampleEntries.size() + ", subsampleEntries=" + this.subsampleEntries + AbstractJsonLexerKt.END_OBJ;
        }

        public static class SubsampleEntry {
            private int discardable;
            private long reserved;
            private int subsamplePriority;
            private long subsampleSize;

            public long getSubsampleSize() {
                return this.subsampleSize;
            }

            public void setSubsampleSize(long j) {
                this.subsampleSize = j;
            }

            public int getSubsamplePriority() {
                return this.subsamplePriority;
            }

            public void setSubsamplePriority(int i) {
                this.subsamplePriority = i;
            }

            public int getDiscardable() {
                return this.discardable;
            }

            public void setDiscardable(int i) {
                this.discardable = i;
            }

            public long getReserved() {
                return this.reserved;
            }

            public void setReserved(long j) {
                this.reserved = j;
            }

            public String toString() {
                return "SubsampleEntry{subsampleSize=" + this.subsampleSize + ", subsamplePriority=" + this.subsamplePriority + ", discardable=" + this.discardable + ", reserved=" + this.reserved + AbstractJsonLexerKt.END_OBJ;
            }
        }
    }
}
