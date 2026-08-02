package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
final class TypeArgument {

    @NotNull
    private final KotlinType inProjection;

    @NotNull
    private final KotlinType outProjection;

    @NotNull
    private final TypeParameterDescriptor typeParameter;

    public TypeArgument(@NotNull TypeParameterDescriptor typeParameterDescriptor, @NotNull KotlinType kotlinType, @NotNull KotlinType kotlinType2) {
        typeParameterDescriptor.getClass();
        kotlinType.getClass();
        kotlinType2.getClass();
        this.typeParameter = typeParameterDescriptor;
        this.inProjection = kotlinType;
        this.outProjection = kotlinType2;
    }

    @NotNull
    public final KotlinType getInProjection() {
        return this.inProjection;
    }

    @NotNull
    public final KotlinType getOutProjection() {
        return this.outProjection;
    }

    @NotNull
    public final TypeParameterDescriptor getTypeParameter() {
        return this.typeParameter;
    }

    public final boolean isConsistent() {
        return KotlinTypeChecker.DEFAULT.isSubtypeOf(this.inProjection, this.outProjection);
    }
}
