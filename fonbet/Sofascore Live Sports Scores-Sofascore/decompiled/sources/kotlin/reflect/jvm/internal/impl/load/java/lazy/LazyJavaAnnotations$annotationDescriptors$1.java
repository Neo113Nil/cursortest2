package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import defpackage.xka;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationMapper;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class LazyJavaAnnotations$annotationDescriptors$1 extends xka implements Function1<JavaAnnotation, AnnotationDescriptor> {
    final /* synthetic */ LazyJavaAnnotations this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaAnnotations$annotationDescriptors$1(LazyJavaAnnotations lazyJavaAnnotations) {
        super(1);
        this.this$0 = lazyJavaAnnotations;
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final AnnotationDescriptor invoke(@NotNull JavaAnnotation javaAnnotation) {
        LazyJavaResolverContext lazyJavaResolverContext;
        boolean z;
        javaAnnotation.getClass();
        JavaAnnotationMapper javaAnnotationMapper = JavaAnnotationMapper.INSTANCE;
        lazyJavaResolverContext = this.this$0.c;
        z = this.this$0.areAnnotationsFreshlySupported;
        return javaAnnotationMapper.mapOrResolveJavaAnnotation(javaAnnotation, lazyJavaResolverContext, z);
    }
}
