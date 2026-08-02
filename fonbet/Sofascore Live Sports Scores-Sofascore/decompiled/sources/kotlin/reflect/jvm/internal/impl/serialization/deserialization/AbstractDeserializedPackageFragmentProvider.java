package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import defpackage.rm5;
import defpackage.wx4;
import java.util.Collection;
import java.util.List;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class AbstractDeserializedPackageFragmentProvider implements PackageFragmentProviderOptimized {
    protected DeserializationComponents components;

    @NotNull
    private final KotlinMetadataFinder finder;

    @NotNull
    private final MemoizedFunctionToNullable<FqName, PackageFragmentDescriptor> fragments;

    @NotNull
    private final ModuleDescriptor moduleDescriptor;

    @NotNull
    private final StorageManager storageManager;

    public AbstractDeserializedPackageFragmentProvider(@NotNull StorageManager storageManager, @NotNull KotlinMetadataFinder kotlinMetadataFinder, @NotNull ModuleDescriptor moduleDescriptor) {
        storageManager.getClass();
        kotlinMetadataFinder.getClass();
        moduleDescriptor.getClass();
        this.storageManager = storageManager;
        this.finder = kotlinMetadataFinder;
        this.moduleDescriptor = moduleDescriptor;
        this.fragments = storageManager.createMemoizedFunctionWithNullableValues(new AbstractDeserializedPackageFragmentProvider$fragments$1(this));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public void collectPackageFragments(@NotNull FqName fqName, @NotNull Collection<PackageFragmentDescriptor> collection) {
        fqName.getClass();
        collection.getClass();
        CollectionsKt.addIfNotNull(collection, this.fragments.invoke(fqName));
    }

    @Nullable
    public abstract DeserializedPackageFragment findPackage(@NotNull FqName fqName);

    @NotNull
    public final DeserializationComponents getComponents() {
        DeserializationComponents deserializationComponents = this.components;
        if (deserializationComponents != null) {
            return deserializationComponents;
        }
        Intrinsics.i("components");
        throw null;
    }

    @NotNull
    public final KotlinMetadataFinder getFinder() {
        return this.finder;
    }

    @NotNull
    public final ModuleDescriptor getModuleDescriptor() {
        return this.moduleDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    @wx4
    @NotNull
    public List<PackageFragmentDescriptor> getPackageFragments(@NotNull FqName fqName) {
        fqName.getClass();
        return b.k(this.fragments.invoke(fqName));
    }

    @NotNull
    public final StorageManager getStorageManager() {
        return this.storageManager;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    @NotNull
    public Collection<FqName> getSubPackagesOf(@NotNull FqName fqName, @NotNull Function1<? super Name, Boolean> function1) {
        fqName.getClass();
        function1.getClass();
        return rm5.a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public boolean isEmpty(@NotNull FqName fqName) {
        fqName.getClass();
        return (this.fragments.isComputed(fqName) ? (PackageFragmentDescriptor) this.fragments.invoke(fqName) : findPackage(fqName)) == null;
    }

    public final void setComponents(@NotNull DeserializationComponents deserializationComponents) {
        deserializationComponents.getClass();
        this.components = deserializationComponents;
    }
}
