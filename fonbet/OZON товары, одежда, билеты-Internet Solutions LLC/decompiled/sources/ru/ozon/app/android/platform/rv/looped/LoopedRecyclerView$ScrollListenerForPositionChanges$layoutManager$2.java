package ru.ozon.app.android.platform.rv.looped;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.platform.rv.looped.LoopedRecyclerView;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/recyclerview/widget/LinearLayoutManager;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class LoopedRecyclerView$ScrollListenerForPositionChanges$layoutManager$2 extends AbstractC7737t implements Function0<LinearLayoutManager> {
    final /* synthetic */ LoopedRecyclerView.ScrollListenerForPositionChanges this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LoopedRecyclerView$ScrollListenerForPositionChanges$layoutManager$2(LoopedRecyclerView.ScrollListenerForPositionChanges scrollListenerForPositionChanges) {
        super(0);
        this.this$0 = scrollListenerForPositionChanges;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final LinearLayoutManager invoke() {
        LoopedRecyclerView loopedRecyclerView;
        loopedRecyclerView = this.this$0.loopedRecyclerView;
        RecyclerView.o layoutManager = loopedRecyclerView.getLayoutManager();
        Intrinsics.g(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        return (LinearLayoutManager) layoutManager;
    }
}
