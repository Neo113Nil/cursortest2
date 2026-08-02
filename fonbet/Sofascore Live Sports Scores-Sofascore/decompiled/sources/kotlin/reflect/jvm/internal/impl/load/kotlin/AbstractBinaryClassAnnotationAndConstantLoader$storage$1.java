package kotlin.reflect.jvm.internal.impl.load.kotlin;

import defpackage.xka;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Add missing generic type declarations: [A, C] */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class AbstractBinaryClassAnnotationAndConstantLoader$storage$1<A, C> extends xka implements Function1<KotlinJvmBinaryClass, AbstractBinaryClassAnnotationAndConstantLoader.AnnotationsContainerWithConstants<? extends A, ? extends C>> {
    final /* synthetic */ AbstractBinaryClassAnnotationAndConstantLoader<A, C> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractBinaryClassAnnotationAndConstantLoader$storage$1(AbstractBinaryClassAnnotationAndConstantLoader<A, C> abstractBinaryClassAnnotationAndConstantLoader) {
        super(1);
        this.this$0 = abstractBinaryClassAnnotationAndConstantLoader;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final AbstractBinaryClassAnnotationAndConstantLoader.AnnotationsContainerWithConstants<A, C> invoke(@NotNull KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        AbstractBinaryClassAnnotationAndConstantLoader.AnnotationsContainerWithConstants<A, C> loadAnnotationsAndInitializers;
        kotlinJvmBinaryClass.getClass();
        loadAnnotationsAndInitializers = this.this$0.loadAnnotationsAndInitializers(kotlinJvmBinaryClass);
        return loadAnnotationsAndInitializers;
    }
}
