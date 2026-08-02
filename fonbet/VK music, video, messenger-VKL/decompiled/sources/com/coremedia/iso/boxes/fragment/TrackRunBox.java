package com.coremedia.iso.boxes.fragment;

import com.googlecode.mp4parser.AbstractFullBox;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import xsna.crx0;
import xsna.h0h0;
import xsna.n0y;
import xsna.o0y;
import xsna.up2;
import xsna.vu5;
import xsna.w8g0;
import xsna.whq;

/* loaded from: classes12.dex */
public class TrackRunBox extends AbstractFullBox {
    public static final String TYPE = "trun";
    private static final /* synthetic */ n0y ajc$tjp_0 = null;
    private static final /* synthetic */ n0y ajc$tjp_1 = null;
    private static final /* synthetic */ n0y ajc$tjp_10 = null;
    private static final /* synthetic */ n0y ajc$tjp_11 = null;
    private static final /* synthetic */ n0y ajc$tjp_12 = null;
    private static final /* synthetic */ n0y ajc$tjp_13 = null;
    private static final /* synthetic */ n0y ajc$tjp_14 = null;
    private static final /* synthetic */ n0y ajc$tjp_15 = null;
    private static final /* synthetic */ n0y ajc$tjp_16 = null;
    private static final /* synthetic */ n0y ajc$tjp_17 = null;
    private static final /* synthetic */ n0y ajc$tjp_18 = null;
    private static final /* synthetic */ n0y ajc$tjp_19 = null;
    private static final /* synthetic */ n0y ajc$tjp_2 = null;
    private static final /* synthetic */ n0y ajc$tjp_3 = null;
    private static final /* synthetic */ n0y ajc$tjp_4 = null;
    private static final /* synthetic */ n0y ajc$tjp_5 = null;
    private static final /* synthetic */ n0y ajc$tjp_6 = null;
    private static final /* synthetic */ n0y ajc$tjp_7 = null;
    private static final /* synthetic */ n0y ajc$tjp_8 = null;
    private static final /* synthetic */ n0y ajc$tjp_9 = null;
    private int dataOffset;
    private List<a> entries;
    private h0h0 firstSampleFlags;

    public static class a {
        public long a;
        public long b;
        public h0h0 c;
        public long d;

        public final String toString() {
            StringBuilder sb = new StringBuilder("Entry{duration=");
            sb.append(this.a);
            sb.append(", size=");
            sb.append(this.b);
            sb.append(", dlags=");
            sb.append(this.c);
            sb.append(", compTimeOffset=");
            return vu5.a('}', this.d, sb);
        }
    }

    static {
        ajc$preClinit();
    }

    public TrackRunBox() {
        super(TYPE);
        this.entries = new ArrayList();
    }

