package defpackage;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class dd2 implements Cloneable {
    public final char[] a;
    public long b = -1;
    public long c = Long.MAX_VALUE;
    public cd2 d;

    public dd2(char[] cArr) {
        this.a = cArr;
    }

    @Override // 
    /* renamed from: c */
    public dd2 clone() {
        try {
            return (dd2) super.clone();
        } catch (CloneNotSupportedException unused) {
            ogj.b();
            return null;
        }
    }

    public final String e() {
        String str = new String(this.a);
        if (str.length() < 1) {
            return "";
        }
        long j = this.c;
        if (j != Long.MAX_VALUE) {
            long j2 = this.b;
            if (j >= j2) {
                return str.substring((int) j2, ((int) j) + 1);
            }
        }
        long j3 = this.b;
        return str.substring((int) j3, ((int) j3) + 1);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd2)) {
            return false;
        }
        dd2 dd2Var = (dd2) obj;
        if (this.b == dd2Var.b && this.c == dd2Var.c && Arrays.equals(this.a, dd2Var.a)) {
            return Objects.equals(this.d, dd2Var.d);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = Arrays.hashCode(this.a) * 31;
        long j = this.b;
        int i = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.c;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        cd2 cd2Var = this.d;
        return (i2 + (cd2Var != null ? cd2Var.hashCode() : 0)) * 31;
    }

    public float m() {
        if (this instanceof fd2) {
            return ((fd2) this).m();
        }
        return Float.NaN;
    }

    public int n() {
        if (this instanceof fd2) {
            return ((fd2) this).n();
        }
        return 0;
    }

    public final String o() {
        String cls = getClass().toString();
        return cls.substring(cls.lastIndexOf(46) + 1);
    }

    public final void p(long j) {
        if (this.c != Long.MAX_VALUE) {
            return;
        }
        this.c = j;
        cd2 cd2Var = this.d;
        if (cd2Var != null) {
            cd2Var.q(this);
        }
    }

    public String toString() {
        long j = this.b;
        long j2 = this.c;
        if (j > j2 || j2 == Long.MAX_VALUE) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass());
            sb.append(" (INVALID, ");
            sb.append(this.b);
            sb.append("-");
            return lnb.l(this.c, ")", sb);
        }
        return o() + " (" + this.b + " : " + this.c + ") <<" + new String(this.a).substring((int) this.b, ((int) this.c) + 1) + ">>";
    }
}
