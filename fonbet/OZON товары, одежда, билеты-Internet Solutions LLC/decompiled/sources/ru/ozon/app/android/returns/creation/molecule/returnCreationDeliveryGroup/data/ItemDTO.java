package ru.ozon.app.android.returns.creation.molecule.returnCreationDeliveryGroup.data;

import AZ.c;
import D40.d;
import Fm.C3051a;
import Ns.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.data.ImageDTO;
import ru.ozon.app.android.returns.ui.molecules.checkbox.RmsCheckbox;
import ru.ozon.app.android.returns.ui.molecules.quantitySelector.RmsQuantitySelector;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\t\u00104\u001a\u00020\u0007HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u0010\u0010<\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010-J\t\u0010=\u001a\u00020\u0017HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\rHÆ\u0003J¢\u0001\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010@J\u0013\u0010A\u001a\u00020\u00152\b\u0010B\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010C\u001a\u00020DHÖ\u0001J\t\u0010E\u001a\u00020FHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\n\n\u0002\u0010.\u001a\u0004\b\u0014\u0010-R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b1\u0010&¨\u0006G"}, d2 = {"Lru/ozon/app/android/returns/creation/molecule/returnCreationDeliveryGroup/data/ItemDTO;", "", "checkbox", "Lru/ozon/app/android/returns/ui/molecules/checkbox/RmsCheckbox;", "price", "Lru/ozon/uni/atoms/data/price/PriceDTO;", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "description", "dueDate", "quantitySelector", "Lru/ozon/app/android/returns/ui/molecules/quantitySelector/RmsQuantitySelector;", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "crossButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonDTO;", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "button", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "isDisabled", "", "itemImage", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/data/ImageDTO;", "sealBadge", "<init>", "(Lru/ozon/app/android/returns/ui/molecules/checkbox/RmsCheckbox;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/returns/ui/molecules/quantitySelector/RmsQuantitySelector;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/lang/Boolean;Lru/ozon/app/android/cscore/orderdetails/molecule/images/data/ImageDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "getCheckbox", "()Lru/ozon/app/android/returns/ui/molecules/checkbox/RmsCheckbox;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "getName", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getDescription", "getDueDate", "getQuantitySelector", "()Lru/ozon/app/android/returns/ui/molecules/quantitySelector/RmsQuantitySelector;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getCrossButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonDTO;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getItemImage", "()Lru/ozon/app/android/cscore/orderdetails/molecule/images/data/ImageDTO;", "getSealBadge", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Lru/ozon/app/android/returns/ui/molecules/checkbox/RmsCheckbox;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/returns/ui/molecules/quantitySelector/RmsQuantitySelector;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/lang/Boolean;Lru/ozon/app/android/cscore/orderdetails/molecule/images/data/ImageDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)Lru/ozon/app/android/returns/creation/molecule/returnCreationDeliveryGroup/data/ItemDTO;", "equals", "other", "hashCode", "", "toString", "", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ItemDTO {
    public static final int $stable = 8;
    private final BadgeDTO badge;
    private final ButtonV3DTO button;

    @NotNull
    private final RmsCheckbox checkbox;
    private final CommonControlSettings common;
    private final IconButtonDTO crossButton;
    private final TextDTO description;
    private final TextDTO dueDate;
    private final Boolean isDisabled;

    @NotNull
    private final ImageDTO itemImage;

    @NotNull
    private final TextDTO name;

    @NotNull
    private final PriceDTO price;
    private final RmsQuantitySelector quantitySelector;
    private final BadgeDTO sealBadge;

    public ItemDTO(@NotNull RmsCheckbox checkbox, @NotNull PriceDTO price, @NotNull TextDTO name, TextDTO textDTO, TextDTO textDTO2, RmsQuantitySelector rmsQuantitySelector, BadgeDTO badgeDTO, IconButtonDTO iconButtonDTO, CommonControlSettings commonControlSettings, ButtonV3DTO buttonV3DTO, Boolean bool, @NotNull ImageDTO itemImage, BadgeDTO badgeDTO2) {
        Intrinsics.checkNotNullParameter(checkbox, "checkbox");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(itemImage, "itemImage");
        this.checkbox = checkbox;
        this.price = price;
        this.name = name;
        this.description = textDTO;
        this.dueDate = textDTO2;
        this.quantitySelector = rmsQuantitySelector;
        this.badge = badgeDTO;
        this.crossButton = iconButtonDTO;
        this.common = commonControlSettings;
        this.button = buttonV3DTO;
        this.isDisabled = bool;
        this.itemImage = itemImage;
        this.sealBadge = badgeDTO2;
    }

    public static /* synthetic */ ItemDTO copy$default(ItemDTO itemDTO, RmsCheckbox rmsCheckbox, PriceDTO priceDTO, TextDTO textDTO, TextDTO textDTO2, TextDTO textDTO3, RmsQuantitySelector rmsQuantitySelector, BadgeDTO badgeDTO, IconButtonDTO iconButtonDTO, CommonControlSettings commonControlSettings, ButtonV3DTO buttonV3DTO, Boolean bool, ImageDTO imageDTO, BadgeDTO badgeDTO2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            rmsCheckbox = itemDTO.checkbox;
        }
        return itemDTO.copy(rmsCheckbox, (i11 & 2) != 0 ? itemDTO.price : priceDTO, (i11 & 4) != 0 ? itemDTO.name : textDTO, (i11 & 8) != 0 ? itemDTO.description : textDTO2, (i11 & 16) != 0 ? itemDTO.dueDate : textDTO3, (i11 & 32) != 0 ? itemDTO.quantitySelector : rmsQuantitySelector, (i11 & 64) != 0 ? itemDTO.badge : badgeDTO, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? itemDTO.crossButton : iconButtonDTO, (i11 & 256) != 0 ? itemDTO.common : commonControlSettings, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? itemDTO.button : buttonV3DTO, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? itemDTO.isDisabled : bool, (i11 & 2048) != 0 ? itemDTO.itemImage : imageDTO, (i11 & 4096) != 0 ? itemDTO.sealBadge : badgeDTO2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final RmsCheckbox getCheckbox() {
        return this.checkbox;
    }

    /* renamed from: component10, reason: from getter */
    public final ButtonV3DTO getButton() {
        return this.button;
    }

    /* renamed from: component11, reason: from getter */
    public final Boolean getIsDisabled() {
        return this.isDisabled;
    }

    @NotNull
    /* renamed from: component12, reason: from getter */
    public final ImageDTO getItemImage() {
        return this.itemImage;
    }

    /* renamed from: component13, reason: from getter */
    public final BadgeDTO getSealBadge() {
        return this.sealBadge;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final PriceDTO getPrice() {
        return this.price;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final TextDTO getName() {
        return this.name;
    }

    /* renamed from: component4, reason: from getter */
    public final TextDTO getDescription() {
        return this.description;
    }

    /* renamed from: component5, reason: from getter */
    public final TextDTO getDueDate() {
        return this.dueDate;
    }

    /* renamed from: component6, reason: from getter */
    public final RmsQuantitySelector getQuantitySelector() {
        return this.quantitySelector;
    }

    /* renamed from: component7, reason: from getter */
    public final BadgeDTO getBadge() {
        return this.badge;
    }

    /* renamed from: component8, reason: from getter */
    public final IconButtonDTO getCrossButton() {
        return this.crossButton;
    }

    /* renamed from: component9, reason: from getter */
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    @NotNull
    public final ItemDTO copy(@NotNull RmsCheckbox checkbox, @NotNull PriceDTO price, @NotNull TextDTO name, TextDTO description, TextDTO dueDate, RmsQuantitySelector quantitySelector, BadgeDTO badge, IconButtonDTO crossButton, CommonControlSettings common, ButtonV3DTO button, Boolean isDisabled, @NotNull ImageDTO itemImage, BadgeDTO sealBadge) {
        Intrinsics.checkNotNullParameter(checkbox, "checkbox");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(itemImage, "itemImage");
        return new ItemDTO(checkbox, price, name, description, dueDate, quantitySelector, badge, crossButton, common, button, isDisabled, itemImage, sealBadge);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ItemDTO)) {
            return false;
        }
        ItemDTO itemDTO = (ItemDTO) other;
        return Intrinsics.d(this.checkbox, itemDTO.checkbox) && Intrinsics.d(this.price, itemDTO.price) && Intrinsics.d(this.name, itemDTO.name) && Intrinsics.d(this.description, itemDTO.description) && Intrinsics.d(this.dueDate, itemDTO.dueDate) && Intrinsics.d(this.quantitySelector, itemDTO.quantitySelector) && Intrinsics.d(this.badge, itemDTO.badge) && Intrinsics.d(this.crossButton, itemDTO.crossButton) && Intrinsics.d(this.common, itemDTO.common) && Intrinsics.d(this.button, itemDTO.button) && Intrinsics.d(this.isDisabled, itemDTO.isDisabled) && Intrinsics.d(this.itemImage, itemDTO.itemImage) && Intrinsics.d(this.sealBadge, itemDTO.sealBadge);
    }

    public final BadgeDTO getBadge() {
        return this.badge;
    }

    public final ButtonV3DTO getButton() {
        return this.button;
    }

    @NotNull
    public final RmsCheckbox getCheckbox() {
        return this.checkbox;
    }

    public final CommonControlSettings getCommon() {
        return this.common;
    }

    public final IconButtonDTO getCrossButton() {
        return this.crossButton;
    }

    public final TextDTO getDescription() {
        return this.description;
    }

    public final TextDTO getDueDate() {
        return this.dueDate;
    }

    @NotNull
    public final ImageDTO getItemImage() {
        return this.itemImage;
    }

    @NotNull
    public final TextDTO getName() {
        return this.name;
    }

    @NotNull
    public final PriceDTO getPrice() {
        return this.price;
    }

    public final RmsQuantitySelector getQuantitySelector() {
        return this.quantitySelector;
    }

    public final BadgeDTO getSealBadge() {
        return this.sealBadge;
    }

    public int hashCode() {
        int a11 = b.a(this.name, C3051a.b(this.price, this.checkbox.hashCode() * 31, 31), 31);
        TextDTO textDTO = this.description;
        int hashCode = (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        TextDTO textDTO2 = this.dueDate;
        int hashCode2 = (hashCode + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
        RmsQuantitySelector rmsQuantitySelector = this.quantitySelector;
        int hashCode3 = (hashCode2 + (rmsQuantitySelector == null ? 0 : rmsQuantitySelector.hashCode())) * 31;
        BadgeDTO badgeDTO = this.badge;
        int hashCode4 = (hashCode3 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        IconButtonDTO iconButtonDTO = this.crossButton;
        int hashCode5 = (hashCode4 + (iconButtonDTO == null ? 0 : iconButtonDTO.hashCode())) * 31;
        CommonControlSettings commonControlSettings = this.common;
        int hashCode6 = (hashCode5 + (commonControlSettings == null ? 0 : commonControlSettings.hashCode())) * 31;
        ButtonV3DTO buttonV3DTO = this.button;
        int hashCode7 = (hashCode6 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
        Boolean bool = this.isDisabled;
        int hashCode8 = (this.itemImage.hashCode() + ((hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31)) * 31;
        BadgeDTO badgeDTO2 = this.sealBadge;
        return hashCode8 + (badgeDTO2 != null ? badgeDTO2.hashCode() : 0);
    }

    public final Boolean isDisabled() {
        return this.isDisabled;
    }

    @NotNull
    public String toString() {
        RmsCheckbox rmsCheckbox = this.checkbox;
        PriceDTO priceDTO = this.price;
        TextDTO textDTO = this.name;
        TextDTO textDTO2 = this.description;
        TextDTO textDTO3 = this.dueDate;
        RmsQuantitySelector rmsQuantitySelector = this.quantitySelector;
        BadgeDTO badgeDTO = this.badge;
        IconButtonDTO iconButtonDTO = this.crossButton;
        CommonControlSettings commonControlSettings = this.common;
        ButtonV3DTO buttonV3DTO = this.button;
        Boolean bool = this.isDisabled;
        ImageDTO imageDTO = this.itemImage;
        BadgeDTO badgeDTO2 = this.sealBadge;
        StringBuilder sb2 = new StringBuilder("ItemDTO(checkbox=");
        sb2.append(rmsCheckbox);
        sb2.append(", price=");
        sb2.append(priceDTO);
        sb2.append(", name=");
        d.e(", description=", ", dueDate=", sb2, textDTO, textDTO2);
        sb2.append(textDTO3);
        sb2.append(", quantitySelector=");
        sb2.append(rmsQuantitySelector);
        sb2.append(", badge=");
        sb2.append(badgeDTO);
        sb2.append(", crossButton=");
        sb2.append(iconButtonDTO);
        sb2.append(", common=");
        sb2.append(commonControlSettings);
        sb2.append(", button=");
        sb2.append(buttonV3DTO);
        sb2.append(", isDisabled=");
        sb2.append(bool);
        sb2.append(", itemImage=");
        sb2.append(imageDTO);
        sb2.append(", sealBadge=");
        return c.b(sb2, badgeDTO2, ")");
    }
}
