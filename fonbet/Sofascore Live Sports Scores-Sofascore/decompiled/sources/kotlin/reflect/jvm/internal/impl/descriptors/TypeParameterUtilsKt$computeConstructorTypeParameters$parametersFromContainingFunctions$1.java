package kotlin.reflect.jvm.internal.impl.descriptors;

import defpackage.xka;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class TypeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$1 extends xka implements Function1<DeclarationDescriptor, Boolean> {
    public static final TypeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$1 INSTANCE = new TypeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$1();

    public TypeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull DeclarationDescriptor declarationDescriptor) {
        declarationDescriptor.getClass();
        return Boolean.valueOf(declarationDescriptor instanceof CallableDescriptor);
    }
}
