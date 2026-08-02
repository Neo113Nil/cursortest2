package ru.ozon.app.android.uikit.view.discount;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.a;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/uikit/view/discount/ProgressiveDiscountViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Landroid/view/View;", "containerView", "<init>", "(Landroid/view/View;)V", "Lru/ozon/app/android/uikit/view/discount/ProgressiveDiscountItemVO;", "item", "", "bind", "(Lru/ozon/app/android/uikit/view/discount/ProgressiveDiscountItemVO;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProgressiveDiscountViewHolder extends RecyclerView.C {

    @NotNull
    private final View containerView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressiveDiscountViewHolder(@NotNull View containerView) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.containerView = containerView;
    }

    public final void bind(@NotNull ProgressiveDiscountItemVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        View view = this.itemView;
        Intrinsics.g(view, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatTextView");
        AppCompatTextView appCompatTextView = (AppCompatTextView) view;
        appCompatTextView.setBackground(item.getBackground());
        appCompatTextView.setText(item.getText());
        appCompatTextView.setTextAppearance(item.getTextAppearance());
        appCompatTextView.setTextColor(a.getColor(appCompatTextView.getContext(), item.getTextColor()));
    }
}
