package ru.ozon.app.android.travel.feature.general.common.widgets.buttonWithInformation.v2.data;

import De.C2859b;
import Fm.C3051a;
import T7.P;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0017\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000eHÆ\u0003Ja\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000eHÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001f\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006."}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/buttonWithInformation/v2/data/ButtonWithInformationV2DTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "price", "Lru/ozon/uni/atoms/data/price/PriceDTO;", DynamicElementDTO.LARGE_BUTTON, "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "smallButton", "cell", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "getLargeButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getSmallButton", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ButtonWithInformationV2DTO {
    public static final int $stable = 8;
    private final BadgeDTO badge;
    private final CellDTO cell;

    @NotNull
    private final ButtonV3DTO largeButton;

    @NotNull
    private final PriceDTO price;

    @NotNull
    private final ButtonV3DTO smallButton;

    @NotNull
    private final TextDTO title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public ButtonWithInformationV2DTO(@NotNull TextDTO title, @NotNull PriceDTO price, @NotNull ButtonV3DTO largeButton, @NotNull ButtonV3DTO smallButton, CellDTO cellDTO, BadgeDTO badgeDTO, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(largeButton, "largeButton");
        Intrinsics.checkNotNullParameter(smallButton, "smallButton");
        this.title = title;
        this.price = price;
        this.largeButton = largeButton;
        this.smallButton = smallButton;
        this.cell = cellDTO;
        this.badge = badgeDTO;
        this.trackingInfo = map;
    }

    public static /* synthetic */ ButtonWithInformationV2DTO copy$default(ButtonWithInformationV2DTO buttonWithInformationV2DTO, TextDTO textDTO, PriceDTO priceDTO, ButtonV3DTO buttonV3DTO, ButtonV3DTO buttonV3DTO2, CellDTO cellDTO, BadgeDTO badgeDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = buttonWithInformationV2DTO.title;
        }
        if ((i11 & 2) != 0) {
            priceDTO = buttonWithInformationV2DTO.price;
        }
        if ((i11 & 4) != 0) {
            buttonV3DTO = buttonWithInformationV2DTO.largeButton;
        }
        if ((i11 & 8) != 0) {
            buttonV3DTO2 = buttonWithInformationV2DTO.smallButton;
        }
        if ((i11 & 16) != 0) {
            cellDTO = buttonWithInformationV2DTO.cell;
        }
        if ((i11 & 32) != 0) {
            badgeDTO = buttonWithInformationV2DTO.badge;
        }
        if ((i11 & 64) != 0) {
            map = buttonWithInformationV2DTO.trackingInfo;
        }
        BadgeDTO badgeDTO2 = badgeDTO;
        Map map2 = map;
        CellDTO cellDTO2 = cellDTO;
        ButtonV3DTO buttonV3DTO3 = buttonV3DTO;
        return buttonWithInformationV2DTO.copy(textDTO, priceDTO, buttonV3DTO3, buttonV3DTO2, cellDTO2, badgeDTO2, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final PriceDTO getPrice() {
        return this.price;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final ButtonV3DTO getLargeButton() {
        return this.largeButton;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final ButtonV3DTO getSmallButton() {
        return this.smallButton;
    }

    /* renamed from: component5, reason: from getter */
    public final CellDTO getCell() {
        return this.cell;
    }

    /* renamed from: component6, reason: from getter */
    public final BadgeDTO getBadge() {
        return this.badge;
    }

    public final Map<String, TokenizedTrackingInfo> component7() {
        return this.trackingInfo;
    }

    @NotNull
    public final ButtonWithInformationV2DTO copy(@NotNull TextDTO title, @NotNull PriceDTO price, @NotNull ButtonV3DTO largeButton, @NotNull ButtonV3DTO smallButton, CellDTO cell, BadgeDTO badge, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(largeButton, "largeButton");
        Intrinsics.checkNotNullParameter(smallButton, "smallButton");
        return new ButtonWithInformationV2DTO(title, price, largeButton, smallButton, cell, badge, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonWithInformationV2DTO)) {
            return false;
        }
        ButtonWithInformationV2DTO buttonWithInformationV2DTO = (ButtonWithInformationV2DTO) other;
        return Intrinsics.d(this.title, buttonWithInformationV2DTO.title) && Intrinsics.d(this.price, buttonWithInformationV2DTO.price) && Intrinsics.d(this.largeButton, buttonWithInformationV2DTO.largeButton) && Intrinsics.d(this.smallButton, buttonWithInformationV2DTO.smallButton) && Intrinsics.d(this.cell, buttonWithInformationV2DTO.cell) && Intrinsics.d(this.badge, buttonWithInformationV2DTO.badge) && Intrinsics.d(this.trackingInfo, buttonWithInformationV2DTO.trackingInfo);
    }

    public final BadgeDTO getBadge() {
        return this.badge;
    }

    public final CellDTO getCell() {
        return this.cell;
    }

    @NotNull
    public final ButtonV3DTO getLargeButton() {
        return this.largeButton;
    }

    @NotNull
    public final PriceDTO getPrice() {
        return this.price;
    }

    @NotNull
    public final ButtonV3DTO getSmallButton() {
        return this.smallButton;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int c11 = C2859b.c(this.smallButton, C2859b.c(this.largeButton, C3051a.b(this.price, this.title.hashCode() * 31, 31), 31), 31);
        CellDTO cellDTO = this.cell;
        int hashCode = (c11 + (cellDTO == null ? 0 : cellDTO.hashCode())) * 31;
        BadgeDTO badgeDTO = this.badge;
        int hashCode2 = (hashCode + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        PriceDTO priceDTO = this.price;
        ButtonV3DTO buttonV3DTO = this.largeButton;
        ButtonV3DTO buttonV3DTO2 = this.smallButton;
        CellDTO cellDTO = this.cell;
        BadgeDTO badgeDTO = this.badge;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("ButtonWithInformationV2DTO(title=");
        sb2.append(textDTO);
        sb2.append(", price=");
        sb2.append(priceDTO);
        sb2.append(", largeButton=");
        sb2.append(buttonV3DTO);
        sb2.append(", smallButton=");
        sb2.append(buttonV3DTO2);
        sb2.append(", cell=");
        sb2.append(cellDTO);
        sb2.append(", badge=");
        sb2.append(badgeDTO);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }
}
