package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class dth extends hoi implements Function2 {
    public long r;
    public Iterator s;
    public int t;
    public int u;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ q50 w;
    public final /* synthetic */ List x;
    public final /* synthetic */ e1d y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dth(boolean z, q50 q50Var, List list, e1d e1dVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.v = z;
        this.w = q50Var;
        this.x = list;
        this.y = e1dVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new dth(this.v, this.w, this.x, this.y, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((dth) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x008c, code lost:
    
        if (defpackage.s9a.r(r2, r11) == r0) goto L28;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j;
        int i;
        long j2;
        Iterator it;
        lu3 lu3Var = lu3.a;
        int i2 = this.u;
        List list = this.x;
        if (i2 == 0) {
            y6a.M(obj);
            h74 h74Var = eth.a;
            e1d e1dVar = this.y;
            if (!((Boolean) e1dVar.getValue()).booleanValue()) {
                boolean z = this.v;
                q50 q50Var = this.w;
                if (z) {
                    this.r = 2000L;
                    this.u = 1;
                    if (q50Var.g(this) != lu3Var) {
                        j = 2000;
                        Iterator it2 = list.iterator();
                        i = 0;
                        j2 = j;
                        it = it2;
                    }
                } else {
                    t53 t53Var = new t53(list, q50Var, e1dVar, (rq3) null, 10);
                    this.r = 2000L;
                    this.u = 3;
                }
                return lu3Var;
            }
            return Unit.a;
        }
        if (i2 == 1) {
            j = this.r;
            y6a.M(obj);
            Iterator it22 = list.iterator();
            i = 0;
            j2 = j;
            it = it22;
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    y6a.M(obj);
                    return Unit.a;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.t;
            j2 = this.r;
            it = this.s;
            y6a.M(obj);
        }
        while (it.hasNext()) {
            q50 q50Var2 = (q50) it.next();
            this.s = it;
            this.r = j2;
            this.t = i;
            this.u = 2;
            if (q50Var2.g(this) == lu3Var) {
                return lu3Var;
            }
        }
        return Unit.a;
    }
}
