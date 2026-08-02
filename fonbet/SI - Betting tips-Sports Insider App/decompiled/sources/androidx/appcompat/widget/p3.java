package androidx.appcompat.widget;

import android.os.Build;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class p3 {

    /* renamed from: a, reason: collision with root package name */
    public Method f869a;

    /* renamed from: b, reason: collision with root package name */
    public Method f870b;

    /* renamed from: c, reason: collision with root package name */
    public Method f871c;

    public p3(Method method, Method method2, Method method3) {
        this.f869a = method;
        this.f870b = method2;
        this.f871c = method3;
    }

    public static void a() {
        if (Build.VERSION.SDK_INT >= 29) {
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
    }
}
