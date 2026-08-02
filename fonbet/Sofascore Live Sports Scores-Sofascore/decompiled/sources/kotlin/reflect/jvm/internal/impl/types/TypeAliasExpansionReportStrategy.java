package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public interface TypeAliasExpansionReportStrategy {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class DO_NOTHING implements TypeAliasExpansionReportStrategy {

        @NotNull
        public static final DO_NOTHING INSTANCE = new DO_NOTHING();

        private DO_NOTHING() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeAliasExpansionReportStrategy
        public void boundsViolationInSubstitution(@NotNull TypeSubstitutor typeSubstitutor, @NotNull KotlinType kotlinType, @NotNull KotlinType kotlinType2, @NotNull TypeParameterDescriptor typeParameterDescriptor) {
            typeSubstitutor.getClass();
            kotlinType.getClass();
            kotlinType2.getClass();
            typeParameterDescriptor.getClass();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeAliasExpansionReportStrategy
        public void conflictingProjection(@NotNull TypeAliasDescriptor typeAliasDescriptor, @Nullable TypeParameterDescriptor typeParameterDescriptor, @NotNull KotlinType kotlinType) {
            typeAliasDescriptor.getClass();
            kotlinType.getClass();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeAliasExpansionReportStrategy
        public void recursiveTypeAlias(@NotNull TypeAliasDescriptor typeAliasDescriptor) {
            typeAliasDescriptor.getClass();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeAliasExpansionReportStrategy
        public void repeatedAnnotation(@NotNull AnnotationDescriptor annotationDescriptor) {
            annotationDescriptor.getClass();
        }
    }

    void boundsViolationInSubstitution(@NotNull TypeSubstitutor typeSubstitutor, @NotNull KotlinType kotlinType, @NotNull KotlinType kotlinType2, @NotNull TypeParameterDescriptor typeParameterDescriptor);

    void conflictingProjection(@NotNull TypeAliasDescriptor typeAliasDescriptor, @Nullable TypeParameterDescriptor typeParameterDescriptor, @NotNull KotlinType kotlinType);

    void recursiveTypeAlias(@NotNull TypeAliasDescriptor typeAliasDescriptor);

    void repeatedAnnotation(@NotNull AnnotationDescriptor annotationDescriptor);
}
