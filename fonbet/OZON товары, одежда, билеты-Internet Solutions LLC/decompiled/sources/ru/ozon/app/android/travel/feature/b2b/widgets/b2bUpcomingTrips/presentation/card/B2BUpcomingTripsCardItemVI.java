package ru.ozon.app.android.travel.feature.b2b.widgets.b2bUpcomingTrips.presentation.card;

import El.C2971a;
import Kk.C3532b;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.b2b.widgets.b2bUpcomingTrips.data.B2BUpcomingTripsDTO;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u0007\u0010\u001eR\u001f\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/b2bUpcomingTrips/presentation/card/B2BUpcomingTripsCardItemVI;", "Ll20/c;", "", "id", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bUpcomingTrips/data/B2BUpcomingTripsDTO$UpcomingTrip;", "trip", "", "isLast", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "viewEvent", "<init>", "(JLru/ozon/app/android/travel/feature/b2b/widgets/b2bUpcomingTrips/data/B2BUpcomingTripsDTO$UpcomingTrip;ZLWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bUpcomingTrips/data/B2BUpcomingTripsDTO$UpcomingTrip;", "getTrip", "()Lru/ozon/app/android/travel/feature/b2b/widgets/b2bUpcomingTrips/data/B2BUpcomingTripsDTO$UpcomingTrip;", "Z", "()Z", "LWZ/t;", "getViewEvent", "()LWZ/t;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class B2BUpcomingTripsCardItemVI implements c {
    private final long id;
    private final boolean isLast;

    @NotNull
    private final B2BUpcomingTripsDTO.UpcomingTrip trip;
    private final t viewEvent;

    public B2BUpcomingTripsCardItemVI(long j11, @NotNull B2BUpcomingTripsDTO.UpcomingTrip trip, boolean z11, t tVar) {
        Intrinsics.checkNotNullParameter(trip, "trip");
        this.id = j11;
        this.trip = trip;
        this.isLast = z11;
        this.viewEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof B2BUpcomingTripsCardItemVI)) {
            return false;
        }
        B2BUpcomingTripsCardItemVI b2BUpcomingTripsCardItemVI = (B2BUpcomingTripsCardItemVI) other;
        return this.id == b2BUpcomingTripsCardItemVI.id && Intrinsics.d(this.trip, b2BUpcomingTripsCardItemVI.trip) && this.isLast == b2BUpcomingTripsCardItemVI.isLast && Intrinsics.d(this.viewEvent, b2BUpcomingTripsCardItemVI.viewEvent);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final B2BUpcomingTripsDTO.UpcomingTrip getTrip() {
        return this.trip;
    }

    public final t getViewEvent() {
        return this.viewEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = C3532b.a((this.trip.hashCode() + (Long.hashCode(this.id) * 31)) * 31, 31, this.isLast);
        t tVar = this.viewEvent;
        return a11 + (tVar == null ? 0 : tVar.hashCode());
    }

    /* renamed from: isLast, reason: from getter */
    public final boolean getIsLast() {
        return this.isLast;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        B2BUpcomingTripsDTO.UpcomingTrip upcomingTrip = this.trip;
        boolean z11 = this.isLast;
        t tVar = this.viewEvent;
        StringBuilder sb2 = new StringBuilder("B2BUpcomingTripsCardItemVI(id=");
        sb2.append(j11);
        sb2.append(", trip=");
        sb2.append(upcomingTrip);
        C2971a.d(sb2, ", isLast=", z11, ", viewEvent=", tVar);
        sb2.append(")");
        return sb2.toString();
    }
}
