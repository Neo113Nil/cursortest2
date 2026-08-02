package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class the {
    public final long a;
    public final long b;

    public the(long j, long j2) {
        this.a = j;
        this.b = j2;
        mfj[] mfjVarArr = lfj.b;
        if ((j & 1095216660480L) == 0) {
            s3a.a("width cannot be TextUnit.Unspecified");
        }
        if ((j2 & 1095216660480L) == 0) {
            s3a.a("height cannot be TextUnit.Unspecified");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof the)) {
            return false;
        }
        the theVar = (the) obj;
        return lfj.a(this.a, theVar.a) && lfj.a(this.b, theVar.b);
    }

    public final int hashCode() {
        mfj[] mfjVarArr = lfj.b;
        return Integer.hashCode(4) + ljg.c(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "Placeholder(width=" + ((Object) lfj.e(this.a)) + ", height=" + ((Object) lfj.e(this.b)) + ", placeholderVerticalAlign=" + ((Object) "Center") + ')';
    }
}
