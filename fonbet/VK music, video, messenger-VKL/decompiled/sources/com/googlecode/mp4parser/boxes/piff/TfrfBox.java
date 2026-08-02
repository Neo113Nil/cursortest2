package com.googlecode.mp4parser.boxes.piff;

import com.googlecode.mp4parser.AbstractFullBox;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import xsna.aqw;
import xsna.crx0;
import xsna.ms9;
import xsna.n0y;
import xsna.o0y;
import xsna.vu5;
import xsna.w8g0;
import xsna.whq;

/* loaded from: classes13.dex */
public class TfrfBox extends AbstractFullBox {
    private static final /* synthetic */ n0y ajc$tjp_0 = null;
    private static final /* synthetic */ n0y ajc$tjp_1 = null;
    private static final /* synthetic */ n0y ajc$tjp_2 = null;
    public List<a> entries;

    public class a {
        public long a;
        public long b;

        public final String toString() {
            StringBuilder sb = new StringBuilder("Entry{fragmentAbsoluteTime=");
            sb.append(this.a);
            sb.append(", fragmentAbsoluteDuration=");
            return vu5.a('}', this.b, sb);
        }
    }

    static {
        ajc$preClinit();
    }

    public TfrfBox() {
        super("uuid");
        this.entries = new ArrayList();
    }

    private static /* synthetic */ void ajc$preClinit() {
        whq whqVar = new whq("TfrfBox.java", TfrfBox.class);
        ajc$tjp_0 = whqVar.f(whqVar.e("getFragmentCount", "com.googlecode.mp4parser.boxes.piff.TfrfBox", "", "", "", "long"));
        ajc$tjp_1 = whqVar.f(whqVar.e("getEntries", "com.googlecode.mp4parser.boxes.piff.TfrfBox", "", "", "", "java.util.List"));
        ajc$tjp_2 = whqVar.f(whqVar.e("toString", "com.googlecode.mp4parser.boxes.piff.TfrfBox", "", "", "", "java.lang.String"));
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        int y = crx0.y(byteBuffer);
        for (int i = 0; i < y; i++) {
            a aVar = new a();
            if (getVersion() == 1) {
                aVar.a = crx0.x(byteBuffer);
                aVar.b = crx0.x(byteBuffer);
            } else {
                aVar.a = crx0.w(byteBuffer);
                aVar.b = crx0.w(byteBuffer);
            }
            this.entries.add(aVar);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        aqw.w(this.entries.size(), byteBuffer);
        for (a aVar : this.entries) {
            if (getVersion() == 1) {
                byteBuffer.putLong(aVar.a);
                byteBuffer.putLong(aVar.b);
            } else {
                byteBuffer.putInt((int) aVar.a);
                byteBuffer.putInt((int) aVar.b);
            }
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return (this.entries.size() * (getVersion() == 1 ? 16 : 8)) + 5;
    }

    public List<a> getEntries() {
        o0y c = whq.c(ajc$tjp_1, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.entries;
    }

    public long getFragmentCount() {
        o0y c = whq.c(ajc$tjp_0, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.entries.size();
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public byte[] getUserType() {
        return new byte[]{-44, Byte.MIN_VALUE, 126, -14, -54, 57, 70, -107, -114, 84, 38, -53, -98, 70, -89, -97};
    }

    public String toString() {
        o0y c = whq.c(ajc$tjp_2, this, this);
        w8g0.a();
        w8g0.b(c);
        return ms9.a('}', new StringBuilder("TfrfBox{entries="), this.entries);
    }
}
