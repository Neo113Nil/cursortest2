package se;

import androidx.lifecycle.d1;
import da.r;
import eg.c0;
import eg.m0;
import f3.x;
import ic.h0;
import jg.q;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n implements hg.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23571a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f23572b;

    public /* synthetic */ n(p pVar, int i5) {
        this.f23571a = i5;
        this.f23572b = pVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(int i5, Continuation continuation) {
        m mVar;
        Object obj;
        int i10;
        p pVar = this.f23572b;
        wc.i iVar = pVar.A;
        if (continuation instanceof m) {
            mVar = (m) continuation;
            int i11 = mVar.f23570c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                mVar.f23570c = i11 - Integer.MIN_VALUE;
                obj = mVar.f23568a;
                lf.a aVar = lf.a.f20034a;
                i10 = mVar.f23570c;
                int i12 = 2;
                Continuation continuation2 = null;
                if (i10 != 0) {
                    h8.b.B(obj);
                    if (i5 != -3 && i5 != -2) {
                        iVar.getClass();
                        wc.i.a().getClass();
                        if (i5 != 1 && i5 != 2 && i5 != 3 && i5 != 4 && i5 != 5 && i5 != 6 && i5 != 8 && i5 != 12) {
                            if (i5 == 0) {
                                r.a(1);
                            }
                            return Unit.f19194a;
                        }
                    }
                    mVar.f23570c = 1;
                    iVar.getClass();
                    lg.e eVar = m0.f9201a;
                    obj = c0.A(lg.d.f20063c, new wc.f(iVar, continuation2, i12), mVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    String str = pVar.J;
                    iVar.getClass();
                    if (str != null) {
                        switch (str.hashCode()) {
                            case -1308979344:
                                if (str.equals("express")) {
                                    x.q0(null, "userCancelPayExpressAction");
                                    break;
                                }
                                break;
                            case -318452137:
                                if (str.equals("premium")) {
                                    x.q0(null, "userCancelPayPremiumAction");
                                    break;
                                }
                                break;
                            case 3322092:
                                if (str.equals("live")) {
                                    x.q0(null, "userCancelPayLiveAction");
                                    break;
                                }
                                break;
                            case 1655054676:
                                if (str.equals("diamond")) {
                                    x.q0(null, "userCancelPayDiamondAction");
                                    break;
                                }
                                break;
                        }
                    }
                } else {
                    u1.a i13 = d1.i(pVar);
                    CoroutineContext coroutineContext = pVar.L;
                    lg.e eVar2 = m0.f9201a;
                    c0.t(i13, coroutineContext.t(q.f18523a), null, new j(pVar, continuation2, 9), 2);
                }
                return Unit.f19194a;
            }
        }
        mVar = new m(this, continuation);
        obj = mVar.f23568a;
        lf.a aVar2 = lf.a.f20034a;
        i10 = mVar.f23570c;
        int i122 = 2;
        Continuation continuation22 = null;
        if (i10 != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return Unit.f19194a;
    }

    @Override // hg.h
    public final Object d(Object obj, Continuation continuation) {
        switch (this.f23571a) {
            case 0:
                return a(((Number) obj).intValue(), continuation);
            default:
                this.f23572b.A.getClass();
                Object i5 = wc.i.i((h0) obj, continuation);
                return i5 == lf.a.f20034a ? i5 : Unit.f19194a;
        }
    }
}
