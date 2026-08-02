package kotlin.reflect.jvm.internal.impl.descriptors;

import defpackage.xka;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class PackageFragmentProviderImpl$getSubPackagesOf$2 extends xka implements Function1<FqName, Boolean> {
    final /* synthetic */ FqName $fqName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PackageFragmentProviderImpl$getSubPackagesOf$2(FqName fqName) {
        super(1);
        this.$fqName = fqName;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull FqName fqName) {
        fqName.getClass();
        return Boolean.valueOf(!fqName.isRoot() && Intrinsics.c(fqName.parent(), this.$fqName));
    }
}
