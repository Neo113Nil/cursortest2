package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class whj implements y53 {
    public final long a;

    public /* synthetic */ whj(long j) {
        this.a = j;
    }

    public static long b(long j) {
        xuc.a.getClass();
        return (1 | (j - 1)) == Long.MAX_VALUE ? xd5.m(haa.p(j)) : haa.x(xuc.b(), j, be5.NANOSECONDS);
    }

    @Override // defpackage.y53
    public final long H(y53 y53Var) {
        y53Var.getClass();
        boolean z = y53Var instanceof whj;
        long j = this.a;
        if (z) {
            long j2 = ((whj) y53Var).a;
            xuc.a.getClass();
            return haa.y(j, j2, be5.NANOSECONDS);
        }
        throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + ((Object) ("ValueTimeMark(reading=" + j + ')')) + " and " + y53Var);
    }

    @Override // kotlin.time.TimeMark
    public final long a() {
        return b(this.a);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ int compareTo(Object obj) {
        return t62.z(this, (y53) obj);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof whj) {
            return this.a == ((whj) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "ValueTimeMark(reading=" + this.a + ')';
    }
}
