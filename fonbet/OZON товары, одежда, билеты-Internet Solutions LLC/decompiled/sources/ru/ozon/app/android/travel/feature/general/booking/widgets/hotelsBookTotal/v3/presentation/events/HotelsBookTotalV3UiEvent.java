package ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation.events;

import H3.c;
import Nh.a;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.actionhandler.performActionsList.ActionWithDelay;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/events/HotelsBookTotalV3UiEvent;", "", "Refresh", "PerformActionsList", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/events/HotelsBookTotalV3UiEvent$PerformActionsList;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/events/HotelsBookTotalV3UiEvent$Refresh;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface HotelsBookTotalV3UiEvent {

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/events/HotelsBookTotalV3UiEvent$PerformActionsList;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/events/HotelsBookTotalV3UiEvent;", "", "Lru/ozon/app/android/travel/actionhandler/performActionsList/ActionWithDelay;", "actionsWithDelay", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getActionsWithDelay", "()Ljava/util/List;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PerformActionsList implements HotelsBookTotalV3UiEvent {

        @NotNull
        private final List<ActionWithDelay> actionsWithDelay;

        public PerformActionsList(@NotNull List<ActionWithDelay> actionsWithDelay) {
            Intrinsics.checkNotNullParameter(actionsWithDelay, "actionsWithDelay");
            this.actionsWithDelay = actionsWithDelay;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PerformActionsList) && Intrinsics.d(this.actionsWithDelay, ((PerformActionsList) other).actionsWithDelay);
        }

        @NotNull
        public final List<ActionWithDelay> getActionsWithDelay() {
            return this.actionsWithDelay;
        }

        public int hashCode() {
            return this.actionsWithDelay.hashCode();
        }

        @NotNull
        public String toString() {
            return c.a("PerformActionsList(actionsWithDelay=", ")", this.actionsWithDelay);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\nR#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/events/HotelsBookTotalV3UiEvent$Refresh;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/events/HotelsBookTotalV3UiEvent;", "", "asyncData", "", "", "params", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAsyncData", "Ljava/util/Map;", "getParams", "()Ljava/util/Map;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Refresh implements HotelsBookTotalV3UiEvent {

        @NotNull
        private final String asyncData;

        @NotNull
        private final Map<String, Object> params;

        public Refresh(@NotNull String asyncData, @NotNull Map<String, ? extends Object> params) {
            Intrinsics.checkNotNullParameter(asyncData, "asyncData");
            Intrinsics.checkNotNullParameter(params, "params");
            this.asyncData = asyncData;
            this.params = params;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Refresh)) {
                return false;
            }
            Refresh refresh = (Refresh) other;
            return Intrinsics.d(this.asyncData, refresh.asyncData) && Intrinsics.d(this.params, refresh.params);
        }

        @NotNull
        public final String getAsyncData() {
            return this.asyncData;
        }

        @NotNull
        public final Map<String, Object> getParams() {
            return this.params;
        }

        public int hashCode() {
            return this.params.hashCode() + (this.asyncData.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return a.d("Refresh(asyncData=", this.asyncData, ", params=", ")", this.params);
        }
    }
}
