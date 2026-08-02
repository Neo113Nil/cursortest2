package ru.ozon.app.android.search.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.search.R$id;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.icon.IconView;

/* loaded from: classes13.dex */
public final class ItemSuggestionsBadgeTitleSubtitleCellBinding implements a {

    @NonNull
    public final BadgeView badgeView;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final ConstraintLayout suggestionBadgeContainer;

    @NonNull
    public final AppCompatTextView suggestionBadgeSubtitle;

    @NonNull
    public final AppCompatTextView suggestionBadgeTitle;

    @NonNull
    public final AppCompatImageButton suggestionDisclosure;

    @NonNull
    public final IconView suggestionIcon;

    @NonNull
    public final View suggestionTitleSeparator;

    private ItemSuggestionsBadgeTitleSubtitleCellBinding(@NonNull ConstraintLayout constraintLayout, @NonNull BadgeView badgeView, @NonNull ConstraintLayout constraintLayout2, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatTextView appCompatTextView2, @NonNull AppCompatImageButton appCompatImageButton, @NonNull IconView iconView, @NonNull View view) {
        this.rootView = constraintLayout;
        this.badgeView = badgeView;
        this.suggestionBadgeContainer = constraintLayout2;
        this.suggestionBadgeSubtitle = appCompatTextView;
        this.suggestionBadgeTitle = appCompatTextView2;
        this.suggestionDisclosure = appCompatImageButton;
        this.suggestionIcon = iconView;
        this.suggestionTitleSeparator = view;
    }

    @NonNull
    public static ItemSuggestionsBadgeTitleSubtitleCellBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.badgeView;
        BadgeView badgeView = (BadgeView) C2548q.d(i11, view);
        if (badgeView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i11 = R$id.suggestion_badge_subtitle;
            AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
            if (appCompatTextView != null) {
                i11 = R$id.suggestion_badge_title;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) C2548q.d(i11, view);
                if (appCompatTextView2 != null) {
                    i11 = R$id.suggestion_disclosure;
                    AppCompatImageButton appCompatImageButton = (AppCompatImageButton) C2548q.d(i11, view);
                    if (appCompatImageButton != null) {
                        i11 = R$id.suggestion_icon;
                        IconView iconView = (IconView) C2548q.d(i11, view);
                        if (iconView != null && (d11 = C2548q.d((i11 = R$id.suggestion_title_separator), view)) != null) {
                            return new ItemSuggestionsBadgeTitleSubtitleCellBinding(constraintLayout, badgeView, constraintLayout, appCompatTextView, appCompatTextView2, appCompatImageButton, iconView, d11);
                        }
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
