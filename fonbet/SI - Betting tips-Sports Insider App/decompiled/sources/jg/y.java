package jg;

import eg.v1;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static final com.android.billingclient.api.a f18531a = new com.android.billingclient.api.a("NO_THREAD_ELEMENTS", 9);

    /* renamed from: b, reason: collision with root package name */
    public static final fc.a f18532b = new fc.a(29);

    /* renamed from: c, reason: collision with root package name */
    public static final x f18533c = new x(0);

    /* renamed from: d, reason: collision with root package name */
    public static final x f18534d = new x(1);

    public static final void a(CoroutineContext coroutineContext, Object obj) {
        if (obj == f18531a) {
            return;
        }
        if (!(obj instanceof c0)) {
            Object O = coroutineContext.O(null, f18533c);
            Intrinsics.checkNotNull(O, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            ((z) ((v1) O)).a(obj);
            return;
        }
        c0 c0Var = (c0) obj;
        v1[] v1VarArr = c0Var.f18492c;
        int length = v1VarArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i5 = length - 1;
            v1 v1Var = v1VarArr[length];
            Intrinsics.checkNotNull(v1Var);
            ((z) v1Var).a(c0Var.f18491b[length]);
            if (i5 < 0) {
                return;
            } else {
                length = i5;
            }
        }
    }

    public static final Object b(CoroutineContext coroutineContext) {
        Object O = coroutineContext.O(0, f18532b);
        Intrinsics.checkNotNull(O);
        return O;
    }

    public static final Object c(CoroutineContext coroutineContext, Object obj) {
        if (obj == null) {
            obj = b(coroutineContext);
        }
        if (obj == 0) {
            return f18531a;
        }
        if (obj instanceof Integer) {
            return coroutineContext.O(new c0(((Number) obj).intValue(), coroutineContext), f18534d);
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((z) ((v1) obj)).U(coroutineContext);
    }
}
