package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import defpackage.a70;
import defpackage.is8;
import defpackage.joa;
import defpackage.km5;
import defpackage.lm5;
import defpackage.mz1;
import defpackage.ph0;
import defpackage.rm5;
import defpackage.ypa;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.InvalidModuleExceptionKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleCapability;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageViewDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.platform.TargetPlatform;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ModuleDescriptorImpl extends DeclarationDescriptorImpl implements ModuleDescriptor {

    @NotNull
    private final KotlinBuiltIns builtIns;

    @NotNull
    private final Map<ModuleCapability<?>, Object> capabilities;

    @Nullable
    private ModuleDependencies dependencies;
    private boolean isValid;

    @Nullable
    private PackageFragmentProvider packageFragmentProviderForModuleContent;

    @NotNull
    private final joa packageFragmentProviderForWholeModuleWithDependencies$delegate;

    @NotNull
    private final PackageViewDescriptorFactory packageViewDescriptorFactory;

    @NotNull
    private final MemoizedFunctionToNotNull<FqName, PackageViewDescriptor> packages;

    @Nullable
    private final TargetPlatform platform;

    @Nullable
    private final Name stableName;

    @NotNull
    private final StorageManager storageManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModuleDescriptorImpl(@NotNull Name name, @NotNull StorageManager storageManager, @NotNull KotlinBuiltIns kotlinBuiltIns, @Nullable TargetPlatform targetPlatform, @NotNull Map<ModuleCapability<?>, ? extends Object> map, @Nullable Name name2) {
        super(Annotations.Companion.getEMPTY(), name);
        name.getClass();
        storageManager.getClass();
        kotlinBuiltIns.getClass();
        map.getClass();
        this.storageManager = storageManager;
        this.builtIns = kotlinBuiltIns;
        this.platform = targetPlatform;
        this.stableName = name2;
        if (!name.isSpecial()) {
            is8.c(name, "Module name must be special: ");
            throw null;
        }
        this.capabilities = map;
        PackageViewDescriptorFactory packageViewDescriptorFactory = (PackageViewDescriptorFactory) getCapability(PackageViewDescriptorFactory.Companion.getCAPABILITY());
        this.packageViewDescriptorFactory = packageViewDescriptorFactory == null ? PackageViewDescriptorFactory.Default.INSTANCE : packageViewDescriptorFactory;
        this.isValid = true;
        this.packages = storageManager.createMemoizedFunction(new ModuleDescriptorImpl$packages$1(this));
        this.packageFragmentProviderForWholeModuleWithDependencies$delegate = ypa.b(new ModuleDescriptorImpl$packageFragmentProviderForWholeModuleWithDependencies$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getId() {
        String name = getName().toString();
        name.getClass();
        return name;
    }

    private final CompositePackageFragmentProvider getPackageFragmentProviderForWholeModuleWithDependencies() {
        return (CompositePackageFragmentProvider) this.packageFragmentProviderForWholeModuleWithDependencies$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isInitialized() {
        return this.packageFragmentProviderForModuleContent != null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @Nullable
    public <R, D> R accept(@NotNull DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        return (R) ModuleDescriptor.DefaultImpls.accept(this, declarationDescriptorVisitor, d);
    }

    public void assertValid() {
        if (isValid()) {
            return;
        }
        InvalidModuleExceptionKt.moduleInvalidated(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    @NotNull
    public KotlinBuiltIns getBuiltIns() {
        return this.builtIns;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    @Nullable
    public <T> T getCapability(@NotNull ModuleCapability<T> moduleCapability) {
        moduleCapability.getClass();
        T t = (T) this.capabilities.get(moduleCapability);
        if (t == null) {
            return null;
        }
        return t;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @Nullable
    public DeclarationDescriptor getContainingDeclaration() {
        return ModuleDescriptor.DefaultImpls.getContainingDeclaration(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    @NotNull
    public List<ModuleDescriptor> getExpectedByModules() {
        ModuleDependencies moduleDependencies = this.dependencies;
        if (moduleDependencies != null) {
            return moduleDependencies.getDirectExpectedByDependencies();
        }
        a70.j(mz1.o(new StringBuilder("Dependencies of module "), getId(), " were not set"));
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    @NotNull
    public PackageViewDescriptor getPackage(@NotNull FqName fqName) {
        fqName.getClass();
        assertValid();
        return (PackageViewDescriptor) this.packages.invoke(fqName);
    }

    @NotNull
    public final PackageFragmentProvider getPackageFragmentProvider() {
        assertValid();
        return getPackageFragmentProviderForWholeModuleWithDependencies();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    @NotNull
    public Collection<FqName> getSubPackagesOf(@NotNull FqName fqName, @NotNull Function1<? super Name, Boolean> function1) {
        fqName.getClass();
        function1.getClass();
        assertValid();
        return getPackageFragmentProvider().getSubPackagesOf(fqName, function1);
    }

    public final void initialize(@NotNull PackageFragmentProvider packageFragmentProvider) {
        packageFragmentProvider.getClass();
        isInitialized();
        this.packageFragmentProviderForModuleContent = packageFragmentProvider;
    }

    public boolean isValid() {
        return this.isValid;
    }

    public final void setDependencies(@NotNull List<ModuleDescriptorImpl> list, @NotNull Set<ModuleDescriptorImpl> set) {
        list.getClass();
        set.getClass();
        setDependencies(new ModuleDependenciesImpl(list, set, km5.a, rm5.a));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public boolean shouldSeeInternalsOf(@NotNull ModuleDescriptor moduleDescriptor) {
        moduleDescriptor.getClass();
        if (this == moduleDescriptor) {
            return true;
        }
        ModuleDependencies moduleDependencies = this.dependencies;
        moduleDependencies.getClass();
        return CollectionsKt.R(moduleDependencies.getModulesWhoseInternalsAreVisible(), moduleDescriptor) || getExpectedByModules().contains(moduleDescriptor) || moduleDescriptor.getExpectedByModules().contains(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl
    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        if (!isValid()) {
            sb.append(" !isValid");
        }
        sb.append(" packageFragmentProvider: ");
        PackageFragmentProvider packageFragmentProvider = this.packageFragmentProviderForModuleContent;
        sb.append(packageFragmentProvider != null ? packageFragmentProvider.getClass().getSimpleName() : null);
        return sb.toString();
    }

    public final void setDependencies(@NotNull ModuleDependencies moduleDependencies) {
        moduleDependencies.getClass();
        this.dependencies = moduleDependencies;
    }

    public final void setDependencies(@NotNull ModuleDescriptorImpl... moduleDescriptorImplArr) {
        moduleDescriptorImplArr.getClass();
        setDependencies(ph0.X(moduleDescriptorImplArr));
    }

    public final void setDependencies(@NotNull List<ModuleDescriptorImpl> list) {
        list.getClass();
        setDependencies(list, rm5.a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ModuleDescriptorImpl(@NotNull Name name, @NotNull StorageManager storageManager, @NotNull KotlinBuiltIns kotlinBuiltIns, @Nullable TargetPlatform targetPlatform) {
        this(name, storageManager, kotlinBuiltIns, targetPlatform, null, null, 48, null);
        name.getClass();
        storageManager.getClass();
        kotlinBuiltIns.getClass();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ModuleDescriptorImpl(Name name, StorageManager storageManager, KotlinBuiltIns kotlinBuiltIns, TargetPlatform targetPlatform, Map map, Name name2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(name, storageManager, kotlinBuiltIns, targetPlatform, map, (i & 32) != 0 ? null : name2);
        targetPlatform = (i & 8) != 0 ? null : targetPlatform;
        if ((i & 16) != 0) {
            map = lm5.a;
            map.getClass();
        }
    }
}
