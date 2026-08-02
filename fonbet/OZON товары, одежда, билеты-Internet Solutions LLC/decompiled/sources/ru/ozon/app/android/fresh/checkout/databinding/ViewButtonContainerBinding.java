package ru.ozon.app.android.fresh.checkout.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import ru.ozon.app.android.fresh.checkout.R$id;
import ru.ozon.app.android.fresh.checkout.R$layout;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;

/* loaded from: classes12.dex */
public final class ViewButtonContainerBinding implements a {

    @NonNull
    public final ButtonV3View button;

    @NonNull
    private final View rootView;

    private ViewButtonContainerBinding(@NonNull View view, @NonNull ButtonV3View buttonV3View) {
        this.rootView = view;
        this.button = buttonV3View;
    }

    @NonNull
    public static ViewButtonContainerBinding bind(@NonNull View view) {
        int i11 = R$id.button;
        ButtonV3View buttonV3View = (ButtonV3View) C2548q.d(i11, view);
        if (buttonV3View != null) {
            return new ViewButtonContainerBinding(view, buttonV3View);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ViewButtonContainerBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.view_button_container, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public View getConstraintLayout() {
        return this.rootView;
    }
}
