package b9;

import androidx.appcompat.widget.c1;
import com.google.firebase.components.ComponentRegistrar;
import io.sentry.android.core.w0;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements a9.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3095a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3096b;

    public /* synthetic */ b(int i5, Object obj) {
        this.f3095a = i5;
        this.f3096b = obj;
    }

    @Override // a9.a
    public final Object get() {
        switch (this.f3095a) {
            case 0:
                return new c9.c((h8.g) this.f3096b);
            case 1:
                String str = (String) this.f3096b;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new o8.k("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    w0.m("ComponentDiscovery", "Class " + str + " is not an found.");
                    return null;
                } catch (IllegalAccessException e7) {
                    throw new o8.k(c1.n("Could not instantiate ", str, "."), e7);
                } catch (InstantiationException e9) {
                    throw new o8.k(c1.n("Could not instantiate ", str, "."), e9);
                } catch (NoSuchMethodException e10) {
                    throw new o8.k(c1.m("Could not instantiate ", str), e10);
                } catch (InvocationTargetException e11) {
                    throw new o8.k(c1.m("Could not instantiate ", str), e11);
                }
            default:
                return (ComponentRegistrar) this.f3096b;
        }
    }
}
