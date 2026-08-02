package com.mp4parser.iso14496.part12;

import com.googlecode.mp4parser.AbstractBox;
import java.nio.ByteBuffer;
import xsna.crx0;
import xsna.n0y;
import xsna.o0y;
import xsna.skd;
import xsna.w8g0;
import xsna.whq;

/* loaded from: classes14.dex */
public class TrackReferenceTypeBox extends AbstractBox {
    private static final /* synthetic */ n0y ajc$tjp_0 = null;
    private static final /* synthetic */ n0y ajc$tjp_1 = null;
    long[] trackIds;

    static {
        ajc$preClinit();
    }

    public TrackReferenceTypeBox(String str) {
        super(str);
        this.trackIds = new long[0];
    }

    private static /* synthetic */ void ajc$preClinit() {
        whq whqVar = new whq("TrackReferenceTypeBox.java", TrackReferenceTypeBox.class);
        ajc$tjp_0 = whqVar.f(whqVar.e("getTrackIds", "com.mp4parser.iso14496.part12.TrackReferenceTypeBox", "", "", "", "[J"));
        ajc$tjp_1 = whqVar.f(whqVar.e("setTrackIds", "com.mp4parser.iso14496.part12.TrackReferenceTypeBox", "[J", "trackIds", "", "void"));
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        while (byteBuffer.remaining() >= 4) {
            this.trackIds = skd.b(this.trackIds, crx0.w(byteBuffer));
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        for (long j : this.trackIds) {
            byteBuffer.putInt((int) j);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return this.trackIds.length * 4;
    }

    public long[] getTrackIds() {
        o0y c = whq.c(ajc$tjp_0, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.trackIds;
    }

    public void setTrackIds(long[] jArr) {
        o0y d = whq.d(ajc$tjp_1, this, this, jArr);
        w8g0.a();
        w8g0.b(d);
        this.trackIds = jArr;
    }
}
