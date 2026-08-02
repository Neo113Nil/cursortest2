package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class bqa {
    public final int a;
    public final int b;

    public bqa(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (!(i >= 0)) {
            u3a.a("negative start index");
        }
        if (i2 >= i) {
            return;
        }
        u3a.a("end index greater than start");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bqa)) {
            return false;
        }
        bqa bqaVar = (bqa) obj;
        return this.a == bqaVar.a && this.b == bqaVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Interval(start=");
        sb.append(this.a);
        sb.append(", end=");
        return wv8.j(sb, this.b, ')');
    }
}
