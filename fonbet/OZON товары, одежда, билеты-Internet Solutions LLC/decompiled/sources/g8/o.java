package g8;

import S7.j;
import S7.s;
import com.google.crypto.tink.internal.B;
import com.google.crypto.tink.internal.C;
import com.google.crypto.tink.internal.C5891j;
import com.google.crypto.tink.internal.C5893l;
import com.google.crypto.tink.internal.E;
import com.google.crypto.tink.internal.t;
import java.security.GeneralSecurityException;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public final class o implements E<s, s> {

    /* renamed from: a, reason: collision with root package name */
    private static final o f64023a = new o();

    /* renamed from: b, reason: collision with root package name */
    private static final B<C5891j, s> f64024b = B.b(new Ns.b(3), C5891j.class, s.class);

    public static void d() throws GeneralSecurityException {
        t.b().d(f64023a);
        t.b().c(f64024b);
    }

    @Override // com.google.crypto.tink.internal.E
    public final Class<s> a() {
        return s.class;
    }

    @Override // com.google.crypto.tink.internal.E
    public final Class<s> b() {
        return s.class;
    }

    @Override // com.google.crypto.tink.internal.E
    public final Object c(S7.j jVar, C5893l c5893l, C c11) throws GeneralSecurityException {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < jVar.k(); i11++) {
            j.c e11 = jVar.e(i11);
            if (e11.i().equals(S7.g.f25997b)) {
                arrayList.add((s) c11.a(e11));
            }
        }
        s sVar = (s) c11.a(jVar.g());
        if (sVar != null) {
            return new l(arrayList, sVar);
        }
        throw new GeneralSecurityException("No primary set");
    }
}
