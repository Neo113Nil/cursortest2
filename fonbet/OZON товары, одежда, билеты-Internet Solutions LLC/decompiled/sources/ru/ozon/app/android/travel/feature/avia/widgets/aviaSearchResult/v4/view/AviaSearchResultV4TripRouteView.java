package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.view;

import Bi.b;
import Lc.a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.R$id;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.vo.AviaSearchResultV4FlightVO;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.view.adapter.AviaSearchResultV4TripRouteAdapter;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0016\u0010\u0015J\u0015\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010$R\u0014\u0010&\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010$R\u0014\u0010'\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010$R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/view/AviaSearchResultV4TripRouteView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "setConstraints", "()V", "Landroid/view/MotionEvent;", "ev", "", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4FlightVO$TripRoute;", "item", "bind", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4FlightVO$TripRoute;)V", "bindOrGone", "Landroidx/recyclerview/widget/RecyclerView$u;", "recycledViewPool", "setRecycledViewPool", "(Landroidx/recyclerview/widget/RecyclerView$u;)V", "dp2", "I", "dp4", "dp8", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/view/adapter/AviaSearchResultV4TripRouteAdapter;", "transferAdapter", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/view/adapter/AviaSearchResultV4TripRouteAdapter;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "tripTimeTAV", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "tripDurationTAV", "routeInfoTAV", "timeDifferenceTAV", "Landroidx/recyclerview/widget/RecyclerView;", "transfersRV", "Landroidx/recyclerview/widget/RecyclerView;", "Landroidx/constraintlayout/widget/Barrier;", "barrierB", "Landroidx/constraintlayout/widget/Barrier;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaSearchResultV4TripRouteView extends ConstraintLayout {

    @NotNull
    private final Barrier barrierB;
    private final int dp2;
    private final int dp4;
    private final int dp8;

    @NotNull
    private final TextAtomV2View routeInfoTAV;

    @NotNull
    private final TextAtomV2View timeDifferenceTAV;

    @NotNull
    private final AviaSearchResultV4TripRouteAdapter transferAdapter;

    @NotNull
    private final RecyclerView transfersRV;

    @NotNull
    private final TextAtomV2View tripDurationTAV;

    @NotNull
    private final TextAtomV2View tripTimeTAV;

    public /* synthetic */ AviaSearchResultV4TripRouteView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void setConstraints() {
        ConstraintLayoutExtensionsKt.applyConstraint(this, new AviaSearchResultV4TripRouteView$setConstraints$1(this));
    }

    public final void bind(@NotNull AviaSearchResultV4FlightVO.TripRoute item) {
        Intrinsics.checkNotNullParameter(item, "item");
        TextHolderKt.bind$default(this.tripTimeTAV, item.getTripTime(), null, 2, null);
        TextHolderKt.bind$default(this.tripDurationTAV, item.getTripDuration(), null, 2, null);
        TextHolderKt.bind$default(this.routeInfoTAV, item.getRouteInfo(), null, 2, null);
        TextHolderKt.bindOrGone$default(this.timeDifferenceTAV, item.getTimeDifference(), null, 2, null);
        this.transferAdapter.setItems(item.getTransfers());
    }

    public final void bindOrGone(AviaSearchResultV4FlightVO.TripRoute item) {
        if (item == null) {
            ViewExtKt.gone(this);
        } else {
            ViewExtKt.show(this);
            bind(item);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return true;
    }

    public final void setRecycledViewPool(@NotNull RecyclerView.u recycledViewPool) {
        Intrinsics.checkNotNullParameter(recycledViewPool, "recycledViewPool");
        this.transfersRV.setRecycledViewPool(recycledViewPool);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AviaSearchResultV4TripRouteView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp2 = ResourceExtKt.toPx(2, context);
        this.dp4 = ResourceExtKt.toPx(4, context);
        this.dp8 = ResourceExtKt.toPx(8, context);
        AviaSearchResultV4TripRouteAdapter aviaSearchResultV4TripRouteAdapter = new AviaSearchResultV4TripRouteAdapter();
        this.transferAdapter = aviaSearchResultV4TripRouteAdapter;
        q qVar = q.f64554a;
        TextAtomV2View textAtomV2View = (TextAtomV2View) qVar.g(N.b(TextAtomV2View.class), context);
        ConstraintLayout.b d11 = b.d(textAtomV2View, R$id.aviaSearchResultV4TripTimeTAV, -2, -2);
        d11.f41598E = 0.0f;
        d11.f41603J = 2;
        textAtomV2View.setLayoutParams(d11);
        textAtomV2View.setTextIsSelectable(false);
        this.tripTimeTAV = textAtomV2View;
        TextAtomV2View textAtomV2View2 = (TextAtomV2View) qVar.g(N.b(TextAtomV2View.class), context);
        ConstraintLayout.b d12 = b.d(textAtomV2View2, R$id.aviaSearchResultV4TripDurationTAV, -2, -2);
        d12.f41598E = 1.0f;
        d12.f41616W = true;
        textAtomV2View2.setLayoutParams(d12);
        textAtomV2View2.setTextIsSelectable(false);
        this.tripDurationTAV = textAtomV2View2;
        TextAtomV2View textAtomV2View3 = (TextAtomV2View) qVar.g(N.b(TextAtomV2View.class), context);
        a.d(textAtomV2View3, R$id.aviaSearchResultV4RouteInfoTAV, -2, -2, false);
        this.routeInfoTAV = textAtomV2View3;
        TextAtomV2View textAtomV2View4 = (TextAtomV2View) qVar.g(N.b(TextAtomV2View.class), context);
        a.d(textAtomV2View4, R$id.aviaSearchResultV4TimeDifferenceTAV, -2, -2, false);
        this.timeDifferenceTAV = textAtomV2View4;
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(R$id.aviaSearchResultV4TransfersRV);
        recyclerView.setItemAnimator(null);
        recyclerView.setLayoutParams(new ConstraintLayout.b(0, -2));
        recyclerView.setAdapter(aviaSearchResultV4TripRouteAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, true));
        recyclerView.setNestedScrollingEnabled(false);
        this.transfersRV = recyclerView;
        Barrier barrier = new Barrier(context);
        barrier.f(6);
        barrier.setId(R$id.aviaSearchResultV4BarrierB);
        barrier.setReferencedIds(new int[]{textAtomV2View.getId(), textAtomV2View3.getId(), textAtomV2View4.getId()});
        this.barrierB = barrier;
        addView(textAtomV2View);
        addView(textAtomV2View2);
        addView(textAtomV2View3);
        addView(recyclerView);
        addView(barrier);
        addView(textAtomV2View4);
        setConstraints();
    }
}
