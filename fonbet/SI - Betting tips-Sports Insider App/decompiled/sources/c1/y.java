package c1;

import com.sports.insider.MyApp;
import com.sports.insider.ui.pays.PayExpressFragment;
import com.sports.insider.ui.pays.PayPremiumFragment;
import com.sports.insider.ui.strip.PredictionListFragment;
import eg.h1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import le.m1;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class y implements hg.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3502a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3503b;

    public /* synthetic */ y(int i5, Object obj) {
        this.f3502a = i5;
        this.f3503b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        if (eg.c0.j(500, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        if (r8.a(r2, r5, r7, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(gf.u uVar, Continuation continuation) {
        rc.y yVar;
        int i5;
        if (continuation instanceof rc.y) {
            yVar = (rc.y) continuation;
            int i10 = yVar.f22458c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                yVar.f22458c = i10 - Integer.MIN_VALUE;
                Object obj = yVar.f22456a;
                lf.a aVar = lf.a.f20034a;
                i5 = yVar.f22458c;
                if (i5 != 0) {
                    h8.b.B(obj);
                    pd.o oVar = (pd.o) this.f3503b;
                    Object obj2 = uVar.f10040b;
                    Object obj3 = uVar.f10039a;
                    Object obj4 = uVar.f10041c;
                    yVar.f22458c = 1;
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        return Unit.f19194a;
                    }
                    h8.b.B(obj);
                }
                yVar.f22458c = 2;
            }
        }
        yVar = new rc.y(this, continuation);
        Object obj5 = yVar.f22456a;
        lf.a aVar2 = lf.a.f20034a;
        i5 = yVar.f22458c;
        if (i5 != 0) {
        }
        yVar.f22458c = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0109  */
    @Override // hg.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Object obj, Continuation continuation) {
        hg.m mVar;
        int i5;
        int i10 = this.f3502a;
        int i11 = 0;
        int i12 = 2;
        Continuation continuation2 = null;
        Object obj2 = this.f3503b;
        switch (i10) {
            case 0:
                i0 i0Var = (i0) obj2;
                if (i0Var.f3408h.b() instanceof s0) {
                    return Unit.f19194a;
                }
                Object e7 = i0.e(i0Var, true, continuation);
                return e7 == lf.a.f20034a ? e7 : Unit.f19194a;
            case 1:
                if (continuation instanceof hg.m) {
                    mVar = (hg.m) continuation;
                    int i13 = mVar.f10725c;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        mVar.f10725c = i13 - Integer.MIN_VALUE;
                        Object obj3 = mVar.f10723a;
                        lf.a aVar = lf.a.f20034a;
                        i5 = mVar.f10725c;
                        if (i5 != 0) {
                            h8.b.B(obj3);
                            gg.w wVar = (gg.w) obj2;
                            if (obj == null) {
                                obj = ig.c.f11245b;
                            }
                            mVar.f10725c = 1;
                            if (((gg.v) wVar).f10105d.h(obj, mVar) == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i5 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            h8.b.B(obj3);
                        }
                        return Unit.f19194a;
                    }
                }
                mVar = new hg.m(this, continuation);
                Object obj32 = mVar.f10723a;
                lf.a aVar2 = lf.a.f20034a;
                i5 = mVar.f10725c;
                if (i5 != 0) {
                }
                return Unit.f19194a;
            case 2:
                lg.e eVar = eg.m0.f9201a;
                Object A = eg.c0.A(jg.q.f18523a, new le.g0((PayExpressFragment) obj2, continuation2, i11), continuation);
                return A == lf.a.f20034a ? A : Unit.f19194a;
            case 3:
                lg.e eVar2 = eg.m0.f9201a;
                Object A2 = eg.c0.A(jg.q.f18523a, new m1((PayPremiumFragment) obj2, continuation2, i11), continuation);
                return A2 == lf.a.f20034a ? A2 : Unit.f19194a;
            case 4:
                yb.a aVar3 = (yb.a) obj;
                pc.u uVar = (pc.u) obj2;
                String str = aVar3.f25793a;
                int i14 = aVar3.f25794b;
                if (Intrinsics.areEqual(str, "OnServiceDetails") || Intrinsics.areEqual(str, "OnServiceDetailsV4")) {
                    hg.d1 d1Var = uVar.f21720v;
                    Integer num = new Integer(i14);
                    d1Var.getClass();
                    d1Var.k(null, num);
                }
                rc.g gVar = (rc.g) uVar.f21704d.getValue();
                String name = aVar3.f25793a;
                String errorCodeName = uVar.m(i14);
                String str2 = aVar3.f25795c;
                gVar.getClass();
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(errorCodeName, "errorCodeName");
                eg.c0.t(MyApp.f6830c, rc.b0.b(), null, new androidx.lifecycle.u0(gVar, name, errorCodeName, str2, (Continuation) null, 13), 2);
                return Unit.f19194a;
            case 5:
                pe.s H = ((PredictionListFragment) obj2).H();
                H.getClass();
                eg.c0.t(androidx.lifecycle.d1.i(H), eg.m0.f9201a, null, new a1(i12, continuation2, 7), 2);
                return Unit.f19194a;
            case 6:
                ((h1) obj2).invoke(new Integer(((Number) obj).intValue()));
                return Unit.f19194a;
            case 7:
                Object invoke = ((k2.v) obj2).invoke((ic.g0) obj, continuation);
                return invoke == lf.a.f20034a ? invoke : Unit.f19194a;
            default:
                return a((gf.u) obj, continuation);
        }
    }
}
