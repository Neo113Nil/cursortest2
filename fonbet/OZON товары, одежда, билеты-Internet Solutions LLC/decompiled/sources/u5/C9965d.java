package u5;

import A5.k;
import A5.u;
import We.C4864f;
import We.G;
import We.z;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import ef.C6353c;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: u5.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C9965d {

    /* renamed from: a, reason: collision with root package name */
    private final G f100304a;

    /* renamed from: b, reason: collision with root package name */
    private final C9964c f100305b;

    /* renamed from: u5.d$a */
    public static final class a {
        @NotNull
        public static z a(@NotNull z zVar, @NotNull z zVar2) {
            z.a aVar = new z.a();
            int size = zVar.size();
            for (int i11 = 0; i11 < size; i11++) {
                String e11 = zVar.e(i11);
                String k11 = zVar.k(i11);
                if ((!"Warning".equalsIgnoreCase(e11) || !kotlin.text.h.e0(k11, "1", false)) && ("Content-Length".equalsIgnoreCase(e11) || "Content-Encoding".equalsIgnoreCase(e11) || "Content-Type".equalsIgnoreCase(e11) || !b(e11) || zVar2.c(e11) == null)) {
                    aVar.a(e11, k11);
                }
            }
            int size2 = zVar2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                String e12 = zVar2.e(i12);
                if (!"Content-Length".equalsIgnoreCase(e12) && !"Content-Encoding".equalsIgnoreCase(e12) && !"Content-Type".equalsIgnoreCase(e12) && b(e12)) {
                    aVar.a(e12, zVar2.k(i12));
                }
            }
            return aVar.e();
        }

        private static boolean b(String str) {
            return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
        }
    }

    /* renamed from: u5.d$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final G f100306a;

        /* renamed from: b, reason: collision with root package name */
        private final C9964c f100307b;

        /* renamed from: c, reason: collision with root package name */
        private Date f100308c;

        /* renamed from: d, reason: collision with root package name */
        private String f100309d;

        /* renamed from: e, reason: collision with root package name */
        private Date f100310e;

        /* renamed from: f, reason: collision with root package name */
        private String f100311f;

        /* renamed from: g, reason: collision with root package name */
        private Date f100312g;

        /* renamed from: h, reason: collision with root package name */
        private long f100313h;

        /* renamed from: i, reason: collision with root package name */
        private long f100314i;

        /* renamed from: j, reason: collision with root package name */
        private String f100315j;

        /* renamed from: k, reason: collision with root package name */
        private int f100316k;

        public b(@NotNull G g10, C9964c c9964c) {
            int i11;
            this.f100306a = g10;
            this.f100307b = c9964c;
            this.f100316k = -1;
            if (c9964c != null) {
                this.f100313h = c9964c.e();
                this.f100314i = c9964c.c();
                z d11 = c9964c.d();
                int size = d11.size();
                for (int i12 = 0; i12 < size; i12++) {
                    String e11 = d11.e(i12);
                    if (kotlin.text.h.D(e11, "Date", true)) {
                        Intrinsics.checkNotNullParameter("Date", AppMeasurementSdk.ConditionalUserProperty.NAME);
                        String c11 = d11.c("Date");
                        this.f100308c = c11 != null ? C6353c.a(c11) : null;
                        this.f100309d = d11.k(i12);
                    } else if (kotlin.text.h.D(e11, "Expires", true)) {
                        Intrinsics.checkNotNullParameter("Expires", AppMeasurementSdk.ConditionalUserProperty.NAME);
                        String c12 = d11.c("Expires");
                        this.f100312g = c12 != null ? C6353c.a(c12) : null;
                    } else if (kotlin.text.h.D(e11, "Last-Modified", true)) {
                        Intrinsics.checkNotNullParameter("Last-Modified", AppMeasurementSdk.ConditionalUserProperty.NAME);
                        String c13 = d11.c("Last-Modified");
                        this.f100310e = c13 != null ? C6353c.a(c13) : null;
                        this.f100311f = d11.k(i12);
                    } else if (kotlin.text.h.D(e11, "ETag", true)) {
                        this.f100315j = d11.k(i12);
                    } else if (kotlin.text.h.D(e11, "Age", true)) {
                        String k11 = d11.k(i12);
                        int i13 = k.f430d;
                        Long y02 = kotlin.text.h.y0(k11);
                        if (y02 != null) {
                            long longValue = y02.longValue();
                            i11 = longValue > 2147483647L ? Integer.MAX_VALUE : longValue < 0 ? 0 : (int) longValue;
                        } else {
                            i11 = -1;
                        }
                        this.f100316k = i11;
                    }
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:68:0x00cc, code lost:
        
            if (r8 > 0) goto L52;
         */
        @NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final C9965d a() {
            C9964c c9964c;
            long j11;
            C4864f c4864f;
            G g10 = this.f100306a;
            C9964c c9964c2 = this.f100307b;
            if (c9964c2 == null) {
                return new C9965d(g10, null);
            }
            if (g10.g() && !c9964c2.f()) {
                return new C9965d(g10, null);
            }
            C4864f a11 = c9964c2.a();
            if (g10.b().h() || c9964c2.a().h() || Intrinsics.d(c9964c2.d().c("Vary"), "*")) {
                return new C9965d(g10, null);
            }
            C4864f b11 = g10.b();
            if (!b11.g()) {
                String str = "If-Modified-Since";
                if (g10.d("If-Modified-Since") == null && g10.d("If-None-Match") == null) {
                    long j12 = this.f100314i;
                    Date date = this.f100308c;
                    long max = date != null ? Math.max(0L, j12 - date.getTime()) : 0L;
                    int i11 = this.f100316k;
                    long j13 = 0;
                    if (i11 != -1) {
                        c9964c = c9964c2;
                        max = Math.max(max, TimeUnit.SECONDS.toMillis(i11));
                    } else {
                        c9964c = c9964c2;
                    }
                    long j14 = this.f100313h;
                    long a12 = max + (j12 - j14) + (u.a() - j12);
                    int c11 = c9964c.a().c();
                    long j15 = j14;
                    Date date2 = this.f100310e;
                    if (c11 != -1) {
                        j11 = TimeUnit.SECONDS.toMillis(r12.c());
                    } else {
                        Date date3 = this.f100312g;
                        if (date3 != null) {
                            if (date != null) {
                                j12 = date.getTime();
                            }
                            j11 = date3.getTime() - j12;
                        } else {
                            if (date2 != null && g10.j().o() == null) {
                                if (date != null) {
                                    j15 = date.getTime();
                                }
                                long time = j15 - date2.getTime();
                                if (time > 0) {
                                    j11 = time / 10;
                                }
                            }
                            j11 = 0;
                        }
                    }
                    if (b11.c() != -1) {
                        j11 = Math.min(j11, TimeUnit.SECONDS.toMillis(b11.c()));
                    }
                    long millis = b11.e() != -1 ? TimeUnit.SECONDS.toMillis(b11.e()) : 0L;
                    if (a11.f() || b11.d() == -1) {
                        c4864f = a11;
                    } else {
                        c4864f = a11;
                        j13 = TimeUnit.SECONDS.toMillis(b11.d());
                    }
                    if (!c4864f.g() && a12 + millis < j11 + j13) {
                        return new C9965d(null, c9964c);
                    }
                    C9964c c9964c3 = c9964c;
                    String str2 = this.f100315j;
                    if (str2 != null) {
                        str = "If-None-Match";
                    } else if (date2 != null) {
                        str2 = this.f100311f;
                        Intrinsics.f(str2);
                    } else {
                        if (date == null) {
                            return new C9965d(g10, null);
                        }
                        str2 = this.f100309d;
                        Intrinsics.f(str2);
                    }
                    G.a aVar = new G.a(g10);
                    aVar.a(str, str2);
                    return new C9965d(aVar.b(), c9964c3);
                }
            }
            return new C9965d(g10, null);
        }
    }

    public C9965d(G g10, C9964c c9964c) {
        this.f100304a = g10;
        this.f100305b = c9964c;
    }

    public final C9964c a() {
        return this.f100305b;
    }

    public final G b() {
        return this.f100304a;
    }
}
