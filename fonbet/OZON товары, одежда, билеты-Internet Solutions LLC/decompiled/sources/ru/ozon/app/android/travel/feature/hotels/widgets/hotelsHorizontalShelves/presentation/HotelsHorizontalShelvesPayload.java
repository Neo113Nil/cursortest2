package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsHorizontalShelves.presentation;

import java.util.BitSet;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\u0007J\u0006\u0010\u000b\u001a\u00020\tJ\u0006\u0010\f\u001a\u00020\u0007J\u0006\u0010\r\u001a\u00020\tJ\u0006\u0010\u000e\u001a\u00020\u0007J\u0006\u0010\u000f\u001a\u00020\tJ\u0006\u0010\u0010\u001a\u00020\u0007J\u0006\u0010\u0011\u001a\u00020\tJ\u0006\u0010\u0012\u001a\u00020\u0007J\u0006\u0010\u0013\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/presentation/HotelsHorizontalShelvesPayload;", "", "<init>", "()V", "changes", "Ljava/util/BitSet;", "setTitleChanged", "", "isTitleChanged", "", "setSubtitleChanged", "isSubtitleChanged", "setBackgroundChanged", "isBackgroundChanged", "setCardsChanged", "areCardsChanged", "setCardsTopMarginChanged", "isCardsTopMarginChanged", "setActionChanged", "isActionChanged", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsHorizontalShelvesPayload {

    @NotNull
    private final BitSet changes = new BitSet();

    public final boolean areCardsChanged() {
        return this.changes.get(4);
    }

    public final boolean isActionChanged() {
        return this.changes.get(6);
    }

    public final boolean isBackgroundChanged() {
        return this.changes.get(3);
    }

    public final boolean isCardsTopMarginChanged() {
        return this.changes.get(5);
    }

    public final boolean isSubtitleChanged() {
        return this.changes.get(2);
    }

    public final boolean isTitleChanged() {
        return this.changes.get(1);
    }

    public final void setActionChanged() {
        this.changes.set(6, true);
    }

    public final void setBackgroundChanged() {
        this.changes.set(3, true);
    }

    public final void setCardsChanged() {
        this.changes.set(4, true);
    }

    public final void setCardsTopMarginChanged() {
        this.changes.set(5, true);
    }

    public final void setSubtitleChanged() {
        this.changes.set(2, true);
    }

    public final void setTitleChanged() {
        this.changes.set(1, true);
    }
}
