package ru.ozon.app.android.travel.feature.railway.widgets.travelTrainRoute.v2.presentation;

import B90.C2619v;
import Kk.C3532b;
import Pk0.a;
import Ve.C4636t5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001e\u0010\u001bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b\n\u0010 R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b\u000b\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/presentation/TrainStationItem;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/presentation/TrainListItem;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "arrivalTime", "stopTime", "departureTime", "station", "", "isHidden", "isDashVisible", "<init>", "(ILru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;ZZ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getArrivalTime", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getStopTime", "getDepartureTime", "getStation", "Z", "()Z", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TrainStationItem implements TrainListItem {
    public static final int $stable = TextAtom.$stable;
    private final TextAtom arrivalTime;
    private final TextAtom departureTime;
    private final int id;
    private final boolean isDashVisible;
    private final boolean isHidden;

    @NotNull
    private final TextAtom station;
    private final TextAtom stopTime;

    public TrainStationItem(int i11, TextAtom textAtom, TextAtom textAtom2, TextAtom textAtom3, @NotNull TextAtom station, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(station, "station");
        this.id = i11;
        this.arrivalTime = textAtom;
        this.stopTime = textAtom2;
        this.departureTime = textAtom3;
        this.station = station;
        this.isHidden = z11;
        this.isDashVisible = z12;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrainStationItem)) {
            return false;
        }
        TrainStationItem trainStationItem = (TrainStationItem) other;
        return this.id == trainStationItem.id && Intrinsics.d(this.arrivalTime, trainStationItem.arrivalTime) && Intrinsics.d(this.stopTime, trainStationItem.stopTime) && Intrinsics.d(this.departureTime, trainStationItem.departureTime) && Intrinsics.d(this.station, trainStationItem.station) && this.isHidden == trainStationItem.isHidden && this.isDashVisible == trainStationItem.isDashVisible;
    }

    public final TextAtom getArrivalTime() {
        return this.arrivalTime;
    }

    public final TextAtom getDepartureTime() {
        return this.departureTime;
    }

    @Override // ru.ozon.app.android.travel.feature.railway.widgets.travelTrainRoute.v2.presentation.TrainListItem
    public int getId() {
        return this.id;
    }

    @NotNull
    public final TextAtom getStation() {
        return this.station;
    }

    public final TextAtom getStopTime() {
        return this.stopTime;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.id) * 31;
        TextAtom textAtom = this.arrivalTime;
        int hashCode2 = (hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        TextAtom textAtom2 = this.stopTime;
        int hashCode3 = (hashCode2 + (textAtom2 == null ? 0 : textAtom2.hashCode())) * 31;
        TextAtom textAtom3 = this.departureTime;
        return Boolean.hashCode(this.isDashVisible) + C3532b.a(C2619v.b((hashCode3 + (textAtom3 != null ? textAtom3.hashCode() : 0)) * 31, 31, this.station), 31, this.isHidden);
    }

    /* renamed from: isDashVisible, reason: from getter */
    public final boolean getIsDashVisible() {
        return this.isDashVisible;
    }

    /* renamed from: isHidden, reason: from getter */
    public final boolean getIsHidden() {
        return this.isHidden;
    }

    @NotNull
    public String toString() {
        int i11 = this.id;
        TextAtom textAtom = this.arrivalTime;
        TextAtom textAtom2 = this.stopTime;
        TextAtom textAtom3 = this.departureTime;
        TextAtom textAtom4 = this.station;
        boolean z11 = this.isHidden;
        boolean z12 = this.isDashVisible;
        StringBuilder sb2 = new StringBuilder("TrainStationItem(id=");
        sb2.append(i11);
        sb2.append(", arrivalTime=");
        sb2.append(textAtom);
        sb2.append(", stopTime=");
        C4636t5.c(", departureTime=", ", station=", sb2, textAtom2, textAtom3);
        sb2.append(textAtom4);
        sb2.append(", isHidden=");
        sb2.append(z11);
        sb2.append(", isDashVisible=");
        return a.a(")", sb2, z12);
    }
}
