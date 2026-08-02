package com.googlecode.mp4parser.boxes.mp4.samplegrouping;

import com.googlecode.mp4parser.AbstractFullBox;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;
import xsna.crx0;
import xsna.etx;
import xsna.fxe0;
import xsna.ion0;
import xsna.lpa;
import xsna.m4q0;
import xsna.ms9;
import xsna.n0y;
import xsna.o0y;
import xsna.o9o0;
import xsna.p9o0;
import xsna.qlg0;
import xsna.r9o0;
import xsna.up2;
import xsna.vju;
import xsna.w8g0;
import xsna.whq;
import xsna.y0l0;
import xsna.z5u0;

/* loaded from: classes13.dex */
public class SampleGroupDescriptionBox extends AbstractFullBox {
    public static final String TYPE = "sgpd";
    private static final /* synthetic */ n0y ajc$tjp_0 = null;
    private static final /* synthetic */ n0y ajc$tjp_1 = null;
    private static final /* synthetic */ n0y ajc$tjp_2 = null;
    private static final /* synthetic */ n0y ajc$tjp_3 = null;
    private static final /* synthetic */ n0y ajc$tjp_4 = null;
    private static final /* synthetic */ n0y ajc$tjp_5 = null;
    private static final /* synthetic */ n0y ajc$tjp_6 = null;
    private static final /* synthetic */ n0y ajc$tjp_7 = null;
    private static final /* synthetic */ n0y ajc$tjp_8 = null;
    private int defaultLength;
    private List<vju> groupEntries;
    private String groupingType;

    static {
        ajc$preClinit();
    }

    public SampleGroupDescriptionBox() {
        super(TYPE);
        this.groupEntries = new LinkedList();
        setVersion(1);
    }

