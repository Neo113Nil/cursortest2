package di;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class Q extends AbstractC4090g0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(bi.f elementDesc) {
        super(elementDesc, null);
        Intrinsics.checkNotNullParameter(elementDesc, "elementDesc");
    }

    @Override // bi.f
    public String h() {
        return "kotlin.collections.HashSet";
    }
}
