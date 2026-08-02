package com.mbridge.msdk.thrid.okhttp.internal.http2;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.ironsource.Hb;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.mbridge.msdk.thrid.okio.s;
import com.unity3d.services.core.network.model.HttpRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ru.ok.android.externcalls.sdk.rate.connection.CandidateTypeHintConfig;

/* compiled from: Hpack.java */
/* loaded from: classes14.dex */
final class d {
    static final c[] a;
    static final Map<com.mbridge.msdk.thrid.okio.f, Integer> b;

    /* compiled from: Hpack.java */
    public static final class a {
        private final List<c> a;
        private final com.mbridge.msdk.thrid.okio.e b;
        private final int c;
        private int d;
        c[] e;
        int f;
        int g;
        int h;

        public a(int i, s sVar) {
            this(i, i, sVar);
        }

        private void a() {
            int i = this.d;
            int i2 = this.h;
            if (i < i2) {
                if (i == 0) {
                    b();
                } else {
                    b(i2 - i);
                }
            }
        }

        private void b() {
            Arrays.fill(this.e, (Object) null);
            this.f = this.e.length - 1;
            this.g = 0;
            this.h = 0;
        }

        private boolean d(int i) {
            return i >= 0 && i <= d.a.length - 1;
        }

        private void e(int i) throws IOException {
            if (d(i)) {
                this.a.add(d.a[i]);
                return;
            }
            int a = a(i - d.a.length);
            if (a >= 0) {
                c[] cVarArr = this.e;
                if (a < cVarArr.length) {
                    this.a.add(cVarArr[a]);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        private void g(int i) throws IOException {
            this.a.add(new c(c(i), e()));
        }

        private void h() throws IOException {
            this.a.add(new c(d.a(e()), e()));
        }

        public List<c> c() {
            ArrayList arrayList = new ArrayList(this.a);
            this.a.clear();
            return arrayList;
        }

        public void f() throws IOException {
            while (!this.b.f()) {
                byte readByte = this.b.readByte();
                int i = readByte & 255;
                if (i == 128) {
                    throw new IOException("index == 0");
                }
                if ((readByte & 128) == 128) {
                    e(a(i, 127) - 1);
                } else if (i == 64) {
                    g();
                } else if ((readByte & 64) == 64) {
                    f(a(i, 63) - 1);
                } else if ((readByte & 32) == 32) {
                    int a = a(i, 31);
                    this.d = a;
                    if (a < 0 || a > this.c) {
                        throw new IOException("Invalid dynamic table size update " + this.d);
                    }
                    a();
                } else if (i == 16 || i == 0) {
                    h();
                } else {
                    g(a(i, 15) - 1);
                }
            }
        }

        public a(int i, int i2, s sVar) {
            this.a = new ArrayList();
            this.e = new c[8];
            this.f = 7;
            this.g = 0;
            this.h = 0;
            this.c = i;
            this.d = i2;
            this.b = com.mbridge.msdk.thrid.okio.l.a(sVar);
        }

        private int d() throws IOException {
            return this.b.readByte() & 255;
        }

        private com.mbridge.msdk.thrid.okio.f c(int i) throws IOException {
            if (d(i)) {
                return d.a[i].a;
            }
            int a = a(i - d.a.length);
            if (a >= 0) {
                c[] cVarArr = this.e;
                if (a < cVarArr.length) {
                    return cVarArr[a].a;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        private int a(int i) {
            return this.f + 1 + i;
        }

        private void g() throws IOException {
            a(-1, new c(d.a(e()), e()));
        }

        private void a(int i, c cVar) {
            this.a.add(cVar);
            int i2 = cVar.c;
            if (i != -1) {
                i2 -= this.e[a(i)].c;
            }
            int i3 = this.d;
            if (i2 > i3) {
                b();
                return;
            }
            int b = b((this.h + i2) - i3);
            if (i == -1) {
                int i4 = this.g + 1;
                c[] cVarArr = this.e;
                if (i4 > cVarArr.length) {
                    c[] cVarArr2 = new c[cVarArr.length * 2];
                    System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                    this.f = this.e.length - 1;
                    this.e = cVarArr2;
                }
                int i5 = this.f;
                this.f = i5 - 1;
                this.e[i5] = cVar;
                this.g++;
            } else {
                this.e[a(i) + b + i] = cVar;
            }
            this.h += i2;
        }

        private int b(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.e.length;
                while (true) {
                    length--;
                    i2 = this.f;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    int i4 = this.e[length].c;
                    i -= i4;
                    this.h -= i4;
                    this.g--;
                    i3++;
                }
                c[] cVarArr = this.e;
                int i5 = i2 + 1;
                System.arraycopy(cVarArr, i5, cVarArr, i5 + i3, this.g);
                this.f += i3;
            }
            return i3;
        }

        public com.mbridge.msdk.thrid.okio.f e() throws IOException {
            int d = d();
            boolean z = (d & 128) == 128;
            int a = a(d, 127);
            if (z) {
                return com.mbridge.msdk.thrid.okio.f.a(k.b().a(this.b.c(a)));
            }
            return this.b.b(a);
        }

        private void f(int i) throws IOException {
            a(-1, new c(c(i), e()));
        }

        public int a(int i, int i2) throws IOException {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int d = d();
                if ((d & 128) == 0) {
                    return i2 + (d << i4);
                }
                i2 += (d & 127) << i4;
                i4 += 7;
            }
        }
    }

    /* compiled from: Hpack.java */
    public static final class b {
        private final com.mbridge.msdk.thrid.okio.c a;
        private final boolean b;
        private int c;
        private boolean d;
        int e;
        int f;
        c[] g;
        int h;
        int i;
        int j;

        public b(com.mbridge.msdk.thrid.okio.c cVar) {
            this(4096, true, cVar);
        }

        private int a(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.g.length;
                while (true) {
                    length--;
                    i2 = this.h;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    int i4 = this.g[length].c;
                    i -= i4;
                    this.j -= i4;
                    this.i--;
                    i3++;
                }
                c[] cVarArr = this.g;
                int i5 = i2 + 1;
                System.arraycopy(cVarArr, i5, cVarArr, i5 + i3, this.i);
                c[] cVarArr2 = this.g;
                int i6 = this.h + 1;
                Arrays.fill(cVarArr2, i6, i6 + i3, (Object) null);
                this.h += i3;
            }
            return i3;
        }

        private void b() {
            Arrays.fill(this.g, (Object) null);
            this.h = this.g.length - 1;
            this.i = 0;
            this.j = 0;
        }

        public b(int i, boolean z, com.mbridge.msdk.thrid.okio.c cVar) {
            this.c = Integer.MAX_VALUE;
            this.g = new c[8];
            this.h = 7;
            this.i = 0;
            this.j = 0;
            this.e = i;
            this.f = i;
            this.b = z;
            this.a = cVar;
        }

        public void b(int i) {
            this.e = i;
            int min = Math.min(i, 16384);
            int i2 = this.f;
            if (i2 == min) {
                return;
            }
            if (min < i2) {
                this.c = Math.min(this.c, min);
            }
            this.d = true;
            this.f = min;
            a();
        }

        private void a(c cVar) {
            int i = cVar.c;
            int i2 = this.f;
            if (i > i2) {
                b();
                return;
            }
            a((this.j + i) - i2);
            int i3 = this.i + 1;
            c[] cVarArr = this.g;
            if (i3 > cVarArr.length) {
                c[] cVarArr2 = new c[cVarArr.length * 2];
                System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.h = this.g.length - 1;
                this.g = cVarArr2;
            }
            int i4 = this.h;
            this.h = i4 - 1;
            this.g[i4] = cVar;
            this.i++;
            this.j += i;
        }

        public void a(List<c> list) throws IOException {
            int i;
            int i2;
            if (this.d) {
                int i3 = this.c;
                if (i3 < this.f) {
                    a(i3, 31, 32);
                }
                this.d = false;
                this.c = Integer.MAX_VALUE;
                a(this.f, 31, 32);
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                c cVar = list.get(i4);
                com.mbridge.msdk.thrid.okio.f k = cVar.a.k();
                com.mbridge.msdk.thrid.okio.f fVar = cVar.b;
                Integer num = d.b.get(k);
                if (num != null) {
                    int intValue = num.intValue();
                    i2 = intValue + 1;
                    if (i2 > 1 && i2 < 8) {
                        c[] cVarArr = d.a;
                        if (com.mbridge.msdk.thrid.okhttp.internal.c.a(cVarArr[intValue].b, fVar)) {
                            i = i2;
                        } else if (com.mbridge.msdk.thrid.okhttp.internal.c.a(cVarArr[i2].b, fVar)) {
                            i2 = intValue + 2;
                            i = i2;
                        }
                    }
                    i = i2;
                    i2 = -1;
                } else {
                    i = -1;
                    i2 = -1;
                }
                if (i2 == -1) {
                    int i5 = this.h + 1;
                    int length = this.g.length;
                    while (true) {
                        if (i5 >= length) {
                            break;
                        }
                        if (com.mbridge.msdk.thrid.okhttp.internal.c.a(this.g[i5].a, k)) {
                            if (com.mbridge.msdk.thrid.okhttp.internal.c.a(this.g[i5].b, fVar)) {
                                i2 = (i5 - this.h) + d.a.length;
                                break;
                            } else if (i == -1) {
                                i = (i5 - this.h) + d.a.length;
                            }
                        }
                        i5++;
                    }
                }
                if (i2 != -1) {
                    a(i2, 127, 128);
                } else if (i == -1) {
                    this.a.writeByte(64);
                    a(k);
                    a(fVar);
                    a(cVar);
                } else if (k.b(c.d) && !c.i.equals(k)) {
                    a(i, 15, 0);
                    a(fVar);
                } else {
                    a(i, 63, 64);
                    a(fVar);
                    a(cVar);
                }
            }
        }

        public void a(int i, int i2, int i3) {
            if (i < i2) {
                this.a.writeByte(i | i3);
                return;
            }
            this.a.writeByte(i3 | i2);
            int i4 = i - i2;
            while (i4 >= 128) {
                this.a.writeByte(128 | (i4 & 127));
                i4 >>>= 7;
            }
            this.a.writeByte(i4);
        }

        public void a(com.mbridge.msdk.thrid.okio.f fVar) throws IOException {
            if (this.b && k.b().a(fVar) < fVar.j()) {
                com.mbridge.msdk.thrid.okio.c cVar = new com.mbridge.msdk.thrid.okio.c();
                k.b().a(fVar, cVar);
                com.mbridge.msdk.thrid.okio.f o = cVar.o();
                a(o.j(), 127, 128);
                this.a.a(o);
                return;
            }
            a(fVar.j(), 127, 0);
            this.a.a(fVar);
        }

        private void a() {
            int i = this.f;
            int i2 = this.j;
            if (i < i2) {
                if (i == 0) {
                    b();
                } else {
                    a(i2 - i);
                }
            }
        }
    }

    static {
        c cVar = new c(c.i, "");
        com.mbridge.msdk.thrid.okio.f fVar = c.f;
        c cVar2 = new c(fVar, "GET");
        c cVar3 = new c(fVar, "POST");
        com.mbridge.msdk.thrid.okio.f fVar2 = c.g;
        c cVar4 = new c(fVar2, DomExceptionUtils.SEPARATOR);
        c cVar5 = new c(fVar2, "/index.html");
        com.mbridge.msdk.thrid.okio.f fVar3 = c.h;
        c cVar6 = new c(fVar3, "http");
        c cVar7 = new c(fVar3, HttpRequest.DEFAULT_SCHEME);
        com.mbridge.msdk.thrid.okio.f fVar4 = c.e;
        a = new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, new c(fVar4, "200"), new c(fVar4, "204"), new c(fVar4, "206"), new c(fVar4, "304"), new c(fVar4, "400"), new c(fVar4, "404"), new c(fVar4, "500"), new c("accept-charset", ""), new c("accept-encoding", "gzip, deflate"), new c("accept-language", ""), new c("accept-ranges", ""), new c("accept", ""), new c("access-control-allow-origin", ""), new c("age", ""), new c("allow", ""), new c("authorization", ""), new c("cache-control", ""), new c("content-disposition", ""), new c("content-encoding", ""), new c("content-language", ""), new c("content-length", ""), new c("content-location", ""), new c("content-range", ""), new c("content-type", ""), new c("cookie", ""), new c("date", ""), new c(DownloadModel.ETAG, ""), new c("expect", ""), new c("expires", ""), new c("from", ""), new c(CandidateTypeHintConfig.TYPE_HOST, ""), new c("if-match", ""), new c("if-modified-since", ""), new c("if-none-match", ""), new c("if-range", ""), new c("if-unmodified-since", ""), new c("last-modified", ""), new c("link", ""), new c("location", ""), new c("max-forwards", ""), new c("proxy-authenticate", ""), new c("proxy-authorization", ""), new c("range", ""), new c("referer", ""), new c(ToolBar.REFRESH, ""), new c("retry-after", ""), new c(Hb.a, ""), new c("set-cookie", ""), new c("strict-transport-security", ""), new c("transfer-encoding", ""), new c("user-agent", ""), new c("vary", ""), new c("via", ""), new c("www-authenticate", "")};
        b = a();
    }

    private static Map<com.mbridge.msdk.thrid.okio.f, Integer> a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(a.length);
        int i = 0;
        while (true) {
            c[] cVarArr = a;
            if (i >= cVarArr.length) {
                return Collections.unmodifiableMap(linkedHashMap);
            }
            if (!linkedHashMap.containsKey(cVarArr[i].a)) {
                linkedHashMap.put(cVarArr[i].a, Integer.valueOf(i));
            }
            i++;
        }
    }

    public static com.mbridge.msdk.thrid.okio.f a(com.mbridge.msdk.thrid.okio.f fVar) throws IOException {
        int j = fVar.j();
        for (int i = 0; i < j; i++) {
            byte a2 = fVar.a(i);
            if (a2 >= 65 && a2 <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + fVar.m());
            }
        }
        return fVar;
    }
}
