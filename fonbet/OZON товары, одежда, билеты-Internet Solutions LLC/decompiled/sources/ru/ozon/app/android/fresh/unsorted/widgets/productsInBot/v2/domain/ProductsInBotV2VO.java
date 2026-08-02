package ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v2.domain;

import De.C2859b;
import El.C2971a;
import Fm.C3051a;
import G.g;
import Ns.b;
import WZ.t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.ui.molecules.checkbox.RmsCheckbox;
import ru.ozon.app.android.returns.ui.molecules.quantitySelector.RmsQuantitySelector;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0081\b\u0018\u00002\u00020\u0001:\u0001'B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n¢\u0006\u0004\b\f\u0010\rJF\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010#R\u001f\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/domain/ProductsInBotV2VO;", "Ll20/c;", "", "id", "", "Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/domain/ProductsInBotV2VO$ItemVO;", "items", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLjava/util/List;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;LWZ/t;)V", "copy", "(JLjava/util/List;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;LWZ/t;)Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/domain/ProductsInBotV2VO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "ItemVO", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ProductsInBotV2VO implements c {

    @NotNull
    private final ButtonV3DTO button;
    private final long id;

    @NotNull
    private final List<ItemVO> items;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b)\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u000e\u0010\u0015\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u008e\u0001\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010\u0015\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u0016HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u00162\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b-\u0010,R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00101\u001a\u0004\b2\u00103R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010:\u001a\u0004\b;\u0010<R\u001f\u0010\u0015\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010@\u001a\u0004\b\u0017\u0010AR\u0017\u0010B\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010 ¨\u0006E"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/domain/ProductsInBotV2VO$ItemVO;", "", "Lru/ozon/app/android/returns/ui/molecules/checkbox/RmsCheckbox;", "checkbox", "", "skuId", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "image", "privateIcon", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "price", "Lru/ozon/uni/atoms/data/text/TextDTO;", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lru/ozon/app/android/returns/ui/molecules/quantitySelector/RmsQuantitySelector;", "quantitySelector", "", "maxQuantity", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "trackingInfo", "", "isDisabled", "<init>", "(Lru/ozon/app/android/returns/ui/molecules/checkbox/RmsCheckbox;JLru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/returns/ui/molecules/quantitySelector/RmsQuantitySelector;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;LWZ/t;Z)V", "copy", "(Lru/ozon/app/android/returns/ui/molecules/checkbox/RmsCheckbox;JLru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/returns/ui/molecules/quantitySelector/RmsQuantitySelector;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;LWZ/t;Z)Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/domain/ProductsInBotV2VO$ItemVO;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/returns/ui/molecules/checkbox/RmsCheckbox;", "getCheckbox", "()Lru/ozon/app/android/returns/ui/molecules/checkbox/RmsCheckbox;", "J", "getSkuId", "()J", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getImage", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getPrivateIcon", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getName", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/app/android/returns/ui/molecules/quantitySelector/RmsQuantitySelector;", "getQuantitySelector", "()Lru/ozon/app/android/returns/ui/molecules/quantitySelector/RmsQuantitySelector;", "Ljava/lang/Integer;", "getMaxQuantity", "()Ljava/lang/Integer;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "LWZ/t;", "getTrackingInfo", "()LWZ/t;", "Z", "()Z", "currentQuantity", "I", "getCurrentQuantity", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ItemVO {
        private final BadgeDTO badge;

        @NotNull
        private final RmsCheckbox checkbox;
        private final int currentQuantity;

        @NotNull
        private final IconDTO image;
        private final boolean isDisabled;
        private final Integer maxQuantity;

        @NotNull
        private final TextDTO name;

        @NotNull
        private final PriceDTO price;
        private final IconDTO privateIcon;
        private final RmsQuantitySelector quantitySelector;
        private final long skuId;
        private final t trackingInfo;

        public ItemVO(@NotNull RmsCheckbox checkbox, long j11, @NotNull IconDTO image, IconDTO iconDTO, @NotNull PriceDTO price, @NotNull TextDTO name, RmsQuantitySelector rmsQuantitySelector, Integer num, BadgeDTO badgeDTO, t tVar, boolean z11) {
            TextDTO quantity;
            OzonSpannableString text;
            String obj;
            Intrinsics.checkNotNullParameter(checkbox, "checkbox");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(name, "name");
            this.checkbox = checkbox;
            this.skuId = j11;
            this.image = image;
            this.privateIcon = iconDTO;
            this.price = price;
            this.name = name;
            this.quantitySelector = rmsQuantitySelector;
            this.maxQuantity = num;
            this.badge = badgeDTO;
            this.trackingInfo = tVar;
            this.isDisabled = z11;
            this.currentQuantity = (rmsQuantitySelector == null || (quantity = rmsQuantitySelector.getQuantity()) == null || (text = quantity.getText()) == null || (obj = text.toString()) == null) ? 1 : Integer.parseInt(obj);
        }

        public static /* synthetic */ ItemVO copy$default(ItemVO itemVO, RmsCheckbox rmsCheckbox, long j11, IconDTO iconDTO, IconDTO iconDTO2, PriceDTO priceDTO, TextDTO textDTO, RmsQuantitySelector rmsQuantitySelector, Integer num, BadgeDTO badgeDTO, t tVar, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                rmsCheckbox = itemVO.checkbox;
            }
            if ((i11 & 2) != 0) {
                j11 = itemVO.skuId;
            }
            if ((i11 & 4) != 0) {
                iconDTO = itemVO.image;
            }
            if ((i11 & 8) != 0) {
                iconDTO2 = itemVO.privateIcon;
            }
            if ((i11 & 16) != 0) {
                priceDTO = itemVO.price;
            }
            if ((i11 & 32) != 0) {
                textDTO = itemVO.name;
            }
            if ((i11 & 64) != 0) {
                rmsQuantitySelector = itemVO.quantitySelector;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                num = itemVO.maxQuantity;
            }
            if ((i11 & 256) != 0) {
                badgeDTO = itemVO.badge;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                tVar = itemVO.trackingInfo;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                z11 = itemVO.isDisabled;
            }
            t tVar2 = tVar;
            boolean z12 = z11;
            Integer num2 = num;
            BadgeDTO badgeDTO2 = badgeDTO;
            RmsQuantitySelector rmsQuantitySelector2 = rmsQuantitySelector;
            PriceDTO priceDTO2 = priceDTO;
            IconDTO iconDTO3 = iconDTO;
            return itemVO.copy(rmsCheckbox, j11, iconDTO3, iconDTO2, priceDTO2, textDTO, rmsQuantitySelector2, num2, badgeDTO2, tVar2, z12);
        }

        @NotNull
        public final ItemVO copy(@NotNull RmsCheckbox checkbox, long skuId, @NotNull IconDTO image, IconDTO privateIcon, @NotNull PriceDTO price, @NotNull TextDTO name, RmsQuantitySelector quantitySelector, Integer maxQuantity, BadgeDTO badge, t trackingInfo, boolean isDisabled) {
            Intrinsics.checkNotNullParameter(checkbox, "checkbox");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(name, "name");
            return new ItemVO(checkbox, skuId, image, privateIcon, price, name, quantitySelector, maxQuantity, badge, trackingInfo, isDisabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ItemVO)) {
                return false;
            }
            ItemVO itemVO = (ItemVO) other;
            return Intrinsics.d(this.checkbox, itemVO.checkbox) && this.skuId == itemVO.skuId && Intrinsics.d(this.image, itemVO.image) && Intrinsics.d(this.privateIcon, itemVO.privateIcon) && Intrinsics.d(this.price, itemVO.price) && Intrinsics.d(this.name, itemVO.name) && Intrinsics.d(this.quantitySelector, itemVO.quantitySelector) && Intrinsics.d(this.maxQuantity, itemVO.maxQuantity) && Intrinsics.d(this.badge, itemVO.badge) && Intrinsics.d(this.trackingInfo, itemVO.trackingInfo) && this.isDisabled == itemVO.isDisabled;
        }

        public final BadgeDTO getBadge() {
            return this.badge;
        }

        @NotNull
        public final RmsCheckbox getCheckbox() {
            return this.checkbox;
        }

        public final int getCurrentQuantity() {
            return this.currentQuantity;
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

        public final long getSkuId() {
            return this.skuId;
        }

        public final t getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int a11 = C2971a.a(this.image, Pk0.c.a(this.checkbox.hashCode() * 31, 31, this.skuId), 31);
            IconDTO iconDTO = this.privateIcon;
            int a12 = b.a(this.name, C3051a.b(this.price, (a11 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31, 31), 31);
            RmsQuantitySelector rmsQuantitySelector = this.quantitySelector;
            int hashCode = (a12 + (rmsQuantitySelector == null ? 0 : rmsQuantitySelector.hashCode())) * 31;
            Integer num = this.maxQuantity;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            BadgeDTO badgeDTO = this.badge;
            int hashCode3 = (hashCode2 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
            t tVar = this.trackingInfo;
            return Boolean.hashCode(this.isDisabled) + ((hashCode3 + (tVar != null ? tVar.hashCode() : 0)) * 31);
        }

        /* renamed from: isDisabled, reason: from getter */
        public final boolean getIsDisabled() {
            return this.isDisabled;
        }

        @NotNull
        public String toString() {
            RmsCheckbox rmsCheckbox = this.checkbox;
            long j11 = this.skuId;
            IconDTO iconDTO = this.image;
            IconDTO iconDTO2 = this.privateIcon;
            PriceDTO priceDTO = this.price;
            TextDTO textDTO = this.name;
            RmsQuantitySelector rmsQuantitySelector = this.quantitySelector;
            Integer num = this.maxQuantity;
            BadgeDTO badgeDTO = this.badge;
            t tVar = this.trackingInfo;
            boolean z11 = this.isDisabled;
            StringBuilder sb2 = new StringBuilder("ItemVO(checkbox=");
            sb2.append(rmsCheckbox);
            sb2.append(", skuId=");
            sb2.append(j11);
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
            sb2.append(", trackingInfo=");
            sb2.append(tVar);
            return Bi.b.f(sb2, ", isDisabled=", z11, ")");
        }
    }

    public ProductsInBotV2VO(long j11, @NotNull List<ItemVO> items, @NotNull ButtonV3DTO button, t tVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(button, "button");
        this.id = j11;
        this.items = items;
        this.button = button;
        this.tokenizedEvent = tVar;
    }

    public static /* synthetic */ ProductsInBotV2VO copy$default(ProductsInBotV2VO productsInBotV2VO, long j11, List list, ButtonV3DTO buttonV3DTO, t tVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = productsInBotV2VO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            list = productsInBotV2VO.items;
        }
        List list2 = list;
        if ((i11 & 4) != 0) {
            buttonV3DTO = productsInBotV2VO.button;
        }
        ButtonV3DTO buttonV3DTO2 = buttonV3DTO;
        if ((i11 & 8) != 0) {
            tVar = productsInBotV2VO.tokenizedEvent;
        }
        return productsInBotV2VO.copy(j12, list2, buttonV3DTO2, tVar);
    }

    @NotNull
    public final ProductsInBotV2VO copy(long id2, @NotNull List<ItemVO> items, @NotNull ButtonV3DTO button, t tokenizedEvent) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(button, "button");
        return new ProductsInBotV2VO(id2, items, button, tokenizedEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductsInBotV2VO)) {
            return false;
        }
        ProductsInBotV2VO productsInBotV2VO = (ProductsInBotV2VO) other;
        return this.id == productsInBotV2VO.id && Intrinsics.d(this.items, productsInBotV2VO.items) && Intrinsics.d(this.button, productsInBotV2VO.button) && Intrinsics.d(this.tokenizedEvent, productsInBotV2VO.tokenizedEvent);
    }

    @NotNull
    public final ButtonV3DTO getButton() {
        return this.button;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<ItemVO> getItems() {
        return this.items;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int c11 = C2859b.c(this.button, g.b(Long.hashCode(this.id) * 31, 31, this.items), 31);
        t tVar = this.tokenizedEvent;
        return c11 + (tVar == null ? 0 : tVar.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<ItemVO> list = this.items;
        ButtonV3DTO buttonV3DTO = this.button;
        t tVar = this.tokenizedEvent;
        StringBuilder b11 = Lh.b.b(j11, "ProductsInBotV2VO(id=", ", items=", list);
        b11.append(", button=");
        b11.append(buttonV3DTO);
        b11.append(", tokenizedEvent=");
        b11.append(tVar);
        b11.append(")");
        return b11.toString();
    }
}
