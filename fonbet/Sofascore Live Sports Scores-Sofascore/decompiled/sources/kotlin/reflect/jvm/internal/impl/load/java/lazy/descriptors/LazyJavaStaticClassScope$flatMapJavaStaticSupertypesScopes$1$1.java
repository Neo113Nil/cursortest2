package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import defpackage.xka;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$1$1 extends xka implements Function1<KotlinType, ClassDescriptor> {
    public static final LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$1$1 INSTANCE = new LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$1$1();

    public LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$1$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final ClassDescriptor invoke(KotlinType kotlinType) {
        ClassifierDescriptor mo893getDeclarationDescriptor = kotlinType.getConstructor().mo893getDeclarationDescriptor();
        if (mo893getDeclarationDescriptor instanceof ClassDescriptor) {
            return (ClassDescriptor) mo893getDeclarationDescriptor;
        }
        return null;
    }
}
