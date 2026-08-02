package pc;

import c4.w;
import eg.c0;
import eg.m0;
import eg.y;
import eg.z;
import hg.t0;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class q extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21687b;

    /* renamed from: c, reason: collision with root package name */
    public int f21688c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f21689d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u f21690e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(u uVar, Continuation continuation, int i5) {
        super(2, continuation);
        this.f21687b = i5;
        this.f21690e = uVar;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f21687b) {
            case 0:
                q qVar = new q(this.f21690e, continuation, 0);
                qVar.f21689d = obj;
                return qVar;
            default:
                q qVar2 = new q(this.f21690e, continuation, 1);
                qVar2.f21689d = obj;
                return qVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f21687b) {
            case 0:
                ((q) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
                return lf.a.f20034a;
            default:
                return ((q) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
        }
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        List list;
        switch (this.f21687b) {
            case 0:
                z zVar = (z) this.f21689d;
                lf.a aVar = lf.a.f20034a;
                int i5 = this.f21688c;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    throw new gf.f();
                }
                h8.b.B(obj);
                t0 t0Var = u.n().f25820c;
                bd.f fVar = new bd.f(8, zVar, this.f21690e);
                this.f21689d = null;
                this.f21688c = 1;
                t0Var.getClass();
                t0.l(t0Var, fVar, this);
                return aVar;
            default:
                u uVar = this.f21690e;
                w wVar = uVar.f21721w;
                z zVar2 = (z) this.f21689d;
                lf.a aVar2 = lf.a.f20034a;
                int i10 = this.f21688c;
                Continuation continuation = null;
                try {
                } catch (Exception e7) {
                    u.r(e7, "purchaseActive", new io.sentry.e("getAllPurchaseAsync"));
                    list = null;
                }
                if (i10 == 0) {
                    h8.b.B(obj);
                    this.f21689d = zVar2;
                    this.f21688c = 1;
                    obj = c0.i(new b(uVar, null, 0), this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        return obj;
                    }
                    h8.b.B(obj);
                }
                list = (List) obj;
                if (list == null) {
                    return null;
                }
                lg.e eVar = m0.f9201a;
                y yVar = new y("OnAllOwnedItems");
                eVar.getClass();
                c0.e(zVar2, kotlin.coroutines.e.c(eVar, yVar).t(wVar), new o(uVar, list, null, 3), 2);
                c0.e(zVar2, kotlin.coroutines.e.c(eVar, wVar).t(new y("OnAllOwnedSubs")), new o(uVar, list, null, 4), 2);
                p pVar = new p(uVar, list, continuation, 1);
                this.f21689d = null;
                this.f21688c = 2;
                Object A = c0.A(eVar, pVar, this);
                if (A != aVar2) {
                    return A;
                }
                return aVar2;
        }
    }
}
