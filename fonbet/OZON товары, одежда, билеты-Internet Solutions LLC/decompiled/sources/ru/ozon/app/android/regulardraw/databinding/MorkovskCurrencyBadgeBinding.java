package ru.ozon.app.android.regulardraw.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import ru.ozon.app.android.regulardraw.R$id;
import ru.ozon.app.android.regulardraw.R$layout;

/* loaded from: classes13.dex */
public final class MorkovskCurrencyBadgeBinding implements a {

    @NonNull
    public final View background;

    @NonNull
    public final AppCompatTextView currency;

    @NonNull
    public final AppCompatImageView rightIcon;

    @NonNull
    public final View rightIconCenter;

    @NonNull
    private final View rootView;

    private MorkovskCurrencyBadgeBinding(@NonNull View view, @NonNull View view2, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatImageView appCompatImageView, @NonNull View view3) {
        this.rootView = view;
        this.background = view2;
        this.currency = appCompatTextView;
        this.rightIcon = appCompatImageView;
        this.rightIconCenter = view3;
    }

    @NonNull
    public static MorkovskCurrencyBadgeBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.background;
        View d12 = C2548q.d(i11, view);
        if (d12 != null) {
            i11 = R$id.currency;
            AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
            if (appCompatTextView != null) {
                i11 = R$id.rightIcon;
                AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
                if (appCompatImageView != null && (d11 = C2548q.d((i11 = R$id.rightIconCenter), view)) != null) {
                    return new MorkovskCurrencyBadgeBinding(view, d12, appCompatTextView, appCompatImageView, d11);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static MorkovskCurrencyBadgeBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.morkovsk_currency_badge, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
