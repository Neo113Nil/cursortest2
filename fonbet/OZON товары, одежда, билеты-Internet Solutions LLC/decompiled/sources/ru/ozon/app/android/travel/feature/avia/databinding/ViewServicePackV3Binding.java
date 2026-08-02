package ru.ozon.app.android.travel.feature.avia.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.travel.feature.avia.R$id;
import ru.ozon.app.android.travel.feature.avia.R$layout;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.view.atoms.price.PriceView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes8.dex */
public final class ViewServicePackV3Binding implements a {

    @NonNull
    private final View rootView;

    @NonNull
    public final ImageView travelServicePackV3PremiumIV;

    @NonNull
    public final PriceView travelServicePackV3PricePV;

    @NonNull
    public final BadgeView travelServicePackV3RecommendedBadgeBV;

    @NonNull
    public final TextAtomView travelServicePackV3TitleTAV;

    private ViewServicePackV3Binding(@NonNull View view, @NonNull ImageView imageView, @NonNull PriceView priceView, @NonNull BadgeView badgeView, @NonNull TextAtomView textAtomView) {
        this.rootView = view;
        this.travelServicePackV3PremiumIV = imageView;
        this.travelServicePackV3PricePV = priceView;
        this.travelServicePackV3RecommendedBadgeBV = badgeView;
        this.travelServicePackV3TitleTAV = textAtomView;
    }

    @NonNull
    public static ViewServicePackV3Binding bind(@NonNull View view) {
        int i11 = R$id.travelServicePackV3PremiumIV;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.travelServicePackV3PricePV;
            PriceView priceView = (PriceView) C2548q.d(i11, view);
            if (priceView != null) {
                i11 = R$id.travelServicePackV3RecommendedBadgeBV;
                BadgeView badgeView = (BadgeView) C2548q.d(i11, view);
                if (badgeView != null) {
                    i11 = R$id.travelServicePackV3TitleTAV;
                    TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                    if (textAtomView != null) {
                        return new ViewServicePackV3Binding(view, imageView, priceView, badgeView, textAtomView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ViewServicePackV3Binding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.view_service_pack_v3, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public View getConstraintLayout() {
        return this.rootView;
    }
}
