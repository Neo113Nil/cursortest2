package ru.ozon.app.android.search.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import ru.ozon.app.android.search.R$id;
import ru.ozon.app.android.search.R$layout;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.multiButton.view.MultiButtonItemView;

/* loaded from: classes13.dex */
public final class MultiButtonViewVerticalBinding implements a {

    @NonNull
    public final MultiButtonItemView firstButton;

    @NonNull
    private final View rootView;

    @NonNull
    public final MultiButtonItemView secondButton;

    private MultiButtonViewVerticalBinding(@NonNull View view, @NonNull MultiButtonItemView multiButtonItemView, @NonNull MultiButtonItemView multiButtonItemView2) {
        this.rootView = view;
        this.firstButton = multiButtonItemView;
        this.secondButton = multiButtonItemView2;
    }

    @NonNull
    public static MultiButtonViewVerticalBinding bind(@NonNull View view) {
        int i11 = R$id.firstButton;
        MultiButtonItemView multiButtonItemView = (MultiButtonItemView) C2548q.d(i11, view);
        if (multiButtonItemView != null) {
            i11 = R$id.secondButton;
            MultiButtonItemView multiButtonItemView2 = (MultiButtonItemView) C2548q.d(i11, view);
            if (multiButtonItemView2 != null) {
                return new MultiButtonViewVerticalBinding(view, multiButtonItemView, multiButtonItemView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static MultiButtonViewVerticalBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.multi_button_view_vertical, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
