package g5;

import B0.C2454a;
import B90.C2618u;
import androidx.work.v;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: g5.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6627B {

    /* renamed from: u, reason: collision with root package name */
    @NotNull
    private static final String f63797u;

    /* renamed from: v, reason: collision with root package name */
    @NotNull
    public static final C6626A f63798v;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f63799a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public v.a f63800b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public String f63801c;

    /* renamed from: d, reason: collision with root package name */
    public String f63802d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public androidx.work.e f63803e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    public androidx.work.e f63804f;

    /* renamed from: g, reason: collision with root package name */
    public long f63805g;

    /* renamed from: h, reason: collision with root package name */
    public long f63806h;

    /* renamed from: i, reason: collision with root package name */
    public long f63807i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    public androidx.work.d f63808j;

    /* renamed from: k, reason: collision with root package name */
    public int f63809k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    public androidx.work.a f63810l;

    /* renamed from: m, reason: collision with root package name */
    public long f63811m;

    /* renamed from: n, reason: collision with root package name */
    public long f63812n;

    /* renamed from: o, reason: collision with root package name */
    public long f63813o;

    /* renamed from: p, reason: collision with root package name */
    public long f63814p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f63815q;

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    public androidx.work.s f63816r;

    /* renamed from: s, reason: collision with root package name */
    private int f63817s;

    /* renamed from: t, reason: collision with root package name */
    private final int f63818t;

    /* renamed from: g5.B$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public String f63819a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public v.a f63820b;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.d(this.f63819a, aVar.f63819a) && this.f63820b == aVar.f63820b;
        }

        public final int hashCode() {
            return this.f63820b.hashCode() + (this.f63819a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "IdAndState(id=" + this.f63819a + ", state=" + this.f63820b + ')';
        }
    }

    /* renamed from: g5.B$b */
    /* loaded from: classes8.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private String f63821a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private v.a f63822b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private androidx.work.e f63823c;

        /* renamed from: d, reason: collision with root package name */
        private int f63824d;

        /* renamed from: e, reason: collision with root package name */
        private final int f63825e;

        /* renamed from: f, reason: collision with root package name */
        @NotNull
        private ArrayList f63826f;

        /* renamed from: g, reason: collision with root package name */
        @NotNull
        private ArrayList f63827g;

        public b(@NotNull String id2, @NotNull v.a state, @NotNull androidx.work.e output, int i11, int i12, @NotNull ArrayList tags, @NotNull ArrayList progress) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(tags, "tags");
            Intrinsics.checkNotNullParameter(progress, "progress");
            this.f63821a = id2;
            this.f63822b = state;
            this.f63823c = output;
            this.f63824d = i11;
            this.f63825e = i12;
            this.f63826f = tags;
            this.f63827g = progress;
        }

        @NotNull
        public final androidx.work.v a() {
            ArrayList arrayList = this.f63827g;
            return new androidx.work.v(UUID.fromString(this.f63821a), this.f63822b, this.f63823c, this.f63826f, !arrayList.isEmpty() ? (androidx.work.e) arrayList.get(0) : androidx.work.e.f45282c, this.f63824d, this.f63825e);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.d(this.f63821a, bVar.f63821a) && this.f63822b == bVar.f63822b && this.f63823c.equals(bVar.f63823c) && this.f63824d == bVar.f63824d && this.f63825e == bVar.f63825e && this.f63826f.equals(bVar.f63826f) && this.f63827g.equals(bVar.f63827g);
        }

        public final int hashCode() {
            return this.f63827g.hashCode() + C2618u.b(this.f63826f, C2454a.a(this.f63825e, C2454a.a(this.f63824d, (this.f63823c.hashCode() + ((this.f63822b.hashCode() + (this.f63821a.hashCode() * 31)) * 31)) * 31, 31), 31), 31);
        }

        @NotNull
        public final String toString() {
            return "WorkInfoPojo(id=" + this.f63821a + ", state=" + this.f63822b + ", output=" + this.f63823c + ", runAttemptCount=" + this.f63824d + ", generation=" + this.f63825e + ", tags=" + this.f63826f + ", progress=" + this.f63827g + ')';
        }
    }

    static {
        String i11 = androidx.work.o.i("WorkSpec");
        Intrinsics.checkNotNullExpressionValue(i11, "tagWithPrefix(\"WorkSpec\")");
        f63797u = i11;
        f63798v = new C6626A();
    }

    public C6627B(@NotNull String id2, @NotNull v.a state, @NotNull String workerClassName, String str, @NotNull androidx.work.e input, @NotNull androidx.work.e output, long j11, long j12, long j13, @NotNull androidx.work.d constraints, int i11, @NotNull androidx.work.a backoffPolicy, long j14, long j15, long j16, long j17, boolean z11, @NotNull androidx.work.s outOfQuotaPolicy, int i12, int i13) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(workerClassName, "workerClassName");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(constraints, "constraints");
        Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
        Intrinsics.checkNotNullParameter(outOfQuotaPolicy, "outOfQuotaPolicy");
        this.f63799a = id2;
        this.f63800b = state;
        this.f63801c = workerClassName;
        this.f63802d = str;
        this.f63803e = input;
        this.f63804f = output;
        this.f63805g = j11;
        this.f63806h = j12;
        this.f63807i = j13;
        this.f63808j = constraints;
        this.f63809k = i11;
        this.f63810l = backoffPolicy;
        this.f63811m = j14;
        this.f63812n = j15;
        this.f63813o = j16;
        this.f63814p = j17;
        this.f63815q = z11;
        this.f63816r = outOfQuotaPolicy;
        this.f63817s = i12;
        this.f63818t = i13;
    }

    public static C6627B b(C6627B c6627b, String str, v.a aVar, String str2, androidx.work.e eVar, int i11, long j11, int i12, int i13) {
        String id2 = (i13 & 1) != 0 ? c6627b.f63799a : str;
        v.a state = (i13 & 2) != 0 ? c6627b.f63800b : aVar;
        String workerClassName = (i13 & 4) != 0 ? c6627b.f63801c : str2;
        String str3 = c6627b.f63802d;
        androidx.work.e input = (i13 & 16) != 0 ? c6627b.f63803e : eVar;
        androidx.work.e output = c6627b.f63804f;
        long j12 = c6627b.f63805g;
        long j13 = c6627b.f63806h;
        long j14 = c6627b.f63807i;
        androidx.work.d constraints = c6627b.f63808j;
        int i14 = (i13 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? c6627b.f63809k : i11;
        androidx.work.a backoffPolicy = c6627b.f63810l;
        long j15 = c6627b.f63811m;
        long j16 = (i13 & 8192) != 0 ? c6627b.f63812n : j11;
        long j17 = c6627b.f63813o;
        long j18 = c6627b.f63814p;
        boolean z11 = c6627b.f63815q;
        androidx.work.s outOfQuotaPolicy = c6627b.f63816r;
        int i15 = c6627b.f63817s;
        int i16 = (i13 & 524288) != 0 ? c6627b.f63818t : i12;
        c6627b.getClass();
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(workerClassName, "workerClassName");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(constraints, "constraints");
        Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
        Intrinsics.checkNotNullParameter(outOfQuotaPolicy, "outOfQuotaPolicy");
        return new C6627B(id2, state, workerClassName, str3, input, output, j12, j13, j14, constraints, i14, backoffPolicy, j15, j16, j17, j18, z11, outOfQuotaPolicy, i15, i16);
    }

    public final long a() {
        int i11;
        if (this.f63800b == v.a.ENQUEUED && (i11 = this.f63809k) > 0) {
            long scalb = this.f63810l == androidx.work.a.LINEAR ? this.f63811m * i11 : (long) Math.scalb(this.f63811m, i11 - 1);
            long j11 = this.f63812n;
            if (scalb > 18000000) {
                scalb = 18000000;
            }
            return j11 + scalb;
        }
        if (!f()) {
            long j12 = this.f63812n;
            if (j12 == 0) {
                j12 = System.currentTimeMillis();
            }
            return j12 + this.f63805g;
        }
        int i12 = this.f63817s;
        long j13 = this.f63812n;
        if (i12 == 0) {
            j13 += this.f63805g;
        }
        long j14 = this.f63807i;
        long j15 = this.f63806h;
        if (j14 != j15) {
            return j13 + j15 + (i12 == 0 ? (-1) * j14 : 0L);
        }
        return j13 + (i12 != 0 ? j15 : 0L);
    }

    public final int c() {
        return this.f63818t;
    }

    public final int d() {
        return this.f63817s;
    }

    public final boolean e() {
        return !Intrinsics.d(androidx.work.d.f45268i, this.f63808j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6627B)) {
            return false;
        }
        C6627B c6627b = (C6627B) obj;
        return Intrinsics.d(this.f63799a, c6627b.f63799a) && this.f63800b == c6627b.f63800b && Intrinsics.d(this.f63801c, c6627b.f63801c) && Intrinsics.d(this.f63802d, c6627b.f63802d) && Intrinsics.d(this.f63803e, c6627b.f63803e) && Intrinsics.d(this.f63804f, c6627b.f63804f) && this.f63805g == c6627b.f63805g && this.f63806h == c6627b.f63806h && this.f63807i == c6627b.f63807i && Intrinsics.d(this.f63808j, c6627b.f63808j) && this.f63809k == c6627b.f63809k && this.f63810l == c6627b.f63810l && this.f63811m == c6627b.f63811m && this.f63812n == c6627b.f63812n && this.f63813o == c6627b.f63813o && this.f63814p == c6627b.f63814p && this.f63815q == c6627b.f63815q && this.f63816r == c6627b.f63816r && this.f63817s == c6627b.f63817s && this.f63818t == c6627b.f63818t;
    }

    public final boolean f() {
        return this.f63806h != 0;
    }

    public final void g(long j11) {
        String str = f63797u;
        if (j11 > 18000000) {
            androidx.work.o.e().k(str, "Backoff delay duration exceeds maximum value");
        }
        if (j11 < 10000) {
            androidx.work.o.e().k(str, "Backoff delay duration less than minimum value");
        }
        this.f63811m = kotlin.ranges.h.g(j11, 10000L, 18000000L);
    }

    public final void h(long j11) {
        String str = f63797u;
        if (j11 < 900000) {
            androidx.work.o.e().k(str, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        long j12 = j11 < 900000 ? 900000L : j11;
        long j13 = j11 < 900000 ? 900000L : j11;
        if (j12 < 900000) {
            androidx.work.o.e().k(str, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        this.f63806h = j12 >= 900000 ? j12 : 900000L;
        if (j13 < 300000) {
            androidx.work.o.e().k(str, "Flex duration lesser than minimum allowed value; Changed to 300000");
        }
        if (j13 > this.f63806h) {
            androidx.work.o.e().k(str, "Flex duration greater than interval duration; Changed to " + j12);
        }
        this.f63807i = kotlin.ranges.h.g(j13, 300000L, this.f63806h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int a11 = G.g.a((this.f63800b.hashCode() + (this.f63799a.hashCode() * 31)) * 31, 31, this.f63801c);
        String str = this.f63802d;
        int a12 = Pk0.c.a(Pk0.c.a(Pk0.c.a(Pk0.c.a((this.f63810l.hashCode() + C2454a.a(this.f63809k, (this.f63808j.hashCode() + Pk0.c.a(Pk0.c.a(Pk0.c.a((this.f63804f.hashCode() + ((this.f63803e.hashCode() + ((a11 + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31, 31, this.f63805g), 31, this.f63806h), 31, this.f63807i)) * 31, 31)) * 31, 31, this.f63811m), 31, this.f63812n), 31, this.f63813o), 31, this.f63814p);
        boolean z11 = this.f63815q;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        return Integer.hashCode(this.f63818t) + C2454a.a(this.f63817s, (this.f63816r.hashCode() + ((a12 + i11) * 31)) * 31, 31);
    }

    @NotNull
    public final String toString() {
        return B3.D.c(new StringBuilder("{WorkSpec: "), this.f63799a, '}');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C6627B(String str, v.a aVar, String str2, String str3, androidx.work.e eVar, androidx.work.e eVar2, long j11, long j12, long j13, androidx.work.d dVar, int i11, androidx.work.a aVar2, long j14, long j15, long j16, long j17, boolean z11, androidx.work.s sVar, int i12, int i13, int i14) {
        this(str, r4, str2, r6, r7, r8, (i13 & 64) != 0 ? 0L : j11, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? 0L : j12, (i13 & 256) != 0 ? 0L : j13, (i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? androidx.work.d.f45268i : dVar, (i13 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? 0 : i11, (i13 & 2048) != 0 ? androidx.work.a.EXPONENTIAL : aVar2, (i13 & 4096) != 0 ? 30000L : j14, (i13 & 8192) != 0 ? 0L : j15, (i13 & 16384) != 0 ? 0L : j16, (32768 & i13) != 0 ? -1L : j17, (65536 & i13) != 0 ? false : z11, (131072 & i13) != 0 ? androidx.work.s.RUN_AS_NON_EXPEDITED_WORK_REQUEST : sVar, (i13 & 262144) != 0 ? 0 : i12, 0);
        androidx.work.e eVar3;
        androidx.work.e eVar4;
        v.a aVar3 = (i13 & 2) != 0 ? v.a.ENQUEUED : aVar;
        String str4 = (i13 & 8) != 0 ? null : str3;
        if ((i13 & 16) != 0) {
            androidx.work.e EMPTY = androidx.work.e.f45282c;
            Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
            eVar3 = EMPTY;
        } else {
            eVar3 = eVar;
        }
        if ((i13 & 32) != 0) {
            androidx.work.e EMPTY2 = androidx.work.e.f45282c;
            Intrinsics.checkNotNullExpressionValue(EMPTY2, "EMPTY");
            eVar4 = EMPTY2;
        } else {
            eVar4 = eVar2;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6627B(@NotNull String newId, @NotNull C6627B other) {
        this(newId, other.f63800b, other.f63801c, other.f63802d, new androidx.work.e(other.f63803e), new androidx.work.e(other.f63804f), other.f63805g, other.f63806h, other.f63807i, new androidx.work.d(other.f63808j), other.f63809k, other.f63810l, other.f63811m, other.f63812n, other.f63813o, other.f63814p, other.f63815q, other.f63816r, other.f63817s, 524288, 0);
        Intrinsics.checkNotNullParameter(newId, "newId");
        Intrinsics.checkNotNullParameter(other, "other");
    }
}
