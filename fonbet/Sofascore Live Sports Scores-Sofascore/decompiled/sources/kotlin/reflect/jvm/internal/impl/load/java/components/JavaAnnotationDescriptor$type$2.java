package kotlin.reflect.jvm.internal.impl.load.java.components;

import defpackage.xka;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class JavaAnnotationDescriptor$type$2 extends xka implements Function0<SimpleType> {
    final /* synthetic */ LazyJavaResolverContext $c;
    final /* synthetic */ JavaAnnotationDescriptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaAnnotationDescriptor$type$2(LazyJavaResolverContext lazyJavaResolverContext, JavaAnnotationDescriptor javaAnnotationDescriptor) {
        super(0);
        this.$c = lazyJavaResolverContext;
        this.this$0 = javaAnnotationDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final SimpleType invoke() {
        SimpleType defaultType = this.$c.getModule().getBuiltIns().getBuiltInClassByFqName(this.this$0.getFqName()).getDefaultType();
        defaultType.getClass();
        return defaultType;
    }
}