    private static /* synthetic */ void ajc$preClinit() {
        whq whqVar = new whq("TrackRunBox.java", TrackRunBox.class);
        ajc$tjp_0 = whqVar.f(whqVar.e("getEntries", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "java.util.List"));
        ajc$tjp_1 = whqVar.f(whqVar.e("setDataOffset", "com.coremedia.iso.boxes.fragment.TrackRunBox", "int", "dataOffset", "", "void"));
        ajc$tjp_10 = whqVar.f(whqVar.e("setDataOffsetPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "boolean", "v", "", "void"));
        ajc$tjp_11 = whqVar.f(whqVar.e("setSampleSizePresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "boolean", "v", "", "void"));
        ajc$tjp_12 = whqVar.f(whqVar.e("setSampleDurationPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "boolean", "v", "", "void"));
        ajc$tjp_13 = whqVar.f(whqVar.e("setSampleFlagsPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "boolean", "v", "", "void"));
        ajc$tjp_14 = whqVar.f(whqVar.e("setSampleCompositionTimeOffsetPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "boolean", "v", "", "void"));
        ajc$tjp_15 = whqVar.f(whqVar.e("getDataOffset", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "int"));
        ajc$tjp_16 = whqVar.f(whqVar.e("getFirstSampleFlags", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "com.coremedia.iso.boxes.fragment.SampleFlags"));
        ajc$tjp_17 = whqVar.f(whqVar.e("setFirstSampleFlags", "com.coremedia.iso.boxes.fragment.TrackRunBox", "com.coremedia.iso.boxes.fragment.SampleFlags", "firstSampleFlags", "", "void"));
        ajc$tjp_18 = whqVar.f(whqVar.e("toString", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "java.lang.String"));
        ajc$tjp_19 = whqVar.f(whqVar.e("setEntries", "com.coremedia.iso.boxes.fragment.TrackRunBox", "java.util.List", "entries", "", "void"));
        ajc$tjp_2 = whqVar.f(whqVar.e("getSampleCompositionTimeOffsets", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "[J"));
        ajc$tjp_3 = whqVar.f(whqVar.e("getSampleCount", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "long"));
        ajc$tjp_4 = whqVar.f(whqVar.e("isDataOffsetPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "boolean"));
        ajc$tjp_5 = whqVar.f(whqVar.e("isFirstSampleFlagsPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "boolean"));
        ajc$tjp_6 = whqVar.f(whqVar.e("isSampleSizePresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "boolean"));
        ajc$tjp_7 = whqVar.f(whqVar.e("isSampleDurationPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "boolean"));
        ajc$tjp_8 = whqVar.f(whqVar.e("isSampleFlagsPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "boolean"));
        ajc$tjp_9 = whqVar.f(whqVar.e("isSampleCompositionTimeOffsetPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "boolean"));
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        long w = crx0.w(byteBuffer);
        if ((getFlags() & 1) == 1) {
            this.dataOffset = up2.p(crx0.w(byteBuffer));
        } else {
            this.dataOffset = -1;
        }
        if ((getFlags() & 4) == 4) {
            this.firstSampleFlags = new h0h0(byteBuffer);
        }
        for (int i = 0; i < w; i++) {
            a aVar = new a();
            if ((getFlags() & 256) == 256) {
                aVar.a = crx0.w(byteBuffer);
            }
            if ((getFlags() & 512) == 512) {
                aVar.b = crx0.w(byteBuffer);
            }
            if ((getFlags() & 1024) == 1024) {
                aVar.c = new h0h0(byteBuffer);
            }
            if ((getFlags() & 2048) == 2048) {
                aVar.d = byteBuffer.getInt();
            }
            this.entries.add(aVar);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.putInt(this.entries.size());
        int flags = getFlags();
        if ((flags & 1) == 1) {
            byteBuffer.putInt(this.dataOffset);
        }
        if ((flags & 4) == 4) {
            this.firstSampleFlags.a(byteBuffer);
        }
        for (a aVar : this.entries) {
            if ((flags & 256) == 256) {
                byteBuffer.putInt((int) aVar.a);
            }
            if ((flags & 512) == 512) {
                byteBuffer.putInt((int) aVar.b);
            }
            if ((flags & 1024) == 1024) {
                aVar.c.a(byteBuffer);
            }
            if ((flags & 2048) == 2048) {
                if (getVersion() == 0) {
                    byteBuffer.putInt((int) aVar.d);
                } else {
                    byteBuffer.putInt((int) aVar.d);
                }
            }
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        int flags = getFlags();
        long j = (flags & 1) == 1 ? 12L : 8L;
        if ((flags & 4) == 4) {
            j += 4;
        }
        long j2 = (flags & 256) == 256 ? 4L : 0L;
        if ((flags & 512) == 512) {
            j2 += 4;
        }
        if ((flags & 1024) == 1024) {
            j2 += 4;
        }
        if ((flags & 2048) == 2048) {
            j2 += 4;
        }
        return (j2 * this.entries.size()) + j;
    }

    public int getDataOffset() {
        o0y c = whq.c(ajc$tjp_15, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.dataOffset;
    }

    public List<a> getEntries() {
        o0y c = whq.c(ajc$tjp_0, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.entries;
    }

    public h0h0 getFirstSampleFlags() {
        o0y c = whq.c(ajc$tjp_16, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.firstSampleFlags;
    }

    public long[] getSampleCompositionTimeOffsets() {
        o0y c = whq.c(ajc$tjp_2, this, this);
        w8g0.a();
        w8g0.b(c);
        if (!isSampleCompositionTimeOffsetPresent()) {
            return null;
        }
        int size = this.entries.size();
        long[] jArr = new long[size];
        for (int i = 0; i < size; i++) {
            jArr[i] = this.entries.get(i).d;
        }
        return jArr;
    }

    public long getSampleCount() {
        o0y c = whq.c(ajc$tjp_3, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.entries.size();
    }

    public boolean isDataOffsetPresent() {
        o0y c = whq.c(ajc$tjp_4, this, this);
        w8g0.a();
        w8g0.b(c);
        return (getFlags() & 1) == 1;
    }

    public boolean isFirstSampleFlagsPresent() {
        o0y c = whq.c(ajc$tjp_5, this, this);
        w8g0.a();
        w8g0.b(c);
        return (getFlags() & 4) == 4;
    }

    public boolean isSampleCompositionTimeOffsetPresent() {
        o0y c = whq.c(ajc$tjp_9, this, this);
        w8g0.a();
        w8g0.b(c);
        return (getFlags() & 2048) == 2048;
    }

    public boolean isSampleDurationPresent() {
        o0y c = whq.c(ajc$tjp_7, this, this);
        w8g0.a();
        w8g0.b(c);
        return (getFlags() & 256) == 256;
    }

    public boolean isSampleFlagsPresent() {
        o0y c = whq.c(ajc$tjp_8, this, this);
        w8g0.a();
        w8g0.b(c);
        return (getFlags() & 1024) == 1024;
    }

    public boolean isSampleSizePresent() {
        o0y c = whq.c(ajc$tjp_6, this, this);
        w8g0.a();
        w8g0.b(c);
        return (getFlags() & 512) == 512;
    }

    public void setDataOffset(int i) {
        o0y d = whq.d(ajc$tjp_1, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        if (i == -1) {
            setFlags(getFlags() & 16777214);
        } else {
            setFlags(getFlags() | 1);
        }
        this.dataOffset = i;
    }

    public void setDataOffsetPresent(boolean z) {
        o0y d = whq.d(ajc$tjp_10, this, this, new Boolean(z));
        w8g0.a();
        w8g0.b(d);
        if (z) {
            setFlags(getFlags() | 1);
        } else {
            setFlags(getFlags() & 16777214);
        }
    }

    public void setEntries(List<a> list) {
        o0y d = whq.d(ajc$tjp_19, this, this, list);
        w8g0.a();
        w8g0.b(d);
        this.entries = list;
    }

    public void setFirstSampleFlags(h0h0 h0h0Var) {
        o0y d = whq.d(ajc$tjp_17, this, this, h0h0Var);
        w8g0.a();
        w8g0.b(d);
        if (h0h0Var == null) {
            setFlags(getFlags() & 16777211);
        } else {
            setFlags(getFlags() | 4);
        }
        this.firstSampleFlags = h0h0Var;
    }

    public void setSampleCompositionTimeOffsetPresent(boolean z) {
        o0y d = whq.d(ajc$tjp_14, this, this, new Boolean(z));
        w8g0.a();
        w8g0.b(d);
        if (z) {
            setFlags(getFlags() | 2048);
        } else {
            setFlags(getFlags() & 16775167);
        }
    }

    public void setSampleDurationPresent(boolean z) {
        o0y d = whq.d(ajc$tjp_12, this, this, new Boolean(z));
        w8g0.a();
        w8g0.b(d);
        if (z) {
            setFlags(getFlags() | 256);
        } else {
            setFlags(getFlags() & 16776959);
        }
    }

    public void setSampleFlagsPresent(boolean z) {
        o0y d = whq.d(ajc$tjp_13, this, this, new Boolean(z));
        w8g0.a();
        w8g0.b(d);
        if (z) {
            setFlags(getFlags() | 1024);
        } else {
            setFlags(getFlags() & 16776191);
        }
    }

    public void setSampleSizePresent(boolean z) {
        o0y d = whq.d(ajc$tjp_11, this, this, new Boolean(z));
        w8g0.a();
        w8g0.b(d);
        if (z) {
            setFlags(getFlags() | 512);
        } else {
            setFlags(getFlags() & 16776703);
        }
    }

    public String toString() {
        o0y c = whq.c(ajc$tjp_18, this, this);
        w8g0.a();
        w8g0.b(c);
        return "TrackRunBox{sampleCount=" + this.entries.size() + ", dataOffset=" + this.dataOffset + ", dataOffsetPresent=" + isDataOffsetPresent() + ", sampleSizePresent=" + isSampleSizePresent() + ", sampleDurationPresent=" + isSampleDurationPresent() + ", sampleFlagsPresentPresent=" + isSampleFlagsPresent() + ", sampleCompositionTimeOffsetPresent=" + isSampleCompositionTimeOffsetPresent() + ", firstSampleFlags=" + this.firstSampleFlags + '}';
    }
}
