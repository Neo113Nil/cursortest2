package defpackage;

import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class bg4 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ String t;
    public final /* synthetic */ String u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bg4(int i, String str, String str2, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = i;
        this.t = str;
        this.u = str2;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        String str = this.u;
        String str2 = this.t;
        switch (i) {
            case 0:
                bg4 bg4Var = new bg4(0, str2, str, rq3Var);
                bg4Var.s = obj;
                return bg4Var;
            default:
                bg4 bg4Var2 = new bg4(1, str2, str, rq3Var);
                bg4Var2.s = obj;
                return bg4Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        p0d p0dVar = (p0d) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((bg4) create(p0dVar, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        String str = this.u;
        String str2 = this.t;
        switch (i) {
            case 0:
                p0d p0dVar = (p0d) this.s;
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                e5f e5fVar = new e5f(str2);
                p0dVar.getClass();
                p0dVar.f(e5fVar, str);
                return Unit.a;
            default:
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                p0d p0dVar2 = (p0d) this.s;
                p0d g = p0dVar2.g();
                e5f e5fVar2 = ry8.g;
                Set set = (Set) p0dVar2.c(e5fVar2);
                if (set == null) {
                    set = rm5.a;
                }
                g.f(e5fVar2, y9h.g(set, str2));
                my8 my8Var = ry8.d;
                KProperty[] kPropertyArr = my8.a;
                my8Var.getClass();
                g.f(my8.a(str2), str);
                return g.h();
        }
    }
}
