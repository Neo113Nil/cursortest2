package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import defpackage.k13;
import defpackage.sw9;
import defpackage.xka;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ModuleDescriptorImpl$packageFragmentProviderForWholeModuleWithDependencies$2 extends xka implements Function0<CompositePackageFragmentProvider> {
    final /* synthetic */ ModuleDescriptorImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModuleDescriptorImpl$packageFragmentProviderForWholeModuleWithDependencies$2(ModuleDescriptorImpl moduleDescriptorImpl) {
        super(0);
        this.this$0 = moduleDescriptorImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final CompositePackageFragmentProvider invoke() {
        ModuleDependencies moduleDependencies;
        String id;
        PackageFragmentProvider packageFragmentProvider;
        moduleDependencies = this.this$0.dependencies;
        ModuleDescriptorImpl moduleDescriptorImpl = this.this$0;
        if (moduleDependencies == null) {
            id = moduleDescriptorImpl.getId();
            sw9.r(id, " were not set before querying module content", "Dependencies of module ");
            return null;
        }
        List<ModuleDescriptorImpl> allDependencies = moduleDependencies.getAllDependencies();
        this.this$0.assertValid();
        allDependencies.contains(this.this$0);
        Iterator<T> it = allDependencies.iterator();
        while (it.hasNext()) {
            ((ModuleDescriptorImpl) it.next()).isInitialized();
        }
        ArrayList arrayList = new ArrayList(k13.r(allDependencies, 10));
        Iterator<T> it2 = allDependencies.iterator();
        while (it2.hasNext()) {
            packageFragmentProvider = ((ModuleDescriptorImpl) it2.next()).packageFragmentProviderForModuleContent;
            packageFragmentProvider.getClass();
            arrayList.add(packageFragmentProvider);
        }
        return new CompositePackageFragmentProvider(arrayList, "CompositeProvider@ModuleDescriptor for " + this.this$0.getName());
    }
}
