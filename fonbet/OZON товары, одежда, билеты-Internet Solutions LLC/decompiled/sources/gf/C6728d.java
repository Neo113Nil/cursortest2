package gf;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gf.m;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import sf.C9681g;
import sf.C9684j;
import sf.G;
import sf.z;

/* renamed from: gf.d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6728d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final C6727c[] f64305a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Map<C9684j, Integer> f64306b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f64307c = 0;

    /* renamed from: gf.d$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f64308a;

        /* renamed from: b, reason: collision with root package name */
        private final G f64309b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public C6727c[] f64310c;

        /* renamed from: d, reason: collision with root package name */
        private int f64311d;

        /* renamed from: e, reason: collision with root package name */
        public int f64312e;

        /* renamed from: f, reason: collision with root package name */
        public int f64313f;

        /* renamed from: g, reason: collision with root package name */
        private int f64314g;

        public a(m.b source) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.f64314g = 4096;
            this.f64308a = new ArrayList();
            this.f64309b = z.d(source);
            this.f64310c = new C6727c[8];
            this.f64311d = 7;
        }

        private final int a(int i11) {
            int i12;
            int i13 = 0;
            if (i11 > 0) {
                int length = this.f64310c.length;
                while (true) {
                    length--;
                    i12 = this.f64311d;
                    if (length < i12 || i11 <= 0) {
                        break;
                    }
                    C6727c c6727c = this.f64310c[length];
                    Intrinsics.f(c6727c);
                    int i14 = c6727c.f64302a;
                    i11 -= i14;
                    this.f64313f -= i14;
                    this.f64312e--;
                    i13++;
                }
                C6727c[] c6727cArr = this.f64310c;
                System.arraycopy(c6727cArr, i12 + 1, c6727cArr, i12 + 1 + i13, this.f64312e);
                this.f64311d += i13;
            }
            return i13;
        }

        private final C9684j c(int i11) throws IOException {
            if (i11 >= 0 && i11 <= C6728d.c().length - 1) {
                return C6728d.c()[i11].f64303b;
            }
            int length = this.f64311d + 1 + (i11 - C6728d.c().length);
            if (length >= 0) {
                C6727c[] c6727cArr = this.f64310c;
                if (length < c6727cArr.length) {
                    C6727c c6727c = c6727cArr[length];
                    Intrinsics.f(c6727c);
                    return c6727c.f64303b;
                }
            }
            throw new IOException("Header index too large " + (i11 + 1));
        }

        private final void d(C6727c c6727c) {
            this.f64308a.add(c6727c);
            int i11 = this.f64314g;
            int i12 = c6727c.f64302a;
            if (i12 > i11) {
                C7705l.x(r7, null, 0, this.f64310c.length);
                this.f64311d = this.f64310c.length - 1;
                this.f64312e = 0;
                this.f64313f = 0;
                return;
            }
            a((this.f64313f + i12) - i11);
            int i13 = this.f64312e + 1;
            C6727c[] c6727cArr = this.f64310c;
            if (i13 > c6727cArr.length) {
                C6727c[] c6727cArr2 = new C6727c[c6727cArr.length * 2];
                System.arraycopy(c6727cArr, 0, c6727cArr2, c6727cArr.length, c6727cArr.length);
                this.f64311d = this.f64310c.length - 1;
                this.f64310c = c6727cArr2;
            }
            int i14 = this.f64311d;
            this.f64311d = i14 - 1;
            this.f64310c[i14] = c6727c;
            this.f64312e++;
            this.f64313f += i12;
        }

        @NotNull
        public final List<C6727c> b() {
            ArrayList arrayList = this.f64308a;
            List<C6727c> U02 = C7714v.U0(arrayList);
            arrayList.clear();
            return U02;
        }

        @NotNull
        public final C9684j e() throws IOException {
            G g10 = this.f64309b;
            byte readByte = g10.readByte();
            byte[] bArr = Ye.b.f34900a;
            int i11 = readByte & 255;
            boolean z11 = (readByte & 128) == 128;
            long g11 = g(i11, 127);
            if (!z11) {
                return g10.d(g11);
            }
            C9681g c9681g = new C9681g();
            p.a(g10, g11, c9681g);
            return c9681g.v0();
        }

        /* JADX WARN: Code restructure failed: missing block: B:46:0x00de, code lost:
        
            throw new java.io.IOException("Invalid dynamic table size update " + r8.f64314g);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void f() throws IOException {
            int g10;
            while (true) {
                G g11 = this.f64309b;
                if (g11.c()) {
                    return;
                }
                byte readByte = g11.readByte();
                byte[] bArr = Ye.b.f34900a;
                int i11 = readByte & 255;
                if (i11 == 128) {
                    throw new IOException("index == 0");
                }
                int i12 = readByte & 128;
                ArrayList arrayList = this.f64308a;
                if (i12 == 128) {
                    g10 = g(i11, 127);
                    int i13 = g10 - 1;
                    if (i13 < 0 || i13 > C6728d.c().length - 1) {
                        int length = this.f64311d + 1 + (i13 - C6728d.c().length);
                        if (length < 0) {
                            break;
                        }
                        C6727c[] c6727cArr = this.f64310c;
                        if (length >= c6727cArr.length) {
                            break;
                        }
                        C6727c c6727c = c6727cArr[length];
                        Intrinsics.f(c6727c);
                        arrayList.add(c6727c);
                    } else {
                        arrayList.add(C6728d.c()[i13]);
                    }
                } else if (i11 == 64) {
                    int i14 = C6728d.f64307c;
                    C9684j e11 = e();
                    C6728d.a(e11);
                    d(new C6727c(e11, e()));
                } else if ((readByte & 64) == 64) {
                    d(new C6727c(c(g(i11, 63) - 1), e()));
                } else if ((readByte & 32) == 32) {
                    int g12 = g(i11, 31);
                    this.f64314g = g12;
                    if (g12 < 0 || g12 > 4096) {
                        break;
                    }
                    int i15 = this.f64313f;
                    if (g12 < i15) {
                        if (g12 == 0) {
                            C7705l.x(r3, null, 0, this.f64310c.length);
                            this.f64311d = this.f64310c.length - 1;
                            this.f64312e = 0;
                            this.f64313f = 0;
                        } else {
                            a(i15 - g12);
                        }
                    }
                } else if (i11 == 16 || i11 == 0) {
                    int i16 = C6728d.f64307c;
                    C9684j e12 = e();
                    C6728d.a(e12);
                    arrayList.add(new C6727c(e12, e()));
                } else {
                    arrayList.add(new C6727c(c(g(i11, 15) - 1), e()));
                }
            }
            throw new IOException(Ej.b.a(g10, "Header index too large "));
        }

        public final int g(int i11, int i12) throws IOException {
            int i13 = i11 & i12;
            if (i13 < i12) {
                return i13;
            }
            int i14 = 0;
            while (true) {
                byte readByte = this.f64309b.readByte();
                byte[] bArr = Ye.b.f34900a;
                int i15 = readByte & 255;
                if ((readByte & 128) == 0) {
                    return i12 + (i15 << i14);
                }
                i12 += (readByte & Byte.MAX_VALUE) << i14;
                i14 += 7;
            }
        }
    }

    /* renamed from: gf.d$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private int f64315a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f64316b;

        /* renamed from: c, reason: collision with root package name */
        public int f64317c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        public C6727c[] f64318d;

        /* renamed from: e, reason: collision with root package name */
        private int f64319e;

        /* renamed from: f, reason: collision with root package name */
        public int f64320f;

        /* renamed from: g, reason: collision with root package name */
        public int f64321g;

        /* renamed from: h, reason: collision with root package name */
        private final C9681g f64322h;

        public b(C9681g out) {
            Intrinsics.checkNotNullParameter(out, "out");
            this.f64322h = out;
            this.f64315a = Integer.MAX_VALUE;
            this.f64317c = 4096;
            this.f64318d = new C6727c[8];
            this.f64319e = 7;
        }

        private final void a(int i11) {
            int i12;
            if (i11 > 0) {
                int length = this.f64318d.length - 1;
                int i13 = 0;
                while (true) {
                    i12 = this.f64319e;
                    if (length < i12 || i11 <= 0) {
                        break;
                    }
                    C6727c c6727c = this.f64318d[length];
                    Intrinsics.f(c6727c);
                    i11 -= c6727c.f64302a;
                    int i14 = this.f64321g;
                    C6727c c6727c2 = this.f64318d[length];
                    Intrinsics.f(c6727c2);
                    this.f64321g = i14 - c6727c2.f64302a;
                    this.f64320f--;
                    i13++;
                    length--;
                }
                C6727c[] c6727cArr = this.f64318d;
                int i15 = i12 + 1;
                System.arraycopy(c6727cArr, i15, c6727cArr, i15 + i13, this.f64320f);
                C6727c[] c6727cArr2 = this.f64318d;
                int i16 = this.f64319e + 1;
                Arrays.fill(c6727cArr2, i16, i16 + i13, (Object) null);
                this.f64319e += i13;
            }
        }

        private final void b(C6727c c6727c) {
            int i11 = this.f64317c;
            int i12 = c6727c.f64302a;
            if (i12 > i11) {
                C6727c[] c6727cArr = this.f64318d;
                C7705l.x(c6727cArr, null, 0, c6727cArr.length);
                this.f64319e = this.f64318d.length - 1;
                this.f64320f = 0;
                this.f64321g = 0;
                return;
            }
            a((this.f64321g + i12) - i11);
            int i13 = this.f64320f + 1;
            C6727c[] c6727cArr2 = this.f64318d;
            if (i13 > c6727cArr2.length) {
                C6727c[] c6727cArr3 = new C6727c[c6727cArr2.length * 2];
                System.arraycopy(c6727cArr2, 0, c6727cArr3, c6727cArr2.length, c6727cArr2.length);
                this.f64319e = this.f64318d.length - 1;
                this.f64318d = c6727cArr3;
            }
            int i14 = this.f64319e;
            this.f64319e = i14 - 1;
            this.f64318d[i14] = c6727c;
            this.f64320f++;
            this.f64321g += i12;
        }

        public final void c(int i11) {
            int min = Math.min(i11, 16384);
            int i12 = this.f64317c;
            if (i12 == min) {
                return;
            }
            if (min < i12) {
                this.f64315a = Math.min(this.f64315a, min);
            }
            this.f64316b = true;
            this.f64317c = min;
            int i13 = this.f64321g;
            if (min < i13) {
                if (min != 0) {
                    a(i13 - min);
                    return;
                }
                C6727c[] c6727cArr = this.f64318d;
                C7705l.x(c6727cArr, null, 0, c6727cArr.length);
                this.f64319e = this.f64318d.length - 1;
                this.f64320f = 0;
                this.f64321g = 0;
            }
        }

        public final void d(@NotNull C9684j data) throws IOException {
            Intrinsics.checkNotNullParameter(data, "data");
            C9681g c9681g = this.f64322h;
            if (p.c(data) >= data.g()) {
                f(data.g(), 127, 0);
                c9681g.X(data);
                return;
            }
            C9681g c9681g2 = new C9681g();
            p.b(data, c9681g2);
            C9684j v02 = c9681g2.v0();
            f(v02.g(), 127, UserVerificationMethods.USER_VERIFY_PATTERN);
            c9681g.X(v02);
        }

        public final void e(@NotNull List<C6727c> headerBlock) throws IOException {
            int i11;
            int i12;
            Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
            if (this.f64316b) {
                int i13 = this.f64315a;
                if (i13 < this.f64317c) {
                    f(i13, 31, 32);
                }
                this.f64316b = false;
                this.f64315a = Integer.MAX_VALUE;
                f(this.f64317c, 31, 32);
            }
            int size = headerBlock.size();
            for (int i14 = 0; i14 < size; i14++) {
                C6727c c6727c = headerBlock.get(i14);
                C9684j F11 = c6727c.f64303b.F();
                Integer num = (Integer) C6728d.b().get(F11);
                C9684j c9684j = c6727c.f64304c;
                if (num != null) {
                    int intValue = num.intValue();
                    i12 = intValue + 1;
                    if (2 <= i12 && 7 >= i12) {
                        if (Intrinsics.d(C6728d.c()[intValue].f64304c, c9684j)) {
                            i11 = i12;
                        } else if (Intrinsics.d(C6728d.c()[i12].f64304c, c9684j)) {
                            i12 = intValue + 2;
                            i11 = i12;
                        }
                    }
                    i11 = i12;
                    i12 = -1;
                } else {
                    i11 = -1;
                    i12 = -1;
                }
                if (i12 == -1) {
                    int i15 = this.f64319e + 1;
                    int length = this.f64318d.length;
                    while (true) {
                        if (i15 >= length) {
                            break;
                        }
                        C6727c c6727c2 = this.f64318d[i15];
                        Intrinsics.f(c6727c2);
                        if (Intrinsics.d(c6727c2.f64303b, F11)) {
                            C6727c c6727c3 = this.f64318d[i15];
                            Intrinsics.f(c6727c3);
                            if (Intrinsics.d(c6727c3.f64304c, c9684j)) {
                                i12 = C6728d.c().length + (i15 - this.f64319e);
                                break;
                            } else if (i11 == -1) {
                                i11 = (i15 - this.f64319e) + C6728d.c().length;
                            }
                        }
                        i15++;
                    }
                }
                if (i12 != -1) {
                    f(i12, 127, UserVerificationMethods.USER_VERIFY_PATTERN);
                } else if (i11 == -1) {
                    this.f64322h.d0(64);
                    d(F11);
                    d(c9684j);
                    b(c6727c);
                } else {
                    C9684j prefix = C6727c.f64296d;
                    F11.getClass();
                    Intrinsics.checkNotNullParameter(prefix, "prefix");
                    if (!F11.u(0, prefix, prefix.g()) || Intrinsics.d(C6727c.f64301i, F11)) {
                        f(i11, 63, 64);
                        d(c9684j);
                        b(c6727c);
                    } else {
                        f(i11, 15, 0);
                        d(c9684j);
                    }
                }
            }
        }

        public final void f(int i11, int i12, int i13) {
            C9681g c9681g = this.f64322h;
            if (i11 < i12) {
                c9681g.d0(i11 | i13);
                return;
            }
            c9681g.d0(i13 | i12);
            int i14 = i11 - i12;
            while (i14 >= 128) {
                c9681g.d0(128 | (i14 & 127));
                i14 >>>= 7;
            }
            c9681g.d0(i14);
        }
    }

    static {
        C6727c c6727c = new C6727c(C6727c.f64301i, "");
        C9684j c9684j = C6727c.f64298f;
        C6727c c6727c2 = new C6727c(c9684j, "GET");
        C6727c c6727c3 = new C6727c(c9684j, "POST");
        C9684j c9684j2 = C6727c.f64299g;
        C6727c c6727c4 = new C6727c(c9684j2, "/");
        C6727c c6727c5 = new C6727c(c9684j2, "/index.html");
        C9684j c9684j3 = C6727c.f64300h;
        C6727c c6727c6 = new C6727c(c9684j3, "http");
        C6727c c6727c7 = new C6727c(c9684j3, "https");
        C9684j c9684j4 = C6727c.f64297e;
        C6727c[] c6727cArr = {c6727c, c6727c2, c6727c3, c6727c4, c6727c5, c6727c6, c6727c7, new C6727c(c9684j4, "200"), new C6727c(c9684j4, "204"), new C6727c(c9684j4, "206"), new C6727c(c9684j4, "304"), new C6727c(c9684j4, "400"), new C6727c(c9684j4, "404"), new C6727c(c9684j4, "500"), new C6727c("accept-charset", ""), new C6727c("accept-encoding", "gzip, deflate"), new C6727c("accept-language", ""), new C6727c("accept-ranges", ""), new C6727c("accept", ""), new C6727c("access-control-allow-origin", ""), new C6727c("age", ""), new C6727c("allow", ""), new C6727c("authorization", ""), new C6727c("cache-control", ""), new C6727c("content-disposition", ""), new C6727c("content-encoding", ""), new C6727c("content-language", ""), new C6727c("content-length", ""), new C6727c("content-location", ""), new C6727c("content-range", ""), new C6727c("content-type", ""), new C6727c("cookie", ""), new C6727c("date", ""), new C6727c("etag", ""), new C6727c("expect", ""), new C6727c("expires", ""), new C6727c("from", ""), new C6727c("host", ""), new C6727c("if-match", ""), new C6727c("if-modified-since", ""), new C6727c("if-none-match", ""), new C6727c("if-range", ""), new C6727c("if-unmodified-since", ""), new C6727c("last-modified", ""), new C6727c("link", ""), new C6727c("location", ""), new C6727c("max-forwards", ""), new C6727c("proxy-authenticate", ""), new C6727c("proxy-authorization", ""), new C6727c(FormPageDTO.Field.FIELD_TYPE_RANGE, ""), new C6727c("referer", ""), new C6727c("refresh", ""), new C6727c("retry-after", ""), new C6727c("server", ""), new C6727c("set-cookie", ""), new C6727c("strict-transport-security", ""), new C6727c("transfer-encoding", ""), new C6727c("user-agent", ""), new C6727c("vary", ""), new C6727c("via", ""), new C6727c("www-authenticate", "")};
        f64305a = c6727cArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i11 = 0; i11 < 61; i11++) {
            if (!linkedHashMap.containsKey(c6727cArr[i11].f64303b)) {
                linkedHashMap.put(c6727cArr[i11].f64303b, Integer.valueOf(i11));
            }
        }
        Map<C9684j, Integer> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "Collections.unmodifiableMap(result)");
        f64306b = unmodifiableMap;
    }

    @NotNull
    public static void a(@NotNull C9684j name) throws IOException {
        Intrinsics.checkNotNullParameter(name, "name");
        int g10 = name.g();
        for (int i11 = 0; i11 < g10; i11++) {
            byte b11 = (byte) 65;
            byte b12 = (byte) 90;
            byte n11 = name.n(i11);
            if (b11 <= n11 && b12 >= n11) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(name.H()));
            }
        }
    }

    @NotNull
    public static Map b() {
        return f64306b;
    }

    @NotNull
    public static C6727c[] c() {
        return f64305a;
    }
}
