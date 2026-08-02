package kotlin.reflect.jvm.internal.impl.descriptors;

import defpackage.e5h;
import defpackage.i5h;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.ResolutionAnchorProviderKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class FindClassInModuleKt {
    @Nullable
    public static final ClassDescriptor findClassAcrossModuleDependencies(@NotNull ModuleDescriptor moduleDescriptor, @NotNull ClassId classId) {
        moduleDescriptor.getClass();
        classId.getClass();
        ClassifierDescriptor findClassifierAcrossModuleDependencies = findClassifierAcrossModuleDependencies(moduleDescriptor, classId);
        if (findClassifierAcrossModuleDependencies instanceof ClassDescriptor) {
            return (ClassDescriptor) findClassifierAcrossModuleDependencies;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013f A[RETURN] */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ClassifierDescriptor findClassifierAcrossModuleDependencies(@NotNull ModuleDescriptor moduleDescriptor, @NotNull ClassId classId) {
        moduleDescriptor.getClass();
        classId.getClass();
        ModuleDescriptor resolutionAnchorIfAny = ResolutionAnchorProviderKt.getResolutionAnchorIfAny(moduleDescriptor);
        if (resolutionAnchorIfAny == null) {
            FqName packageFqName = classId.getPackageFqName();
            packageFqName.getClass();
            PackageViewDescriptor packageViewDescriptor = moduleDescriptor.getPackage(packageFqName);
            List<Name> pathSegments = classId.getRelativeClassName().pathSegments();
            pathSegments.getClass();
            MemberScope memberScope = packageViewDescriptor.getMemberScope();
            Object Y = CollectionsKt.Y(pathSegments);
            Y.getClass();
            ClassifierDescriptor mo895getContributedClassifier = memberScope.mo895getContributedClassifier((Name) Y, NoLookupLocation.FROM_DESERIALIZATION);
            if (mo895getContributedClassifier != null) {
                for (Name name : pathSegments.subList(1, pathSegments.size())) {
                    if (mo895getContributedClassifier instanceof ClassDescriptor) {
                        MemberScope unsubstitutedInnerClassesScope = ((ClassDescriptor) mo895getContributedClassifier).getUnsubstitutedInnerClassesScope();
                        name.getClass();
                        ClassifierDescriptor mo895getContributedClassifier2 = unsubstitutedInnerClassesScope.mo895getContributedClassifier(name, NoLookupLocation.FROM_DESERIALIZATION);
                        mo895getContributedClassifier = mo895getContributedClassifier2 instanceof ClassDescriptor ? (ClassDescriptor) mo895getContributedClassifier2 : null;
                        if (mo895getContributedClassifier != null) {
                        }
                    }
                }
                return mo895getContributedClassifier;
            }
        } else {
            FqName packageFqName2 = classId.getPackageFqName();
            packageFqName2.getClass();
            PackageViewDescriptor packageViewDescriptor2 = resolutionAnchorIfAny.getPackage(packageFqName2);
            List<Name> pathSegments2 = classId.getRelativeClassName().pathSegments();
            pathSegments2.getClass();
            MemberScope memberScope2 = packageViewDescriptor2.getMemberScope();
            Object Y2 = CollectionsKt.Y(pathSegments2);
            Y2.getClass();
            ClassifierDescriptor mo895getContributedClassifier3 = memberScope2.mo895getContributedClassifier((Name) Y2, NoLookupLocation.FROM_DESERIALIZATION);
            if (mo895getContributedClassifier3 != null) {
                for (Name name2 : pathSegments2.subList(1, pathSegments2.size())) {
                    if (mo895getContributedClassifier3 instanceof ClassDescriptor) {
                        MemberScope unsubstitutedInnerClassesScope2 = ((ClassDescriptor) mo895getContributedClassifier3).getUnsubstitutedInnerClassesScope();
                        name2.getClass();
                        ClassifierDescriptor mo895getContributedClassifier4 = unsubstitutedInnerClassesScope2.mo895getContributedClassifier(name2, NoLookupLocation.FROM_DESERIALIZATION);
                        mo895getContributedClassifier3 = mo895getContributedClassifier4 instanceof ClassDescriptor ? (ClassDescriptor) mo895getContributedClassifier4 : null;
                        if (mo895getContributedClassifier3 != null) {
                        }
                    }
                }
                if (mo895getContributedClassifier3 == null) {
                    return mo895getContributedClassifier3;
                }
                FqName packageFqName3 = classId.getPackageFqName();
                packageFqName3.getClass();
                PackageViewDescriptor packageViewDescriptor3 = moduleDescriptor.getPackage(packageFqName3);
                List<Name> pathSegments3 = classId.getRelativeClassName().pathSegments();
                pathSegments3.getClass();
                MemberScope memberScope3 = packageViewDescriptor3.getMemberScope();
                Object Y3 = CollectionsKt.Y(pathSegments3);
                Y3.getClass();
                ClassifierDescriptor mo895getContributedClassifier5 = memberScope3.mo895getContributedClassifier((Name) Y3, NoLookupLocation.FROM_DESERIALIZATION);
                if (mo895getContributedClassifier5 != null) {
                    for (Name name3 : pathSegments3.subList(1, pathSegments3.size())) {
                        if (mo895getContributedClassifier5 instanceof ClassDescriptor) {
                            MemberScope unsubstitutedInnerClassesScope3 = ((ClassDescriptor) mo895getContributedClassifier5).getUnsubstitutedInnerClassesScope();
                            name3.getClass();
                            ClassifierDescriptor mo895getContributedClassifier6 = unsubstitutedInnerClassesScope3.mo895getContributedClassifier(name3, NoLookupLocation.FROM_DESERIALIZATION);
                            mo895getContributedClassifier5 = mo895getContributedClassifier6 instanceof ClassDescriptor ? (ClassDescriptor) mo895getContributedClassifier6 : null;
                            if (mo895getContributedClassifier5 != null) {
                            }
                        }
                    }
                    return mo895getContributedClassifier5;
                }
            }
            mo895getContributedClassifier3 = null;
            if (mo895getContributedClassifier3 == null) {
            }
        }
        return null;
    }

    @NotNull
    public static final ClassDescriptor findNonGenericClassAcrossDependencies(@NotNull ModuleDescriptor moduleDescriptor, @NotNull ClassId classId, @NotNull NotFoundClasses notFoundClasses) {
        moduleDescriptor.getClass();
        classId.getClass();
        notFoundClasses.getClass();
        ClassDescriptor findClassAcrossModuleDependencies = findClassAcrossModuleDependencies(moduleDescriptor, classId);
        return findClassAcrossModuleDependencies != null ? findClassAcrossModuleDependencies : notFoundClasses.getClass(classId, i5h.q(i5h.n(e5h.e(classId, FindClassInModuleKt$findNonGenericClassAcrossDependencies$typeParametersCount$1.INSTANCE), FindClassInModuleKt$findNonGenericClassAcrossDependencies$typeParametersCount$2.INSTANCE)));
    }

    @Nullable
    public static final TypeAliasDescriptor findTypeAliasAcrossModuleDependencies(@NotNull ModuleDescriptor moduleDescriptor, @NotNull ClassId classId) {
        moduleDescriptor.getClass();
        classId.getClass();
        ClassifierDescriptor findClassifierAcrossModuleDependencies = findClassifierAcrossModuleDependencies(moduleDescriptor, classId);
        if (findClassifierAcrossModuleDependencies instanceof TypeAliasDescriptor) {
            return (TypeAliasDescriptor) findClassifierAcrossModuleDependencies;
        }
        return null;
    }
}
