package org.mp4parser.boxes.apple;

import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;

/* loaded from: classes10.dex */
public final class AppleLosslessSpecificBox extends AbstractFullBox {
    public static final String TYPE = "alac";
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
    private long bitRate;
    private int channels;
    private int historyMult;
    private int initialHistory;
    private int kModifier;
    private long maxCodedFrameSize;
    private long maxSamplePerFrame;
    private long sampleRate;
    private int sampleSize;
    private int unknown1;
    private int unknown2;

    static {
        ajc$preClinit();
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("AppleLosslessSpecificBox.java", AppleLosslessSpecificBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getMaxSamplePerFrame", "org.mp4parser.boxes.apple.AppleLosslessSpecificBox", "", "", "", "long"), 38);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setMaxSamplePerFrame", "org.mp4parser.boxes.apple.AppleLosslessSpecificBox", "int", "maxSamplePerFrame", "", "void"), 42);
        ajc$tjp_10 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getKModifier", "org.mp4parser.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"), 78);
        ajc$tjp_11 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setKModifier", "org.mp4parser.boxes.apple.AppleLosslessSpecificBox", "int", "kModifier", "", "void"), 82);
        ajc$tjp_12 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getChannels", "org.mp4parser.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"), 86);
        ajc$tjp_13 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setChannels", "org.mp4parser.boxes.apple.AppleLosslessSpecificBox", "int", "channels", "", "void"), 90);
        ajc$tjp_14 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getUnknown2", "org.mp4parser.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"), 94);
        ajc$tjp_15 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setUnknown2", "org.mp4parser.boxes.apple.AppleLosslessSpecificBox", "int", "unknown2", "", "void"), 98);
        ajc$tjp_16 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getMaxCodedFrameSize", "org.mp4parser.boxes.apple.AppleLosslessSpecificBox", "", "", "", "long"), 102);
        ajc$tjp_17 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setMaxCodedFrameSize", "org.mp4parser.boxes.apple.AppleLosslessSpecificBox", "int", "maxCodedFrameSize", "", "void"), 106);
        ajc$tjp_18 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getBitRate", "org.mp4parser.boxes.apple.AppleLosslessSpecificBox", "", "", "", "long"), 110);
        ajc$tjp_19 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setBitRate", "org.mp4parser.boxes.apple.AppleLosslessSpecificBox", "int", "bitRate", "", "void"), 114);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getUnknown1", "org.mp4parser.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"), 46);
        ajc$tjp_20 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getSampleRate", "org.mp4parser.boxes.apple.AppleLosslessSpecificBox", "", "", "", "long"), 118);
        ajc$tjp_21 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setSampleRate", "org.mp4parser.boxes.apple.AppleLosslessSpecificBox", "int", "sampleRate", "", "void"), 122);
        ajc$tjp_3 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setUnknown1", "org.mp4parser.boxes.apple.AppleLosslessSpecificBox", "int", "unknown1", "", "void"), 50);
        ajc$tjp_4 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getSampleSize", "org.mp4parser.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"), 54);
        ajc$tjp_5 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setSampleSize", "org.mp4parser.boxes.apple.AppleLosslessSpecificBox", "int", "sampleSize", "", "void"), 58);
        ajc$tjp_6 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getHistoryMult", "org.mp4parser.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"), 62);
        ajc$tjp_7 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setHistoryMult", "org.mp4parser.boxes.apple.AppleLosslessSpecificBox", "int", "historyMult", "", "void"), 66);
        ajc$tjp_8 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getInitialHistory", "org.mp4parser.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"), 70);
        ajc$tjp_9 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setInitialHistory", "org.mp4parser.boxes.apple.AppleLosslessSpecificBox", "int", "initialHistory", "", "void"), 74);
    }

    @Override // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return 28L;
    }

    public AppleLosslessSpecificBox() {
        super("alac");
    }

    public long getMaxSamplePerFrame() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_0, this, this));
        return this.maxSamplePerFrame;
    }

    public void setMaxSamplePerFrame(int i) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_1, this, this, Conversions.intObject(i)));
        this.maxSamplePerFrame = i;
    }

    public int getUnknown1() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_2, this, this));
        return this.unknown1;
    }

    public void setUnknown1(int i) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_3, this, this, Conversions.intObject(i)));
        this.unknown1 = i;
    }

    public int getSampleSize() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_4, this, this));
        return this.sampleSize;
    }

    public void setSampleSize(int i) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_5, this, this, Conversions.intObject(i)));
        this.sampleSize = i;
    }

    public int getHistoryMult() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_6, this, this));
        return this.historyMult;
    }

    public void setHistoryMult(int i) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_7, this, this, Conversions.intObject(i)));
        this.historyMult = i;
    }

    public int getInitialHistory() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_8, this, this));
        return this.initialHistory;
    }

    public void setInitialHistory(int i) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_9, this, this, Conversions.intObject(i)));
        this.initialHistory = i;
    }

    public int getKModifier() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_10, this, this));
        return this.kModifier;
    }

    public void setKModifier(int i) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_11, this, this, Conversions.intObject(i)));
        this.kModifier = i;
    }

    public int getChannels() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_12, this, this));
        return this.channels;
    }

    public void setChannels(int i) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_13, this, this, Conversions.intObject(i)));
        this.channels = i;
    }

    public int getUnknown2() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_14, this, this));
        return this.unknown2;
    }

    public void setUnknown2(int i) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_15, this, this, Conversions.intObject(i)));
        this.unknown2 = i;
    }

    public long getMaxCodedFrameSize() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_16, this, this));
        return this.maxCodedFrameSize;
    }

    public void setMaxCodedFrameSize(int i) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_17, this, this, Conversions.intObject(i)));
        this.maxCodedFrameSize = i;
    }

    public long getBitRate() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_18, this, this));
        return this.bitRate;
    }

    public void setBitRate(int i) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_19, this, this, Conversions.intObject(i)));
        this.bitRate = i;
    }

    public long getSampleRate() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_20, this, this));
        return this.sampleRate;
    }

    public void setSampleRate(int i) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_21, this, this, Conversions.intObject(i)));
        this.sampleRate = i;
    }

    @Override // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.maxSamplePerFrame = IsoTypeReader.readUInt32(byteBuffer);
        this.unknown1 = IsoTypeReader.readUInt8(byteBuffer);
        this.sampleSize = IsoTypeReader.readUInt8(byteBuffer);
        this.historyMult = IsoTypeReader.readUInt8(byteBuffer);
        this.initialHistory = IsoTypeReader.readUInt8(byteBuffer);
        this.kModifier = IsoTypeReader.readUInt8(byteBuffer);
        this.channels = IsoTypeReader.readUInt8(byteBuffer);
        this.unknown2 = IsoTypeReader.readUInt16(byteBuffer);
        this.maxCodedFrameSize = IsoTypeReader.readUInt32(byteBuffer);
        this.bitRate = IsoTypeReader.readUInt32(byteBuffer);
        this.sampleRate = IsoTypeReader.readUInt32(byteBuffer);
    }

    @Override // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.writeUInt32(byteBuffer, this.maxSamplePerFrame);
        IsoTypeWriter.writeUInt8(byteBuffer, this.unknown1);
        IsoTypeWriter.writeUInt8(byteBuffer, this.sampleSize);
        IsoTypeWriter.writeUInt8(byteBuffer, this.historyMult);
        IsoTypeWriter.writeUInt8(byteBuffer, this.initialHistory);
        IsoTypeWriter.writeUInt8(byteBuffer, this.kModifier);
        IsoTypeWriter.writeUInt8(byteBuffer, this.channels);
        IsoTypeWriter.writeUInt16(byteBuffer, this.unknown2);
        IsoTypeWriter.writeUInt32(byteBuffer, this.maxCodedFrameSize);
        IsoTypeWriter.writeUInt32(byteBuffer, this.bitRate);
        IsoTypeWriter.writeUInt32(byteBuffer, this.sampleRate);
    }
}
