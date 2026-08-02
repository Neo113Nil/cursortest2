package ru.ozon.app.android.travel.feature.general.common.widgets.notificationSwitcher.data;

import T7.P;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.molecules.dto.travelWidgetSettings.TravelWidgetSettingsDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSwitcher/data/NotificationSwitcherDTO;", "", "cell", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cellPaddings", "Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO$PaddingsSetting;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO$PaddingsSetting;Ljava/util/Map;)V", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getCellPaddings", "()Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO$PaddingsSetting;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class NotificationSwitcherDTO {
    public static final int $stable = 8;

    @NotNull
    private final CellDTO cell;
    private final TravelWidgetSettingsDTO.PaddingsSetting cellPaddings;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public NotificationSwitcherDTO(@NotNull CellDTO cell, TravelWidgetSettingsDTO.PaddingsSetting paddingsSetting, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        this.cell = cell;
        this.cellPaddings = paddingsSetting;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NotificationSwitcherDTO copy$default(NotificationSwitcherDTO notificationSwitcherDTO, CellDTO cellDTO, TravelWidgetSettingsDTO.PaddingsSetting paddingsSetting, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cellDTO = notificationSwitcherDTO.cell;
        }
        if ((i11 & 2) != 0) {
            paddingsSetting = notificationSwitcherDTO.cellPaddings;
        }
        if ((i11 & 4) != 0) {
            map = notificationSwitcherDTO.trackingInfo;
        }
        return notificationSwitcherDTO.copy(cellDTO, paddingsSetting, map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final CellDTO getCell() {
        return this.cell;
    }

    /* renamed from: component2, reason: from getter */
    public final TravelWidgetSettingsDTO.PaddingsSetting getCellPaddings() {
        return this.cellPaddings;
    }

    public final Map<String, TokenizedTrackingInfo> component3() {
        return this.trackingInfo;
    }

    @NotNull
    public final NotificationSwitcherDTO copy(@NotNull CellDTO cell, TravelWidgetSettingsDTO.PaddingsSetting cellPaddings, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        return new NotificationSwitcherDTO(cell, cellPaddings, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationSwitcherDTO)) {
            return false;
        }
        NotificationSwitcherDTO notificationSwitcherDTO = (NotificationSwitcherDTO) other;
        return Intrinsics.d(this.cell, notificationSwitcherDTO.cell) && Intrinsics.d(this.cellPaddings, notificationSwitcherDTO.cellPaddings) && Intrinsics.d(this.trackingInfo, notificationSwitcherDTO.trackingInfo);
    }

    @NotNull
    public final CellDTO getCell() {
        return this.cell;
    }

    public final TravelWidgetSettingsDTO.PaddingsSetting getCellPaddings() {
        return this.cellPaddings;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.cell.hashCode() * 31;
        TravelWidgetSettingsDTO.PaddingsSetting paddingsSetting = this.cellPaddings;
        int hashCode2 = (hashCode + (paddingsSetting == null ? 0 : paddingsSetting.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        CellDTO cellDTO = this.cell;
        TravelWidgetSettingsDTO.PaddingsSetting paddingsSetting = this.cellPaddings;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("NotificationSwitcherDTO(cell=");
        sb2.append(cellDTO);
        sb2.append(", cellPaddings=");
        sb2.append(paddingsSetting);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }
}
