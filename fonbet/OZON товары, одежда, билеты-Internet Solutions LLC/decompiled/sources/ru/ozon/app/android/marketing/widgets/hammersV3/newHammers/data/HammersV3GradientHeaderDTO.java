package ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data;

import Ih.a;
import T7.P;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010%\u001a\u00020\fHÆ\u0003J\u0017\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000eHÆ\u0003Je\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000eHÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001f\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006."}, d2 = {"Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/data/HammersV3GradientHeaderDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/data/GradientTitleDTO;", "subtitle", "Lru/ozon/uni/atoms/data/text/TextDTO;", "infoText", "rightBadge", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/data/RightBadge;", "infoButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/data/GradientTitleDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/data/RightBadge;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/data/GradientTitleDTO;", "getSubtitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getInfoText", "getRightBadge", "()Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/data/RightBadge;", "getInfoButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class HammersV3GradientHeaderDTO {
    public static final int $stable = 8;

    @NotNull
    private final AtomActionDTO action;
    private final IconButtonV3DTO infoButton;
    private final TextDTO infoText;
    private final RightBadge rightBadge;
    private final TextDTO subtitle;

    @NotNull
    private final GradientTitleDTO title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public HammersV3GradientHeaderDTO(@NotNull GradientTitleDTO title, TextDTO textDTO, TextDTO textDTO2, RightBadge rightBadge, IconButtonV3DTO iconButtonV3DTO, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(action, "action");
        this.title = title;
        this.subtitle = textDTO;
        this.infoText = textDTO2;
        this.rightBadge = rightBadge;
        this.infoButton = iconButtonV3DTO;
        this.action = action;
        this.trackingInfo = map;
    }

    public static /* synthetic */ HammersV3GradientHeaderDTO copy$default(HammersV3GradientHeaderDTO hammersV3GradientHeaderDTO, GradientTitleDTO gradientTitleDTO, TextDTO textDTO, TextDTO textDTO2, RightBadge rightBadge, IconButtonV3DTO iconButtonV3DTO, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            gradientTitleDTO = hammersV3GradientHeaderDTO.title;
        }
        if ((i11 & 2) != 0) {
            textDTO = hammersV3GradientHeaderDTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            textDTO2 = hammersV3GradientHeaderDTO.infoText;
        }
        if ((i11 & 8) != 0) {
            rightBadge = hammersV3GradientHeaderDTO.rightBadge;
        }
        if ((i11 & 16) != 0) {
            iconButtonV3DTO = hammersV3GradientHeaderDTO.infoButton;
        }
        if ((i11 & 32) != 0) {
            atomActionDTO = hammersV3GradientHeaderDTO.action;
        }
        if ((i11 & 64) != 0) {
            map = hammersV3GradientHeaderDTO.trackingInfo;
        }
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        Map map2 = map;
        IconButtonV3DTO iconButtonV3DTO2 = iconButtonV3DTO;
        TextDTO textDTO3 = textDTO2;
        return hammersV3GradientHeaderDTO.copy(gradientTitleDTO, textDTO, textDTO3, rightBadge, iconButtonV3DTO2, atomActionDTO2, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final GradientTitleDTO getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final TextDTO getInfoText() {
        return this.infoText;
    }

    /* renamed from: component4, reason: from getter */
    public final RightBadge getRightBadge() {
        return this.rightBadge;
    }

    /* renamed from: component5, reason: from getter */
    public final IconButtonV3DTO getInfoButton() {
        return this.infoButton;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final Map<String, TokenizedTrackingInfo> component7() {
        return this.trackingInfo;
    }

    @NotNull
    public final HammersV3GradientHeaderDTO copy(@NotNull GradientTitleDTO title, TextDTO subtitle, TextDTO infoText, RightBadge rightBadge, IconButtonV3DTO infoButton, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(action, "action");
        return new HammersV3GradientHeaderDTO(title, subtitle, infoText, rightBadge, infoButton, action, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HammersV3GradientHeaderDTO)) {
            return false;
        }
        HammersV3GradientHeaderDTO hammersV3GradientHeaderDTO = (HammersV3GradientHeaderDTO) other;
        return Intrinsics.d(this.title, hammersV3GradientHeaderDTO.title) && Intrinsics.d(this.subtitle, hammersV3GradientHeaderDTO.subtitle) && Intrinsics.d(this.infoText, hammersV3GradientHeaderDTO.infoText) && Intrinsics.d(this.rightBadge, hammersV3GradientHeaderDTO.rightBadge) && Intrinsics.d(this.infoButton, hammersV3GradientHeaderDTO.infoButton) && Intrinsics.d(this.action, hammersV3GradientHeaderDTO.action) && Intrinsics.d(this.trackingInfo, hammersV3GradientHeaderDTO.trackingInfo);
    }

    @NotNull
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final IconButtonV3DTO getInfoButton() {
        return this.infoButton;
    }

    public final TextDTO getInfoText() {
        return this.infoText;
    }

    public final RightBadge getRightBadge() {
        return this.rightBadge;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final GradientTitleDTO getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        TextDTO textDTO = this.subtitle;
        int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        TextDTO textDTO2 = this.infoText;
        int hashCode3 = (hashCode2 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
        RightBadge rightBadge = this.rightBadge;
        int hashCode4 = (hashCode3 + (rightBadge == null ? 0 : rightBadge.hashCode())) * 31;
        IconButtonV3DTO iconButtonV3DTO = this.infoButton;
        int b11 = a.b(this.action, (hashCode4 + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31, 31);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return b11 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        GradientTitleDTO gradientTitleDTO = this.title;
        TextDTO textDTO = this.subtitle;
        TextDTO textDTO2 = this.infoText;
        RightBadge rightBadge = this.rightBadge;
        IconButtonV3DTO iconButtonV3DTO = this.infoButton;
        AtomActionDTO atomActionDTO = this.action;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("HammersV3GradientHeaderDTO(title=");
        sb2.append(gradientTitleDTO);
        sb2.append(", subtitle=");
        sb2.append(textDTO);
        sb2.append(", infoText=");
        sb2.append(textDTO2);
        sb2.append(", rightBadge=");
        sb2.append(rightBadge);
        sb2.append(", infoButton=");
        sb2.append(iconButtonV3DTO);
        sb2.append(", action=");
        sb2.append(atomActionDTO);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }
}
