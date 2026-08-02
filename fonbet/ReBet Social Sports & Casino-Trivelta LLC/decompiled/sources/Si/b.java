package Si;

import Qi.e;
import Qi.l;
import org.spongycastle.asn1.AbstractC5940s;

/* loaded from: classes5.dex */
public class b {
    private static Qi.d[] EMPTY_ARRAY = new Qi.d[0];

    /* renamed from: a, reason: collision with root package name */
    public e f10828a;

    /* renamed from: b, reason: collision with root package name */
    public l f10829b;

    public b(byte[] bArr) {
        this(a(bArr));
    }

    public static e a(byte[] bArr) {
        try {
            return e.e(AbstractC5940s.g(bArr));
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
        if (obj instanceof b) {
            return this.f10828a.equals(((b) obj).f10828a);
        }
        return false;
    }

    public int hashCode() {
        return this.f10828a.hashCode();
    }

    public b(e eVar) {
        this.f10828a = eVar;
        this.f10829b = eVar.c().c();
    }
}
