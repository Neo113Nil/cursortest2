package kotlin.reflect.jvm.internal.impl.resolve;

import defpackage.km5;
import defpackage.o93;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class CliSealedClassInheritorsProvider extends SealedClassInheritorsProvider {

    @NotNull
    public static final CliSealedClassInheritorsProvider INSTANCE = new CliSealedClassInheritorsProvider();

    private CliSealedClassInheritorsProvider() {
    }

    private static final void computeSealedSubclasses$collectSubclasses(ClassDescriptor classDescriptor, LinkedHashSet<ClassDescriptor> linkedHashSet, MemberScope memberScope, boolean z) {
        for (DeclarationDescriptor declarationDescriptor : ResolutionScope.DefaultImpls.getContributedDescriptors$default(memberScope, DescriptorKindFilter.CLASSIFIERS, null, 2, null)) {
            if (declarationDescriptor instanceof ClassDescriptor) {
                ClassDescriptor classDescriptor2 = (ClassDescriptor) declarationDescriptor;
                if (classDescriptor2.isExpect()) {
                    Name name = classDescriptor2.getName();
                    name.getClass();
                    ClassifierDescriptor mo895getContributedClassifier = memberScope.mo895getContributedClassifier(name, NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS);
                    classDescriptor2 = mo895getContributedClassifier instanceof ClassDescriptor ? (ClassDescriptor) mo895getContributedClassifier : mo895getContributedClassifier instanceof TypeAliasDescriptor ? ((TypeAliasDescriptor) mo895getContributedClassifier).getClassDescriptor() : null;
                }
                if (classDescriptor2 != null) {
                    if (DescriptorUtils.isDirectSubclass(classDescriptor2, classDescriptor)) {
                        linkedHashSet.add(classDescriptor2);
                    }
                    if (z) {
                        MemberScope unsubstitutedInnerClassesScope = classDescriptor2.getUnsubstitutedInnerClassesScope();
                        unsubstitutedInnerClassesScope.getClass();
                        computeSealedSubclasses$collectSubclasses(classDescriptor, linkedHashSet, unsubstitutedInnerClassesScope, z);
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
    @NotNull
    public Collection<ClassDescriptor> computeSealedSubclasses(@NotNull ClassDescriptor classDescriptor, boolean z) {
        DeclarationDescriptor declarationDescriptor;
        DeclarationDescriptor declarationDescriptor2;
        classDescriptor.getClass();
        if (classDescriptor.getModality() != Modality.SEALED) {
            return km5.a;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (z) {
            Iterator it = DescriptorUtilsKt.getParents(classDescriptor).iterator();
            while (true) {
                if (!it.hasNext()) {
                    declarationDescriptor = 0;
                    break;
                }
                declarationDescriptor = it.next();
                if (((DeclarationDescriptor) declarationDescriptor) instanceof PackageFragmentDescriptor) {
                    break;
                }
            }
            declarationDescriptor2 = declarationDescriptor;
        } else {
            declarationDescriptor2 = classDescriptor.getContainingDeclaration();
        }
        if (declarationDescriptor2 instanceof PackageFragmentDescriptor) {
            computeSealedSubclasses$collectSubclasses(classDescriptor, linkedHashSet, ((PackageFragmentDescriptor) declarationDescriptor2).getMemberScope(), z);
        }
        MemberScope unsubstitutedInnerClassesScope = classDescriptor.getUnsubstitutedInnerClassesScope();
        unsubstitutedInnerClassesScope.getClass();
        computeSealedSubclasses$collectSubclasses(classDescriptor, linkedHashSet, unsubstitutedInnerClassesScope, true);
        return CollectionsKt.H0(linkedHashSet, new Comparator() { // from class: kotlin.reflect.jvm.internal.impl.resolve.CliSealedClassInheritorsProvider$computeSealedSubclasses$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return o93.b(DescriptorUtilsKt.getFqNameSafe((ClassDescriptor) t).asString(), DescriptorUtilsKt.getFqNameSafe((ClassDescriptor) t2).asString());
            }
        });
    }
}
