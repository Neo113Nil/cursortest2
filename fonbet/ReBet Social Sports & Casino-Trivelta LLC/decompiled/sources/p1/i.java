package p1;

import android.net.Uri;
import e1.U;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final long f62942a;

    /* renamed from: b, reason: collision with root package name */
    public final long f62943b;

    /* renamed from: c, reason: collision with root package name */
    public final String f62944c;

    /* renamed from: d, reason: collision with root package name */
    public int f62945d;

    public i(String str, long j10, long j11) {
        this.f62944c = str == null ? "" : str;
        this.f62942a = j10;
        this.f62943b = j11;
    }

    public i a(i iVar, String str) {
        String c10 = c(str);
        i iVar2 = null;
        if (iVar != null && c10.equals(iVar.c(str))) {
            long j10 = this.f62943b;
            if (j10 != -1) {
                long j11 = this.f62942a;
                if (j11 + j10 == iVar.f62942a) {
                    long j12 = iVar.f62943b;
                    return new i(c10, j11, j12 != -1 ? j10 + j12 : -1L);
                }
            }
            long j13 = iVar.f62943b;
            if (j13 != -1) {
                long j14 = iVar.f62942a;
                if (j14 + j13 == this.f62942a) {
                    iVar2 = new i(c10, j14, j10 != -1 ? j13 + j10 : -1L);
                }
            }
        }
        return iVar2;
    }

    public Uri b(String str) {
        return U.g(str, this.f62944c);
    }

    public String c(String str) {
        return U.f(str, this.f62944c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (this.f62942a == iVar.f62942a && this.f62943b == iVar.f62943b && this.f62944c.equals(iVar.f62944c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f62945d == 0) {
            this.f62945d = ((((527 + ((int) this.f62942a)) * 31) + ((int) this.f62943b)) * 31) + this.f62944c.hashCode();
        }
        return this.f62945d;
    }

    public String toString() {
        return "RangedUri(referenceUri=" + this.f62944c + ", start=" + this.f62942a + ", length=" + this.f62943b + ")";
    }
}
