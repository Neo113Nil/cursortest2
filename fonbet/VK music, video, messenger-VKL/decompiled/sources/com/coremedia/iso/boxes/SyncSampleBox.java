package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractFullBox;
import com.ironsource.X3;
import java.nio.ByteBuffer;
import xsna.crx0;
import xsna.h5s;
import xsna.n0y;
import xsna.o0y;
import xsna.up2;
import xsna.w8g0;
import xsna.whq;

/* loaded from: classes12.dex */
public class SyncSampleBox extends AbstractFullBox {
    public static final String TYPE = "stss";
    private static final /* synthetic */ n0y ajc$tjp_0 = null;
    private static final /* synthetic */ n0y ajc$tjp_1 = null;
    private static final /* synthetic */ n0y ajc$tjp_2 = null;
    private long[] sampleNumber;

    static {
        ajc$preClinit();
    }

    public SyncSampleBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        whq whqVar = new whq("SyncSampleBox.java", SyncSampleBox.class);
        ajc$tjp_0 = whqVar.f(whqVar.e("getSampleNumber", "com.coremedia.iso.boxes.SyncSampleBox", "", "", "", "[J"));
        ajc$tjp_1 = whqVar.f(whqVar.e("toString", "com.coremedia.iso.boxes.SyncSampleBox", "", "", "", "java.lang.String"));
        ajc$tjp_2 = whqVar.f(whqVar.e("setSampleNumber", "com.coremedia.iso.boxes.SyncSampleBox", "[J", "sampleNumber", "", "void"));
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        int p = up2.p(crx0.w(byteBuffer));
        this.sampleNumber = new long[p];
        for (int i = 0; i < p; i++) {
            this.sampleNumber[i] = crx0.w(byteBuffer);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.putInt(this.sampleNumber.length);
        for (long j : this.sampleNumber) {
            byteBuffer.putInt((int) j);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return (this.sampleNumber.length * 4) + 8;
    }

    public long[] getSampleNumber() {
        o0y c = whq.c(ajc$tjp_0, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.sampleNumber;
    }

    public void setSampleNumber(long[] jArr) {
        o0y d = whq.d(ajc$tjp_2, this, this, jArr);
        w8g0.a();
        w8g0.b(d);
        this.sampleNumber = jArr;
    }

    public String toString() {
        o0y c = whq.c(ajc$tjp_1, this, this);
        w8g0.a();
        w8g0.b(c);
        return h5s.c(this.sampleNumber.length, X3.j.e, new StringBuilder("SyncSampleBox[entryCount="));
    }
}
