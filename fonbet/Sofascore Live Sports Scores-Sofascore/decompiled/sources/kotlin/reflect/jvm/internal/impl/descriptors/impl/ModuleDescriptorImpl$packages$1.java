package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import defpackage.xka;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ModuleDescriptorImpl$packages$1 extends xka implements Function1<FqName, PackageViewDescriptor> {
    final /* synthetic */ ModuleDescriptorImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModuleDescriptorImpl$packages$1(ModuleDescriptorImpl moduleDescriptorImpl) {
        super(1);
        this.this$0 = moduleDescriptorImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final PackageViewDescriptor invoke(@NotNull FqName fqName) {
        PackageViewDescriptorFactory packageViewDescriptorFactory;
        StorageManager storageManager;
        fqName.getClass();
        packageViewDescriptorFactory = this.this$0.packageViewDescriptorFactory;
        ModuleDescriptorImpl moduleDescriptorImpl = this.this$0;
        storageManager = moduleDescriptorImpl.storageManager;
        return packageViewDescriptorFactory.compute(moduleDescriptorImpl, fqName, storageManager);
    }
}
