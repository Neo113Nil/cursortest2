package ru.ozon.app.android.cabinet.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import ru.ozon.app.android.cabinet.R$id;
import ru.ozon.uni.android.atom.badge.BadgeView;

/* loaded from: classes11.dex */
public final class WidgetSectionHeaderBinding implements a {

    @NonNull
    public final AppCompatTextView headerTv;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final BadgeView sectionHeaderBadge;

    private WidgetSectionHeaderBinding(@NonNull LinearLayout linearLayout, @NonNull AppCompatTextView appCompatTextView, @NonNull BadgeView badgeView) {
        this.rootView = linearLayout;
        this.headerTv = appCompatTextView;
        this.sectionHeaderBadge = badgeView;
    }

    @NonNull
    public static WidgetSectionHeaderBinding bind(@NonNull View view) {
        int i11 = R$id.headerTv;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
        if (appCompatTextView != null) {
            i11 = R$id.sectionHeaderBadge;
            BadgeView badgeView = (BadgeView) C2548q.d(i11, view);
            if (badgeView != null) {
                return new WidgetSectionHeaderBinding((LinearLayout) view, appCompatTextView, badgeView);
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
