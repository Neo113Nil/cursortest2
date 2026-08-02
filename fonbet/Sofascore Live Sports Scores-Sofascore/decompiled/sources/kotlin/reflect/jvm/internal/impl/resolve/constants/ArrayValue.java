package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public class ArrayValue extends ConstantValue<List<? extends ConstantValue<?>>> {

    @NotNull
    private final Function1<ModuleDescriptor, KotlinType> computeType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ArrayValue(@NotNull List<? extends ConstantValue<?>> list, @NotNull Function1<? super ModuleDescriptor, ? extends KotlinType> function1) {
        super(list);
        list.getClass();
        function1.getClass();
        this.computeType = function1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    @NotNull
    public KotlinType getType(@NotNull ModuleDescriptor moduleDescriptor) {
        moduleDescriptor.getClass();
        KotlinType kotlinType = (KotlinType) this.computeType.invoke(moduleDescriptor);
        if (!KotlinBuiltIns.isArray(kotlinType) && !KotlinBuiltIns.isPrimitiveArray(kotlinType)) {
            KotlinBuiltIns.isUnsignedArrayType(kotlinType);
        }
        return kotlinType;
    }
}
