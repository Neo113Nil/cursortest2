package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractFullBox;
import java.nio.ByteBuffer;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import xsna.ad0;
import xsna.aqw;
import xsna.crx0;
import xsna.cvk;
import xsna.ms9;
import xsna.n0y;
import xsna.o0y;
import xsna.vu5;
import xsna.w8g0;
import xsna.whq;

/* loaded from: classes12.dex */
public class ItemLocationBox extends AbstractFullBox {
    public static final String TYPE = "iloc";
    private static final /* synthetic */ n0y ajc$tjp_0 = null;
    private static final /* synthetic */ n0y ajc$tjp_1 = null;
    private static final /* synthetic */ n0y ajc$tjp_10 = null;
    private static final /* synthetic */ n0y ajc$tjp_11 = null;
    private static final /* synthetic */ n0y ajc$tjp_2 = null;
    private static final /* synthetic */ n0y ajc$tjp_3 = null;
    private static final /* synthetic */ n0y ajc$tjp_4 = null;
    private static final /* synthetic */ n0y ajc$tjp_5 = null;
    private static final /* synthetic */ n0y ajc$tjp_6 = null;
    private static final /* synthetic */ n0y ajc$tjp_7 = null;
    private static final /* synthetic */ n0y ajc$tjp_8 = null;
    private static final /* synthetic */ n0y ajc$tjp_9 = null;
    public int baseOffsetSize;
    public int indexSize;
    public List<b> items;
    public int lengthSize;
    public int offsetSize;

    static {
        ajc$preClinit();
    }

    public ItemLocationBox() {
        super(TYPE);
        this.offsetSize = 8;
        this.lengthSize = 8;
        this.baseOffsetSize = 8;
        this.indexSize = 0;
        this.items = new LinkedList();
    }

    private static /* synthetic */ void ajc$preClinit() {
        whq whqVar = new whq("ItemLocationBox.java", ItemLocationBox.class);
        ajc$tjp_0 = whqVar.f(whqVar.e("getOffsetSize", "com.coremedia.iso.boxes.ItemLocationBox", "", "", "", "int"));
        ajc$tjp_1 = whqVar.f(whqVar.e("setOffsetSize", "com.coremedia.iso.boxes.ItemLocationBox", "int", "offsetSize", "", "void"));
        ajc$tjp_10 = whqVar.f(whqVar.e("createItem", "com.coremedia.iso.boxes.ItemLocationBox", "int:int:int:long:java.util.List", "itemId:constructionMethod:dataReferenceIndex:baseOffset:extents", "", "com.coremedia.iso.boxes.ItemLocationBox$Item"));
        ajc$tjp_11 = whqVar.f(whqVar.e("createExtent", "com.coremedia.iso.boxes.ItemLocationBox", "long:long:long", "extentOffset:extentLength:extentIndex", "", "com.coremedia.iso.boxes.ItemLocationBox$Extent"));
        ajc$tjp_2 = whqVar.f(whqVar.e("getLengthSize", "com.coremedia.iso.boxes.ItemLocationBox", "", "", "", "int"));
        ajc$tjp_3 = whqVar.f(whqVar.e("setLengthSize", "com.coremedia.iso.boxes.ItemLocationBox", "int", "lengthSize", "", "void"));
        ajc$tjp_4 = whqVar.f(whqVar.e("getBaseOffsetSize", "com.coremedia.iso.boxes.ItemLocationBox", "", "", "", "int"));
        ajc$tjp_5 = whqVar.f(whqVar.e("setBaseOffsetSize", "com.coremedia.iso.boxes.ItemLocationBox", "int", "baseOffsetSize", "", "void"));
        ajc$tjp_6 = whqVar.f(whqVar.e("getIndexSize", "com.coremedia.iso.boxes.ItemLocationBox", "", "", "", "int"));
        ajc$tjp_7 = whqVar.f(whqVar.e("setIndexSize", "com.coremedia.iso.boxes.ItemLocationBox", "int", "indexSize", "", "void"));
        ajc$tjp_8 = whqVar.f(whqVar.e("getItems", "com.coremedia.iso.boxes.ItemLocationBox", "", "", "", "java.util.List"));
        ajc$tjp_9 = whqVar.f(whqVar.e("setItems", "com.coremedia.iso.boxes.ItemLocationBox", "java.util.List", "items", "", "void"));
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        int y = crx0.y(byteBuffer);
        this.offsetSize = y >>> 4;
        this.lengthSize = y & 15;
        int e = crx0.e(byteBuffer.get());
        this.baseOffsetSize = e >>> 4;
        if (getVersion() == 1) {
            this.indexSize = e & 15;
        }
        int u = crx0.u(byteBuffer);
        for (int i = 0; i < u; i++) {
            this.items.add(new b(byteBuffer));
        }
    }

