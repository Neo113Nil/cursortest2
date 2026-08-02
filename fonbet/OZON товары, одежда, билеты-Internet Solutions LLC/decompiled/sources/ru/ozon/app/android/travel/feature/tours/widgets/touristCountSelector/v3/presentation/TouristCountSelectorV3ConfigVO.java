package ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation;

import Ep.a;
import Kk.C3532b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.session.deleteAccount.data.DeleteAccountApiResponse;
import ru.ozon.uni.android.flashbar.model.Restriction;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002#$B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b!\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\"\u0010 ¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3ConfigVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3ConfigVO$RoomConfig;", "defaultRoomConfig", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3ConfigVO$AlertVO;", "totalRoomTouristAlert", "totalTouristAlert", "unspecifiedAlert", "<init>", "(JLru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3ConfigVO$RoomConfig;Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3ConfigVO$AlertVO;Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3ConfigVO$AlertVO;Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3ConfigVO$AlertVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3ConfigVO$RoomConfig;", "getDefaultRoomConfig", "()Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3ConfigVO$RoomConfig;", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3ConfigVO$AlertVO;", "getTotalRoomTouristAlert", "()Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3ConfigVO$AlertVO;", "getTotalTouristAlert", "getUnspecifiedAlert", "RoomConfig", "AlertVO", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TouristCountSelectorV3ConfigVO implements c {

    @NotNull
    private final RoomConfig defaultRoomConfig;
    private final long id;
    private final AlertVO totalRoomTouristAlert;
    private final AlertVO totalTouristAlert;
    private final AlertVO unspecifiedAlert;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3ConfigVO$AlertVO;", "", "Lru/ozon/uni/android/flashbar/model/Restriction;", DeleteAccountApiResponse.Error.TYPE_RESTRICTION, "", "showAlertNow", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "<init>", "(Lru/ozon/uni/android/flashbar/model/Restriction;ZLjava/lang/Integer;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/android/flashbar/model/Restriction;", "getRestriction", "()Lru/ozon/uni/android/flashbar/model/Restriction;", "Z", "getShowAlertNow", "()Z", "Ljava/lang/Integer;", "getValue", "()Ljava/lang/Integer;", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AlertVO {
        public static final int $stable = Restriction.$stable;

        @NotNull
        private final Restriction restriction;
        private final boolean showAlertNow;
        private final Integer value;

        public AlertVO(@NotNull Restriction restriction, boolean z11, Integer num) {
            Intrinsics.checkNotNullParameter(restriction, "restriction");
            this.restriction = restriction;
            this.showAlertNow = z11;
            this.value = num;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AlertVO)) {
                return false;
            }
            AlertVO alertVO = (AlertVO) other;
            return Intrinsics.d(this.restriction, alertVO.restriction) && this.showAlertNow == alertVO.showAlertNow && Intrinsics.d(this.value, alertVO.value);
        }

        @NotNull
        public final Restriction getRestriction() {
            return this.restriction;
        }

        public final boolean getShowAlertNow() {
            return this.showAlertNow;
        }

        public final Integer getValue() {
            return this.value;
        }

        public int hashCode() {
            int a11 = C3532b.a(this.restriction.hashCode() * 31, 31, this.showAlertNow);
            Integer num = this.value;
            return a11 + (num == null ? 0 : num.hashCode());
        }

        @NotNull
        public String toString() {
            Restriction restriction = this.restriction;
            boolean z11 = this.showAlertNow;
            Integer num = this.value;
            StringBuilder sb2 = new StringBuilder("AlertVO(restriction=");
            sb2.append(restriction);
            sb2.append(", showAlertNow=");
            sb2.append(z11);
            sb2.append(", value=");
            return a.c(sb2, num, ")");
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3ConfigVO$RoomConfig;", "", "", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3QuantityCellVO;", "defaultGuests", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3ChildFormVO;", "defaultChildForm", "<init>", "(Ljava/util/List;Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3ChildFormVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getDefaultGuests", "()Ljava/util/List;", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3ChildFormVO;", "getDefaultChildForm", "()Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3ChildFormVO;", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RoomConfig {

        @NotNull
        private final TouristCountSelectorV3ChildFormVO defaultChildForm;

        @NotNull
        private final List<TouristCountSelectorV3QuantityCellVO> defaultGuests;

        public RoomConfig(@NotNull List<TouristCountSelectorV3QuantityCellVO> defaultGuests, @NotNull TouristCountSelectorV3ChildFormVO defaultChildForm) {
            Intrinsics.checkNotNullParameter(defaultGuests, "defaultGuests");
            Intrinsics.checkNotNullParameter(defaultChildForm, "defaultChildForm");
            this.defaultGuests = defaultGuests;
            this.defaultChildForm = defaultChildForm;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RoomConfig)) {
                return false;
            }
            RoomConfig roomConfig = (RoomConfig) other;
            return Intrinsics.d(this.defaultGuests, roomConfig.defaultGuests) && Intrinsics.d(this.defaultChildForm, roomConfig.defaultChildForm);
        }

        @NotNull
        public final TouristCountSelectorV3ChildFormVO getDefaultChildForm() {
            return this.defaultChildForm;
        }

        @NotNull
        public final List<TouristCountSelectorV3QuantityCellVO> getDefaultGuests() {
            return this.defaultGuests;
        }

        public int hashCode() {
            return this.defaultChildForm.hashCode() + (this.defaultGuests.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "RoomConfig(defaultGuests=" + this.defaultGuests + ", defaultChildForm=" + this.defaultChildForm + ")";
        }
    }

    public TouristCountSelectorV3ConfigVO(long j11, @NotNull RoomConfig defaultRoomConfig, AlertVO alertVO, AlertVO alertVO2, AlertVO alertVO3) {
        Intrinsics.checkNotNullParameter(defaultRoomConfig, "defaultRoomConfig");
        this.id = j11;
        this.defaultRoomConfig = defaultRoomConfig;
        this.totalRoomTouristAlert = alertVO;
        this.totalTouristAlert = alertVO2;
        this.unspecifiedAlert = alertVO3;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TouristCountSelectorV3ConfigVO)) {
            return false;
        }
        TouristCountSelectorV3ConfigVO touristCountSelectorV3ConfigVO = (TouristCountSelectorV3ConfigVO) other;
        return this.id == touristCountSelectorV3ConfigVO.id && Intrinsics.d(this.defaultRoomConfig, touristCountSelectorV3ConfigVO.defaultRoomConfig) && Intrinsics.d(this.totalRoomTouristAlert, touristCountSelectorV3ConfigVO.totalRoomTouristAlert) && Intrinsics.d(this.totalTouristAlert, touristCountSelectorV3ConfigVO.totalTouristAlert) && Intrinsics.d(this.unspecifiedAlert, touristCountSelectorV3ConfigVO.unspecifiedAlert);
    }

    @NotNull
    public final RoomConfig getDefaultRoomConfig() {
        return this.defaultRoomConfig;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final AlertVO getTotalRoomTouristAlert() {
        return this.totalRoomTouristAlert;
    }

    public final AlertVO getTotalTouristAlert() {
        return this.totalTouristAlert;
    }

    public final AlertVO getUnspecifiedAlert() {
        return this.unspecifiedAlert;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.defaultRoomConfig.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
        AlertVO alertVO = this.totalRoomTouristAlert;
        int hashCode2 = (hashCode + (alertVO == null ? 0 : alertVO.hashCode())) * 31;
        AlertVO alertVO2 = this.totalTouristAlert;
        int hashCode3 = (hashCode2 + (alertVO2 == null ? 0 : alertVO2.hashCode())) * 31;
        AlertVO alertVO3 = this.unspecifiedAlert;
        return hashCode3 + (alertVO3 != null ? alertVO3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TouristCountSelectorV3ConfigVO(id=" + this.id + ", defaultRoomConfig=" + this.defaultRoomConfig + ", totalRoomTouristAlert=" + this.totalRoomTouristAlert + ", totalTouristAlert=" + this.totalTouristAlert + ", unspecifiedAlert=" + this.unspecifiedAlert + ")";
    }
}
