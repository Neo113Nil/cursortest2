package X0;

import androidx.lifecycle.Q;
import androidx.lifecycle.U;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* loaded from: classes.dex */
public abstract class e {
    public static final Q a(U.c factory, KClass modelClass, a extras) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        try {
            try {
                return factory.create(modelClass, extras);
            } catch (AbstractMethodError unused) {
                return factory.create(JvmClassMappingKt.getJavaClass(modelClass));
            }
        } catch (AbstractMethodError unused2) {
            return factory.create(JvmClassMappingKt.getJavaClass(modelClass), extras);
        }
    }
}
