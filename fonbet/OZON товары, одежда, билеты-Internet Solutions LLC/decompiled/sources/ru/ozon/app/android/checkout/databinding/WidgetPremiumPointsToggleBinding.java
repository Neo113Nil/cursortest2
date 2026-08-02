package ru.ozon.app.android.checkout.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.checkout.R$id;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.LargeIconButtonView;
import ru.ozon.uni.android.uikit.view.atoms.tabs.TabAtomView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes11.dex */
public final class WidgetPremiumPointsToggleBinding implements a {

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TabAtomView switcherTab;

    @NonNull
    public final LargeIconButtonView titleIcon;

    @NonNull
    public final TextAtomView titleTv;

    private WidgetPremiumPointsToggleBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TabAtomView tabAtomView, @NonNull LargeIconButtonView largeIconButtonView, @NonNull TextAtomView textAtomView) {
        this.rootView = constraintLayout;
        this.switcherTab = tabAtomView;
        this.titleIcon = largeIconButtonView;
        this.titleTv = textAtomView;
    }

    @NonNull
    public static WidgetPremiumPointsToggleBinding bind(@NonNull View view) {
        int i11 = R$id.switcherTab;
        TabAtomView tabAtomView = (TabAtomView) C2548q.d(i11, view);
        if (tabAtomView != null) {
            i11 = R$id.titleIcon;
            LargeIconButtonView largeIconButtonView = (LargeIconButtonView) C2548q.d(i11, view);
            if (largeIconButtonView != null) {
                i11 = R$id.titleTv;
                TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                if (textAtomView != null) {
                    return new WidgetPremiumPointsToggleBinding((ConstraintLayout) view, tabAtomView, largeIconButtonView, textAtomView);
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
