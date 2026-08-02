package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ouh extends hoi implements Function2 {
    public List r;
    public e1d s;
    public Iterator t;
    public long u;
    public int v;
    public int w;
    public final /* synthetic */ List x;
    public final /* synthetic */ long y;
    public final /* synthetic */ e1d z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ouh(List list, long j, e1d e1dVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.x = list;
        this.y = j;
        this.z = e1dVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new ouh(this.x, this.y, this.z, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ouh) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        e1d e1dVar;
        Iterator it;
        int i;
        long j;
        List list;
        lu3 lu3Var = lu3.a;
        int i2 = this.w;
        if (i2 == 0) {
            y6a.M(obj);
            List list2 = this.x;
            Iterator it2 = list2.iterator();
            long j2 = this.y;
            e1dVar = this.z;
            it = it2;
            i = 0;
            j = j2;
            list = list2;
        } else {
            if (i2 != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.v;
            j = this.u;
            it = this.t;
            e1dVar = this.s;
            list = this.r;
            y6a.M(obj);
        }
        while (it.hasNext()) {
            e1dVar.setValue((String) it.next());
            long size = j / list.size();
            this.r = list;
            this.s = e1dVar;
            this.t = it;
            this.u = j;
            this.v = i;
            this.w = 1;
            if (n4o.y(size, this) == lu3Var) {
                return lu3Var;
            }
        }
        return Unit.a;
    }
}
