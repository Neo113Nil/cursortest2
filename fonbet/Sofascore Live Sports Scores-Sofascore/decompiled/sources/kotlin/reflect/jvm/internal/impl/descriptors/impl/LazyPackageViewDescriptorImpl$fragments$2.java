package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import defpackage.xka;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class LazyPackageViewDescriptorImpl$fragments$2 extends xka implements Function0<List<? extends PackageFragmentDescriptor>> {
    final /* synthetic */ LazyPackageViewDescriptorImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyPackageViewDescriptorImpl$fragments$2(LazyPackageViewDescriptorImpl lazyPackageViewDescriptorImpl) {
        super(0);
        this.this$0 = lazyPackageViewDescriptorImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final List<PackageFragmentDescriptor> invoke() {
        return PackageFragmentProviderKt.packageFragments(this.this$0.getModule().getPackageFragmentProvider(), this.this$0.getFqName());
    }
}
