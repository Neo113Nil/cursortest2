package com.coremedia.iso.boxes;

import java.nio.ByteBuffer;
import xsna.aqw;
import xsna.crx0;
import xsna.n0y;
import xsna.o0y;
import xsna.vu5;
import xsna.w8g0;
import xsna.whq;

/* loaded from: classes12.dex */
public class HintMediaHeaderBox extends AbstractMediaHeaderBox {
    public static final String TYPE = "hmhd";
    private static final /* synthetic */ n0y ajc$tjp_0 = null;
    private static final /* synthetic */ n0y ajc$tjp_1 = null;
    private static final /* synthetic */ n0y ajc$tjp_2 = null;
    private static final /* synthetic */ n0y ajc$tjp_3 = null;
    private static final /* synthetic */ n0y ajc$tjp_4 = null;
    private long avgBitrate;
    private int avgPduSize;
    private long maxBitrate;
    private int maxPduSize;

    static {
        ajc$preClinit();
    }

    public HintMediaHeaderBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        whq whqVar = new whq("HintMediaHeaderBox.java", HintMediaHeaderBox.class);
        ajc$tjp_0 = whqVar.f(whqVar.e("getMaxPduSize", "com.coremedia.iso.boxes.HintMediaHeaderBox", "", "", "", "int"));
        ajc$tjp_1 = whqVar.f(whqVar.e("getAvgPduSize", "com.coremedia.iso.boxes.HintMediaHeaderBox", "", "", "", "int"));
        ajc$tjp_2 = whqVar.f(whqVar.e("getMaxBitrate", "com.coremedia.iso.boxes.HintMediaHeaderBox", "", "", "", "long"));
        ajc$tjp_3 = whqVar.f(whqVar.e("getAvgBitrate", "com.coremedia.iso.boxes.HintMediaHeaderBox", "", "", "", "long"));
        ajc$tjp_4 = whqVar.f(whqVar.e("toString", "com.coremedia.iso.boxes.HintMediaHeaderBox", "", "", "", "java.lang.String"));
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.maxPduSize = crx0.u(byteBuffer);
        this.avgPduSize = crx0.u(byteBuffer);
        this.maxBitrate = crx0.w(byteBuffer);
        this.avgBitrate = crx0.w(byteBuffer);
        crx0.w(byteBuffer);
    }

    public long getAvgBitrate() {
        o0y c = whq.c(ajc$tjp_3, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.avgBitrate;
    }

    public int getAvgPduSize() {
        o0y c = whq.c(ajc$tjp_1, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.avgPduSize;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        aqw.u(this.maxPduSize, byteBuffer);
        aqw.u(this.avgPduSize, byteBuffer);
        byteBuffer.putInt((int) this.maxBitrate);
        byteBuffer.putInt((int) this.avgBitrate);
        byteBuffer.putInt((int) 0);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return 20L;
    }

    public long getMaxBitrate() {
        o0y c = whq.c(ajc$tjp_2, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.maxBitrate;
    }

    public int getMaxPduSize() {
        o0y c = whq.c(ajc$tjp_0, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.maxPduSize;
    }

    public String toString() {
        o0y c = whq.c(ajc$tjp_4, this, this);
        w8g0.a();
        w8g0.b(c);
        StringBuilder sb = new StringBuilder("HintMediaHeaderBox{maxPduSize=");
        sb.append(this.maxPduSize);
        sb.append(", avgPduSize=");
        sb.append(this.avgPduSize);
        sb.append(", maxBitrate=");
        sb.append(this.maxBitrate);
        sb.append(", avgBitrate=");
        return vu5.a('}', this.avgBitrate, sb);
    }
}
