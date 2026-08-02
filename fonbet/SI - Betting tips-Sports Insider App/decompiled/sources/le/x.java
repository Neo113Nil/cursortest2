package le;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class x implements hg.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19990a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f19991b;

    public /* synthetic */ x(z zVar, int i5) {
        this.f19990a = i5;
        this.f19991b = zVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(int i5, Continuation continuation) {
        w wVar;
        int i10;
        boolean booleanValue;
        z zVar = this.f19991b;
        com.google.firebase.messaging.x xVar = zVar.f20027y;
        if (continuation instanceof w) {
            wVar = (w) continuation;
            int i11 = wVar.f19980c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                wVar.f19980c = i11 - Integer.MIN_VALUE;
                Object obj = wVar.f19978a;
                lf.a aVar = lf.a.f20034a;
                i10 = wVar.f19980c;
                if (i10 != 0) {
                    h8.b.B(obj);
                    if (i5 != -3 && i5 != -2) {
                        xVar.getClass();
                        com.google.firebase.messaging.x.v().getClass();
                        if (i5 != 1 && i5 != 2 && i5 != 3 && i5 != 4 && i5 != 5 && i5 != 6 && i5 != 8) {
                            if (i5 == 0) {
                                da.r.a(1);
                            }
                            return Unit.f19194a;
                        }
                    }
                    wVar.f19980c = 1;
                    obj = xVar.n(wVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                booleanValue = ((Boolean) obj).booleanValue();
                Continuation continuation2 = null;
                if (booleanValue) {
                    xVar.getClass();
                    f3.x.q0(null, "userCancelPayLiveAction");
                } else {
                    eg.c0.t(androidx.lifecycle.d1.i(zVar), null, null, new u(zVar, continuation2, 7), 3);
                }
                return Unit.f19194a;
            }
        }
        wVar = new w(this, continuation);
        Object obj2 = wVar.f19978a;
        lf.a aVar2 = lf.a.f20034a;
        i10 = wVar.f19980c;
        if (i10 != 0) {
        }
        booleanValue = ((Boolean) obj2).booleanValue();
        Continuation continuation22 = null;
        if (booleanValue) {
        }
        return Unit.f19194a;
    }

    @Override // hg.h
    public final Object d(Object obj, Continuation continuation) {
        switch (this.f19990a) {
            case 0:
                return a(((Number) obj).intValue(), continuation);
            default:
                this.f19991b.f20027y.getClass();
                lg.e eVar = eg.m0.f9201a;
                Object A = eg.c0.A(lg.d.f20063c, new wc.h((ic.h0) obj, null, 1), continuation);
                return A == lf.a.f20034a ? A : Unit.f19194a;
        }
    }
}
