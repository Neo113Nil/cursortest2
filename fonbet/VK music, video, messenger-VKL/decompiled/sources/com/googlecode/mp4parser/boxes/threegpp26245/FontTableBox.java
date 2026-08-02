package com.googlecode.mp4parser.boxes.threegpp26245;

import com.googlecode.mp4parser.AbstractBox;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import xsna.aqw;
import xsna.crx0;
import xsna.i5s;
import xsna.imj0;
import xsna.n0y;
import xsna.o0y;
import xsna.w8g0;
import xsna.whq;

/* loaded from: classes13.dex */
public class FontTableBox extends AbstractBox {
    public static final String TYPE = "ftab";
    private static final /* synthetic */ n0y ajc$tjp_0 = null;
    private static final /* synthetic */ n0y ajc$tjp_1 = null;
    List<a> entries;

    public static class a {
        public int a;
        public String b;

        public final String toString() {
            StringBuilder sb = new StringBuilder("FontRecord{fontId=");
            sb.append(this.a);
            sb.append(", fontname='");
            return i5s.a(sb, this.b, "'}");
        }
    }

    static {
        ajc$preClinit();
    }

    public FontTableBox() {
        super(TYPE);
        this.entries = new LinkedList();
    }

    private static /* synthetic */ void ajc$preClinit() {
        whq whqVar = new whq("FontTableBox.java", FontTableBox.class);
        ajc$tjp_0 = whqVar.f(whqVar.e("getEntries", "com.googlecode.mp4parser.boxes.threegpp26245.FontTableBox", "", "", "", "java.util.List"));
        ajc$tjp_1 = whqVar.f(whqVar.e("setEntries", "com.googlecode.mp4parser.boxes.threegpp26245.FontTableBox", "java.util.List", "entries", "", "void"));
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        int u = crx0.u(byteBuffer);
        for (int i = 0; i < u; i++) {
            a aVar = new a();
            aVar.a = crx0.u(byteBuffer);
            aVar.b = crx0.s(crx0.e(byteBuffer.get()), byteBuffer);
            this.entries.add(aVar);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        aqw.u(this.entries.size(), byteBuffer);
        for (a aVar : this.entries) {
            aqw.u(aVar.a, byteBuffer);
            byteBuffer.put((byte) (aVar.b.length() & 255));
            byteBuffer.put(imj0.b(aVar.b));
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        Iterator<a> it = this.entries.iterator();
        int i = 2;
        while (it.hasNext()) {
            i += imj0.j(it.next().b) + 3;
        }
        return i;
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
}
