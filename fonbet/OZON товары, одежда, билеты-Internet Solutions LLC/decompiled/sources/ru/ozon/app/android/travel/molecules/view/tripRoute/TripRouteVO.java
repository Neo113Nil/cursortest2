package ru.ozon.app.android.travel.molecules.view.tripRoute;

import B90.C2619v;
import Ve.C4636t5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b$\u0010\u001eR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b%\u0010\u001eR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b'\u0010\u0011¨\u0006("}, d2 = {"Lru/ozon/app/android/travel/molecules/view/tripRoute/TripRouteVO;", "", "", "", "airlineIconUrls", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "tripTime", "tripDuration", "routeInfo", "Lru/ozon/uni/atoms/data/button/Icon;", "transferIcon", "transferInfo", "transferTime", "arrivalDays", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getAirlineIconUrls", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTripTime", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTripDuration", "getRouteInfo", "Lru/ozon/uni/atoms/data/button/Icon;", "getTransferIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "getTransferInfo", "getTransferTime", "Ljava/lang/String;", "getArrivalDays", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TripRouteVO {
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

    public TripRouteVO(List<String> list, @NotNull TextAtom tripTime, @NotNull TextAtom tripDuration, @NotNull TextAtom routeInfo, Icon icon, @NotNull TextAtom transferInfo, TextAtom textAtom, String str) {
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

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TripRouteVO)) {
            return false;
        }
        TripRouteVO tripRouteVO = (TripRouteVO) other;
        return Intrinsics.d(this.airlineIconUrls, tripRouteVO.airlineIconUrls) && Intrinsics.d(this.tripTime, tripRouteVO.tripTime) && Intrinsics.d(this.tripDuration, tripRouteVO.tripDuration) && Intrinsics.d(this.routeInfo, tripRouteVO.routeInfo) && Intrinsics.d(this.transferIcon, tripRouteVO.transferIcon) && Intrinsics.d(this.transferInfo, tripRouteVO.transferInfo) && Intrinsics.d(this.transferTime, tripRouteVO.transferTime) && Intrinsics.d(this.arrivalDays, tripRouteVO.arrivalDays);
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
        StringBuilder sb2 = new StringBuilder("TripRouteVO(airlineIconUrls=");
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
