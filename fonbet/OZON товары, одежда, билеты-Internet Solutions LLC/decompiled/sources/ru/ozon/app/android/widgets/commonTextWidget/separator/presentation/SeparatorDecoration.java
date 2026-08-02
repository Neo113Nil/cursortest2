package ru.ozon.app.android.widgets.commonTextWidget.separator.presentation;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.widgets.commonTextWidget.separator.presentation.SeparatorView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/widgets/commonTextWidget/separator/presentation/SeparatorDecoration;", "Landroidx/recyclerview/widget/RecyclerView$n;", "<init>", "()V", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SeparatorDecoration extends RecyclerView.n {
    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        int i11;
        int i12;
        SeparatorVO boundData;
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        if (view instanceof SeparatorView) {
            SeparatorView separatorView = (SeparatorView) view;
            int i13 = -((int) SeparatorView.CornerRadii.m1591getTopimpl(separatorView.getCornerRadii()));
            int i14 = -((int) SeparatorView.CornerRadii.m1590getBottomimpl(separatorView.getCornerRadii()));
            RecyclerView.C childViewHolder = parent.getChildViewHolder(view);
            SeparatorViewHolder separatorViewHolder = childViewHolder instanceof SeparatorViewHolder ? (SeparatorViewHolder) childViewHolder : null;
            if (separatorViewHolder == null || (boundData = separatorViewHolder.getBoundData()) == null) {
                i11 = 0;
                i12 = 0;
            } else {
                int leftMargin = boundData.getLeftMargin();
                Context context = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                i11 = UiExtKt.toPx(leftMargin, context);
                int rightMargin = boundData.getRightMargin();
                Context context2 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                i12 = UiExtKt.toPx(rightMargin, context2);
            }
            outRect.set(i11, i13, i12, i14);
        }
    }
}
