package ru.ozon.app.android.regulardraw.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.regulardraw.R$id;
import ru.ozon.app.android.regulardraw.R$layout;
import ru.ozon.app.android.regulardraw.ui.currencyBadge.MorkovskCurrencyBadge;
import ru.ozon.app.android.regulardraw.widgets.navbar.ShadowImageButton;

/* loaded from: classes13.dex */
public final class WidgetMorkovskNavbarBinding implements a {

    @NonNull
    public final Barrier buttonsBarrier;

    @NonNull
    public final MorkovskCurrencyBadge currencyBadge;

    @NonNull
    public final ShadowImageButton menuButton;

    @NonNull
    public final ConstraintLayout navbarContainer;

    @NonNull
    public final ShadowImageButton rightButton;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final View statusBarSpace;

    private WidgetMorkovskNavbarBinding(@NonNull LinearLayout linearLayout, @NonNull Barrier barrier, @NonNull MorkovskCurrencyBadge morkovskCurrencyBadge, @NonNull ShadowImageButton shadowImageButton, @NonNull ConstraintLayout constraintLayout, @NonNull ShadowImageButton shadowImageButton2, @NonNull View view) {
        this.rootView = linearLayout;
        this.buttonsBarrier = barrier;
        this.currencyBadge = morkovskCurrencyBadge;
        this.menuButton = shadowImageButton;
        this.navbarContainer = constraintLayout;
        this.rightButton = shadowImageButton2;
        this.statusBarSpace = view;
    }

    @NonNull
    public static WidgetMorkovskNavbarBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.buttonsBarrier;
        Barrier barrier = (Barrier) C2548q.d(i11, view);
        if (barrier != null) {
            i11 = R$id.currencyBadge;
            MorkovskCurrencyBadge morkovskCurrencyBadge = (MorkovskCurrencyBadge) C2548q.d(i11, view);
            if (morkovskCurrencyBadge != null) {
                i11 = R$id.menuButton;
                ShadowImageButton shadowImageButton = (ShadowImageButton) C2548q.d(i11, view);
                if (shadowImageButton != null) {
                    i11 = R$id.navbarContainer;
                    ConstraintLayout constraintLayout = (ConstraintLayout) C2548q.d(i11, view);
                    if (constraintLayout != null) {
                        i11 = R$id.rightButton;
                        ShadowImageButton shadowImageButton2 = (ShadowImageButton) C2548q.d(i11, view);
                        if (shadowImageButton2 != null && (d11 = C2548q.d((i11 = R$id.statusBarSpace), view)) != null) {
                            return new WidgetMorkovskNavbarBinding((LinearLayout) view, barrier, morkovskCurrencyBadge, shadowImageButton, constraintLayout, shadowImageButton2, d11);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static WidgetMorkovskNavbarBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.widget_morkovsk_navbar, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
