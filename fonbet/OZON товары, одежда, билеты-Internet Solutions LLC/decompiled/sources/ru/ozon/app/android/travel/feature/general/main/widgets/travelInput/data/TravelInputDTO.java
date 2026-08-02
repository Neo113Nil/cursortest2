package ru.ozon.app.android.travel.feature.general.main.widgets.travelInput.data;

import De.C2859b;
import T7.P;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.molecules.dto.commonInput.v2.CommonInputV2DTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u0017\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0003J5\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/travelInput/data/TravelInputDTO;", "", "input", "Lru/ozon/app/android/travel/molecules/dto/commonInput/v2/CommonInputV2DTO;", "button", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/travel/molecules/dto/commonInput/v2/CommonInputV2DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/util/Map;)V", "getInput", "()Lru/ozon/app/android/travel/molecules/dto/commonInput/v2/CommonInputV2DTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TravelInputDTO {
    public static final int $stable = 8;

    @NotNull
    private final ButtonV3DTO button;

    @NotNull
    private final CommonInputV2DTO input;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public TravelInputDTO(@NotNull CommonInputV2DTO input, @NotNull ButtonV3DTO button, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(button, "button");
        this.input = input;
        this.button = button;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TravelInputDTO copy$default(TravelInputDTO travelInputDTO, CommonInputV2DTO commonInputV2DTO, ButtonV3DTO buttonV3DTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            commonInputV2DTO = travelInputDTO.input;
        }
        if ((i11 & 2) != 0) {
            buttonV3DTO = travelInputDTO.button;
        }
        if ((i11 & 4) != 0) {
            map = travelInputDTO.trackingInfo;
        }
        return travelInputDTO.copy(commonInputV2DTO, buttonV3DTO, map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final CommonInputV2DTO getInput() {
        return this.input;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ButtonV3DTO getButton() {
        return this.button;
    }

    public final Map<String, TokenizedTrackingInfo> component3() {
        return this.trackingInfo;
    }

    @NotNull
    public final TravelInputDTO copy(@NotNull CommonInputV2DTO input, @NotNull ButtonV3DTO button, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(button, "button");
        return new TravelInputDTO(input, button, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelInputDTO)) {
            return false;
        }
        TravelInputDTO travelInputDTO = (TravelInputDTO) other;
        return Intrinsics.d(this.input, travelInputDTO.input) && Intrinsics.d(this.button, travelInputDTO.button) && Intrinsics.d(this.trackingInfo, travelInputDTO.trackingInfo);
    }

    @NotNull
    public final ButtonV3DTO getButton() {
        return this.button;
    }

    @NotNull
    public final CommonInputV2DTO getInput() {
        return this.input;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int c11 = C2859b.c(this.button, this.input.hashCode() * 31, 31);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return c11 + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        CommonInputV2DTO commonInputV2DTO = this.input;
        ButtonV3DTO buttonV3DTO = this.button;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("TravelInputDTO(input=");
        sb2.append(commonInputV2DTO);
        sb2.append(", button=");
        sb2.append(buttonV3DTO);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }
}
