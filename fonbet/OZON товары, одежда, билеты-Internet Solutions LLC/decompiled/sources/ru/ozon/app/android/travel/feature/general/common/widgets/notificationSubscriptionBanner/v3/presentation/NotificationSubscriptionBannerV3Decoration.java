package ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v3.presentation;

import T7.P;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import m10.l;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v3.presentation.NotificationSubscriptionBannerV3VI;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3Decoration;", "Landroidx/recyclerview/widget/RecyclerView$n;", "<init>", "()V", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NotificationSubscriptionBannerV3Decoration extends RecyclerView.n {
    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        int childAdapterPosition;
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        if (!(P.e(parent, "parent", state, "state", view) instanceof NotificationSubscriptionBannerV3WidgetViewHolder) || (childAdapterPosition = parent.getChildAdapterPosition(view)) == -1) {
            return;
        }
        Object adapter = parent.getAdapter();
        l lVar = adapter instanceof l ? (l) adapter : null;
        if (lVar == null) {
            return;
        }
        c b11 = lVar.b(childAdapterPosition);
        NotificationSubscriptionBannerV3VI notificationSubscriptionBannerV3VI = b11 instanceof NotificationSubscriptionBannerV3VI ? (NotificationSubscriptionBannerV3VI) b11 : null;
        if (notificationSubscriptionBannerV3VI == null) {
            return;
        }
        NotificationSubscriptionBannerV3VI.WidgetContent.Margins layoutMargins = notificationSubscriptionBannerV3VI.getContent().getDecoration().getLayoutMargins();
        outRect.set(layoutMargins.getHorizontal(), layoutMargins.getTop(), layoutMargins.getHorizontal(), layoutMargins.getBottom());
    }
}
