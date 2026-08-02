package ru.ozon.app.android.checkoutcomposer.total.presentation.main.hints;

import T7.P;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.core.content.a;
import androidx.recyclerview.widget.RecyclerView;
import hk0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lk0.InterfaceC7968a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.deprecated.Annotation;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J'\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J/\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010!¨\u0006#"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/total/presentation/main/hints/AdditionalHintsVDecorator;", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "", "childIndex", "Landroid/graphics/Rect;", "childBound", "", "getDrawingRect", "(Landroidx/recyclerview/widget/RecyclerView;ILandroid/graphics/Rect;)V", "Landroid/graphics/Canvas;", "canvas", "bounds", "drawTopLine", "(Landroid/graphics/Canvas;Landroid/graphics/Rect;)V", "drawBottomLine", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "onDrawOver", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "outRect", "Landroid/view/View;", "view", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "Landroid/graphics/Rect;", "Companion", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AdditionalHintsVDecorator extends RecyclerView.n {

    @NotNull
    private final Rect childBound;

    @NotNull
    private final Paint paint;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int dp1 = UiExtKt.toPx(1);
    private static final int dp3 = UiExtKt.toPx(3);
    private static final int dp16 = UiExtKt.toPx(16);
    private static final int dp15 = UiExtKt.toPx(15);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/total/presentation/main/hints/AdditionalHintsVDecorator$Companion;", "", "<init>", "()V", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public AdditionalHintsVDecorator(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint(1);
        paint.setColor(a.getColor(context, R$color.graphic_neutral));
        paint.setStrokeWidth(dp1);
        this.paint = paint;
        this.childBound = new Rect();
    }

    private final void drawBottomLine(Canvas canvas, Rect bounds) {
        float f7 = bounds.left;
        int i11 = bounds.bottom;
        int i12 = dp16;
        canvas.drawLine(f7, i11 + i12, bounds.right, i11 + i12, this.paint);
    }

    private final void drawTopLine(Canvas canvas, Rect bounds) {
        float f7 = bounds.left;
        int i11 = bounds.top;
        int i12 = dp15;
        canvas.drawLine(f7, i11 - i12, bounds.right, i11 - i12, this.paint);
    }

    private final void getDrawingRect(RecyclerView parent, int childIndex, Rect childBound) {
        View childAt = parent.getChildAt(childIndex);
        if (childAt == null) {
            return;
        }
        childAt.getDrawingRect(childBound);
        parent.offsetDescendantRectToMyCoords(childAt, childBound);
        childBound.left = 0;
        childBound.right = parent.getRight();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        InterfaceC7968a item;
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        RecyclerView.C e11 = P.e(parent, "parent", state, "state", view);
        d dVar = e11 instanceof d ? (d) e11 : null;
        if (dVar == null || (item = dVar.getItem()) == null) {
            return;
        }
        if (!(item instanceof Annotation)) {
            int i11 = dp16;
            outRect.top = i11;
            outRect.bottom = i11;
        } else {
            int i12 = dp16;
            outRect.left = i12;
            int i13 = dp3;
            outRect.top = i13;
            outRect.right = i12;
            outRect.bottom = i13;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDrawOver(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        if (parent.getChildCount() == 0) {
            return;
        }
        int childCount = parent.getChildCount() - 1;
        getDrawingRect(parent, 0, this.childBound);
        drawTopLine(canvas, this.childBound);
        for (int i11 = 0; i11 < childCount; i11++) {
            getDrawingRect(parent, i11, this.childBound);
            drawBottomLine(canvas, this.childBound);
        }
    }
}
