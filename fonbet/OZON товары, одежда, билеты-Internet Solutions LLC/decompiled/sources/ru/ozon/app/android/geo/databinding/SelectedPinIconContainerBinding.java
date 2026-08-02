package ru.ozon.app.android.geo.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import ru.ozon.app.android.geo.R$id;
import ru.ozon.app.android.geo.R$layout;
import ru.ozon.app.android.geo.map.presentation.mapicons.ElevationImageView;

/* loaded from: classes12.dex */
public final class SelectedPinIconContainerBinding implements a {

    @NonNull
    public final FrameLayout bigPin;

    @NonNull
    public final AppCompatImageView pinBackground;

    @NonNull
    public final ElevationImageView pinForm;

    @NonNull
    public final AppCompatImageView pinImage;

    @NonNull
    public final AppCompatTextView pinsCount;

    @NonNull
    private final FrameLayout rootView;

    private SelectedPinIconContainerBinding(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull AppCompatImageView appCompatImageView, @NonNull ElevationImageView elevationImageView, @NonNull AppCompatImageView appCompatImageView2, @NonNull AppCompatTextView appCompatTextView) {
        this.rootView = frameLayout;
        this.bigPin = frameLayout2;
        this.pinBackground = appCompatImageView;
        this.pinForm = elevationImageView;
        this.pinImage = appCompatImageView2;
        this.pinsCount = appCompatTextView;
    }

    @NonNull
    public static SelectedPinIconContainerBinding bind(@NonNull View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        int i11 = R$id.pin_background;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
        if (appCompatImageView != null) {
            i11 = R$id.pin_form;
            ElevationImageView elevationImageView = (ElevationImageView) C2548q.d(i11, view);
            if (elevationImageView != null) {
                i11 = R$id.pin_image;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) C2548q.d(i11, view);
                if (appCompatImageView2 != null) {
                    i11 = R$id.pins_count;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
                    if (appCompatTextView != null) {
                        return new SelectedPinIconContainerBinding(frameLayout, frameLayout, appCompatImageView, elevationImageView, appCompatImageView2, appCompatTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static SelectedPinIconContainerBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.selected_pin_icon_container, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
