package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class adm extends hoi implements Function2 {
    public final /* synthetic */ s4m r;
    public final /* synthetic */ he2 s;
    public final /* synthetic */ String t;
    public final /* synthetic */ String u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adm(s4m s4mVar, he2 he2Var, String str, String str2, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = s4mVar;
        this.s = he2Var;
        this.t = str;
        this.u = str2;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new adm(this.r, this.s, this.t, this.u, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((adm) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        pe2 pe2Var;
        zc4 c;
        String str = this.u;
        String str2 = this.t;
        s4m s4mVar = this.r;
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        try {
            Context context = s4mVar.a;
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
            c = s4m.c(s4mVar, str2, pe2Var, str);
        } catch (Exception unused) {
        }
        if (c == null) {
            return Unit.a;
        }
        List d = s4m.d(c);
        if (d.isEmpty()) {
            return Unit.a;
        }
        System.currentTimeMillis();
        ArrayList arrayList = new ArrayList(k13.r(d, 10));
        Iterator it = d.iterator();
        while (it.hasNext()) {
            arrayList.add(new Integer(s4m.a(s4mVar, (v7m) it.next(), Uri.parse(str2), pe2Var)));
        }
        int K0 = CollectionsKt.K0(arrayList);
        System.currentTimeMillis();
        d.size();
        if (K0 > 0) {
            str2.getClass();
            str.getClass();
        }
        return Unit.a;
    }
}
