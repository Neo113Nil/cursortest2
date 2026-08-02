package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsScrollPriceCalendar.v2.view;

import Am.C2438a;
import Vc.a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.R$id;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsScrollPriceCalendar.v2.presentation.HotelsScrollPriceCalendarV2VI;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsScrollPriceCalendar.v2.presentation.background.HotelsScrollPriceCalendarV2ItemViewBackgroundProducer;
import ru.ozon.app.android.travel.molecules.view.shimmer.RoundedShimmerView;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.MeasureExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0007H\u0014J\u0016\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%J\b\u0010&\u001a\u00020\u001eH\u0002J\b\u0010'\u001a\u00020\u001eH\u0002J\u0010\u0010(\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020#H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u000f\u001a\u0004\b\u0016\u0010\u0013R\u001b\u0010\u0018\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u000f\u001a\u0004\b\u0019\u0010\u0013R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/view/HotelsScrollPriceCalendarV2ItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp8", "", "dp16", "minWidth", "badgeView", "Lru/ozon/uni/android/atom/badge/BadgeView;", "getBadgeView", "()Lru/ozon/uni/android/atom/badge/BadgeView;", "badgeView$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "weekdaysIntervalTav", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getWeekdaysIntervalTav", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "weekdaysIntervalTav$delegate", "dateIntervalTav", "getDateIntervalTav", "dateIntervalTav$delegate", "priceTav", "getPriceTav", "priceTav$delegate", "priceShimmer", "Lru/ozon/app/android/travel/molecules/view/shimmer/RoundedShimmerView;", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "bind", "item", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/presentation/HotelsScrollPriceCalendarV2VI$DatePriceItem;", "itemBackgroundProducer", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/presentation/background/HotelsScrollPriceCalendarV2ItemViewBackgroundProducer;", "addViews", "setupConstraints", "bindPrice", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsScrollPriceCalendarV2ItemView extends ConstraintLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(HotelsScrollPriceCalendarV2ItemView.class, "badgeView", "getBadgeView()Lru/ozon/uni/android/atom/badge/BadgeView;", 0), C2438a.c(HotelsScrollPriceCalendarV2ItemView.class, "weekdaysIntervalTav", "getWeekdaysIntervalTav()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(HotelsScrollPriceCalendarV2ItemView.class, "dateIntervalTav", "getDateIntervalTav()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(HotelsScrollPriceCalendarV2ItemView.class, "priceTav", "getPriceTav()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0)};
    public static final int $stable;

    /* renamed from: badgeView$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate badgeView;

    /* renamed from: dateIntervalTav$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate dateIntervalTav;
    private final int dp16;
    private final int dp8;
    private final int minWidth;

    @NotNull
    private final RoundedShimmerView priceShimmer;

    /* renamed from: priceTav$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate priceTav;

    /* renamed from: weekdaysIntervalTav$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate weekdaysIntervalTav;

    static {
        int i11 = RoundedShimmerView.$stable;
        int i12 = TextAtomV2View.$stable;
        int i13 = PreCreationViewPoolDelegate.$stable;
        $stable = i11 | i12 | i13 | i12 | i13 | i12 | i13 | BadgeView.$stable | i13;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelsScrollPriceCalendarV2ItemView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(8, context);
        this.dp8 = px;
        int px2 = ResourceExtKt.toPx(16, context);
        this.dp16 = px2;
        this.minWidth = ResourceExtKt.toPx(136, context);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.badgeView = new PreCreationViewPoolDelegate(context2, N.b(BadgeView.class), new HotelsScrollPriceCalendarV2ItemView$special$$inlined$preCreationViewPool$default$1(this), new HotelsScrollPriceCalendarV2ItemView$special$$inlined$preCreationViewPool$default$2(context));
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.weekdaysIntervalTav = new PreCreationViewPoolDelegate(context3, N.b(TextAtomV2View.class), new HotelsScrollPriceCalendarV2ItemView$special$$inlined$preCreationViewPool$default$3(this), new HotelsScrollPriceCalendarV2ItemView$special$$inlined$preCreationViewPool$default$4());
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        this.dateIntervalTav = new PreCreationViewPoolDelegate(context4, N.b(TextAtomV2View.class), new HotelsScrollPriceCalendarV2ItemView$special$$inlined$preCreationViewPool$default$5(this), new HotelsScrollPriceCalendarV2ItemView$special$$inlined$preCreationViewPool$default$6());
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        this.priceTav = new PreCreationViewPoolDelegate(context5, N.b(TextAtomV2View.class), new HotelsScrollPriceCalendarV2ItemView$special$$inlined$preCreationViewPool$default$7(this), new HotelsScrollPriceCalendarV2ItemView$special$$inlined$preCreationViewPool$default$8());
        RoundedShimmerView roundedShimmerView = new RoundedShimmerView(context, null, 0, 0, 14, null);
        roundedShimmerView.setId(R$id.hotelsScrollPriceCalendarV2PriceShimmer);
        ConstraintLayout.b bVar = new ConstraintLayout.b(ResourceExtKt.toPx(70, context), ResourceExtKt.toPx(20, context));
        bVar.setMarginStart(px2);
        bVar.setMarginEnd(px2);
        ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = px;
        roundedShimmerView.setLayoutParams(bVar);
        roundedShimmerView.setCornerRadius(ResourceExtKt.toPxF(4, context));
        this.priceShimmer = roundedShimmerView;
        setClipChildren(false);
        addViews();
        setupConstraints();
    }

    private final void addViews() {
        addView(getBadgeView());
        addView(getWeekdaysIntervalTav());
        addView(getDateIntervalTav());
        addView(getPriceTav());
        addView(this.priceShimmer);
    }

    private final void bindPrice(HotelsScrollPriceCalendarV2VI.DatePriceItem item) {
        if (item.getIsLoading()) {
            ViewExtKt.show(this.priceShimmer);
            ViewExtKt.gone(getPriceTav());
        } else {
            TextHolderKt.bindOrGone$default(getPriceTav(), item.getPrice(), null, 2, null);
            ViewExtKt.gone(this.priceShimmer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BadgeView getBadgeView() {
        return (BadgeView) this.badgeView.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomV2View getDateIntervalTav() {
        return (TextAtomV2View) this.dateIntervalTav.getValue(this, $$delegatedProperties[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomV2View getPriceTav() {
        return (TextAtomV2View) this.priceTav.getValue(this, $$delegatedProperties[3]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomV2View getWeekdaysIntervalTav() {
        return (TextAtomV2View) this.weekdaysIntervalTav.getValue(this, $$delegatedProperties[1]);
    }

    private final void setupConstraints() {
        ConstraintLayoutExtKt.updateConstraints(this, new HotelsScrollPriceCalendarV2ItemView$setupConstraints$1(this));
    }

    public final void bind(@NotNull HotelsScrollPriceCalendarV2VI.DatePriceItem item, @NotNull HotelsScrollPriceCalendarV2ItemViewBackgroundProducer itemBackgroundProducer) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(itemBackgroundProducer, "itemBackgroundProducer");
        setBackground(itemBackgroundProducer.produce(item.getBackground()));
        bindPrice(item);
        BadgeHolderKt.bindOrGone$default(getBadgeView(), item.getBadge(), (Function1) null, 2, (Object) null);
        TextHolderKt.bind$default(getWeekdaysIntervalTav(), item.getWeekdaysInterval(), null, 2, null);
        TextHolderKt.bind$default(getDateIntervalTav(), item.getDateInterval(), null, 2, null);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        MeasureExtKt.measureUnspecified(getWeekdaysIntervalTav());
        MeasureExtKt.measureUnspecified(getDateIntervalTav());
        MeasureExtKt.measureUnspecified(getPriceTav());
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(a.c(new int[]{getWeekdaysIntervalTav().getMeasuredWidth(), getDateIntervalTav().getMeasuredWidth(), getPriceTav().getMeasuredWidth()}, this.minWidth), 1073741824), heightMeasureSpec);
    }
}
