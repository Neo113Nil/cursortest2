package ru.ozon.app.android.commonwidgets.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.commonwidgets.R$id;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes11.dex */
public final class WidgetValuesTotalBinding implements a {

    @NonNull
    public final TextAtomView headerTav;

    @NonNull
    public final LinearLayout itemsLl;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final LinearLayout valuesTotalLl;

    private WidgetValuesTotalBinding(@NonNull LinearLayout linearLayout, @NonNull TextAtomView textAtomView, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3) {
        this.rootView = linearLayout;
        this.headerTav = textAtomView;
        this.itemsLl = linearLayout2;
        this.valuesTotalLl = linearLayout3;
    }

    @NonNull
    public static WidgetValuesTotalBinding bind(@NonNull View view) {
        int i11 = R$id.headerTav;
        TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
        if (textAtomView != null) {
            i11 = R$id.itemsLl;
            LinearLayout linearLayout = (LinearLayout) C2548q.d(i11, view);
            if (linearLayout != null) {
                LinearLayout linearLayout2 = (LinearLayout) view;
                return new WidgetValuesTotalBinding(linearLayout2, textAtomView, linearLayout, linearLayout2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
