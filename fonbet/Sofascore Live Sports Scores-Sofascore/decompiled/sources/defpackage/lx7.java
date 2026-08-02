package defpackage;

import com.sofascore.model.newNetwork.mediaposts.MediaPost;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class lx7 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ qx7 t;
    public final /* synthetic */ MediaPost u;
    public final /* synthetic */ Set v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lx7(qx7 qx7Var, MediaPost mediaPost, Set set, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = qx7Var;
        this.u = mediaPost;
        this.v = set;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new lx7(this.t, this.u, this.v, rq3Var, 0);
            case 1:
                return new lx7(this.t, this.u, this.v, rq3Var, 1);
            case 2:
                return new lx7(this.t, this.u, this.v, rq3Var, 2);
            default:
                return new lx7(this.t, this.u, this.v, rq3Var, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((lx7) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        Set set = this.v;
        MediaPost mediaPost = this.u;
        qx7 qx7Var = this.t;
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
                u8c u8cVar = qx7Var.b;
                this.s = 1;
                Object d = u8c.d(u8cVar, mediaPost, set, this, 6);
                return d == lu3Var ? lu3Var : d;
            case 1:
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
                u8c u8cVar2 = qx7Var.b;
                this.s = 1;
                Object d2 = u8c.d(u8cVar2, mediaPost, set, this, 6);
                return d2 == lu3Var2 ? lu3Var2 : d2;
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i4 = this.s;
                if (i4 != 0) {
                    if (i4 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                u8c u8cVar3 = qx7Var.b;
                this.s = 1;
                Object d3 = u8c.d(u8cVar3, mediaPost, set, this, 6);
                return d3 == lu3Var3 ? lu3Var3 : d3;
            default:
                lu3 lu3Var4 = lu3.a;
                int i5 = this.s;
                if (i5 != 0) {
                    if (i5 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                u8c u8cVar4 = qx7Var.b;
                this.s = 1;
                Object d4 = u8c.d(u8cVar4, mediaPost, set, this, 6);
                return d4 == lu3Var4 ? lu3Var4 : d4;
        }
    }
}
