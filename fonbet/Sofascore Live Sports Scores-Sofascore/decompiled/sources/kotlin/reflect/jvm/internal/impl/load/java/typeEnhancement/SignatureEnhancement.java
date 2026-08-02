package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import defpackage.k13;
import defpackage.km5;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.DeprecationCausedByFunctionNInfo;
import kotlin.reflect.jvm.internal.impl.load.java.UtilsKt;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.JavaDescriptorUtilKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureBuildingUtilsKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.resolve.deprecation.DescriptorBasedDeprecationInfoKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class SignatureEnhancement {

    @NotNull
    private final JavaTypeEnhancement typeEnhancement;

    public SignatureEnhancement(@NotNull JavaTypeEnhancement javaTypeEnhancement) {
        javaTypeEnhancement.getClass();
        this.typeEnhancement = javaTypeEnhancement;
    }

    private final boolean containsFunctionN(KotlinType kotlinType) {
        return TypeUtils.contains(kotlinType, SignatureEnhancement$containsFunctionN$1.INSTANCE);
    }

    private final KotlinType enhance(CallableMemberDescriptor callableMemberDescriptor, Annotated annotated, boolean z, LazyJavaResolverContext lazyJavaResolverContext, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, TypeEnhancementInfo typeEnhancementInfo, boolean z2, Function1<? super CallableMemberDescriptor, ? extends KotlinType> function1) {
        SignatureParts signatureParts = new SignatureParts(annotated, z, lazyJavaResolverContext, annotationQualifierApplicabilityType, false, 16, null);
        KotlinType kotlinType = (KotlinType) function1.invoke(callableMemberDescriptor);
        Collection<? extends CallableMemberDescriptor> overriddenDescriptors = callableMemberDescriptor.getOverriddenDescriptors();
        overriddenDescriptors.getClass();
        Collection<? extends CallableMemberDescriptor> collection = overriddenDescriptors;
        ArrayList arrayList = new ArrayList(k13.r(collection, 10));
        for (CallableMemberDescriptor callableMemberDescriptor2 : collection) {
            callableMemberDescriptor2.getClass();
            arrayList.add((KotlinType) function1.invoke(callableMemberDescriptor2));
        }
        return enhance(signatureParts, kotlinType, arrayList, typeEnhancementInfo, z2);
    }

    public static /* synthetic */ KotlinType enhance$default(SignatureEnhancement signatureEnhancement, CallableMemberDescriptor callableMemberDescriptor, Annotated annotated, boolean z, LazyJavaResolverContext lazyJavaResolverContext, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, TypeEnhancementInfo typeEnhancementInfo, boolean z2, Function1 function1, int i, Object obj) {
        return signatureEnhancement.enhance(callableMemberDescriptor, annotated, z, lazyJavaResolverContext, annotationQualifierApplicabilityType, typeEnhancementInfo, (i & 32) != 0 ? false : z2, function1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x01d0, code lost:
    
        if (r4 == null) goto L106;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final <D extends CallableMemberDescriptor> D enhanceSignature(D d, LazyJavaResolverContext lazyJavaResolverContext) {
        D d2;
        KotlinType kotlinType;
        PredefinedFunctionEnhancementInfo predefinedFunctionEnhancementInfo;
        KotlinType enhance$default;
        KotlinType returnType;
        Pair<CallableDescriptor.UserDataKey<?>, ?> pair;
        Iterator it;
        KotlinType type;
        List<TypeEnhancementInfo> parametersInfo;
        JavaPropertyDescriptor javaPropertyDescriptor;
        PropertyGetterDescriptorImpl getter;
        if (!(d instanceof JavaCallableMemberDescriptor)) {
            return d;
        }
        JavaCallableMemberDescriptor javaCallableMemberDescriptor = (JavaCallableMemberDescriptor) d;
        if (javaCallableMemberDescriptor.getKind() != CallableMemberDescriptor.Kind.FAKE_OVERRIDE || javaCallableMemberDescriptor.getOriginal().getOverriddenDescriptors().size() != 1) {
            LazyJavaResolverContext copyWithNewDefaultTypeQualifiers = ContextKt.copyWithNewDefaultTypeQualifiers(lazyJavaResolverContext, getDefaultAnnotations(d, lazyJavaResolverContext));
            if (!(d instanceof JavaPropertyDescriptor) || (getter = (javaPropertyDescriptor = (JavaPropertyDescriptor) d).getGetter()) == null || getter.isDefault()) {
                d2 = d;
            } else {
                PropertyGetterDescriptorImpl getter2 = javaPropertyDescriptor.getGetter();
                getter2.getClass();
                d2 = getter2;
            }
            if (javaCallableMemberDescriptor.getExtensionReceiverParameter() != null) {
                FunctionDescriptor functionDescriptor = d2 instanceof FunctionDescriptor ? (FunctionDescriptor) d2 : null;
                kotlinType = enhanceValueParameter(d, functionDescriptor != null ? (ValueParameterDescriptor) functionDescriptor.getUserData(JavaMethodDescriptor.ORIGINAL_VALUE_PARAMETER_FOR_EXTENSION_RECEIVER) : null, copyWithNewDefaultTypeQualifiers, null, false, SignatureEnhancement$enhanceSignature$receiverTypeEnhancement$1.INSTANCE);
            } else {
                kotlinType = null;
            }
            JavaMethodDescriptor javaMethodDescriptor = d instanceof JavaMethodDescriptor ? (JavaMethodDescriptor) d : null;
            int i = 0;
            if (javaMethodDescriptor != null) {
                SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
                DeclarationDescriptor containingDeclaration = javaMethodDescriptor.getContainingDeclaration();
                containingDeclaration.getClass();
                String signature = MethodSignatureBuildingUtilsKt.signature(signatureBuildingComponents, (ClassDescriptor) containingDeclaration, MethodSignatureMappingKt.computeJvmDescriptor$default(javaMethodDescriptor, false, false, 3, null));
                if (signature != null) {
                    predefinedFunctionEnhancementInfo = PredefinedEnhancementInfoKt.getPREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE().get(signature);
                    if (predefinedFunctionEnhancementInfo != null) {
                        predefinedFunctionEnhancementInfo.getParametersInfo().size();
                        javaCallableMemberDescriptor.getValueParameters().size();
                    }
                    boolean z = (!UtilsKt.isJspecifyEnabledInStrictMode(lazyJavaResolverContext.getComponents().getJavaTypeEnhancementState()) || copyWithNewDefaultTypeQualifiers.getComponents().getSettings().getIgnoreNullabilityForErasedValueParameters()) && UtilsKt.hasErasedValueParameters(d);
                    List<ValueParameterDescriptor> valueParameters = d2.getValueParameters();
                    valueParameters.getClass();
                    ArrayList arrayList = new ArrayList(k13.r(valueParameters, 10));
                    for (ValueParameterDescriptor valueParameterDescriptor : valueParameters) {
                        arrayList.add(enhanceValueParameter(d, valueParameterDescriptor, copyWithNewDefaultTypeQualifiers, (predefinedFunctionEnhancementInfo == null || (parametersInfo = predefinedFunctionEnhancementInfo.getParametersInfo()) == null) ? null : (TypeEnhancementInfo) CollectionsKt.a0(valueParameterDescriptor.getIndex(), parametersInfo), z, new SignatureEnhancement$enhanceSignature$valueParameterEnhancements$1$1(valueParameterDescriptor)));
                    }
                    PropertyDescriptor propertyDescriptor = !(d instanceof PropertyDescriptor) ? (PropertyDescriptor) d : null;
                    enhance$default = enhance$default(this, d, d2, true, copyWithNewDefaultTypeQualifiers, (propertyDescriptor == null && JavaDescriptorUtilKt.isJavaField(propertyDescriptor)) ? AnnotationQualifierApplicabilityType.FIELD : AnnotationQualifierApplicabilityType.METHOD_RETURN_TYPE, predefinedFunctionEnhancementInfo == null ? predefinedFunctionEnhancementInfo.getReturnTypeInfo() : null, false, SignatureEnhancement$enhanceSignature$returnTypeEnhancement$1.INSTANCE, 32, null);
                    returnType = javaCallableMemberDescriptor.getReturnType();
                    returnType.getClass();
                    if (!containsFunctionN(returnType)) {
                        ReceiverParameterDescriptor extensionReceiverParameter = javaCallableMemberDescriptor.getExtensionReceiverParameter();
                        if (!((extensionReceiverParameter == null || (type = extensionReceiverParameter.getType()) == null) ? false : containsFunctionN(type))) {
                            List<ValueParameterDescriptor> valueParameters2 = javaCallableMemberDescriptor.getValueParameters();
                            valueParameters2.getClass();
                            if (!valueParameters2.isEmpty()) {
                                Iterator<T> it2 = valueParameters2.iterator();
                                while (it2.hasNext()) {
                                    KotlinType type2 = ((ValueParameterDescriptor) it2.next()).getType();
                                    type2.getClass();
                                    if (containsFunctionN(type2)) {
                                    }
                                }
                            }
                            pair = null;
                            if (kotlinType == null && enhance$default == null) {
                                if (!arrayList.isEmpty()) {
                                    Iterator it3 = arrayList.iterator();
                                    while (it3.hasNext()) {
                                        if (((KotlinType) it3.next()) != null) {
                                            break;
                                        }
                                    }
                                }
                            }
                            if (kotlinType == null) {
                                ReceiverParameterDescriptor extensionReceiverParameter2 = javaCallableMemberDescriptor.getExtensionReceiverParameter();
                                kotlinType = extensionReceiverParameter2 != null ? extensionReceiverParameter2.getType() : null;
                            }
                            ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
                            it = arrayList.iterator();
                            while (it.hasNext()) {
                                Object next = it.next();
                                int i2 = i + 1;
                                if (i < 0) {
                                    b.q();
                                    throw null;
                                }
                                KotlinType kotlinType2 = (KotlinType) next;
                                if (kotlinType2 == null) {
                                    kotlinType2 = javaCallableMemberDescriptor.getValueParameters().get(i).getType();
                                    kotlinType2.getClass();
                                }
                                arrayList2.add(kotlinType2);
                                i = i2;
                            }
                            if (enhance$default == null) {
                                enhance$default = javaCallableMemberDescriptor.getReturnType();
                                enhance$default.getClass();
                            }
                            JavaCallableMemberDescriptor enhance = javaCallableMemberDescriptor.enhance(kotlinType, arrayList2, enhance$default, pair);
                            enhance.getClass();
                            return enhance;
                        }
                    }
                    pair = new Pair<>(DescriptorBasedDeprecationInfoKt.getDEPRECATED_FUNCTION_KEY(), new DeprecationCausedByFunctionNInfo(d));
                    if (kotlinType == null) {
                        if (!arrayList.isEmpty()) {
                        }
                    }
                    if (kotlinType == null) {
                    }
                    ArrayList arrayList22 = new ArrayList(k13.r(arrayList, 10));
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                    }
                    if (enhance$default == null) {
                    }
                    JavaCallableMemberDescriptor enhance2 = javaCallableMemberDescriptor.enhance(kotlinType, arrayList22, enhance$default, pair);
                    enhance2.getClass();
                    return enhance2;
                }
            }
            predefinedFunctionEnhancementInfo = null;
            if (predefinedFunctionEnhancementInfo != null) {
            }
            if (UtilsKt.isJspecifyEnabledInStrictMode(lazyJavaResolverContext.getComponents().getJavaTypeEnhancementState())) {
            }
            List<ValueParameterDescriptor> valueParameters3 = d2.getValueParameters();
            valueParameters3.getClass();
            ArrayList arrayList3 = new ArrayList(k13.r(valueParameters3, 10));
            while (r16.hasNext()) {
            }
            if (!(d instanceof PropertyDescriptor)) {
            }
            enhance$default = enhance$default(this, d, d2, true, copyWithNewDefaultTypeQualifiers, (propertyDescriptor == null && JavaDescriptorUtilKt.isJavaField(propertyDescriptor)) ? AnnotationQualifierApplicabilityType.FIELD : AnnotationQualifierApplicabilityType.METHOD_RETURN_TYPE, predefinedFunctionEnhancementInfo == null ? predefinedFunctionEnhancementInfo.getReturnTypeInfo() : null, false, SignatureEnhancement$enhanceSignature$returnTypeEnhancement$1.INSTANCE, 32, null);
            returnType = javaCallableMemberDescriptor.getReturnType();
            returnType.getClass();
            if (!containsFunctionN(returnType)) {
            }
            pair = new Pair<>(DescriptorBasedDeprecationInfoKt.getDEPRECATED_FUNCTION_KEY(), new DeprecationCausedByFunctionNInfo(d));
            if (kotlinType == null) {
            }
            if (kotlinType == null) {
            }
            ArrayList arrayList222 = new ArrayList(k13.r(arrayList3, 10));
            it = arrayList3.iterator();
            while (it.hasNext()) {
            }
            if (enhance$default == null) {
            }
            JavaCallableMemberDescriptor enhance22 = javaCallableMemberDescriptor.enhance(kotlinType, arrayList222, enhance$default, pair);
            enhance22.getClass();
            return enhance22;
        }
        return d;
    }

    private final KotlinType enhanceValueParameter(CallableMemberDescriptor callableMemberDescriptor, ValueParameterDescriptor valueParameterDescriptor, LazyJavaResolverContext lazyJavaResolverContext, TypeEnhancementInfo typeEnhancementInfo, boolean z, Function1<? super CallableMemberDescriptor, ? extends KotlinType> function1) {
        LazyJavaResolverContext copyWithNewDefaultTypeQualifiers;
        return enhance(callableMemberDescriptor, valueParameterDescriptor, false, (valueParameterDescriptor == null || (copyWithNewDefaultTypeQualifiers = ContextKt.copyWithNewDefaultTypeQualifiers(lazyJavaResolverContext, valueParameterDescriptor.getAnnotations())) == null) ? lazyJavaResolverContext : copyWithNewDefaultTypeQualifiers, AnnotationQualifierApplicabilityType.VALUE_PARAMETER, typeEnhancementInfo, z, function1);
    }

    private final <D extends CallableMemberDescriptor> Annotations getDefaultAnnotations(D d, LazyJavaResolverContext lazyJavaResolverContext) {
        ClassifierDescriptor topLevelContainingClassifier = DescriptorUtilKt.getTopLevelContainingClassifier(d);
        if (topLevelContainingClassifier == null) {
            return d.getAnnotations();
        }
        LazyJavaClassDescriptor lazyJavaClassDescriptor = topLevelContainingClassifier instanceof LazyJavaClassDescriptor ? (LazyJavaClassDescriptor) topLevelContainingClassifier : null;
        List<JavaAnnotation> moduleAnnotations = lazyJavaClassDescriptor != null ? lazyJavaClassDescriptor.getModuleAnnotations() : null;
        if (moduleAnnotations == null || moduleAnnotations.isEmpty()) {
            return d.getAnnotations();
        }
        ArrayList arrayList = new ArrayList(k13.r(moduleAnnotations, 10));
        Iterator<T> it = moduleAnnotations.iterator();
        while (it.hasNext()) {
            arrayList.add(new LazyJavaAnnotationDescriptor(lazyJavaResolverContext, (JavaAnnotation) it.next(), true));
        }
        return Annotations.Companion.create(CollectionsKt.u0(d.getAnnotations(), arrayList));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final <D extends CallableMemberDescriptor> Collection<D> enhanceSignatures(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull Collection<? extends D> collection) {
        lazyJavaResolverContext.getClass();
        collection.getClass();
        Collection<? extends D> collection2 = collection;
        ArrayList arrayList = new ArrayList(k13.r(collection2, 10));
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(enhanceSignature((CallableMemberDescriptor) it.next(), lazyJavaResolverContext));
        }
        return arrayList;
    }

    @NotNull
    public final KotlinType enhanceSuperType(@NotNull KotlinType kotlinType, @NotNull LazyJavaResolverContext lazyJavaResolverContext) {
        kotlinType.getClass();
        lazyJavaResolverContext.getClass();
        KotlinType enhance$default = enhance$default(this, new SignatureParts(null, false, lazyJavaResolverContext, AnnotationQualifierApplicabilityType.TYPE_USE, true), kotlinType, km5.a, null, false, 12, null);
        return enhance$default == null ? kotlinType : enhance$default;
    }

    @NotNull
    public final List<KotlinType> enhanceTypeParameterBounds(@NotNull TypeParameterDescriptor typeParameterDescriptor, @NotNull List<? extends KotlinType> list, @NotNull LazyJavaResolverContext lazyJavaResolverContext) {
        typeParameterDescriptor.getClass();
        list.getClass();
        lazyJavaResolverContext.getClass();
        ArrayList arrayList = new ArrayList(k13.r(list, 10));
        for (KotlinType kotlinType : list) {
            if (!TypeUtilsKt.contains(kotlinType, SignatureEnhancement$enhanceTypeParameterBounds$1$1.INSTANCE)) {
                KotlinType enhance$default = enhance$default(this, new SignatureParts(typeParameterDescriptor, false, lazyJavaResolverContext, AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS, false, 16, null), kotlinType, km5.a, null, false, 12, null);
                if (enhance$default != null) {
                    kotlinType = enhance$default;
                }
            }
            arrayList.add(kotlinType);
        }
        return arrayList;
    }

    public static /* synthetic */ KotlinType enhance$default(SignatureEnhancement signatureEnhancement, SignatureParts signatureParts, KotlinType kotlinType, List list, TypeEnhancementInfo typeEnhancementInfo, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            typeEnhancementInfo = null;
        }
        TypeEnhancementInfo typeEnhancementInfo2 = typeEnhancementInfo;
        if ((i & 8) != 0) {
            z = false;
        }
        return signatureEnhancement.enhance(signatureParts, kotlinType, list, typeEnhancementInfo2, z);
    }

    private final KotlinType enhance(SignatureParts signatureParts, KotlinType kotlinType, List<? extends KotlinType> list, TypeEnhancementInfo typeEnhancementInfo, boolean z) {
        return this.typeEnhancement.enhance(kotlinType, signatureParts.computeIndexedQualifiers(kotlinType, list, typeEnhancementInfo, z), signatureParts.getSkipRawTypeArguments());
    }
}
