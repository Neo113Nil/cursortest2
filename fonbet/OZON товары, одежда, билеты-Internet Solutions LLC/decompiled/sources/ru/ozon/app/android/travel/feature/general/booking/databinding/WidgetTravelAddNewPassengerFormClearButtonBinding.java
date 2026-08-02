package ru.ozon.app.android.travel.feature.general.booking.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.SmallBorderlessButtonView;

/* loaded from: classes3.dex */
public final class WidgetTravelAddNewPassengerFormClearButtonBinding implements a {

    @NonNull
    public final SmallBorderlessButtonView clearButtonSbbv;

    @NonNull
    private final SmallBorderlessButtonView rootView;

    private WidgetTravelAddNewPassengerFormClearButtonBinding(@NonNull SmallBorderlessButtonView smallBorderlessButtonView, @NonNull SmallBorderlessButtonView smallBorderlessButtonView2) {
        this.rootView = smallBorderlessButtonView;
        this.clearButtonSbbv = smallBorderlessButtonView2;
    }

    @NonNull
    public static WidgetTravelAddNewPassengerFormClearButtonBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        SmallBorderlessButtonView smallBorderlessButtonView = (SmallBorderlessButtonView) view;
        return new WidgetTravelAddNewPassengerFormClearButtonBinding(smallBorderlessButtonView, smallBorderlessButtonView);
    }

    @Override // X4.a
    @NonNull
    public SmallBorderlessButtonView getRoot() {
        return this.rootView;
    }
}
