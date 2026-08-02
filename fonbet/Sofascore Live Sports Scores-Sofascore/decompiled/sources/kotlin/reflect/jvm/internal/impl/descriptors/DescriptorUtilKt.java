package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.util.OperatorNameConventions;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class DescriptorUtilKt {
    @Nullable
    public static final ClassifierDescriptor getTopLevelContainingClassifier(@NotNull DeclarationDescriptor declarationDescriptor) {
        declarationDescriptor.getClass();
        DeclarationDescriptor containingDeclaration = declarationDescriptor.getContainingDeclaration();
        if (containingDeclaration != null && !(declarationDescriptor instanceof PackageFragmentDescriptor)) {
            if (!isTopLevelInPackage(containingDeclaration)) {
                return getTopLevelContainingClassifier(containingDeclaration);
            }
            if (containingDeclaration instanceof ClassifierDescriptor) {
                return (ClassifierDescriptor) containingDeclaration;
            }
        }
        return null;
    }

    public static final boolean isTopLevelInPackage(@NotNull DeclarationDescriptor declarationDescriptor) {
        declarationDescriptor.getClass();
        return declarationDescriptor.getContainingDeclaration() instanceof PackageFragmentDescriptor;
    }

    public static final boolean isTypedEqualsInValueClass(@NotNull FunctionDescriptor functionDescriptor) {
        SimpleType defaultType;
        KotlinType replaceArgumentsWithStarProjections;
        KotlinType returnType;
        functionDescriptor.getClass();
        DeclarationDescriptor containingDeclaration = functionDescriptor.getContainingDeclaration();
        ClassDescriptor classDescriptor = containingDeclaration instanceof ClassDescriptor ? (ClassDescriptor) containingDeclaration : null;
        if (classDescriptor != null) {
            ClassDescriptor classDescriptor2 = InlineClassesUtilsKt.isValueClass(classDescriptor) ? classDescriptor : null;
            if (classDescriptor2 != null && (defaultType = classDescriptor2.getDefaultType()) != null && (replaceArgumentsWithStarProjections = TypeUtilsKt.replaceArgumentsWithStarProjections(defaultType)) != null && (returnType = functionDescriptor.getReturnType()) != null && Intrinsics.c(functionDescriptor.getName(), OperatorNameConventions.EQUALS) && ((TypeUtilsKt.isBoolean(returnType) || TypeUtilsKt.isNothing(returnType)) && functionDescriptor.getValueParameters().size() == 1)) {
                KotlinType type = functionDescriptor.getValueParameters().get(0).getType();
                type.getClass();
                if (Intrinsics.c(TypeUtilsKt.replaceArgumentsWithStarProjections(type), replaceArgumentsWithStarProjections) && functionDescriptor.getContextReceiverParameters().isEmpty() && functionDescriptor.getExtensionReceiverParameter() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Nullable
    public static final ClassDescriptor resolveClassByFqName(@NotNull ModuleDescriptor moduleDescriptor, @NotNull FqName fqName, @NotNull LookupLocation lookupLocation) {
        ClassifierDescriptor classifierDescriptor;
        MemberScope unsubstitutedInnerClassesScope;
        moduleDescriptor.getClass();
        fqName.getClass();
        lookupLocation.getClass();
        if (fqName.isRoot()) {
            return null;
        }
        FqName parent = fqName.parent();
        parent.getClass();
        MemberScope memberScope = moduleDescriptor.getPackage(parent).getMemberScope();
        Name shortName = fqName.shortName();
        shortName.getClass();
        ClassifierDescriptor mo895getContributedClassifier = memberScope.mo895getContributedClassifier(shortName, lookupLocation);
        ClassDescriptor classDescriptor = mo895getContributedClassifier instanceof ClassDescriptor ? (ClassDescriptor) mo895getContributedClassifier : null;
        if (classDescriptor != null) {
            return classDescriptor;
        }
        FqName parent2 = fqName.parent();
        parent2.getClass();
        ClassDescriptor resolveClassByFqName = resolveClassByFqName(moduleDescriptor, parent2, lookupLocation);
        if (resolveClassByFqName == null || (unsubstitutedInnerClassesScope = resolveClassByFqName.getUnsubstitutedInnerClassesScope()) == null) {
            classifierDescriptor = null;
        } else {
            Name shortName2 = fqName.shortName();
            shortName2.getClass();
            classifierDescriptor = unsubstitutedInnerClassesScope.mo895getContributedClassifier(shortName2, lookupLocation);
        }
        if (classifierDescriptor instanceof ClassDescriptor) {
            return (ClassDescriptor) classifierDescriptor;
        }
        return null;
    }
}
