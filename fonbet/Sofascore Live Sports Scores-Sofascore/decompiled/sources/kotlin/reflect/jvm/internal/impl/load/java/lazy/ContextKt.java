package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import defpackage.joa;
import defpackage.ypa;
import defpackage.ysa;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassOrPackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ContextKt {
    private static final LazyJavaResolverContext child(LazyJavaResolverContext lazyJavaResolverContext, DeclarationDescriptor declarationDescriptor, JavaTypeParameterListOwner javaTypeParameterListOwner, int i, joa joaVar) {
        return new LazyJavaResolverContext(lazyJavaResolverContext.getComponents(), javaTypeParameterListOwner != null ? new LazyJavaTypeParameterResolver(lazyJavaResolverContext, declarationDescriptor, javaTypeParameterListOwner, i) : lazyJavaResolverContext.getTypeParameterResolver(), joaVar);
    }

    @NotNull
    public static final LazyJavaResolverContext childForClassOrPackage(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull ClassOrPackageFragmentDescriptor classOrPackageFragmentDescriptor, @Nullable JavaTypeParameterListOwner javaTypeParameterListOwner, int i) {
        lazyJavaResolverContext.getClass();
        classOrPackageFragmentDescriptor.getClass();
        return child(lazyJavaResolverContext, classOrPackageFragmentDescriptor, javaTypeParameterListOwner, i, ypa.a(ysa.c, new ContextKt$childForClassOrPackage$1(lazyJavaResolverContext, classOrPackageFragmentDescriptor)));
    }

    public static /* synthetic */ LazyJavaResolverContext childForClassOrPackage$default(LazyJavaResolverContext lazyJavaResolverContext, ClassOrPackageFragmentDescriptor classOrPackageFragmentDescriptor, JavaTypeParameterListOwner javaTypeParameterListOwner, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            javaTypeParameterListOwner = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return childForClassOrPackage(lazyJavaResolverContext, classOrPackageFragmentDescriptor, javaTypeParameterListOwner, i);
    }

    @NotNull
    public static final LazyJavaResolverContext childForMethod(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull DeclarationDescriptor declarationDescriptor, @NotNull JavaTypeParameterListOwner javaTypeParameterListOwner, int i) {
        lazyJavaResolverContext.getClass();
        declarationDescriptor.getClass();
        javaTypeParameterListOwner.getClass();
        return child(lazyJavaResolverContext, declarationDescriptor, javaTypeParameterListOwner, i, lazyJavaResolverContext.getDelegateForDefaultTypeQualifiers$descriptors_jvm());
    }

    public static /* synthetic */ LazyJavaResolverContext childForMethod$default(LazyJavaResolverContext lazyJavaResolverContext, DeclarationDescriptor declarationDescriptor, JavaTypeParameterListOwner javaTypeParameterListOwner, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return childForMethod(lazyJavaResolverContext, declarationDescriptor, javaTypeParameterListOwner, i);
    }

    @Nullable
    public static final JavaTypeQualifiersByElementType computeNewDefaultTypeQualifiers(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull Annotations annotations) {
        lazyJavaResolverContext.getClass();
        annotations.getClass();
        return lazyJavaResolverContext.getComponents().getAnnotationTypeQualifierResolver().extractAndMergeDefaultQualifiers(lazyJavaResolverContext.getDefaultTypeQualifiers(), annotations);
    }

    @NotNull
    public static final LazyJavaResolverContext copyWithNewDefaultTypeQualifiers(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull Annotations annotations) {
        lazyJavaResolverContext.getClass();
        annotations.getClass();
        return annotations.isEmpty() ? lazyJavaResolverContext : new LazyJavaResolverContext(lazyJavaResolverContext.getComponents(), lazyJavaResolverContext.getTypeParameterResolver(), ypa.a(ysa.c, new ContextKt$copyWithNewDefaultTypeQualifiers$1(lazyJavaResolverContext, annotations)));
    }

    @NotNull
    public static final LazyJavaResolverContext replaceComponents(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull JavaResolverComponents javaResolverComponents) {
        lazyJavaResolverContext.getClass();
        javaResolverComponents.getClass();
        return new LazyJavaResolverContext(javaResolverComponents, lazyJavaResolverContext.getTypeParameterResolver(), lazyJavaResolverContext.getDelegateForDefaultTypeQualifiers$descriptors_jvm());
    }

    @NotNull
    public static final LazyJavaResolverContext child(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull TypeParameterResolver typeParameterResolver) {
        lazyJavaResolverContext.getClass();
        typeParameterResolver.getClass();
        return new LazyJavaResolverContext(lazyJavaResolverContext.getComponents(), typeParameterResolver, lazyJavaResolverContext.getDelegateForDefaultTypeQualifiers$descriptors_jvm());
    }
}
