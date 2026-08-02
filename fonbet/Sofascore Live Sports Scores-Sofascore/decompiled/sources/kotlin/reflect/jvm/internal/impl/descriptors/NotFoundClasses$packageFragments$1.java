package kotlin.reflect.jvm.internal.impl.descriptors;

import defpackage.xka;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EmptyPackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class NotFoundClasses$packageFragments$1 extends xka implements Function1<FqName, PackageFragmentDescriptor> {
    final /* synthetic */ NotFoundClasses this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotFoundClasses$packageFragments$1(NotFoundClasses notFoundClasses) {
        super(1);
        this.this$0 = notFoundClasses;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final PackageFragmentDescriptor invoke(@NotNull FqName fqName) {
        ModuleDescriptor moduleDescriptor;
        fqName.getClass();
        moduleDescriptor = this.this$0.module;
        return new EmptyPackageFragmentDescriptor(moduleDescriptor, fqName);
    }
}
