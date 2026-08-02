package ru.ozon.app.android.offline;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\n\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\n\u0010\t\u001a\u0004\u0018\u00010\nH&J\n\u0010\u000b\u001a\u0004\u0018\u00010\fH&¨\u0006\r"}, d2 = {"Lru/ozon/app/android/offline/PdpOfflineScreenWidgetsData;", "", "save", "", "state", "Lru/ozon/app/android/offline/PdpOfflineScreenWidgetsDataModel;", "clear", "productImageUrl", "", "productPrice", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "productName", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "offline_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface PdpOfflineScreenWidgetsData {
    void clear();

    String productImageUrl();

    OzonSpannableString productName();

    PriceDTO productPrice();

    void save(@NotNull PdpOfflineScreenWidgetsDataModel state);
}
