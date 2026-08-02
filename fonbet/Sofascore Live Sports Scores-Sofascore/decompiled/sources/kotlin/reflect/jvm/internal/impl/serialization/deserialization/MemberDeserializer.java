package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import defpackage.k13;
import defpackage.km5;
import defpackage.lm5;
import defpackage.lnb;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FieldDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedAnnotations;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedSimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.NonEmptyDeserializedAnnotations;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class MemberDeserializer {

    @NotNull
    private final AnnotationDeserializer annotationDeserializer;

    @NotNull
    private final DeserializationContext c;

    public MemberDeserializer(@NotNull DeserializationContext deserializationContext) {
        deserializationContext.getClass();
        this.c = deserializationContext;
        this.annotationDeserializer = new AnnotationDeserializer(deserializationContext.getComponents().getModuleDescriptor(), deserializationContext.getComponents().getNotFoundClasses());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ProtoContainer asProtoContainer(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor instanceof PackageFragmentDescriptor) {
            return new ProtoContainer.Package(((PackageFragmentDescriptor) declarationDescriptor).getFqName(), this.c.getNameResolver(), this.c.getTypeTable(), this.c.getContainerSource());
        }
        if (declarationDescriptor instanceof DeserializedClassDescriptor) {
            return ((DeserializedClassDescriptor) declarationDescriptor).getThisAsProtoContainer$deserialization();
        }
        return null;
    }

    private final Annotations getAnnotations(MessageLite messageLite, int i, AnnotatedCallableKind annotatedCallableKind) {
        return !Flags.HAS_ANNOTATIONS.get(i).booleanValue() ? Annotations.Companion.getEMPTY() : new NonEmptyDeserializedAnnotations(this.c.getStorageManager(), new MemberDeserializer$getAnnotations$1(this, messageLite, annotatedCallableKind));
    }

    private final ReceiverParameterDescriptor getDispatchReceiverParameter() {
        DeclarationDescriptor containingDeclaration = this.c.getContainingDeclaration();
        ClassDescriptor classDescriptor = containingDeclaration instanceof ClassDescriptor ? (ClassDescriptor) containingDeclaration : null;
        if (classDescriptor != null) {
            return classDescriptor.getThisAsReceiverParameter();
        }
        return null;
    }

    private final Annotations getPropertyFieldAnnotations(ProtoBuf.Property property, boolean z) {
        return !Flags.HAS_ANNOTATIONS.get(property.getFlags()).booleanValue() ? Annotations.Companion.getEMPTY() : new NonEmptyDeserializedAnnotations(this.c.getStorageManager(), new MemberDeserializer$getPropertyFieldAnnotations$1(this, z, property));
    }

    private final Annotations getReceiverParameterAnnotations(MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind) {
        return new DeserializedAnnotations(this.c.getStorageManager(), new MemberDeserializer$getReceiverParameterAnnotations$1(this, messageLite, annotatedCallableKind));
    }

    private final void initializeWithCoroutinesExperimentalityStatus(DeserializedSimpleFunctionDescriptor deserializedSimpleFunctionDescriptor, ReceiverParameterDescriptor receiverParameterDescriptor, ReceiverParameterDescriptor receiverParameterDescriptor2, List<? extends ReceiverParameterDescriptor> list, List<? extends TypeParameterDescriptor> list2, List<? extends ValueParameterDescriptor> list3, KotlinType kotlinType, Modality modality, DescriptorVisibility descriptorVisibility, Map<? extends CallableDescriptor.UserDataKey<?>, ?> map) {
        deserializedSimpleFunctionDescriptor.initialize(receiverParameterDescriptor, receiverParameterDescriptor2, list, list2, list3, kotlinType, modality, descriptorVisibility, map);
    }

    private final int loadOldFlags(int i) {
        return (i & 63) + ((i >> 8) << 6);
    }

    private final ReceiverParameterDescriptor toContextReceiver(ProtoBuf.Type type, DeserializationContext deserializationContext, CallableDescriptor callableDescriptor, int i) {
        return DescriptorFactory.createContextReceiverParameterForCallable(callableDescriptor, deserializationContext.getTypeDeserializer().type(type), null, Annotations.Companion.getEMPTY(), i);
    }

    private final List<ValueParameterDescriptor> valueParameters(List<ProtoBuf.ValueParameter> list, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind) {
        MemberDeserializer memberDeserializer;
        ProtoContainer protoContainer;
        Annotations empty;
        MemberDeserializer memberDeserializer2 = this;
        DeclarationDescriptor containingDeclaration = memberDeserializer2.c.getContainingDeclaration();
        containingDeclaration.getClass();
        CallableDescriptor callableDescriptor = (CallableDescriptor) containingDeclaration;
        DeclarationDescriptor containingDeclaration2 = callableDescriptor.getContainingDeclaration();
        containingDeclaration2.getClass();
        ProtoContainer asProtoContainer = memberDeserializer2.asProtoContainer(containingDeclaration2);
        ArrayList arrayList = new ArrayList(k13.r(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            KotlinType kotlinType = null;
            if (i < 0) {
                b.q();
                throw null;
            }
            ProtoBuf.ValueParameter valueParameter = (ProtoBuf.ValueParameter) obj;
            int flags = valueParameter.hasFlags() ? valueParameter.getFlags() : 0;
            if (asProtoContainer == null || !lnb.w(Flags.HAS_ANNOTATIONS, flags)) {
                memberDeserializer = memberDeserializer2;
                protoContainer = asProtoContainer;
                empty = Annotations.Companion.getEMPTY();
            } else {
                int i3 = i;
                memberDeserializer = memberDeserializer2;
                protoContainer = asProtoContainer;
                i = i3;
                empty = new NonEmptyDeserializedAnnotations(memberDeserializer2.c.getStorageManager(), new MemberDeserializer$valueParameters$1$annotations$1(memberDeserializer2, asProtoContainer, messageLite, annotatedCallableKind, i3, valueParameter));
            }
            Annotations annotations = empty;
            Name name = NameResolverUtilKt.getName(memberDeserializer.c.getNameResolver(), valueParameter.getName());
            KotlinType type = memberDeserializer.c.getTypeDeserializer().type(ProtoTypeTableUtilKt.type(valueParameter, memberDeserializer.c.getTypeTable()));
            boolean w = lnb.w(Flags.DECLARES_DEFAULT_VALUE, flags);
            boolean w2 = lnb.w(Flags.IS_CROSSINLINE, flags);
            boolean w3 = lnb.w(Flags.IS_NOINLINE, flags);
            ProtoBuf.Type varargElementType = ProtoTypeTableUtilKt.varargElementType(valueParameter, memberDeserializer.c.getTypeTable());
            if (varargElementType != null) {
                kotlinType = memberDeserializer.c.getTypeDeserializer().type(varargElementType);
            }
            SourceElement sourceElement = SourceElement.NO_SOURCE;
            sourceElement.getClass();
            CallableDescriptor callableDescriptor2 = callableDescriptor;
            arrayList.add(new ValueParameterDescriptorImpl(callableDescriptor2, null, i, annotations, name, type, w, w2, w3, kotlinType, sourceElement));
            memberDeserializer2 = memberDeserializer;
            callableDescriptor = callableDescriptor2;
            i = i2;
            asProtoContainer = protoContainer;
        }
        return CollectionsKt.S0(arrayList);
    }

    @NotNull
    public final ClassConstructorDescriptor loadConstructor(@NotNull ProtoBuf.Constructor constructor, boolean z) {
        constructor.getClass();
        DeclarationDescriptor containingDeclaration = this.c.getContainingDeclaration();
        containingDeclaration.getClass();
        ClassDescriptor classDescriptor = (ClassDescriptor) containingDeclaration;
        int flags = constructor.getFlags();
        AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.FUNCTION;
        DeserializedClassConstructorDescriptor deserializedClassConstructorDescriptor = new DeserializedClassConstructorDescriptor(classDescriptor, null, getAnnotations(constructor, flags, annotatedCallableKind), z, CallableMemberDescriptor.Kind.DECLARATION, constructor, this.c.getNameResolver(), this.c.getTypeTable(), this.c.getVersionRequirementTable(), this.c.getContainerSource(), null, 1024, null);
        MemberDeserializer memberDeserializer = DeserializationContext.childContext$default(this.c, deserializedClassConstructorDescriptor, km5.a, null, null, null, null, 60, null).getMemberDeserializer();
        List<ProtoBuf.ValueParameter> valueParameterList = constructor.getValueParameterList();
        valueParameterList.getClass();
        deserializedClassConstructorDescriptor.initialize(memberDeserializer.valueParameters(valueParameterList, constructor, annotatedCallableKind), ProtoEnumFlagsUtilsKt.descriptorVisibility(ProtoEnumFlags.INSTANCE, Flags.VISIBILITY.get(constructor.getFlags())));
        deserializedClassConstructorDescriptor.setReturnType(classDescriptor.getDefaultType());
        deserializedClassConstructorDescriptor.setExpect(classDescriptor.isExpect());
        deserializedClassConstructorDescriptor.setHasStableParameterNames(!Flags.IS_CONSTRUCTOR_WITH_NON_STABLE_PARAMETER_NAMES.get(constructor.getFlags()).booleanValue());
        return deserializedClassConstructorDescriptor;
    }

    @NotNull
    public final SimpleFunctionDescriptor loadFunction(@NotNull ProtoBuf.Function function) {
        ReceiverParameterDescriptor receiverParameterDescriptor;
        Throwable th;
        KotlinType type;
        function.getClass();
        int flags = function.hasFlags() ? function.getFlags() : loadOldFlags(function.getOldFlags());
        AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.FUNCTION;
        Annotations annotations = getAnnotations(function, flags, annotatedCallableKind);
        Annotations receiverParameterAnnotations = ProtoTypeTableUtilKt.hasReceiver(function) ? getReceiverParameterAnnotations(function, annotatedCallableKind) : Annotations.Companion.getEMPTY();
        DeserializedSimpleFunctionDescriptor deserializedSimpleFunctionDescriptor = new DeserializedSimpleFunctionDescriptor(this.c.getContainingDeclaration(), null, annotations, NameResolverUtilKt.getName(this.c.getNameResolver(), function.getName()), ProtoEnumFlagsUtilsKt.memberKind(ProtoEnumFlags.INSTANCE, Flags.MEMBER_KIND.get(flags)), function, this.c.getNameResolver(), this.c.getTypeTable(), Intrinsics.c(DescriptorUtilsKt.getFqNameSafe(this.c.getContainingDeclaration()).child(NameResolverUtilKt.getName(this.c.getNameResolver(), function.getName())), SuspendFunctionTypeUtilKt.KOTLIN_SUSPEND_BUILT_IN_FUNCTION_FQ_NAME) ? VersionRequirementTable.Companion.getEMPTY() : this.c.getVersionRequirementTable(), this.c.getContainerSource(), null, 1024, null);
        DeserializationContext deserializationContext = this.c;
        List<ProtoBuf.TypeParameter> typeParameterList = function.getTypeParameterList();
        typeParameterList.getClass();
        DeserializationContext childContext$default = DeserializationContext.childContext$default(deserializationContext, deserializedSimpleFunctionDescriptor, typeParameterList, null, null, null, null, 60, null);
        ProtoBuf.Type receiverType = ProtoTypeTableUtilKt.receiverType(function, this.c.getTypeTable());
        if (receiverType == null || (type = childContext$default.getTypeDeserializer().type(receiverType)) == null) {
            receiverParameterDescriptor = null;
            th = null;
        } else {
            receiverParameterDescriptor = DescriptorFactory.createExtensionReceiverParameterForCallable(deserializedSimpleFunctionDescriptor, type, receiverParameterAnnotations);
            th = null;
        }
        ReceiverParameterDescriptor dispatchReceiverParameter = getDispatchReceiverParameter();
        List<ProtoBuf.Type> contextReceiverTypes = ProtoTypeTableUtilKt.contextReceiverTypes(function, this.c.getTypeTable());
        Throwable th2 = th;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : contextReceiverTypes) {
            int i2 = i + 1;
            if (i < 0) {
                b.q();
                throw th2;
            }
            ReceiverParameterDescriptor contextReceiver = toContextReceiver((ProtoBuf.Type) obj, childContext$default, deserializedSimpleFunctionDescriptor, i);
            if (contextReceiver != null) {
                arrayList.add(contextReceiver);
            }
            i = i2;
        }
        List<TypeParameterDescriptor> ownTypeParameters = childContext$default.getTypeDeserializer().getOwnTypeParameters();
        MemberDeserializer memberDeserializer = childContext$default.getMemberDeserializer();
        List<ProtoBuf.ValueParameter> valueParameterList = function.getValueParameterList();
        valueParameterList.getClass();
        List<ValueParameterDescriptor> valueParameters = memberDeserializer.valueParameters(valueParameterList, function, AnnotatedCallableKind.FUNCTION);
        KotlinType type2 = childContext$default.getTypeDeserializer().type(ProtoTypeTableUtilKt.returnType(function, this.c.getTypeTable()));
        ProtoEnumFlags protoEnumFlags = ProtoEnumFlags.INSTANCE;
        Modality modality = protoEnumFlags.modality(Flags.MODALITY.get(flags));
        DescriptorVisibility descriptorVisibility = ProtoEnumFlagsUtilsKt.descriptorVisibility(protoEnumFlags, Flags.VISIBILITY.get(flags));
        lm5 lm5Var = lm5.a;
        lm5Var.getClass();
        initializeWithCoroutinesExperimentalityStatus(deserializedSimpleFunctionDescriptor, receiverParameterDescriptor, dispatchReceiverParameter, arrayList, ownTypeParameters, valueParameters, type2, modality, descriptorVisibility, lm5Var);
        Boolean bool = Flags.IS_OPERATOR.get(flags);
        bool.getClass();
        deserializedSimpleFunctionDescriptor.setOperator(bool.booleanValue());
        Boolean bool2 = Flags.IS_INFIX.get(flags);
        bool2.getClass();
        deserializedSimpleFunctionDescriptor.setInfix(bool2.booleanValue());
        Boolean bool3 = Flags.IS_EXTERNAL_FUNCTION.get(flags);
        bool3.getClass();
        deserializedSimpleFunctionDescriptor.setExternal(bool3.booleanValue());
        Boolean bool4 = Flags.IS_INLINE.get(flags);
        bool4.getClass();
        deserializedSimpleFunctionDescriptor.setInline(bool4.booleanValue());
        Boolean bool5 = Flags.IS_TAILREC.get(flags);
        bool5.getClass();
        deserializedSimpleFunctionDescriptor.setTailrec(bool5.booleanValue());
        Boolean bool6 = Flags.IS_SUSPEND.get(flags);
        bool6.getClass();
        deserializedSimpleFunctionDescriptor.setSuspend(bool6.booleanValue());
        Boolean bool7 = Flags.IS_EXPECT_FUNCTION.get(flags);
        bool7.getClass();
        deserializedSimpleFunctionDescriptor.setExpect(bool7.booleanValue());
        deserializedSimpleFunctionDescriptor.setHasStableParameterNames(!Flags.IS_FUNCTION_WITH_NON_STABLE_PARAMETER_NAMES.get(flags).booleanValue());
        Pair<CallableDescriptor.UserDataKey<?>, Object> deserializeContractFromFunction = this.c.getComponents().getContractDeserializer().deserializeContractFromFunction(function, deserializedSimpleFunctionDescriptor, this.c.getTypeTable(), childContext$default.getTypeDeserializer());
        if (deserializeContractFromFunction != null) {
            deserializedSimpleFunctionDescriptor.putInUserDataMap((CallableDescriptor.UserDataKey) deserializeContractFromFunction.a, deserializeContractFromFunction.b);
        }
        return deserializedSimpleFunctionDescriptor;
    }

    @NotNull
    public final PropertyDescriptor loadProperty(@NotNull ProtoBuf.Property property) {
        DeserializationContext deserializationContext;
        Flags.FlagField<ProtoBuf.Visibility> flagField;
        Flags.FlagField<ProtoBuf.Modality> flagField2;
        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl;
        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl2;
        PropertySetterDescriptorImpl propertySetterDescriptorImpl;
        KotlinType type;
        property.getClass();
        int flags = property.hasFlags() ? property.getFlags() : loadOldFlags(property.getOldFlags());
        DeclarationDescriptor containingDeclaration = this.c.getContainingDeclaration();
        Annotations annotations = getAnnotations(property, flags, AnnotatedCallableKind.PROPERTY);
        ProtoEnumFlags protoEnumFlags = ProtoEnumFlags.INSTANCE;
        int i = flags;
        DeserializedPropertyDescriptor deserializedPropertyDescriptor = new DeserializedPropertyDescriptor(containingDeclaration, null, annotations, protoEnumFlags.modality(Flags.MODALITY.get(flags)), ProtoEnumFlagsUtilsKt.descriptorVisibility(protoEnumFlags, Flags.VISIBILITY.get(flags)), lnb.w(Flags.IS_VAR, flags), NameResolverUtilKt.getName(this.c.getNameResolver(), property.getName()), ProtoEnumFlagsUtilsKt.memberKind(protoEnumFlags, Flags.MEMBER_KIND.get(flags)), lnb.w(Flags.IS_LATEINIT, flags), lnb.w(Flags.IS_CONST, flags), lnb.w(Flags.IS_EXTERNAL_PROPERTY, flags), lnb.w(Flags.IS_DELEGATED, flags), lnb.w(Flags.IS_EXPECT_PROPERTY, flags), property, this.c.getNameResolver(), this.c.getTypeTable(), this.c.getVersionRequirementTable(), this.c.getContainerSource());
        DeserializationContext deserializationContext2 = this.c;
        List<ProtoBuf.TypeParameter> typeParameterList = property.getTypeParameterList();
        typeParameterList.getClass();
        DeserializationContext childContext$default = DeserializationContext.childContext$default(deserializationContext2, deserializedPropertyDescriptor, typeParameterList, null, null, null, null, 60, null);
        boolean w = lnb.w(Flags.HAS_GETTER, i);
        Annotations receiverParameterAnnotations = (w && ProtoTypeTableUtilKt.hasReceiver(property)) ? getReceiverParameterAnnotations(property, AnnotatedCallableKind.PROPERTY_GETTER) : Annotations.Companion.getEMPTY();
        KotlinType type2 = childContext$default.getTypeDeserializer().type(ProtoTypeTableUtilKt.returnType(property, this.c.getTypeTable()));
        List<TypeParameterDescriptor> ownTypeParameters = childContext$default.getTypeDeserializer().getOwnTypeParameters();
        ReceiverParameterDescriptor dispatchReceiverParameter = getDispatchReceiverParameter();
        ProtoBuf.Type receiverType = ProtoTypeTableUtilKt.receiverType(property, this.c.getTypeTable());
        ReceiverParameterDescriptor createExtensionReceiverParameterForCallable = (receiverType == null || (type = childContext$default.getTypeDeserializer().type(receiverType)) == null) ? null : DescriptorFactory.createExtensionReceiverParameterForCallable(deserializedPropertyDescriptor, type, receiverParameterAnnotations);
        List<ProtoBuf.Type> contextReceiverTypes = ProtoTypeTableUtilKt.contextReceiverTypes(property, this.c.getTypeTable());
        ArrayList arrayList = new ArrayList(k13.r(contextReceiverTypes, 10));
        int i2 = 0;
        for (Object obj : contextReceiverTypes) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                b.q();
                throw null;
            }
            arrayList.add(toContextReceiver((ProtoBuf.Type) obj, childContext$default, deserializedPropertyDescriptor, i2));
            i2 = i3;
        }
        deserializedPropertyDescriptor.setType(type2, ownTypeParameters, dispatchReceiverParameter, createExtensionReceiverParameterForCallable, arrayList);
        boolean w2 = lnb.w(Flags.HAS_ANNOTATIONS, i);
        Flags.FlagField<ProtoBuf.Visibility> flagField3 = Flags.VISIBILITY;
        ProtoBuf.Visibility visibility = flagField3.get(i);
        Flags.FlagField<ProtoBuf.Modality> flagField4 = Flags.MODALITY;
        int accessorFlags = Flags.getAccessorFlags(w2, visibility, flagField4.get(i), false, false, false);
        if (w) {
            int getterFlags = property.hasGetterFlags() ? property.getGetterFlags() : accessorFlags;
            boolean w3 = lnb.w(Flags.IS_NOT_DEFAULT, getterFlags);
            boolean w4 = lnb.w(Flags.IS_EXTERNAL_ACCESSOR, getterFlags);
            boolean w5 = lnb.w(Flags.IS_INLINE_ACCESSOR, getterFlags);
            Annotations annotations2 = getAnnotations(property, getterFlags, AnnotatedCallableKind.PROPERTY_GETTER);
            if (w3) {
                ProtoEnumFlags protoEnumFlags2 = ProtoEnumFlags.INSTANCE;
                deserializationContext = childContext$default;
                flagField2 = flagField4;
                flagField = flagField3;
                propertyGetterDescriptorImpl = new PropertyGetterDescriptorImpl(deserializedPropertyDescriptor, annotations2, protoEnumFlags2.modality(flagField4.get(getterFlags)), ProtoEnumFlagsUtilsKt.descriptorVisibility(protoEnumFlags2, flagField3.get(getterFlags)), !w3, w4, w5, deserializedPropertyDescriptor.getKind(), null, SourceElement.NO_SOURCE);
            } else {
                deserializationContext = childContext$default;
                flagField = flagField3;
                flagField2 = flagField4;
                propertyGetterDescriptorImpl = DescriptorFactory.createDefaultGetter(deserializedPropertyDescriptor, annotations2);
                propertyGetterDescriptorImpl.getClass();
            }
            propertyGetterDescriptorImpl.initialize(deserializedPropertyDescriptor.getReturnType());
        } else {
            deserializationContext = childContext$default;
            flagField = flagField3;
            flagField2 = flagField4;
            propertyGetterDescriptorImpl = null;
        }
        if (lnb.w(Flags.HAS_SETTER, i)) {
            if (property.hasSetterFlags()) {
                accessorFlags = property.getSetterFlags();
            }
            int i4 = accessorFlags;
            boolean w6 = lnb.w(Flags.IS_NOT_DEFAULT, i4);
            boolean w7 = lnb.w(Flags.IS_EXTERNAL_ACCESSOR, i4);
            boolean w8 = lnb.w(Flags.IS_INLINE_ACCESSOR, i4);
            AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.PROPERTY_SETTER;
            Annotations annotations3 = getAnnotations(property, i4, annotatedCallableKind);
            if (w6) {
                ProtoEnumFlags protoEnumFlags3 = ProtoEnumFlags.INSTANCE;
                propertyGetterDescriptorImpl2 = propertyGetterDescriptorImpl;
                PropertySetterDescriptorImpl propertySetterDescriptorImpl2 = new PropertySetterDescriptorImpl(deserializedPropertyDescriptor, annotations3, protoEnumFlags3.modality(flagField2.get(i4)), ProtoEnumFlagsUtilsKt.descriptorVisibility(protoEnumFlags3, flagField.get(i4)), !w6, w7, w8, deserializedPropertyDescriptor.getKind(), null, SourceElement.NO_SOURCE);
                propertySetterDescriptorImpl = propertySetterDescriptorImpl2;
                propertySetterDescriptorImpl.initialize((ValueParameterDescriptor) CollectionsKt.D0(DeserializationContext.childContext$default(deserializationContext, propertySetterDescriptorImpl2, km5.a, null, null, null, null, 60, null).getMemberDeserializer().valueParameters(a.c(property.getSetterValueParameter()), property, annotatedCallableKind)));
            } else {
                propertyGetterDescriptorImpl2 = propertyGetterDescriptorImpl;
                PropertySetterDescriptorImpl createDefaultSetter = DescriptorFactory.createDefaultSetter(deserializedPropertyDescriptor, annotations3, Annotations.Companion.getEMPTY());
                createDefaultSetter.getClass();
                propertySetterDescriptorImpl = createDefaultSetter;
            }
        } else {
            propertyGetterDescriptorImpl2 = propertyGetterDescriptorImpl;
            propertySetterDescriptorImpl = null;
        }
        if (lnb.w(Flags.HAS_CONSTANT, i)) {
            deserializedPropertyDescriptor.setCompileTimeInitializerFactory(new MemberDeserializer$loadProperty$4(this, property, deserializedPropertyDescriptor));
        }
        DeclarationDescriptor containingDeclaration2 = this.c.getContainingDeclaration();
        ClassDescriptor classDescriptor = containingDeclaration2 instanceof ClassDescriptor ? (ClassDescriptor) containingDeclaration2 : null;
        if ((classDescriptor != null ? classDescriptor.getKind() : null) == ClassKind.ANNOTATION_CLASS) {
            deserializedPropertyDescriptor.setCompileTimeInitializerFactory(new MemberDeserializer$loadProperty$5(this, property, deserializedPropertyDescriptor));
        }
        deserializedPropertyDescriptor.initialize(propertyGetterDescriptorImpl2, propertySetterDescriptorImpl, new FieldDescriptorImpl(getPropertyFieldAnnotations(property, false), deserializedPropertyDescriptor), new FieldDescriptorImpl(getPropertyFieldAnnotations(property, true), deserializedPropertyDescriptor));
        return deserializedPropertyDescriptor;
    }

    @NotNull
    public final TypeAliasDescriptor loadTypeAlias(@NotNull ProtoBuf.TypeAlias typeAlias) {
        typeAlias.getClass();
        Annotations.Companion companion = Annotations.Companion;
        List<ProtoBuf.Annotation> annotationList = typeAlias.getAnnotationList();
        annotationList.getClass();
        ArrayList arrayList = new ArrayList(k13.r(annotationList, 10));
        for (ProtoBuf.Annotation annotation : annotationList) {
            AnnotationDeserializer annotationDeserializer = this.annotationDeserializer;
            annotation.getClass();
            arrayList.add(annotationDeserializer.deserializeAnnotation(annotation, this.c.getNameResolver()));
        }
        DeserializedTypeAliasDescriptor deserializedTypeAliasDescriptor = new DeserializedTypeAliasDescriptor(this.c.getStorageManager(), this.c.getContainingDeclaration(), companion.create(arrayList), NameResolverUtilKt.getName(this.c.getNameResolver(), typeAlias.getName()), ProtoEnumFlagsUtilsKt.descriptorVisibility(ProtoEnumFlags.INSTANCE, Flags.VISIBILITY.get(typeAlias.getFlags())), typeAlias, this.c.getNameResolver(), this.c.getTypeTable(), this.c.getVersionRequirementTable(), this.c.getContainerSource());
        DeserializationContext deserializationContext = this.c;
        List<ProtoBuf.TypeParameter> typeParameterList = typeAlias.getTypeParameterList();
        typeParameterList.getClass();
        DeserializationContext childContext$default = DeserializationContext.childContext$default(deserializationContext, deserializedTypeAliasDescriptor, typeParameterList, null, null, null, null, 60, null);
        deserializedTypeAliasDescriptor.initialize(childContext$default.getTypeDeserializer().getOwnTypeParameters(), childContext$default.getTypeDeserializer().simpleType(ProtoTypeTableUtilKt.underlyingType(typeAlias, this.c.getTypeTable()), false), childContext$default.getTypeDeserializer().simpleType(ProtoTypeTableUtilKt.expandedType(typeAlias, this.c.getTypeTable()), false));
        return deserializedTypeAliasDescriptor;
    }
}
