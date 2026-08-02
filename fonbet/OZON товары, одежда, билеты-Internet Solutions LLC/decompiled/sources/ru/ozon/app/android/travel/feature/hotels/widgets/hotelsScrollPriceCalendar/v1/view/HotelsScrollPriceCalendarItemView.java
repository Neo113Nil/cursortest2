package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsScrollPriceCalendar.v1.view;

import Am.C2438a;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsScrollPriceCalendar.v1.presentation.HotelsScrollPriceCalendarVO;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\b\u0010\u0018\u001a\u00020\u0015H\u0002R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\r\u0010\tR\u001b\u0010\u000f\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0010\u0010\tR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v1/view/HotelsScrollPriceCalendarItemView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "weekdaysIntervalTav", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getWeekdaysIntervalTav", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "weekdaysIntervalTav$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "dateInterval", "getDateInterval", "dateInterval$delegate", "price", "getPrice", "price$delegate", "backgroundDrawable", "Landroid/graphics/drawable/ShapeDrawable;", "bind", "", "item", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v1/presentation/HotelsScrollPriceCalendarVO$DatePriceItem;", "addViews", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsScrollPriceCalendarItemView extends LinearLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(HotelsScrollPriceCalendarItemView.class, "weekdaysIntervalTav", "getWeekdaysIntervalTav()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(HotelsScrollPriceCalendarItemView.class, "dateInterval", "getDateInterval()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(HotelsScrollPriceCalendarItemView.class, "price", "getPrice()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0)};
    public static final int $stable = 8;

    @NotNull
    private final ShapeDrawable backgroundDrawable;

    /* renamed from: dateInterval$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate dateInterval;

    /* renamed from: price$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate price;

    /* renamed from: weekdaysIntervalTav$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate weekdaysIntervalTav;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelsScrollPriceCalendarItemView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.weekdaysIntervalTav = new PreCreationViewPoolDelegate(context2, N.b(TextAtomV2View.class), new HotelsScrollPriceCalendarItemView$special$$inlined$preCreationViewPool$default$1(this), new HotelsScrollPriceCalendarItemView$special$$inlined$preCreationViewPool$default$2());
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.dateInterval = new PreCreationViewPoolDelegate(context3, N.b(TextAtomV2View.class), new HotelsScrollPriceCalendarItemView$special$$inlined$preCreationViewPool$default$3(this), new HotelsScrollPriceCalendarItemView$special$$inlined$preCreationViewPool$default$4());
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        this.price = new PreCreationViewPoolDelegate(context4, N.b(TextAtomV2View.class), new HotelsScrollPriceCalendarItemView$special$$inlined$preCreationViewPool$default$5(this), new HotelsScrollPriceCalendarItemView$special$$inlined$preCreationViewPool$default$6());
        ShapeDrawable produce = new RoundedBackgroundProducer().produce(ThemeExtKt.themeColor(context, R$attr.bgPrimary), ResourceExtKt.toPxF(16, context));
        this.backgroundDrawable = produce;
        setOrientation(1);
        setBackground(produce);
        addViews();
    }

    private final void addViews() {
        addView(getWeekdaysIntervalTav());
        addView(getDateInterval());
        addView(getPrice());
    }

    private final TextAtomV2View getDateInterval() {
        return (TextAtomV2View) this.dateInterval.getValue(this, $$delegatedProperties[1]);
    }

    private final TextAtomV2View getPrice() {
        return (TextAtomV2View) this.price.getValue(this, $$delegatedProperties[2]);
    }

    private final TextAtomV2View getWeekdaysIntervalTav() {
        return (TextAtomV2View) this.weekdaysIntervalTav.getValue(this, $$delegatedProperties[0]);
    }

    public final void bind(@NotNull HotelsScrollPriceCalendarVO.DatePriceItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        TextHolderKt.bind$default(getWeekdaysIntervalTav(), item.getWeekdaysInterval(), null, 2, null);
        TextHolderKt.bind$default(getDateInterval(), item.getDateInterval(), null, 2, null);
        TextHolderKt.bind$default(getPrice(), item.getPrice(), null, 2, null);
    }
}
