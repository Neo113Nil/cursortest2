package m1;

import e1.AbstractC4134a;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: classes.dex */
public final class o1 {

    /* renamed from: c, reason: collision with root package name */
    public static final o1 f56296c;

    /* renamed from: d, reason: collision with root package name */
    public static final o1 f56297d;

    /* renamed from: e, reason: collision with root package name */
    public static final o1 f56298e;

    /* renamed from: f, reason: collision with root package name */
    public static final o1 f56299f;

    /* renamed from: g, reason: collision with root package name */
    public static final o1 f56300g;

    /* renamed from: a, reason: collision with root package name */
    public final long f56301a;

    /* renamed from: b, reason: collision with root package name */
    public final long f56302b;

    static {
        o1 o1Var = new o1(0L, 0L);
        f56296c = o1Var;
        f56297d = new o1(LongCompanionObject.MAX_VALUE, LongCompanionObject.MAX_VALUE);
        f56298e = new o1(LongCompanionObject.MAX_VALUE, 0L);
        f56299f = new o1(0L, LongCompanionObject.MAX_VALUE);
        f56300g = o1Var;
    }

    public o1(long j10, long j11) {
        AbstractC4134a.a(j10 >= 0);
        AbstractC4134a.a(j11 >= 0);
        this.f56301a = j10;
        this.f56302b = j11;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0051 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long a(long j10, long j11, long j12) {
        long j13 = this.f56301a;
        if (j13 == 0 && this.f56302b == 0) {
            return j10;
        }
        long D12 = e1.Z.D1(j10, j13, Long.MIN_VALUE);
        long c10 = e1.Z.c(j10, this.f56302b, LongCompanionObject.MAX_VALUE);
        boolean z10 = false;
        boolean z11 = D12 <= j11 && j11 <= c10;
        if (D12 <= j12 && j12 <= c10) {
            z10 = true;
        }
        if (!z11 || !z10) {
            if (!z11) {
                return z10 ? j12 : D12;
            }
            return j11;
        }
        if (Math.abs(j11 - j10) <= Math.abs(j12 - j10)) {
            return j11;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o1.class == obj.getClass()) {
            o1 o1Var = (o1) obj;
            if (this.f56301a == o1Var.f56301a && this.f56302b == o1Var.f56302b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.f56301a) * 31) + ((int) this.f56302b);
    }
}
