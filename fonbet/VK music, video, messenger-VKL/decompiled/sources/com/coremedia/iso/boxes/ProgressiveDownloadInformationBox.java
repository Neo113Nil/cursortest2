package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractFullBox;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import xsna.crx0;
import xsna.ms9;
import xsna.n0y;
import xsna.o0y;
import xsna.vu5;
import xsna.w8g0;
import xsna.whq;

/* loaded from: classes12.dex */
public class ProgressiveDownloadInformationBox extends AbstractFullBox {
    public static final String TYPE = "pdin";
    private static final /* synthetic */ n0y ajc$tjp_0 = null;
    private static final /* synthetic */ n0y ajc$tjp_1 = null;
    private static final /* synthetic */ n0y ajc$tjp_2 = null;
    List<a> entries;

    public static class a {
        public long a;
        public long b;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.b == aVar.b && this.a == aVar.a;
        }

        public final int hashCode() {
            long j = this.a;
            int i = ((int) (j ^ (j >>> 32))) * 31;
            long j2 = this.b;
            return i + ((int) ((j2 >>> 32) ^ j2));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Entry{rate=");
            sb.append(this.a);
            sb.append(", initialDelay=");
            return vu5.a('}', this.b, sb);
        }
    }

    static {
        ajc$preClinit();
    }

    public ProgressiveDownloadInformationBox() {
        super(TYPE);
        this.entries = Collections.EMPTY_LIST;
    }

    private static /* synthetic */ void ajc$preClinit() {
        whq whqVar = new whq("ProgressiveDownloadInformationBox.java", ProgressiveDownloadInformationBox.class);
        ajc$tjp_0 = whqVar.f(whqVar.e("getEntries", "com.coremedia.iso.boxes.ProgressiveDownloadInformationBox", "", "", "", "java.util.List"));
        ajc$tjp_1 = whqVar.f(whqVar.e("setEntries", "com.coremedia.iso.boxes.ProgressiveDownloadInformationBox", "java.util.List", "entries", "", "void"));
        ajc$tjp_2 = whqVar.f(whqVar.e("toString", "com.coremedia.iso.boxes.ProgressiveDownloadInformationBox", "", "", "", "java.lang.String"));
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.entries = new LinkedList();
        while (byteBuffer.remaining() >= 8) {
            long w = crx0.w(byteBuffer);
            long w2 = crx0.w(byteBuffer);
            a aVar = new a();
            aVar.a = w;
            aVar.b = w2;
            this.entries.add(aVar);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        for (a aVar : this.entries) {
            byteBuffer.putInt((int) aVar.a);
            byteBuffer.putInt((int) aVar.b);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return (this.entries.size() * 8) + 4;
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
        return ms9.a('}', new StringBuilder("ProgressiveDownloadInfoBox{entries="), this.entries);
    }
}
