package ru.ozon.app.android.travel.molecules.dto.tripLeg.v1;

import G.g;
import N3.C3660k;
import Nh.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.badge.Badge;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J_\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006'"}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/tripLeg/v1/TripLegDTO;", "", "startTime", "", "endTime", "tripDuration", "tripDeparture", "tripDestination", "segmentTransfer", "techStopButton", "Lru/ozon/uni/atoms/data/badge/Badge;", "arrivalDays", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/badge/Badge;Ljava/lang/String;)V", "getStartTime", "()Ljava/lang/String;", "getEndTime", "getTripDuration", "getTripDeparture", "getTripDestination", "getSegmentTransfer", "getTechStopButton", "()Lru/ozon/uni/atoms/data/badge/Badge;", "getArrivalDays", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TripLegDTO {
    private final String arrivalDays;

    @NotNull
    private final String endTime;
    private final String segmentTransfer;

    @NotNull
    private final String startTime;
    private final Badge techStopButton;

    @NotNull
    private final String tripDeparture;

    @NotNull
    private final String tripDestination;

    @NotNull
    private final String tripDuration;

    public TripLegDTO(@NotNull String startTime, @NotNull String endTime, @NotNull String tripDuration, @NotNull String tripDeparture, @NotNull String tripDestination, String str, Badge badge, String str2) {
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        Intrinsics.checkNotNullParameter(endTime, "endTime");
        Intrinsics.checkNotNullParameter(tripDuration, "tripDuration");
        Intrinsics.checkNotNullParameter(tripDeparture, "tripDeparture");
        Intrinsics.checkNotNullParameter(tripDestination, "tripDestination");
        this.startTime = startTime;
        this.endTime = endTime;
        this.tripDuration = tripDuration;
        this.tripDeparture = tripDeparture;
        this.tripDestination = tripDestination;
        this.segmentTransfer = str;
        this.techStopButton = badge;
        this.arrivalDays = str2;
    }

    public static /* synthetic */ TripLegDTO copy$default(TripLegDTO tripLegDTO, String str, String str2, String str3, String str4, String str5, String str6, Badge badge, String str7, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = tripLegDTO.startTime;
        }
        if ((i11 & 2) != 0) {
            str2 = tripLegDTO.endTime;
        }
        if ((i11 & 4) != 0) {
            str3 = tripLegDTO.tripDuration;
        }
        if ((i11 & 8) != 0) {
            str4 = tripLegDTO.tripDeparture;
        }
        if ((i11 & 16) != 0) {
            str5 = tripLegDTO.tripDestination;
        }
        if ((i11 & 32) != 0) {
            str6 = tripLegDTO.segmentTransfer;
        }
        if ((i11 & 64) != 0) {
            badge = tripLegDTO.techStopButton;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            str7 = tripLegDTO.arrivalDays;
        }
        Badge badge2 = badge;
        String str8 = str7;
        String str9 = str5;
        String str10 = str6;
        return tripLegDTO.copy(str, str2, str3, str4, str9, str10, badge2, str8);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getStartTime() {
        return this.startTime;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getEndTime() {
        return this.endTime;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getTripDuration() {
        return this.tripDuration;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getTripDeparture() {
        return this.tripDeparture;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getTripDestination() {
        return this.tripDestination;
    }

    /* renamed from: component6, reason: from getter */
    public final String getSegmentTransfer() {
        return this.segmentTransfer;
    }

    /* renamed from: component7, reason: from getter */
    public final Badge getTechStopButton() {
        return this.techStopButton;
    }

    /* renamed from: component8, reason: from getter */
    public final String getArrivalDays() {
        return this.arrivalDays;
    }

    @NotNull
    public final TripLegDTO copy(@NotNull String startTime, @NotNull String endTime, @NotNull String tripDuration, @NotNull String tripDeparture, @NotNull String tripDestination, String segmentTransfer, Badge techStopButton, String arrivalDays) {
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        Intrinsics.checkNotNullParameter(endTime, "endTime");
        Intrinsics.checkNotNullParameter(tripDuration, "tripDuration");
        Intrinsics.checkNotNullParameter(tripDeparture, "tripDeparture");
        Intrinsics.checkNotNullParameter(tripDestination, "tripDestination");
        return new TripLegDTO(startTime, endTime, tripDuration, tripDeparture, tripDestination, segmentTransfer, techStopButton, arrivalDays);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TripLegDTO)) {
            return false;
        }
        TripLegDTO tripLegDTO = (TripLegDTO) other;
        return Intrinsics.d(this.startTime, tripLegDTO.startTime) && Intrinsics.d(this.endTime, tripLegDTO.endTime) && Intrinsics.d(this.tripDuration, tripLegDTO.tripDuration) && Intrinsics.d(this.tripDeparture, tripLegDTO.tripDeparture) && Intrinsics.d(this.tripDestination, tripLegDTO.tripDestination) && Intrinsics.d(this.segmentTransfer, tripLegDTO.segmentTransfer) && Intrinsics.d(this.techStopButton, tripLegDTO.techStopButton) && Intrinsics.d(this.arrivalDays, tripLegDTO.arrivalDays);
    }

    public final String getArrivalDays() {
        return this.arrivalDays;
    }

    @NotNull
    public final String getEndTime() {
        return this.endTime;
    }

    public final String getSegmentTransfer() {
        return this.segmentTransfer;
    }

    @NotNull
    public final String getStartTime() {
        return this.startTime;
    }

    public final Badge getTechStopButton() {
        return this.techStopButton;
    }

    @NotNull
    public final String getTripDeparture() {
        return this.tripDeparture;
    }

    @NotNull
    public final String getTripDestination() {
        return this.tripDestination;
    }

    @NotNull
    public final String getTripDuration() {
        return this.tripDuration;
    }

    public int hashCode() {
        int a11 = g.a(g.a(g.a(g.a(this.startTime.hashCode() * 31, 31, this.endTime), 31, this.tripDuration), 31, this.tripDeparture), 31, this.tripDestination);
        String str = this.segmentTransfer;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        Badge badge = this.techStopButton;
        int hashCode2 = (hashCode + (badge == null ? 0 : badge.hashCode())) * 31;
        String str2 = this.arrivalDays;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.startTime;
        String str2 = this.endTime;
        String str3 = this.tripDuration;
        String str4 = this.tripDeparture;
        String str5 = this.tripDestination;
        String str6 = this.segmentTransfer;
        Badge badge = this.techStopButton;
        String str7 = this.arrivalDays;
        StringBuilder d11 = C3660k.d("TripLegDTO(startTime=", str, ", endTime=", str2, ", tripDuration=");
        a.h(d11, str3, ", tripDeparture=", str4, ", tripDestination=");
        a.h(d11, str5, ", segmentTransfer=", str6, ", techStopButton=");
        d11.append(badge);
        d11.append(", arrivalDays=");
        d11.append(str7);
        d11.append(")");
        return d11.toString();
    }
}
