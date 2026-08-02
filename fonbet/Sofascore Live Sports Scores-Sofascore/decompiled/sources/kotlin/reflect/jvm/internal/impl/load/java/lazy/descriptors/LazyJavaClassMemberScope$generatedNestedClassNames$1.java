package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import defpackage.xka;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class LazyJavaClassMemberScope$generatedNestedClassNames$1 extends xka implements Function0<Set<? extends Name>> {
    final /* synthetic */ LazyJavaResolverContext $c;
    final /* synthetic */ LazyJavaClassMemberScope this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaClassMemberScope$generatedNestedClassNames$1(LazyJavaResolverContext lazyJavaResolverContext, LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        super(0);
        this.$c = lazyJavaResolverContext;
        this.this$0 = lazyJavaClassMemberScope;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Set<Name> invoke() {
        LazyJavaResolverContext lazyJavaResolverContext = this.$c;
        return CollectionsKt.W0(lazyJavaResolverContext.getComponents().getSyntheticPartsProvider().getNestedClassNames(lazyJavaResolverContext, this.this$0.getOwnerDescriptor()));
    }
}
