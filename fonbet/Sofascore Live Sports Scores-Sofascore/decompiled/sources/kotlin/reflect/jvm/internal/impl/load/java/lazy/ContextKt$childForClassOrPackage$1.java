package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import defpackage.xka;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassOrPackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ContextKt$childForClassOrPackage$1 extends xka implements Function0<JavaTypeQualifiersByElementType> {
    final /* synthetic */ ClassOrPackageFragmentDescriptor $containingDeclaration;
    final /* synthetic */ LazyJavaResolverContext $this_childForClassOrPackage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContextKt$childForClassOrPackage$1(LazyJavaResolverContext lazyJavaResolverContext, ClassOrPackageFragmentDescriptor classOrPackageFragmentDescriptor) {
        super(0);
        this.$this_childForClassOrPackage = lazyJavaResolverContext;
        this.$containingDeclaration = classOrPackageFragmentDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    @Nullable
    public final JavaTypeQualifiersByElementType invoke() {
        return ContextKt.computeNewDefaultTypeQualifiers(this.$this_childForClassOrPackage, this.$containingDeclaration.getAnnotations());
    }
}
