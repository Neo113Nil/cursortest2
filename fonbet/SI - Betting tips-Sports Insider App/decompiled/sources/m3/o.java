package m3;

import androidx.work.OverwritingInputMerger;
import e3.f0;
import e3.i0;
import e3.x;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import okio.Segment;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: z, reason: collision with root package name */
    public static final String f20330z;

    /* renamed from: a, reason: collision with root package name */
    public final String f20331a;

    /* renamed from: b, reason: collision with root package name */
    public i0 f20332b;

    /* renamed from: c, reason: collision with root package name */
    public final String f20333c;

    /* renamed from: d, reason: collision with root package name */
    public final String f20334d;

    /* renamed from: e, reason: collision with root package name */
    public e3.j f20335e;

    /* renamed from: f, reason: collision with root package name */
    public final e3.j f20336f;

    /* renamed from: g, reason: collision with root package name */
    public long f20337g;

    /* renamed from: h, reason: collision with root package name */
    public long f20338h;

    /* renamed from: i, reason: collision with root package name */
    public long f20339i;
    public e3.f j;

    /* renamed from: k, reason: collision with root package name */
    public final int f20340k;

    /* renamed from: l, reason: collision with root package name */
    public e3.a f20341l;

    /* renamed from: m, reason: collision with root package name */
    public long f20342m;

    /* renamed from: n, reason: collision with root package name */
    public long f20343n;

    /* renamed from: o, reason: collision with root package name */
    public final long f20344o;

    /* renamed from: p, reason: collision with root package name */
    public final long f20345p;
    public boolean q;

    /* renamed from: r, reason: collision with root package name */
    public final f0 f20346r;

    /* renamed from: s, reason: collision with root package name */
    public final int f20347s;

    /* renamed from: t, reason: collision with root package name */
    public final int f20348t;

    /* renamed from: u, reason: collision with root package name */
    public long f20349u;

    /* renamed from: v, reason: collision with root package name */
    public int f20350v;

    /* renamed from: w, reason: collision with root package name */
    public final int f20351w;

    /* renamed from: x, reason: collision with root package name */
    public String f20352x;

    /* renamed from: y, reason: collision with root package name */
    public final Boolean f20353y;

    static {
        String g10 = x.g("WorkSpec");
        Intrinsics.checkNotNullExpressionValue(g10, "tagWithPrefix(...)");
        f20330z = g10;
    }

    public o(String id2, i0 state, String workerClassName, String inputMergerClassName, e3.j input, e3.j output, long j, long j6, long j10, e3.f constraints, int i5, e3.a backoffPolicy, long j11, long j12, long j13, long j14, boolean z5, f0 outOfQuotaPolicy, int i10, int i11, long j15, int i12, int i13, String str, Boolean bool) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(workerClassName, "workerClassName");
        Intrinsics.checkNotNullParameter(inputMergerClassName, "inputMergerClassName");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(constraints, "constraints");
        Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
        Intrinsics.checkNotNullParameter(outOfQuotaPolicy, "outOfQuotaPolicy");
        this.f20331a = id2;
        this.f20332b = state;
        this.f20333c = workerClassName;
        this.f20334d = inputMergerClassName;
        this.f20335e = input;
        this.f20336f = output;
        this.f20337g = j;
        this.f20338h = j6;
        this.f20339i = j10;
        this.j = constraints;
        this.f20340k = i5;
        this.f20341l = backoffPolicy;
        this.f20342m = j11;
        this.f20343n = j12;
        this.f20344o = j13;
        this.f20345p = j14;
        this.q = z5;
        this.f20346r = outOfQuotaPolicy;
        this.f20347s = i10;
        this.f20348t = i11;
        this.f20349u = j15;
        this.f20350v = i12;
        this.f20351w = i13;
        this.f20352x = str;
        this.f20353y = bool;
    }

    public static o b(o oVar, String str, i0 i0Var, String str2, e3.j jVar, int i5, long j, int i10, int i11, long j6, int i12, int i13) {
        String id2 = (i13 & 1) != 0 ? oVar.f20331a : str;
        i0 state = (i13 & 2) != 0 ? oVar.f20332b : i0Var;
        String workerClassName = (i13 & 4) != 0 ? oVar.f20333c : str2;
        String inputMergerClassName = oVar.f20334d;
        e3.j input = (i13 & 16) != 0 ? oVar.f20335e : jVar;
        e3.j output = oVar.f20336f;
        long j10 = oVar.f20337g;
        long j11 = oVar.f20338h;
        long j12 = oVar.f20339i;
        e3.f constraints = oVar.j;
        int i14 = (i13 & Segment.SHARE_MINIMUM) != 0 ? oVar.f20340k : i5;
        e3.a backoffPolicy = oVar.f20341l;
        long j13 = oVar.f20342m;
        long j14 = (i13 & Segment.SIZE) != 0 ? oVar.f20343n : j;
        long j15 = oVar.f20344o;
        long j16 = oVar.f20345p;
        boolean z5 = oVar.q;
        f0 outOfQuotaPolicy = oVar.f20346r;
        int i15 = (i13 & 262144) != 0 ? oVar.f20347s : i10;
        int i16 = (i13 & 524288) != 0 ? oVar.f20348t : i11;
        long j17 = (i13 & 1048576) != 0 ? oVar.f20349u : j6;
        int i17 = (i13 & 2097152) != 0 ? oVar.f20350v : i12;
        int i18 = oVar.f20351w;
        String str3 = oVar.f20352x;
        Boolean bool = oVar.f20353y;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(workerClassName, "workerClassName");
        Intrinsics.checkNotNullParameter(inputMergerClassName, "inputMergerClassName");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(constraints, "constraints");
        Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
        Intrinsics.checkNotNullParameter(outOfQuotaPolicy, "outOfQuotaPolicy");
        return new o(id2, state, workerClassName, inputMergerClassName, input, output, j10, j11, j12, constraints, i14, backoffPolicy, j13, j14, j15, j16, z5, outOfQuotaPolicy, i15, i16, j17, i17, i18, str3, bool);
    }

    public final long a() {
        i0 i0Var = this.f20332b;
        i0 i0Var2 = i0.f8524a;
        int i5 = this.f20340k;
        boolean z5 = i0Var == i0Var2 && i5 > 0;
        e3.a backoffPolicy = this.f20341l;
        long j = this.f20342m;
        long j6 = this.f20343n;
        boolean c2 = c();
        long j10 = this.f20337g;
        long j11 = this.f20339i;
        long j12 = this.f20338h;
        long j13 = this.f20349u;
        boolean z7 = z5;
        Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
        int i10 = this.f20347s;
        if (j13 != LongCompanionObject.MAX_VALUE && c2) {
            if (i10 != 0) {
                long j14 = j6 + 900000;
                if (j13 < j14) {
                    return j14;
                }
            }
            return j13;
        }
        if (z7) {
            long scalb = backoffPolicy == e3.a.f8472b ? j * i5 : (long) Math.scalb(j, i5 - 1);
            if (scalb > 18000000) {
                scalb = 18000000;
            }
            return j6 + scalb;
        }
        if (!c2) {
            return j6 == -1 ? LongCompanionObject.MAX_VALUE : j6 + j10;
        }
        long j15 = i10 == 0 ? j6 + j10 : j6 + j12;
        return (j11 == j12 || i10 != 0) ? j15 : (j12 - j11) + j15;
    }

    public final boolean c() {
        return this.f20338h != 0;
    }

    public final void d(long j) {
        String str = f20330z;
        if (j > 18000000) {
            x.e().h(str, "Backoff delay duration exceeds maximum value");
        }
        if (j < 10000) {
            x.e().h(str, "Backoff delay duration less than minimum value");
        }
        this.f20342m = zf.j.b(j, 10000L, 18000000L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.areEqual(this.f20331a, oVar.f20331a) && this.f20332b == oVar.f20332b && Intrinsics.areEqual(this.f20333c, oVar.f20333c) && Intrinsics.areEqual(this.f20334d, oVar.f20334d) && Intrinsics.areEqual(this.f20335e, oVar.f20335e) && Intrinsics.areEqual(this.f20336f, oVar.f20336f) && this.f20337g == oVar.f20337g && this.f20338h == oVar.f20338h && this.f20339i == oVar.f20339i && Intrinsics.areEqual(this.j, oVar.j) && this.f20340k == oVar.f20340k && this.f20341l == oVar.f20341l && this.f20342m == oVar.f20342m && this.f20343n == oVar.f20343n && this.f20344o == oVar.f20344o && this.f20345p == oVar.f20345p && this.q == oVar.q && this.f20346r == oVar.f20346r && this.f20347s == oVar.f20347s && this.f20348t == oVar.f20348t && this.f20349u == oVar.f20349u && this.f20350v == oVar.f20350v && this.f20351w == oVar.f20351w && Intrinsics.areEqual(this.f20352x, oVar.f20352x) && Intrinsics.areEqual(this.f20353y, oVar.f20353y);
    }

    public final int hashCode() {
        int hashCode = (this.f20336f.hashCode() + ((this.f20335e.hashCode() + r4.k.j(r4.k.j((this.f20332b.hashCode() + (this.f20331a.hashCode() * 31)) * 31, 31, this.f20333c), 31, this.f20334d)) * 31)) * 31;
        long j = this.f20337g;
        int i5 = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j6 = this.f20338h;
        int i10 = (i5 + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j10 = this.f20339i;
        int hashCode2 = (this.f20341l.hashCode() + ((((this.j.hashCode() + ((i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31)) * 31) + this.f20340k) * 31)) * 31;
        long j11 = this.f20342m;
        int i11 = (hashCode2 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f20343n;
        int i12 = (i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31;
        long j13 = this.f20344o;
        int i13 = (i12 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        long j14 = this.f20345p;
        int hashCode3 = (((((this.f20346r.hashCode() + ((((i13 + ((int) (j14 ^ (j14 >>> 32)))) * 31) + (this.q ? 1231 : 1237)) * 31)) * 31) + this.f20347s) * 31) + this.f20348t) * 31;
        long j15 = this.f20349u;
        int i14 = (((((hashCode3 + ((int) ((j15 >>> 32) ^ j15))) * 31) + this.f20350v) * 31) + this.f20351w) * 31;
        String str = this.f20352x;
        int hashCode4 = (i14 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f20353y;
        return hashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return d9.e.k(new StringBuilder("{WorkSpec: "), this.f20331a, '}');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ o(String str, i0 i0Var, String str2, String str3, e3.j jVar, e3.j jVar2, long j, long j6, long j10, e3.f fVar, int i5, e3.a aVar, long j11, long j12, long j13, long j14, boolean z5, f0 f0Var, int i10, long j15, int i11, int i12, String str4, Boolean bool, int i13) {
        this(str, r4, str2, r6, (i13 & 16) != 0 ? e3.j.f8531b : jVar, (i13 & 32) != 0 ? e3.j.f8531b : jVar2, (i13 & 64) != 0 ? 0L : j, (i13 & 128) != 0 ? 0L : j6, (i13 & 256) != 0 ? 0L : j10, (i13 & 512) != 0 ? e3.f.j : fVar, (i13 & Segment.SHARE_MINIMUM) != 0 ? 0 : i5, (i13 & 2048) != 0 ? e3.a.f8471a : aVar, (i13 & 4096) != 0 ? 30000L : j11, (i13 & Segment.SIZE) != 0 ? -1L : j12, (i13 & 16384) == 0 ? j13 : 0L, (32768 & i13) != 0 ? -1L : j14, (65536 & i13) != 0 ? false : z5, (131072 & i13) != 0 ? f0.f8515a : f0Var, (262144 & i13) != 0 ? 0 : i10, 0, (1048576 & i13) != 0 ? Long.MAX_VALUE : j15, (2097152 & i13) != 0 ? 0 : i11, (4194304 & i13) != 0 ? -256 : i12, (8388608 & i13) != 0 ? null : str4, (i13 & 16777216) != 0 ? Boolean.FALSE : bool);
        String str5;
        i0 i0Var2 = (i13 & 2) != 0 ? i0.f8524a : i0Var;
        if ((i13 & 8) != 0) {
            String name = OverwritingInputMerger.class.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            str5 = name;
        } else {
            str5 = str3;
        }
    }
}
