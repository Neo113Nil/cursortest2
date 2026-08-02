package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class r9m extends hoi implements Function2 {
    public /* synthetic */ Object r;
    public final /* synthetic */ lom s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r9m(lom lomVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = lomVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        r9m r9mVar = new r9m(this.s, rq3Var);
        r9mVar.r = obj;
        return r9mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        r9m r9mVar = new r9m(this.s, (rq3) obj2);
        r9mVar.r = (HashMap) obj;
        return r9mVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lom lomVar;
        Object obj2;
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        Set entrySet = ((HashMap) this.r).entrySet();
        entrySet.getClass();
        Iterator it = entrySet.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            lomVar = this.s;
            if (!hasNext) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (Intrinsics.c(((Map.Entry) obj2).getKey(), lomVar.w())) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj2;
        lomVar.n.k(entry != null ? (Integer) entry.getValue() : null);
        return Unit.a;
    }
}
