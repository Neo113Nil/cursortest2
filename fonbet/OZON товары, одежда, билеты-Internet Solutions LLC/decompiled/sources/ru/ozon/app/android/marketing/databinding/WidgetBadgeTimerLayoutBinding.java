package ru.ozon.app.android.marketing.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.marketing.R$id;
import ru.ozon.uni.android.atom.badge.BadgeView;

/* loaded from: classes12.dex */
public final class WidgetBadgeTimerLayoutBinding implements a {

    @NonNull
    public final BadgeView badgeBV;

    @NonNull
    public final BadgeView countdownTv;

    @NonNull
    private final LinearLayout rootView;

    private WidgetBadgeTimerLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull BadgeView badgeView, @NonNull BadgeView badgeView2) {
        this.rootView = linearLayout;
        this.badgeBV = badgeView;
        this.countdownTv = badgeView2;
    }

    @NonNull
    public static WidgetBadgeTimerLayoutBinding bind(@NonNull View view) {
        int i11 = R$id.badgeBV;
        BadgeView badgeView = (BadgeView) C2548q.d(i11, view);
        if (badgeView != null) {
            i11 = R$id.countdownTv;
            BadgeView badgeView2 = (BadgeView) C2548q.d(i11, view);
            if (badgeView2 != null) {
                return new WidgetBadgeTimerLayoutBinding((LinearLayout) view, badgeView, badgeView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public LinearLayout getConstraintLayout() {
        return this.rootView;
    }
}
