package com.coremedia.iso.boxes.fragment;

import com.googlecode.mp4parser.AbstractBox;
import com.ironsource.X3;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import xsna.crx0;
import xsna.etx;
import xsna.n0y;
import xsna.o0y;
import xsna.w8g0;
import xsna.whq;

/* loaded from: classes12.dex */
public class SegmentTypeBox extends AbstractBox {
    public static final String TYPE = "styp";
    private static final /* synthetic */ n0y ajc$tjp_0 = null;
    private static final /* synthetic */ n0y ajc$tjp_1 = null;
    private static final /* synthetic */ n0y ajc$tjp_2 = null;
    private static final /* synthetic */ n0y ajc$tjp_3 = null;
    private static final /* synthetic */ n0y ajc$tjp_4 = null;
    private static final /* synthetic */ n0y ajc$tjp_5 = null;
    private List<String> compatibleBrands;
    private String majorBrand;
    private long minorVersion;

    static {
        ajc$preClinit();
    }

    public SegmentTypeBox() {
        super(TYPE);
        this.compatibleBrands = Collections.EMPTY_LIST;
    }

    private static /* synthetic */ void ajc$preClinit() {
        whq whqVar = new whq("SegmentTypeBox.java", SegmentTypeBox.class);
        ajc$tjp_0 = whqVar.f(whqVar.e("getMajorBrand", "com.coremedia.iso.boxes.fragment.SegmentTypeBox", "", "", "", "java.lang.String"));
        ajc$tjp_1 = whqVar.f(whqVar.e("setMajorBrand", "com.coremedia.iso.boxes.fragment.SegmentTypeBox", "java.lang.String", "majorBrand", "", "void"));
        ajc$tjp_2 = whqVar.f(whqVar.e("setMinorVersion", "com.coremedia.iso.boxes.fragment.SegmentTypeBox", "long", "minorVersion", "", "void"));
        ajc$tjp_3 = whqVar.f(whqVar.e("getMinorVersion", "com.coremedia.iso.boxes.fragment.SegmentTypeBox", "", "", "", "long"));
        ajc$tjp_4 = whqVar.f(whqVar.e("getCompatibleBrands", "com.coremedia.iso.boxes.fragment.SegmentTypeBox", "", "", "", "java.util.List"));
        ajc$tjp_5 = whqVar.f(whqVar.e("setCompatibleBrands", "com.coremedia.iso.boxes.fragment.SegmentTypeBox", "java.util.List", "compatibleBrands", "", "void"));
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        this.majorBrand = crx0.n(byteBuffer);
        this.minorVersion = crx0.w(byteBuffer);
        int remaining = byteBuffer.remaining() / 4;
        this.compatibleBrands = new LinkedList();
        for (int i = 0; i < remaining; i++) {
            this.compatibleBrands.add(crx0.n(byteBuffer));
        }
    }

    public List<String> getCompatibleBrands() {
        o0y c = whq.c(ajc$tjp_4, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.compatibleBrands;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        byteBuffer.put(etx.c(this.majorBrand));
        byteBuffer.putInt((int) this.minorVersion);
        Iterator<String> it = this.compatibleBrands.iterator();
        while (it.hasNext()) {
            byteBuffer.put(etx.c(it.next()));
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return (this.compatibleBrands.size() * 4) + 8;
    }

    public String getMajorBrand() {
        o0y c = whq.c(ajc$tjp_0, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.majorBrand;
    }

    public long getMinorVersion() {
        o0y c = whq.c(ajc$tjp_3, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.minorVersion;
    }

    public void setCompatibleBrands(List<String> list) {
        o0y d = whq.d(ajc$tjp_5, this, this, list);
        w8g0.a();
        w8g0.b(d);
        this.compatibleBrands = list;
    }

    public void setMajorBrand(String str) {
        o0y d = whq.d(ajc$tjp_1, this, this, str);
        w8g0.a();
        w8g0.b(d);
        this.majorBrand = str;
    }

    public void setMinorVersion(long j) {
        o0y d = whq.d(ajc$tjp_2, this, this, new Long(j));
        w8g0.a();
        w8g0.b(d);
        this.minorVersion = j;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SegmentTypeBox[majorBrand=");
        sb.append(getMajorBrand());
        sb.append(";minorVersion=");
        sb.append(getMinorVersion());
        for (String str : this.compatibleBrands) {
            sb.append(";compatibleBrand=");
            sb.append(str);
        }
        sb.append(X3.j.e);
        return sb.toString();
    }

    public SegmentTypeBox(String str, long j, List<String> list) {
        super(TYPE);
        List list2 = Collections.EMPTY_LIST;
        this.majorBrand = str;
        this.minorVersion = j;
        this.compatibleBrands = list;
    }
}
