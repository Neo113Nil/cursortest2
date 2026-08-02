package Si;

import Qi.h;
import Qi.k;
import Qi.l;
import Qi.n;
import Qi.o;
import Qi.r;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.spongycastle.asn1.C5932j;

/* loaded from: classes5.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public h f10830a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f10831b;

    /* renamed from: c, reason: collision with root package name */
    public l f10832c;

    /* renamed from: d, reason: collision with root package name */
    public o f10833d;

    public c(byte[] bArr) {
        this(b(new ByteArrayInputStream(bArr)));
    }

    public static boolean a(l lVar) {
        k c10;
        return (lVar == null || (c10 = lVar.c(k.f9813p)) == null || !r.f(c10.h()).g()) ? false : true;
    }

    public static h b(InputStream inputStream) {
        try {
            return h.c(new C5932j(inputStream, true).D0());
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
        if (obj instanceof c) {
            return this.f10830a.equals(((c) obj).f10830a);
        }
        return false;
    }

    public int hashCode() {
        return this.f10830a.hashCode();
    }

    public c(h hVar) {
        this.f10830a = hVar;
        l c10 = hVar.f().c();
        this.f10832c = c10;
        this.f10831b = a(c10);
        this.f10833d = new o(new n(hVar.e()));
    }
}
