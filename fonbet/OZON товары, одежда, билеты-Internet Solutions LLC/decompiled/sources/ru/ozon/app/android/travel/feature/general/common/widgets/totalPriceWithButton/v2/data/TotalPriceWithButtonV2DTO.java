package ru.ozon.app.android.travel.feature.general.common.widgets.totalPriceWithButton.v2.data;

import B4.V;
import Bl.C2639a;
import De.C2859b;
import F3.G;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010:\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010(J\u000b\u0010;\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\t\u0010<\u001a\u00020\u0013HÆ\u0003J\t\u0010=\u001a\u00020\u0013HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010?\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017HÆ\u0003J¾\u0001\u0010@\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017HÆ\u0001¢\u0006\u0002\u0010AJ\u0013\u0010B\u001a\u00020C2\b\u0010D\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010E\u001a\u00020\u000fHÖ\u0001J\t\u0010F\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001cR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010 R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001cR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001eR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010)\u001a\u0004\b'\u0010(R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\u0014\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b.\u0010-R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001cR\u001f\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b0\u00101¨\u0006G"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/data/TotalPriceWithButtonV2DTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "titleIcon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "titlePrice", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "titleCommon", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "subtitle", "subtitlePrice", "countdownTitle", "countdownIcon", "countdownTime", "", "countdownColor", "", "nextButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "nextStickyButton", "agreement", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Ljava/lang/Integer;Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitleIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getTitlePrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "getTitleCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getSubtitle", "getSubtitlePrice", "getCountdownTitle", "getCountdownIcon", "getCountdownTime", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCountdownColor", "()Ljava/lang/String;", "getNextButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getNextStickyButton", "getAgreement", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Ljava/lang/Integer;Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/Map;)Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/data/TotalPriceWithButtonV2DTO;", "equals", "", "other", "hashCode", "toString", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TotalPriceWithButtonV2DTO {
    public static final int $stable = 8;
    private final TextDTO agreement;
    private final String countdownColor;
    private final IconDTO countdownIcon;
    private final Integer countdownTime;
    private final TextDTO countdownTitle;

    @NotNull
    private final ButtonV3DTO nextButton;

    @NotNull
    private final ButtonV3DTO nextStickyButton;
    private final TextDTO subtitle;
    private final PriceDTO subtitlePrice;
    private final TextDTO title;
    private final CommonControlSettings titleCommon;
    private final IconDTO titleIcon;
    private final PriceDTO titlePrice;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public TotalPriceWithButtonV2DTO(TextDTO textDTO, IconDTO iconDTO, PriceDTO priceDTO, CommonControlSettings commonControlSettings, TextDTO textDTO2, PriceDTO priceDTO2, TextDTO textDTO3, IconDTO iconDTO2, Integer num, String str, @NotNull ButtonV3DTO nextButton, @NotNull ButtonV3DTO nextStickyButton, TextDTO textDTO4, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(nextButton, "nextButton");
        Intrinsics.checkNotNullParameter(nextStickyButton, "nextStickyButton");
        this.title = textDTO;
        this.titleIcon = iconDTO;
        this.titlePrice = priceDTO;
        this.titleCommon = commonControlSettings;
        this.subtitle = textDTO2;
        this.subtitlePrice = priceDTO2;
        this.countdownTitle = textDTO3;
        this.countdownIcon = iconDTO2;
        this.countdownTime = num;
        this.countdownColor = str;
        this.nextButton = nextButton;
        this.nextStickyButton = nextStickyButton;
        this.agreement = textDTO4;
        this.trackingInfo = map;
    }

    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    /* renamed from: component10, reason: from getter */
    public final String getCountdownColor() {
        return this.countdownColor;
    }

    @NotNull
    /* renamed from: component11, reason: from getter */
    public final ButtonV3DTO getNextButton() {
        return this.nextButton;
    }

    @NotNull
    /* renamed from: component12, reason: from getter */
    public final ButtonV3DTO getNextStickyButton() {
        return this.nextStickyButton;
    }

    /* renamed from: component13, reason: from getter */
    public final TextDTO getAgreement() {
        return this.agreement;
    }

    public final Map<String, TokenizedTrackingInfo> component14() {
        return this.trackingInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final IconDTO getTitleIcon() {
        return this.titleIcon;
    }

    /* renamed from: component3, reason: from getter */
    public final PriceDTO getTitlePrice() {
        return this.titlePrice;
    }

    /* renamed from: component4, reason: from getter */
    public final CommonControlSettings getTitleCommon() {
        return this.titleCommon;
    }

    /* renamed from: component5, reason: from getter */
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component6, reason: from getter */
    public final PriceDTO getSubtitlePrice() {
        return this.subtitlePrice;
    }

    /* renamed from: component7, reason: from getter */
    public final TextDTO getCountdownTitle() {
        return this.countdownTitle;
    }

    /* renamed from: component8, reason: from getter */
    public final IconDTO getCountdownIcon() {
        return this.countdownIcon;
    }

    /* renamed from: component9, reason: from getter */
    public final Integer getCountdownTime() {
        return this.countdownTime;
    }

    @NotNull
    public final TotalPriceWithButtonV2DTO copy(TextDTO title, IconDTO titleIcon, PriceDTO titlePrice, CommonControlSettings titleCommon, TextDTO subtitle, PriceDTO subtitlePrice, TextDTO countdownTitle, IconDTO countdownIcon, Integer countdownTime, String countdownColor, @NotNull ButtonV3DTO nextButton, @NotNull ButtonV3DTO nextStickyButton, TextDTO agreement, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(nextButton, "nextButton");
        Intrinsics.checkNotNullParameter(nextStickyButton, "nextStickyButton");
        return new TotalPriceWithButtonV2DTO(title, titleIcon, titlePrice, titleCommon, subtitle, subtitlePrice, countdownTitle, countdownIcon, countdownTime, countdownColor, nextButton, nextStickyButton, agreement, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TotalPriceWithButtonV2DTO)) {
            return false;
        }
        TotalPriceWithButtonV2DTO totalPriceWithButtonV2DTO = (TotalPriceWithButtonV2DTO) other;
        return Intrinsics.d(this.title, totalPriceWithButtonV2DTO.title) && Intrinsics.d(this.titleIcon, totalPriceWithButtonV2DTO.titleIcon) && Intrinsics.d(this.titlePrice, totalPriceWithButtonV2DTO.titlePrice) && Intrinsics.d(this.titleCommon, totalPriceWithButtonV2DTO.titleCommon) && Intrinsics.d(this.subtitle, totalPriceWithButtonV2DTO.subtitle) && Intrinsics.d(this.subtitlePrice, totalPriceWithButtonV2DTO.subtitlePrice) && Intrinsics.d(this.countdownTitle, totalPriceWithButtonV2DTO.countdownTitle) && Intrinsics.d(this.countdownIcon, totalPriceWithButtonV2DTO.countdownIcon) && Intrinsics.d(this.countdownTime, totalPriceWithButtonV2DTO.countdownTime) && Intrinsics.d(this.countdownColor, totalPriceWithButtonV2DTO.countdownColor) && Intrinsics.d(this.nextButton, totalPriceWithButtonV2DTO.nextButton) && Intrinsics.d(this.nextStickyButton, totalPriceWithButtonV2DTO.nextStickyButton) && Intrinsics.d(this.agreement, totalPriceWithButtonV2DTO.agreement) && Intrinsics.d(this.trackingInfo, totalPriceWithButtonV2DTO.trackingInfo);
    }

    public final TextDTO getAgreement() {
        return this.agreement;
    }

    public final String getCountdownColor() {
        return this.countdownColor;
    }

    public final IconDTO getCountdownIcon() {
        return this.countdownIcon;
    }

    public final Integer getCountdownTime() {
        return this.countdownTime;
    }

    public final TextDTO getCountdownTitle() {
        return this.countdownTitle;
    }

    @NotNull
    public final ButtonV3DTO getNextButton() {
        return this.nextButton;
    }

    @NotNull
    public final ButtonV3DTO getNextStickyButton() {
        return this.nextStickyButton;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    public final PriceDTO getSubtitlePrice() {
        return this.subtitlePrice;
    }

    public final TextDTO getTitle() {
        return this.title;
    }

    public final CommonControlSettings getTitleCommon() {
        return this.titleCommon;
    }

    public final IconDTO getTitleIcon() {
        return this.titleIcon;
    }

    public final PriceDTO getTitlePrice() {
        return this.titlePrice;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        TextDTO textDTO = this.title;
        int hashCode = (textDTO == null ? 0 : textDTO.hashCode()) * 31;
        IconDTO iconDTO = this.titleIcon;
        int hashCode2 = (hashCode + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
        PriceDTO priceDTO = this.titlePrice;
        int hashCode3 = (hashCode2 + (priceDTO == null ? 0 : priceDTO.hashCode())) * 31;
        CommonControlSettings commonControlSettings = this.titleCommon;
        int hashCode4 = (hashCode3 + (commonControlSettings == null ? 0 : commonControlSettings.hashCode())) * 31;
        TextDTO textDTO2 = this.subtitle;
        int hashCode5 = (hashCode4 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
        PriceDTO priceDTO2 = this.subtitlePrice;
        int hashCode6 = (hashCode5 + (priceDTO2 == null ? 0 : priceDTO2.hashCode())) * 31;
        TextDTO textDTO3 = this.countdownTitle;
        int hashCode7 = (hashCode6 + (textDTO3 == null ? 0 : textDTO3.hashCode())) * 31;
        IconDTO iconDTO2 = this.countdownIcon;
        int hashCode8 = (hashCode7 + (iconDTO2 == null ? 0 : iconDTO2.hashCode())) * 31;
        Integer num = this.countdownTime;
        int hashCode9 = (hashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.countdownColor;
        int c11 = C2859b.c(this.nextStickyButton, C2859b.c(this.nextButton, (hashCode9 + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
        TextDTO textDTO4 = this.agreement;
        int hashCode10 = (c11 + (textDTO4 == null ? 0 : textDTO4.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode10 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        IconDTO iconDTO = this.titleIcon;
        PriceDTO priceDTO = this.titlePrice;
        CommonControlSettings commonControlSettings = this.titleCommon;
        TextDTO textDTO2 = this.subtitle;
        PriceDTO priceDTO2 = this.subtitlePrice;
        TextDTO textDTO3 = this.countdownTitle;
        IconDTO iconDTO2 = this.countdownIcon;
        Integer num = this.countdownTime;
        String str = this.countdownColor;
        ButtonV3DTO buttonV3DTO = this.nextButton;
        ButtonV3DTO buttonV3DTO2 = this.nextStickyButton;
        TextDTO textDTO4 = this.agreement;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder d11 = C2639a.d("TotalPriceWithButtonV2DTO(title=", ", titleIcon=", ", titlePrice=", iconDTO, textDTO);
        d11.append(priceDTO);
        d11.append(", titleCommon=");
        d11.append(commonControlSettings);
        d11.append(", subtitle=");
        d11.append(textDTO2);
        d11.append(", subtitlePrice=");
        d11.append(priceDTO2);
        d11.append(", countdownTitle=");
        G.f(d11, textDTO3, ", countdownIcon=", iconDTO2, ", countdownTime=");
        V.f(num, ", countdownColor=", str, ", nextButton=", d11);
        d11.append(buttonV3DTO);
        d11.append(", nextStickyButton=");
        d11.append(buttonV3DTO2);
        d11.append(", agreement=");
        d11.append(textDTO4);
        d11.append(", trackingInfo=");
        d11.append(map);
        d11.append(")");
        return d11.toString();
    }
}
