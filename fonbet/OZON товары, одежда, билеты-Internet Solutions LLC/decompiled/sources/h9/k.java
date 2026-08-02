package h9;

import i9.C7023b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import r9.C9217a;
import w9.C10449a;

/* loaded from: classes9.dex */
public final class k implements o {

    /* renamed from: c, reason: collision with root package name */
    private static final o[] f65110c = new o[0];

    /* renamed from: a, reason: collision with root package name */
    private EnumMap f65111a;

    /* renamed from: b, reason: collision with root package name */
    private o[] f65112b;

    private q c(c cVar) throws m {
        o[] oVarArr = this.f65112b;
        if (oVarArr != null) {
            for (o oVar : oVarArr) {
                try {
                    return oVar.a(cVar, this.f65111a);
                } catch (p unused) {
                }
            }
        }
        throw m.a();
    }

    @Override // h9.o
    public final q a(c cVar, EnumMap enumMap) throws m {
        e(enumMap);
        return c(cVar);
    }

    public final q b(c cVar) throws m {
        e(null);
        return c(cVar);
    }

    public final q d(c cVar) throws m {
        if (this.f65112b == null) {
            e(null);
        }
        return c(cVar);
    }

    public final void e(EnumMap enumMap) {
        this.f65111a = enumMap;
        boolean z11 = enumMap != null && enumMap.containsKey(e.TRY_HARDER);
        Collection collection = enumMap == null ? null : (Collection) enumMap.get(e.POSSIBLE_FORMATS);
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            boolean z12 = collection.contains(EnumC6876a.UPC_A) || collection.contains(EnumC6876a.UPC_E) || collection.contains(EnumC6876a.EAN_13) || collection.contains(EnumC6876a.EAN_8) || collection.contains(EnumC6876a.CODABAR) || collection.contains(EnumC6876a.CODE_39) || collection.contains(EnumC6876a.CODE_93) || collection.contains(EnumC6876a.CODE_128) || collection.contains(EnumC6876a.ITF) || collection.contains(EnumC6876a.RSS_14) || collection.contains(EnumC6876a.RSS_EXPANDED);
            if (z12 && !z11) {
                arrayList.add(new y9.p(enumMap));
            }
            if (collection.contains(EnumC6876a.QR_CODE)) {
                arrayList.add(new H9.a());
            }
            if (collection.contains(EnumC6876a.DATA_MATRIX)) {
                arrayList.add(new C9217a());
            }
            if (collection.contains(EnumC6876a.AZTEC)) {
                arrayList.add(new C7023b());
            }
            if (collection.contains(EnumC6876a.PDF_417)) {
                arrayList.add(new C9.b());
            }
            if (collection.contains(EnumC6876a.MAXICODE)) {
                arrayList.add(new C10449a());
            }
            if (z12 && z11) {
                arrayList.add(new y9.p(enumMap));
            }
        }
        if (arrayList.isEmpty()) {
            if (!z11) {
                arrayList.add(new y9.p(enumMap));
            }
            arrayList.add(new H9.a());
            arrayList.add(new C9217a());
            arrayList.add(new C7023b());
            arrayList.add(new C9.b());
            arrayList.add(new C10449a());
            if (z11) {
                arrayList.add(new y9.p(enumMap));
            }
        }
        this.f65112b = (o[]) arrayList.toArray(f65110c);
    }

    @Override // h9.o
    public final void reset() {
        o[] oVarArr = this.f65112b;
        if (oVarArr != null) {
            for (o oVar : oVarArr) {
                oVar.reset();
            }
        }
    }
}
