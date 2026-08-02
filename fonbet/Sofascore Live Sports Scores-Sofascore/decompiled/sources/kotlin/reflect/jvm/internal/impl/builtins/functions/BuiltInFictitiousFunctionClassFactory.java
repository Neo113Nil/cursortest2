package kotlin.reflect.jvm.internal.impl.builtins.functions;

import defpackage.rm5;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.jvm.internal.impl.builtins.BuiltInsPackageFragment;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionInterfacePackageFragment;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKindExtractor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.text.StringsKt;
import kotlin.text.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class BuiltInFictitiousFunctionClassFactory implements ClassDescriptorFactory {

    @NotNull
    private final ModuleDescriptor module;

    @NotNull
    private final StorageManager storageManager;

    public BuiltInFictitiousFunctionClassFactory(@NotNull StorageManager storageManager, @NotNull ModuleDescriptor moduleDescriptor) {
        storageManager.getClass();
        moduleDescriptor.getClass();
        this.storageManager = storageManager;
        this.module = moduleDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    @Nullable
    public ClassDescriptor createClass(@NotNull ClassId classId) {
        classId.getClass();
        if (classId.isLocal() || classId.isNestedClass()) {
            return null;
        }
        String asString = classId.getRelativeClassName().asString();
        asString.getClass();
        if (!StringsKt.J(asString, "Function", false)) {
            return null;
        }
        FqName packageFqName = classId.getPackageFqName();
        packageFqName.getClass();
        FunctionTypeKindExtractor.KindWithArity functionalClassKindWithArity = FunctionTypeKindExtractor.Companion.getDefault().getFunctionalClassKindWithArity(packageFqName, asString);
        if (functionalClassKindWithArity == null) {
            return null;
        }
        FunctionTypeKind component1 = functionalClassKindWithArity.component1();
        int component2 = functionalClassKindWithArity.component2();
        List<PackageFragmentDescriptor> fragments = this.module.getPackage(packageFqName).getFragments();
        ArrayList arrayList = new ArrayList();
        for (Object obj : fragments) {
            if (obj instanceof BuiltInsPackageFragment) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof FunctionInterfacePackageFragment) {
                arrayList2.add(next);
            }
        }
        PackageFragmentDescriptor packageFragmentDescriptor = (FunctionInterfacePackageFragment) CollectionsKt.firstOrNull(arrayList2);
        if (packageFragmentDescriptor == null) {
            packageFragmentDescriptor = (BuiltInsPackageFragment) CollectionsKt.Y(arrayList);
        }
        return new FunctionClassDescriptor(this.storageManager, packageFragmentDescriptor, component1, component2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    @NotNull
    public Collection<ClassDescriptor> getAllContributedClassesIfPossible(@NotNull FqName fqName) {
        fqName.getClass();
        return rm5.a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    public boolean shouldCreateClass(@NotNull FqName fqName, @NotNull Name name) {
        fqName.getClass();
        name.getClass();
        String asString = name.asString();
        asString.getClass();
        return (c.v(asString, "Function", false) || c.v(asString, "KFunction", false) || c.v(asString, "SuspendFunction", false) || c.v(asString, "KSuspendFunction", false)) && FunctionTypeKindExtractor.Companion.getDefault().getFunctionalClassKindWithArity(fqName, asString) != null;
    }
}
