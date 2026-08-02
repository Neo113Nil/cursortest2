package expo.modules.kotlin.allocators;

import androidx.exifinterface.media.ExifInterface;
import java.lang.reflect.Constructor;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlin.reflect.KParameter;

/* compiled from: ObjectConstructorFactory.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\b\b\u0000\u0010\u0006*\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\bJ$\u0010\t\u001a\n\u0012\u0004\u0012\u0002H\u0006\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\nH\u0002J(\u0010\u000b\u001a\n\u0012\u0004\u0012\u0002H\u0006\u0018\u00010\u0005\"\b\b\u0000\u0010\u0006*\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\bH\u0002J\"\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0000\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\nH\u0002¨\u0006\r"}, d2 = {"Lexpo/modules/kotlin/allocators/ObjectConstructorFactory;", "", "<init>", "()V", "get", "Lexpo/modules/kotlin/allocators/ObjectConstructor;", ExifInterface.GPS_DIRECTION_TRUE, "clazz", "Lkotlin/reflect/KClass;", "tryToUseDefaultConstructor", "Ljava/lang/Class;", "tryToUseDefaultKotlinConstructor", "useUnsafeAllocator", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ObjectConstructorFactory {
    public final <T> ObjectConstructor<T> get(KClass<T> clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        ObjectConstructor<T> tryToUseDefaultConstructor = tryToUseDefaultConstructor(JvmClassMappingKt.getJavaClass((KClass) clazz));
        return (tryToUseDefaultConstructor == null && (tryToUseDefaultConstructor = tryToUseDefaultKotlinConstructor(clazz)) == null) ? useUnsafeAllocator(JvmClassMappingKt.getJavaClass((KClass) clazz)) : tryToUseDefaultConstructor;
    }

    private final <T> ObjectConstructor<T> tryToUseDefaultConstructor(Class<T> clazz) {
        try {
            final Constructor<T> declaredConstructor = clazz.getDeclaredConstructor(null);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return new ObjectConstructor() { // from class: expo.modules.kotlin.allocators.ObjectConstructorFactory$$ExternalSyntheticLambda1
                @Override // expo.modules.kotlin.allocators.ObjectConstructor
                public final Object construct() {
                    Object tryToUseDefaultConstructor$lambda$0;
                    tryToUseDefaultConstructor$lambda$0 = ObjectConstructorFactory.tryToUseDefaultConstructor$lambda$0(declaredConstructor);
                    return tryToUseDefaultConstructor$lambda$0;
                }
            };
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object tryToUseDefaultConstructor$lambda$0(Constructor constructor) {
        return constructor.newInstance(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004b, code lost:
    
        if (r1 == false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final <T> ObjectConstructor<T> tryToUseDefaultKotlinConstructor(KClass<T> clazz) {
        Iterator<T> it = clazz.getConstructors().iterator();
        boolean z = false;
        T t = null;
        while (true) {
            if (it.hasNext()) {
                T next = it.next();
                List<KParameter> parameters = ((KFunction) next).getParameters();
                if (!(parameters instanceof Collection) || !parameters.isEmpty()) {
                    Iterator<T> it2 = parameters.iterator();
                    while (it2.hasNext()) {
                        if (!((KParameter) it2.next()).isOptional()) {
                            break;
                        }
                    }
                }
                if (z) {
                    break;
                }
                z = true;
                t = next;
            }
        }
        final KFunction kFunction = (KFunction) t;
        if (kFunction == null) {
            return null;
        }
        return new ObjectConstructor() { // from class: expo.modules.kotlin.allocators.ObjectConstructorFactory$$ExternalSyntheticLambda2
            @Override // expo.modules.kotlin.allocators.ObjectConstructor
            public final Object construct() {
                Object tryToUseDefaultKotlinConstructor$lambda$2;
                tryToUseDefaultKotlinConstructor$lambda$2 = ObjectConstructorFactory.tryToUseDefaultKotlinConstructor$lambda$2(KFunction.this);
                return tryToUseDefaultKotlinConstructor$lambda$2;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object tryToUseDefaultKotlinConstructor$lambda$2(KFunction kFunction) {
        return kFunction.callBy(MapsKt.emptyMap());
    }

    private final <T> ObjectConstructor<T> useUnsafeAllocator(Class<T> clazz) {
        final UnsafeAllocator<T> createAllocator = UnsafeAllocator.INSTANCE.createAllocator(clazz);
        return new ObjectConstructor() { // from class: expo.modules.kotlin.allocators.ObjectConstructorFactory$$ExternalSyntheticLambda0
            @Override // expo.modules.kotlin.allocators.ObjectConstructor
            public final Object construct() {
                Object newInstance;
                newInstance = UnsafeAllocator.this.newInstance();
                return newInstance;
            }
        };
    }
}
