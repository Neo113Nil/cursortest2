package ru.ozon.app.android.travel.feature.avia.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import ru.ozon.app.android.travel.feature.avia.R$id;
import ru.ozon.app.android.travel.feature.avia.R$layout;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;

/* loaded from: classes8.dex */
public final class ItemComplexRouteBinding implements a {

    @NonNull
    public final View complexRouteDateBackgroundView;

    @NonNull
    public final TextAtomV2View complexRouteDateErrorTextView;

    @NonNull
    public final TextAtomV2View complexRouteDateTextView;

    @NonNull
    public final TextAtomV2View complexRouteDayOfWeekTextView;

    @NonNull
    public final IconButtonV3View complexRouteDeleteButton;

    @NonNull
    public final View complexRouteLocationBackgroundView;

    @NonNull
    public final TextAtomV2View complexRouteLocationErrorTextView;

    @NonNull
    public final TextAtomV2View complexRouteLocationFromCityTextView;

    @NonNull
    public final View complexRouteLocationFromClickAreaView;

    @NonNull
    public final TextAtomV2View complexRouteLocationFromCodeTextView;

    @NonNull
    public final IconView complexRouteLocationIconView;

    @NonNull
    public final TextAtomV2View complexRouteLocationToCityTextView;

    @NonNull
    public final View complexRouteLocationToClickAreaView;

    @NonNull
    public final TextAtomV2View complexRouteLocationToCodeTextView;

    @NonNull
    private final View rootView;

    private ItemComplexRouteBinding(@NonNull View view, @NonNull View view2, @NonNull TextAtomV2View textAtomV2View, @NonNull TextAtomV2View textAtomV2View2, @NonNull TextAtomV2View textAtomV2View3, @NonNull IconButtonV3View iconButtonV3View, @NonNull View view3, @NonNull TextAtomV2View textAtomV2View4, @NonNull TextAtomV2View textAtomV2View5, @NonNull View view4, @NonNull TextAtomV2View textAtomV2View6, @NonNull IconView iconView, @NonNull TextAtomV2View textAtomV2View7, @NonNull View view5, @NonNull TextAtomV2View textAtomV2View8) {
        this.rootView = view;
        this.complexRouteDateBackgroundView = view2;
        this.complexRouteDateErrorTextView = textAtomV2View;
        this.complexRouteDateTextView = textAtomV2View2;
        this.complexRouteDayOfWeekTextView = textAtomV2View3;
        this.complexRouteDeleteButton = iconButtonV3View;
        this.complexRouteLocationBackgroundView = view3;
        this.complexRouteLocationErrorTextView = textAtomV2View4;
        this.complexRouteLocationFromCityTextView = textAtomV2View5;
        this.complexRouteLocationFromClickAreaView = view4;
        this.complexRouteLocationFromCodeTextView = textAtomV2View6;
        this.complexRouteLocationIconView = iconView;
        this.complexRouteLocationToCityTextView = textAtomV2View7;
        this.complexRouteLocationToClickAreaView = view5;
        this.complexRouteLocationToCodeTextView = textAtomV2View8;
    }

    @NonNull
    public static ItemComplexRouteBinding bind(@NonNull View view) {
        View d11;
        View d12;
        View d13;
        int i11 = R$id.complexRouteDateBackgroundView;
        View d14 = C2548q.d(i11, view);
        if (d14 != null) {
            i11 = R$id.complexRouteDateErrorTextView;
            TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
            if (textAtomV2View != null) {
                i11 = R$id.complexRouteDateTextView;
                TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                if (textAtomV2View2 != null) {
                    i11 = R$id.complexRouteDayOfWeekTextView;
                    TextAtomV2View textAtomV2View3 = (TextAtomV2View) C2548q.d(i11, view);
                    if (textAtomV2View3 != null) {
                        i11 = R$id.complexRouteDeleteButton;
                        IconButtonV3View iconButtonV3View = (IconButtonV3View) C2548q.d(i11, view);
                        if (iconButtonV3View != null && (d11 = C2548q.d((i11 = R$id.complexRouteLocationBackgroundView), view)) != null) {
                            i11 = R$id.complexRouteLocationErrorTextView;
                            TextAtomV2View textAtomV2View4 = (TextAtomV2View) C2548q.d(i11, view);
                            if (textAtomV2View4 != null) {
                                i11 = R$id.complexRouteLocationFromCityTextView;
                                TextAtomV2View textAtomV2View5 = (TextAtomV2View) C2548q.d(i11, view);
                                if (textAtomV2View5 != null && (d12 = C2548q.d((i11 = R$id.complexRouteLocationFromClickAreaView), view)) != null) {
                                    i11 = R$id.complexRouteLocationFromCodeTextView;
                                    TextAtomV2View textAtomV2View6 = (TextAtomV2View) C2548q.d(i11, view);
                                    if (textAtomV2View6 != null) {
                                        i11 = R$id.complexRouteLocationIconView;
                                        IconView iconView = (IconView) C2548q.d(i11, view);
                                        if (iconView != null) {
                                            i11 = R$id.complexRouteLocationToCityTextView;
                                            TextAtomV2View textAtomV2View7 = (TextAtomV2View) C2548q.d(i11, view);
                                            if (textAtomV2View7 != null && (d13 = C2548q.d((i11 = R$id.complexRouteLocationToClickAreaView), view)) != null) {
                                                i11 = R$id.complexRouteLocationToCodeTextView;
                                                TextAtomV2View textAtomV2View8 = (TextAtomV2View) C2548q.d(i11, view);
                                                if (textAtomV2View8 != null) {
                                                    return new ItemComplexRouteBinding(view, d14, textAtomV2View, textAtomV2View2, textAtomV2View3, iconButtonV3View, d11, textAtomV2View4, textAtomV2View5, d12, textAtomV2View6, iconView, textAtomV2View7, d13, textAtomV2View8);
                                                }
                                            }
                                        }
                                    }
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
    public static ItemComplexRouteBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.item_complex_route, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public View getConstraintLayout() {
        return this.rootView;
    }
}
