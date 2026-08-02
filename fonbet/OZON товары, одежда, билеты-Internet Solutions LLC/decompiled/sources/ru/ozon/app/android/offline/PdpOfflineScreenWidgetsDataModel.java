package ru.ozon.app.android.offline;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0002\u000e\u000fR\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/offline/PdpOfflineScreenWidgetsDataModel;", "", "productImageUrl", "", "getProductImageUrl", "()Ljava/lang/String;", "productPrice", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "getProductPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "productName", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getProductName", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "Empty", "Base", "offline_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface PdpOfflineScreenWidgetsDataModel {

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/offline/PdpOfflineScreenWidgetsDataModel$Base;", "Lru/ozon/app/android/offline/PdpOfflineScreenWidgetsDataModel;", "", "productImageUrl", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "productPrice", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "productName", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/utils/OzonSpannableString;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getProductImageUrl", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "getProductPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getProductName", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "offline_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final /* data */ class Base implements PdpOfflineScreenWidgetsDataModel {
        private final String productImageUrl;
        private final OzonSpannableString productName;
        private final PriceDTO productPrice;

        public Base(String str, PriceDTO priceDTO, OzonSpannableString ozonSpannableString) {
            this.productImageUrl = str;
            this.productPrice = priceDTO;
            this.productName = ozonSpannableString;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Base)) {
                return false;
            }
            Base base = (Base) other;
            return Intrinsics.d(this.productImageUrl, base.productImageUrl) && Intrinsics.d(this.productPrice, base.productPrice) && Intrinsics.d(this.productName, base.productName);
        }

        @Override // ru.ozon.app.android.offline.PdpOfflineScreenWidgetsDataModel
        public String getProductImageUrl() {
            return this.productImageUrl;
        }

        @Override // ru.ozon.app.android.offline.PdpOfflineScreenWidgetsDataModel
        public OzonSpannableString getProductName() {
            return this.productName;
        }

        @Override // ru.ozon.app.android.offline.PdpOfflineScreenWidgetsDataModel
        public PriceDTO getProductPrice() {
            return this.productPrice;
        }

        public int hashCode() {
            String str = this.productImageUrl;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            PriceDTO priceDTO = this.productPrice;
            int hashCode2 = (hashCode + (priceDTO == null ? 0 : priceDTO.hashCode())) * 31;
            OzonSpannableString ozonSpannableString = this.productName;
            return hashCode2 + (ozonSpannableString != null ? ozonSpannableString.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Base(productImageUrl=" + this.productImageUrl + ", productPrice=" + this.productPrice + ", productName=" + ((Object) this.productName) + ")";
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/offline/PdpOfflineScreenWidgetsDataModel$Empty;", "Lru/ozon/app/android/offline/PdpOfflineScreenWidgetsDataModel;", "<init>", "()V", "productImageUrl", "", "getProductImageUrl", "()Ljava/lang/String;", "productPrice", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "getProductPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "productName", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getProductName", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "equals", "", "other", "", "hashCode", "", "toString", "offline_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Empty implements PdpOfflineScreenWidgetsDataModel {

        @NotNull
        public static final Empty INSTANCE = new Empty();
        private static final String productImageUrl = null;
        private static final OzonSpannableString productName = null;
        private static final PriceDTO productPrice = null;

        private Empty() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Empty);
        }

        @Override // ru.ozon.app.android.offline.PdpOfflineScreenWidgetsDataModel
        public String getProductImageUrl() {
            return productImageUrl;
        }

        @Override // ru.ozon.app.android.offline.PdpOfflineScreenWidgetsDataModel
        public OzonSpannableString getProductName() {
            return productName;
        }

        @Override // ru.ozon.app.android.offline.PdpOfflineScreenWidgetsDataModel
        public PriceDTO getProductPrice() {
            return productPrice;
        }

        public int hashCode() {
            return -1006478350;
        }

        @NotNull
        public String toString() {
            return "Empty";
        }
    }

    String getProductImageUrl();

    OzonSpannableString getProductName();

    PriceDTO getProductPrice();
}
