package defpackage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.AccessControlException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class y6k implements InvocationHandler {
    public static final awf b;
    public final x6k a;

    static {
        b10 d = lv9.d();
        for (Method method : x6k.class.getMethods()) {
            if (method.getDeclaringClass().equals(x6k.class)) {
                try {
                    method.setAccessible(true);
                } catch (AccessControlException unused) {
                }
                d.A(method.getName(), method);
            }
        }
        b = d.c(false);
    }

    public y6k(x6k x6kVar) {
        this.a = x6kVar;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        String name = method.getName();
        Method method2 = (Method) b.get(name);
        if (method2 == null) {
            a70.m(name);
            return null;
        }
        try {
            return method2.invoke(this.a, objArr);
        } catch (InvocationTargetException e) {
            throw e.getCause();
        }
    }
}
