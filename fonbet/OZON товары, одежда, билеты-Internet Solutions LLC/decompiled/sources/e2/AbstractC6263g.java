package e2;

import B0.C2454a;
import i2.C6998a;
import i2.C7000c;
import j2.C7242b;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: e2.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC6263g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final i2.f f61821a;

    /* renamed from: b, reason: collision with root package name */
    private int f61822b;

    /* renamed from: c, reason: collision with root package name */
    private final int f61823c;

    /* renamed from: d, reason: collision with root package name */
    private int f61824d;

    /* renamed from: e2.g$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Object f61825a;

        /* renamed from: b, reason: collision with root package name */
        private final int f61826b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final C6260d f61827c;

        public a(@NotNull Object obj, int i11, @NotNull C6260d c6260d) {
            this.f61825a = obj;
            this.f61826b = i11;
            this.f61827c = c6260d;
        }

        @NotNull
        public final Object a() {
            return this.f61825a;
        }

        public final int b() {
            return this.f61826b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f61825a.equals(aVar.f61825a) && this.f61826b == aVar.f61826b && this.f61827c.equals(aVar.f61827c);
        }

        public final int hashCode() {
            return this.f61827c.hashCode() + C2454a.a(this.f61826b, this.f61825a.hashCode() * 31, 31);
        }

        @NotNull
        public final String toString() {
            return "HorizontalAnchor(id=" + this.f61825a + ", index=" + this.f61826b + ", reference=" + this.f61827c + ')';
        }
    }

    /* renamed from: e2.g$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Object f61828a;

        /* renamed from: b, reason: collision with root package name */
        private final int f61829b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final AbstractC6279w f61830c;

        public b(@NotNull Object obj, int i11, @NotNull AbstractC6279w abstractC6279w) {
            this.f61828a = obj;
            this.f61829b = i11;
            this.f61830c = abstractC6279w;
        }

        @NotNull
        public final Object a() {
            return this.f61828a;
        }

        public final int b() {
            return this.f61829b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.d(this.f61828a, bVar.f61828a) && this.f61829b == bVar.f61829b && Intrinsics.d(this.f61830c, bVar.f61830c);
        }

        public final int hashCode() {
            return this.f61830c.hashCode() + C2454a.a(this.f61829b, this.f61828a.hashCode() * 31, 31);
        }

        @NotNull
        public final String toString() {
            return "VerticalAnchor(id=" + this.f61828a + ", index=" + this.f61829b + ", reference=" + this.f61830c + ')';
        }
    }

    public AbstractC6263g(int i11) {
        new ArrayList();
        this.f61821a = new i2.f(new char[0]);
        this.f61823c = 1000;
        this.f61824d = 1000;
    }

    public final void a(@NotNull C6253A c6253a) {
        C7242b.h(this.f61821a, c6253a, new C7242b.d());
    }

    @NotNull
    public final i2.f b(@NotNull AbstractC6279w abstractC6279w) {
        String obj = abstractC6279w.a().toString();
        i2.f fVar = this.f61821a;
        C7000c t2 = fVar.t(obj);
        if ((t2 instanceof i2.f ? (i2.f) t2 : null) == null) {
            fVar.A(obj, new i2.f(new char[0]));
        }
        return fVar.r(obj);
    }

    @NotNull
    public final b c() {
        int i11 = this.f61824d;
        this.f61824d = i11 + 1;
        C6280x c6280x = new C6280x(Integer.valueOf(i11));
        C6998a c6998a = new C6998a(new char[0]);
        c6998a.i(i2.h.i("start"));
        c6998a.i(new i2.e(0.5f));
        i2.f b11 = b(c6280x);
        b11.B("type", "vGuideline");
        b11.A("percent", c6998a);
        this.f61822b = ((this.f61822b * 1009) + 3) % 1000000007;
        this.f61822b = ((this.f61822b * 1009) + Float.hashCode(0.5f)) % 1000000007;
        return new b(c6280x.a(), 0, c6280x);
    }

    public final int d() {
        return this.f61822b;
    }

    public void e() {
        this.f61821a.clear();
        this.f61824d = this.f61823c;
        this.f61822b = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC6263g)) {
            return false;
        }
        return Intrinsics.d(this.f61821a, ((AbstractC6263g) obj).f61821a);
    }

    public final int hashCode() {
        return this.f61821a.hashCode();
    }

    public AbstractC6263g() {
        this(0);
    }
}
