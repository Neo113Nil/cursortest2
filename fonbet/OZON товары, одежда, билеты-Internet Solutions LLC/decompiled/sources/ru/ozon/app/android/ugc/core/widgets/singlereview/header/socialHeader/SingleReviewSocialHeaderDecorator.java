package ru.ozon.app.android.ugc.core.widgets.singlereview.header.socialHeader;

import Sc.InterfaceC4008j;
import T7.P;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.core.view.C5314e0;
import androidx.core.view.C5316f0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview.TopAuthorDrawableCellViewBinder;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.core.widgets.singlereview.header.socialHeader.SingleReviewSocialHeaderViewHolder;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.cell.CellView;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0014R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010$\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0018\u001a\u0004\b\"\u0010#R\u001b\u0010)\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u0018\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/header/socialHeader/SingleReviewSocialHeaderDecorator;", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "onDrawOver", "", "backgroundColor$delegate", "LSc/j;", "getBackgroundColor", "()I", "backgroundColor", "Landroid/graphics/Paint;", "paint$delegate", "getPaint", "()Landroid/graphics/Paint;", "paint", "rect$delegate", "getRect", "()Landroid/graphics/Rect;", "rect", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/TopAuthorDrawableCellViewBinder;", "topAuthorDrawableBinder$delegate", "getTopAuthorDrawableBinder", "()Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/TopAuthorDrawableCellViewBinder;", "topAuthorDrawableBinder", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SingleReviewSocialHeaderDecorator extends RecyclerView.n {

    /* renamed from: backgroundColor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j backgroundColor;

    /* renamed from: paint$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j paint;

    /* renamed from: rect$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j rect;

    /* renamed from: topAuthorDrawableBinder$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j topAuthorDrawableBinder;

    public SingleReviewSocialHeaderDecorator(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.backgroundColor = LazyUtilsKt.unsafeLazy(new SingleReviewSocialHeaderDecorator$backgroundColor$2(context));
        this.paint = LazyUtilsKt.unsafeLazy(new SingleReviewSocialHeaderDecorator$paint$2(this));
        this.rect = LazyUtilsKt.unsafeLazy(SingleReviewSocialHeaderDecorator$rect$2.INSTANCE);
        this.topAuthorDrawableBinder = LazyUtilsKt.unsafeLazy(new SingleReviewSocialHeaderDecorator$topAuthorDrawableBinder$2(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getBackgroundColor() {
        return ((Number) this.backgroundColor.getValue()).intValue();
    }

    private final Paint getPaint() {
        return (Paint) this.paint.getValue();
    }

    private final Rect getRect() {
        return (Rect) this.rect.getValue();
    }

    private final TopAuthorDrawableCellViewBinder getTopAuthorDrawableBinder() {
        return (TopAuthorDrawableCellViewBinder) this.topAuthorDrawableBinder.getValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        if (P.e(parent, "parent", state, "state", view) instanceof SingleReviewSocialHeaderViewHolder) {
            Dimens dimens = Dimens.INSTANCE;
            outRect.set(dimens.getDP_16(), dimens.getDP_16(), dimens.getDP_16(), 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDraw(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        Iterator<View> it = C5316f0.b(parent).iterator();
        while (true) {
            C5314e0 c5314e0 = (C5314e0) it;
            if (!c5314e0.hasNext()) {
                return;
            }
            View view = (View) c5314e0.next();
            if (parent.getChildViewHolder(view) instanceof SingleReviewSocialHeaderViewHolder) {
                parent.getDecoratedBoundsWithMargins(view, getRect());
                canvas.drawRect(getRect(), getPaint());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDrawOver(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
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
            if (childViewHolder instanceof SingleReviewSocialHeaderViewHolder) {
                SingleReviewSocialHeaderViewHolder singleReviewSocialHeaderViewHolder = (SingleReviewSocialHeaderViewHolder) childViewHolder;
                if (singleReviewSocialHeaderViewHolder.getSocialHeaderType() == SingleReviewSocialHeaderViewHolder.SocialHeaderType.TOP_AUTHOR) {
                    TopAuthorDrawableCellViewBinder topAuthorDrawableBinder = getTopAuthorDrawableBinder();
                    View view = singleReviewSocialHeaderViewHolder.itemView;
                    CellView cellView = view instanceof CellView ? (CellView) view : null;
                    if (cellView == null) {
                        return;
                    } else {
                        topAuthorDrawableBinder.applyDrawable(cellView, parent, canvas);
                    }
                } else {
                    continue;
                }
            }
        }
    }
}
