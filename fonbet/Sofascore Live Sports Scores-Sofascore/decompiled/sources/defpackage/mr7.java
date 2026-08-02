package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class mr7 extends hoi implements ft8 {
    public final /* synthetic */ rr7 A;
    public av4 r;
    public zu4 s;
    public rr7 t;
    public List u;
    public int v;
    public /* synthetic */ List w;
    public /* synthetic */ List x;
    public /* synthetic */ List y;
    public /* synthetic */ List z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mr7(rr7 rr7Var, rq3 rq3Var) {
        super(5, rq3Var);
        this.A = rr7Var;
    }

    @Override // defpackage.ft8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        mr7 mr7Var = new mr7(this.A, (rq3) obj5);
        mr7Var.w = (List) obj;
        mr7Var.x = (List) obj2;
        mr7Var.y = (List) obj3;
        mr7Var.z = (List) obj4;
        return mr7Var.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00cf  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        av4 t;
        zu4 zu4Var;
        rr7 rr7Var;
        List list;
        zu4 zu4Var2;
        Object T;
        rr7 rr7Var2;
        List list2;
        List list3 = this.w;
        List list4 = this.x;
        List list5 = this.y;
        List list6 = this.z;
        lu3 lu3Var = lu3.a;
        int i = this.v;
        int i2 = 3;
        int i3 = 2;
        rq3 rq3Var = null;
        if (i == 0) {
            y6a.M(obj);
            rr7 rr7Var3 = this.A;
            av4 t2 = xw3.t(un0.z(rr7Var3), null, new br7(rr7Var3, list3, list5, rq3Var, 1), 3);
            t = xw3.t(un0.z(rr7Var3), null, new cr7(rr7Var3, list6, rq3Var, i2), 3);
            av4 t3 = xw3.t(un0.z(rr7Var3), null, new cr7(rr7Var3, list4, rq3Var, i3), 3);
            this.w = null;
            this.x = null;
            this.y = null;
            this.z = null;
            this.r = t;
            this.s = t3;
            this.t = rr7Var3;
            this.v = 1;
            obj = t2.w(this);
            if (obj != lu3Var) {
                zu4Var = t3;
                rr7Var = rr7Var3;
            }
            return lu3Var;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                list2 = this.u;
                rr7Var2 = this.t;
                y6a.M(obj);
                ArrayList w0 = CollectionsKt.w0(CollectionsKt.L0((Iterable) obj, 10), list2);
                rr7Var2.getClass();
                return CollectionsKt.H0(w0, new cp(new qe8(13), 1));
            }
            List list7 = this.u;
            rr7 rr7Var4 = this.t;
            zu4Var2 = this.s;
            y6a.M(obj);
            list = list7;
            rr7Var = rr7Var4;
            ArrayList w02 = CollectionsKt.w0(CollectionsKt.L0((Iterable) obj, 10), list);
            this.w = null;
            this.x = null;
            this.y = null;
            this.z = null;
            this.r = null;
            this.s = null;
            this.t = rr7Var;
            this.u = w02;
            this.v = 3;
            T = zu4Var2.T(this);
            if (T != lu3Var) {
                obj = T;
                rr7Var2 = rr7Var;
                list2 = w02;
                ArrayList w03 = CollectionsKt.w0(CollectionsKt.L0((Iterable) obj, 10), list2);
                rr7Var2.getClass();
                return CollectionsKt.H0(w03, new cp(new qe8(13), 1));
            }
            return lu3Var;
        }
        rr7Var = this.t;
        zu4Var = this.s;
        t = this.r;
        y6a.M(obj);
        List L0 = CollectionsKt.L0((Iterable) obj, 10);
        this.w = null;
        this.x = null;
        this.y = null;
        this.z = null;
        this.r = null;
        this.s = zu4Var;
        this.t = rr7Var;
        this.u = L0;
        this.v = 2;
        Object T2 = t.T(this);
        if (T2 != lu3Var) {
            zu4 zu4Var3 = zu4Var;
            list = L0;
            obj = T2;
            zu4Var2 = zu4Var3;
            ArrayList w022 = CollectionsKt.w0(CollectionsKt.L0((Iterable) obj, 10), list);
            this.w = null;
            this.x = null;
            this.y = null;
            this.z = null;
            this.r = null;
            this.s = null;
            this.t = rr7Var;
            this.u = w022;
            this.v = 3;
            T = zu4Var2.T(this);
            if (T != lu3Var) {
            }
        }
        return lu3Var;
    }
}
