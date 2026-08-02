package org.mp4parser.boxes.dolby;

import androidx.media3.datasource.cache.CacheDataSink;
import com.google.mlkit.common.MlKitException;
import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.boxes.iso14496.part1.objectdescriptors.BitReaderBuffer;
import org.mp4parser.boxes.iso14496.part1.objectdescriptors.BitWriterBuffer;
import org.mp4parser.support.AbstractBox;
import org.mp4parser.support.DoNotParseDetail;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;
import org.objectweb.asm.Opcodes;

/* loaded from: classes10.dex */
public class DTSSpecificBox extends AbstractBox {
    public static final String TYPE = "ddts";
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
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_28;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_29;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_3;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_30;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_31;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_4;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_5;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_6;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_7;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_8;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_9;
    long DTSSamplingFrequency;
    int LBRDurationMod;
    long avgBitRate;
    int channelLayout;
    int coreLFEPresent;
    int coreLayout;
    int coreSize;
    int frameDuration;
    long maxBitRate;
    int multiAssetFlag;
    int pcmSampleDepth;
    int representationType;
    int reserved;
    int reservedBoxPresent;
    int stereoDownmix;
    int streamConstruction;

    static {
        ajc$preClinit();
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("DTSSpecificBox.java", DTSSpecificBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getAvgBitRate", "org.mp4parser.boxes.dolby.DTSSpecificBox", "", "", "", "long"), 89);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setAvgBitRate", "org.mp4parser.boxes.dolby.DTSSpecificBox", "long", "avgBitRate", "", "void"), 93);
        ajc$tjp_10 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getStreamConstruction", "org.mp4parser.boxes.dolby.DTSSpecificBox", "", "", "", "int"), 129);
        ajc$tjp_11 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setStreamConstruction", "org.mp4parser.boxes.dolby.DTSSpecificBox", "int", "streamConstruction", "", "void"), 133);
        ajc$tjp_12 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getCoreLFEPresent", "org.mp4parser.boxes.dolby.DTSSpecificBox", "", "", "", "int"), 137);
        ajc$tjp_13 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setCoreLFEPresent", "org.mp4parser.boxes.dolby.DTSSpecificBox", "int", "coreLFEPresent", "", "void"), 141);
        ajc$tjp_14 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getCoreLayout", "org.mp4parser.boxes.dolby.DTSSpecificBox", "", "", "", "int"), 145);
        ajc$tjp_15 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setCoreLayout", "org.mp4parser.boxes.dolby.DTSSpecificBox", "int", "coreLayout", "", "void"), 149);
        ajc$tjp_16 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getCoreSize", "org.mp4parser.boxes.dolby.DTSSpecificBox", "", "", "", "int"), 153);
        ajc$tjp_17 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setCoreSize", "org.mp4parser.boxes.dolby.DTSSpecificBox", "int", "coreSize", "", "void"), 157);
        ajc$tjp_18 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getStereoDownmix", "org.mp4parser.boxes.dolby.DTSSpecificBox", "", "", "", "int"), 161);
        ajc$tjp_19 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setStereoDownmix", "org.mp4parser.boxes.dolby.DTSSpecificBox", "int", "stereoDownmix", "", "void"), Opcodes.IF_ACMPEQ);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getDTSSamplingFrequency", "org.mp4parser.boxes.dolby.DTSSpecificBox", "", "", "", "long"), 97);
        ajc$tjp_20 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getRepresentationType", "org.mp4parser.boxes.dolby.DTSSpecificBox", "", "", "", "int"), Opcodes.RET);
        ajc$tjp_21 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setRepresentationType", "org.mp4parser.boxes.dolby.DTSSpecificBox", "int", "representationType", "", "void"), Opcodes.LRETURN);
        ajc$tjp_22 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getChannelLayout", "org.mp4parser.boxes.dolby.DTSSpecificBox", "", "", "", "int"), Opcodes.RETURN);
        ajc$tjp_23 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setChannelLayout", "org.mp4parser.boxes.dolby.DTSSpecificBox", "int", "channelLayout", "", "void"), Opcodes.PUTFIELD);
        ajc$tjp_24 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getMultiAssetFlag", "org.mp4parser.boxes.dolby.DTSSpecificBox", "", "", "", "int"), Opcodes.INVOKEINTERFACE);
        ajc$tjp_25 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setMultiAssetFlag", "org.mp4parser.boxes.dolby.DTSSpecificBox", "int", "multiAssetFlag", "", "void"), 189);
        ajc$tjp_26 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getLBRDurationMod", "org.mp4parser.boxes.dolby.DTSSpecificBox", "", "", "", "int"), Opcodes.INSTANCEOF);
        ajc$tjp_27 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setLBRDurationMod", "org.mp4parser.boxes.dolby.DTSSpecificBox", "int", "LBRDurationMod", "", "void"), Opcodes.MULTIANEWARRAY);
        ajc$tjp_28 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getReserved", "org.mp4parser.boxes.dolby.DTSSpecificBox", "", "", "", "int"), 201);
        ajc$tjp_29 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setReserved", "org.mp4parser.boxes.dolby.DTSSpecificBox", "int", "reserved", "", "void"), MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR);
        ajc$tjp_3 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setDTSSamplingFrequency", "org.mp4parser.boxes.dolby.DTSSpecificBox", "long", "DTSSamplingFrequency", "", "void"), 101);
        ajc$tjp_30 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getReservedBoxPresent", "org.mp4parser.boxes.dolby.DTSSpecificBox", "", "", "", "int"), 209);
        ajc$tjp_31 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setReservedBoxPresent", "org.mp4parser.boxes.dolby.DTSSpecificBox", "int", "reservedBoxPresent", "", "void"), 213);
        ajc$tjp_4 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getMaxBitRate", "org.mp4parser.boxes.dolby.DTSSpecificBox", "", "", "", "long"), 105);
        ajc$tjp_5 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setMaxBitRate", "org.mp4parser.boxes.dolby.DTSSpecificBox", "long", "maxBitRate", "", "void"), 109);
        ajc$tjp_6 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getPcmSampleDepth", "org.mp4parser.boxes.dolby.DTSSpecificBox", "", "", "", "int"), 113);
        ajc$tjp_7 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setPcmSampleDepth", "org.mp4parser.boxes.dolby.DTSSpecificBox", "int", "pcmSampleDepth", "", "void"), 117);
        ajc$tjp_8 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getFrameDuration", "org.mp4parser.boxes.dolby.DTSSpecificBox", "", "", "", "int"), 121);
        ajc$tjp_9 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setFrameDuration", "org.mp4parser.boxes.dolby.DTSSpecificBox", "int", "frameDuration", "", "void"), 125);
    }

    @Override // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return 20L;
    }

    public DTSSpecificBox() {
        super(TYPE);
    }

    @Override // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        this.DTSSamplingFrequency = IsoTypeReader.readUInt32(byteBuffer);
        this.maxBitRate = IsoTypeReader.readUInt32(byteBuffer);
        this.avgBitRate = IsoTypeReader.readUInt32(byteBuffer);
        this.pcmSampleDepth = IsoTypeReader.readUInt8(byteBuffer);
        BitReaderBuffer bitReaderBuffer = new BitReaderBuffer(byteBuffer);
        this.frameDuration = bitReaderBuffer.readBits(2);
        this.streamConstruction = bitReaderBuffer.readBits(5);
        this.coreLFEPresent = bitReaderBuffer.readBits(1);
        this.coreLayout = bitReaderBuffer.readBits(6);
        this.coreSize = bitReaderBuffer.readBits(14);
        this.stereoDownmix = bitReaderBuffer.readBits(1);
        this.representationType = bitReaderBuffer.readBits(3);
        this.channelLayout = bitReaderBuffer.readBits(16);
        this.multiAssetFlag = bitReaderBuffer.readBits(1);
        this.LBRDurationMod = bitReaderBuffer.readBits(1);
        this.reservedBoxPresent = bitReaderBuffer.readBits(1);
        this.reserved = bitReaderBuffer.readBits(5);
    }

    @Override // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        IsoTypeWriter.writeUInt32(byteBuffer, this.DTSSamplingFrequency);
        IsoTypeWriter.writeUInt32(byteBuffer, this.maxBitRate);
        IsoTypeWriter.writeUInt32(byteBuffer, this.avgBitRate);
        IsoTypeWriter.writeUInt8(byteBuffer, this.pcmSampleDepth);
        BitWriterBuffer bitWriterBuffer = new BitWriterBuffer(byteBuffer);
        bitWriterBuffer.writeBits(this.frameDuration, 2);
        bitWriterBuffer.writeBits(this.streamConstruction, 5);
        bitWriterBuffer.writeBits(this.coreLFEPresent, 1);
        bitWriterBuffer.writeBits(this.coreLayout, 6);
        bitWriterBuffer.writeBits(this.coreSize, 14);
        bitWriterBuffer.writeBits(this.stereoDownmix, 1);
        bitWriterBuffer.writeBits(this.representationType, 3);
        bitWriterBuffer.writeBits(this.channelLayout, 16);
        bitWriterBuffer.writeBits(this.multiAssetFlag, 1);
        bitWriterBuffer.writeBits(this.LBRDurationMod, 1);
        bitWriterBuffer.writeBits(this.reservedBoxPresent, 1);
        bitWriterBuffer.writeBits(this.reserved, 5);
    }

    public long getAvgBitRate() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_0, this, this));
        return this.avgBitRate;
    }

    public void setAvgBitRate(long j) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_1, this, this, Conversions.longObject(j)));
        this.avgBitRate = j;
    }

    public long getDTSSamplingFrequency() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_2, this, this));
        return this.DTSSamplingFrequency;
    }

    public void setDTSSamplingFrequency(long j) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_3, this, this, Conversions.longObject(j)));
        this.DTSSamplingFrequency = j;
    }

    public long getMaxBitRate() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_4, this, this));
        return this.maxBitRate;
    }

    public void setMaxBitRate(long j) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_5, this, this, Conversions.longObject(j)));
        this.maxBitRate = j;
    }

    public int getPcmSampleDepth() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_6, this, this));
        return this.pcmSampleDepth;
    }

    public void setPcmSampleDepth(int i) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_7, this, this, Conversions.intObject(i)));
        this.pcmSampleDepth = i;
    }

    public int getFrameDuration() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_8, this, this));
        return this.frameDuration;
    }

    public void setFrameDuration(int i) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_9, this, this, Conversions.intObject(i)));
        this.frameDuration = i;
    }

    public int getStreamConstruction() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_10, this, this));
        return this.streamConstruction;
    }

    public void setStreamConstruction(int i) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_11, this, this, Conversions.intObject(i)));
        this.streamConstruction = i;
    }

    public int getCoreLFEPresent() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_12, this, this));
        return this.coreLFEPresent;
    }

    public void setCoreLFEPresent(int i) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_13, this, this, Conversions.intObject(i)));
        this.coreLFEPresent = i;
    }

    public int getCoreLayout() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_14, this, this));
        return this.coreLayout;
    }

    public void setCoreLayout(int i) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_15, this, this, Conversions.intObject(i)));
        this.coreLayout = i;
    }

    public int getCoreSize() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_16, this, this));
        return this.coreSize;
    }

    public void setCoreSize(int i) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_17, this, this, Conversions.intObject(i)));
        this.coreSize = i;
    }

    public int getStereoDownmix() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_18, this, this));
        return this.stereoDownmix;
    }

    public void setStereoDownmix(int i) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_19, this, this, Conversions.intObject(i)));
        this.stereoDownmix = i;
    }

    public int getRepresentationType() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_20, this, this));
        return this.representationType;
    }

    public void setRepresentationType(int i) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_21, this, this, Conversions.intObject(i)));
        this.representationType = i;
    }

    public int getChannelLayout() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_22, this, this));
        return this.channelLayout;
    }

    public void setChannelLayout(int i) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_23, this, this, Conversions.intObject(i)));
        this.channelLayout = i;
    }

    public int getMultiAssetFlag() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_24, this, this));
        return this.multiAssetFlag;
    }

    public void setMultiAssetFlag(int i) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_25, this, this, Conversions.intObject(i)));
        this.multiAssetFlag = i;
    }

    public int getLBRDurationMod() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_26, this, this));
        return this.LBRDurationMod;
    }

    public void setLBRDurationMod(int i) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_27, this, this, Conversions.intObject(i)));
        this.LBRDurationMod = i;
    }

    public int getReserved() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_28, this, this));
        return this.reserved;
    }

    public void setReserved(int i) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_29, this, this, Conversions.intObject(i)));
        this.reserved = i;
    }

    public int getReservedBoxPresent() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_30, this, this));
        return this.reservedBoxPresent;
    }

    public void setReservedBoxPresent(int i) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_31, this, this, Conversions.intObject(i)));
        this.reservedBoxPresent = i;
    }

    @DoNotParseDetail
    public int[] getDashAudioChannelConfiguration() {
        int i;
        int channelLayout = getChannelLayout();
        int i2 = 1;
        if ((channelLayout & 1) == 1) {
            i = 4;
        } else {
            i2 = 0;
            i = 0;
        }
        if ((channelLayout & 2) == 2) {
            i2 += 2;
            i |= 3;
        }
        if ((channelLayout & 4) == 4) {
            i2 += 2;
            i |= 48;
        }
        if ((channelLayout & 8) == 8) {
            i2++;
            i |= 8;
        }
        if ((channelLayout & 16) == 16) {
            i2++;
            i |= 256;
        }
        if ((channelLayout & 32) == 32) {
            i2 += 2;
            i |= CacheDataSink.DEFAULT_BUFFER_SIZE;
        }
        if ((channelLayout & 64) == 64) {
            i2 += 2;
            i |= 48;
        }
        if ((channelLayout & 128) == 128) {
            i2++;
            i |= 8192;
        }
        if ((channelLayout & 256) == 256) {
            i2++;
            i |= 2048;
        }
        if ((channelLayout & 512) == 512) {
            i2 += 2;
            i |= 192;
        }
        if ((channelLayout & 1024) == 1024) {
            i2 += 2;
            i |= 1536;
        }
        if ((channelLayout & 2048) == 2048) {
            i2 += 2;
            i |= 48;
        }
        if ((channelLayout & 4096) == 4096) {
            i2++;
            i |= 8;
        }
        if ((channelLayout & 8192) == 8192) {
            i2 += 2;
            i |= 48;
        }
        if ((channelLayout & 16384) == 16384) {
            i2++;
            i |= 65536;
        }
        if ((channelLayout & 32768) == 32768) {
            i2 += 2;
            i |= 163840;
        }
        if ((channelLayout & 65536) == 65536) {
            i2++;
        }
        if ((channelLayout & 131072) == 131072) {
            i2 += 2;
        }
        return new int[]{i2, i};
    }
}
