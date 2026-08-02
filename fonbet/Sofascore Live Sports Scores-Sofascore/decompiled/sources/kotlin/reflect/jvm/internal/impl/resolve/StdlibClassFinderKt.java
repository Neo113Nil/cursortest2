package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.reflect.jvm.internal.impl.descriptors.ModuleCapability;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class StdlibClassFinderKt {

    @NotNull
    private static final ModuleCapability<StdlibClassFinder> STDLIB_CLASS_FINDER_CAPABILITY = new ModuleCapability<>("StdlibClassFinder");

    @NotNull
    public static final StdlibClassFinder getStdlibClassFinder(@NotNull ModuleDescriptor moduleDescriptor) {
        moduleDescriptor.getClass();
        StdlibClassFinder stdlibClassFinder = (StdlibClassFinder) moduleDescriptor.getCapability(STDLIB_CLASS_FINDER_CAPABILITY);
        return stdlibClassFinder == null ? CliStdlibClassFinderImpl.INSTANCE : stdlibClassFinder;
    }
}
