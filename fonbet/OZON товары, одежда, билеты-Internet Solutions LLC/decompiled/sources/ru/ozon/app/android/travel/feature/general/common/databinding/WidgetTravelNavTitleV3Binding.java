package ru.ozon.app.android.travel.feature.general.common.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.travel.feature.general.common.R$id;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes3.dex */
public final class WidgetTravelNavTitleV3Binding implements a {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextAtomView travelNavSubtitleV3TAV;

    @NonNull
    public final TextAtomView travelNavTitleV3TAV;

    private WidgetTravelNavTitleV3Binding(@NonNull LinearLayout linearLayout, @NonNull TextAtomView textAtomView, @NonNull TextAtomView textAtomView2) {
        this.rootView = linearLayout;
        this.travelNavSubtitleV3TAV = textAtomView;
        this.travelNavTitleV3TAV = textAtomView2;
    }

    @NonNull
    public static WidgetTravelNavTitleV3Binding bind(@NonNull View view) {
        int i11 = R$id.travelNavSubtitleV3TAV;
        TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
        if (textAtomView != null) {
            i11 = R$id.travelNavTitleV3TAV;
            TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
            if (textAtomView2 != null) {
                return new WidgetTravelNavTitleV3Binding((LinearLayout) view, textAtomView, textAtomView2);
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
