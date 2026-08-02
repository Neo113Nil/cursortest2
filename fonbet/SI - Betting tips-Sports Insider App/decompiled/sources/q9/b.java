package q9;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import rh.g;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b extends g {

    /* renamed from: f, reason: collision with root package name */
    public final Method f22065f = Class.class.getMethod("isRecord", null);

    /* renamed from: g, reason: collision with root package name */
    public final Method f22066g = Class.class.getMethod("getRecordComponents", null);

    /* renamed from: h, reason: collision with root package name */
    public final Method f22067h;

    /* renamed from: i, reason: collision with root package name */
    public final Method f22068i;

    public b() {
        Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
        this.f22067h = cls.getMethod("getName", null);
        this.f22068i = cls.getMethod("getType", null);
    }

    @Override // rh.g
    public final boolean B(Class cls) {
        try {
            return ((Boolean) this.f22065f.invoke(cls, null)).booleanValue();
        } catch (ReflectiveOperationException e7) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e7);
        }
    }

    @Override // rh.g
    public final Method p(Class cls, Field field) {
        try {
            return cls.getMethod(field.getName(), null);
        } catch (ReflectiveOperationException e7) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e7);
        }
    }

    @Override // rh.g
    public final Constructor q(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f22066g.invoke(cls, null);
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i5 = 0; i5 < objArr.length; i5++) {
                clsArr[i5] = (Class) this.f22068i.invoke(objArr[i5], null);
            }
            return cls.getDeclaredConstructor(clsArr);
        } catch (ReflectiveOperationException e7) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e7);
        }
    }

    @Override // rh.g
    public final String[] t(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f22066g.invoke(cls, null);
            String[] strArr = new String[objArr.length];
            for (int i5 = 0; i5 < objArr.length; i5++) {
                strArr[i5] = (String) this.f22067h.invoke(objArr[i5], null);
            }
            return strArr;
        } catch (ReflectiveOperationException e7) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e7);
        }
    }
}
