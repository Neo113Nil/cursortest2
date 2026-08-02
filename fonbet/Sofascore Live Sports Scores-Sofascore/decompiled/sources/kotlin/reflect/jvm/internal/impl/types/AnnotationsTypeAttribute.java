package kotlin.reflect.jvm.internal.impl.types;

import defpackage.duf;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class AnnotationsTypeAttribute extends TypeAttribute<AnnotationsTypeAttribute> {

    @NotNull
    private final Annotations annotations;

    public AnnotationsTypeAttribute(@NotNull Annotations annotations) {
        annotations.getClass();
        this.annotations = annotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeAttribute
    @NotNull
    public AnnotationsTypeAttribute add(@Nullable AnnotationsTypeAttribute annotationsTypeAttribute) {
        return annotationsTypeAttribute == null ? this : new AnnotationsTypeAttribute(AnnotationsKt.composeAnnotations(this.annotations, annotationsTypeAttribute.annotations));
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof AnnotationsTypeAttribute) {
            return Intrinsics.c(((AnnotationsTypeAttribute) obj).annotations, this.annotations);
        }
        return false;
    }

    @NotNull
    public final Annotations getAnnotations() {
        return this.annotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeAttribute
    @NotNull
    public KClass<? extends AnnotationsTypeAttribute> getKey() {
        return duf.a.getOrCreateKotlinClass(AnnotationsTypeAttribute.class);
    }

    public int hashCode() {
        return this.annotations.hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeAttribute
    @Nullable
    public AnnotationsTypeAttribute intersect(@Nullable AnnotationsTypeAttribute annotationsTypeAttribute) {
        if (Intrinsics.c(annotationsTypeAttribute, this)) {
            return this;
        }
        return null;
    }
}
