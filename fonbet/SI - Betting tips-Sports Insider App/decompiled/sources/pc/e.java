package pc;

import c1.y;
import eg.c0;
import eg.m0;
import eg.z;
import hg.t0;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21620b;

    /* renamed from: c, reason: collision with root package name */
    public int f21621c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u f21622d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(u uVar, Continuation continuation, int i5) {
        super(2, continuation);
        this.f21620b = i5;
        this.f21622d = uVar;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f21620b) {
            case 0:
                return new e(this.f21622d, continuation, 0);
            case 1:
                return new e(this.f21622d, continuation, 1);
            case 2:
                return new e(this.f21622d, continuation, 2);
            default:
                return new e(this.f21622d, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f21620b) {
            case 0:
                return ((e) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
            case 1:
                return ((e) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
            case 2:
                ((e) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
                return lf.a.f20034a;
            default:
                return ((e) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    @Override // mf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List list;
        switch (this.f21620b) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i5 = this.f21621c;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                this.f21621c = 1;
                Object h10 = u.h(this.f21622d, "inapp", this);
                return h10 == aVar ? aVar : h10;
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                int i10 = this.f21621c;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                this.f21621c = 1;
                Object h11 = u.h(this.f21622d, "subs", this);
                return h11 == aVar2 ? aVar2 : h11;
            case 2:
                lf.a aVar3 = lf.a.f20034a;
                int i11 = this.f21621c;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    throw new gf.f();
                }
                h8.b.B(obj);
                t0 t0Var = u.n().f25821d;
                y yVar = new y(4, this.f21622d);
                this.f21621c = 1;
                t0Var.getClass();
                t0.l(t0Var, yVar, this);
                return aVar3;
            default:
                lf.a aVar4 = lf.a.f20034a;
                int i12 = this.f21621c;
                u uVar = this.f21622d;
                Continuation continuation = null;
                try {
                } catch (CancellationException unused) {
                    list = null;
                    if (list == null) {
                    }
                } catch (Exception e7) {
                    u.r(e7, "purchaseHistory", new io.sentry.e("getHistoryPurchaseAsync"));
                    list = null;
                    if (list == null) {
                    }
                }
                if (i12 == 0) {
                    h8.b.B(obj);
                    this.f21621c = 1;
                    obj = c0.i(new b(uVar, continuation, 1), this);
                    if (obj == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i12 != 1) {
                        if (i12 != 2) {
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
                p pVar = new p(uVar, list, continuation, 2);
                this.f21621c = 2;
                Object A = c0.A(eVar, pVar, this);
                if (A != aVar4) {
                    return A;
                }
                return aVar4;
        }
    }
}
