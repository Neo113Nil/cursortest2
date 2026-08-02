package oi;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static Constructor f21284a;

    public static Object a(Object obj, Method method, Object[] objArr) {
        Constructor constructor = f21284a;
        if (constructor == null) {
            constructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
            constructor.setAccessible(true);
            f21284a = constructor;
        }
        return ((MethodHandles.Lookup) constructor.newInstance(r3.c.class, -1)).unreflectSpecial(method, r3.c.class).bindTo(obj).invokeWithArguments(objArr);
    }
}
