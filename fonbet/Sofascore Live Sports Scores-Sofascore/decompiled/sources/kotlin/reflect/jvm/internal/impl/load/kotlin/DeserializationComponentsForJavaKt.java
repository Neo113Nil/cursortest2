package kotlin.reflect.jvm.internal.impl.load.kotlin;

import defpackage.km5;
import java.util.List;
import kotlin.collections.a;
import kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassesTracker;
import kotlin.reflect.jvm.internal.impl.load.java.JavaModuleAnnotationsProvider;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeEnhancementState;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaPropertyInitializerEvaluator;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache;
import kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverComponents;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverSettings;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ModuleClassResolver;
import kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElementFactory;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeEnhancement;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.resolve.sam.SamConversionResolverImpl;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.DefaultTypeAttributeTranslator;
import kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.extensions.TypeAttributeTranslators;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class DeserializationComponentsForJavaKt {
    @NotNull
    public static final DeserializationComponentsForJava makeDeserializationComponentsForJava(@NotNull ModuleDescriptor moduleDescriptor, @NotNull StorageManager storageManager, @NotNull NotFoundClasses notFoundClasses, @NotNull LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider, @NotNull KotlinClassFinder kotlinClassFinder, @NotNull DeserializedDescriptorResolver deserializedDescriptorResolver, @NotNull ErrorReporter errorReporter, @NotNull JvmMetadataVersion jvmMetadataVersion) {
        moduleDescriptor.getClass();
        storageManager.getClass();
        notFoundClasses.getClass();
        lazyJavaPackageFragmentProvider.getClass();
        kotlinClassFinder.getClass();
        deserializedDescriptorResolver.getClass();
        errorReporter.getClass();
        jvmMetadataVersion.getClass();
        return new DeserializationComponentsForJava(storageManager, moduleDescriptor, DeserializationConfiguration.Default.INSTANCE, new JavaClassDataFinder(kotlinClassFinder, deserializedDescriptorResolver), BinaryClassAnnotationAndConstantLoaderImplKt.createBinaryClassAnnotationAndConstantLoader(moduleDescriptor, notFoundClasses, storageManager, kotlinClassFinder, jvmMetadataVersion), lazyJavaPackageFragmentProvider, notFoundClasses, errorReporter, LookupTracker.DO_NOTHING.INSTANCE, ContractDeserializer.Companion.getDEFAULT(), NewKotlinTypeChecker.Companion.getDefault(), new TypeAttributeTranslators(a.c(DefaultTypeAttributeTranslator.INSTANCE)));
    }

    @NotNull
    public static final LazyJavaPackageFragmentProvider makeLazyJavaPackageFragmentProvider(@NotNull JavaClassFinder javaClassFinder, @NotNull ModuleDescriptor moduleDescriptor, @NotNull StorageManager storageManager, @NotNull NotFoundClasses notFoundClasses, @NotNull KotlinClassFinder kotlinClassFinder, @NotNull DeserializedDescriptorResolver deserializedDescriptorResolver, @NotNull ErrorReporter errorReporter, @NotNull JavaSourceElementFactory javaSourceElementFactory, @NotNull ModuleClassResolver moduleClassResolver, @NotNull PackagePartProvider packagePartProvider) {
        javaClassFinder.getClass();
        moduleDescriptor.getClass();
        storageManager.getClass();
        notFoundClasses.getClass();
        kotlinClassFinder.getClass();
        deserializedDescriptorResolver.getClass();
        errorReporter.getClass();
        javaSourceElementFactory.getClass();
        moduleClassResolver.getClass();
        packagePartProvider.getClass();
        SignaturePropagator signaturePropagator = SignaturePropagator.DO_NOTHING;
        signaturePropagator.getClass();
        JavaResolverCache javaResolverCache = JavaResolverCache.EMPTY;
        javaResolverCache.getClass();
        JavaPropertyInitializerEvaluator.DoNothing doNothing = JavaPropertyInitializerEvaluator.DoNothing.INSTANCE;
        SamConversionResolverImpl samConversionResolverImpl = new SamConversionResolverImpl(storageManager, km5.a);
        SupertypeLoopChecker.EMPTY empty = SupertypeLoopChecker.EMPTY.INSTANCE;
        LookupTracker.DO_NOTHING do_nothing = LookupTracker.DO_NOTHING.INSTANCE;
        ReflectionTypes reflectionTypes = new ReflectionTypes(moduleDescriptor, notFoundClasses);
        JavaTypeEnhancementState.Companion companion = JavaTypeEnhancementState.Companion;
        AnnotationTypeQualifierResolver annotationTypeQualifierResolver = new AnnotationTypeQualifierResolver(companion.getDEFAULT());
        JavaResolverSettings.Default r11 = JavaResolverSettings.Default.INSTANCE;
        return new LazyJavaPackageFragmentProvider(new JavaResolverComponents(storageManager, javaClassFinder, kotlinClassFinder, deserializedDescriptorResolver, signaturePropagator, errorReporter, javaResolverCache, doNothing, samConversionResolverImpl, javaSourceElementFactory, moduleClassResolver, packagePartProvider, empty, do_nothing, moduleDescriptor, reflectionTypes, annotationTypeQualifierResolver, new SignatureEnhancement(new JavaTypeEnhancement(r11)), JavaClassesTracker.Default.INSTANCE, r11, NewKotlinTypeChecker.Companion.getDefault(), companion.getDEFAULT(), new JavaModuleAnnotationsProvider() { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializationComponentsForJavaKt$makeLazyJavaPackageFragmentProvider$javaResolverComponents$1
            @Override // kotlin.reflect.jvm.internal.impl.load.java.JavaModuleAnnotationsProvider
            @Nullable
            public List<JavaAnnotation> getAnnotationsForModuleOwnerOfClass(@NotNull ClassId classId) {
                classId.getClass();
                return null;
            }
        }, null, 8388608, null));
    }
}
