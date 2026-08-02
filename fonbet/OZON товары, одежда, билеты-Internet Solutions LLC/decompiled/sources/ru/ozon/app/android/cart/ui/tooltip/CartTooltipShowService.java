package ru.ozon.app.android.cart.ui.tooltip;

import A00.a;
import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.s;
import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.ui.tooltip.molecule.TooltipWithOnboardingActionVO;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.B0;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0002+.\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJQ\u0010\u0017\u001a\u00020\u00152\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001b\u0010\u001aJW\u0010\u001c\u001a\u00020\u00152\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013¢\u0006\u0004\b\u001c\u0010\u0018JK\u0010\u001c\u001a\u00020\u00152\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00042\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013¢\u0006\u0004\b\u001c\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010!R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u001e\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00104\u001a\u0004\u0018\u0001018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00065"}, d2 = {"Lru/ozon/app/android/cart/ui/tooltip/CartTooltipShowService;", "", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "", "dismissOnScroll", "dismissOnReloadComposerEvent", "dismissByTouchOutside", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;ZZZ)V", "Lru/ozon/app/android/cart/ui/tooltip/CartTooltipVO;", "tooltip", "Landroid/view/View;", "anchor", "", "marginFromAnchor", "centerAboutAnchor", "", "dismissTimeout", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "doShowTooltip", "(Lru/ozon/app/android/cart/ui/tooltip/CartTooltipVO;Landroid/view/View;IZLjava/lang/Long;Lkotlin/jvm/functions/Function1;)V", "dismissTooltip", "()V", "subscribeToDismissEvents", "showTooltipIfNeed", "Lru/ozon/app/android/cart/ui/tooltip/molecule/TooltipWithOnboardingActionVO;", "molecule", "(Lru/ozon/app/android/cart/ui/tooltip/molecule/TooltipWithOnboardingActionVO;Landroid/view/View;IZLkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "Z", "Lru/ozon/app/android/cart/ui/tooltip/CartTooltipHelper;", "tooltipHelper", "Lru/ozon/app/android/cart/ui/tooltip/CartTooltipHelper;", "Lxe/B0;", "reloadEventListenerJob", "Lxe/B0;", "Lkotlin/Function0;", "pendingShow", "Lkotlin/jvm/functions/Function0;", "ru/ozon/app/android/cart/ui/tooltip/CartTooltipShowService$scrollListener$1", "scrollListener", "Lru/ozon/app/android/cart/ui/tooltip/CartTooltipShowService$scrollListener$1;", "ru/ozon/app/android/cart/ui/tooltip/CartTooltipShowService$waitIdleListener$1", "waitIdleListener", "Lru/ozon/app/android/cart/ui/tooltip/CartTooltipShowService$waitIdleListener$1;", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CartTooltipShowService {
    private final boolean dismissByTouchOutside;
    private final boolean dismissOnReloadComposerEvent;
    private final boolean dismissOnScroll;
    private Function0<Unit> pendingShow;

    @NotNull
    private final ComposerReferences references;
    private B0 reloadEventListenerJob;

    @NotNull
    private final CartTooltipShowService$scrollListener$1 scrollListener;

    @NotNull
    private final CartTooltipHelper tooltipHelper;

    @NotNull
    private final CartTooltipShowService$waitIdleListener$1 waitIdleListener;

    /* JADX WARN: Type inference failed for: r2v3, types: [ru.ozon.app.android.cart.ui.tooltip.CartTooltipShowService$scrollListener$1] */
    /* JADX WARN: Type inference failed for: r2v4, types: [ru.ozon.app.android.cart.ui.tooltip.CartTooltipShowService$waitIdleListener$1] */
    public CartTooltipShowService(@NotNull ComposerReferences references, boolean z11, boolean z12, boolean z13) {
        Intrinsics.checkNotNullParameter(references, "references");
        this.references = references;
        this.dismissOnScroll = z11;
        this.dismissOnReloadComposerEvent = z12;
        this.dismissByTouchOutside = z13;
        this.tooltipHelper = new CartTooltipHelper(references.getContainer().j());
        this.scrollListener = new RecyclerView.t() { // from class: ru.ozon.app.android.cart.ui.tooltip.CartTooltipShowService$scrollListener$1
            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                CartTooltipShowService.this.dismissTooltip();
                recyclerView.removeOnScrollListener(this);
            }
        };
        this.waitIdleListener = new RecyclerView.t() { // from class: ru.ozon.app.android.cart.ui.tooltip.CartTooltipShowService$waitIdleListener$1
            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                Function0 function0;
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                if (newState == 0) {
                    recyclerView.removeOnScrollListener(this);
                    function0 = CartTooltipShowService.this.pendingShow;
                    if (function0 != null) {
                        CartTooltipShowService.this.pendingShow = null;
                        function0.invoke();
                    }
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dismissTooltip() {
        ComponentCallbacksC5392m c11;
        View view;
        RecyclerView composerRecyclerView;
        this.tooltipHelper.onDismissTooltip();
        this.pendingShow = null;
        RecyclerView recyclerView = getRecyclerView();
        if (recyclerView != null) {
            recyclerView.removeOnScrollListener(this.waitIdleListener);
        }
        if (this.dismissOnScroll && (c11 = this.references.getContainer().c()) != null && (view = c11.getView()) != null && (composerRecyclerView = ComposerViewExtensionKt.composerRecyclerView(view)) != null) {
            composerRecyclerView.removeOnScrollListener(this.scrollListener);
        }
        B0 b02 = this.reloadEventListenerJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.reloadEventListenerJob = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void doShowTooltip(CartTooltipVO tooltip, View anchor, int marginFromAnchor, boolean centerAboutAnchor, Long dismissTimeout, Function1<? super AtomAction, Unit> actionHandler) {
        if (this.tooltipHelper.isShowing()) {
            dismissTooltip();
        }
        if (tooltip == null) {
            dismissTooltip();
            return;
        }
        if (!tooltip.getNeedShow()) {
            dismissTooltip();
            return;
        }
        if (this.dismissByTouchOutside) {
            tooltip.setHideByTouchOutside(true);
        }
        this.tooltipHelper.onShowTooltip(tooltip, anchor, marginFromAnchor, centerAboutAnchor, dismissTimeout, actionHandler);
        subscribeToDismissEvents();
        tooltip.setNeedShow(false);
    }

    private final RecyclerView getRecyclerView() {
        View view;
        ComponentCallbacksC5392m c11 = this.references.getContainer().c();
        if (c11 == null || (view = c11.getView()) == null) {
            return null;
        }
        return ComposerViewExtensionKt.composerRecyclerView(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showTooltipIfNeed$default(CartTooltipShowService cartTooltipShowService, CartTooltipVO cartTooltipVO, View view, int i11, boolean z11, Long l11, Function1 function1, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        if ((i12 & 8) != 0) {
            z11 = false;
        }
        if ((i12 & 16) != 0) {
            l11 = null;
        }
        if ((i12 & 32) != 0) {
            function1 = null;
        }
        cartTooltipShowService.showTooltipIfNeed(cartTooltipVO, view, i11, z11, l11, function1);
    }

    private final void subscribeToDismissEvents() {
        ComponentCallbacksC5392m c11;
        View view;
        RecyclerView composerRecyclerView;
        if (this.dismissOnScroll && (c11 = this.references.getContainer().c()) != null && (view = c11.getView()) != null && (composerRecyclerView = ComposerViewExtensionKt.composerRecyclerView(view)) != null) {
            composerRecyclerView.removeOnScrollListener(this.scrollListener);
            composerRecyclerView.addOnScrollListener(this.scrollListener);
        }
        if (this.dismissOnReloadComposerEvent) {
            B0 b02 = this.reloadEventListenerJob;
            if (b02 != null) {
                b02.j(null);
            }
            final InterfaceC2395h<a> eventsFlow = this.references.getController().getEventsFlow();
            this.reloadEventListenerJob = C2399j.C(new C2408n0(new InterfaceC2395h<Object>() { // from class: ru.ozon.app.android.cart.ui.tooltip.CartTooltipShowService$subscribeToDismissEvents$$inlined$filterIsInstance$1

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                /* renamed from: ru.ozon.app.android.cart.ui.tooltip.CartTooltipShowService$subscribeToDismissEvents$$inlined$filterIsInstance$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements InterfaceC2397i {
                    final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    @e(c = "ru.ozon.app.android.cart.ui.tooltip.CartTooltipShowService$subscribeToDismissEvents$$inlined$filterIsInstance$1$2", f = "CartTooltipShowService.kt", l = {50}, m = "emit")
                    /* renamed from: ru.ozon.app.android.cart.ui.tooltip.CartTooltipShowService$subscribeToDismissEvents$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends c {
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(d dVar) {
                            super(dVar);
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= LinearLayoutManager.INVALID_OFFSET;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(InterfaceC2397i interfaceC2397i) {
                        this.$this_unsafeFlow = interfaceC2397i;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                    @Override // Ae.InterfaceC2397i
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, d dVar) {
                        AnonymousClass1 anonymousClass1;
                        int i11;
                        if (dVar instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) dVar;
                            int i12 = anonymousClass1.label;
                            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                                anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                                Object obj2 = anonymousClass1.result;
                                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                                i11 = anonymousClass1.label;
                                if (i11 != 0) {
                                    s.b(obj2);
                                    InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                    if (obj instanceof a.u) {
                                        anonymousClass1.label = 1;
                                        if (interfaceC2397i.emit(obj, anonymousClass1) == aVar) {
                                            return aVar;
                                        }
                                    }
                                } else {
                                    if (i11 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    s.b(obj2);
                                }
                                return Unit.f71690a;
                            }
                        }
                        anonymousClass1 = new AnonymousClass1(dVar);
                        Object obj22 = anonymousClass1.result;
                        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                        i11 = anonymousClass1.label;
                        if (i11 != 0) {
                        }
                        return Unit.f71690a;
                    }
                }

                @Override // Ae.InterfaceC2395h
                public Object collect(InterfaceC2397i<? super Object> interfaceC2397i, d dVar) {
                    Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i), dVar);
                    return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
                }
            }, new CartTooltipShowService$subscribeToDismissEvents$2(this, null)), K.a(this.references.getContainer().g()));
        }
    }

    public final void showTooltipIfNeed(CartTooltipVO tooltip, @NotNull View anchor, int marginFromAnchor, boolean centerAboutAnchor, Long dismissTimeout, Function1<? super AtomAction, Unit> actionHandler) {
        RecyclerView recyclerView;
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        CartTooltipShowService$showTooltipIfNeed$showAction$1 cartTooltipShowService$showTooltipIfNeed$showAction$1 = new CartTooltipShowService$showTooltipIfNeed$showAction$1(this, tooltip, anchor, marginFromAnchor, centerAboutAnchor, dismissTimeout, actionHandler);
        if (getRecyclerView() == null || ((recyclerView = getRecyclerView()) != null && recyclerView.getScrollState() == 0)) {
            cartTooltipShowService$showTooltipIfNeed$showAction$1.invoke();
            return;
        }
        this.pendingShow = cartTooltipShowService$showTooltipIfNeed$showAction$1;
        RecyclerView recyclerView2 = getRecyclerView();
        if (recyclerView2 != null) {
            recyclerView2.removeOnScrollListener(this.waitIdleListener);
        }
        RecyclerView recyclerView3 = getRecyclerView();
        if (recyclerView3 != null) {
            recyclerView3.addOnScrollListener(this.waitIdleListener);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showTooltipIfNeed$default(CartTooltipShowService cartTooltipShowService, TooltipWithOnboardingActionVO tooltipWithOnboardingActionVO, View view, int i11, boolean z11, Function1 function1, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        if ((i12 & 8) != 0) {
            z11 = false;
        }
        if ((i12 & 16) != 0) {
            function1 = null;
        }
        cartTooltipShowService.showTooltipIfNeed(tooltipWithOnboardingActionVO, view, i11, z11, function1);
    }

    public final void showTooltipIfNeed(TooltipWithOnboardingActionVO molecule, @NotNull View anchor, int marginFromAnchor, boolean centerAboutAnchor, Function1<? super AtomAction, Unit> actionHandler) {
        AtomAction onboardingAction;
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        showTooltipIfNeed(molecule != null ? molecule.getTooltip() : null, anchor, marginFromAnchor, centerAboutAnchor, molecule != null ? molecule.getHidingTimeMs() : null, actionHandler);
        if (!this.tooltipHelper.isShowing() || molecule == null || (onboardingAction = molecule.getOnboardingAction()) == null || actionHandler == null) {
            return;
        }
        actionHandler.invoke(onboardingAction);
    }

    public /* synthetic */ CartTooltipShowService(ComposerReferences composerReferences, boolean z11, boolean z12, boolean z13, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(composerReferences, (i11 & 2) != 0 ? false : z11, (i11 & 4) != 0 ? false : z12, (i11 & 8) != 0 ? false : z13);
    }
}
