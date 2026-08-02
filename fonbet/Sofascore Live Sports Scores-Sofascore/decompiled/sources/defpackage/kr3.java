package defpackage;

import com.sofascore.model.mvvm.model.Event;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class kr3 extends hoi implements gt8 {
    public int r;
    public /* synthetic */ h38 s;
    public /* synthetic */ g0a t;
    public /* synthetic */ fci u;
    public /* synthetic */ svb v;
    public /* synthetic */ boolean w;
    public final /* synthetic */ tr3 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kr3(tr3 tr3Var, rq3 rq3Var) {
        super(6, rq3Var);
        this.x = tr3Var;
    }

    @Override // defpackage.gt8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean booleanValue = ((Boolean) obj5).booleanValue();
        kr3 kr3Var = new kr3(this.x, (rq3) obj6);
        kr3Var.s = (h38) obj;
        kr3Var.t = (g0a) obj2;
        kr3Var.u = (fci) obj3;
        kr3Var.v = (svb) obj4;
        kr3Var.w = booleanValue;
        return kr3Var.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
    
        if ((r8.n.getValue() instanceof defpackage.g38) == false) goto L22;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        gv9 a;
        h38 h38Var = this.s;
        g0a g0aVar = this.t;
        fci fciVar = this.u;
        svb svbVar = this.v;
        boolean z = this.w;
        lu3 lu3Var = lu3.a;
        int i = this.r;
        Boolean bool = null;
        tr3 tr3Var = this.x;
        boolean z2 = true;
        if (i == 0) {
            y6a.M(obj);
            aeh aehVar = tr3Var.k;
            this.s = h38Var;
            this.t = g0aVar;
            this.u = fciVar;
            this.v = svbVar;
            this.w = z;
            this.r = 1;
            obj = rd0.y(aehVar, this);
            if (obj == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        Event event = (Event) obj;
        if (event.isCrowdsourcingAwaitingResults()) {
            g0a g0aVar2 = (g0a) tr3Var.t.getValue();
            if (g0aVar2 != null && (a = g0aVar2.a()) != null) {
                bool = Boolean.valueOf(!a.isEmpty());
            }
            if (Intrinsics.c(bool, Boolean.TRUE)) {
            }
        }
        z2 = false;
        return new j64(fciVar, h38Var, svbVar, g0aVar, z2, z, event.getId());
    }
}
