package kotlin.reflect.jvm.internal.impl.types;

import defpackage.a70;
import defpackage.c9h;
import defpackage.joa;
import defpackage.k13;
import defpackage.sub;
import defpackage.w9h;
import defpackage.ypa;
import defpackage.zzl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution;
import kotlin.reflect.jvm.internal.impl.types.checker.IntersectionTypeKt;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class TypeParameterUpperBoundEraser {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final joa erroneousErasedBound$delegate;

    @NotNull
    private final MemoizedFunctionToNotNull<DataToEraseUpperBound, KotlinType> getErasedUpperBound;

    @NotNull
    private final TypeParameterErasureOptions options;

    @NotNull
    private final ErasureProjectionComputer projectionComputer;

    @NotNull
    private final LockBasedStorageManager storage;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class DataToEraseUpperBound {

        @NotNull
        private final ErasureTypeAttributes typeAttr;

        @NotNull
        private final TypeParameterDescriptor typeParameter;

        public DataToEraseUpperBound(@NotNull TypeParameterDescriptor typeParameterDescriptor, @NotNull ErasureTypeAttributes erasureTypeAttributes) {
            typeParameterDescriptor.getClass();
            erasureTypeAttributes.getClass();
            this.typeParameter = typeParameterDescriptor;
            this.typeAttr = erasureTypeAttributes;
        }

        public boolean equals(@Nullable Object obj) {
            if (!(obj instanceof DataToEraseUpperBound)) {
                return false;
            }
            DataToEraseUpperBound dataToEraseUpperBound = (DataToEraseUpperBound) obj;
            return Intrinsics.c(dataToEraseUpperBound.typeParameter, this.typeParameter) && Intrinsics.c(dataToEraseUpperBound.typeAttr, this.typeAttr);
        }

        @NotNull
        public final ErasureTypeAttributes getTypeAttr() {
            return this.typeAttr;
        }

        @NotNull
        public final TypeParameterDescriptor getTypeParameter() {
            return this.typeParameter;
        }

        public int hashCode() {
            int hashCode = this.typeParameter.hashCode();
            return this.typeAttr.hashCode() + (hashCode * 31) + hashCode;
        }

        @NotNull
        public String toString() {
            return "DataToEraseUpperBound(typeParameter=" + this.typeParameter + ", typeAttr=" + this.typeAttr + ')';
        }
    }

    public TypeParameterUpperBoundEraser(@NotNull ErasureProjectionComputer erasureProjectionComputer, @NotNull TypeParameterErasureOptions typeParameterErasureOptions) {
        erasureProjectionComputer.getClass();
        typeParameterErasureOptions.getClass();
        this.projectionComputer = erasureProjectionComputer;
        this.options = typeParameterErasureOptions;
        LockBasedStorageManager lockBasedStorageManager = new LockBasedStorageManager("Type parameter upper bound erasure results");
        this.storage = lockBasedStorageManager;
        this.erroneousErasedBound$delegate = ypa.b(new TypeParameterUpperBoundEraser$erroneousErasedBound$2(this));
        MemoizedFunctionToNotNull<DataToEraseUpperBound, KotlinType> createMemoizedFunction = lockBasedStorageManager.createMemoizedFunction(new TypeParameterUpperBoundEraser$getErasedUpperBound$1(this));
        createMemoizedFunction.getClass();
        this.getErasedUpperBound = createMemoizedFunction;
    }

    private final KotlinType getDefaultType(ErasureTypeAttributes erasureTypeAttributes) {
        KotlinType replaceArgumentsWithStarProjections;
        SimpleType defaultType = erasureTypeAttributes.getDefaultType();
        return (defaultType == null || (replaceArgumentsWithStarProjections = TypeUtilsKt.replaceArgumentsWithStarProjections(defaultType)) == null) ? getErroneousErasedBound() : replaceArgumentsWithStarProjections;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final KotlinType getErasedUpperBoundInternal(TypeParameterDescriptor typeParameterDescriptor, ErasureTypeAttributes erasureTypeAttributes) {
        TypeProjection computeProjection;
        Set<TypeParameterDescriptor> visitedTypeParameters = erasureTypeAttributes.getVisitedTypeParameters();
        if (visitedTypeParameters != null && visitedTypeParameters.contains(typeParameterDescriptor.getOriginal())) {
            return getDefaultType(erasureTypeAttributes);
        }
        SimpleType defaultType = typeParameterDescriptor.getDefaultType();
        defaultType.getClass();
        Set<TypeParameterDescriptor> extractTypeParametersFromUpperBounds = TypeUtilsKt.extractTypeParametersFromUpperBounds(defaultType, visitedTypeParameters);
        int c = sub.c(k13.r(extractTypeParametersFromUpperBounds, 10));
        if (c < 16) {
            c = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(c);
        for (TypeParameterDescriptor typeParameterDescriptor2 : extractTypeParametersFromUpperBounds) {
            if (visitedTypeParameters == null || !visitedTypeParameters.contains(typeParameterDescriptor2)) {
                computeProjection = this.projectionComputer.computeProjection(typeParameterDescriptor2, erasureTypeAttributes, this, getErasedUpperBound(typeParameterDescriptor2, erasureTypeAttributes.withNewVisitedTypeParameter(typeParameterDescriptor)));
            } else {
                computeProjection = TypeUtils.makeStarProjection(typeParameterDescriptor2, erasureTypeAttributes);
                computeProjection.getClass();
            }
            linkedHashMap.put(typeParameterDescriptor2.getTypeConstructor(), computeProjection);
        }
        TypeSubstitutor create = TypeSubstitutor.create(TypeConstructorSubstitution.Companion.createByConstructorsMap$default(TypeConstructorSubstitution.Companion, linkedHashMap, false, 2, null));
        create.getClass();
        List<KotlinType> upperBounds = typeParameterDescriptor.getUpperBounds();
        upperBounds.getClass();
        Set<KotlinType> substituteErasedUpperBounds = substituteErasedUpperBounds(create, upperBounds, erasureTypeAttributes);
        if (substituteErasedUpperBounds.isEmpty()) {
            return getDefaultType(erasureTypeAttributes);
        }
        if (!this.options.getIntersectUpperBounds()) {
            if (substituteErasedUpperBounds.size() == 1) {
                return (KotlinType) CollectionsKt.C0(substituteErasedUpperBounds);
            }
            a70.p("Should only be one computed upper bound if no need to intersect all bounds");
            return null;
        }
        List S0 = CollectionsKt.S0(substituteErasedUpperBounds);
        ArrayList arrayList = new ArrayList(k13.r(S0, 10));
        Iterator it = S0.iterator();
        while (it.hasNext()) {
            arrayList.add(((KotlinType) it.next()).unwrap());
        }
        return IntersectionTypeKt.intersectTypes(arrayList);
    }

    private final ErrorType getErroneousErasedBound() {
        return (ErrorType) this.erroneousErasedBound$delegate.getValue();
    }

    private final Set<KotlinType> substituteErasedUpperBounds(TypeSubstitutor typeSubstitutor, List<? extends KotlinType> list, ErasureTypeAttributes erasureTypeAttributes) {
        c9h c9hVar = new c9h();
        for (KotlinType kotlinType : list) {
            ClassifierDescriptor mo893getDeclarationDescriptor = kotlinType.getConstructor().mo893getDeclarationDescriptor();
            if (mo893getDeclarationDescriptor instanceof ClassDescriptor) {
                c9hVar.add(Companion.replaceArgumentsOfUpperBound(kotlinType, typeSubstitutor, erasureTypeAttributes.getVisitedTypeParameters(), this.options.getLeaveNonTypeParameterTypes()));
            } else if (mo893getDeclarationDescriptor instanceof TypeParameterDescriptor) {
                Set<TypeParameterDescriptor> visitedTypeParameters = erasureTypeAttributes.getVisitedTypeParameters();
                if (visitedTypeParameters == null || !visitedTypeParameters.contains(mo893getDeclarationDescriptor)) {
                    List<KotlinType> upperBounds = ((TypeParameterDescriptor) mo893getDeclarationDescriptor).getUpperBounds();
                    upperBounds.getClass();
                    c9hVar.addAll(substituteErasedUpperBounds(typeSubstitutor, upperBounds, erasureTypeAttributes));
                } else {
                    c9hVar.add(getDefaultType(erasureTypeAttributes));
                }
            }
            if (!this.options.getIntersectUpperBounds()) {
                break;
            }
        }
        return w9h.a(c9hVar);
    }

    @NotNull
    public final KotlinType getErasedUpperBound(@NotNull TypeParameterDescriptor typeParameterDescriptor, @NotNull ErasureTypeAttributes erasureTypeAttributes) {
        typeParameterDescriptor.getClass();
        erasureTypeAttributes.getClass();
        Object invoke = this.getErasedUpperBound.invoke(new DataToEraseUpperBound(typeParameterDescriptor, erasureTypeAttributes));
        invoke.getClass();
        return (KotlinType) invoke;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KotlinType replaceArgumentsOfUpperBound(@NotNull KotlinType kotlinType, @NotNull TypeSubstitutor typeSubstitutor, @Nullable Set<? extends TypeParameterDescriptor> set, boolean z) {
            UnwrappedType unwrappedType;
            KotlinType type;
            KotlinType type2;
            KotlinType type3;
            kotlinType.getClass();
            typeSubstitutor.getClass();
            UnwrappedType unwrap = kotlinType.unwrap();
            if (unwrap instanceof FlexibleType) {
                FlexibleType flexibleType = (FlexibleType) unwrap;
                SimpleType lowerBound = flexibleType.getLowerBound();
                if (!lowerBound.getConstructor().getParameters().isEmpty() && lowerBound.getConstructor().mo893getDeclarationDescriptor() != null) {
                    List<TypeParameterDescriptor> parameters = lowerBound.getConstructor().getParameters();
                    parameters.getClass();
                    ArrayList arrayList = new ArrayList(k13.r(parameters, 10));
                    for (TypeParameterDescriptor typeParameterDescriptor : parameters) {
                        TypeProjection typeProjection = (TypeProjection) CollectionsKt.a0(typeParameterDescriptor.getIndex(), kotlinType.getArguments());
                        if (!z || typeProjection == null || (type3 = typeProjection.getType()) == null || TypeUtilsKt.containsTypeParameter(type3)) {
                            boolean z2 = set != null && set.contains(typeParameterDescriptor);
                            if (typeProjection != null && !z2) {
                                TypeSubstitution substitution = typeSubstitutor.getSubstitution();
                                KotlinType type4 = typeProjection.getType();
                                type4.getClass();
                                if (substitution.mo898get(type4) != null) {
                                }
                            }
                            typeProjection = new StarProjectionImpl(typeParameterDescriptor);
                        }
                        arrayList.add(typeProjection);
                    }
                    lowerBound = TypeSubstitutionKt.replace$default(lowerBound, arrayList, null, 2, null);
                }
                SimpleType upperBound = flexibleType.getUpperBound();
                if (!upperBound.getConstructor().getParameters().isEmpty() && upperBound.getConstructor().mo893getDeclarationDescriptor() != null) {
                    List<TypeParameterDescriptor> parameters2 = upperBound.getConstructor().getParameters();
                    parameters2.getClass();
                    ArrayList arrayList2 = new ArrayList(k13.r(parameters2, 10));
                    for (TypeParameterDescriptor typeParameterDescriptor2 : parameters2) {
                        TypeProjection typeProjection2 = (TypeProjection) CollectionsKt.a0(typeParameterDescriptor2.getIndex(), kotlinType.getArguments());
                        if (!z || typeProjection2 == null || (type2 = typeProjection2.getType()) == null || TypeUtilsKt.containsTypeParameter(type2)) {
                            boolean z3 = set != null && set.contains(typeParameterDescriptor2);
                            if (typeProjection2 != null && !z3) {
                                TypeSubstitution substitution2 = typeSubstitutor.getSubstitution();
                                KotlinType type5 = typeProjection2.getType();
                                type5.getClass();
                                if (substitution2.mo898get(type5) != null) {
                                }
                            }
                            typeProjection2 = new StarProjectionImpl(typeParameterDescriptor2);
                        }
                        arrayList2.add(typeProjection2);
                    }
                    upperBound = TypeSubstitutionKt.replace$default(upperBound, arrayList2, null, 2, null);
                }
                unwrappedType = KotlinTypeFactory.flexibleType(lowerBound, upperBound);
            } else {
                if (!(unwrap instanceof SimpleType)) {
                    zzl.b();
                    return null;
                }
                SimpleType simpleType = (SimpleType) unwrap;
                if (simpleType.getConstructor().getParameters().isEmpty() || simpleType.getConstructor().mo893getDeclarationDescriptor() == null) {
                    unwrappedType = simpleType;
                } else {
                    List<TypeParameterDescriptor> parameters3 = simpleType.getConstructor().getParameters();
                    parameters3.getClass();
                    ArrayList arrayList3 = new ArrayList(k13.r(parameters3, 10));
                    for (TypeParameterDescriptor typeParameterDescriptor3 : parameters3) {
                        TypeProjection typeProjection3 = (TypeProjection) CollectionsKt.a0(typeParameterDescriptor3.getIndex(), kotlinType.getArguments());
                        if (!z || typeProjection3 == null || (type = typeProjection3.getType()) == null || TypeUtilsKt.containsTypeParameter(type)) {
                            boolean z4 = set != null && set.contains(typeParameterDescriptor3);
                            if (typeProjection3 != null && !z4) {
                                TypeSubstitution substitution3 = typeSubstitutor.getSubstitution();
                                KotlinType type6 = typeProjection3.getType();
                                type6.getClass();
                                if (substitution3.mo898get(type6) != null) {
                                }
                            }
                            typeProjection3 = new StarProjectionImpl(typeParameterDescriptor3);
                        }
                        arrayList3.add(typeProjection3);
                    }
                    unwrappedType = TypeSubstitutionKt.replace$default(simpleType, arrayList3, null, 2, null);
                }
            }
            KotlinType safeSubstitute = typeSubstitutor.safeSubstitute(TypeWithEnhancementKt.inheritEnhancement(unwrappedType, unwrap), Variance.OUT_VARIANCE);
            safeSubstitute.getClass();
            return safeSubstitute;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TypeParameterUpperBoundEraser(ErasureProjectionComputer erasureProjectionComputer, TypeParameterErasureOptions typeParameterErasureOptions, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(erasureProjectionComputer, (i & 2) != 0 ? new TypeParameterErasureOptions(false, false) : typeParameterErasureOptions);
    }
}
