package ru.ozon.app.android.pdp.widgets.priceBlock.priceV2.presentation.price;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.pdp.price.ExtendedPrice;
import ru.ozon.app.android.pdp.ui.configurators.pdp.price.ExtendedPriceView;
import ru.ozon.app.android.pdp.ui.configurators.pdp.price.PriceV2VO$AccentPrice;

@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a:\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0000\u001a:\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0000¨\u0006\r"}, d2 = {"bind", "", "Lru/ozon/app/android/pdp/ui/configurators/pdp/price/ExtendedPriceView;", "price", "Lru/ozon/app/android/pdp/ui/configurators/pdp/price/ExtendedPrice;", "topOffset", "", "leftOffset", "bottomOffset", "priceLocator", "", "accentPrice", "Lru/ozon/app/android/pdp/ui/configurators/pdp/price/PriceV2VO$AccentPrice;", "pdp_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ExtendedPriceViewExtKt {
    public static final void bind(@NotNull ExtendedPriceView extendedPriceView, @NotNull ExtendedPrice price, int i11, int i12, int i13, @NotNull String priceLocator) {
        Intrinsics.checkNotNullParameter(extendedPriceView, "<this>");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(priceLocator, "priceLocator");
        extendedPriceView.setViewState(new ExtendedPriceView.ViewState(price, new ExtendedPriceView.ViewState.Offsets(i12, i11, i13), null, null, priceLocator));
    }

    public static /* synthetic */ void bind$default(ExtendedPriceView extendedPriceView, ExtendedPrice extendedPrice, int i11, int i12, int i13, String str, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i11 = 0;
        }
        if ((i14 & 4) != 0) {
            i12 = 0;
        }
        if ((i14 & 8) != 0) {
            i13 = 0;
        }
        bind(extendedPriceView, extendedPrice, i11, i12, i13, str);
    }

    public static /* synthetic */ void bind$default(ExtendedPriceView extendedPriceView, PriceV2VO$AccentPrice priceV2VO$AccentPrice, int i11, int i12, int i13, String str, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i11 = 0;
        }
        if ((i14 & 4) != 0) {
            i12 = 0;
        }
        if ((i14 & 8) != 0) {
            i13 = 0;
        }
        bind(extendedPriceView, priceV2VO$AccentPrice, i11, i12, i13, str);
    }

    public static final void bind(@NotNull ExtendedPriceView extendedPriceView, @NotNull PriceV2VO$AccentPrice accentPrice, int i11, int i12, int i13, @NotNull String priceLocator) {
        Intrinsics.checkNotNullParameter(extendedPriceView, "<this>");
        Intrinsics.checkNotNullParameter(accentPrice, "accentPrice");
        Intrinsics.checkNotNullParameter(priceLocator, "priceLocator");
        extendedPriceView.setViewState(new ExtendedPriceView.ViewState(accentPrice.getPrice(), new ExtendedPriceView.ViewState.Offsets(i12, i11, i13), accentPrice.getBackground(), new ExtendedPriceView.ViewState.Disclosure(accentPrice.getDisclosureTintColor()), priceLocator));
    }
}
