package defpackage;

import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class yfj {
    public static final ih2 a = new ih2("NO_THREAD_ELEMENTS", 5);
    public static final t6j b = new t6j(9);
    public static final t6j c = new t6j(10);
    public static final t6j d = new t6j(11);

    public static final void a(CoroutineContext coroutineContext, Object obj) {
        if (obj == a) {
            return;
        }
        if (!(obj instanceof hgj)) {
            Object fold = coroutineContext.fold(null, c);
            fold.getClass();
            ((xfj) fold).j(obj);
            return;
        }
        hgj hgjVar = (hgj) obj;
        xfj[] xfjVarArr = hgjVar.c;
        int length = xfjVarArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            xfj xfjVar = xfjVarArr[length];
            xfjVar.getClass();
            xfjVar.j(hgjVar.b[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }

    public static final Object b(CoroutineContext coroutineContext) {
        Object fold = coroutineContext.fold(0, b);
        fold.getClass();
        return fold;
    }

    public static final Object c(CoroutineContext coroutineContext, Object obj) {
        if (obj == null) {
            obj = b(coroutineContext);
        }
        return obj == 0 ? a : obj instanceof Integer ? coroutineContext.fold(new hgj(((Number) obj).intValue(), coroutineContext), d) : ((xfj) obj).M();
    }
}
