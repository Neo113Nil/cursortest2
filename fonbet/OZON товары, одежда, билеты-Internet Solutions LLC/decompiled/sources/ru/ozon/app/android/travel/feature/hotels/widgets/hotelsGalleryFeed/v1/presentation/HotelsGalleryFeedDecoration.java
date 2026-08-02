package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFeed.v1.presentation;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import m10.l;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFeed/v1/presentation/HotelsGalleryFeedDecoration;", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "", "dp2", "I", "dp4", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsGalleryFeedDecoration extends RecyclerView.n {
    private final int dp2;
    private final int dp4;

    public HotelsGalleryFeedDecoration(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp2 = ResourceExtKt.toPx(2, context);
        this.dp4 = ResourceExtKt.toPx(4, context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        int childAdapterPosition;
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.getItemOffsets(outRect, view, parent, state);
        if ((parent.getChildViewHolder(view) instanceof HotelsGalleryFeedWidgetViewHolder) && (childAdapterPosition = parent.getChildAdapterPosition(view)) != -1) {
            RecyclerView.o layoutManager = parent.getLayoutManager();
            if (layoutManager == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
            }
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            int spanIndex = gridLayoutManager.k().getSpanIndex(childAdapterPosition, gridLayoutManager.g());
            Object adapter = parent.getAdapter();
            l lVar = adapter instanceof l ? (l) adapter : null;
            boolean z11 = (lVar != null ? lVar.b(childAdapterPosition + 1) : null) instanceof HotelsGalleryFeedVO;
            Pair pair = spanIndex == 0 ? new Pair(Integer.valueOf(this.dp4), Integer.valueOf(this.dp2)) : new Pair(Integer.valueOf(this.dp2), Integer.valueOf(this.dp4));
            int intValue = ((Number) pair.a()).intValue();
            int intValue2 = ((Number) pair.b()).intValue();
            int i11 = !z11 ? 0 : this.dp4;
            outRect.left = intValue;
            outRect.right = intValue2;
            outRect.bottom = i11;
        }
    }
}
