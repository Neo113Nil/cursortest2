package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsVerticalShelves.presentation;

import B0.C2454a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.shared.shelfCard.ShelfCardOptionsVO;
import ru.ozon.app.android.travel.feature.hotels.shared.shelfCard.ShelfCardVO;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsVerticalShelves/presentation/HotelsVerticalShelvesVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/travel/feature/hotels/shared/shelfCard/ShelfCardVO;", "card", "", "span", "Lru/ozon/app/android/travel/feature/hotels/shared/shelfCard/ShelfCardOptionsVO;", "cardOptions", "verticalGap", "<init>", "(JLru/ozon/app/android/travel/feature/hotels/shared/shelfCard/ShelfCardVO;ILru/ozon/app/android/travel/feature/hotels/shared/shelfCard/ShelfCardOptionsVO;Ljava/lang/Integer;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/travel/feature/hotels/shared/shelfCard/ShelfCardVO;", "getCard", "()Lru/ozon/app/android/travel/feature/hotels/shared/shelfCard/ShelfCardVO;", "I", "getSpan", "Lru/ozon/app/android/travel/feature/hotels/shared/shelfCard/ShelfCardOptionsVO;", "getCardOptions", "()Lru/ozon/app/android/travel/feature/hotels/shared/shelfCard/ShelfCardOptionsVO;", "Ljava/lang/Integer;", "getVerticalGap", "()Ljava/lang/Integer;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HotelsVerticalShelvesVO implements c {

    @NotNull
    private final ShelfCardVO card;

    @NotNull
    private final ShelfCardOptionsVO cardOptions;
    private final long id;
    private final int span;
    private final Integer verticalGap;

    public HotelsVerticalShelvesVO(long j11, @NotNull ShelfCardVO card, int i11, @NotNull ShelfCardOptionsVO cardOptions, Integer num) {
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(cardOptions, "cardOptions");
        this.id = j11;
        this.card = card;
        this.span = i11;
        this.cardOptions = cardOptions;
        this.verticalGap = num;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HotelsVerticalShelvesVO)) {
            return false;
        }
        HotelsVerticalShelvesVO hotelsVerticalShelvesVO = (HotelsVerticalShelvesVO) other;
        return this.id == hotelsVerticalShelvesVO.id && Intrinsics.d(this.card, hotelsVerticalShelvesVO.card) && this.span == hotelsVerticalShelvesVO.span && Intrinsics.d(this.cardOptions, hotelsVerticalShelvesVO.cardOptions) && Intrinsics.d(this.verticalGap, hotelsVerticalShelvesVO.verticalGap);
    }

    @NotNull
    public final ShelfCardVO getCard() {
        return this.card;
    }

    @NotNull
    public final ShelfCardOptionsVO getCardOptions() {
        return this.cardOptions;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final int getSpan() {
        return this.span;
    }

    public final Integer getVerticalGap() {
        return this.verticalGap;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.cardOptions.hashCode() + C2454a.a(this.span, (this.card.hashCode() + (Long.hashCode(this.id) * 31)) * 31, 31)) * 31;
        Integer num = this.verticalGap;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    @NotNull
    public String toString() {
        return "HotelsVerticalShelvesVO(id=" + this.id + ", card=" + this.card + ", span=" + this.span + ", cardOptions=" + this.cardOptions + ", verticalGap=" + this.verticalGap + ")";
    }
}
