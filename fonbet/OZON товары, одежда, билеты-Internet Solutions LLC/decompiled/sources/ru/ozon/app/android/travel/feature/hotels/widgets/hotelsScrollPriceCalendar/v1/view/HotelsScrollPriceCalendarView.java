package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsScrollPriceCalendar.v1.view;

import Am.C2438a;
import B.d;
import android.content.Context;
import android.widget.LinearLayout;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsScrollPriceCalendar.v1.presentation.HotelsScrollPriceCalendarVO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsScrollPriceCalendar.v1.presentation.adapter.HotelsScrollPriceCalendarAdapter;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsScrollPriceCalendar.v1.presentation.adapter.HotelsScrollPriceCalendarItemDecoration;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsScrollPriceCalendar.v1.presentation.adapter.HotelsScrollPriceLeftCenteredScroller;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v1/view/HotelsScrollPriceCalendarView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "addViews", "()V", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v1/presentation/HotelsScrollPriceCalendarVO;", "item", "bind", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v1/presentation/HotelsScrollPriceCalendarVO;)V", "Landroidx/lifecycle/J;", "lifecycleOwner", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "setupAdapter", "(Landroidx/lifecycle/J;Lkotlin/jvm/functions/Function1;)V", "", "dp16", "I", "rightOffset", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleTav$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "getTitleTav", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleTav", "Landroidx/recyclerview/widget/RecyclerView;", "priceRV", "Landroidx/recyclerview/widget/RecyclerView;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v1/presentation/adapter/HotelsScrollPriceCalendarAdapter;", "listAdapter", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v1/presentation/adapter/HotelsScrollPriceCalendarAdapter;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsScrollPriceCalendarView extends LinearLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(HotelsScrollPriceCalendarView.class, "titleTav", "getTitleTav()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0)};
    public static final int $stable = 8;
    private final int dp16;
    private HotelsScrollPriceCalendarAdapter listAdapter;

    @NotNull
    private final RecyclerView priceRV;
    private final int rightOffset;

    /* renamed from: titleTav$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate titleTav;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelsScrollPriceCalendarView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(16, context);
        this.dp16 = px;
        int px2 = ResourceExtKt.toPx(8, context);
        this.rightOffset = px2;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.titleTav = new PreCreationViewPoolDelegate(context2, N.b(TextAtomV2View.class), new HotelsScrollPriceCalendarView$special$$inlined$preCreationViewPool$default$1(this), new HotelsScrollPriceCalendarView$special$$inlined$preCreationViewPool$default$2());
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        recyclerView.setPadding(px, 0, px, px);
        recyclerView.addItemDecoration(new HotelsScrollPriceCalendarItemDecoration(px2));
        recyclerView.setClipToPadding(false);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setItemAnimator(null);
        this.priceRV = recyclerView;
        setOrientation(1);
        addViews();
    }

    private final void addViews() {
        addView(getTitleTav());
        addView(this.priceRV);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$3(HotelsScrollPriceCalendarVO hotelsScrollPriceCalendarVO, HotelsScrollPriceCalendarView hotelsScrollPriceCalendarView) {
        Integer autoScrollIndex = hotelsScrollPriceCalendarVO.getAutoScrollIndex();
        if (autoScrollIndex != null) {
            int intValue = autoScrollIndex.intValue();
            Context context = hotelsScrollPriceCalendarView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            HotelsScrollPriceLeftCenteredScroller hotelsScrollPriceLeftCenteredScroller = new HotelsScrollPriceLeftCenteredScroller(context, hotelsScrollPriceCalendarView.rightOffset / 2);
            hotelsScrollPriceLeftCenteredScroller.setTargetPosition(intValue);
            RecyclerView.o layoutManager = hotelsScrollPriceCalendarView.priceRV.getLayoutManager();
            if (layoutManager != null) {
                layoutManager.startSmoothScroll(hotelsScrollPriceLeftCenteredScroller);
            }
        }
    }

    private final TextAtomV2View getTitleTav() {
        return (TextAtomV2View) this.titleTav.getValue(this, $$delegatedProperties[0]);
    }

    public final void bind(@NotNull HotelsScrollPriceCalendarVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        TextHolderKt.bindOrGone$default(getTitleTav(), item.getTitle(), null, 2, null);
        HotelsScrollPriceCalendarAdapter hotelsScrollPriceCalendarAdapter = this.listAdapter;
        if (hotelsScrollPriceCalendarAdapter != null) {
            hotelsScrollPriceCalendarAdapter.submitList(item.getDatePrices(), new d(1, item, this));
        }
    }

    public final void setupAdapter(@NotNull J lifecycleOwner, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        HotelsScrollPriceCalendarAdapter hotelsScrollPriceCalendarAdapter = new HotelsScrollPriceCalendarAdapter(lifecycleOwner, actionHandler);
        this.listAdapter = hotelsScrollPriceCalendarAdapter;
        this.priceRV.setAdapter(hotelsScrollPriceCalendarAdapter);
    }
}
