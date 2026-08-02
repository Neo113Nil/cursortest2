package ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import android.widget.LinearLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import d20.AbstractC6064a;
import d20.InterfaceC6068e;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.universalscreen.view.BottomSheetComposerFragment;
import ru.ozon.app.android.fresh.unsorted.databinding.DeliveryWidgetV2Binding;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.presentation.DeliveryWidgetV2OverlayViewHolder$widgetViewHolderLifecycleObserver$2;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.presentation.DeliveryWidgetV2VO;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.presentation.utils.DeliveryWidgetV2AnimationDelegate;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.presentation.utils.DeliveryWidgetV2Binder;
import ru.ozon.app.android.navigation.miniapp.MiniAppExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.B0;
import xe.M;

@Metadata(d1 = {"\u0000\u008f\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001:\b\u0001\u0018\u0000 G2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001GBK\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001f\u001a\u00020\u0016*\u00020\u00072\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00160\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!*\u00020\u0007H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0016H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\u0002H\u0016¢\u0006\u0004\b(\u0010\u0018J\u000f\u0010)\u001a\u00020\u0016H\u0016¢\u0006\u0004\b)\u0010&R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010*R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010+R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010,R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010-R'\u00104\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u00160.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001b\u00109\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u00101\u001a\u0004\b7\u00108R\u001b\u0010>\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u00101\u001a\u0004\b<\u0010=R\u0018\u0010@\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u001b\u0010F\u001a\u00020B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u00101\u001a\u0004\bD\u0010E¨\u0006H"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/DeliveryWidgetV2OverlayViewHolder;", "Ld20/a;", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/DeliveryWidgetV2VO;", "Ll10/i;", "container", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/DeliveryWidgetV2ViewModel;", "viewModel", "Landroidx/fragment/app/G;", "fragmentManager", "Lxe/M;", "coroutineScope", "Lru/ozon/app/android/fresh/unsorted/databinding/DeliveryWidgetV2Binding;", "binding", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Ll10/i;Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/DeliveryWidgetV2ViewModel;Landroidx/fragment/app/G;Lxe/M;Lru/ozon/app/android/fresh/unsorted/databinding/DeliveryWidgetV2Binding;LWZ/l;Ld20/e;)V", "data", "", "rebind", "(Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/DeliveryWidgetV2VO;)V", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/DeliveryWidgetV2VO$SellerVOWidget;", "vo", "handleCurtainAction", "(Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/DeliveryWidgetV2VO$SellerVOWidget;)V", "Lkotlin/Function0;", "onClose", "setBottomSheetCloseListener", "(Landroidx/fragment/app/G;Lkotlin/jvm/functions/Function0;)V", "", "Lru/ozon/app/android/composer/universalscreen/view/BottomSheetComposerFragment;", "getBottomSheetComposerFragments", "(Landroidx/fragment/app/G;)Ljava/util/List;", "onWidgetCreated", "()V", "item", "bind", "onWidgetDestroyed", "Ll10/i;", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/DeliveryWidgetV2ViewModel;", "Landroidx/fragment/app/G;", "Lxe/M;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler$delegate", "LSc/j;", "getActionHandler", "()Lkotlin/jvm/functions/Function1;", "actionHandler", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/utils/DeliveryWidgetV2AnimationDelegate;", "animationDelegate$delegate", "getAnimationDelegate", "()Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/utils/DeliveryWidgetV2AnimationDelegate;", "animationDelegate", "ru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/DeliveryWidgetV2OverlayViewHolder$widgetViewHolderLifecycleObserver$2$1", "widgetViewHolderLifecycleObserver$delegate", "getWidgetViewHolderLifecycleObserver", "()Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/DeliveryWidgetV2OverlayViewHolder$widgetViewHolderLifecycleObserver$2$1;", "widgetViewHolderLifecycleObserver", "Lxe/B0;", "curtainListenerJob", "Lxe/B0;", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/utils/DeliveryWidgetV2Binder;", "binder$delegate", "getBinder", "()Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/utils/DeliveryWidgetV2Binder;", "binder", "Companion", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DeliveryWidgetV2OverlayViewHolder extends AbstractC6064a<DeliveryWidgetV2VO> {

    /* renamed from: actionHandler$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j actionHandler;

    /* renamed from: animationDelegate$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j animationDelegate;

    /* renamed from: binder$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j binder;

    @NotNull
    private final i container;

    @NotNull
    private final M coroutineScope;
    private B0 curtainListenerJob;
    private final G fragmentManager;

    @NotNull
    private final DeliveryWidgetV2ViewModel viewModel;

    /* renamed from: widgetViewHolderLifecycleObserver$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j widgetViewHolderLifecycleObserver;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/DeliveryWidgetV2OverlayViewHolder$Companion;", "", "<init>", "()V", "DELIVERY_WIDGET_DELAY", "", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryWidgetV2OverlayViewHolder(@NotNull i container, @NotNull DeliveryWidgetV2ViewModel viewModel, G g10, @NotNull M coroutineScope, @NotNull DeliveryWidgetV2Binding binding, @NotNull l tokenizedAnalytics, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.container = container;
        this.viewModel = viewModel;
        this.fragmentManager = g10;
        this.coroutineScope = coroutineScope;
        this.actionHandler = k.b(new DeliveryWidgetV2OverlayViewHolder$actionHandler$2(this));
        this.animationDelegate = k.b(new DeliveryWidgetV2OverlayViewHolder$animationDelegate$2(binding, this));
        this.widgetViewHolderLifecycleObserver = k.b(new DeliveryWidgetV2OverlayViewHolder$widgetViewHolderLifecycleObserver$2(this));
        this.binder = k.b(new DeliveryWidgetV2OverlayViewHolder$binder$2(binding, tokenizedAnalytics, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Function1<AtomAction, Unit> getActionHandler() {
        return (Function1) this.actionHandler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeliveryWidgetV2AnimationDelegate getAnimationDelegate() {
        return (DeliveryWidgetV2AnimationDelegate) this.animationDelegate.getValue();
    }

    private final DeliveryWidgetV2Binder getBinder() {
        return (DeliveryWidgetV2Binder) this.binder.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<BottomSheetComposerFragment> getBottomSheetComposerFragments(G g10) {
        List<ComponentCallbacksC5392m> r02 = g10.r0();
        Intrinsics.checkNotNullExpressionValue(r02, "getFragments(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : r02) {
            if (obj instanceof BottomSheetComposerFragment) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final DeliveryWidgetV2OverlayViewHolder$widgetViewHolderLifecycleObserver$2.AnonymousClass1 getWidgetViewHolderLifecycleObserver() {
        return (DeliveryWidgetV2OverlayViewHolder$widgetViewHolderLifecycleObserver$2.AnonymousClass1) this.widgetViewHolderLifecycleObserver.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleCurtainAction(DeliveryWidgetV2VO.SellerVOWidget vo) {
        DeliveryWidgetV2AnimationDelegate.animateDisappear$default(getAnimationDelegate(), 0L, 1, null);
        AtomAction forceAction = vo.getForceAction();
        if (forceAction != null) {
            getActionHandler().invoke(forceAction);
            G g10 = this.fragmentManager;
            if (g10 != null) {
                setBottomSheetCloseListener(g10, new DeliveryWidgetV2OverlayViewHolder$handleCurtainAction$1$1(this, vo));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void rebind(DeliveryWidgetV2VO data) {
        if (data instanceof DeliveryWidgetV2VO.OzonDeliveryVOWidget) {
            getBinder().bind((DeliveryWidgetV2VO.OzonDeliveryVOWidget) data);
        } else if (data instanceof DeliveryWidgetV2VO.SellerVOWidget) {
            getBinder().bind((DeliveryWidgetV2VO.SellerVOWidget) data);
        } else {
            DeliveryWidgetV2AnimationDelegate.animateDisappear$default(getAnimationDelegate(), 0L, 1, null);
        }
    }

    private final void setBottomSheetCloseListener(final G g10, final Function0<Unit> function0) {
        final BottomSheetComposerFragment bottomSheetComposerFragment = (BottomSheetComposerFragment) C7714v.M(getBottomSheetComposerFragments(g10));
        if (bottomSheetComposerFragment != null) {
            bottomSheetComposerFragment.getLifecycle().a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.presentation.DeliveryWidgetV2OverlayViewHolder$setBottomSheetCloseListener$1$1
                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onStop(J owner) {
                    List bottomSheetComposerFragments;
                    Intrinsics.checkNotNullParameter(owner, "owner");
                    super.onStop(owner);
                    bottomSheetComposerFragments = DeliveryWidgetV2OverlayViewHolder.this.getBottomSheetComposerFragments(g10);
                    if (bottomSheetComposerFragments.isEmpty()) {
                        bottomSheetComposerFragment.getLifecycle().e(this);
                        function0.invoke();
                    }
                }
            });
        }
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        super.onWidgetCreated();
        getLifecycle().a(getWidgetViewHolderLifecycleObserver());
        getAnimationDelegate().prepare();
        C2399j.C(new C2408n0(C5427n.a(this.viewModel.getDeliveryWidgetAction(), getLifecycle(), AbstractC5434v.b.STARTED), new DeliveryWidgetV2OverlayViewHolder$onWidgetCreated$1(this, null)), K.a(this));
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        super.onWidgetDestroyed();
        getLifecycle().e(getWidgetViewHolderLifecycleObserver());
        getAnimationDelegate().clear();
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull DeliveryWidgetV2VO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.viewModel.setInitialData(item.getWidgetInfo(), MiniAppExtKt.isExpress(this.container.L()), item.getAvailableDeliverySchemas());
    }
}
