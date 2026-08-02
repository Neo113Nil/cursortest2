package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsVerticalShelves.data;

import Lh.b;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.shared.data.ShelfCardDTO;
import ru.ozon.app.android.travel.feature.hotels.shared.data.ShelfCardOptions;
import ru.ozon.app.android.travel.feature.hotels.shared.shelfCard.ShelfCardMapperExtKt;
import ru.ozon.app.android.travel.feature.hotels.shared.shelfCard.ShelfCardOptionsVO;
import ru.ozon.app.android.travel.feature.hotels.shared.shelfCard.ShelfCardVO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsVerticalShelves.data.HotelsVerticalShelvesDTO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsVerticalShelves.presentation.HotelsVerticalShelvesVO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsVerticalShelves/data/HotelsVerticalShelvesMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsVerticalShelves/data/HotelsVerticalShelvesDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsVerticalShelves/presentation/HotelsVerticalShelvesVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsVerticalShelves/data/HotelsVerticalShelvesDTO;Ll20/d;)Ljava/util/List;", "Landroid/content/Context;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsVerticalShelvesMapper implements Function2<HotelsVerticalShelvesDTO, d, List<? extends HotelsVerticalShelvesVO>> {

    @NotNull
    private final Context context;

    public HotelsVerticalShelvesMapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<HotelsVerticalShelvesVO> invoke(@NotNull HotelsVerticalShelvesDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = state.getRows().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            HotelsVerticalShelvesDTO.CardsRow cardsRow = (HotelsVerticalShelvesDTO.CardsRow) it.next();
            int cardCount = cardsRow.getCardCount();
            for (int i11 = 0; i11 < cardCount; i11++) {
                arrayList.add(cardsRow);
            }
        }
        List<ShelfCardDTO> cards = state.getCards();
        ArrayList arrayList2 = new ArrayList(C7714v.z(cards, 10));
        int i12 = 0;
        for (Object obj : cards) {
            int i13 = i12 + 1;
            Integer num = null;
            if (i12 < 0) {
                C7714v.O0();
                throw null;
            }
            ShelfCardDTO shelfCardDTO = (ShelfCardDTO) obj;
            HotelsVerticalShelvesDTO.CardsRow cardsRow2 = (HotelsVerticalShelvesDTO.CardsRow) arrayList.get(i12 % arrayList.size());
            long a11 = b.a(i12, widgetInfo.d(), "_");
            Context context = this.context;
            int cardCount2 = cardsRow2.getCardCount();
            ShelfCardOptions cardOptions = state.getCardOptions();
            ShelfCardVO vO$default = ShelfCardMapperExtKt.toVO$default(shelfCardDTO, context, i12, Integer.valueOf(cardCount2), null, cardOptions != null ? cardOptions.getOuterCardsMargins() : null, cardsRow2.getImageAspectRatio(), null, 72, null);
            int cardCount3 = cardsRow2.getCardCount();
            ShelfCardOptionsVO vo = ShelfCardMapperExtKt.toVO(state.getCardOptions(), this.context);
            Integer verticalGap = state.getVerticalGap();
            if (verticalGap != null) {
                num = Integer.valueOf(ResourceExtKt.toPx(verticalGap.intValue(), this.context));
            }
            arrayList2.add(new HotelsVerticalShelvesVO(a11, vO$default, cardCount3, vo, num));
            i12 = i13;
        }
        return arrayList2;
    }
}
