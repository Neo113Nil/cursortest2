package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractFullBox;
import com.ironsource.X3;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.nio.ByteBuffer;
import java.util.Date;
import xsna.aqw;
import xsna.cn10;
import xsna.crx0;
import xsna.n0y;
import xsna.o0y;
import xsna.q100;
import xsna.w8g0;
import xsna.whq;
import xsna.x19;

/* loaded from: classes12.dex */
public class TrackHeaderBox extends AbstractFullBox {
    private static q100 LOG = null;
    public static final String TYPE = "tkhd";
    private static final /* synthetic */ n0y ajc$tjp_0 = null;
    private static final /* synthetic */ n0y ajc$tjp_1 = null;
    private static final /* synthetic */ n0y ajc$tjp_10 = null;
    private static final /* synthetic */ n0y ajc$tjp_11 = null;
    private static final /* synthetic */ n0y ajc$tjp_12 = null;
    private static final /* synthetic */ n0y ajc$tjp_13 = null;
    private static final /* synthetic */ n0y ajc$tjp_14 = null;
    private static final /* synthetic */ n0y ajc$tjp_15 = null;
    private static final /* synthetic */ n0y ajc$tjp_16 = null;
    private static final /* synthetic */ n0y ajc$tjp_17 = null;
    private static final /* synthetic */ n0y ajc$tjp_18 = null;
    private static final /* synthetic */ n0y ajc$tjp_19 = null;
    private static final /* synthetic */ n0y ajc$tjp_2 = null;
    private static final /* synthetic */ n0y ajc$tjp_20 = null;
    private static final /* synthetic */ n0y ajc$tjp_21 = null;
    private static final /* synthetic */ n0y ajc$tjp_22 = null;
    private static final /* synthetic */ n0y ajc$tjp_23 = null;
    private static final /* synthetic */ n0y ajc$tjp_24 = null;
    private static final /* synthetic */ n0y ajc$tjp_25 = null;
    private static final /* synthetic */ n0y ajc$tjp_26 = null;
    private static final /* synthetic */ n0y ajc$tjp_27 = null;
    private static final /* synthetic */ n0y ajc$tjp_28 = null;
    private static final /* synthetic */ n0y ajc$tjp_29 = null;
    private static final /* synthetic */ n0y ajc$tjp_3 = null;
    private static final /* synthetic */ n0y ajc$tjp_4 = null;
    private static final /* synthetic */ n0y ajc$tjp_5 = null;
    private static final /* synthetic */ n0y ajc$tjp_6 = null;
    private static final /* synthetic */ n0y ajc$tjp_7 = null;
    private static final /* synthetic */ n0y ajc$tjp_8 = null;
    private static final /* synthetic */ n0y ajc$tjp_9 = null;
    private int alternateGroup;
    private Date creationTime;
    private long duration;
    private double height;
    private int layer;
    private cn10 matrix;
    private Date modificationTime;
    private long trackId;
    private float volume;
    private double width;

    static {
        ajc$preClinit();
        LOG = q100.a(TrackHeaderBox.class);
    }

    public TrackHeaderBox() {
        super(TYPE);
        this.creationTime = new Date(0L);
        this.modificationTime = new Date(0L);
        this.matrix = cn10.j;
    }

