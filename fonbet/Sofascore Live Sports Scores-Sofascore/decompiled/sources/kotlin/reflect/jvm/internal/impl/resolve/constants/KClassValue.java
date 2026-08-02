package kotlin.reflect.jvm.internal.impl.resolve.constants;

import defpackage.zzl;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class KClassValue extends ConstantValue<Value> {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KClassValue(@NotNull ClassLiteralValue classLiteralValue) {
        this(new Value.NormalClass(classLiteralValue));
        classLiteralValue.getClass();
    }

    @NotNull
    public final KotlinType getArgumentType(@NotNull ModuleDescriptor moduleDescriptor) {
        moduleDescriptor.getClass();
        Value value = getValue();
        if (value instanceof Value.LocalClass) {
            return ((Value.LocalClass) getValue()).getType();
        }
        if (!(value instanceof Value.NormalClass)) {
            zzl.b();
            return null;
        }
        ClassLiteralValue value2 = ((Value.NormalClass) getValue()).getValue();
        ClassId component1 = value2.component1();
        int component2 = value2.component2();
        ClassDescriptor findClassAcrossModuleDependencies = FindClassInModuleKt.findClassAcrossModuleDependencies(moduleDescriptor, component1);
        if (findClassAcrossModuleDependencies == null) {
            ErrorTypeKind errorTypeKind = ErrorTypeKind.UNRESOLVED_KCLASS_CONSTANT_VALUE;
            String classId = component1.toString();
            classId.getClass();
            return ErrorUtils.createErrorType(errorTypeKind, classId, String.valueOf(component2));
        }
        SimpleType defaultType = findClassAcrossModuleDependencies.getDefaultType();
        defaultType.getClass();
        KotlinType replaceArgumentsWithStarProjections = TypeUtilsKt.replaceArgumentsWithStarProjections(defaultType);
        for (int i = 0; i < component2; i++) {
            replaceArgumentsWithStarProjections = moduleDescriptor.getBuiltIns().getArrayType(Variance.INVARIANT, replaceArgumentsWithStarProjections);
            replaceArgumentsWithStarProjections.getClass();
        }
        return replaceArgumentsWithStarProjections;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    @NotNull
    public KotlinType getType(@NotNull ModuleDescriptor moduleDescriptor) {
        moduleDescriptor.getClass();
        TypeAttributes empty = TypeAttributes.Companion.getEmpty();
        ClassDescriptor kClass = moduleDescriptor.getBuiltIns().getKClass();
        kClass.getClass();
        return KotlinTypeFactory.simpleNotNullType(empty, kClass, a.c(new TypeProjectionImpl(getArgumentType(moduleDescriptor))));
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final ConstantValue<?> create(@NotNull KotlinType kotlinType) {
            kotlinType.getClass();
            if (KotlinTypeKt.isError(kotlinType)) {
                return null;
            }
            int i = 0;
            KotlinType kotlinType2 = kotlinType;
            while (KotlinBuiltIns.isArray(kotlinType2)) {
                kotlinType2 = ((TypeProjection) CollectionsKt.D0(kotlinType2.getArguments())).getType();
                kotlinType2.getClass();
                i++;
            }
            ClassifierDescriptor mo893getDeclarationDescriptor = kotlinType2.getConstructor().mo893getDeclarationDescriptor();
            if (mo893getDeclarationDescriptor instanceof ClassDescriptor) {
                ClassId classId = DescriptorUtilsKt.getClassId(mo893getDeclarationDescriptor);
                return classId == null ? new KClassValue(new Value.LocalClass(kotlinType)) : new KClassValue(classId, i);
            }
            if (!(mo893getDeclarationDescriptor instanceof TypeParameterDescriptor)) {
                return null;
            }
            ClassId classId2 = ClassId.topLevel(StandardNames.FqNames.any.toSafe());
            classId2.getClass();
            return new KClassValue(classId2, 0);
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static abstract class Value {

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public static final class LocalClass extends Value {

            @NotNull
            private final KotlinType type;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LocalClass(@NotNull KotlinType kotlinType) {
                super(null);
                kotlinType.getClass();
                this.type = kotlinType;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LocalClass) && Intrinsics.c(this.type, ((LocalClass) obj).type);
            }

            @NotNull
            public final KotlinType getType() {
                return this.type;
            }

            public int hashCode() {
                return this.type.hashCode();
            }

            @NotNull
            public String toString() {
                return "LocalClass(type=" + this.type + ')';
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public static final class NormalClass extends Value {

            @NotNull
            private final ClassLiteralValue value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NormalClass(@NotNull ClassLiteralValue classLiteralValue) {
                super(null);
                classLiteralValue.getClass();
                this.value = classLiteralValue;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof NormalClass) && Intrinsics.c(this.value, ((NormalClass) obj).value);
            }

            public final int getArrayDimensions() {
                return this.value.getArrayNestedness();
            }

            @NotNull
            public final ClassId getClassId() {
                return this.value.getClassId();
            }

            @NotNull
            public final ClassLiteralValue getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            @NotNull
            public String toString() {
                return "NormalClass(value=" + this.value + ')';
            }
        }

        public /* synthetic */ Value(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Value() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KClassValue(@NotNull Value value) {
        super(value);
        value.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KClassValue(@NotNull ClassId classId, int i) {
        this(new ClassLiteralValue(classId, i));
        classId.getClass();
    }
}
