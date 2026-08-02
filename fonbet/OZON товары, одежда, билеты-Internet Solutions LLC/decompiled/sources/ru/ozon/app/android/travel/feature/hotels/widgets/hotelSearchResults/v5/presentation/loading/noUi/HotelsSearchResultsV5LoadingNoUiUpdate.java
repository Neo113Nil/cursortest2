package ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.loading.noUi;

import A00.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.loading.noUi.HotelsSearchResultsV5LoadingNoUiVO;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/loading/noUi/HotelsSearchResultsV5LoadingNoUiUpdate;", "LA00/a$J$a;", "", "asyncData", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/loading/noUi/HotelsSearchResultsV5LoadingNoUiVO$State;", "newState", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/loading/noUi/HotelsSearchResultsV5LoadingNoUiVO$State;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAsyncData", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/loading/noUi/HotelsSearchResultsV5LoadingNoUiVO$State;", "getNewState", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/loading/noUi/HotelsSearchResultsV5LoadingNoUiVO$State;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class HotelsSearchResultsV5LoadingNoUiUpdate implements a.J.InterfaceC0007a {

    @NotNull
    private final String asyncData;

    @NotNull
    private final HotelsSearchResultsV5LoadingNoUiVO.State newState;

    public HotelsSearchResultsV5LoadingNoUiUpdate(@NotNull String asyncData, @NotNull HotelsSearchResultsV5LoadingNoUiVO.State newState) {
        Intrinsics.checkNotNullParameter(asyncData, "asyncData");
        Intrinsics.checkNotNullParameter(newState, "newState");
        this.asyncData = asyncData;
        this.newState = newState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HotelsSearchResultsV5LoadingNoUiUpdate)) {
            return false;
        }
        HotelsSearchResultsV5LoadingNoUiUpdate hotelsSearchResultsV5LoadingNoUiUpdate = (HotelsSearchResultsV5LoadingNoUiUpdate) other;
        return Intrinsics.d(this.asyncData, hotelsSearchResultsV5LoadingNoUiUpdate.asyncData) && Intrinsics.d(this.newState, hotelsSearchResultsV5LoadingNoUiUpdate.newState);
    }

    @NotNull
    public final String getAsyncData() {
        return this.asyncData;
    }

    @NotNull
    public final HotelsSearchResultsV5LoadingNoUiVO.State getNewState() {
        return this.newState;
    }

    public int hashCode() {
        return this.newState.hashCode() + (this.asyncData.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "HotelsSearchResultsV5LoadingNoUiUpdate(asyncData=" + this.asyncData + ", newState=" + this.newState + ")";
    }
}
