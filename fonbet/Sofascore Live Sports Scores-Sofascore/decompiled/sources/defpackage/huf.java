package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class huf extends vha {
    public final Method e = Class.class.getMethod("isRecord", null);
    public final Method f;
    public final Method g;
    public final Method h;

    public huf() {
        Method method = Class.class.getMethod("getRecordComponents", null);
        this.f = method;
        Class<?> componentType = method.getReturnType().getComponentType();
        this.g = componentType.getMethod("getName", null);
        this.h = componentType.getMethod("getType", null);
    }

    @Override // defpackage.vha
    public final boolean A(Class cls) {
        try {
            return ((Boolean) this.e.invoke(cls, null)).booleanValue();
        } catch (ReflectiveOperationException e) {
            vp2.e("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
            return false;
        }
    }

    @Override // defpackage.vha
    public final Method q(Class cls, Field field) {
        try {
            return cls.getMethod(field.getName(), null);
        } catch (ReflectiveOperationException e) {
            vp2.e("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
            return null;
        }
    }

    @Override // defpackage.vha
    public final Constructor r(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f.invoke(cls, null);
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                clsArr[i] = (Class) this.h.invoke(objArr[i], null);
            }
            return cls.getDeclaredConstructor(clsArr);
        } catch (ReflectiveOperationException e) {
            vp2.e("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
            return null;
        }
    }

    @Override // defpackage.vha
    public final String[] w(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f.invoke(cls, null);
            String[] strArr = new String[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                strArr[i] = (String) this.g.invoke(objArr[i], null);
            }
            return strArr;
        } catch (ReflectiveOperationException e) {
            vp2.e("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
            return null;
        }
    }
}