    private static /* synthetic */ void ajc$preClinit() {
        whq whqVar = new whq("TrackHeaderBox.java", TrackHeaderBox.class);
        ajc$tjp_0 = whqVar.f(whqVar.e("getCreationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "java.util.Date"));
        ajc$tjp_1 = whqVar.f(whqVar.e("getModificationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "java.util.Date"));
        ajc$tjp_10 = whqVar.f(whqVar.e("getContent", "com.coremedia.iso.boxes.TrackHeaderBox", "java.nio.ByteBuffer", "byteBuffer", "", "void"));
        ajc$tjp_11 = whqVar.f(whqVar.e("toString", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "java.lang.String"));
        ajc$tjp_12 = whqVar.f(whqVar.e("setCreationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "java.util.Date", "creationTime", "", "void"));
        ajc$tjp_13 = whqVar.f(whqVar.e("setModificationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "java.util.Date", "modificationTime", "", "void"));
        ajc$tjp_14 = whqVar.f(whqVar.e("setTrackId", "com.coremedia.iso.boxes.TrackHeaderBox", "long", "trackId", "", "void"));
        ajc$tjp_15 = whqVar.f(whqVar.e("setDuration", "com.coremedia.iso.boxes.TrackHeaderBox", "long", "duration", "", "void"));
        ajc$tjp_16 = whqVar.f(whqVar.e("setLayer", "com.coremedia.iso.boxes.TrackHeaderBox", "int", AdRevenueConstants.LAYER_KEY, "", "void"));
        ajc$tjp_17 = whqVar.f(whqVar.e("setAlternateGroup", "com.coremedia.iso.boxes.TrackHeaderBox", "int", "alternateGroup", "", "void"));
        ajc$tjp_18 = whqVar.f(whqVar.e("setVolume", "com.coremedia.iso.boxes.TrackHeaderBox", "float", "volume", "", "void"));
        ajc$tjp_19 = whqVar.f(whqVar.e("setMatrix", "com.coremedia.iso.boxes.TrackHeaderBox", "com.googlecode.mp4parser.util.Matrix", "matrix", "", "void"));
        ajc$tjp_2 = whqVar.f(whqVar.e("getTrackId", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "long"));
        ajc$tjp_20 = whqVar.f(whqVar.e("setWidth", "com.coremedia.iso.boxes.TrackHeaderBox", "double", "width", "", "void"));
        ajc$tjp_21 = whqVar.f(whqVar.e("setHeight", "com.coremedia.iso.boxes.TrackHeaderBox", "double", "height", "", "void"));
        ajc$tjp_22 = whqVar.f(whqVar.e("isEnabled", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "boolean"));
        ajc$tjp_23 = whqVar.f(whqVar.e("isInMovie", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "boolean"));
        ajc$tjp_24 = whqVar.f(whqVar.e("isInPreview", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "boolean"));
        ajc$tjp_25 = whqVar.f(whqVar.e("isInPoster", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "boolean"));
        ajc$tjp_26 = whqVar.f(whqVar.e("setEnabled", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "enabled", "", "void"));
        ajc$tjp_27 = whqVar.f(whqVar.e("setInMovie", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "inMovie", "", "void"));
        ajc$tjp_28 = whqVar.f(whqVar.e("setInPreview", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "inPreview", "", "void"));
        ajc$tjp_29 = whqVar.f(whqVar.e("setInPoster", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "inPoster", "", "void"));
        ajc$tjp_3 = whqVar.f(whqVar.e("getDuration", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "long"));
        ajc$tjp_4 = whqVar.f(whqVar.e("getLayer", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "int"));
        ajc$tjp_5 = whqVar.f(whqVar.e("getAlternateGroup", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "int"));
        ajc$tjp_6 = whqVar.f(whqVar.e("getVolume", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "float"));
        ajc$tjp_7 = whqVar.f(whqVar.e("getMatrix", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "com.googlecode.mp4parser.util.Matrix"));
        ajc$tjp_8 = whqVar.f(whqVar.e("getWidth", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "double"));
        ajc$tjp_9 = whqVar.f(whqVar.e("getHeight", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "double"));
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        if (getVersion() == 1) {
            this.creationTime = x19.y(crx0.x(byteBuffer));
            this.modificationTime = x19.y(crx0.x(byteBuffer));
            this.trackId = crx0.w(byteBuffer);
            crx0.w(byteBuffer);
            this.duration = byteBuffer.getLong();
        } else {
            this.creationTime = x19.y(crx0.w(byteBuffer));
            this.modificationTime = x19.y(crx0.w(byteBuffer));
            this.trackId = crx0.w(byteBuffer);
            crx0.w(byteBuffer);
            this.duration = byteBuffer.getInt();
        }
        if (this.duration < -1) {
            LOG.d("tkhd duration is not in expected range");
        }
        crx0.w(byteBuffer);
        crx0.w(byteBuffer);
        this.layer = crx0.u(byteBuffer);
        this.alternateGroup = crx0.u(byteBuffer);
        this.volume = crx0.q(byteBuffer);
        crx0.u(byteBuffer);
        this.matrix = cn10.a(byteBuffer);
        this.width = crx0.p(byteBuffer);
        this.height = crx0.p(byteBuffer);
    }

    public int getAlternateGroup() {
        o0y c = whq.c(ajc$tjp_5, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.alternateGroup;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        o0y d = whq.d(ajc$tjp_10, this, this, byteBuffer);
        w8g0.a();
        w8g0.b(d);
        writeVersionAndFlags(byteBuffer);
        if (getVersion() == 1) {
            byteBuffer.putLong(x19.x(this.creationTime));
            byteBuffer.putLong(x19.x(this.modificationTime));
            byteBuffer.putInt((int) this.trackId);
            byteBuffer.putInt((int) 0);
            byteBuffer.putLong(this.duration);
        } else {
            byteBuffer.putInt((int) x19.x(this.creationTime));
            byteBuffer.putInt((int) x19.x(this.modificationTime));
            byteBuffer.putInt((int) this.trackId);
            byteBuffer.putInt((int) 0);
            byteBuffer.putInt((int) this.duration);
        }
        int i = (int) 0;
        byteBuffer.putInt(i);
        byteBuffer.putInt(i);
        aqw.u(this.layer, byteBuffer);
        aqw.u(this.alternateGroup, byteBuffer);
        aqw.s(byteBuffer, this.volume);
        aqw.u(0, byteBuffer);
        this.matrix.b(byteBuffer);
        aqw.r(byteBuffer, this.width);
        aqw.r(byteBuffer, this.height);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return (getVersion() == 1 ? 36L : 24L) + 60;
    }

    public Date getCreationTime() {
        o0y c = whq.c(ajc$tjp_0, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.creationTime;
    }

    public long getDuration() {
        o0y c = whq.c(ajc$tjp_3, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.duration;
    }

    public double getHeight() {
        o0y c = whq.c(ajc$tjp_9, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.height;
    }

    public int getLayer() {
        o0y c = whq.c(ajc$tjp_4, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.layer;
    }

    public cn10 getMatrix() {
        o0y c = whq.c(ajc$tjp_7, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.matrix;
    }

    public Date getModificationTime() {
        o0y c = whq.c(ajc$tjp_1, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.modificationTime;
    }

    public long getTrackId() {
        o0y c = whq.c(ajc$tjp_2, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.trackId;
    }

    public float getVolume() {
        o0y c = whq.c(ajc$tjp_6, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.volume;
    }

    public double getWidth() {
        o0y c = whq.c(ajc$tjp_8, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.width;
    }

    public boolean isEnabled() {
        o0y c = whq.c(ajc$tjp_22, this, this);
        w8g0.a();
        w8g0.b(c);
        return (getFlags() & 1) > 0;
    }

    public boolean isInMovie() {
        o0y c = whq.c(ajc$tjp_23, this, this);
        w8g0.a();
        w8g0.b(c);
        return (getFlags() & 2) > 0;
    }

    public boolean isInPoster() {
        o0y c = whq.c(ajc$tjp_25, this, this);
        w8g0.a();
        w8g0.b(c);
        return (getFlags() & 8) > 0;
    }

    public boolean isInPreview() {
        o0y c = whq.c(ajc$tjp_24, this, this);
        w8g0.a();
        w8g0.b(c);
        return (getFlags() & 4) > 0;
    }

    public void setAlternateGroup(int i) {
        o0y d = whq.d(ajc$tjp_17, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.alternateGroup = i;
    }

    public void setCreationTime(Date date) {
        o0y d = whq.d(ajc$tjp_12, this, this, date);
        w8g0.a();
        w8g0.b(d);
        this.creationTime = date;
        if (x19.x(date) >= 4294967296L) {
            setVersion(1);
        }
    }

    public void setDuration(long j) {
        o0y d = whq.d(ajc$tjp_15, this, this, new Long(j));
        w8g0.a();
        w8g0.b(d);
        this.duration = j;
        if (j >= 4294967296L) {
            setFlags(1);
        }
    }

    public void setEnabled(boolean z) {
        o0y d = whq.d(ajc$tjp_26, this, this, new Boolean(z));
        w8g0.a();
        w8g0.b(d);
        if (z) {
            setFlags(getFlags() | 1);
        } else {
            setFlags(getFlags() & (-2));
        }
    }

    public void setHeight(double d) {
        o0y d2 = whq.d(ajc$tjp_21, this, this, new Double(d));
        w8g0.a();
        w8g0.b(d2);
        this.height = d;
    }

    public void setInMovie(boolean z) {
        o0y d = whq.d(ajc$tjp_27, this, this, new Boolean(z));
        w8g0.a();
        w8g0.b(d);
        if (z) {
            setFlags(getFlags() | 2);
        } else {
            setFlags(getFlags() & (-3));
        }
    }

    public void setInPoster(boolean z) {
        o0y d = whq.d(ajc$tjp_29, this, this, new Boolean(z));
        w8g0.a();
        w8g0.b(d);
        if (z) {
            setFlags(getFlags() | 8);
        } else {
            setFlags(getFlags() & (-9));
        }
    }

    public void setInPreview(boolean z) {
        o0y d = whq.d(ajc$tjp_28, this, this, new Boolean(z));
        w8g0.a();
        w8g0.b(d);
        if (z) {
            setFlags(getFlags() | 4);
        } else {
            setFlags(getFlags() & (-5));
        }
    }

    public void setLayer(int i) {
        o0y d = whq.d(ajc$tjp_16, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.layer = i;
    }

    public void setMatrix(cn10 cn10Var) {
        o0y d = whq.d(ajc$tjp_19, this, this, cn10Var);
        w8g0.a();
        w8g0.b(d);
        this.matrix = cn10Var;
    }

    public void setModificationTime(Date date) {
        o0y d = whq.d(ajc$tjp_13, this, this, date);
        w8g0.a();
        w8g0.b(d);
        this.modificationTime = date;
        if (x19.x(date) >= 4294967296L) {
            setVersion(1);
        }
    }

    public void setTrackId(long j) {
        o0y d = whq.d(ajc$tjp_14, this, this, new Long(j));
        w8g0.a();
        w8g0.b(d);
        this.trackId = j;
    }

    public void setVolume(float f) {
        o0y d = whq.d(ajc$tjp_18, this, this, new Float(f));
        w8g0.a();
        w8g0.b(d);
        this.volume = f;
    }

    public void setWidth(double d) {
        o0y d2 = whq.d(ajc$tjp_20, this, this, new Double(d));
        w8g0.a();
        w8g0.b(d2);
        this.width = d;
    }

    public String toString() {
        o0y c = whq.c(ajc$tjp_11, this, this);
        w8g0.a();
        w8g0.b(c);
        return "TrackHeaderBox[creationTime=" + getCreationTime() + ";modificationTime=" + getModificationTime() + ";trackId=" + getTrackId() + ";duration=" + getDuration() + ";layer=" + getLayer() + ";alternateGroup=" + getAlternateGroup() + ";volume=" + getVolume() + ";matrix=" + this.matrix + ";width=" + getWidth() + ";height=" + getHeight() + X3.j.e;
    }
}
