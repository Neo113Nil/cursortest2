package ru.ozon.app.android.travel.feature.oldwidgets.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.travel.feature.oldwidgets.R$id;

/* loaded from: classes4.dex */
public final class WidgetTravelModalPriceDetailInformationBinding implements a {

    @NonNull
    public final LinearLayout positionsContainerLL;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView sectionNameTV;

    @NonNull
    public final TextView sectionPriceTV;

    @NonNull
    public final TextView sectionSubtitleTV;

    private WidgetTravelModalPriceDetailInformationBinding(@NonNull ConstraintLayout constraintLayout, @NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.rootView = constraintLayout;
        this.positionsContainerLL = linearLayout;
        this.sectionNameTV = textView;
        this.sectionPriceTV = textView2;
        this.sectionSubtitleTV = textView3;
    }

    @NonNull
    public static WidgetTravelModalPriceDetailInformationBinding bind(@NonNull View view) {
        int i11 = R$id.positionsContainerLL;
        LinearLayout linearLayout = (LinearLayout) C2548q.d(i11, view);
        if (linearLayout != null) {
            i11 = R$id.sectionNameTV;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                i11 = R$id.sectionPriceTV;
                TextView textView2 = (TextView) C2548q.d(i11, view);
                if (textView2 != null) {
                    i11 = R$id.sectionSubtitleTV;
                    TextView textView3 = (TextView) C2548q.d(i11, view);
                    if (textView3 != null) {
                        return new WidgetTravelModalPriceDetailInformationBinding((ConstraintLayout) view, linearLayout, textView, textView2, textView3);
                    }
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
