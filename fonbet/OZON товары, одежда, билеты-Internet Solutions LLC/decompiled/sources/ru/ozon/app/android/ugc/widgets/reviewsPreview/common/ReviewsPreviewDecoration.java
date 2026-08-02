package ru.ozon.app.android.ugc.widgets.reviewsPreview.common;

import Sc.InterfaceC4008j;
import T7.P;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.core.view.C5314e0;
import androidx.core.view.C5316f0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.widgets.reviewsPreview.bottomText.ReviewsPreviewBottomTextVH;
import ru.ozon.app.android.ugc.widgets.reviewsPreview.data.CommonVO;
import ru.ozon.app.android.ugc.widgets.reviewsPreview.image.ReviewsPreviewImageVH;
import ru.ozon.app.android.ugc.widgets.reviewsPreview.video.ReviewsPreviewVideoVH;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010!\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewsPreview/common/ReviewsPreviewDecoration;", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "", "defaultBackgroundColor", "I", "Landroid/graphics/Paint;", "paint$delegate", "LSc/j;", "getPaint", "()Landroid/graphics/Paint;", "paint", "rect$delegate", "getRect", "()Landroid/graphics/Rect;", "rect", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewsPreviewDecoration extends RecyclerView.n {
    private final int defaultBackgroundColor;

    /* renamed from: paint$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j paint;

    /* renamed from: rect$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j rect;

    public ReviewsPreviewDecoration(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.defaultBackgroundColor = androidx.core.content.a.getColor(context, UniColors.LAYER_FLOOR_0.getResId());
        this.paint = LazyUtilsKt.unsafeLazy(ReviewsPreviewDecoration$paint$2.INSTANCE);
        this.rect = LazyUtilsKt.unsafeLazy(ReviewsPreviewDecoration$rect$2.INSTANCE);
    }

    private final Paint getPaint() {
        return (Paint) this.paint.getValue();
    }

    private final Rect getRect() {
        return (Rect) this.rect.getValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Paddings itemSpacing;
        Paddings horizontalPadding;
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        RecyclerView.C e11 = P.e(parent, "parent", state, "state", view);
        if ((e11 instanceof ReviewsPreviewImageVH) || (e11 instanceof ReviewsPreviewVideoVH) || (e11 instanceof ReviewsPreviewBottomTextVH)) {
            RecyclerView.o layoutManager = parent.getLayoutManager();
            if (layoutManager == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
            }
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            Integer valueOf = Integer.valueOf(parent.getChildAdapterPosition(view));
            if (valueOf.intValue() == -1) {
                valueOf = null;
            }
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                int g10 = gridLayoutManager.g();
                int spanIndex = gridLayoutManager.k().getSpanIndex(intValue, g10);
                int spanSize = gridLayoutManager.k().getSpanSize(intValue);
                k kVar = (k) e11;
                c boundData = kVar.getBoundData();
                int dp_4 = (boundData == null || (horizontalPadding = ((CommonVO) boundData).getHorizontalPadding()) == null) ? Dimens.INSTANCE.getDP_4() : ResourceExtKt.toPx(horizontalPadding.getPx());
                c boundData2 = kVar.getBoundData();
                int dp_42 = ((boundData2 == null || (itemSpacing = ((CommonVO) boundData2).getItemSpacing()) == null) ? Dimens.INSTANCE.getDP_4() : ResourceExtKt.toPx(itemSpacing.getPx())) / 2;
                Pair pair = (spanIndex != 0 || spanSize == g10) ? spanIndex + spanSize == g10 ? new Pair(Integer.valueOf(dp_42), Integer.valueOf(dp_4)) : new Pair(Integer.valueOf(dp_42), Integer.valueOf(dp_42)) : new Pair(Integer.valueOf(dp_4), Integer.valueOf(dp_42));
                outRect.set(((Number) pair.a()).intValue(), 0, ((Number) pair.b()).intValue(), 0);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDraw(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        int i11;
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
            RecyclerView.C childViewHolder = parent.getChildViewHolder(view);
            if ((childViewHolder instanceof ReviewsPreviewImageVH) || (childViewHolder instanceof ReviewsPreviewVideoVH) || (childViewHolder instanceof ReviewsPreviewBottomTextVH)) {
                c boundData = ((k) childViewHolder).getBoundData();
                String widgetBackgroundColor = boundData != null ? ((CommonVO) boundData).getWidgetBackgroundColor() : null;
                Paint paint = getPaint();
                if (widgetBackgroundColor != null) {
                    StyleParser styleParser = StyleParser.INSTANCE;
                    Context context = parent.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    Integer parseColor = styleParser.parseColor(context, widgetBackgroundColor);
                    if (parseColor != null) {
                        i11 = parseColor.intValue();
                        paint.setColor(i11);
                        parent.getDecoratedBoundsWithMargins(view, getRect());
                        canvas.drawRect(getRect(), getPaint());
                    }
                }
                i11 = this.defaultBackgroundColor;
                paint.setColor(i11);
                parent.getDecoratedBoundsWithMargins(view, getRect());
                canvas.drawRect(getRect(), getPaint());
            }
        }
    }
}
