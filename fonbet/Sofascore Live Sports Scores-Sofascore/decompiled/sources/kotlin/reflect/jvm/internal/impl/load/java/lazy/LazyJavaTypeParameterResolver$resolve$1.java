package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import defpackage.xka;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class LazyJavaTypeParameterResolver$resolve$1 extends xka implements Function1<JavaTypeParameter, LazyJavaTypeParameterDescriptor> {
    final /* synthetic */ LazyJavaTypeParameterResolver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaTypeParameterResolver$resolve$1(LazyJavaTypeParameterResolver lazyJavaTypeParameterResolver) {
        super(1);
        this.this$0 = lazyJavaTypeParameterResolver;
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final LazyJavaTypeParameterDescriptor invoke(@NotNull JavaTypeParameter javaTypeParameter) {
        Map map;
        LazyJavaResolverContext lazyJavaResolverContext;
        DeclarationDescriptor declarationDescriptor;
        int i;
        DeclarationDescriptor declarationDescriptor2;
        javaTypeParameter.getClass();
        map = this.this$0.typeParameters;
        Integer num = (Integer) map.get(javaTypeParameter);
        if (num == null) {
            return null;
        }
        LazyJavaTypeParameterResolver lazyJavaTypeParameterResolver = this.this$0;
        int intValue = num.intValue();
        lazyJavaResolverContext = lazyJavaTypeParameterResolver.c;
        LazyJavaResolverContext child = ContextKt.child(lazyJavaResolverContext, lazyJavaTypeParameterResolver);
        declarationDescriptor = lazyJavaTypeParameterResolver.containingDeclaration;
        LazyJavaResolverContext copyWithNewDefaultTypeQualifiers = ContextKt.copyWithNewDefaultTypeQualifiers(child, declarationDescriptor.getAnnotations());
        i = lazyJavaTypeParameterResolver.typeParametersIndexOffset;
        declarationDescriptor2 = lazyJavaTypeParameterResolver.containingDeclaration;
        return new LazyJavaTypeParameterDescriptor(copyWithNewDefaultTypeQualifiers, javaTypeParameter, i + intValue, declarationDescriptor2);
    }
}
