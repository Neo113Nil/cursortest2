package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractFullBox;
import com.ironsource.X3;
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
public class MovieHeaderBox extends AbstractFullBox {
    private static q100 LOG = null;
    public static final String TYPE = "mvhd";
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
    private static final /* synthetic */ n0y ajc$tjp_3 = null;
    private static final /* synthetic */ n0y ajc$tjp_4 = null;
    private static final /* synthetic */ n0y ajc$tjp_5 = null;
    private static final /* synthetic */ n0y ajc$tjp_6 = null;
    private static final /* synthetic */ n0y ajc$tjp_7 = null;
    private static final /* synthetic */ n0y ajc$tjp_8 = null;
    private static final /* synthetic */ n0y ajc$tjp_9 = null;
    private Date creationTime;
    private int currentTime;
    private long duration;
    private cn10 matrix;
    private Date modificationTime;
    private long nextTrackId;
    private int posterTime;
    private int previewDuration;
    private int previewTime;
    private double rate;
    private int selectionDuration;
    private int selectionTime;
    private long timescale;
    private float volume;

    static {
        ajc$preClinit();
        LOG = q100.a(MovieHeaderBox.class);
    }

    public MovieHeaderBox() {
        super(TYPE);
        this.rate = 1.0d;
        this.volume = 1.0f;
        this.matrix = cn10.j;
    }

