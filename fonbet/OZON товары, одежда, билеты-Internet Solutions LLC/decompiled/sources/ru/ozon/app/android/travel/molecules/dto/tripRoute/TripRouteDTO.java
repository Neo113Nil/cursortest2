package ru.ozon.app.android.travel.molecules.dto.tripRoute;

import B90.C2619v;
import Ve.C4636t5;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0004HÆ\u0003Jg\u0010$\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0004HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006+"}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/tripRoute/TripRouteDTO;", "", "airlineIconUrls", "", "", "tripTime", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "tripDuration", "routeInfo", "transferIcon", "Lru/ozon/uni/atoms/data/button/Icon;", "transferInfo", "transferTime", "arrivalDays", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;)V", "getAirlineIconUrls", "()Ljava/util/List;", "getTripTime", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTripDuration", "getRouteInfo", "getTransferIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "getTransferInfo", "getTransferTime", "getArrivalDays", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TripRouteDTO {
    private final List<String> airlineIconUrls;
    private final String arrivalDays;

    @NotNull
    private final TextAtom routeInfo;
    private final Icon transferIcon;

    @NotNull
    private final TextAtom transferInfo;
    private final TextAtom transferTime;

    @NotNull
    private final TextAtom tripDuration;

    @NotNull
    private final TextAtom tripTime;

    public TripRouteDTO(List<String> list, @NotNull TextAtom tripTime, @NotNull TextAtom tripDuration, @NotNull TextAtom routeInfo, Icon icon, @NotNull TextAtom transferInfo, TextAtom textAtom, String str) {
        Intrinsics.checkNotNullParameter(tripTime, "tripTime");
        Intrinsics.checkNotNullParameter(tripDuration, "tripDuration");
        Intrinsics.checkNotNullParameter(routeInfo, "routeInfo");
        Intrinsics.checkNotNullParameter(transferInfo, "transferInfo");
        this.airlineIconUrls = list;
        this.tripTime = tripTime;
        this.tripDuration = tripDuration;
        this.routeInfo = routeInfo;
        this.transferIcon = icon;
        this.transferInfo = transferInfo;
        this.transferTime = textAtom;
        this.arrivalDays = str;
    }

    public static /* synthetic */ TripRouteDTO copy$default(TripRouteDTO tripRouteDTO, List list, TextAtom textAtom, TextAtom textAtom2, TextAtom textAtom3, Icon icon, TextAtom textAtom4, TextAtom textAtom5, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = tripRouteDTO.airlineIconUrls;
        }
        if ((i11 & 2) != 0) {
            textAtom = tripRouteDTO.tripTime;
        }
        if ((i11 & 4) != 0) {
            textAtom2 = tripRouteDTO.tripDuration;
        }
        if ((i11 & 8) != 0) {
            textAtom3 = tripRouteDTO.routeInfo;
        }
        if ((i11 & 16) != 0) {
            icon = tripRouteDTO.transferIcon;
        }
        if ((i11 & 32) != 0) {
            textAtom4 = tripRouteDTO.transferInfo;
        }
        if ((i11 & 64) != 0) {
            textAtom5 = tripRouteDTO.transferTime;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            str = tripRouteDTO.arrivalDays;
        }
        TextAtom textAtom6 = textAtom5;
        String str2 = str;
        Icon icon2 = icon;
        TextAtom textAtom7 = textAtom4;
        return tripRouteDTO.copy(list, textAtom, textAtom2, textAtom3, icon2, textAtom7, textAtom6, str2);
    }

    public final List<String> component1() {
        return this.airlineIconUrls;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextAtom getTripTime() {
        return this.tripTime;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final TextAtom getTripDuration() {
        return this.tripDuration;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final TextAtom getRouteInfo() {
        return this.routeInfo;
    }

    /* renamed from: component5, reason: from getter */
    public final Icon getTransferIcon() {
        return this.transferIcon;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final TextAtom getTransferInfo() {
        return this.transferInfo;
    }

    /* renamed from: component7, reason: from getter */
    public final TextAtom getTransferTime() {
        return this.transferTime;
    }

    /* renamed from: component8, reason: from getter */
    public final String getArrivalDays() {
        return this.arrivalDays;
    }

    @NotNull
    public final TripRouteDTO copy(List<String> airlineIconUrls, @NotNull TextAtom tripTime, @NotNull TextAtom tripDuration, @NotNull TextAtom routeInfo, Icon transferIcon, @NotNull TextAtom transferInfo, TextAtom transferTime, String arrivalDays) {
        Intrinsics.checkNotNullParameter(tripTime, "tripTime");
        Intrinsics.checkNotNullParameter(tripDuration, "tripDuration");
        Intrinsics.checkNotNullParameter(routeInfo, "routeInfo");
        Intrinsics.checkNotNullParameter(transferInfo, "transferInfo");
        return new TripRouteDTO(airlineIconUrls, tripTime, tripDuration, routeInfo, transferIcon, transferInfo, transferTime, arrivalDays);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TripRouteDTO)) {
            return false;
        }
        TripRouteDTO tripRouteDTO = (TripRouteDTO) other;
        return Intrinsics.d(this.airlineIconUrls, tripRouteDTO.airlineIconUrls) && Intrinsics.d(this.tripTime, tripRouteDTO.tripTime) && Intrinsics.d(this.tripDuration, tripRouteDTO.tripDuration) && Intrinsics.d(this.routeInfo, tripRouteDTO.routeInfo) && Intrinsics.d(this.transferIcon, tripRouteDTO.transferIcon) && Intrinsics.d(this.transferInfo, tripRouteDTO.transferInfo) && Intrinsics.d(this.transferTime, tripRouteDTO.transferTime) && Intrinsics.d(this.arrivalDays, tripRouteDTO.arrivalDays);
    }

    public final List<String> getAirlineIconUrls() {
        return this.airlineIconUrls;
    }

    public final String getArrivalDays() {
        return this.arrivalDays;
    }

    @NotNull
    public final TextAtom getRouteInfo() {
        return this.routeInfo;
    }

    public final Icon getTransferIcon() {
        return this.transferIcon;
    }

    @NotNull
    public final TextAtom getTransferInfo() {
        return this.transferInfo;
    }

    public final TextAtom getTransferTime() {
        return this.transferTime;
    }

    @NotNull
    public final TextAtom getTripDuration() {
        return this.tripDuration;
    }

    @NotNull
    public final TextAtom getTripTime() {
        return this.tripTime;
    }

    public int hashCode() {
        List<String> list = this.airlineIconUrls;
        int b11 = C2619v.b(C2619v.b(C2619v.b((list == null ? 0 : list.hashCode()) * 31, 31, this.tripTime), 31, this.tripDuration), 31, this.routeInfo);
        Icon icon = this.transferIcon;
        int b12 = C2619v.b((b11 + (icon == null ? 0 : icon.hashCode())) * 31, 31, this.transferInfo);
        TextAtom textAtom = this.transferTime;
        int hashCode = (b12 + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        String str = this.arrivalDays;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<String> list = this.airlineIconUrls;
        TextAtom textAtom = this.tripTime;
        TextAtom textAtom2 = this.tripDuration;
        TextAtom textAtom3 = this.routeInfo;
        Icon icon = this.transferIcon;
        TextAtom textAtom4 = this.transferInfo;
        TextAtom textAtom5 = this.transferTime;
        String str = this.arrivalDays;
        StringBuilder sb2 = new StringBuilder("TripRouteDTO(airlineIconUrls=");
        sb2.append(list);
        sb2.append(", tripTime=");
        sb2.append(textAtom);
        sb2.append(", tripDuration=");
        C4636t5.c(", routeInfo=", ", transferIcon=", sb2, textAtom2, textAtom3);
        sb2.append(icon);
        sb2.append(", transferInfo=");
        sb2.append(textAtom4);
        sb2.append(", transferTime=");
        sb2.append(textAtom5);
        sb2.append(", arrivalDays=");
        sb2.append(str);
        sb2.append(")");
        return sb2.toString();
    }
}
