package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import defpackage.ljg;
import defpackage.me4;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.CompanionObjectMapping;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.FqNamesUtilKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.name.StandardClassIds;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class JavaToKotlinClassMap {

    @NotNull
    private static final ClassId CLASS_CLASS_ID;

    @NotNull
    private static final ClassId FUNCTION_N_CLASS_ID;

    @NotNull
    private static final FqName FUNCTION_N_FQ_NAME;

    @NotNull
    public static final JavaToKotlinClassMap INSTANCE;

    @NotNull
    private static final ClassId K_CLASS_CLASS_ID;

    @NotNull
    private static final ClassId K_FUNCTION_CLASS_ID;

    @NotNull
    private static final String NUMBERED_FUNCTION_PREFIX;

    @NotNull
    private static final String NUMBERED_K_FUNCTION_PREFIX;

    @NotNull
    private static final String NUMBERED_K_SUSPEND_FUNCTION_PREFIX;

    @NotNull
    private static final String NUMBERED_SUSPEND_FUNCTION_PREFIX;

    @NotNull
    private static final HashMap<FqNameUnsafe, ClassId> javaToKotlin;

    @NotNull
    private static final HashMap<FqNameUnsafe, ClassId> kotlinToJava;

    @NotNull
    private static final List<PlatformMutabilityMapping> mutabilityMappings;

    @NotNull
    private static final HashMap<FqNameUnsafe, FqName> mutableToReadOnly;

    @NotNull
    private static final HashMap<ClassId, ClassId> mutableToReadOnlyClassId;

    @NotNull
    private static final HashMap<FqNameUnsafe, FqName> readOnlyToMutable;

    @NotNull
    private static final HashMap<ClassId, ClassId> readOnlyToMutableClassId;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class PlatformMutabilityMapping {

        @NotNull
        private final ClassId javaClass;

        @NotNull
        private final ClassId kotlinMutable;

        @NotNull
        private final ClassId kotlinReadOnly;

        public PlatformMutabilityMapping(@NotNull ClassId classId, @NotNull ClassId classId2, @NotNull ClassId classId3) {
            classId.getClass();
            classId2.getClass();
            classId3.getClass();
            this.javaClass = classId;
            this.kotlinReadOnly = classId2;
            this.kotlinMutable = classId3;
        }

        @NotNull
        public final ClassId component1() {
            return this.javaClass;
        }

        @NotNull
        public final ClassId component2() {
            return this.kotlinReadOnly;
        }

        @NotNull
        public final ClassId component3() {
            return this.kotlinMutable;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PlatformMutabilityMapping)) {
                return false;
            }
            PlatformMutabilityMapping platformMutabilityMapping = (PlatformMutabilityMapping) obj;
            return Intrinsics.c(this.javaClass, platformMutabilityMapping.javaClass) && Intrinsics.c(this.kotlinReadOnly, platformMutabilityMapping.kotlinReadOnly) && Intrinsics.c(this.kotlinMutable, platformMutabilityMapping.kotlinMutable);
        }

        @NotNull
        public final ClassId getJavaClass() {
            return this.javaClass;
        }

        public int hashCode() {
            return this.kotlinMutable.hashCode() + ((this.kotlinReadOnly.hashCode() + (this.javaClass.hashCode() * 31)) * 31);
        }

        @NotNull
        public String toString() {
            return "PlatformMutabilityMapping(javaClass=" + this.javaClass + ", kotlinReadOnly=" + this.kotlinReadOnly + ", kotlinMutable=" + this.kotlinMutable + ')';
        }
    }

    static {
        JavaToKotlinClassMap javaToKotlinClassMap = new JavaToKotlinClassMap();
        INSTANCE = javaToKotlinClassMap;
        StringBuilder sb = new StringBuilder();
        FunctionTypeKind.Function function = FunctionTypeKind.Function.INSTANCE;
        sb.append(function.getPackageFqName().toString());
        sb.append('.');
        sb.append(function.getClassNamePrefix());
        NUMBERED_FUNCTION_PREFIX = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        FunctionTypeKind.KFunction kFunction = FunctionTypeKind.KFunction.INSTANCE;
        sb2.append(kFunction.getPackageFqName().toString());
        sb2.append('.');
        sb2.append(kFunction.getClassNamePrefix());
        NUMBERED_K_FUNCTION_PREFIX = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        FunctionTypeKind.SuspendFunction suspendFunction = FunctionTypeKind.SuspendFunction.INSTANCE;
        sb3.append(suspendFunction.getPackageFqName().toString());
        sb3.append('.');
        sb3.append(suspendFunction.getClassNamePrefix());
        NUMBERED_SUSPEND_FUNCTION_PREFIX = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        FunctionTypeKind.KSuspendFunction kSuspendFunction = FunctionTypeKind.KSuspendFunction.INSTANCE;
        sb4.append(kSuspendFunction.getPackageFqName().toString());
        sb4.append('.');
        sb4.append(kSuspendFunction.getClassNamePrefix());
        NUMBERED_K_SUSPEND_FUNCTION_PREFIX = sb4.toString();
        ClassId classId = ClassId.topLevel(new FqName("kotlin.jvm.functions.FunctionN"));
        classId.getClass();
        FUNCTION_N_CLASS_ID = classId;
        FqName asSingleFqName = classId.asSingleFqName();
        asSingleFqName.getClass();
        FUNCTION_N_FQ_NAME = asSingleFqName;
        StandardClassIds standardClassIds = StandardClassIds.INSTANCE;
        K_FUNCTION_CLASS_ID = standardClassIds.getKFunction();
        K_CLASS_CLASS_ID = standardClassIds.getKClass();
        CLASS_CLASS_ID = javaToKotlinClassMap.classId(Class.class);
        javaToKotlin = new HashMap<>();
        kotlinToJava = new HashMap<>();
        mutableToReadOnly = new HashMap<>();
        readOnlyToMutable = new HashMap<>();
        mutableToReadOnlyClassId = new HashMap<>();
        readOnlyToMutableClassId = new HashMap<>();
        ClassId classId2 = ClassId.topLevel(StandardNames.FqNames.iterable);
        classId2.getClass();
        FqName fqName = StandardNames.FqNames.mutableIterable;
        FqName packageFqName = classId2.getPackageFqName();
        FqName packageFqName2 = classId2.getPackageFqName();
        packageFqName2.getClass();
        FqName tail = FqNamesUtilKt.tail(fqName, packageFqName2);
        PlatformMutabilityMapping platformMutabilityMapping = new PlatformMutabilityMapping(javaToKotlinClassMap.classId(Iterable.class), classId2, new ClassId(packageFqName, tail, false));
        ClassId classId3 = ClassId.topLevel(StandardNames.FqNames.iterator);
        classId3.getClass();
        FqName fqName2 = StandardNames.FqNames.mutableIterator;
        FqName packageFqName3 = classId3.getPackageFqName();
        FqName packageFqName4 = classId3.getPackageFqName();
        packageFqName4.getClass();
        PlatformMutabilityMapping platformMutabilityMapping2 = new PlatformMutabilityMapping(javaToKotlinClassMap.classId(Iterator.class), classId3, new ClassId(packageFqName3, FqNamesUtilKt.tail(fqName2, packageFqName4), false));
        ClassId classId4 = ClassId.topLevel(StandardNames.FqNames.collection);
        classId4.getClass();
        FqName fqName3 = StandardNames.FqNames.mutableCollection;
        FqName packageFqName5 = classId4.getPackageFqName();
        FqName packageFqName6 = classId4.getPackageFqName();
        packageFqName6.getClass();
        PlatformMutabilityMapping platformMutabilityMapping3 = new PlatformMutabilityMapping(javaToKotlinClassMap.classId(Collection.class), classId4, new ClassId(packageFqName5, FqNamesUtilKt.tail(fqName3, packageFqName6), false));
        ClassId classId5 = ClassId.topLevel(StandardNames.FqNames.list);
        classId5.getClass();
        FqName fqName4 = StandardNames.FqNames.mutableList;
        FqName packageFqName7 = classId5.getPackageFqName();
        FqName packageFqName8 = classId5.getPackageFqName();
        packageFqName8.getClass();
        PlatformMutabilityMapping platformMutabilityMapping4 = new PlatformMutabilityMapping(javaToKotlinClassMap.classId(List.class), classId5, new ClassId(packageFqName7, FqNamesUtilKt.tail(fqName4, packageFqName8), false));
        ClassId classId6 = ClassId.topLevel(StandardNames.FqNames.set);
        classId6.getClass();
        FqName fqName5 = StandardNames.FqNames.mutableSet;
        FqName packageFqName9 = classId6.getPackageFqName();
        FqName packageFqName10 = classId6.getPackageFqName();
        packageFqName10.getClass();
        PlatformMutabilityMapping platformMutabilityMapping5 = new PlatformMutabilityMapping(javaToKotlinClassMap.classId(Set.class), classId6, new ClassId(packageFqName9, FqNamesUtilKt.tail(fqName5, packageFqName10), false));
        ClassId classId7 = ClassId.topLevel(StandardNames.FqNames.listIterator);
        classId7.getClass();
        FqName fqName6 = StandardNames.FqNames.mutableListIterator;
        FqName packageFqName11 = classId7.getPackageFqName();
        FqName packageFqName12 = classId7.getPackageFqName();
        packageFqName12.getClass();
        PlatformMutabilityMapping platformMutabilityMapping6 = new PlatformMutabilityMapping(javaToKotlinClassMap.classId(ListIterator.class), classId7, new ClassId(packageFqName11, FqNamesUtilKt.tail(fqName6, packageFqName12), false));
        FqName fqName7 = StandardNames.FqNames.map;
        ClassId classId8 = ClassId.topLevel(fqName7);
        classId8.getClass();
        FqName fqName8 = StandardNames.FqNames.mutableMap;
        FqName packageFqName13 = classId8.getPackageFqName();
        FqName packageFqName14 = classId8.getPackageFqName();
        packageFqName14.getClass();
        PlatformMutabilityMapping platformMutabilityMapping7 = new PlatformMutabilityMapping(javaToKotlinClassMap.classId(Map.class), classId8, new ClassId(packageFqName13, FqNamesUtilKt.tail(fqName8, packageFqName14), false));
        ClassId createNestedClassId = ClassId.topLevel(fqName7).createNestedClassId(StandardNames.FqNames.mapEntry.shortName());
        createNestedClassId.getClass();
        FqName fqName9 = StandardNames.FqNames.mutableMapEntry;
        FqName packageFqName15 = createNestedClassId.getPackageFqName();
        FqName packageFqName16 = createNestedClassId.getPackageFqName();
        packageFqName16.getClass();
        List<PlatformMutabilityMapping> j = b.j(platformMutabilityMapping, platformMutabilityMapping2, platformMutabilityMapping3, platformMutabilityMapping4, platformMutabilityMapping5, platformMutabilityMapping6, platformMutabilityMapping7, new PlatformMutabilityMapping(javaToKotlinClassMap.classId(Map.Entry.class), createNestedClassId, new ClassId(packageFqName15, FqNamesUtilKt.tail(fqName9, packageFqName16), false)));
        mutabilityMappings = j;
        javaToKotlinClassMap.addTopLevel(Object.class, StandardNames.FqNames.any);
        javaToKotlinClassMap.addTopLevel(String.class, StandardNames.FqNames.string);
        javaToKotlinClassMap.addTopLevel(CharSequence.class, StandardNames.FqNames.charSequence);
        javaToKotlinClassMap.addTopLevel(Throwable.class, StandardNames.FqNames.throwable);
        javaToKotlinClassMap.addTopLevel(Cloneable.class, StandardNames.FqNames.cloneable);
        javaToKotlinClassMap.addTopLevel(Number.class, StandardNames.FqNames.number);
        javaToKotlinClassMap.addTopLevel(Comparable.class, StandardNames.FqNames.comparable);
        javaToKotlinClassMap.addTopLevel(Enum.class, StandardNames.FqNames._enum);
        javaToKotlinClassMap.addTopLevel(Annotation.class, StandardNames.FqNames.annotation);
        Iterator<PlatformMutabilityMapping> it = j.iterator();
        while (it.hasNext()) {
            INSTANCE.addMapping(it.next());
        }
        for (JvmPrimitiveType jvmPrimitiveType : JvmPrimitiveType.values()) {
            JavaToKotlinClassMap javaToKotlinClassMap2 = INSTANCE;
            ClassId classId9 = ClassId.topLevel(jvmPrimitiveType.getWrapperFqName());
            classId9.getClass();
            PrimitiveType primitiveType = jvmPrimitiveType.getPrimitiveType();
            primitiveType.getClass();
            ClassId classId10 = ClassId.topLevel(StandardNames.getPrimitiveFqName(primitiveType));
            classId10.getClass();
            javaToKotlinClassMap2.add(classId9, classId10);
        }
        for (ClassId classId11 : CompanionObjectMapping.INSTANCE.allClassesWithIntrinsicCompanions()) {
            JavaToKotlinClassMap javaToKotlinClassMap3 = INSTANCE;
            ClassId classId12 = ClassId.topLevel(new FqName("kotlin.jvm.internal." + classId11.getShortClassName().asString() + "CompanionObject"));
            classId12.getClass();
            ClassId createNestedClassId2 = classId11.createNestedClassId(SpecialNames.DEFAULT_NAME_FOR_COMPANION_OBJECT);
            createNestedClassId2.getClass();
            javaToKotlinClassMap3.add(classId12, createNestedClassId2);
        }
        for (int i = 0; i < 23; i++) {
            JavaToKotlinClassMap javaToKotlinClassMap4 = INSTANCE;
            ClassId classId13 = ClassId.topLevel(new FqName(ljg.j(i, "kotlin.jvm.functions.Function")));
            classId13.getClass();
            javaToKotlinClassMap4.add(classId13, StandardNames.getFunctionClassId(i));
            javaToKotlinClassMap4.addKotlinToJava(new FqName(me4.g(i, NUMBERED_K_FUNCTION_PREFIX, new StringBuilder())), K_FUNCTION_CLASS_ID);
        }
        for (int i2 = 0; i2 < 22; i2++) {
            FunctionTypeKind.KSuspendFunction kSuspendFunction2 = FunctionTypeKind.KSuspendFunction.INSTANCE;
            INSTANCE.addKotlinToJava(new FqName(ljg.j(i2, kSuspendFunction2.getPackageFqName().toString() + '.' + kSuspendFunction2.getClassNamePrefix())), K_FUNCTION_CLASS_ID);
        }
        JavaToKotlinClassMap javaToKotlinClassMap5 = INSTANCE;
        FqName safe = StandardNames.FqNames.nothing.toSafe();
        safe.getClass();
        javaToKotlinClassMap5.addKotlinToJava(safe, javaToKotlinClassMap5.classId(Void.class));
    }

    private JavaToKotlinClassMap() {
    }

    private final void add(ClassId classId, ClassId classId2) {
        addJavaToKotlin(classId, classId2);
        FqName asSingleFqName = classId2.asSingleFqName();
        asSingleFqName.getClass();
        addKotlinToJava(asSingleFqName, classId);
    }

    private final void addJavaToKotlin(ClassId classId, ClassId classId2) {
        HashMap<FqNameUnsafe, ClassId> hashMap = javaToKotlin;
        FqNameUnsafe unsafe = classId.asSingleFqName().toUnsafe();
        unsafe.getClass();
        hashMap.put(unsafe, classId2);
    }

    private final void addKotlinToJava(FqName fqName, ClassId classId) {
        HashMap<FqNameUnsafe, ClassId> hashMap = kotlinToJava;
        FqNameUnsafe unsafe = fqName.toUnsafe();
        unsafe.getClass();
        hashMap.put(unsafe, classId);
    }

    private final void addMapping(PlatformMutabilityMapping platformMutabilityMapping) {
        ClassId component1 = platformMutabilityMapping.component1();
        ClassId component2 = platformMutabilityMapping.component2();
        ClassId component3 = platformMutabilityMapping.component3();
        add(component1, component2);
        FqName asSingleFqName = component3.asSingleFqName();
        asSingleFqName.getClass();
        addKotlinToJava(asSingleFqName, component1);
        mutableToReadOnlyClassId.put(component3, component2);
        readOnlyToMutableClassId.put(component2, component3);
        FqName asSingleFqName2 = component2.asSingleFqName();
        asSingleFqName2.getClass();
        FqName asSingleFqName3 = component3.asSingleFqName();
        asSingleFqName3.getClass();
        HashMap<FqNameUnsafe, FqName> hashMap = mutableToReadOnly;
        FqNameUnsafe unsafe = component3.asSingleFqName().toUnsafe();
        unsafe.getClass();
        hashMap.put(unsafe, asSingleFqName2);
        HashMap<FqNameUnsafe, FqName> hashMap2 = readOnlyToMutable;
        FqNameUnsafe unsafe2 = asSingleFqName2.toUnsafe();
        unsafe2.getClass();
        hashMap2.put(unsafe2, asSingleFqName3);
    }

    private final void addTopLevel(Class<?> cls, FqName fqName) {
        ClassId classId = classId(cls);
        ClassId classId2 = ClassId.topLevel(fqName);
        classId2.getClass();
        add(classId, classId2);
    }

    private final ClassId classId(Class<?> cls) {
        if (!cls.isPrimitive()) {
            cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            ClassId classId = ClassId.topLevel(new FqName(cls.getCanonicalName()));
            classId.getClass();
            return classId;
        }
        ClassId createNestedClassId = classId(declaringClass).createNestedClassId(Name.identifier(cls.getSimpleName()));
        createNestedClassId.getClass();
        return createNestedClassId;
    }

    private final boolean isKotlinFunctionWithBigArity(FqNameUnsafe fqNameUnsafe, String str) {
        Integer intOrNull;
        String asString = fqNameUnsafe.asString();
        asString.getClass();
        String d0 = StringsKt.d0(asString, str, "");
        return d0.length() > 0 && !StringsKt.c0(d0, '0') && (intOrNull = StringsKt.toIntOrNull(d0)) != null && intOrNull.intValue() >= 23;
    }

    @NotNull
    public final FqName getFUNCTION_N_FQ_NAME() {
        return FUNCTION_N_FQ_NAME;
    }

    @NotNull
    public final List<PlatformMutabilityMapping> getMutabilityMappings() {
        return mutabilityMappings;
    }

    public final boolean isMutable(@Nullable FqNameUnsafe fqNameUnsafe) {
        return mutableToReadOnly.containsKey(fqNameUnsafe);
    }

    public final boolean isReadOnly(@Nullable FqNameUnsafe fqNameUnsafe) {
        return readOnlyToMutable.containsKey(fqNameUnsafe);
    }

    @Nullable
    public final ClassId mapJavaToKotlin(@NotNull FqName fqName) {
        fqName.getClass();
        return javaToKotlin.get(fqName.toUnsafe());
    }

    @Nullable
    public final ClassId mapKotlinToJava(@NotNull FqNameUnsafe fqNameUnsafe) {
        fqNameUnsafe.getClass();
        return isKotlinFunctionWithBigArity(fqNameUnsafe, NUMBERED_FUNCTION_PREFIX) ? FUNCTION_N_CLASS_ID : isKotlinFunctionWithBigArity(fqNameUnsafe, NUMBERED_SUSPEND_FUNCTION_PREFIX) ? FUNCTION_N_CLASS_ID : isKotlinFunctionWithBigArity(fqNameUnsafe, NUMBERED_K_FUNCTION_PREFIX) ? K_FUNCTION_CLASS_ID : isKotlinFunctionWithBigArity(fqNameUnsafe, NUMBERED_K_SUSPEND_FUNCTION_PREFIX) ? K_FUNCTION_CLASS_ID : kotlinToJava.get(fqNameUnsafe);
    }

    @Nullable
    public final FqName mutableToReadOnly(@Nullable FqNameUnsafe fqNameUnsafe) {
        return mutableToReadOnly.get(fqNameUnsafe);
    }

    @Nullable
    public final FqName readOnlyToMutable(@Nullable FqNameUnsafe fqNameUnsafe) {
        return readOnlyToMutable.get(fqNameUnsafe);
    }

    private final void addTopLevel(Class<?> cls, FqNameUnsafe fqNameUnsafe) {
        FqName safe = fqNameUnsafe.toSafe();
        safe.getClass();
        addTopLevel(cls, safe);
    }
}
