package ru.ozon.app.android.travel.feature.general.main.widgets.travelNotificationModalCheck.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0004\u0010\n¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/travelNotificationModalCheck/data/TravelNotificationModalCheckDTO;", "", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "isSubscribed", "", "<init>", "(Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Ljava/lang/Boolean;)V", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Ljava/lang/Boolean;)Lru/ozon/app/android/travel/feature/general/main/widgets/travelNotificationModalCheck/data/TravelNotificationModalCheckDTO;", "equals", "other", "hashCode", "", "toString", "", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TravelNotificationModalCheckDTO {
    public static final int $stable = 0;
    private final CommonControlSettings common;
    private final Boolean isSubscribed;

    public TravelNotificationModalCheckDTO(CommonControlSettings commonControlSettings, Boolean bool) {
        this.common = commonControlSettings;
        this.isSubscribed = bool;
    }

    public static /* synthetic */ TravelNotificationModalCheckDTO copy$default(TravelNotificationModalCheckDTO travelNotificationModalCheckDTO, CommonControlSettings commonControlSettings, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            commonControlSettings = travelNotificationModalCheckDTO.common;
        }
        if ((i11 & 2) != 0) {
            bool = travelNotificationModalCheckDTO.isSubscribed;
        }
        return travelNotificationModalCheckDTO.copy(commonControlSettings, bool);
    }

    /* renamed from: component1, reason: from getter */
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getIsSubscribed() {
        return this.isSubscribed;
    }

    @NotNull
    public final TravelNotificationModalCheckDTO copy(CommonControlSettings common, Boolean isSubscribed) {
        return new TravelNotificationModalCheckDTO(common, isSubscribed);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelNotificationModalCheckDTO)) {
            return false;
        }
        TravelNotificationModalCheckDTO travelNotificationModalCheckDTO = (TravelNotificationModalCheckDTO) other;
        return Intrinsics.d(this.common, travelNotificationModalCheckDTO.common) && Intrinsics.d(this.isSubscribed, travelNotificationModalCheckDTO.isSubscribed);
    }

    public final CommonControlSettings getCommon() {
        return this.common;
    }

    public int hashCode() {
        CommonControlSettings commonControlSettings = this.common;
        int hashCode = (commonControlSettings == null ? 0 : commonControlSettings.hashCode()) * 31;
        Boolean bool = this.isSubscribed;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final Boolean isSubscribed() {
        return this.isSubscribed;
    }

    @NotNull
    public String toString() {
        return "TravelNotificationModalCheckDTO(common=" + this.common + ", isSubscribed=" + this.isSubscribed + ")";
    }
}
