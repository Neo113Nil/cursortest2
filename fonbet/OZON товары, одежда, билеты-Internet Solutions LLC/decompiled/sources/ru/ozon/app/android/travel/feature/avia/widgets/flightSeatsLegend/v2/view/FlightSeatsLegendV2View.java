package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsLegend.v2.view;

import Am.C2438a;
import android.content.Context;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsLegend.v2.presentation.FlightSeatsLegendV2VI;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsLegend.v2.view.adapter.FlightSeatsLegendV2ItemDecoration;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsLegend.v2.view.adapter.FlightSeatsLegendV2SeatTypeAdapter;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\b\u0010\u0018\u001a\u00020\u0015H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsLegend/v2/view/FlightSeatsLegendV2View;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp8", "", "dp16", "backgroundColor", "seatsAdapter", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsLegend/v2/view/adapter/FlightSeatsLegendV2SeatTypeAdapter;", "titleTav", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getTitleTav", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleTav$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "seatTypesRV", "Landroidx/recyclerview/widget/RecyclerView;", "bind", "", "item", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsLegend/v2/presentation/FlightSeatsLegendV2VI;", "addViews", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlightSeatsLegendV2View extends LinearLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(FlightSeatsLegendV2View.class, "titleTav", "getTitleTav()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0)};
    public static final int $stable = 8;
    private final int backgroundColor;
    private final int dp16;
    private final int dp8;

    @NotNull
    private final RecyclerView seatTypesRV;

    @NotNull
    private final FlightSeatsLegendV2SeatTypeAdapter seatsAdapter;

    /* renamed from: titleTav$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate titleTav;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlightSeatsLegendV2View(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(8, context);
        this.dp8 = px;
        int px2 = ResourceExtKt.toPx(16, context);
        this.dp16 = px2;
        int themeColor = ThemeExtKt.themeColor(context, R$attr.layerFloor1);
        this.backgroundColor = themeColor;
        FlightSeatsLegendV2SeatTypeAdapter flightSeatsLegendV2SeatTypeAdapter = new FlightSeatsLegendV2SeatTypeAdapter();
        this.seatsAdapter = flightSeatsLegendV2SeatTypeAdapter;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.titleTav = new PreCreationViewPoolDelegate(context2, N.b(TextAtomV2View.class), new FlightSeatsLegendV2View$special$$inlined$preCreationViewPool$default$1(this), new FlightSeatsLegendV2View$special$$inlined$preCreationViewPool$default$2(this));
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        recyclerView.addItemDecoration(new FlightSeatsLegendV2ItemDecoration(px));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setItemAnimator(null);
        this.seatTypesRV = recyclerView;
        setPadding(px2, 0, px2, px2);
        setOrientation(1);
        addViews();
        recyclerView.setAdapter(flightSeatsLegendV2SeatTypeAdapter);
        setBackgroundColor(themeColor);
    }

    private final void addViews() {
        addView(getTitleTav());
        addView(this.seatTypesRV);
    }

    private final TextAtomV2View getTitleTav() {
        return (TextAtomV2View) this.titleTav.getValue(this, $$delegatedProperties[0]);
    }

    public final void bind(@NotNull FlightSeatsLegendV2VI item) {
        Intrinsics.checkNotNullParameter(item, "item");
        TextHolderKt.bindOrGone$default(getTitleTav(), item.getTitle(), null, 2, null);
        this.seatsAdapter.submitList(item.getSeatTypes());
    }
}
