package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractFullBox;
import com.ironsource.X3;
import java.nio.ByteBuffer;
import java.util.Date;
import xsna.aqw;
import xsna.crx0;
import xsna.n0y;
import xsna.o0y;
import xsna.q100;
import xsna.w8g0;
import xsna.whq;
import xsna.x19;

/* loaded from: classes12.dex */
public class MediaHeaderBox extends AbstractFullBox {
    private static q100 LOG = null;
    public static final String TYPE = "mdhd";
    private static final /* synthetic */ n0y ajc$tjp_0 = null;
    private static final /* synthetic */ n0y ajc$tjp_1 = null;
    private static final /* synthetic */ n0y ajc$tjp_10 = null;
    private static final /* synthetic */ n0y ajc$tjp_2 = null;
    private static final /* synthetic */ n0y ajc$tjp_3 = null;
    private static final /* synthetic */ n0y ajc$tjp_4 = null;
    private static final /* synthetic */ n0y ajc$tjp_5 = null;
    private static final /* synthetic */ n0y ajc$tjp_6 = null;
    private static final /* synthetic */ n0y ajc$tjp_7 = null;
    private static final /* synthetic */ n0y ajc$tjp_8 = null;
    private static final /* synthetic */ n0y ajc$tjp_9 = null;
    private Date creationTime;
    private long duration;
    private String language;
    private Date modificationTime;
    private long timescale;

    static {
        ajc$preClinit();
        LOG = q100.a(MediaHeaderBox.class);
    }

    public MediaHeaderBox() {
        super(TYPE);
        this.creationTime = new Date();
        this.modificationTime = new Date();
        this.language = "eng";
    }

    private static /* synthetic */ void ajc$preClinit() {
        whq whqVar = new whq("MediaHeaderBox.java", MediaHeaderBox.class);
        ajc$tjp_0 = whqVar.f(whqVar.e("getCreationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "", "java.util.Date"));
        ajc$tjp_1 = whqVar.f(whqVar.e("getModificationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "", "java.util.Date"));
        ajc$tjp_10 = whqVar.f(whqVar.e("toString", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "", "java.lang.String"));
        ajc$tjp_2 = whqVar.f(whqVar.e("getTimescale", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "", "long"));
        ajc$tjp_3 = whqVar.f(whqVar.e("getDuration", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "", "long"));
        ajc$tjp_4 = whqVar.f(whqVar.e("getLanguage", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "", "java.lang.String"));
        ajc$tjp_5 = whqVar.f(whqVar.e("setCreationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "java.util.Date", "creationTime", "", "void"));
        ajc$tjp_6 = whqVar.f(whqVar.e("setModificationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "java.util.Date", "modificationTime", "", "void"));
        ajc$tjp_7 = whqVar.f(whqVar.e("setTimescale", "com.coremedia.iso.boxes.MediaHeaderBox", "long", "timescale", "", "void"));
        ajc$tjp_8 = whqVar.f(whqVar.e("setDuration", "com.coremedia.iso.boxes.MediaHeaderBox", "long", "duration", "", "void"));
        ajc$tjp_9 = whqVar.f(whqVar.e("setLanguage", "com.coremedia.iso.boxes.MediaHeaderBox", "java.lang.String", "language", "", "void"));
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
            LOG.d("mdhd duration is not in expected range");
        }
        this.language = crx0.r(byteBuffer);
        crx0.u(byteBuffer);
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
        aqw.t(this.language, byteBuffer);
        aqw.u(0, byteBuffer);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return (getVersion() == 1 ? 32L : 20L) + 4;
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

    public String getLanguage() {
        o0y c = whq.c(ajc$tjp_4, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.language;
    }

    public Date getModificationTime() {
        o0y c = whq.c(ajc$tjp_1, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.modificationTime;
    }

    public long getTimescale() {
        o0y c = whq.c(ajc$tjp_2, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.timescale;
    }

    public void setCreationTime(Date date) {
        o0y d = whq.d(ajc$tjp_5, this, this, date);
        w8g0.a();
        w8g0.b(d);
        this.creationTime = date;
    }

    public void setDuration(long j) {
        o0y d = whq.d(ajc$tjp_8, this, this, new Long(j));
        w8g0.a();
        w8g0.b(d);
        this.duration = j;
    }

    public void setLanguage(String str) {
        o0y d = whq.d(ajc$tjp_9, this, this, str);
        w8g0.a();
        w8g0.b(d);
        this.language = str;
    }

    public void setModificationTime(Date date) {
        o0y d = whq.d(ajc$tjp_6, this, this, date);
        w8g0.a();
        w8g0.b(d);
        this.modificationTime = date;
    }

    public void setTimescale(long j) {
        o0y d = whq.d(ajc$tjp_7, this, this, new Long(j));
        w8g0.a();
        w8g0.b(d);
        this.timescale = j;
    }

    public String toString() {
        o0y c = whq.c(ajc$tjp_10, this, this);
        w8g0.a();
        w8g0.b(c);
        return "MediaHeaderBox[creationTime=" + getCreationTime() + ";modificationTime=" + getModificationTime() + ";timescale=" + getTimescale() + ";duration=" + getDuration() + ";language=" + getLanguage() + X3.j.e;
    }
}
