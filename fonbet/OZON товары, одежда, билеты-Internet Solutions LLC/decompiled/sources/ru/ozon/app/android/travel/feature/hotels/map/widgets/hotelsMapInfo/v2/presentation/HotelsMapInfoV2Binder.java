package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v2.presentation;

import Sc.o;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.H;
import androidx.lifecycle.J;
import androidx.lifecycle.W;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.map.viewModel.HotelMapInfoViewModel;

@Metadata(d1 = {"\u0000c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004*\u00010\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\u0011J\u0015\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\n¢\u0006\u0004\b \u0010\u0011J\r\u0010!\u001a\u00020\n¢\u0006\u0004\b!\u0010\u0011J\u001b\u0010$\u001a\u00020\n2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\n0\"¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\u00020\n2\u0006\u0010\r\u001a\u00020&¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010+R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\b0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00010,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010.R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00063"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/presentation/HotelsMapInfoV2Binder;", "", "Lru/ozon/app/android/travel/map/viewModel/HotelMapInfoViewModel;", "viewModel", "Landroidx/lifecycle/J;", "lifecycleOwner", "<init>", "(Lru/ozon/app/android/travel/map/viewModel/HotelMapInfoViewModel;Landroidx/lifecycle/J;)V", "Lru/ozon/app/android/travel/map/viewModel/HotelMapInfoViewModel$Action;", "action", "", "actionHandler", "(Lru/ozon/app/android/travel/map/viewModel/HotelMapInfoViewModel$Action;)V", "state", "stateHandler", "(Ljava/lang/Object;)V", "handleRequestLocation", "()V", "Lru/ozon/app/android/travel/map/viewModel/HotelMapInfoViewModel$Action$LocationException;", "handleLocationException", "(Lru/ozon/app/android/travel/map/viewModel/HotelMapInfoViewModel$Action$LocationException;)V", "Lru/ozon/app/android/travel/map/viewModel/HotelMapInfoViewModel$Action$MoveToLocation;", "handleUserLocation", "(Lru/ozon/app/android/travel/map/viewModel/HotelMapInfoViewModel$Action$MoveToLocation;)V", "Lru/ozon/app/android/travel/map/viewModel/HotelMapInfoViewModel$Action$ShowBottomWidget;", "slideUpBottomWidget", "(Lru/ozon/app/android/travel/map/viewModel/HotelMapInfoViewModel$Action$ShowBottomWidget;)V", "slideDownBottomWidget", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/presentation/HotelsMapViewV2;", "view", "onWidgetCreated", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/presentation/HotelsMapViewV2;)V", "onWidgetDestroyed", "setViewLifecycle", "Lkotlin/Function0;", "onMapControllerReady", "setupMap", "(Lkotlin/jvm/functions/Function0;)V", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/presentation/HotelsMapInfoV2VO;", "mapStateHandler", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/presentation/HotelsMapInfoV2VO;)V", "Lru/ozon/app/android/travel/map/viewModel/HotelMapInfoViewModel;", "Landroidx/lifecycle/J;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/presentation/HotelsMapViewV2;", "Landroidx/lifecycle/W;", "actionObserver", "Landroidx/lifecycle/W;", "stateObserver", "ru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/presentation/HotelsMapInfoV2Binder$viewObserver$1", "viewObserver", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/presentation/HotelsMapInfoV2Binder$viewObserver$1;", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsMapInfoV2Binder {

    @NotNull
    private final W<HotelMapInfoViewModel.Action> actionObserver;

    @NotNull
    private final J lifecycleOwner;

    @NotNull
    private final W<Object> stateObserver;
    private HotelsMapViewV2 view;

    @NotNull
    private final HotelMapInfoViewModel viewModel;

    @NotNull
    private final HotelsMapInfoV2Binder$viewObserver$1 viewObserver;

    /* JADX WARN: Type inference failed for: r2v3, types: [ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v2.presentation.HotelsMapInfoV2Binder$viewObserver$1] */
    public HotelsMapInfoV2Binder(@NotNull HotelMapInfoViewModel viewModel, @NotNull J lifecycleOwner) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.viewModel = viewModel;
        this.lifecycleOwner = lifecycleOwner;
        this.actionObserver = new HotelsMapInfoV2Binder$actionObserver$1(this);
        this.stateObserver = new HotelsMapInfoV2Binder$stateObserver$1(this);
        this.viewObserver = new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v2.presentation.HotelsMapInfoV2Binder$viewObserver$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(J owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                owner.getLifecycle().e(this);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStart(J owner) {
                HotelsMapViewV2 hotelsMapViewV2;
                Intrinsics.checkNotNullParameter(owner, "owner");
                hotelsMapViewV2 = HotelsMapInfoV2Binder.this.view;
                if (hotelsMapViewV2 != null) {
                    hotelsMapViewV2.onStart();
                }
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStop(J owner) {
                HotelsMapViewV2 hotelsMapViewV2;
                Intrinsics.checkNotNullParameter(owner, "owner");
                hotelsMapViewV2 = HotelsMapInfoV2Binder.this.view;
                if (hotelsMapViewV2 != null) {
                    hotelsMapViewV2.onStop();
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void actionHandler(HotelMapInfoViewModel.Action action) {
        if (action instanceof HotelMapInfoViewModel.Action.LocationException) {
            handleLocationException((HotelMapInfoViewModel.Action.LocationException) action);
            return;
        }
        if (action instanceof HotelMapInfoViewModel.Action.MoveToLocation) {
            handleUserLocation((HotelMapInfoViewModel.Action.MoveToLocation) action);
            return;
        }
        if (action instanceof HotelMapInfoViewModel.Action.ShowBottomWidget) {
            slideUpBottomWidget((HotelMapInfoViewModel.Action.ShowBottomWidget) action);
        } else if (Intrinsics.d(action, HotelMapInfoViewModel.Action.HideBottomWidget.INSTANCE)) {
            slideDownBottomWidget();
        } else {
            if (!Intrinsics.d(action, HotelMapInfoViewModel.Action.RequestLocationPermission.INSTANCE)) {
                throw new o();
            }
            handleRequestLocation();
        }
    }

    private final void handleLocationException(HotelMapInfoViewModel.Action.LocationException action) {
        HotelsMapViewV2 hotelsMapViewV2 = this.view;
        if (hotelsMapViewV2 != null) {
            hotelsMapViewV2.showLocationDisabledRestriction(action.getException());
        }
    }

    private final void handleRequestLocation() {
        HotelsMapViewV2 hotelsMapViewV2 = this.view;
        if (hotelsMapViewV2 != null) {
            hotelsMapViewV2.requestLocationPermission(false);
        }
    }

    private final void handleUserLocation(HotelMapInfoViewModel.Action.MoveToLocation action) {
        HotelsMapViewV2 hotelsMapViewV2 = this.view;
        if (hotelsMapViewV2 != null) {
            hotelsMapViewV2.moveToUserLocation(action.getLocation());
        }
    }

    private final void slideDownBottomWidget() {
        BottomCardController bottomCardController;
        HotelsMapViewV2 hotelsMapViewV2 = this.view;
        if (hotelsMapViewV2 == null || (bottomCardController = hotelsMapViewV2.getBottomCardController()) == null) {
            return;
        }
        bottomCardController.slideDown();
    }

    private final void slideUpBottomWidget(HotelMapInfoViewModel.Action.ShowBottomWidget action) {
        BottomCardController bottomCardController;
        BottomCardController bottomCardController2;
        if (action.getIsProviderLogoOverlapped()) {
            HotelsMapViewV2 hotelsMapViewV2 = this.view;
            if (hotelsMapViewV2 == null || (bottomCardController2 = hotelsMapViewV2.getBottomCardController()) == null) {
                return;
            }
            bottomCardController2.slideUp(new HotelsMapInfoV2Binder$slideUpBottomWidget$1(this));
            return;
        }
        HotelsMapViewV2 hotelsMapViewV22 = this.view;
        if (hotelsMapViewV22 == null || (bottomCardController = hotelsMapViewV22.getBottomCardController()) == null) {
            return;
        }
        BottomCardController.slideUp$default(bottomCardController, null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stateHandler(Object state) {
        HotelsMapViewV2 hotelsMapViewV2;
        if (!(state instanceof HotelsMapInfoV2VO) || (hotelsMapViewV2 = this.view) == null) {
            return;
        }
        hotelsMapViewV2.bind((HotelsMapInfoV2VO) state);
    }

    public final void mapStateHandler(@NotNull HotelsMapInfoV2VO state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.viewModel.onNewState(state);
    }

    public final void onWidgetCreated(@NotNull HotelsMapViewV2 view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
        view.attachToContainer();
    }

    public final void onWidgetDestroyed() {
        this.viewModel.getActionLiveData().removeObserver(this.actionObserver);
        this.viewModel.getStateLiveData().removeObserver(this.stateObserver);
        this.lifecycleOwner.getLifecycle().e(this.viewObserver);
        HotelsMapViewV2 hotelsMapViewV2 = this.view;
        if (hotelsMapViewV2 != null) {
            hotelsMapViewV2.removeFromContainer();
        }
        this.view = null;
    }

    public final void setViewLifecycle() {
        HotelsMapViewV2 hotelsMapViewV2 = this.view;
        if (hotelsMapViewV2 != null) {
            hotelsMapViewV2.setOnCurrentLocationAction(new HotelsMapInfoV2Binder$setViewLifecycle$1(this.viewModel));
        }
        this.lifecycleOwner.getLifecycle().a(this.viewObserver);
        this.viewModel.getActionLiveData().observe(this.lifecycleOwner, this.actionObserver);
        this.viewModel.getStateLiveData().observe(this.lifecycleOwner, this.stateObserver);
    }

    public final void setupMap(@NotNull Function0<Unit> onMapControllerReady) {
        Intrinsics.checkNotNullParameter(onMapControllerReady, "onMapControllerReady");
        HotelsMapViewV2 hotelsMapViewV2 = this.view;
        if (hotelsMapViewV2 != null) {
            hotelsMapViewV2.setupMap(H.a(this.lifecycleOwner.getLifecycle()), onMapControllerReady);
        }
    }
}
