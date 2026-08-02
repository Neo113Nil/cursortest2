package ru.ozon.app.android.geo.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.geo.R$id;
import ru.ozon.app.android.geo.mapPreview.presentation.MapPreviewView;

/* loaded from: classes12.dex */
public final class WidgetMapPreviewBinding implements a {

    @NonNull
    public final AppCompatImageView centerInMapIbv;

    @NonNull
    public final MapPreviewView mapContainer;

    @NonNull
    private final ConstraintLayout rootView;

    private WidgetMapPreviewBinding(@NonNull ConstraintLayout constraintLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull MapPreviewView mapPreviewView) {
        this.rootView = constraintLayout;
        this.centerInMapIbv = appCompatImageView;
        this.mapContainer = mapPreviewView;
    }

    @NonNull
    public static WidgetMapPreviewBinding bind(@NonNull View view) {
        int i11 = R$id.centerInMapIbv;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
        if (appCompatImageView != null) {
            i11 = R$id.mapContainer;
            MapPreviewView mapPreviewView = (MapPreviewView) C2548q.d(i11, view);
            if (mapPreviewView != null) {
                return new WidgetMapPreviewBinding((ConstraintLayout) view, appCompatImageView, mapPreviewView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
