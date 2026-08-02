package kotlin.reflect.jvm.internal.impl.descriptors;

import defpackage.oh0;
import defpackage.xka;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class TypeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$3 extends xka implements Function1<DeclarationDescriptor, Sequence<? extends TypeParameterDescriptor>> {
    public static final TypeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$3 INSTANCE = new TypeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$3();

    public TypeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$3() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Sequence<TypeParameterDescriptor> invoke(@NotNull DeclarationDescriptor declarationDescriptor) {
        declarationDescriptor.getClass();
        List<TypeParameterDescriptor> typeParameters = ((CallableDescriptor) declarationDescriptor).getTypeParameters();
        typeParameters.getClass();
        return new oh0(typeParameters, 1);
    }
}
