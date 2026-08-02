package com.googlecode.mp4parser.boxes.threegpp26244;

import com.googlecode.mp4parser.AbstractFullBox;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import xsna.aqw;
import xsna.crx0;
import xsna.lb7;
import xsna.mb7;
import xsna.n0y;
import xsna.o0y;
import xsna.vu5;
import xsna.w8g0;
import xsna.whq;

/* loaded from: classes13.dex */
public class SegmentIndexBox extends AbstractFullBox {
    public static final String TYPE = "sidx";
    private static final /* synthetic */ n0y ajc$tjp_0 = null;
    private static final /* synthetic */ n0y ajc$tjp_1 = null;
    private static final /* synthetic */ n0y ajc$tjp_10 = null;
    private static final /* synthetic */ n0y ajc$tjp_11 = null;
    private static final /* synthetic */ n0y ajc$tjp_12 = null;
    private static final /* synthetic */ n0y ajc$tjp_2 = null;
    private static final /* synthetic */ n0y ajc$tjp_3 = null;
    private static final /* synthetic */ n0y ajc$tjp_4 = null;
    private static final /* synthetic */ n0y ajc$tjp_5 = null;
    private static final /* synthetic */ n0y ajc$tjp_6 = null;
    private static final /* synthetic */ n0y ajc$tjp_7 = null;
    private static final /* synthetic */ n0y ajc$tjp_8 = null;
    private static final /* synthetic */ n0y ajc$tjp_9 = null;
    long earliestPresentationTime;
    List<a> entries;
    long firstOffset;
    long referenceId;
    int reserved;
    long timeScale;

    public static class a {
        public byte a;
        public int b;
        public long c;
        public byte d;
        public byte e;
        public int f;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.f == aVar.f && this.e == aVar.e && this.d == aVar.d && this.c == aVar.c;
        }

        public final int hashCode() {
            int i = ((this.a * 31) + this.b) * 31;
            long j = this.c;
            return ((((((i + ((int) (j ^ (j >>> 32)))) * 31) + this.d) * 31) + this.e) * 31) + this.f;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Entry{referenceType=");
            sb.append((int) this.a);
            sb.append(", referencedSize=");
            sb.append(this.b);
            sb.append(", subsegmentDuration=");
            sb.append(this.c);
            sb.append(", startsWithSap=");
            sb.append((int) this.d);
            sb.append(", sapType=");
            sb.append((int) this.e);
            sb.append(", sapDeltaTime=");
            return vu5.b(sb, this.f, '}');
        }
    }

    static {
        ajc$preClinit();
    }

    public SegmentIndexBox() {
        super(TYPE);
        this.entries = new ArrayList();
    }

