package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class l1 extends c1 {

    /* renamed from: d, reason: collision with root package name */
    public static l1 f2200d;

    /* renamed from: e, reason: collision with root package name */
    public static final y8.d f2201e = new y8.d();

    /* renamed from: c, reason: collision with root package name */
    public final Application f2202c;

    public l1(Application application) {
        super(1);
        this.f2202c = application;
    }

    @Override // androidx.lifecycle.c1, androidx.lifecycle.m1
    public final k1 a(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Application application = this.f2202c;
        if (application != null) {
            return d(modelClass, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // androidx.lifecycle.c1, androidx.lifecycle.m1
    public final k1 c(Class modelClass, t1.e extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        if (this.f2202c != null) {
            return a(modelClass);
        }
        Application application = (Application) extras.a(f2201e);
        if (application != null) {
            return d(modelClass, application);
        }
        if (a.class.isAssignableFrom(modelClass)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return super.a(modelClass);
    }

    public final k1 d(Class cls, Application application) {
        if (!a.class.isAssignableFrom(cls)) {
            return super.a(cls);
        }
        try {
            k1 k1Var = (k1) cls.getConstructor(Application.class).newInstance(application);
            Intrinsics.checkNotNull(k1Var);
            return k1Var;
        } catch (IllegalAccessException e7) {
            throw new RuntimeException("Cannot create an instance of " + cls, e7);
        } catch (InstantiationException e9) {
            throw new RuntimeException("Cannot create an instance of " + cls, e9);
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException("Cannot create an instance of " + cls, e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException("Cannot create an instance of " + cls, e11);
        }
    }
}
