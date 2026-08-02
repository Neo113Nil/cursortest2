package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import defpackage.xka;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class LazyJavaPackageFragmentProvider$getPackageFragment$1 extends xka implements Function0<LazyJavaPackageFragment> {
    final /* synthetic */ JavaPackage $jPackage;
    final /* synthetic */ LazyJavaPackageFragmentProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaPackageFragmentProvider$getPackageFragment$1(LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider, JavaPackage javaPackage) {
        super(0);
        this.this$0 = lazyJavaPackageFragmentProvider;
        this.$jPackage = javaPackage;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final LazyJavaPackageFragment invoke() {
        LazyJavaResolverContext lazyJavaResolverContext;
        lazyJavaResolverContext = this.this$0.c;
        return new LazyJavaPackageFragment(lazyJavaResolverContext, this.$jPackage);
    }
}
