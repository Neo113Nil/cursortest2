package T1;

import Ra.c;
import b1.C2333B;
import b1.C2334C;
import com.google.common.primitives.f;

/* loaded from: classes.dex */
public abstract class b implements C2334C.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f10857a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10858b;

    public b(String str, String str2) {
        this.f10857a = c.f(str);
        this.f10858b = str2;
    }

    @Override // b1.C2334C.a
    public void b(C2333B.b bVar) {
        String str = this.f10857a;
        str.getClass();
        switch (str) {
            case "TOTALTRACKS":
                Integer p10 = f.p(this.f10858b);
                if (p10 != null) {
                    bVar.r0(p10);
                    break;
                }
                break;
            case "TOTALDISCS":
                Integer p11 = f.p(this.f10858b);
                if (p11 != null) {
                    bVar.q0(p11);
                    break;
                }
                break;
            case "TRACKNUMBER":
                Integer p12 = f.p(this.f10858b);
                if (p12 != null) {
                    bVar.s0(p12);
                    break;
                }
                break;
            case "ALBUM":
                bVar.P(this.f10858b);
                break;
            case "GENRE":
                bVar.c0(this.f10858b);
                break;
            case "TITLE":
                bVar.p0(this.f10858b);
                break;
            case "DESCRIPTION":
                bVar.W(this.f10858b);
                break;
            case "DISCNUMBER":
                Integer p13 = f.p(this.f10858b);
                if (p13 != null) {
                    bVar.X(p13);
                    break;
                }
                break;
            case "ALBUMARTIST":
                bVar.O(this.f10858b);
                break;
            case "ARTIST":
                bVar.Q(this.f10858b);
                break;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f10857a.equals(bVar.f10857a) && this.f10858b.equals(bVar.f10858b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.f10857a.hashCode()) * 31) + this.f10858b.hashCode();
    }

    public String toString() {
        return "VC: " + this.f10857a + "=" + this.f10858b;
    }
}
