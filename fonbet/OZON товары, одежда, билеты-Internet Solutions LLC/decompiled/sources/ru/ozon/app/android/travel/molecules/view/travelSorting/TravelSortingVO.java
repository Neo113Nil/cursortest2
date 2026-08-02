package ru.ozon.app.android.travel.molecules.view.travelSorting;

import G.g;
import Kk.C3532b;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.list.Select;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0005\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u000eR\u001f\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/travelSorting/TravelSortingVO;", "", "Lru/ozon/app/android/atoms/data/list/Select;", "sortingTypes", "", "isEnabled", "", "urlBase", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "trackingEvent", "<init>", "(Lru/ozon/app/android/atoms/data/list/Select;ZLjava/lang/String;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/atoms/data/list/Select;", "getSortingTypes", "()Lru/ozon/app/android/atoms/data/list/Select;", "Z", "()Z", "Ljava/lang/String;", "getUrlBase", "LWZ/t;", "getTrackingEvent", "()LWZ/t;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TravelSortingVO {
    private final boolean isEnabled;

    @NotNull
    private final Select sortingTypes;
    private final t trackingEvent;

    @NotNull
    private final String urlBase;

    public TravelSortingVO(@NotNull Select sortingTypes, boolean z11, @NotNull String urlBase, t tVar) {
        Intrinsics.checkNotNullParameter(sortingTypes, "sortingTypes");
        Intrinsics.checkNotNullParameter(urlBase, "urlBase");
        this.sortingTypes = sortingTypes;
        this.isEnabled = z11;
        this.urlBase = urlBase;
        this.trackingEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelSortingVO)) {
            return false;
        }
        TravelSortingVO travelSortingVO = (TravelSortingVO) other;
        return Intrinsics.d(this.sortingTypes, travelSortingVO.sortingTypes) && this.isEnabled == travelSortingVO.isEnabled && Intrinsics.d(this.urlBase, travelSortingVO.urlBase) && Intrinsics.d(this.trackingEvent, travelSortingVO.trackingEvent);
    }

    @NotNull
    public final Select getSortingTypes() {
        return this.sortingTypes;
    }

    public int hashCode() {
        int a11 = g.a(C3532b.a(this.sortingTypes.hashCode() * 31, 31, this.isEnabled), 31, this.urlBase);
        t tVar = this.trackingEvent;
        return a11 + (tVar == null ? 0 : tVar.hashCode());
    }

    /* renamed from: isEnabled, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    @NotNull
    public String toString() {
        return "TravelSortingVO(sortingTypes=" + this.sortingTypes + ", isEnabled=" + this.isEnabled + ", urlBase=" + this.urlBase + ", trackingEvent=" + this.trackingEvent + ")";
    }
}
