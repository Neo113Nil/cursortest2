package ru.ozon.app.android.fresh.checkout.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.fresh.checkout.R$id;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.view.atoms.tabs.TabAtomView;

/* loaded from: classes12.dex */
public final class WidgetFreshPremiumPointsToggleBinding implements a {

    @NonNull
    public final ConstraintLayout premiumPointsToggleView;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TabAtomView switcherTab;

    @NonNull
    public final IconButtonV3View titleIcon;

    @NonNull
    public final TextAtomV2View titleTv;

    private WidgetFreshPremiumPointsToggleBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull TabAtomView tabAtomView, @NonNull IconButtonV3View iconButtonV3View, @NonNull TextAtomV2View textAtomV2View) {
        this.rootView = constraintLayout;
        this.premiumPointsToggleView = constraintLayout2;
        this.switcherTab = tabAtomView;
        this.titleIcon = iconButtonV3View;
        this.titleTv = textAtomV2View;
    }

    @NonNull
    public static WidgetFreshPremiumPointsToggleBinding bind(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i11 = R$id.switcherTab;
        TabAtomView tabAtomView = (TabAtomView) C2548q.d(i11, view);
        if (tabAtomView != null) {
            i11 = R$id.titleIcon;
            IconButtonV3View iconButtonV3View = (IconButtonV3View) C2548q.d(i11, view);
            if (iconButtonV3View != null) {
                i11 = R$id.titleTv;
                TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                if (textAtomV2View != null) {
                    return new WidgetFreshPremiumPointsToggleBinding(constraintLayout, constraintLayout, tabAtomView, iconButtonV3View, textAtomV2View);
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
