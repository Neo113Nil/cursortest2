package ru.ozon.app.android.travel.feature.hotels.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.view.ViewStub;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import ru.ozon.app.android.travel.feature.hotels.R$id;
import ru.ozon.app.android.travel.molecules.view.linkButton.LinkButtonView;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitle24IconView;
import ru.ozon.uni.android.uikit.view.atoms.price.PriceView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.layout.HorizontalFlexAtomsLayout;

/* loaded from: classes4.dex */
public final class WidgetHotelsPageHeaderBinding implements a {

    @NonNull
    public final LinkButtonView hotelsPageHeaderAddressLbv;

    @NonNull
    public final HorizontalFlexAtomsLayout hotelsPageHeaderBadgesHfal;

    @NonNull
    public final CellWithSubtitle24IconView hotelsPageHeaderPremiumPointsCws;

    @NonNull
    public final TextAtomView hotelsPageHeaderPriceDescriptionTav;

    @NonNull
    public final Group hotelsPageHeaderPriceGroup;

    @NonNull
    public final CellWithSubtitle24IconView hotelsPageHeaderPriceInfoCell;

    @NonNull
    public final PriceView hotelsPageHeaderPricePv;

    @NonNull
    public final ViewStub hotelsPageHeaderShimmersVS;

    @NonNull
    public final TextAtomView hotelsPageHeaderStarsTav;

    @NonNull
    public final TextAtomView hotelsPageHeaderTitleTav;

    @NonNull
    private final ConstraintLayout rootView;

    private WidgetHotelsPageHeaderBinding(@NonNull ConstraintLayout constraintLayout, @NonNull LinkButtonView linkButtonView, @NonNull HorizontalFlexAtomsLayout horizontalFlexAtomsLayout, @NonNull CellWithSubtitle24IconView cellWithSubtitle24IconView, @NonNull TextAtomView textAtomView, @NonNull Group group, @NonNull CellWithSubtitle24IconView cellWithSubtitle24IconView2, @NonNull PriceView priceView, @NonNull ViewStub viewStub, @NonNull TextAtomView textAtomView2, @NonNull TextAtomView textAtomView3) {
        this.rootView = constraintLayout;
        this.hotelsPageHeaderAddressLbv = linkButtonView;
        this.hotelsPageHeaderBadgesHfal = horizontalFlexAtomsLayout;
        this.hotelsPageHeaderPremiumPointsCws = cellWithSubtitle24IconView;
        this.hotelsPageHeaderPriceDescriptionTav = textAtomView;
        this.hotelsPageHeaderPriceGroup = group;
        this.hotelsPageHeaderPriceInfoCell = cellWithSubtitle24IconView2;
        this.hotelsPageHeaderPricePv = priceView;
        this.hotelsPageHeaderShimmersVS = viewStub;
        this.hotelsPageHeaderStarsTav = textAtomView2;
        this.hotelsPageHeaderTitleTav = textAtomView3;
    }

    @NonNull
    public static WidgetHotelsPageHeaderBinding bind(@NonNull View view) {
        int i11 = R$id.hotelsPageHeaderAddressLbv;
        LinkButtonView linkButtonView = (LinkButtonView) C2548q.d(i11, view);
        if (linkButtonView != null) {
            i11 = R$id.hotelsPageHeaderBadgesHfal;
            HorizontalFlexAtomsLayout horizontalFlexAtomsLayout = (HorizontalFlexAtomsLayout) C2548q.d(i11, view);
            if (horizontalFlexAtomsLayout != null) {
                i11 = R$id.hotelsPageHeaderPremiumPointsCws;
                CellWithSubtitle24IconView cellWithSubtitle24IconView = (CellWithSubtitle24IconView) C2548q.d(i11, view);
                if (cellWithSubtitle24IconView != null) {
                    i11 = R$id.hotelsPageHeaderPriceDescriptionTav;
                    TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                    if (textAtomView != null) {
                        i11 = R$id.hotelsPageHeaderPriceGroup;
                        Group group = (Group) C2548q.d(i11, view);
                        if (group != null) {
                            i11 = R$id.hotelsPageHeaderPriceInfoCell;
                            CellWithSubtitle24IconView cellWithSubtitle24IconView2 = (CellWithSubtitle24IconView) C2548q.d(i11, view);
                            if (cellWithSubtitle24IconView2 != null) {
                                i11 = R$id.hotelsPageHeaderPricePv;
                                PriceView priceView = (PriceView) C2548q.d(i11, view);
                                if (priceView != null) {
                                    i11 = R$id.hotelsPageHeaderShimmersVS;
                                    ViewStub viewStub = (ViewStub) C2548q.d(i11, view);
                                    if (viewStub != null) {
                                        i11 = R$id.hotelsPageHeaderStarsTav;
                                        TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                                        if (textAtomView2 != null) {
                                            i11 = R$id.hotelsPageHeaderTitleTav;
                                            TextAtomView textAtomView3 = (TextAtomView) C2548q.d(i11, view);
                                            if (textAtomView3 != null) {
                                                return new WidgetHotelsPageHeaderBinding((ConstraintLayout) view, linkButtonView, horizontalFlexAtomsLayout, cellWithSubtitle24IconView, textAtomView, group, cellWithSubtitle24IconView2, priceView, viewStub, textAtomView2, textAtomView3);
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

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
