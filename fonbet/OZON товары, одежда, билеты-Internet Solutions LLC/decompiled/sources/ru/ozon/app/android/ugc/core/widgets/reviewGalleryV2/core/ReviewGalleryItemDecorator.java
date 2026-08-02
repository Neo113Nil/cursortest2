package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.core;

import Sc.InterfaceC4008j;
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
import ru.ozon.app.android.utils.LazyUtilsKt;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010 \u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010#\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0019\u001a\u0004\b\"\u0010\u001f¨\u0006$"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/core/ReviewGalleryItemDecorator;", "Landroidx/recyclerview/widget/RecyclerView$n;", "", "topPadding", "bottomPadding", "<init>", "(II)V", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "I", "Landroid/graphics/Paint;", "paint$delegate", "LSc/j;", "getPaint", "()Landroid/graphics/Paint;", "paint", "topRect$delegate", "getTopRect", "()Landroid/graphics/Rect;", "topRect", "bottomRect$delegate", "getBottomRect", "bottomRect", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewGalleryItemDecorator extends RecyclerView.n {
    private final int bottomPadding;
    private final int topPadding;

    /* renamed from: paint$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j paint = LazyUtilsKt.unsafeLazy(ReviewGalleryItemDecorator$paint$2.INSTANCE);

    /* renamed from: topRect$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j topRect = LazyUtilsKt.unsafeLazy(ReviewGalleryItemDecorator$topRect$2.INSTANCE);

    /* renamed from: bottomRect$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j bottomRect = LazyUtilsKt.unsafeLazy(ReviewGalleryItemDecorator$bottomRect$2.INSTANCE);

    public ReviewGalleryItemDecorator(int i11, int i12) {
        this.topPadding = i11;
        this.bottomPadding = i12;
    }

    private final Rect getBottomRect() {
        return (Rect) this.bottomRect.getValue();
    }

    private final Paint getPaint() {
        return (Paint) this.paint.getValue();
    }

    private final Rect getTopRect() {
        return (Rect) this.topRect.getValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        if (view.getContext().getResources().getConfiguration().orientation == 1) {
            outRect.set(0, this.topPadding, 0, this.bottomPadding);
        } else {
            outRect.set(0, 0, 0, 0);
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
            parent.getDecoratedBoundsWithMargins(view, getTopRect());
            parent.getDecoratedBoundsWithMargins(view, getBottomRect());
            getTopRect().bottom = view.getTop();
            getBottomRect().top = view.getBottom();
            canvas.drawRect(getTopRect(), getPaint());
            canvas.drawRect(getBottomRect(), getPaint());
        }
    }
}
