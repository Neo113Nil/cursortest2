package ru.ozon.app.android.travel.feature.general.common.widgets.offlineTravelMode.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/offlineTravelMode/data/OfflineTravelModeDTO;", "", "fetchDataAction", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "timeoutMs", "", "<init>", "(Lru/ozon/uni/atoms/data/controls/CommonControlSettings;I)V", "getFetchDataAction", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getTimeoutMs", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class OfflineTravelModeDTO {
    public static final int $stable = 0;

    @NotNull
    private final CommonControlSettings fetchDataAction;
    private final int timeoutMs;

    public OfflineTravelModeDTO(@NotNull CommonControlSettings fetchDataAction, int i11) {
        Intrinsics.checkNotNullParameter(fetchDataAction, "fetchDataAction");
        this.fetchDataAction = fetchDataAction;
        this.timeoutMs = i11;
    }

    public static /* synthetic */ OfflineTravelModeDTO copy$default(OfflineTravelModeDTO offlineTravelModeDTO, CommonControlSettings commonControlSettings, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            commonControlSettings = offlineTravelModeDTO.fetchDataAction;
        }
        if ((i12 & 2) != 0) {
            i11 = offlineTravelModeDTO.timeoutMs;
        }
        return offlineTravelModeDTO.copy(commonControlSettings, i11);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final CommonControlSettings getFetchDataAction() {
        return this.fetchDataAction;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTimeoutMs() {
        return this.timeoutMs;
    }

    @NotNull
    public final OfflineTravelModeDTO copy(@NotNull CommonControlSettings fetchDataAction, int timeoutMs) {
        Intrinsics.checkNotNullParameter(fetchDataAction, "fetchDataAction");
        return new OfflineTravelModeDTO(fetchDataAction, timeoutMs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OfflineTravelModeDTO)) {
            return false;
        }
        OfflineTravelModeDTO offlineTravelModeDTO = (OfflineTravelModeDTO) other;
        return Intrinsics.d(this.fetchDataAction, offlineTravelModeDTO.fetchDataAction) && this.timeoutMs == offlineTravelModeDTO.timeoutMs;
    }

    @NotNull
    public final CommonControlSettings getFetchDataAction() {
        return this.fetchDataAction;
    }

    public final int getTimeoutMs() {
        return this.timeoutMs;
    }

    public int hashCode() {
        return Integer.hashCode(this.timeoutMs) + (this.fetchDataAction.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "OfflineTravelModeDTO(fetchDataAction=" + this.fetchDataAction + ", timeoutMs=" + this.timeoutMs + ")";
    }

    public /* synthetic */ OfflineTravelModeDTO(CommonControlSettings commonControlSettings, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(commonControlSettings, (i12 & 2) != 0 ? 0 : i11);
    }
}
