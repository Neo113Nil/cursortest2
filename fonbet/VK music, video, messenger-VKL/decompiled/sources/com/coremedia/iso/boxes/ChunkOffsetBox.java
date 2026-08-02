package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractFullBox;
import com.ironsource.X3;
import xsna.h5s;
import xsna.n0y;
import xsna.o0y;
import xsna.w8g0;
import xsna.whq;

/* loaded from: classes12.dex */
public abstract class ChunkOffsetBox extends AbstractFullBox {
    private static final /* synthetic */ n0y ajc$tjp_0 = null;

    static {
        ajc$preClinit();
    }

    public ChunkOffsetBox(String str) {
        super(str);
    }

    private static /* synthetic */ void ajc$preClinit() {
        whq whqVar = new whq("ChunkOffsetBox.java", ChunkOffsetBox.class);
        ajc$tjp_0 = whqVar.f(whqVar.e("toString", "com.coremedia.iso.boxes.ChunkOffsetBox", "", "", "", "java.lang.String"));
    }

    public abstract long[] getChunkOffsets();

    public abstract void setChunkOffsets(long[] jArr);

    public String toString() {
        o0y c = whq.c(ajc$tjp_0, this, this);
        w8g0.a();
        w8g0.b(c);
        StringBuilder sb = new StringBuilder(getClass().getSimpleName());
        sb.append("[entryCount=");
        return h5s.c(getChunkOffsets().length, X3.j.e, sb);
    }
}
