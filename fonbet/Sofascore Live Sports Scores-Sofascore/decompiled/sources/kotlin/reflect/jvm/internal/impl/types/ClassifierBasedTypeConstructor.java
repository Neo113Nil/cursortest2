package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class ClassifierBasedTypeConstructor implements TypeConstructor {
    private int hashCode;

    private final boolean hasMeaningfulFqName(ClassifierDescriptor classifierDescriptor) {
        return (ErrorUtils.isError(classifierDescriptor) || DescriptorUtils.isLocal(classifierDescriptor)) ? false : true;
    }

    public final boolean areFqNamesEqual(@NotNull ClassifierDescriptor classifierDescriptor, @NotNull ClassifierDescriptor classifierDescriptor2) {
        classifierDescriptor.getClass();
        classifierDescriptor2.getClass();
        if (!Intrinsics.c(classifierDescriptor.getName(), classifierDescriptor2.getName())) {
            return false;
        }
        DeclarationDescriptor containingDeclaration = classifierDescriptor.getContainingDeclaration();
        for (DeclarationDescriptor containingDeclaration2 = classifierDescriptor2.getContainingDeclaration(); containingDeclaration != null && containingDeclaration2 != null; containingDeclaration2 = containingDeclaration2.getContainingDeclaration()) {
            if (containingDeclaration instanceof ModuleDescriptor) {
                return containingDeclaration2 instanceof ModuleDescriptor;
            }
            if (containingDeclaration2 instanceof ModuleDescriptor) {
                return false;
            }
            if (containingDeclaration instanceof PackageFragmentDescriptor) {
                return (containingDeclaration2 instanceof PackageFragmentDescriptor) && Intrinsics.c(((PackageFragmentDescriptor) containingDeclaration).getFqName(), ((PackageFragmentDescriptor) containingDeclaration2).getFqName());
            }
            if ((containingDeclaration2 instanceof PackageFragmentDescriptor) || !Intrinsics.c(containingDeclaration.getName(), containingDeclaration2.getName())) {
                return false;
            }
            containingDeclaration = containingDeclaration.getContainingDeclaration();
        }
        return true;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TypeConstructor) || obj.hashCode() != hashCode()) {
            return false;
        }
        TypeConstructor typeConstructor = (TypeConstructor) obj;
        if (typeConstructor.getParameters().size() != getParameters().size()) {
            return false;
        }
        ClassifierDescriptor mo893getDeclarationDescriptor = mo893getDeclarationDescriptor();
        ClassifierDescriptor mo893getDeclarationDescriptor2 = typeConstructor.mo893getDeclarationDescriptor();
        if (mo893getDeclarationDescriptor2 != null && hasMeaningfulFqName(mo893getDeclarationDescriptor) && hasMeaningfulFqName(mo893getDeclarationDescriptor2)) {
            return isSameClassifier(mo893getDeclarationDescriptor2);
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    /* renamed from: getDeclarationDescriptor */
    public abstract ClassifierDescriptor mo893getDeclarationDescriptor();

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        ClassifierDescriptor mo893getDeclarationDescriptor = mo893getDeclarationDescriptor();
        int hashCode = hasMeaningfulFqName(mo893getDeclarationDescriptor) ? DescriptorUtils.getFqName(mo893getDeclarationDescriptor).hashCode() : System.identityHashCode(this);
        this.hashCode = hashCode;
        return hashCode;
    }

    public abstract boolean isSameClassifier(@NotNull ClassifierDescriptor classifierDescriptor);
}
