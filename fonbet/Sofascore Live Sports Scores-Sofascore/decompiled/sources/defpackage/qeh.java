package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class qeh extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ seh t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qeh(seh sehVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = sehVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        seh sehVar = this.t;
        switch (i) {
            case 0:
                qeh qehVar = new qeh(sehVar, rq3Var, 0);
                qehVar.s = obj;
                return qehVar;
            default:
                qeh qehVar2 = new qeh(sehVar, rq3Var, 1);
                qehVar2.s = obj;
                return qehVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        s7h s7hVar = (s7h) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((qeh) create(s7hVar, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b3  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z;
        x7h x7hVar;
        int i = this.r;
        seh sehVar = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                s7h s7hVar = (s7h) this.s;
                sehVar.d.getClass();
                return s7h.a(s7hVar, null, vhj.a(), null, 5);
            default:
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                s7h s7hVar2 = (s7h) this.s;
                x7f x7fVar = sehVar.f;
                boolean d = sehVar.d(s7hVar2);
                Map map = s7hVar2.c;
                if (map != null) {
                    x7fVar.getClass();
                    z = false;
                    if (!x7fVar.f) {
                        ArrayList e = z9.e(x7fVar.a);
                        ArrayList arrayList = new ArrayList();
                        Iterator it = e.iterator();
                        while (it.hasNext()) {
                            y7f y7fVar = (y7f) it.next();
                            v7f v7fVar = (v7f) map.get(y7fVar.a);
                            Pair pair = v7fVar != null ? new Pair(y7fVar, v7fVar) : null;
                            if (pair != null) {
                                arrayList.add(pair);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                Pair pair2 = (Pair) it2.next();
                                y7f y7fVar2 = (y7f) pair2.a;
                                v7f v7fVar2 = (v7f) pair2.b;
                                boolean c = Intrinsics.c(x7fVar.a(), y7fVar2.a);
                                int i2 = y7fVar2.b;
                                if (c) {
                                    if (i2 == v7fVar2.a && Intrinsics.c((String) x7fVar.d.getValue(), v7fVar2.b)) {
                                    }
                                } else if (i2 != v7fVar2.a) {
                                }
                            }
                        }
                    }
                    boolean c2 = sehVar.c(s7hVar2);
                    if (!z) {
                        x7fVar.getClass();
                        lm5 lm5Var = lm5.a;
                        lm5Var.getClass();
                        map = x7fVar.b(lm5Var);
                    } else if (c2) {
                        map = x7fVar.b(map);
                    }
                    x7hVar = !z ? null : s7hVar2.a;
                    if (d && !z) {
                        return c2 ? s7h.a(s7hVar2, null, null, x7fVar.b(map), 3) : s7hVar2;
                    }
                    x7h a = sehVar.b.a(x7hVar);
                    b8h b8hVar = sehVar.c;
                    xw3.L(s9a.c(b8hVar.e), null, null, new o46(b8hVar, a, null), 3);
                    x7fVar.f = true;
                    return new s7h(a, null, map);
                }
                z = true;
                boolean c22 = sehVar.c(s7hVar2);
                if (!z) {
                }
                if (!z) {
                }
                if (d) {
                }
                x7h a2 = sehVar.b.a(x7hVar);
                b8h b8hVar2 = sehVar.c;
                xw3.L(s9a.c(b8hVar2.e), null, null, new o46(b8hVar2, a2, null), 3);
                x7fVar.f = true;
                return new s7h(a2, null, map);
        }
    }
}
