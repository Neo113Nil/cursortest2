package kotlin.reflect.jvm.internal.impl.descriptors.deserialization;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public interface ClassDescriptorFactory {
    @Nullable
    ClassDescriptor createClass(@NotNull ClassId classId);

    @NotNull
    Collection<ClassDescriptor> getAllContributedClassesIfPossible(@NotNull FqName fqName);

    boolean shouldCreateClass(@NotNull FqName fqName, @NotNull Name name);
}
