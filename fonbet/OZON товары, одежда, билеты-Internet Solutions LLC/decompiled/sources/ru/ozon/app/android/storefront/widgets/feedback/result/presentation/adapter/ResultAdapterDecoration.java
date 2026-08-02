package ru.ozon.app.android.storefront.widgets.feedback.result.presentation.adapter;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.feedback.result.presentation.adapter.holders.ResultFullImageViewHolder;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/storefront/widgets/feedback/result/presentation/adapter/ResultAdapterDecoration;", "Landroidx/recyclerview/widget/RecyclerView$n;", "<init>", "()V", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ResultAdapterDecoration extends RecyclerView.n {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int headerTopMargin = UiExtKt.toPx(44);
    private static final int betweenMargin = UiExtKt.toPx(12);
    private static final int lastBottomMargin = UiExtKt.toPx(24);
    private static final int headerBottomMargin = UiExtKt.toPx(36);
    private static final int textHorizontalMargin = UiExtKt.toPx(36);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/storefront/widgets/feedback/result/presentation/adapter/ResultAdapterDecoration$Companion;", "", "<init>", "()V", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        if (parent.findContainingViewHolder(view) instanceof ResultFullImageViewHolder) {
            return;
        }
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        if (childAdapterPosition == 0) {
            outRect.top = headerTopMargin;
            int i11 = textHorizontalMargin;
            outRect.left = i11;
            outRect.right = i11;
            return;
        }
        if (childAdapterPosition == 1) {
            outRect.top = betweenMargin;
            outRect.bottom = headerBottomMargin;
            int i12 = textHorizontalMargin;
            outRect.left = i12;
            outRect.right = i12;
            return;
        }
        RecyclerView.g adapter = parent.getAdapter();
        if (childAdapterPosition == (adapter != null ? adapter.getCardsCount() : 0) - 1) {
            outRect.bottom = lastBottomMargin;
        } else {
            outRect.bottom = betweenMargin;
        }
    }
}
