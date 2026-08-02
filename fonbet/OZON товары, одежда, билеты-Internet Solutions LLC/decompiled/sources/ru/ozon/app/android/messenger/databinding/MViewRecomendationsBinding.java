package ru.ozon.app.android.messenger.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.messenger.R$id;
import ru.ozon.app.android.messenger.R$layout;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes12.dex */
public final class MViewRecomendationsBinding implements a {

    @NonNull
    public final LinearLayoutCompat productContainer;

    @NonNull
    public final BadgeView recommendationBadgeButton;

    @NonNull
    public final TextAtomV2View recommendationTitle;

    @NonNull
    public final ConstraintLayout recommendationsContainer;

    @NonNull
    private final ConstraintLayout rootView;

    private MViewRecomendationsBinding(@NonNull ConstraintLayout constraintLayout, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull BadgeView badgeView, @NonNull TextAtomV2View textAtomV2View, @NonNull ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.productContainer = linearLayoutCompat;
        this.recommendationBadgeButton = badgeView;
        this.recommendationTitle = textAtomV2View;
        this.recommendationsContainer = constraintLayout2;
    }

    @NonNull
    public static MViewRecomendationsBinding bind(@NonNull View view) {
        int i11 = R$id.productContainer;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) C2548q.d(i11, view);
        if (linearLayoutCompat != null) {
            i11 = R$id.recommendationBadgeButton;
            BadgeView badgeView = (BadgeView) C2548q.d(i11, view);
            if (badgeView != null) {
                i11 = R$id.recommendationTitle;
                TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                if (textAtomV2View != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    return new MViewRecomendationsBinding(constraintLayout, linearLayoutCompat, badgeView, textAtomV2View, constraintLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static MViewRecomendationsBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.m_view_recomendations, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
