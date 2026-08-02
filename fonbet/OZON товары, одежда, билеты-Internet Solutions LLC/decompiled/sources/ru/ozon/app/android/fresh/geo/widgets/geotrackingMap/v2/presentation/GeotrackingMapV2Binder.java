package ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.o;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.Y;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.fresh.geo.databinding.WidgetGeotrackingMapV2Binding;
import ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation.GeotrackingMapV2VO;
import ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation.GeotrackingMapV2ViewModel;
import ru.ozon.app.android.utils.WhenExtKt;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000q\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001;\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0018\u0010\u0010J\u0015\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\f¢\u0006\u0004\b!\u0010\u0010J\r\u0010\"\u001a\u00020\f¢\u0006\u0004\b\"\u0010\u0010J\u0015\u0010$\u001a\u00020#2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\f¢\u0006\u0004\b&\u0010\u0010J\u0015\u0010)\u001a\u00020\f2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010+R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010,R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010-R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010.R\u0018\u0010/\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u00101R\u001b\u00107\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0018\u00109\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010A\u001a\u00020>8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@¨\u0006B"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2Binder;", "", "Ll10/i;", "container", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2ViewModel;", "viewModel", "Lru/ozon/app/android/composer/ComposerNavigator;", "composerNavigator", "<init>", "(Ll10/i;Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2ViewModel;Lru/ozon/app/android/composer/ComposerNavigator;)V", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2ViewModel$Action;", "action", "", "actionHandler", "(Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2ViewModel$Action;)V", "hidePopup", "()V", "showPopup", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO;", "page", "mapStateHandler", "(Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO;)V", "preparePage", "(Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO;)Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO;", "handleActionBack", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2View;", "view", "setView", "(Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2View;)V", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/PageModifier;", "pageModifier", "setPageModifier", "(Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/PageModifier;)V", "onConstruct", "onRemove", "", "checkValidity", "(Ll10/i;)Z", "dispose", "", "state", "handleBottomSheetState", "(I)V", "Ll10/i;", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2ViewModel;", "Lru/ozon/app/android/composer/ComposerNavigator;", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2View;", "lastItem", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO;", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/PageModifier;", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "errorNotificationDTO$delegate", "LSc/j;", "getErrorNotificationDTO", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "errorNotificationDTO", "Lru/ozon/uni/android/notificationbar/NotificationBar;", "notification", "Lru/ozon/uni/android/notificationbar/NotificationBar;", "ru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2Binder$viewObserver$1", "viewObserver", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2Binder$viewObserver$1;", "Landroidx/lifecycle/J;", "getViewOwner", "()Landroidx/lifecycle/J;", "viewOwner", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class GeotrackingMapV2Binder {

    @NotNull
    private final ComposerNavigator composerNavigator;

    @NotNull
    private final i container;

    /* renamed from: errorNotificationDTO$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j errorNotificationDTO;
    private GeotrackingMapV2VO lastItem;
    private NotificationBar notification;
    private PageModifier pageModifier;
    private GeotrackingMapV2View view;

    @NotNull
    private final GeotrackingMapV2ViewModel viewModel;

    @NotNull
    private final GeotrackingMapV2Binder$viewObserver$1 viewObserver;

    /* JADX WARN: Type inference failed for: r2v3, types: [ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation.GeotrackingMapV2Binder$viewObserver$1] */
    public GeotrackingMapV2Binder(@NotNull i container, @NotNull GeotrackingMapV2ViewModel viewModel, @NotNull ComposerNavigator composerNavigator) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(composerNavigator, "composerNavigator");
        this.container = container;
        this.viewModel = viewModel;
        this.composerNavigator = composerNavigator;
        this.errorNotificationDTO = k.b(GeotrackingMapV2Binder$errorNotificationDTO$2.INSTANCE);
        this.viewObserver = new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation.GeotrackingMapV2Binder$viewObserver$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStart(J owner) {
                GeotrackingMapV2ViewModel geotrackingMapV2ViewModel;
                Intrinsics.checkNotNullParameter(owner, "owner");
                GeotrackingMapV2View geotrackingMapV2View = GeotrackingMapV2Binder.this.view;
                if (geotrackingMapV2View != null) {
                    geotrackingMapV2View.onStart();
                }
                geotrackingMapV2ViewModel = GeotrackingMapV2Binder.this.viewModel;
                geotrackingMapV2ViewModel.onStart();
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStop(J owner) {
                GeotrackingMapV2ViewModel geotrackingMapV2ViewModel;
                Intrinsics.checkNotNullParameter(owner, "owner");
                GeotrackingMapV2View geotrackingMapV2View = GeotrackingMapV2Binder.this.view;
                if (geotrackingMapV2View != null) {
                    geotrackingMapV2View.onStop();
                }
                geotrackingMapV2ViewModel = GeotrackingMapV2Binder.this.viewModel;
                geotrackingMapV2ViewModel.onStop();
            }
        };
    }

    private final void actionHandler(GeotrackingMapV2ViewModel.Action action) {
        if (action instanceof GeotrackingMapV2ViewModel.Action.Back) {
            handleActionBack();
        } else if (action instanceof GeotrackingMapV2ViewModel.Action.HidePopup) {
            hidePopup();
        } else if (action instanceof GeotrackingMapV2ViewModel.Action.ShowPopup) {
            showPopup();
        } else {
            if (!(action instanceof GeotrackingMapV2ViewModel.Action.RefreshPage)) {
                throw new o();
            }
            InterfaceC7851b.a.e(this.container.M(), null, null, null, 7);
        }
        WhenExtKt.getExhaustive(Unit.f71690a);
    }

    private final NotificationDTO getErrorNotificationDTO() {
        return (NotificationDTO) this.errorNotificationDTO.getValue();
    }

    private final J getViewOwner() {
        return this.container.K().f();
    }

    private final void handleActionBack() {
        this.composerNavigator.popBackStack();
    }

    private final void hidePopup() {
        NotificationBar notificationBar = this.notification;
        if (notificationBar != null) {
            notificationBar.dismiss();
        }
    }

    private final void mapStateHandler(final GeotrackingMapV2VO page) {
        WidgetGeotrackingMapV2Binding binding;
        ConstraintLayout constraintLayout;
        GeotrackingMapV2View geotrackingMapV2View = this.view;
        if (geotrackingMapV2View == null || (binding = geotrackingMapV2View.getBinding()) == null || (constraintLayout = binding.getConstraintLayout()) == null) {
            return;
        }
        int i11 = Y.f42258g;
        if (!constraintLayout.isLaidOut() || constraintLayout.isLayoutRequested()) {
            constraintLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation.GeotrackingMapV2Binder$mapStateHandler$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    view.removeOnLayoutChangeListener(this);
                    GeotrackingMapV2View geotrackingMapV2View2 = GeotrackingMapV2Binder.this.view;
                    if (geotrackingMapV2View2 != null) {
                        PageModifier pageModifier = GeotrackingMapV2Binder.this.pageModifier;
                        if (pageModifier != null) {
                            pageModifier.updateMinSheetHeightRatio(page.getCurrentSheetRatio());
                        }
                        geotrackingMapV2View2.bindGeotrackingMapV2VO(GeotrackingMapV2Binder.this.preparePage(page));
                    }
                }
            });
            return;
        }
        GeotrackingMapV2View geotrackingMapV2View2 = this.view;
        if (geotrackingMapV2View2 != null) {
            PageModifier pageModifier = this.pageModifier;
            if (pageModifier != null) {
                pageModifier.updateMinSheetHeightRatio(page.getCurrentSheetRatio());
            }
            geotrackingMapV2View2.bindGeotrackingMapV2VO(preparePage(page));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object onConstruct$actionHandler(GeotrackingMapV2Binder geotrackingMapV2Binder, GeotrackingMapV2ViewModel.Action action, d dVar) {
        geotrackingMapV2Binder.actionHandler(action);
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object onConstruct$mapStateHandler(GeotrackingMapV2Binder geotrackingMapV2Binder, GeotrackingMapV2VO geotrackingMapV2VO, d dVar) {
        geotrackingMapV2Binder.mapStateHandler(geotrackingMapV2VO);
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GeotrackingMapV2VO preparePage(GeotrackingMapV2VO page) {
        GeotrackingMapV2VO geotrackingMapV2VO;
        GeotrackingMapV2VO.Pin.Modification currentModification;
        GeotrackingMapV2VO.Pin courierPin;
        if (page.getIsInitial()) {
            GeotrackingMapV2VO.Pin courierPin2 = page.getCourierPin();
            GeotrackingMapV2VO geotrackingMapV2VO2 = this.lastItem;
            if (geotrackingMapV2VO2 == null || (courierPin = geotrackingMapV2VO2.getCourierPin()) == null || (currentModification = courierPin.getCurrentModification()) == null) {
                currentModification = page.getCourierPin().getCurrentModification();
            }
            geotrackingMapV2VO = page.copy((r32 & 1) != 0 ? page.id : 0L, (r32 & 2) != 0 ? page.courierPin : GeotrackingMapV2VO.Pin.copy$default(courierPin2, null, 0.0d, null, false, currentModification, 15, null), (r32 & 4) != 0 ? page.destinationPin : null, (r32 & 8) != 0 ? page.darkStorePin : null, (r32 & 16) != 0 ? page.largestPinSize : null, (r32 & 32) != 0 ? page.orderStatus : null, (r32 & 64) != 0 ? page.isReceived : false, (r32 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? page.currentSheetRatio : 0.0d, (r32 & 256) != 0 ? page.locationTrackingInfo : null, (r32 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? page.defaultSheetTrackingInfo : null, (r32 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? page.expandedSheetTrackingInfo : null, (r32 & 2048) != 0 ? page.webSocketUrl : null, (r32 & 4096) != 0 ? page.courierPinModifications : null);
        } else {
            geotrackingMapV2VO = page;
        }
        this.lastItem = geotrackingMapV2VO;
        return geotrackingMapV2VO;
    }

    private final void showPopup() {
        NotificationLayoutManager asNotificationLayoutManager$default;
        ComponentCallbacksC5392m b11 = this.container.K().b();
        View view = b11 != null ? b11.getView() : null;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup == null || (asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(viewGroup, null, 1, null)) == null) {
            return;
        }
        NotificationBar make$default = NotificationBar.Companion.make$default(NotificationBar.INSTANCE, asNotificationLayoutManager$default, getErrorNotificationDTO(), this.container.K().f(), null, 8, null);
        this.notification = make$default;
        if (make$default != null) {
            make$default.show();
        }
    }

    public final boolean checkValidity(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return this.container == container;
    }

    public final void dispose() {
        this.view = null;
    }

    public final void handleBottomSheetState(int state) {
        GeotrackingMapV2View geotrackingMapV2View = this.view;
        if (geotrackingMapV2View != null) {
            geotrackingMapV2View.trackBottomSheetState(state);
        }
    }

    public final void onConstruct() {
        InterfaceC2395h H11 = C2399j.H(this.viewModel.getAction());
        AbstractC5434v lifecycle = getViewOwner().getLifecycle();
        AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
        C2399j.C(new C2408n0(C5427n.a(H11, lifecycle, bVar), new GeotrackingMapV2Binder$onConstruct$1(this)), K.a(getViewOwner()));
        C2399j.C(new C2408n0(C5427n.a(this.viewModel.getMapState(), getViewOwner().getLifecycle(), bVar), new GeotrackingMapV2Binder$onConstruct$2(this)), K.a(getViewOwner()));
        GeotrackingMapV2View geotrackingMapV2View = this.view;
        if (geotrackingMapV2View != null) {
            geotrackingMapV2View.onStart();
        }
    }

    public final void onRemove() {
        this.view = null;
        this.lastItem = null;
        this.pageModifier = null;
    }

    public final void setPageModifier(@NotNull PageModifier pageModifier) {
        Intrinsics.checkNotNullParameter(pageModifier, "pageModifier");
        this.pageModifier = pageModifier;
    }

    public final void setView(@NotNull GeotrackingMapV2View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
        view.setOnBackPressed(new GeotrackingMapV2Binder$setView$1(this.viewModel));
        getViewOwner().getLifecycle().a(this.viewObserver);
    }
}
