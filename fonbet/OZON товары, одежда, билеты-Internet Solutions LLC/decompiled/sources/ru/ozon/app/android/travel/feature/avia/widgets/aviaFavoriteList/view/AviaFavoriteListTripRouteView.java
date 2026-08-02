package ru.ozon.app.android.travel.feature.avia.widgets.aviaFavoriteList.view;

import Am.C2438a;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaFavoriteList.presentation.AviaFavoriteListFlightVI;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaFavoriteList.view.adapter.AviaFavoriteListTripRouteAdapter;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.app.android.travel.utils.ds.DesignSystemDimensProvider;
import ru.ozon.app.android.travel.utils.ds.DesignSystemDimensProviderKt;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u000e\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$J\u0010\u0010%\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$J\b\u0010&\u001a\u00020\"H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0011\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0014\u0010\rR\u001b\u0010\u0016\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u000f\u001a\u0004\b\u0017\u0010\rR\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaFavoriteList/view/AviaFavoriteListTripRouteView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dsProvider", "Lru/ozon/app/android/travel/utils/ds/DesignSystemDimensProvider;", "transferAdapter", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaFavoriteList/view/adapter/AviaFavoriteListTripRouteAdapter;", "tripTimeTAV", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getTripTimeTAV", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "tripTimeTAV$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "tripDurationTAV", "getTripDurationTAV", "tripDurationTAV$delegate", "routeInfoTAV", "getRouteInfoTAV", "routeInfoTAV$delegate", "timeDifferenceTAV", "getTimeDifferenceTAV", "timeDifferenceTAV$delegate", "transfersRV", "Landroidx/recyclerview/widget/RecyclerView;", "barrierB", "Landroidx/constraintlayout/widget/Barrier;", "onInterceptTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "bind", "", "item", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaFavoriteList/presentation/AviaFavoriteListFlightVI$TripRouteVI;", "bindOrGone", "setConstraints", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaFavoriteListTripRouteView extends ConstraintLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(AviaFavoriteListTripRouteView.class, "tripTimeTAV", "getTripTimeTAV()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(AviaFavoriteListTripRouteView.class, "tripDurationTAV", "getTripDurationTAV()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(AviaFavoriteListTripRouteView.class, "routeInfoTAV", "getRouteInfoTAV()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(AviaFavoriteListTripRouteView.class, "timeDifferenceTAV", "getTimeDifferenceTAV()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0)};
    public static final int $stable = 8;

    @NotNull
    private final Barrier barrierB;

    @NotNull
    private final DesignSystemDimensProvider dsProvider;

    /* renamed from: routeInfoTAV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate routeInfoTAV;

    /* renamed from: timeDifferenceTAV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate timeDifferenceTAV;

    @NotNull
    private final AviaFavoriteListTripRouteAdapter transferAdapter;

    @NotNull
    private final RecyclerView transfersRV;

    /* renamed from: tripDurationTAV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate tripDurationTAV;

    /* renamed from: tripTimeTAV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate tripTimeTAV;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AviaFavoriteListTripRouteView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dsProvider = DesignSystemDimensProviderKt.dimens$default(context, null, 1, null);
        AviaFavoriteListTripRouteAdapter aviaFavoriteListTripRouteAdapter = new AviaFavoriteListTripRouteAdapter();
        this.transferAdapter = aviaFavoriteListTripRouteAdapter;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.tripTimeTAV = new PreCreationViewPoolDelegate(context2, N.b(TextAtomV2View.class), new AviaFavoriteListTripRouteView$special$$inlined$preCreationViewPool$default$1(this), new AviaFavoriteListTripRouteView$special$$inlined$preCreationViewPool$default$2());
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.tripDurationTAV = new PreCreationViewPoolDelegate(context3, N.b(TextAtomV2View.class), new AviaFavoriteListTripRouteView$special$$inlined$preCreationViewPool$default$3(this), new AviaFavoriteListTripRouteView$special$$inlined$preCreationViewPool$default$4());
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        this.routeInfoTAV = new PreCreationViewPoolDelegate(context4, N.b(TextAtomV2View.class), new AviaFavoriteListTripRouteView$special$$inlined$preCreationViewPool$default$5(this), new AviaFavoriteListTripRouteView$special$$inlined$preCreationViewPool$default$6());
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        this.timeDifferenceTAV = new PreCreationViewPoolDelegate(context5, N.b(TextAtomV2View.class), new AviaFavoriteListTripRouteView$special$$inlined$preCreationViewPool$default$7(this), new AviaFavoriteListTripRouteView$special$$inlined$preCreationViewPool$default$8());
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(View.generateViewId());
        recyclerView.setItemAnimator(null);
        recyclerView.setLayoutParams(new ConstraintLayout.b(0, -2));
        recyclerView.setAdapter(aviaFavoriteListTripRouteAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, true));
        recyclerView.setNestedScrollingEnabled(false);
        this.transfersRV = recyclerView;
        Barrier barrier = new Barrier(context);
        barrier.f(6);
        barrier.setId(View.generateViewId());
        barrier.setReferencedIds(new int[]{getTripTimeTAV().getId(), getRouteInfoTAV().getId(), getTimeDifferenceTAV().getId()});
        this.barrierB = barrier;
        addView(getTripTimeTAV());
        addView(getTripDurationTAV());
        addView(getRouteInfoTAV());
        addView(recyclerView);
        addView(barrier);
        addView(getTimeDifferenceTAV());
        setConstraints();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomV2View getRouteInfoTAV() {
        return (TextAtomV2View) this.routeInfoTAV.getValue(this, $$delegatedProperties[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomV2View getTimeDifferenceTAV() {
        return (TextAtomV2View) this.timeDifferenceTAV.getValue(this, $$delegatedProperties[3]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomV2View getTripDurationTAV() {
        return (TextAtomV2View) this.tripDurationTAV.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomV2View getTripTimeTAV() {
        return (TextAtomV2View) this.tripTimeTAV.getValue(this, $$delegatedProperties[0]);
    }

    private final void setConstraints() {
        ConstraintLayoutExtensionsKt.applyConstraint(this, new AviaFavoriteListTripRouteView$setConstraints$1(this));
    }

    public final void bind(@NotNull AviaFavoriteListFlightVI.TripRouteVI item) {
        Intrinsics.checkNotNullParameter(item, "item");
        TextHolderKt.bind$default(getTripTimeTAV(), item.getTripTime(), null, 2, null);
        TextHolderKt.bind$default(getTripDurationTAV(), item.getTripDuration(), null, 2, null);
        TextHolderKt.bind$default(getRouteInfoTAV(), item.getRouteInfo(), null, 2, null);
        TextHolderKt.bindOrGone$default(getTimeDifferenceTAV(), item.getTimeDifference(), null, 2, null);
        this.transferAdapter.submitList(item.getTransfers());
    }

    public final void bindOrGone(AviaFavoriteListFlightVI.TripRouteVI item) {
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
}
