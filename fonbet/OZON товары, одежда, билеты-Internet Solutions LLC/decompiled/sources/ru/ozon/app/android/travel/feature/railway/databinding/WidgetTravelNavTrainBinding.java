package ru.ozon.app.android.travel.feature.railway.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.travel.feature.railway.R$id;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes4.dex */
public final class WidgetTravelNavTrainBinding implements a {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextAtomView travelNavSubtitleTAV;

    @NonNull
    public final TextAtomView travelNavTitleTAV;

    private WidgetTravelNavTrainBinding(@NonNull LinearLayout linearLayout, @NonNull TextAtomView textAtomView, @NonNull TextAtomView textAtomView2) {
        this.rootView = linearLayout;
        this.travelNavSubtitleTAV = textAtomView;
        this.travelNavTitleTAV = textAtomView2;
    }

    @NonNull
    public static WidgetTravelNavTrainBinding bind(@NonNull View view) {
        int i11 = R$id.travelNavSubtitleTAV;
        TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
        if (textAtomView != null) {
            i11 = R$id.travelNavTitleTAV;
            TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
            if (textAtomView2 != null) {
                return new WidgetTravelNavTrainBinding((LinearLayout) view, textAtomView, textAtomView2);
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
