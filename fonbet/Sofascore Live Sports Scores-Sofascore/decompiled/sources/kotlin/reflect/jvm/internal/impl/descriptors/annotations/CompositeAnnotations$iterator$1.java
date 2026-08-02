package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import defpackage.oh0;
import defpackage.xka;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class CompositeAnnotations$iterator$1 extends xka implements Function1<Annotations, Sequence<? extends AnnotationDescriptor>> {
    public static final CompositeAnnotations$iterator$1 INSTANCE = new CompositeAnnotations$iterator$1();

    public CompositeAnnotations$iterator$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Sequence<AnnotationDescriptor> invoke(@NotNull Annotations annotations) {
        annotations.getClass();
        return new oh0(annotations, 1);
    }
}