    private static /* synthetic */ void ajc$preClinit() {
        whq whqVar = new whq("SampleGroupDescriptionBox.java", SampleGroupDescriptionBox.class);
        ajc$tjp_0 = whqVar.f(whqVar.e("getGroupingType", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox", "", "", "", "java.lang.String"));
        ajc$tjp_1 = whqVar.f(whqVar.e("setGroupingType", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox", "java.lang.String", "groupingType", "", "void"));
        ajc$tjp_2 = whqVar.f(whqVar.e("getDefaultLength", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox", "", "", "", "int"));
        ajc$tjp_3 = whqVar.f(whqVar.e("setDefaultLength", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox", "int", "defaultLength", "", "void"));
        ajc$tjp_4 = whqVar.f(whqVar.e("getGroupEntries", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox", "", "", "", "java.util.List"));
        ajc$tjp_5 = whqVar.f(whqVar.e("setGroupEntries", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox", "java.util.List", "groupEntries", "", "void"));
        ajc$tjp_6 = whqVar.f(whqVar.e("equals", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox", "java.lang.Object", "o", "", "boolean"));
        ajc$tjp_7 = whqVar.f(whqVar.e("hashCode", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox", "", "", "", "int"));
        ajc$tjp_8 = whqVar.f(whqVar.e("toString", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox", "", "", "", "java.lang.String"));
    }

    private vju parseGroupEntry(ByteBuffer byteBuffer, String str) {
        vju vjuVar;
        if ("roll".equals(str)) {
            vjuVar = new qlg0();
        } else if ("rash".equals(str)) {
            vjuVar = new fxe0();
        } else if ("seig".equals(str)) {
            vjuVar = new lpa();
        } else if ("rap ".equals(str)) {
            vjuVar = new z5u0();
        } else if ("tele".equals(str)) {
            vjuVar = new p9o0();
        } else if ("sync".equals(str)) {
            vjuVar = new ion0();
        } else if ("tscl".equals(str)) {
            vjuVar = new o9o0();
        } else if ("tsas".equals(str)) {
            vjuVar = new r9o0();
        } else if ("stsa".equals(str)) {
            vjuVar = new y0l0();
        } else {
            m4q0 m4q0Var = new m4q0();
            m4q0Var.b = str;
            vjuVar = m4q0Var;
        }
        vjuVar.c(byteBuffer);
        return vjuVar;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        if (getVersion() != 1) {
            throw new RuntimeException("SampleGroupDescriptionBox are only supported in version 1");
        }
        this.groupingType = crx0.n(byteBuffer);
        if (getVersion() == 1) {
            this.defaultLength = up2.p(crx0.w(byteBuffer));
        }
        long w = crx0.w(byteBuffer);
        while (true) {
            long j = w - 1;
            if (w <= 0) {
                return;
            }
            int i = this.defaultLength;
            if (getVersion() != 1) {
                throw new RuntimeException("This should be implemented");
            }
            if (this.defaultLength == 0) {
                i = up2.p(crx0.w(byteBuffer));
            }
            int position = byteBuffer.position() + i;
            ByteBuffer slice = byteBuffer.slice();
            slice.limit(i);
            this.groupEntries.add(parseGroupEntry(slice, this.groupingType));
            byteBuffer.position(position);
            w = j;
        }
    }

    public boolean equals(Object obj) {
        o0y d = whq.d(ajc$tjp_6, this, this, obj);
        w8g0.a();
        w8g0.b(d);
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SampleGroupDescriptionBox sampleGroupDescriptionBox = (SampleGroupDescriptionBox) obj;
        if (this.defaultLength != sampleGroupDescriptionBox.defaultLength) {
            return false;
        }
        List<vju> list = this.groupEntries;
        List<vju> list2 = sampleGroupDescriptionBox.groupEntries;
        return list != null ? list.equals(list2) : list2 == null;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.put(etx.c(this.groupingType));
        if (getVersion() == 1) {
            byteBuffer.putInt(this.defaultLength);
        }
        byteBuffer.putInt(this.groupEntries.size());
        for (vju vjuVar : this.groupEntries) {
            if (getVersion() == 1 && this.defaultLength == 0) {
                byteBuffer.putInt(vjuVar.a().limit());
            }
            byteBuffer.put(vjuVar.a());
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        long j = (getVersion() == 1 ? 12L : 8L) + 4;
        for (vju vjuVar : this.groupEntries) {
            if (getVersion() == 1 && this.defaultLength == 0) {
                j += 4;
            }
            j += vjuVar.d();
        }
        return j;
    }

    public int getDefaultLength() {
        o0y c = whq.c(ajc$tjp_2, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.defaultLength;
    }

    public List<vju> getGroupEntries() {
        o0y c = whq.c(ajc$tjp_4, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.groupEntries;
    }

    public String getGroupingType() {
        o0y c = whq.c(ajc$tjp_0, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.groupingType;
    }

    public int hashCode() {
        o0y c = whq.c(ajc$tjp_7, this, this);
        w8g0.a();
        w8g0.b(c);
        int i = this.defaultLength * 31;
        List<vju> list = this.groupEntries;
        return i + (list != null ? list.hashCode() : 0);
    }

    public void setDefaultLength(int i) {
        o0y d = whq.d(ajc$tjp_3, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.defaultLength = i;
    }

    public void setGroupEntries(List<vju> list) {
        o0y d = whq.d(ajc$tjp_5, this, this, list);
        w8g0.a();
        w8g0.b(d);
        this.groupEntries = list;
    }

    public void setGroupingType(String str) {
        o0y d = whq.d(ajc$tjp_1, this, this, str);
        w8g0.a();
        w8g0.b(d);
        this.groupingType = str;
    }

    public String toString() {
        o0y c = whq.c(ajc$tjp_8, this, this);
        w8g0.a();
        w8g0.b(c);
        StringBuilder sb = new StringBuilder("SampleGroupDescriptionBox{groupingType='");
        sb.append(this.groupEntries.size() > 0 ? this.groupEntries.get(0).b() : "????");
        sb.append("', defaultLength=");
        sb.append(this.defaultLength);
        sb.append(", groupEntries=");
        return ms9.a('}', sb, this.groupEntries);
    }
}
