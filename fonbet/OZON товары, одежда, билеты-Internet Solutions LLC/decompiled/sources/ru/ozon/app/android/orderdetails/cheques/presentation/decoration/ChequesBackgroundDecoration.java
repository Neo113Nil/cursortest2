package ru.ozon.app.android.orderdetails.cheques.presentation.decoration;

import Pk0.h;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import m10.l;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.universalscreen.view.BackgroundColorAttr;
import ru.ozon.app.android.orderdetails.cheques.presentation.cheque.ChequeVO;
import ru.ozon.app.android.orderdetails.cheques.presentation.title.ChequesTitleVO;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/orderdetails/cheques/presentation/decoration/ChequesBackgroundDecoration;", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/graphics/Canvas;", "canvas", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "", "onDraw", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "Landroid/graphics/Rect;", "bgRect", "Landroid/graphics/Rect;", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ChequesBackgroundDecoration extends RecyclerView.n {

    @NotNull
    private Rect bgRect;

    @NotNull
    private final Paint paint;

    public ChequesBackgroundDecoration(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.bgRect = new Rect();
        Paint a11 = h.a(true);
        a11.setColor(BackgroundColorAttr.m676getimpl(BackgroundColorAttr.m673constructorimpl(R$attr.layerFloor1), context));
        this.paint = a11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDraw(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        for (View view : ViewGroupExtKt.children(parent)) {
            Object adapter = parent.getAdapter();
            Intrinsics.g(adapter, "null cannot be cast to non-null type ru.ozon.composer.ui.adapter.DecoratedAdapter");
            c b11 = ((l) adapter).b(parent.getChildAdapterPosition(view));
            if ((b11 instanceof ChequeVO) || (b11 instanceof ChequesTitleVO)) {
                Rect rect = this.bgRect;
                int left = parent.getLeft();
                int top = view.getTop();
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                int i11 = top - (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
                int right = parent.getRight();
                int bottom = view.getBottom();
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                rect.set(left, i11, right, bottom + (marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0));
                int save = canvas.save();
                try {
                    canvas.drawRect(this.bgRect, this.paint);
                } finally {
                    canvas.restoreToCount(save);
                }
            }
        }
    }
}
