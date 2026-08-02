package org.mp4parser.boxes.iso14496.part15;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractBox;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.objectweb.asm.Opcodes;

/* loaded from: classes10.dex */
public final class AvcConfigurationBox extends AbstractBox {
    public static final String TYPE = "avcC";
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
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_20;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_21;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_22;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_23;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_24;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_25;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_26;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_27;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_3;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_4;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_5;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_6;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_7;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_8;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_9;
    public AvcDecoderConfigurationRecord avcDecoderConfigurationRecord;

    static {
        ajc$preClinit();
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("AvcConfigurationBox.java", AvcConfigurationBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getConfigurationVersion", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 44);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setConfigurationVersion", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "int", "configurationVersion", "", "void"), 48);
        ajc$tjp_10 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getSequenceParameterSets", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "", "java.util.List"), 84);
        ajc$tjp_11 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setSequenceParameterSets", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "java.util.List", "sequenceParameterSets", "", "void"), 88);
        ajc$tjp_12 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getPictureParameterSets", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "", "java.util.List"), 92);
        ajc$tjp_13 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setPictureParameterSets", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "java.util.List", "pictureParameterSets", "", "void"), 96);
        ajc$tjp_14 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getChromaFormat", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 100);
        ajc$tjp_15 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setChromaFormat", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "int", "chromaFormat", "", "void"), 104);
        ajc$tjp_16 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getBitDepthLumaMinus8", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 108);
        ajc$tjp_17 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setBitDepthLumaMinus8", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "int", "bitDepthLumaMinus8", "", "void"), 112);
        ajc$tjp_18 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getBitDepthChromaMinus8", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 116);
        ajc$tjp_19 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setBitDepthChromaMinus8", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "int", "bitDepthChromaMinus8", "", "void"), 120);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getAvcProfileIndication", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 52);
        ajc$tjp_20 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getSequenceParameterSetExts", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "", "java.util.List"), 124);
        ajc$tjp_21 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setSequenceParameterSetExts", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "java.util.List", "sequenceParameterSetExts", "", "void"), 128);
        ajc$tjp_22 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "hasExts", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "", "boolean"), 132);
        ajc$tjp_23 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setHasExts", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "boolean", "hasExts", "", "void"), 136);
        ajc$tjp_24 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getContentSize", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "", "long"), 147);
        ajc$tjp_25 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getContent", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "java.nio.ByteBuffer", "byteBuffer", "", "void"), 153);
        ajc$tjp_26 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getavcDecoderConfigurationRecord", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "", "org.mp4parser.boxes.iso14496.part15.AvcDecoderConfigurationRecord"), 158);
        ajc$tjp_27 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", InAppPurchaseConstants.METHOD_TO_STRING, "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "", "java.lang.String"), Opcodes.IF_ICMPGT);
        ajc$tjp_3 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setAvcProfileIndication", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "int", "avcProfileIndication", "", "void"), 56);
        ajc$tjp_4 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getProfileCompatibility", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 60);
        ajc$tjp_5 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setProfileCompatibility", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "int", "profileCompatibility", "", "void"), 64);
        ajc$tjp_6 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getAvcLevelIndication", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 68);
        ajc$tjp_7 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setAvcLevelIndication", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "int", "avcLevelIndication", "", "void"), 72);
        ajc$tjp_8 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getLengthSizeMinusOne", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 76);
        ajc$tjp_9 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setLengthSizeMinusOne", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "int", "lengthSizeMinusOne", "", "void"), 80);
    }

    public AvcConfigurationBox() {
        super(TYPE);
        this.avcDecoderConfigurationRecord = new AvcDecoderConfigurationRecord();
    }

    public int getConfigurationVersion() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_0, this, this));
        return this.avcDecoderConfigurationRecord.configurationVersion;
    }

    public void setConfigurationVersion(int i) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_1, this, this, Conversions.intObject(i)));
        this.avcDecoderConfigurationRecord.configurationVersion = i;
    }

    public int getAvcProfileIndication() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_2, this, this));
        return this.avcDecoderConfigurationRecord.avcProfileIndication;
    }

    public void setAvcProfileIndication(int i) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_3, this, this, Conversions.intObject(i)));
        this.avcDecoderConfigurationRecord.avcProfileIndication = i;
    }

    public int getProfileCompatibility() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_4, this, this));
        return this.avcDecoderConfigurationRecord.profileCompatibility;
    }

    public void setProfileCompatibility(int i) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_5, this, this, Conversions.intObject(i)));
        this.avcDecoderConfigurationRecord.profileCompatibility = i;
    }

    public int getAvcLevelIndication() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_6, this, this));
        return this.avcDecoderConfigurationRecord.avcLevelIndication;
    }

    public void setAvcLevelIndication(int i) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_7, this, this, Conversions.intObject(i)));
        this.avcDecoderConfigurationRecord.avcLevelIndication = i;
    }

    public int getLengthSizeMinusOne() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_8, this, this));
        return this.avcDecoderConfigurationRecord.lengthSizeMinusOne;
    }

    public void setLengthSizeMinusOne(int i) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_9, this, this, Conversions.intObject(i)));
        this.avcDecoderConfigurationRecord.lengthSizeMinusOne = i;
    }

    public List<ByteBuffer> getSequenceParameterSets() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_10, this, this));
        return Collections.unmodifiableList(this.avcDecoderConfigurationRecord.sequenceParameterSets);
    }

    public void setSequenceParameterSets(List<ByteBuffer> list) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_11, this, this, list));
        this.avcDecoderConfigurationRecord.sequenceParameterSets = list;
    }

    public List<ByteBuffer> getPictureParameterSets() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_12, this, this));
        return Collections.unmodifiableList(this.avcDecoderConfigurationRecord.pictureParameterSets);
    }

    public void setPictureParameterSets(List<ByteBuffer> list) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_13, this, this, list));
        this.avcDecoderConfigurationRecord.pictureParameterSets = list;
    }

    public int getChromaFormat() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_14, this, this));
        return this.avcDecoderConfigurationRecord.chromaFormat;
    }

    public void setChromaFormat(int i) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_15, this, this, Conversions.intObject(i)));
        this.avcDecoderConfigurationRecord.chromaFormat = i;
    }

    public int getBitDepthLumaMinus8() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_16, this, this));
        return this.avcDecoderConfigurationRecord.bitDepthLumaMinus8;
    }

    public void setBitDepthLumaMinus8(int i) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_17, this, this, Conversions.intObject(i)));
        this.avcDecoderConfigurationRecord.bitDepthLumaMinus8 = i;
    }

    public int getBitDepthChromaMinus8() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_18, this, this));
        return this.avcDecoderConfigurationRecord.bitDepthChromaMinus8;
    }

    public void setBitDepthChromaMinus8(int i) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_19, this, this, Conversions.intObject(i)));
        this.avcDecoderConfigurationRecord.bitDepthChromaMinus8 = i;
    }

    public List<ByteBuffer> getSequenceParameterSetExts() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_20, this, this));
        return this.avcDecoderConfigurationRecord.sequenceParameterSetExts;
    }

    public void setSequenceParameterSetExts(List<ByteBuffer> list) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_21, this, this, list));
        this.avcDecoderConfigurationRecord.sequenceParameterSetExts = list;
    }

    public boolean hasExts() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_22, this, this));
        return this.avcDecoderConfigurationRecord.hasExts;
    }

    public void setHasExts(boolean z) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_23, this, this, Conversions.booleanObject(z)));
        this.avcDecoderConfigurationRecord.hasExts = z;
    }

    @Override // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        this.avcDecoderConfigurationRecord = new AvcDecoderConfigurationRecord(byteBuffer);
    }

    @Override // org.mp4parser.support.AbstractBox
    public long getContentSize() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_24, this, this));
        return this.avcDecoderConfigurationRecord.getContentSize();
    }

    @Override // org.mp4parser.support.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_25, this, this, byteBuffer));
        this.avcDecoderConfigurationRecord.getContent(byteBuffer);
    }

    public AvcDecoderConfigurationRecord getavcDecoderConfigurationRecord() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_26, this, this));
        return this.avcDecoderConfigurationRecord;
    }

    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_27, this, this));
        return "AvcConfigurationBox{avcDecoderConfigurationRecord=" + this.avcDecoderConfigurationRecord + AbstractJsonLexerKt.END_OBJ;
    }
}
