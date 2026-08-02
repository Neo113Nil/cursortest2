package ru.ozon.app.android.travel.feature.general.common.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import ru.ozon.app.android.travel.molecules.view.linkButton.LinkButtonView;

/* loaded from: classes3.dex */
public final class WidgetTravelLinkButtonV1Binding implements a {

    @NonNull
    private final LinkButtonView rootView;

    @NonNull
    public final LinkButtonView travelLBV;

    private WidgetTravelLinkButtonV1Binding(@NonNull LinkButtonView linkButtonView, @NonNull LinkButtonView linkButtonView2) {
        this.rootView = linkButtonView;
        this.travelLBV = linkButtonView2;
    }

    @NonNull
    public static WidgetTravelLinkButtonV1Binding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        LinkButtonView linkButtonView = (LinkButtonView) view;
        return new WidgetTravelLinkButtonV1Binding(linkButtonView, linkButtonView);
    }

    @Override // X4.a
    @NonNull
    public LinkButtonView getRoot() {
        return this.rootView;
    }
}
