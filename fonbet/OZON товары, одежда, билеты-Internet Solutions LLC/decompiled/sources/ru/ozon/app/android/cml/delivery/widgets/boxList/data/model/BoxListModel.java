package ru.ozon.app.android.cml.delivery.widgets.boxList.data.model;

import T7.P;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cml.delivery.molecules.boxCard.data.BoxCardDTO;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001B5\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR%\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/boxList/data/model/BoxListModel;", "", "", "Lru/ozon/app/android/cml/delivery/molecules/boxCard/data/BoxCardDTO;", "boxList", "Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "boxRequirements", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getBoxList", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "getBoxRequirements", "()Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BoxListModel {

    @NotNull
    private final List<BoxCardDTO> boxList;
    private final DisclaimerDTO boxRequirements;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public BoxListModel(@NotNull List<BoxCardDTO> boxList, DisclaimerDTO disclaimerDTO, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(boxList, "boxList");
        this.boxList = boxList;
        this.boxRequirements = disclaimerDTO;
        this.trackingInfo = map;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BoxListModel)) {
            return false;
        }
        BoxListModel boxListModel = (BoxListModel) other;
        return Intrinsics.d(this.boxList, boxListModel.boxList) && Intrinsics.d(this.boxRequirements, boxListModel.boxRequirements) && Intrinsics.d(this.trackingInfo, boxListModel.trackingInfo);
    }

    @NotNull
    public final List<BoxCardDTO> getBoxList() {
        return this.boxList;
    }

    public final DisclaimerDTO getBoxRequirements() {
        return this.boxRequirements;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.boxList.hashCode() * 31;
        DisclaimerDTO disclaimerDTO = this.boxRequirements;
        int hashCode2 = (hashCode + (disclaimerDTO == null ? 0 : disclaimerDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<BoxCardDTO> list = this.boxList;
        DisclaimerDTO disclaimerDTO = this.boxRequirements;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("BoxListModel(boxList=");
        sb2.append(list);
        sb2.append(", boxRequirements=");
        sb2.append(disclaimerDTO);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }
}
