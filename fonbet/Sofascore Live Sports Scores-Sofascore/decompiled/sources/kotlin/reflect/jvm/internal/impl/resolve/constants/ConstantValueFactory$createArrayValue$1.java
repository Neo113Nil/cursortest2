package kotlin.reflect.jvm.internal.impl.resolve.constants;

import defpackage.xka;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ConstantValueFactory$createArrayValue$1 extends xka implements Function1<ModuleDescriptor, KotlinType> {
    final /* synthetic */ PrimitiveType $componentType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstantValueFactory$createArrayValue$1(PrimitiveType primitiveType) {
        super(1);
        this.$componentType = primitiveType;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final KotlinType invoke(@NotNull ModuleDescriptor moduleDescriptor) {
        moduleDescriptor.getClass();
        SimpleType primitiveArrayKotlinType = moduleDescriptor.getBuiltIns().getPrimitiveArrayKotlinType(this.$componentType);
        primitiveArrayKotlinType.getClass();
        return primitiveArrayKotlinType;
    }
}
