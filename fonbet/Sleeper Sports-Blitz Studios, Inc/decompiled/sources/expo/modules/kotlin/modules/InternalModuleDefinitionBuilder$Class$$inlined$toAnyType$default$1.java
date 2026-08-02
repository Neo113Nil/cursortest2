package expo.modules.kotlin.modules;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KType;
import org.objectweb.asm.Opcodes;

/* compiled from: typeDescriptorOf.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = Opcodes.ARETURN)
/* loaded from: classes9.dex */
public final class InternalModuleDefinitionBuilder$Class$$inlined$toAnyType$default$1 implements Function0<KType> {
    public static final InternalModuleDefinitionBuilder$Class$$inlined$toAnyType$default$1 INSTANCE = new InternalModuleDefinitionBuilder$Class$$inlined$toAnyType$default$1();

    @Override // kotlin.jvm.functions.Function0
    public final KType invoke() {
        return Reflection.typeOf(Unit.class);
    }
}
