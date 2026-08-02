package ru.ozon.app.android.returns.creation.widgets.selectedItems.presentation.viewObject;

import El.C2971a;
import Fm.C3051a;
import Ns.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0081\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b.\u0010-R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\r\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\r\u0010+\u001a\u0004\b2\u0010-R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00109\u001a\u0004\b:\u0010\u0019R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010;\u001a\u0004\b<\u0010=¨\u0006>"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/selectedItems/presentation/viewObject/SelectedItemVO;", "Ll20/c;", "", "id", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "image", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "price", "Lru/ozon/uni/atoms/data/text/TextDTO;", AppMeasurementSdk.ConditionalUserProperty.NAME, "description", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "common", "validationText", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "deleteButton", "Lru/ozon/app/android/returns/creation/widgets/selectedItems/presentation/viewObject/Reason;", "reason", "", "backgroundColor", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "sealBadge", "<init>", "(JLru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/app/android/returns/creation/widgets/selectedItems/presentation/viewObject/Reason;Ljava/lang/String;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getImage", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getName", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getDescription", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getValidationText", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getDeleteButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "Lru/ozon/app/android/returns/creation/widgets/selectedItems/presentation/viewObject/Reason;", "getReason", "()Lru/ozon/app/android/returns/creation/widgets/selectedItems/presentation/viewObject/Reason;", "Ljava/lang/String;", "getBackgroundColor", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getSealBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SelectedItemVO implements c {
    public static final int $stable = (IconButtonV3DTO.$stable | PriceDTO.$stable) | IconDTO.$stable;
    private final String backgroundColor;
    private final CommonControlSettings common;
    private final IconButtonV3DTO deleteButton;
    private final TextDTO description;
    private final long id;

    @NotNull
    private final IconDTO image;

    @NotNull
    private final TextDTO name;

    @NotNull
    private final PriceDTO price;

    @NotNull
    private final Reason reason;
    private final BadgeDTO sealBadge;
    private final TextDTO validationText;

    public SelectedItemVO(long j11, @NotNull IconDTO image, @NotNull PriceDTO price, @NotNull TextDTO name, TextDTO textDTO, CommonControlSettings commonControlSettings, TextDTO textDTO2, IconButtonV3DTO iconButtonV3DTO, @NotNull Reason reason, String str, BadgeDTO badgeDTO) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.id = j11;
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

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectedItemVO)) {
            return false;
        }
        SelectedItemVO selectedItemVO = (SelectedItemVO) other;
        return this.id == selectedItemVO.id && Intrinsics.d(this.image, selectedItemVO.image) && Intrinsics.d(this.price, selectedItemVO.price) && Intrinsics.d(this.name, selectedItemVO.name) && Intrinsics.d(this.description, selectedItemVO.description) && Intrinsics.d(this.common, selectedItemVO.common) && Intrinsics.d(this.validationText, selectedItemVO.validationText) && Intrinsics.d(this.deleteButton, selectedItemVO.deleteButton) && Intrinsics.d(this.reason, selectedItemVO.reason) && Intrinsics.d(this.backgroundColor, selectedItemVO.backgroundColor) && Intrinsics.d(this.sealBadge, selectedItemVO.sealBadge);
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

    @Override // l20.c
    public long getId() {
        return this.id;
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
    public final Reason getReason() {
        return this.reason;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final BadgeDTO getSealBadge() {
        return this.sealBadge;
    }

    public final TextDTO getValidationText() {
        return this.validationText;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = b.a(this.name, C3051a.b(this.price, C2971a.a(this.image, Long.hashCode(this.id) * 31, 31), 31), 31);
        TextDTO textDTO = this.description;
        int hashCode = (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        CommonControlSettings commonControlSettings = this.common;
        int hashCode2 = (hashCode + (commonControlSettings == null ? 0 : commonControlSettings.hashCode())) * 31;
        TextDTO textDTO2 = this.validationText;
        int hashCode3 = (hashCode2 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
        IconButtonV3DTO iconButtonV3DTO = this.deleteButton;
        int hashCode4 = (this.reason.hashCode() + ((hashCode3 + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31)) * 31;
        String str = this.backgroundColor;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        BadgeDTO badgeDTO = this.sealBadge;
        return hashCode5 + (badgeDTO != null ? badgeDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        IconDTO iconDTO = this.image;
        PriceDTO priceDTO = this.price;
        TextDTO textDTO = this.name;
        TextDTO textDTO2 = this.description;
        CommonControlSettings commonControlSettings = this.common;
        TextDTO textDTO3 = this.validationText;
        IconButtonV3DTO iconButtonV3DTO = this.deleteButton;
        Reason reason = this.reason;
        String str = this.backgroundColor;
        BadgeDTO badgeDTO = this.sealBadge;
        StringBuilder b11 = D40.c.b("SelectedItemVO(id=", j11, ", image=", iconDTO);
        b11.append(", price=");
        b11.append(priceDTO);
        b11.append(", name=");
        b11.append(textDTO);
        b11.append(", description=");
        b11.append(textDTO2);
        b11.append(", common=");
        b11.append(commonControlSettings);
        b11.append(", validationText=");
        b11.append(textDTO3);
        b11.append(", deleteButton=");
        b11.append(iconButtonV3DTO);
        b11.append(", reason=");
        b11.append(reason);
        b11.append(", backgroundColor=");
        b11.append(str);
        b11.append(", sealBadge=");
        b11.append(badgeDTO);
        b11.append(")");
        return b11.toString();
    }
}
