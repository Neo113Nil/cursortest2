package ru.ozon.app.android.geo.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import ru.ozon.app.android.geo.R$id;
import ru.ozon.app.android.geo.R$layout;
import ru.ozon.app.android.geo.map.presentation.mapicons.ElevationImageView;

/* loaded from: classes12.dex */
public final class ExpandedPinIconContainerBinding implements a {

    @NonNull
    public final LinearLayout additionalContentContainer;

    @NonNull
    public final AppCompatImageView additionalContentIcon;

    @NonNull
    public final AppCompatTextView additionalContentText;

    @NonNull
    public final ElevationImageView pinDot;

    @NonNull
    public final AppCompatImageView pinImage;

    @NonNull
    public final ElevationImageView pinPointer;

    @NonNull
    public final AppCompatTextView pinsCount;

    @NonNull
    private final LinearLayout rootView;

    private ExpandedPinIconContainerBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatTextView appCompatTextView, @NonNull ElevationImageView elevationImageView, @NonNull AppCompatImageView appCompatImageView2, @NonNull ElevationImageView elevationImageView2, @NonNull AppCompatTextView appCompatTextView2) {
        this.rootView = linearLayout;
        this.additionalContentContainer = linearLayout2;
        this.additionalContentIcon = appCompatImageView;
        this.additionalContentText = appCompatTextView;
        this.pinDot = elevationImageView;
        this.pinImage = appCompatImageView2;
        this.pinPointer = elevationImageView2;
        this.pinsCount = appCompatTextView2;
    }

    @NonNull
    public static ExpandedPinIconContainerBinding bind(@NonNull View view) {
        int i11 = R$id.additional_content_container;
        LinearLayout linearLayout = (LinearLayout) C2548q.d(i11, view);
        if (linearLayout != null) {
            i11 = R$id.additional_content_icon;
            AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
            if (appCompatImageView != null) {
                i11 = R$id.additional_content_text;
                AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
                if (appCompatTextView != null) {
                    i11 = R$id.pin_dot;
                    ElevationImageView elevationImageView = (ElevationImageView) C2548q.d(i11, view);
                    if (elevationImageView != null) {
                        i11 = R$id.pin_image;
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) C2548q.d(i11, view);
                        if (appCompatImageView2 != null) {
                            i11 = R$id.pin_pointer;
                            ElevationImageView elevationImageView2 = (ElevationImageView) C2548q.d(i11, view);
                            if (elevationImageView2 != null) {
                                i11 = R$id.pins_count;
                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) C2548q.d(i11, view);
                                if (appCompatTextView2 != null) {
                                    return new ExpandedPinIconContainerBinding((LinearLayout) view, linearLayout, appCompatImageView, appCompatTextView, elevationImageView, appCompatImageView2, elevationImageView2, appCompatTextView2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ExpandedPinIconContainerBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.expanded_pin_icon_container, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
