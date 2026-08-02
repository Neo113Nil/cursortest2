package com.googlecode.mp4parser.boxes;

import com.googlecode.mp4parser.AbstractBox;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import xsna.lb7;
import xsna.mb7;
import xsna.n0y;
import xsna.o0y;
import xsna.vu5;
import xsna.w8g0;
import xsna.whq;

/* loaded from: classes13.dex */
public class EC3SpecificBox extends AbstractBox {
    public static final String TYPE = "dec3";
    private static final /* synthetic */ n0y ajc$tjp_0 = null;
    private static final /* synthetic */ n0y ajc$tjp_1 = null;
    private static final /* synthetic */ n0y ajc$tjp_2 = null;
    private static final /* synthetic */ n0y ajc$tjp_3 = null;
    private static final /* synthetic */ n0y ajc$tjp_4 = null;
    private static final /* synthetic */ n0y ajc$tjp_5 = null;
    private static final /* synthetic */ n0y ajc$tjp_6 = null;
    private static final /* synthetic */ n0y ajc$tjp_7 = null;
    private static final /* synthetic */ n0y ajc$tjp_8 = null;
    int dataRate;
    List<a> entries;
    int numIndSub;

    public static class a {
        public int a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;

        public final String toString() {
            StringBuilder sb = new StringBuilder("Entry{fscod=");
            sb.append(this.a);
            sb.append(", bsid=");
            sb.append(this.b);
            sb.append(", bsmod=");
            sb.append(this.c);
            sb.append(", acmod=");
            sb.append(this.d);
            sb.append(", lfeon=");
            sb.append(this.e);
            sb.append(", reserved=");
            sb.append(this.f);
            sb.append(", num_dep_sub=");
            sb.append(this.g);
            sb.append(", chan_loc=");
            sb.append(this.h);
            sb.append(", reserved2=");
            return vu5.b(sb, this.i, '}');
        }
    }

    static {
        ajc$preClinit();
    }

    public EC3SpecificBox() {
        super(TYPE);
        this.entries = new LinkedList();
    }

    private static /* synthetic */ void ajc$preClinit() {
        whq whqVar = new whq("EC3SpecificBox.java", EC3SpecificBox.class);
        ajc$tjp_0 = whqVar.f(whqVar.e("getContentSize", "com.googlecode.mp4parser.boxes.EC3SpecificBox", "", "", "", "long"));
        ajc$tjp_1 = whqVar.f(whqVar.e("getContent", "com.googlecode.mp4parser.boxes.EC3SpecificBox", "java.nio.ByteBuffer", "byteBuffer", "", "void"));
        ajc$tjp_2 = whqVar.f(whqVar.e("getEntries", "com.googlecode.mp4parser.boxes.EC3SpecificBox", "", "", "", "java.util.List"));
        ajc$tjp_3 = whqVar.f(whqVar.e("setEntries", "com.googlecode.mp4parser.boxes.EC3SpecificBox", "java.util.List", "entries", "", "void"));
        ajc$tjp_4 = whqVar.f(whqVar.e("addEntry", "com.googlecode.mp4parser.boxes.EC3SpecificBox", "com.googlecode.mp4parser.boxes.EC3SpecificBox$Entry", "entry", "", "void"));
        ajc$tjp_5 = whqVar.f(whqVar.e("getDataRate", "com.googlecode.mp4parser.boxes.EC3SpecificBox", "", "", "", "int"));
        ajc$tjp_6 = whqVar.f(whqVar.e("setDataRate", "com.googlecode.mp4parser.boxes.EC3SpecificBox", "int", "dataRate", "", "void"));
        ajc$tjp_7 = whqVar.f(whqVar.e("getNumIndSub", "com.googlecode.mp4parser.boxes.EC3SpecificBox", "", "", "", "int"));
        ajc$tjp_8 = whqVar.f(whqVar.e("setNumIndSub", "com.googlecode.mp4parser.boxes.EC3SpecificBox", "int", "numIndSub", "", "void"));
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        lb7 lb7Var = new lb7(byteBuffer);
        this.dataRate = lb7Var.a(13);
        this.numIndSub = lb7Var.a(3) + 1;
        for (int i = 0; i < this.numIndSub; i++) {
            a aVar = new a();
            aVar.a = lb7Var.a(2);
            aVar.b = lb7Var.a(5);
            aVar.c = lb7Var.a(5);
            aVar.d = lb7Var.a(3);
            aVar.e = lb7Var.a(1);
            aVar.f = lb7Var.a(3);
            int a2 = lb7Var.a(4);
            aVar.g = a2;
            if (a2 > 0) {
                aVar.h = lb7Var.a(9);
            } else {
                aVar.i = lb7Var.a(1);
            }
            this.entries.add(aVar);
        }
    }

    public void addEntry(a aVar) {
        o0y d = whq.d(ajc$tjp_4, this, this, aVar);
        w8g0.a();
        w8g0.b(d);
        this.entries.add(aVar);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        o0y d = whq.d(ajc$tjp_1, this, this, byteBuffer);
        w8g0.a();
        w8g0.b(d);
        mb7 mb7Var = new mb7(byteBuffer);
        mb7Var.a(this.dataRate, 13);
        mb7Var.a(this.entries.size() - 1, 3);
        for (a aVar : this.entries) {
            mb7Var.a(aVar.a, 2);
            mb7Var.a(aVar.b, 5);
            mb7Var.a(aVar.c, 5);
            mb7Var.a(aVar.d, 3);
            mb7Var.a(aVar.e, 1);
            mb7Var.a(aVar.f, 3);
            mb7Var.a(aVar.g, 4);
            if (aVar.g > 0) {
                mb7Var.a(aVar.h, 9);
            } else {
                mb7Var.a(aVar.i, 1);
            }
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        o0y c = whq.c(ajc$tjp_0, this, this);
        w8g0.a();
        w8g0.b(c);
        Iterator<a> it = this.entries.iterator();
        long j = 2;
        while (it.hasNext()) {
            j += it.next().g > 0 ? 4L : 3L;
        }
        return j;
    }

    public int getDataRate() {
        o0y c = whq.c(ajc$tjp_5, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.dataRate;
    }

    public List<a> getEntries() {
        o0y c = whq.c(ajc$tjp_2, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.entries;
    }

    public int getNumIndSub() {
        o0y c = whq.c(ajc$tjp_7, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.numIndSub;
    }

    public void setDataRate(int i) {
        o0y d = whq.d(ajc$tjp_6, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.dataRate = i;
    }

    public void setEntries(List<a> list) {
        o0y d = whq.d(ajc$tjp_3, this, this, list);
        w8g0.a();
        w8g0.b(d);
        this.entries = list;
    }

    public void setNumIndSub(int i) {
        o0y d = whq.d(ajc$tjp_8, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.numIndSub = i;
    }
}
