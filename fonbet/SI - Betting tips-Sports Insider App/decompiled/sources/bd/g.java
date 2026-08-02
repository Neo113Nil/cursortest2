package bd;

import c1.p;
import c1.q;
import c1.t;
import eg.c0;
import f3.m;
import hg.b0;
import hg.d1;
import hg.r;
import hg.u0;
import hg.y;
import ig.u;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.InlineMarker;
import la.m0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g implements hg.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3156a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hg.g f3157b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3158c;

    public /* synthetic */ g(hg.g gVar, Object obj, int i5) {
        this.f3156a = i5;
        this.f3157b = gVar;
        this.f3158c = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01a9  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x016c -> B:59:0x016f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x017e -> B:62:0x017b). Please report as a decompilation issue!!! */
    @Override // hg.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(hg.h hVar, Continuation continuation) {
        r rVar;
        lf.a aVar;
        int i5;
        Throwable th2;
        u uVar;
        g gVar;
        hg.h hVar2;
        hg.g gVar2;
        y yVar;
        int i10;
        long j;
        g gVar3;
        g gVar4;
        hg.h hVar3;
        Throwable th3;
        Serializable f6;
        b0 b0Var;
        int i11;
        f fVar;
        switch (this.f3156a) {
            case 0:
                Object a7 = this.f3157b.a(new f(0, hVar, (j) this.f3158c), continuation);
                return a7 == lf.a.f20034a ? a7 : Unit.f19194a;
            case 1:
                if (continuation instanceof r) {
                    rVar = (r) continuation;
                    int i12 = rVar.f10746b;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        rVar.f10746b = i12 - Integer.MIN_VALUE;
                        Object obj = rVar.f10745a;
                        aVar = lf.a.f20034a;
                        i5 = rVar.f10746b;
                        if (i5 != 0) {
                            h8.b.B(obj);
                            u uVar2 = new u(hVar, rVar.getContext());
                            try {
                                p pVar = (p) this.f3158c;
                                rVar.f10748d = this;
                                rVar.f10749e = hVar;
                                rVar.f10750f = uVar2;
                                rVar.f10746b = 1;
                                InlineMarker.mark(6);
                                Object invoke = pVar.invoke(uVar2, rVar);
                                InlineMarker.mark(7);
                                if (invoke == aVar) {
                                    return aVar;
                                }
                                gVar = this;
                                hVar2 = hVar;
                                uVar = uVar2;
                            } catch (Throwable th4) {
                                th2 = th4;
                                uVar = uVar2;
                                uVar.releaseIntercepted();
                                throw th2;
                            }
                        } else {
                            if (i5 != 1) {
                                if (i5 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                h8.b.B(obj);
                                return Unit.f19194a;
                            }
                            uVar = rVar.f10750f;
                            hVar2 = rVar.f10749e;
                            gVar = rVar.f10748d;
                            try {
                                h8.b.B(obj);
                            } catch (Throwable th5) {
                                th2 = th5;
                                uVar.releaseIntercepted();
                                throw th2;
                            }
                        }
                        uVar.releaseIntercepted();
                        gVar2 = gVar.f3157b;
                        rVar.f10748d = null;
                        rVar.f10749e = null;
                        rVar.f10750f = null;
                        rVar.f10746b = 2;
                        if (gVar2.a(hVar2, rVar) == aVar) {
                            return aVar;
                        }
                        return Unit.f19194a;
                    }
                }
                rVar = new r(this, continuation);
                Object obj2 = rVar.f10745a;
                aVar = lf.a.f20034a;
                i5 = rVar.f10746b;
                if (i5 != 0) {
                }
                uVar.releaseIntercepted();
                gVar2 = gVar.f3157b;
                rVar.f10748d = null;
                rVar.f10749e = null;
                rVar.f10750f = null;
                rVar.f10746b = 2;
                if (gVar2.a(hVar2, rVar) == aVar) {
                }
                return Unit.f19194a;
            case 2:
                if (continuation instanceof y) {
                    yVar = (y) continuation;
                    int i13 = yVar.f10798b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        yVar.f10798b = i13 - Integer.MIN_VALUE;
                        Object obj3 = yVar.f10797a;
                        lf.a aVar2 = lf.a.f20034a;
                        i10 = yVar.f10798b;
                        if (i10 != 0) {
                            h8.b.B(obj3);
                            j = 0;
                            gVar3 = this;
                            id.p pVar2 = (id.p) gVar3.f3157b;
                            yVar.f10800d = gVar3;
                            yVar.f10801e = hVar;
                            yVar.f10802f = null;
                            yVar.f10803g = j;
                            yVar.f10798b = 1;
                            f6 = u0.f(pVar2, hVar, yVar);
                            if (f6 != aVar2) {
                            }
                        } else if (i10 == 1) {
                            j = yVar.f10803g;
                            hVar = yVar.f10801e;
                            g gVar5 = yVar.f10800d;
                            h8.b.B(obj3);
                            gVar4 = gVar5;
                            hVar3 = hVar;
                            th3 = (Throwable) obj3;
                            if (th3 == null) {
                            }
                        } else {
                            if (i10 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            j = yVar.f10803g;
                            th3 = yVar.f10802f;
                            hVar3 = yVar.f10801e;
                            gVar4 = yVar.f10800d;
                            h8.b.B(obj3);
                            if (!((Boolean) obj3).booleanValue()) {
                                j++;
                                boolean z5 = true;
                                gVar3 = gVar4;
                                if (z5) {
                                    return Unit.f19194a;
                                }
                                hVar = hVar3;
                                id.p pVar22 = (id.p) gVar3.f3157b;
                                yVar.f10800d = gVar3;
                                yVar.f10801e = hVar;
                                yVar.f10802f = null;
                                yVar.f10803g = j;
                                yVar.f10798b = 1;
                                f6 = u0.f(pVar22, hVar, yVar);
                                if (f6 != aVar2) {
                                    return aVar2;
                                }
                                gVar4 = gVar3;
                                obj3 = f6;
                                hVar3 = hVar;
                                th3 = (Throwable) obj3;
                                if (th3 == null) {
                                    m mVar = (m) gVar4.f3158c;
                                    Long l6 = new Long(j);
                                    yVar.f10800d = gVar4;
                                    yVar.f10801e = hVar3;
                                    yVar.f10802f = th3;
                                    yVar.f10803g = j;
                                    yVar.f10798b = 2;
                                    InlineMarker.mark(6);
                                    mVar.getClass();
                                    long longValue = l6.longValue();
                                    m mVar2 = new m(4, yVar);
                                    mVar2.f9398c = th3;
                                    mVar2.f9399d = longValue;
                                    obj3 = mVar2.invokeSuspend(Unit.f19194a);
                                    InlineMarker.mark(7);
                                    if (obj3 == aVar2) {
                                        return aVar2;
                                    }
                                    if (!((Boolean) obj3).booleanValue()) {
                                        throw th3;
                                    }
                                } else {
                                    z5 = false;
                                    gVar3 = gVar4;
                                    if (z5) {
                                    }
                                }
                            }
                        }
                    }
                }
                yVar = new y(this, continuation);
                Object obj32 = yVar.f10797a;
                lf.a aVar22 = lf.a.f20034a;
                i10 = yVar.f10798b;
                if (i10 != 0) {
                }
            case 3:
                if (continuation instanceof b0) {
                    b0Var = (b0) continuation;
                    int i14 = b0Var.f10647b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        b0Var.f10647b = i14 - Integer.MIN_VALUE;
                        Object obj4 = b0Var.f10646a;
                        lf.a aVar3 = lf.a.f20034a;
                        i11 = b0Var.f10647b;
                        if (i11 != 0) {
                            h8.b.B(obj4);
                            g gVar6 = (g) this.f3157b;
                            f fVar2 = new f((q) this.f3158c, hVar);
                            try {
                                b0Var.f10649d = fVar2;
                                b0Var.f10647b = 1;
                                if (gVar6.a(fVar2, b0Var) == aVar3) {
                                    return aVar3;
                                }
                            } catch (ig.a e7) {
                                e = e7;
                                fVar = fVar2;
                                if (e.f11239a == fVar) {
                                }
                            }
                        } else {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            fVar = b0Var.f10649d;
                            try {
                                h8.b.B(obj4);
                            } catch (ig.a e9) {
                                e = e9;
                                if (e.f11239a == fVar) {
                                    throw e;
                                }
                                c0.k(b0Var.getContext());
                                return Unit.f19194a;
                            }
                        }
                        return Unit.f19194a;
                    }
                }
                b0Var = new b0(this, continuation);
                Object obj42 = b0Var.f10646a;
                lf.a aVar32 = lf.a.f20034a;
                i11 = b0Var.f10647b;
                if (i11 != 0) {
                }
                return Unit.f19194a;
            case 4:
                Object a10 = this.f3157b.a(new f(5, hVar, (id.c) this.f3158c), continuation);
                return a10 == lf.a.f20034a ? a10 : Unit.f19194a;
            case 5:
                Object a11 = this.f3157b.a(new t(hVar, (m0) this.f3158c, 8), continuation);
                return a11 == lf.a.f20034a ? a11 : Unit.f19194a;
            case 6:
                Object a12 = ((id.u) this.f3157b).a(new f(6, hVar, (md.m) this.f3158c), continuation);
                return a12 == lf.a.f20034a ? a12 : Unit.f19194a;
            default:
                Object a13 = ((c1.u) this.f3157b).a(new t(hVar, (yc.e) this.f3158c, 28), continuation);
                return a13 == lf.a.f20034a ? a13 : Unit.f19194a;
        }
    }

    public g(p pVar, d1 d1Var) {
        this.f3156a = 1;
        this.f3158c = pVar;
        this.f3157b = d1Var;
    }
}
