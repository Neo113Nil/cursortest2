package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractFullBox;
import com.ironsource.X3;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import xsna.crx0;
import xsna.n0y;
import xsna.o0y;
import xsna.up2;
import xsna.vu5;
import xsna.w8g0;
import xsna.whq;

/* loaded from: classes12.dex */
public class TimeToSampleBox extends AbstractFullBox {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String TYPE = "stts";
    private static final /* synthetic */ n0y ajc$tjp_0 = null;
    private static final /* synthetic */ n0y ajc$tjp_1 = null;
    private static final /* synthetic */ n0y ajc$tjp_2 = null;
    static Map<List<a>, SoftReference<long[]>> cache;
    List<a> entries;

    public static class a {
        public long a;
        public final long b;

        public a(long j, long j2) {
            this.a = j;
            this.b = j2;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Entry{count=");
            sb.append(this.a);
            sb.append(", delta=");
            return vu5.a('}', this.b, sb);
        }
    }

    static {
        ajc$preClinit();
        cache = new WeakHashMap();
    }

    public TimeToSampleBox() {
        super(TYPE);
        this.entries = Collections.EMPTY_LIST;
    }

    private static /* synthetic */ void ajc$preClinit() {
        whq whqVar = new whq("TimeToSampleBox.java", TimeToSampleBox.class);
        ajc$tjp_0 = whqVar.f(whqVar.e("getEntries", "com.coremedia.iso.boxes.TimeToSampleBox", "", "", "", "java.util.List"));
        ajc$tjp_1 = whqVar.f(whqVar.e("setEntries", "com.coremedia.iso.boxes.TimeToSampleBox", "java.util.List", "entries", "", "void"));
        ajc$tjp_2 = whqVar.f(whqVar.e("toString", "com.coremedia.iso.boxes.TimeToSampleBox", "", "", "", "java.lang.String"));
    }

    public static synchronized long[] blowupTimeToSamples(List<a> list) {
        long[] jArr;
        synchronized (TimeToSampleBox.class) {
            SoftReference<long[]> softReference = cache.get(list);
            if (softReference != null && (jArr = softReference.get()) != null) {
                return jArr;
            }
            Iterator<a> it = list.iterator();
            long j = 0;
            while (it.hasNext()) {
                j += it.next().a;
            }
            long[] jArr2 = new long[(int) j];
            int i = 0;
            for (a aVar : list) {
                int i2 = 0;
                while (i2 < aVar.a) {
                    jArr2[i] = aVar.b;
                    i2++;
                    i++;
                }
            }
            cache.put(list, new SoftReference<>(jArr2));
            return jArr2;
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        int p = up2.p(crx0.w(byteBuffer));
        this.entries = new ArrayList(p);
        for (int i = 0; i < p; i++) {
            this.entries.add(new a(crx0.w(byteBuffer), crx0.w(byteBuffer)));
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.putInt(this.entries.size());
        for (a aVar : this.entries) {
            byteBuffer.putInt((int) aVar.a);
            byteBuffer.putInt((int) aVar.b);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return (this.entries.size() * 8) + 8;
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
        return "TimeToSampleBox[entryCount=" + this.entries.size() + X3.j.e;
    }
}
