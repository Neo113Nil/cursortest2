package ru.ozon.app.android.account.orders.barcode.presentation;

import Vg.c;
import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.barcode.ViewExtKt;
import ru.ozon.app.android.account.orders.barcode.presentation.BarcodeVO;
import ru.ozon.app.android.account.orders.barcode.presentation.decoration.BarcodeDecoration;
import ru.ozon.app.android.account.orders.barcode.presentation.viewmodel.BarcodeViewModel;
import ru.ozon.app.android.account.orders.commonBarcodeV2.ShareBarcodeBottomSheetFragment;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.barcodecache.drawable.BarcodeDrawableCache;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.BaseOnBoardingViewModel;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingCutConfig;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegate;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegateImpl;
import ru.ozon.app.android.cs_orders.R$id;
import ru.ozon.app.android.cs_orders.databinding.WidgetBarcodeBinding;
import ru.ozon.app.android.delivery.common.AppTokensProvider;
import ru.ozon.app.android.storefront.navBar.NavBarDTO;
import ru.ozon.app.android.util.screenshottracker.ScreenshotTracker;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 ?2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001?BC\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ\u001f\u0010 \u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001eH\u0014¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010%R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010&R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010'R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010(R \u0010+\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00160)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00104\u001a\u0004\u0018\u0001038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010:\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006@"}, d2 = {"Lru/ozon/app/android/account/orders/barcode/presentation/BarcodeViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/account/orders/barcode/presentation/BarcodeVO;", "Lru/ozon/app/android/cs_orders/databinding/WidgetBarcodeBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/account/orders/barcode/presentation/viewmodel/BarcodeViewModel;", "viewModel", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;", "onboardingViewModel", "Lru/ozon/app/android/barcodecache/drawable/BarcodeDrawableCache;", "barcodeDrawableCache", "LVg/c;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStore;", "customActionHandlersStore", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "<init>", "(Lru/ozon/app/android/cs_orders/databinding/WidgetBarcodeBinding;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/account/orders/barcode/presentation/viewmodel/BarcodeViewModel;Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;Lru/ozon/app/android/barcodecache/drawable/BarcodeDrawableCache;LVg/c;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;)V", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onboarding", "", "showOnboarding", "(Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;)V", "initOnboarding", "onViewInVisibleBounds", "()V", "onViewOutOfVisibleBounds", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/account/orders/barcode/presentation/BarcodeVO;Ll20/d;)V", "Ljk0/q;", "onVisibleAreaChanged", "(Ljk0/q;)V", "Lru/ozon/app/android/cs_orders/databinding/WidgetBarcodeBinding;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/account/orders/barcode/presentation/viewmodel/BarcodeViewModel;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/account/orders/barcode/presentation/BarcodeAdapter;", "adapter", "Lru/ozon/app/android/account/orders/barcode/presentation/BarcodeAdapter;", "Lru/ozon/app/android/account/orders/barcode/presentation/decoration/BarcodeDecoration;", "itemDecoration", "Lru/ozon/app/android/account/orders/barcode/presentation/decoration/BarcodeDecoration;", "Landroid/view/View;", "screenContainerView", "Landroid/view/View;", "Lru/ozon/app/android/account/orders/barcode/presentation/ExpandableRecyclerViewController;", "expandableRecyclerViewController", "Lru/ozon/app/android/account/orders/barcode/presentation/ExpandableRecyclerViewController;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingDelegate;", "onboardingDelegate", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingDelegate;", "Lru/ozon/app/android/util/screenshottracker/ScreenshotTracker;", "screenshotTracker", "Lru/ozon/app/android/util/screenshottracker/ScreenshotTracker;", "Companion", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BarcodeViewHolder extends k<BarcodeVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final BarcodeAdapter adapter;

    @NotNull
    private final WidgetBarcodeBinding binding;

    @NotNull
    private final ExpandableRecyclerViewController expandableRecyclerViewController;

    @NotNull
    private final BarcodeDecoration itemDecoration;
    private OnBoardingDelegate onboardingDelegate;

    @NotNull
    private final BaseOnBoardingViewModel onboardingViewModel;

    @NotNull
    private final ComposerReferences refs;
    private final View screenContainerView;

    @NotNull
    private final ScreenshotTracker screenshotTracker;

    @NotNull
    private final BarcodeViewModel viewModel;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int ONBOARDING_VERTICAL_MARGIN = UiExtKt.toPx(16);
    private static final int ONBOARDING_HORIZONTAL_MARGIN = UiExtKt.toPx(14);

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", NavBarDTO.NESTED_PLACEHOLDER_EXPANDED, "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.account.orders.barcode.presentation.BarcodeViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<Boolean, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean bool) {
            BarcodeViewHolder.this.adapter.setExpanded(bool.booleanValue());
            BarcodeViewHolder.this.itemDecoration.setExpanded(bool.booleanValue());
            ExpandableRecyclerViewController expandableRecyclerViewController = BarcodeViewHolder.this.expandableRecyclerViewController;
            RecyclerView barcodesRv = BarcodeViewHolder.this.binding.barcodesRv;
            Intrinsics.checkNotNullExpressionValue(barcodesRv, "barcodesRv");
            expandableRecyclerViewController.updateState(barcodesRv, bool.booleanValue());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.account.orders.barcode.presentation.BarcodeViewHolder$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function0<Unit> {
        AnonymousClass3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            List<BarcodeVO.Shipment> shipments;
            BarcodeVO.Shipment shipment;
            String code;
            BarcodeVO boundData;
            List<BarcodeVO.Shipment> shipments2;
            BarcodeVO.Shipment shipment2;
            String hint;
            List<ComponentCallbacksC5392m> r02 = BarcodeViewHolder.this.refs.getContainer().k().r0();
            Intrinsics.checkNotNullExpressionValue(r02, "getFragments(...)");
            List<ComponentCallbacksC5392m> list = r02;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (((ComponentCallbacksC5392m) it.next()) instanceof DialogInterfaceOnCancelListenerC5390k) {
                        return;
                    }
                }
            }
            BarcodeVO boundData2 = BarcodeViewHolder.this.getBoundData();
            if (boundData2 == null || (shipments = boundData2.getShipments()) == null || (shipment = (BarcodeVO.Shipment) C7714v.M(shipments)) == null || (code = shipment.getCode()) == null || (boundData = BarcodeViewHolder.this.getBoundData()) == null || (shipments2 = boundData.getShipments()) == null || (shipment2 = (BarcodeVO.Shipment) C7714v.M(shipments2)) == null || (hint = shipment2.getHint()) == null) {
                return;
            }
            ShareBarcodeBottomSheetFragment.Companion.newInstance$default(ShareBarcodeBottomSheetFragment.INSTANCE, code, hint, null, 4, null).show(BarcodeViewHolder.this.refs.getContainer().k(), (String) null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/account/orders/barcode/presentation/BarcodeViewHolder$Companion;", "", "<init>", "()V", "", "WIDGET_KEY", "Ljava/lang/String;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BarcodeViewHolder(@NotNull WidgetBarcodeBinding binding, @NotNull ComposerReferences refs, @NotNull BarcodeViewModel viewModel, @NotNull BaseOnBoardingViewModel onboardingViewModel, @NotNull BarcodeDrawableCache barcodeDrawableCache, @NotNull c customActionHandlersStore, @NotNull HandlersInhibitor handlersInhibitor) {
        super(r0);
        RecyclerView composerRecyclerViewOrNull;
        RecyclerView composerRecyclerViewOrNull2;
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(onboardingViewModel, "onboardingViewModel");
        Intrinsics.checkNotNullParameter(barcodeDrawableCache, "barcodeDrawableCache");
        Intrinsics.checkNotNullParameter(customActionHandlersStore, "customActionHandlersStore");
        Intrinsics.checkNotNullParameter(handlersInhibitor, "handlersInhibitor");
        RecyclerView constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.refs = refs;
        this.viewModel = viewModel;
        this.onboardingViewModel = onboardingViewModel;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).enableClickThrottling(handlersInhibitor).customActionHandlers(new BarcodeViewHolder$actionHandler$1(customActionHandlersStore)).buildHandler();
        this.actionHandler = buildHandler;
        BarcodeAdapter barcodeAdapter = new BarcodeAdapter(buildHandler, barcodeDrawableCache);
        this.adapter = barcodeAdapter;
        BarcodeDecoration barcodeDecoration = new BarcodeDecoration(AppTokensProvider.INSTANCE.isSelect(getContext()));
        this.itemDecoration = barcodeDecoration;
        ComponentCallbacksC5392m c11 = refs.getContainer().c();
        View view = c11 != null ? c11.getView() : null;
        this.screenContainerView = view;
        int i11 = 0;
        int width = (view == null || (composerRecyclerViewOrNull2 = ComposerViewExtensionKt.composerRecyclerViewOrNull(view)) == null) ? 0 : composerRecyclerViewOrNull2.getWidth();
        if (view != null && (composerRecyclerViewOrNull = ComposerViewExtensionKt.composerRecyclerViewOrNull(view)) != null) {
            i11 = composerRecyclerViewOrNull.getHeight();
        }
        this.expandableRecyclerViewController = new ExpandableRecyclerViewController(width, i11, 0, 0, 8, null);
        viewModel.getExpanded().observe(refs.getContainer().g(), new BarcodeViewHolder$sam$androidx_lifecycle_Observer$0(new AnonymousClass1()));
        RecyclerView recyclerView = binding.barcodesRv;
        recyclerView.setAdapter(barcodeAdapter);
        recyclerView.addItemDecoration(barcodeDecoration);
        this.screenshotTracker = ScreenshotTracker.INSTANCE.create(refs.getContainer().i(), new AnonymousClass3());
    }

    private final void initOnboarding(OnBoardingDTO onboarding) {
        OnBoardingDelegateImpl onBoardingDelegateImpl = new OnBoardingDelegateImpl("csma.barcode_onboarding", this.refs, this.itemView, onboarding, this, this.onboardingViewModel, null, 0.0f, 192, null);
        onBoardingDelegateImpl.setOnShownListener(new BarcodeViewHolder$initOnboarding$1$1(this));
        this.onboardingDelegate = onBoardingDelegateImpl;
    }

    private final void showOnboarding(OnBoardingDTO onboarding) {
        View findViewById;
        OnBoardingDelegate onBoardingDelegate;
        if (onboarding != null) {
            if (this.onboardingDelegate == null) {
                initOnboarding(onboarding);
            }
            RecyclerView constraintLayout = this.binding.getConstraintLayout();
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
            if (!constraintLayout.isLaidOut() || constraintLayout.isLayoutRequested()) {
                constraintLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.account.orders.barcode.presentation.BarcodeViewHolder$showOnboarding$$inlined$doOnLayout$1
                    @Override // android.view.View.OnLayoutChangeListener
                    public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                        View findViewById2;
                        OnBoardingDelegate onBoardingDelegate2;
                        view.removeOnLayoutChangeListener(this);
                        RecyclerView constraintLayout2 = BarcodeViewHolder.this.binding.getConstraintLayout();
                        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "getRoot(...)");
                        View first = ViewGroupExtKt.first(constraintLayout2);
                        if (first == null || (findViewById2 = first.findViewById(R$id.barcodeIv)) == null || (onBoardingDelegate2 = BarcodeViewHolder.this.onboardingDelegate) == null) {
                            return;
                        }
                        BarcodeViewHolder barcodeViewHolder = BarcodeViewHolder.this;
                        int topLocationInWindow = ViewExtKt.getTopLocationInWindow(findViewById2);
                        RecyclerView constraintLayout3 = BarcodeViewHolder.this.binding.getConstraintLayout();
                        Intrinsics.checkNotNullExpressionValue(constraintLayout3, "getRoot(...)");
                        Integer valueOf = Integer.valueOf((topLocationInWindow - ViewExtKt.getTopLocationInWindow(constraintLayout3)) - BarcodeViewHolder.ONBOARDING_VERTICAL_MARGIN);
                        RecyclerView constraintLayout4 = BarcodeViewHolder.this.binding.getConstraintLayout();
                        Intrinsics.checkNotNullExpressionValue(constraintLayout4, "getRoot(...)");
                        OnBoardingDelegate.DefaultImpls.bind$default(onBoardingDelegate2, barcodeViewHolder, new OnBoardingCutConfig(null, valueOf, null, Integer.valueOf((ViewExtKt.getBottomLocationInWindow(constraintLayout4) - ViewExtKt.getBottomLocationInWindow(findViewById2)) - BarcodeViewHolder.ONBOARDING_VERTICAL_MARGIN), null, Integer.valueOf(ThemeExtKt.isDarkThemeActive(BarcodeViewHolder.this.getContext()) ? 0 : BarcodeViewHolder.ONBOARDING_HORIZONTAL_MARGIN), null, false, 85, null), null, 4, null);
                    }
                });
                return;
            }
            RecyclerView constraintLayout2 = this.binding.getConstraintLayout();
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "getRoot(...)");
            View first = ViewGroupExtKt.first(constraintLayout2);
            if (first != null && (findViewById = first.findViewById(R$id.barcodeIv)) != null && (onBoardingDelegate = this.onboardingDelegate) != null) {
                int topLocationInWindow = ViewExtKt.getTopLocationInWindow(findViewById);
                RecyclerView constraintLayout3 = this.binding.getConstraintLayout();
                Intrinsics.checkNotNullExpressionValue(constraintLayout3, "getRoot(...)");
                Integer valueOf = Integer.valueOf((topLocationInWindow - ViewExtKt.getTopLocationInWindow(constraintLayout3)) - ONBOARDING_VERTICAL_MARGIN);
                RecyclerView constraintLayout4 = this.binding.getConstraintLayout();
                Intrinsics.checkNotNullExpressionValue(constraintLayout4, "getRoot(...)");
                OnBoardingDelegate.DefaultImpls.bind$default(onBoardingDelegate, this, new OnBoardingCutConfig(null, valueOf, null, Integer.valueOf((ViewExtKt.getBottomLocationInWindow(constraintLayout4) - ViewExtKt.getBottomLocationInWindow(findViewById)) - ONBOARDING_VERTICAL_MARGIN), null, Integer.valueOf(ThemeExtKt.isDarkThemeActive(getContext()) ? 0 : ONBOARDING_HORIZONTAL_MARGIN), null, false, 85, null), null, 4, null);
            }
        }
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        super.onViewInVisibleBounds();
        this.screenshotTracker.start();
    }

    @Override // jk0.j, lk0.b
    public void onViewOutOfVisibleBounds() {
        super.onViewOutOfVisibleBounds();
        this.screenshotTracker.stop();
    }

    @Override // jk0.j, jk0.n
    public void onVisibleAreaChanged(@NotNull q info) {
        Intrinsics.checkNotNullParameter(info, "info");
        super.onVisibleAreaChanged(info);
        Rect e11 = info.a().e();
        if (e11.height() <= 0) {
            return;
        }
        ExpandableRecyclerViewController expandableRecyclerViewController = this.expandableRecyclerViewController;
        RecyclerView barcodesRv = this.binding.barcodesRv;
        Intrinsics.checkNotNullExpressionValue(barcodesRv, "barcodesRv");
        expandableRecyclerViewController.updateScreenSize(barcodesRv, e11.width(), e11.height());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull BarcodeVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.adapter.submitList(item.getShipments());
        this.viewModel.setExpanded(item.getIsExpanded());
        this.itemDecoration.setExpanded(item.getIsExpanded());
        showOnboarding(item.getOnboarding());
    }
}
