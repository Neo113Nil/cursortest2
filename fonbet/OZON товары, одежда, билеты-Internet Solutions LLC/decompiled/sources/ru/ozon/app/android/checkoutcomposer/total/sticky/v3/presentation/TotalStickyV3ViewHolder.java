package ru.ozon.app.android.checkoutcomposer.total.sticky.v3.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.C2417s0;
import Ae.C2425z;
import Ae.InterfaceC2397i;
import Sc.s;
import W10.c;
import WZ.l;
import WZ.m;
import WZ.t;
import Wc.a;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import d20.AbstractC6064a;
import d20.InterfaceC6068e;
import fd.InterfaceC6511n;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.cart.common.presentation.TotalVisibilityViewModel;
import ru.ozon.app.android.cart.common.presentation.asyncCart.AsyncCartViewModel;
import ru.ozon.app.android.cart.common.presentation.utils.ExtensionsKt;
import ru.ozon.app.android.composer.network.referrer.ReferrerValueController;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewModel;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Be\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\u0010\u000b\u001a\u00060\tj\u0002`\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u0002H\u0016¢\u0006\u0004\b$\u0010%J'\u0010*\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010,R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010-R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010.R\u0018\u0010\u000b\u001a\u00060\tj\u0002`\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010/R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00100R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00101R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00102R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u00103R\u0016\u00105\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u00108\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R \u0010?\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020\u001c0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006A"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/total/sticky/v3/presentation/TotalStickyV3ViewHolder;", "Ld20/a;", "Lru/ozon/app/android/checkoutcomposer/total/sticky/v3/presentation/TotalStickyV3VO;", "Lru/ozon/app/android/composer/network/referrer/ReferrerValueController;", "referrerValueController", "Ll10/i;", "container", "Lru/ozon/app/android/checkoutcomposer/total/sticky/v3/presentation/TotalStickyV3ViewModel;", "viewModel", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/cart/common/presentation/TotalVisibilityViewModel;", "totalVisibilityViewModel", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;", "createAndPayViewModel", "Lru/ozon/app/android/utils/AppType;", "appType", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "Lru/ozon/app/android/cart/common/presentation/asyncCart/AsyncCartViewModel;", "asyncCartViewModel", "<init>", "(Lru/ozon/app/android/composer/network/referrer/ReferrerValueController;Ll10/i;Lru/ozon/app/android/checkoutcomposer/total/sticky/v3/presentation/TotalStickyV3ViewModel;LWZ/l;Lru/ozon/app/android/cart/common/presentation/TotalVisibilityViewModel;Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;Lru/ozon/app/android/utils/AppType;LVg/d;Ld20/e;Lru/ozon/app/android/cart/common/presentation/asyncCart/AsyncCartViewModel;)V", "", "initLifecycleObserver", "()V", "Lru/ozon/app/android/checkoutcomposer/total/sticky/v3/presentation/TotalStickyV3UpdateResponse;", "updateResponse", "sendUpdate", "(Lru/ozon/app/android/checkoutcomposer/total/sticky/v3/presentation/TotalStickyV3UpdateResponse;)V", "item", "bind", "(Lru/ozon/app/android/checkoutcomposer/total/sticky/v3/presentation/TotalStickyV3VO;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/checkoutcomposer/total/sticky/v3/presentation/TotalStickyV3VO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/composer/network/referrer/ReferrerValueController;", "Ll10/i;", "Lru/ozon/app/android/checkoutcomposer/total/sticky/v3/presentation/TotalStickyV3ViewModel;", "LWZ/l;", "Lru/ozon/app/android/cart/common/presentation/TotalVisibilityViewModel;", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;", "Lru/ozon/app/android/utils/AppType;", "Lru/ozon/app/android/cart/common/presentation/asyncCart/AsyncCartViewModel;", "", "currentPageUrl", "Ljava/lang/String;", "Lxe/B0;", "clearReferrerJob", "Lxe/B0;", "Landroid/os/Handler;", "mainThreadHandler", "Landroid/os/Handler;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TotalStickyV3ViewHolder extends AbstractC6064a<TotalStickyV3VO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AppType appType;

    @NotNull
    private final AsyncCartViewModel asyncCartViewModel;
    private B0 clearReferrerJob;

    @NotNull
    private final i container;

    @NotNull
    private final CreateAndPayViewModel createAndPayViewModel;

    @NotNull
    private String currentPageUrl;

    @NotNull
    private final Handler mainThreadHandler;

    @NotNull
    private final ReferrerValueController referrerValueController;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final TotalVisibilityViewModel totalVisibilityViewModel;

    @NotNull
    private final TotalStickyV3ViewModel viewModel;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, d2 = {"<anonymous>", "", "gone", "", "view", "Landroid/view/View;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.checkoutcomposer.total.sticky.v3.presentation.TotalStickyV3ViewHolder$2", f = "TotalStickyV3ViewHolder.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.checkoutcomposer.total.sticky.v3.presentation.TotalStickyV3ViewHolder$2, reason: invalid class name */
    static final class AnonymousClass2 extends j implements InterfaceC6511n<Boolean, View, d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        /* synthetic */ boolean Z$0;
        int label;

        AnonymousClass2(d<? super AnonymousClass2> dVar) {
            super(3, dVar);
        }

        @Override // fd.InterfaceC6511n
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, View view, d<? super Unit> dVar) {
            return invoke(bool.booleanValue(), view, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            ((View) this.L$0).setVisibility(this.Z$0 ? 8 : 0);
            return Unit.f71690a;
        }

        public final Object invoke(boolean z11, View view, d<? super Unit> dVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(dVar);
            anonymousClass2.Z$0 = z11;
            anonymousClass2.L$0 = view;
            return anonymousClass2.invokeSuspend(Unit.f71690a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "gone", "", "asyncInProcessing"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.checkoutcomposer.total.sticky.v3.presentation.TotalStickyV3ViewHolder$3", f = "TotalStickyV3ViewHolder.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.checkoutcomposer.total.sticky.v3.presentation.TotalStickyV3ViewHolder$3, reason: invalid class name */
    static final class AnonymousClass3 extends j implements InterfaceC6511n<Boolean, Boolean, d<? super Unit>, Object> {
        /* synthetic */ boolean Z$0;
        /* synthetic */ boolean Z$1;
        int label;

        AnonymousClass3(d<? super AnonymousClass3> dVar) {
            super(3, dVar);
        }

        @Override // fd.InterfaceC6511n
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Boolean bool2, d<? super Unit> dVar) {
            return invoke(bool.booleanValue(), bool2.booleanValue(), dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            boolean z11 = this.Z$0;
            boolean z12 = this.Z$1;
            View view = TotalStickyV3ViewHolder.this.getView();
            TotalStickyV3View totalStickyV3View = view instanceof TotalStickyV3View ? (TotalStickyV3View) view : null;
            if (totalStickyV3View == null) {
                return null;
            }
            totalStickyV3View.setShimmering(!z11 && z12);
            return Unit.f71690a;
        }

        public final Object invoke(boolean z11, boolean z12, d<? super Unit> dVar) {
            AnonymousClass3 anonymousClass3 = TotalStickyV3ViewHolder.this.new AnonymousClass3(dVar);
            anonymousClass3.Z$0 = z11;
            anonymousClass3.Z$1 = z12;
            return anonymousClass3.invokeSuspend(Unit.f71690a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LAe/i;", "", "", "it", "<anonymous>", "(LAe/i;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.checkoutcomposer.total.sticky.v3.presentation.TotalStickyV3ViewHolder$4", f = "TotalStickyV3ViewHolder.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.checkoutcomposer.total.sticky.v3.presentation.TotalStickyV3ViewHolder$4, reason: invalid class name */
    static final class AnonymousClass4 extends j implements InterfaceC6511n<InterfaceC2397i<? super Unit>, Throwable, d<? super Unit>, Object> {
        int label;

        AnonymousClass4(d<? super AnonymousClass4> dVar) {
            super(3, dVar);
        }

        @Override // fd.InterfaceC6511n
        public final Object invoke(InterfaceC2397i<? super Unit> interfaceC2397i, Throwable th2, d<? super Unit> dVar) {
            return TotalStickyV3ViewHolder.this.new AnonymousClass4(dVar).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            View view = TotalStickyV3ViewHolder.this.getView();
            TotalStickyV3View totalStickyV3View = view instanceof TotalStickyV3View ? (TotalStickyV3View) view : null;
            if (totalStickyV3View != null) {
                totalStickyV3View.setShimmering(false);
            }
            return Unit.f71690a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/checkoutcomposer/total/sticky/v3/presentation/TotalStickyV3UpdateResponse;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.checkoutcomposer.total.sticky.v3.presentation.TotalStickyV3ViewHolder$5", f = "TotalStickyV3ViewHolder.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.checkoutcomposer.total.sticky.v3.presentation.TotalStickyV3ViewHolder$5, reason: invalid class name */
    static final class AnonymousClass5 extends j implements Function2<TotalStickyV3UpdateResponse, d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass5(d<? super AnonymousClass5> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass5 anonymousClass5 = TotalStickyV3ViewHolder.this.new AnonymousClass5(dVar);
            anonymousClass5.L$0 = obj;
            return anonymousClass5;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            TotalStickyV3ViewHolder.this.sendUpdate((TotalStickyV3UpdateResponse) this.L$0);
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(TotalStickyV3UpdateResponse totalStickyV3UpdateResponse, d<? super Unit> dVar) {
            return ((AnonymousClass5) create(totalStickyV3UpdateResponse, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TotalStickyV3ViewHolder(@NotNull ReferrerValueController referrerValueController, @NotNull i container, @NotNull TotalStickyV3ViewModel viewModel, @NotNull l tokenizedAnalytics, @NotNull TotalVisibilityViewModel totalVisibilityViewModel, @NotNull CreateAndPayViewModel createAndPayViewModel, @NotNull AppType appType, @NotNull Vg.d customActionHandlersStoreFactory, @NotNull InterfaceC6068e<LinearLayout> viewFactory, @NotNull AsyncCartViewModel asyncCartViewModel) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(referrerValueController, "referrerValueController");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(totalVisibilityViewModel, "totalVisibilityViewModel");
        Intrinsics.checkNotNullParameter(createAndPayViewModel, "createAndPayViewModel");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        Intrinsics.checkNotNullParameter(asyncCartViewModel, "asyncCartViewModel");
        this.referrerValueController = referrerValueController;
        this.container = container;
        this.viewModel = viewModel;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.totalVisibilityViewModel = totalVisibilityViewModel;
        this.createAndPayViewModel = createAndPayViewModel;
        this.appType = appType;
        this.asyncCartViewModel = asyncCartViewModel;
        this.currentPageUrl = "";
        this.mainThreadHandler = new Handler(Looper.getMainLooper());
        this.actionHandler = new ActionHandler.Builder(container, this).customActionHandlers(new TotalStickyV3ViewHolder$actionHandler$1(customActionHandlersStoreFactory)).onPreProcess(new TotalStickyV3ViewHolder$actionHandler$2(this)).onComposerAction(new TotalStickyV3ViewHolder$actionHandler$3(this)).buildHandler();
        container.K().f().getLifecycle().a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.checkoutcomposer.total.sticky.v3.presentation.TotalStickyV3ViewHolder.1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(J owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                TotalStickyV3ViewHolder.this.mainThreadHandler.removeCallbacksAndMessages(null);
            }
        });
        C2399j.C(new C2425z(new C2417s0(ExtensionsKt.onEachOutOfLayoutView$default(totalVisibilityViewModel.isVisibleFlow(), getView(), null, new AnonymousClass2(null), 2, null), asyncCartViewModel.isProcessing(), new AnonymousClass3(null)), new AnonymousClass4(null)), K.a(container.K().f()));
        C2399j.C(new C2408n0(C5427n.a(viewModel.getWidgetUpdateFlow(), getLifecycle(), AbstractC5434v.b.STARTED), new AnonymousClass5(null)), K.a(container.K().f()));
    }

    private final void initLifecycleObserver() {
        B0 b02 = this.clearReferrerJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.clearReferrerJob = C10727i.c(K.a(this.container.K().f()), null, null, new TotalStickyV3ViewHolder$initLifecycleObserver$1(this, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendUpdate(TotalStickyV3UpdateResponse updateResponse) {
        Map<String, String> trackingPayloads = updateResponse.getTrackingPayloads();
        if (trackingPayloads != null) {
            this.tokenizedAnalytics.e(trackingPayloads);
        }
        this.container.M().update(new TotalStickyV3StateUpdate(updateResponse.getDto()));
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull TotalStickyV3VO item) {
        b i11;
        l20.d b11;
        T00.a b12;
        Intrinsics.checkNotNullParameter(item, "item");
        boolean z11 = false;
        getView().setVisibility(this.totalVisibilityViewModel.isVisibleFlow().getValue().booleanValue() ? 8 : 0);
        View view = getView();
        String str = null;
        TotalStickyV3View totalStickyV3View = view instanceof TotalStickyV3View ? (TotalStickyV3View) view : null;
        if (totalStickyV3View != null) {
            Function1<AtomAction, Unit> function1 = this.actionHandler;
            boolean z12 = this.appType == AppType.SELECT;
            if (this.asyncCartViewModel.isProcessing().getValue().booleanValue() && !this.totalVisibilityViewModel.isVisibleFlow().getValue().booleanValue()) {
                z11 = true;
            }
            totalStickyV3View.bind(item, function1, z12, z11);
        }
        this.viewModel.setAsyncData(item.getAsyncData());
        ru.ozon.composer.ui.widget.l viewItem = getViewItem();
        if (viewItem != null && (i11 = viewItem.i()) != null && (b11 = i11.b()) != null && (b12 = b11.b()) != null) {
            str = b12.c();
        }
        if (str == null) {
            str = "";
        }
        this.currentPageUrl = str;
        initLifecycleObserver();
    }

    @Override // d20.AbstractC6065b
    public void trackView(@NotNull TotalStickyV3VO item, @NotNull c trackingData, @NotNull f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        Intrinsics.checkNotNullParameter(viewedPond, "viewedPond");
        super.trackView((TotalStickyV3ViewHolder) item, trackingData, viewedPond);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            m.c(this.tokenizedAnalytics, tokenizedEvent, null);
        }
    }
}
