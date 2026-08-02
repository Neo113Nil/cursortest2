package kotlin.reflect.jvm.internal.calls;

import com.sofascore.model.mvvm.model.PlayerKt;
import defpackage.k13;
import defpackage.o13;
import defpackage.sw9;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.UtilKt;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.MultiFieldValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.ClassMapperLite;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a'\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\f\u0010\r\u001a/\u0010\u0014\u001a\u00020\u0013*\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a1\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00110\u0016H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a=\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\n\b\u0000\u0010\u001d*\u0004\u0018\u00010\u001c*\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0013\u0010 \u001a\u00020\u0011*\u00020\u0006H\u0002¢\u0006\u0004\b \u0010!\u001a\u001f\u0010#\u001a\u00020\t*\u0006\u0012\u0002\b\u00030\"2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b#\u0010$\u001a\u001f\u0010%\u001a\u00020\t*\u0006\u0012\u0002\b\u00030\"2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b%\u0010$\u001a\u0019\u0010&\u001a\b\u0012\u0002\b\u0003\u0018\u00010\"*\u00020\u0019H\u0002¢\u0006\u0004\b&\u0010'\u001a\u001b\u0010&\u001a\b\u0012\u0002\b\u0003\u0018\u00010\"*\u0004\u0018\u00010(H\u0000¢\u0006\u0004\b&\u0010)\u001a\u001f\u0010+\u001a\u0004\u0018\u00010**\u0004\u0018\u00010*2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b+\u0010,\"\u001a\u0010/\u001a\u0004\u0018\u00010\u0019*\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"Lkotlin/reflect/jvm/internal/impl/descriptors/ClassifierDescriptor;", "", "toJvmDescriptor", "(Lkotlin/reflect/jvm/internal/impl/descriptors/ClassifierDescriptor;)Ljava/lang/String;", "Lkotlin/reflect/jvm/internal/impl/types/SimpleType;", "type", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "descriptor", "", "Ljava/lang/reflect/Method;", "getValueClassUnboxMethods", "(Lkotlin/reflect/jvm/internal/impl/types/SimpleType;Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;)Ljava/util/List;", "getMfvcUnboxMethods", "(Lkotlin/reflect/jvm/internal/impl/types/SimpleType;)Ljava/util/List;", "Lkotlin/reflect/jvm/internal/calls/Caller;", "", "expectedArgsSize", "", "isDefault", "", "checkParametersSize", "(Lkotlin/reflect/jvm/internal/calls/Caller;ILkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;Z)V", "Lkotlin/Function1;", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "isSpecificClass", "Lkotlin/reflect/jvm/internal/impl/types/KotlinType;", "makeKotlinParameterTypes", "(Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "Ljava/lang/reflect/Member;", PlayerKt.FOOTBALL_MIDFIELDER, "createValueClassAwareCallerIfNeeded", "(Lkotlin/reflect/jvm/internal/calls/Caller;Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;Z)Lkotlin/reflect/jvm/internal/calls/Caller;", "hasValueClassReceiver", "(Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;)Z", "Ljava/lang/Class;", "getInlineClassUnboxMethod", "(Ljava/lang/Class;Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;)Ljava/lang/reflect/Method;", "getBoxMethod", "toInlineClass", "(Lkotlin/reflect/jvm/internal/impl/types/KotlinType;)Ljava/lang/Class;", "Lkotlin/reflect/jvm/internal/impl/descriptors/DeclarationDescriptor;", "(Lkotlin/reflect/jvm/internal/impl/descriptors/DeclarationDescriptor;)Ljava/lang/Class;", "", "coerceToExpectedReceiverType", "(Ljava/lang/Object;Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;)Ljava/lang/Object;", "getExpectedReceiverType", "(Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;)Lorg/jetbrains/kotlin/types/KotlinType;", "expectedReceiverType", "kotlin-reflection"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ValueClassAwareCallerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkParametersSize(Caller<?> caller, int i, CallableMemberDescriptor callableMemberDescriptor, boolean z) {
        if (CallerKt.getArity(caller) == i) {
            return;
        }
        StringBuilder sb = new StringBuilder("Inconsistent number of parameters in the descriptor and Java reflection object: ");
        sb.append(CallerKt.getArity(caller));
        sb.append(" != ");
        sb.append(i);
        sb.append("\nCalling: ");
        sb.append(callableMemberDescriptor);
        List<Type> parameterTypes = caller.getParameterTypes();
        sb.append("\nParameter types: ");
        sb.append(parameterTypes);
        sb.append(")\nDefault: ");
        sb.append(z);
        throw new KotlinReflectionInternalError(sb.toString());
    }

    @Nullable
    public static final Object coerceToExpectedReceiverType(@Nullable Object obj, @NotNull CallableMemberDescriptor callableMemberDescriptor) {
        KotlinType expectedReceiverType;
        Class<?> inlineClass;
        Method inlineClassUnboxMethod;
        callableMemberDescriptor.getClass();
        return (((callableMemberDescriptor instanceof PropertyDescriptor) && InlineClassesUtilsKt.isUnderlyingPropertyOfInlineClass((VariableDescriptor) callableMemberDescriptor)) || (expectedReceiverType = getExpectedReceiverType(callableMemberDescriptor)) == null || (inlineClass = toInlineClass(expectedReceiverType)) == null || (inlineClassUnboxMethod = getInlineClassUnboxMethod(inlineClass, callableMemberDescriptor)) == null) ? obj : inlineClassUnboxMethod.invoke(obj, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <M extends Member> Caller<M> createValueClassAwareCallerIfNeeded(@NotNull Caller<? extends M> caller, @NotNull CallableMemberDescriptor callableMemberDescriptor, boolean z) {
        caller.getClass();
        callableMemberDescriptor.getClass();
        if (!InlineClassesUtilsKt.isGetterOfUnderlyingPropertyOfValueClass(callableMemberDescriptor)) {
            List<ReceiverParameterDescriptor> contextReceiverParameters = callableMemberDescriptor.getContextReceiverParameters();
            contextReceiverParameters.getClass();
            if (contextReceiverParameters == null || !contextReceiverParameters.isEmpty()) {
                Iterator<T> it = contextReceiverParameters.iterator();
                while (it.hasNext()) {
                    KotlinType type = ((ReceiverParameterDescriptor) it.next()).getType();
                    type.getClass();
                    if (InlineClassesUtilsKt.isValueClassType(type)) {
                        break;
                    }
                }
            }
            List<ValueParameterDescriptor> valueParameters = callableMemberDescriptor.getValueParameters();
            valueParameters.getClass();
            if (valueParameters == null || !valueParameters.isEmpty()) {
                Iterator<T> it2 = valueParameters.iterator();
                while (it2.hasNext()) {
                    KotlinType type2 = ((ValueParameterDescriptor) it2.next()).getType();
                    type2.getClass();
                    if (InlineClassesUtilsKt.isValueClassType(type2)) {
                        break;
                    }
                }
            }
            KotlinType returnType = callableMemberDescriptor.getReturnType();
            if ((returnType == null || !InlineClassesUtilsKt.isInlineClassType(returnType)) && !hasValueClassReceiver(callableMemberDescriptor)) {
                return caller;
            }
        }
        return new ValueClassAwareCaller(callableMemberDescriptor, caller, z);
    }

    public static /* synthetic */ Caller createValueClassAwareCallerIfNeeded$default(Caller caller, CallableMemberDescriptor callableMemberDescriptor, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return createValueClassAwareCallerIfNeeded(caller, callableMemberDescriptor, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Method getBoxMethod(Class<?> cls, CallableMemberDescriptor callableMemberDescriptor) {
        try {
            Method declaredMethod = cls.getDeclaredMethod("box-impl", getInlineClassUnboxMethod(cls, callableMemberDescriptor).getReturnType());
            declaredMethod.getClass();
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            sw9.l("No box method found in inline class: ", cls, " (calling ", callableMemberDescriptor);
            return null;
        }
    }

    private static final KotlinType getExpectedReceiverType(CallableMemberDescriptor callableMemberDescriptor) {
        ReceiverParameterDescriptor extensionReceiverParameter = callableMemberDescriptor.getExtensionReceiverParameter();
        ReceiverParameterDescriptor dispatchReceiverParameter = callableMemberDescriptor.getDispatchReceiverParameter();
        if (extensionReceiverParameter != null) {
            return extensionReceiverParameter.getType();
        }
        if (dispatchReceiverParameter == null) {
            return null;
        }
        if (callableMemberDescriptor instanceof ConstructorDescriptor) {
            return dispatchReceiverParameter.getType();
        }
        DeclarationDescriptor containingDeclaration = callableMemberDescriptor.getContainingDeclaration();
        ClassDescriptor classDescriptor = containingDeclaration instanceof ClassDescriptor ? (ClassDescriptor) containingDeclaration : null;
        if (classDescriptor != null) {
            return classDescriptor.getDefaultType();
        }
        return null;
    }

    @NotNull
    public static final Method getInlineClassUnboxMethod(@NotNull Class<?> cls, @NotNull CallableMemberDescriptor callableMemberDescriptor) {
        cls.getClass();
        callableMemberDescriptor.getClass();
        try {
            Method declaredMethod = cls.getDeclaredMethod("unbox-impl", null);
            declaredMethod.getClass();
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            sw9.l("No unbox method found in inline class: ", cls, " (calling ", callableMemberDescriptor);
            return null;
        }
    }

    @Nullable
    public static final List<Method> getMfvcUnboxMethods(@NotNull SimpleType simpleType) {
        simpleType.getClass();
        List<String> mfvcUnboxMethods$getUnboxMethodNameSuffixes = getMfvcUnboxMethods$getUnboxMethodNameSuffixes(TypeSubstitutionKt.asSimpleType(simpleType));
        if (mfvcUnboxMethods$getUnboxMethodNameSuffixes == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(k13.r(mfvcUnboxMethods$getUnboxMethodNameSuffixes, 10));
        Iterator<T> it = mfvcUnboxMethods$getUnboxMethodNameSuffixes.iterator();
        while (it.hasNext()) {
            arrayList.add("unbox-impl-" + ((String) it.next()));
        }
        ClassifierDescriptor mo893getDeclarationDescriptor = simpleType.getConstructor().mo893getDeclarationDescriptor();
        mo893getDeclarationDescriptor.getClass();
        Class<?> javaClass = UtilKt.toJavaClass((ClassDescriptor) mo893getDeclarationDescriptor);
        javaClass.getClass();
        ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(javaClass.getDeclaredMethod((String) it2.next(), null));
        }
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    private static final List<String> getMfvcUnboxMethods$getUnboxMethodNameSuffixes(SimpleType simpleType) {
        ?? c;
        if (!InlineClassesUtilsKt.needsMfvcFlattening(simpleType)) {
            return null;
        }
        ClassifierDescriptor mo893getDeclarationDescriptor = simpleType.getConstructor().mo893getDeclarationDescriptor();
        mo893getDeclarationDescriptor.getClass();
        MultiFieldValueClassRepresentation<SimpleType> multiFieldValueClassRepresentation = DescriptorUtilsKt.getMultiFieldValueClassRepresentation((ClassDescriptor) mo893getDeclarationDescriptor);
        multiFieldValueClassRepresentation.getClass();
        List<Pair<Name, SimpleType>> underlyingPropertyNamesToTypes = multiFieldValueClassRepresentation.getUnderlyingPropertyNamesToTypes();
        ArrayList arrayList = new ArrayList();
        Iterator it = underlyingPropertyNamesToTypes.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            Name name = (Name) pair.a;
            List<String> mfvcUnboxMethods$getUnboxMethodNameSuffixes = getMfvcUnboxMethods$getUnboxMethodNameSuffixes((SimpleType) pair.b);
            if (mfvcUnboxMethods$getUnboxMethodNameSuffixes != null) {
                c = new ArrayList(k13.r(mfvcUnboxMethods$getUnboxMethodNameSuffixes, 10));
                Iterator it2 = mfvcUnboxMethods$getUnboxMethodNameSuffixes.iterator();
                while (it2.hasNext()) {
                    c.add(name.getIdentifier() + '-' + ((String) it2.next()));
                }
            } else {
                c = a.c(name.getIdentifier());
            }
            o13.v(c, arrayList);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Method> getValueClassUnboxMethods(SimpleType simpleType, CallableMemberDescriptor callableMemberDescriptor) {
        Method inlineClassUnboxMethod;
        List<Method> mfvcUnboxMethods = getMfvcUnboxMethods(simpleType);
        if (mfvcUnboxMethods != null) {
            return mfvcUnboxMethods;
        }
        Class<?> inlineClass = toInlineClass(simpleType);
        if (inlineClass == null || (inlineClassUnboxMethod = getInlineClassUnboxMethod(inlineClass, callableMemberDescriptor)) == null) {
            return null;
        }
        return a.c(inlineClassUnboxMethod);
    }

    private static final boolean hasValueClassReceiver(CallableMemberDescriptor callableMemberDescriptor) {
        KotlinType expectedReceiverType = getExpectedReceiverType(callableMemberDescriptor);
        return expectedReceiverType != null && InlineClassesUtilsKt.isValueClassType(expectedReceiverType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<KotlinType> makeKotlinParameterTypes(CallableMemberDescriptor callableMemberDescriptor, Function1<? super ClassDescriptor, Boolean> function1) {
        ArrayList arrayList = new ArrayList();
        ReceiverParameterDescriptor extensionReceiverParameter = callableMemberDescriptor.getExtensionReceiverParameter();
        KotlinType type = extensionReceiverParameter != null ? extensionReceiverParameter.getType() : null;
        if (type != null) {
            arrayList.add(type);
        } else if (callableMemberDescriptor instanceof ConstructorDescriptor) {
            ClassDescriptor constructedClass = ((ConstructorDescriptor) callableMemberDescriptor).getConstructedClass();
            constructedClass.getClass();
            if (constructedClass.isInner()) {
                DeclarationDescriptor containingDeclaration = constructedClass.getContainingDeclaration();
                containingDeclaration.getClass();
                arrayList.add(((ClassDescriptor) containingDeclaration).getDefaultType());
            }
        } else {
            DeclarationDescriptor containingDeclaration2 = callableMemberDescriptor.getContainingDeclaration();
            containingDeclaration2.getClass();
            if ((containingDeclaration2 instanceof ClassDescriptor) && ((Boolean) function1.invoke(containingDeclaration2)).booleanValue()) {
                arrayList.add(((ClassDescriptor) containingDeclaration2).getDefaultType());
            }
        }
        List<ValueParameterDescriptor> valueParameters = callableMemberDescriptor.getValueParameters();
        valueParameters.getClass();
        Iterator<T> it = valueParameters.iterator();
        while (it.hasNext()) {
            arrayList.add(((ValueParameterDescriptor) it.next()).getType());
        }
        return arrayList;
    }

    @Nullable
    public static final Class<?> toInlineClass(@Nullable DeclarationDescriptor declarationDescriptor) {
        if (!(declarationDescriptor instanceof ClassDescriptor) || !InlineClassesUtilsKt.isInlineClass(declarationDescriptor)) {
            return null;
        }
        ClassDescriptor classDescriptor = (ClassDescriptor) declarationDescriptor;
        Class<?> javaClass = UtilKt.toJavaClass(classDescriptor);
        if (javaClass != null) {
            return javaClass;
        }
        StringBuilder sb = new StringBuilder("Class object for the class ");
        sb.append(classDescriptor.getName());
        ClassId classId = DescriptorUtilsKt.getClassId((ClassifierDescriptor) declarationDescriptor);
        sb.append(" cannot be found (classId=");
        sb.append(classId);
        sb.append(')');
        throw new KotlinReflectionInternalError(sb.toString());
    }

    @NotNull
    public static final String toJvmDescriptor(@NotNull ClassifierDescriptor classifierDescriptor) {
        classifierDescriptor.getClass();
        ClassId classId = DescriptorUtilsKt.getClassId(classifierDescriptor);
        classId.getClass();
        String asString = classId.asString();
        asString.getClass();
        return ClassMapperLite.mapClass(asString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Class<?> toInlineClass(KotlinType kotlinType) {
        KotlinType unsubstitutedUnderlyingType;
        Class<?> inlineClass = toInlineClass(kotlinType.getConstructor().mo893getDeclarationDescriptor());
        if (inlineClass == null) {
            return null;
        }
        if (TypeUtils.isNullableType(kotlinType) && ((unsubstitutedUnderlyingType = InlineClassesUtilsKt.unsubstitutedUnderlyingType(kotlinType)) == null || TypeUtils.isNullableType(unsubstitutedUnderlyingType) || KotlinBuiltIns.isPrimitiveType(unsubstitutedUnderlyingType))) {
            return null;
        }
        return inlineClass;
    }
}
