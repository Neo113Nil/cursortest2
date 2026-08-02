package hg;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.InlineMarker;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class q implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c1.u f10743a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c1.r f10744b;

    public q(c1.u uVar, c1.r rVar) {
        this.f10743a = uVar;
        this.f10744b = rVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // hg.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(h hVar, Continuation continuation) {
        p pVar;
        lf.a aVar;
        int i5;
        q qVar;
        f1 f1Var;
        c1.r rVar;
        ig.u uVar;
        Throwable th2;
        ig.u uVar2;
        Object invoke;
        try {
            if (continuation instanceof p) {
                pVar = (p) continuation;
                int i10 = pVar.f10738b;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    pVar.f10738b = i10 - Integer.MIN_VALUE;
                    Object obj = pVar.f10737a;
                    aVar = lf.a.f20034a;
                    i5 = pVar.f10738b;
                    if (i5 != 0) {
                        h8.b.B(obj);
                        try {
                            c1.u uVar3 = this.f10743a;
                            pVar.f10740d = this;
                            pVar.f10741e = hVar;
                            pVar.f10738b = 1;
                            if (uVar3.a(hVar, pVar) != aVar) {
                                qVar = this;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            qVar = this;
                            f1Var = new f1(th);
                            rVar = qVar.f10744b;
                            pVar.f10740d = th;
                            pVar.f10741e = null;
                            pVar.f10738b = 2;
                            if (s.a(f1Var, rVar, th, pVar) != aVar) {
                                return aVar;
                            }
                            throw th;
                        }
                        return aVar;
                    }
                    if (i5 != 1) {
                        if (i5 == 2) {
                            Throwable th4 = (Throwable) pVar.f10740d;
                            h8.b.B(obj);
                            throw th4;
                        }
                        if (i5 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        uVar2 = (ig.u) pVar.f10740d;
                        try {
                            h8.b.B(obj);
                            uVar2.releaseIntercepted();
                            return Unit.f19194a;
                        } catch (Throwable th5) {
                            th2 = th5;
                            uVar2.releaseIntercepted();
                            throw th2;
                        }
                    }
                    hVar = pVar.f10741e;
                    qVar = (q) pVar.f10740d;
                    try {
                        h8.b.B(obj);
                    } catch (Throwable th6) {
                        th = th6;
                        f1Var = new f1(th);
                        rVar = qVar.f10744b;
                        pVar.f10740d = th;
                        pVar.f10741e = null;
                        pVar.f10738b = 2;
                        if (s.a(f1Var, rVar, th, pVar) != aVar) {
                        }
                    }
                    uVar = new ig.u(hVar, pVar.getContext());
                    c1.r rVar2 = qVar.f10744b;
                    pVar.f10740d = uVar;
                    pVar.f10741e = null;
                    pVar.f10738b = 3;
                    InlineMarker.mark(6);
                    invoke = rVar2.invoke(uVar, null, pVar);
                    InlineMarker.mark(7);
                    if (invoke != aVar) {
                        uVar2 = uVar;
                        uVar2.releaseIntercepted();
                        return Unit.f19194a;
                    }
                    return aVar;
                }
            }
            c1.r rVar22 = qVar.f10744b;
            pVar.f10740d = uVar;
            pVar.f10741e = null;
            pVar.f10738b = 3;
            InlineMarker.mark(6);
            invoke = rVar22.invoke(uVar, null, pVar);
            InlineMarker.mark(7);
            if (invoke != aVar) {
            }
            return aVar;
        } catch (Throwable th7) {
            th2 = th7;
            uVar2 = uVar;
            uVar2.releaseIntercepted();
            throw th2;
        }
        pVar = new p(this, continuation);
        Object obj2 = pVar.f10737a;
        aVar = lf.a.f20034a;
        i5 = pVar.f10738b;
        if (i5 != 0) {
        }
        uVar = new ig.u(hVar, pVar.getContext());
    }
}
