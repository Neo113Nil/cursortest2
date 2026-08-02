package Sh;

import Ph.Y0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class N {

    /* renamed from: a, reason: collision with root package name */
    public static final G f10769a = new G("NO_THREAD_ELEMENTS");

    /* renamed from: b, reason: collision with root package name */
    public static final Function2 f10770b = new Function2() { // from class: Sh.K
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            Object d10;
            d10 = N.d(obj, (CoroutineContext.Element) obj2);
            return d10;
        }
    };

    /* renamed from: c, reason: collision with root package name */
    public static final Function2 f10771c = new Function2() { // from class: Sh.L
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            Y0 e10;
            e10 = N.e((Y0) obj, (CoroutineContext.Element) obj2);
            return e10;
        }
    };

    /* renamed from: d, reason: collision with root package name */
    public static final Function2 f10772d = new Function2() { // from class: Sh.M
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            U h10;
            h10 = N.h((U) obj, (CoroutineContext.Element) obj2);
            return h10;
        }
    };

    public static final Object d(Object obj, CoroutineContext.Element element) {
        if (!(element instanceof Y0)) {
            return obj;
        }
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        int intValue = num != null ? num.intValue() : 1;
        return intValue == 0 ? element : Integer.valueOf(intValue + 1);
    }

    public static final Y0 e(Y0 y02, CoroutineContext.Element element) {
        if (y02 != null) {
            return y02;
        }
        if (element instanceof Y0) {
            return (Y0) element;
        }
        return null;
    }

    public static final void f(CoroutineContext coroutineContext, Object obj) {
        if (obj == f10769a) {
            return;
        }
        if (obj instanceof U) {
            ((U) obj).b(coroutineContext);
            return;
        }
        Object fold = coroutineContext.fold(null, f10771c);
        Intrinsics.checkNotNull(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((Y0) fold).z0(coroutineContext, obj);
    }

    public static final Object g(CoroutineContext coroutineContext) {
        Object fold = coroutineContext.fold(0, f10770b);
        Intrinsics.checkNotNull(fold);
        return fold;
    }

    public static final U h(U u10, CoroutineContext.Element element) {
        if (element instanceof Y0) {
            Y0 y02 = (Y0) element;
            u10.a(y02, y02.T1(u10.f10779a));
        }
        return u10;
    }

    public static final Object i(CoroutineContext coroutineContext, Object obj) {
        if (obj == null) {
            obj = g(coroutineContext);
        }
        if (obj == 0) {
            return f10769a;
        }
        if (obj instanceof Integer) {
            return coroutineContext.fold(new U(coroutineContext, ((Number) obj).intValue()), f10772d);
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((Y0) obj).T1(coroutineContext);
    }
}
