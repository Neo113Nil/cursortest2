package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractFullBox;
import com.ironsource.X3;
import java.nio.ByteBuffer;
import xsna.crx0;
import xsna.n0y;
import xsna.o0y;
import xsna.up2;
import xsna.w8g0;
import xsna.whq;

/* loaded from: classes12.dex */
public class SampleSizeBox extends AbstractFullBox {
    public static final String TYPE = "stsz";
    private static final /* synthetic */ n0y ajc$tjp_0 = null;
    private static final /* synthetic */ n0y ajc$tjp_1 = null;
    private static final /* synthetic */ n0y ajc$tjp_2 = null;
    private static final /* synthetic */ n0y ajc$tjp_3 = null;
    private static final /* synthetic */ n0y ajc$tjp_4 = null;
    private static final /* synthetic */ n0y ajc$tjp_5 = null;
    private static final /* synthetic */ n0y ajc$tjp_6 = null;
    int sampleCount;
    private long sampleSize;
    private long[] sampleSizes;

    static {
        ajc$preClinit();
    }

    public SampleSizeBox() {
        super(TYPE);
        this.sampleSizes = new long[0];
    }

    private static /* synthetic */ void ajc$preClinit() {
        whq whqVar = new whq("SampleSizeBox.java", SampleSizeBox.class);
        ajc$tjp_0 = whqVar.f(whqVar.e("getSampleSize", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "", "long"));
        ajc$tjp_1 = whqVar.f(whqVar.e("setSampleSize", "com.coremedia.iso.boxes.SampleSizeBox", "long", "sampleSize", "", "void"));
        ajc$tjp_2 = whqVar.f(whqVar.e("getSampleSizeAtIndex", "com.coremedia.iso.boxes.SampleSizeBox", "int", "index", "", "long"));
        ajc$tjp_3 = whqVar.f(whqVar.e("getSampleCount", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "", "long"));
        ajc$tjp_4 = whqVar.f(whqVar.e("getSampleSizes", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "", "[J"));
        ajc$tjp_5 = whqVar.f(whqVar.e("setSampleSizes", "com.coremedia.iso.boxes.SampleSizeBox", "[J", "sampleSizes", "", "void"));
        ajc$tjp_6 = whqVar.f(whqVar.e("toString", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "", "java.lang.String"));
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.sampleSize = crx0.w(byteBuffer);
        int p = up2.p(crx0.w(byteBuffer));
        this.sampleCount = p;
        if (this.sampleSize == 0) {
            this.sampleSizes = new long[p];
            for (int i = 0; i < this.sampleCount; i++) {
                this.sampleSizes[i] = crx0.w(byteBuffer);
            }
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.putInt((int) this.sampleSize);
        if (this.sampleSize != 0) {
            byteBuffer.putInt(this.sampleCount);
            return;
        }
        byteBuffer.putInt(this.sampleSizes.length);
        for (long j : this.sampleSizes) {
            byteBuffer.putInt((int) j);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return (this.sampleSize == 0 ? this.sampleSizes.length * 4 : 0) + 12;
    }

    public long getSampleCount() {
        o0y c = whq.c(ajc$tjp_3, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.sampleSize > 0 ? this.sampleCount : this.sampleSizes.length;
    }

    public long getSampleSize() {
        o0y c = whq.c(ajc$tjp_0, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.sampleSize;
    }

    public long getSampleSizeAtIndex(int i) {
        o0y d = whq.d(ajc$tjp_2, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        long j = this.sampleSize;
        return j > 0 ? j : this.sampleSizes[i];
    }

    public long[] getSampleSizes() {
        o0y c = whq.c(ajc$tjp_4, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.sampleSizes;
    }

    public void setSampleSize(long j) {
        o0y d = whq.d(ajc$tjp_1, this, this, new Long(j));
        w8g0.a();
        w8g0.b(d);
        this.sampleSize = j;
    }

    public void setSampleSizes(long[] jArr) {
        o0y d = whq.d(ajc$tjp_5, this, this, jArr);
        w8g0.a();
        w8g0.b(d);
        this.sampleSizes = jArr;
    }

    public String toString() {
        o0y c = whq.c(ajc$tjp_6, this, this);
        w8g0.a();
        w8g0.b(c);
        return "SampleSizeBox[sampleSize=" + getSampleSize() + ";sampleCount=" + getSampleCount() + X3.j.e;
    }
}
