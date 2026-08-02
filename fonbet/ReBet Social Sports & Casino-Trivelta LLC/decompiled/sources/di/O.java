package di;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class O extends AbstractC4102m0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(bi.f keyDesc, bi.f valueDesc) {
        super("kotlin.collections.HashMap", keyDesc, valueDesc, null);
        Intrinsics.checkNotNullParameter(keyDesc, "keyDesc");
        Intrinsics.checkNotNullParameter(valueDesc, "valueDesc");
    }
}
