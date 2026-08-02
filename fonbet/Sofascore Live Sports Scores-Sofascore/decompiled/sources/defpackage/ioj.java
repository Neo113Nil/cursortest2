package defpackage;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.sofascore.model.Sports;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ioj extends hoi implements Function2 {
    public ynj r;
    public qnj s;
    public Object t;
    public uza u;
    public int v;
    public final /* synthetic */ koj w;
    public final /* synthetic */ fnj x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ioj(koj kojVar, fnj fnjVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.w = kojVar;
        this.x = fnjVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new ioj(this.w, this.x, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ioj) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x0233, code lost:
    
        if (r0 == r1) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x008d, code lost:
    
        if (r9.F(r2, r21) == r1) goto L115;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0110 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x017c  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ynj ynjVar;
        String str;
        qnj d;
        Object B;
        Object B2;
        uza uzaVar;
        uza uzaVar2;
        gv9 gv9Var;
        Object w;
        ynj ynjVar2;
        String str2;
        gv9 t;
        gv9 u;
        lnj lnjVar;
        pnj pnjVar;
        lnj lnjVar2;
        pnj pnjVar2;
        Object B3;
        uza uzaVar3;
        Iterator<E> it;
        Iterator<E> it2;
        lu3 lu3Var = lu3.a;
        int i = this.v;
        int i2 = 5;
        int i3 = 4;
        int i4 = 3;
        fnj fnjVar = this.x;
        koj kojVar = this.w;
        rq3 rq3Var = null;
        if (i == 0) {
            y6a.M(obj);
            ynjVar = (ynj) kojVar.l().a();
            if (ynjVar == null) {
                return Unit.a;
            }
            boj bojVar = ynjVar.c;
            qnj qnjVar = ynjVar.f;
            rnj rnjVar = ynjVar.d;
            str = rnjVar.c;
            if (!(fnjVar instanceof cnj)) {
                if (fnjVar instanceof dnj) {
                    uzaVar2 = qnjVar instanceof uza ? (uza) qnjVar : null;
                    if (uzaVar2 == null) {
                        return Unit.a;
                    }
                    if (Intrinsics.c(str, Sports.ICE_HOCKEY) && ((dnj) fnjVar).a == boj.TEAMS) {
                        int i5 = rnjVar.a;
                        int i6 = rnjVar.b;
                        String str3 = rnjVar.d;
                        this.r = ynjVar;
                        this.s = uzaVar2;
                        this.t = str;
                        this.v = 2;
                        w = kojVar.w(i5, i6, this, str3);
                        if (w != lu3Var) {
                            ynjVar2 = ynjVar;
                            str2 = str;
                            gv9Var = (gv9) w;
                            str = str2;
                            ynjVar = ynjVar2;
                            uza uzaVar4 = uzaVar2;
                            boj bojVar2 = ((dnj) fnjVar).a;
                            t = kojVar.t(str, bojVar2);
                            u = kojVar.u(kojVar.y(str, bojVar2), gv9Var, str);
                            lnjVar = uzaVar4.d;
                            if (lnjVar != null) {
                            }
                            lnjVar = null;
                            pnjVar = uzaVar4.f;
                            if (pnjVar != null) {
                            }
                            pnjVar = null;
                            if (lnjVar == null) {
                            }
                            lnjVar2 = lnjVar;
                            if (pnjVar == null) {
                            }
                            pnjVar2 = pnjVar;
                            uza d2 = uza.d(uzaVar4, t, lnjVar2, u, pnjVar2, null, 67);
                            kojVar.n(null, new dvi(20, fnjVar, d2));
                            rnj rnjVar2 = ynjVar.d;
                            this.r = null;
                            this.s = null;
                            this.t = null;
                            this.u = d2;
                            this.v = 3;
                            B3 = kojVar.B(d2, rnjVar2, bojVar2, this);
                            if (B3 != lu3Var) {
                            }
                        }
                    } else {
                        gv9Var = null;
                        uza uzaVar42 = uzaVar2;
                        boj bojVar22 = ((dnj) fnjVar).a;
                        t = kojVar.t(str, bojVar22);
                        u = kojVar.u(kojVar.y(str, bojVar22), gv9Var, str);
                        lnjVar = uzaVar42.d;
                        if (lnjVar != null) {
                            it2 = t.iterator();
                            while (it2.hasNext()) {
                            }
                        }
                        lnjVar = null;
                        pnjVar = uzaVar42.f;
                        if (pnjVar != null) {
                            it = u.iterator();
                            while (it.hasNext()) {
                            }
                        }
                        pnjVar = null;
                        if (lnjVar == null) {
                        }
                        lnjVar2 = lnjVar;
                        if (pnjVar == null) {
                        }
                        pnjVar2 = pnjVar;
                        uza d22 = uza.d(uzaVar42, t, lnjVar2, u, pnjVar2, null, 67);
                        kojVar.n(null, new dvi(20, fnjVar, d22));
                        rnj rnjVar22 = ynjVar.d;
                        this.r = null;
                        this.s = null;
                        this.t = null;
                        this.u = d22;
                        this.v = 3;
                        B3 = kojVar.B(d22, rnjVar22, bojVar22, this);
                        if (B3 != lu3Var) {
                        }
                    }
                } else if (fnjVar instanceof ymj) {
                    n9e.u(kojVar.i(), new dvi(21, fnjVar, ynjVar));
                    kojVar.n(null, new qdj(fnjVar, i4));
                } else if (fnjVar instanceof xmj) {
                    uza uzaVar5 = qnjVar instanceof uza ? (uza) qnjVar : null;
                    if (uzaVar5 == null) {
                        return Unit.a;
                    }
                    uza d3 = uza.d(uzaVar5, null, ((xmj) fnjVar).a, null, null, null, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE);
                    kojVar.n(null, new qdj(d3, i3));
                    this.r = null;
                    this.s = null;
                    this.t = d3;
                    this.v = 4;
                    B2 = kojVar.B(d3, rnjVar, bojVar, this);
                    if (B2 != lu3Var) {
                        uzaVar = d3;
                        kojVar.n(null, new dvi(22, (gv9) B2, uzaVar));
                    }
                } else if (fnjVar instanceof wmj) {
                    if (qnjVar instanceof uza) {
                        d = uza.d((uza) qnjVar, null, null, null, ((wmj) fnjVar).a, null, 95);
                    } else {
                        if (!(qnjVar instanceof g3j)) {
                            zzl.b();
                            return null;
                        }
                        d = g3j.d((g3j) qnjVar, null, null, null, null, ((wmj) fnjVar).a, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE);
                    }
                    this.r = null;
                    this.s = d;
                    this.v = 5;
                    B = kojVar.B(d, rnjVar, bojVar, this);
                } else if (fnjVar.equals(anj.a)) {
                    ynb.m(kojVar, new fzh(kojVar, ynjVar, rq3Var, i2));
                } else if (fnjVar instanceof enj) {
                    enj enjVar = (enj) fnjVar;
                    kojVar.G(enjVar.a, enjVar.b, rnjVar.e, str);
                } else if (fnjVar instanceof zmj) {
                    kojVar.v(((zmj) fnjVar).a);
                } else if (!(fnjVar instanceof bnj)) {
                    zzl.b();
                    return null;
                }
                return lu3Var;
            }
            String str4 = ((cnj) fnjVar).a;
            this.r = null;
            this.v = 1;
        } else if (i == 1) {
            y6a.M(obj);
        } else {
            if (i == 2) {
                str2 = (String) this.t;
                uzaVar2 = (uza) this.s;
                ynj ynjVar3 = this.r;
                y6a.M(obj);
                ynjVar2 = ynjVar3;
                w = obj;
                gv9Var = (gv9) w;
                str = str2;
                ynjVar = ynjVar2;
                uza uzaVar422 = uzaVar2;
                boj bojVar222 = ((dnj) fnjVar).a;
                t = kojVar.t(str, bojVar222);
                u = kojVar.u(kojVar.y(str, bojVar222), gv9Var, str);
                lnjVar = uzaVar422.d;
                if (lnjVar != null && (t == null || !t.isEmpty())) {
                    it2 = t.iterator();
                    while (it2.hasNext()) {
                        if (Intrinsics.c(((vt2) it2.next()).a, lnjVar)) {
                            break;
                        }
                    }
                }
                lnjVar = null;
                pnjVar = uzaVar422.f;
                if (pnjVar != null && (u == null || !u.isEmpty())) {
                    it = u.iterator();
                    while (it.hasNext()) {
                        if (Intrinsics.c(((oxh) it.next()).a, pnjVar)) {
                            break;
                        }
                    }
                }
                pnjVar = null;
                if (lnjVar == null) {
                    vt2 vt2Var = (vt2) CollectionsKt.firstOrNull(t);
                    if (vt2Var == null) {
                        lnjVar2 = null;
                        if (pnjVar == null) {
                            oxh oxhVar = (oxh) CollectionsKt.firstOrNull(u);
                            if (oxhVar == null) {
                                pnjVar2 = null;
                                uza d222 = uza.d(uzaVar422, t, lnjVar2, u, pnjVar2, null, 67);
                                kojVar.n(null, new dvi(20, fnjVar, d222));
                                rnj rnjVar222 = ynjVar.d;
                                this.r = null;
                                this.s = null;
                                this.t = null;
                                this.u = d222;
                                this.v = 3;
                                B3 = kojVar.B(d222, rnjVar222, bojVar222, this);
                                if (B3 != lu3Var) {
                                    uzaVar3 = d222;
                                    kojVar.n(null, new ncj(i3, fnjVar, (gv9) B3, uzaVar3));
                                }
                                return lu3Var;
                            }
                            pnjVar = (pnj) oxhVar.a;
                        }
                        pnjVar2 = pnjVar;
                        uza d2222 = uza.d(uzaVar422, t, lnjVar2, u, pnjVar2, null, 67);
                        kojVar.n(null, new dvi(20, fnjVar, d2222));
                        rnj rnjVar2222 = ynjVar.d;
                        this.r = null;
                        this.s = null;
                        this.t = null;
                        this.u = d2222;
                        this.v = 3;
                        B3 = kojVar.B(d2222, rnjVar2222, bojVar222, this);
                        if (B3 != lu3Var) {
                        }
                        return lu3Var;
                    }
                    lnjVar = (lnj) vt2Var.a;
                }
                lnjVar2 = lnjVar;
                if (pnjVar == null) {
                }
                pnjVar2 = pnjVar;
                uza d22222 = uza.d(uzaVar422, t, lnjVar2, u, pnjVar2, null, 67);
                kojVar.n(null, new dvi(20, fnjVar, d22222));
                rnj rnjVar22222 = ynjVar.d;
                this.r = null;
                this.s = null;
                this.t = null;
                this.u = d22222;
                this.v = 3;
                B3 = kojVar.B(d22222, rnjVar22222, bojVar222, this);
                if (B3 != lu3Var) {
                }
                return lu3Var;
            }
            if (i == 3) {
                uzaVar3 = this.u;
                y6a.M(obj);
                B3 = obj;
                kojVar.n(null, new ncj(i3, fnjVar, (gv9) B3, uzaVar3));
            } else if (i == 4) {
                uzaVar = (uza) this.t;
                y6a.M(obj);
                B2 = obj;
                kojVar.n(null, new dvi(22, (gv9) B2, uzaVar));
            } else {
                if (i != 5) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qnj qnjVar2 = this.s;
                y6a.M(obj);
                d = qnjVar2;
                B = obj;
                gv9 gv9Var2 = (gv9) B;
                Pair E = koj.E(gv9Var2, d);
                kojVar.n(null, new coj(gv9Var2, (gv9) E.a, (qnj) E.b, 1));
            }
        }
        return Unit.a;
    }
}
