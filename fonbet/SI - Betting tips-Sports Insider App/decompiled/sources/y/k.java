package y;

import java.util.ArrayList;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public n f25503a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f25504b;

    public static long a(e eVar, long j) {
        n nVar = eVar.f25492d;
        ArrayList arrayList = eVar.f25498k;
        if (nVar instanceof i) {
            return j;
        }
        int size = arrayList.size();
        long j6 = j;
        for (int i5 = 0; i5 < size; i5++) {
            d dVar = (d) arrayList.get(i5);
            if (dVar instanceof e) {
                e eVar2 = (e) dVar;
                if (eVar2.f25492d != nVar) {
                    j6 = Math.min(j6, a(eVar2, eVar2.f25494f + j));
                }
            }
        }
        e eVar3 = nVar.f25521i;
        e eVar4 = nVar.f25520h;
        if (eVar != eVar3) {
            return j6;
        }
        long j10 = j - nVar.j();
        return Math.min(Math.min(j6, a(eVar4, j10)), j10 - eVar4.f25494f);
    }

    public static long b(e eVar, long j) {
        n nVar = eVar.f25492d;
        ArrayList arrayList = eVar.f25498k;
        if (nVar instanceof i) {
            return j;
        }
        int size = arrayList.size();
        long j6 = j;
        for (int i5 = 0; i5 < size; i5++) {
            d dVar = (d) arrayList.get(i5);
            if (dVar instanceof e) {
                e eVar2 = (e) dVar;
                if (eVar2.f25492d != nVar) {
                    j6 = Math.max(j6, b(eVar2, eVar2.f25494f + j));
                }
            }
        }
        e eVar3 = nVar.f25520h;
        e eVar4 = nVar.f25521i;
        if (eVar != eVar3) {
            return j6;
        }
        long j10 = nVar.j() + j;
        return Math.max(Math.max(j6, b(eVar4, j10)), j10 - eVar4.f25494f);
    }
}
