package defpackage;

import java.util.List;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class kl4 extends ghe {
    public final List b;
    public final CoroutineContext c;
    public Object d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kl4(Object obj, List list, Object obj2, CoroutineContext coroutineContext) {
        super(obj);
        obj.getClass();
        list.getClass();
        obj2.getClass();
        this.b = list;
        this.c = coroutineContext;
        this.d = obj2;
    }

    @Override // defpackage.ghe
    public final Object a(Object obj, sq3 sq3Var) {
        this.e = 0;
        obj.getClass();
        this.d = obj;
        return c(sq3Var);
    }

    @Override // defpackage.ghe
    public final Object b() {
        return this.d;
    }

    @Override // defpackage.ghe
    public final Object c(rq3 rq3Var) {
        int i = this.e;
        if (i < 0) {
            return this.d;
        }
        if (i < this.b.size()) {
            return e(rq3Var);
        }
        this.e = -1;
        return this.d;
    }

    @Override // defpackage.ghe
    public final Object d(rq3 rq3Var, Object obj) {
        obj.getClass();
        this.d = obj;
        return c(rq3Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(rq3 rq3Var) {
        jl4 jl4Var;
        lu3 lu3Var;
        int i;
        int i2;
        ct8 ct8Var;
        Object obj;
        if (rq3Var instanceof jl4) {
            jl4Var = (jl4) rq3Var;
            int i3 = jl4Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                jl4Var.t = i3 - Integer.MIN_VALUE;
                Object obj2 = jl4Var.r;
                lu3Var = lu3.a;
                i = jl4Var.t;
                if (i == 0 && i != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj2);
                do {
                    i2 = this.e;
                    if (i2 == -1) {
                        List list = this.b;
                        if (i2 >= list.size()) {
                            this.e = -1;
                        } else {
                            ct8Var = (ct8) list.get(i2);
                            this.e = i2 + 1;
                            obj = this.d;
                            jl4Var.t = 1;
                        }
                    }
                    return this.d;
                } while (ct8Var.invoke(this, obj, jl4Var) != lu3Var);
                return lu3Var;
            }
        }
        jl4Var = new jl4(this, rq3Var);
        Object obj22 = jl4Var.r;
        lu3Var = lu3.a;
        i = jl4Var.t;
        if (i == 0) {
        }
        y6a.M(obj22);
        do {
            i2 = this.e;
            if (i2 == -1) {
            }
            return this.d;
        } while (ct8Var.invoke(this, obj, jl4Var) != lu3Var);
        return lu3Var;
    }

    @Override // defpackage.ku3
    public final CoroutineContext getCoroutineContext() {
        return this.c;
    }
}
