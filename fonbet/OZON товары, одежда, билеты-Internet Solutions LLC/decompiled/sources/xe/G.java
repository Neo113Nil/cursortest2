package xe;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class G {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    private static final CoroutineContext a(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, final boolean z11) {
        Boolean bool = Boolean.FALSE;
        boolean booleanValue = ((Boolean) coroutineContext.fold(bool, new D())).booleanValue();
        boolean booleanValue2 = ((Boolean) coroutineContext2.fold(bool, new D())).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return coroutineContext.plus(coroutineContext2);
        }
        final kotlin.jvm.internal.M m11 = new kotlin.jvm.internal.M();
        m11.f71787a = coroutineContext2;
        kotlin.coroutines.g gVar = kotlin.coroutines.g.f71771a;
        CoroutineContext coroutineContext3 = (CoroutineContext) coroutineContext.fold(gVar, new Function2() { // from class: xe.E
            /* JADX WARN: Type inference failed for: r1v5, types: [T, kotlin.coroutines.CoroutineContext] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                CoroutineContext coroutineContext4 = (CoroutineContext) obj;
                CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                if (!(element instanceof C)) {
                    return coroutineContext4.plus(element);
                }
                kotlin.jvm.internal.M m12 = kotlin.jvm.internal.M.this;
                if (((CoroutineContext) m12.f71787a).get(element.getKey()) != null) {
                    m12.f71787a = ((CoroutineContext) m12.f71787a).minusKey(element.getKey());
                    return coroutineContext4.plus(((C) element).o0());
                }
                C c11 = (C) element;
                if (z11) {
                    c11 = c11.B();
                }
                return coroutineContext4.plus(c11);
            }
        });
        if (booleanValue2) {
            m11.f71787a = ((CoroutineContext) m11.f71787a).fold(gVar, new F());
        }
        return coroutineContext3.plus((CoroutineContext) m11.f71787a);
    }

    @NotNull
    public static final CoroutineContext b(@NotNull CoroutineContext coroutineContext, @NotNull CoroutineContext coroutineContext2) {
        return !((Boolean) coroutineContext2.fold(Boolean.FALSE, new D())).booleanValue() ? coroutineContext.plus(coroutineContext2) : a(coroutineContext, coroutineContext2, false);
    }

    @NotNull
    public static final CoroutineContext c(@NotNull M m11, @NotNull CoroutineContext coroutineContext) {
        CoroutineContext a11 = a(m11.getCoroutineContext(), coroutineContext, true);
        return (a11 == C10720e0.a() || a11.get(kotlin.coroutines.e.INSTANCE) != null) ? a11 : a11.plus(C10720e0.a());
    }

    public static final h1<?> d(@NotNull kotlin.coroutines.d<?> dVar, @NotNull CoroutineContext coroutineContext, Object obj) {
        h1<?> h1Var = null;
        if ((dVar instanceof kotlin.coroutines.jvm.internal.d) && coroutineContext.get(i1.f105467a) != null) {
            kotlin.coroutines.jvm.internal.d dVar2 = (kotlin.coroutines.jvm.internal.d) dVar;
            while (true) {
                if ((dVar2 instanceof C10712a0) || (dVar2 = dVar2.getCallerFrame()) == null) {
                    break;
                }
                if (dVar2 instanceof h1) {
                    h1Var = (h1) dVar2;
                    break;
                }
            }
            if (h1Var != null) {
                h1Var.A0(coroutineContext, obj);
            }
        }
        return h1Var;
    }
}
