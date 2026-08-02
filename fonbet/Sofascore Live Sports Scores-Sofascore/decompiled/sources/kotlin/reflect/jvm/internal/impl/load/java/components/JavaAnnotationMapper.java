package kotlin.reflect.jvm.internal.impl.load.java.components;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.ironsource.U3;
import defpackage.tub;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class JavaAnnotationMapper {

    @NotNull
    private static final Name DEPRECATED_ANNOTATION_MESSAGE;

    @NotNull
    public static final JavaAnnotationMapper INSTANCE = new JavaAnnotationMapper();

    @NotNull
    private static final Name RETENTION_ANNOTATION_VALUE;

    @NotNull
    private static final Name TARGET_ANNOTATION_ALLOWED_TARGETS;

    @NotNull
    private static final Map<FqName, FqName> kotlinToJavaNameMap;

    static {
        Name identifier = Name.identifier(PglCryptUtils.KEY_MESSAGE);
        identifier.getClass();
        DEPRECATED_ANNOTATION_MESSAGE = identifier;
        Name identifier2 = Name.identifier("allowedTargets");
        identifier2.getClass();
        TARGET_ANNOTATION_ALLOWED_TARGETS = identifier2;
        Name identifier3 = Name.identifier(U3.i.X);
        identifier3.getClass();
        RETENTION_ANNOTATION_VALUE = identifier3;
        kotlinToJavaNameMap = tub.h(new Pair(StandardNames.FqNames.target, JvmAnnotationNames.TARGET_ANNOTATION), new Pair(StandardNames.FqNames.retention, JvmAnnotationNames.RETENTION_ANNOTATION), new Pair(StandardNames.FqNames.mustBeDocumented, JvmAnnotationNames.DOCUMENTED_ANNOTATION));
    }

    private JavaAnnotationMapper() {
    }

    public static /* synthetic */ AnnotationDescriptor mapOrResolveJavaAnnotation$default(JavaAnnotationMapper javaAnnotationMapper, JavaAnnotation javaAnnotation, LazyJavaResolverContext lazyJavaResolverContext, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return javaAnnotationMapper.mapOrResolveJavaAnnotation(javaAnnotation, lazyJavaResolverContext, z);
    }

    @Nullable
    public final AnnotationDescriptor findMappedJavaAnnotation(@NotNull FqName fqName, @NotNull JavaAnnotationOwner javaAnnotationOwner, @NotNull LazyJavaResolverContext lazyJavaResolverContext) {
        JavaAnnotation findAnnotation;
        fqName.getClass();
        javaAnnotationOwner.getClass();
        lazyJavaResolverContext.getClass();
        if (fqName.equals(StandardNames.FqNames.deprecated)) {
            FqName fqName2 = JvmAnnotationNames.DEPRECATED_ANNOTATION;
            fqName2.getClass();
            JavaAnnotation findAnnotation2 = javaAnnotationOwner.findAnnotation(fqName2);
            if (findAnnotation2 != null || javaAnnotationOwner.isDeprecatedInJavaDoc()) {
                return new JavaDeprecatedAnnotationDescriptor(findAnnotation2, lazyJavaResolverContext);
            }
        }
        FqName fqName3 = kotlinToJavaNameMap.get(fqName);
        if (fqName3 == null || (findAnnotation = javaAnnotationOwner.findAnnotation(fqName3)) == null) {
            return null;
        }
        return mapOrResolveJavaAnnotation$default(INSTANCE, findAnnotation, lazyJavaResolverContext, false, 4, null);
    }

    @NotNull
    public final Name getDEPRECATED_ANNOTATION_MESSAGE$descriptors_jvm() {
        return DEPRECATED_ANNOTATION_MESSAGE;
    }

    @NotNull
    public final Name getRETENTION_ANNOTATION_VALUE$descriptors_jvm() {
        return RETENTION_ANNOTATION_VALUE;
    }

    @NotNull
    public final Name getTARGET_ANNOTATION_ALLOWED_TARGETS$descriptors_jvm() {
        return TARGET_ANNOTATION_ALLOWED_TARGETS;
    }

    @Nullable
    public final AnnotationDescriptor mapOrResolveJavaAnnotation(@NotNull JavaAnnotation javaAnnotation, @NotNull LazyJavaResolverContext lazyJavaResolverContext, boolean z) {
        javaAnnotation.getClass();
        lazyJavaResolverContext.getClass();
        ClassId classId = javaAnnotation.getClassId();
        if (Intrinsics.c(classId, ClassId.topLevel(JvmAnnotationNames.TARGET_ANNOTATION))) {
            return new JavaTargetAnnotationDescriptor(javaAnnotation, lazyJavaResolverContext);
        }
        if (Intrinsics.c(classId, ClassId.topLevel(JvmAnnotationNames.RETENTION_ANNOTATION))) {
            return new JavaRetentionAnnotationDescriptor(javaAnnotation, lazyJavaResolverContext);
        }
        if (Intrinsics.c(classId, ClassId.topLevel(JvmAnnotationNames.DOCUMENTED_ANNOTATION))) {
            return new JavaAnnotationDescriptor(lazyJavaResolverContext, javaAnnotation, StandardNames.FqNames.mustBeDocumented);
        }
        if (Intrinsics.c(classId, ClassId.topLevel(JvmAnnotationNames.DEPRECATED_ANNOTATION))) {
            return null;
        }
        return new LazyJavaAnnotationDescriptor(lazyJavaResolverContext, javaAnnotation, z);
    }
}
