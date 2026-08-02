package ru.ozon.app.android.orderdetails.ordershipment.orderShipment.presentation.posting;

import E0.C2942q;
import Pk0.h;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.view.View;
import androidx.core.view.C5314e0;
import androidx.core.view.C5316f0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import m10.l;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.islandSeparator.presentation.IslandSeparatorVO;
import ru.ozon.app.android.orderdetails.ordershipment.orderShipment.presentation.OrderShipmentItemVO;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ'\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/posting/PostingOrderShipmentItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/graphics/Canvas;", "c", "", "drawTopCorners", "(Landroid/graphics/Canvas;)V", "drawBottomCorners", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "onDrawOver", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "", "space10", "I", "space12", "childRect", "Landroid/graphics/Rect;", "Landroid/graphics/Path;", "islandSeparatorPath", "Landroid/graphics/Path;", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "Companion", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PostingOrderShipmentItemDecoration extends RecyclerView.n {
    private static final float CORNER_DIAMETER;
    private static final float CORNER_RADIUS;
    private static final int OVERLAP_MARGIN;
    private static final int SEPARATOR_BOTTOM_MARGIN;
    private static final int SEPARATOR_OFFSET;
    private static final int SEPARATOR_TOP_MARGIN;

    @NotNull
    private final Rect childRect;

    @NotNull
    private final Path islandSeparatorPath;

    @NotNull
    private final Paint paint;
    private final int space10;
    private final int space12;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/posting/PostingOrderShipmentItemDecoration$Companion;", "", "<init>", "()V", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        float pxF = ResourceExtKt.toPxF(24);
        CORNER_RADIUS = pxF;
        CORNER_DIAMETER = pxF * 2;
        SEPARATOR_OFFSET = ResourceExtKt.toPx(8);
        OVERLAP_MARGIN = ResourceExtKt.toPx(1);
        SEPARATOR_TOP_MARGIN = ResourceExtKt.toPx(16);
        SEPARATOR_BOTTOM_MARGIN = ResourceExtKt.toPx(8);
    }

    public PostingOrderShipmentItemDecoration(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.space10 = ResourceExtKt.toPx(10, context);
        this.space12 = ResourceExtKt.toPx(12, context);
        this.childRect = new Rect();
        this.islandSeparatorPath = new Path();
        Paint a11 = h.a(true);
        a11.setColor(context.getColor(R$color.layer_floor_0));
        this.paint = a11;
    }

    private final void drawBottomCorners(Canvas c11) {
        Rect rect = this.childRect;
        int i11 = rect.bottom;
        float f7 = i11 - SEPARATOR_OFFSET;
        float f11 = rect.left;
        float f12 = rect.right;
        float f13 = i11;
        Path path = this.islandSeparatorPath;
        path.reset();
        path.moveTo(f11, f13);
        float f14 = CORNER_RADIUS;
        path.lineTo(f11, f7 - f14);
        float f15 = CORNER_DIAMETER;
        path.arcTo(f11, f7 - f15, f11 + f15, f7, 180.0f, -90.0f, false);
        path.lineTo(f12 - f14, f7);
        path.arcTo(f12 - f15, f7 - f15, f12, f7, 90.0f, -90.0f, false);
        path.lineTo(f12, f13);
        path.close();
        c11.drawPath(this.islandSeparatorPath, this.paint);
    }

    private final void drawTopCorners(Canvas c11) {
        Rect rect = this.childRect;
        int i11 = rect.top;
        float f7 = i11 - OVERLAP_MARGIN;
        float f11 = rect.left;
        float f12 = rect.right;
        float f13 = i11;
        Path path = this.islandSeparatorPath;
        path.reset();
        path.moveTo(f11, f7);
        float f14 = CORNER_RADIUS;
        path.lineTo(f11, f13 + f14);
        float f15 = CORNER_DIAMETER;
        path.arcTo(f11, f13, f11 + f15, f13 + f15, 180.0f, 90.0f, false);
        path.lineTo(f14 + f12, f13);
        path.arcTo(f12 - f15, f13, f12, f13 + f15, 270.0f, 90.0f, false);
        path.lineTo(f12, f7);
        path.close();
        c11.drawPath(this.islandSeparatorPath, this.paint);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Object a11 = C2942q.a(parent, "parent", state, "state");
        l lVar = a11 instanceof l ? (l) a11 : null;
        if (lVar == null) {
            return;
        }
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        c b11 = lVar.b(childAdapterPosition);
        c b12 = lVar.b(childAdapterPosition - 1);
        c b13 = lVar.b(childAdapterPosition + 1);
        boolean z11 = b11 instanceof OrderShipmentItemVO.PostingVO;
        if (z11) {
            if (b12 == null || !(b12 instanceof OrderShipmentItemVO.PostingVO)) {
                outRect.top = this.space12;
            }
            if (b13 == null || !(b13 instanceof OrderShipmentItemVO.PostingVO)) {
                outRect.bottom = this.space10;
            }
        }
        if ((b11 instanceof OrderShipmentItemVO.TitleVO) && ((b12 instanceof IslandSeparatorVO) || (b12 instanceof OrderShipmentItemVO.PostingVO))) {
            outRect.top += SEPARATOR_TOP_MARGIN;
        }
        if (z11 && (b13 instanceof OrderShipmentItemVO.TitleVO)) {
            outRect.bottom += SEPARATOR_BOTTOM_MARGIN;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDrawOver(@NotNull Canvas c11, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(c11, "c");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        Iterator<View> it = C5316f0.b(parent).iterator();
        while (true) {
            C5314e0 c5314e0 = (C5314e0) it;
            if (!c5314e0.hasNext()) {
                return;
            }
            View view = (View) c5314e0.next();
            Object adapter = parent.getAdapter();
            l lVar = adapter instanceof l ? (l) adapter : null;
            if (lVar == null) {
                return;
            }
            int childAdapterPosition = parent.getChildAdapterPosition(view);
            c b11 = lVar.b(childAdapterPosition - 1);
            c b12 = lVar.b(childAdapterPosition + 1);
            c b13 = lVar.b(childAdapterPosition);
            if (b13 != null) {
                parent.getDecoratedBoundsWithMargins(view, this.childRect);
                if ((b13 instanceof OrderShipmentItemVO.TitleVO) && (b11 instanceof OrderShipmentItemVO.PostingVO)) {
                    drawTopCorners(c11);
                }
                if ((b13 instanceof OrderShipmentItemVO.PostingVO) && (b12 instanceof OrderShipmentItemVO.TitleVO)) {
                    drawBottomCorners(c11);
                }
            }
        }
    }
}
