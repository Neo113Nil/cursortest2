package ru.ozon.app.android.geo.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.geo.R$id;
import ru.ozon.app.android.geo.R$layout;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;

/* loaded from: classes12.dex */
public final class PopupPvzOnboardingBinding implements a {

    @NonNull
    public final IconButtonV3View btnClose;

    @NonNull
    public final CardView cardContainer;

    @NonNull
    public final ConstraintLayout popPvzOnboarding;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextAtomV2View tvTitle;

    private PopupPvzOnboardingBinding(@NonNull ConstraintLayout constraintLayout, @NonNull IconButtonV3View iconButtonV3View, @NonNull CardView cardView, @NonNull ConstraintLayout constraintLayout2, @NonNull TextAtomV2View textAtomV2View) {
        this.rootView = constraintLayout;
        this.btnClose = iconButtonV3View;
        this.cardContainer = cardView;
        this.popPvzOnboarding = constraintLayout2;
        this.tvTitle = textAtomV2View;
    }

    @NonNull
    public static PopupPvzOnboardingBinding bind(@NonNull View view) {
        int i11 = R$id.btnClose;
        IconButtonV3View iconButtonV3View = (IconButtonV3View) C2548q.d(i11, view);
        if (iconButtonV3View != null) {
            i11 = R$id.cardContainer;
            CardView cardView = (CardView) C2548q.d(i11, view);
            if (cardView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i11 = R$id.tvTitle;
                TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                if (textAtomV2View != null) {
                    return new PopupPvzOnboardingBinding(constraintLayout, iconButtonV3View, cardView, constraintLayout, textAtomV2View);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static PopupPvzOnboardingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static PopupPvzOnboardingBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.popup_pvz_onboarding, viewGroup, false);
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
