package y9;

import h9.EnumC6876a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import o9.C8659a;

/* loaded from: classes9.dex */
public final class q extends r {

    /* renamed from: b, reason: collision with root package name */
    private static final y[] f106342b = new y[0];

    /* renamed from: a, reason: collision with root package name */
    private final y[] f106343a;

    public q(EnumMap enumMap) {
        Collection collection = enumMap == null ? null : (Collection) enumMap.get(h9.e.POSSIBLE_FORMATS);
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(EnumC6876a.EAN_13)) {
                arrayList.add(new i());
            } else if (collection.contains(EnumC6876a.UPC_A)) {
                arrayList.add(new t());
            }
            if (collection.contains(EnumC6876a.EAN_8)) {
                arrayList.add(new k());
            }
            if (collection.contains(EnumC6876a.UPC_E)) {
                arrayList.add(new C10865A());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new i());
            arrayList.add(new k());
            arrayList.add(new C10865A());
        }
        this.f106343a = (y[]) arrayList.toArray(f106342b);
    }

    @Override // y9.r
    public final h9.q b(int i11, C8659a c8659a, EnumMap enumMap) throws h9.m {
        boolean z11;
        int[] o11 = y.o(c8659a);
        for (y yVar : this.f106343a) {
            try {
                h9.q l11 = yVar.l(i11, c8659a, o11, enumMap);
                boolean z12 = l11.b() == EnumC6876a.EAN_13 && l11.f().charAt(0) == '0';
                Collection collection = enumMap == null ? null : (Collection) enumMap.get(h9.e.POSSIBLE_FORMATS);
                if (collection != null && !collection.contains(EnumC6876a.UPC_A)) {
                    z11 = false;
                    if (z12 || !z11) {
                        return l11;
                    }
                    h9.q qVar = new h9.q(l11.f().substring(1), l11.c(), l11.e(), EnumC6876a.UPC_A);
                    qVar.g(l11.d());
                    return qVar;
                }
                z11 = true;
                if (z12) {
                }
                return l11;
            } catch (h9.p unused) {
            }
        }
        throw h9.m.a();
    }

    @Override // y9.r, h9.o
    public final void reset() {
        for (y yVar : this.f106343a) {
            yVar.getClass();
        }
    }
}
