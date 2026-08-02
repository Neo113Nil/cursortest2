package ru.ozon.app.android.travel.ui.molecules.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.travel.molecules.view.travelBadge.v2.TravelBadgeV2ListView;
import ru.ozon.app.android.travel.ui.molecules.R$id;
import ru.ozon.app.android.travel.ui.molecules.R$layout;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.SmallBorderlessButtonView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.SmallButtonView;
import ru.ozon.uni.android.uikit.view.atoms.price.PriceView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes2.dex */
public final class ViewServiceBlockV4Binding implements a {

    @NonNull
    public final RecyclerView additionalListRV;

    @NonNull
    public final SmallBorderlessButtonView moreActionSBBV;

    @NonNull
    private final View rootView;

    @NonNull
    public final TravelBadgeV2ListView travelServiceBlockV4BadgeListView;

    @NonNull
    public final SmallButtonView travelServiceBlockV4ChangeServiceSBV;

    @NonNull
    public final TextAtomView travelServiceBlockV4DescriptionTAV;

    @NonNull
    public final Barrier travelServiceBlockV4PriceBarrier;

    @NonNull
    public final Group travelServiceBlockV4PriceGroup;

    @NonNull
    public final PriceView travelServiceBlockV4PricePV;

    @NonNull
    public final TextAtomView travelServiceBlockV4PriceSuffixTAV;

    @NonNull
    public final Barrier travelServiceBlockV4TitleBarrier;

    @NonNull
    public final TextAtomView travelServiceBlockV4TitleTAV;

    private ViewServiceBlockV4Binding(@NonNull View view, @NonNull RecyclerView recyclerView, @NonNull SmallBorderlessButtonView smallBorderlessButtonView, @NonNull TravelBadgeV2ListView travelBadgeV2ListView, @NonNull SmallButtonView smallButtonView, @NonNull TextAtomView textAtomView, @NonNull Barrier barrier, @NonNull Group group, @NonNull PriceView priceView, @NonNull TextAtomView textAtomView2, @NonNull Barrier barrier2, @NonNull TextAtomView textAtomView3) {
        this.rootView = view;
        this.additionalListRV = recyclerView;
        this.moreActionSBBV = smallBorderlessButtonView;
        this.travelServiceBlockV4BadgeListView = travelBadgeV2ListView;
        this.travelServiceBlockV4ChangeServiceSBV = smallButtonView;
        this.travelServiceBlockV4DescriptionTAV = textAtomView;
        this.travelServiceBlockV4PriceBarrier = barrier;
        this.travelServiceBlockV4PriceGroup = group;
        this.travelServiceBlockV4PricePV = priceView;
        this.travelServiceBlockV4PriceSuffixTAV = textAtomView2;
        this.travelServiceBlockV4TitleBarrier = barrier2;
        this.travelServiceBlockV4TitleTAV = textAtomView3;
    }

    @NonNull
    public static ViewServiceBlockV4Binding bind(@NonNull View view) {
        int i11 = R$id.additionalListRV;
        RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
        if (recyclerView != null) {
            i11 = R$id.moreActionSBBV;
            SmallBorderlessButtonView smallBorderlessButtonView = (SmallBorderlessButtonView) C2548q.d(i11, view);
            if (smallBorderlessButtonView != null) {
                i11 = R$id.travelServiceBlockV4BadgeListView;
                TravelBadgeV2ListView travelBadgeV2ListView = (TravelBadgeV2ListView) C2548q.d(i11, view);
                if (travelBadgeV2ListView != null) {
                    i11 = R$id.travelServiceBlockV4ChangeServiceSBV;
                    SmallButtonView smallButtonView = (SmallButtonView) C2548q.d(i11, view);
                    if (smallButtonView != null) {
                        i11 = R$id.travelServiceBlockV4DescriptionTAV;
                        TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                        if (textAtomView != null) {
                            i11 = R$id.travelServiceBlockV4PriceBarrier;
                            Barrier barrier = (Barrier) C2548q.d(i11, view);
                            if (barrier != null) {
                                i11 = R$id.travelServiceBlockV4PriceGroup;
                                Group group = (Group) C2548q.d(i11, view);
                                if (group != null) {
                                    i11 = R$id.travelServiceBlockV4PricePV;
                                    PriceView priceView = (PriceView) C2548q.d(i11, view);
                                    if (priceView != null) {
                                        i11 = R$id.travelServiceBlockV4PriceSuffixTAV;
                                        TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                                        if (textAtomView2 != null) {
                                            i11 = R$id.travelServiceBlockV4TitleBarrier;
                                            Barrier barrier2 = (Barrier) C2548q.d(i11, view);
                                            if (barrier2 != null) {
                                                i11 = R$id.travelServiceBlockV4TitleTAV;
                                                TextAtomView textAtomView3 = (TextAtomView) C2548q.d(i11, view);
                                                if (textAtomView3 != null) {
                                                    return new ViewServiceBlockV4Binding(view, recyclerView, smallBorderlessButtonView, travelBadgeV2ListView, smallButtonView, textAtomView, barrier, group, priceView, textAtomView2, barrier2, textAtomView3);
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
    public static ViewServiceBlockV4Binding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.view_service_block_v4, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public View getConstraintLayout() {
        return this.rootView;
    }
}
