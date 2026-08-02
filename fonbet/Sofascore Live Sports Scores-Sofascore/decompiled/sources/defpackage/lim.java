package defpackage;

import android.content.Context;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class lim extends hoi implements Function2 {
    public final /* synthetic */ jgm r;
    public final /* synthetic */ he2 s;
    public final /* synthetic */ String t;
    public final /* synthetic */ String u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lim(jgm jgmVar, he2 he2Var, String str, String str2, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = jgmVar;
        this.s = he2Var;
        this.t = str;
        this.u = str2;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new lim(this.r, this.s, this.t, this.u, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((lim) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        pe2 pe2Var;
        List<am6> c;
        String str = this.u;
        String str2 = this.t;
        jgm jgmVar = this.r;
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        try {
            Context context = jgmVar.a;
            he2 he2Var = this.s;
            context.getClass();
            he2Var.getClass();
            etl.b.getClass();
            up4 up4Var = new up4();
            up4Var.c = true;
            eo4 eo4Var = new eo4(context, up4Var);
            pe2Var = new pe2();
            pe2Var.a = he2Var;
            pe2Var.f = eo4Var;
            pe2Var.d = new mtl();
            pe2Var.g = 2;
            c = jgm.c(jgmVar, str2, str, pe2Var);
        } catch (Exception unused) {
        }
        if (c.isEmpty()) {
            return Unit.a;
        }
        dsf dsfVar = new dsf();
        jgm jgmVar2 = this.r;
        String str3 = this.u;
        for (am6 am6Var : c) {
            hv9 hv9Var = am6Var.a.r;
            hv9Var.getClass();
            List L0 = CollectionsKt.L0(hv9Var, 1);
            if (!L0.isEmpty()) {
                dsfVar.a += jgm.a(jgmVar2, L0, am6Var.b, am6Var.c, str3, pe2Var);
            }
        }
        if (dsfVar.a > 0) {
            str2.getClass();
            str.getClass();
        }
        return Unit.a;
    }
}
