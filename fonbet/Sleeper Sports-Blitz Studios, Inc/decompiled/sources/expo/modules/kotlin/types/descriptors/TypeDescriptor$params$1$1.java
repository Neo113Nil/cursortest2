package expo.modules.kotlin.types.descriptors;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KType;
import org.objectweb.asm.Opcodes;

/* compiled from: TypeDescriptor.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = Opcodes.ARETURN)
/* loaded from: classes9.dex */
public final class TypeDescriptor$params$1$1 implements Function0<KType> {
    final /* synthetic */ int $index;
    final /* synthetic */ TypeDescriptor this$0;

    public TypeDescriptor$params$1$1(TypeDescriptor typeDescriptor, int i) {
        this.this$0 = typeDescriptor;
        this.$index = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final KType invoke() {
        KType type = this.this$0.getKType().getArguments().get(this.$index).getType();
        if (type != null) {
            return type;
        }
        throw new IllegalStateException("Type argument is missing".toString());
    }
}
