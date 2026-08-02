package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import defpackage.xka;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ContextKt$copyWithNewDefaultTypeQualifiers$1 extends xka implements Function0<JavaTypeQualifiersByElementType> {
    final /* synthetic */ Annotations $additionalAnnotations;
    final /* synthetic */ LazyJavaResolverContext $this_copyWithNewDefaultTypeQualifiers;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContextKt$copyWithNewDefaultTypeQualifiers$1(LazyJavaResolverContext lazyJavaResolverContext, Annotations annotations) {
        super(0);
        this.$this_copyWithNewDefaultTypeQualifiers = lazyJavaResolverContext;
        this.$additionalAnnotations = annotations;
    }

    @Override // kotlin.jvm.functions.Function0
    @Nullable
    public final JavaTypeQualifiersByElementType invoke() {
        return ContextKt.computeNewDefaultTypeQualifiers(this.$this_copyWithNewDefaultTypeQualifiers, this.$additionalAnnotations);
    }
}
