package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class AnnotationsKt {
    @NotNull
    public static final Annotations composeAnnotations(@NotNull Annotations annotations, @NotNull Annotations annotations2) {
        annotations.getClass();
        annotations2.getClass();
        return annotations.isEmpty() ? annotations2 : annotations2.isEmpty() ? annotations : new CompositeAnnotations(annotations, annotations2);
    }
}
