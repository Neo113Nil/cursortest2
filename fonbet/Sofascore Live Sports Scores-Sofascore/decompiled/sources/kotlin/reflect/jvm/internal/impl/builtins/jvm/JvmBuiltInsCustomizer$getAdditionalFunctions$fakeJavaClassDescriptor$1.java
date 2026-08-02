package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import defpackage.xka;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class JvmBuiltInsCustomizer$getAdditionalFunctions$fakeJavaClassDescriptor$1 extends xka implements Function0<ClassDescriptor> {
    final /* synthetic */ LazyJavaClassDescriptor $javaAnalogueDescriptor;
    final /* synthetic */ ClassDescriptor $kotlinMutableClassIfContainer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmBuiltInsCustomizer$getAdditionalFunctions$fakeJavaClassDescriptor$1(LazyJavaClassDescriptor lazyJavaClassDescriptor, ClassDescriptor classDescriptor) {
        super(0);
        this.$javaAnalogueDescriptor = lazyJavaClassDescriptor;
        this.$kotlinMutableClassIfContainer = classDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final ClassDescriptor invoke() {
        LazyJavaClassDescriptor lazyJavaClassDescriptor = this.$javaAnalogueDescriptor;
        JavaResolverCache javaResolverCache = JavaResolverCache.EMPTY;
        javaResolverCache.getClass();
        return lazyJavaClassDescriptor.copy$descriptors_jvm(javaResolverCache, this.$kotlinMutableClassIfContainer);
    }
}
