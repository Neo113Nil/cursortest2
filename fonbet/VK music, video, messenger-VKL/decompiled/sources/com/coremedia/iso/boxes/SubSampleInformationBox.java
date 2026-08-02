package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractFullBox;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.aqw;
import xsna.crx0;
import xsna.ms9;
import xsna.n0y;
import xsna.o0y;
import xsna.up2;
import xsna.vu5;
import xsna.w8g0;
import xsna.whq;

/* loaded from: classes12.dex */
public class SubSampleInformationBox extends AbstractFullBox {
    public static final String TYPE = "subs";
    private static final /* synthetic */ n0y ajc$tjp_0 = null;
    private static final /* synthetic */ n0y ajc$tjp_1 = null;
    private static final /* synthetic */ n0y ajc$tjp_2 = null;
    private List<a> entries;

    public static class a {
        public long a;
        public final ArrayList b = new ArrayList();

        /* renamed from: com.coremedia.iso.boxes.SubSampleInformationBox$a$a, reason: collision with other inner class name */
        public static class C0106a {
            public long a;
            public int b;
            public int c;
            public long d;

            public final String toString() {
                StringBuilder sb = new StringBuilder("SubsampleEntry{subsampleSize=");
                sb.append(this.a);
                sb.append(", subsamplePriority=");
                sb.append(this.b);
                sb.append(", discardable=");
                sb.append(this.c);
                sb.append(", reserved=");
                return vu5.a('}', this.d, sb);
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SampleEntry{sampleDelta=");
            sb.append(this.a);
            sb.append(", subsampleCount=");
            ArrayList arrayList = this.b;
            sb.append(arrayList.size());
            sb.append(", subsampleEntries=");
            sb.append(arrayList);
            sb.append('}');
            return sb.toString();
        }
    }

    static {
        ajc$preClinit();
    }

    public SubSampleInformationBox() {
        super("subs");
        this.entries = new ArrayList();
    }

    private static /* synthetic */ void ajc$preClinit() {
        whq whqVar = new whq("SubSampleInformationBox.java", SubSampleInformationBox.class);
        ajc$tjp_0 = whqVar.f(whqVar.e("getEntries", "com.coremedia.iso.boxes.SubSampleInformationBox", "", "", "", "java.util.List"));
        ajc$tjp_1 = whqVar.f(whqVar.e("setEntries", "com.coremedia.iso.boxes.SubSampleInformationBox", "java.util.List", "entries", "", "void"));
        ajc$tjp_2 = whqVar.f(whqVar.e("toString", "com.coremedia.iso.boxes.SubSampleInformationBox", "", "", "", "java.lang.String"));
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        long w = crx0.w(byteBuffer);
        for (int i = 0; i < w; i++) {
            a aVar = new a();
            aVar.a = crx0.w(byteBuffer);
            int u = crx0.u(byteBuffer);
            for (int i2 = 0; i2 < u; i2++) {
                a.C0106a c0106a = new a.C0106a();
                c0106a.a = getVersion() == 1 ? crx0.w(byteBuffer) : crx0.u(byteBuffer);
                c0106a.b = crx0.e(byteBuffer.get());
                c0106a.c = crx0.e(byteBuffer.get());
                c0106a.d = crx0.w(byteBuffer);
                aVar.b.add(c0106a);
            }
            this.entries.add(aVar);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.putInt(this.entries.size());
        for (a aVar : this.entries) {
            long j = aVar.a;
            ArrayList arrayList = aVar.b;
            byteBuffer.putInt((int) j);
            aqw.u(arrayList.size(), byteBuffer);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                a.C0106a c0106a = (a.C0106a) it.next();
                if (getVersion() == 1) {
                    byteBuffer.putInt((int) c0106a.a);
                } else {
                    aqw.u(up2.p(c0106a.a), byteBuffer);
                }
                byteBuffer.put((byte) (c0106a.b & 255));
                byteBuffer.put((byte) (c0106a.c & 255));
                byteBuffer.putInt((int) c0106a.d);
            }
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        long j = 8;
        for (a aVar : this.entries) {
            j += 6;
            for (int i = 0; i < aVar.b.size(); i++) {
                j = j + (getVersion() == 1 ? 4L : 2L) + 6;
            }
        }
        return j;
    }

    public List<a> getEntries() {
        o0y c = whq.c(ajc$tjp_0, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.entries;
    }

    public void setEntries(List<a> list) {
        o0y d = whq.d(ajc$tjp_1, this, this, list);
        w8g0.a();
        w8g0.b(d);
        this.entries = list;
    }

    public String toString() {
        o0y c = whq.c(ajc$tjp_2, this, this);
        w8g0.a();
        w8g0.b(c);
        StringBuilder sb = new StringBuilder("SubSampleInformationBox{entryCount=");
        sb.append(this.entries.size());
        sb.append(", entries=");
        return ms9.a('}', sb, this.entries);
    }
}
