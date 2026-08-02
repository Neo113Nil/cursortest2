package ru.ozon.app.android.orders.cml.parcelTimeline.presentation.compose;

import A00.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.orders.cml.parcelTimeline.data.ParcelTimelineDTO;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/orders/cml/parcelTimeline/presentation/compose/ParcelTimelineUpdateEvent;", "LA00/a$J$a;", "", "key", "Lru/ozon/app/android/orders/cml/parcelTimeline/data/ParcelTimelineDTO$SectionDTO$SectionUIState;", "newUiState", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/orders/cml/parcelTimeline/data/ParcelTimelineDTO$SectionDTO$SectionUIState;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getKey", "Lru/ozon/app/android/orders/cml/parcelTimeline/data/ParcelTimelineDTO$SectionDTO$SectionUIState;", "getNewUiState", "()Lru/ozon/app/android/orders/cml/parcelTimeline/data/ParcelTimelineDTO$SectionDTO$SectionUIState;", "orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ParcelTimelineUpdateEvent implements a.J.InterfaceC0007a {

    @NotNull
    private final String key;

    @NotNull
    private final ParcelTimelineDTO.SectionDTO.SectionUIState newUiState;

    public ParcelTimelineUpdateEvent(@NotNull String key, @NotNull ParcelTimelineDTO.SectionDTO.SectionUIState newUiState) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(newUiState, "newUiState");
        this.key = key;
        this.newUiState = newUiState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ParcelTimelineUpdateEvent)) {
            return false;
        }
        ParcelTimelineUpdateEvent parcelTimelineUpdateEvent = (ParcelTimelineUpdateEvent) other;
        return Intrinsics.d(this.key, parcelTimelineUpdateEvent.key) && this.newUiState == parcelTimelineUpdateEvent.newUiState;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    @NotNull
    public final ParcelTimelineDTO.SectionDTO.SectionUIState getNewUiState() {
        return this.newUiState;
    }

    public int hashCode() {
        return this.newUiState.hashCode() + (this.key.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "ParcelTimelineUpdateEvent(key=" + this.key + ", newUiState=" + this.newUiState + ")";
    }
}
