package ru.ozon.app.android.travel.feature.general.booking.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import ru.ozon.app.android.travel.feature.general.booking.R$id;
import ru.ozon.app.android.travel.feature.general.booking.R$layout;
import ru.ozon.uni.android.atom.aspect.AspectView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes3.dex */
public final class ItemAdditionalServicesTariffBinding implements a {

    @NonNull
    public final AspectView additionalServiceAspectAV;

    @NonNull
    public final TextAtomV2View additionalServiceSubtitleTAV;

    @NonNull
    public final TextAtomV2View additionalServiceTitleTAV;

    @NonNull
    private final AspectView rootView;

    private ItemAdditionalServicesTariffBinding(@NonNull AspectView aspectView, @NonNull AspectView aspectView2, @NonNull TextAtomV2View textAtomV2View, @NonNull TextAtomV2View textAtomV2View2) {
        this.rootView = aspectView;
        this.additionalServiceAspectAV = aspectView2;
        this.additionalServiceSubtitleTAV = textAtomV2View;
        this.additionalServiceTitleTAV = textAtomV2View2;
    }

    @NonNull
    public static ItemAdditionalServicesTariffBinding bind(@NonNull View view) {
        AspectView aspectView = (AspectView) view;
        int i11 = R$id.additionalServiceSubtitleTAV;
        TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
        if (textAtomV2View != null) {
            i11 = R$id.additionalServiceTitleTAV;
            TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
            if (textAtomV2View2 != null) {
                return new ItemAdditionalServicesTariffBinding(aspectView, aspectView, textAtomV2View, textAtomV2View2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemAdditionalServicesTariffBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_additional_services_tariff, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public AspectView getConstraintLayout() {
        return this.rootView;
    }
}
