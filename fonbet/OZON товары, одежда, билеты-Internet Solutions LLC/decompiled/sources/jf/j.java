package jf;

import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final Method f69994a;

    /* renamed from: b, reason: collision with root package name */
    private final Method f69995b;

    /* renamed from: c, reason: collision with root package name */
    private final Method f69996c;

    public j(Method method, Method method2, Method method3) {
        this.f69994a = method;
        this.f69995b = method2;
        this.f69996c = method3;
    }

    public final Object a() {
        Intrinsics.checkNotNullParameter("response.body().close()", "closer");
        Method method = this.f69994a;
        if (method != null) {
            try {
                Object invoke = method.invoke(null, new Object[0]);
                Method method2 = this.f69995b;
                Intrinsics.f(method2);
                method2.invoke(invoke, "response.body().close()");
                return invoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final boolean b(Object obj) {
        if (obj != null) {
            try {
                Method method = this.f69996c;
                Intrinsics.f(method);
                method.invoke(obj, new Object[0]);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
