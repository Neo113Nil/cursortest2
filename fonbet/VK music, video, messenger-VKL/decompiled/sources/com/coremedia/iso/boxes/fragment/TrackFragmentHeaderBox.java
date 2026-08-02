package com.coremedia.iso.boxes.fragment;

import com.googlecode.mp4parser.AbstractFullBox;
import defpackage.q0;
import java.nio.ByteBuffer;
import xsna.crx0;
import xsna.h0h0;
import xsna.n0y;
import xsna.o0y;
import xsna.w8g0;
import xsna.whq;

/* loaded from: classes12.dex */
public class TrackFragmentHeaderBox extends AbstractFullBox {
    public static final String TYPE = "tfhd";
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
    private static final /* synthetic */ n0y ajc$tjp_20 = null;
    private static final /* synthetic */ n0y ajc$tjp_21 = null;
    private static final /* synthetic */ n0y ajc$tjp_3 = null;
    private static final /* synthetic */ n0y ajc$tjp_4 = null;
    private static final /* synthetic */ n0y ajc$tjp_5 = null;
    private static final /* synthetic */ n0y ajc$tjp_6 = null;
    private static final /* synthetic */ n0y ajc$tjp_7 = null;
    private static final /* synthetic */ n0y ajc$tjp_8 = null;
    private static final /* synthetic */ n0y ajc$tjp_9 = null;
    private long baseDataOffset;
    private boolean defaultBaseIsMoof;
    private long defaultSampleDuration;
    private h0h0 defaultSampleFlags;
    private long defaultSampleSize;
    private boolean durationIsEmpty;
    private long sampleDescriptionIndex;
    private long trackId;

    static {
        ajc$preClinit();
    }

    public TrackFragmentHeaderBox() {
        super(TYPE);
        this.baseDataOffset = -1L;
        this.defaultSampleDuration = -1L;
        this.defaultSampleSize = -1L;
    }

    private static /* synthetic */ void ajc$preClinit() {
        whq whqVar = new whq("TrackFragmentHeaderBox.java", TrackFragmentHeaderBox.class);
        ajc$tjp_0 = whqVar.f(whqVar.e("hasBaseDataOffset", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "boolean"));
        ajc$tjp_1 = whqVar.f(whqVar.e("hasSampleDescriptionIndex", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "boolean"));
        ajc$tjp_10 = whqVar.f(whqVar.e("setSampleDescriptionIndex", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "long", "sampleDescriptionIndex", "", "void"));
        ajc$tjp_11 = whqVar.f(whqVar.e("getDefaultSampleDuration", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "long"));
        ajc$tjp_12 = whqVar.f(whqVar.e("setDefaultSampleDuration", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "long", "defaultSampleDuration", "", "void"));
        ajc$tjp_13 = whqVar.f(whqVar.e("getDefaultSampleSize", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "long"));
        ajc$tjp_14 = whqVar.f(whqVar.e("setDefaultSampleSize", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "long", "defaultSampleSize", "", "void"));
        ajc$tjp_15 = whqVar.f(whqVar.e("getDefaultSampleFlags", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "com.coremedia.iso.boxes.fragment.SampleFlags"));
        ajc$tjp_16 = whqVar.f(whqVar.e("setDefaultSampleFlags", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "com.coremedia.iso.boxes.fragment.SampleFlags", "defaultSampleFlags", "", "void"));
        ajc$tjp_17 = whqVar.f(whqVar.e("isDurationIsEmpty", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "boolean"));
        ajc$tjp_18 = whqVar.f(whqVar.e("setDurationIsEmpty", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "boolean", "durationIsEmpty", "", "void"));
        ajc$tjp_19 = whqVar.f(whqVar.e("isDefaultBaseIsMoof", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "boolean"));
        ajc$tjp_2 = whqVar.f(whqVar.e("hasDefaultSampleDuration", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "boolean"));
        ajc$tjp_20 = whqVar.f(whqVar.e("setDefaultBaseIsMoof", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "boolean", "defaultBaseIsMoof", "", "void"));
        ajc$tjp_21 = whqVar.f(whqVar.e("toString", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "java.lang.String"));
        ajc$tjp_3 = whqVar.f(whqVar.e("hasDefaultSampleSize", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "boolean"));
        ajc$tjp_4 = whqVar.f(whqVar.e("hasDefaultSampleFlags", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "boolean"));
        ajc$tjp_5 = whqVar.f(whqVar.e("getTrackId", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "long"));
        ajc$tjp_6 = whqVar.f(whqVar.e("setTrackId", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "long", "trackId", "", "void"));
        ajc$tjp_7 = whqVar.f(whqVar.e("getBaseDataOffset", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "long"));
        ajc$tjp_8 = whqVar.f(whqVar.e("setBaseDataOffset", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "long", "baseDataOffset", "", "void"));
        ajc$tjp_9 = whqVar.f(whqVar.e("getSampleDescriptionIndex", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "long"));
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.trackId = crx0.w(byteBuffer);
        if ((getFlags() & 1) == 1) {
            this.baseDataOffset = crx0.x(byteBuffer);
        }
        if ((getFlags() & 2) == 2) {
            this.sampleDescriptionIndex = crx0.w(byteBuffer);
        }
        if ((getFlags() & 8) == 8) {
            this.defaultSampleDuration = crx0.w(byteBuffer);
        }
        if ((getFlags() & 16) == 16) {
            this.defaultSampleSize = crx0.w(byteBuffer);
        }
        if ((getFlags() & 32) == 32) {
            this.defaultSampleFlags = new h0h0(byteBuffer);
        }
        if ((getFlags() & 65536) == 65536) {
            this.durationIsEmpty = true;
        }
        if ((getFlags() & 131072) == 131072) {
            this.defaultBaseIsMoof = true;
        }
    }

