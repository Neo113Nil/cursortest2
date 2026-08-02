package com.coremedia.iso.boxes.fragment;

import com.googlecode.mp4parser.AbstractFullBox;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import xsna.ad0;
import xsna.crx0;
import xsna.cvk;
import xsna.ms9;
import xsna.n0y;
import xsna.o0y;
import xsna.vu5;
import xsna.w8g0;
import xsna.whq;

/* loaded from: classes12.dex */
public class TrackFragmentRandomAccessBox extends AbstractFullBox {
    public static final String TYPE = "tfra";
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
    private List<a> entries;
    private int lengthSizeOfSampleNum;
    private int lengthSizeOfTrafNum;
    private int lengthSizeOfTrunNum;
    private int reserved;
    private long trackId;

    public static class a {
        public long a;
        public long b;
        public long c;
        public long d;
        public long e;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.b == aVar.b && this.e == aVar.e && this.a == aVar.a && this.c == aVar.c && this.d == aVar.d;
        }

        public final int hashCode() {
            long j = this.a;
            long j2 = this.b;
            int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.c;
            int i2 = (i + ((int) (j3 ^ (j3 >>> 32)))) * 31;
            long j4 = this.d;
            int i3 = (i2 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
            long j5 = this.e;
            return i3 + ((int) ((j5 >>> 32) ^ j5));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Entry{time=");
            sb.append(this.a);
            sb.append(", moofOffset=");
            sb.append(this.b);
            sb.append(", trafNumber=");
            sb.append(this.c);
            sb.append(", trunNumber=");
            sb.append(this.d);
            sb.append(", sampleNumber=");
            return vu5.a('}', this.e, sb);
        }
    }

    static {
        ajc$preClinit();
    }

    public TrackFragmentRandomAccessBox() {
        super(TYPE);
        this.lengthSizeOfTrafNum = 2;
        this.lengthSizeOfTrunNum = 2;
        this.lengthSizeOfSampleNum = 2;
        this.entries = Collections.EMPTY_LIST;
    }

    private static /* synthetic */ void ajc$preClinit() {
        whq whqVar = new whq("TrackFragmentRandomAccessBox.java", TrackFragmentRandomAccessBox.class);
        ajc$tjp_0 = whqVar.f(whqVar.e("setTrackId", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "long", "trackId", "", "void"));
        ajc$tjp_1 = whqVar.f(whqVar.e("setLengthSizeOfTrafNum", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "int", "lengthSizeOfTrafNum", "", "void"));
        ajc$tjp_10 = whqVar.f(whqVar.e("getEntries", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", "java.util.List"));
        ajc$tjp_11 = whqVar.f(whqVar.e("setEntries", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "java.util.List", "entries", "", "void"));
        ajc$tjp_12 = whqVar.f(whqVar.e("toString", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", "java.lang.String"));
        ajc$tjp_2 = whqVar.f(whqVar.e("setLengthSizeOfTrunNum", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "int", "lengthSizeOfTrunNum", "", "void"));
        ajc$tjp_3 = whqVar.f(whqVar.e("setLengthSizeOfSampleNum", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "int", "lengthSizeOfSampleNum", "", "void"));
        ajc$tjp_4 = whqVar.f(whqVar.e("getTrackId", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", "long"));
        ajc$tjp_5 = whqVar.f(whqVar.e("getReserved", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", "int"));
        ajc$tjp_6 = whqVar.f(whqVar.e("getLengthSizeOfTrafNum", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", "int"));
        ajc$tjp_7 = whqVar.f(whqVar.e("getLengthSizeOfTrunNum", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", "int"));
        ajc$tjp_8 = whqVar.f(whqVar.e("getLengthSizeOfSampleNum", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", "int"));
        ajc$tjp_9 = whqVar.f(whqVar.e("getNumberOfEntries", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", "long"));
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.trackId = crx0.w(byteBuffer);
        long w = crx0.w(byteBuffer);
        this.reserved = (int) (w >> 6);
        this.lengthSizeOfTrafNum = (((int) (63 & w)) >> 4) + 1;
        this.lengthSizeOfTrunNum = (((int) (12 & w)) >> 2) + 1;
        this.lengthSizeOfSampleNum = ((int) (w & 3)) + 1;
        long w2 = crx0.w(byteBuffer);
        this.entries = new ArrayList();
        for (int i = 0; i < w2; i++) {
            a aVar = new a();
            if (getVersion() == 1) {
                aVar.a = crx0.x(byteBuffer);
                aVar.b = crx0.x(byteBuffer);
            } else {
                aVar.a = crx0.w(byteBuffer);
                aVar.b = crx0.w(byteBuffer);
            }
            aVar.c = cvk.s(this.lengthSizeOfTrafNum, byteBuffer);
            aVar.d = cvk.s(this.lengthSizeOfTrunNum, byteBuffer);
            aVar.e = cvk.s(this.lengthSizeOfSampleNum, byteBuffer);
            this.entries.add(aVar);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.putInt((int) this.trackId);
        byteBuffer.putInt((int) ((this.reserved << 6) | (((this.lengthSizeOfTrafNum - 1) & 3) << 4) | (((this.lengthSizeOfTrunNum - 1) & 3) << 2) | ((this.lengthSizeOfSampleNum - 1) & 3)));
        byteBuffer.putInt(this.entries.size());
        for (a aVar : this.entries) {
            if (getVersion() == 1) {
                byteBuffer.putLong(aVar.a);
                byteBuffer.putLong(aVar.b);
            } else {
                byteBuffer.putInt((int) aVar.a);
                byteBuffer.putInt((int) aVar.b);
            }
            ad0.L(aVar.c, this.lengthSizeOfTrafNum, byteBuffer);
            ad0.L(aVar.d, this.lengthSizeOfTrunNum, byteBuffer);
            ad0.L(aVar.e, this.lengthSizeOfSampleNum, byteBuffer);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return 16 + (getVersion() == 1 ? this.entries.size() * 16 : this.entries.size() * 8) + (this.entries.size() * this.lengthSizeOfTrafNum) + (this.entries.size() * this.lengthSizeOfTrunNum) + (this.entries.size() * this.lengthSizeOfSampleNum);
    }

    public List<a> getEntries() {
        o0y c = whq.c(ajc$tjp_10, this, this);
        w8g0.a();
        w8g0.b(c);
        return Collections.unmodifiableList(this.entries);
    }

    public int getLengthSizeOfSampleNum() {
        o0y c = whq.c(ajc$tjp_8, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.lengthSizeOfSampleNum;
    }

    public int getLengthSizeOfTrafNum() {
        o0y c = whq.c(ajc$tjp_6, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.lengthSizeOfTrafNum;
    }

    public int getLengthSizeOfTrunNum() {
        o0y c = whq.c(ajc$tjp_7, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.lengthSizeOfTrunNum;
    }

    public long getNumberOfEntries() {
        o0y c = whq.c(ajc$tjp_9, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.entries.size();
    }

    public int getReserved() {
        o0y c = whq.c(ajc$tjp_5, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.reserved;
    }

    public long getTrackId() {
        o0y c = whq.c(ajc$tjp_4, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.trackId;
    }

    public void setEntries(List<a> list) {
        o0y d = whq.d(ajc$tjp_11, this, this, list);
        w8g0.a();
        w8g0.b(d);
        this.entries = list;
    }

    public void setLengthSizeOfSampleNum(int i) {
        o0y d = whq.d(ajc$tjp_3, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.lengthSizeOfSampleNum = i;
    }

    public void setLengthSizeOfTrafNum(int i) {
        o0y d = whq.d(ajc$tjp_1, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.lengthSizeOfTrafNum = i;
    }

    public void setLengthSizeOfTrunNum(int i) {
        o0y d = whq.d(ajc$tjp_2, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.lengthSizeOfTrunNum = i;
    }

    public void setTrackId(long j) {
        o0y d = whq.d(ajc$tjp_0, this, this, new Long(j));
        w8g0.a();
        w8g0.b(d);
        this.trackId = j;
    }

    public String toString() {
        o0y c = whq.c(ajc$tjp_12, this, this);
        w8g0.a();
        w8g0.b(c);
        StringBuilder sb = new StringBuilder("TrackFragmentRandomAccessBox{trackId=");
        sb.append(this.trackId);
        sb.append(", entries=");
        return ms9.a('}', sb, this.entries);
    }
}
