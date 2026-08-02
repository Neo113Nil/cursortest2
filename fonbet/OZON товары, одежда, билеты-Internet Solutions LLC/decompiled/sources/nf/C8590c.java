package nf;

import B0.A0;
import E0.C2942q;
import We.A;
import We.B;
import We.C;
import We.G;
import We.InterfaceC4870l;
import We.K;
import We.L;
import We.z;
import ef.C6355e;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeUnit;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sf.C9681g;
import sf.InterfaceC9683i;
import sf.t;

/* renamed from: nf.c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8590c implements B {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final b f77101a;

    /* renamed from: b, reason: collision with root package name */
    private final long f77102b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private volatile M f77103c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private volatile a f77104d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: nf.c$a */
    public static final class a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a BASIC;
        public static final a BODY;
        public static final a HEADERS;
        public static final a NONE;

        static {
            a aVar = new a("NONE", 0);
            NONE = aVar;
            a aVar2 = new a("BASIC", 1);
            BASIC = aVar2;
            a aVar3 = new a("HEADERS", 2);
            HEADERS = aVar3;
            a aVar4 = new a("BODY", 3);
            BODY = aVar4;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
            $VALUES = aVarArr;
            $ENTRIES = Xc.b.a(aVarArr);
        }

        private a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* renamed from: nf.c$b */
    public interface b {

        /* renamed from: i0, reason: collision with root package name */
        @NotNull
        public static final b f77105i0 = new d();

        void log(@NotNull String str);
    }

    public C8590c() {
        this(null, 3);
    }

    private final void b(z zVar, int i11) {
        this.f77103c.contains(zVar.e(i11));
        String k11 = zVar.k(i11);
        this.f77101a.log(zVar.e(i11) + ": " + k11);
    }

    public final void a(@NotNull a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f77104d = aVar;
    }

    @NotNull
    public final void c(@NotNull a level) {
        Intrinsics.checkNotNullParameter(level, "level");
        this.f77104d = level;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02c9  */
    @Override // We.B
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final L intercept(@NotNull B.a chain) throws IOException {
        G g10;
        boolean z11;
        boolean z12;
        String str;
        String str2;
        long contentLength;
        L l11;
        String str3;
        String str4;
        long j11;
        String str5;
        String str6;
        String str7;
        Long l12;
        Charset UTF_8;
        Charset UTF_82;
        Intrinsics.checkNotNullParameter(chain, "chain");
        a aVar = this.f77104d;
        G request = chain.request();
        if (aVar == a.NONE) {
            return chain.proceed(request);
        }
        boolean z13 = true;
        boolean z14 = aVar == a.BODY;
        if (!z14 && aVar != a.HEADERS) {
            z13 = false;
        }
        K a11 = request.a();
        InterfaceC4870l connection = chain.connection();
        String str8 = "--> " + request.h() + " " + request.j() + (connection != null ? " " + connection.a() : "");
        if (!z13 && a11 != null) {
            str8 = str8 + " (" + a11.contentLength() + "-byte body)";
        }
        this.f77101a.log(str8);
        try {
            if (z13) {
                z e11 = request.e();
                if (a11 != null) {
                    z11 = z14;
                    C contentType = a11.getContentType();
                    z12 = z13;
                    if (contentType == null || e11.c("Content-Type") != null) {
                        str = " ";
                    } else {
                        str = " ";
                        this.f77101a.log("Content-Type: " + contentType);
                    }
                    if (a11.contentLength() == -1 || e11.c("Content-Length") != null) {
                        g10 = request;
                    } else {
                        g10 = request;
                        this.f77101a.log("Content-Length: " + a11.contentLength());
                    }
                } else {
                    g10 = request;
                    z11 = z14;
                    z12 = z13;
                    str = " ";
                }
                int size = e11.size();
                for (int i11 = 0; i11 < size; i11++) {
                    b(e11, i11);
                }
                if (!z11 || a11 == null) {
                    str2 = "";
                    this.f77101a.log("--> END " + g10.h());
                } else {
                    String c11 = g10.e().c("Content-Encoding");
                    if (c11 != null && !c11.equalsIgnoreCase("identity") && !c11.equalsIgnoreCase("gzip")) {
                        this.f77101a.log("--> END " + g10.h() + " (encoded body omitted)");
                    } else if (a11.isDuplex()) {
                        this.f77101a.log("--> END " + g10.h() + " (duplex request body omitted)");
                    } else if (a11.isOneShot()) {
                        this.f77101a.log("--> END " + g10.h() + " (one-shot body omitted)");
                    } else {
                        C9681g c9681g = new C9681g();
                        a11.writeTo(c9681g);
                        C contentType2 = a11.getContentType();
                        if (contentType2 == null || (UTF_82 = contentType2.c(StandardCharsets.UTF_8)) == null) {
                            UTF_82 = StandardCharsets.UTF_8;
                            Intrinsics.checkNotNullExpressionValue(UTF_82, "UTF_8");
                        }
                        this.f77101a.log("");
                        if (f.a(c9681g)) {
                            b bVar = this.f77101a;
                            long contentLength2 = a11.contentLength();
                            str2 = "";
                            long j12 = this.f77102b;
                            bVar.log(contentLength2 > j12 ? c9681g.I(j12, UTF_82) : c9681g.t0(UTF_82));
                            b bVar2 = this.f77101a;
                            StringBuilder d11 = C2942q.d(a11.contentLength(), "--> END ", g10.h(), " (");
                            d11.append("-byte body)");
                            bVar2.log(d11.toString());
                        } else {
                            str2 = "";
                            b bVar3 = this.f77101a;
                            StringBuilder d12 = C2942q.d(a11.contentLength(), "--> END ", g10.h(), " (binary ");
                            d12.append("-byte body omitted)");
                            bVar3.log(d12.toString());
                        }
                    }
                }
                long nanoTime = System.nanoTime();
                L proceed = chain.proceed(g10);
                long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
                We.M c12 = proceed.c();
                Intrinsics.f(c12);
                contentLength = c12.contentLength();
                if (contentLength == -1) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(contentLength);
                    l11 = proceed;
                    sb2.append("-byte");
                    str3 = sb2.toString();
                } else {
                    l11 = proceed;
                    str3 = "unknown-length";
                }
                b bVar4 = this.f77101a;
                int m11 = l11.m();
                if (l11.w().length() != 0) {
                    str4 = str2;
                    j11 = contentLength;
                    str5 = str;
                } else {
                    str4 = str2;
                    j11 = contentLength;
                    str5 = str;
                    str2 = Nk.a.b(str5, l11.w());
                }
                A j13 = l11.L().j();
                if (z12) {
                    str6 = "-byte body omitted)";
                    str7 = A0.b(", ", str3, " body");
                } else {
                    str6 = "-byte body omitted)";
                    str7 = str4;
                }
                StringBuilder sb3 = new StringBuilder("<-- ");
                sb3.append(m11);
                sb3.append(str2);
                sb3.append(str5);
                sb3.append(j13);
                C2942q.f(sb3, " (", millis, "ms");
                sb3.append(str7);
                sb3.append(")");
                bVar4.log(sb3.toString());
                if (z12) {
                    z r11 = l11.r();
                    int size2 = r11.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        b(r11, i12);
                    }
                    if (z11 && C6355e.b(l11)) {
                        String c13 = l11.r().c("Content-Encoding");
                        if (c13 != null && !c13.equalsIgnoreCase("identity") && !c13.equalsIgnoreCase("gzip")) {
                            this.f77101a.log("<-- END HTTP (encoded body omitted)");
                            return l11;
                        }
                        InterfaceC9683i source = c12.source();
                        source.n(Long.MAX_VALUE);
                        C9681g f7 = source.f();
                        if ("gzip".equalsIgnoreCase(r11.c("Content-Encoding"))) {
                            l12 = Long.valueOf(f7.size());
                            t tVar = new t(f7.clone());
                            try {
                                f7 = new C9681g();
                                f7.y0(tVar);
                                tVar.close();
                            } finally {
                            }
                        } else {
                            l12 = null;
                        }
                        C contentType3 = c12.contentType();
                        if (contentType3 == null || (UTF_8 = contentType3.c(StandardCharsets.UTF_8)) == null) {
                            UTF_8 = StandardCharsets.UTF_8;
                            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
                        }
                        if (!f.a(f7)) {
                            this.f77101a.log(str4);
                            this.f77101a.log("<-- END HTTP (binary " + f7.size() + str6);
                            return l11;
                        }
                        String str9 = str4;
                        if (j11 != 0) {
                            this.f77101a.log(str9);
                            this.f77101a.log(f7.clone().t0(UTF_8));
                        }
                        if (l12 == null) {
                            this.f77101a.log("<-- END HTTP (" + f7.size() + "-byte body)");
                            return l11;
                        }
                        this.f77101a.log("<-- END HTTP (" + f7.size() + "-byte, " + l12 + "-gzipped-byte body)");
                        return l11;
                    }
                    this.f77101a.log("<-- END HTTP");
                }
                return l11;
            }
            g10 = request;
            z11 = z14;
            z12 = z13;
            str = " ";
            L proceed2 = chain.proceed(g10);
            long millis2 = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
            We.M c122 = proceed2.c();
            Intrinsics.f(c122);
            contentLength = c122.contentLength();
            if (contentLength == -1) {
            }
            b bVar42 = this.f77101a;
            int m112 = l11.m();
            if (l11.w().length() != 0) {
            }
            A j132 = l11.L().j();
            if (z12) {
            }
            StringBuilder sb32 = new StringBuilder("<-- ");
            sb32.append(m112);
            sb32.append(str2);
            sb32.append(str5);
            sb32.append(j132);
            C2942q.f(sb32, " (", millis2, "ms");
            sb32.append(str7);
            sb32.append(")");
            bVar42.log(sb32.toString());
            if (z12) {
            }
            return l11;
        } catch (Exception e12) {
            this.f77101a.log("<-- HTTP FAILED: " + e12);
            throw e12;
        }
        str2 = "";
        long nanoTime2 = System.nanoTime();
    }

    public C8590c(b logger, int i11) {
        logger = (i11 & 1) != 0 ? b.f77105i0 : logger;
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f77101a = logger;
        this.f77102b = 5000L;
        this.f77103c = M.f71699a;
        this.f77104d = a.NONE;
    }
}
