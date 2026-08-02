package ru.ozon.app.android.travel.feature.avia.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import ru.ozon.app.android.travel.feature.avia.R$id;
import ru.ozon.app.android.travel.feature.avia.R$layout;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes8.dex */
public final class ViewReturnPolicyBinding implements a {

    @NonNull
    public final LinearLayout returnPolicyAccentPlaqLL;

    @NonNull
    public final AppCompatImageView returnPolicyIconTV;

    @NonNull
    public final LinearLayout returnPolicyPolicyTextLL;

    @NonNull
    public final TextAtomView returnPolicyRouteTV;

    @NonNull
    private final View rootView;

    private ViewReturnPolicyBinding(@NonNull View view, @NonNull LinearLayout linearLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull LinearLayout linearLayout2, @NonNull TextAtomView textAtomView) {
        this.rootView = view;
        this.returnPolicyAccentPlaqLL = linearLayout;
        this.returnPolicyIconTV = appCompatImageView;
        this.returnPolicyPolicyTextLL = linearLayout2;
        this.returnPolicyRouteTV = textAtomView;
    }

    @NonNull
    public static ViewReturnPolicyBinding bind(@NonNull View view) {
        int i11 = R$id.returnPolicyAccentPlaqLL;
        LinearLayout linearLayout = (LinearLayout) C2548q.d(i11, view);
        if (linearLayout != null) {
            i11 = R$id.returnPolicyIconTV;
            AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
            if (appCompatImageView != null) {
                i11 = R$id.returnPolicyPolicyTextLL;
                LinearLayout linearLayout2 = (LinearLayout) C2548q.d(i11, view);
                if (linearLayout2 != null) {
                    i11 = R$id.returnPolicyRouteTV;
                    TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                    if (textAtomView != null) {
                        return new ViewReturnPolicyBinding(view, linearLayout, appCompatImageView, linearLayout2, textAtomView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ViewReturnPolicyBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.view_return_policy, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
