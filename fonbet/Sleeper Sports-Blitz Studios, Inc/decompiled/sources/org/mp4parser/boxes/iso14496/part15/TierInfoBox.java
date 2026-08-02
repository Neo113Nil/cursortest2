package org.mp4parser.boxes.iso14496.part15;

import io.sentry.rrweb.RRWebVideoEvent;
import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractBox;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;

/* loaded from: classes10.dex */
public class TierInfoBox extends AbstractBox {
    public static final String TYPE = "tiri";
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
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_3;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_4;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_5;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_6;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_7;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_8;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_9;
    int constantFrameRate;
    int discardable;
    int frameRate;
    int levelIndication;
    int profileIndication;
    int profile_compatibility;
    int reserved1;
    int reserved2;
    int tierID;
    int visualHeight;
    int visualWidth;

    static {
        ajc$preClinit();
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("TierInfoBox.java", TierInfoBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getTierID", "org.mp4parser.boxes.iso14496.part15.TierInfoBox", "", "", "", "int"), 69);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setTierID", "org.mp4parser.boxes.iso14496.part15.TierInfoBox", "int", "tierID", "", "void"), 73);
        ajc$tjp_10 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getVisualWidth", "org.mp4parser.boxes.iso14496.part15.TierInfoBox", "", "", "", "int"), 109);
        ajc$tjp_11 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setVisualWidth", "org.mp4parser.boxes.iso14496.part15.TierInfoBox", "int", "visualWidth", "", "void"), 113);
        ajc$tjp_12 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getVisualHeight", "org.mp4parser.boxes.iso14496.part15.TierInfoBox", "", "", "", "int"), 117);
        ajc$tjp_13 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setVisualHeight", "org.mp4parser.boxes.iso14496.part15.TierInfoBox", "int", "visualHeight", "", "void"), 121);
        ajc$tjp_14 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getDiscardable", "org.mp4parser.boxes.iso14496.part15.TierInfoBox", "", "", "", "int"), 125);
        ajc$tjp_15 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setDiscardable", "org.mp4parser.boxes.iso14496.part15.TierInfoBox", "int", "discardable", "", "void"), 129);
        ajc$tjp_16 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getConstantFrameRate", "org.mp4parser.boxes.iso14496.part15.TierInfoBox", "", "", "", "int"), 133);
        ajc$tjp_17 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setConstantFrameRate", "org.mp4parser.boxes.iso14496.part15.TierInfoBox", "int", "constantFrameRate", "", "void"), 137);
        ajc$tjp_18 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getReserved2", "org.mp4parser.boxes.iso14496.part15.TierInfoBox", "", "", "", "int"), 141);
        ajc$tjp_19 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setReserved2", "org.mp4parser.boxes.iso14496.part15.TierInfoBox", "int", "reserved2", "", "void"), 145);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getProfileIndication", "org.mp4parser.boxes.iso14496.part15.TierInfoBox", "", "", "", "int"), 77);
        ajc$tjp_20 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getFrameRate", "org.mp4parser.boxes.iso14496.part15.TierInfoBox", "", "", "", "int"), 149);
        ajc$tjp_21 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setFrameRate", "org.mp4parser.boxes.iso14496.part15.TierInfoBox", "int", RRWebVideoEvent.JsonKeys.FRAME_RATE, "", "void"), 153);
        ajc$tjp_3 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setProfileIndication", "org.mp4parser.boxes.iso14496.part15.TierInfoBox", "int", "profileIndication", "", "void"), 81);
        ajc$tjp_4 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getProfile_compatibility", "org.mp4parser.boxes.iso14496.part15.TierInfoBox", "", "", "", "int"), 85);
        ajc$tjp_5 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setProfile_compatibility", "org.mp4parser.boxes.iso14496.part15.TierInfoBox", "int", "profile_compatibility", "", "void"), 89);
        ajc$tjp_6 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getLevelIndication", "org.mp4parser.boxes.iso14496.part15.TierInfoBox", "", "", "", "int"), 93);
        ajc$tjp_7 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setLevelIndication", "org.mp4parser.boxes.iso14496.part15.TierInfoBox", "int", "levelIndication", "", "void"), 97);
        ajc$tjp_8 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getReserved1", "org.mp4parser.boxes.iso14496.part15.TierInfoBox", "", "", "", "int"), 101);
        ajc$tjp_9 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setReserved1", "org.mp4parser.boxes.iso14496.part15.TierInfoBox", "int", "reserved1", "", "void"), 105);
    }

    @Override // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return 13L;
    }

    public TierInfoBox() {
        super(TYPE);
        this.reserved1 = 0;
        this.reserved2 = 0;
    }

    @Override // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        IsoTypeWriter.writeUInt16(byteBuffer, this.tierID);
        IsoTypeWriter.writeUInt8(byteBuffer, this.profileIndication);
        IsoTypeWriter.writeUInt8(byteBuffer, this.profile_compatibility);
        IsoTypeWriter.writeUInt8(byteBuffer, this.levelIndication);
        IsoTypeWriter.writeUInt8(byteBuffer, this.reserved1);
        IsoTypeWriter.writeUInt16(byteBuffer, this.visualWidth);
        IsoTypeWriter.writeUInt16(byteBuffer, this.visualHeight);
        IsoTypeWriter.writeUInt8(byteBuffer, (this.discardable << 6) + (this.constantFrameRate << 4) + this.reserved2);
        IsoTypeWriter.writeUInt16(byteBuffer, this.frameRate);
    }

    @Override // org.mp4parser.support.AbstractBox
    protected void _parseDetails(ByteBuffer byteBuffer) {
        this.tierID = IsoTypeReader.readUInt16(byteBuffer);
        this.profileIndication = IsoTypeReader.readUInt8(byteBuffer);
        this.profile_compatibility = IsoTypeReader.readUInt8(byteBuffer);
        this.levelIndication = IsoTypeReader.readUInt8(byteBuffer);
        this.reserved1 = IsoTypeReader.readUInt8(byteBuffer);
        this.visualWidth = IsoTypeReader.readUInt16(byteBuffer);
        this.visualHeight = IsoTypeReader.readUInt16(byteBuffer);
        int readUInt8 = IsoTypeReader.readUInt8(byteBuffer);
        this.discardable = (readUInt8 & 192) >> 6;
        this.constantFrameRate = (readUInt8 & 48) >> 4;
        this.reserved2 = readUInt8 & 15;
        this.frameRate = IsoTypeReader.readUInt16(byteBuffer);
    }

    public int getTierID() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_0, this, this));
        return this.tierID;
    }

    public void setTierID(int i) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_1, this, this, Conversions.intObject(i)));
        this.tierID = i;
    }

    public int getProfileIndication() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_2, this, this));
        return this.profileIndication;
    }

    public void setProfileIndication(int i) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_3, this, this, Conversions.intObject(i)));
        this.profileIndication = i;
    }

    public int getProfile_compatibility() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_4, this, this));
        return this.profile_compatibility;
    }

    public void setProfile_compatibility(int i) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_5, this, this, Conversions.intObject(i)));
        this.profile_compatibility = i;
    }

    public int getLevelIndication() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_6, this, this));
        return this.levelIndication;
    }

    public void setLevelIndication(int i) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_7, this, this, Conversions.intObject(i)));
        this.levelIndication = i;
    }

    public int getReserved1() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_8, this, this));
        return this.reserved1;
    }

    public void setReserved1(int i) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_9, this, this, Conversions.intObject(i)));
        this.reserved1 = i;
    }

    public int getVisualWidth() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_10, this, this));
        return this.visualWidth;
    }

    public void setVisualWidth(int i) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_11, this, this, Conversions.intObject(i)));
        this.visualWidth = i;
    }

    public int getVisualHeight() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_12, this, this));
        return this.visualHeight;
    }

    public void setVisualHeight(int i) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_13, this, this, Conversions.intObject(i)));
        this.visualHeight = i;
    }

    public int getDiscardable() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_14, this, this));
        return this.discardable;
    }

    public void setDiscardable(int i) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_15, this, this, Conversions.intObject(i)));
        this.discardable = i;
    }

    public int getConstantFrameRate() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_16, this, this));
        return this.constantFrameRate;
    }

    public void setConstantFrameRate(int i) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_17, this, this, Conversions.intObject(i)));
        this.constantFrameRate = i;
    }

    public int getReserved2() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_18, this, this));
        return this.reserved2;
    }

    public void setReserved2(int i) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_19, this, this, Conversions.intObject(i)));
        this.reserved2 = i;
    }

    public int getFrameRate() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_20, this, this));
        return this.frameRate;
    }

    public void setFrameRate(int i) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_21, this, this, Conversions.intObject(i)));
        this.frameRate = i;
    }
}
