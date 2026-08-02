package ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.room;

import E0.C2942q;
import T7.P;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import m10.l;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001cR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/room/TouristCountSelectorV3RoomsDecoration;", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lm10/l;", "decoratedAdapter", "", "firstRoomPosition", "getRoomsCount", "(Lm10/l;I)I", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "Landroid/graphics/Canvas;", "canvas", "onDrawOver", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "offsetBetween", "I", "", "radius", "F", "dividerColor", "Landroid/graphics/Path;", "path", "Landroid/graphics/Path;", "childBounds", "Landroid/graphics/Rect;", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TouristCountSelectorV3RoomsDecoration extends RecyclerView.n {

    @NotNull
    private final Rect childBounds;
    private final int dividerColor;
    private final int offsetBetween;

    @NotNull
    private final Path path;
    private final float radius;

    public TouristCountSelectorV3RoomsDecoration(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.offsetBetween = ResourceExtKt.toPx(8, context);
        this.radius = ResourceExtKt.toPxF(24, context);
        this.dividerColor = ThemeExtKt.themeColor(context, R$attr.layerFloor0);
        this.path = new Path();
        this.childBounds = new Rect();
    }

    private final int getRoomsCount(l decoratedAdapter, int firstRoomPosition) {
        int itemCount = decoratedAdapter.getItemCount();
        int i11 = 0;
        while (firstRoomPosition < itemCount) {
            c b11 = decoratedAdapter.b(firstRoomPosition);
            if (!(b11 instanceof TouristCountSelectorV3RoomVO) || !((TouristCountSelectorV3RoomVO) b11).getIsRoomVisible()) {
                break;
            }
            i11++;
            firstRoomPosition++;
        }
        return i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        int childAdapterPosition;
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        if ((P.e(parent, "parent", state, "state", view) instanceof TouristCountSelectorV3RoomWidgetViewHolder) && (childAdapterPosition = parent.getChildAdapterPosition(view)) != -1) {
            Object adapter = parent.getAdapter();
            l lVar = adapter instanceof l ? (l) adapter : null;
            if (lVar == null) {
                return;
            }
            c b11 = lVar.b(childAdapterPosition);
            TouristCountSelectorV3RoomVO touristCountSelectorV3RoomVO = b11 instanceof TouristCountSelectorV3RoomVO ? (TouristCountSelectorV3RoomVO) b11 : null;
            if (touristCountSelectorV3RoomVO == null || !touristCountSelectorV3RoomVO.getIsRoomVisible()) {
                outRect.setEmpty();
            } else {
                outRect.top = (childAdapterPosition == 0 || !(lVar.b(childAdapterPosition - 1) instanceof TouristCountSelectorV3RoomVO)) ? 0 : this.offsetBetween;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDrawOver(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Integer c11;
        RecyclerView.o layoutManager;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Object a11 = C2942q.a(parent, "parent", state, "state");
        l lVar = a11 instanceof l ? (l) a11 : null;
        if (lVar == null || (c11 = lVar.c(TouristCountSelectorV3RoomVO.class)) == null) {
            return;
        }
        int intValue = c11.intValue();
        int roomsCount = getRoomsCount(lVar, intValue);
        int i11 = 1;
        if (roomsCount <= 1 || (layoutManager = parent.getLayoutManager()) == null) {
            return;
        }
        float left = parent.getLeft();
        float right = parent.getRight();
        int i12 = roomsCount - 1;
        int i13 = 0;
        while (i13 < i12) {
            View findViewByPosition = layoutManager.findViewByPosition(intValue + i13 + i11);
            if (findViewByPosition != null) {
                layoutManager.getDecoratedBoundsWithMargins(findViewByPosition, this.childBounds);
                int i14 = this.childBounds.top;
                float f7 = this.radius;
                float f11 = i14 - f7;
                float f12 = i14 + this.offsetBetween + f7;
                Path path = this.path;
                path.rewind();
                path.moveTo(left, f11);
                path.lineTo(left, f12);
                float f13 = this.radius;
                float f14 = 2;
                path.arcTo(left, f12 - f13, (f14 * f13) + left, f13 + f12, 180.0f, 90.0f, false);
                float f15 = this.radius;
                path.lineTo(right - f15, f12 - f15);
                float f16 = this.radius;
                float f17 = right;
                path.arcTo(right - (f14 * f16), f12 - f16, f17, f12 + f16, 270.0f, 90.0f, false);
                path.lineTo(f17, f11);
                float f18 = this.radius;
                path.arcTo(f17 - (f14 * f18), f11 - f18, f17, f11 + f18, 0.0f, 90.0f, false);
                right = f17;
                float f19 = this.radius;
                path.lineTo(left + f19, f19 + f11);
                float f21 = this.radius;
                path.arcTo(left, f11 - f21, (f14 * f21) + left, f11 + f21, 90.0f, 90.0f, false);
                int save = canvas.save();
                try {
                    canvas.clipPath(this.path);
                    canvas.drawColor(this.dividerColor);
                } finally {
                    canvas.restoreToCount(save);
                }
            }
            i13++;
            i11 = 1;
        }
    }
}
