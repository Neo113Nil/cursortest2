package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractFullBox;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;
import xsna.aqw;
import xsna.crx0;
import xsna.ms9;
import xsna.n0y;
import xsna.o0y;
import xsna.ojp0;
import xsna.up2;
import xsna.w8g0;
import xsna.whq;

/* loaded from: classes12.dex */
public class EditListBox extends AbstractFullBox {
    public static final String TYPE = "elst";
    private static final /* synthetic */ n0y ajc$tjp_0 = null;
    private static final /* synthetic */ n0y ajc$tjp_1 = null;
    private static final /* synthetic */ n0y ajc$tjp_2 = null;
    private List<a> entries;

    public static class a {
        public EditListBox a;
        public long b;
        public long c;
        public double d;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.c == aVar.c && this.b == aVar.b;
        }

        public final int hashCode() {
            long j = this.b;
            int i = ((int) (j ^ (j >>> 32))) * 31;
            long j2 = this.c;
            return i + ((int) ((j2 >>> 32) ^ j2));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Entry{segmentDuration=");
            sb.append(this.b);
            sb.append(", mediaTime=");
            sb.append(this.c);
            sb.append(", mediaRate=");
            return ojp0.a(sb, this.d, '}');
        }
    }

    static {
        ajc$preClinit();
    }

    public EditListBox() {
        super(TYPE);
        this.entries = new LinkedList();
    }

    private static /* synthetic */ void ajc$preClinit() {
        whq whqVar = new whq("EditListBox.java", EditListBox.class);
        ajc$tjp_0 = whqVar.f(whqVar.e("getEntries", "com.coremedia.iso.boxes.EditListBox", "", "", "", "java.util.List"));
        ajc$tjp_1 = whqVar.f(whqVar.e("setEntries", "com.coremedia.iso.boxes.EditListBox", "java.util.List", "entries", "", "void"));
        ajc$tjp_2 = whqVar.f(whqVar.e("toString", "com.coremedia.iso.boxes.EditListBox", "", "", "", "java.lang.String"));
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        int p = up2.p(crx0.w(byteBuffer));
        this.entries = new LinkedList();
        for (int i = 0; i < p; i++) {
            List<a> list = this.entries;
            a aVar = new a();
            if (getVersion() == 1) {
                aVar.b = crx0.x(byteBuffer);
                aVar.c = byteBuffer.getLong();
                aVar.d = crx0.p(byteBuffer);
            } else {
                aVar.b = crx0.w(byteBuffer);
                aVar.c = byteBuffer.getInt();
                aVar.d = crx0.p(byteBuffer);
            }
            aVar.a = this;
            list.add(aVar);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.putInt(this.entries.size());
        for (a aVar : this.entries) {
            long j = aVar.c;
            long j2 = aVar.b;
            if (aVar.a.getVersion() == 1) {
                byteBuffer.putLong(j2);
                byteBuffer.putLong(j);
            } else {
                byteBuffer.putInt(up2.p(j2));
                byteBuffer.putInt(up2.p(j));
            }
            aqw.r(byteBuffer, aVar.d);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return (getVersion() == 1 ? this.entries.size() * 20 : this.entries.size() * 12) + 8;
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
        return ms9.a('}', new StringBuilder("EditListBox{entries="), this.entries);
    }
}
