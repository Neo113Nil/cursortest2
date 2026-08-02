package expo.modules.kotlin.objects;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.objectweb.asm.Opcodes;

/* compiled from: PropertyComponentBuilder.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = Opcodes.ARETURN)
/* loaded from: classes9.dex */
public final class PropertyComponentBuilderWithThis$get$1$1 implements Function1<Object[], Object> {
    final /* synthetic */ Function1<ThisType, R> $body;

    /* JADX WARN: Multi-variable type inference failed */
    public PropertyComponentBuilderWithThis$get$1$1(Function1<? super ThisType, ? extends R> function1) {
        this.$body = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object[] it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return this.$body.invoke(it[0]);
    }
}
