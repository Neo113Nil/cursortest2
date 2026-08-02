package org.mp4parser.boxes.iso14496.part12;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.firebase.perf.util.Constants;
import java.nio.ByteBuffer;
import java.util.Date;
import javazoom.jl.decoder.BitstreamErrors;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.support.Matrix;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.DateHelper;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;
import org.objectweb.asm.Opcodes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* loaded from: classes10.dex */
public class TrackHeaderBox extends AbstractFullBox {
    private static Logger LOG = null;
    public static final String TYPE = "tkhd";
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
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_4;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_5;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_6;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_7;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_8;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_9;
    private int alternateGroup;
    private Date creationTime;
    private long duration;
    private double height;
    private int layer;
    private Matrix matrix;
    private Date modificationTime;
    private long trackId;
    private float volume;
    private double width;

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("TrackHeaderBox.java", TrackHeaderBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getCreationTime", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "", "", "", "java.util.Date"), 62);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setCreationTime", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "java.util.Date", "creationTime", "", "void"), 66);
        ajc$tjp_10 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getAlternateGroup", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "", "", "", "int"), 112);
        ajc$tjp_11 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setAlternateGroup", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "int", "alternateGroup", "", "void"), 116);
        ajc$tjp_12 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getVolume", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "", "", "", "float"), 120);
        ajc$tjp_13 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setVolume", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "float", "volume", "", "void"), 124);
        ajc$tjp_14 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getMatrix", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "", "", "", "org.mp4parser.support.Matrix"), 128);
        ajc$tjp_15 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setMatrix", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "org.mp4parser.support.Matrix", "matrix", "", "void"), 132);
        ajc$tjp_16 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getWidth", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "", "", "", "double"), 136);
        ajc$tjp_17 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setWidth", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "double", "width", "", "void"), 140);
        ajc$tjp_18 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getHeight", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "", "", "", "double"), 144);
        ajc$tjp_19 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setHeight", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "double", "height", "", "void"), 148);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getModificationTime", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "", "", "", "java.util.Date"), 73);
        ajc$tjp_20 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getContent", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "java.nio.ByteBuffer", "byteBuffer", "", "void"), Opcodes.MONITOREXIT);
        ajc$tjp_21 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", InAppPurchaseConstants.METHOD_TO_STRING, "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "", "", "", "java.lang.String"), 223);
        ajc$tjp_22 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", Constants.ENABLE_DISABLE, "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "", "", "", "boolean"), 249);
        ajc$tjp_23 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setEnabled", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "boolean", "enabled", "", "void"), 253);
        ajc$tjp_24 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "isInMovie", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "", "", "", "boolean"), BitstreamErrors.INVALIDFRAME);
        ajc$tjp_25 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setInMovie", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "boolean", "inMovie", "", "void"), 265);
        ajc$tjp_26 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "isInPreview", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "", "", "", "boolean"), 273);
        ajc$tjp_27 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setInPreview", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "boolean", "inPreview", "", "void"), 277);
        ajc$tjp_28 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "isInPoster", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "", "", "", "boolean"), 285);
        ajc$tjp_29 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setInPoster", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "boolean", "inPoster", "", "void"), 289);
        ajc$tjp_3 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setModificationTime", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "java.util.Date", "modificationTime", "", "void"), 77);
        ajc$tjp_4 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getTrackId", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "", "", "", "long"), 85);
        ajc$tjp_5 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setTrackId", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "long", "trackId", "", "void"), 89);
        ajc$tjp_6 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getDuration", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "", "", "", "long"), 93);
        ajc$tjp_7 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setDuration", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "long", "duration", "", "void"), 97);
        ajc$tjp_8 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getLayer", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "", "", "", "int"), 104);
        ajc$tjp_9 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setLayer", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "int", "layer", "", "void"), 108);
    }

    static {
        ajc$preClinit();
        LOG = LoggerFactory.getLogger((Class<?>) TrackHeaderBox.class);
    }

    public TrackHeaderBox() {
        super(TYPE);
        this.creationTime = new Date(0L);
        this.modificationTime = new Date(0L);
        this.matrix = Matrix.ROTATE_0;
    }

    public Date getCreationTime() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_0, this, this));
        return this.creationTime;
    }

    public void setCreationTime(Date date) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_1, this, this, date));
        this.creationTime = date;
        if (DateHelper.convert(date) >= 4294967296L) {
            setVersion(1);
        }
    }

    public Date getModificationTime() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_2, this, this));
        return this.modificationTime;
    }

    public void setModificationTime(Date date) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_3, this, this, date));
        this.modificationTime = date;
        if (DateHelper.convert(date) >= 4294967296L) {
            setVersion(1);
        }
    }

    public long getTrackId() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_4, this, this));
        return this.trackId;
    }

    public void setTrackId(long j) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_5, this, this, Conversions.longObject(j)));
        this.trackId = j;
    }

    public long getDuration() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_6, this, this));
        return this.duration;
    }

    public void setDuration(long j) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_7, this, this, Conversions.longObject(j)));
        this.duration = j;
        if (j >= 4294967296L) {
            setFlags(1);
        }
    }

    public int getLayer() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_8, this, this));
        return this.layer;
    }

    public void setLayer(int i) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_9, this, this, Conversions.intObject(i)));
        this.layer = i;
    }

    public int getAlternateGroup() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_10, this, this));
        return this.alternateGroup;
    }

    public void setAlternateGroup(int i) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_11, this, this, Conversions.intObject(i)));
        this.alternateGroup = i;
    }

    public float getVolume() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_12, this, this));
        return this.volume;
    }

    public void setVolume(float f) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_13, this, this, Conversions.floatObject(f)));
        this.volume = f;
    }

    public Matrix getMatrix() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_14, this, this));
        return this.matrix;
    }

    public void setMatrix(Matrix matrix) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_15, this, this, matrix));
        this.matrix = matrix;
    }

    public double getWidth() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_16, this, this));
        return this.width;
    }

    public void setWidth(double d) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_17, this, this, Conversions.doubleObject(d)));
        this.width = d;
    }

    public double getHeight() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_18, this, this));
        return this.height;
    }

    public void setHeight(double d) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_19, this, this, Conversions.doubleObject(d)));
        this.height = d;
    }

    @Override // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return (getVersion() == 1 ? 36L : 24L) + 60;
    }

    @Override // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        if (getVersion() == 1) {
            this.creationTime = DateHelper.convert(IsoTypeReader.readUInt64(byteBuffer));
            this.modificationTime = DateHelper.convert(IsoTypeReader.readUInt64(byteBuffer));
            this.trackId = IsoTypeReader.readUInt32(byteBuffer);
            IsoTypeReader.readUInt32(byteBuffer);
            this.duration = byteBuffer.getLong();
        } else {
            this.creationTime = DateHelper.convert(IsoTypeReader.readUInt32(byteBuffer));
            this.modificationTime = DateHelper.convert(IsoTypeReader.readUInt32(byteBuffer));
            this.trackId = IsoTypeReader.readUInt32(byteBuffer);
            IsoTypeReader.readUInt32(byteBuffer);
            this.duration = byteBuffer.getInt();
        }
        if (this.duration < -1) {
            LOG.warn("tkhd duration is not in expected range");
        }
        IsoTypeReader.readUInt32(byteBuffer);
        IsoTypeReader.readUInt32(byteBuffer);
        this.layer = IsoTypeReader.readUInt16(byteBuffer);
        this.alternateGroup = IsoTypeReader.readUInt16(byteBuffer);
        this.volume = IsoTypeReader.readFixedPoint88(byteBuffer);
        IsoTypeReader.readUInt16(byteBuffer);
        this.matrix = Matrix.fromByteBuffer(byteBuffer);
        this.width = IsoTypeReader.readFixedPoint1616(byteBuffer);
        this.height = IsoTypeReader.readFixedPoint1616(byteBuffer);
    }

    @Override // org.mp4parser.support.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_20, this, this, byteBuffer));
        writeVersionAndFlags(byteBuffer);
        if (getVersion() == 1) {
            IsoTypeWriter.writeUInt64(byteBuffer, DateHelper.convert(this.creationTime));
            IsoTypeWriter.writeUInt64(byteBuffer, DateHelper.convert(this.modificationTime));
            IsoTypeWriter.writeUInt32(byteBuffer, this.trackId);
            IsoTypeWriter.writeUInt32(byteBuffer, 0L);
            byteBuffer.putLong(this.duration);
        } else {
            IsoTypeWriter.writeUInt32(byteBuffer, DateHelper.convert(this.creationTime));
            IsoTypeWriter.writeUInt32(byteBuffer, DateHelper.convert(this.modificationTime));
            IsoTypeWriter.writeUInt32(byteBuffer, this.trackId);
            IsoTypeWriter.writeUInt32(byteBuffer, 0L);
            byteBuffer.putInt((int) this.duration);
        }
        IsoTypeWriter.writeUInt32(byteBuffer, 0L);
        IsoTypeWriter.writeUInt32(byteBuffer, 0L);
        IsoTypeWriter.writeUInt16(byteBuffer, this.layer);
        IsoTypeWriter.writeUInt16(byteBuffer, this.alternateGroup);
        IsoTypeWriter.writeFixedPoint88(byteBuffer, this.volume);
        IsoTypeWriter.writeUInt16(byteBuffer, 0);
        this.matrix.getContent(byteBuffer);
        IsoTypeWriter.writeFixedPoint1616(byteBuffer, this.width);
        IsoTypeWriter.writeFixedPoint1616(byteBuffer, this.height);
    }

    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_21, this, this));
        return "TrackHeaderBox[creationTime=" + getCreationTime() + ";modificationTime=" + getModificationTime() + ";trackId=" + getTrackId() + ";duration=" + getDuration() + ";layer=" + getLayer() + ";alternateGroup=" + getAlternateGroup() + ";volume=" + getVolume() + ";matrix=" + this.matrix + ";width=" + getWidth() + ";height=" + getHeight() + "]";
    }

    public boolean isEnabled() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_22, this, this));
        return (getFlags() & 1) > 0;
    }

    public void setEnabled(boolean z) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_23, this, this, Conversions.booleanObject(z)));
        if (z) {
            setFlags(getFlags() | 1);
        } else {
            setFlags(getFlags() & (-2));
        }
    }

    public boolean isInMovie() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_24, this, this));
        return (getFlags() & 2) > 0;
    }

    public void setInMovie(boolean z) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_25, this, this, Conversions.booleanObject(z)));
        if (z) {
            setFlags(getFlags() | 2);
        } else {
            setFlags(getFlags() & (-3));
        }
    }

    public boolean isInPreview() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_26, this, this));
        return (getFlags() & 4) > 0;
    }

    public void setInPreview(boolean z) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_27, this, this, Conversions.booleanObject(z)));
        if (z) {
            setFlags(getFlags() | 4);
        } else {
            setFlags(getFlags() & (-5));
        }
    }

    public boolean isInPoster() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_28, this, this));
        return (getFlags() & 8) > 0;
    }

    public void setInPoster(boolean z) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_29, this, this, Conversions.booleanObject(z)));
        if (z) {
            setFlags(getFlags() | 8);
        } else {
            setFlags(getFlags() & (-9));
        }
    }
}
