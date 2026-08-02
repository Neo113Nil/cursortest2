package ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v2.data;

import De.C2859b;
import El.C2971a;
import Fm.C3051a;
import G.g;
import Ns.b;
import T7.P;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.returns.ui.molecules.checkbox.RmsCheckbox;
import ru.ozon.app.android.returns.ui.molecules.quantitySelector.RmsQuantitySelector;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001dB3\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\u0017\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\tHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/data/ProductsInBotV2DTO;", "", "items", "", "Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/data/ProductsInBotV2DTO$ItemDTO;", "button", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/util/Map;)V", "getItems", "()Ljava/util/List;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "ItemDTO", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ProductsInBotV2DTO {
    public static final int $stable = 8;

    @NotNull
    private final ButtonV3DTO button;

    @NotNull
    private final List<ItemDTO> items;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b*\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0005HÆ\u0003J\t\u00101\u001a\u00020\u0007HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u00103\u001a\u00020\nHÆ\u0003J\t\u00104\u001a\u00020\fHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0010\u00106\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010'J\u000b\u00107\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u0010\u00109\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0002\u0010-J\u0088\u0001\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÆ\u0001¢\u0006\u0002\u0010;J\u0013\u0010<\u001a\u00020\u00162\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010>\u001a\u00020\u0010HÖ\u0001J\t\u0010?\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010(\u001a\u0004\b&\u0010'R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0002\u0010.\u001a\u0004\b\u0015\u0010-¨\u0006@"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/data/ProductsInBotV2DTO$ItemDTO;", "", "checkbox", "Lru/ozon/app/android/returns/ui/molecules/checkbox/RmsCheckbox;", "skuId", "", "image", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "privateIcon", "price", "Lru/ozon/uni/atoms/data/price/PriceDTO;", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "quantitySelector", "Lru/ozon/app/android/returns/ui/molecules/quantitySelector/RmsQuantitySelector;", "maxQuantity", "", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "isDisabled", "", "<init>", "(Lru/ozon/app/android/returns/ui/molecules/checkbox/RmsCheckbox;Ljava/lang/String;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/returns/ui/molecules/quantitySelector/RmsQuantitySelector;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Ljava/lang/Boolean;)V", "getCheckbox", "()Lru/ozon/app/android/returns/ui/molecules/checkbox/RmsCheckbox;", "getSkuId", "()Ljava/lang/String;", "getImage", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getPrivateIcon", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "getName", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getQuantitySelector", "()Lru/ozon/app/android/returns/ui/molecules/quantitySelector/RmsQuantitySelector;", "getMaxQuantity", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Lru/ozon/app/android/returns/ui/molecules/checkbox/RmsCheckbox;Ljava/lang/String;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/returns/ui/molecules/quantitySelector/RmsQuantitySelector;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Ljava/lang/Boolean;)Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/data/ProductsInBotV2DTO$ItemDTO;", "equals", "other", "hashCode", "toString", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ItemDTO {
        public static final int $stable = 8;
        private final BadgeDTO badge;

        @NotNull
        private final RmsCheckbox checkbox;
        private final CommonControlSettings common;

        @NotNull
        private final IconDTO image;
        private final Boolean isDisabled;
        private final Integer maxQuantity;

        @NotNull
        private final TextDTO name;

        @NotNull
        private final PriceDTO price;
        private final IconDTO privateIcon;
        private final RmsQuantitySelector quantitySelector;

        @NotNull
        private final String skuId;

        public ItemDTO(@NotNull RmsCheckbox checkbox, @NotNull String skuId, @NotNull IconDTO image, IconDTO iconDTO, @NotNull PriceDTO price, @NotNull TextDTO name, RmsQuantitySelector rmsQuantitySelector, Integer num, BadgeDTO badgeDTO, CommonControlSettings commonControlSettings, Boolean bool) {
            Intrinsics.checkNotNullParameter(checkbox, "checkbox");
            Intrinsics.checkNotNullParameter(skuId, "skuId");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(name, "name");
            this.checkbox = checkbox;
            this.skuId = skuId;
            this.image = image;
            this.privateIcon = iconDTO;
            this.price = price;
            this.name = name;
            this.quantitySelector = rmsQuantitySelector;
            this.maxQuantity = num;
            this.badge = badgeDTO;
            this.common = commonControlSettings;
            this.isDisabled = bool;
        }

        public static /* synthetic */ ItemDTO copy$default(ItemDTO itemDTO, RmsCheckbox rmsCheckbox, String str, IconDTO iconDTO, IconDTO iconDTO2, PriceDTO priceDTO, TextDTO textDTO, RmsQuantitySelector rmsQuantitySelector, Integer num, BadgeDTO badgeDTO, CommonControlSettings commonControlSettings, Boolean bool, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                rmsCheckbox = itemDTO.checkbox;
            }
            if ((i11 & 2) != 0) {
                str = itemDTO.skuId;
            }
            if ((i11 & 4) != 0) {
                iconDTO = itemDTO.image;
            }
            if ((i11 & 8) != 0) {
                iconDTO2 = itemDTO.privateIcon;
            }
            if ((i11 & 16) != 0) {
                priceDTO = itemDTO.price;
            }
            if ((i11 & 32) != 0) {
                textDTO = itemDTO.name;
            }
            if ((i11 & 64) != 0) {
                rmsQuantitySelector = itemDTO.quantitySelector;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                num = itemDTO.maxQuantity;
            }
            if ((i11 & 256) != 0) {
                badgeDTO = itemDTO.badge;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                commonControlSettings = itemDTO.common;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                bool = itemDTO.isDisabled;
            }
            CommonControlSettings commonControlSettings2 = commonControlSettings;
            Boolean bool2 = bool;
            Integer num2 = num;
            BadgeDTO badgeDTO2 = badgeDTO;
            TextDTO textDTO2 = textDTO;
            RmsQuantitySelector rmsQuantitySelector2 = rmsQuantitySelector;
            PriceDTO priceDTO2 = priceDTO;
            IconDTO iconDTO3 = iconDTO;
            return itemDTO.copy(rmsCheckbox, str, iconDTO3, iconDTO2, priceDTO2, textDTO2, rmsQuantitySelector2, num2, badgeDTO2, commonControlSettings2, bool2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final RmsCheckbox getCheckbox() {
            return this.checkbox;
        }

        /* renamed from: component10, reason: from getter */
        public final CommonControlSettings getCommon() {
            return this.common;
        }

        /* renamed from: component11, reason: from getter */
        public final Boolean getIsDisabled() {
            return this.isDisabled;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getSkuId() {
            return this.skuId;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final IconDTO getImage() {
            return this.image;
        }

        /* renamed from: component4, reason: from getter */
        public final IconDTO getPrivateIcon() {
            return this.privateIcon;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final PriceDTO getPrice() {
            return this.price;
        }

        @NotNull
        /* renamed from: component6, reason: from getter */
        public final TextDTO getName() {
            return this.name;
        }

        /* renamed from: component7, reason: from getter */
        public final RmsQuantitySelector getQuantitySelector() {
            return this.quantitySelector;
        }

        /* renamed from: component8, reason: from getter */
        public final Integer getMaxQuantity() {
            return this.maxQuantity;
        }

        /* renamed from: component9, reason: from getter */
        public final BadgeDTO getBadge() {
            return this.badge;
        }

        @NotNull
        public final ItemDTO copy(@NotNull RmsCheckbox checkbox, @NotNull String skuId, @NotNull IconDTO image, IconDTO privateIcon, @NotNull PriceDTO price, @NotNull TextDTO name, RmsQuantitySelector quantitySelector, Integer maxQuantity, BadgeDTO badge, CommonControlSettings common, Boolean isDisabled) {
            Intrinsics.checkNotNullParameter(checkbox, "checkbox");
            Intrinsics.checkNotNullParameter(skuId, "skuId");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(name, "name");
            return new ItemDTO(checkbox, skuId, image, privateIcon, price, name, quantitySelector, maxQuantity, badge, common, isDisabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ItemDTO)) {
                return false;
            }
            ItemDTO itemDTO = (ItemDTO) other;
            return Intrinsics.d(this.checkbox, itemDTO.checkbox) && Intrinsics.d(this.skuId, itemDTO.skuId) && Intrinsics.d(this.image, itemDTO.image) && Intrinsics.d(this.privateIcon, itemDTO.privateIcon) && Intrinsics.d(this.price, itemDTO.price) && Intrinsics.d(this.name, itemDTO.name) && Intrinsics.d(this.quantitySelector, itemDTO.quantitySelector) && Intrinsics.d(this.maxQuantity, itemDTO.maxQuantity) && Intrinsics.d(this.badge, itemDTO.badge) && Intrinsics.d(this.common, itemDTO.common) && Intrinsics.d(this.isDisabled, itemDTO.isDisabled);
        }

        public final BadgeDTO getBadge() {
            return this.badge;
        }

        @NotNull
        public final RmsCheckbox getCheckbox() {
            return this.checkbox;
        }

        public final CommonControlSettings getCommon() {
            return this.common;
        }

        @NotNull
        public final IconDTO getImage() {
            return this.image;
        }

        public final Integer getMaxQuantity() {
            return this.maxQuantity;
        }

        @NotNull
        public final TextDTO getName() {
            return this.name;
        }

        @NotNull
        public final PriceDTO getPrice() {
            return this.price;
        }

        public final IconDTO getPrivateIcon() {
            return this.privateIcon;
        }

        public final RmsQuantitySelector getQuantitySelector() {
            return this.quantitySelector;
        }

        @NotNull
        public final String getSkuId() {
            return this.skuId;
        }

        public int hashCode() {
            int a11 = C2971a.a(this.image, g.a(this.checkbox.hashCode() * 31, 31, this.skuId), 31);
            IconDTO iconDTO = this.privateIcon;
            int a12 = b.a(this.name, C3051a.b(this.price, (a11 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31, 31), 31);
            RmsQuantitySelector rmsQuantitySelector = this.quantitySelector;
            int hashCode = (a12 + (rmsQuantitySelector == null ? 0 : rmsQuantitySelector.hashCode())) * 31;
            Integer num = this.maxQuantity;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            BadgeDTO badgeDTO = this.badge;
            int hashCode3 = (hashCode2 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
            CommonControlSettings commonControlSettings = this.common;
            int hashCode4 = (hashCode3 + (commonControlSettings == null ? 0 : commonControlSettings.hashCode())) * 31;
            Boolean bool = this.isDisabled;
            return hashCode4 + (bool != null ? bool.hashCode() : 0);
        }

        public final Boolean isDisabled() {
            return this.isDisabled;
        }

        @NotNull
        public String toString() {
            RmsCheckbox rmsCheckbox = this.checkbox;
            String str = this.skuId;
            IconDTO iconDTO = this.image;
            IconDTO iconDTO2 = this.privateIcon;
            PriceDTO priceDTO = this.price;
            TextDTO textDTO = this.name;
            RmsQuantitySelector rmsQuantitySelector = this.quantitySelector;
            Integer num = this.maxQuantity;
            BadgeDTO badgeDTO = this.badge;
            CommonControlSettings commonControlSettings = this.common;
            Boolean bool = this.isDisabled;
            StringBuilder sb2 = new StringBuilder("ItemDTO(checkbox=");
            sb2.append(rmsCheckbox);
            sb2.append(", skuId=");
            sb2.append(str);
            sb2.append(", image=");
            sb2.append(iconDTO);
            sb2.append(", privateIcon=");
            sb2.append(iconDTO2);
            sb2.append(", price=");
            sb2.append(priceDTO);
            sb2.append(", name=");
            sb2.append(textDTO);
            sb2.append(", quantitySelector=");
            sb2.append(rmsQuantitySelector);
            sb2.append(", maxQuantity=");
            sb2.append(num);
            sb2.append(", badge=");
            sb2.append(badgeDTO);
            sb2.append(", common=");
            sb2.append(commonControlSettings);
            sb2.append(", isDisabled=");
            return D3.g.d(sb2, bool, ")");
        }
    }

    public ProductsInBotV2DTO(@NotNull List<ItemDTO> items, @NotNull ButtonV3DTO button, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(button, "button");
        this.items = items;
        this.button = button;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProductsInBotV2DTO copy$default(ProductsInBotV2DTO productsInBotV2DTO, List list, ButtonV3DTO buttonV3DTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = productsInBotV2DTO.items;
        }
        if ((i11 & 2) != 0) {
            buttonV3DTO = productsInBotV2DTO.button;
        }
        if ((i11 & 4) != 0) {
            map = productsInBotV2DTO.trackingInfo;
        }
        return productsInBotV2DTO.copy(list, buttonV3DTO, map);
    }

    @NotNull
    public final List<ItemDTO> component1() {
        return this.items;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ButtonV3DTO getButton() {
        return this.button;
    }

    public final Map<String, TokenizedTrackingInfo> component3() {
        return this.trackingInfo;
    }

    @NotNull
    public final ProductsInBotV2DTO copy(@NotNull List<ItemDTO> items, @NotNull ButtonV3DTO button, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(button, "button");
        return new ProductsInBotV2DTO(items, button, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductsInBotV2DTO)) {
            return false;
        }
        ProductsInBotV2DTO productsInBotV2DTO = (ProductsInBotV2DTO) other;
        return Intrinsics.d(this.items, productsInBotV2DTO.items) && Intrinsics.d(this.button, productsInBotV2DTO.button) && Intrinsics.d(this.trackingInfo, productsInBotV2DTO.trackingInfo);
    }

    @NotNull
    public final ButtonV3DTO getButton() {
        return this.button;
    }

    @NotNull
    public final List<ItemDTO> getItems() {
        return this.items;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int c11 = C2859b.c(this.button, this.items.hashCode() * 31, 31);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return c11 + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        List<ItemDTO> list = this.items;
        ButtonV3DTO buttonV3DTO = this.button;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("ProductsInBotV2DTO(items=");
        sb2.append(list);
        sb2.append(", button=");
        sb2.append(buttonV3DTO);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }
}
