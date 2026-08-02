package ru.ozon.app.android.travel.ui.molecules.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import ru.ozon.app.android.travel.ui.molecules.R$id;
import ru.ozon.app.android.travel.ui.molecules.R$layout;

/* loaded from: classes2.dex */
public final class ViewTravelBadgeBinding implements a {

    @NonNull
    private final View rootView;

    @NonNull
    public final FrameLayout travelBadgeViewImagesContainer;

    @NonNull
    public final AppCompatTextView travelBadgeViewTitleTextView;

    private ViewTravelBadgeBinding(@NonNull View view, @NonNull FrameLayout frameLayout, @NonNull AppCompatTextView appCompatTextView) {
        this.rootView = view;
        this.travelBadgeViewImagesContainer = frameLayout;
        this.travelBadgeViewTitleTextView = appCompatTextView;
    }

    @NonNull
    public static ViewTravelBadgeBinding bind(@NonNull View view) {
        int i11 = R$id.travelBadgeViewImagesContainer;
        FrameLayout frameLayout = (FrameLayout) C2548q.d(i11, view);
        if (frameLayout != null) {
            i11 = R$id.travelBadgeViewTitleTextView;
            AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
            if (appCompatTextView != null) {
                return new ViewTravelBadgeBinding(view, frameLayout, appCompatTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ViewTravelBadgeBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.view_travel_badge, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
