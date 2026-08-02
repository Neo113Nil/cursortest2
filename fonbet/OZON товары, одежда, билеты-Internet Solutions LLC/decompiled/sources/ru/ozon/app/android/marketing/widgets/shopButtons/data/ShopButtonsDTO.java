package ru.ozon.app.android.marketing.widgets.shopButtons.data;

import T7.P;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0017\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003JO\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, d2 = {"Lru/ozon/app/android/marketing/widgets/shopButtons/data/ShopButtonsDTO;", "", "mainButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "rightButtonFirst", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "rightButtonSecond", "backgroundColor", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Ljava/lang/String;Ljava/util/Map;)V", "getMainButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getRightButtonFirst", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getRightButtonSecond", "getBackgroundColor", "()Ljava/lang/String;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ShopButtonsDTO {
    public static final int $stable = 8;
    private final String backgroundColor;

    @NotNull
    private final ButtonV3DTO mainButton;
    private final IconButtonV3DTO rightButtonFirst;
    private final IconButtonV3DTO rightButtonSecond;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public ShopButtonsDTO(@NotNull ButtonV3DTO mainButton, IconButtonV3DTO iconButtonV3DTO, IconButtonV3DTO iconButtonV3DTO2, String str, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(mainButton, "mainButton");
        this.mainButton = mainButton;
        this.rightButtonFirst = iconButtonV3DTO;
        this.rightButtonSecond = iconButtonV3DTO2;
        this.backgroundColor = str;
        this.trackingInfo = map;
    }

    public static /* synthetic */ ShopButtonsDTO copy$default(ShopButtonsDTO shopButtonsDTO, ButtonV3DTO buttonV3DTO, IconButtonV3DTO iconButtonV3DTO, IconButtonV3DTO iconButtonV3DTO2, String str, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            buttonV3DTO = shopButtonsDTO.mainButton;
        }
        if ((i11 & 2) != 0) {
            iconButtonV3DTO = shopButtonsDTO.rightButtonFirst;
        }
        if ((i11 & 4) != 0) {
            iconButtonV3DTO2 = shopButtonsDTO.rightButtonSecond;
        }
        if ((i11 & 8) != 0) {
            str = shopButtonsDTO.backgroundColor;
        }
        if ((i11 & 16) != 0) {
            map = shopButtonsDTO.trackingInfo;
        }
        Map map2 = map;
        IconButtonV3DTO iconButtonV3DTO3 = iconButtonV3DTO2;
        return shopButtonsDTO.copy(buttonV3DTO, iconButtonV3DTO, iconButtonV3DTO3, str, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ButtonV3DTO getMainButton() {
        return this.mainButton;
    }

    /* renamed from: component2, reason: from getter */
    public final IconButtonV3DTO getRightButtonFirst() {
        return this.rightButtonFirst;
    }

    /* renamed from: component3, reason: from getter */
    public final IconButtonV3DTO getRightButtonSecond() {
        return this.rightButtonSecond;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.trackingInfo;
    }

    @NotNull
    public final ShopButtonsDTO copy(@NotNull ButtonV3DTO mainButton, IconButtonV3DTO rightButtonFirst, IconButtonV3DTO rightButtonSecond, String backgroundColor, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(mainButton, "mainButton");
        return new ShopButtonsDTO(mainButton, rightButtonFirst, rightButtonSecond, backgroundColor, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShopButtonsDTO)) {
            return false;
        }
        ShopButtonsDTO shopButtonsDTO = (ShopButtonsDTO) other;
        return Intrinsics.d(this.mainButton, shopButtonsDTO.mainButton) && Intrinsics.d(this.rightButtonFirst, shopButtonsDTO.rightButtonFirst) && Intrinsics.d(this.rightButtonSecond, shopButtonsDTO.rightButtonSecond) && Intrinsics.d(this.backgroundColor, shopButtonsDTO.backgroundColor) && Intrinsics.d(this.trackingInfo, shopButtonsDTO.trackingInfo);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final ButtonV3DTO getMainButton() {
        return this.mainButton;
    }

    public final IconButtonV3DTO getRightButtonFirst() {
        return this.rightButtonFirst;
    }

    public final IconButtonV3DTO getRightButtonSecond() {
        return this.rightButtonSecond;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.mainButton.hashCode() * 31;
        IconButtonV3DTO iconButtonV3DTO = this.rightButtonFirst;
        int hashCode2 = (hashCode + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31;
        IconButtonV3DTO iconButtonV3DTO2 = this.rightButtonSecond;
        int hashCode3 = (hashCode2 + (iconButtonV3DTO2 == null ? 0 : iconButtonV3DTO2.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode4 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        ButtonV3DTO buttonV3DTO = this.mainButton;
        IconButtonV3DTO iconButtonV3DTO = this.rightButtonFirst;
        IconButtonV3DTO iconButtonV3DTO2 = this.rightButtonSecond;
        String str = this.backgroundColor;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("ShopButtonsDTO(mainButton=");
        sb2.append(buttonV3DTO);
        sb2.append(", rightButtonFirst=");
        sb2.append(iconButtonV3DTO);
        sb2.append(", rightButtonSecond=");
        sb2.append(iconButtonV3DTO2);
        sb2.append(", backgroundColor=");
        sb2.append(str);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }
}
