package kotlin.reflect.jvm.internal.impl.builtins;

import defpackage.tub;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class UnsignedTypes {

    @NotNull
    public static final UnsignedTypes INSTANCE = new UnsignedTypes();

    @NotNull
    private static final HashMap<ClassId, ClassId> arrayClassIdToUnsignedClassId;

    @NotNull
    private static final Set<Name> arrayClassesShortNames;

    @NotNull
    private static final Set<Name> unsignedArrayTypeNames;

    @NotNull
    private static final HashMap<UnsignedArrayType, Name> unsignedArrayTypeToArrayCall;

    @NotNull
    private static final HashMap<ClassId, ClassId> unsignedClassIdToArrayClassId;

    @NotNull
    private static final Set<Name> unsignedTypeNames;

    static {
        UnsignedType[] values = UnsignedType.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (UnsignedType unsignedType : values) {
            arrayList.add(unsignedType.getTypeName());
        }
        unsignedTypeNames = CollectionsKt.W0(arrayList);
        UnsignedArrayType[] values2 = UnsignedArrayType.values();
        ArrayList arrayList2 = new ArrayList(values2.length);
        for (UnsignedArrayType unsignedArrayType : values2) {
            arrayList2.add(unsignedArrayType.getTypeName());
        }
        unsignedArrayTypeNames = CollectionsKt.W0(arrayList2);
        arrayClassIdToUnsignedClassId = new HashMap<>();
        unsignedClassIdToArrayClassId = new HashMap<>();
        unsignedArrayTypeToArrayCall = tub.f(new Pair(UnsignedArrayType.UBYTEARRAY, Name.identifier("ubyteArrayOf")), new Pair(UnsignedArrayType.USHORTARRAY, Name.identifier("ushortArrayOf")), new Pair(UnsignedArrayType.UINTARRAY, Name.identifier("uintArrayOf")), new Pair(UnsignedArrayType.ULONGARRAY, Name.identifier("ulongArrayOf")));
        UnsignedType[] values3 = UnsignedType.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (UnsignedType unsignedType2 : values3) {
            linkedHashSet.add(unsignedType2.getArrayClassId().getShortClassName());
        }
        arrayClassesShortNames = linkedHashSet;
        for (UnsignedType unsignedType3 : UnsignedType.values()) {
            arrayClassIdToUnsignedClassId.put(unsignedType3.getArrayClassId(), unsignedType3.getClassId());
            unsignedClassIdToArrayClassId.put(unsignedType3.getClassId(), unsignedType3.getArrayClassId());
        }
    }

    private UnsignedTypes() {
    }

    public static final boolean isUnsignedType(@NotNull KotlinType kotlinType) {
        ClassifierDescriptor mo893getDeclarationDescriptor;
        kotlinType.getClass();
        if (TypeUtils.noExpectedType(kotlinType) || (mo893getDeclarationDescriptor = kotlinType.getConstructor().mo893getDeclarationDescriptor()) == null) {
            return false;
        }
        return INSTANCE.isUnsignedClass(mo893getDeclarationDescriptor);
    }

    @Nullable
    public final ClassId getUnsignedClassIdByArrayClassId(@NotNull ClassId classId) {
        classId.getClass();
        return arrayClassIdToUnsignedClassId.get(classId);
    }

    public final boolean isShortNameOfUnsignedArray(@NotNull Name name) {
        name.getClass();
        return arrayClassesShortNames.contains(name);
    }

    public final boolean isUnsignedClass(@NotNull DeclarationDescriptor declarationDescriptor) {
        declarationDescriptor.getClass();
        DeclarationDescriptor containingDeclaration = declarationDescriptor.getContainingDeclaration();
        return (containingDeclaration instanceof PackageFragmentDescriptor) && Intrinsics.c(((PackageFragmentDescriptor) containingDeclaration).getFqName(), StandardNames.BUILT_INS_PACKAGE_FQ_NAME) && unsignedTypeNames.contains(declarationDescriptor.getName());
    }
}
