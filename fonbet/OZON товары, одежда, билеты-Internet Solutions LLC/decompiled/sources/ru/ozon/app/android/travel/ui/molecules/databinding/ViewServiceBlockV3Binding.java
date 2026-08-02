package ru.ozon.app.android.travel.ui.molecules.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.travel.molecules.view.linkButton.LinkButtonView;
import ru.ozon.app.android.travel.molecules.view.travelBadge.v1.TravelBadgeListView;
import ru.ozon.app.android.travel.ui.molecules.R$id;
import ru.ozon.app.android.travel.ui.molecules.R$layout;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.SmallButtonView;
import ru.ozon.uni.android.uikit.view.atoms.price.PriceView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes2.dex */
public final class ViewServiceBlockV3Binding implements a {

    @NonNull
    public final RecyclerView additionalInfoListRV;

    @NonNull
    public final LinkButtonView moreActionTAV;

    @NonNull
    private final View rootView;

    @NonNull
    public final TravelBadgeListView travelServiceBlockV3BadgeListView;

    @NonNull
    public final SmallButtonView travelServiceBlockV3ChangeServiceButton;

    @NonNull
    public final TextAtomView travelServiceBlockV3DescriptionTextView;

    @NonNull
    public final Barrier travelServiceBlockV3NextPriceBarrier;

    @NonNull
    public final Group travelServiceBlockV3NextPriceGroup;

    @NonNull
    public final TextAtomView travelServiceBlockV3NextServiceBenefitsTextView;

    @NonNull
    public final Group travelServiceBlockV3NextServiceGroup;

    @NonNull
    public final AppCompatTextView travelServiceBlockV3NextServicePriceSuffixTextView;

    @NonNull
    public final PriceView travelServiceBlockV3NextServicePriceView;

    @NonNull
    public final Barrier travelServiceBlockV3PriceBarrier;

    @NonNull
    public final Group travelServiceBlockV3PriceGroup;

    @NonNull
    public final AppCompatTextView travelServiceBlockV3PriceSuffixTextView;

    @NonNull
    public final PriceView travelServiceBlockV3PriceView;

    @NonNull
    public final View travelServiceBlockV3Separator;

    @NonNull
    public final Barrier travelServiceBlockV3TitleBarrier;

    @NonNull
    public final TextAtomView travelServiceBlockV3TitleTextView;

    private ViewServiceBlockV3Binding(@NonNull View view, @NonNull RecyclerView recyclerView, @NonNull LinkButtonView linkButtonView, @NonNull TravelBadgeListView travelBadgeListView, @NonNull SmallButtonView smallButtonView, @NonNull TextAtomView textAtomView, @NonNull Barrier barrier, @NonNull Group group, @NonNull TextAtomView textAtomView2, @NonNull Group group2, @NonNull AppCompatTextView appCompatTextView, @NonNull PriceView priceView, @NonNull Barrier barrier2, @NonNull Group group3, @NonNull AppCompatTextView appCompatTextView2, @NonNull PriceView priceView2, @NonNull View view2, @NonNull Barrier barrier3, @NonNull TextAtomView textAtomView3) {
        this.rootView = view;
        this.additionalInfoListRV = recyclerView;
        this.moreActionTAV = linkButtonView;
        this.travelServiceBlockV3BadgeListView = travelBadgeListView;
        this.travelServiceBlockV3ChangeServiceButton = smallButtonView;
        this.travelServiceBlockV3DescriptionTextView = textAtomView;
        this.travelServiceBlockV3NextPriceBarrier = barrier;
        this.travelServiceBlockV3NextPriceGroup = group;
        this.travelServiceBlockV3NextServiceBenefitsTextView = textAtomView2;
        this.travelServiceBlockV3NextServiceGroup = group2;
        this.travelServiceBlockV3NextServicePriceSuffixTextView = appCompatTextView;
        this.travelServiceBlockV3NextServicePriceView = priceView;
        this.travelServiceBlockV3PriceBarrier = barrier2;
        this.travelServiceBlockV3PriceGroup = group3;
        this.travelServiceBlockV3PriceSuffixTextView = appCompatTextView2;
        this.travelServiceBlockV3PriceView = priceView2;
        this.travelServiceBlockV3Separator = view2;
        this.travelServiceBlockV3TitleBarrier = barrier3;
        this.travelServiceBlockV3TitleTextView = textAtomView3;
    }

