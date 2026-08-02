package ru.ozon.app.android.orderdetails.customsfees.core;

import E0.C2942q;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import m10.l;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.orderdetails.customsfees.presentation.FeeVO;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J3\u0010\r\u001a\u00020\f*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0010\u001a\u00020\f*\u00020\u00062\u0006\u0010\b\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0012\u001a\u00020\f*\u00020\u00062\u0006\u0010\b\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J/\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010+¨\u0006-"}, d2 = {"Lru/ozon/app/android/orderdetails/customsfees/core/FeeDecorator;", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/graphics/Canvas;", "", "left", "top", "right", "bottom", "", "drawSeparator", "(Landroid/graphics/Canvas;IIII)V", "", "drawBottomCorners", "(Landroid/graphics/Canvas;FFF)V", "drawTopCorners", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "canvas", "onDrawOver", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "offset", "I", "rect", "Landroid/graphics/Rect;", "Landroid/graphics/Path;", "path", "Landroid/graphics/Path;", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "radius", "F", "diameter", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FeeDecorator extends RecyclerView.n {
    private final float diameter;
    private final int offset;

    @NotNull
    private final Paint paint;

    @NotNull
    private final Path path;
    private final float radius;

    @NotNull
    private final Rect rect;

    public FeeDecorator(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.offset = UiExtKt.toPx(8, context);
        this.rect = new Rect();
        this.path = new Path();
        Paint paint = new Paint(1);
        paint.setColor(ThemeExtKt.themeColor(context, R$attr.layerFloor0));
        this.paint = paint;
        float pxF = UiExtKt.toPxF(24);
        this.radius = pxF;
        this.diameter = pxF * 2;
    }

    private final void drawBottomCorners(Canvas canvas, float f7, float f11, float f12) {
        Path path = this.path;
        path.reset();
        path.moveTo(this.radius + f7, f12);
        float f13 = this.diameter;
        path.arcTo(f7, f12 - f13, f7 + f13, f12, 90.0f, 90.0f, false);
        path.lineTo(f7, f12);
        path.lineTo(f11 - this.radius, f12);
        float f14 = this.diameter;
        path.arcTo(f11 - f14, f12 - f14, f11, f12, 90.0f, -90.0f, false);
        path.lineTo(f11, f12);
        path.close();
        canvas.drawPath(this.path, this.paint);
    }

    private final void drawSeparator(Canvas canvas, int i11, int i12, int i13, int i14) {
        Rect rect = this.rect;
        rect.left = i11;
        rect.top = i12;
        rect.right = i13;
        rect.bottom = i14;
        canvas.drawRect(rect, this.paint);
    }

    private final void drawTopCorners(Canvas canvas, float f7, float f11, float f12) {
        Path path = this.path;
        path.reset();
        path.moveTo(this.radius + f7, f12);
        float f13 = this.diameter;
        path.arcTo(f7, f12, f7 + f13, f12 + f13, 270.0f, -90.0f, false);
        path.lineTo(f7, f12);
        path.lineTo(f11 - this.radius, f12);
        float f14 = this.diameter;
        path.arcTo(f11 - f14, f12, f11, f12 + f14, 270.0f, 90.0f, false);
        path.lineTo(f11, f12);
        path.close();
        canvas.drawPath(this.path, this.paint);
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
        if ((b11 instanceof FeeVO) && (b12 instanceof FeeVO)) {
            outRect.top = this.offset;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDrawOver(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Canvas canvas2;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Object a11 = C2942q.a(parent, "parent", state, "state");
        l lVar = a11 instanceof l ? (l) a11 : null;
        if (lVar != null) {
            int childCount = parent.getChildCount();
            int i11 = 0;
            while (i11 < childCount) {
                c b11 = lVar.b(i11);
                int i12 = i11 - 1;
                c b12 = lVar.b(i12);
                if ((b11 instanceof FeeVO) && (b12 instanceof FeeVO)) {
                    View childAt = parent.getChildAt(i11);
                    canvas2 = canvas;
                    drawSeparator(canvas2, childAt.getLeft(), parent.getChildAt(i12).getBottom(), childAt.getRight(), childAt.getTop());
                    drawBottomCorners(canvas2, r3.getLeft(), r3.getRight(), r3.getBottom());
                    drawTopCorners(canvas2, childAt.getLeft(), childAt.getRight(), childAt.getTop());
                } else {
                    canvas2 = canvas;
                }
                i11++;
                canvas = canvas2;
            }
        }
    }
}
