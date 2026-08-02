package ru.ozon.app.android.courieronmap.presentation;

import Vg.d;
import a00.C4911f;
import android.graphics.Outline;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.Q0;
import androidx.fragment.app.ComponentCallbacksC5392m;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import d20.AbstractC6065b;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.common.actionHandlers.CopyTextActionHandler;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.courieronmap.databinding.WidgetCourierOnMapBinding;
import ru.ozon.app.android.courieronmap.presentation.CourierOnMapWidgetHolder;
import ru.ozon.app.android.courieronmap.presentation.viewmodel.CourierOnMapViewModel;
import ru.ozon.app.android.courieronmap.presentation.vo.CourierOnMapVO;
import ru.ozon.app.android.delivery.customActionsHandlers.call.CourierOnMapCallActionHandler;
import ru.ozon.app.android.mapcommon.mapcommon.di.provider.MapCommonProvider;
import ru.ozon.app.android.uikit.utils.StatusBarController;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import y7.k;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001-B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\t\u001a\u00060\u0007j\u0002`\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u001bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001eR\u0018\u0010\t\u001a\u00060\u0007j\u0002`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010'\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010,\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006."}, d2 = {"Lru/ozon/app/android/courieronmap/presentation/CourierOnMapWidgetHolder;", "Ld20/b;", "Lru/ozon/app/android/courieronmap/presentation/vo/CourierOnMapVO;", "Ll10/i;", "container", "Lru/ozon/app/android/courieronmap/presentation/viewmodel/CourierOnMapViewModel;", "viewModel", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/composer/ComposerNavigator;", "navigator", "Lru/ozon/app/android/mapcommon/mapcommon/di/provider/MapCommonProvider;", "mapProvider", "Lru/ozon/app/android/utils/AppType;", "appType", "<init>", "(Ll10/i;Lru/ozon/app/android/courieronmap/presentation/viewmodel/CourierOnMapViewModel;LVg/d;Lru/ozon/app/android/composer/ComposerNavigator;Lru/ozon/app/android/mapcommon/mapcommon/di/provider/MapCommonProvider;Lru/ozon/app/android/utils/AppType;)V", "La00/f;", "", "setupPortraitWindow", "(La00/f;)V", "clearWindow", "item", "bind", "(Lru/ozon/app/android/courieronmap/presentation/vo/CourierOnMapVO;)V", "onWidgetCreated", "()V", "onWidgetDestroyed", "Ll10/i;", "Lru/ozon/app/android/courieronmap/presentation/viewmodel/CourierOnMapViewModel;", "LVg/d;", "Lru/ozon/app/android/courieronmap/presentation/CourierOnMapBinder;", "binder", "Lru/ozon/app/android/courieronmap/presentation/CourierOnMapBinder;", "Landroid/view/View$OnLayoutChangeListener;", "bottomContainerLayoutChangedListener", "Landroid/view/View$OnLayoutChangeListener;", "", "isAppearanceLightStatusBars", "Z", "Landroid/view/View;", "getMetricView", "()Landroid/view/View;", "metricView", "Companion", "courieronmap_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CourierOnMapWidgetHolder extends AbstractC6065b<CourierOnMapVO> {
    private static final float BACK_BTN_CORNER_RADIUS;

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final float FAB_DEFAULT_CORNER_RADIUS;
    private static final float FAB_SELECT_CORNER_RADIUS;

    @NotNull
    private static final Set<Class<? extends CustomActionHandler>> SUPPORTED_ACTIONS;

    @NotNull
    private final CourierOnMapBinder binder;

    @NotNull
    private final View.OnLayoutChangeListener bottomContainerLayoutChangedListener;

    @NotNull
    private final i container;

    @NotNull
    private final d customActionHandlersStoreFactory;
    private boolean isAppearanceLightStatusBars;

    @NotNull
    private final CourierOnMapViewModel viewModel;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R%\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/courieronmap/presentation/CourierOnMapWidgetHolder$Companion;", "", "<init>", "()V", "", "Ljava/lang/Class;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "SUPPORTED_ACTIONS", "Ljava/util/Set;", "getSUPPORTED_ACTIONS", "()Ljava/util/Set;", "", "BACK_BTN_CORNER_RADIUS", "F", "getBACK_BTN_CORNER_RADIUS", "()F", "courieronmap_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float getBACK_BTN_CORNER_RADIUS() {
            return CourierOnMapWidgetHolder.BACK_BTN_CORNER_RADIUS;
        }

        @NotNull
        public final Set<Class<? extends CustomActionHandler>> getSUPPORTED_ACTIONS() {
            return CourierOnMapWidgetHolder.SUPPORTED_ACTIONS;
        }

        private Companion() {
        }
    }

    static {
        Class[] elements = {CopyTextActionHandler.class, CourierOnMapCallActionHandler.class};
        Intrinsics.checkNotNullParameter(elements, "elements");
        SUPPORTED_ACTIONS = C7705l.j0(elements);
        FAB_DEFAULT_CORNER_RADIUS = ResourceExtKt.toPxF(8);
        FAB_SELECT_CORNER_RADIUS = ResourceExtKt.toPxF(32);
        BACK_BTN_CORNER_RADIUS = ResourceExtKt.toPxF(99);
    }

    public CourierOnMapWidgetHolder(@NotNull i container, @NotNull CourierOnMapViewModel viewModel, @NotNull d customActionHandlersStoreFactory, @NotNull ComposerNavigator navigator, @NotNull MapCommonProvider mapProvider, @NotNull AppType appType) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(mapProvider, "mapProvider");
        Intrinsics.checkNotNullParameter(appType, "appType");
        this.container = container;
        this.viewModel = viewModel;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        WidgetCourierOnMapBinding inflate = WidgetCourierOnMapBinding.inflate(LayoutInflater.from(container.L()), container.Z(), false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        CourierOnMapBinder courierOnMapBinder = new CourierOnMapBinder(inflate, container, navigator, viewModel, new ActionHandler.Builder(container, this).customActionHandlers(new CourierOnMapWidgetHolder$binder$1(this)).buildHandler(), mapProvider);
        this.binder = courierOnMapBinder;
        this.bottomContainerLayoutChangedListener = new View.OnLayoutChangeListener() { // from class: Wr.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                CourierOnMapWidgetHolder.bottomContainerLayoutChangedListener$lambda$1(CourierOnMapWidgetHolder.this, view, i11, i12, i13, i14, i15, i16, i17, i18);
            }
        };
        float f7 = appType == AppType.SELECT ? FAB_SELECT_CORNER_RADIUS : FAB_DEFAULT_CORNER_RADIUS;
        FloatingActionButton floatingActionButton = courierOnMapBinder.getBinding().locationFab;
        k.a aVar = new k.a();
        aVar.e(f7);
        floatingActionButton.setShapeAppearanceModel(aVar.a());
        ImageView imageView = courierOnMapBinder.getBinding().backBtn;
        imageView.setClipToOutline(true);
        imageView.setOutlineProvider(new ViewOutlineProvider() { // from class: ru.ozon.app.android.courieronmap.presentation.CourierOnMapWidgetHolder$1$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                CourierOnMapWidgetHolder.Companion companion;
                Intrinsics.checkNotNullParameter(view, "view");
                if (outline != null) {
                    int width = view.getWidth();
                    int height = view.getHeight();
                    companion = CourierOnMapWidgetHolder.Companion;
                    outline.setRoundRect(0, 0, width, height, companion.getBACK_BTN_CORNER_RADIUS());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bottomContainerLayoutChangedListener$lambda$1(CourierOnMapWidgetHolder courierOnMapWidgetHolder, View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        CoordinatorLayout constraintLayout = courierOnMapWidgetHolder.binder.getBinding().getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        }
        CoordinatorLayout.f fVar = (CoordinatorLayout.f) layoutParams;
        fVar.setMargins(0, 0, 0, i14 - i12);
        constraintLayout.setLayoutParams(fVar);
    }

    private final void clearWindow(C4911f container) {
        ComponentCallbacksC5392m j11 = container.j();
        Window window = container.i().getWindow();
        View decorView = window.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        View view = j11.getView();
        if (view != null) {
            view.setFitsSystemWindows(true);
        }
        StatusBarController statusBarController = StatusBarController.INSTANCE;
        Window window2 = j11.requireActivity().getWindow();
        Intrinsics.checkNotNullExpressionValue(window2, "getWindow(...)");
        statusBarController.setFullScreenWindow(window2, false);
        StatusBarController.setStatusBarColorByTheme$default(statusBarController, j11, StatusBarController.UpdateReason.Recovery.INSTANCE, 0, 4, null);
        new Q0(decorView, window).e(this.isAppearanceLightStatusBars);
    }

    private final void setupPortraitWindow(C4911f container) {
        ComponentCallbacksC5392m j11 = container.j();
        Window window = container.i().getWindow();
        View decorView = window.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        View view = j11.getView();
        if (view != null) {
            view.setFitsSystemWindows(false);
        }
        StatusBarController statusBarController = StatusBarController.INSTANCE;
        Window window2 = j11.requireActivity().getWindow();
        Intrinsics.checkNotNullExpressionValue(window2, "getWindow(...)");
        statusBarController.setFullScreenWindow(window2, true);
        statusBarController.setStatusBarBackgroundColor(j11, StatusBarController.UpdateReason.NewState.INSTANCE, 0);
        Q0 q02 = new Q0(decorView, window);
        this.isAppearanceLightStatusBars = q02.c();
        q02.e(true);
        ImageView imageView = this.binder.getBinding().backBtn;
        Intrinsics.f(imageView);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, ResourceExtKt.getStatusBarHeight(container.i()) + marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        imageView.setLayoutParams(marginLayoutParams);
    }

    @Override // d20.AbstractC6065b
    @NotNull
    public View getMetricView() {
        CoordinatorLayout constraintLayout = this.binder.getBinding().getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        return constraintLayout;
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        this.container.Z().addView(this.binder.getBinding().getConstraintLayout());
        this.binder.onConstruct();
        setupPortraitWindow(this.container.Q());
        ComposerViewExtensionKt.composerBottomContainer(this.container.Y()).addOnLayoutChangeListener(this.bottomContainerLayoutChangedListener);
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        this.container.Z().removeView(this.binder.getBinding().getConstraintLayout());
        this.binder.onRemoveView();
        clearWindow(this.container.Q());
        ComposerViewExtensionKt.composerBottomContainer(this.container.Y()).removeOnLayoutChangeListener(this.bottomContainerLayoutChangedListener);
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull CourierOnMapVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.viewModel.bind(item);
    }
}
