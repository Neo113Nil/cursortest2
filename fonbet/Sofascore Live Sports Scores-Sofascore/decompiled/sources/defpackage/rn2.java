package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class rn2 implements pt8 {
    public final CoroutineContext a;
    public final int b;
    public final a62 c;

    public rn2(CoroutineContext coroutineContext, int i, a62 a62Var) {
        this.a = coroutineContext;
        this.b = i;
        this.c = a62Var;
    }

    @Override // defpackage.z88
    public Object collect(b98 b98Var, rq3 rq3Var) {
        Object r = s9a.r(new g2(b98Var, this, null, 19), rq3Var);
        return r == lu3.a ? r : Unit.a;
    }

    @Override // defpackage.pt8
    public final z88 e(CoroutineContext coroutineContext, int i, a62 a62Var) {
        CoroutineContext coroutineContext2 = this.a;
        CoroutineContext plus = coroutineContext.plus(coroutineContext2);
        a62 a62Var2 = a62.a;
        a62 a62Var3 = this.c;
        int i2 = this.b;
        if (a62Var == a62Var2) {
            if (i2 != -3) {
                if (i != -3) {
                    if (i2 != -2) {
                        if (i != -2) {
                            i += i2;
                            if (i < 0) {
                                i = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i = i2;
            }
            a62Var = a62Var3;
        }
        return (Intrinsics.c(plus, coroutineContext2) && i == i2 && a62Var == a62Var3) ? this : h(plus, i, a62Var);
    }

    public String f() {
        return null;
    }

    public abstract Object g(k8f k8fVar, rq3 rq3Var);

    public abstract rn2 h(CoroutineContext coroutineContext, int i, a62 a62Var);

    public z88 i() {
        return null;
    }

    public ln2 j(ku3 ku3Var) {
        int i = this.b;
        if (i == -3) {
            i = -2;
        }
        nu3 nu3Var = nu3.c;
        Function2 hy1Var = new hy1(this, (rq3) null, 5);
        j8f j8fVar = new j8f(yt3.b(ku3Var, this.a), ml4.g(i, 4, this.c));
        j8fVar.l0(nu3Var, j8fVar, hy1Var);
        return j8fVar;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String f = f();
        if (f != null) {
            arrayList.add(f);
        }
        g gVar = g.a;
        CoroutineContext coroutineContext = this.a;
        if (coroutineContext != gVar) {
            arrayList.add("context=" + coroutineContext);
        }
        int i = this.b;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        a62 a62Var = a62.a;
        a62 a62Var2 = this.c;
        if (a62Var2 != a62Var) {
            arrayList.add("onBufferOverflow=" + a62Var2);
        }
        StringBuilder sb = new StringBuilder(getClass().getSimpleName());
        sb.append('[');
        return lnb.q(sb, CollectionsKt.f0(arrayList, ", ", null, null, null, 62), ']');
    }
}
