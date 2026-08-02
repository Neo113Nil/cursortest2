package org.mp4parser.boxes.dolby;

import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractBox;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;
import org.objectweb.asm.Opcodes;

/* loaded from: classes10.dex */
public class DoViConfigurationBox extends AbstractBox {
    public static final String TYPE = "dvcC";
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
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_3;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_4;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_5;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_6;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_7;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_8;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_9;
    private boolean blPresentFlag;
    private int dvLevel;
    private int dvProfile;
    private int dvVersionMajor;
    private int dvVersionMinor;
    private boolean elPresentFlag;
    private long reserved1;
    private long reserved2;
    private long reserved3;
    private long reserved4;
    private long reserved5;
    private boolean rpuPresentFlag;

    static {
        ajc$preClinit();
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("DoViConfigurationBox.java", DoViConfigurationBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getDvVersionMajor", "org.mp4parser.boxes.dolby.DoViConfigurationBox", "", "", "", "int"), 70);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setDvVersionMajor", "org.mp4parser.boxes.dolby.DoViConfigurationBox", "int", "dvVersionMajor", "", "void"), 74);
        ajc$tjp_10 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "isElPresentFlag", "org.mp4parser.boxes.dolby.DoViConfigurationBox", "", "", "", "boolean"), 110);
        ajc$tjp_11 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setElPresentFlag", "org.mp4parser.boxes.dolby.DoViConfigurationBox", "boolean", "elPresentFlag", "", "void"), 114);
        ajc$tjp_12 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "isBlPresentFlag", "org.mp4parser.boxes.dolby.DoViConfigurationBox", "", "", "", "boolean"), 118);
        ajc$tjp_13 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setBlPresentFlag", "org.mp4parser.boxes.dolby.DoViConfigurationBox", "boolean", "blPresentFlag", "", "void"), 122);
        ajc$tjp_14 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getReserved1", "org.mp4parser.boxes.dolby.DoViConfigurationBox", "", "", "", "long"), 126);
        ajc$tjp_15 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setReserved1", "org.mp4parser.boxes.dolby.DoViConfigurationBox", "long", "reserved1", "", "void"), 130);
        ajc$tjp_16 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getReserved2", "org.mp4parser.boxes.dolby.DoViConfigurationBox", "", "", "", "long"), 134);
        ajc$tjp_17 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setReserved2", "org.mp4parser.boxes.dolby.DoViConfigurationBox", "long", "reserved2", "", "void"), 138);
        ajc$tjp_18 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getReserved3", "org.mp4parser.boxes.dolby.DoViConfigurationBox", "", "", "", "long"), 142);
        ajc$tjp_19 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setReserved3", "org.mp4parser.boxes.dolby.DoViConfigurationBox", "long", "reserved3", "", "void"), 146);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getDvVersionMinor", "org.mp4parser.boxes.dolby.DoViConfigurationBox", "", "", "", "int"), 78);
        ajc$tjp_20 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getReserved4", "org.mp4parser.boxes.dolby.DoViConfigurationBox", "", "", "", "long"), 150);
        ajc$tjp_21 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setReserved4", "org.mp4parser.boxes.dolby.DoViConfigurationBox", "long", "reserved4", "", "void"), 154);
        ajc$tjp_22 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getReserved5", "org.mp4parser.boxes.dolby.DoViConfigurationBox", "", "", "", "long"), 158);
        ajc$tjp_23 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setReserved5", "org.mp4parser.boxes.dolby.DoViConfigurationBox", "long", "reserved5", "", "void"), Opcodes.IF_ICMPGE);
        ajc$tjp_3 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setDvVersionMinor", "org.mp4parser.boxes.dolby.DoViConfigurationBox", "int", "dvVersionMinor", "", "void"), 82);
        ajc$tjp_4 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getDvProfile", "org.mp4parser.boxes.dolby.DoViConfigurationBox", "", "", "", "int"), 86);
        ajc$tjp_5 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setDvProfile", "org.mp4parser.boxes.dolby.DoViConfigurationBox", "int", "dvProfile", "", "void"), 90);
        ajc$tjp_6 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getDvLevel", "org.mp4parser.boxes.dolby.DoViConfigurationBox", "", "", "", "int"), 94);
        ajc$tjp_7 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setDvLevel", "org.mp4parser.boxes.dolby.DoViConfigurationBox", "int", "dvLevel", "", "void"), 98);
        ajc$tjp_8 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "isRpuPresentFlag", "org.mp4parser.boxes.dolby.DoViConfigurationBox", "", "", "", "boolean"), 102);
        ajc$tjp_9 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setRpuPresentFlag", "org.mp4parser.boxes.dolby.DoViConfigurationBox", "boolean", "rpuPresentFlag", "", "void"), 106);
    }

    @Override // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return 24L;
    }

    public DoViConfigurationBox() {
        super(TYPE);
    }

    @Override // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        IsoTypeWriter.writeUInt8(byteBuffer, this.dvVersionMajor);
        IsoTypeWriter.writeUInt8(byteBuffer, this.dvVersionMinor);
        int i = this.dvProfile;
        IsoTypeWriter.writeUInt16(byteBuffer, ((i & 127) << 9) + ((i & 63) << 3) + (this.rpuPresentFlag ? 4 : 0) + (this.elPresentFlag ? 2 : 0) + (this.blPresentFlag ? 1 : 0));
        IsoTypeWriter.writeUInt32(byteBuffer, this.reserved1);
        IsoTypeWriter.writeUInt32(byteBuffer, this.reserved2);
        IsoTypeWriter.writeUInt32(byteBuffer, this.reserved3);
        IsoTypeWriter.writeUInt32(byteBuffer, this.reserved4);
        IsoTypeWriter.writeUInt32(byteBuffer, this.reserved5);
    }

    @Override // org.mp4parser.support.AbstractBox
    protected void _parseDetails(ByteBuffer byteBuffer) {
        this.dvVersionMajor = IsoTypeReader.readUInt8(byteBuffer);
        this.dvVersionMinor = IsoTypeReader.readUInt8(byteBuffer);
        int readUInt16 = IsoTypeReader.readUInt16(byteBuffer);
        this.dvProfile = (readUInt16 >> 9) & 127;
        this.dvLevel = (readUInt16 >> 3) & 63;
        this.rpuPresentFlag = (readUInt16 & 4) > 0;
        this.elPresentFlag = (readUInt16 & 2) > 0;
        this.blPresentFlag = (readUInt16 & 1) > 0;
        this.reserved1 = IsoTypeReader.readUInt32(byteBuffer);
        this.reserved2 = IsoTypeReader.readUInt32(byteBuffer);
        this.reserved3 = IsoTypeReader.readUInt32(byteBuffer);
        this.reserved4 = IsoTypeReader.readUInt32(byteBuffer);
        this.reserved5 = IsoTypeReader.readUInt32(byteBuffer);
    }

    public int getDvVersionMajor() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_0, this, this));
        return this.dvVersionMajor;
    }

    public void setDvVersionMajor(int i) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_1, this, this, Conversions.intObject(i)));
        this.dvVersionMajor = i;
    }

    public int getDvVersionMinor() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_2, this, this));
        return this.dvVersionMinor;
    }

    public void setDvVersionMinor(int i) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_3, this, this, Conversions.intObject(i)));
        this.dvVersionMinor = i;
    }

    public int getDvProfile() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_4, this, this));
        return this.dvProfile;
    }

    public void setDvProfile(int i) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_5, this, this, Conversions.intObject(i)));
        this.dvProfile = i;
    }

    public int getDvLevel() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_6, this, this));
        return this.dvLevel;
    }

    public void setDvLevel(int i) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_7, this, this, Conversions.intObject(i)));
        this.dvLevel = i;
    }

    public boolean isRpuPresentFlag() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_8, this, this));
        return this.rpuPresentFlag;
    }

    public void setRpuPresentFlag(boolean z) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_9, this, this, Conversions.booleanObject(z)));
        this.rpuPresentFlag = z;
    }

    public boolean isElPresentFlag() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_10, this, this));
        return this.elPresentFlag;
    }

    public void setElPresentFlag(boolean z) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_11, this, this, Conversions.booleanObject(z)));
        this.elPresentFlag = z;
    }

    public boolean isBlPresentFlag() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_12, this, this));
        return this.blPresentFlag;
    }

    public void setBlPresentFlag(boolean z) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_13, this, this, Conversions.booleanObject(z)));
        this.blPresentFlag = z;
    }

    public long getReserved1() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_14, this, this));
        return this.reserved1;
    }

    public void setReserved1(long j) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_15, this, this, Conversions.longObject(j)));
        this.reserved1 = j;
    }

    public long getReserved2() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_16, this, this));
        return this.reserved2;
    }

    public void setReserved2(long j) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_17, this, this, Conversions.longObject(j)));
        this.reserved2 = j;
    }

    public long getReserved3() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_18, this, this));
        return this.reserved3;
    }

    public void setReserved3(long j) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_19, this, this, Conversions.longObject(j)));
        this.reserved3 = j;
    }

    public long getReserved4() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_20, this, this));
        return this.reserved4;
    }

    public void setReserved4(long j) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_21, this, this, Conversions.longObject(j)));
        this.reserved4 = j;
    }

    public long getReserved5() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_22, this, this));
        return this.reserved5;
    }

    public void setReserved5(long j) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_23, this, this, Conversions.longObject(j)));
        this.reserved5 = j;
    }
}
