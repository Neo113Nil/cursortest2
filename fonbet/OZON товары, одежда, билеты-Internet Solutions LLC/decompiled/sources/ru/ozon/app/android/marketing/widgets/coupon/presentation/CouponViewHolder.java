package ru.ozon.app.android.marketing.widgets.coupon.presentation;

import A00.a;
import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.o;
import Sc.s;
import WZ.l;
import WZ.t;
import android.view.View;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.marketing.coupon.ActivateCouponActionHandler;
import ru.ozon.app.android.marketing.databinding.WidgetGradientCouponBinding;
import ru.ozon.app.android.marketing.widgets.coupon.common.CouponAction;
import ru.ozon.app.android.marketing.widgets.coupon.common.CouponState;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u00020\u0004B3\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\u0010\u000b\u001a\u00060\tj\u0002`\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u0018\u0010\u001cJ3\u0010$\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u00022\n\u0010 \u001a\u00060\u001ej\u0002`\u001f2\u000e\u0010#\u001a\n\u0018\u00010!j\u0004\u0018\u0001`\"H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0017H\u0016¢\u0006\u0004\b&\u0010'J#\u0010+\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u00022\n\u0010*\u001a\u00060(j\u0002`)H\u0014¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010/R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00100R\u0018\u0010\u000b\u001a\u00060\tj\u0002`\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00101R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00102R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00103R \u00106\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u0017048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006>"}, d2 = {"Lru/ozon/app/android/marketing/widgets/coupon/presentation/CouponViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/marketing/widgets/coupon/presentation/CouponVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/marketing/widgets/coupon/presentation/CouponViewModel;", "viewModel", "Lru/ozon/app/android/marketing/coupon/ActivateCouponActionHandler;", "couponActionHandler", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;Lru/ozon/app/android/marketing/widgets/coupon/presentation/CouponViewModel;Lru/ozon/app/android/marketing/coupon/ActivateCouponActionHandler;)V", "", "isStickyHeader", "()Z", "Lru/ozon/app/android/marketing/widgets/coupon/common/CouponAction;", "action", "", "observe", "(Lru/ozon/app/android/marketing/widgets/coupon/common/CouponAction;)V", "Lru/ozon/app/android/marketing/widgets/coupon/common/CouponState;", "state", "(Lru/ozon/app/android/marketing/widgets/coupon/common/CouponState;)V", "item", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/marketing/widgets/coupon/presentation/CouponVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "onAttach", "()V", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/marketing/widgets/coupon/presentation/CouponVO;Ll20/d;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "Lru/ozon/app/android/marketing/widgets/coupon/presentation/CouponViewModel;", "Lru/ozon/app/android/marketing/coupon/ActivateCouponActionHandler;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/marketing/databinding/WidgetGradientCouponBinding;", "binding", "Lru/ozon/app/android/marketing/databinding/WidgetGradientCouponBinding;", "Lru/ozon/app/android/marketing/widgets/coupon/presentation/CouponBinder;", "couponBinder", "Lru/ozon/app/android/marketing/widgets/coupon/presentation/CouponBinder;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CouponViewHolder extends k<CouponVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetGradientCouponBinding binding;

    @NotNull
    private final View containerView;

    @NotNull
    private final ActivateCouponActionHandler couponActionHandler;

    @NotNull
    private final CouponBinder couponBinder;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final CouponViewModel viewModel;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.marketing.widgets.coupon.presentation.CouponViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<Unit> {
        AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            CouponVO boundedData = CouponViewHolder.this.getBoundedData();
            if (boundedData != null) {
                CouponViewHolder couponViewHolder = CouponViewHolder.this;
                AtomAction action = boundedData.getAction();
                if (action != null) {
                    couponViewHolder.actionHandler.invoke(action);
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CouponViewHolder(@NotNull View containerView, @NotNull ComposerReferences refs, @NotNull l tokenizedAnalytics, @NotNull CouponViewModel viewModel, @NotNull ActivateCouponActionHandler couponActionHandler) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(couponActionHandler, "couponActionHandler");
        this.containerView = containerView;
        this.refs = refs;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.viewModel = viewModel;
        this.couponActionHandler = couponActionHandler;
        this.actionHandler = new ActionHandler.Builder(refs, this).onComposerAction(new CouponViewHolder$actionHandler$1(this)).buildHandler();
        WidgetGradientCouponBinding bind = WidgetGradientCouponBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        CouponBinder couponBinder = new CouponBinder(bind);
        this.couponBinder = couponBinder;
        couponBinder.setOnClickListener(new AnonymousClass1());
    }

    private final boolean isStickyHeader() {
        return this.itemView.getTag(R.id.sticky_header_tag_config) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void observe(CouponAction action) {
        if (action instanceof CouponAction.FullRefresh) {
            InterfaceC7851b.a.e(this.refs.getController(), null, null, null, 7);
            return;
        }
        if (action instanceof CouponAction.CouponAsyncRefresh) {
            this.refs.getController().update(((CouponAction.CouponAsyncRefresh) action).getNewCouponState());
            return;
        }
        if (!(action instanceof CouponAction.AsyncRefresh)) {
            if (!(action instanceof CouponAction.UpdateCurrentMiniWidget)) {
                throw new o();
            }
            this.refs.getController().update(((CouponAction.UpdateCurrentMiniWidget) action).getCurrentMiniWidget());
            return;
        }
        CouponAction.AsyncRefresh asyncRefresh = (CouponAction.AsyncRefresh) action;
        this.refs.getController().update(asyncRefresh.getFromState());
        a.J.InterfaceC0007a toState = asyncRefresh.getToState();
        if (toState != null) {
            this.refs.getController().update(toState);
        }
        a.J.InterfaceC0007a cartData = asyncRefresh.getCartData();
        if (cartData != null) {
            this.refs.getController().update(cartData);
        }
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        this.viewModel.getCouponState().observe(this, new CouponViewHolder$sam$androidx_lifecycle_Observer$0(new CouponViewHolder$onAttach$1(this)));
        this.viewModel.getAction().observe(this, new CouponViewHolder$sam$androidx_lifecycle_Observer$0(new CouponViewHolder$onAttach$2(this)));
        final InterfaceC2395h<Set<String>> observeCouponStorage = this.couponActionHandler.observeCouponStorage();
        final CouponBinder couponBinder = this.couponBinder;
        C2399j.C(new C2408n0(C2399j.o(new InterfaceC2395h<Set<? extends String>>() { // from class: ru.ozon.app.android.marketing.widgets.coupon.presentation.CouponViewHolder$onAttach$$inlined$filter$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.marketing.widgets.coupon.presentation.CouponViewHolder$onAttach$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;
                final /* synthetic */ CouponBinder receiver$inlined;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.marketing.widgets.coupon.presentation.CouponViewHolder$onAttach$$inlined$filter$1$2", f = "CouponViewHolder.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.marketing.widgets.coupon.presentation.CouponViewHolder$onAttach$$inlined$filter$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(InterfaceC2397i interfaceC2397i, CouponBinder couponBinder) {
                    this.$this_unsafeFlow = interfaceC2397i;
                    this.receiver$inlined = couponBinder;
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
                                if (this.receiver$inlined.isCouponApplied((Set) obj)) {
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
            public Object collect(InterfaceC2397i<? super Set<? extends String>> interfaceC2397i, d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i, couponBinder), dVar);
                return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        }), new CouponViewHolder$onAttach$4(this, null)), K.a(this));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull CouponVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.couponBinder.bind(item, isStickyHeader());
        this.viewModel.bindInitial(item, info.c().a());
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull CouponVO item, @NotNull W10.c trackingData, f viewedPond) {
        t tokenizedEvent;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((CouponViewHolder) item, trackingData, viewedPond);
        String c11 = trackingData.c();
        if (c11 == null) {
            c11 = "";
        }
        if ((viewedPond == null || !viewedPond.c(c11)) && (tokenizedEvent = item.getTokenizedEvent()) != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
            if (viewedPond != null) {
                viewedPond.e(c11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void observe(CouponState state) {
        if (state instanceof CouponState.NeedLogin) {
            this.couponBinder.setApplied(false);
            return;
        }
        if (state instanceof CouponState.ReadyToApply) {
            this.couponBinder.setApplied(false);
            return;
        }
        if (state instanceof CouponState.Applied) {
            this.couponBinder.setApplied(true);
            return;
        }
        if (state instanceof CouponState.ChangeMiniWidget) {
            CouponState.ChangeMiniWidget changeMiniWidget = (CouponState.ChangeMiniWidget) state;
            if (changeMiniWidget.getCouponState() != null) {
                this.refs.getController().update(changeMiniWidget.getCouponState());
            } else {
                InterfaceC7851b.a.e(this.refs.getController(), null, null, null, 7);
            }
            if (changeMiniWidget.getNewWidgetState() != null) {
                this.refs.getController().update(changeMiniWidget.getNewWidgetState());
                return;
            }
            return;
        }
        throw new o();
    }
}
