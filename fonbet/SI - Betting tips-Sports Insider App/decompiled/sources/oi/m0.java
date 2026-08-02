package oi;

import android.os.Build;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class m0 extends a {
    @Override // oi.a
    public final Object d(Object obj, Method method, Object[] objArr) {
        if (Build.VERSION.SDK_INT >= 26) {
            return p.a(obj, method, objArr);
        }
        throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
    }

    @Override // oi.a
    public final boolean f(Method method) {
        return method.isDefault();
    }
}
