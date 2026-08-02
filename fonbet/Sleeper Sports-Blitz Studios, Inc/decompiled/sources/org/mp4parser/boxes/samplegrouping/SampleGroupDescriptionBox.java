package org.mp4parser.boxes.samplegrouping;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.IsoFile;
import org.mp4parser.boxes.iso14496.part15.StepwiseTemporalLayerEntry;
import org.mp4parser.boxes.iso14496.part15.SyncSampleEntry;
import org.mp4parser.boxes.iso14496.part15.TemporalLayerSampleGroup;
import org.mp4parser.boxes.iso14496.part15.TemporalSubLayerSampleGroup;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.CastUtils;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;
import org.objectweb.asm.Opcodes;

/* loaded from: classes10.dex */
public class SampleGroupDescriptionBox extends AbstractFullBox {
    public static final String TYPE = "sgpd";
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_3;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_4;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_5;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_6;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_7;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_8;
    private int defaultLength;
    private List<GroupEntry> groupEntries;
    private String groupingType;

    static {
        ajc$preClinit();
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("SampleGroupDescriptionBox.java", SampleGroupDescriptionBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getGroupingType", "org.mp4parser.boxes.samplegrouping.SampleGroupDescriptionBox", "", "", "", "java.lang.String"), 57);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setGroupingType", "org.mp4parser.boxes.samplegrouping.SampleGroupDescriptionBox", "java.lang.String", "groupingType", "", "void"), 61);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getDefaultLength", "org.mp4parser.boxes.samplegrouping.SampleGroupDescriptionBox", "", "", "", "int"), Opcodes.IF_ICMPLE);
        ajc$tjp_3 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setDefaultLength", "org.mp4parser.boxes.samplegrouping.SampleGroupDescriptionBox", "int", "defaultLength", "", "void"), Opcodes.JSR);
        ajc$tjp_4 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getGroupEntries", "org.mp4parser.boxes.samplegrouping.SampleGroupDescriptionBox", "", "", "", "java.util.List"), 172);
        ajc$tjp_5 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setGroupEntries", "org.mp4parser.boxes.samplegrouping.SampleGroupDescriptionBox", "java.util.List", "groupEntries", "", "void"), Opcodes.ARETURN);
        ajc$tjp_6 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "equals", "org.mp4parser.boxes.samplegrouping.SampleGroupDescriptionBox", "java.lang.Object", "o", "", "boolean"), Opcodes.PUTFIELD);
        ajc$tjp_7 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "hashCode", "org.mp4parser.boxes.samplegrouping.SampleGroupDescriptionBox", "", "", "", "int"), 202);
        ajc$tjp_8 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", InAppPurchaseConstants.METHOD_TO_STRING, "org.mp4parser.boxes.samplegrouping.SampleGroupDescriptionBox", "", "", "", "java.lang.String"), 210);
    }

    public SampleGroupDescriptionBox() {
        super(TYPE);
        this.groupEntries = new LinkedList();
        setVersion(1);
    }

    public String getGroupingType() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_0, this, this));
        return this.groupingType;
    }

    public void setGroupingType(String str) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_1, this, this, str));
        this.groupingType = str;
    }

    @Override // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        long j = (getVersion() == 1 ? 12L : 8L) + 4;
        for (GroupEntry groupEntry : this.groupEntries) {
            if (getVersion() == 1 && this.defaultLength == 0) {
                j += 4;
            }
            int i = this.defaultLength;
            if (i == 0) {
                i = groupEntry.size();
            }
            j += i;
        }
        return j;
    }

    @Override // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.put(IsoFile.fourCCtoBytes(this.groupingType));
        if (getVersion() == 1) {
            IsoTypeWriter.writeUInt32(byteBuffer, this.defaultLength);
        }
        IsoTypeWriter.writeUInt32(byteBuffer, this.groupEntries.size());
        Iterator<GroupEntry> it = this.groupEntries.iterator();
        while (it.hasNext()) {
            ByteBuffer byteBuffer2 = it.next().get();
            if (getVersion() == 1) {
                if (this.defaultLength == 0) {
                    IsoTypeWriter.writeUInt32(byteBuffer, byteBuffer2.limit());
                } else if (byteBuffer2.limit() > this.defaultLength) {
                    throw new RuntimeException(String.format("SampleGroupDescriptionBox entry size %d more than %d", Integer.valueOf(byteBuffer2.limit()), Integer.valueOf(this.defaultLength)));
                }
            }
            byteBuffer.put(byteBuffer2);
            int i = this.defaultLength;
            int limit = i == 0 ? 0 : i - byteBuffer2.limit();
            while (true) {
                int i2 = limit - 1;
                if (limit <= 0) {
                    break;
                }
                byteBuffer.put((byte) 0);
                limit = i2;
            }
        }
    }

    @Override // org.mp4parser.support.AbstractBox
    protected void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.groupingType = IsoTypeReader.read4cc(byteBuffer);
        if (getVersion() == 1) {
            this.defaultLength = CastUtils.l2i(IsoTypeReader.readUInt32(byteBuffer));
        }
        long readUInt32 = IsoTypeReader.readUInt32(byteBuffer);
        while (true) {
            long j = readUInt32 - 1;
            if (readUInt32 <= 0) {
                return;
            }
            int i = this.defaultLength;
            if (getVersion() == 1) {
                if (this.defaultLength == 0) {
                    i = CastUtils.l2i(IsoTypeReader.readUInt32(byteBuffer));
                }
            } else {
                i = byteBuffer.limit() - byteBuffer.position();
            }
            ByteBuffer slice = byteBuffer.slice();
            slice.limit(i);
            this.groupEntries.add(parseGroupEntry(slice, this.groupingType));
            if (getVersion() != 1) {
                i = slice.position();
            }
            byteBuffer.position(byteBuffer.position() + i);
            readUInt32 = j;
        }
    }

    private GroupEntry parseGroupEntry(ByteBuffer byteBuffer, String str) {
        GroupEntry unknownEntry;
        if ("roll".equals(str)) {
            unknownEntry = new RollRecoveryEntry();
        } else if (RateShareEntry.TYPE.equals(str)) {
            unknownEntry = new RateShareEntry();
        } else if (VisualRandomAccessEntry.TYPE.equals(str)) {
            unknownEntry = new VisualRandomAccessEntry();
        } else if (TemporalLevelEntry.TYPE.equals(str)) {
            unknownEntry = new TemporalLevelEntry();
        } else if ("sync".equals(str)) {
            unknownEntry = new SyncSampleEntry();
        } else if (TemporalLayerSampleGroup.TYPE.equals(str)) {
            unknownEntry = new TemporalLayerSampleGroup();
        } else if (TemporalSubLayerSampleGroup.TYPE.equals(str)) {
            unknownEntry = new TemporalSubLayerSampleGroup();
        } else if (StepwiseTemporalLayerEntry.TYPE.equals(str)) {
            unknownEntry = new StepwiseTemporalLayerEntry();
        } else {
            if (getVersion() == 0) {
                throw new RuntimeException("SampleGroupDescriptionBox with UnknownEntry are only supported in version 1");
            }
            unknownEntry = new UnknownEntry(str);
        }
        unknownEntry.parse(byteBuffer);
        return unknownEntry;
    }

    public int getDefaultLength() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_2, this, this));
        return this.defaultLength;
    }

    public void setDefaultLength(int i) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_3, this, this, Conversions.intObject(i)));
        this.defaultLength = i;
    }

    public List<GroupEntry> getGroupEntries() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_4, this, this));
        return this.groupEntries;
    }

    public void setGroupEntries(List<GroupEntry> list) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_5, this, this, list));
        this.groupEntries = list;
    }

    public boolean equals(Object obj) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_6, this, this, obj));
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SampleGroupDescriptionBox sampleGroupDescriptionBox = (SampleGroupDescriptionBox) obj;
        if (this.defaultLength != sampleGroupDescriptionBox.defaultLength) {
            return false;
        }
        List<GroupEntry> list = this.groupEntries;
        List<GroupEntry> list2 = sampleGroupDescriptionBox.groupEntries;
        return list == null ? list2 == null : list.equals(list2);
    }

    public int hashCode() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_7, this, this));
        int i = this.defaultLength * 31;
        List<GroupEntry> list = this.groupEntries;
        return i + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_8, this, this));
        StringBuilder sb = new StringBuilder("SampleGroupDescriptionBox{groupingType='");
        sb.append(this.groupEntries.size() > 0 ? this.groupEntries.get(0).getType() : "????");
        sb.append("', defaultLength=");
        sb.append(this.defaultLength);
        sb.append(", groupEntries=");
        sb.append(this.groupEntries);
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }
}
