package kotlin.reflect.jvm.internal.impl.resolve.constants;

import defpackage.xka;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class TypedArrayValue extends ArrayValue {

    @NotNull
    private final KotlinType type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypedArrayValue(@NotNull List<? extends ConstantValue<?>> list, @NotNull KotlinType kotlinType) {
        super(list, new AnonymousClass1(kotlinType));
        list.getClass();
        kotlinType.getClass();
        this.type = kotlinType;
    }

    @NotNull
    public final KotlinType getType() {
        return this.type;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.TypedArrayValue$1, reason: invalid class name */
    public static final class AnonymousClass1 extends xka implements Function1<ModuleDescriptor, KotlinType> {
        final /* synthetic */ KotlinType $type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(KotlinType kotlinType) {
            super(1);
            this.$type = kotlinType;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final KotlinType invoke(@NotNull ModuleDescriptor moduleDescriptor) {
            moduleDescriptor.getClass();
            return this.$type;
        }
    }
}
