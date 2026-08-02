package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class tj0 implements b98, lt8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tj0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.b98
    public final Object emit(Object obj, rq3 rq3Var) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((zj0) obj2).l((sj0) obj);
                Unit unit = Unit.a;
                lu3 lu3Var = lu3.a;
                return unit;
            case 1:
                ((Function1) obj2).invoke(obj);
                Unit unit2 = Unit.a;
                lu3 lu3Var2 = lu3.a;
                return unit2;
            case 2:
                Object q = ((nhh) obj2).b.q(rq3Var, (f6e) obj);
                return q == lu3.a ? q : Unit.a;
            default:
                ((AtomicReference) obj2).set((o7h) obj);
                Unit unit3 = Unit.a;
                lu3 lu3Var3 = lu3.a;
                return unit3;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof b98) && (obj instanceof lt8)) {
                    break;
                }
                break;
            case 1:
                if ((obj instanceof b98) && (obj instanceof lt8)) {
                    break;
                }
                break;
            case 2:
                if ((obj instanceof b98) && (obj instanceof lt8)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof b98) && (obj instanceof lt8)) {
                    break;
                }
                break;
        }
        return Intrinsics.c(getFunctionDelegate(), ((lt8) obj).getFunctionDelegate());
    }

    @Override // defpackage.lt8
    public final dt8 getFunctionDelegate() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new dh(2, 4, zj0.class, (zj0) obj, "updateState", "updateState(Lcoil/compose/AsyncImagePainter$State;)V");
            case 1:
                return new ot8(2, 0, s9a.class, (Function1) obj, "suspendConversion0", "invokeSuspend$suspendConversion0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
            case 2:
                return new ot8(2, 0, nhh.class, (nhh) obj, "send", "send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
            default:
                return new dh(2, 4, AtomicReference.class, (AtomicReference) obj, "set", "set(Ljava/lang/Object;)V");
        }
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
