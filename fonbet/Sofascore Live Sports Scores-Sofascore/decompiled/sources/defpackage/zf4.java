package defpackage;

import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zf4 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ ArrayList t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zf4(ArrayList arrayList, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = arrayList;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        ArrayList arrayList = this.t;
        switch (i) {
            case 0:
                zf4 zf4Var = new zf4(arrayList, rq3Var, 0);
                zf4Var.s = obj;
                return zf4Var;
            default:
                zf4 zf4Var2 = new zf4(arrayList, rq3Var, 1);
                zf4Var2.s = obj;
                return zf4Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        p0d p0dVar = (p0d) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((zf4) create(p0dVar, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        switch (this.r) {
            case 0:
                p0d p0dVar = (p0d) this.s;
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                e5f e5fVar = new e5f("FANTASY_USER_COMPETITIONS_ORDER");
                String f0 = CollectionsKt.f0(this.t, BlazeDataSourcePersonalizedType.STRING_SEPARATOR, null, null, null, 62);
                p0dVar.getClass();
                p0dVar.f(e5fVar, f0);
                return Unit.a;
            default:
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                p0d g = ((p0d) this.s).g();
                e5f e5fVar2 = ry8.g;
                ArrayList arrayList = this.t;
                ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((sy8) it.next()).getClass().getName());
                }
                g.e(e5fVar2, CollectionsKt.W0(arrayList2));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    sy8 sy8Var = (sy8) it2.next();
                    my8 my8Var = ry8.d;
                    KProperty[] kPropertyArr = my8.a;
                    my8Var.getClass();
                    String canonicalName = sy8Var.getClass().getCanonicalName();
                    if (canonicalName == null) {
                        a70.p("no receiver name");
                        return null;
                    }
                    e5f a = my8.a(canonicalName);
                    String canonicalName2 = sy8Var.a().getClass().getCanonicalName();
                    if (canonicalName2 == null) {
                        a70.p("no provider name");
                        return null;
                    }
                    g.f(a, canonicalName2);
                }
                return g.h();
        }
    }
}
