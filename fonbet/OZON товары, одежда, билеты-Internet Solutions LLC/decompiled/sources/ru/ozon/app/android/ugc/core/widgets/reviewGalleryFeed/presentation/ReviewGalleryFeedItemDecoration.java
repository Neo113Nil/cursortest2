package ru.ozon.app.android.ugc.core.widgets.reviewGalleryFeed.presentation;

import B90.RunnableC2610l;
import Ij.C3261b;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import m10.C8042d;
import m10.l;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdp.utils.DrawableExtKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.data.common.CornerRadius;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010 R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010'R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00100R\u0016\u00102\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010 R\u0016\u00103\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010 R\u0018\u00104\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00106\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010-R\u0014\u00107\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010-¨\u00068"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryFeed/presentation/ReviewGalleryFeedItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroidx/recyclerview/widget/RecyclerView$C;", "viewHolder", "", "isTargetViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$C;)Z", "", "newElementsInRow", "Landroidx/recyclerview/widget/RecyclerView;", "rv", "", "checkChangeItemDecoration", "(ILandroidx/recyclerview/widget/RecyclerView;)V", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "parent", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "backgroundColor", "I", "externalMargin", "", "radius", "F", "", "externalRadii", "[F", "innerRadii", "Landroid/graphics/Paint;", "backgroundPaint", "Landroid/graphics/Paint;", "borderRect", "Landroid/graphics/Rect;", "Landroid/graphics/Path;", "backgroundPath", "Landroid/graphics/Path;", "clipPath", "topPos", "bottomPos", "lastElementsInRow", "Ljava/lang/Integer;", "bounds", "extendBackground", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewGalleryFeedItemDecoration extends RecyclerView.n {
    private final int backgroundColor;

    @NotNull
    private final Paint backgroundPaint;

    @NotNull
    private final Path backgroundPath;

    @NotNull
    private final Rect borderRect;
    private int bottomPos;

    @NotNull
    private final Rect bounds;

    @NotNull
    private final Path clipPath;

    @NotNull
    private final Rect extendBackground;
    private final int externalMargin;

    @NotNull
    private final float[] externalRadii;

    @NotNull
    private final float[] innerRadii;
    private Integer lastElementsInRow;
    private final float radius;
    private int topPos;

    public ReviewGalleryFeedItemDecoration(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int themeColor = ThemeExtKt.themeColor(context, R$attr.layerFloor1);
        this.backgroundColor = themeColor;
        Dimens dimens = Dimens.INSTANCE;
        this.externalMargin = dimens.getDP_8();
        float pxF = ResourceExtKt.toPxF(CornerRadius.RADIUS_500.getPx());
        this.radius = pxF;
        this.externalRadii = DrawableExtKt.createCornerRadii(dimens.getDPF_24(), dimens.getDPF_24(), 0.0f, 0.0f);
        this.innerRadii = DrawableExtKt.createCornerRadii(pxF, pxF, 0.0f, 0.0f);
        this.backgroundPaint = C3261b.b(1, themeColor);
        this.borderRect = new Rect();
        this.backgroundPath = new Path();
        this.clipPath = new Path();
        this.bounds = new Rect();
        this.extendBackground = new Rect();
    }

    private final void checkChangeItemDecoration(int newElementsInRow, RecyclerView rv) {
        Integer num = this.lastElementsInRow;
        if (num == null) {
            this.lastElementsInRow = Integer.valueOf(newElementsInRow);
        } else if (num.intValue() != newElementsInRow) {
            this.lastElementsInRow = Integer.valueOf(newElementsInRow);
            rv.post(new RunnableC2610l(rv, 4));
        }
    }

    private final boolean isTargetViewHolder(RecyclerView.C viewHolder) {
        return viewHolder instanceof ReviewGalleryFeedViewHolder;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        int childAdapterPosition;
        Pair pair;
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        RecyclerView.C childViewHolder = parent.getChildViewHolder(view);
        Intrinsics.f(childViewHolder);
        if (isTargetViewHolder(childViewHolder) && (childAdapterPosition = parent.getChildAdapterPosition(view)) != -1) {
            Object adapter = parent.getAdapter();
            l lVar = adapter instanceof l ? (l) adapter : null;
            if (lVar == null) {
                return;
            }
            RecyclerView.o layoutManager = parent.getLayoutManager();
            if (layoutManager == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
            }
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            int g10 = gridLayoutManager.g();
            GridLayoutManager.c k11 = gridLayoutManager.k();
            int spanIndex = k11.getSpanIndex(childAdapterPosition, g10);
            int spanSize = k11.getSpanSize(childAdapterPosition);
            int itemCount = lVar.getItemCount();
            int i11 = childAdapterPosition;
            for (int i12 = childAdapterPosition + 1; i12 < itemCount && (lVar.b(i12) instanceof ReviewGalleryFeedVO); i12++) {
                i11 = i12;
            }
            boolean z11 = k11.getSpanGroupIndex(childAdapterPosition, g10) == k11.getSpanGroupIndex(i11, g10);
            int i13 = g10 / spanSize;
            int dp_2 = i13 == 2 ? Dimens.INSTANCE.getDP_2() : 0;
            checkChangeItemDecoration(i13, parent);
            if (spanIndex == 0) {
                pair = new Pair(Integer.valueOf(this.externalMargin), Integer.valueOf(dp_2));
            } else if (spanIndex + spanSize == g10) {
                pair = new Pair(Integer.valueOf(dp_2), Integer.valueOf(this.externalMargin));
            } else {
                Dimens dimens = Dimens.INSTANCE;
                pair = new Pair(Integer.valueOf(dimens.getDP_4()), Integer.valueOf(dimens.getDP_4()));
            }
            int intValue = ((Number) pair.a()).intValue();
            int intValue2 = ((Number) pair.b()).intValue();
            outRect.left = intValue;
            outRect.right = intValue2;
            outRect.bottom = z11 ? 0 : Dimens.INSTANCE.getDP_4();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDraw(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        this.backgroundPath.reset();
        this.clipPath.reset();
        this.topPos = 0;
        this.bottomPos = 0;
        RecyclerView.g adapter = parent.getAdapter();
        C8042d c8042d = adapter instanceof C8042d ? (C8042d) adapter : null;
        if (c8042d == null) {
            return;
        }
        Iterator<ru.ozon.composer.ui.widget.l> it = c8042d.g().iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            } else if (it.next().d() instanceof ReviewGalleryFeedVO) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 == -1) {
            return;
        }
        int childCount = parent.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = parent.getChildAt(i12);
            RecyclerView.C childViewHolder = parent.getChildViewHolder(childAt);
            Intrinsics.f(childViewHolder);
            if (isTargetViewHolder(childViewHolder)) {
                if (childViewHolder.getAdapterPosition() == i11) {
                    this.topPos = childAt.getTop();
                    Rect rect = this.extendBackground;
                    rect.top = childAt.getBottom();
                    rect.bottom = parent.getBottom();
                    rect.left = parent.getLeft();
                    rect.right = parent.getRight();
                    canvas.drawRect(this.extendBackground, this.backgroundPaint);
                }
                this.bottomPos = childAt.getBottom();
            } else {
                parent.getDecoratedBoundsWithMargins(childAt, this.bounds);
                this.clipPath.addRect(new RectF(this.bounds), Path.Direction.CW);
            }
        }
        Rect rect2 = this.borderRect;
        rect2.left = 0;
        rect2.right = parent.getWidth();
        int i13 = this.topPos;
        int i14 = this.externalMargin;
        rect2.top = i13 - i14;
        rect2.bottom = this.bottomPos + i14;
        Path path = this.backgroundPath;
        RectF rectF = new RectF(this.borderRect);
        float[] fArr = this.externalRadii;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, fArr, direction);
        canvas.drawPath(this.backgroundPath, this.backgroundPaint);
        Rect rect3 = this.borderRect;
        rect3.left = this.externalMargin;
        rect3.right = parent.getWidth() - this.externalMargin;
        rect3.top = this.topPos;
        rect3.bottom = parent.getHeight();
        this.clipPath.addRoundRect(new RectF(this.borderRect), this.innerRadii, direction);
        canvas.clipPath(this.clipPath);
    }
}
