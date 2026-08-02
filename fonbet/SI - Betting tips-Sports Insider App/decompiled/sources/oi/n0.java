package oi;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class n0 extends a {
    @Override // oi.a
    public final String c(int i5, Method method) {
        Parameter parameter = method.getParameters()[i5];
        if (!parameter.isNamePresent()) {
            return super.c(i5, method);
        }
        return "parameter '" + parameter.getName() + '\'';
    }

    @Override // oi.a
    public final Object d(Object obj, Method method, Object[] objArr) {
        return p.a(obj, method, objArr);
    }

    @Override // oi.a
    public final boolean f(Method method) {
        return method.isDefault();
    }
}
