package ru.ozon.app.android.fresh.geo.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.fresh.geo.R$id;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;

/* loaded from: classes12.dex */
public final class WidgetAddressPopupButtonAtomBinding implements a {

    @NonNull
    public final LargeButtonView button;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final View separator;

    private WidgetAddressPopupButtonAtomBinding(@NonNull LinearLayout linearLayout, @NonNull LargeButtonView largeButtonView, @NonNull View view) {
        this.rootView = linearLayout;
        this.button = largeButtonView;
        this.separator = view;
    }

    @NonNull
    public static WidgetAddressPopupButtonAtomBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.button;
        LargeButtonView largeButtonView = (LargeButtonView) C2548q.d(i11, view);
        if (largeButtonView == null || (d11 = C2548q.d((i11 = R$id.separator), view)) == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        }
        return new WidgetAddressPopupButtonAtomBinding((LinearLayout) view, largeButtonView, d11);
    }

    @Override // X4.a
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