    @NonNull
    public static ViewServiceBlockV3Binding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.additionalInfoListRV;
        RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
        if (recyclerView != null) {
            i11 = R$id.moreActionTAV;
            LinkButtonView linkButtonView = (LinkButtonView) C2548q.d(i11, view);
            if (linkButtonView != null) {
                i11 = R$id.travelServiceBlockV3BadgeListView;
                TravelBadgeListView travelBadgeListView = (TravelBadgeListView) C2548q.d(i11, view);
                if (travelBadgeListView != null) {
                    i11 = R$id.travelServiceBlockV3ChangeServiceButton;
                    SmallButtonView smallButtonView = (SmallButtonView) C2548q.d(i11, view);
                    if (smallButtonView != null) {
                        i11 = R$id.travelServiceBlockV3DescriptionTextView;
                        TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                        if (textAtomView != null) {
                            i11 = R$id.travelServiceBlockV3NextPriceBarrier;
                            Barrier barrier = (Barrier) C2548q.d(i11, view);
                            if (barrier != null) {
                                i11 = R$id.travelServiceBlockV3NextPriceGroup;
                                Group group = (Group) C2548q.d(i11, view);
                                if (group != null) {
                                    i11 = R$id.travelServiceBlockV3NextServiceBenefitsTextView;
                                    TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                                    if (textAtomView2 != null) {
                                        i11 = R$id.travelServiceBlockV3NextServiceGroup;
                                        Group group2 = (Group) C2548q.d(i11, view);
                                        if (group2 != null) {
                                            i11 = R$id.travelServiceBlockV3NextServicePriceSuffixTextView;
                                            AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
                                            if (appCompatTextView != null) {
                                                i11 = R$id.travelServiceBlockV3NextServicePriceView;
                                                PriceView priceView = (PriceView) C2548q.d(i11, view);
                                                if (priceView != null) {
                                                    i11 = R$id.travelServiceBlockV3PriceBarrier;
                                                    Barrier barrier2 = (Barrier) C2548q.d(i11, view);
                                                    if (barrier2 != null) {
                                                        i11 = R$id.travelServiceBlockV3PriceGroup;
                                                        Group group3 = (Group) C2548q.d(i11, view);
                                                        if (group3 != null) {
                                                            i11 = R$id.travelServiceBlockV3PriceSuffixTextView;
                                                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) C2548q.d(i11, view);
                                                            if (appCompatTextView2 != null) {
                                                                i11 = R$id.travelServiceBlockV3PriceView;
                                                                PriceView priceView2 = (PriceView) C2548q.d(i11, view);
                                                                if (priceView2 != null && (d11 = C2548q.d((i11 = R$id.travelServiceBlockV3Separator), view)) != null) {
                                                                    i11 = R$id.travelServiceBlockV3TitleBarrier;
                                                                    Barrier barrier3 = (Barrier) C2548q.d(i11, view);
                                                                    if (barrier3 != null) {
                                                                        i11 = R$id.travelServiceBlockV3TitleTextView;
                                                                        TextAtomView textAtomView3 = (TextAtomView) C2548q.d(i11, view);
                                                                        if (textAtomView3 != null) {
                                                                            return new ViewServiceBlockV3Binding(view, recyclerView, linkButtonView, travelBadgeListView, smallButtonView, textAtomView, barrier, group, textAtomView2, group2, appCompatTextView, priceView, barrier2, group3, appCompatTextView2, priceView2, d11, barrier3, textAtomView3);
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
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ViewServiceBlockV3Binding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.view_service_block_v3, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public View getConstraintLayout() {
        return this.rootView;
    }
}
