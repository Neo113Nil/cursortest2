package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.name.StandardClassIds;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
final class CliStdlibClassFinderImpl implements StdlibClassFinder {

    @NotNull
    public static final CliStdlibClassFinderImpl INSTANCE = new CliStdlibClassFinderImpl();

    private CliStdlibClassFinderImpl() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.StdlibClassFinder
    @Nullable
    public ClassDescriptor findEnumEntriesClass(@NotNull ModuleDescriptor moduleDescriptor) {
        moduleDescriptor.getClass();
        return FindClassInModuleKt.findClassAcrossModuleDependencies(moduleDescriptor, StandardClassIds.INSTANCE.getEnumEntries());
    }
}
