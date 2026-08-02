package kotlin.reflect.jvm.internal.impl.types;

import defpackage.a70;
import defpackage.k13;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class StarProjectionImplKt {
    private static final KotlinType buildStarProjectionTypeByTypeParameters(final List<? extends TypeConstructor> list, List<? extends KotlinType> list2, KotlinBuiltIns kotlinBuiltIns) {
        KotlinType substitute = TypeSubstitutor.create(new TypeConstructorSubstitution() { // from class: kotlin.reflect.jvm.internal.impl.types.StarProjectionImplKt$buildStarProjectionTypeByTypeParameters$1
            @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution
            @Nullable
            public TypeProjection get(@NotNull TypeConstructor typeConstructor) {
                typeConstructor.getClass();
                if (!list.contains(typeConstructor)) {
                    return null;
                }
                ClassifierDescriptor mo893getDeclarationDescriptor = typeConstructor.mo893getDeclarationDescriptor();
                mo893getDeclarationDescriptor.getClass();
                return TypeUtils.makeStarProjection((TypeParameterDescriptor) mo893getDeclarationDescriptor);
            }
        }).substitute((KotlinType) CollectionsKt.Y(list2), Variance.OUT_VARIANCE);
        if (substitute == null) {
            substitute = kotlinBuiltIns.getDefaultBound();
        }
        substitute.getClass();
        return substitute;
    }

    @NotNull
    public static final KotlinType starProjectionType(@NotNull TypeParameterDescriptor typeParameterDescriptor) {
        typeParameterDescriptor.getClass();
        DeclarationDescriptor containingDeclaration = typeParameterDescriptor.getContainingDeclaration();
        containingDeclaration.getClass();
        if (containingDeclaration instanceof ClassifierDescriptorWithTypeParameters) {
            List<TypeParameterDescriptor> parameters = ((ClassifierDescriptorWithTypeParameters) containingDeclaration).getTypeConstructor().getParameters();
            parameters.getClass();
            ArrayList arrayList = new ArrayList(k13.r(parameters, 10));
            Iterator<T> it = parameters.iterator();
            while (it.hasNext()) {
                TypeConstructor typeConstructor = ((TypeParameterDescriptor) it.next()).getTypeConstructor();
                typeConstructor.getClass();
                arrayList.add(typeConstructor);
            }
            List<KotlinType> upperBounds = typeParameterDescriptor.getUpperBounds();
            upperBounds.getClass();
            return buildStarProjectionTypeByTypeParameters(arrayList, upperBounds, DescriptorUtilsKt.getBuiltIns(typeParameterDescriptor));
        }
        if (!(containingDeclaration instanceof FunctionDescriptor)) {
            a70.p("Unsupported descriptor type to build star projection type based on type parameters of it");
            return null;
        }
        List<TypeParameterDescriptor> typeParameters = ((FunctionDescriptor) containingDeclaration).getTypeParameters();
        typeParameters.getClass();
        ArrayList arrayList2 = new ArrayList(k13.r(typeParameters, 10));
        Iterator<T> it2 = typeParameters.iterator();
        while (it2.hasNext()) {
            TypeConstructor typeConstructor2 = ((TypeParameterDescriptor) it2.next()).getTypeConstructor();
            typeConstructor2.getClass();
            arrayList2.add(typeConstructor2);
        }
        List<KotlinType> upperBounds2 = typeParameterDescriptor.getUpperBounds();
        upperBounds2.getClass();
        return buildStarProjectionTypeByTypeParameters(arrayList2, upperBounds2, DescriptorUtilsKt.getBuiltIns(typeParameterDescriptor));
    }
}
