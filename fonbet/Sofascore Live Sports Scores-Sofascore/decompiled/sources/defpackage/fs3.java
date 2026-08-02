package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class fs3 {
    public final q9k a;
    public final int b;
    public final String c;

    public fs3(int i, q9k q9kVar, String str) {
        this.a = q9kVar;
        this.b = i;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fs3)) {
            return false;
        }
        fs3 fs3Var = (fs3) obj;
        return this.a.equals(fs3Var.a) && this.b == fs3Var.b && this.c.equals(fs3Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + wv8.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContributionPerformanceSummaryWrapper(categoryText=");
        sb.append(this.a);
        sb.append(", imageRes=");
        sb.append(this.b);
        sb.append(", value=");
        return mz1.o(sb, this.c, ")");
    }
}
