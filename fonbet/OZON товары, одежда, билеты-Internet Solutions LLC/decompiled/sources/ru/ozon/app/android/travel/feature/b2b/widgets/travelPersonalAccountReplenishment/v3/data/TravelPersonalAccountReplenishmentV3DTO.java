package ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v3.data;

import De.C2859b;
import G.g;
import T7.P;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.molecules.dto.commonInput.v2.CommonInputV2DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B[\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010&\u001a\u00020\rHÆ\u0003J\u0017\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fHÆ\u0003Ji\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fHÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001f\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u0006/"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v3/data/TravelPersonalAccountReplenishmentV3DTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "input", "Lru/ozon/app/android/travel/molecules/dto/commonInput/v2/CommonInputV2DTO;", "inputVariants", "", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", SelectionItemFormDTO.DISCLAIMER_FIELD_NAME, "Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "submitButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/travel/molecules/dto/commonInput/v2/CommonInputV2DTO;Ljava/util/List;Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getInput", "()Lru/ozon/app/android/travel/molecules/dto/commonInput/v2/CommonInputV2DTO;", "getInputVariants", "()Ljava/util/List;", "getDisclaimer", "()Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "getSubmitButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TravelPersonalAccountReplenishmentV3DTO {
    public static final int $stable = 8;
    private final DisclaimerDTO disclaimer;

    @NotNull
    private final CommonInputV2DTO input;

    @NotNull
    private final List<TagButtonDTO> inputVariants;

    @NotNull
    private final ButtonV3DTO submitButton;
    private final TextDTO subtitle;
    private final TextDTO title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public TravelPersonalAccountReplenishmentV3DTO(TextDTO textDTO, TextDTO textDTO2, @NotNull CommonInputV2DTO input, @NotNull List<TagButtonDTO> inputVariants, DisclaimerDTO disclaimerDTO, @NotNull ButtonV3DTO submitButton, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(inputVariants, "inputVariants");
        Intrinsics.checkNotNullParameter(submitButton, "submitButton");
        this.title = textDTO;
        this.subtitle = textDTO2;
        this.input = input;
        this.inputVariants = inputVariants;
        this.disclaimer = disclaimerDTO;
        this.submitButton = submitButton;
        this.trackingInfo = map;
    }

    public static /* synthetic */ TravelPersonalAccountReplenishmentV3DTO copy$default(TravelPersonalAccountReplenishmentV3DTO travelPersonalAccountReplenishmentV3DTO, TextDTO textDTO, TextDTO textDTO2, CommonInputV2DTO commonInputV2DTO, List list, DisclaimerDTO disclaimerDTO, ButtonV3DTO buttonV3DTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = travelPersonalAccountReplenishmentV3DTO.title;
        }
        if ((i11 & 2) != 0) {
            textDTO2 = travelPersonalAccountReplenishmentV3DTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            commonInputV2DTO = travelPersonalAccountReplenishmentV3DTO.input;
        }
        if ((i11 & 8) != 0) {
            list = travelPersonalAccountReplenishmentV3DTO.inputVariants;
        }
        if ((i11 & 16) != 0) {
            disclaimerDTO = travelPersonalAccountReplenishmentV3DTO.disclaimer;
        }
        if ((i11 & 32) != 0) {
            buttonV3DTO = travelPersonalAccountReplenishmentV3DTO.submitButton;
        }
        if ((i11 & 64) != 0) {
            map = travelPersonalAccountReplenishmentV3DTO.trackingInfo;
        }
        ButtonV3DTO buttonV3DTO2 = buttonV3DTO;
        Map map2 = map;
        DisclaimerDTO disclaimerDTO2 = disclaimerDTO;
        CommonInputV2DTO commonInputV2DTO2 = commonInputV2DTO;
        return travelPersonalAccountReplenishmentV3DTO.copy(textDTO, textDTO2, commonInputV2DTO2, list, disclaimerDTO2, buttonV3DTO2, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final CommonInputV2DTO getInput() {
        return this.input;
    }

    @NotNull
    public final List<TagButtonDTO> component4() {
        return this.inputVariants;
    }

    /* renamed from: component5, reason: from getter */
    public final DisclaimerDTO getDisclaimer() {
        return this.disclaimer;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final ButtonV3DTO getSubmitButton() {
        return this.submitButton;
    }

    public final Map<String, TokenizedTrackingInfo> component7() {
        return this.trackingInfo;
    }

    @NotNull
    public final TravelPersonalAccountReplenishmentV3DTO copy(TextDTO title, TextDTO subtitle, @NotNull CommonInputV2DTO input, @NotNull List<TagButtonDTO> inputVariants, DisclaimerDTO disclaimer, @NotNull ButtonV3DTO submitButton, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(inputVariants, "inputVariants");
        Intrinsics.checkNotNullParameter(submitButton, "submitButton");
        return new TravelPersonalAccountReplenishmentV3DTO(title, subtitle, input, inputVariants, disclaimer, submitButton, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelPersonalAccountReplenishmentV3DTO)) {
            return false;
        }
        TravelPersonalAccountReplenishmentV3DTO travelPersonalAccountReplenishmentV3DTO = (TravelPersonalAccountReplenishmentV3DTO) other;
        return Intrinsics.d(this.title, travelPersonalAccountReplenishmentV3DTO.title) && Intrinsics.d(this.subtitle, travelPersonalAccountReplenishmentV3DTO.subtitle) && Intrinsics.d(this.input, travelPersonalAccountReplenishmentV3DTO.input) && Intrinsics.d(this.inputVariants, travelPersonalAccountReplenishmentV3DTO.inputVariants) && Intrinsics.d(this.disclaimer, travelPersonalAccountReplenishmentV3DTO.disclaimer) && Intrinsics.d(this.submitButton, travelPersonalAccountReplenishmentV3DTO.submitButton) && Intrinsics.d(this.trackingInfo, travelPersonalAccountReplenishmentV3DTO.trackingInfo);
    }

    public final DisclaimerDTO getDisclaimer() {
        return this.disclaimer;
    }

    @NotNull
    public final CommonInputV2DTO getInput() {
        return this.input;
    }

    @NotNull
    public final List<TagButtonDTO> getInputVariants() {
        return this.inputVariants;
    }

    @NotNull
    public final ButtonV3DTO getSubmitButton() {
        return this.submitButton;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    public final TextDTO getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        TextDTO textDTO = this.title;
        int hashCode = (textDTO == null ? 0 : textDTO.hashCode()) * 31;
        TextDTO textDTO2 = this.subtitle;
        int b11 = g.b((this.input.hashCode() + ((hashCode + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31)) * 31, 31, this.inputVariants);
        DisclaimerDTO disclaimerDTO = this.disclaimer;
        int c11 = C2859b.c(this.submitButton, (b11 + (disclaimerDTO == null ? 0 : disclaimerDTO.hashCode())) * 31, 31);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return c11 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        CommonInputV2DTO commonInputV2DTO = this.input;
        List<TagButtonDTO> list = this.inputVariants;
        DisclaimerDTO disclaimerDTO = this.disclaimer;
        ButtonV3DTO buttonV3DTO = this.submitButton;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder g10 = D3.g.g("TravelPersonalAccountReplenishmentV3DTO(title=", textDTO, ", subtitle=", textDTO2, ", input=");
        g10.append(commonInputV2DTO);
        g10.append(", inputVariants=");
        g10.append(list);
        g10.append(", disclaimer=");
        g10.append(disclaimerDTO);
        g10.append(", submitButton=");
        g10.append(buttonV3DTO);
        g10.append(", trackingInfo=");
        return P.f(g10, map, ")");
    }

    public TravelPersonalAccountReplenishmentV3DTO(TextDTO textDTO, TextDTO textDTO2, CommonInputV2DTO commonInputV2DTO, List list, DisclaimerDTO disclaimerDTO, ButtonV3DTO buttonV3DTO, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(textDTO, textDTO2, commonInputV2DTO, (i11 & 8) != 0 ? K.f71697a : list, disclaimerDTO, buttonV3DTO, map);
    }
}
