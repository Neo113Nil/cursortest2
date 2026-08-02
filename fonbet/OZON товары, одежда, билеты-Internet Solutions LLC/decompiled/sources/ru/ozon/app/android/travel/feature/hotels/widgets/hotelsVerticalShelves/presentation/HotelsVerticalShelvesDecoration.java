package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsVerticalShelves.presentation;

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
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import m10.l;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0017R\u001b\u0010\"\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001b\u0010'\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsVerticalShelves/presentation/HotelsVerticalShelvesDecoration;", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "", "defaultCardGap", "I", "defaultVerticalGap", "prevSpanGroupIndex", "", "isLastRow", "Z", "backgroundColor", "rect$delegate", "LSc/j;", "getRect", "()Landroid/graphics/Rect;", "rect", "Landroid/graphics/Paint;", "paint$delegate", "getPaint", "()Landroid/graphics/Paint;", "paint", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsVerticalShelvesDecoration extends RecyclerView.n {
    private final int backgroundColor;
    private final int defaultCardGap;
    private final int defaultVerticalGap;
    private boolean isLastRow;

    /* renamed from: paint$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j paint;
    private int prevSpanGroupIndex;

    /* renamed from: rect$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j rect;

    public HotelsVerticalShelvesDecoration(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.defaultCardGap = ResourceExtKt.toPx(8, context);
        this.defaultVerticalGap = ResourceExtKt.toPx(20, context);
        this.prevSpanGroupIndex = -1;
        this.backgroundColor = ThemeExtKt.themeColor(context, R$attr.layerFloor1);
        this.rect = LazyUtilsKt.unsafeLazy(HotelsVerticalShelvesDecoration$rect$2.INSTANCE);
        this.paint = LazyUtilsKt.unsafeLazy(new HotelsVerticalShelvesDecoration$paint$2(this));
    }

    private final Paint getPaint() {
        return (Paint) this.paint.getValue();
    }

    private final Rect getRect() {
        return (Rect) this.rect.getValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        int childAdapterPosition;
        int intValue;
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        if (!(P.e(parent, "parent", state, "state", view) instanceof HotelsVerticalShelvesWidgetViewHolder) || (childAdapterPosition = parent.getChildAdapterPosition(view)) == -1) {
            return;
        }
        Object adapter = parent.getAdapter();
        l lVar = adapter instanceof l ? (l) adapter : null;
        if (lVar == null) {
            return;
        }
        c b11 = lVar.b(childAdapterPosition);
        HotelsVerticalShelvesVO hotelsVerticalShelvesVO = b11 instanceof HotelsVerticalShelvesVO ? (HotelsVerticalShelvesVO) b11 : null;
        if (hotelsVerticalShelvesVO == null) {
            return;
        }
        Integer outerCardsMargins = hotelsVerticalShelvesVO.getCardOptions().getOuterCardsMargins();
        int intValue2 = outerCardsMargins != null ? outerCardsMargins.intValue() : 0;
        RecyclerView.o layoutManager = parent.getLayoutManager();
        if (layoutManager == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        }
        GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
        int g10 = gridLayoutManager.g();
        int spanIndex = gridLayoutManager.k().getSpanIndex(childAdapterPosition, g10);
        int spanSize = gridLayoutManager.k().getSpanSize(childAdapterPosition);
        int spanGroupIndex = gridLayoutManager.k().getSpanGroupIndex(childAdapterPosition, g10);
        int i11 = g10 / spanSize;
        if (this.prevSpanGroupIndex != spanGroupIndex) {
            this.prevSpanGroupIndex = spanGroupIndex;
            this.isLastRow = false;
            if (1 <= i11) {
                int i12 = 1;
                while (true) {
                    c b12 = lVar.b(childAdapterPosition + i12);
                    if ((b12 instanceof HotelsVerticalShelvesVO ? (HotelsVerticalShelvesVO) b12 : null) != null) {
                        if (i12 == i11) {
                            break;
                        } else {
                            i12++;
                        }
                    } else {
                        this.isLastRow = true;
                        break;
                    }
                }
            }
        }
        if (this.isLastRow) {
            intValue = 0;
        } else {
            Integer verticalGap = hotelsVerticalShelvesVO.getVerticalGap();
            intValue = verticalGap != null ? verticalGap.intValue() : this.defaultVerticalGap;
        }
        if (i11 == 1) {
            outRect.set(intValue2, 0, intValue2, intValue);
            return;
        }
        Integer gap = hotelsVerticalShelvesVO.getCardOptions().getGap();
        int intValue3 = gap != null ? gap.intValue() : this.defaultCardGap;
        int i13 = intValue3 / (i11 - 1);
        if (spanIndex == 0) {
            if (i11 <= 2) {
                i13 = intValue3 / 2;
            }
            outRect.set(intValue2, 0, i13, intValue);
        } else {
            if (spanIndex + spanSize != g10) {
                outRect.set(i13, 0, i13, intValue);
                return;
            }
            if (i11 <= 2) {
                i13 = intValue3 / 2;
            }
            outRect.set(i13, 0, intValue2, intValue);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDraw(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.onDraw(canvas, parent, state);
        Iterator<View> it = C5316f0.b(parent).iterator();
        while (true) {
            C5314e0 c5314e0 = (C5314e0) it;
            if (!c5314e0.hasNext()) {
                return;
            }
            View view = (View) c5314e0.next();
            if (parent.getChildViewHolder(view) instanceof HotelsVerticalShelvesWidgetViewHolder) {
                parent.getDecoratedBoundsWithMargins(view, getRect());
                canvas.drawRect(getRect(), getPaint());
            }
        }
    }
}
