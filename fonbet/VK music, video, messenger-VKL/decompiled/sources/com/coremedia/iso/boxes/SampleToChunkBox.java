package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractFullBox;
import com.ironsource.X3;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import xsna.crx0;
import xsna.n0y;
import xsna.o0y;
import xsna.up2;
import xsna.vu5;
import xsna.w8g0;
import xsna.whq;

/* loaded from: classes12.dex */
public class SampleToChunkBox extends AbstractFullBox {
    public static final String TYPE = "stsc";
    private static final /* synthetic */ n0y ajc$tjp_0 = null;
    private static final /* synthetic */ n0y ajc$tjp_1 = null;
    private static final /* synthetic */ n0y ajc$tjp_2 = null;
    private static final /* synthetic */ n0y ajc$tjp_3 = null;
    List<a> entries;

    public static class a {
        public final long a;
        public final long b;
        public final long c;

        public a(long j, long j2, long j3) {
            this.a = j;
            this.b = j2;
            this.c = j3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.c == aVar.c && this.b == aVar.b;
        }

        public final int hashCode() {
            long j = this.a;
            long j2 = this.b;
            int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.c;
            return i + ((int) ((j3 >>> 32) ^ j3));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Entry{firstChunk=");
            sb.append(this.a);
            sb.append(", samplesPerChunk=");
            sb.append(this.b);
            sb.append(", sampleDescriptionIndex=");
            return vu5.a('}', this.c, sb);
        }
    }

    static {
        ajc$preClinit();
    }

    public SampleToChunkBox() {
        super(TYPE);
        this.entries = Collections.EMPTY_LIST;
    }

    private static /* synthetic */ void ajc$preClinit() {
        whq whqVar = new whq("SampleToChunkBox.java", SampleToChunkBox.class);
        ajc$tjp_0 = whqVar.f(whqVar.e("getEntries", "com.coremedia.iso.boxes.SampleToChunkBox", "", "", "", "java.util.List"));
        ajc$tjp_1 = whqVar.f(whqVar.e("setEntries", "com.coremedia.iso.boxes.SampleToChunkBox", "java.util.List", "entries", "", "void"));
        ajc$tjp_2 = whqVar.f(whqVar.e("toString", "com.coremedia.iso.boxes.SampleToChunkBox", "", "", "", "java.lang.String"));
        ajc$tjp_3 = whqVar.f(whqVar.e("blowup", "com.coremedia.iso.boxes.SampleToChunkBox", "int", "chunkCount", "", "[J"));
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        int p = up2.p(crx0.w(byteBuffer));
        this.entries = new ArrayList(p);
        for (int i = 0; i < p; i++) {
            this.entries.add(new a(crx0.w(byteBuffer), crx0.w(byteBuffer), crx0.w(byteBuffer)));
        }
    }

    public long[] blowup(int i) {
        o0y d = whq.d(ajc$tjp_3, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        long[] jArr = new long[i];
        LinkedList linkedList = new LinkedList(this.entries);
        Collections.reverse(linkedList);
        Iterator it = linkedList.iterator();
        a aVar = (a) it.next();
        while (i > 1) {
            jArr[i - 1] = aVar.b;
            if (i == aVar.a) {
                aVar = (a) it.next();
            }
            i--;
        }
        jArr[0] = aVar.b;
        return jArr;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.putInt(this.entries.size());
        for (a aVar : this.entries) {
            byteBuffer.putInt((int) aVar.a);
            byteBuffer.putInt((int) aVar.b);
            byteBuffer.putInt((int) aVar.c);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return (this.entries.size() * 12) + 8;
    }

    public List<a> getEntries() {
        o0y c = whq.c(ajc$tjp_0, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.entries;
    }

    public void setEntries(List<a> list) {
        o0y d = whq.d(ajc$tjp_1, this, this, list);
        w8g0.a();
        w8g0.b(d);
        this.entries = list;
    }

    public String toString() {
        o0y c = whq.c(ajc$tjp_2, this, this);
        w8g0.a();
        w8g0.b(c);
        return "SampleToChunkBox[entryCount=" + this.entries.size() + X3.j.e;
    }
}
