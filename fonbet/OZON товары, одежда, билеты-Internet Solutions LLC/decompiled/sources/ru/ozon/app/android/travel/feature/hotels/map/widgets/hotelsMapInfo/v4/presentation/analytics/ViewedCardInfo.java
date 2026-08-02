package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.analytics;

import B0.C2454a;
import C.o0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4VO;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u000b¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/analytics/ViewedCardInfo;", "", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$CardState;", "card", "", "cardPosition", "", "firstCardId", "<init>", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$CardState;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$CardState;", "getCard", "()Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$CardState;", "I", "getCardPosition", "Ljava/lang/String;", "getFirstCardId", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ViewedCardInfo {

    @NotNull
    private final HotelsMapInfoV4VO.CardState card;
    private final int cardPosition;

    @NotNull
    private final String firstCardId;

    public ViewedCardInfo(@NotNull HotelsMapInfoV4VO.CardState card, int i11, @NotNull String firstCardId) {
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(firstCardId, "firstCardId");
        this.card = card;
        this.cardPosition = i11;
        this.firstCardId = firstCardId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ViewedCardInfo)) {
            return false;
        }
        ViewedCardInfo viewedCardInfo = (ViewedCardInfo) other;
        return Intrinsics.d(this.card, viewedCardInfo.card) && this.cardPosition == viewedCardInfo.cardPosition && Intrinsics.d(this.firstCardId, viewedCardInfo.firstCardId);
    }

    @NotNull
    public final HotelsMapInfoV4VO.CardState getCard() {
        return this.card;
    }

    public final int getCardPosition() {
        return this.cardPosition;
    }

    @NotNull
    public final String getFirstCardId() {
        return this.firstCardId;
    }

    public int hashCode() {
        return this.firstCardId.hashCode() + C2454a.a(this.cardPosition, this.card.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        HotelsMapInfoV4VO.CardState cardState = this.card;
        int i11 = this.cardPosition;
        String str = this.firstCardId;
        StringBuilder sb2 = new StringBuilder("ViewedCardInfo(card=");
        sb2.append(cardState);
        sb2.append(", cardPosition=");
        sb2.append(i11);
        sb2.append(", firstCardId=");
        return o0.c(sb2, str, ")");
    }
}