    private static /* synthetic */ void ajc$preClinit() {
        whq whqVar = new whq("SegmentIndexBox.java", SegmentIndexBox.class);
        ajc$tjp_0 = whqVar.f(whqVar.e("getEntries", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "", "", "", "java.util.List"));
        ajc$tjp_1 = whqVar.f(whqVar.e("setEntries", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "java.util.List", "entries", "", "void"));
        ajc$tjp_10 = whqVar.f(whqVar.e("getReserved", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "", "", "", "int"));
        ajc$tjp_11 = whqVar.f(whqVar.e("setReserved", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "int", "reserved", "", "void"));
        ajc$tjp_12 = whqVar.f(whqVar.e("toString", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "", "", "", "java.lang.String"));
        ajc$tjp_2 = whqVar.f(whqVar.e("getReferenceId", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "", "", "", "long"));
        ajc$tjp_3 = whqVar.f(whqVar.e("setReferenceId", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "long", "referenceId", "", "void"));
        ajc$tjp_4 = whqVar.f(whqVar.e("getTimeScale", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "", "", "", "long"));
        ajc$tjp_5 = whqVar.f(whqVar.e("setTimeScale", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "long", "timeScale", "", "void"));
        ajc$tjp_6 = whqVar.f(whqVar.e("getEarliestPresentationTime", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "", "", "", "long"));
        ajc$tjp_7 = whqVar.f(whqVar.e("setEarliestPresentationTime", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "long", "earliestPresentationTime", "", "void"));
        ajc$tjp_8 = whqVar.f(whqVar.e("getFirstOffset", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "", "", "", "long"));
        ajc$tjp_9 = whqVar.f(whqVar.e("setFirstOffset", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "long", "firstOffset", "", "void"));
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.referenceId = crx0.w(byteBuffer);
        this.timeScale = crx0.w(byteBuffer);
        if (getVersion() == 0) {
            this.earliestPresentationTime = crx0.w(byteBuffer);
            this.firstOffset = crx0.w(byteBuffer);
        } else {
            this.earliestPresentationTime = crx0.x(byteBuffer);
            this.firstOffset = crx0.x(byteBuffer);
        }
        this.reserved = crx0.u(byteBuffer);
        int u = crx0.u(byteBuffer);
        for (int i = 0; i < u; i++) {
            lb7 lb7Var = new lb7(byteBuffer);
            a aVar = new a();
            aVar.a = (byte) lb7Var.a(1);
            aVar.b = lb7Var.a(31);
            aVar.c = crx0.w(byteBuffer);
            lb7 lb7Var2 = new lb7(byteBuffer);
            aVar.d = (byte) lb7Var2.a(1);
            aVar.e = (byte) lb7Var2.a(3);
            aVar.f = lb7Var2.a(28);
            this.entries.add(aVar);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.putInt((int) this.referenceId);
        byteBuffer.putInt((int) this.timeScale);
        if (getVersion() == 0) {
            byteBuffer.putInt((int) this.earliestPresentationTime);
            byteBuffer.putInt((int) this.firstOffset);
        } else {
            byteBuffer.putLong(this.earliestPresentationTime);
            byteBuffer.putLong(this.firstOffset);
        }
        aqw.u(this.reserved, byteBuffer);
        aqw.u(this.entries.size(), byteBuffer);
        for (a aVar : this.entries) {
            mb7 mb7Var = new mb7(byteBuffer);
            mb7Var.a(aVar.a, 1);
            mb7Var.a(aVar.b, 31);
            byteBuffer.putInt((int) aVar.c);
            mb7 mb7Var2 = new mb7(byteBuffer);
            mb7Var2.a(aVar.d, 1);
            mb7Var2.a(aVar.e, 3);
            mb7Var2.a(aVar.f, 28);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return (getVersion() == 0 ? 8 : 16) + 16 + (this.entries.size() * 12);
    }

    public long getEarliestPresentationTime() {
        o0y c = whq.c(ajc$tjp_6, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.earliestPresentationTime;
    }

    public List<a> getEntries() {
        o0y c = whq.c(ajc$tjp_0, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.entries;
    }

    public long getFirstOffset() {
        o0y c = whq.c(ajc$tjp_8, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.firstOffset;
    }

    public long getReferenceId() {
        o0y c = whq.c(ajc$tjp_2, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.referenceId;
    }

    public int getReserved() {
        o0y c = whq.c(ajc$tjp_10, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.reserved;
    }

    public long getTimeScale() {
        o0y c = whq.c(ajc$tjp_4, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.timeScale;
    }

    public void setEarliestPresentationTime(long j) {
        o0y d = whq.d(ajc$tjp_7, this, this, new Long(j));
        w8g0.a();
        w8g0.b(d);
        this.earliestPresentationTime = j;
    }

    public void setEntries(List<a> list) {
        o0y d = whq.d(ajc$tjp_1, this, this, list);
        w8g0.a();
        w8g0.b(d);
        this.entries = list;
    }

    public void setFirstOffset(long j) {
        o0y d = whq.d(ajc$tjp_9, this, this, new Long(j));
        w8g0.a();
        w8g0.b(d);
        this.firstOffset = j;
    }

    public void setReferenceId(long j) {
        o0y d = whq.d(ajc$tjp_3, this, this, new Long(j));
        w8g0.a();
        w8g0.b(d);
        this.referenceId = j;
    }

    public void setReserved(int i) {
        o0y d = whq.d(ajc$tjp_11, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.reserved = i;
    }

    public void setTimeScale(long j) {
        o0y d = whq.d(ajc$tjp_5, this, this, new Long(j));
        w8g0.a();
        w8g0.b(d);
        this.timeScale = j;
    }

    public String toString() {
        o0y c = whq.c(ajc$tjp_12, this, this);
        w8g0.a();
        w8g0.b(c);
        StringBuilder sb = new StringBuilder("SegmentIndexBox{entries=");
        sb.append(this.entries);
        sb.append(", referenceId=");
        sb.append(this.referenceId);
        sb.append(", timeScale=");
        sb.append(this.timeScale);
        sb.append(", earliestPresentationTime=");
        sb.append(this.earliestPresentationTime);
        sb.append(", firstOffset=");
        sb.append(this.firstOffset);
        sb.append(", reserved=");
        return vu5.b(sb, this.reserved, '}');
    }
}
