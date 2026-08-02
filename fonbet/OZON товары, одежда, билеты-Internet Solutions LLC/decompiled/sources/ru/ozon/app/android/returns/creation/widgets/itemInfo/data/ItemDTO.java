package ru.ozon.app.android.returns.creation.widgets.itemInfo.data;

import Fm.C3051a;
import Ns.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.data.ImageDTO;
import ru.ozon.app.android.returns.ui.molecules.quantitySelector.RmsQuantitySelector;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b'\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00101\u001a\u00020\u0007HÆ\u0003J\t\u00102\u001a\u00020\tHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\t\u0010:\u001a\u00020\u0017HÆ\u0003J\u0093\u0001\u0010;\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017HÆ\u0001J\u0013\u0010<\u001a\u00020\u00172\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010>\u001a\u00020?HÖ\u0001J\t\u0010@\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b'\u0010!R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010.¨\u0006A"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/itemInfo/data/ItemDTO;", "", "image", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "csmaImage", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/data/ImageDTO;", "price", "Lru/ozon/uni/atoms/data/price/PriceDTO;", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "description", "quantitySelector", "Lru/ozon/app/android/returns/ui/molecules/quantitySelector/RmsQuantitySelector;", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "validationText", "deleteButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "annotation", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "backgroundColor", "", "isSticky", "", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/app/android/cscore/orderdetails/molecule/images/data/ImageDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/returns/ui/molecules/quantitySelector/RmsQuantitySelector;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;Ljava/lang/String;Z)V", "getImage", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getCsmaImage", "()Lru/ozon/app/android/cscore/orderdetails/molecule/images/data/ImageDTO;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "getName", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getDescription", "getQuantitySelector", "()Lru/ozon/app/android/returns/ui/molecules/quantitySelector/RmsQuantitySelector;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getValidationText", "getDeleteButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getAnnotation", "()Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "getBackgroundColor", "()Ljava/lang/String;", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "other", "hashCode", "", "toString", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ItemDTO {
    public static final int $stable = 8;
    private final DisclaimerAtom annotation;
    private final String backgroundColor;
    private final CommonControlSettings common;
    private final ImageDTO csmaImage;
    private final IconButtonV3DTO deleteButton;
    private final TextDTO description;
    private final IconDTO image;
    private final boolean isSticky;

    @NotNull
    private final TextDTO name;

    @NotNull
    private final PriceDTO price;
    private final RmsQuantitySelector quantitySelector;
    private final TextDTO validationText;

    public ItemDTO(IconDTO iconDTO, ImageDTO imageDTO, @NotNull PriceDTO price, @NotNull TextDTO name, TextDTO textDTO, RmsQuantitySelector rmsQuantitySelector, CommonControlSettings commonControlSettings, TextDTO textDTO2, IconButtonV3DTO iconButtonV3DTO, DisclaimerAtom disclaimerAtom, String str, boolean z11) {
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(name, "name");
        this.image = iconDTO;
        this.csmaImage = imageDTO;
        this.price = price;
        this.name = name;
        this.description = textDTO;
        this.quantitySelector = rmsQuantitySelector;
        this.common = commonControlSettings;
        this.validationText = textDTO2;
        this.deleteButton = iconButtonV3DTO;
        this.annotation = disclaimerAtom;
        this.backgroundColor = str;
        this.isSticky = z11;
    }

    public static /* synthetic */ ItemDTO copy$default(ItemDTO itemDTO, IconDTO iconDTO, ImageDTO imageDTO, PriceDTO priceDTO, TextDTO textDTO, TextDTO textDTO2, RmsQuantitySelector rmsQuantitySelector, CommonControlSettings commonControlSettings, TextDTO textDTO3, IconButtonV3DTO iconButtonV3DTO, DisclaimerAtom disclaimerAtom, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            iconDTO = itemDTO.image;
        }
        if ((i11 & 2) != 0) {
            imageDTO = itemDTO.csmaImage;
        }
        if ((i11 & 4) != 0) {
            priceDTO = itemDTO.price;
        }
        if ((i11 & 8) != 0) {
            textDTO = itemDTO.name;
        }
        if ((i11 & 16) != 0) {
            textDTO2 = itemDTO.description;
        }
        if ((i11 & 32) != 0) {
            rmsQuantitySelector = itemDTO.quantitySelector;
        }
        if ((i11 & 64) != 0) {
            commonControlSettings = itemDTO.common;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            textDTO3 = itemDTO.validationText;
        }
        if ((i11 & 256) != 0) {
            iconButtonV3DTO = itemDTO.deleteButton;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            disclaimerAtom = itemDTO.annotation;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            str = itemDTO.backgroundColor;
        }
        if ((i11 & 2048) != 0) {
            z11 = itemDTO.isSticky;
        }
        String str2 = str;
        boolean z12 = z11;
        IconButtonV3DTO iconButtonV3DTO2 = iconButtonV3DTO;
        DisclaimerAtom disclaimerAtom2 = disclaimerAtom;
        CommonControlSettings commonControlSettings2 = commonControlSettings;
        TextDTO textDTO4 = textDTO3;
        TextDTO textDTO5 = textDTO2;
        RmsQuantitySelector rmsQuantitySelector2 = rmsQuantitySelector;
        return itemDTO.copy(iconDTO, imageDTO, priceDTO, textDTO, textDTO5, rmsQuantitySelector2, commonControlSettings2, textDTO4, iconButtonV3DTO2, disclaimerAtom2, str2, z12);
    }

    /* renamed from: component1, reason: from getter */
    public final IconDTO getImage() {
        return this.image;
    }

    /* renamed from: component10, reason: from getter */
    public final DisclaimerAtom getAnnotation() {
        return this.annotation;
    }

    /* renamed from: component11, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getIsSticky() {
        return this.isSticky;
    }

    /* renamed from: component2, reason: from getter */
    public final ImageDTO getCsmaImage() {
        return this.csmaImage;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final PriceDTO getPrice() {
        return this.price;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final TextDTO getName() {
        return this.name;
    }

    /* renamed from: component5, reason: from getter */
    public final TextDTO getDescription() {
        return this.description;
    }

    /* renamed from: component6, reason: from getter */
    public final RmsQuantitySelector getQuantitySelector() {
        return this.quantitySelector;
    }

    /* renamed from: component7, reason: from getter */
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    /* renamed from: component8, reason: from getter */
    public final TextDTO getValidationText() {
        return this.validationText;
    }

    /* renamed from: component9, reason: from getter */
    public final IconButtonV3DTO getDeleteButton() {
        return this.deleteButton;
    }

    @NotNull
    public final ItemDTO copy(IconDTO image, ImageDTO csmaImage, @NotNull PriceDTO price, @NotNull TextDTO name, TextDTO description, RmsQuantitySelector quantitySelector, CommonControlSettings common, TextDTO validationText, IconButtonV3DTO deleteButton, DisclaimerAtom annotation, String backgroundColor, boolean isSticky) {
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(name, "name");
        return new ItemDTO(image, csmaImage, price, name, description, quantitySelector, common, validationText, deleteButton, annotation, backgroundColor, isSticky);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ItemDTO)) {
            return false;
        }
        ItemDTO itemDTO = (ItemDTO) other;
        return Intrinsics.d(this.image, itemDTO.image) && Intrinsics.d(this.csmaImage, itemDTO.csmaImage) && Intrinsics.d(this.price, itemDTO.price) && Intrinsics.d(this.name, itemDTO.name) && Intrinsics.d(this.description, itemDTO.description) && Intrinsics.d(this.quantitySelector, itemDTO.quantitySelector) && Intrinsics.d(this.common, itemDTO.common) && Intrinsics.d(this.validationText, itemDTO.validationText) && Intrinsics.d(this.deleteButton, itemDTO.deleteButton) && Intrinsics.d(this.annotation, itemDTO.annotation) && Intrinsics.d(this.backgroundColor, itemDTO.backgroundColor) && this.isSticky == itemDTO.isSticky;
    }

    public final DisclaimerAtom getAnnotation() {
        return this.annotation;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final CommonControlSettings getCommon() {
        return this.common;
    }

    public final ImageDTO getCsmaImage() {
        return this.csmaImage;
    }

    public final IconButtonV3DTO getDeleteButton() {
        return this.deleteButton;
    }

    public final TextDTO getDescription() {
        return this.description;
    }

    public final IconDTO getImage() {
        return this.image;
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

    public final TextDTO getValidationText() {
        return this.validationText;
    }

    public int hashCode() {
        IconDTO iconDTO = this.image;
        int hashCode = (iconDTO == null ? 0 : iconDTO.hashCode()) * 31;
        ImageDTO imageDTO = this.csmaImage;
        int a11 = b.a(this.name, C3051a.b(this.price, (hashCode + (imageDTO == null ? 0 : imageDTO.hashCode())) * 31, 31), 31);
        TextDTO textDTO = this.description;
        int hashCode2 = (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        RmsQuantitySelector rmsQuantitySelector = this.quantitySelector;
        int hashCode3 = (hashCode2 + (rmsQuantitySelector == null ? 0 : rmsQuantitySelector.hashCode())) * 31;
        CommonControlSettings commonControlSettings = this.common;
        int hashCode4 = (hashCode3 + (commonControlSettings == null ? 0 : commonControlSettings.hashCode())) * 31;
        TextDTO textDTO2 = this.validationText;
        int hashCode5 = (hashCode4 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
        IconButtonV3DTO iconButtonV3DTO = this.deleteButton;
        int hashCode6 = (hashCode5 + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31;
        DisclaimerAtom disclaimerAtom = this.annotation;
        int hashCode7 = (hashCode6 + (disclaimerAtom == null ? 0 : disclaimerAtom.hashCode())) * 31;
        String str = this.backgroundColor;
        return Boolean.hashCode(this.isSticky) + ((hashCode7 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final boolean isSticky() {
        return this.isSticky;
    }

    @NotNull
    public String toString() {
        return "ItemDTO(image=" + this.image + ", csmaImage=" + this.csmaImage + ", price=" + this.price + ", name=" + this.name + ", description=" + this.description + ", quantitySelector=" + this.quantitySelector + ", common=" + this.common + ", validationText=" + this.validationText + ", deleteButton=" + this.deleteButton + ", annotation=" + this.annotation + ", backgroundColor=" + this.backgroundColor + ", isSticky=" + this.isSticky + ")";
    }

    public /* synthetic */ ItemDTO(IconDTO iconDTO, ImageDTO imageDTO, PriceDTO priceDTO, TextDTO textDTO, TextDTO textDTO2, RmsQuantitySelector rmsQuantitySelector, CommonControlSettings commonControlSettings, TextDTO textDTO3, IconButtonV3DTO iconButtonV3DTO, DisclaimerAtom disclaimerAtom, String str, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : iconDTO, (i11 & 2) != 0 ? null : imageDTO, priceDTO, textDTO, (i11 & 16) != 0 ? null : textDTO2, (i11 & 32) != 0 ? null : rmsQuantitySelector, (i11 & 64) != 0 ? null : commonControlSettings, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : textDTO3, (i11 & 256) != 0 ? null : iconButtonV3DTO, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : disclaimerAtom, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : str, (i11 & 2048) != 0 ? true : z11);
    }
}
