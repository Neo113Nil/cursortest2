package ru.ozon.app.android.returns.creation.molecule.returnCreationDeliveryGroup.presentation.product.viewObject;

import D3.g;
import Fm.C3051a;
import Ns.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.presentation.ImageVO;
import ru.ozon.app.android.returns.ui.molecules.checkbox.RmsCheckbox;
import ru.ozon.app.android.returns.ui.molecules.quantitySelector.RmsQuantitySelector;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b'\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\u00162\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b1\u00102R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u00100\u001a\u0004\b3\u00102R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b4\u00102R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u00105\u001a\u0004\b6\u00107R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010>\u001a\u0004\b?\u0010@R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010A\u001a\u0004\bB\u0010CR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010D\u001a\u0004\b\u0017\u0010ER\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010F\u001a\u0004\bG\u0010HR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u001a\u00108\u001a\u0004\bI\u0010:¨\u0006J"}, d2 = {"Lru/ozon/app/android/returns/creation/molecule/returnCreationDeliveryGroup/presentation/product/viewObject/ItemVO;", "Ll20/c;", "", "id", "Lru/ozon/app/android/returns/ui/molecules/checkbox/RmsCheckbox;", "checkbox", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "price", "Lru/ozon/uni/atoms/data/text/TextDTO;", AppMeasurementSdk.ConditionalUserProperty.NAME, "description", "dueDate", "Lru/ozon/app/android/returns/ui/molecules/quantitySelector/RmsQuantitySelector;", "quantitySelector", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "Lru/ozon/uni/atoms/data/controls/button/IconButtonDTO;", "crossButton", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "common", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "", "isDisabled", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/ImageVO;", "itemImage", "sealBadge", "<init>", "(JLru/ozon/app/android/returns/ui/molecules/checkbox/RmsCheckbox;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/returns/ui/molecules/quantitySelector/RmsQuantitySelector;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/lang/Boolean;Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/ImageVO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/returns/ui/molecules/checkbox/RmsCheckbox;", "getCheckbox", "()Lru/ozon/app/android/returns/ui/molecules/checkbox/RmsCheckbox;", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getName", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getDescription", "getDueDate", "Lru/ozon/app/android/returns/ui/molecules/quantitySelector/RmsQuantitySelector;", "getQuantitySelector", "()Lru/ozon/app/android/returns/ui/molecules/quantitySelector/RmsQuantitySelector;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonDTO;", "getCrossButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonDTO;", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/ImageVO;", "getItemImage", "()Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/ImageVO;", "getSealBadge", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ItemVO implements c {
    private final BadgeDTO badge;
    private final ButtonV3DTO button;

    @NotNull
    private final RmsCheckbox checkbox;
    private final CommonControlSettings common;
    private final IconButtonDTO crossButton;
    private final TextDTO description;
    private final TextDTO dueDate;
    private final long id;
    private final Boolean isDisabled;

    @NotNull
    private final ImageVO itemImage;

    @NotNull
    private final TextDTO name;

    @NotNull
    private final PriceDTO price;
    private final RmsQuantitySelector quantitySelector;
    private final BadgeDTO sealBadge;

    public ItemVO(long j11, @NotNull RmsCheckbox checkbox, @NotNull PriceDTO price, @NotNull TextDTO name, TextDTO textDTO, TextDTO textDTO2, RmsQuantitySelector rmsQuantitySelector, BadgeDTO badgeDTO, IconButtonDTO iconButtonDTO, CommonControlSettings commonControlSettings, ButtonV3DTO buttonV3DTO, Boolean bool, @NotNull ImageVO itemImage, BadgeDTO badgeDTO2) {
        Intrinsics.checkNotNullParameter(checkbox, "checkbox");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(itemImage, "itemImage");
        this.id = j11;
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

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ItemVO)) {
            return false;
        }
        ItemVO itemVO = (ItemVO) other;
        return this.id == itemVO.id && Intrinsics.d(this.checkbox, itemVO.checkbox) && Intrinsics.d(this.price, itemVO.price) && Intrinsics.d(this.name, itemVO.name) && Intrinsics.d(this.description, itemVO.description) && Intrinsics.d(this.dueDate, itemVO.dueDate) && Intrinsics.d(this.quantitySelector, itemVO.quantitySelector) && Intrinsics.d(this.badge, itemVO.badge) && Intrinsics.d(this.crossButton, itemVO.crossButton) && Intrinsics.d(this.common, itemVO.common) && Intrinsics.d(this.button, itemVO.button) && Intrinsics.d(this.isDisabled, itemVO.isDisabled) && Intrinsics.d(this.itemImage, itemVO.itemImage) && Intrinsics.d(this.sealBadge, itemVO.sealBadge);
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

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final ImageVO getItemImage() {
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

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final BadgeDTO getSealBadge() {
        return this.sealBadge;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = b.a(this.name, C3051a.b(this.price, (this.checkbox.hashCode() + (Long.hashCode(this.id) * 31)) * 31, 31), 31);
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

    /* renamed from: isDisabled, reason: from getter */
    public final Boolean getIsDisabled() {
        return this.isDisabled;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
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
        ImageVO imageVO = this.itemImage;
        BadgeDTO badgeDTO2 = this.sealBadge;
        StringBuilder sb2 = new StringBuilder("ItemVO(id=");
        sb2.append(j11);
        sb2.append(", checkbox=");
        sb2.append(rmsCheckbox);
        sb2.append(", price=");
        sb2.append(priceDTO);
        sb2.append(", name=");
        sb2.append(textDTO);
        g.i(", description=", ", dueDate=", sb2, textDTO2, textDTO3);
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
        sb2.append(imageVO);
        sb2.append(", sealBadge=");
        sb2.append(badgeDTO2);
        sb2.append(")");
        return sb2.toString();
    }
}
