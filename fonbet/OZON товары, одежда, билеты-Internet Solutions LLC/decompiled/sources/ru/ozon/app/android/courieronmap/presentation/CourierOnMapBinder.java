package ru.ozon.app.android.courieronmap.presentation;

import Aw.ViewOnClickListenerC2448a;
import Cw.ViewOnClickListenerC2787a;
import Ge.f;
import Sc.o;
import Sc.s;
import WZ.t;
import Wc.a;
import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import io.reactivex.AbstractC7094b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.courieronmap.databinding.WidgetCourierOnMapBinding;
import ru.ozon.app.android.courieronmap.presentation.decoration.CourierInfoIOffsetsItemDecoration;
import ru.ozon.app.android.courieronmap.presentation.helper.CourierBottomSheetConfigurator;
import ru.ozon.app.android.courieronmap.presentation.helper.CourierInfoBottomSheetHelper;
import ru.ozon.app.android.courieronmap.presentation.provider.MapIconProvider;
import ru.ozon.app.android.courieronmap.presentation.viewmodel.CourierOnMapViewModel;
import ru.ozon.app.android.courieronmap.presentation.vo.CourierOnMapVO;
import ru.ozon.app.android.mapcommon.map.OzonMapController;
import ru.ozon.app.android.mapcommon.map.model.BoundingBoxModel;
import ru.ozon.app.android.mapcommon.map.model.CameraPositionModel;
import ru.ozon.app.android.mapcommon.map.model.PointModel;
import ru.ozon.app.android.mapcommon.map.model.ScreenRectModel;
import ru.ozon.app.android.mapcommon.mapcommon.OzonMapControllerWrapper;
import ru.ozon.app.android.mapcommon.mapcommon.di.provider.MapCommonProvider;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import we0.m;
import we0.q;
import we0.r;
import xe.B0;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 E2\u00020\u0001:\u0001EBC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0015J\u000f\u0010\u0019\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u0017J\u0017\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001e\u0010\u0017J\u000f\u0010\u001f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001f\u0010\u0017J\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020 H\u0016¢\u0006\u0004\b#\u0010\"J#\u0010'\u001a\u00020\f2\b\u0010%\u001a\u0004\u0018\u00010$2\b\u0010&\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\f¢\u0006\u0004\b)\u0010\u0017J\r\u0010*\u001a\u00020\f¢\u0006\u0004\b*\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010-R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010.R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010/R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00100R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010AR\u0018\u0010C\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010D¨\u0006F"}, d2 = {"Lru/ozon/app/android/courieronmap/presentation/CourierOnMapBinder;", "Lru/ozon/app/android/courieronmap/presentation/helper/CourierInfoBottomSheetHelper$Listener;", "Lru/ozon/app/android/courieronmap/databinding/WidgetCourierOnMapBinding;", "binding", "Ll10/i;", "container", "Lru/ozon/app/android/composer/ComposerNavigator;", "navigator", "Lru/ozon/app/android/courieronmap/presentation/viewmodel/CourierOnMapViewModel;", "viewModel", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Lru/ozon/app/android/mapcommon/mapcommon/di/provider/MapCommonProvider;", "ozonMapProvider", "<init>", "(Lru/ozon/app/android/courieronmap/databinding/WidgetCourierOnMapBinding;Ll10/i;Lru/ozon/app/android/composer/ComposerNavigator;Lru/ozon/app/android/courieronmap/presentation/viewmodel/CourierOnMapViewModel;Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/mapcommon/mapcommon/di/provider/MapCommonProvider;)V", "Lru/ozon/app/android/courieronmap/presentation/vo/CourierOnMapVO;", "vo", "updatePosition", "(Lru/ozon/app/android/courieronmap/presentation/vo/CourierOnMapVO;)V", "updateActiveZone", "()V", "setBottomSheetData", "addLifecycleObserver", "", "loading", "showProgress", "(Z)V", "onSlide", "onPopupStateChange", "", "getHeaderHeight", "()I", "getCallCourierContainerHeight", "", "x", "y", "setPositionToCallCourierContainer", "(Ljava/lang/Float;Ljava/lang/Float;)V", "onConstruct", "onRemoveView", "Lru/ozon/app/android/courieronmap/databinding/WidgetCourierOnMapBinding;", "getBinding", "()Lru/ozon/app/android/courieronmap/databinding/WidgetCourierOnMapBinding;", "Ll10/i;", "Lru/ozon/app/android/composer/ComposerNavigator;", "Lru/ozon/app/android/courieronmap/presentation/viewmodel/CourierOnMapViewModel;", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/courieronmap/presentation/helper/CourierInfoBottomSheetHelper;", "bottomSheetHelper", "Lru/ozon/app/android/courieronmap/presentation/helper/CourierInfoBottomSheetHelper;", "Lru/ozon/app/android/mapcommon/mapcommon/OzonMapControllerWrapper;", "mapController", "Lru/ozon/app/android/mapcommon/mapcommon/OzonMapControllerWrapper;", "Lru/ozon/app/android/courieronmap/presentation/provider/MapIconProvider;", "mapIconProvider", "Lru/ozon/app/android/courieronmap/presentation/provider/MapIconProvider;", "Lru/ozon/app/android/courieronmap/presentation/decoration/CourierInfoIOffsetsItemDecoration;", "courierInfoItemDecoration", "Lru/ozon/app/android/courieronmap/presentation/decoration/CourierInfoIOffsetsItemDecoration;", "Lru/ozon/app/android/courieronmap/presentation/helper/CourierBottomSheetConfigurator;", "bottomSheetConfigurator", "Lru/ozon/app/android/courieronmap/presentation/helper/CourierBottomSheetConfigurator;", "Lru/ozon/app/android/courieronmap/presentation/vo/CourierOnMapVO;", "Lxe/B0;", "initMapJob", "Lxe/B0;", "Companion", "courieronmap_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CourierOnMapBinder implements CourierInfoBottomSheetHelper.Listener {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetCourierOnMapBinding binding;

    @NotNull
    private final CourierBottomSheetConfigurator bottomSheetConfigurator;

    @NotNull
    private final CourierInfoBottomSheetHelper bottomSheetHelper;

    @NotNull
    private final i container;

    @NotNull
    private final CourierInfoIOffsetsItemDecoration courierInfoItemDecoration;
    private B0 initMapJob;

    @NotNull
    private final OzonMapControllerWrapper mapController;

    @NotNull
    private final MapIconProvider mapIconProvider;

    @NotNull
    private final ComposerNavigator navigator;

    @NotNull
    private final CourierOnMapViewModel viewModel;
    private CourierOnMapVO vo;

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int COPYRIGHT_LABEL_MARGIN_DP = UiExtKt.toPx(2);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.courieronmap.presentation.CourierOnMapBinder$1", f = "CourierOnMapBinder.kt", l = {UserVerificationMethods.USER_VERIFY_EYEPRINT}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.courieronmap.presentation.CourierOnMapBinder$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        int label;

        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.courieronmap.presentation.CourierOnMapBinder$1$1, reason: invalid class name and collision with other inner class name */
        static final class C17631 extends AbstractC7737t implements Function1<Boolean, Unit> {
            final /* synthetic */ CourierOnMapBinder this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C17631(CourierOnMapBinder courierOnMapBinder) {
                super(1);
                this.this$0 = courierOnMapBinder;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return Unit.f71690a;
            }

            public final void invoke(boolean z11) {
                this.this$0.showProgress(z11);
            }
        }

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return CourierOnMapBinder.this.new AnonymousClass1(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            try {
                if (i11 == 0) {
                    s.b(obj);
                    AbstractC7094b initMap = CourierOnMapBinder.this.mapController.initMap(new C17631(CourierOnMapBinder.this));
                    this.label = 1;
                    if (f.a(initMap, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                CourierOnMapBinder.this.addLifecycleObserver();
                CourierOnMapBinder.this.bottomSheetHelper.observeStateChange();
                CourierOnMapBinder.this.mapController.setLogoConfig(new q(r.RIGHT_TOP, (Pair<Integer, Integer>) new Pair(new Integer(CourierOnMapBinder.Companion.getCOPYRIGHT_LABEL_MARGIN_DP()), new Integer(UiExtKt.toDp(ResourceExtKt.getStatusBarHeight(CourierOnMapBinder.this.container.Q().i())) + CourierOnMapBinder.Companion.getCOPYRIGHT_LABEL_MARGIN_DP()))));
            } catch (Exception e11) {
                Lm0.a.f17149a.e(e11);
            }
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/courieronmap/presentation/viewmodel/CourierOnMapViewModel$Action;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/courieronmap/presentation/viewmodel/CourierOnMapViewModel$Action;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.courieronmap.presentation.CourierOnMapBinder$4, reason: invalid class name */
    static final class AnonymousClass4 extends AbstractC7737t implements Function1<CourierOnMapViewModel.Action, Unit> {
        AnonymousClass4() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CourierOnMapViewModel.Action action) {
            invoke2(action);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CourierOnMapViewModel.Action action) {
            if (action instanceof CourierOnMapViewModel.Action.UpdateCourierInfo) {
                CourierOnMapViewModel.Action.UpdateCourierInfo updateCourierInfo = (CourierOnMapViewModel.Action.UpdateCourierInfo) action;
                CourierOnMapBinder.this.vo = updateCourierInfo.getData();
                CourierOnMapBinder.this.setBottomSheetData(updateCourierInfo.getData());
                return;
            }
            if (!(action instanceof CourierOnMapViewModel.Action.SendAnalytics)) {
                if (!(action instanceof CourierOnMapViewModel.Action.UpdateWidget)) {
                    throw new o();
                }
                InterfaceC7851b.a.e(CourierOnMapBinder.this.container.M(), null, null, null, 7);
            } else {
                t tokenizedEvent = ((CourierOnMapViewModel.Action.SendAnalytics) action).getData().getTokenizedEvent();
                if (tokenizedEvent != null) {
                    TokenizedAnalyticsExtensionsKt.processViewEvents$default(CourierOnMapBinder.this.container.X(), tokenizedEvent, null, 2, null);
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/courieronmap/presentation/CourierOnMapBinder$Companion;", "", "<init>", "()V", "MIN_ACTIVE_ZONE_PERCENT", "", "ZOOM_DEFAULT", "COPYRIGHT_LABEL_MARGIN_DP", "", "getCOPYRIGHT_LABEL_MARGIN_DP", "()I", "courieronmap_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getCOPYRIGHT_LABEL_MARGIN_DP() {
            return CourierOnMapBinder.COPYRIGHT_LABEL_MARGIN_DP;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CourierOnMapBinder(@NotNull WidgetCourierOnMapBinding binding, @NotNull i container, @NotNull ComposerNavigator navigator, @NotNull CourierOnMapViewModel viewModel, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull MapCommonProvider ozonMapProvider) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(ozonMapProvider, "ozonMapProvider");
        this.binding = binding;
        this.container = container;
        this.navigator = navigator;
        this.viewModel = viewModel;
        this.actionHandler = actionHandler;
        this.bottomSheetHelper = new CourierInfoBottomSheetHelper(binding, this);
        FrameLayout mapContainer = binding.mapContainer;
        Intrinsics.checkNotNullExpressionValue(mapContainer, "mapContainer");
        OzonMapControllerWrapper provideOzonMapControllerWrapper = ozonMapProvider.provideOzonMapControllerWrapper(mapContainer);
        this.mapController = provideOzonMapControllerWrapper;
        Context context = binding.getConstraintLayout().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.mapIconProvider = new MapIconProvider(provideOzonMapControllerWrapper, context);
        this.courierInfoItemDecoration = new CourierInfoIOffsetsItemDecoration();
        FrameLayout bottomSheetContainer = binding.popupContainer.bottomSheetContainer;
        Intrinsics.checkNotNullExpressionValue(bottomSheetContainer, "bottomSheetContainer");
        this.bottomSheetConfigurator = new CourierBottomSheetConfigurator(bottomSheetContainer);
        this.initMapJob = C10727i.c(K.a(container.K().f()), null, null, new AnonymousClass1(null), 3);
        binding.backBtn.setOnClickListener(new ViewOnClickListenerC2448a(this, 8));
        binding.locationFab.setOnClickListener(new ViewOnClickListenerC2787a(this, 7));
        viewModel.getAction().observe(container.K().f(), new CourierOnMapBinder$sam$androidx_lifecycle_Observer$0(new AnonymousClass4()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(CourierOnMapBinder courierOnMapBinder, View view) {
        courierOnMapBinder.navigator.popBackStack();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(CourierOnMapBinder courierOnMapBinder, View view) {
        courierOnMapBinder.viewModel.updateLocation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addLifecycleObserver() {
        this.container.K().h().getLifecycle().a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.courieronmap.presentation.CourierOnMapBinder$addLifecycleObserver$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onPause(J owner) {
                CourierOnMapViewModel courierOnMapViewModel;
                MapIconProvider mapIconProvider;
                Intrinsics.checkNotNullParameter(owner, "owner");
                courierOnMapViewModel = CourierOnMapBinder.this.viewModel;
                courierOnMapViewModel.onPause();
                mapIconProvider = CourierOnMapBinder.this.mapIconProvider;
                mapIconProvider.onPause();
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onResume(J owner) {
                CourierOnMapViewModel courierOnMapViewModel;
                Intrinsics.checkNotNullParameter(owner, "owner");
                courierOnMapViewModel = CourierOnMapBinder.this.viewModel;
                courierOnMapViewModel.onResume();
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStart(J owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                CourierOnMapBinder.this.mapController.onStart();
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStop(J owner) {
                MapIconProvider mapIconProvider;
                Intrinsics.checkNotNullParameter(owner, "owner");
                CourierOnMapBinder.this.mapController.onStop();
                mapIconProvider = CourierOnMapBinder.this.mapIconProvider;
                mapIconProvider.onStop();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setBottomSheetData(CourierOnMapVO vo) {
        this.bottomSheetConfigurator.configureBottomSheet(vo, this.actionHandler, this.courierInfoItemDecoration);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showProgress(boolean loading) {
        ViewGroup composerProgressBar;
        ComponentCallbacksC5392m b11 = this.container.K().b();
        View view = b11 != null ? b11.getView() : null;
        if (view == null || (composerProgressBar = ComposerViewExtensionKt.composerProgressBar(view)) == null) {
            return;
        }
        composerProgressBar.setVisibility(loading ? 0 : 8);
    }

    private final void updateActiveZone() {
        float height = 1 - ((r0.getConstraintLayout().getHeight() - this.binding.popupContainer.getConstraintLayout().getY()) / r0.getConstraintLayout().getHeight());
        if (height < 0.5f) {
            height = 0.5f;
        }
        Point point = new Point(0, 0);
        int height2 = (int) (this.mapController.height() * height);
        int width = this.mapController.width();
        if (height2 == 0 || width == 0) {
            return;
        }
        this.mapController.setFocusRect(new ScreenRectModel(point, new Point(width, height2)));
    }

    private final void updatePosition(CourierOnMapVO vo) {
        m coordinates;
        CourierOnMapVO.PinInfo courier = vo.getCourier();
        m[] elements = {courier != null ? courier.getCoordinates() : null, vo.getCustomer().getCoordinates()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        ArrayList B11 = C7705l.B(elements);
        CourierOnMapVO.PinInfo courier2 = vo.getCourier();
        double longitude = (courier2 == null || (coordinates = courier2.getCoordinates()) == null) ? 0.0d : coordinates.getLongitude();
        double longitude2 = vo.getCustomer().getCoordinates().getLongitude();
        double captionViewWidth = longitude > longitude2 ? (longitude - longitude2) * (this.mapIconProvider.getCaptionViewWidth() / this.mapController.width()) : 0.0d;
        Iterator it = B11.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double latitude = ((m) it.next()).getLatitude();
        while (it.hasNext()) {
            latitude = Math.min(latitude, ((m) it.next()).getLatitude());
        }
        Iterator it2 = B11.iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException();
        }
        double longitude3 = ((m) it2.next()).getLongitude();
        while (it2.hasNext()) {
            longitude3 = Math.min(longitude3, ((m) it2.next()).getLongitude());
        }
        PointModel pointModel = new PointModel(latitude, longitude3);
        Iterator it3 = B11.iterator();
        if (!it3.hasNext()) {
            throw new NoSuchElementException();
        }
        double latitude2 = ((m) it3.next()).getLatitude();
        while (it3.hasNext()) {
            latitude2 = Math.max(latitude2, ((m) it3.next()).getLatitude());
        }
        Iterator it4 = B11.iterator();
        if (!it4.hasNext()) {
            throw new NoSuchElementException();
        }
        double longitude4 = ((m) it4.next()).getLongitude();
        while (it4.hasNext()) {
            longitude4 = Math.max(longitude4, ((m) it4.next()).getLongitude());
        }
        CameraPositionModel cameraPosition = this.mapController.getCameraPosition(new BoundingBoxModel(pointModel, new PointModel(latitude2, longitude4 + captionViewWidth)));
        if (cameraPosition == null) {
            return;
        }
        OzonMapController.DefaultImpls.moveToAnimated$default(this.mapController, cameraPosition.copy(cameraPosition.getTarget(), vo.getCourier() != null ? cameraPosition.getZoom() - 0.5f : 15.0f, 0.0f, 0.0f), null, null, 6, null);
    }

    @NotNull
    public final WidgetCourierOnMapBinding getBinding() {
        return this.binding;
    }

    @Override // ru.ozon.app.android.courieronmap.presentation.helper.CourierInfoBottomSheetHelper.Listener
    public int getCallCourierContainerHeight() {
        return this.bottomSheetConfigurator.getCallCourierContainerHeightParams();
    }

    @Override // ru.ozon.app.android.courieronmap.presentation.helper.CourierInfoBottomSheetHelper.Listener
    public int getHeaderHeight() {
        return this.bottomSheetConfigurator.getHeaderHeight();
    }

    public final void onConstruct() {
        this.bottomSheetHelper.init();
    }

    @Override // ru.ozon.app.android.courieronmap.presentation.helper.CourierInfoBottomSheetHelper.Listener
    public void onPopupStateChange() {
        CourierOnMapVO courierOnMapVO = this.vo;
        if (courierOnMapVO != null) {
            this.mapIconProvider.createPinMarker(courierOnMapVO);
            updateActiveZone();
            updatePosition(courierOnMapVO);
        }
    }

    public final void onRemoveView() {
        B0 b02 = this.initMapJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.bottomSheetHelper.onRemoveView();
        this.bottomSheetConfigurator.onDestroy();
    }

    @Override // ru.ozon.app.android.courieronmap.presentation.helper.CourierInfoBottomSheetHelper.Listener
    public void onSlide() {
        WidgetCourierOnMapBinding widgetCourierOnMapBinding = this.binding;
        boolean z11 = widgetCourierOnMapBinding.popupContainer.getConstraintLayout().getY() >= ((float) (widgetCourierOnMapBinding.getConstraintLayout().getHeight() / 2));
        FloatingActionButton locationFab = widgetCourierOnMapBinding.locationFab;
        Intrinsics.checkNotNullExpressionValue(locationFab, "locationFab");
        ViewExtKt.showOrGone(locationFab, Boolean.valueOf(z11));
    }

    @Override // ru.ozon.app.android.courieronmap.presentation.helper.CourierInfoBottomSheetHelper.Listener
    public void setPositionToCallCourierContainer(Float x11, Float y11) {
        this.bottomSheetConfigurator.setPositionToCourierContainer(x11, y11);
    }
}
