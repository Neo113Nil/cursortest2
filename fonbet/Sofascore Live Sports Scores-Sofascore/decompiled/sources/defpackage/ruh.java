package defpackage;

import android.content.Context;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ruh extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ vuh t;
    public final /* synthetic */ List u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ruh(vuh vuhVar, List list, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = vuhVar;
        this.u = list;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        List list = this.u;
        vuh vuhVar = this.t;
        switch (i) {
            case 0:
                return new ruh(vuhVar, list, rq3Var, 0);
            default:
                return new ruh(vuhVar, list, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((ruh) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        List list = this.u;
        vuh vuhVar = this.t;
        switch (i) {
            case 0:
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
                Context context = vuhVar.b;
                String R = pco.R(((Number) list.get(0)).intValue());
                this.s = 1;
                Object t = inb.t(context, R, null, this);
                return t == lu3Var ? lu3Var : t;
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
                Context context2 = vuhVar.b;
                String R2 = pco.R(((Number) list.get(1)).intValue());
                this.s = 1;
                Object t2 = inb.t(context2, R2, null, this);
                return t2 == lu3Var2 ? lu3Var2 : t2;
        }
    }
}
