package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import defpackage.wx4;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderKt;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class CompositePackageFragmentProvider implements PackageFragmentProviderOptimized {

    @NotNull
    private final String debugName;

    @NotNull
    private final List<PackageFragmentProvider> providers;

    /* JADX WARN: Multi-variable type inference failed */
    public CompositePackageFragmentProvider(@NotNull List<? extends PackageFragmentProvider> list, @NotNull String str) {
        list.getClass();
        str.getClass();
        this.providers = list;
        this.debugName = str;
        list.size();
        CollectionsKt.W0(list).size();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public void collectPackageFragments(@NotNull FqName fqName, @NotNull Collection<PackageFragmentDescriptor> collection) {
        fqName.getClass();
        collection.getClass();
        Iterator<PackageFragmentProvider> it = this.providers.iterator();
        while (it.hasNext()) {
            PackageFragmentProviderKt.collectPackageFragmentsOptimizedIfPossible(it.next(), fqName, collection);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    @wx4
    @NotNull
    public List<PackageFragmentDescriptor> getPackageFragments(@NotNull FqName fqName) {
        fqName.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator<PackageFragmentProvider> it = this.providers.iterator();
        while (it.hasNext()) {
            PackageFragmentProviderKt.collectPackageFragmentsOptimizedIfPossible(it.next(), fqName, arrayList);
        }
        return CollectionsKt.S0(arrayList);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    @NotNull
    public Collection<FqName> getSubPackagesOf(@NotNull FqName fqName, @NotNull Function1<? super Name, Boolean> function1) {
        fqName.getClass();
        function1.getClass();
        HashSet hashSet = new HashSet();
        Iterator<PackageFragmentProvider> it = this.providers.iterator();
        while (it.hasNext()) {
            hashSet.addAll(it.next().getSubPackagesOf(fqName, function1));
        }
        return hashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public boolean isEmpty(@NotNull FqName fqName) {
        fqName.getClass();
        List<PackageFragmentProvider> list = this.providers;
        if (list != null && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!PackageFragmentProviderKt.isEmpty((PackageFragmentProvider) it.next(), fqName)) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public String toString() {
        return this.debugName;
    }
}
