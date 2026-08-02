package com.coremedia.iso.boxes.fragment;

import com.googlecode.mp4parser.AbstractFullBox;
import java.nio.ByteBuffer;
import xsna.crx0;
import xsna.h0h0;
import xsna.n0y;
import xsna.o0y;
import xsna.w8g0;
import xsna.whq;

/* loaded from: classes12.dex */
public class TrackExtendsBox extends AbstractFullBox {
    public static final String TYPE = "trex";
    private static final /* synthetic */ n0y ajc$tjp_0 = null;
    private static final /* synthetic */ n0y ajc$tjp_1 = null;
    private static final /* synthetic */ n0y ajc$tjp_10 = null;
    private static final /* synthetic */ n0y ajc$tjp_2 = null;
    private static final /* synthetic */ n0y ajc$tjp_3 = null;
    private static final /* synthetic */ n0y ajc$tjp_4 = null;
    private static final /* synthetic */ n0y ajc$tjp_5 = null;
    private static final /* synthetic */ n0y ajc$tjp_6 = null;
    private static final /* synthetic */ n0y ajc$tjp_7 = null;
    private static final /* synthetic */ n0y ajc$tjp_8 = null;
    private static final /* synthetic */ n0y ajc$tjp_9 = null;
    private long defaultSampleDescriptionIndex;
    private long defaultSampleDuration;
    private h0h0 defaultSampleFlags;
    private long defaultSampleSize;
    private long trackId;

    static {
        ajc$preClinit();
    }

    public TrackExtendsBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        whq whqVar = new whq("TrackExtendsBox.java", TrackExtendsBox.class);
        ajc$tjp_0 = whqVar.f(whqVar.e("getTrackId", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "", "", "", "long"));
        ajc$tjp_1 = whqVar.f(whqVar.e("getDefaultSampleDescriptionIndex", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "", "", "", "long"));
        ajc$tjp_10 = whqVar.f(whqVar.e("setDefaultSampleFlags", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "com.coremedia.iso.boxes.fragment.SampleFlags", "defaultSampleFlags", "", "void"));
        ajc$tjp_2 = whqVar.f(whqVar.e("getDefaultSampleDuration", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "", "", "", "long"));
        ajc$tjp_3 = whqVar.f(whqVar.e("getDefaultSampleSize", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "", "", "", "long"));
        ajc$tjp_4 = whqVar.f(whqVar.e("getDefaultSampleFlags", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "", "", "", "com.coremedia.iso.boxes.fragment.SampleFlags"));
        ajc$tjp_5 = whqVar.f(whqVar.e("getDefaultSampleFlagsStr", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "", "", "", "java.lang.String"));
        ajc$tjp_6 = whqVar.f(whqVar.e("setTrackId", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "long", "trackId", "", "void"));
        ajc$tjp_7 = whqVar.f(whqVar.e("setDefaultSampleDescriptionIndex", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "long", "defaultSampleDescriptionIndex", "", "void"));
        ajc$tjp_8 = whqVar.f(whqVar.e("setDefaultSampleDuration", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "long", "defaultSampleDuration", "", "void"));
        ajc$tjp_9 = whqVar.f(whqVar.e("setDefaultSampleSize", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "long", "defaultSampleSize", "", "void"));
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.trackId = crx0.w(byteBuffer);
        this.defaultSampleDescriptionIndex = crx0.w(byteBuffer);
        this.defaultSampleDuration = crx0.w(byteBuffer);
        this.defaultSampleSize = crx0.w(byteBuffer);
        this.defaultSampleFlags = new h0h0(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.putInt((int) this.trackId);
        byteBuffer.putInt((int) this.defaultSampleDescriptionIndex);
        byteBuffer.putInt((int) this.defaultSampleDuration);
        byteBuffer.putInt((int) this.defaultSampleSize);
        this.defaultSampleFlags.a(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return 24L;
    }

    public long getDefaultSampleDescriptionIndex() {
        o0y c = whq.c(ajc$tjp_1, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.defaultSampleDescriptionIndex;
    }

    public long getDefaultSampleDuration() {
        o0y c = whq.c(ajc$tjp_2, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.defaultSampleDuration;
    }

    public h0h0 getDefaultSampleFlags() {
        o0y c = whq.c(ajc$tjp_4, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.defaultSampleFlags;
    }

    public String getDefaultSampleFlagsStr() {
        o0y c = whq.c(ajc$tjp_5, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.defaultSampleFlags.toString();
    }

    public long getDefaultSampleSize() {
        o0y c = whq.c(ajc$tjp_3, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.defaultSampleSize;
    }

    public long getTrackId() {
        o0y c = whq.c(ajc$tjp_0, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.trackId;
    }

    public void setDefaultSampleDescriptionIndex(long j) {
        o0y d = whq.d(ajc$tjp_7, this, this, new Long(j));
        w8g0.a();
        w8g0.b(d);
        this.defaultSampleDescriptionIndex = j;
    }

    public void setDefaultSampleDuration(long j) {
        o0y d = whq.d(ajc$tjp_8, this, this, new Long(j));
        w8g0.a();
        w8g0.b(d);
        this.defaultSampleDuration = j;
    }

    public void setDefaultSampleFlags(h0h0 h0h0Var) {
        o0y d = whq.d(ajc$tjp_10, this, this, h0h0Var);
        w8g0.a();
        w8g0.b(d);
        this.defaultSampleFlags = h0h0Var;
    }

    public void setDefaultSampleSize(long j) {
        o0y d = whq.d(ajc$tjp_9, this, this, new Long(j));
        w8g0.a();
        w8g0.b(d);
        this.defaultSampleSize = j;
    }

    public void setTrackId(long j) {
        o0y d = whq.d(ajc$tjp_6, this, this, new Long(j));
        w8g0.a();
        w8g0.b(d);
        this.trackId = j;
    }
}
