package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import defpackage.xka;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.util.collectionUtils.ScopeUtilsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class JvmPackageScope$kotlinScopes$2 extends xka implements Function0<MemberScope[]> {
    final /* synthetic */ JvmPackageScope this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmPackageScope$kotlinScopes$2(JvmPackageScope jvmPackageScope) {
        super(0);
        this.this$0 = jvmPackageScope;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final MemberScope[] invoke() {
        LazyJavaPackageFragment lazyJavaPackageFragment;
        LazyJavaResolverContext lazyJavaResolverContext;
        LazyJavaPackageFragment lazyJavaPackageFragment2;
        lazyJavaPackageFragment = this.this$0.packageFragment;
        Collection<KotlinJvmBinaryClass> values = lazyJavaPackageFragment.getBinaryClasses$descriptors_jvm().values();
        JvmPackageScope jvmPackageScope = this.this$0;
        ArrayList arrayList = new ArrayList();
        for (KotlinJvmBinaryClass kotlinJvmBinaryClass : values) {
            lazyJavaResolverContext = jvmPackageScope.c;
            DeserializedDescriptorResolver deserializedDescriptorResolver = lazyJavaResolverContext.getComponents().getDeserializedDescriptorResolver();
            lazyJavaPackageFragment2 = jvmPackageScope.packageFragment;
            MemberScope createKotlinPackagePartScope = deserializedDescriptorResolver.createKotlinPackagePartScope(lazyJavaPackageFragment2, kotlinJvmBinaryClass);
            if (createKotlinPackagePartScope != null) {
                arrayList.add(createKotlinPackagePartScope);
            }
        }
        return (MemberScope[]) ScopeUtilsKt.listOfNonEmptyScopes(arrayList).toArray(new MemberScope[0]);
    }
}
