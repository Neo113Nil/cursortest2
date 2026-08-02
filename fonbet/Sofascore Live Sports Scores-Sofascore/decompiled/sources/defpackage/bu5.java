package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class bu5 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public final /* synthetic */ String s;
    public final /* synthetic */ List t;
    public final /* synthetic */ boolean u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bu5(String str, List list, boolean z, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.s = str;
        this.t = list;
        this.u = z;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new bu5(this.s, this.t, this.u, rq3Var, 0);
            default:
                return new bu5(this.s, this.t, this.u, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((bu5) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        List list;
        int i = this.r;
        boolean z = this.u;
        List list2 = this.t;
        String str = this.s;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                p22 D = n4o.D(str, list2, z);
                list = D != null ? D.a : null;
                if (list == null) {
                    list = km5.a;
                }
                return n4o.O(z, list, new au5(0), str);
            default:
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                p22 D2 = n4o.D(str, list2, z);
                list = D2 != null ? D2.a : null;
                if (list == null) {
                    list = km5.a;
                }
                return n4o.O(z, list, new au5(1), str);
        }
    }
}
