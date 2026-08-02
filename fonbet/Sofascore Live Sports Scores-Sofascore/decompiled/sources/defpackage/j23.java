package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class j23 {
    public final String a;
    public final long b;
    public final int c;

    public j23(int i, long j, String str) {
        this.a = str;
        this.b = j;
        this.c = i;
        if (str.length() == 0) {
            a70.p("The name of a color space cannot be null and must contain at least 1 character");
            throw null;
        }
        if (i < -1 || i > 63) {
            a70.p("The id must be between -1 and 63");
            throw null;
        }
    }

    public abstract float a(int i);

    public abstract float b(int i);

    public boolean c() {
        return false;
    }

    public abstract long d(float f, float f2, float f3);

    public abstract float e(float f, float f2, float f3);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        j23 j23Var = (j23) obj;
        if (this.c == j23Var.c && this.a.equals(j23Var.a)) {
            return kik.p(this.b, j23Var.b);
        }
        return false;
    }

    public abstract long f(float f, float f2, float f3, float f4, j23 j23Var);

    public int hashCode() {
        return ljg.c(this.a.hashCode() * 31, 31, this.b) + this.c;
    }

    public final String toString() {
        return this.a + " (id=" + this.c + ", model=" + ((Object) kik.b0(this.b)) + ')';
    }
}
