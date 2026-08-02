package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.view;

import Ae.C;
import Ae.C2399j;
import Ae.C2408n0;
import Ne0.e;
import Sc.InterfaceC4008j;
import Wc.a;
import android.content.Context;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.H;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.map.R$id;
import ru.ozon.app.android.travel.feature.hotels.map.shared.data.MapExtKt;
import ru.ozon.app.android.travel.feature.hotels.map.shared.presentation.animations.ShowDirection;
import ru.ozon.app.android.travel.feature.hotels.map.shared.presentation.animations.SlideAnimationController;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.analytics.ViewedCardInfo;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.cards.CardsAdapter;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.cards.CardsDecoration;
import ru.ozon.app.android.travel.map.storage.TravelGeoProvidersStorage;
import ru.ozon.app.android.travel.utils.extensions.ViewExtensionsKt;
import ru.ozon.app.android.travel.utils.utils.OnSnapPositionChangeListener;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.mapsdk.OzonMapView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ve0.b;
import we0.m;

@Metadata(d1 = {"\u0000¹\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001Z\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0011¢\u0006\u0004\b\u0013\u0010\u0014J2\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0019H\u0086@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010\"\u001a\u00020\u00072\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\u0011¢\u0006\u0004\b\"\u0010#J!\u0010'\u001a\u00020\u00072\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00070$¢\u0006\u0004\b'\u0010(J'\u0010+\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\f2\u0010\b\u0002\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0011¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\u0007¢\u0006\u0004\b-\u0010\tJ\u000f\u0010/\u001a\u0004\u0018\u00010.¢\u0006\u0004\b/\u00100J\u0015\u00102\u001a\u00020\u00072\u0006\u00101\u001a\u00020.¢\u0006\u0004\b2\u00103J#\u00107\u001a\u00020\u00072\u0006\u00105\u001a\u0002042\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u00070\u0011¢\u0006\u0004\b7\u00108J\u0015\u0010;\u001a\u00020\u00072\u0006\u0010:\u001a\u000209¢\u0006\u0004\b;\u0010<J\u0015\u0010=\u001a\u00020\u00072\u0006\u0010:\u001a\u000209¢\u0006\u0004\b=\u0010<J\u0015\u0010>\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\f¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\u0007H\u0002¢\u0006\u0004\b@\u0010\tR\u0014\u0010A\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010C\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010BR\u0014\u0010D\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010BR\u0014\u0010E\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010BR\u0014\u0010F\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010BR\u0016\u0010G\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010BR\u0014\u0010I\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u001e\u0010K\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010N\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0018\u0010P\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR$\u0010R\u001a\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u0007\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010U\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010X\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010[\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010^\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010a\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u001b\u0010h\u001a\u00020c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010gR\u0018\u0010i\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010l\u001a\u00020k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0011\u00105\u001a\u0002048F¢\u0006\u0006\u001a\u0004\bn\u0010o¨\u0006p"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/view/HotelsMapInfoV4View;", "Landroid/widget/FrameLayout;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "onStart", "()V", "onStop", "onDestroy", "", "isControllerNull", "()Z", "Landroidx/lifecycle/v;", "lifecycle", "Lkotlin/Function0;", "onMapControllerReady", "setupMap", "(Landroidx/lifecycle/v;Lkotlin/jvm/functions/Function0;)V", "Lru/ozon/app/android/travel/map/storage/TravelGeoProvidersStorage;", "storage", "Lwe0/m;", "locationPoint", "", "miniAppName", "initMap", "(Lru/ozon/app/android/travel/map/storage/TravelGeoProvidersStorage;Lwe0/m;Landroid/content/Context;Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/cards/CardsAdapter;", "adapter", "setupCardsRv", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/cards/CardsAdapter;)V", "onSwipeDown", "setOnSwipeDownListener", "(Lkotlin/jvm/functions/Function0;)V", "Lkotlin/Function1;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/analytics/ViewedCardInfo;", "onSlideCard", "setOnSlideCardListener", "(Lkotlin/jvm/functions/Function1;)V", "isVisible", "onEndAnimation", "toggleCards", "(ZLkotlin/jvm/functions/Function0;)V", "resetPositionChangeListener", "Landroid/os/Parcelable;", "saveCardsRvState", "()Landroid/os/Parcelable;", "state", "restoreCardsRvState", "(Landroid/os/Parcelable;)V", "Lve0/b;", "controller", "block", "updateActiveZone", "(Lve0/b;Lkotlin/jvm/functions/Function0;)V", "", "offset", "updateLoaderTopMargin", "(I)V", "updateBottomOffset", "toggleLoader", "(Z)V", "hideCards", "defaultCardBottomMargin", "I", "dp4", "dp8", "dp40", "dp76", "loaderTopOffset", "Lru/ozon/mapsdk/OzonMapView;", "map", "Lru/ozon/mapsdk/OzonMapView;", "onSwipeDownAction", "Lkotlin/jvm/functions/Function0;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/view/SwipeDetector;", "swipeDetector", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/view/SwipeDetector;", "cardsAdapter", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/cards/CardsAdapter;", "onSlideCardAction", "Lkotlin/jvm/functions/Function1;", "Landroidx/recyclerview/widget/x;", "snapHelper", "Landroidx/recyclerview/widget/x;", "Lru/ozon/app/android/travel/utils/utils/OnSnapPositionChangeListener;", "onPositionChangeListener", "Lru/ozon/app/android/travel/utils/utils/OnSnapPositionChangeListener;", "ru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/view/HotelsMapInfoV4View$touchListener$1", "touchListener", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/view/HotelsMapInfoV4View$touchListener$1;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "cardsLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Landroidx/recyclerview/widget/RecyclerView;", "cardsRv", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/widget/ProgressBar;", "loader$delegate", "LSc/j;", "getLoader", "()Landroid/widget/ProgressBar;", "loader", "_controller", "Lve0/b;", "Lru/ozon/app/android/travel/feature/hotels/map/shared/presentation/animations/SlideAnimationController;", "bottomCardController", "Lru/ozon/app/android/travel/feature/hotels/map/shared/presentation/animations/SlideAnimationController;", "getController", "()Lve0/b;", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsMapInfoV4View extends FrameLayout {
    private b _controller;

    @NotNull
    private final SlideAnimationController bottomCardController;
    private CardsAdapter cardsAdapter;

    @NotNull
    private final LinearLayoutManager cardsLayoutManager;

    @NotNull
    private final RecyclerView cardsRv;
    private final int defaultCardBottomMargin;
    private final int dp4;
    private final int dp40;
    private final int dp76;
    private final int dp8;

    /* renamed from: loader$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j loader;
    private int loaderTopOffset;

    @NotNull
    private final OzonMapView map;

    @NotNull
    private final OnSnapPositionChangeListener onPositionChangeListener;
    private Function1<? super ViewedCardInfo, Unit> onSlideCardAction;
    private Function0<Unit> onSwipeDownAction;

    @NotNull
    private final x snapHelper;

    @NotNull
    private final SwipeDetector swipeDetector;

    @NotNull
    private final HotelsMapInfoV4View$touchListener$1 touchListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [androidx.recyclerview.widget.RecyclerView$s, ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.view.HotelsMapInfoV4View$touchListener$1] */
    public HotelsMapInfoV4View(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.defaultCardBottomMargin = UiExtKt.toPx(20, context);
        this.dp4 = UiExtKt.toPx(4, context);
        int px = UiExtKt.toPx(8, context);
        this.dp8 = px;
        this.dp40 = UiExtKt.toPx(40, context);
        int px2 = UiExtKt.toPx(76, context);
        this.dp76 = px2;
        this.loaderTopOffset = px2;
        OzonMapView ozonMapView = new OzonMapView(context, null, 6);
        ozonMapView.setId(R$id.hotelsMapInfoV4Map);
        ozonMapView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(ozonMapView);
        this.map = ozonMapView;
        this.swipeDetector = new SwipeDetector(context, new HotelsMapInfoV4View$swipeDetector$1(this));
        x xVar = new x();
        this.snapHelper = xVar;
        this.onPositionChangeListener = new OnSnapPositionChangeListener(xVar, 0, new HotelsMapInfoV4View$onPositionChangeListener$1(this), 2, null);
        ?? r12 = new RecyclerView.y() { // from class: ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.view.HotelsMapInfoV4View$touchListener$1
            private Float startEventX;
            private Float startEventY;

            @Override // androidx.recyclerview.widget.RecyclerView.s
            public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent event) {
                SwipeDetector swipeDetector;
                Intrinsics.checkNotNullParameter(rv, "rv");
                Intrinsics.checkNotNullParameter(event, "event");
                int action = event.getAction();
                if (action == 0) {
                    this.startEventX = Float.valueOf(event.getX());
                    this.startEventY = Float.valueOf(event.getY());
                    return false;
                }
                if (action != 1) {
                    return false;
                }
                swipeDetector = HotelsMapInfoV4View.this.swipeDetector;
                return swipeDetector.detectSwipeDown(this.startEventX, this.startEventY, event.getX(), event.getY());
            }
        };
        this.touchListener = r12;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 0, false);
        this.cardsLayoutManager = linearLayoutManager;
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(R$id.hotelsMapInfoV4CardsRv);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, UiExtKt.toPx(132, context));
        layoutParams.gravity = 80;
        layoutParams.bottomMargin = px;
        recyclerView.setLayoutParams(layoutParams);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.addItemDecoration(new CardsDecoration(context));
        recyclerView.setItemAnimator(null);
        recyclerView.setClipChildren(false);
        recyclerView.setClipToPadding(false);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.addOnItemTouchListener(r12);
        xVar.attachToRecyclerView(recyclerView);
        addView(recyclerView);
        this.cardsRv = recyclerView;
        this.loader = LazyUtilsKt.unsafeLazy(new HotelsMapInfoV4View$loader$2(context, this));
        this.bottomCardController = new SlideAnimationController(recyclerView, ShowDirection.UP);
    }

    private final ProgressBar getLoader() {
        return (ProgressBar) this.loader.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideCards() {
        this.bottomCardController.toggleView(false, new HotelsMapInfoV4View$hideCards$1(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void toggleCards$default(HotelsMapInfoV4View hotelsMapInfoV4View, boolean z11, Function0 function0, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function0 = null;
        }
        hotelsMapInfoV4View.toggleCards(z11, function0);
    }

    @NotNull
    public final b getController() {
        b bVar = this._controller;
        if (bVar != null) {
            return bVar;
        }
        throw new IllegalStateException("You must call setupMap before using");
    }

    public final Object initMap(@NotNull TravelGeoProvidersStorage travelGeoProvidersStorage, m mVar, @NotNull Context context, @NotNull String str, @NotNull d<? super Unit> dVar) {
        Object initMapForTravel = MapExtKt.initMapForTravel(this.map, travelGeoProvidersStorage, mVar, context, str, new e.b(), dVar);
        return initMapForTravel == a.COROUTINE_SUSPENDED ? initMapForTravel : Unit.f71690a;
    }

    public final boolean isControllerNull() {
        return this._controller == null;
    }

    public void onDestroy() {
        this.cardsRv.removeOnScrollListener(this.onPositionChangeListener);
        b bVar = this._controller;
        if (bVar != null) {
            bVar.onDestroy();
        }
        this._controller = null;
    }

    public void onStart() {
        b bVar = this._controller;
        if (bVar != null) {
            bVar.onStart();
        }
    }

    public void onStop() {
        b bVar = this._controller;
        if (bVar != null) {
            bVar.onStop();
        }
        this.bottomCardController.cancelAnimation();
    }

    public final void resetPositionChangeListener() {
        this.onPositionChangeListener.resetPosition();
    }

    public final void restoreCardsRvState(@NotNull Parcelable state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.cardsLayoutManager.onRestoreInstanceState(state);
    }

    public final Parcelable saveCardsRvState() {
        return this.cardsLayoutManager.onSaveInstanceState();
    }

    public final void setOnSlideCardListener(@NotNull Function1<? super ViewedCardInfo, Unit> onSlideCard) {
        Intrinsics.checkNotNullParameter(onSlideCard, "onSlideCard");
        this.onSlideCardAction = onSlideCard;
    }

    public final void setOnSwipeDownListener(@NotNull Function0<Unit> onSwipeDown) {
        Intrinsics.checkNotNullParameter(onSwipeDown, "onSwipeDown");
        this.onSwipeDownAction = onSwipeDown;
    }

    public final void setupCardsRv(@NotNull CardsAdapter adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.cardsAdapter = adapter;
        this.cardsRv.setAdapter(adapter);
        this.cardsRv.addOnScrollListener(this.onPositionChangeListener);
    }

    public final void setupMap(@NotNull AbstractC5434v lifecycle, @NotNull Function0<Unit> onMapControllerReady) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(onMapControllerReady, "onMapControllerReady");
        C2399j.C(new C(new C2408n0(this.map.h(), new HotelsMapInfoV4View$setupMap$1(this, onMapControllerReady, null)), new HotelsMapInfoV4View$setupMap$2(null)), H.a(lifecycle));
    }

    public final void toggleCards(boolean isVisible, Function0<Unit> onEndAnimation) {
        this.bottomCardController.toggleView(isVisible, new HotelsMapInfoV4View$toggleCards$1(onEndAnimation));
    }

    public final void toggleLoader(boolean isVisible) {
        getLoader().setVisibility(isVisible ? 0 : 8);
    }

    public final void updateActiveZone(@NotNull final b controller, @NotNull final Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(block, "block");
        OzonMapView ozonMapView = this.map;
        if (!ozonMapView.isLaidOut() || ozonMapView.isLayoutRequested()) {
            ozonMapView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.view.HotelsMapInfoV4View$updateActiveZone$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    MapExtKt.updateActiveZone(HotelsMapInfoV4View.this.map, controller);
                    block.invoke();
                }
            });
        } else {
            MapExtKt.updateActiveZone(this.map, controller);
            block.invoke();
        }
    }

    public final void updateBottomOffset(int offset) {
        ViewExtensionsKt.safeUpdateMargins$default(this.cardsRv, null, Integer.valueOf(offset == 0 ? this.defaultCardBottomMargin : offset + this.dp8), null, null, 13, null);
    }

    public final void updateLoaderTopMargin(int offset) {
        this.loaderTopOffset = this.dp76 + offset;
    }
}
