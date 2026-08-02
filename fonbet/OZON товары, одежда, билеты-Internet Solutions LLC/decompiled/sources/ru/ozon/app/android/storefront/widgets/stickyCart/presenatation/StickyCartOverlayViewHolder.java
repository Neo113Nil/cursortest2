package ru.ozon.app.android.storefront.widgets.stickyCart.presenatation;

import Ae.C2399j;
import Ae.C2408n0;
import CG.a;
import Ge.n;
import WZ.m;
import WZ.t;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.K;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import d20.AbstractC6064a;
import d20.InterfaceC6068e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationAnimationController;
import ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationAnimationStateListener;
import ru.ozon.app.android.navigation.newrouter.ui.TranslateAnimationState;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.indicator.IndicatorDTO;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 <2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001<B-\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u00020\u00112\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001e\u001a\u00020\u00112\b\u0010\u001c\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001d\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0011H\u0002¢\u0006\u0004\b \u0010\u0016J\u0013\u0010!\u001a\u00020\u0011*\u00020\bH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0011H\u0016¢\u0006\u0004\b#\u0010\u0016J\u000f\u0010$\u001a\u00020\u0011H\u0016¢\u0006\u0004\b$\u0010\u0016J\u0017\u0010&\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\u0002H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u00112\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010,R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010-R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010.R(\u0010\u001c\u001a\u0004\u0018\u00010\u000f2\b\u0010/\u001a\u0004\u0018\u00010\u000f8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u001c\u00100\"\u0004\b1\u00102R\u0018\u00103\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R \u00107\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\u0011058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006="}, d2 = {"Lru/ozon/app/android/storefront/widgets/stickyCart/presenatation/StickyCartOverlayViewHolder;", "Ld20/a;", "Lru/ozon/app/android/storefront/widgets/stickyCart/presenatation/StickyCartVO;", "Lru/ozon/app/android/navigation/newrouter/ui/BottomNavigationAnimationStateListener;", "Ll10/i;", "container", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartManager", "Lru/ozon/app/android/navigation/newrouter/ui/BottomNavigationAnimationController;", "bottomNavigationAnimationController", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Ll10/i;Lru/ozon/app/android/cart/common/domain/CartService;Lru/ozon/app/android/navigation/newrouter/ui/BottomNavigationAnimationController;Ld20/e;)V", "", "animation", "", "show", "(Z)V", "hide", "cancelAnimation", "()V", "addCartObserver", "", "productsInCart", "applyCartState", "(I)V", "cartIsNotEmpty", "animationIsEnabled", "changeCartVisibility", "(Ljava/lang/Boolean;Z)V", "checkTabsState", "createAndAttachTabsListener", "(Lru/ozon/app/android/navigation/newrouter/ui/BottomNavigationAnimationController;)V", "onWidgetCreated", "onWidgetDestroyed", "item", "bind", "(Lru/ozon/app/android/storefront/widgets/stickyCart/presenatation/StickyCartVO;)V", "Lru/ozon/app/android/navigation/newrouter/ui/TranslateAnimationState;", "state", "onBottomNavigationAnimationChanged", "(Lru/ozon/app/android/navigation/newrouter/ui/TranslateAnimationState;)V", "Ll10/i;", "Lru/ozon/app/android/cart/common/domain/CartService;", "Lru/ozon/app/android/navigation/newrouter/ui/BottomNavigationAnimationController;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Ljava/lang/Boolean;", "setCartIsNotEmpty", "(Ljava/lang/Boolean;)V", "tabsAnimationState", "Lru/ozon/app/android/navigation/newrouter/ui/TranslateAnimationState;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Landroid/view/View$OnClickListener;", "onClickListener", "Landroid/view/View$OnClickListener;", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StickyCartOverlayViewHolder extends AbstractC6064a<StickyCartVO> implements BottomNavigationAnimationStateListener {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final BottomNavigationAnimationController bottomNavigationAnimationController;
    private Boolean cartIsNotEmpty;

    @NotNull
    private final CartService cartManager;

    @NotNull
    private final i container;

    @NotNull
    private final View.OnClickListener onClickListener;
    private TranslateAnimationState tabsAnimationState;
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TranslateAnimationState.values().length];
            try {
                iArr[TranslateAnimationState.SHOWING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TranslateAnimationState.HIDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TranslateAnimationState.SHOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TranslateAnimationState.HIDDEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickyCartOverlayViewHolder(@NotNull i container, @NotNull CartService cartManager, @NotNull BottomNavigationAnimationController bottomNavigationAnimationController, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(cartManager, "cartManager");
        Intrinsics.checkNotNullParameter(bottomNavigationAnimationController, "bottomNavigationAnimationController");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.container = container;
        this.cartManager = cartManager;
        this.bottomNavigationAnimationController = bottomNavigationAnimationController;
        this.tabsAnimationState = TranslateAnimationState.NONE;
        this.actionHandler = new ActionHandler.Builder(container, this).buildHandler();
        this.onClickListener = new a(this, 5);
    }

    private final void addCartObserver() {
        C2399j.C(new C2408n0(C5427n.a(n.a(CartService.DefaultImpls.observeCartState$default(this.cartManager, false, 1, null)), getLifecycle(), AbstractC5434v.b.STARTED), new StickyCartOverlayViewHolder$addCartObserver$1(this, null)), K.a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void applyCartState(int productsInCart) {
        setCartIsNotEmpty(Boolean.valueOf(productsInCart > 0));
        if (productsInCart == 0) {
            return;
        }
        String valueOf = productsInCart > 99 ? "99+" : String.valueOf(productsInCart);
        StickyCartVO stickyCartVO = (StickyCartVO) getBoundData();
        if (stickyCartVO != null) {
            stickyCartVO.setIndicator(IndicatorDTO.copy$default(stickyCartVO.getIndicator(), valueOf, null, null, null, null, null, null, null, null, null, null, 2046, null));
            View view = getView();
            Intrinsics.g(view, "null cannot be cast to non-null type ru.ozon.app.android.storefront.widgets.stickyCart.presenatation.StickyCartView");
            ((StickyCartView) view).bind(stickyCartVO, this.actionHandler);
        }
        checkTabsState();
    }

    private final void cancelAnimation() {
        getView().animate().cancel();
    }

    private final void changeCartVisibility(Boolean cartIsNotEmpty, boolean animationIsEnabled) {
        if (Intrinsics.d(cartIsNotEmpty, Boolean.TRUE)) {
            show(animationIsEnabled);
        } else {
            hide(animationIsEnabled);
        }
    }

    private final void checkTabsState() {
        TranslateAnimationState translateAnimationState = this.tabsAnimationState;
        int i11 = translateAnimationState == null ? -1 : WhenMappings.$EnumSwitchMapping$0[translateAnimationState.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        return;
                    }
                }
            }
            show(false);
            return;
        }
        hide(false);
    }

    private final void createAndAttachTabsListener(BottomNavigationAnimationController bottomNavigationAnimationController) {
        bottomNavigationAnimationController.removeListener(this);
        bottomNavigationAnimationController.addListener(this);
    }

    private final void hide(boolean animation) {
        View view = getView();
        ViewExtKt.show(view);
        if (animation) {
            view.animate().setDuration(250L).alpha(0.0f).withEndAction(new OL.a(view, 0)).start();
            return;
        }
        view.animate().cancel();
        view.setAlpha(0.0f);
        ViewExtKt.gone(view);
    }

    static /* synthetic */ void hide$default(StickyCartOverlayViewHolder stickyCartOverlayViewHolder, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        stickyCartOverlayViewHolder.hide(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onClickListener$lambda$1(StickyCartOverlayViewHolder stickyCartOverlayViewHolder, View view) {
        AtomAction action;
        StickyCartVO stickyCartVO = (StickyCartVO) stickyCartOverlayViewHolder.getBoundData();
        if (stickyCartVO == null || (action = stickyCartVO.getAction()) == null) {
            return;
        }
        stickyCartOverlayViewHolder.actionHandler.invoke(action);
    }

    private final void setCartIsNotEmpty(Boolean bool) {
        if (Intrinsics.d(this.cartIsNotEmpty, bool)) {
            return;
        }
        this.cartIsNotEmpty = bool;
        changeCartVisibility(bool, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void show(boolean animation) {
        t tokenizedEvent;
        StickyCartVO stickyCartVO = (StickyCartVO) getBoundData();
        if (stickyCartVO != null && (tokenizedEvent = stickyCartVO.getTokenizedEvent()) != null) {
            m.c(this.container.X(), tokenizedEvent, null);
        }
        View view = getView();
        ViewExtKt.show(view);
        if (animation) {
            view.animate().setDuration(250L).alpha(1.0f).start();
        } else {
            view.animate().cancel();
            view.setAlpha(1.0f);
        }
    }

    static /* synthetic */ void show$default(StickyCartOverlayViewHolder stickyCartOverlayViewHolder, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        stickyCartOverlayViewHolder.show(z11);
    }

    @Override // ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationAnimationStateListener
    public void onBottomNavigationAnimationChanged(@NotNull TranslateAnimationState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        TranslateAnimationState translateAnimationState = this.tabsAnimationState;
        if (translateAnimationState != state) {
            TranslateAnimationState translateAnimationState2 = TranslateAnimationState.SHOWING;
            if (translateAnimationState == translateAnimationState2 && state == TranslateAnimationState.SHOWN) {
                return;
            }
            if (translateAnimationState == TranslateAnimationState.SHOWN && state == translateAnimationState2) {
                return;
            }
            TranslateAnimationState translateAnimationState3 = TranslateAnimationState.HIDING;
            if (translateAnimationState == translateAnimationState3 && state == TranslateAnimationState.HIDDEN) {
                return;
            }
            if ((translateAnimationState == TranslateAnimationState.HIDDEN && state == translateAnimationState3) || state == TranslateAnimationState.NONE) {
                return;
            }
            this.tabsAnimationState = state;
            if (Intrinsics.d(this.cartIsNotEmpty, Boolean.TRUE)) {
                int i11 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
                if (i11 == 1) {
                    hide$default(this, false, 1, null);
                } else {
                    if (i11 != 2) {
                        return;
                    }
                    show$default(this, false, 1, null);
                }
            }
        }
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        super.onWidgetCreated();
        getView().setOnClickListener(this.onClickListener);
        addCartObserver();
        createAndAttachTabsListener(this.bottomNavigationAnimationController);
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        super.onWidgetDestroyed();
        this.bottomNavigationAnimationController.removeListener(this);
        cancelAnimation();
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull StickyCartVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.tabsAnimationState = this.bottomNavigationAnimationController.getBottomNavigationAnimationState();
        applyCartState(this.cartManager.getCartState().getTotalCount());
    }
}
