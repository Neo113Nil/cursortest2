package defpackage;

import com.facebook.ads.internal.dynamicloading.b;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class r02 implements InvocationHandler {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ r02(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        AtomicBoolean atomicBoolean;
        Method z;
        AtomicBoolean atomicBoolean2;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                try {
                    return Class.forName(method.getDeclaringClass().getName(), true, j0l.class.getClassLoader()).getDeclaredMethod(method.getName(), method.getParameterTypes()).invoke((j0l) obj2, objArr);
                } catch (InvocationTargetException e) {
                    throw e.getTargetException();
                } catch (ReflectiveOperationException e2) {
                    throw new RuntimeException("Reflection failed for method " + method, e2);
                }
            case 1:
                if (!"toString".equals(method.getName())) {
                    ((b) obj2).a = method;
                }
                return null;
            default:
                Set set = cw3.a;
                if (!set.contains(this)) {
                    try {
                        obj.getClass();
                        method.getClass();
                        if (Intrinsics.c(method.getName(), "onBillingSetupFinished")) {
                            Object F = objArr != null ? ph0.F(0, objArr) : null;
                            Class x = qx9.x("com.android.billingclient.api.BillingResult");
                            if (x != null && (z = qx9.z(x, "getResponseCode", new Class[0])) != null && Intrinsics.c(qx9.B(x, F, z, new Object[0]), 0)) {
                                dti dtiVar = gx9.l;
                                if (!set.contains(gx9.class)) {
                                    try {
                                        atomicBoolean2 = gx9.n;
                                    } catch (Throwable th) {
                                        cw3.a(gx9.class, th);
                                    }
                                    atomicBoolean2.set(true);
                                    ((Runnable) obj2).run();
                                }
                                atomicBoolean2 = null;
                                atomicBoolean2.set(true);
                                ((Runnable) obj2).run();
                            }
                        } else {
                            String name = method.getName();
                            name.getClass();
                            if (c.n(name, "onBillingServiceDisconnected", false)) {
                                dti dtiVar2 = gx9.l;
                                if (!set.contains(gx9.class)) {
                                    try {
                                        atomicBoolean = gx9.n;
                                    } catch (Throwable th2) {
                                        cw3.a(gx9.class, th2);
                                    }
                                    atomicBoolean.set(false);
                                }
                                atomicBoolean = null;
                                atomicBoolean.set(false);
                            }
                        }
                    } catch (Throwable th3) {
                        cw3.a(this, th3);
                    }
                    cw3.a(this, th3);
                }
                return null;
        }
    }
}
