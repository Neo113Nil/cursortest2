package okhttp3.internal.publicsuffix;

import Ye.b;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import p002if.j;
import sf.G;
import sf.t;
import sf.z;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "<init>", "()V", "a", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes6.dex */
public final class PublicSuffixDatabase {

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f78416e = {(byte) 42};

    /* renamed from: f, reason: collision with root package name */
    private static final List<String> f78417f = C7714v.a0("*");

    /* renamed from: g, reason: collision with root package name */
    private static final PublicSuffixDatabase f78418g = new PublicSuffixDatabase();

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f78419h = 0;

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f78420a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    private final CountDownLatch f78421b = new CountDownLatch(1);

    /* renamed from: c, reason: collision with root package name */
    private byte[] f78422c;

    /* renamed from: d, reason: collision with root package name */
    private byte[] f78423d;

    public static final class a {
        public static final String a(byte[] bArr, byte[][] bArr2, int i11) {
            int i12;
            boolean z11;
            int i13;
            int i14;
            int i15 = -1;
            int i16 = PublicSuffixDatabase.f78419h;
            int length = bArr.length;
            int i17 = 0;
            while (i17 < length) {
                int i18 = (i17 + length) / 2;
                while (i18 > i15 && bArr[i18] != ((byte) 10)) {
                    i18 += i15;
                }
                int i19 = i18 + 1;
                int i21 = 1;
                while (true) {
                    i12 = i19 + i21;
                    if (bArr[i12] == ((byte) 10)) {
                        break;
                    }
                    i21++;
                }
                int i22 = i12 - i19;
                int i23 = i11;
                boolean z12 = false;
                int i24 = 0;
                int i25 = 0;
                while (true) {
                    if (z12) {
                        i13 = 46;
                        z11 = false;
                    } else {
                        byte b11 = bArr2[i23][i24];
                        byte[] bArr3 = b.f34900a;
                        int i26 = b11 & 255;
                        z11 = z12;
                        i13 = i26;
                    }
                    byte b12 = bArr[i19 + i25];
                    byte[] bArr4 = b.f34900a;
                    i14 = i13 - (b12 & 255);
                    if (i14 != 0) {
                        break;
                    }
                    i25++;
                    i24++;
                    if (i25 == i22) {
                        break;
                    }
                    if (bArr2[i23].length != i24) {
                        z12 = z11;
                    } else {
                        if (i23 == bArr2.length - 1) {
                            break;
                        }
                        i23++;
                        z12 = true;
                        i24 = -1;
                    }
                }
                if (i14 >= 0) {
                    if (i14 <= 0) {
                        int i27 = i22 - i25;
                        int length2 = bArr2[i23].length - i24;
                        int length3 = bArr2.length;
                        for (int i28 = i23 + 1; i28 < length3; i28++) {
                            length2 += bArr2[i28].length;
                        }
                        if (length2 >= i27) {
                            if (length2 <= i27) {
                                Charset UTF_8 = StandardCharsets.UTF_8;
                                Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
                                return new String(bArr, i19, i22, UTF_8);
                            }
                        }
                    }
                    i17 = i12 + 1;
                    i15 = -1;
                }
                length = i18;
                i15 = -1;
            }
            return null;
        }
    }

    private final void c() throws IOException {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
        if (resourceAsStream == null) {
            return;
        }
        G d11 = z.d(new t(z.k(resourceAsStream)));
        try {
            long m11 = d11.m();
            d11.r1(m11);
            byte[] v11 = d11.f98667b.v(m11);
            long m12 = d11.m();
            d11.r1(m12);
            byte[] v12 = d11.f98667b.v(m12);
            Unit unit = Unit.f71690a;
            d11.close();
            synchronized (this) {
                this.f78422c = v11;
                this.f78423d = v12;
            }
            this.f78421b.countDown();
        } finally {
        }
    }

