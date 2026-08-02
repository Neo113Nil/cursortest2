package com.mp4parser.iso14496.part15;

import com.googlecode.mp4parser.AbstractBox;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.nio.ByteBuffer;
import xsna.aqw;
import xsna.crx0;
import xsna.n0y;
import xsna.o0y;
import xsna.w8g0;
import xsna.whq;

/* loaded from: classes14.dex */
public class PriotityRangeBox extends AbstractBox {
    public static final String TYPE = "svpr";
    private static final /* synthetic */ n0y ajc$tjp_0 = null;
    private static final /* synthetic */ n0y ajc$tjp_1 = null;
    private static final /* synthetic */ n0y ajc$tjp_2 = null;
    private static final /* synthetic */ n0y ajc$tjp_3 = null;
    private static final /* synthetic */ n0y ajc$tjp_4 = null;
    private static final /* synthetic */ n0y ajc$tjp_5 = null;
    private static final /* synthetic */ n0y ajc$tjp_6 = null;
    private static final /* synthetic */ n0y ajc$tjp_7 = null;
    int max_priorityId;
    int min_priorityId;
    int reserved1;
    int reserved2;

    static {
        ajc$preClinit();
    }

    public PriotityRangeBox() {
        super(TYPE);
        this.reserved1 = 0;
        this.reserved2 = 0;
    }

    private static /* synthetic */ void ajc$preClinit() {
        whq whqVar = new whq("PriotityRangeBox.java", PriotityRangeBox.class);
        ajc$tjp_0 = whqVar.f(whqVar.e("getReserved1", "com.mp4parser.iso14496.part15.PriotityRangeBox", "", "", "", "int"));
        ajc$tjp_1 = whqVar.f(whqVar.e("setReserved1", "com.mp4parser.iso14496.part15.PriotityRangeBox", "int", "reserved1", "", "void"));
        ajc$tjp_2 = whqVar.f(whqVar.e("getMin_priorityId", "com.mp4parser.iso14496.part15.PriotityRangeBox", "", "", "", "int"));
        ajc$tjp_3 = whqVar.f(whqVar.e("setMin_priorityId", "com.mp4parser.iso14496.part15.PriotityRangeBox", "int", "min_priorityId", "", "void"));
        ajc$tjp_4 = whqVar.f(whqVar.e("getReserved2", "com.mp4parser.iso14496.part15.PriotityRangeBox", "", "", "", "int"));
        ajc$tjp_5 = whqVar.f(whqVar.e("setReserved2", "com.mp4parser.iso14496.part15.PriotityRangeBox", "int", "reserved2", "", "void"));
        ajc$tjp_6 = whqVar.f(whqVar.e("getMax_priorityId", "com.mp4parser.iso14496.part15.PriotityRangeBox", "", "", "", "int"));
        ajc$tjp_7 = whqVar.f(whqVar.e("setMax_priorityId", "com.mp4parser.iso14496.part15.PriotityRangeBox", "int", "max_priorityId", "", "void"));
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        int y = crx0.y(byteBuffer);
        this.reserved1 = (y & PsExtractor.AUDIO_STREAM) >> 6;
        this.min_priorityId = y & 63;
        int e = crx0.e(byteBuffer.get());
        this.reserved2 = (e & PsExtractor.AUDIO_STREAM) >> 6;
        this.max_priorityId = e & 63;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        aqw.w((this.reserved1 << 6) + this.min_priorityId, byteBuffer);
        byteBuffer.put((byte) (((this.reserved2 << 6) + this.max_priorityId) & 255));
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return 2L;
    }

    public int getMax_priorityId() {
        o0y c = whq.c(ajc$tjp_6, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.max_priorityId;
    }

    public int getMin_priorityId() {
        o0y c = whq.c(ajc$tjp_2, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.min_priorityId;
    }

    public int getReserved1() {
        o0y c = whq.c(ajc$tjp_0, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.reserved1;
    }

    public int getReserved2() {
        o0y c = whq.c(ajc$tjp_4, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.reserved2;
    }

    public void setMax_priorityId(int i) {
        o0y d = whq.d(ajc$tjp_7, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.max_priorityId = i;
    }

    public void setMin_priorityId(int i) {
        o0y d = whq.d(ajc$tjp_3, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.min_priorityId = i;
    }

    public void setReserved1(int i) {
        o0y d = whq.d(ajc$tjp_1, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.reserved1 = i;
    }

    public void setReserved2(int i) {
        o0y d = whq.d(ajc$tjp_5, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.reserved2 = i;
    }
}
