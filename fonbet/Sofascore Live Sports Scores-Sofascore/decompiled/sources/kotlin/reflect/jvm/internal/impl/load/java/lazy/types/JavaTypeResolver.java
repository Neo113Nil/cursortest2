package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import defpackage.k13;
import defpackage.nh0;
import defpackage.ogj;
import defpackage.sc5;
import defpackage.sw9;
import defpackage.yhk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMapper;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.UtilsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.TypeParameterResolver;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifier;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPrimitiveType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypesKt;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.LazyWrappedType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class JavaTypeResolver {

    @NotNull
    private final LazyJavaResolverContext c;

    @NotNull
    private final RawProjectionComputer projectionComputer;

    @NotNull
    private final TypeParameterResolver typeParameterResolver;

    @NotNull
    private final TypeParameterUpperBoundEraser typeParameterUpperBoundEraser;

    /* JADX WARN: Multi-variable type inference failed */
    public JavaTypeResolver(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull TypeParameterResolver typeParameterResolver) {
        lazyJavaResolverContext.getClass();
        typeParameterResolver.getClass();
        this.c = lazyJavaResolverContext;
        this.typeParameterResolver = typeParameterResolver;
        RawProjectionComputer rawProjectionComputer = new RawProjectionComputer();
        this.projectionComputer = rawProjectionComputer;
        this.typeParameterUpperBoundEraser = new TypeParameterUpperBoundEraser(rawProjectionComputer, null, 2, 0 == true ? 1 : 0);
    }

    private final boolean argumentsMakeSenseOnlyForMutableContainer(JavaClassifierType javaClassifierType, ClassDescriptor classDescriptor) {
        Variance variance;
        if (!JavaTypesKt.isSuperWildcard((JavaType) CollectionsKt.j0(javaClassifierType.getTypeArguments()))) {
            return false;
        }
        List<TypeParameterDescriptor> parameters = JavaToKotlinClassMapper.INSTANCE.convertReadOnlyToMutable(classDescriptor).getTypeConstructor().getParameters();
        parameters.getClass();
        TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) CollectionsKt.j0(parameters);
        return (typeParameterDescriptor == null || (variance = typeParameterDescriptor.getVariance()) == null || variance == Variance.OUT_VARIANCE) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if (r0.isEmpty() == false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final List<TypeProjection> computeArguments(JavaClassifierType javaClassifierType, JavaTypeAttributes javaTypeAttributes, TypeConstructor typeConstructor) {
        boolean z;
        if (!javaClassifierType.isRaw()) {
            if (javaClassifierType.getTypeArguments().isEmpty()) {
                List<TypeParameterDescriptor> parameters = typeConstructor.getParameters();
                parameters.getClass();
            }
            z = false;
            List<TypeParameterDescriptor> parameters2 = typeConstructor.getParameters();
            parameters2.getClass();
            if (!z) {
                return computeRawTypeArguments(javaClassifierType, parameters2, typeConstructor, javaTypeAttributes);
            }
            if (parameters2.size() != javaClassifierType.getTypeArguments().size()) {
                ArrayList arrayList = new ArrayList(k13.r(parameters2, 10));
                for (TypeParameterDescriptor typeParameterDescriptor : parameters2) {
                    ErrorTypeKind errorTypeKind = ErrorTypeKind.MISSED_TYPE_ARGUMENT_FOR_TYPE_PARAMETER;
                    String asString = typeParameterDescriptor.getName().asString();
                    asString.getClass();
                    arrayList.add(new TypeProjectionImpl(ErrorUtils.createErrorType(errorTypeKind, asString)));
                }
                return CollectionsKt.S0(arrayList);
            }
            nh0 X0 = CollectionsKt.X0(javaClassifierType.getTypeArguments());
            ArrayList arrayList2 = new ArrayList(k13.r(X0, 10));
            Iterator it = X0.iterator();
            while (true) {
                sc5 sc5Var = (sc5) it;
                if (!sc5Var.b.hasNext()) {
                    return CollectionsKt.S0(arrayList2);
                }
                IndexedValue indexedValue = (IndexedValue) sc5Var.next();
                int i = indexedValue.a;
                JavaType javaType = (JavaType) indexedValue.b;
                parameters2.size();
                TypeParameterDescriptor typeParameterDescriptor2 = parameters2.get(i);
                JavaTypeAttributes attributes$default = JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, false, false, null, 7, null);
                typeParameterDescriptor2.getClass();
                arrayList2.add(transformToTypeProjection(javaType, attributes$default, typeParameterDescriptor2));
            }
        }
        z = true;
        List<TypeParameterDescriptor> parameters22 = typeConstructor.getParameters();
        parameters22.getClass();
        if (!z) {
        }
    }

    private final List<TypeProjection> computeRawTypeArguments(JavaClassifierType javaClassifierType, List<? extends TypeParameterDescriptor> list, TypeConstructor typeConstructor, JavaTypeAttributes javaTypeAttributes) {
        JavaTypeResolver javaTypeResolver;
        JavaClassifierType javaClassifierType2;
        TypeConstructor typeConstructor2;
        JavaTypeAttributes javaTypeAttributes2;
        TypeProjection computeProjection;
        ArrayList arrayList = new ArrayList(k13.r(list, 10));
        for (TypeParameterDescriptor typeParameterDescriptor : list) {
            if (TypeUtilsKt.hasTypeParameterRecursiveBounds(typeParameterDescriptor, null, javaTypeAttributes.getVisitedTypeParameters())) {
                computeProjection = TypeUtils.makeStarProjection(typeParameterDescriptor, javaTypeAttributes);
                javaTypeResolver = this;
                javaClassifierType2 = javaClassifierType;
                typeConstructor2 = typeConstructor;
                javaTypeAttributes2 = javaTypeAttributes;
            } else {
                javaTypeResolver = this;
                javaClassifierType2 = javaClassifierType;
                typeConstructor2 = typeConstructor;
                javaTypeAttributes2 = javaTypeAttributes;
                computeProjection = javaTypeResolver.projectionComputer.computeProjection(typeParameterDescriptor, javaTypeAttributes2.markIsRaw(javaClassifierType2.isRaw()), javaTypeResolver.typeParameterUpperBoundEraser, new LazyWrappedType(this.c.getStorageManager(), new JavaTypeResolver$computeRawTypeArguments$1$erasedUpperBound$1(javaTypeResolver, typeParameterDescriptor, javaTypeAttributes2, typeConstructor2, javaClassifierType2)));
            }
            arrayList.add(computeProjection);
            this = javaTypeResolver;
            javaTypeAttributes = javaTypeAttributes2;
            typeConstructor = typeConstructor2;
            javaClassifierType = javaClassifierType2;
        }
        return arrayList;
    }

    private final SimpleType computeSimpleJavaClassifierType(JavaClassifierType javaClassifierType, JavaTypeAttributes javaTypeAttributes, SimpleType simpleType) {
        JavaClassifierType javaClassifierType2;
        TypeAttributes defaultAttributes;
        if (simpleType == null || (defaultAttributes = simpleType.getAttributes()) == null) {
            javaClassifierType2 = javaClassifierType;
            defaultAttributes = TypeAttributesKt.toDefaultAttributes(new LazyJavaAnnotations(this.c, javaClassifierType2, false, 4, null));
        } else {
            javaClassifierType2 = javaClassifierType;
        }
        TypeAttributes typeAttributes = defaultAttributes;
        TypeConstructor computeTypeConstructor = computeTypeConstructor(javaClassifierType2, javaTypeAttributes);
        if (computeTypeConstructor == null) {
            return null;
        }
        boolean isNullable = isNullable(javaTypeAttributes);
        return (Intrinsics.c(simpleType != null ? simpleType.getConstructor() : null, computeTypeConstructor) && !javaClassifierType2.isRaw() && isNullable) ? simpleType.makeNullableAsSpecified(true) : KotlinTypeFactory.simpleType$default(typeAttributes, computeTypeConstructor, computeArguments(javaClassifierType2, javaTypeAttributes, computeTypeConstructor), isNullable, (KotlinTypeRefiner) null, 16, (Object) null);
    }

    private final TypeConstructor computeTypeConstructor(JavaClassifierType javaClassifierType, JavaTypeAttributes javaTypeAttributes) {
        TypeConstructor typeConstructor;
        JavaClassifier classifier = javaClassifierType.getClassifier();
        if (classifier == null) {
            return createNotFoundClass(javaClassifierType);
        }
        if (!(classifier instanceof JavaClass)) {
            if (!(classifier instanceof JavaTypeParameter)) {
                yhk.r(classifier, "Unknown classifier kind: ");
                return null;
            }
            TypeParameterDescriptor resolveTypeParameter = this.typeParameterResolver.resolveTypeParameter((JavaTypeParameter) classifier);
            if (resolveTypeParameter != null) {
                return resolveTypeParameter.getTypeConstructor();
            }
            return null;
        }
        JavaClass javaClass = (JavaClass) classifier;
        FqName fqName = javaClass.getFqName();
        if (fqName == null) {
            sw9.p(classifier, "Class type should have a FQ name: ");
            return null;
        }
        ClassDescriptor mapKotlinClass = mapKotlinClass(javaClassifierType, javaTypeAttributes, fqName);
        if (mapKotlinClass == null) {
            mapKotlinClass = this.c.getComponents().getModuleClassResolver().resolveClass(javaClass);
        }
        return (mapKotlinClass == null || (typeConstructor = mapKotlinClass.getTypeConstructor()) == null) ? createNotFoundClass(javaClassifierType) : typeConstructor;
    }

    private final TypeConstructor createNotFoundClass(JavaClassifierType javaClassifierType) {
        ClassId classId = ClassId.topLevel(new FqName(javaClassifierType.getClassifierQualifiedName()));
        classId.getClass();
        TypeConstructor typeConstructor = this.c.getComponents().getDeserializedDescriptorResolver().getComponents().getNotFoundClasses().getClass(classId, a.c(0)).getTypeConstructor();
        typeConstructor.getClass();
        return typeConstructor;
    }

    private final boolean isConflictingArgumentFor(Variance variance, TypeParameterDescriptor typeParameterDescriptor) {
        return (typeParameterDescriptor.getVariance() == Variance.INVARIANT || variance == typeParameterDescriptor.getVariance()) ? false : true;
    }

    private final boolean isNullable(JavaTypeAttributes javaTypeAttributes) {
        return (javaTypeAttributes.getFlexibility() == JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND || javaTypeAttributes.isForAnnotationParameter() || javaTypeAttributes.getHowThisTypeIsUsed() == TypeUsage.SUPERTYPE) ? false : true;
    }

    private final ClassDescriptor mapKotlinClass(JavaClassifierType javaClassifierType, JavaTypeAttributes javaTypeAttributes, FqName fqName) {
        FqName fqName2;
        if (javaTypeAttributes.isForAnnotationParameter()) {
            fqName2 = JavaTypeResolverKt.JAVA_LANG_CLASS_FQ_NAME;
            if (Intrinsics.c(fqName, fqName2)) {
                return this.c.getComponents().getReflectionTypes().getKClass();
            }
        }
        JavaToKotlinClassMapper javaToKotlinClassMapper = JavaToKotlinClassMapper.INSTANCE;
        ClassDescriptor mapJavaToKotlin$default = JavaToKotlinClassMapper.mapJavaToKotlin$default(javaToKotlinClassMapper, fqName, this.c.getModule().getBuiltIns(), null, 4, null);
        if (mapJavaToKotlin$default == null) {
            return null;
        }
        return (javaToKotlinClassMapper.isReadOnly(mapJavaToKotlin$default) && (javaTypeAttributes.getFlexibility() == JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND || javaTypeAttributes.getHowThisTypeIsUsed() == TypeUsage.SUPERTYPE || argumentsMakeSenseOnlyForMutableContainer(javaClassifierType, mapJavaToKotlin$default))) ? javaToKotlinClassMapper.convertReadOnlyToMutable(mapJavaToKotlin$default) : mapJavaToKotlin$default;
    }

    public static /* synthetic */ KotlinType transformArrayType$default(JavaTypeResolver javaTypeResolver, JavaArrayType javaArrayType, JavaTypeAttributes javaTypeAttributes, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return javaTypeResolver.transformArrayType(javaArrayType, javaTypeAttributes, z);
    }

    private final KotlinType transformJavaClassifierType(JavaClassifierType javaClassifierType, JavaTypeAttributes javaTypeAttributes) {
        boolean z = (javaTypeAttributes.isForAnnotationParameter() || javaTypeAttributes.getHowThisTypeIsUsed() == TypeUsage.SUPERTYPE) ? false : true;
        boolean isRaw = javaClassifierType.isRaw();
        if (!isRaw && !z) {
            SimpleType computeSimpleJavaClassifierType = computeSimpleJavaClassifierType(javaClassifierType, javaTypeAttributes, null);
            return computeSimpleJavaClassifierType != null ? computeSimpleJavaClassifierType : transformJavaClassifierType$errorType(javaClassifierType);
        }
        SimpleType computeSimpleJavaClassifierType2 = computeSimpleJavaClassifierType(javaClassifierType, javaTypeAttributes.withFlexibility(JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND), null);
        if (computeSimpleJavaClassifierType2 == null) {
            return transformJavaClassifierType$errorType(javaClassifierType);
        }
        SimpleType computeSimpleJavaClassifierType3 = computeSimpleJavaClassifierType(javaClassifierType, javaTypeAttributes.withFlexibility(JavaTypeFlexibility.FLEXIBLE_UPPER_BOUND), computeSimpleJavaClassifierType2);
        return computeSimpleJavaClassifierType3 == null ? transformJavaClassifierType$errorType(javaClassifierType) : isRaw ? new RawTypeImpl(computeSimpleJavaClassifierType2, computeSimpleJavaClassifierType3) : KotlinTypeFactory.flexibleType(computeSimpleJavaClassifierType2, computeSimpleJavaClassifierType3);
    }

    private static final ErrorType transformJavaClassifierType$errorType(JavaClassifierType javaClassifierType) {
        return ErrorUtils.createErrorType(ErrorTypeKind.UNRESOLVED_JAVA_CLASS, javaClassifierType.getPresentableText());
    }

    private final TypeProjection transformToTypeProjection(JavaType javaType, JavaTypeAttributes javaTypeAttributes, TypeParameterDescriptor typeParameterDescriptor) {
        TypeProjection makeStarProjection;
        if (!(javaType instanceof JavaWildcardType)) {
            return new TypeProjectionImpl(Variance.INVARIANT, transformJavaType(javaType, javaTypeAttributes));
        }
        JavaWildcardType javaWildcardType = (JavaWildcardType) javaType;
        JavaType bound = javaWildcardType.getBound();
        Variance variance = javaWildcardType.isExtends() ? Variance.OUT_VARIANCE : Variance.IN_VARIANCE;
        if (bound == null || isConflictingArgumentFor(variance, typeParameterDescriptor)) {
            makeStarProjection = TypeUtils.makeStarProjection(typeParameterDescriptor, javaTypeAttributes);
        } else {
            AnnotationDescriptor extractNullabilityAnnotationOnBoundedWildcard = UtilsKt.extractNullabilityAnnotationOnBoundedWildcard(this.c, javaWildcardType);
            KotlinType transformJavaType = transformJavaType(bound, JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, false, false, null, 7, null));
            if (extractNullabilityAnnotationOnBoundedWildcard != null) {
                transformJavaType = TypeUtilsKt.replaceAnnotations(transformJavaType, Annotations.Companion.create(CollectionsKt.v0(transformJavaType.getAnnotations(), extractNullabilityAnnotationOnBoundedWildcard)));
            }
            makeStarProjection = TypeUtilsKt.createProjection(transformJavaType, variance, typeParameterDescriptor);
        }
        makeStarProjection.getClass();
        return makeStarProjection;
    }

    @NotNull
    public final KotlinType transformArrayType(@NotNull JavaArrayType javaArrayType, @NotNull JavaTypeAttributes javaTypeAttributes, boolean z) {
        javaArrayType.getClass();
        javaTypeAttributes.getClass();
        JavaType componentType = javaArrayType.getComponentType();
        JavaPrimitiveType javaPrimitiveType = componentType instanceof JavaPrimitiveType ? (JavaPrimitiveType) componentType : null;
        PrimitiveType type = javaPrimitiveType != null ? javaPrimitiveType.getType() : null;
        LazyJavaAnnotations lazyJavaAnnotations = new LazyJavaAnnotations(this.c, javaArrayType, true);
        if (type != null) {
            SimpleType primitiveArrayKotlinType = this.c.getModule().getBuiltIns().getPrimitiveArrayKotlinType(type);
            primitiveArrayKotlinType.getClass();
            KotlinType replaceAnnotations = TypeUtilsKt.replaceAnnotations(primitiveArrayKotlinType, new CompositeAnnotations(primitiveArrayKotlinType.getAnnotations(), lazyJavaAnnotations));
            replaceAnnotations.getClass();
            SimpleType simpleType = (SimpleType) replaceAnnotations;
            return javaTypeAttributes.isForAnnotationParameter() ? simpleType : KotlinTypeFactory.flexibleType(simpleType, simpleType.makeNullableAsSpecified(true));
        }
        KotlinType transformJavaType = transformJavaType(componentType, JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, javaTypeAttributes.isForAnnotationParameter(), false, null, 6, null));
        if (javaTypeAttributes.isForAnnotationParameter()) {
            SimpleType arrayType = this.c.getModule().getBuiltIns().getArrayType(z ? Variance.OUT_VARIANCE : Variance.INVARIANT, transformJavaType, lazyJavaAnnotations);
            arrayType.getClass();
            return arrayType;
        }
        SimpleType arrayType2 = this.c.getModule().getBuiltIns().getArrayType(Variance.INVARIANT, transformJavaType, lazyJavaAnnotations);
        arrayType2.getClass();
        return KotlinTypeFactory.flexibleType(arrayType2, this.c.getModule().getBuiltIns().getArrayType(Variance.OUT_VARIANCE, transformJavaType, lazyJavaAnnotations).makeNullableAsSpecified(true));
    }

    @NotNull
    public final KotlinType transformJavaType(@Nullable JavaType javaType, @NotNull JavaTypeAttributes javaTypeAttributes) {
        KotlinType transformJavaType;
        javaTypeAttributes.getClass();
        if (javaType instanceof JavaPrimitiveType) {
            PrimitiveType type = ((JavaPrimitiveType) javaType).getType();
            LazyJavaResolverContext lazyJavaResolverContext = this.c;
            SimpleType primitiveKotlinType = type != null ? lazyJavaResolverContext.getModule().getBuiltIns().getPrimitiveKotlinType(type) : lazyJavaResolverContext.getModule().getBuiltIns().getUnitType();
            primitiveKotlinType.getClass();
            return primitiveKotlinType;
        }
        if (javaType instanceof JavaClassifierType) {
            return transformJavaClassifierType((JavaClassifierType) javaType, javaTypeAttributes);
        }
        if (javaType instanceof JavaArrayType) {
            return transformArrayType$default(this, (JavaArrayType) javaType, javaTypeAttributes, false, 4, null);
        }
        if (!(javaType instanceof JavaWildcardType)) {
            if (javaType != null) {
                ogj.i(javaType, "Unsupported type: ");
                return null;
            }
            SimpleType defaultBound = this.c.getModule().getBuiltIns().getDefaultBound();
            defaultBound.getClass();
            return defaultBound;
        }
        JavaType bound = ((JavaWildcardType) javaType).getBound();
        if (bound != null && (transformJavaType = transformJavaType(bound, javaTypeAttributes)) != null) {
            return transformJavaType;
        }
        SimpleType defaultBound2 = this.c.getModule().getBuiltIns().getDefaultBound();
        defaultBound2.getClass();
        return defaultBound2;
    }
}
