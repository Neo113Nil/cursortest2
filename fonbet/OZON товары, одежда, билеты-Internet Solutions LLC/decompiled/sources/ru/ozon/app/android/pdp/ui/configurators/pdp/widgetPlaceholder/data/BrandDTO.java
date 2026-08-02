package ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.data;

import C.o0;
import Sc.InterfaceC3999a;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.pdp.ui.configurators.pdp.onboarding.data.PDPOnBoardingDTO;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.BasePlaceholderWidgetObject;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.cell.DisclosureIconTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.UncontainedIconLabelButtonDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010#\u001a\u00020\u0001H\u0016J\u0010\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0017\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0007HÆ\u0003Jl\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010,J\u0013\u0010-\u001a\u00020\u00032\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u00020\u0007HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0002\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001e\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0007X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0017\"\u0004\b!\u0010\"¨\u00063"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/BrandDTO;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/BasePlaceholderWidgetObject;", "isOriginalGoods", "", "cell", "Lru/ozon/uni/atoms/data/AtomDTO;", "backgroundColor", "", "onboarding", "Lru/ozon/app/android/pdp/ui/configurators/pdp/onboarding/data/PDPOnBoardingDTO;", "commonOnboarding", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "json", "<init>", "(Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/AtomDTO;Ljava/lang/String;Lru/ozon/app/android/pdp/ui/configurators/pdp/onboarding/data/PDPOnBoardingDTO;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;Ljava/util/Map;Ljava/lang/String;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCell", "()Lru/ozon/uni/atoms/data/AtomDTO;", "getBackgroundColor", "()Ljava/lang/String;", "getOnboarding$annotations", "()V", "getOnboarding", "()Lru/ozon/app/android/pdp/ui/configurators/pdp/onboarding/data/PDPOnBoardingDTO;", "getCommonOnboarding", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getJson", "setJson", "(Ljava/lang/String;)V", "copyExcludingAnalytics", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/AtomDTO;Ljava/lang/String;Lru/ozon/app/android/pdp/ui/configurators/pdp/onboarding/data/PDPOnBoardingDTO;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;Ljava/util/Map;Ljava/lang/String;)Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/BrandDTO;", "equals", "other", "", "hashCode", "", "toString", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class BrandDTO extends BasePlaceholderWidgetObject {
    public static final int $stable = 8;
    private final String backgroundColor;

    @NotNull
    private final AtomDTO cell;
    private final OnBoardingDTO commonOnboarding;
    private final Boolean isOriginalGoods;
    private String json;
    private final PDPOnBoardingDTO onboarding;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public BrandDTO(Boolean bool, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "cell", type = DisclosureIconTitleSubtitleCellDTO.class), @ProtoOneOfSignature(name = "button", type = UncontainedIconLabelButtonDTO.class), @ProtoOneOfSignature(name = "dsButton", type = ButtonV3DTO.class), @ProtoOneOfSignature(name = "dsCell", type = CellDTO.class)}) @NotNull @ProtoOneOf(label = "type") AtomDTO cell, String str, PDPOnBoardingDTO pDPOnBoardingDTO, OnBoardingDTO onBoardingDTO, Map<String, TokenizedTrackingInfo> map, String str2) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        this.isOriginalGoods = bool;
        this.cell = cell;
        this.backgroundColor = str;
        this.onboarding = pDPOnBoardingDTO;
        this.commonOnboarding = onBoardingDTO;
        this.trackingInfo = map;
        this.json = str2;
    }

    public static /* synthetic */ BrandDTO copy$default(BrandDTO brandDTO, Boolean bool, AtomDTO atomDTO, String str, PDPOnBoardingDTO pDPOnBoardingDTO, OnBoardingDTO onBoardingDTO, Map map, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = brandDTO.isOriginalGoods;
        }
        if ((i11 & 2) != 0) {
            atomDTO = brandDTO.cell;
        }
        if ((i11 & 4) != 0) {
            str = brandDTO.backgroundColor;
        }
        if ((i11 & 8) != 0) {
            pDPOnBoardingDTO = brandDTO.onboarding;
        }
        if ((i11 & 16) != 0) {
            onBoardingDTO = brandDTO.commonOnboarding;
        }
        if ((i11 & 32) != 0) {
            map = brandDTO.trackingInfo;
        }
        if ((i11 & 64) != 0) {
            str2 = brandDTO.json;
        }
        Map map2 = map;
        String str3 = str2;
        OnBoardingDTO onBoardingDTO2 = onBoardingDTO;
        String str4 = str;
        return brandDTO.copy(bool, atomDTO, str4, pDPOnBoardingDTO, onBoardingDTO2, map2, str3);
    }

    @InterfaceC3999a
    public static /* synthetic */ void getOnboarding$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getIsOriginalGoods() {
        return this.isOriginalGoods;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final AtomDTO getCell() {
        return this.cell;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component4, reason: from getter */
    public final PDPOnBoardingDTO getOnboarding() {
        return this.onboarding;
    }

    /* renamed from: component5, reason: from getter */
    public final OnBoardingDTO getCommonOnboarding() {
        return this.commonOnboarding;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.trackingInfo;
    }

    /* renamed from: component7, reason: from getter */
    public final String getJson() {
        return this.json;
    }

    @NotNull
    public final BrandDTO copy(Boolean isOriginalGoods, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "cell", type = DisclosureIconTitleSubtitleCellDTO.class), @ProtoOneOfSignature(name = "button", type = UncontainedIconLabelButtonDTO.class), @ProtoOneOfSignature(name = "dsButton", type = ButtonV3DTO.class), @ProtoOneOfSignature(name = "dsCell", type = CellDTO.class)}) @NotNull @ProtoOneOf(label = "type") AtomDTO cell, String backgroundColor, PDPOnBoardingDTO onboarding, OnBoardingDTO commonOnboarding, Map<String, TokenizedTrackingInfo> trackingInfo, String json) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        return new BrandDTO(isOriginalGoods, cell, backgroundColor, onboarding, commonOnboarding, trackingInfo, json);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.BasePlaceholderWidgetObject
    @NotNull
    public BasePlaceholderWidgetObject copyExcludingAnalytics() {
        OnBoardingDTO onBoardingDTO = this.commonOnboarding;
        OnBoardingDTO copy$default = onBoardingDTO != null ? OnBoardingDTO.copy$default(onBoardingDTO, null, null, null, null, null, null, 59, null) : null;
        PDPOnBoardingDTO pDPOnBoardingDTO = this.onboarding;
        return copy$default(this, null, null, null, pDPOnBoardingDTO != null ? PDPOnBoardingDTO.copy$default(pDPOnBoardingDTO, null, null, null, null, 7, null) : null, copy$default, null, null, 71, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BrandDTO)) {
            return false;
        }
        BrandDTO brandDTO = (BrandDTO) other;
        return Intrinsics.d(this.isOriginalGoods, brandDTO.isOriginalGoods) && Intrinsics.d(this.cell, brandDTO.cell) && Intrinsics.d(this.backgroundColor, brandDTO.backgroundColor) && Intrinsics.d(this.onboarding, brandDTO.onboarding) && Intrinsics.d(this.commonOnboarding, brandDTO.commonOnboarding) && Intrinsics.d(this.trackingInfo, brandDTO.trackingInfo) && Intrinsics.d(this.json, brandDTO.json);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final AtomDTO getCell() {
        return this.cell;
    }

    public final OnBoardingDTO getCommonOnboarding() {
        return this.commonOnboarding;
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.BasePlaceholderWidgetObject
    public String getJson() {
        return this.json;
    }

    public final PDPOnBoardingDTO getOnboarding() {
        return this.onboarding;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        Boolean bool = this.isOriginalGoods;
        int hashCode = (this.cell.hashCode() + ((bool == null ? 0 : bool.hashCode()) * 31)) * 31;
        String str = this.backgroundColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        PDPOnBoardingDTO pDPOnBoardingDTO = this.onboarding;
        int hashCode3 = (hashCode2 + (pDPOnBoardingDTO == null ? 0 : pDPOnBoardingDTO.hashCode())) * 31;
        OnBoardingDTO onBoardingDTO = this.commonOnboarding;
        int hashCode4 = (hashCode3 + (onBoardingDTO == null ? 0 : onBoardingDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode5 = (hashCode4 + (map == null ? 0 : map.hashCode())) * 31;
        String str2 = this.json;
        return hashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    public final Boolean isOriginalGoods() {
        return this.isOriginalGoods;
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.BasePlaceholderWidgetObject
    public void setJson(String str) {
        this.json = str;
    }

    @NotNull
    public String toString() {
        Boolean bool = this.isOriginalGoods;
        AtomDTO atomDTO = this.cell;
        String str = this.backgroundColor;
        PDPOnBoardingDTO pDPOnBoardingDTO = this.onboarding;
        OnBoardingDTO onBoardingDTO = this.commonOnboarding;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        String str2 = this.json;
        StringBuilder sb2 = new StringBuilder("BrandDTO(isOriginalGoods=");
        sb2.append(bool);
        sb2.append(", cell=");
        sb2.append(atomDTO);
        sb2.append(", backgroundColor=");
        sb2.append(str);
        sb2.append(", onboarding=");
        sb2.append(pDPOnBoardingDTO);
        sb2.append(", commonOnboarding=");
        sb2.append(onBoardingDTO);
        sb2.append(", trackingInfo=");
        sb2.append(map);
        sb2.append(", json=");
        return o0.c(sb2, str2, ")");
    }
}
