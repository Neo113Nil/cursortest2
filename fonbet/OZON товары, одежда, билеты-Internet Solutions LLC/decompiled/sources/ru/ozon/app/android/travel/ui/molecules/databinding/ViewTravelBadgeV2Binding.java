package ru.ozon.app.android.travel.ui.molecules.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.travel.ui.molecules.R$id;
import ru.ozon.app.android.travel.ui.molecules.R$layout;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes2.dex */
public final class ViewTravelBadgeV2Binding implements a {

    @NonNull
    private final View rootView;

    @NonNull
    public final FrameLayout travelBadgeViewImagesContainer;

    @NonNull
    public final TextAtomView travelBadgeViewTitleTextView;

    private ViewTravelBadgeV2Binding(@NonNull View view, @NonNull FrameLayout frameLayout, @NonNull TextAtomView textAtomView) {
        this.rootView = view;
        this.travelBadgeViewImagesContainer = frameLayout;
        this.travelBadgeViewTitleTextView = textAtomView;
    }

    @NonNull
    public static ViewTravelBadgeV2Binding bind(@NonNull View view) {
        int i11 = R$id.travelBadgeViewImagesContainer;
        FrameLayout frameLayout = (FrameLayout) C2548q.d(i11, view);
        if (frameLayout != null) {
            i11 = R$id.travelBadgeViewTitleTextView;
            TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
            if (textAtomView != null) {
                return new ViewTravelBadgeV2Binding(view, frameLayout, textAtomView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ViewTravelBadgeV2Binding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.view_travel_badge_v2, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
