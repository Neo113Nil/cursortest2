package jk0;

import android.view.View;
import androidx.lifecycle.AbstractC5434v;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class c extends v {

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final r f70164k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@NotNull RecyclerView recyclerView, M10.a aVar) {
        super(recyclerView, aVar);
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.f70164k = new r();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // jk0.v
    protected final void c(@NotNull View view, @NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(view, "view");
        RecyclerView.C childViewHolder = recyclerView.getChildViewHolder(view);
        if (childViewHolder instanceof n) {
            if (!h()) {
                ((n) childViewHolder).setLifecycleState(AbstractC5434v.b.CREATED);
                return;
            }
            n nVar = (n) childViewHolder;
            q viewHolderPositionInfo = nVar.getViewHolderPositionInfo();
            r rVar = this.f70164k;
            rVar.c(view, viewHolderPositionInfo);
            q viewHolderPositionInfo2 = nVar.getViewHolderPositionInfo();
            if (!viewHolderPositionInfo2.c()) {
                nVar.setLifecycleState(AbstractC5434v.b.CREATED);
                View itemView = childViewHolder.itemView;
                Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                float a11 = rVar.a(itemView);
                if (a11 == -1.0f) {
                    return;
                }
                ((lk0.b) childViewHolder).onOffscreenPositionChanged(a11);
                return;
            }
            if (o.a(view, viewHolderPositionInfo2, true) > 0.0f) {
                if (!nVar.isInVisibleBounds()) {
                    k(nVar, view);
                }
                nVar.setLifecycleState(AbstractC5434v.b.RESUMED);
                nVar.onVisibleAreaChanged(nVar.getViewHolderPositionInfo());
                return;
            }
            Intrinsics.checkNotNullParameter(viewHolderPositionInfo2, "<this>");
            if (viewHolderPositionInfo2.b().isEmpty()) {
                return;
            }
            if (!viewHolderPositionInfo2.a().e().isEmpty()) {
                boolean z11 = viewHolderPositionInfo2.b().bottom <= viewHolderPositionInfo2.a().e().top && viewHolderPositionInfo2.b().bottom >= 0;
                boolean z12 = viewHolderPositionInfo2.a().d().height() > 0 && viewHolderPositionInfo2.b().top >= viewHolderPositionInfo2.a().d().top && viewHolderPositionInfo2.b().top <= viewHolderPositionInfo2.a().d().bottom;
                if (!z11 && !z12) {
                    return;
                }
            }
            nVar.setLifecycleState(AbstractC5434v.b.STARTED);
        }
    }

    public final void l(@NotNull l overlapInfo) {
        Intrinsics.checkNotNullParameter(overlapInfo, "overlapInfo");
        this.f70164k.b(overlapInfo);
        RecyclerView f7 = f();
        if (f7 != null) {
            d(f7);
        }
    }
}
