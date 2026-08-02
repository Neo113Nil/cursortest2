package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import defpackage.xka;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class LazyJavaClassDescriptor$scopeHolder$1 extends xka implements Function1<KotlinTypeRefiner, LazyJavaClassMemberScope> {
    final /* synthetic */ LazyJavaClassDescriptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaClassDescriptor$scopeHolder$1(LazyJavaClassDescriptor lazyJavaClassDescriptor) {
        super(1);
        this.this$0 = lazyJavaClassDescriptor;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final LazyJavaClassMemberScope invoke(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        LazyJavaClassMemberScope lazyJavaClassMemberScope;
        kotlinTypeRefiner.getClass();
        LazyJavaResolverContext lazyJavaResolverContext = this.this$0.c;
        LazyJavaClassDescriptor lazyJavaClassDescriptor = this.this$0;
        JavaClass jClass = lazyJavaClassDescriptor.getJClass();
        boolean z = this.this$0.additionalSupertypeClassDescriptor != null;
        lazyJavaClassMemberScope = this.this$0.unsubstitutedMemberScope;
        return new LazyJavaClassMemberScope(lazyJavaResolverContext, lazyJavaClassDescriptor, jClass, z, lazyJavaClassMemberScope);
    }
}
