package kotlin.reflect.jvm.internal.impl.util;

import defpackage.dmi;
import defpackage.xka;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.util.Check;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class ReturnsCheck implements Check {

    @NotNull
    private final String description;

    @NotNull
    private final String name;

    @NotNull
    private final Function1<KotlinBuiltIns, KotlinType> type;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class ReturnsBoolean extends ReturnsCheck {

        @NotNull
        public static final ReturnsBoolean INSTANCE = new ReturnsBoolean();

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        /* renamed from: kotlin.reflect.jvm.internal.impl.util.ReturnsCheck$ReturnsBoolean$1, reason: invalid class name */
        public static final class AnonymousClass1 extends xka implements Function1<KotlinBuiltIns, KotlinType> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final KotlinType invoke(@NotNull KotlinBuiltIns kotlinBuiltIns) {
                kotlinBuiltIns.getClass();
                SimpleType booleanType = kotlinBuiltIns.getBooleanType();
                booleanType.getClass();
                return booleanType;
            }
        }

        private ReturnsBoolean() {
            super("Boolean", AnonymousClass1.INSTANCE, null);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class ReturnsInt extends ReturnsCheck {

        @NotNull
        public static final ReturnsInt INSTANCE = new ReturnsInt();

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        /* renamed from: kotlin.reflect.jvm.internal.impl.util.ReturnsCheck$ReturnsInt$1, reason: invalid class name */
        public static final class AnonymousClass1 extends xka implements Function1<KotlinBuiltIns, KotlinType> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final KotlinType invoke(@NotNull KotlinBuiltIns kotlinBuiltIns) {
                kotlinBuiltIns.getClass();
                SimpleType intType = kotlinBuiltIns.getIntType();
                intType.getClass();
                return intType;
            }
        }

        private ReturnsInt() {
            super("Int", AnonymousClass1.INSTANCE, null);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class ReturnsUnit extends ReturnsCheck {

        @NotNull
        public static final ReturnsUnit INSTANCE = new ReturnsUnit();

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        /* renamed from: kotlin.reflect.jvm.internal.impl.util.ReturnsCheck$ReturnsUnit$1, reason: invalid class name */
        public static final class AnonymousClass1 extends xka implements Function1<KotlinBuiltIns, KotlinType> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final KotlinType invoke(@NotNull KotlinBuiltIns kotlinBuiltIns) {
                kotlinBuiltIns.getClass();
                SimpleType unitType = kotlinBuiltIns.getUnitType();
                unitType.getClass();
                return unitType;
            }
        }

        private ReturnsUnit() {
            super("Unit", AnonymousClass1.INSTANCE, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ReturnsCheck(String str, Function1<? super KotlinBuiltIns, ? extends KotlinType> function1) {
        this.name = str;
        this.type = function1;
        this.description = dmi.q("must return ", str);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public boolean check(@NotNull FunctionDescriptor functionDescriptor) {
        functionDescriptor.getClass();
        return Intrinsics.c(functionDescriptor.getReturnType(), this.type.invoke(DescriptorUtilsKt.getBuiltIns(functionDescriptor)));
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    @NotNull
    public String getDescription() {
        return this.description;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    @Nullable
    public String invoke(@NotNull FunctionDescriptor functionDescriptor) {
        return Check.DefaultImpls.invoke(this, functionDescriptor);
    }

    public /* synthetic */ ReturnsCheck(String str, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, function1);
    }
}
