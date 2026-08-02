package ru.ozon.app.android.regulardraw.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import ru.ozon.app.android.regulardraw.R$id;
import ru.ozon.app.android.regulardraw.R$layout;
import ru.ozon.app.android.regulardraw.ui.currencyBadge.MorkovskCurrencyBadge;

/* loaded from: classes13.dex */
public final class AtomShadowButtonBinding implements a {

    @NonNull
    public final MorkovskCurrencyBadge badge;

    @NonNull
    public final AppCompatTextView buttonText;

    @NonNull
    private final View rootView;

    private AtomShadowButtonBinding(@NonNull View view, @NonNull MorkovskCurrencyBadge morkovskCurrencyBadge, @NonNull AppCompatTextView appCompatTextView) {
        this.rootView = view;
        this.badge = morkovskCurrencyBadge;
        this.buttonText = appCompatTextView;
    }

    @NonNull
    public static AtomShadowButtonBinding bind(@NonNull View view) {
        int i11 = R$id.badge;
        MorkovskCurrencyBadge morkovskCurrencyBadge = (MorkovskCurrencyBadge) C2548q.d(i11, view);
        if (morkovskCurrencyBadge != null) {
            i11 = R$id.buttonText;
            AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
            if (appCompatTextView != null) {
                return new AtomShadowButtonBinding(view, morkovskCurrencyBadge, appCompatTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static AtomShadowButtonBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.atom_shadow_button, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public View getConstraintLayout() {
        return this.rootView;
    }
}
