package ru.ozon.app.android.returns.creation.widgets.selectedItems.data;

import D40.d;
import Fm.C3051a;
import H00.a;
import Ns.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u0001\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0007HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010.\u001a\u00020\u0001HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0012HÆ\u0003Jy\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0003\u0010\u000e\u001a\u00020\u00012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÆ\u0001J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u000206HÖ\u0001J\t\u00107\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u000e\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&¨\u00068"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/selectedItems/data/SelectedItemDTO;", "", "image", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "price", "Lru/ozon/uni/atoms/data/price/PriceDTO;", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "description", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "validationText", "deleteButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "reason", "backgroundColor", "", "sealBadge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Ljava/lang/Object;Ljava/lang/String;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "getImage", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "getName", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getDescription", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getValidationText", "getDeleteButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getReason", "()Ljava/lang/Object;", "getBackgroundColor", "()Ljava/lang/String;", "getSealBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "", "toString", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SelectedItemDTO {
    public static final int $stable = 8;
    private final String backgroundColor;
    private final CommonControlSettings common;
    private final IconButtonV3DTO deleteButton;
    private final TextDTO description;

    @NotNull
    private final IconDTO image;

    @NotNull
    private final TextDTO name;

    @NotNull
    private final PriceDTO price;

    @NotNull
    private final Object reason;
    private final BadgeDTO sealBadge;
    private final TextDTO validationText;

    public SelectedItemDTO(@NotNull IconDTO image, @NotNull PriceDTO price, @NotNull TextDTO name, TextDTO textDTO, CommonControlSettings commonControlSettings, TextDTO textDTO2, IconButtonV3DTO iconButtonV3DTO, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(fieldName = "cell", name = "Cell", type = CellDTO.class), @ProtoOneOfSignature(fieldName = "reasonInfo", name = "ReasonInfo", type = ReasonInfoDTO.class)}) @NotNull @ProtoOneOf(label = "type") Object reason, String str, BadgeDTO badgeDTO) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.image = image;
        this.price = price;
        this.name = name;
        this.description = textDTO;
        this.common = commonControlSettings;
        this.validationText = textDTO2;
        this.deleteButton = iconButtonV3DTO;
        this.reason = reason;
        this.backgroundColor = str;
        this.sealBadge = badgeDTO;
    }

    public static /* synthetic */ SelectedItemDTO copy$default(SelectedItemDTO selectedItemDTO, IconDTO iconDTO, PriceDTO priceDTO, TextDTO textDTO, TextDTO textDTO2, CommonControlSettings commonControlSettings, TextDTO textDTO3, IconButtonV3DTO iconButtonV3DTO, Object obj, String str, BadgeDTO badgeDTO, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            iconDTO = selectedItemDTO.image;
        }
        if ((i11 & 2) != 0) {
            priceDTO = selectedItemDTO.price;
        }
        if ((i11 & 4) != 0) {
            textDTO = selectedItemDTO.name;
        }
        if ((i11 & 8) != 0) {
            textDTO2 = selectedItemDTO.description;
        }
        if ((i11 & 16) != 0) {
            commonControlSettings = selectedItemDTO.common;
        }
        if ((i11 & 32) != 0) {
            textDTO3 = selectedItemDTO.validationText;
        }
        if ((i11 & 64) != 0) {
            iconButtonV3DTO = selectedItemDTO.deleteButton;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            obj = selectedItemDTO.reason;
        }
        if ((i11 & 256) != 0) {
            str = selectedItemDTO.backgroundColor;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            badgeDTO = selectedItemDTO.sealBadge;
        }
        String str2 = str;
        BadgeDTO badgeDTO2 = badgeDTO;
        IconButtonV3DTO iconButtonV3DTO2 = iconButtonV3DTO;
        Object obj3 = obj;
        CommonControlSettings commonControlSettings2 = commonControlSettings;
        TextDTO textDTO4 = textDTO3;
        return selectedItemDTO.copy(iconDTO, priceDTO, textDTO, textDTO2, commonControlSettings2, textDTO4, iconButtonV3DTO2, obj3, str2, badgeDTO2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final IconDTO getImage() {
        return this.image;
    }

    /* renamed from: component10, reason: from getter */
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
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    /* renamed from: component6, reason: from getter */
    public final TextDTO getValidationText() {
        return this.validationText;
    }

    /* renamed from: component7, reason: from getter */
    public final IconButtonV3DTO getDeleteButton() {
        return this.deleteButton;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final Object getReason() {
        return this.reason;
    }

    /* renamed from: component9, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final SelectedItemDTO copy(@NotNull IconDTO image, @NotNull PriceDTO price, @NotNull TextDTO name, TextDTO description, CommonControlSettings common, TextDTO validationText, IconButtonV3DTO deleteButton, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(fieldName = "cell", name = "Cell", type = CellDTO.class), @ProtoOneOfSignature(fieldName = "reasonInfo", name = "ReasonInfo", type = ReasonInfoDTO.class)}) @NotNull @ProtoOneOf(label = "type") Object reason, String backgroundColor, BadgeDTO sealBadge) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(reason, "reason");
        return new SelectedItemDTO(image, price, name, description, common, validationText, deleteButton, reason, backgroundColor, sealBadge);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectedItemDTO)) {
            return false;
        }
        SelectedItemDTO selectedItemDTO = (SelectedItemDTO) other;
        return Intrinsics.d(this.image, selectedItemDTO.image) && Intrinsics.d(this.price, selectedItemDTO.price) && Intrinsics.d(this.name, selectedItemDTO.name) && Intrinsics.d(this.description, selectedItemDTO.description) && Intrinsics.d(this.common, selectedItemDTO.common) && Intrinsics.d(this.validationText, selectedItemDTO.validationText) && Intrinsics.d(this.deleteButton, selectedItemDTO.deleteButton) && Intrinsics.d(this.reason, selectedItemDTO.reason) && Intrinsics.d(this.backgroundColor, selectedItemDTO.backgroundColor) && Intrinsics.d(this.sealBadge, selectedItemDTO.sealBadge);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final CommonControlSettings getCommon() {
        return this.common;
    }

    public final IconButtonV3DTO getDeleteButton() {
        return this.deleteButton;
    }

    public final TextDTO getDescription() {
        return this.description;
    }

    @NotNull
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

    @NotNull
    public final Object getReason() {
        return this.reason;
    }

    public final BadgeDTO getSealBadge() {
        return this.sealBadge;
    }

    public final TextDTO getValidationText() {
        return this.validationText;
    }

    public int hashCode() {
        int a11 = b.a(this.name, C3051a.b(this.price, this.image.hashCode() * 31, 31), 31);
        TextDTO textDTO = this.description;
        int hashCode = (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        CommonControlSettings commonControlSettings = this.common;
        int hashCode2 = (hashCode + (commonControlSettings == null ? 0 : commonControlSettings.hashCode())) * 31;
        TextDTO textDTO2 = this.validationText;
        int hashCode3 = (hashCode2 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
        IconButtonV3DTO iconButtonV3DTO = this.deleteButton;
        int c11 = a.c((hashCode3 + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31, 31, this.reason);
        String str = this.backgroundColor;
        int hashCode4 = (c11 + (str == null ? 0 : str.hashCode())) * 31;
        BadgeDTO badgeDTO = this.sealBadge;
        return hashCode4 + (badgeDTO != null ? badgeDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        IconDTO iconDTO = this.image;
        PriceDTO priceDTO = this.price;
        TextDTO textDTO = this.name;
        TextDTO textDTO2 = this.description;
        CommonControlSettings commonControlSettings = this.common;
        TextDTO textDTO3 = this.validationText;
        IconButtonV3DTO iconButtonV3DTO = this.deleteButton;
        Object obj = this.reason;
        String str = this.backgroundColor;
        BadgeDTO badgeDTO = this.sealBadge;
        StringBuilder sb2 = new StringBuilder("SelectedItemDTO(image=");
        sb2.append(iconDTO);
        sb2.append(", price=");
        sb2.append(priceDTO);
        sb2.append(", name=");
        d.e(", description=", ", common=", sb2, textDTO, textDTO2);
        sb2.append(commonControlSettings);
        sb2.append(", validationText=");
        sb2.append(textDTO3);
        sb2.append(", deleteButton=");
        sb2.append(iconButtonV3DTO);
        sb2.append(", reason=");
        sb2.append(obj);
        sb2.append(", backgroundColor=");
        sb2.append(str);
        sb2.append(", sealBadge=");
        sb2.append(badgeDTO);
        sb2.append(")");
        return sb2.toString();
    }
}
