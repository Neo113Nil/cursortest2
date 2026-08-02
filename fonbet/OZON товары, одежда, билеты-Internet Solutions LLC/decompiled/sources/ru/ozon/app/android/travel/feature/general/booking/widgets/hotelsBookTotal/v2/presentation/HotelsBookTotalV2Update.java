package ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v2.presentation;

import A00.a;
import Kk.C3532b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v2.presentation.HotelsBookTotalV2VO;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/presentation/HotelsBookTotalV2Update;", "LA00/a$J$a;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/presentation/HotelsBookTotalV2VO$State;", "newState", "", "shouldFetchState", "shouldShowLoader", "<init>", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/presentation/HotelsBookTotalV2VO$State;ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/presentation/HotelsBookTotalV2VO$State;", "getNewState", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/presentation/HotelsBookTotalV2VO$State;", "Z", "getShouldFetchState", "()Z", "getShouldShowLoader", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class HotelsBookTotalV2Update implements a.J.InterfaceC0007a {

    @NotNull
    private final HotelsBookTotalV2VO.State newState;
    private final boolean shouldFetchState;
    private final boolean shouldShowLoader;

    public HotelsBookTotalV2Update(@NotNull HotelsBookTotalV2VO.State newState, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(newState, "newState");
        this.newState = newState;
        this.shouldFetchState = z11;
        this.shouldShowLoader = z12;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HotelsBookTotalV2Update)) {
            return false;
        }
        HotelsBookTotalV2Update hotelsBookTotalV2Update = (HotelsBookTotalV2Update) other;
        return Intrinsics.d(this.newState, hotelsBookTotalV2Update.newState) && this.shouldFetchState == hotelsBookTotalV2Update.shouldFetchState && this.shouldShowLoader == hotelsBookTotalV2Update.shouldShowLoader;
    }

    @NotNull
    public final HotelsBookTotalV2VO.State getNewState() {
        return this.newState;
    }

    public final boolean getShouldFetchState() {
        return this.shouldFetchState;
    }

    public final boolean getShouldShowLoader() {
        return this.shouldShowLoader;
    }

    public int hashCode() {
        return Boolean.hashCode(this.shouldShowLoader) + C3532b.a(this.newState.hashCode() * 31, 31, this.shouldFetchState);
    }

    @NotNull
    public String toString() {
        HotelsBookTotalV2VO.State state = this.newState;
        boolean z11 = this.shouldFetchState;
        boolean z12 = this.shouldShowLoader;
        StringBuilder sb2 = new StringBuilder("HotelsBookTotalV2Update(newState=");
        sb2.append(state);
        sb2.append(", shouldFetchState=");
        sb2.append(z11);
        sb2.append(", shouldShowLoader=");
        return Pk0.a.a(")", sb2, z12);
    }
}
