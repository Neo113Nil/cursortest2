package yc;

import e3.j;
import eg.c0;
import eg.m0;
import f3.x;
import kotlin.jvm.internal.Intrinsics;
import la.k0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e extends x {
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object K0(int i5, j jVar, mf.c cVar) {
        d dVar;
        int i10;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i11 = dVar.f25842c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.f25842c = i11 - Integer.MIN_VALUE;
                Object obj = dVar.f25840a;
                lf.a aVar = lf.a.f20034a;
                i10 = dVar.f25842c;
                if (i10 != 0) {
                    h8.b.B(obj);
                    lg.e eVar = m0.f9201a;
                    lg.d dVar2 = lg.d.f20063c;
                    k0 k0Var = new k0(i5, jVar, this, null);
                    dVar.f25842c = 1;
                    obj = c0.A(dVar2, k0Var, dVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                Intrinsics.checkNotNullExpressionValue(obj, "withContext(...)");
                return obj;
            }
        }
        dVar = new d(this, cVar);
        Object obj2 = dVar.f25840a;
        lf.a aVar2 = lf.a.f20034a;
        i10 = dVar.f25842c;
        if (i10 != 0) {
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "withContext(...)");
        return obj2;
    }
}
