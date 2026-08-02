package ru.ozon.app.android.account.orders.barcode.presentation.decoration;

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
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.barcode.presentation.BarcodeAdapter;
import ru.ozon.app.android.storefront.navBar.NavBarDTO;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000 ,2\u00020\u0001:\u0001,B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\"\u0010&\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u001d\u001a\u0004\b'\u0010(\"\u0004\b)\u0010\u0005R\u0014\u0010+\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010(¨\u0006-"}, d2 = {"Lru/ozon/app/android/account/orders/barcode/presentation/decoration/BarcodeDecoration;", "Landroidx/recyclerview/widget/RecyclerView$n;", "", "isSelect", "<init>", "(Z)V", "Landroid/graphics/Canvas;", "c", "isFirst", "isExpanded", "", "drawTopCorners", "(Landroid/graphics/Canvas;ZZ)V", "drawBottomCorners", "(Landroid/graphics/Canvas;Z)V", "drawSideLines", "(Landroid/graphics/Canvas;)V", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "onDrawOver", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "Z", "childRect", "Landroid/graphics/Rect;", "Landroid/graphics/Path;", "islandSeparatorPath", "Landroid/graphics/Path;", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", NavBarDTO.NESTED_PLACEHOLDER_EXPANDED, "getExpanded", "()Z", "setExpanded", "getHasBottomSeparator", "hasBottomSeparator", "Companion", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BarcodeDecoration extends RecyclerView.n {
    private static final float CORNER_DIAMETER;
    private static final float CORNER_RADIUS;
    private static final int HORIZONTAL_MARGIN;
    private static final int OVERLAP_MARGIN;
    private static final int SEPARATOR_OFFSET;
    private boolean expanded;
    private final boolean isSelect;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private final Rect childRect = new Rect();

    @NotNull
    private final Path islandSeparatorPath = new Path();

    @NotNull
    private final Paint paint = h.a(true);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/account/orders/barcode/presentation/decoration/BarcodeDecoration$Companion;", "", "<init>", "()V", "", "OVERLAP_MARGIN", "I", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
        HORIZONTAL_MARGIN = ResourceExtKt.toPx(8);
        SEPARATOR_OFFSET = ResourceExtKt.toPx(8);
        OVERLAP_MARGIN = ResourceExtKt.toPx(1);
    }

    public BarcodeDecoration(boolean z11) {
        this.isSelect = z11;
    }

    private final void drawBottomCorners(Canvas c11, boolean isExpanded) {
        Rect rect = this.childRect;
        int i11 = rect.bottom;
        int i12 = SEPARATOR_OFFSET;
        float f7 = i11 - i12;
        float f11 = rect.left + (isExpanded ? i12 : 0);
        float f12 = rect.right;
        if (!isExpanded) {
            i12 = 0;
        }
        float f13 = f12 - i12;
        float f14 = i11;
        Path path = this.islandSeparatorPath;
        path.reset();
        path.moveTo(f11, f14);
        float f15 = CORNER_RADIUS;
        path.lineTo(f11, f7 - f15);
        float f16 = CORNER_DIAMETER;
        path.arcTo(f11, f7 - f16, f11 + f16, f7, 180.0f, -90.0f, false);
        path.lineTo(f13 - f15, f7);
        path.arcTo(f13 - f16, f7 - f16, f13, f7, 90.0f, -90.0f, false);
        path.lineTo(f13, f14);
        path.close();
        c11.drawPath(this.islandSeparatorPath, this.paint);
    }

    private final void drawSideLines(Canvas c11) {
        Rect rect = this.childRect;
        float f7 = rect.top;
        float f11 = rect.left;
        float f12 = rect.right;
        float f13 = rect.bottom;
        int i11 = SEPARATOR_OFFSET;
        c11.drawRect(f11, f7, f11 + i11, f13, this.paint);
        c11.drawRect(f12 - i11, f7, f12, f13, this.paint);
    }

    private final void drawTopCorners(Canvas c11, boolean isFirst, boolean isExpanded) {
        int i11 = this.childRect.top;
        float f7 = i11 - OVERLAP_MARGIN;
        int i12 = 0;
        float f11 = r1.left + (isExpanded ? SEPARATOR_OFFSET : 0);
        float f12 = r1.right - (isExpanded ? SEPARATOR_OFFSET : 0);
        float f13 = i11;
        if (isFirst && !this.isSelect) {
            i12 = SEPARATOR_OFFSET;
        }
        float f14 = f13 + i12;
        Path path = this.islandSeparatorPath;
        path.reset();
        path.moveTo(f11, f7);
        float f15 = CORNER_RADIUS;
        path.lineTo(f11, f14 + f15);
        float f16 = CORNER_DIAMETER;
        path.arcTo(f11, f14, f11 + f16, f14 + f16, 180.0f, 90.0f, false);
        path.lineTo(f15 + f12, f14);
        path.arcTo(f12 - f16, f14, f12, f14 + f16, 270.0f, 90.0f, false);
        path.lineTo(f12, f7);
        path.close();
        c11.drawPath(this.islandSeparatorPath, this.paint);
    }

    private final boolean getHasBottomSeparator() {
        return !this.isSelect || this.expanded;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        RecyclerView.g a11 = C2942q.a(parent, "parent", state, "state");
        BarcodeAdapter barcodeAdapter = a11 instanceof BarcodeAdapter ? (BarcodeAdapter) a11 : null;
        if (barcodeAdapter == null) {
            return;
        }
        outRect.top = (parent.getChildAdapterPosition(view) != 0 || this.isSelect) ? 0 : SEPARATOR_OFFSET;
        if (getHasBottomSeparator()) {
            outRect.bottom = SEPARATOR_OFFSET;
        }
        if (barcodeAdapter.getExpanded()) {
            int i11 = HORIZONTAL_MARGIN;
            outRect.left = i11;
            outRect.right = i11;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDrawOver(@NotNull Canvas c11, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(c11, "c");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        Paint paint = this.paint;
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        paint.setColor(ThemeExtKt.themeColor(context, R$attr.layerFloor0));
        RecyclerView.g adapter = parent.getAdapter();
        BarcodeAdapter barcodeAdapter = adapter instanceof BarcodeAdapter ? (BarcodeAdapter) adapter : null;
        boolean z11 = barcodeAdapter != null && barcodeAdapter.getExpanded();
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
            parent.getDecoratedBoundsWithMargins((View) next, this.childRect);
            drawTopCorners(c11, i11 == 0, z11);
            if (getHasBottomSeparator()) {
                drawBottomCorners(c11, z11);
            }
            if (z11) {
                drawSideLines(c11);
            }
            i11 = i12;
        }
    }

    public final void setExpanded(boolean z11) {
        this.expanded = z11;
    }
}
