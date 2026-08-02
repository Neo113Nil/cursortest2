package com.googlecode.mp4parser.boxes.mp4.samplegrouping;

import com.googlecode.mp4parser.AbstractFullBox;
import java.nio.ByteBuffer;
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

/* loaded from: classes13.dex */
public class SampleToGroupBox extends AbstractFullBox {
    public static final String TYPE = "sbgp";
    private static final /* synthetic */ n0y ajc$tjp_0 = null;
    private static final /* synthetic */ n0y ajc$tjp_1 = null;
    private static final /* synthetic */ n0y ajc$tjp_2 = null;
    private static final /* synthetic */ n0y ajc$tjp_3 = null;
    private static final /* synthetic */ n0y ajc$tjp_4 = null;
    private static final /* synthetic */ n0y ajc$tjp_5 = null;
    List<a> entries;
    private String groupingType;
    private String groupingTypeParameter;

    public static class a {
        public long a;
        public final int b;

        public a(long j, int i) {
            this.a = j;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.b == aVar.b && this.a == aVar.a;
        }

        public final int hashCode() {
            long j = this.a;
            return (((int) (j ^ (j >>> 32))) * 31) + this.b;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Entry{sampleCount=");
            sb.append(this.a);
            sb.append(", groupDescriptionIndex=");
            return vu5.b(sb, this.b, '}');
        }
    }

    static {
        ajc$preClinit();
    }

    public SampleToGroupBox() {
        super(TYPE);
        this.entries = new LinkedList();
    }

    private static /* synthetic */ void ajc$preClinit() {
        whq whqVar = new whq("SampleToGroupBox.java", SampleToGroupBox.class);
        ajc$tjp_0 = whqVar.f(whqVar.e("getGroupingType", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox", "", "", "", "java.lang.String"));
        ajc$tjp_1 = whqVar.f(whqVar.e("setGroupingType", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox", "java.lang.String", "groupingType", "", "void"));
        ajc$tjp_2 = whqVar.f(whqVar.e("getGroupingTypeParameter", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox", "", "", "", "java.lang.String"));
        ajc$tjp_3 = whqVar.f(whqVar.e("setGroupingTypeParameter", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox", "java.lang.String", "groupingTypeParameter", "", "void"));
        ajc$tjp_4 = whqVar.f(whqVar.e("getEntries", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox", "", "", "", "java.util.List"));
        ajc$tjp_5 = whqVar.f(whqVar.e("setEntries", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox", "java.util.List", "entries", "", "void"));
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.groupingType = crx0.n(byteBuffer);
        if (getVersion() == 1) {
            this.groupingTypeParameter = crx0.n(byteBuffer);
        }
        long w = crx0.w(byteBuffer);
        while (true) {
            long j = w - 1;
            if (w <= 0) {
                return;
            }
            this.entries.add(new a(up2.p(crx0.w(byteBuffer)), up2.p(crx0.w(byteBuffer))));
            w = j;
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.put(this.groupingType.getBytes());
        if (getVersion() == 1) {
            byteBuffer.put(this.groupingTypeParameter.getBytes());
        }
        byteBuffer.putInt(this.entries.size());
        Iterator<a> it = this.entries.iterator();
        while (it.hasNext()) {
            byteBuffer.putInt((int) it.next().a);
            byteBuffer.putInt(r1.b);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return getVersion() == 1 ? (this.entries.size() * 8) + 16 : (this.entries.size() * 8) + 12;
    }

    public List<a> getEntries() {
        o0y c = whq.c(ajc$tjp_4, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.entries;
    }

    public String getGroupingType() {
        o0y c = whq.c(ajc$tjp_0, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.groupingType;
    }

    public String getGroupingTypeParameter() {
        o0y c = whq.c(ajc$tjp_2, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.groupingTypeParameter;
    }

    public void setEntries(List<a> list) {
        o0y d = whq.d(ajc$tjp_5, this, this, list);
        w8g0.a();
        w8g0.b(d);
        this.entries = list;
    }

    public void setGroupingType(String str) {
        o0y d = whq.d(ajc$tjp_1, this, this, str);
        w8g0.a();
        w8g0.b(d);
        this.groupingType = str;
    }

    public void setGroupingTypeParameter(String str) {
        o0y d = whq.d(ajc$tjp_3, this, this, str);
        w8g0.a();
        w8g0.b(d);
        this.groupingTypeParameter = str;
    }
}
