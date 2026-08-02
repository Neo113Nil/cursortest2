package ru.ozon.app.android.travel.feature.general.main.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import ru.ozon.app.android.travel.feature.general.main.R$id;
import ru.ozon.app.android.travel.feature.general.main.R$layout;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;

/* loaded from: classes4.dex */
public final class ViewTravelQuantityCellBinding implements a {

    @NonNull
    public final AppCompatTextView countTav;

    @NonNull
    public final IconButtonV3View minusButtonView;

    @NonNull
    public final IconButtonV3View plusButtonView;

    @NonNull
    private final View rootView;

    @NonNull
    public final AppCompatTextView subtitleTav;

    @NonNull
    public final AppCompatTextView titleTav;

    private ViewTravelQuantityCellBinding(@NonNull View view, @NonNull AppCompatTextView appCompatTextView, @NonNull IconButtonV3View iconButtonV3View, @NonNull IconButtonV3View iconButtonV3View2, @NonNull AppCompatTextView appCompatTextView2, @NonNull AppCompatTextView appCompatTextView3) {
        this.rootView = view;
        this.countTav = appCompatTextView;
        this.minusButtonView = iconButtonV3View;
        this.plusButtonView = iconButtonV3View2;
        this.subtitleTav = appCompatTextView2;
        this.titleTav = appCompatTextView3;
    }

    @NonNull
    public static ViewTravelQuantityCellBinding bind(@NonNull View view) {
        int i11 = R$id.countTav;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
        if (appCompatTextView != null) {
            i11 = R$id.minusButtonView;
            IconButtonV3View iconButtonV3View = (IconButtonV3View) C2548q.d(i11, view);
            if (iconButtonV3View != null) {
                i11 = R$id.plusButtonView;
                IconButtonV3View iconButtonV3View2 = (IconButtonV3View) C2548q.d(i11, view);
                if (iconButtonV3View2 != null) {
                    i11 = R$id.subtitleTav;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) C2548q.d(i11, view);
                    if (appCompatTextView2 != null) {
                        i11 = R$id.titleTav;
                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) C2548q.d(i11, view);
                        if (appCompatTextView3 != null) {
                            return new ViewTravelQuantityCellBinding(view, appCompatTextView, iconButtonV3View, iconButtonV3View2, appCompatTextView2, appCompatTextView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ViewTravelQuantityCellBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.view_travel_quantity_cell, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public View getConstraintLayout() {
        return this.rootView;
    }
}
