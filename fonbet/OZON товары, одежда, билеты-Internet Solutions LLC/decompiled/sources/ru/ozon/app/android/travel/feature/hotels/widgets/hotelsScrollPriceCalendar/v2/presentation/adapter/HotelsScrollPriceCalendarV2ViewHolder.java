package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsScrollPriceCalendar.v2.presentation.adapter;

import GS.a;
import android.view.View;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsScrollPriceCalendar.v2.presentation.HotelsScrollPriceCalendarV2VI;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsScrollPriceCalendar.v2.presentation.background.HotelsScrollPriceCalendarV2ItemViewBackgroundProducer;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsScrollPriceCalendar.v2.view.HotelsScrollPriceCalendarV2ItemView;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/presentation/adapter/HotelsScrollPriceCalendarV2ViewHolder;", "Ljk0/j;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/view/HotelsScrollPriceCalendarV2ItemView;", "view", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/presentation/background/HotelsScrollPriceCalendarV2ItemViewBackgroundProducer;", "itemBackgroundProducer", "<init>", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/view/HotelsScrollPriceCalendarV2ItemView;Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/presentation/background/HotelsScrollPriceCalendarV2ItemViewBackgroundProducer;)V", "onViewInVisibleBounds", "()V", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/presentation/HotelsScrollPriceCalendarV2VI$DatePriceItem;", "item", "bind", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/presentation/HotelsScrollPriceCalendarV2VI$DatePriceItem;)V", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/view/HotelsScrollPriceCalendarV2ItemView;", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/presentation/background/HotelsScrollPriceCalendarV2ItemViewBackgroundProducer;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/presentation/HotelsScrollPriceCalendarV2VI$DatePriceItem;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsScrollPriceCalendarV2ViewHolder extends j {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private HotelsScrollPriceCalendarV2VI.DatePriceItem item;

    @NotNull
    private final HotelsScrollPriceCalendarV2ItemViewBackgroundProducer itemBackgroundProducer;

    @NotNull
    private final HotelsScrollPriceCalendarV2ItemView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HotelsScrollPriceCalendarV2ViewHolder(@NotNull HotelsScrollPriceCalendarV2ItemView view, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull HotelsScrollPriceCalendarV2ItemViewBackgroundProducer itemBackgroundProducer) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(itemBackgroundProducer, "itemBackgroundProducer");
        this.view = view;
        this.actionHandler = actionHandler;
        this.itemBackgroundProducer = itemBackgroundProducer;
        view.setOnClickListener(new a(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(HotelsScrollPriceCalendarV2ViewHolder hotelsScrollPriceCalendarV2ViewHolder, View view) {
        AtomAction action;
        HotelsScrollPriceCalendarV2VI.DatePriceItem datePriceItem = hotelsScrollPriceCalendarV2ViewHolder.item;
        if (datePriceItem == null || (action = datePriceItem.getAction()) == null) {
            return;
        }
        hotelsScrollPriceCalendarV2ViewHolder.actionHandler.invoke(action);
    }

    public final void bind(@NotNull HotelsScrollPriceCalendarV2VI.DatePriceItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.item = item;
        this.view.bind(item, this.itemBackgroundProducer);
    }

    @Override // jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        super.onViewInVisibleBounds();
        HotelsScrollPriceCalendarV2VI.DatePriceItem datePriceItem = this.item;
        this.actionHandler.invoke(new AtomAction.ViewAction(datePriceItem != null ? datePriceItem.getTrackingInfo() : null, null, 2, null));
    }
}
