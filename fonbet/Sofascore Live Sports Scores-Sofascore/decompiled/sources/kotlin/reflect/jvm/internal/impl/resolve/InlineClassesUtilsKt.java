package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InlineClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.MultiFieldValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.checker.SimpleClassicTypeSystemContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class InlineClassesUtilsKt {

    @NotNull
    private static final ClassId JVM_INLINE_ANNOTATION_CLASS_ID;

    @NotNull
    private static final FqName JVM_INLINE_ANNOTATION_FQ_NAME;

    static {
        FqName fqName = new FqName("kotlin.jvm.JvmInline");
        JVM_INLINE_ANNOTATION_FQ_NAME = fqName;
        ClassId classId = ClassId.topLevel(fqName);
        classId.getClass();
        JVM_INLINE_ANNOTATION_CLASS_ID = classId;
    }

    public static final boolean isGetterOfUnderlyingPropertyOfValueClass(@NotNull CallableDescriptor callableDescriptor) {
        callableDescriptor.getClass();
        if (!(callableDescriptor instanceof PropertyGetterDescriptor)) {
            return false;
        }
        PropertyDescriptor correspondingProperty = ((PropertyGetterDescriptor) callableDescriptor).getCorrespondingProperty();
        correspondingProperty.getClass();
        return isUnderlyingPropertyOfValueClass(correspondingProperty);
    }

    public static final boolean isInlineClass(@NotNull DeclarationDescriptor declarationDescriptor) {
        declarationDescriptor.getClass();
        return (declarationDescriptor instanceof ClassDescriptor) && (((ClassDescriptor) declarationDescriptor).getValueClassRepresentation() instanceof InlineClassRepresentation);
    }

    public static final boolean isInlineClassType(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        ClassifierDescriptor mo893getDeclarationDescriptor = kotlinType.getConstructor().mo893getDeclarationDescriptor();
        if (mo893getDeclarationDescriptor != null) {
            return isInlineClass(mo893getDeclarationDescriptor);
        }
        return false;
    }

    public static final boolean isMultiFieldValueClass(@NotNull DeclarationDescriptor declarationDescriptor) {
        declarationDescriptor.getClass();
        return (declarationDescriptor instanceof ClassDescriptor) && (((ClassDescriptor) declarationDescriptor).getValueClassRepresentation() instanceof MultiFieldValueClassRepresentation);
    }

    public static final boolean isUnderlyingPropertyOfInlineClass(@NotNull VariableDescriptor variableDescriptor) {
        InlineClassRepresentation<SimpleType> inlineClassRepresentation;
        variableDescriptor.getClass();
        if (variableDescriptor.getExtensionReceiverParameter() != null) {
            return false;
        }
        DeclarationDescriptor containingDeclaration = variableDescriptor.getContainingDeclaration();
        Name name = null;
        ClassDescriptor classDescriptor = containingDeclaration instanceof ClassDescriptor ? (ClassDescriptor) containingDeclaration : null;
        if (classDescriptor != null && (inlineClassRepresentation = DescriptorUtilsKt.getInlineClassRepresentation(classDescriptor)) != null) {
            name = inlineClassRepresentation.getUnderlyingPropertyName();
        }
        return Intrinsics.c(name, variableDescriptor.getName());
    }

    public static final boolean isUnderlyingPropertyOfValueClass(@NotNull VariableDescriptor variableDescriptor) {
        ValueClassRepresentation<SimpleType> valueClassRepresentation;
        variableDescriptor.getClass();
        if (variableDescriptor.getExtensionReceiverParameter() != null) {
            return false;
        }
        DeclarationDescriptor containingDeclaration = variableDescriptor.getContainingDeclaration();
        ClassDescriptor classDescriptor = containingDeclaration instanceof ClassDescriptor ? (ClassDescriptor) containingDeclaration : null;
        if (classDescriptor == null || (valueClassRepresentation = classDescriptor.getValueClassRepresentation()) == null) {
            return false;
        }
        Name name = variableDescriptor.getName();
        name.getClass();
        return valueClassRepresentation.containsPropertyWithName(name);
    }

    public static final boolean isValueClass(@NotNull DeclarationDescriptor declarationDescriptor) {
        declarationDescriptor.getClass();
        return isInlineClass(declarationDescriptor) || isMultiFieldValueClass(declarationDescriptor);
    }

    public static final boolean isValueClassType(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        ClassifierDescriptor mo893getDeclarationDescriptor = kotlinType.getConstructor().mo893getDeclarationDescriptor();
        if (mo893getDeclarationDescriptor != null) {
            return isValueClass(mo893getDeclarationDescriptor);
        }
        return false;
    }

    public static final boolean needsMfvcFlattening(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        ClassifierDescriptor mo893getDeclarationDescriptor = kotlinType.getConstructor().mo893getDeclarationDescriptor();
        return (mo893getDeclarationDescriptor == null || !isMultiFieldValueClass(mo893getDeclarationDescriptor) || SimpleClassicTypeSystemContext.INSTANCE.isNullableType(kotlinType)) ? false : true;
    }

    @Nullable
    public static final KotlinType unsubstitutedUnderlyingType(@NotNull KotlinType kotlinType) {
        InlineClassRepresentation<SimpleType> inlineClassRepresentation;
        kotlinType.getClass();
        ClassifierDescriptor mo893getDeclarationDescriptor = kotlinType.getConstructor().mo893getDeclarationDescriptor();
        ClassDescriptor classDescriptor = mo893getDeclarationDescriptor instanceof ClassDescriptor ? (ClassDescriptor) mo893getDeclarationDescriptor : null;
        if (classDescriptor == null || (inlineClassRepresentation = DescriptorUtilsKt.getInlineClassRepresentation(classDescriptor)) == null) {
            return null;
        }
        return inlineClassRepresentation.getUnderlyingType();
    }
}
