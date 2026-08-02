package Ph;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* loaded from: classes5.dex */
public abstract class J {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    public static final CoroutineContext d(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, final boolean z10) {
        boolean h10 = h(coroutineContext);
        boolean h11 = h(coroutineContext2);
        if (!h10 && !h11) {
            return coroutineContext.plus(coroutineContext2);
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = coroutineContext2;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        CoroutineContext coroutineContext3 = (CoroutineContext) coroutineContext.fold(emptyCoroutineContext, new Function2() { // from class: Ph.H
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                CoroutineContext e10;
                e10 = J.e(Ref.ObjectRef.this, z10, (CoroutineContext) obj, (CoroutineContext.Element) obj2);
                return e10;
            }
        });
        if (h11) {
            objectRef.element = ((CoroutineContext) objectRef.element).fold(emptyCoroutineContext, new Function2() { // from class: Ph.I
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    CoroutineContext f10;
                    f10 = J.f((CoroutineContext) obj, (CoroutineContext.Element) obj2);
                    return f10;
                }
            });
        }
        return coroutineContext3.plus((CoroutineContext) objectRef.element);
    }

    public static final CoroutineContext e(Ref.ObjectRef objectRef, boolean z10, CoroutineContext coroutineContext, CoroutineContext.Element element) {
        return coroutineContext.plus(element);
    }

    public static final CoroutineContext f(CoroutineContext coroutineContext, CoroutineContext.Element element) {
        return coroutineContext.plus(element);
    }

    public static final String g(CoroutineContext coroutineContext) {
        return null;
    }

    public static final boolean h(CoroutineContext coroutineContext) {
        return ((Boolean) coroutineContext.fold(Boolean.FALSE, new Function2() { // from class: Ph.G
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                boolean i10;
                i10 = J.i(((Boolean) obj).booleanValue(), (CoroutineContext.Element) obj2);
                return Boolean.valueOf(i10);
            }
        })).booleanValue();
    }

    public static final boolean i(boolean z10, CoroutineContext.Element element) {
        return z10;
    }

    public static final CoroutineContext j(P p10, CoroutineContext coroutineContext) {
        CoroutineContext d10 = d(p10.getCoroutineContext(), coroutineContext, true);
        return (d10 == C1452g0.a() || d10.get(ContinuationInterceptor.INSTANCE) != null) ? d10 : d10.plus(C1452g0.a());
    }

    public static final CoroutineContext k(CoroutineContext coroutineContext, CoroutineContext coroutineContext2) {
        return !h(coroutineContext2) ? coroutineContext.plus(coroutineContext2) : d(coroutineContext, coroutineContext2, false);
    }

    public static final j1 l(CoroutineStackFrame coroutineStackFrame) {
        while (!(coroutineStackFrame instanceof C1444c0) && (coroutineStackFrame = coroutineStackFrame.getCallerFrame()) != null) {
            if (coroutineStackFrame instanceof j1) {
                return (j1) coroutineStackFrame;
            }
        }
        return null;
    }

    public static final j1 m(Continuation continuation, CoroutineContext coroutineContext, Object obj) {
        if (!(continuation instanceof CoroutineStackFrame) || coroutineContext.get(k1.f9103a) == null) {
            return null;
        }
        j1 l10 = l((CoroutineStackFrame) continuation);
        if (l10 != null) {
            l10.R0(coroutineContext, obj);
        }
        return l10;
    }
}