    public long getBaseDataOffset() {
        o0y c = whq.c(ajc$tjp_7, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.baseDataOffset;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.putInt((int) this.trackId);
        if ((getFlags() & 1) == 1) {
            byteBuffer.putLong(getBaseDataOffset());
        }
        if ((getFlags() & 2) == 2) {
            byteBuffer.putInt((int) getSampleDescriptionIndex());
        }
        if ((getFlags() & 8) == 8) {
            byteBuffer.putInt((int) getDefaultSampleDuration());
        }
        if ((getFlags() & 16) == 16) {
            byteBuffer.putInt((int) getDefaultSampleSize());
        }
        if ((getFlags() & 32) == 32) {
            this.defaultSampleFlags.a(byteBuffer);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        int flags = getFlags();
        long j = (flags & 1) == 1 ? 16L : 8L;
        if ((flags & 2) == 2) {
            j += 4;
        }
        if ((flags & 8) == 8) {
            j += 4;
        }
        if ((flags & 16) == 16) {
            j += 4;
        }
        return (flags & 32) == 32 ? j + 4 : j;
    }

    public long getDefaultSampleDuration() {
        o0y c = whq.c(ajc$tjp_11, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.defaultSampleDuration;
    }

    public h0h0 getDefaultSampleFlags() {
        o0y c = whq.c(ajc$tjp_15, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.defaultSampleFlags;
    }

    public long getDefaultSampleSize() {
        o0y c = whq.c(ajc$tjp_13, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.defaultSampleSize;
    }

    public long getSampleDescriptionIndex() {
        o0y c = whq.c(ajc$tjp_9, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.sampleDescriptionIndex;
    }

    public long getTrackId() {
        o0y c = whq.c(ajc$tjp_5, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.trackId;
    }

    public boolean hasBaseDataOffset() {
        o0y c = whq.c(ajc$tjp_0, this, this);
        w8g0.a();
        w8g0.b(c);
        return (getFlags() & 1) != 0;
    }

    public boolean hasDefaultSampleDuration() {
        o0y c = whq.c(ajc$tjp_2, this, this);
        w8g0.a();
        w8g0.b(c);
        return (getFlags() & 8) != 0;
    }

    public boolean hasDefaultSampleFlags() {
        o0y c = whq.c(ajc$tjp_4, this, this);
        w8g0.a();
        w8g0.b(c);
        return (getFlags() & 32) != 0;
    }

    public boolean hasDefaultSampleSize() {
        o0y c = whq.c(ajc$tjp_3, this, this);
        w8g0.a();
        w8g0.b(c);
        return (getFlags() & 16) != 0;
    }

    public boolean hasSampleDescriptionIndex() {
        o0y c = whq.c(ajc$tjp_1, this, this);
        w8g0.a();
        w8g0.b(c);
        return (getFlags() & 2) != 0;
    }

    public boolean isDefaultBaseIsMoof() {
        o0y c = whq.c(ajc$tjp_19, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.defaultBaseIsMoof;
    }

    public boolean isDurationIsEmpty() {
        o0y c = whq.c(ajc$tjp_17, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.durationIsEmpty;
    }

    public void setBaseDataOffset(long j) {
        o0y d = whq.d(ajc$tjp_8, this, this, new Long(j));
        w8g0.a();
        w8g0.b(d);
        if (j == -1) {
            setFlags(getFlags() & 2147483646);
        } else {
            setFlags(getFlags() | 1);
        }
        this.baseDataOffset = j;
    }

    public void setDefaultBaseIsMoof(boolean z) {
        o0y d = whq.d(ajc$tjp_20, this, this, new Boolean(z));
        w8g0.a();
        w8g0.b(d);
        if (z) {
            setFlags(getFlags() | 131072);
        } else {
            setFlags(getFlags() & 16646143);
        }
        this.defaultBaseIsMoof = z;
    }

    public void setDefaultSampleDuration(long j) {
        o0y d = whq.d(ajc$tjp_12, this, this, new Long(j));
        w8g0.a();
        w8g0.b(d);
        setFlags(getFlags() | 8);
        this.defaultSampleDuration = j;
    }

    public void setDefaultSampleFlags(h0h0 h0h0Var) {
        o0y d = whq.d(ajc$tjp_16, this, this, h0h0Var);
        w8g0.a();
        w8g0.b(d);
        if (h0h0Var != null) {
            setFlags(getFlags() | 32);
        } else {
            setFlags(getFlags() & 16777183);
        }
        this.defaultSampleFlags = h0h0Var;
    }

    public void setDefaultSampleSize(long j) {
        o0y d = whq.d(ajc$tjp_14, this, this, new Long(j));
        w8g0.a();
        w8g0.b(d);
        if (j != -1) {
            setFlags(getFlags() | 16);
        } else {
            setFlags(getFlags() & 16777199);
        }
        this.defaultSampleSize = j;
    }

    public void setDurationIsEmpty(boolean z) {
        o0y d = whq.d(ajc$tjp_18, this, this, new Boolean(z));
        w8g0.a();
        w8g0.b(d);
        if (this.defaultBaseIsMoof) {
            setFlags(getFlags() | 65536);
        } else {
            setFlags(getFlags() & 16711679);
        }
        this.durationIsEmpty = z;
    }

    public void setSampleDescriptionIndex(long j) {
        o0y d = whq.d(ajc$tjp_10, this, this, new Long(j));
        w8g0.a();
        w8g0.b(d);
        if (j == -1) {
            setFlags(getFlags() & 2147483645);
        } else {
            setFlags(getFlags() | 2);
        }
        this.sampleDescriptionIndex = j;
    }

    public void setTrackId(long j) {
        o0y d = whq.d(ajc$tjp_6, this, this, new Long(j));
        w8g0.a();
        w8g0.b(d);
        this.trackId = j;
    }

    public String toString() {
        o0y c = whq.c(ajc$tjp_21, this, this);
        w8g0.a();
        w8g0.b(c);
        StringBuilder sb = new StringBuilder("TrackFragmentHeaderBox{trackId=");
        sb.append(this.trackId);
        sb.append(", baseDataOffset=");
        sb.append(this.baseDataOffset);
        sb.append(", sampleDescriptionIndex=");
        sb.append(this.sampleDescriptionIndex);
        sb.append(", defaultSampleDuration=");
        sb.append(this.defaultSampleDuration);
        sb.append(", defaultSampleSize=");
        sb.append(this.defaultSampleSize);
        sb.append(", defaultSampleFlags=");
        sb.append(this.defaultSampleFlags);
        sb.append(", durationIsEmpty=");
        sb.append(this.durationIsEmpty);
        sb.append(", defaultBaseIsMoof=");
        return q0.a(sb, this.defaultBaseIsMoof, '}');
    }
}
