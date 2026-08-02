package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public interface ModuleDescriptor extends DeclarationDescriptor {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class DefaultImpls {
        @Nullable
        public static <R, D> R accept(@NotNull ModuleDescriptor moduleDescriptor, @NotNull DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
            declarationDescriptorVisitor.getClass();
            return declarationDescriptorVisitor.visitModuleDeclaration(moduleDescriptor, d);
        }

        @Nullable
        public static DeclarationDescriptor getContainingDeclaration(@NotNull ModuleDescriptor moduleDescriptor) {
            return null;
        }
    }

    @NotNull
    KotlinBuiltIns getBuiltIns();

    @Nullable
    <T> T getCapability(@NotNull ModuleCapability<T> moduleCapability);

    @NotNull
    List<ModuleDescriptor> getExpectedByModules();

    @NotNull
    PackageViewDescriptor getPackage(@NotNull FqName fqName);

    @NotNull
    Collection<FqName> getSubPackagesOf(@NotNull FqName fqName, @NotNull Function1<? super Name, Boolean> function1);

    boolean shouldSeeInternalsOf(@NotNull ModuleDescriptor moduleDescriptor);
}
