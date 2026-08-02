package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class df0 extends hoi implements Function2 {
    public final /* synthetic */ int r = 1;
    public int s;
    public /* synthetic */ Object t;
    public final /* synthetic */ Context u;
    public final /* synthetic */ re0 v;
    public final /* synthetic */ t01 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public df0(t01 t01Var, Context context, re0 re0Var, rq3 rq3Var) {
        super(2, rq3Var);
        this.w = t01Var;
        this.u = context;
        this.v = re0Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        t01 t01Var = this.w;
        re0 re0Var = this.v;
        Context context = this.u;
        switch (i) {
            case 0:
                df0 df0Var = new df0(t01Var, context, re0Var, rq3Var);
                df0Var.t = obj;
                return df0Var;
            default:
                df0 df0Var2 = new df0(context, re0Var, t01Var, rq3Var);
                df0Var2.t = obj;
                return df0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                return ((df0) create((k8f) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            default:
                return ((df0) create((k8h) obj, (rq3) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
    
        if (r1.b(r7, r11, r10) == r5) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0086, code lost:
    
        if (r10 == r5) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0046, code lost:
    
        if (r11 == r5) goto L27;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        k8h k8hVar;
        switch (this.r) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i = this.s;
                if (i == 0) {
                    y6a.M(obj);
                    cf0 cf0Var = new cf0(new AtomicReference(null), (k8f) this.t);
                    re0 re0Var = this.v;
                    g2 g2Var = new g2(this.w, this.u, re0Var, (rq3) null, 8);
                    this.s = 1;
                    if (xw3.R(cf0Var, g2Var, this) == lu3Var) {
                        break;
                    }
                } else if (i != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            default:
                re0 re0Var2 = this.v;
                int i2 = re0Var2.a;
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                Context context = this.u;
                if (i3 == 0) {
                    y6a.M(obj);
                    k8hVar = (k8h) this.t;
                    String M = l98.M(i2);
                    this.t = k8hVar;
                    this.s = 1;
                    obj = k8hVar.a(context, M, this);
                    break;
                } else if (i3 == 1) {
                    k8hVar = (k8h) this.t;
                    y6a.M(obj);
                } else if (i3 == 2) {
                    y6a.M(obj);
                    break;
                } else if (i3 != 3) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                    break;
                }
                if (!((Boolean) obj).booleanValue()) {
                    af0 af0Var = new af0(this.w, re0Var2, null, 248);
                    this.t = null;
                    this.s = 2;
                    break;
                } else {
                    af0 af0Var2 = (af0) k8hVar.a.get(l98.M(i2));
                    af0Var2.getClass();
                    this.t = null;
                    this.s = 3;
                    Object e = af0Var2.e(ue0.a, this);
                    if (e != lu3Var2) {
                        e = Unit.a;
                        break;
                    }
                }
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public df0(Context context, re0 re0Var, t01 t01Var, rq3 rq3Var) {
        super(2, rq3Var);
        this.u = context;
        this.v = re0Var;
        this.w = t01Var;
    }
}