    private static List d(String str) {
        List l11 = h.l(str, new char[]{'.'}, 0, 6);
        return Intrinsics.d((String) C7714v.X(l11), "") ? C7714v.E(l11) : l11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ad, code lost:
    
        if (r3 <= 1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00af, code lost:
    
        r5 = (byte[][]) r4.clone();
        r9 = r5.length - 1;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b8, code lost:
    
        if (r10 >= r9) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ba, code lost:
    
        r5[r10] = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f78416e;
        r11 = r12.f78422c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c0, code lost:
    
        if (r11 == null) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c2, code lost:
    
        r11 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.a.a(r11, r5, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c6, code lost:
    
        if (r11 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c9, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d0, code lost:
    
        if (r11 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d2, code lost:
    
        r3 = r3 - 1;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d4, code lost:
    
        if (r5 >= r3) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d6, code lost:
    
        r7 = r12.f78423d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d8, code lost:
    
        if (r7 == null) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00da, code lost:
    
        r7 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.a.a(r7, r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00de, code lost:
    
        if (r7 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e1, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ed, code lost:
    
        if (r7 == null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ef, code lost:
    
        r3 = kotlin.text.h.l("!".concat(r7), new char[]{'.'}, 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0138, code lost:
    
        if (r2.size() != r3.size()) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0144, code lost:
    
        if (r3.get(0).charAt(0) == '!') goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0146, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0151, code lost:
    
        if (r3.get(0).charAt(0) != '!') goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0153, code lost:
    
        r0 = r2.size() - r3.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x017b, code lost:
    
        return kotlin.sequences.l.t(kotlin.sequences.l.e(kotlin.collections.C7714v.w(d(r13)), r0), ".");
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x015d, code lost:
    
        r0 = r2.size() - (r3.size() + 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00fe, code lost:
    
        if (r8 != null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0100, code lost:
    
        if (r11 != null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0102, code lost:
    
        r3 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f78417f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0105, code lost:
    
        if (r8 == null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0107, code lost:
    
        r5 = kotlin.text.h.l(r8, new char[]{'.'}, 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x010f, code lost:
    
        if (r5 == null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0114, code lost:
    
        if (r11 == null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0116, code lost:
    
        r3 = kotlin.text.h.l(r11, new char[]{'.'}, 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x011e, code lost:
    
        if (r3 == null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x012b, code lost:
    
        if (r5.size() <= r3.size()) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x012d, code lost:
    
        r3 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0121, code lost:
    
        r3 = kotlin.collections.K.f71697a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0112, code lost:
    
        r5 = kotlin.collections.K.f71697a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00e3, code lost:
    
        kotlin.jvm.internal.Intrinsics.n("publicSuffixExceptionListBytes");
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00e8, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00e9, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00cb, code lost:
    
        kotlin.jvm.internal.Intrinsics.n("publicSuffixListBytes");
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00ce, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00cf, code lost:
    
        r11 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String b(@NotNull String domain) {
        String str;
        j jVar;
        Intrinsics.checkNotNullParameter(domain, "domain");
        String unicodeDomain = IDN.toUnicode(domain);
        Intrinsics.checkNotNullExpressionValue(unicodeDomain, "unicodeDomain");
        List d11 = d(unicodeDomain);
        AtomicBoolean atomicBoolean = this.f78420a;
        if (atomicBoolean.get() || !atomicBoolean.compareAndSet(false, true)) {
            try {
                this.f78421b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z11 = false;
            while (true) {
                try {
                    try {
                        try {
                            c();
                            break;
                        } catch (InterruptedIOException unused2) {
                            Thread.interrupted();
                            z11 = true;
                        }
                    } catch (IOException e11) {
                        j.f66400c.getClass();
                        jVar = j.f66398a;
                        jVar.getClass();
                        j.j(5, "Failed to read public suffix list", e11);
                        if (z11) {
                        }
                    }
                } finally {
                    if (z11) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
        if (this.f78422c == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
        }
        int size = d11.size();
        byte[][] bArr = new byte[size][];
        for (int i11 = 0; i11 < size; i11++) {
            String str2 = (String) d11.get(i11);
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            if (str2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            byte[] bytes = str2.getBytes(UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            bArr[i11] = bytes;
        }
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                str = null;
                break;
            }
            byte[] bArr2 = this.f78422c;
            if (bArr2 == null) {
                Intrinsics.n("publicSuffixListBytes");
                throw null;
            }
            str = a.a(bArr2, bArr, i12);
            if (str != null) {
                break;
            }
            i12++;
        }
    }
}
