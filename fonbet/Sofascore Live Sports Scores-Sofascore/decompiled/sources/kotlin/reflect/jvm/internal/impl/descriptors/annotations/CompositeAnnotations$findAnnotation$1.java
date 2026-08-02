package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import defpackage.xka;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class CompositeAnnotations$findAnnotation$1 extends xka implements Function1<Annotations, AnnotationDescriptor> {
    final /* synthetic */ FqName $fqName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompositeAnnotations$findAnnotation$1(FqName fqName) {
        super(1);
        this.$fqName = fqName;
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final AnnotationDescriptor invoke(@NotNull Annotations annotations) {
        annotations.getClass();
        return annotations.mo887findAnnotation(this.$fqName);
    }
}
