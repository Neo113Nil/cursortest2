package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class c1 implements m1 {

    /* renamed from: b, reason: collision with root package name */
    public static c1 f2145b;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2146a;

    public /* synthetic */ c1(int i5) {
        this.f2146a = i5;
    }

    @Override // androidx.lifecycle.m1
    public k1 a(Class modelClass) {
        switch (this.f2146a) {
            case 0:
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
            case 1:
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                try {
                    Constructor declaredConstructor = modelClass.getDeclaredConstructor(null);
                    if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                        throw new RuntimeException("Cannot create an instance of " + modelClass);
                    }
                    try {
                        Object newInstance = declaredConstructor.newInstance(null);
                        Intrinsics.checkNotNull(newInstance);
                        return (k1) newInstance;
                    } catch (IllegalAccessException e7) {
                        throw new RuntimeException("Cannot create an instance of " + modelClass, e7);
                    } catch (InstantiationException e9) {
                        throw new RuntimeException("Cannot create an instance of " + modelClass, e9);
                    }
                } catch (NoSuchMethodException e10) {
                    throw new RuntimeException("Cannot create an instance of " + modelClass, e10);
                }
            default:
                return new v1.d();
        }
    }

    @Override // androidx.lifecycle.m1
    public final k1 b(ag.c modelClass, t1.e extras) {
        switch (this.f2146a) {
            case 0:
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                Intrinsics.checkNotNullParameter(extras, "extras");
                return new f1();
            case 1:
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                Intrinsics.checkNotNullParameter(extras, "extras");
                return c(u6.h.k(modelClass), extras);
            default:
                return androidx.appcompat.widget.c1.a(this, modelClass, extras);
        }
    }

    @Override // androidx.lifecycle.m1
    public k1 c(Class modelClass, t1.e extras) {
        switch (this.f2146a) {
            case 0:
                return androidx.appcompat.widget.c1.b(this, modelClass, extras);
            case 1:
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                Intrinsics.checkNotNullParameter(extras, "extras");
                return a(modelClass);
            default:
                return androidx.appcompat.widget.c1.b(this, modelClass, extras);
        }
    }
}