    public a createExtent(long j, long j2, long j3) {
        new Long(j);
        new Long(j2);
        new Long(j3);
        Hashtable hashtable = whq.b;
        w8g0.a();
        if (!isParsed()) {
            parseDetails();
        }
        return new a(j, j2, j3);
    }

    public b createItem(int i, int i2, int i3, long j, List<a> list) {
        new Integer(i);
        new Integer(i2);
        new Integer(i3);
        new Long(j);
        Hashtable hashtable = whq.b;
        w8g0.a();
        if (!isParsed()) {
            parseDetails();
        }
        return new b(i, i2, i3, j, list);
    }

    public int getBaseOffsetSize() {
        o0y c = whq.c(ajc$tjp_4, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.baseOffsetSize;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        int i;
        writeVersionAndFlags(byteBuffer);
        aqw.w((this.offsetSize << 4) | this.lengthSize, byteBuffer);
        if (getVersion() == 1) {
            byteBuffer.put((byte) (((this.baseOffsetSize << 4) | this.indexSize) & 255));
        } else {
            byteBuffer.put((byte) ((this.baseOffsetSize << 4) & 255));
        }
        aqw.u(this.items.size(), byteBuffer);
        for (b bVar : this.items) {
            List<a> list = bVar.e;
            aqw.u(bVar.a, byteBuffer);
            ItemLocationBox itemLocationBox = ItemLocationBox.this;
            if (itemLocationBox.getVersion() == 1) {
                aqw.u(bVar.b, byteBuffer);
            }
            aqw.u(bVar.c, byteBuffer);
            int i2 = itemLocationBox.baseOffsetSize;
            if (i2 > 0) {
                ad0.L(bVar.d, i2, byteBuffer);
            }
            aqw.u(list.size(), byteBuffer);
            for (a aVar : list) {
                ItemLocationBox itemLocationBox2 = ItemLocationBox.this;
                if (itemLocationBox2.getVersion() == 1 && (i = itemLocationBox2.indexSize) > 0) {
                    ad0.L(aVar.c, i, byteBuffer);
                }
                ad0.L(aVar.a, itemLocationBox2.offsetSize, byteBuffer);
                ad0.L(aVar.b, itemLocationBox2.lengthSize, byteBuffer);
            }
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        long j = 8;
        for (b bVar : this.items) {
            ItemLocationBox itemLocationBox = ItemLocationBox.this;
            int i = (itemLocationBox.getVersion() == 1 ? 4 : 2) + 2 + itemLocationBox.baseOffsetSize + 2;
            Iterator<a> it = bVar.e.iterator();
            while (it.hasNext()) {
                ItemLocationBox itemLocationBox2 = ItemLocationBox.this;
                int i2 = itemLocationBox2.indexSize;
                if (i2 <= 0) {
                    i2 = 0;
                }
                i += i2 + itemLocationBox2.offsetSize + itemLocationBox2.lengthSize;
            }
            j += i;
        }
        return j;
    }

    public int getIndexSize() {
        o0y c = whq.c(ajc$tjp_6, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.indexSize;
    }

    public List<b> getItems() {
        o0y c = whq.c(ajc$tjp_8, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.items;
    }

    public int getLengthSize() {
        o0y c = whq.c(ajc$tjp_2, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.lengthSize;
    }

    public int getOffsetSize() {
        o0y c = whq.c(ajc$tjp_0, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.offsetSize;
    }

    public void setBaseOffsetSize(int i) {
        o0y d = whq.d(ajc$tjp_5, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.baseOffsetSize = i;
    }

    public void setIndexSize(int i) {
        o0y d = whq.d(ajc$tjp_7, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.indexSize = i;
    }

    public void setItems(List<b> list) {
        o0y d = whq.d(ajc$tjp_9, this, this, list);
        w8g0.a();
        w8g0.b(d);
        this.items = list;
    }

    public void setLengthSize(int i) {
        o0y d = whq.d(ajc$tjp_3, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.lengthSize = i;
    }

    public void setOffsetSize(int i) {
        o0y d = whq.d(ajc$tjp_1, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.offsetSize = i;
    }

    public class a {
        public final long a;
        public final long b;
        public final long c;

        public a(long j, long j2, long j3) {
            this.a = j;
            this.b = j2;
            this.c = j3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.c == aVar.c && this.b == aVar.b && this.a == aVar.a;
        }

        public final int hashCode() {
            long j = this.a;
            long j2 = this.b;
            int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.c;
            return i + ((int) ((j3 >>> 32) ^ j3));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Extent{extentOffset=");
            sb.append(this.a);
            sb.append(", extentLength=");
            sb.append(this.b);
            sb.append(", extentIndex=");
            return vu5.a('}', this.c, sb);
        }

        public a(ByteBuffer byteBuffer) {
            int i;
            if (ItemLocationBox.this.getVersion() == 1 && (i = ItemLocationBox.this.indexSize) > 0) {
                this.c = cvk.s(i, byteBuffer);
            }
            this.a = cvk.s(ItemLocationBox.this.offsetSize, byteBuffer);
            this.b = cvk.s(ItemLocationBox.this.lengthSize, byteBuffer);
        }
    }

    public a createExtent(ByteBuffer byteBuffer) {
        return new a(byteBuffer);
    }

    public b createItem(ByteBuffer byteBuffer) {
        return new b(byteBuffer);
    }

    public class b {
        public final int a;
        public final int b;
        public final int c;
        public final long d;
        public final List<a> e;

        public b(ByteBuffer byteBuffer) {
            this.e = new LinkedList();
            this.a = crx0.u(byteBuffer);
            if (ItemLocationBox.this.getVersion() == 1) {
                this.b = crx0.u(byteBuffer) & 15;
            }
            this.c = crx0.u(byteBuffer);
            int i = ItemLocationBox.this.baseOffsetSize;
            if (i > 0) {
                this.d = cvk.s(i, byteBuffer);
            } else {
                this.d = 0L;
            }
            int u = crx0.u(byteBuffer);
            for (int i2 = 0; i2 < u; i2++) {
                this.e.add(ItemLocationBox.this.new a(byteBuffer));
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            List<a> list = bVar.e;
            if (this.d != bVar.d || this.b != bVar.b || this.c != bVar.c || this.a != bVar.a) {
                return false;
            }
            List<a> list2 = this.e;
            return list2 == null ? list == null : list2.equals(list);
        }

        public final int hashCode() {
            int i = ((((this.a * 31) + this.b) * 31) + this.c) * 31;
            long j = this.d;
            int i2 = (i + ((int) (j ^ (j >>> 32)))) * 31;
            List<a> list = this.e;
            return i2 + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Item{baseOffset=");
            sb.append(this.d);
            sb.append(", itemId=");
            sb.append(this.a);
            sb.append(", constructionMethod=");
            sb.append(this.b);
            sb.append(", dataReferenceIndex=");
            sb.append(this.c);
            sb.append(", extents=");
            return ms9.a('}', sb, this.e);
        }

        public b(int i, int i2, int i3, long j, List<a> list) {
            new LinkedList();
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = j;
            this.e = list;
        }
    }
}
