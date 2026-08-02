package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.ResolutionAnchorProviderKt;
import kotlin.sequences.SequencesKt;

/* compiled from: findClassInModule.kt */
/* loaded from: classes10.dex */
public final class FindClassInModuleKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int findNonGenericClassAcrossDependencies$lambda$1(ClassId it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return 0;
    }

    public static final ClassDescriptor findClassAcrossModuleDependencies(ModuleDescriptor moduleDescriptor, ClassId classId) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(classId, "classId");
        ClassifierDescriptor findClassifierAcrossModuleDependencies = findClassifierAcrossModuleDependencies(moduleDescriptor, classId);
        if (findClassifierAcrossModuleDependencies instanceof ClassDescriptor) {
            return (ClassDescriptor) findClassifierAcrossModuleDependencies;
        }
        return null;
    }

    public static final ClassDescriptor findNonGenericClassAcrossDependencies(ModuleDescriptor moduleDescriptor, ClassId classId, NotFoundClasses notFoundClasses) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(classId, "classId");
        Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
        ClassDescriptor findClassAcrossModuleDependencies = findClassAcrossModuleDependencies(moduleDescriptor, classId);
        return findClassAcrossModuleDependencies != null ? findClassAcrossModuleDependencies : notFoundClasses.getClass(classId, SequencesKt.toList(SequencesKt.map(SequencesKt.generateSequence(classId, new PropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt$findNonGenericClassAcrossDependencies$typeParametersCount$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((ClassId) obj).getOuterClassId();
            }
        }), new Function1() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt$$Lambda$0
            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                int findNonGenericClassAcrossDependencies$lambda$1;
                findNonGenericClassAcrossDependencies$lambda$1 = FindClassInModuleKt.findNonGenericClassAcrossDependencies$lambda$1((ClassId) obj);
                return Integer.valueOf(findNonGenericClassAcrossDependencies$lambda$1);
            }
        })));
    }

    public static final TypeAliasDescriptor findTypeAliasAcrossModuleDependencies(ModuleDescriptor moduleDescriptor, ClassId classId) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(classId, "classId");
        ClassifierDescriptor findClassifierAcrossModuleDependencies = findClassifierAcrossModuleDependencies(moduleDescriptor, classId);
        if (findClassifierAcrossModuleDependencies instanceof TypeAliasDescriptor) {
            return (TypeAliasDescriptor) findClassifierAcrossModuleDependencies;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0130 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ClassifierDescriptor findClassifierAcrossModuleDependencies(ModuleDescriptor moduleDescriptor, ClassId classId) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(classId, "classId");
        ModuleDescriptor resolutionAnchorIfAny = ResolutionAnchorProviderKt.getResolutionAnchorIfAny(moduleDescriptor);
        if (resolutionAnchorIfAny == null) {
            PackageViewDescriptor packageViewDescriptor = moduleDescriptor.getPackage(classId.getPackageFqName());
            List<Name> pathSegments = classId.getRelativeClassName().pathSegments();
            ClassDescriptor contributedClassifier = packageViewDescriptor.getMemberScope().mo14766getContributedClassifier((Name) CollectionsKt.first((List) pathSegments), NoLookupLocation.FROM_DESERIALIZATION);
            if (contributedClassifier == null) {
                return null;
            }
            for (Name name : pathSegments.subList(1, pathSegments.size())) {
                if (!(contributedClassifier instanceof ClassDescriptor)) {
                    return null;
                }
                ClassifierDescriptor contributedClassifier2 = ((ClassDescriptor) contributedClassifier).getUnsubstitutedInnerClassesScope().mo14766getContributedClassifier(name, NoLookupLocation.FROM_DESERIALIZATION);
                ClassDescriptor classDescriptor = contributedClassifier2 instanceof ClassDescriptor ? (ClassDescriptor) contributedClassifier2 : null;
                if (classDescriptor == null) {
                    return null;
                }
                contributedClassifier = classDescriptor;
            }
            return contributedClassifier;
        }
        PackageViewDescriptor packageViewDescriptor2 = resolutionAnchorIfAny.getPackage(classId.getPackageFqName());
        List<Name> pathSegments2 = classId.getRelativeClassName().pathSegments();
        ClassDescriptor contributedClassifier3 = packageViewDescriptor2.getMemberScope().mo14766getContributedClassifier((Name) CollectionsKt.first((List) pathSegments2), NoLookupLocation.FROM_DESERIALIZATION);
        if (contributedClassifier3 != null) {
            for (Name name2 : pathSegments2.subList(1, pathSegments2.size())) {
                if (contributedClassifier3 instanceof ClassDescriptor) {
                    ClassifierDescriptor contributedClassifier4 = ((ClassDescriptor) contributedClassifier3).getUnsubstitutedInnerClassesScope().mo14766getContributedClassifier(name2, NoLookupLocation.FROM_DESERIALIZATION);
                    ClassDescriptor classDescriptor2 = contributedClassifier4 instanceof ClassDescriptor ? (ClassDescriptor) contributedClassifier4 : null;
                    if (classDescriptor2 != null) {
                        contributedClassifier3 = classDescriptor2;
                    }
                }
            }
            if (contributedClassifier3 == null) {
                return contributedClassifier3;
            }
            PackageViewDescriptor packageViewDescriptor3 = moduleDescriptor.getPackage(classId.getPackageFqName());
            List<Name> pathSegments3 = classId.getRelativeClassName().pathSegments();
            ClassDescriptor contributedClassifier5 = packageViewDescriptor3.getMemberScope().mo14766getContributedClassifier((Name) CollectionsKt.first((List) pathSegments3), NoLookupLocation.FROM_DESERIALIZATION);
            if (contributedClassifier5 == null) {
                return null;
            }
            for (Name name3 : pathSegments3.subList(1, pathSegments3.size())) {
                if (!(contributedClassifier5 instanceof ClassDescriptor)) {
                    return null;
                }
                ClassifierDescriptor contributedClassifier6 = ((ClassDescriptor) contributedClassifier5).getUnsubstitutedInnerClassesScope().mo14766getContributedClassifier(name3, NoLookupLocation.FROM_DESERIALIZATION);
                ClassDescriptor classDescriptor3 = contributedClassifier6 instanceof ClassDescriptor ? (ClassDescriptor) contributedClassifier6 : null;
                if (classDescriptor3 == null) {
                    return null;
                }
                contributedClassifier5 = classDescriptor3;
            }
            return contributedClassifier5;
        }
        contributedClassifier3 = null;
        if (contributedClassifier3 == null) {
        }
    }
}
