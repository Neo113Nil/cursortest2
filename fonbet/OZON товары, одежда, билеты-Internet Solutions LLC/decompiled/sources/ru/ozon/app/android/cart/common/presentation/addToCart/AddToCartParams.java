package ru.ozon.app.android.cart.common.presentation.addToCart;

import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001cB/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\tHÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/cart/common/presentation/addToCart/AddToCartParams;", "", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, "Lru/ozon/app/android/cart/common/presentation/addToCart/AddToCartProductInfo;", "tracking", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "settings", "Lru/ozon/app/android/cart/common/presentation/addToCart/AddToCartParams$Settings;", "<init>", "(Lru/ozon/app/android/cart/common/presentation/addToCart/AddToCartProductInfo;Ljava/util/Map;Lru/ozon/app/android/cart/common/presentation/addToCart/AddToCartParams$Settings;)V", "getProduct", "()Lru/ozon/app/android/cart/common/presentation/addToCart/AddToCartProductInfo;", "getTracking", "()Ljava/util/Map;", "getSettings", "()Lru/ozon/app/android/cart/common/presentation/addToCart/AddToCartParams$Settings;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Settings", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AddToCartParams {

    @NotNull
    private final AddToCartProductInfo product;
    private final Settings settings;
    private final Map<String, TokenizedTrackingInfo> tracking;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/cart/common/presentation/addToCart/AddToCartParams$Settings;", "", "refreshCartPage", "", "showErrorNotification", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "<init>", "(Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "getRefreshCartPage", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getShowErrorNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "component1", "component2", "copy", "(Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/notification/NotificationDTO;)Lru/ozon/app/android/cart/common/presentation/addToCart/AddToCartParams$Settings;", "equals", "other", "hashCode", "", "toString", "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Settings {
        private final Boolean refreshCartPage;
        private final NotificationDTO showErrorNotification;

        public Settings(Boolean bool, NotificationDTO notificationDTO) {
            this.refreshCartPage = bool;
            this.showErrorNotification = notificationDTO;
        }

        public static /* synthetic */ Settings copy$default(Settings settings, Boolean bool, NotificationDTO notificationDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                bool = settings.refreshCartPage;
            }
            if ((i11 & 2) != 0) {
                notificationDTO = settings.showErrorNotification;
            }
            return settings.copy(bool, notificationDTO);
        }

        /* renamed from: component1, reason: from getter */
        public final Boolean getRefreshCartPage() {
            return this.refreshCartPage;
        }

        /* renamed from: component2, reason: from getter */
        public final NotificationDTO getShowErrorNotification() {
            return this.showErrorNotification;
        }

        @NotNull
        public final Settings copy(Boolean refreshCartPage, NotificationDTO showErrorNotification) {
            return new Settings(refreshCartPage, showErrorNotification);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Settings)) {
                return false;
            }
            Settings settings = (Settings) other;
            return Intrinsics.d(this.refreshCartPage, settings.refreshCartPage) && Intrinsics.d(this.showErrorNotification, settings.showErrorNotification);
        }

        public final Boolean getRefreshCartPage() {
            return this.refreshCartPage;
        }

        public final NotificationDTO getShowErrorNotification() {
            return this.showErrorNotification;
        }

        public int hashCode() {
            Boolean bool = this.refreshCartPage;
            int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            NotificationDTO notificationDTO = this.showErrorNotification;
            return hashCode + (notificationDTO != null ? notificationDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Settings(refreshCartPage=" + this.refreshCartPage + ", showErrorNotification=" + this.showErrorNotification + ")";
        }
    }

    public AddToCartParams(@NotNull AddToCartProductInfo product, Map<String, TokenizedTrackingInfo> map, Settings settings) {
        Intrinsics.checkNotNullParameter(product, "product");
        this.product = product;
        this.tracking = map;
        this.settings = settings;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddToCartParams copy$default(AddToCartParams addToCartParams, AddToCartProductInfo addToCartProductInfo, Map map, Settings settings, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            addToCartProductInfo = addToCartParams.product;
        }
        if ((i11 & 2) != 0) {
            map = addToCartParams.tracking;
        }
        if ((i11 & 4) != 0) {
            settings = addToCartParams.settings;
        }
        return addToCartParams.copy(addToCartProductInfo, map, settings);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final AddToCartProductInfo getProduct() {
        return this.product;
    }

    public final Map<String, TokenizedTrackingInfo> component2() {
        return this.tracking;
    }

    /* renamed from: component3, reason: from getter */
    public final Settings getSettings() {
        return this.settings;
    }

    @NotNull
    public final AddToCartParams copy(@NotNull AddToCartProductInfo product, Map<String, TokenizedTrackingInfo> tracking, Settings settings) {
        Intrinsics.checkNotNullParameter(product, "product");
        return new AddToCartParams(product, tracking, settings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddToCartParams)) {
            return false;
        }
        AddToCartParams addToCartParams = (AddToCartParams) other;
        return Intrinsics.d(this.product, addToCartParams.product) && Intrinsics.d(this.tracking, addToCartParams.tracking) && Intrinsics.d(this.settings, addToCartParams.settings);
    }

    @NotNull
    public final AddToCartProductInfo getProduct() {
        return this.product;
    }

    public final Settings getSettings() {
        return this.settings;
    }

    public final Map<String, TokenizedTrackingInfo> getTracking() {
        return this.tracking;
    }

    public int hashCode() {
        int hashCode = this.product.hashCode() * 31;
        Map<String, TokenizedTrackingInfo> map = this.tracking;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        Settings settings = this.settings;
        return hashCode2 + (settings != null ? settings.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AddToCartParams(product=" + this.product + ", tracking=" + this.tracking + ", settings=" + this.settings + ")";
    }
}
