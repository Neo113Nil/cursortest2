package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class PossiblyInnerType {

    @NotNull
    private final List<TypeProjection> arguments;

    @NotNull
    private final ClassifierDescriptorWithTypeParameters classifierDescriptor;

    @Nullable
    private final PossiblyInnerType outerType;

    /* JADX WARN: Multi-variable type inference failed */
    public PossiblyInnerType(@NotNull ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters, @NotNull List<? extends TypeProjection> list, @Nullable PossiblyInnerType possiblyInnerType) {
        classifierDescriptorWithTypeParameters.getClass();
        list.getClass();
        this.classifierDescriptor = classifierDescriptorWithTypeParameters;
        this.arguments = list;
        this.outerType = possiblyInnerType;
    }

    @NotNull
    public final List<TypeProjection> getArguments() {
        return this.arguments;
    }

    @NotNull
    public final ClassifierDescriptorWithTypeParameters getClassifierDescriptor() {
        return this.classifierDescriptor;
    }

    @Nullable
    public final PossiblyInnerType getOuterType() {
        return this.outerType;
    }
}