    private static /* synthetic */ void ajc$preClinit() {
        whq whqVar = new whq("MovieHeaderBox.java", MovieHeaderBox.class);
        ajc$tjp_0 = whqVar.f(whqVar.e("getCreationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "java.util.Date"));
        ajc$tjp_1 = whqVar.f(whqVar.e("getModificationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "java.util.Date"));
        ajc$tjp_10 = whqVar.f(whqVar.e("setModificationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "java.util.Date", "modificationTime", "", "void"));
        ajc$tjp_11 = whqVar.f(whqVar.e("setTimescale", "com.coremedia.iso.boxes.MovieHeaderBox", "long", "timescale", "", "void"));
        ajc$tjp_12 = whqVar.f(whqVar.e("setDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "long", "duration", "", "void"));
        ajc$tjp_13 = whqVar.f(whqVar.e("setRate", "com.coremedia.iso.boxes.MovieHeaderBox", "double", "rate", "", "void"));
        ajc$tjp_14 = whqVar.f(whqVar.e("setVolume", "com.coremedia.iso.boxes.MovieHeaderBox", "float", "volume", "", "void"));
        ajc$tjp_15 = whqVar.f(whqVar.e("setMatrix", "com.coremedia.iso.boxes.MovieHeaderBox", "com.googlecode.mp4parser.util.Matrix", "matrix", "", "void"));
        ajc$tjp_16 = whqVar.f(whqVar.e("setNextTrackId", "com.coremedia.iso.boxes.MovieHeaderBox", "long", "nextTrackId", "", "void"));
        ajc$tjp_17 = whqVar.f(whqVar.e("getPreviewTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "int"));
        ajc$tjp_18 = whqVar.f(whqVar.e("setPreviewTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "previewTime", "", "void"));
        ajc$tjp_19 = whqVar.f(whqVar.e("getPreviewDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "int"));
        ajc$tjp_2 = whqVar.f(whqVar.e("getTimescale", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "long"));
        ajc$tjp_20 = whqVar.f(whqVar.e("setPreviewDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "previewDuration", "", "void"));
        ajc$tjp_21 = whqVar.f(whqVar.e("getPosterTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "int"));
        ajc$tjp_22 = whqVar.f(whqVar.e("setPosterTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "posterTime", "", "void"));
        ajc$tjp_23 = whqVar.f(whqVar.e("getSelectionTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "int"));
        ajc$tjp_24 = whqVar.f(whqVar.e("setSelectionTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "selectionTime", "", "void"));
        ajc$tjp_25 = whqVar.f(whqVar.e("getSelectionDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "int"));
        ajc$tjp_26 = whqVar.f(whqVar.e("setSelectionDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "selectionDuration", "", "void"));
        ajc$tjp_27 = whqVar.f(whqVar.e("getCurrentTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "int"));
        ajc$tjp_28 = whqVar.f(whqVar.e("setCurrentTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "currentTime", "", "void"));
        ajc$tjp_3 = whqVar.f(whqVar.e("getDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "long"));
        ajc$tjp_4 = whqVar.f(whqVar.e("getRate", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "double"));
        ajc$tjp_5 = whqVar.f(whqVar.e("getVolume", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "float"));
        ajc$tjp_6 = whqVar.f(whqVar.e("getMatrix", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "com.googlecode.mp4parser.util.Matrix"));
        ajc$tjp_7 = whqVar.f(whqVar.e("getNextTrackId", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "long"));
        ajc$tjp_8 = whqVar.f(whqVar.e("toString", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "java.lang.String"));
        ajc$tjp_9 = whqVar.f(whqVar.e("setCreationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "java.util.Date", "creationTime", "", "void"));
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        if (getVersion() == 1) {
            this.creationTime = x19.y(crx0.x(byteBuffer));
            this.modificationTime = x19.y(crx0.x(byteBuffer));
            this.timescale = crx0.w(byteBuffer);
            this.duration = byteBuffer.getLong();
        } else {
            this.creationTime = x19.y(crx0.w(byteBuffer));
            this.modificationTime = x19.y(crx0.w(byteBuffer));
            this.timescale = crx0.w(byteBuffer);
            this.duration = byteBuffer.getInt();
        }
        if (this.duration < -1) {
            LOG.d("mvhd duration is not in expected range");
        }
        this.rate = crx0.p(byteBuffer);
        this.volume = crx0.q(byteBuffer);
        crx0.u(byteBuffer);
        crx0.w(byteBuffer);
        crx0.w(byteBuffer);
        this.matrix = cn10.a(byteBuffer);
        this.previewTime = byteBuffer.getInt();
        this.previewDuration = byteBuffer.getInt();
        this.posterTime = byteBuffer.getInt();
        this.selectionTime = byteBuffer.getInt();
        this.selectionDuration = byteBuffer.getInt();
        this.currentTime = byteBuffer.getInt();
        this.nextTrackId = crx0.w(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        if (getVersion() == 1) {
            byteBuffer.putLong(x19.x(this.creationTime));
            byteBuffer.putLong(x19.x(this.modificationTime));
            byteBuffer.putInt((int) this.timescale);
            byteBuffer.putLong(this.duration);
        } else {
            byteBuffer.putInt((int) x19.x(this.creationTime));
            byteBuffer.putInt((int) x19.x(this.modificationTime));
            byteBuffer.putInt((int) this.timescale);
            byteBuffer.putInt((int) this.duration);
        }
        aqw.r(byteBuffer, this.rate);
        aqw.s(byteBuffer, this.volume);
        aqw.u(0, byteBuffer);
        int i = (int) 0;
        byteBuffer.putInt(i);
        byteBuffer.putInt(i);
        this.matrix.b(byteBuffer);
        byteBuffer.putInt(this.previewTime);
        byteBuffer.putInt(this.previewDuration);
        byteBuffer.putInt(this.posterTime);
        byteBuffer.putInt(this.selectionTime);
        byteBuffer.putInt(this.selectionDuration);
        byteBuffer.putInt(this.currentTime);
        byteBuffer.putInt((int) this.nextTrackId);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return (getVersion() == 1 ? 32L : 20L) + 80;
    }

    public Date getCreationTime() {
        o0y c = whq.c(ajc$tjp_0, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.creationTime;
    }

    public int getCurrentTime() {
        o0y c = whq.c(ajc$tjp_27, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.currentTime;
    }

    public long getDuration() {
        o0y c = whq.c(ajc$tjp_3, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.duration;
    }

    public cn10 getMatrix() {
        o0y c = whq.c(ajc$tjp_6, this, this);
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

    public long getNextTrackId() {
        o0y c = whq.c(ajc$tjp_7, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.nextTrackId;
    }

    public int getPosterTime() {
        o0y c = whq.c(ajc$tjp_21, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.posterTime;
    }

    public int getPreviewDuration() {
        o0y c = whq.c(ajc$tjp_19, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.previewDuration;
    }

    public int getPreviewTime() {
        o0y c = whq.c(ajc$tjp_17, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.previewTime;
    }

    public double getRate() {
        o0y c = whq.c(ajc$tjp_4, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.rate;
    }

    public int getSelectionDuration() {
        o0y c = whq.c(ajc$tjp_25, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.selectionDuration;
    }

    public int getSelectionTime() {
        o0y c = whq.c(ajc$tjp_23, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.selectionTime;
    }

    public long getTimescale() {
        o0y c = whq.c(ajc$tjp_2, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.timescale;
    }

    public float getVolume() {
        o0y c = whq.c(ajc$tjp_5, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.volume;
    }

    public void setCreationTime(Date date) {
        o0y d = whq.d(ajc$tjp_9, this, this, date);
        w8g0.a();
        w8g0.b(d);
        this.creationTime = date;
        if (x19.x(date) >= 4294967296L) {
            setVersion(1);
        }
    }

    public void setCurrentTime(int i) {
        o0y d = whq.d(ajc$tjp_28, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.currentTime = i;
    }

    public void setDuration(long j) {
        o0y d = whq.d(ajc$tjp_12, this, this, new Long(j));
        w8g0.a();
        w8g0.b(d);
        this.duration = j;
        if (j >= 4294967296L) {
            setVersion(1);
        }
    }

    public void setMatrix(cn10 cn10Var) {
        o0y d = whq.d(ajc$tjp_15, this, this, cn10Var);
        w8g0.a();
        w8g0.b(d);
        this.matrix = cn10Var;
    }

    public void setModificationTime(Date date) {
        o0y d = whq.d(ajc$tjp_10, this, this, date);
        w8g0.a();
        w8g0.b(d);
        this.modificationTime = date;
        if (x19.x(date) >= 4294967296L) {
            setVersion(1);
        }
    }

    public void setNextTrackId(long j) {
        o0y d = whq.d(ajc$tjp_16, this, this, new Long(j));
        w8g0.a();
        w8g0.b(d);
        this.nextTrackId = j;
    }

    public void setPosterTime(int i) {
        o0y d = whq.d(ajc$tjp_22, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.posterTime = i;
    }

    public void setPreviewDuration(int i) {
        o0y d = whq.d(ajc$tjp_20, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.previewDuration = i;
    }

    public void setPreviewTime(int i) {
        o0y d = whq.d(ajc$tjp_18, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.previewTime = i;
    }

    public void setRate(double d) {
        o0y d2 = whq.d(ajc$tjp_13, this, this, new Double(d));
        w8g0.a();
        w8g0.b(d2);
        this.rate = d;
    }

    public void setSelectionDuration(int i) {
        o0y d = whq.d(ajc$tjp_26, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.selectionDuration = i;
    }

    public void setSelectionTime(int i) {
        o0y d = whq.d(ajc$tjp_24, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.selectionTime = i;
    }

    public void setTimescale(long j) {
        o0y d = whq.d(ajc$tjp_11, this, this, new Long(j));
        w8g0.a();
        w8g0.b(d);
        this.timescale = j;
    }

    public void setVolume(float f) {
        o0y d = whq.d(ajc$tjp_14, this, this, new Float(f));
        w8g0.a();
        w8g0.b(d);
        this.volume = f;
    }

    public String toString() {
        o0y c = whq.c(ajc$tjp_8, this, this);
        w8g0.a();
        w8g0.b(c);
        return "MovieHeaderBox[creationTime=" + getCreationTime() + ";modificationTime=" + getModificationTime() + ";timescale=" + getTimescale() + ";duration=" + getDuration() + ";rate=" + getRate() + ";volume=" + getVolume() + ";matrix=" + this.matrix + ";nextTrackId=" + getNextTrackId() + X3.j.e;
    }
}
