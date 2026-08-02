package ru.ozon.uni.atoms.data.price;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.atom.price.data.PricePreset;
import ru.ozon.uni.android.atom.price.data.PriceTextAppearance;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"pricePreset", "Lru/ozon/uni/android/atom/price/data/PricePreset;", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "getPricePreset", "(Lru/ozon/uni/atoms/data/price/PriceDTO;)Lru/ozon/uni/android/atom/price/data/PricePreset;", "textAppearance", "Lru/ozon/uni/android/atom/price/data/PriceTextAppearance;", "getTextAppearance", "(Lru/ozon/uni/atoms/data/price/PriceDTO;)Lru/ozon/uni/android/atom/price/data/PriceTextAppearance;", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PriceDTOKt {
    @NotNull
    public static final PricePreset getPricePreset(@NotNull PriceDTO priceDTO) {
        Intrinsics.checkNotNullParameter(priceDTO, "<this>");
        return priceDTO.getPreset().getSettings();
    }

    @NotNull
    public static final PriceTextAppearance getTextAppearance(@NotNull PriceDTO priceDTO) {
        Intrinsics.checkNotNullParameter(priceDTO, "<this>");
        return getPricePreset(priceDTO).getTextAppearance();
    }
}
