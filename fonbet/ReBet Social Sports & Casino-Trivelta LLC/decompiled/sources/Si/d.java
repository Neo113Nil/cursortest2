package Si;

import Qi.g;
import Qi.l;
import org.spongycastle.asn1.AbstractC5940s;

/* loaded from: classes5.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public g f10834a;

    /* renamed from: b, reason: collision with root package name */
    public l f10835b;

    public d(byte[] bArr) {
        this(a(bArr));
    }

    public static g a(byte[] bArr) {
        try {
            return g.c(AbstractC5940s.g(bArr));
        } catch (ClassCastException e10) {
            throw new a("malformed data: " + e10.getMessage(), e10);
        } catch (IllegalArgumentException e11) {
            throw new a("malformed data: " + e11.getMessage(), e11);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            return this.f10834a.equals(((d) obj).f10834a);
        }
        return false;
    }

    public int hashCode() {
        return this.f10834a.hashCode();
    }

    public d(g gVar) {
        this.f10834a = gVar;
        this.f10835b = gVar.e().c();
    }
}
