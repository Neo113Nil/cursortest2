package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class bdj {
    public static final bdj c = new bdj(v8a.v(0), v8a.v(0));
    public final long a;
    public final long b;

    public bdj(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bdj)) {
            return false;
        }
        bdj bdjVar = (bdj) obj;
        return lfj.a(this.a, bdjVar.a) && lfj.a(this.b, bdjVar.b);
    }

    public final int hashCode() {
        mfj[] mfjVarArr = lfj.b;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) lfj.e(this.a)) + ", restLine=" + ((Object) lfj.e(this.b)) + ')';
    }
}
