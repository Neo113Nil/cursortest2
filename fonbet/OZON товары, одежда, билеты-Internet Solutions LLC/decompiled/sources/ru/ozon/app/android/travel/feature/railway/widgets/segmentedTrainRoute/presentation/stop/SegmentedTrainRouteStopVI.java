package ru.ozon.app.android.travel.feature.railway.widgets.segmentedTrainRoute.presentation.stop;

import D3.g;
import Kk.C3532b;
import Xc.a;
import Xc.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0081\b\u0018\u00002\u00020\u0001:\u0001'BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b!\u0010\u001eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b\n\u0010#R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/presentation/stop/SegmentedTrainRouteStopVI;", "Ll20/c;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", "arrivalTime", "departureTime", "city", "station", "", "isBoardingStop", "Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/presentation/stop/SegmentedTrainRouteStopVI$StopPosition;", "stopPosition", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;ZLru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/presentation/stop/SegmentedTrainRouteStopVI$StopPosition;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getArrivalTime", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getDepartureTime", "getCity", "getStation", "Z", "()Z", "Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/presentation/stop/SegmentedTrainRouteStopVI$StopPosition;", "getStopPosition", "()Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/presentation/stop/SegmentedTrainRouteStopVI$StopPosition;", "StopPosition", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SegmentedTrainRouteStopVI implements c {

    @NotNull
    private final TextDTO arrivalTime;

    @NotNull
    private final TextDTO city;
    private final TextDTO departureTime;
    private final long id;
    private final boolean isBoardingStop;
    private final TextDTO station;

    @NotNull
    private final StopPosition stopPosition;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/presentation/stop/SegmentedTrainRouteStopVI$StopPosition;", "", "<init>", "(Ljava/lang/String;I)V", "START", "MIDDLE", "END", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class StopPosition {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ StopPosition[] $VALUES;
        public static final StopPosition START = new StopPosition("START", 0);
        public static final StopPosition MIDDLE = new StopPosition("MIDDLE", 1);
        public static final StopPosition END = new StopPosition("END", 2);

        private static final /* synthetic */ StopPosition[] $values() {
            return new StopPosition[]{START, MIDDLE, END};
        }

        static {
            StopPosition[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private StopPosition(String str, int i11) {
        }

        public static StopPosition valueOf(String str) {
            return (StopPosition) Enum.valueOf(StopPosition.class, str);
        }

        public static StopPosition[] values() {
            return (StopPosition[]) $VALUES.clone();
        }
    }

    public SegmentedTrainRouteStopVI(long j11, @NotNull TextDTO arrivalTime, TextDTO textDTO, @NotNull TextDTO city, TextDTO textDTO2, boolean z11, @NotNull StopPosition stopPosition) {
        Intrinsics.checkNotNullParameter(arrivalTime, "arrivalTime");
        Intrinsics.checkNotNullParameter(city, "city");
        Intrinsics.checkNotNullParameter(stopPosition, "stopPosition");
        this.id = j11;
        this.arrivalTime = arrivalTime;
        this.departureTime = textDTO;
        this.city = city;
        this.station = textDTO2;
        this.isBoardingStop = z11;
        this.stopPosition = stopPosition;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SegmentedTrainRouteStopVI)) {
            return false;
        }
        SegmentedTrainRouteStopVI segmentedTrainRouteStopVI = (SegmentedTrainRouteStopVI) other;
        return this.id == segmentedTrainRouteStopVI.id && Intrinsics.d(this.arrivalTime, segmentedTrainRouteStopVI.arrivalTime) && Intrinsics.d(this.departureTime, segmentedTrainRouteStopVI.departureTime) && Intrinsics.d(this.city, segmentedTrainRouteStopVI.city) && Intrinsics.d(this.station, segmentedTrainRouteStopVI.station) && this.isBoardingStop == segmentedTrainRouteStopVI.isBoardingStop && this.stopPosition == segmentedTrainRouteStopVI.stopPosition;
    }

    @NotNull
    public final TextDTO getArrivalTime() {
        return this.arrivalTime;
    }

    @NotNull
    public final TextDTO getCity() {
        return this.city;
    }

    public final TextDTO getDepartureTime() {
        return this.departureTime;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final TextDTO getStation() {
        return this.station;
    }

    @NotNull
    public final StopPosition getStopPosition() {
        return this.stopPosition;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = Ns.b.a(this.arrivalTime, Long.hashCode(this.id) * 31, 31);
        TextDTO textDTO = this.departureTime;
        int a12 = Ns.b.a(this.city, (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31);
        TextDTO textDTO2 = this.station;
        return this.stopPosition.hashCode() + C3532b.a((a12 + (textDTO2 != null ? textDTO2.hashCode() : 0)) * 31, 31, this.isBoardingStop);
    }

    /* renamed from: isBoardingStop, reason: from getter */
    public final boolean getIsBoardingStop() {
        return this.isBoardingStop;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.arrivalTime;
        TextDTO textDTO2 = this.departureTime;
        TextDTO textDTO3 = this.city;
        TextDTO textDTO4 = this.station;
        boolean z11 = this.isBoardingStop;
        StopPosition stopPosition = this.stopPosition;
        StringBuilder b11 = TY.a.b("SegmentedTrainRouteStopVI(id=", j11, ", arrivalTime=", textDTO);
        g.i(", departureTime=", ", city=", b11, textDTO2, textDTO3);
        b11.append(", station=");
        b11.append(textDTO4);
        b11.append(", isBoardingStop=");
        b11.append(z11);
        b11.append(", stopPosition=");
        b11.append(stopPosition);
        b11.append(")");
        return b11.toString();
    }
}
