package ru.ozon.app.android.travel.feature.hotels.map.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import ru.ozon.app.android.travel.feature.hotels.map.R$id;
import ru.ozon.app.android.travel.feature.hotels.map.R$layout;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes4.dex */
public final class ViewMapPinContainerBinding implements a {

    @NonNull
    public final AppCompatImageView pinIcon;

    @NonNull
    public final TextAtomView pinTitle;

    @NonNull
    private final FrameLayout rootView;

    private ViewMapPinContainerBinding(@NonNull FrameLayout frameLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull TextAtomView textAtomView) {
        this.rootView = frameLayout;
        this.pinIcon = appCompatImageView;
        this.pinTitle = textAtomView;
    }

    @NonNull
    public static ViewMapPinContainerBinding bind(@NonNull View view) {
        int i11 = R$id.pinIcon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
        if (appCompatImageView != null) {
            i11 = R$id.pinTitle;
            TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
            if (textAtomView != null) {
                return new ViewMapPinContainerBinding((FrameLayout) view, appCompatImageView, textAtomView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ViewMapPinContainerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ViewMapPinContainerBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.view_map_pin_container, viewGroup, false);
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
