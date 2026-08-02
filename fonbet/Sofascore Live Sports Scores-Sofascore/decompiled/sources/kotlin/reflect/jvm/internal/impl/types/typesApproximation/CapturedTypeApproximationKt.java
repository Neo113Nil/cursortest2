package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import defpackage.ilg;
import defpackage.k13;
import defpackage.zzl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class CapturedTypeApproximationKt {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Variance.values().length];
            try {
                iArr[Variance.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Variance.IN_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Variance.OUT_VARIANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final ApproximationBounds<KotlinType> approximateCapturedTypes(@NotNull KotlinType kotlinType) {
        Object replaceTypeArguments;
        kotlinType.getClass();
        if (FlexibleTypesKt.isFlexible(kotlinType)) {
            ApproximationBounds<KotlinType> approximateCapturedTypes = approximateCapturedTypes(FlexibleTypesKt.lowerIfFlexible(kotlinType));
            ApproximationBounds<KotlinType> approximateCapturedTypes2 = approximateCapturedTypes(FlexibleTypesKt.upperIfFlexible(kotlinType));
            return new ApproximationBounds<>(TypeWithEnhancementKt.inheritEnhancement(KotlinTypeFactory.flexibleType(FlexibleTypesKt.lowerIfFlexible(approximateCapturedTypes.getLower()), FlexibleTypesKt.upperIfFlexible(approximateCapturedTypes2.getLower())), kotlinType), TypeWithEnhancementKt.inheritEnhancement(KotlinTypeFactory.flexibleType(FlexibleTypesKt.lowerIfFlexible(approximateCapturedTypes.getUpper()), FlexibleTypesKt.upperIfFlexible(approximateCapturedTypes2.getUpper())), kotlinType));
        }
        TypeConstructor constructor = kotlinType.getConstructor();
        if (CapturedTypeConstructorKt.isCaptured(kotlinType)) {
            constructor.getClass();
            TypeProjection projection = ((CapturedTypeConstructor) constructor).getProjection();
            KotlinType type = projection.getType();
            type.getClass();
            KotlinType approximateCapturedTypes$makeNullableIfNeeded = approximateCapturedTypes$makeNullableIfNeeded(type, kotlinType);
            int i = WhenMappings.$EnumSwitchMapping$0[projection.getProjectionKind().ordinal()];
            if (i == 2) {
                SimpleType nullableAnyType = TypeUtilsKt.getBuiltIns(kotlinType).getNullableAnyType();
                nullableAnyType.getClass();
                return new ApproximationBounds<>(approximateCapturedTypes$makeNullableIfNeeded, nullableAnyType);
            }
            if (i != 3) {
                ilg.h(projection, "Only nontrivial projections should have been captured, not: ");
                return null;
            }
            SimpleType nothingType = TypeUtilsKt.getBuiltIns(kotlinType).getNothingType();
            nothingType.getClass();
            return new ApproximationBounds<>(approximateCapturedTypes$makeNullableIfNeeded(nothingType, kotlinType), approximateCapturedTypes$makeNullableIfNeeded);
        }
        if (kotlinType.getArguments().isEmpty() || kotlinType.getArguments().size() != constructor.getParameters().size()) {
            return new ApproximationBounds<>(kotlinType, kotlinType);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<TypeProjection> arguments = kotlinType.getArguments();
        List<TypeParameterDescriptor> parameters = constructor.getParameters();
        parameters.getClass();
        Iterator it = CollectionsKt.Y0(arguments, parameters).iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            TypeProjection typeProjection = (TypeProjection) pair.a;
            TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) pair.b;
            typeParameterDescriptor.getClass();
            TypeArgument typeArgument = toTypeArgument(typeProjection, typeParameterDescriptor);
            if (typeProjection.isStarProjection()) {
                arrayList.add(typeArgument);
                arrayList2.add(typeArgument);
            } else {
                ApproximationBounds<TypeArgument> approximateProjection = approximateProjection(typeArgument);
                TypeArgument component1 = approximateProjection.component1();
                TypeArgument component2 = approximateProjection.component2();
                arrayList.add(component1);
                arrayList2.add(component2);
            }
        }
        boolean z = false;
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (!((TypeArgument) it2.next()).isConsistent()) {
                    z = true;
                    break;
                }
            }
        }
        if (z) {
            replaceTypeArguments = TypeUtilsKt.getBuiltIns(kotlinType).getNothingType();
            replaceTypeArguments.getClass();
        } else {
            replaceTypeArguments = replaceTypeArguments(kotlinType, arrayList);
        }
        return new ApproximationBounds<>(replaceTypeArguments, replaceTypeArguments(kotlinType, arrayList2));
    }

    private static final KotlinType approximateCapturedTypes$makeNullableIfNeeded(KotlinType kotlinType, KotlinType kotlinType2) {
        KotlinType makeNullableIfNeeded = TypeUtils.makeNullableIfNeeded(kotlinType, kotlinType2.isMarkedNullable());
        makeNullableIfNeeded.getClass();
        return makeNullableIfNeeded;
    }

    @Nullable
    public static final TypeProjection approximateCapturedTypesIfNecessary(@Nullable TypeProjection typeProjection, boolean z) {
        if (typeProjection == null) {
            return null;
        }
        if (!typeProjection.isStarProjection()) {
            KotlinType type = typeProjection.getType();
            type.getClass();
            if (TypeUtils.contains(type, CapturedTypeApproximationKt$approximateCapturedTypesIfNecessary$1.INSTANCE)) {
                Variance projectionKind = typeProjection.getProjectionKind();
                projectionKind.getClass();
                return projectionKind == Variance.OUT_VARIANCE ? new TypeProjectionImpl(projectionKind, approximateCapturedTypes(type).getUpper()) : z ? new TypeProjectionImpl(projectionKind, approximateCapturedTypes(type).getLower()) : substituteCapturedTypesWithProjections(typeProjection);
            }
        }
        return typeProjection;
    }

    private static final ApproximationBounds<TypeArgument> approximateProjection(TypeArgument typeArgument) {
        ApproximationBounds<KotlinType> approximateCapturedTypes = approximateCapturedTypes(typeArgument.getInProjection());
        KotlinType component1 = approximateCapturedTypes.component1();
        KotlinType component2 = approximateCapturedTypes.component2();
        ApproximationBounds<KotlinType> approximateCapturedTypes2 = approximateCapturedTypes(typeArgument.getOutProjection());
        return new ApproximationBounds<>(new TypeArgument(typeArgument.getTypeParameter(), component2, approximateCapturedTypes2.component1()), new TypeArgument(typeArgument.getTypeParameter(), component1, approximateCapturedTypes2.component2()));
    }

    private static final KotlinType replaceTypeArguments(KotlinType kotlinType, List<TypeArgument> list) {
        kotlinType.getArguments().size();
        list.size();
        ArrayList arrayList = new ArrayList(k13.r(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(toTypeProjection((TypeArgument) it.next()));
        }
        return TypeSubstitutionKt.replace$default(kotlinType, arrayList, null, null, 6, null);
    }

    private static final TypeProjection substituteCapturedTypesWithProjections(TypeProjection typeProjection) {
        TypeSubstitutor create = TypeSubstitutor.create(new TypeConstructorSubstitution() { // from class: kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt$substituteCapturedTypesWithProjections$typeSubstitutor$1
            @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution
            @Nullable
            public TypeProjection get(@NotNull TypeConstructor typeConstructor) {
                typeConstructor.getClass();
                CapturedTypeConstructor capturedTypeConstructor = typeConstructor instanceof CapturedTypeConstructor ? (CapturedTypeConstructor) typeConstructor : null;
                if (capturedTypeConstructor == null) {
                    return null;
                }
                return capturedTypeConstructor.getProjection().isStarProjection() ? new TypeProjectionImpl(Variance.OUT_VARIANCE, capturedTypeConstructor.getProjection().getType()) : capturedTypeConstructor.getProjection();
            }
        });
        create.getClass();
        return create.substituteWithoutApproximation(typeProjection);
    }

    private static final TypeArgument toTypeArgument(TypeProjection typeProjection, TypeParameterDescriptor typeParameterDescriptor) {
        int i = WhenMappings.$EnumSwitchMapping$0[TypeSubstitutor.combine(typeParameterDescriptor.getVariance(), typeProjection).ordinal()];
        if (i == 1) {
            KotlinType type = typeProjection.getType();
            type.getClass();
            KotlinType type2 = typeProjection.getType();
            type2.getClass();
            return new TypeArgument(typeParameterDescriptor, type, type2);
        }
        if (i == 2) {
            KotlinType type3 = typeProjection.getType();
            type3.getClass();
            SimpleType nullableAnyType = DescriptorUtilsKt.getBuiltIns(typeParameterDescriptor).getNullableAnyType();
            nullableAnyType.getClass();
            return new TypeArgument(typeParameterDescriptor, type3, nullableAnyType);
        }
        if (i != 3) {
            zzl.b();
            return null;
        }
        SimpleType nothingType = DescriptorUtilsKt.getBuiltIns(typeParameterDescriptor).getNothingType();
        nothingType.getClass();
        KotlinType type4 = typeProjection.getType();
        type4.getClass();
        return new TypeArgument(typeParameterDescriptor, nothingType, type4);
    }

    private static final TypeProjection toTypeProjection(TypeArgument typeArgument) {
        typeArgument.isConsistent();
        if (!Intrinsics.c(typeArgument.getInProjection(), typeArgument.getOutProjection())) {
            Variance variance = typeArgument.getTypeParameter().getVariance();
            Variance variance2 = Variance.IN_VARIANCE;
            if (variance != variance2) {
                return (!KotlinBuiltIns.isNothing(typeArgument.getInProjection()) || typeArgument.getTypeParameter().getVariance() == variance2) ? KotlinBuiltIns.isNullableAny(typeArgument.getOutProjection()) ? new TypeProjectionImpl(toTypeProjection$removeProjectionIfRedundant(typeArgument, variance2), typeArgument.getInProjection()) : new TypeProjectionImpl(toTypeProjection$removeProjectionIfRedundant(typeArgument, Variance.OUT_VARIANCE), typeArgument.getOutProjection()) : new TypeProjectionImpl(toTypeProjection$removeProjectionIfRedundant(typeArgument, Variance.OUT_VARIANCE), typeArgument.getOutProjection());
            }
        }
        return new TypeProjectionImpl(typeArgument.getInProjection());
    }

    private static final Variance toTypeProjection$removeProjectionIfRedundant(TypeArgument typeArgument, Variance variance) {
        return variance == typeArgument.getTypeParameter().getVariance() ? Variance.INVARIANT : variance;
    }
}
