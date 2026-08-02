package defpackage;

import android.content.Context;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class o7c extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ u8c t;
    public final /* synthetic */ List u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o7c(u8c u8cVar, List list, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = u8cVar;
        this.u = list;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        List list = this.u;
        u8c u8cVar = this.t;
        switch (i) {
            case 0:
                return new o7c(u8cVar, list, rq3Var, 0);
            default:
                return new o7c(u8cVar, list, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((o7c) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        u8c u8cVar = this.t;
        List list = this.u;
        switch (i) {
            case 0:
                Context context = u8cVar.a;
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 != 0) {
                    if (i2 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                ht9 ht9Var = new ht9(context);
                ht9Var.c = CollectionsKt.Y(list);
                ht9Var.f = (String) CollectionsKt.Y(list);
                nt9 a = ht9Var.a();
                apf a2 = ajh.a(context);
                this.s = 1;
                Object c = a2.c(a, this);
                return c == lu3Var ? lu3Var : c;
            default:
                Context context2 = u8cVar.a;
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 != 0) {
                    if (i3 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                ht9 ht9Var2 = new ht9(context2);
                ht9Var2.c = CollectionsKt.Y(list);
                ht9Var2.f = (String) CollectionsKt.Y(list);
                nt9 a3 = ht9Var2.a();
                apf a4 = ajh.a(context2);
                this.s = 1;
                Object c2 = a4.c(a3, this);
                return c2 == lu3Var2 ? lu3Var2 : c2;
        }
    }
}
