package y9;

import h9.EnumC6876a;
import java.util.EnumMap;
import o9.C8659a;

/* loaded from: classes9.dex */
public final class t extends y {

    /* renamed from: i, reason: collision with root package name */
    private final i f106345i = new i();

    private static h9.q r(h9.q qVar) throws h9.h {
        String f7 = qVar.f();
        if (f7.charAt(0) != '0') {
            throw h9.h.a();
        }
        h9.q qVar2 = new h9.q(f7.substring(1), null, qVar.e(), EnumC6876a.UPC_A);
        if (qVar.d() != null) {
            qVar2.g(qVar.d());
        }
        return qVar2;
    }

    @Override // y9.r, h9.o
    public final h9.q a(h9.c cVar, EnumMap enumMap) throws h9.m, h9.h {
        return r(this.f106345i.a(cVar, enumMap));
    }

    @Override // y9.y, y9.r
    public final h9.q b(int i11, C8659a c8659a, EnumMap enumMap) throws h9.m, h9.h, h9.d {
        return r(this.f106345i.b(i11, c8659a, enumMap));
    }

    @Override // y9.y
    protected final int k(C8659a c8659a, int[] iArr, StringBuilder sb2) throws h9.m {
        return this.f106345i.k(c8659a, iArr, sb2);
    }

    @Override // y9.y
    public final h9.q l(int i11, C8659a c8659a, int[] iArr, EnumMap enumMap) throws h9.m, h9.h, h9.d {
        return r(this.f106345i.l(i11, c8659a, iArr, enumMap));
    }

    @Override // y9.y
    final EnumC6876a p() {
        return EnumC6876a.UPC_A;
    }
}
