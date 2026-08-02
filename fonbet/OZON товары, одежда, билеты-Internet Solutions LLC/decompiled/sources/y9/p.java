package y9;

import h9.EnumC6876a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import o9.C8659a;

/* loaded from: classes9.dex */
public final class p extends r {

    /* renamed from: b, reason: collision with root package name */
    private static final r[] f106340b = new r[0];

    /* renamed from: a, reason: collision with root package name */
    private final r[] f106341a;

    public p(EnumMap enumMap) {
        Collection collection = enumMap == null ? null : (Collection) enumMap.get(h9.e.POSSIBLE_FORMATS);
        boolean z11 = (enumMap == null || enumMap.get(h9.e.ASSUME_CODE_39_CHECK_DIGIT) == null) ? false : true;
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(EnumC6876a.EAN_13) || collection.contains(EnumC6876a.UPC_A) || collection.contains(EnumC6876a.EAN_8) || collection.contains(EnumC6876a.UPC_E)) {
                arrayList.add(new q(enumMap));
            }
            if (collection.contains(EnumC6876a.CODE_39)) {
                arrayList.add(new e(z11));
            }
            if (collection.contains(EnumC6876a.CODE_93)) {
                arrayList.add(new g());
            }
            if (collection.contains(EnumC6876a.CODE_128)) {
                arrayList.add(new C10869c());
            }
            if (collection.contains(EnumC6876a.ITF)) {
                arrayList.add(new n());
            }
            if (collection.contains(EnumC6876a.CODABAR)) {
                arrayList.add(new C10867a());
            }
            if (collection.contains(EnumC6876a.RSS_14)) {
                arrayList.add(new z9.e());
            }
            if (collection.contains(EnumC6876a.RSS_EXPANDED)) {
                arrayList.add(new A9.c());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new q(enumMap));
            arrayList.add(new e(false));
            arrayList.add(new C10867a());
            arrayList.add(new g());
            arrayList.add(new C10869c());
            arrayList.add(new n());
            arrayList.add(new z9.e());
            arrayList.add(new A9.c());
        }
        this.f106341a = (r[]) arrayList.toArray(f106340b);
    }

    @Override // y9.r
    public final h9.q b(int i11, C8659a c8659a, EnumMap enumMap) throws h9.m {
        for (r rVar : this.f106341a) {
            try {
                return rVar.b(i11, c8659a, enumMap);
            } catch (h9.p unused) {
            }
        }
        throw h9.m.a();
    }

    @Override // y9.r, h9.o
    public final void reset() {
        for (r rVar : this.f106341a) {
            rVar.reset();
        }
    }
}
