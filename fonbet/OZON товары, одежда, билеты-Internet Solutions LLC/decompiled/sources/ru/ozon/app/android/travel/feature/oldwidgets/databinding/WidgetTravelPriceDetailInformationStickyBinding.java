package ru.ozon.app.android.travel.feature.oldwidgets.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.travel.feature.oldwidgets.R$id;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.SmallButtonView;

/* loaded from: classes4.dex */
public final class WidgetTravelPriceDetailInformationStickyBinding implements a {

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final SmallButtonView smallButton;

    @NonNull
    public final TextView subtitleTV;

    @NonNull
    public final TextView totalPriceTV;

    private WidgetTravelPriceDetailInformationStickyBinding(@NonNull ConstraintLayout constraintLayout, @NonNull SmallButtonView smallButtonView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = constraintLayout;
        this.smallButton = smallButtonView;
        this.subtitleTV = textView;
        this.totalPriceTV = textView2;
    }

    @NonNull
    public static WidgetTravelPriceDetailInformationStickyBinding bind(@NonNull View view) {
        int i11 = R$id.smallButton;
        SmallButtonView smallButtonView = (SmallButtonView) C2548q.d(i11, view);
        if (smallButtonView != null) {
            i11 = R$id.subtitleTV;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                i11 = R$id.totalPriceTV;
                TextView textView2 = (TextView) C2548q.d(i11, view);
                if (textView2 != null) {
                    return new WidgetTravelPriceDetailInformationStickyBinding((ConstraintLayout) view, smallButtonView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
