package ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.card;

import A00.a;
import Sh.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/HotelsSearchResultsV5ScrollWidgetKeyUpdate;", "LA00/a$J$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "id", "J", "getId", "()J", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class HotelsSearchResultsV5ScrollWidgetKeyUpdate implements a.J.InterfaceC0007a {
    private final long id;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof HotelsSearchResultsV5ScrollWidgetKeyUpdate) && this.id == ((HotelsSearchResultsV5ScrollWidgetKeyUpdate) other).id;
    }

    public int hashCode() {
        return Long.hashCode(this.id);
    }

    @NotNull
    public String toString() {
        return b.b(this.id, "HotelsSearchResultsV5ScrollWidgetKeyUpdate(id=", ")");
    }
}
