package ru.ozon.app.android.messenger.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.flexbox.FlexboxLayout;
import ru.ozon.app.android.messenger.R$id;
import ru.ozon.app.android.messenger.R$layout;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes12.dex */
public final class MBlockRecomendationsBinding implements a {

    @NonNull
    public final LinearLayoutCompat productContainer;

    @NonNull
    public final BadgeView recommendationBadgeButton;

    @NonNull
    public final FlexboxLayout recommendationBadgeList;

    @NonNull
    public final TextAtomV2View recommendationSubTitle;

    @NonNull
    public final TextAtomV2View recommendationTitle;

    @NonNull
    public final ConstraintLayout recommendationsContainer;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView sendTimeTv;

    private MBlockRecomendationsBinding(@NonNull ConstraintLayout constraintLayout, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull BadgeView badgeView, @NonNull FlexboxLayout flexboxLayout, @NonNull TextAtomV2View textAtomV2View, @NonNull TextAtomV2View textAtomV2View2, @NonNull ConstraintLayout constraintLayout2, @NonNull TextView textView) {
        this.rootView = constraintLayout;
        this.productContainer = linearLayoutCompat;
        this.recommendationBadgeButton = badgeView;
        this.recommendationBadgeList = flexboxLayout;
        this.recommendationSubTitle = textAtomV2View;
        this.recommendationTitle = textAtomV2View2;
        this.recommendationsContainer = constraintLayout2;
        this.sendTimeTv = textView;
    }

    @NonNull
    public static MBlockRecomendationsBinding bind(@NonNull View view) {
        int i11 = R$id.productContainer;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) C2548q.d(i11, view);
        if (linearLayoutCompat != null) {
            i11 = R$id.recommendationBadgeButton;
            BadgeView badgeView = (BadgeView) C2548q.d(i11, view);
            if (badgeView != null) {
                i11 = R$id.recommendationBadgeList;
                FlexboxLayout flexboxLayout = (FlexboxLayout) C2548q.d(i11, view);
                if (flexboxLayout != null) {
                    i11 = R$id.recommendationSubTitle;
                    TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                    if (textAtomV2View != null) {
                        i11 = R$id.recommendationTitle;
                        TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                        if (textAtomV2View2 != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) view;
                            i11 = R$id.sendTimeTv;
                            TextView textView = (TextView) C2548q.d(i11, view);
                            if (textView != null) {
                                return new MBlockRecomendationsBinding(constraintLayout, linearLayoutCompat, badgeView, flexboxLayout, textAtomV2View, textAtomV2View2, constraintLayout, textView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static MBlockRecomendationsBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.m_block_recomendations, viewGroup, false);
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
