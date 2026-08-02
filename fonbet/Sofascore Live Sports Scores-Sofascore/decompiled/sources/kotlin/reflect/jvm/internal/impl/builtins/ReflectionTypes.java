package kotlin.reflect.jvm.internal.impl.builtins;

import defpackage.duf;
import defpackage.fuf;
import defpackage.joa;
import defpackage.kef;
import defpackage.ypa;
import defpackage.ysa;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ReflectionTypes {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;

    @NotNull
    public static final Companion Companion;

    @NotNull
    private final ClassLookup kClass$delegate;

    @NotNull
    private final ClassLookup kMutableProperty0$delegate;

    @NotNull
    private final ClassLookup kMutableProperty1$delegate;

    @NotNull
    private final ClassLookup kMutableProperty2$delegate;

    @NotNull
    private final ClassLookup kProperty$delegate;

    @NotNull
    private final ClassLookup kProperty0$delegate;

    @NotNull
    private final ClassLookup kProperty1$delegate;

    @NotNull
    private final ClassLookup kProperty2$delegate;

    @NotNull
    private final joa kotlinReflectScope$delegate;

    @NotNull
    private final NotFoundClasses notFoundClasses;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class ClassLookup {
        private final int numberOfTypeParameters;

        public ClassLookup(int i) {
            this.numberOfTypeParameters = i;
        }

        @NotNull
        public final ClassDescriptor getValue(@NotNull ReflectionTypes reflectionTypes, @NotNull KProperty<?> kProperty) {
            reflectionTypes.getClass();
            kProperty.getClass();
            return reflectionTypes.find(CapitalizeDecapitalizeKt.capitalizeAsciiOnly(kProperty.getName()), this.numberOfTypeParameters);
        }
    }

    static {
        fuf fufVar = duf.a;
        $$delegatedProperties = new KProperty[]{fufVar.property1(new kef(fufVar.getOrCreateKotlinClass(ReflectionTypes.class), "kClass", "getKClass()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), fufVar.property1(new kef(fufVar.getOrCreateKotlinClass(ReflectionTypes.class), "kProperty", "getKProperty()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), fufVar.property1(new kef(fufVar.getOrCreateKotlinClass(ReflectionTypes.class), "kProperty0", "getKProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), fufVar.property1(new kef(fufVar.getOrCreateKotlinClass(ReflectionTypes.class), "kProperty1", "getKProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), fufVar.property1(new kef(fufVar.getOrCreateKotlinClass(ReflectionTypes.class), "kProperty2", "getKProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), fufVar.property1(new kef(fufVar.getOrCreateKotlinClass(ReflectionTypes.class), "kMutableProperty0", "getKMutableProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), fufVar.property1(new kef(fufVar.getOrCreateKotlinClass(ReflectionTypes.class), "kMutableProperty1", "getKMutableProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), fufVar.property1(new kef(fufVar.getOrCreateKotlinClass(ReflectionTypes.class), "kMutableProperty2", "getKMutableProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"))};
        Companion = new Companion(null);
    }

    public ReflectionTypes(@NotNull ModuleDescriptor moduleDescriptor, @NotNull NotFoundClasses notFoundClasses) {
        moduleDescriptor.getClass();
        notFoundClasses.getClass();
        this.notFoundClasses = notFoundClasses;
        this.kotlinReflectScope$delegate = ypa.a(ysa.b, new ReflectionTypes$kotlinReflectScope$2(moduleDescriptor));
        this.kClass$delegate = new ClassLookup(1);
        this.kProperty$delegate = new ClassLookup(1);
        this.kProperty0$delegate = new ClassLookup(1);
        this.kProperty1$delegate = new ClassLookup(2);
        this.kProperty2$delegate = new ClassLookup(3);
        this.kMutableProperty0$delegate = new ClassLookup(1);
        this.kMutableProperty1$delegate = new ClassLookup(2);
        this.kMutableProperty2$delegate = new ClassLookup(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ClassDescriptor find(String str, int i) {
        Name identifier = Name.identifier(str);
        identifier.getClass();
        ClassifierDescriptor mo895getContributedClassifier = getKotlinReflectScope().mo895getContributedClassifier(identifier, NoLookupLocation.FROM_REFLECTION);
        ClassDescriptor classDescriptor = mo895getContributedClassifier instanceof ClassDescriptor ? (ClassDescriptor) mo895getContributedClassifier : null;
        return classDescriptor == null ? this.notFoundClasses.getClass(new ClassId(StandardNames.KOTLIN_REFLECT_FQ_NAME, identifier), a.c(Integer.valueOf(i))) : classDescriptor;
    }

    private final MemberScope getKotlinReflectScope() {
        return (MemberScope) this.kotlinReflectScope$delegate.getValue();
    }

    @NotNull
    public final ClassDescriptor getKClass() {
        return this.kClass$delegate.getValue(this, $$delegatedProperties[0]);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final KotlinType createKPropertyStarType(@NotNull ModuleDescriptor moduleDescriptor) {
            moduleDescriptor.getClass();
            ClassDescriptor findClassAcrossModuleDependencies = FindClassInModuleKt.findClassAcrossModuleDependencies(moduleDescriptor, StandardNames.FqNames.kProperty);
            if (findClassAcrossModuleDependencies == null) {
                return null;
            }
            TypeAttributes empty = TypeAttributes.Companion.getEmpty();
            List<TypeParameterDescriptor> parameters = findClassAcrossModuleDependencies.getTypeConstructor().getParameters();
            parameters.getClass();
            Object D0 = CollectionsKt.D0(parameters);
            D0.getClass();
            return KotlinTypeFactory.simpleNotNullType(empty, findClassAcrossModuleDependencies, a.c(new StarProjectionImpl((TypeParameterDescriptor) D0)));
        }

        private Companion() {
        }
    }
}
