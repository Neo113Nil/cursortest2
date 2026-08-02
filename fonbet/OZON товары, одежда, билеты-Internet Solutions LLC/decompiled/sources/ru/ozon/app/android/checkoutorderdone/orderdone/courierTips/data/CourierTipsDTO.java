package ru.ozon.app.android.checkoutorderdone.orderdone.courierTips.data;

import G.g;
import Tl.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.chip.ChipDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0017\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0013HÆ\u0003Jw\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u000202HÖ\u0001J\t\u00103\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u00064"}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/courierTips/data/CourierTipsDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "subtitle", "variants", "", "Lru/ozon/uni/atoms/data/controls/chip/ChipDTO;", "checkbox", "Lru/ozon/app/android/checkoutorderdone/orderdone/courierTips/data/CheckboxWithTextDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "button", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "infoButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/app/android/checkoutorderdone/orderdone/courierTips/data/CheckboxWithTextDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getSubtitle", "getVariants", "()Ljava/util/List;", "getCheckbox", "()Lru/ozon/app/android/checkoutorderdone/orderdone/courierTips/data/CheckboxWithTextDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getInfoButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CourierTipsDTO {
    public static final int $stable = 8;
    private final BadgeDTO badge;
    private final ButtonV3DTO button;
    private final CheckboxWithTextDTO checkbox;
    private final IconButtonV3DTO infoButton;
    private final TextDTO subtitle;

    @NotNull
    private final TextDTO title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @NotNull
    private final List<ChipDTO> variants;

    public CourierTipsDTO(@NotNull TextDTO title, BadgeDTO badgeDTO, TextDTO textDTO, @NotNull List<ChipDTO> variants, CheckboxWithTextDTO checkboxWithTextDTO, Map<String, TokenizedTrackingInfo> map, ButtonV3DTO buttonV3DTO, IconButtonV3DTO iconButtonV3DTO) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(variants, "variants");
        this.title = title;
        this.badge = badgeDTO;
        this.subtitle = textDTO;
        this.variants = variants;
        this.checkbox = checkboxWithTextDTO;
        this.trackingInfo = map;
        this.button = buttonV3DTO;
        this.infoButton = iconButtonV3DTO;
    }

    public static /* synthetic */ CourierTipsDTO copy$default(CourierTipsDTO courierTipsDTO, TextDTO textDTO, BadgeDTO badgeDTO, TextDTO textDTO2, List list, CheckboxWithTextDTO checkboxWithTextDTO, Map map, ButtonV3DTO buttonV3DTO, IconButtonV3DTO iconButtonV3DTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = courierTipsDTO.title;
        }
        if ((i11 & 2) != 0) {
            badgeDTO = courierTipsDTO.badge;
        }
        if ((i11 & 4) != 0) {
            textDTO2 = courierTipsDTO.subtitle;
        }
        if ((i11 & 8) != 0) {
            list = courierTipsDTO.variants;
        }
        if ((i11 & 16) != 0) {
            checkboxWithTextDTO = courierTipsDTO.checkbox;
        }
        if ((i11 & 32) != 0) {
            map = courierTipsDTO.trackingInfo;
        }
        if ((i11 & 64) != 0) {
            buttonV3DTO = courierTipsDTO.button;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            iconButtonV3DTO = courierTipsDTO.infoButton;
        }
        ButtonV3DTO buttonV3DTO2 = buttonV3DTO;
        IconButtonV3DTO iconButtonV3DTO2 = iconButtonV3DTO;
        CheckboxWithTextDTO checkboxWithTextDTO2 = checkboxWithTextDTO;
        Map map2 = map;
        return courierTipsDTO.copy(textDTO, badgeDTO, textDTO2, list, checkboxWithTextDTO2, map2, buttonV3DTO2, iconButtonV3DTO2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final BadgeDTO getBadge() {
        return this.badge;
    }

    /* renamed from: component3, reason: from getter */
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final List<ChipDTO> component4() {
        return this.variants;
    }

    /* renamed from: component5, reason: from getter */
    public final CheckboxWithTextDTO getCheckbox() {
        return this.checkbox;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.trackingInfo;
    }

    /* renamed from: component7, reason: from getter */
    public final ButtonV3DTO getButton() {
        return this.button;
    }

    /* renamed from: component8, reason: from getter */
    public final IconButtonV3DTO getInfoButton() {
        return this.infoButton;
    }

    @NotNull
    public final CourierTipsDTO copy(@NotNull TextDTO title, BadgeDTO badge, TextDTO subtitle, @NotNull List<ChipDTO> variants, CheckboxWithTextDTO checkbox, Map<String, TokenizedTrackingInfo> trackingInfo, ButtonV3DTO button, IconButtonV3DTO infoButton) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(variants, "variants");
        return new CourierTipsDTO(title, badge, subtitle, variants, checkbox, trackingInfo, button, infoButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CourierTipsDTO)) {
            return false;
        }
        CourierTipsDTO courierTipsDTO = (CourierTipsDTO) other;
        return Intrinsics.d(this.title, courierTipsDTO.title) && Intrinsics.d(this.badge, courierTipsDTO.badge) && Intrinsics.d(this.subtitle, courierTipsDTO.subtitle) && Intrinsics.d(this.variants, courierTipsDTO.variants) && Intrinsics.d(this.checkbox, courierTipsDTO.checkbox) && Intrinsics.d(this.trackingInfo, courierTipsDTO.trackingInfo) && Intrinsics.d(this.button, courierTipsDTO.button) && Intrinsics.d(this.infoButton, courierTipsDTO.infoButton);
    }

    public final BadgeDTO getBadge() {
        return this.badge;
    }

    public final ButtonV3DTO getButton() {
        return this.button;
    }

    public final CheckboxWithTextDTO getCheckbox() {
        return this.checkbox;
    }

    public final IconButtonV3DTO getInfoButton() {
        return this.infoButton;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    @NotNull
    public final List<ChipDTO> getVariants() {
        return this.variants;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        BadgeDTO badgeDTO = this.badge;
        int hashCode2 = (hashCode + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        TextDTO textDTO = this.subtitle;
        int b11 = g.b((hashCode2 + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31, this.variants);
        CheckboxWithTextDTO checkboxWithTextDTO = this.checkbox;
        int hashCode3 = (b11 + (checkboxWithTextDTO == null ? 0 : checkboxWithTextDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode4 = (hashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        ButtonV3DTO buttonV3DTO = this.button;
        int hashCode5 = (hashCode4 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
        IconButtonV3DTO iconButtonV3DTO = this.infoButton;
        return hashCode5 + (iconButtonV3DTO != null ? iconButtonV3DTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        BadgeDTO badgeDTO = this.badge;
        TextDTO textDTO2 = this.subtitle;
        List<ChipDTO> list = this.variants;
        CheckboxWithTextDTO checkboxWithTextDTO = this.checkbox;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        ButtonV3DTO buttonV3DTO = this.button;
        IconButtonV3DTO iconButtonV3DTO = this.infoButton;
        StringBuilder sb2 = new StringBuilder("CourierTipsDTO(title=");
        sb2.append(textDTO);
        sb2.append(", badge=");
        sb2.append(badgeDTO);
        sb2.append(", subtitle=");
        a.e(sb2, textDTO2, ", variants=", list, ", checkbox=");
        sb2.append(checkboxWithTextDTO);
        sb2.append(", trackingInfo=");
        sb2.append(map);
        sb2.append(", button=");
        sb2.append(buttonV3DTO);
        sb2.append(", infoButton=");
        sb2.append(iconButtonV3DTO);
        sb2.append(")");
        return sb2.toString();
    }
}
