package ru.ozon.app.android.commonwidgets.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.commonwidgets.R$id;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.atoms.af.layout.HorizontalFlexAtomsLayout;

/* loaded from: classes11.dex */
public final class WidgetResultsHeaderBinding implements a {

    @NonNull
    public final HorizontalFlexAtomsLayout multiplyFlexboxBages;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final SmallIconButtonView sharingVAL;

    @NonNull
    public final BadgeView singleHeaderBadge;

    @NonNull
    public final AppCompatTextView subtitleTv;

    @NonNull
    public final AppCompatTextView titleTv;

    private WidgetResultsHeaderBinding(@NonNull ConstraintLayout constraintLayout, @NonNull HorizontalFlexAtomsLayout horizontalFlexAtomsLayout, @NonNull SmallIconButtonView smallIconButtonView, @NonNull BadgeView badgeView, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatTextView appCompatTextView2) {
        this.rootView = constraintLayout;
        this.multiplyFlexboxBages = horizontalFlexAtomsLayout;
        this.sharingVAL = smallIconButtonView;
        this.singleHeaderBadge = badgeView;
        this.subtitleTv = appCompatTextView;
        this.titleTv = appCompatTextView2;
    }

    @NonNull
    public static WidgetResultsHeaderBinding bind(@NonNull View view) {
        int i11 = R$id.multiplyFlexboxBages;
        HorizontalFlexAtomsLayout horizontalFlexAtomsLayout = (HorizontalFlexAtomsLayout) C2548q.d(i11, view);
        if (horizontalFlexAtomsLayout != null) {
            i11 = R$id.sharingVAL;
            SmallIconButtonView smallIconButtonView = (SmallIconButtonView) C2548q.d(i11, view);
            if (smallIconButtonView != null) {
                i11 = R$id.singleHeaderBadge;
                BadgeView badgeView = (BadgeView) C2548q.d(i11, view);
                if (badgeView != null) {
                    i11 = R$id.subtitleTv;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
                    if (appCompatTextView != null) {
                        i11 = R$id.titleTv;
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) C2548q.d(i11, view);
                        if (appCompatTextView2 != null) {
                            return new WidgetResultsHeaderBinding((ConstraintLayout) view, horizontalFlexAtomsLayout, smallIconButtonView, badgeView, appCompatTextView, appCompatTextView2);
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
