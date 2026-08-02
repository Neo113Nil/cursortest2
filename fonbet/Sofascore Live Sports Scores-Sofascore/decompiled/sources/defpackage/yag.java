package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Timer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class yag extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public final /* synthetic */ zag s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yag(zag zagVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.s = zagVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        zag zagVar = this.s;
        switch (i) {
            case 0:
                return new yag(zagVar, rq3Var, 0);
            case 1:
                return new yag(zagVar, rq3Var, 1);
            case 2:
                return new yag(zagVar, rq3Var, 2);
            default:
                return new yag(zagVar, rq3Var, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((yag) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        List list;
        List list2;
        int i = this.r;
        zag zagVar = this.s;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                if (!zagVar.n) {
                    zagVar.n = true;
                    gcg gcgVar = zagVar.l;
                    if (gcgVar != null && (list = gcgVar.c) != null) {
                        zagVar.b(list.iterator());
                    }
                }
                return Unit.a;
            case 1:
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                if (!zagVar.o) {
                    zagVar.o = true;
                    gcg gcgVar2 = zagVar.l;
                    if (gcgVar2 != null) {
                        zagVar.b(gcgVar2.b.iterator());
                    }
                }
                return Unit.a;
            case 2:
                lu3 lu3Var3 = lu3.a;
                y6a.M(obj);
                p03 p03Var = zagVar.p;
                if (p03Var != null) {
                    p03Var.f = null;
                    if (((Timer) p03Var.e) == null) {
                        Timer timer = new Timer();
                        p03Var.e = timer;
                        timer.schedule(new scg(p03Var, 3), 0L, 250L);
                    }
                }
                jhg jhgVar = zagVar.q;
                if (jhgVar != null) {
                    jhgVar.e = null;
                    jhgVar.f = -1L;
                    if (jhgVar.d == null) {
                        Timer timer2 = new Timer();
                        jhgVar.d = timer2;
                        timer2.schedule(new scg(jhgVar, 4), 0L, 250L);
                    }
                }
                return Unit.a;
            default:
                lu3 lu3Var4 = lu3.a;
                y6a.M(obj);
                gcg gcgVar3 = zagVar.l;
                if (gcgVar3 != null && (list2 = gcgVar3.d) != null) {
                    zagVar.b(list2.iterator());
                }
                qgg qggVar = (qgg) zagVar.c;
                ngg nggVar = qggVar.b;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Long l = qggVar.n;
                if (l == null) {
                    l = qggVar.m;
                }
                if (l != null) {
                    linkedHashMap.put("click_time", Long.valueOf(((Number) qggVar.c.invoke()).longValue() - l.longValue()));
                }
                ckg a = nggVar.a("Ad clicked", bkg.INFO, "ad_clicked", qggVar.d, qggVar.c(new meg(linkedHashMap)));
                if (a != null) {
                    nggVar.e(a, qggVar.e, qggVar.f, qggVar.a, qggVar.q, qggVar.p, qggVar.r, qggVar.t, false);
                }
                tbg tbgVar = zagVar.j;
                if (tbgVar != null) {
                    tbgVar.onAdClicked();
                    return Unit.a;
                }
                Intrinsics.i("adViewController");
                throw null;
        }
    }
}
