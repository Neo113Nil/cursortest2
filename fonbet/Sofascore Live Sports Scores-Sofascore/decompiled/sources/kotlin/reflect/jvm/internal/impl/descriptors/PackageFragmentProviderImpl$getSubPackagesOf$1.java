package kotlin.reflect.jvm.internal.impl.descriptors;

import defpackage.xka;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class PackageFragmentProviderImpl$getSubPackagesOf$1 extends xka implements Function1<PackageFragmentDescriptor, FqName> {
    public static final PackageFragmentProviderImpl$getSubPackagesOf$1 INSTANCE = new PackageFragmentProviderImpl$getSubPackagesOf$1();

    public PackageFragmentProviderImpl$getSubPackagesOf$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final FqName invoke(@NotNull PackageFragmentDescriptor packageFragmentDescriptor) {
        packageFragmentDescriptor.getClass();
        return packageFragmentDescriptor.getFqName();
    }
}
