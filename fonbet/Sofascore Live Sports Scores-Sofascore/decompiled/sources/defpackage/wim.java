package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class wim extends hoi implements Function2 {
    public /* synthetic */ Object r;
    public final /* synthetic */ ArrayList s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wim(ArrayList arrayList, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = arrayList;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        wim wimVar = new wim(this.s, rq3Var);
        wimVar.r = obj;
        return wimVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        wim wimVar = new wim(this.s, (rq3) obj2);
        wimVar.r = (p0d) obj;
        return wimVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        p0d p0dVar = (p0d) this.r;
        Iterator it = this.s.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = (String) pair.a;
            String str2 = (String) pair.b;
            e5f J = f6a.J(str);
            p0dVar.getClass();
            p0dVar.f(J, str2);
        }
        return Unit.a;
    }
}
