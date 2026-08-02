package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class qj9 {
    public static final qj9 d = new qj9("HTTP", 1, 1);
    public final String a;
    public final int b;
    public final int c;

    public qj9(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qj9)) {
            return false;
        }
        qj9 qj9Var = (qj9) obj;
        return this.a.equals(qj9Var.a) && this.b == qj9Var.b && this.c == qj9Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + wv8.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return this.a + '/' + this.b + '.' + this.c;
    }
}
