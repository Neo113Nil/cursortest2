package ru.ozon.app.android.cart.marketingdetail.presentation;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.marketingdetail.presentation.MarketingDetailVO;
import ru.ozon.app.android.uikit.view.recycler.decoration.CustomDividerDecoration;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/cart/marketingdetail/presentation/MarketingDetailsDecoration;", "Lru/ozon/app/android/uikit/view/recycler/decoration/CustomDividerDecoration;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroid/view/View;", "child", "", "startDividerOffset", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;)I", "endDividerOffset", "", "drawFor", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;)Z", "Landroid/graphics/Rect;", "outRect", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "leftOffset", "I", "topTitleOffset", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MarketingDetailsDecoration extends CustomDividerDecoration {
    private final int leftOffset;
    private final int topTitleOffset;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketingDetailsDecoration(@NotNull Context context) {
        super(context, 1, 0, true, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.leftOffset = ResourceExtKt.toPx(context, 16.0f);
        this.topTitleOffset = ResourceExtKt.toPx(context, 32.0f);
    }

    @Override // ru.ozon.app.android.uikit.view.recycler.decoration.CustomDividerDecoration
    public boolean drawFor(@NotNull RecyclerView parent, @NotNull View child) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        int childAdapterPosition = parent.getChildAdapterPosition(child);
        RecyclerView.g adapter = parent.getAdapter();
        Intrinsics.g(adapter, "null cannot be cast to non-null type ru.ozon.app.android.cart.marketingdetail.presentation.MarketingDetailsAdapter");
        MarketingDetailsAdapter marketingDetailsAdapter = (MarketingDetailsAdapter) adapter;
        Object tryGetItem = marketingDetailsAdapter.tryGetItem(childAdapterPosition);
        if (tryGetItem == null) {
            tryGetItem = Boolean.FALSE;
        }
        Object tryGetItem2 = marketingDetailsAdapter.tryGetItem(childAdapterPosition + 1);
        if (tryGetItem2 == null) {
            tryGetItem2 = Boolean.FALSE;
        }
        return (childAdapterPosition != marketingDetailsAdapter.getCardsCount() - 1 && (tryGetItem instanceof MarketingDetailVO.DetailListItem.Total)) || (tryGetItem2 instanceof MarketingDetailVO.DetailListItem.Total);
    }

    @Override // ru.ozon.app.android.uikit.view.recycler.decoration.CustomDividerDecoration
    public int endDividerOffset(@NotNull RecyclerView parent, @NotNull View child) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        int childAdapterPosition = parent.getChildAdapterPosition(child);
        RecyclerView.g adapter = parent.getAdapter();
        Intrinsics.g(adapter, "null cannot be cast to non-null type ru.ozon.app.android.cart.marketingdetail.presentation.MarketingDetailsAdapter");
        Object tryGetItem = ((MarketingDetailsAdapter) adapter).tryGetItem(childAdapterPosition + 1);
        if (tryGetItem == null) {
            tryGetItem = Boolean.FALSE;
        }
        if (tryGetItem instanceof MarketingDetailVO.DetailListItem.Total) {
            return this.leftOffset;
        }
        return 0;
    }

    @Override // ru.ozon.app.android.uikit.view.recycler.decoration.CustomDividerDecoration, androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View child, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.getItemOffsets(outRect, child, parent, state);
        int childAdapterPosition = parent.getChildAdapterPosition(child);
        RecyclerView.g adapter = parent.getAdapter();
        Intrinsics.g(adapter, "null cannot be cast to non-null type ru.ozon.app.android.cart.marketingdetail.presentation.MarketingDetailsAdapter");
        MarketingDetailsAdapter marketingDetailsAdapter = (MarketingDetailsAdapter) adapter;
        Object tryGetItem = marketingDetailsAdapter.tryGetItem(childAdapterPosition - 1);
        if (tryGetItem == null) {
            tryGetItem = Boolean.FALSE;
        }
        Object tryGetItem2 = marketingDetailsAdapter.tryGetItem(childAdapterPosition);
        if (tryGetItem2 == null) {
            tryGetItem2 = Boolean.FALSE;
        }
        if ((tryGetItem instanceof MarketingDetailVO.DetailListItem.Total) && (tryGetItem2 instanceof MarketingDetailVO.DetailListItem.Title)) {
            outRect.top = this.topTitleOffset;
        }
    }

    @Override // ru.ozon.app.android.uikit.view.recycler.decoration.CustomDividerDecoration
    public int startDividerOffset(@NotNull RecyclerView parent, @NotNull View child) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        int childAdapterPosition = parent.getChildAdapterPosition(child);
        RecyclerView.g adapter = parent.getAdapter();
        Intrinsics.g(adapter, "null cannot be cast to non-null type ru.ozon.app.android.cart.marketingdetail.presentation.MarketingDetailsAdapter");
        Object tryGetItem = ((MarketingDetailsAdapter) adapter).tryGetItem(childAdapterPosition + 1);
        if (tryGetItem == null) {
            tryGetItem = Boolean.FALSE;
        }
        if (tryGetItem instanceof MarketingDetailVO.DetailListItem.Total) {
            return this.leftOffset;
        }
        return 0;
    }
}
