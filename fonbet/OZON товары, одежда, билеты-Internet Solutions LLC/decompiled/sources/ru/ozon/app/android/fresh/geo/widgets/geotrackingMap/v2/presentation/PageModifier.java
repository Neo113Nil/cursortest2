package ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation;

import AP.b;
import Sc.InterfaceC4008j;
import Sc.k;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.geo.R$id;
import ru.ozon.app.android.fresh.geo.R$layout;
import ru.ozon.app.android.fresh.geo.databinding.GeotrackingV2BottomSheetBinding;
import ru.ozon.app.android.fresh.geo.databinding.WidgetGeotrackingMapV2Binding;
import ru.ozon.composer.ui.view.issue.PageIssueStateView;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import v10.C10183a;

@Metadata(d1 = {"\u0000w\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0005*\u0001E\b\u0000\u0018\u0000 H2\u00020\u0001:\u0001HB+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0013\u0010\u0013\u001a\u00020\b*\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u0010J\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0010J\u0015\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001d\u0010+\u001a\u0004\u0018\u00010 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001d\u00100\u001a\u0004\u0018\u00010,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010(\u001a\u0004\b.\u0010/R\u001b\u00104\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010(\u001a\u0004\b2\u00103R\u001b\u00108\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u0010(\u001a\u0004\b6\u00107R\u0016\u00109\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010;\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010=\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010@\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010C\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010G¨\u0006I"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/PageModifier;", "", "Lru/ozon/app/android/fresh/geo/databinding/WidgetGeotrackingMapV2Binding;", "binding", "Landroid/view/ViewGroup;", "composerRootView", "Lkotlin/Function1;", "", "", "onStateChanged", "<init>", "(Lru/ozon/app/android/fresh/geo/databinding/WidgetGeotrackingMapV2Binding;Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function1;)V", "", "calculateCollapsedHeightPx", "()F", "prepareScreen", "()V", "prepareBottomSheet", "Landroidx/recyclerview/widget/RecyclerView;", "setup", "(Landroidx/recyclerview/widget/RecyclerView;)V", "attachToPage", "detachFromPage", "", "ratio", "updateMinSheetHeightRatio", "(D)V", "Lru/ozon/app/android/fresh/geo/databinding/WidgetGeotrackingMapV2Binding;", "Landroid/view/ViewGroup;", "Lru/ozon/app/android/fresh/geo/databinding/GeotrackingV2BottomSheetBinding;", "bottomContainerBinding", "Lru/ozon/app/android/fresh/geo/databinding/GeotrackingV2BottomSheetBinding;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "bottomSheetContainer", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroid/widget/LinearLayout;", "bottomSheetBehaviour", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "coordinatorLayout$delegate", "LSc/j;", "getCoordinatorLayout", "()Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "coordinatorLayout", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "swipeToRefreshLayout$delegate", "getSwipeToRefreshLayout", "()Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "swipeToRefreshLayout", "recyclerView$delegate", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "bottomContainer$delegate", "getBottomContainer", "()Landroid/widget/LinearLayout;", "bottomContainer", "minSheetHeightRatio", "D", "swipeLl", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "swipeLlIndex", "I", "Lru/ozon/composer/ui/view/issue/PageIssueStateView;", "deathScreen", "Lru/ozon/composer/ui/view/issue/PageIssueStateView;", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingBottomOffsetDecorator;", "recyclerDecorator", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingBottomOffsetDecorator;", "ru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/PageModifier$callback$1", "callback", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/PageModifier$callback$1;", "Companion", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PageModifier {

    @NotNull
    private final WidgetGeotrackingMapV2Binding binding;

    /* renamed from: bottomContainer$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j bottomContainer;
    private GeotrackingV2BottomSheetBinding bottomContainerBinding;
    private BottomSheetBehavior<LinearLayout> bottomSheetBehaviour;
    private CoordinatorLayout bottomSheetContainer;

    @NotNull
    private final PageModifier$callback$1 callback;

    @NotNull
    private final ViewGroup composerRootView;

    /* renamed from: coordinatorLayout$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j coordinatorLayout;
    private PageIssueStateView deathScreen;
    private double minSheetHeightRatio;
    private GeotrackingBottomOffsetDecorator recyclerDecorator;

    /* renamed from: recyclerView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j recyclerView;
    private SwipeRefreshLayout swipeLl;
    private int swipeLlIndex;

    /* renamed from: swipeToRefreshLayout$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j swipeToRefreshLayout;

    /* JADX WARN: Type inference failed for: r2v10, types: [ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation.PageModifier$callback$1] */
    public PageModifier(@NotNull WidgetGeotrackingMapV2Binding binding, @NotNull ViewGroup composerRootView, @NotNull final Function1<? super Integer, Unit> onStateChanged) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(onStateChanged, "onStateChanged");
        this.binding = binding;
        this.composerRootView = composerRootView;
        this.coordinatorLayout = k.b(new PageModifier$coordinatorLayout$2(this));
        this.swipeToRefreshLayout = k.b(new PageModifier$swipeToRefreshLayout$2(this));
        this.recyclerView = k.b(new PageModifier$recyclerView$2(this));
        this.bottomContainer = k.b(new PageModifier$bottomContainer$2(this));
        this.minSheetHeightRatio = 0.46d;
        this.callback = new BottomSheetBehavior.f() { // from class: ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation.PageModifier$callback$1
            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
            public void onSlide(View view, float value) {
                Intrinsics.checkNotNullParameter(view, "view");
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
            public void onStateChanged(View bottomSheet, int newState) {
                Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
                onStateChanged.invoke(Integer.valueOf(newState));
            }
        };
    }

    private final float calculateCollapsedHeightPx() {
        return this.composerRootView.getResources().getDisplayMetrics().heightPixels * ((float) this.minSheetHeightRatio);
    }

    private final LinearLayout getBottomContainer() {
        return (LinearLayout) this.bottomContainer.getValue();
    }

    private final CoordinatorLayout getCoordinatorLayout() {
        return (CoordinatorLayout) this.coordinatorLayout.getValue();
    }

    private final RecyclerView getRecyclerView() {
        return (RecyclerView) this.recyclerView.getValue();
    }

    private final SwipeRefreshLayout getSwipeToRefreshLayout() {
        return (SwipeRefreshLayout) this.swipeToRefreshLayout.getValue();
    }

    private final void prepareBottomSheet() {
        CoordinatorLayout coordinatorLayout = getCoordinatorLayout();
        if (coordinatorLayout == null) {
            return;
        }
        View inflate = LayoutInflater.from(coordinatorLayout.getContext()).inflate(R$layout.geotracking_v2_bottom_sheet, (ViewGroup) coordinatorLayout, false);
        Intrinsics.g(inflate, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout");
        CoordinatorLayout coordinatorLayout2 = (CoordinatorLayout) inflate;
        this.bottomSheetContainer = coordinatorLayout2;
        GeotrackingV2BottomSheetBinding bind = GeotrackingV2BottomSheetBinding.bind(coordinatorLayout2);
        this.bottomContainerBinding = bind;
        if (bind == null) {
            return;
        }
        coordinatorLayout.addView(coordinatorLayout2);
        coordinatorLayout.addView(getBottomContainer());
        BottomSheetBehavior<LinearLayout> from = BottomSheetBehavior.from(bind.bottomSheetRv);
        from.setHideable(false);
        from.setFitToContents(true);
        from.setPeekHeight((int) calculateCollapsedHeightPx());
        from.addBottomSheetCallback(this.callback);
        this.bottomSheetBehaviour = from;
        setup(getRecyclerView());
        bind.bottomSheetRv.addView(getRecyclerView());
    }

    private final void prepareScreen() {
        SwipeRefreshLayout swipeToRefreshLayout;
        CoordinatorLayout coordinatorLayout = getCoordinatorLayout();
        if (coordinatorLayout == null || (swipeToRefreshLayout = getSwipeToRefreshLayout()) == null) {
            return;
        }
        ViewExtKt.gone(swipeToRefreshLayout);
        ru.ozon.uni.android.uikitsdk.ext.ViewExtKt.removeSelf(getRecyclerView());
        this.swipeLlIndex = coordinatorLayout.indexOfChild(swipeToRefreshLayout);
        this.swipeLl = swipeToRefreshLayout;
        ru.ozon.uni.android.uikitsdk.ext.ViewExtKt.removeSelf(swipeToRefreshLayout);
        coordinatorLayout.removeView(getBottomContainer());
        coordinatorLayout.addView(this.binding.getConstraintLayout(), 0);
        PageIssueStateView k11 = C10183a.k(coordinatorLayout);
        if (k11 != null) {
            this.deathScreen = k11;
            ru.ozon.uni.android.uikitsdk.ext.ViewExtKt.removeSelf(k11);
        }
    }

    private final void setup(RecyclerView recyclerView) {
        GeotrackingBottomOffsetDecorator geotrackingBottomOffsetDecorator = this.recyclerDecorator;
        if (geotrackingBottomOffsetDecorator == null) {
            RecyclerView.g adapter = recyclerView.getAdapter();
            Intrinsics.g(adapter, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.Adapter<*>");
            geotrackingBottomOffsetDecorator = new GeotrackingBottomOffsetDecorator(adapter);
            this.recyclerDecorator = geotrackingBottomOffsetDecorator;
        }
        getRecyclerView().addItemDecoration(geotrackingBottomOffsetDecorator);
        getBottomContainer().addOnLayoutChangeListener(new b(geotrackingBottomOffsetDecorator, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setup$lambda$8(GeotrackingBottomOffsetDecorator geotrackingBottomOffsetDecorator, View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        geotrackingBottomOffsetDecorator.setBottomOffset(i14 - i12);
    }

    public final void attachToPage() {
        prepareScreen();
        prepareBottomSheet();
    }

    public final void detachFromPage() {
        ViewGroup viewGroup;
        CoordinatorLayout coordinatorLayout = getCoordinatorLayout();
        if (coordinatorLayout == null || (viewGroup = (ViewGroup) coordinatorLayout.findViewById(R$id.containerLayout)) == null) {
            return;
        }
        ru.ozon.uni.android.uikitsdk.ext.ViewExtKt.removeSelf(viewGroup);
        ru.ozon.uni.android.uikitsdk.ext.ViewExtKt.removeSelf(getRecyclerView());
        SwipeRefreshLayout swipeToRefreshLayout = getSwipeToRefreshLayout();
        if (swipeToRefreshLayout == null) {
            return;
        }
        swipeToRefreshLayout.addView(getRecyclerView(), new CoordinatorLayout.f(-1, -1));
        ViewExtKt.show(swipeToRefreshLayout);
        getRecyclerView().setBackground(null);
        ViewGroup.LayoutParams layoutParams = getRecyclerView().getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = -1;
        }
        if (C10183a.h(this.composerRootView) != null) {
            coordinatorLayout.addView(this.swipeLl, this.swipeLlIndex);
            viewGroup.addView(this.deathScreen);
        }
    }

    public final void updateMinSheetHeightRatio(double ratio) {
        this.minSheetHeightRatio = h.c(ratio, 0.0d, 1.0d);
        int calculateCollapsedHeightPx = (int) calculateCollapsedHeightPx();
        BottomSheetBehavior<LinearLayout> bottomSheetBehavior = this.bottomSheetBehaviour;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.setPeekHeight(calculateCollapsedHeightPx, true);
        }
    }
}
