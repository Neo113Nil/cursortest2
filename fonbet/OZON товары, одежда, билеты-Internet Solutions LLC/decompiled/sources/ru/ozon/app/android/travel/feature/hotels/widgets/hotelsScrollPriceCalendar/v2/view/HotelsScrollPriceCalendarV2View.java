package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsScrollPriceCalendar.v2.view;

import Am.C2438a;
import HS.a;
import android.content.Context;
import android.os.Parcelable;
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
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsScrollPriceCalendar.v2.presentation.HotelsScrollPriceCalendarV2VI;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsScrollPriceCalendar.v2.presentation.adapter.HotelsScrollPriceCalendarV2Adapter;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsScrollPriceCalendar.v2.presentation.adapter.HotelsScrollPriceCalendarV2ItemDecoration;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00060\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0019\u0010\fJ\u0017\u0010\u001a\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u001a\u0010\fR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010-\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/view/HotelsScrollPriceCalendarV2View;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "addViews", "()V", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/presentation/HotelsScrollPriceCalendarV2VI;", "boundData", "saveLayoutManagerState", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/presentation/HotelsScrollPriceCalendarV2VI;)V", "restoreLayoutManagerState", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/presentation/HotelsScrollPriceCalendarV2VI$State;", "item", "bind", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/presentation/HotelsScrollPriceCalendarV2VI$State;)V", "Landroidx/lifecycle/J;", "lifecycleOwner", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "setupAdapter", "(Landroidx/lifecycle/J;Lkotlin/jvm/functions/Function1;)V", "onAttach", "onDetach", "", "dp16", "I", "rightOffset", "scrollOffset", "Landroidx/recyclerview/widget/LinearLayoutManager;", "priceRvLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleTav$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "getTitleTav", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleTav", "Landroidx/recyclerview/widget/RecyclerView;", "priceRV", "Landroidx/recyclerview/widget/RecyclerView;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/presentation/adapter/HotelsScrollPriceCalendarV2Adapter;", "listAdapter", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/presentation/adapter/HotelsScrollPriceCalendarV2Adapter;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsScrollPriceCalendarV2View extends LinearLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(HotelsScrollPriceCalendarV2View.class, "titleTav", "getTitleTav()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0)};
    public static final int $stable = 8;
    private final int dp16;
    private HotelsScrollPriceCalendarV2Adapter listAdapter;

    @NotNull
    private final RecyclerView priceRV;

    @NotNull
    private final LinearLayoutManager priceRvLayoutManager;
    private final int rightOffset;
    private final int scrollOffset;

    /* renamed from: titleTav$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate titleTav;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelsScrollPriceCalendarV2View(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(16, context);
        this.dp16 = px;
        int px2 = ResourceExtKt.toPx(8, context);
        this.rightOffset = px2;
        this.scrollOffset = ResourceExtKt.toPx(50, context);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 0, false);
        this.priceRvLayoutManager = linearLayoutManager;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.titleTav = new PreCreationViewPoolDelegate(context2, N.b(TextAtomV2View.class), new HotelsScrollPriceCalendarV2View$special$$inlined$preCreationViewPool$default$1(this), new HotelsScrollPriceCalendarV2View$special$$inlined$preCreationViewPool$default$2());
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setPadding(px, 0, px, px);
        recyclerView.addItemDecoration(new HotelsScrollPriceCalendarV2ItemDecoration(px2));
        recyclerView.setClipToPadding(false);
        recyclerView.setClipChildren(false);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setItemAnimator(null);
        recyclerView.setOverScrollMode(2);
        this.priceRV = recyclerView;
        setOrientation(1);
        setClipChildren(false);
        addViews();
    }

    private final void addViews() {
        addView(getTitleTav());
        addView(this.priceRV);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$3(HotelsScrollPriceCalendarV2VI.State state, HotelsScrollPriceCalendarV2View hotelsScrollPriceCalendarV2View) {
        Integer autoScrollIndex = state.getAutoScrollIndex();
        if (autoScrollIndex != null) {
            hotelsScrollPriceCalendarV2View.priceRvLayoutManager.scrollToPositionWithOffset(autoScrollIndex.intValue(), hotelsScrollPriceCalendarV2View.scrollOffset);
        }
    }

    private final TextAtomV2View getTitleTav() {
        return (TextAtomV2View) this.titleTav.getValue(this, $$delegatedProperties[0]);
    }

    private final void restoreLayoutManagerState(HotelsScrollPriceCalendarV2VI boundData) {
        Parcelable scrollState;
        if (boundData == null || (scrollState = boundData.getScrollState()) == null) {
            return;
        }
        this.priceRvLayoutManager.onRestoreInstanceState(scrollState);
        boundData.setScrollState(null);
    }

    private final void saveLayoutManagerState(HotelsScrollPriceCalendarV2VI boundData) {
        if (boundData == null || boundData.getScrollState() != null) {
            return;
        }
        boundData.setScrollState(this.priceRvLayoutManager.onSaveInstanceState());
    }

    public final void bind(@NotNull HotelsScrollPriceCalendarV2VI.State item) {
        Intrinsics.checkNotNullParameter(item, "item");
        TextHolderKt.bindOrGone$default(getTitleTav(), item.getTitle(), null, 2, null);
        HotelsScrollPriceCalendarV2Adapter hotelsScrollPriceCalendarV2Adapter = this.listAdapter;
        if (hotelsScrollPriceCalendarV2Adapter != null) {
            hotelsScrollPriceCalendarV2Adapter.submitList(item.getDatePrices(), new a(0, item, this));
        }
    }

    public final void onAttach(HotelsScrollPriceCalendarV2VI boundData) {
        restoreLayoutManagerState(boundData);
    }

    public final void onDetach(HotelsScrollPriceCalendarV2VI boundData) {
        saveLayoutManagerState(boundData);
    }

    public final void setupAdapter(@NotNull J lifecycleOwner, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        HotelsScrollPriceCalendarV2Adapter hotelsScrollPriceCalendarV2Adapter = new HotelsScrollPriceCalendarV2Adapter(lifecycleOwner, actionHandler);
        this.listAdapter = hotelsScrollPriceCalendarV2Adapter;
        this.priceRV.setAdapter(hotelsScrollPriceCalendarV2Adapter);
    }
}
