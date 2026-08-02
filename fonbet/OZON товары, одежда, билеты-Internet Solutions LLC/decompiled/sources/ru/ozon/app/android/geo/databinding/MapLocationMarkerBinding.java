package ru.ozon.app.android.geo.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import ru.ozon.app.android.geo.R$id;
import ru.ozon.app.android.geo.R$layout;
import ru.ozon.app.android.geo.map.presentation.mapicons.ElevationImageView;

/* loaded from: classes12.dex */
public final class MapLocationMarkerBinding implements a {

    @NonNull
    public final ElevationImageView iconIV;

    @NonNull
    private final View rootView;

    @NonNull
    public final AppCompatTextView tooltipTV;

    private MapLocationMarkerBinding(@NonNull View view, @NonNull ElevationImageView elevationImageView, @NonNull AppCompatTextView appCompatTextView) {
        this.rootView = view;
        this.iconIV = elevationImageView;
        this.tooltipTV = appCompatTextView;
    }

    @NonNull
    public static MapLocationMarkerBinding bind(@NonNull View view) {
        int i11 = R$id.iconIV;
        ElevationImageView elevationImageView = (ElevationImageView) C2548q.d(i11, view);
        if (elevationImageView != null) {
            i11 = R$id.tooltipTV;
            AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
            if (appCompatTextView != null) {
                return new MapLocationMarkerBinding(view, elevationImageView, appCompatTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static MapLocationMarkerBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.map_location_marker, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
