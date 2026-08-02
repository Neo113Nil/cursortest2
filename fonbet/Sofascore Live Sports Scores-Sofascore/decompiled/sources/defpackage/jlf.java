package defpackage;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class jlf {
    public final long a;
    public final long b;
    public final String c;
    public int d;

    public jlf(String str, long j, long j2) {
        this.c = str == null ? "" : str;
        this.a = j;
        this.b = j2;
    }

    public final jlf a(jlf jlfVar, String str) {
        String K = tba.K(str, this.c);
        if (jlfVar == null) {
            return null;
        }
        long j = jlfVar.b;
        if (!K.equals(tba.K(str, jlfVar.c))) {
            return null;
        }
        long j2 = this.b;
        if (j2 != -1) {
            long j3 = this.a;
            if (j3 + j2 == jlfVar.a) {
                return new jlf(K, j3, j != -1 ? j2 + j : -1L);
            }
        }
        if (j == -1) {
            return null;
        }
        long j4 = jlfVar.a;
        if (j4 + j == this.a) {
            return new jlf(K, j4, j2 != -1 ? j + j2 : -1L);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || jlf.class != obj.getClass()) {
            return false;
        }
        jlf jlfVar = (jlf) obj;
        return this.a == jlfVar.a && this.b == jlfVar.b && this.c.equals(jlfVar.c);
    }

    public final int hashCode() {
        int i = this.d;
        if (i != 0) {
            return i;
        }
        int hashCode = this.c.hashCode() + ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + ((int) this.a)) * 31) + ((int) this.b)) * 31);
        this.d = hashCode;
        return hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RangedUri(referenceUri=");
        sb.append(this.c);
        sb.append(", start=");
        sb.append(this.a);
        sb.append(", length=");
        return lnb.l(this.b, ")", sb);
    }
}
