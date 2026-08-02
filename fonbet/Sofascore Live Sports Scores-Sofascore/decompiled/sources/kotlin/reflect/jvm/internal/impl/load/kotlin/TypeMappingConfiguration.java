package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public interface TypeMappingConfiguration<T> {
    @NotNull
    KotlinType commonSupertype(@NotNull Collection<KotlinType> collection);

    @Nullable
    String getPredefinedFullInternalNameForClass(@NotNull ClassDescriptor classDescriptor);

    @Nullable
    String getPredefinedInternalNameForClass(@NotNull ClassDescriptor classDescriptor);

    @Nullable
    T getPredefinedTypeForClass(@NotNull ClassDescriptor classDescriptor);

    @Nullable
    KotlinType preprocessType(@NotNull KotlinType kotlinType);

    void processErrorType(@NotNull KotlinType kotlinType, @NotNull ClassDescriptor classDescriptor);
}
