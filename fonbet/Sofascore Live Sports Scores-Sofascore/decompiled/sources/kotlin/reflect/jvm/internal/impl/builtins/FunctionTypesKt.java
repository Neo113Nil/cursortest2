package kotlin.reflect.jvm.internal.impl.builtins;

import defpackage.k13;
import defpackage.km5;
import defpackage.lm5;
import defpackage.sub;
import defpackage.tub;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKindExtractor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.BuiltInAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class FunctionTypesKt {
    public static final int contextFunctionTypeParamsCount(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        AnnotationDescriptor mo887findAnnotation = kotlinType.getAnnotations().mo887findAnnotation(StandardNames.FqNames.contextFunctionTypeParams);
        if (mo887findAnnotation == null) {
            return 0;
        }
        ConstantValue constantValue = (ConstantValue) tub.e(StandardNames.CONTEXT_FUNCTION_TYPE_PARAMETER_COUNT_NAME, mo887findAnnotation.getAllValueArguments());
        constantValue.getClass();
        return ((IntValue) constantValue).getValue().intValue();
    }

    @NotNull
    public static final SimpleType createFunctionType(@NotNull KotlinBuiltIns kotlinBuiltIns, @NotNull Annotations annotations, @Nullable KotlinType kotlinType, @NotNull List<? extends KotlinType> list, @NotNull List<? extends KotlinType> list2, @Nullable List<Name> list3, @NotNull KotlinType kotlinType2, boolean z) {
        kotlinBuiltIns.getClass();
        annotations.getClass();
        list.getClass();
        list2.getClass();
        kotlinType2.getClass();
        List<TypeProjection> functionTypeArgumentProjections = getFunctionTypeArgumentProjections(kotlinType, list, list2, list3, kotlinType2, kotlinBuiltIns);
        ClassDescriptor functionDescriptor = getFunctionDescriptor(kotlinBuiltIns, list.size() + list2.size() + (kotlinType == null ? 0 : 1), z);
        if (kotlinType != null) {
            annotations = withExtensionFunctionAnnotation(annotations, kotlinBuiltIns);
        }
        if (!list.isEmpty()) {
            annotations = withContextReceiversFunctionAnnotation(annotations, kotlinBuiltIns, list.size());
        }
        return KotlinTypeFactory.simpleNotNullType(TypeAttributesKt.toDefaultAttributes(annotations), functionDescriptor, functionTypeArgumentProjections);
    }

    @Nullable
    public static final Name extractParameterNameFromFunctionTypeArgument(@NotNull KotlinType kotlinType) {
        String value;
        kotlinType.getClass();
        AnnotationDescriptor mo887findAnnotation = kotlinType.getAnnotations().mo887findAnnotation(StandardNames.FqNames.parameterName);
        if (mo887findAnnotation == null) {
            return null;
        }
        Object E0 = CollectionsKt.E0(mo887findAnnotation.getAllValueArguments().values());
        StringValue stringValue = E0 instanceof StringValue ? (StringValue) E0 : null;
        if (stringValue != null && (value = stringValue.getValue()) != null) {
            if (!Name.isValidIdentifier(value)) {
                value = null;
            }
            if (value != null) {
                return Name.identifier(value);
            }
        }
        return null;
    }

    @NotNull
    public static final List<KotlinType> getContextReceiverTypesFromFunctionType(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        isBuiltinFunctionalType(kotlinType);
        int contextFunctionTypeParamsCount = contextFunctionTypeParamsCount(kotlinType);
        if (contextFunctionTypeParamsCount == 0) {
            return km5.a;
        }
        List<TypeProjection> subList = kotlinType.getArguments().subList(0, contextFunctionTypeParamsCount);
        ArrayList arrayList = new ArrayList(k13.r(subList, 10));
        Iterator<T> it = subList.iterator();
        while (it.hasNext()) {
            KotlinType type = ((TypeProjection) it.next()).getType();
            type.getClass();
            arrayList.add(type);
        }
        return arrayList;
    }

    @NotNull
    public static final ClassDescriptor getFunctionDescriptor(@NotNull KotlinBuiltIns kotlinBuiltIns, int i, boolean z) {
        kotlinBuiltIns.getClass();
        ClassDescriptor suspendFunction = z ? kotlinBuiltIns.getSuspendFunction(i) : kotlinBuiltIns.getFunction(i);
        suspendFunction.getClass();
        return suspendFunction;
    }

    @NotNull
    public static final List<TypeProjection> getFunctionTypeArgumentProjections(@Nullable KotlinType kotlinType, @NotNull List<? extends KotlinType> list, @NotNull List<? extends KotlinType> list2, @Nullable List<Name> list3, @NotNull KotlinType kotlinType2, @NotNull KotlinBuiltIns kotlinBuiltIns) {
        Name name;
        KotlinBuiltIns kotlinBuiltIns2;
        list.getClass();
        list2.getClass();
        kotlinType2.getClass();
        kotlinBuiltIns.getClass();
        int i = 0;
        ArrayList arrayList = new ArrayList(list.size() + list2.size() + (kotlinType != null ? 1 : 0) + 1);
        ArrayList arrayList2 = new ArrayList(k13.r(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(TypeUtilsKt.asTypeProjection((KotlinType) it.next()));
        }
        arrayList.addAll(arrayList2);
        kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.addIfNotNull(arrayList, kotlinType != null ? TypeUtilsKt.asTypeProjection(kotlinType) : null);
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                b.q();
                throw null;
            }
            KotlinType kotlinType3 = (KotlinType) obj;
            if (list3 == null || (name = list3.get(i)) == null || name.isSpecial()) {
                name = null;
            }
            if (name != null) {
                FqName fqName = StandardNames.FqNames.parameterName;
                Name identifier = Name.identifier("name");
                String asString = name.asString();
                asString.getClass();
                kotlinBuiltIns2 = kotlinBuiltIns;
                kotlinType3 = TypeUtilsKt.replaceAnnotations(kotlinType3, Annotations.Companion.create(CollectionsKt.v0(kotlinType3.getAnnotations(), new BuiltInAnnotationDescriptor(kotlinBuiltIns2, fqName, sub.d(new Pair(identifier, new StringValue(asString))), false, 8, null))));
            } else {
                kotlinBuiltIns2 = kotlinBuiltIns;
            }
            arrayList.add(TypeUtilsKt.asTypeProjection(kotlinType3));
            i = i2;
            kotlinBuiltIns = kotlinBuiltIns2;
        }
        arrayList.add(TypeUtilsKt.asTypeProjection(kotlinType2));
        return arrayList;
    }

    private static final FunctionTypeKind getFunctionTypeKind(FqNameUnsafe fqNameUnsafe) {
        if (!fqNameUnsafe.isSafe() || fqNameUnsafe.isRoot()) {
            return null;
        }
        FunctionTypeKindExtractor functionTypeKindExtractor = FunctionTypeKindExtractor.Companion.getDefault();
        FqName parent = fqNameUnsafe.toSafe().parent();
        parent.getClass();
        String asString = fqNameUnsafe.shortName().asString();
        asString.getClass();
        return functionTypeKindExtractor.getFunctionalClassKind(parent, asString);
    }

    @Nullable
    public static final KotlinType getReceiverTypeFromFunctionType(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        isBuiltinFunctionalType(kotlinType);
        if (!isTypeAnnotatedWithExtensionFunctionType(kotlinType)) {
            return null;
        }
        return kotlinType.getArguments().get(contextFunctionTypeParamsCount(kotlinType)).getType();
    }

    @NotNull
    public static final KotlinType getReturnTypeFromFunctionType(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        isBuiltinFunctionalType(kotlinType);
        KotlinType type = ((TypeProjection) CollectionsKt.h0(kotlinType.getArguments())).getType();
        type.getClass();
        return type;
    }

    @NotNull
    public static final List<TypeProjection> getValueParameterTypesFromFunctionType(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        isBuiltinFunctionalType(kotlinType);
        return kotlinType.getArguments().subList((isBuiltinExtensionFunctionalType(kotlinType) ? 1 : 0) + contextFunctionTypeParamsCount(kotlinType), r0.size() - 1);
    }

    public static final boolean isBuiltinExtensionFunctionalType(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        return isBuiltinFunctionalType(kotlinType) && isTypeAnnotatedWithExtensionFunctionType(kotlinType);
    }

    public static final boolean isBuiltinFunctionalClassDescriptor(@NotNull DeclarationDescriptor declarationDescriptor) {
        declarationDescriptor.getClass();
        FunctionTypeKind functionTypeKind = getFunctionTypeKind(declarationDescriptor);
        return Intrinsics.c(functionTypeKind, FunctionTypeKind.Function.INSTANCE) || Intrinsics.c(functionTypeKind, FunctionTypeKind.SuspendFunction.INSTANCE);
    }

    public static final boolean isBuiltinFunctionalType(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        ClassifierDescriptor mo893getDeclarationDescriptor = kotlinType.getConstructor().mo893getDeclarationDescriptor();
        return mo893getDeclarationDescriptor != null && isBuiltinFunctionalClassDescriptor(mo893getDeclarationDescriptor);
    }

    public static final boolean isFunctionType(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        return Intrinsics.c(getFunctionTypeKind(kotlinType), FunctionTypeKind.Function.INSTANCE);
    }

    public static final boolean isSuspendFunctionType(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        return Intrinsics.c(getFunctionTypeKind(kotlinType), FunctionTypeKind.SuspendFunction.INSTANCE);
    }

    private static final boolean isTypeAnnotatedWithExtensionFunctionType(KotlinType kotlinType) {
        return kotlinType.getAnnotations().mo887findAnnotation(StandardNames.FqNames.extensionFunctionType) != null;
    }

    @NotNull
    public static final Annotations withContextReceiversFunctionAnnotation(@NotNull Annotations annotations, @NotNull KotlinBuiltIns kotlinBuiltIns, int i) {
        annotations.getClass();
        kotlinBuiltIns.getClass();
        FqName fqName = StandardNames.FqNames.contextFunctionTypeParams;
        if (annotations.hasAnnotation(fqName)) {
            return annotations;
        }
        return Annotations.Companion.create(CollectionsKt.v0(annotations, new BuiltInAnnotationDescriptor(kotlinBuiltIns, fqName, sub.d(new Pair(StandardNames.CONTEXT_FUNCTION_TYPE_PARAMETER_COUNT_NAME, new IntValue(i))), false, 8, null)));
    }

    @NotNull
    public static final Annotations withExtensionFunctionAnnotation(@NotNull Annotations annotations, @NotNull KotlinBuiltIns kotlinBuiltIns) {
        annotations.getClass();
        kotlinBuiltIns.getClass();
        FqName fqName = StandardNames.FqNames.extensionFunctionType;
        if (annotations.hasAnnotation(fqName)) {
            return annotations;
        }
        Annotations.Companion companion = Annotations.Companion;
        lm5 lm5Var = lm5.a;
        lm5Var.getClass();
        return companion.create(CollectionsKt.v0(annotations, new BuiltInAnnotationDescriptor(kotlinBuiltIns, fqName, lm5Var, false, 8, null)));
    }

    @Nullable
    public static final FunctionTypeKind getFunctionTypeKind(@NotNull DeclarationDescriptor declarationDescriptor) {
        declarationDescriptor.getClass();
        if ((declarationDescriptor instanceof ClassDescriptor) && KotlinBuiltIns.isUnderKotlinPackage(declarationDescriptor)) {
            return getFunctionTypeKind(DescriptorUtilsKt.getFqNameUnsafe(declarationDescriptor));
        }
        return null;
    }

    @Nullable
    public static final FunctionTypeKind getFunctionTypeKind(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        ClassifierDescriptor mo893getDeclarationDescriptor = kotlinType.getConstructor().mo893getDeclarationDescriptor();
        if (mo893getDeclarationDescriptor != null) {
            return getFunctionTypeKind(mo893getDeclarationDescriptor);
        }
        return null;
    }
}
