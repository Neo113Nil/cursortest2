package ru.ozon.app.android.fresh.checkout.widgets.checkoutTotal.presentation;

import Sc.InterfaceC4008j;
import Vg.c;
import Vg.d;
import WZ.l;
import WZ.t;
import Xo.a;
import Xo.b;
import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.G;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import i10.l;
import java.util.List;
import jk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.cart.common.presentation.TotalVisibilityViewModel;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.composer.view.multiframebinder.BindStep;
import ru.ozon.app.android.composer.view.multiframebinder.FrameBinder;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BI\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\u0010\r\u001a\u00060\u000bj\u0002`\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u0017J\u0017\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010#\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010'\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%H\u0014¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\u00152\u0006\u0010&\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0015H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0015H\u0016¢\u0006\u0004\b.\u0010-J\u0017\u00101\u001a\u00020\u00152\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0015H\u0016¢\u0006\u0004\b3\u0010-R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00104R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00105R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00106R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00107R\u0018\u0010\r\u001a\u00060\u000bj\u0002`\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00108R\u001b\u0010>\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R \u0010A\u001a\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\u00150?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR \u0010C\u001a\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\u00150?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010BR\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020H0G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010L\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010M¨\u0006N"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/presentation/CheckoutTotalViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/presentation/CheckoutTotalVO;", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/presentation/CheckoutTotalView;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/cart/common/presentation/TotalVisibilityViewModel;", "totalVisibilityViewModel", "Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "frameBinder", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/presentation/CheckoutTotalView;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/cart/common/presentation/TotalVisibilityViewModel;Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;LWZ/l;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;LVg/d;)V", "", "bindSummary", "()Lkotlin/Unit;", "bindButton", "bindInteractionsHints", "Landroidx/lifecycle/v$a;", "event", "handleLifecycleEvent", "(Landroidx/lifecycle/v$a;)V", "item", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/presentation/CheckoutTotalVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/presentation/CheckoutTotalVO;Ll20/d;)V", "Ljk0/q;", "onVisibleAreaChanged", "(Ljk0/q;)V", "onAttach", "()V", "onDetach", "", "offscreenOffsetPercent", "onOffscreenPositionChanged", "(F)V", "onRecycle", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/presentation/CheckoutTotalView;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/cart/common/presentation/TotalVisibilityViewModel;", "Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "LWZ/l;", "LVg/c;", "customActionHandlersStore$delegate", "LSc/j;", "getCustomActionHandlersStore", "()LVg/c;", "customActionHandlersStore", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "infoBadgeActionHandler", "Landroid/graphics/Rect;", "viewVisibleRect", "Landroid/graphics/Rect;", "", "Lru/ozon/app/android/composer/view/multiframebinder/BindStep;", "steps", "Ljava/util/List;", "Landroidx/lifecycle/G;", "lifecycleObserver", "Landroidx/lifecycle/G;", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CheckoutTotalViewHolder extends k<CheckoutTotalVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final CheckoutTotalView containerView;

    /* renamed from: customActionHandlersStore$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j customActionHandlersStore;
    private final FrameBinder frameBinder;

    @NotNull
    private final Function1<AtomAction, Unit> infoBadgeActionHandler;

    @NotNull
    private final G lifecycleObserver;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final List<BindStep> steps;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final TotalVisibilityViewModel totalVisibilityViewModel;

    @NotNull
    private final Rect viewVisibleRect;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AbstractC5434v.a.values().length];
            try {
                iArr[AbstractC5434v.a.ON_DESTROY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC5434v.a.ON_PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutTotalViewHolder(@NotNull CheckoutTotalView containerView, @NotNull ComposerReferences refs, @NotNull TotalVisibilityViewModel totalVisibilityViewModel, FrameBinder frameBinder, @NotNull l tokenizedAnalytics, @NotNull HandlersInhibitor handlersInhibitor, @NotNull d customActionHandlersStoreFactory) {
        super(containerView);
        AbstractC5434v lifecycle;
        View view;
        int i11 = 0;
        int i12 = 2;
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(totalVisibilityViewModel, "totalVisibilityViewModel");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(handlersInhibitor, "handlersInhibitor");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        this.containerView = containerView;
        this.refs = refs;
        this.totalVisibilityViewModel = totalVisibilityViewModel;
        this.frameBinder = frameBinder;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.customActionHandlersStore = Sc.k.b(new CheckoutTotalViewHolder$customActionHandlersStore$2(customActionHandlersStoreFactory));
        int i13 = 1;
        this.actionHandler = new ActionHandler.Builder(refs, this).configureBottomSheetWrapContent(true).customActionHandlers(new C(this) { // from class: ru.ozon.app.android.fresh.checkout.widgets.checkoutTotal.presentation.CheckoutTotalViewHolder$actionHandler$1
            @Override // kotlin.jvm.internal.C, kotlin.reflect.n
            public Object get() {
                c customActionHandlersStore;
                customActionHandlersStore = ((CheckoutTotalViewHolder) this.receiver).getCustomActionHandlersStore();
                return customActionHandlersStore;
            }
        }).onPreProcess(new CheckoutTotalViewHolder$actionHandler$2(this)).buildHandler();
        this.infoBadgeActionHandler = new ActionHandler.Builder(refs, this).configureBottomSheetWrapContent(true).enableClickThrottling(handlersInhibitor).buildHandler();
        this.viewVisibleRect = new Rect();
        RecyclerView recyclerView = null;
        List<BindStep> b02 = frameBinder != null ? C7714v.b0(new cT.c(this, i13), new a(this, i12), new b(this, i12)) : null;
        this.steps = b02 == null ? K.f71697a : b02;
        eu.a aVar = new eu.a(this, i11);
        this.lifecycleObserver = aVar;
        if (frameBinder != null) {
            View itemView = this.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            frameBinder.init(itemView);
        }
        if (frameBinder != null) {
            ComponentCallbacksC5392m c11 = refs.getContainer().c();
            if (c11 != null && (view = c11.getView()) != null) {
                recyclerView = ComposerViewExtensionKt.composerRecyclerView(view);
            }
            frameBinder.applyRecycler(recyclerView);
        }
        ComponentCallbacksC5392m c12 = refs.getContainer().c();
        if (c12 == null || (lifecycle = c12.getLifecycle()) == null) {
            return;
        }
        lifecycle.a(aVar);
    }

    private final Unit bindButton() {
        CheckoutTotalVO boundData = getBoundData();
        if (boundData == null) {
            return null;
        }
        this.containerView.bindButton(boundData.getInteractiveActions().getButton(), this.actionHandler);
        return Unit.f71690a;
    }

    private final Unit bindInteractionsHints() {
        CheckoutTotalVO boundData = getBoundData();
        if (boundData == null) {
            return null;
        }
        this.containerView.bindInteractionsHints(boundData.getInteractiveActions().getHints(), this.actionHandler);
        return Unit.f71690a;
    }

    private final Unit bindSummary() {
        CheckoutTotalVO boundData = getBoundData();
        if (boundData == null) {
            return null;
        }
        this.containerView.bindSummary(boundData.getSummary(), boundData.getBackgroundColor(), this.actionHandler, this.infoBadgeActionHandler);
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c getCustomActionHandlersStore() {
        return (c) this.customActionHandlersStore.getValue();
    }

    private final void handleLifecycleEvent(AbstractC5434v.a event) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
        if (i11 == 1) {
            getLifecycle().e(this.lifecycleObserver);
            return;
        }
        int i12 = 2;
        if (i11 != 2) {
            return;
        }
        this.refs.getController().e(new l.a.C1079a(0L, null, i12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lifecycleObserver$lambda$4(CheckoutTotalViewHolder checkoutTotalViewHolder, J j11, AbstractC5434v.a event) {
        Intrinsics.checkNotNullParameter(j11, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        checkoutTotalViewHolder.handleLifecycleEvent(event);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit steps$lambda$3$lambda$0(CheckoutTotalViewHolder checkoutTotalViewHolder) {
        checkoutTotalViewHolder.bindSummary();
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit steps$lambda$3$lambda$1(CheckoutTotalViewHolder checkoutTotalViewHolder) {
        checkoutTotalViewHolder.bindButton();
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit steps$lambda$3$lambda$2(CheckoutTotalViewHolder checkoutTotalViewHolder) {
        checkoutTotalViewHolder.bindInteractionsHints();
        return Unit.f71690a;
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        FrameBinder frameBinder = this.frameBinder;
        if (frameBinder != null) {
            FrameBinder.DefaultImpls.onAttach$default(frameBinder, null, 1, null);
        }
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        if (this.refs.getContainer().f().getLifecycle().b().a(AbstractC5434v.b.STARTED)) {
            this.totalVisibilityViewModel.notifyVisibility(false);
        }
        FrameBinder frameBinder = this.frameBinder;
        if (frameBinder != null) {
            frameBinder.onDetach();
        }
    }

    @Override // jk0.j, lk0.b
    public void onOffscreenPositionChanged(float offscreenOffsetPercent) {
        super.onOffscreenPositionChanged(offscreenOffsetPercent);
        FrameBinder frameBinder = this.frameBinder;
        if (frameBinder != null) {
            frameBinder.onOffscreenPositionChanged(offscreenOffsetPercent);
        }
    }

    @Override // jk0.j
    public void onRecycle() {
        super.onRecycle();
        FrameBinder frameBinder = this.frameBinder;
        if (frameBinder != null) {
            frameBinder.onRecycle();
        }
    }

    @Override // jk0.j, jk0.n
    public void onVisibleAreaChanged(@NotNull q info) {
        float viewVisiblePercentIgnoreBottomContainer;
        Intrinsics.checkNotNullParameter(info, "info");
        super.onVisibleAreaChanged(info);
        viewVisiblePercentIgnoreBottomContainer = CheckoutTotalViewHolderKt.getViewVisiblePercentIgnoreBottomContainer(info.a(), this.containerView.m738getButtonView(), this.viewVisibleRect);
        this.totalVisibilityViewModel.notifyVisibility(viewVisiblePercentIgnoreBottomContainer >= 0.5f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull CheckoutTotalVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        FrameBinder frameBinder = this.frameBinder;
        if (frameBinder != null) {
            frameBinder.bind(this.steps, item.getViewItemKey());
            return;
        }
        bindSummary();
        bindButton();
        bindInteractionsHints();
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull CheckoutTotalVO item, @NotNull W10.c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t trackingInfo = item.getTrackingInfo();
        if (trackingInfo != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, trackingInfo, null, 2, null);
        }
    }
}
