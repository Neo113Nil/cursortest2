package ru.ozon.app.android.offline;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.offline.PdpOfflineScreenWidgetsDataModel;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\n\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\n\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\n\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/offline/PdpOfflineScreenWidgetsDataImpl;", "Lru/ozon/app/android/offline/PdpOfflineScreenWidgetsData;", "<init>", "()V", "_state", "Lru/ozon/app/android/offline/PdpOfflineScreenWidgetsDataModel;", "save", "", "state", "clear", "productImageUrl", "", "productPrice", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "productName", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "offline_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PdpOfflineScreenWidgetsDataImpl implements PdpOfflineScreenWidgetsData {

    @NotNull
    private PdpOfflineScreenWidgetsDataModel _state = PdpOfflineScreenWidgetsDataModel.Empty.INSTANCE;

    @Override // ru.ozon.app.android.offline.PdpOfflineScreenWidgetsData
    public void clear() {
        this._state = PdpOfflineScreenWidgetsDataModel.Empty.INSTANCE;
    }

    @Override // ru.ozon.app.android.offline.PdpOfflineScreenWidgetsData
    public String productImageUrl() {
        return this._state.getProductImageUrl();
    }

    @Override // ru.ozon.app.android.offline.PdpOfflineScreenWidgetsData
    public OzonSpannableString productName() {
        return this._state.getProductName();
    }

    @Override // ru.ozon.app.android.offline.PdpOfflineScreenWidgetsData
    public PriceDTO productPrice() {
        return this._state.getProductPrice();
    }

    @Override // ru.ozon.app.android.offline.PdpOfflineScreenWidgetsData
    public void save(@NotNull PdpOfflineScreenWidgetsDataModel state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this._state = state;
    }
}
