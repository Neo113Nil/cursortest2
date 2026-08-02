package ru.ozon.app.android.cml.delivery.widgets.boxList.data;

import De.C2859b;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cml.delivery.molecules.boxCard.data.BoxCardDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B=\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0017\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0003JG\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u000bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\""}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/boxList/data/BoxListDTO;", "", "boxList", "", "Lru/ozon/app/android/cml/delivery/molecules/boxCard/data/BoxCardDTO;", "selectButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "boxRequirements", "Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;Ljava/util/Map;)V", "getBoxList", "()Ljava/util/List;", "getSelectButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getBoxRequirements", "()Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BoxListDTO {

    @NotNull
    private final List<BoxCardDTO> boxList;
    private final DisclaimerDTO boxRequirements;

    @NotNull
    private final ButtonV3DTO selectButton;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public BoxListDTO(@NotNull List<BoxCardDTO> boxList, @NotNull ButtonV3DTO selectButton, DisclaimerDTO disclaimerDTO, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(boxList, "boxList");
        Intrinsics.checkNotNullParameter(selectButton, "selectButton");
        this.boxList = boxList;
        this.selectButton = selectButton;
        this.boxRequirements = disclaimerDTO;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BoxListDTO copy$default(BoxListDTO boxListDTO, List list, ButtonV3DTO buttonV3DTO, DisclaimerDTO disclaimerDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = boxListDTO.boxList;
        }
        if ((i11 & 2) != 0) {
            buttonV3DTO = boxListDTO.selectButton;
        }
        if ((i11 & 4) != 0) {
            disclaimerDTO = boxListDTO.boxRequirements;
        }
        if ((i11 & 8) != 0) {
            map = boxListDTO.trackingInfo;
        }
        return boxListDTO.copy(list, buttonV3DTO, disclaimerDTO, map);
    }

    @NotNull
    public final List<BoxCardDTO> component1() {
        return this.boxList;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ButtonV3DTO getSelectButton() {
        return this.selectButton;
    }

    /* renamed from: component3, reason: from getter */
    public final DisclaimerDTO getBoxRequirements() {
        return this.boxRequirements;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.trackingInfo;
    }

    @NotNull
    public final BoxListDTO copy(@NotNull List<BoxCardDTO> boxList, @NotNull ButtonV3DTO selectButton, DisclaimerDTO boxRequirements, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(boxList, "boxList");
        Intrinsics.checkNotNullParameter(selectButton, "selectButton");
        return new BoxListDTO(boxList, selectButton, boxRequirements, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BoxListDTO)) {
            return false;
        }
        BoxListDTO boxListDTO = (BoxListDTO) other;
        return Intrinsics.d(this.boxList, boxListDTO.boxList) && Intrinsics.d(this.selectButton, boxListDTO.selectButton) && Intrinsics.d(this.boxRequirements, boxListDTO.boxRequirements) && Intrinsics.d(this.trackingInfo, boxListDTO.trackingInfo);
    }

    @NotNull
    public final List<BoxCardDTO> getBoxList() {
        return this.boxList;
    }

    public final DisclaimerDTO getBoxRequirements() {
        return this.boxRequirements;
    }

    @NotNull
    public final ButtonV3DTO getSelectButton() {
        return this.selectButton;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int c11 = C2859b.c(this.selectButton, this.boxList.hashCode() * 31, 31);
        DisclaimerDTO disclaimerDTO = this.boxRequirements;
        int hashCode = (c11 + (disclaimerDTO == null ? 0 : disclaimerDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "BoxListDTO(boxList=" + this.boxList + ", selectButton=" + this.selectButton + ", boxRequirements=" + this.boxRequirements + ", trackingInfo=" + this.trackingInfo + ")";
    }
}
