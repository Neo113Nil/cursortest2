package bd;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d extends AbstractC2418b {
    public d() {
        super(false, 1, null);
    }

    @Override // bd.InterfaceC2417a
    public void a(List drawingOperations) {
        Intrinsics.checkNotNullParameter(drawingOperations, "drawingOperations");
        if (b()) {
            CollectionsKt.reverse(drawingOperations);
        }
    }
}
