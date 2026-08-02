package ru.ozon.app.android.travel.feature.general.booking.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.travel.feature.general.booking.R$id;
import ru.ozon.app.android.travel.feature.general.booking.R$layout;
import ru.ozon.app.android.travel.molecules.view.counterInput.v2.CounterInputV2View;
import ru.ozon.app.android.travel.molecules.view.shimmer.RoundedShimmerView;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.selectionControls.ToggleView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;

/* loaded from: classes3.dex */
public final class ItemAdditionalServicesCellBinding implements a {

    @NonNull
    public final Barrier additionalServiceBarrierB;

    @NonNull
    public final Space additionalServicesBottomSpaceS;

    @NonNull
    public final ButtonV3View additionalServicesButtonBV;

    @NonNull
    public final CounterInputV2View additionalServicesCounterInputCIV;

    @NonNull
    public final Image additionalServicesImageI;

    @NonNull
    public final View additionalServicesSeparatorV;

    @NonNull
    public final RoundedShimmerView additionalServicesSubtitleSkeletonRSV;

    @NonNull
    public final TextAtomV2View additionalServicesSubtitleTAV;

    @NonNull
    public final RecyclerView additionalServicesTariffItemsRV;

    @NonNull
    public final IconButtonV3View additionalServicesTitleInfoButtonIBV;

    @NonNull
    public final TextAtomV2View additionalServicesTitleTAV;

    @NonNull
    public final ToggleView additionalServicesToggleTV;

    @NonNull
    private final ConstraintLayout rootView;

    private ItemAdditionalServicesCellBinding(@NonNull ConstraintLayout constraintLayout, @NonNull Barrier barrier, @NonNull Space space, @NonNull ButtonV3View buttonV3View, @NonNull CounterInputV2View counterInputV2View, @NonNull Image image, @NonNull View view, @NonNull RoundedShimmerView roundedShimmerView, @NonNull TextAtomV2View textAtomV2View, @NonNull RecyclerView recyclerView, @NonNull IconButtonV3View iconButtonV3View, @NonNull TextAtomV2View textAtomV2View2, @NonNull ToggleView toggleView) {
        this.rootView = constraintLayout;
        this.additionalServiceBarrierB = barrier;
        this.additionalServicesBottomSpaceS = space;
        this.additionalServicesButtonBV = buttonV3View;
        this.additionalServicesCounterInputCIV = counterInputV2View;
        this.additionalServicesImageI = image;
        this.additionalServicesSeparatorV = view;
        this.additionalServicesSubtitleSkeletonRSV = roundedShimmerView;
        this.additionalServicesSubtitleTAV = textAtomV2View;
        this.additionalServicesTariffItemsRV = recyclerView;
        this.additionalServicesTitleInfoButtonIBV = iconButtonV3View;
        this.additionalServicesTitleTAV = textAtomV2View2;
        this.additionalServicesToggleTV = toggleView;
    }

    @NonNull
    public static ItemAdditionalServicesCellBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.additionalServiceBarrierB;
        Barrier barrier = (Barrier) C2548q.d(i11, view);
        if (barrier != null) {
            i11 = R$id.additionalServicesBottomSpaceS;
            Space space = (Space) C2548q.d(i11, view);
            if (space != null) {
                i11 = R$id.additionalServicesButtonBV;
                ButtonV3View buttonV3View = (ButtonV3View) C2548q.d(i11, view);
                if (buttonV3View != null) {
                    i11 = R$id.additionalServicesCounterInputCIV;
                    CounterInputV2View counterInputV2View = (CounterInputV2View) C2548q.d(i11, view);
                    if (counterInputV2View != null) {
                        i11 = R$id.additionalServicesImageI;
                        Image image = (Image) C2548q.d(i11, view);
                        if (image != null && (d11 = C2548q.d((i11 = R$id.additionalServicesSeparatorV), view)) != null) {
                            i11 = R$id.additionalServicesSubtitleSkeletonRSV;
                            RoundedShimmerView roundedShimmerView = (RoundedShimmerView) C2548q.d(i11, view);
                            if (roundedShimmerView != null) {
                                i11 = R$id.additionalServicesSubtitleTAV;
                                TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                                if (textAtomV2View != null) {
                                    i11 = R$id.additionalServicesTariffItemsRV;
                                    RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
                                    if (recyclerView != null) {
                                        i11 = R$id.additionalServicesTitleInfoButtonIBV;
                                        IconButtonV3View iconButtonV3View = (IconButtonV3View) C2548q.d(i11, view);
                                        if (iconButtonV3View != null) {
                                            i11 = R$id.additionalServicesTitleTAV;
                                            TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                                            if (textAtomV2View2 != null) {
                                                i11 = R$id.additionalServicesToggleTV;
                                                ToggleView toggleView = (ToggleView) C2548q.d(i11, view);
                                                if (toggleView != null) {
                                                    return new ItemAdditionalServicesCellBinding((ConstraintLayout) view, barrier, space, buttonV3View, counterInputV2View, image, d11, roundedShimmerView, textAtomV2View, recyclerView, iconButtonV3View, textAtomV2View2, toggleView);
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
    public static ItemAdditionalServicesCellBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_additional_services_cell, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
