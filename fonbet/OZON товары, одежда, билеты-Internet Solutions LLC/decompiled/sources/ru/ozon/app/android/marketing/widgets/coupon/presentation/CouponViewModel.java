package ru.ozon.app.android.marketing.widgets.coupon.presentation;

import A00.a;
import DM.i;
import Mc.a;
import androidx.lifecycle.P;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import nc.C8486a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.actionProgress.core.ActionProgressUpdateState;
import ru.ozon.app.android.marketing.widgets.cartButton.core.CartButtonUpdateState;
import ru.ozon.app.android.marketing.widgets.cartButton.data.CartButtonDTO;
import ru.ozon.app.android.marketing.widgets.coupon.common.CouponAction;
import ru.ozon.app.android.marketing.widgets.coupon.common.CouponState;
import ru.ozon.app.android.marketing.widgets.coupon.core.CouponUpdateState;
import ru.ozon.app.android.marketing.widgets.coupon.data.CouponDTO;
import ru.ozon.app.android.marketing.widgets.highlightProducts.core.HighlightProductsUpdateState;
import ru.ozon.app.android.marketing.widgets.highlightsWrapper.core.HighlightsWrapperCurrentMiniWidget;
import ru.ozon.app.android.marketing.widgets.highlightsWrapper.core.HighlightsWrapperStateManager;
import ru.ozon.app.android.marketing.widgets.highlightsWrapper.data.HighlightsCurrentMiniWidget;
import ru.ozon.app.android.marketing.widgets.highlightsWrapper.data.HighlightsWrapperAsyncState;
import ru.ozon.app.android.storage.auth.AuthStateStorage;
import ru.ozon.app.android.utils.livedata.BroadcastSingleLiveEvent;
import ru.ozon.app.android.utils.rx.RxExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import xe.C10727i;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 A2\u00020\u0001:\u0001AB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u0019\u0010 \u001a\u00020\u00112\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\"\u0010#J\u001f\u0010$\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\u0011¢\u0006\u0004\b&\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020.0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u00104R\u0016\u00106\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u00108R\u0018\u0010:\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0017\u0010?\u001a\b\u0012\u0004\u0012\u00020*0<8F¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020.0<8F¢\u0006\u0006\u001a\u0004\b@\u0010>¨\u0006B"}, d2 = {"Lru/ozon/app/android/marketing/widgets/coupon/presentation/CouponViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "authManager", "Lru/ozon/app/android/marketing/widgets/highlightsWrapper/core/HighlightsWrapperStateManager;", "stateManager", "<init>", "(Lru/ozon/app/android/storage/auth/AuthStateStorage;Lru/ozon/app/android/marketing/widgets/highlightsWrapper/core/HighlightsWrapperStateManager;)V", "Lru/ozon/app/android/marketing/widgets/coupon/data/CouponDTO;", "coupon", "Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsCurrentMiniWidget;", "miniWidget", "Lru/ozon/app/android/marketing/widgets/coupon/core/CouponUpdateState;", "createCouponState", "(Lru/ozon/app/android/marketing/widgets/coupon/data/CouponDTO;Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsCurrentMiniWidget;)Lru/ozon/app/android/marketing/widgets/coupon/core/CouponUpdateState;", "Lru/ozon/app/android/marketing/widgets/coupon/presentation/CouponVO;", "item", "", "setMiniWidgetDecorator", "(Lru/ozon/app/android/marketing/widgets/coupon/presentation/CouponVO;)V", "", "asyncData", "checkCouponState", "(Ljava/lang/String;)V", "Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsWrapperAsyncState$Success;", "refreshData", "LA00/a$J$a;", "parseCartState", "(Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsWrapperAsyncState$Success;)LA00/a$J$a;", "parseNewWidgetState", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "setApplyState", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "onCleared", "()V", "bindInitial", "(Lru/ozon/app/android/marketing/widgets/coupon/presentation/CouponVO;Ljava/lang/String;)V", "onCouponApplied", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "Lru/ozon/app/android/marketing/widgets/highlightsWrapper/core/HighlightsWrapperStateManager;", "Landroidx/lifecycle/V;", "Lru/ozon/app/android/marketing/widgets/coupon/common/CouponState;", "_couponState", "Landroidx/lifecycle/V;", "Lru/ozon/app/android/utils/livedata/BroadcastSingleLiveEvent;", "Lru/ozon/app/android/marketing/widgets/coupon/common/CouponAction;", "_action", "Lru/ozon/app/android/utils/livedata/BroadcastSingleLiveEvent;", "", "initialAuthState", "Z", "Ljava/lang/String;", "Lnc/a;", "disposables", "Lnc/a;", "Lru/ozon/app/android/marketing/widgets/coupon/presentation/CouponVO;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "appliedCouponCode", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "Landroidx/lifecycle/P;", "getCouponState", "()Landroidx/lifecycle/P;", "couponState", "getAction", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CouponViewModel extends w0 {

    @NotNull
    private final BroadcastSingleLiveEvent<CouponAction> _action;

    @NotNull
    private final V<CouponState> _couponState;
    private TextAtom appliedCouponCode;
    private String asyncData;

    @NotNull
    private final AuthStateStorage authManager;

    @NotNull
    private C8486a disposables;
    private final boolean initialAuthState;
    private CouponVO item;

    @NotNull
    private final HighlightsWrapperStateManager stateManager;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "newIsAuthenticated", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.marketing.widgets.coupon.presentation.CouponViewModel$1, reason: invalid class name */
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
            if (Boolean.valueOf(CouponViewModel.this.initialAuthState).equals(bool) || !bool.booleanValue()) {
                return;
            }
            CouponViewModel.this.disposables.d();
            CouponVO couponVO = CouponViewModel.this.item;
            if (couponVO == null) {
                throw new IllegalStateException("change auth state before bind");
            }
            CouponViewModel.this.setApplyState(couponVO.getAction());
        }
    }

    public CouponViewModel(@NotNull AuthStateStorage authManager, @NotNull HighlightsWrapperStateManager stateManager) {
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(stateManager, "stateManager");
        this.authManager = authManager;
        this.stateManager = stateManager;
        this._couponState = new V<>();
        this._action = new BroadcastSingleLiveEvent<>();
        this.initialAuthState = authManager.isAuthenticated();
        C8486a c8486a = new C8486a();
        this.disposables = c8486a;
        InterfaceC8487b subscribe = authManager.getAuthState().subscribeOn(a.b()).observeOn(C8125a.a()).subscribe(new i(new AnonymousClass1(), 17));
        Intrinsics.checkNotNullExpressionValue(subscribe, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, subscribe);
    }

    private final void checkCouponState(String asyncData) {
        CouponVO couponVO = this.item;
        if ((couponVO != null ? couponVO.getCurrentMiniWidget() : null) == HighlightsCurrentMiniWidget.COUPON || asyncData == null) {
            return;
        }
        C10727i.c(x0.a(this), null, null, new CouponViewModel$checkCouponState$1(this, asyncData, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CouponUpdateState createCouponState(CouponDTO coupon, HighlightsCurrentMiniWidget miniWidget) {
        if (coupon != null) {
            coupon.setCurrentMiniWidget(miniWidget);
        } else {
            coupon = null;
        }
        return new CouponUpdateState(coupon);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a.J.InterfaceC0007a parseCartState(HighlightsWrapperAsyncState.Success refreshData) {
        ButtonV3Atom.LargeButton cartButton = refreshData.getState().getCartButton();
        if (cartButton != null) {
            return new CartButtonUpdateState(new CartButtonDTO(cartButton));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a.J.InterfaceC0007a parseNewWidgetState(HighlightsWrapperAsyncState.Success refreshData) {
        if (refreshData.getState().getCurrentMiniWidget() == HighlightsCurrentMiniWidget.ACTION_PROGRESS) {
            return new ActionProgressUpdateState(refreshData.getState().getActionProgress());
        }
        if (refreshData.getState().getCurrentMiniWidget() == HighlightsCurrentMiniWidget.HIGHLIGHT_PRODUCTS) {
            return new HighlightProductsUpdateState(refreshData.getState().getHighlightProducts());
        }
        if (refreshData.getState().getCurrentMiniWidget() != null || refreshData.getState().getCartButton() == null) {
            return null;
        }
        return new CartButtonUpdateState(new CartButtonDTO(refreshData.getState().getCartButton()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setApplyState(AtomAction action) {
        this._couponState.setValue(action == null ? CouponState.Applied.INSTANCE : CouponState.ReadyToApply.INSTANCE);
    }

    private final void setMiniWidgetDecorator(CouponVO item) {
        BroadcastSingleLiveEvent<CouponAction> broadcastSingleLiveEvent = this._action;
        HighlightsCurrentMiniWidget currentMiniWidget = item.getCurrentMiniWidget();
        if (currentMiniWidget == null) {
            return;
        }
        broadcastSingleLiveEvent.setValue(new CouponAction.UpdateCurrentMiniWidget(new HighlightsWrapperCurrentMiniWidget(currentMiniWidget)));
    }

    public final void bindInitial(@NotNull CouponVO item, String asyncData) {
        Intrinsics.checkNotNullParameter(item, "item");
        CouponVO couponVO = this.item;
        if (!Intrinsics.d(couponVO != null ? couponVO.getCode() : null, item.getCode())) {
            this.appliedCouponCode = null;
        }
        CouponVO couponVO2 = this.item;
        if ((couponVO2 != null ? couponVO2.getCurrentMiniWidget() : null) != item.getCurrentMiniWidget()) {
            setMiniWidgetDecorator(item);
        }
        this.item = item;
        if (asyncData != null) {
            this.asyncData = asyncData;
        }
        if (item.getAction() == null) {
            this._couponState.setValue(CouponState.Applied.INSTANCE);
            return;
        }
        if (!this.authManager.isAuthenticated()) {
            this._couponState.setValue(CouponState.NeedLogin.INSTANCE);
            return;
        }
        checkCouponState(this.asyncData);
        if (Intrinsics.d(this.appliedCouponCode, item.getCode())) {
            this._couponState.setValue(CouponState.Applied.INSTANCE);
        } else {
            setApplyState(item.getAction());
        }
    }

    @NotNull
    public final P<CouponAction> getAction() {
        return this._action;
    }

    @NotNull
    public final P<CouponState> getCouponState() {
        return this._couponState;
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        super.onCleared();
        this.disposables.d();
    }

    public final void onCouponApplied() {
        CouponVO couponVO = this.item;
        this.appliedCouponCode = couponVO != null ? couponVO.getCode() : null;
        this._couponState.setValue(CouponState.Applied.INSTANCE);
        C10727i.c(x0.a(this), null, null, new CouponViewModel$onCouponApplied$1(this, null), 3);
    }
}
