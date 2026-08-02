package bd;

import java.util.Collections;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c extends AbstractC2418b {

    /* renamed from: b, reason: collision with root package name */
    public final int f25015b;

    public c(int i10) {
        super(false, 1, null);
        this.f25015b = i10;
    }

    @Override // bd.InterfaceC2417a
    public void a(List drawingOperations) {
        Intrinsics.checkNotNullParameter(drawingOperations, "drawingOperations");
        if (b()) {
            int i10 = this.f25015b;
            for (int lastIndex = CollectionsKt.getLastIndex(drawingOperations); i10 < lastIndex; lastIndex--) {
                Collections.swap(drawingOperations, i10, lastIndex);
                i10++;
            }
        }
    }
}
