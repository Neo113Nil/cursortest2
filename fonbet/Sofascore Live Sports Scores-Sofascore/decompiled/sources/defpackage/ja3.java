package defpackage;

import com.sofascore.model.mvvm.model.PinnedTournament;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ja3 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ la3 t;
    public final /* synthetic */ String u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ja3(la3 la3Var, String str, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = la3Var;
        this.u = str;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        String str = this.u;
        la3 la3Var = this.t;
        switch (i) {
            case 0:
                return new ja3(la3Var, str, rq3Var, 0);
            default:
                return new ja3(la3Var, str, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((ja3) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        String str = this.u;
        la3 la3Var = this.t;
        rq3 rq3Var = null;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    w3b w3bVar = la3Var.h;
                    this.s = 1;
                    irj irjVar = w3bVar.a;
                    obj = gz8.U(this, irjVar.a, true, false, new brj(irjVar, 0));
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                List H0 = CollectionsKt.H0((Iterable) obj, new y73(5));
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : H0) {
                    if (Intrinsics.c(((PinnedTournament) obj2).getSportSlug(), str)) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            default:
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
                vyh vyhVar = la3Var.f;
                this.s = 1;
                vyhVar.getClass();
                Object P = yaa.P(new uyh(vyhVar, str, rq3Var, 2), this);
                return P == lu3Var2 ? lu3Var2 : P;
        }
    }
}
