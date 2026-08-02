package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class rc9 {
    public final String a;
    public final int b;
    public final double c;
    public final String d;

    public rc9(String str, String str2, int i) {
        boolean z = true;
        if (i == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
            z = false;
        }
        z1a.E(z);
        this.a = str;
        this.b = i;
        this.d = str2;
        this.c = 0.0d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rc9)) {
            return false;
        }
        rc9 rc9Var = (rc9) obj;
        return this.b == rc9Var.b && Double.compare(this.c, rc9Var.c) == 0 && this.a.equals(rc9Var.a) && Objects.equals(this.d, rc9Var.d);
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), Double.valueOf(this.c), this.d);
    }

    public rc9(String str, double d) {
        this.a = str;
        this.b = 2;
        this.c = d;
        this.d = null;
    }
}
