package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class zm8 implements CoroutineContext {
    public final CoroutineContext a;

    public zm8(CoroutineContext coroutineContext) {
        this.a = coroutineContext;
    }

    public final boolean equals(Object obj) {
        return Intrinsics.c(this.a, obj);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return this.a.fold(obj, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(f fVar) {
        return this.a.get(fVar);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(f fVar) {
        CoroutineContext minusKey = this.a.minusKey(fVar);
        int i = bjk.b;
        tq3 tq3Var = d.Q7;
        CoroutineContext.Element element = get(tq3Var);
        au3 au3Var = element instanceof au3 ? (au3) element : null;
        CoroutineContext.Element element2 = minusKey.get(tq3Var);
        au3 au3Var2 = element2 instanceof au3 ? (au3) element2 : null;
        if ((au3Var instanceof cv4) && au3Var != au3Var2) {
            ((cv4) au3Var).d = 0;
        }
        return new bv4(minusKey);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        CoroutineContext plus = this.a.plus(coroutineContext);
        int i = bjk.b;
        tq3 tq3Var = d.Q7;
        CoroutineContext.Element element = get(tq3Var);
        au3 au3Var = element instanceof au3 ? (au3) element : null;
        CoroutineContext.Element element2 = plus.get(tq3Var);
        au3 au3Var2 = element2 instanceof au3 ? (au3) element2 : null;
        if ((au3Var instanceof cv4) && au3Var != au3Var2) {
            ((cv4) au3Var).d = 0;
        }
        return new bv4(plus);
    }

    public final String toString() {
        return "ForwardingCoroutineContext(delegate=" + this.a + ")";
    }
}
