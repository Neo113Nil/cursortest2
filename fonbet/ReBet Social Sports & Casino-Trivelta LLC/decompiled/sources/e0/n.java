package e0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: b, reason: collision with root package name */
    public static final a f45460b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final long f45461c = e(0);

    /* renamed from: d, reason: collision with root package name */
    public static final long f45462d = e(4294967296L);

    /* renamed from: e, reason: collision with root package name */
    public static final long f45463e = e(8589934592L);

    /* renamed from: a, reason: collision with root package name */
    public final long f45464a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return n.f45463e;
        }

        public final long b() {
            return n.f45462d;
        }

        public final long c() {
            return n.f45461c;
        }

        public a() {
        }
    }

    public /* synthetic */ n(long j10) {
        this.f45464a = j10;
    }

    public static final /* synthetic */ n d(long j10) {
        return new n(j10);
    }

    public static boolean f(long j10, Object obj) {
        return (obj instanceof n) && j10 == ((n) obj).j();
    }

    public static final boolean g(long j10, long j11) {
        return j10 == j11;
    }

    public static int h(long j10) {
        return Long.hashCode(j10);
    }

    public static String i(long j10) {
        return g(j10, f45461c) ? "Unspecified" : g(j10, f45462d) ? "Sp" : g(j10, f45463e) ? "Em" : "Invalid";
    }

    public boolean equals(Object obj) {
        return f(this.f45464a, obj);
    }

    public int hashCode() {
        return h(this.f45464a);
    }

    public final /* synthetic */ long j() {
        return this.f45464a;
    }

    public String toString() {
        return i(this.f45464a);
    }

    public static long e(long j10) {
        return j10;
    }
}
