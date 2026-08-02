package kotlin.reflect.jvm.internal.impl.types;

import defpackage.k13;
import defpackage.sw9;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.TypeAliasExpansionReportStrategy;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class TypeAliasExpander {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final TypeAliasExpander NON_REPORTING = new TypeAliasExpander(TypeAliasExpansionReportStrategy.DO_NOTHING.INSTANCE, false);

    @NotNull
    private final TypeAliasExpansionReportStrategy reportStrategy;
    private final boolean shouldCheckBounds;

    public TypeAliasExpander(@NotNull TypeAliasExpansionReportStrategy typeAliasExpansionReportStrategy, boolean z) {
        typeAliasExpansionReportStrategy.getClass();
        this.reportStrategy = typeAliasExpansionReportStrategy;
        this.shouldCheckBounds = z;
    }

    private final void checkRepeatedAnnotations(Annotations annotations, Annotations annotations2) {
        HashSet hashSet = new HashSet();
        Iterator<AnnotationDescriptor> it = annotations.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().getFqName());
        }
        for (AnnotationDescriptor annotationDescriptor : annotations2) {
            if (hashSet.contains(annotationDescriptor.getFqName())) {
                this.reportStrategy.repeatedAnnotation(annotationDescriptor);
            }
        }
    }

    private final void checkTypeArgumentsSubstitution(KotlinType kotlinType, KotlinType kotlinType2) {
        TypeSubstitutor create = TypeSubstitutor.create(kotlinType2);
        create.getClass();
        int i = 0;
        for (Object obj : kotlinType2.getArguments()) {
            int i2 = i + 1;
            if (i < 0) {
                b.q();
                throw null;
            }
            TypeProjection typeProjection = (TypeProjection) obj;
            if (!typeProjection.isStarProjection()) {
                KotlinType type = typeProjection.getType();
                type.getClass();
                if (!TypeUtilsKt.containsTypeAliasParameters(type)) {
                    TypeProjection typeProjection2 = kotlinType.getArguments().get(i);
                    TypeParameterDescriptor typeParameterDescriptor = kotlinType.getConstructor().getParameters().get(i);
                    if (this.shouldCheckBounds) {
                        TypeAliasExpansionReportStrategy typeAliasExpansionReportStrategy = this.reportStrategy;
                        KotlinType type2 = typeProjection2.getType();
                        type2.getClass();
                        KotlinType type3 = typeProjection.getType();
                        type3.getClass();
                        typeParameterDescriptor.getClass();
                        typeAliasExpansionReportStrategy.boundsViolationInSubstitution(create, type2, type3, typeParameterDescriptor);
                    }
                }
            }
            i = i2;
        }
    }

    private final SimpleType combineAttributes(SimpleType simpleType, TypeAttributes typeAttributes) {
        return KotlinTypeKt.isError(simpleType) ? simpleType : TypeSubstitutionKt.replace$default(simpleType, null, createdCombinedAttributes(simpleType, typeAttributes), 1, null);
    }

    private final SimpleType combineNullability(SimpleType simpleType, KotlinType kotlinType) {
        SimpleType makeNullableIfNeeded = TypeUtils.makeNullableIfNeeded(simpleType, kotlinType.isMarkedNullable());
        makeNullableIfNeeded.getClass();
        return makeNullableIfNeeded;
    }

    private final SimpleType combineNullabilityAndAnnotations(SimpleType simpleType, KotlinType kotlinType) {
        return combineAttributes(combineNullability(simpleType, kotlinType), kotlinType.getAttributes());
    }

    private final SimpleType createAbbreviation(TypeAliasExpansion typeAliasExpansion, TypeAttributes typeAttributes, boolean z) {
        TypeConstructor typeConstructor = typeAliasExpansion.getDescriptor().getTypeConstructor();
        typeConstructor.getClass();
        return KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(typeAttributes, typeConstructor, typeAliasExpansion.getArguments(), z, MemberScope.Empty.INSTANCE);
    }

    private final TypeAttributes createdCombinedAttributes(KotlinType kotlinType, TypeAttributes typeAttributes) {
        return KotlinTypeKt.isError(kotlinType) ? kotlinType.getAttributes() : typeAttributes.add(kotlinType.getAttributes());
    }

    private final TypeProjection expandNonArgumentTypeProjection(TypeProjection typeProjection, TypeAliasExpansion typeAliasExpansion, int i) {
        UnwrappedType unwrap = typeProjection.getType().unwrap();
        if (!DynamicTypesKt.isDynamic(unwrap)) {
            SimpleType asSimpleType = TypeSubstitutionKt.asSimpleType(unwrap);
            if (!KotlinTypeKt.isError(asSimpleType) && TypeUtilsKt.requiresTypeAliasExpansion(asSimpleType)) {
                TypeConstructor constructor = asSimpleType.getConstructor();
                ClassifierDescriptor mo893getDeclarationDescriptor = constructor.mo893getDeclarationDescriptor();
                constructor.getParameters().size();
                asSimpleType.getArguments().size();
                if (!(mo893getDeclarationDescriptor instanceof TypeParameterDescriptor)) {
                    if (!(mo893getDeclarationDescriptor instanceof TypeAliasDescriptor)) {
                        SimpleType substituteArguments = substituteArguments(asSimpleType, typeAliasExpansion, i);
                        checkTypeArgumentsSubstitution(asSimpleType, substituteArguments);
                        return new TypeProjectionImpl(typeProjection.getProjectionKind(), substituteArguments);
                    }
                    TypeAliasDescriptor typeAliasDescriptor = (TypeAliasDescriptor) mo893getDeclarationDescriptor;
                    if (typeAliasExpansion.isRecursion(typeAliasDescriptor)) {
                        this.reportStrategy.recursiveTypeAlias(typeAliasDescriptor);
                        Variance variance = Variance.INVARIANT;
                        ErrorTypeKind errorTypeKind = ErrorTypeKind.RECURSIVE_TYPE_ALIAS;
                        String name = typeAliasDescriptor.getName().toString();
                        name.getClass();
                        return new TypeProjectionImpl(variance, ErrorUtils.createErrorType(errorTypeKind, name));
                    }
                    List<TypeProjection> arguments = asSimpleType.getArguments();
                    ArrayList arrayList = new ArrayList(k13.r(arguments, 10));
                    int i2 = 0;
                    for (Object obj : arguments) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            b.q();
                            throw null;
                        }
                        arrayList.add(expandTypeProjection((TypeProjection) obj, typeAliasExpansion, constructor.getParameters().get(i2), i + 1));
                        i2 = i3;
                    }
                    SimpleType expandRecursively = expandRecursively(TypeAliasExpansion.Companion.create(typeAliasExpansion, typeAliasDescriptor, arrayList), asSimpleType.getAttributes(), asSimpleType.isMarkedNullable(), i + 1, false);
                    SimpleType substituteArguments2 = substituteArguments(asSimpleType, typeAliasExpansion, i);
                    if (!DynamicTypesKt.isDynamic(expandRecursively)) {
                        expandRecursively = SpecialTypesKt.withAbbreviation(expandRecursively, substituteArguments2);
                    }
                    return new TypeProjectionImpl(typeProjection.getProjectionKind(), expandRecursively);
                }
            }
        }
        return typeProjection;
    }

    private final SimpleType expandRecursively(TypeAliasExpansion typeAliasExpansion, TypeAttributes typeAttributes, boolean z, int i, boolean z2) {
        TypeProjection expandTypeProjection = expandTypeProjection(new TypeProjectionImpl(Variance.INVARIANT, typeAliasExpansion.getDescriptor().getUnderlyingType()), typeAliasExpansion, null, i);
        KotlinType type = expandTypeProjection.getType();
        type.getClass();
        SimpleType asSimpleType = TypeSubstitutionKt.asSimpleType(type);
        if (KotlinTypeKt.isError(asSimpleType)) {
            return asSimpleType;
        }
        expandTypeProjection.getProjectionKind();
        checkRepeatedAnnotations(asSimpleType.getAnnotations(), AnnotationsTypeAttributeKt.getAnnotations(typeAttributes));
        SimpleType makeNullableIfNeeded = TypeUtils.makeNullableIfNeeded(combineAttributes(asSimpleType, typeAttributes), z);
        makeNullableIfNeeded.getClass();
        return z2 ? SpecialTypesKt.withAbbreviation(makeNullableIfNeeded, createAbbreviation(typeAliasExpansion, typeAttributes, z)) : makeNullableIfNeeded;
    }

    private final TypeProjection expandTypeProjection(TypeProjection typeProjection, TypeAliasExpansion typeAliasExpansion, TypeParameterDescriptor typeParameterDescriptor, int i) {
        Variance variance;
        Variance variance2;
        Variance variance3;
        Companion.assertRecursionDepth(i, typeAliasExpansion.getDescriptor());
        if (typeProjection.isStarProjection()) {
            typeParameterDescriptor.getClass();
            TypeProjection makeStarProjection = TypeUtils.makeStarProjection(typeParameterDescriptor);
            makeStarProjection.getClass();
            return makeStarProjection;
        }
        KotlinType type = typeProjection.getType();
        type.getClass();
        TypeProjection replacement = typeAliasExpansion.getReplacement(type.getConstructor());
        if (replacement == null) {
            return expandNonArgumentTypeProjection(typeProjection, typeAliasExpansion, i);
        }
        if (replacement.isStarProjection()) {
            typeParameterDescriptor.getClass();
            TypeProjection makeStarProjection2 = TypeUtils.makeStarProjection(typeParameterDescriptor);
            makeStarProjection2.getClass();
            return makeStarProjection2;
        }
        UnwrappedType unwrap = replacement.getType().unwrap();
        Variance projectionKind = replacement.getProjectionKind();
        projectionKind.getClass();
        Variance projectionKind2 = typeProjection.getProjectionKind();
        projectionKind2.getClass();
        if (projectionKind2 != projectionKind && projectionKind2 != (variance3 = Variance.INVARIANT)) {
            if (projectionKind == variance3) {
                projectionKind = projectionKind2;
            } else {
                this.reportStrategy.conflictingProjection(typeAliasExpansion.getDescriptor(), typeParameterDescriptor, unwrap);
            }
        }
        if (typeParameterDescriptor == null || (variance = typeParameterDescriptor.getVariance()) == null) {
            variance = Variance.INVARIANT;
        }
        variance.getClass();
        if (variance != projectionKind && variance != (variance2 = Variance.INVARIANT)) {
            if (projectionKind == variance2) {
                projectionKind = variance2;
            } else {
                this.reportStrategy.conflictingProjection(typeAliasExpansion.getDescriptor(), typeParameterDescriptor, unwrap);
            }
        }
        checkRepeatedAnnotations(type.getAnnotations(), unwrap.getAnnotations());
        return new TypeProjectionImpl(projectionKind, unwrap instanceof DynamicType ? combineAttributes((DynamicType) unwrap, type.getAttributes()) : combineNullabilityAndAnnotations(TypeSubstitutionKt.asSimpleType(unwrap), type));
    }

    private final SimpleType substituteArguments(SimpleType simpleType, TypeAliasExpansion typeAliasExpansion, int i) {
        TypeConstructor constructor = simpleType.getConstructor();
        List<TypeProjection> arguments = simpleType.getArguments();
        ArrayList arrayList = new ArrayList(k13.r(arguments, 10));
        int i2 = 0;
        for (Object obj : arguments) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                b.q();
                throw null;
            }
            TypeProjection typeProjection = (TypeProjection) obj;
            TypeProjection expandTypeProjection = expandTypeProjection(typeProjection, typeAliasExpansion, constructor.getParameters().get(i2), i + 1);
            if (!expandTypeProjection.isStarProjection()) {
                expandTypeProjection = new TypeProjectionImpl(expandTypeProjection.getProjectionKind(), TypeUtils.makeNullableIfNeeded(expandTypeProjection.getType(), typeProjection.getType().isMarkedNullable()));
            }
            arrayList.add(expandTypeProjection);
            i2 = i3;
        }
        return TypeSubstitutionKt.replace$default(simpleType, arrayList, null, 2, null);
    }

    @NotNull
    public final SimpleType expand(@NotNull TypeAliasExpansion typeAliasExpansion, @NotNull TypeAttributes typeAttributes) {
        typeAliasExpansion.getClass();
        typeAttributes.getClass();
        return expandRecursively(typeAliasExpansion, typeAttributes, false, 0, true);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void assertRecursionDepth(int i, TypeAliasDescriptor typeAliasDescriptor) {
            if (i <= 100) {
                return;
            }
            sw9.p(typeAliasDescriptor.getName(), "Too deep recursion while expanding type alias ");
        }

        private Companion() {
        }
    }

    private final DynamicType combineAttributes(DynamicType dynamicType, TypeAttributes typeAttributes) {
        return dynamicType.replaceAttributes(createdCombinedAttributes(dynamicType, typeAttributes));
    }
}
