package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.ironsource.U3;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementUtilsKt;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class TypeSignatureMappingKt {
    @NotNull
    public static final <T> T boxTypeIfNeeded(@NotNull JvmTypeFactory<T> jvmTypeFactory, @NotNull T t, boolean z) {
        jvmTypeFactory.getClass();
        t.getClass();
        return z ? jvmTypeFactory.boxType(t) : t;
    }

    @Nullable
    public static final <T> T mapBuiltInType(@NotNull TypeSystemCommonBackendContext typeSystemCommonBackendContext, @NotNull KotlinTypeMarker kotlinTypeMarker, @NotNull JvmTypeFactory<T> jvmTypeFactory, @NotNull TypeMappingMode typeMappingMode) {
        List<JavaToKotlinClassMap.PlatformMutabilityMapping> mutabilityMappings;
        typeSystemCommonBackendContext.getClass();
        kotlinTypeMarker.getClass();
        jvmTypeFactory.getClass();
        typeMappingMode.getClass();
        TypeConstructorMarker typeConstructor = typeSystemCommonBackendContext.typeConstructor(kotlinTypeMarker);
        if (!typeSystemCommonBackendContext.isClassTypeConstructor(typeConstructor)) {
            return null;
        }
        PrimitiveType primitiveType = typeSystemCommonBackendContext.getPrimitiveType(typeConstructor);
        if (primitiveType != null) {
            return (T) boxTypeIfNeeded(jvmTypeFactory, jvmTypeFactory.createPrimitiveType(primitiveType), typeSystemCommonBackendContext.isNullableType(kotlinTypeMarker) || TypeEnhancementUtilsKt.hasEnhancedNullability(typeSystemCommonBackendContext, kotlinTypeMarker));
        }
        PrimitiveType primitiveArrayType = typeSystemCommonBackendContext.getPrimitiveArrayType(typeConstructor);
        if (primitiveArrayType != null) {
            return jvmTypeFactory.createFromString(U3.j.d + JvmPrimitiveType.get(primitiveArrayType).getDesc());
        }
        if (typeSystemCommonBackendContext.isUnderKotlinPackage(typeConstructor)) {
            FqNameUnsafe classFqNameUnsafe = typeSystemCommonBackendContext.getClassFqNameUnsafe(typeConstructor);
            ClassId mapKotlinToJava = classFqNameUnsafe != null ? JavaToKotlinClassMap.INSTANCE.mapKotlinToJava(classFqNameUnsafe) : null;
            if (mapKotlinToJava != null) {
                if (!typeMappingMode.getKotlinCollectionsToJavaCollections() && ((mutabilityMappings = JavaToKotlinClassMap.INSTANCE.getMutabilityMappings()) == null || !mutabilityMappings.isEmpty())) {
                    Iterator<T> it = mutabilityMappings.iterator();
                    while (it.hasNext()) {
                        if (Intrinsics.c(((JavaToKotlinClassMap.PlatformMutabilityMapping) it.next()).getJavaClass(), mapKotlinToJava)) {
                            return null;
                        }
                    }
                }
                String internalName = JvmClassName.byClassId(mapKotlinToJava).getInternalName();
                internalName.getClass();
                return jvmTypeFactory.createObjectType(internalName);
            }
        }
        return null;
    }
}
