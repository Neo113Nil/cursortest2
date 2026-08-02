package jg;

import ig.C7073b;
import java.io.Serializable;
import java.util.HashMap;
import mg.EnumC8145a;

/* loaded from: classes10.dex */
public final class i extends g implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final i f70013c = new i();

    static {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        hashMap.put("en", new String[]{"BH", "HE"});
        hashMap2.put("en", new String[]{"B.H.", "H.E."});
        hashMap3.put("en", new String[]{"Before Hijrah", "Hijrah Era"});
    }

    private Object readResolve() {
        return f70013c;
    }

    @Override // jg.g
    public final AbstractC7423b a(mg.e eVar) {
        return eVar instanceof j ? (j) eVar : j.F1(eVar.m(EnumC8145a.EPOCH_DAY));
    }

    @Override // jg.g
    public final h f(int i11) {
        if (i11 == 0) {
            return k.BEFORE_AH;
        }
        if (i11 == 1) {
            return k.f70046AH;
        }
        throw new C7073b("invalid Hijrah era");
    }

    @Override // jg.g
    public final String h() {
        return "islamic-umalqura";
    }

    @Override // jg.g
    public final String i() {
        return "Hijrah-umalqura";
    }
}
