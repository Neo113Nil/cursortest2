package nf;

import B0.A0;
import E0.C2942q;
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

/* renamed from: nf.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8588a implements B {

    /* renamed from: a, reason: collision with root package name */
    private volatile M f77097a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private volatile EnumC1299a f77098b;

    /* renamed from: c, reason: collision with root package name */
    private final b f77099c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: nf.a$a, reason: collision with other inner class name */
    public static final class EnumC1299a {
        private static final /* synthetic */ EnumC1299a[] $VALUES;
        public static final EnumC1299a BASIC;
        public static final EnumC1299a BODY;
        public static final EnumC1299a HEADERS;
        public static final EnumC1299a NONE;

        static {
            EnumC1299a enumC1299a = new EnumC1299a("NONE", 0);
            NONE = enumC1299a;
            EnumC1299a enumC1299a2 = new EnumC1299a("BASIC", 1);
            BASIC = enumC1299a2;
            EnumC1299a enumC1299a3 = new EnumC1299a("HEADERS", 2);
            HEADERS = enumC1299a3;
            EnumC1299a enumC1299a4 = new EnumC1299a("BODY", 3);
            BODY = enumC1299a4;
            $VALUES = new EnumC1299a[]{enumC1299a, enumC1299a2, enumC1299a3, enumC1299a4};
        }

        private EnumC1299a() {
            throw null;
        }

        public static EnumC1299a valueOf(String str) {
            return (EnumC1299a) Enum.valueOf(EnumC1299a.class, str);
        }

        public static EnumC1299a[] values() {
            return (EnumC1299a[]) $VALUES.clone();
        }
    }

    /* renamed from: nf.a$b */
    public interface b {

        /* renamed from: h0, reason: collision with root package name */
        @NotNull
        public static final b f77100h0 = new C8589b();

        void log(@NotNull String str);
    }

    public C8588a() {
        this(0);
    }

    private final void b(z zVar, int i11) {
        this.f77097a.contains(zVar.e(i11));
        String k11 = zVar.k(i11);
        this.f77099c.log(zVar.e(i11) + ": " + k11);
    }

    public final void a(@NotNull EnumC1299a enumC1299a) {
        Intrinsics.checkNotNullParameter(enumC1299a, "<set-?>");
        this.f77098b = enumC1299a;
    }

    @NotNull
    public final void c(@NotNull EnumC1299a level) {
        Intrinsics.checkNotNullParameter(level, "level");
        this.f77098b = level;
    }

    @Override // We.B
    @NotNull
    public final L intercept(@NotNull B.a chain) throws IOException {
        boolean z11;
        boolean z12;
        String str;
        char c11;
        L l11;
        String str2;
        String str3;
        String sb2;
        Long l12;
        Charset UTF_8;
        Charset UTF_82;
        Intrinsics.checkNotNullParameter(chain, "chain");
        EnumC1299a enumC1299a = this.f77098b;
        G request = chain.request();
        if (enumC1299a == EnumC1299a.NONE) {
            return chain.proceed(request);
        }
        boolean z13 = true;
        boolean z14 = enumC1299a == EnumC1299a.BODY;
        if (!z14 && enumC1299a != EnumC1299a.HEADERS) {
            z13 = false;
        }
        K a11 = request.a();
        InterfaceC4870l connection = chain.connection();
        StringBuilder sb3 = new StringBuilder("--> ");
        sb3.append(request.h());
        sb3.append(' ');
        sb3.append(request.j());
        sb3.append(connection != null ? " " + connection.a() : "");
        String sb4 = sb3.toString();
        if (!z13 && a11 != null) {
            StringBuilder e11 = C2942q.e(sb4, " (");
            e11.append(a11.contentLength());
            e11.append("-byte body)");
            sb4 = e11.toString();
        }
        this.f77099c.log(sb4);
        if (z13) {
            z e12 = request.e();
            if (a11 != null) {
                c11 = ' ';
                C contentType = a11.getContentType();
                z11 = z14;
                if (contentType == null || e12.c("Content-Type") != null) {
                    z12 = z13;
                } else {
                    z12 = z13;
                    this.f77099c.log("Content-Type: " + contentType);
                }
                if (a11.contentLength() == -1 || e12.c("Content-Length") != null) {
                    str = "-byte body)";
                } else {
                    b bVar = this.f77099c;
                    StringBuilder sb5 = new StringBuilder("Content-Length: ");
                    str = "-byte body)";
                    sb5.append(a11.contentLength());
                    bVar.log(sb5.toString());
                }
            } else {
                z11 = z14;
                z12 = z13;
                str = "-byte body)";
                c11 = ' ';
            }
            int size = e12.size();
            for (int i11 = 0; i11 < size; i11++) {
                b(e12, i11);
            }
            if (!z11 || a11 == null) {
                this.f77099c.log("--> END " + request.h());
            } else {
                String c12 = request.e().c("Content-Encoding");
                if (c12 != null && !c12.equalsIgnoreCase("identity") && !c12.equalsIgnoreCase("gzip")) {
                    this.f77099c.log("--> END " + request.h() + " (encoded body omitted)");
                } else if (a11.isDuplex()) {
                    this.f77099c.log("--> END " + request.h() + " (duplex request body omitted)");
                } else if (a11.isOneShot()) {
                    this.f77099c.log("--> END " + request.h() + " (one-shot body omitted)");
                } else {
                    C9681g c9681g = new C9681g();
                    a11.writeTo(c9681g);
                    C contentType2 = a11.getContentType();
                    if (contentType2 == null || (UTF_82 = contentType2.c(StandardCharsets.UTF_8)) == null) {
                        UTF_82 = StandardCharsets.UTF_8;
                        Intrinsics.checkNotNullExpressionValue(UTF_82, "UTF_8");
                    }
                    this.f77099c.log("");
                    if (e.a(c9681g)) {
                        this.f77099c.log(c9681g.t0(UTF_82));
                        this.f77099c.log("--> END " + request.h() + " (" + a11.contentLength() + str);
                    } else {
                        this.f77099c.log("--> END " + request.h() + " (binary " + a11.contentLength() + "-byte body omitted)");
                    }
                }
            }
        } else {
            z11 = z14;
            z12 = z13;
            str = "-byte body)";
            c11 = ' ';
        }
        long nanoTime = System.nanoTime();
        try {
            L proceed = chain.proceed(request);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
            We.M c13 = proceed.c();
            Intrinsics.f(c13);
            long contentLength = c13.contentLength();
            if (contentLength != -1) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(contentLength);
                l11 = proceed;
                sb6.append("-byte");
                str2 = sb6.toString();
            } else {
                l11 = proceed;
                str2 = "unknown-length";
            }
            b bVar2 = this.f77099c;
            StringBuilder sb7 = new StringBuilder("<-- ");
            sb7.append(l11.m());
            if (l11.w().length() == 0) {
                str3 = str;
                sb2 = "";
            } else {
                String w11 = l11.w();
                StringBuilder sb8 = new StringBuilder();
                str3 = str;
                sb8.append(String.valueOf(c11));
                sb8.append(w11);
                sb2 = sb8.toString();
            }
            sb7.append(sb2);
            sb7.append(c11);
            sb7.append(l11.L().j());
            sb7.append(" (");
            sb7.append(millis);
            sb7.append("ms");
            sb7.append(!z12 ? A0.b(", ", str2, " body") : "");
            sb7.append(')');
            bVar2.log(sb7.toString());
            if (z12) {
                z r11 = l11.r();
                int size2 = r11.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    b(r11, i12);
                }
                if (z11 && C6355e.b(l11)) {
                    String c14 = l11.r().c("Content-Encoding");
                    if (c14 != null && !c14.equalsIgnoreCase("identity") && !c14.equalsIgnoreCase("gzip")) {
                        this.f77099c.log("<-- END HTTP (encoded body omitted)");
                        return l11;
                    }
                    InterfaceC9683i source = c13.source();
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
                    C contentType3 = c13.contentType();
                    if (contentType3 == null || (UTF_8 = contentType3.c(StandardCharsets.UTF_8)) == null) {
                        UTF_8 = StandardCharsets.UTF_8;
                        Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
                    }
                    if (!e.a(f7)) {
                        this.f77099c.log("");
                        this.f77099c.log("<-- END HTTP (binary " + f7.size() + "-byte body omitted)");
                        return l11;
                    }
                    if (contentLength != 0) {
                        this.f77099c.log("");
                        this.f77099c.log(f7.clone().t0(UTF_8));
                    }
                    if (l12 == null) {
                        this.f77099c.log("<-- END HTTP (" + f7.size() + str3);
                        return l11;
                    }
                    this.f77099c.log("<-- END HTTP (" + f7.size() + "-byte, " + l12 + "-gzipped-byte body)");
                    return l11;
                }
                this.f77099c.log("<-- END HTTP");
            }
            return l11;
        } catch (Exception e13) {
            this.f77099c.log("<-- HTTP FAILED: " + e13);
            throw e13;
        }
    }

    public C8588a(@NotNull b logger) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f77099c = logger;
        this.f77097a = M.f71699a;
        this.f77098b = EnumC1299a.NONE;
    }

    public /* synthetic */ C8588a(int i11) {
        this(b.f77100h0);
    }
}
