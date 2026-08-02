package ru.ozon.app.android.fresh.feature.b2b.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.fresh.feature.b2b.R$id;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.view.atoms.avatar.AvatarView;

/* loaded from: classes12.dex */
public final class WidgetAccountListMobileItemBinding implements a {

    @NonNull
    public final AvatarView avatarSa;

    @NonNull
    public final BadgeView counterBadge;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final View selector;

    @NonNull
    public final TextView subTitleTv;

    @NonNull
    public final TextView titleTv;

    private WidgetAccountListMobileItemBinding(@NonNull ConstraintLayout constraintLayout, @NonNull AvatarView avatarView, @NonNull BadgeView badgeView, @NonNull View view, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = constraintLayout;
        this.avatarSa = avatarView;
        this.counterBadge = badgeView;
        this.selector = view;
        this.subTitleTv = textView;
        this.titleTv = textView2;
    }

    @NonNull
    public static WidgetAccountListMobileItemBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.avatarSa;
        AvatarView avatarView = (AvatarView) C2548q.d(i11, view);
        if (avatarView != null) {
            i11 = R$id.counterBadge;
            BadgeView badgeView = (BadgeView) C2548q.d(i11, view);
            if (badgeView != null && (d11 = C2548q.d((i11 = R$id.selector), view)) != null) {
                i11 = R$id.subTitleTv;
                TextView textView = (TextView) C2548q.d(i11, view);
                if (textView != null) {
                    i11 = R$id.titleTv;
                    TextView textView2 = (TextView) C2548q.d(i11, view);
                    if (textView2 != null) {
                        return new WidgetAccountListMobileItemBinding((ConstraintLayout) view, avatarView, badgeView, d11, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
