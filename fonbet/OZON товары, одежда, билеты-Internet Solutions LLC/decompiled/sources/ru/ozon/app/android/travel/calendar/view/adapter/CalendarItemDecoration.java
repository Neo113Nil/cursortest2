package ru.ozon.app.android.travel.calendar.view.adapter;

import T7.P;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J'\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J/\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0014\u0010 \u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0014\u0010!\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001eR\u0014\u0010\"\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001eR\u0014\u0010#\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010-¨\u0006/"}, d2 = {"Lru/ozon/app/android/travel/calendar/view/adapter/CalendarItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/content/Context;", "context", "", "blocksRadius", "<init>", "(Landroid/content/Context;F)V", "Landroid/graphics/Canvas;", "canvas", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroid/view/View;", "child", "", "drawSimpleBackground", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;)V", "drawBackgroundForLastWeek", "drawBackgroundForTitle", "Landroid/graphics/Rect;", "outRect", "view", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "onDraw", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "", "dp8", "I", "dp12", "dp16", "dp24", "backgroundColor", "viewRect", "Landroid/graphics/Rect;", "Landroid/graphics/RectF;", "tempRectF", "Landroid/graphics/RectF;", "Landroid/graphics/Path;", "path", "Landroid/graphics/Path;", "", "topCornersRadii", "[F", "bottomCornersRadii", "calendar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CalendarItemDecoration extends RecyclerView.n {
    private final int backgroundColor;

    @NotNull
    private final float[] bottomCornersRadii;
    private final int dp12;
    private final int dp16;
    private final int dp24;
    private final int dp8;

    @NotNull
    private final Path path;

    @NotNull
    private final RectF tempRectF;

    @NotNull
    private final float[] topCornersRadii;

    @NotNull
    private final Rect viewRect;

    public CalendarItemDecoration(@NotNull Context context, float f7) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp8 = ResourceExtKt.toPx(8, context);
        this.dp12 = ResourceExtKt.toPx(12, context);
        this.dp16 = ResourceExtKt.toPx(16, context);
        this.dp24 = ResourceExtKt.toPx(24, context);
        this.backgroundColor = ThemeExtKt.themeColor(context, R$attr.layerFloor1);
        this.viewRect = new Rect();
        this.tempRectF = new RectF();
        this.path = new Path();
        this.topCornersRadii = new float[]{f7, f7, f7, f7, 0.0f, 0.0f, 0.0f, 0.0f};
        this.bottomCornersRadii = new float[]{0.0f, 0.0f, 0.0f, 0.0f, f7, f7, f7, f7};
    }

    private final void drawBackgroundForLastWeek(Canvas canvas, RecyclerView parent, View child) {
        parent.getDecoratedBoundsWithMargins(child, this.viewRect);
        this.tempRectF.set(this.viewRect);
        Path path = this.path;
        path.rewind();
        path.addRoundRect(this.tempRectF, this.bottomCornersRadii, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(this.path);
        canvas.drawColor(this.backgroundColor);
        canvas.restore();
    }

    private final void drawBackgroundForTitle(Canvas canvas, RecyclerView parent, View child) {
        parent.getDecoratedBoundsWithMargins(child, this.viewRect);
        Rect rect = this.viewRect;
        rect.top += this.dp8;
        this.tempRectF.set(rect);
        Path path = this.path;
        path.rewind();
        path.addRoundRect(this.tempRectF, this.topCornersRadii, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(this.path);
        canvas.drawColor(this.backgroundColor);
        canvas.restore();
    }

    private final void drawSimpleBackground(Canvas canvas, RecyclerView parent, View child) {
        parent.getDecoratedBoundsWithMargins(child, this.viewRect);
        canvas.save();
        canvas.clipRect(this.viewRect);
        canvas.drawColor(this.backgroundColor);
        canvas.restore();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        int adapterPosition;
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        RecyclerView.C e11 = P.e(parent, "parent", state, "state", view);
        if (e11 == null || (adapterPosition = e11.getAdapterPosition()) == -1) {
            return;
        }
        int i11 = this.dp16;
        outRect.left = i11;
        outRect.right = i11;
        if (e11 instanceof TravelCalendarMonthTitleViewHolder) {
            outRect.top = this.dp24;
            outRect.bottom = this.dp12;
        } else if (e11 instanceof TravelCalendarMonthWeekViewHolder) {
            outRect.bottom = parent.findViewHolderForAdapterPosition(adapterPosition + 1) instanceof TravelCalendarMonthWeekViewHolder ? this.dp8 : this.dp12;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDraw(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        int childCount = parent.getChildCount();
        if (childCount == 0) {
            return;
        }
        RecyclerView.g adapter = parent.getAdapter();
        int cardsCount = adapter != null ? (-1) + adapter.getCardsCount() : -1;
        int i11 = 0;
        while (i11 < childCount) {
            View childAt = parent.getChildAt(i11);
            RecyclerView.C childViewHolder = parent.getChildViewHolder(childAt);
            i11++;
            View childAt2 = parent.getChildAt(i11);
            RecyclerView.C childViewHolder2 = childAt2 != null ? parent.getChildViewHolder(childAt2) : null;
            if (childViewHolder.getAdapterPosition() == cardsCount) {
                Intrinsics.f(childAt);
                drawBackgroundForLastWeek(canvas, parent, childAt);
            } else if (childViewHolder instanceof TravelCalendarMonthTitleViewHolder) {
                Intrinsics.f(childAt);
                drawBackgroundForTitle(canvas, parent, childAt);
            } else if ((childViewHolder instanceof TravelCalendarMonthWeekViewHolder) && (childViewHolder2 instanceof TravelCalendarMonthTitleViewHolder)) {
                Intrinsics.f(childAt);
                drawBackgroundForLastWeek(canvas, parent, childAt);
            } else {
                Intrinsics.f(childAt);
                drawSimpleBackground(canvas, parent, childAt);
            }
        }
    }
}
