package ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelModalPriceDetailInformation.v1.presentation.sections;

import T7.P;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.content.a;
import androidx.core.view.C5314e0;
import androidx.core.view.C5316f0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelModalPriceDetailInformation/v1/presentation/sections/TravelModalPriceDetailInformationDecoration;", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "", "additionalVerticalOffset", "I", "Landroid/graphics/drawable/Drawable;", "divider", "Landroid/graphics/drawable/Drawable;", "backgroundColor", "old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelModalPriceDetailInformationDecoration extends RecyclerView.n {
    private final int additionalVerticalOffset;
    private final int backgroundColor;
    private final Drawable divider;

    public TravelModalPriceDetailInformationDecoration(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.additionalVerticalOffset = ResourceExtKt.toPx(4, context);
        this.divider = a.getDrawable(context, R$drawable.list_divider);
        this.backgroundColor = ThemeExtKt.themeColor(context, R$attr.layerFloor1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        if (P.e(parent, "parent", state, "state", view) instanceof TravelModalPriceDetailInformationWidgetViewHolder) {
            Drawable drawable = this.divider;
            int intrinsicHeight = drawable != null ? drawable.getIntrinsicHeight() : 0;
            int childAdapterPosition = parent.getChildAdapterPosition(view);
            if (childAdapterPosition == -1) {
                super.getItemOffsets(outRect, view, parent, state);
            } else if (childAdapterPosition != state.b() - 1) {
                outRect.set(0, 0, 0, intrinsicHeight);
            } else {
                int i11 = this.additionalVerticalOffset;
                outRect.set(0, i11, 0, i11);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDraw(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        int childCount = parent.getChildCount() - 1;
        RecyclerView.o layoutManager = parent.getLayoutManager();
        Iterator<View> it = C5316f0.b(parent).iterator();
        int i11 = 0;
        while (true) {
            C5314e0 c5314e0 = (C5314e0) it;
            if (!c5314e0.hasNext()) {
                return;
            }
            Object next = c5314e0.next();
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            View view = (View) next;
            RecyclerView.C findContainingViewHolder = parent.findContainingViewHolder(view);
            if (findContainingViewHolder != null) {
                if ((findContainingViewHolder instanceof TravelModalPriceDetailInformationWidgetViewHolder ? findContainingViewHolder : null) == null) {
                    continue;
                } else {
                    if (layoutManager != null) {
                        int decoratedLeft = layoutManager.getDecoratedLeft(view);
                        int decoratedTop = layoutManager.getDecoratedTop(view);
                        int decoratedRight = layoutManager.getDecoratedRight(view);
                        int decoratedBottom = layoutManager.getDecoratedBottom(view);
                        int save = canvas.save();
                        canvas.clipRect(decoratedLeft, decoratedTop, decoratedRight, decoratedBottom);
                        try {
                            canvas.drawColor(this.backgroundColor);
                        } finally {
                            canvas.restoreToCount(save);
                        }
                    }
                    if (i11 != childCount && this.divider != null && layoutManager != null) {
                        int decoratedBottom2 = layoutManager.getDecoratedBottom(view);
                        int intrinsicHeight = decoratedBottom2 - this.divider.getIntrinsicHeight();
                        int paddingLeft = view.getPaddingLeft();
                        int width = parent.getWidth() - view.getPaddingRight();
                        Drawable drawable = this.divider;
                        drawable.setBounds(paddingLeft, intrinsicHeight, width, decoratedBottom2);
                        drawable.draw(canvas);
                    }
                }
            }
            i11 = i12;
        }
    }
}
