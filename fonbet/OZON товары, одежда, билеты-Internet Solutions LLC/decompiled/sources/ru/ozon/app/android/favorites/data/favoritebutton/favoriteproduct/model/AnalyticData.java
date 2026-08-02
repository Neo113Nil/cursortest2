package ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model;

import W10.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u000e\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001f\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;", "", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/l;", "viewItem", "<init>", "(LW10/c;Lru/ozon/composer/ui/widget/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "LW10/c;", "getTrackingData", "()LW10/c;", "Lru/ozon/composer/ui/widget/l;", "getViewItem", "()Lru/ozon/composer/ui/widget/l;", "", "getVoId", "()Ljava/lang/Long;", "voId", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class AnalyticData {
    private final c trackingData;
    private final l viewItem;

    public AnalyticData(c cVar, l lVar) {
        this.trackingData = cVar;
        this.viewItem = lVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnalyticData)) {
            return false;
        }
        AnalyticData analyticData = (AnalyticData) other;
        return Intrinsics.d(this.trackingData, analyticData.trackingData) && Intrinsics.d(this.viewItem, analyticData.viewItem);
    }

    public final c getTrackingData() {
        return this.trackingData;
    }

    public final l getViewItem() {
        return this.viewItem;
    }

    public final Long getVoId() {
        l lVar = this.viewItem;
        if (lVar != null) {
            return Long.valueOf(lVar.f());
        }
        return null;
    }

    public int hashCode() {
        c cVar = this.trackingData;
        int hashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
        l lVar = this.viewItem;
        return hashCode + (lVar != null ? lVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AnalyticData(trackingData=" + this.trackingData + ", viewItem=" + this.viewItem + ")";
    }
}
