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
public final class DefaultPinIconContainerBinding implements a {

    @NonNull
    public final ElevationImageView pinContainer;

    @NonNull
    public final AppCompatImageView pinDot;

    @NonNull
    public final AppCompatImageView pinImage;

    @NonNull
    public final AppCompatTextView pinsCount;

    @NonNull
    private final FrameLayout rootView;

    private DefaultPinIconContainerBinding(@NonNull FrameLayout frameLayout, @NonNull ElevationImageView elevationImageView, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatImageView appCompatImageView2, @NonNull AppCompatTextView appCompatTextView) {
        this.rootView = frameLayout;
        this.pinContainer = elevationImageView;
        this.pinDot = appCompatImageView;
        this.pinImage = appCompatImageView2;
        this.pinsCount = appCompatTextView;
    }

    @NonNull
    public static DefaultPinIconContainerBinding bind(@NonNull View view) {
        int i11 = R$id.pin_container;
        ElevationImageView elevationImageView = (ElevationImageView) C2548q.d(i11, view);
        if (elevationImageView != null) {
            i11 = R$id.pin_dot;
            AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
            if (appCompatImageView != null) {
                i11 = R$id.pin_image;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) C2548q.d(i11, view);
                if (appCompatImageView2 != null) {
                    i11 = R$id.pins_count;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
                    if (appCompatTextView != null) {
                        return new DefaultPinIconContainerBinding((FrameLayout) view, elevationImageView, appCompatImageView, appCompatImageView2, appCompatTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static DefaultPinIconContainerBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.default_pin_icon_container, viewGroup, false);
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
