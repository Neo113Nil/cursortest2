package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormAuthorCell;

import Sc.InterfaceC4008j;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import androidx.core.view.C5314e0;
import androidx.core.view.C5316f0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview.TopAuthorDrawableCellViewBinder;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.cell.CellView;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormAuthorCell/ReviewFormAuthorCellDecorator;", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/graphics/Canvas;", "canvas", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "", "onDrawOver", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/TopAuthorDrawableCellViewBinder;", "topAuthorDrawableBinder$delegate", "LSc/j;", "getTopAuthorDrawableBinder", "()Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/TopAuthorDrawableCellViewBinder;", "topAuthorDrawableBinder", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewFormAuthorCellDecorator extends RecyclerView.n {

    /* renamed from: topAuthorDrawableBinder$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j topAuthorDrawableBinder;

    public ReviewFormAuthorCellDecorator(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.topAuthorDrawableBinder = LazyUtilsKt.unsafeLazy(new ReviewFormAuthorCellDecorator$topAuthorDrawableBinder$2(context));
    }

    private final TopAuthorDrawableCellViewBinder getTopAuthorDrawableBinder() {
        return (TopAuthorDrawableCellViewBinder) this.topAuthorDrawableBinder.getValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDrawOver(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        ReviewFormAuthorCellWidgetVH reviewFormAuthorCellWidgetVH;
        ReviewFormAuthorCellVO boundData;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        Iterator<View> it = C5316f0.b(parent).iterator();
        while (true) {
            C5314e0 c5314e0 = (C5314e0) it;
            if (!c5314e0.hasNext()) {
                return;
            }
            RecyclerView.C childViewHolder = parent.getChildViewHolder((View) c5314e0.next());
            if ((childViewHolder instanceof ReviewFormAuthorCellWidgetVH) && (boundData = (reviewFormAuthorCellWidgetVH = (ReviewFormAuthorCellWidgetVH) childViewHolder).getBoundData()) != null && boundData.getIsTopAuthor()) {
                TopAuthorDrawableCellViewBinder topAuthorDrawableBinder = getTopAuthorDrawableBinder();
                View view = reviewFormAuthorCellWidgetVH.itemView;
                CellView cellView = view instanceof CellView ? (CellView) view : null;
                if (cellView == null) {
                    return;
                } else {
                    topAuthorDrawableBinder.applyDrawable(cellView, parent, canvas);
                }
            }
        }
    }
}
