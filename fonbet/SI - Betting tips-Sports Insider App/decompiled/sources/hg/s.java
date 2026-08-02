package hg;

import kotlin.Unit;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class s {
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(f1 f1Var, c1.r rVar, Throwable th2, mf.c cVar) {
        o oVar;
        int i5;
        try {
            if (cVar instanceof o) {
                oVar = (o) cVar;
                int i10 = oVar.f10735c;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    oVar.f10735c = i10 - Integer.MIN_VALUE;
                    Object obj = oVar.f10734b;
                    Object obj2 = lf.a.f20034a;
                    i5 = oVar.f10735c;
                    if (i5 != 0) {
                        h8.b.B(obj);
                        oVar.f10733a = th2;
                        oVar.f10735c = 1;
                        if (rVar.invoke(f1Var, th2, oVar) == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i5 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        th2 = oVar.f10733a;
                        h8.b.B(obj);
                    }
                    return Unit.f19194a;
                }
            }
            if (i5 != 0) {
            }
            return Unit.f19194a;
        } catch (Throwable th3) {
            if (th2 != null && th2 != th3) {
                gf.d.a(th3, th2);
            }
            throw th3;
        }
        oVar = new o(cVar);
        Object obj3 = oVar.f10734b;
        Object obj22 = lf.a.f20034a;
        i5 = oVar.f10735c;
    }
}
