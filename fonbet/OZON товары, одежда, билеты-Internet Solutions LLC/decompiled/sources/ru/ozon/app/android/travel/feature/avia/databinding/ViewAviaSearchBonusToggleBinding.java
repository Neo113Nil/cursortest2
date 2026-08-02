package ru.ozon.app.android.travel.feature.avia.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.switchmaterial.SwitchMaterial;
import ru.ozon.app.android.travel.feature.avia.R$id;
import ru.ozon.app.android.travel.feature.avia.R$layout;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes8.dex */
public final class ViewAviaSearchBonusToggleBinding implements a {

    @NonNull
    public final AppCompatImageView bonusPaymentIconAciv;

    @NonNull
    public final TextAtomView bonusPaymentSubtitleTav;

    @NonNull
    public final TextAtomView bonusPaymentTitleTav;

    @NonNull
    public final SwitchMaterial bonusPaymentToggleSm;

    @NonNull
    private final View rootView;

    private ViewAviaSearchBonusToggleBinding(@NonNull View view, @NonNull AppCompatImageView appCompatImageView, @NonNull TextAtomView textAtomView, @NonNull TextAtomView textAtomView2, @NonNull SwitchMaterial switchMaterial) {
        this.rootView = view;
        this.bonusPaymentIconAciv = appCompatImageView;
        this.bonusPaymentSubtitleTav = textAtomView;
        this.bonusPaymentTitleTav = textAtomView2;
        this.bonusPaymentToggleSm = switchMaterial;
    }

    @NonNull
    public static ViewAviaSearchBonusToggleBinding bind(@NonNull View view) {
        int i11 = R$id.bonusPaymentIconAciv;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
        if (appCompatImageView != null) {
            i11 = R$id.bonusPaymentSubtitleTav;
            TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
            if (textAtomView != null) {
                i11 = R$id.bonusPaymentTitleTav;
                TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                if (textAtomView2 != null) {
                    i11 = R$id.bonusPaymentToggleSm;
                    SwitchMaterial switchMaterial = (SwitchMaterial) C2548q.d(i11, view);
                    if (switchMaterial != null) {
                        return new ViewAviaSearchBonusToggleBinding(view, appCompatImageView, textAtomView, textAtomView2, switchMaterial);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ViewAviaSearchBonusToggleBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.view_avia_search_bonus_toggle, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
