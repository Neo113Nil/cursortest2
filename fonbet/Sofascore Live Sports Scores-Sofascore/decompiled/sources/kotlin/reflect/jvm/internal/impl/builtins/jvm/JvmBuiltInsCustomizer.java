package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import defpackage.duf;
import defpackage.fsf;
import defpackage.fuf;
import defpackage.gz8;
import defpackage.jp5;
import defpackage.k13;
import defpackage.kef;
import defpackage.km5;
import defpackage.pvd;
import defpackage.rm5;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ModalityUtilsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilterKt;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureBuildingUtilsKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.CacheWithNotNullValues;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.LazyWrappedType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.utils.DFS;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class JvmBuiltInsCustomizer implements AdditionalClassPartsProvider, PlatformDependentDeclarationFilter {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;

    @NotNull
    private final NotNullLazyValue cloneableType$delegate;

    @NotNull
    private final MemoizedFunctionToNotNull<Pair<String, String>, Annotations> deprecationForSomeOfTheListMethods;

    @NotNull
    private final JavaToKotlinClassMapper j2kClassMapper;

    @NotNull
    private final CacheWithNotNullValues<FqName, ClassDescriptor> javaAnalogueClassesWithCustomSupertypeCache;

    @NotNull
    private final KotlinType mockSerializableType;

    @NotNull
    private final ModuleDescriptor moduleDescriptor;

    @NotNull
    private final NotNullLazyValue notConsideredDeprecation$delegate;

    @NotNull
    private final NotNullLazyValue settings$delegate;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class JDKMemberStatus {
        private static final /* synthetic */ jp5 $ENTRIES;
        private static final /* synthetic */ JDKMemberStatus[] $VALUES;
        public static final JDKMemberStatus HIDDEN = new JDKMemberStatus("HIDDEN", 0);
        public static final JDKMemberStatus VISIBLE = new JDKMemberStatus("VISIBLE", 1);
        public static final JDKMemberStatus DEPRECATED_LIST_METHODS = new JDKMemberStatus("DEPRECATED_LIST_METHODS", 2);
        public static final JDKMemberStatus NOT_CONSIDERED = new JDKMemberStatus("NOT_CONSIDERED", 3);
        public static final JDKMemberStatus DROP = new JDKMemberStatus("DROP", 4);

        private static final /* synthetic */ JDKMemberStatus[] $values() {
            return new JDKMemberStatus[]{HIDDEN, VISIBLE, DEPRECATED_LIST_METHODS, NOT_CONSIDERED, DROP};
        }

        static {
            JDKMemberStatus[] $values = $values();
            $VALUES = $values;
            $ENTRIES = gz8.G($values);
        }

        private JDKMemberStatus(String str, int i) {
        }

        public static JDKMemberStatus valueOf(String str) {
            return (JDKMemberStatus) Enum.valueOf(JDKMemberStatus.class, str);
        }

        public static JDKMemberStatus[] values() {
            return (JDKMemberStatus[]) $VALUES.clone();
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[JDKMemberStatus.values().length];
            try {
                iArr[JDKMemberStatus.HIDDEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[JDKMemberStatus.DEPRECATED_LIST_METHODS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[JDKMemberStatus.NOT_CONSIDERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[JDKMemberStatus.DROP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[JDKMemberStatus.VISIBLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        fuf fufVar = duf.a;
        $$delegatedProperties = new KProperty[]{fufVar.property1(new kef(fufVar.getOrCreateKotlinClass(JvmBuiltInsCustomizer.class), "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;")), fufVar.property1(new kef(fufVar.getOrCreateKotlinClass(JvmBuiltInsCustomizer.class), "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;")), fufVar.property1(new kef(fufVar.getOrCreateKotlinClass(JvmBuiltInsCustomizer.class), "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;"))};
    }

    public JvmBuiltInsCustomizer(@NotNull ModuleDescriptor moduleDescriptor, @NotNull StorageManager storageManager, @NotNull Function0<JvmBuiltIns.Settings> function0) {
        moduleDescriptor.getClass();
        storageManager.getClass();
        function0.getClass();
        this.moduleDescriptor = moduleDescriptor;
        this.j2kClassMapper = JavaToKotlinClassMapper.INSTANCE;
        this.settings$delegate = storageManager.createLazyValue(function0);
        this.mockSerializableType = createMockJavaIoSerializableType(storageManager);
        this.cloneableType$delegate = storageManager.createLazyValue(new JvmBuiltInsCustomizer$cloneableType$2(this, storageManager));
        this.javaAnalogueClassesWithCustomSupertypeCache = storageManager.createCacheWithNotNullValues();
        this.notConsideredDeprecation$delegate = storageManager.createLazyValue(new JvmBuiltInsCustomizer$notConsideredDeprecation$2(this));
        this.deprecationForSomeOfTheListMethods = storageManager.createMemoizedFunction(new JvmBuiltInsCustomizer$deprecationForSomeOfTheListMethods$1(this));
    }

    private final SimpleFunctionDescriptor createCloneForArray(DeserializedClassDescriptor deserializedClassDescriptor, SimpleFunctionDescriptor simpleFunctionDescriptor) {
        FunctionDescriptor.CopyBuilder<? extends SimpleFunctionDescriptor> newCopyBuilder = simpleFunctionDescriptor.newCopyBuilder();
        newCopyBuilder.setOwner(deserializedClassDescriptor);
        newCopyBuilder.setVisibility(DescriptorVisibilities.PUBLIC);
        newCopyBuilder.setReturnType(deserializedClassDescriptor.getDefaultType());
        newCopyBuilder.setDispatchReceiverParameter(deserializedClassDescriptor.getThisAsReceiverParameter());
        SimpleFunctionDescriptor build = newCopyBuilder.build();
        build.getClass();
        return build;
    }

    private final KotlinType createMockJavaIoSerializableType(StorageManager storageManager) {
        final ModuleDescriptor moduleDescriptor = this.moduleDescriptor;
        final FqName fqName = new FqName("java.io");
        ClassDescriptorImpl classDescriptorImpl = new ClassDescriptorImpl(new PackageFragmentDescriptorImpl(moduleDescriptor, fqName) { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$createMockJavaIoSerializableType$mockJavaIoPackageFragment$1
            @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor
            @NotNull
            public MemberScope.Empty getMemberScope() {
                return MemberScope.Empty.INSTANCE;
            }
        }, Name.identifier("Serializable"), Modality.ABSTRACT, ClassKind.INTERFACE, a.c(new LazyWrappedType(storageManager, new JvmBuiltInsCustomizer$createMockJavaIoSerializableType$superTypes$1(this))), SourceElement.NO_SOURCE, false, storageManager);
        classDescriptorImpl.initialize(MemberScope.Empty.INSTANCE, rm5.a, null);
        SimpleType defaultType = classDescriptorImpl.getDefaultType();
        defaultType.getClass();
        return defaultType;
    }

    private final Collection<SimpleFunctionDescriptor> getAdditionalFunctions(ClassDescriptor classDescriptor, Function1<? super MemberScope, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        LazyJavaClassDescriptor javaAnalogue = getJavaAnalogue(classDescriptor);
        if (javaAnalogue == null) {
            return km5.a;
        }
        Collection<ClassDescriptor> mapPlatformClass = this.j2kClassMapper.mapPlatformClass(DescriptorUtilsKt.getFqNameSafe(javaAnalogue), FallbackBuiltIns.Companion.getInstance());
        ClassDescriptor classDescriptor2 = (ClassDescriptor) CollectionsKt.i0(mapPlatformClass);
        if (classDescriptor2 == null) {
            return km5.a;
        }
        SmartSet.Companion companion = SmartSet.Companion;
        ArrayList arrayList = new ArrayList(k13.r(mapPlatformClass, 10));
        Iterator<T> it = mapPlatformClass.iterator();
        while (it.hasNext()) {
            arrayList.add(DescriptorUtilsKt.getFqNameSafe((ClassDescriptor) it.next()));
        }
        SmartSet create = companion.create(arrayList);
        boolean isMutable = this.j2kClassMapper.isMutable(classDescriptor);
        MemberScope unsubstitutedMemberScope = this.javaAnalogueClassesWithCustomSupertypeCache.computeIfAbsent(DescriptorUtilsKt.getFqNameSafe(javaAnalogue), new JvmBuiltInsCustomizer$getAdditionalFunctions$fakeJavaClassDescriptor$1(javaAnalogue, classDescriptor2)).getUnsubstitutedMemberScope();
        unsubstitutedMemberScope.getClass();
        Iterable iterable = (Iterable) function1.invoke(unsubstitutedMemberScope);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : iterable) {
            SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) obj;
            if (simpleFunctionDescriptor.getKind() == CallableMemberDescriptor.Kind.DECLARATION && simpleFunctionDescriptor.getVisibility().isPublicAPI() && !KotlinBuiltIns.isDeprecated(simpleFunctionDescriptor)) {
                Collection<? extends FunctionDescriptor> overriddenDescriptors = simpleFunctionDescriptor.getOverriddenDescriptors();
                overriddenDescriptors.getClass();
                Collection<? extends FunctionDescriptor> collection = overriddenDescriptors;
                if (!(collection instanceof Collection) || !collection.isEmpty()) {
                    Iterator<T> it2 = collection.iterator();
                    while (it2.hasNext()) {
                        DeclarationDescriptor containingDeclaration = ((FunctionDescriptor) it2.next()).getContainingDeclaration();
                        containingDeclaration.getClass();
                        if (create.contains(DescriptorUtilsKt.getFqNameSafe(containingDeclaration))) {
                            break;
                        }
                    }
                }
                if (!isMutabilityViolation(simpleFunctionDescriptor, isMutable)) {
                    arrayList2.add(obj);
                }
            }
        }
        return arrayList2;
    }

    private final SimpleType getCloneableType() {
        return (SimpleType) StorageKt.getValue(this.cloneableType$delegate, this, (KProperty<?>) $$delegatedProperties[1]);
    }

    private static final boolean getConstructors$isEffectivelyTheSameAs(ConstructorDescriptor constructorDescriptor, TypeSubstitutor typeSubstitutor, ConstructorDescriptor constructorDescriptor2) {
        return OverridingUtil.getBothWaysOverridability(constructorDescriptor, constructorDescriptor2.substitute(typeSubstitutor)) == OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE;
    }

    private final LazyJavaClassDescriptor getJavaAnalogue(ClassDescriptor classDescriptor) {
        ClassId mapKotlinToJava;
        FqName asSingleFqName;
        if (KotlinBuiltIns.isAny(classDescriptor) || !KotlinBuiltIns.isUnderKotlinPackage(classDescriptor)) {
            return null;
        }
        FqNameUnsafe fqNameUnsafe = DescriptorUtilsKt.getFqNameUnsafe(classDescriptor);
        if (fqNameUnsafe.isSafe() && (mapKotlinToJava = JavaToKotlinClassMap.INSTANCE.mapKotlinToJava(fqNameUnsafe)) != null && (asSingleFqName = mapKotlinToJava.asSingleFqName()) != null) {
            ClassDescriptor resolveClassByFqName = DescriptorUtilKt.resolveClassByFqName(getSettings().getOwnerModuleDescriptor(), asSingleFqName, NoLookupLocation.FROM_BUILTINS);
            if (resolveClassByFqName instanceof LazyJavaClassDescriptor) {
                return (LazyJavaClassDescriptor) resolveClassByFqName;
            }
        }
        return null;
    }

    private final JDKMemberStatus getJdkMethodStatus(FunctionDescriptor functionDescriptor) {
        DeclarationDescriptor containingDeclaration = functionDescriptor.getContainingDeclaration();
        containingDeclaration.getClass();
        final String computeJvmDescriptor$default = MethodSignatureMappingKt.computeJvmDescriptor$default(functionDescriptor, false, false, 3, null);
        final fsf fsfVar = new fsf();
        Object dfs = DFS.dfs(a.c((ClassDescriptor) containingDeclaration), new DFS.Neighbors(this) { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$$Lambda$1
            private final JvmBuiltInsCustomizer arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
            public Iterable getNeighbors(Object obj) {
                Iterable jdkMethodStatus$lambda$9;
                jdkMethodStatus$lambda$9 = JvmBuiltInsCustomizer.getJdkMethodStatus$lambda$9(this.arg$0, (ClassDescriptor) obj);
                return jdkMethodStatus$lambda$9;
            }
        }, new DFS.AbstractNodeHandler<ClassDescriptor, JDKMemberStatus>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$getJdkMethodStatus$2
            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler, kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
            public boolean beforeChildren(@NotNull ClassDescriptor classDescriptor) {
                classDescriptor.getClass();
                String signature = MethodSignatureBuildingUtilsKt.signature(SignatureBuildingComponents.INSTANCE, classDescriptor, computeJvmDescriptor$default);
                JvmBuiltInsSignatures jvmBuiltInsSignatures = JvmBuiltInsSignatures.INSTANCE;
                if (jvmBuiltInsSignatures.getHIDDEN_METHOD_SIGNATURES().contains(signature)) {
                    fsfVar.a = JvmBuiltInsCustomizer.JDKMemberStatus.HIDDEN;
                } else if (jvmBuiltInsSignatures.getVISIBLE_METHOD_SIGNATURES().contains(signature)) {
                    fsfVar.a = JvmBuiltInsCustomizer.JDKMemberStatus.VISIBLE;
                } else if (jvmBuiltInsSignatures.getDEPRECATED_LIST_METHODS().contains(signature)) {
                    fsfVar.a = JvmBuiltInsCustomizer.JDKMemberStatus.DEPRECATED_LIST_METHODS;
                } else if (jvmBuiltInsSignatures.getDROP_LIST_METHOD_SIGNATURES().contains(signature)) {
                    fsfVar.a = JvmBuiltInsCustomizer.JDKMemberStatus.DROP;
                }
                return fsfVar.a == null;
            }

            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
            @NotNull
            public JvmBuiltInsCustomizer.JDKMemberStatus result() {
                JvmBuiltInsCustomizer.JDKMemberStatus jDKMemberStatus = (JvmBuiltInsCustomizer.JDKMemberStatus) fsfVar.a;
                return jDKMemberStatus == null ? JvmBuiltInsCustomizer.JDKMemberStatus.NOT_CONSIDERED : jDKMemberStatus;
            }
        });
        dfs.getClass();
        return (JDKMemberStatus) dfs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable getJdkMethodStatus$lambda$9(JvmBuiltInsCustomizer jvmBuiltInsCustomizer, ClassDescriptor classDescriptor) {
        jvmBuiltInsCustomizer.getClass();
        Collection<KotlinType> mo894getSupertypes = classDescriptor.getTypeConstructor().mo894getSupertypes();
        mo894getSupertypes.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = mo894getSupertypes.iterator();
        while (it.hasNext()) {
            ClassifierDescriptor mo893getDeclarationDescriptor = ((KotlinType) it.next()).getConstructor().mo893getDeclarationDescriptor();
            LazyJavaClassDescriptor lazyJavaClassDescriptor = null;
            ClassifierDescriptor original = mo893getDeclarationDescriptor != null ? mo893getDeclarationDescriptor.getOriginal() : null;
            ClassDescriptor classDescriptor2 = original instanceof ClassDescriptor ? (ClassDescriptor) original : null;
            if (classDescriptor2 != null && (lazyJavaClassDescriptor = jvmBuiltInsCustomizer.getJavaAnalogue(classDescriptor2)) == null) {
                lazyJavaClassDescriptor = classDescriptor2;
            }
            if (lazyJavaClassDescriptor != null) {
                arrayList.add(lazyJavaClassDescriptor);
            }
        }
        return arrayList;
    }

    private final Annotations getNotConsideredDeprecation() {
        return (Annotations) StorageKt.getValue(this.notConsideredDeprecation$delegate, this, (KProperty<?>) $$delegatedProperties[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JvmBuiltIns.Settings getSettings() {
        return (JvmBuiltIns.Settings) StorageKt.getValue(this.settings$delegate, this, (KProperty<?>) $$delegatedProperties[0]);
    }

    private final boolean isMutabilityViolation(SimpleFunctionDescriptor simpleFunctionDescriptor, boolean z) {
        DeclarationDescriptor containingDeclaration = simpleFunctionDescriptor.getContainingDeclaration();
        containingDeclaration.getClass();
        String computeJvmDescriptor$default = MethodSignatureMappingKt.computeJvmDescriptor$default(simpleFunctionDescriptor, false, false, 3, null);
        if (z ^ JvmBuiltInsSignatures.INSTANCE.getMUTABLE_METHOD_SIGNATURES().contains(MethodSignatureBuildingUtilsKt.signature(SignatureBuildingComponents.INSTANCE, (ClassDescriptor) containingDeclaration, computeJvmDescriptor$default))) {
            return true;
        }
        Boolean ifAny = DFS.ifAny(a.c(simpleFunctionDescriptor), new DFS.Neighbors() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$$Lambda$0
            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
            public Iterable getNeighbors(Object obj) {
                Iterable isMutabilityViolation$lambda$7;
                isMutabilityViolation$lambda$7 = JvmBuiltInsCustomizer.isMutabilityViolation$lambda$7((CallableMemberDescriptor) obj);
                return isMutabilityViolation$lambda$7;
            }
        }, new JvmBuiltInsCustomizer$isMutabilityViolation$2(this));
        ifAny.getClass();
        return ifAny.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable isMutabilityViolation$lambda$7(CallableMemberDescriptor callableMemberDescriptor) {
        return callableMemberDescriptor.getOriginal().getOverriddenDescriptors();
    }

    private final boolean isTrivialCopyConstructorFor(ConstructorDescriptor constructorDescriptor, ClassDescriptor classDescriptor) {
        if (constructorDescriptor.getValueParameters().size() != 1) {
            return false;
        }
        List<ValueParameterDescriptor> valueParameters = constructorDescriptor.getValueParameters();
        valueParameters.getClass();
        ClassifierDescriptor mo893getDeclarationDescriptor = ((ValueParameterDescriptor) CollectionsKt.D0(valueParameters)).getType().getConstructor().mo893getDeclarationDescriptor();
        return Intrinsics.c(mo893getDeclarationDescriptor != null ? DescriptorUtilsKt.getFqNameUnsafe(mo893getDeclarationDescriptor) : null, DescriptorUtilsKt.getFqNameUnsafe(classDescriptor));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
    @NotNull
    public Collection<ClassConstructorDescriptor> getConstructors(@NotNull ClassDescriptor classDescriptor) {
        classDescriptor.getClass();
        if (classDescriptor.getKind() != ClassKind.CLASS || !getSettings().isAdditionalBuiltInsFeatureSupported()) {
            return km5.a;
        }
        LazyJavaClassDescriptor javaAnalogue = getJavaAnalogue(classDescriptor);
        if (javaAnalogue == null) {
            return km5.a;
        }
        ClassDescriptor mapJavaToKotlin$default = JavaToKotlinClassMapper.mapJavaToKotlin$default(this.j2kClassMapper, DescriptorUtilsKt.getFqNameSafe(javaAnalogue), FallbackBuiltIns.Companion.getInstance(), null, 4, null);
        if (mapJavaToKotlin$default == null) {
            return km5.a;
        }
        TypeSubstitutor buildSubstitutor = MappingUtilKt.createMappedTypeParametersSubstitution(mapJavaToKotlin$default, javaAnalogue).buildSubstitutor();
        List<ClassConstructorDescriptor> constructors = javaAnalogue.getConstructors();
        ArrayList<ClassConstructorDescriptor> arrayList = new ArrayList();
        for (Object obj : constructors) {
            ClassConstructorDescriptor classConstructorDescriptor = (ClassConstructorDescriptor) obj;
            if (classConstructorDescriptor.getVisibility().isPublicAPI()) {
                Collection<ClassConstructorDescriptor> constructors2 = mapJavaToKotlin$default.getConstructors();
                constructors2.getClass();
                Collection<ClassConstructorDescriptor> collection = constructors2;
                if (!(collection instanceof Collection) || !collection.isEmpty()) {
                    for (ClassConstructorDescriptor classConstructorDescriptor2 : collection) {
                        classConstructorDescriptor2.getClass();
                        if (getConstructors$isEffectivelyTheSameAs(classConstructorDescriptor2, buildSubstitutor, classConstructorDescriptor)) {
                            break;
                        }
                    }
                }
                if (!isTrivialCopyConstructorFor(classConstructorDescriptor, classDescriptor) && !KotlinBuiltIns.isDeprecated(classConstructorDescriptor) && !JvmBuiltInsSignatures.INSTANCE.getHIDDEN_CONSTRUCTOR_SIGNATURES().contains(MethodSignatureBuildingUtilsKt.signature(SignatureBuildingComponents.INSTANCE, javaAnalogue, MethodSignatureMappingKt.computeJvmDescriptor$default(classConstructorDescriptor, false, false, 3, null)))) {
                    arrayList.add(obj);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
        for (ClassConstructorDescriptor classConstructorDescriptor3 : arrayList) {
            FunctionDescriptor.CopyBuilder<? extends FunctionDescriptor> newCopyBuilder = classConstructorDescriptor3.newCopyBuilder();
            newCopyBuilder.setOwner(classDescriptor);
            newCopyBuilder.setReturnType(classDescriptor.getDefaultType());
            newCopyBuilder.setPreserveSourceElement();
            newCopyBuilder.setSubstitution(buildSubstitutor.getSubstitution());
            if (!JvmBuiltInsSignatures.INSTANCE.getVISIBLE_CONSTRUCTOR_SIGNATURES().contains(MethodSignatureBuildingUtilsKt.signature(SignatureBuildingComponents.INSTANCE, javaAnalogue, MethodSignatureMappingKt.computeJvmDescriptor$default(classConstructorDescriptor3, false, false, 3, null)))) {
                newCopyBuilder.setAdditionalAnnotations(getNotConsideredDeprecation());
            }
            FunctionDescriptor build = newCopyBuilder.build();
            build.getClass();
            arrayList2.add((ClassConstructorDescriptor) build);
        }
        return arrayList2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ef, code lost:
    
        if (r3 != 4) goto L52;
     */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Collection<SimpleFunctionDescriptor> getFunctions(@NotNull Name name, @NotNull ClassDescriptor classDescriptor) {
        Name name2;
        Name name3;
        Annotations annotations;
        name.getClass();
        classDescriptor.getClass();
        if (Intrinsics.c(name, CloneableClassScope.Companion.getCLONE_NAME()) && (classDescriptor instanceof DeserializedClassDescriptor) && KotlinBuiltIns.isArrayOrPrimitiveArray(classDescriptor)) {
            DeserializedClassDescriptor deserializedClassDescriptor = (DeserializedClassDescriptor) classDescriptor;
            List<ProtoBuf.Function> functionList = deserializedClassDescriptor.getClassProto().getFunctionList();
            functionList.getClass();
            if (functionList == null || !functionList.isEmpty()) {
                Iterator<T> it = functionList.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.c(NameResolverUtilKt.getName(deserializedClassDescriptor.getC().getNameResolver(), ((ProtoBuf.Function) it.next()).getName()), CloneableClassScope.Companion.getCLONE_NAME())) {
                        return km5.a;
                    }
                }
            }
            return a.c(createCloneForArray(deserializedClassDescriptor, (SimpleFunctionDescriptor) CollectionsKt.C0(getCloneableType().getMemberScope().getContributedFunctions(name, NoLookupLocation.FROM_BUILTINS))));
        }
        if (!getSettings().isAdditionalBuiltInsFeatureSupported()) {
            return km5.a;
        }
        Collection<SimpleFunctionDescriptor> additionalFunctions = getAdditionalFunctions(classDescriptor, new JvmBuiltInsCustomizer$getFunctions$2(name));
        ArrayList arrayList = new ArrayList();
        for (SimpleFunctionDescriptor simpleFunctionDescriptor : additionalFunctions) {
            DeclarationDescriptor containingDeclaration = simpleFunctionDescriptor.getContainingDeclaration();
            containingDeclaration.getClass();
            FunctionDescriptor substitute = simpleFunctionDescriptor.substitute(MappingUtilKt.createMappedTypeParametersSubstitution((ClassDescriptor) containingDeclaration, classDescriptor).buildSubstitutor());
            substitute.getClass();
            FunctionDescriptor.CopyBuilder<? extends SimpleFunctionDescriptor> newCopyBuilder = ((SimpleFunctionDescriptor) substitute).newCopyBuilder();
            newCopyBuilder.setOwner(classDescriptor);
            newCopyBuilder.setDispatchReceiverParameter(classDescriptor.getThisAsReceiverParameter());
            newCopyBuilder.setPreserveSourceElement();
            int i = WhenMappings.$EnumSwitchMapping$0[getJdkMethodStatus(simpleFunctionDescriptor).ordinal()];
            SimpleFunctionDescriptor simpleFunctionDescriptor2 = null;
            if (i != 1) {
                if (i == 2) {
                    Name name4 = simpleFunctionDescriptor.getName();
                    name2 = JvmBuiltInsCustomizerKt.GET_FIRST_LIST_NAME;
                    if (Intrinsics.c(name4, name2)) {
                        annotations = (Annotations) this.deprecationForSomeOfTheListMethods.invoke(new Pair(simpleFunctionDescriptor.getName().asString(), "first"));
                    } else {
                        name3 = JvmBuiltInsCustomizerKt.GET_LAST_LIST_NAME;
                        if (!Intrinsics.c(name4, name3)) {
                            pvd.z(simpleFunctionDescriptor.getName(), "Unexpected name: ");
                            return null;
                        }
                        annotations = (Annotations) this.deprecationForSomeOfTheListMethods.invoke(new Pair(simpleFunctionDescriptor.getName().asString(), "last"));
                    }
                    newCopyBuilder.setAdditionalAnnotations(annotations);
                } else if (i == 3) {
                    newCopyBuilder.setAdditionalAnnotations(getNotConsideredDeprecation());
                }
                SimpleFunctionDescriptor build = newCopyBuilder.build();
                build.getClass();
                simpleFunctionDescriptor2 = build;
            } else if (!ModalityUtilsKt.isFinalClass(classDescriptor)) {
                newCopyBuilder.setHiddenForResolutionEverywhereBesideSupercalls();
                SimpleFunctionDescriptor build2 = newCopyBuilder.build();
                build2.getClass();
                simpleFunctionDescriptor2 = build2;
            }
            if (simpleFunctionDescriptor2 != null) {
                arrayList.add(simpleFunctionDescriptor2);
            }
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
    @NotNull
    public Set<Name> getFunctionsNames(@NotNull ClassDescriptor classDescriptor) {
        LazyJavaClassMemberScope unsubstitutedMemberScope;
        Set<Name> functionNames;
        classDescriptor.getClass();
        if (!getSettings().isAdditionalBuiltInsFeatureSupported()) {
            return rm5.a;
        }
        LazyJavaClassDescriptor javaAnalogue = getJavaAnalogue(classDescriptor);
        return (javaAnalogue == null || (unsubstitutedMemberScope = javaAnalogue.getUnsubstitutedMemberScope()) == null || (functionNames = unsubstitutedMemberScope.getFunctionNames()) == null) ? rm5.a : functionNames;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
    @NotNull
    public Collection<KotlinType> getSupertypes(@NotNull ClassDescriptor classDescriptor) {
        classDescriptor.getClass();
        FqNameUnsafe fqNameUnsafe = DescriptorUtilsKt.getFqNameUnsafe(classDescriptor);
        JvmBuiltInsSignatures jvmBuiltInsSignatures = JvmBuiltInsSignatures.INSTANCE;
        if (!jvmBuiltInsSignatures.isArrayOrPrimitiveArray(fqNameUnsafe)) {
            return jvmBuiltInsSignatures.isSerializableInJava(fqNameUnsafe) ? a.c(this.mockSerializableType) : km5.a;
        }
        SimpleType cloneableType = getCloneableType();
        cloneableType.getClass();
        return b.j(cloneableType, this.mockSerializableType);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter
    public boolean isFunctionAvailable(@NotNull ClassDescriptor classDescriptor, @NotNull SimpleFunctionDescriptor simpleFunctionDescriptor) {
        classDescriptor.getClass();
        simpleFunctionDescriptor.getClass();
        LazyJavaClassDescriptor javaAnalogue = getJavaAnalogue(classDescriptor);
        if (javaAnalogue == null || !simpleFunctionDescriptor.getAnnotations().hasAnnotation(PlatformDependentDeclarationFilterKt.getPLATFORM_DEPENDENT_ANNOTATION_FQ_NAME())) {
            return true;
        }
        if (!getSettings().isAdditionalBuiltInsFeatureSupported()) {
            return false;
        }
        String computeJvmDescriptor$default = MethodSignatureMappingKt.computeJvmDescriptor$default(simpleFunctionDescriptor, false, false, 3, null);
        LazyJavaClassMemberScope unsubstitutedMemberScope = javaAnalogue.getUnsubstitutedMemberScope();
        Name name = simpleFunctionDescriptor.getName();
        name.getClass();
        Collection<SimpleFunctionDescriptor> contributedFunctions = unsubstitutedMemberScope.getContributedFunctions(name, NoLookupLocation.FROM_BUILTINS);
        if ((contributedFunctions instanceof Collection) && contributedFunctions.isEmpty()) {
            return false;
        }
        Iterator<T> it = contributedFunctions.iterator();
        while (it.hasNext()) {
            if (Intrinsics.c(MethodSignatureMappingKt.computeJvmDescriptor$default((SimpleFunctionDescriptor) it.next(), false, false, 3, null), computeJvmDescriptor$default)) {
                return true;
            }
        }
        return false;
    }
}
