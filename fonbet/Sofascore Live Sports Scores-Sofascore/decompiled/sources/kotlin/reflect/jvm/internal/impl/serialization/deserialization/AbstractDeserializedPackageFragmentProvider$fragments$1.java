package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import defpackage.xka;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class AbstractDeserializedPackageFragmentProvider$fragments$1 extends xka implements Function1<FqName, PackageFragmentDescriptor> {
    final /* synthetic */ AbstractDeserializedPackageFragmentProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractDeserializedPackageFragmentProvider$fragments$1(AbstractDeserializedPackageFragmentProvider abstractDeserializedPackageFragmentProvider) {
        super(1);
        this.this$0 = abstractDeserializedPackageFragmentProvider;
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final PackageFragmentDescriptor invoke(@NotNull FqName fqName) {
        fqName.getClass();
        DeserializedPackageFragment findPackage = this.this$0.findPackage(fqName);
        if (findPackage == null) {
            return null;
        }
        findPackage.initialize(this.this$0.getComponents());
        return findPackage;
    }
}
