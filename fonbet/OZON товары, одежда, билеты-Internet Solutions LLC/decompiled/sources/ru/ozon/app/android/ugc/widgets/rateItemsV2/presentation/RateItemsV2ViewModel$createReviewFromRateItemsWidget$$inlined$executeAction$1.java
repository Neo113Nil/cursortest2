package ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation;

import Je.InterfaceC3394a;
import Sc.r;
import Sc.s;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.text.h;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.pdp.ui.configurators.ugc.data.CreateReviewResponse;
import ru.ozon.app.android.pdp.ui.configurators.ugc.rateItems.RateItemsDelegate;
import ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.model.RateItemsWidgetUiEffect;
import ru.ozon.uni.android.haptic.HapticToken;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xe.C10720e0;
import xe.C10727i;
import xe.L0;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.RateItemsV2ViewModel$createReviewFromRateItemsWidget$$inlined$executeAction$1", f = "RateItemsV2ViewModel.kt", l = {281, 284, 246, 255}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class RateItemsV2ViewModel$createReviewFromRateItemsWidget$$inlined$executeAction$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AtomAction.ComposerAction $action;
    final /* synthetic */ AtomAction.ComposerAction $action$inlined;
    final /* synthetic */ boolean $needToShowNext$inlined;
    final /* synthetic */ String $productId$inlined;
    final /* synthetic */ String $productId$inlined$1;
    final /* synthetic */ long $widgetId$inlined;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ RateItemsV2ViewModel this$0;
    final /* synthetic */ RateItemsV2ViewModel this$0$inline_fun;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.RateItemsV2ViewModel$createReviewFromRateItemsWidget$$inlined$executeAction$1$1", f = "RateItemsV2ViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.RateItemsV2ViewModel$createReviewFromRateItemsWidget$$inlined$executeAction$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        final /* synthetic */ AtomAction.ComposerAction $action$inlined;
        final /* synthetic */ Object $data;
        final /* synthetic */ boolean $needToShowNext$inlined;
        final /* synthetic */ String $productId$inlined;
        final /* synthetic */ long $widgetId$inlined;
        int label;
        final /* synthetic */ RateItemsV2ViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Object obj, d dVar, String str, RateItemsV2ViewModel rateItemsV2ViewModel, AtomAction.ComposerAction composerAction, long j11, boolean z11) {
            super(2, dVar);
            this.$data = obj;
            this.$productId$inlined = str;
            this.this$0 = rateItemsV2ViewModel;
            this.$action$inlined = composerAction;
            this.$widgetId$inlined = j11;
            this.$needToShowNext$inlined = z11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.$data, dVar, this.$productId$inlined, this.this$0, this.$action$inlined, this.$widgetId$inlined, this.$needToShowNext$inlined);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Map map;
            NotificationDTO notification;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            CreateReviewResponse createReviewResponse = (CreateReviewResponse) this.$data;
            RateItemsDelegate rateItemsDelegate = RateItemsDelegate.INSTANCE;
            String str = this.$productId$inlined;
            rateItemsDelegate.onReviewSuccess(str != null ? h.y0(str) : null, false);
            this.this$0.processCreationResultTrackingInfo(this.$action$inlined, this.$widgetId$inlined, createReviewResponse);
            if (this.$needToShowNext$inlined) {
                this.this$0.removeItem(this.$productId$inlined);
            } else {
                String reviewUuid = createReviewResponse != null ? createReviewResponse.getReviewUuid() : null;
                if (this.$productId$inlined != null && reviewUuid != null) {
                    map = this.this$0.ratedItems;
                    map.put(this.$productId$inlined, reviewUuid);
                }
            }
            if (createReviewResponse != null && (notification = createReviewResponse.getNotification()) != null) {
                this.this$0.sendEffect(new RateItemsWidgetUiEffect.ShowNotification(notification, createReviewResponse.getNotificationHaptic()));
            }
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.RateItemsV2ViewModel$createReviewFromRateItemsWidget$$inlined$executeAction$1$2", f = "RateItemsV2ViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.RateItemsV2ViewModel$createReviewFromRateItemsWidget$$inlined$executeAction$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends j implements Function2<M, d<? super Unit>, Object> {
        final /* synthetic */ Throwable $error;
        final /* synthetic */ String $productId$inlined;
        int label;
        final /* synthetic */ RateItemsV2ViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Throwable th2, d dVar, RateItemsV2ViewModel rateItemsV2ViewModel, String str) {
            super(2, dVar);
            this.$error = th2;
            this.this$0 = rateItemsV2ViewModel;
            this.$productId$inlined = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass2(this.$error, dVar, this.this$0, this.$productId$inlined);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            NotificationDTO createErrorNotification;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            Throwable th2 = this.$error;
            RateItemsV2ViewModel rateItemsV2ViewModel = this.this$0;
            HapticToken hapticToken = HapticToken.ERROR;
            createErrorNotification = rateItemsV2ViewModel.createErrorNotification(th2);
            rateItemsV2ViewModel.sendEffect(new RateItemsWidgetUiEffect.ShowNotification(createErrorNotification, hapticToken));
            this.this$0.revertRatingSelection(this.$productId$inlined);
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RateItemsV2ViewModel$createReviewFromRateItemsWidget$$inlined$executeAction$1(RateItemsV2ViewModel rateItemsV2ViewModel, AtomAction.ComposerAction composerAction, d dVar, String str, RateItemsV2ViewModel rateItemsV2ViewModel2, AtomAction.ComposerAction composerAction2, long j11, boolean z11, RateItemsV2ViewModel rateItemsV2ViewModel3, String str2) {
        super(2, dVar);
        this.this$0$inline_fun = rateItemsV2ViewModel;
        this.$action = composerAction;
        this.$productId$inlined = str;
        this.this$0 = rateItemsV2ViewModel2;
        this.$action$inlined = composerAction2;
        this.$widgetId$inlined = j11;
        this.$needToShowNext$inlined = z11;
        this.$productId$inlined$1 = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        RateItemsV2ViewModel rateItemsV2ViewModel = this.this$0$inline_fun;
        AtomAction.ComposerAction composerAction = this.$action;
        String str = this.$productId$inlined;
        RateItemsV2ViewModel rateItemsV2ViewModel2 = this.this$0;
        return new RateItemsV2ViewModel$createReviewFromRateItemsWidget$$inlined$executeAction$1(rateItemsV2ViewModel, composerAction, dVar, str, rateItemsV2ViewModel2, this.$action$inlined, this.$widgetId$inlined, this.$needToShowNext$inlined, rateItemsV2ViewModel2, this.$productId$inlined$1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x011a, code lost:
    
        if (xe.C10727i.f(r5, r6, r17) == r2) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00fa A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:22:0x0030, B:24:0x00f4, B:26:0x00fa, B:28:0x00fe, B:31:0x011d), top: B:21:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cc A[Catch: all -> 0x004b, TRY_LEAVE, TryCatch #1 {all -> 0x004b, blocks: (B:37:0x003e, B:38:0x00b2, B:40:0x00c6, B:42:0x00cc, B:51:0x00c0, B:48:0x00b8), top: B:36:0x003e, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC3394a interfaceC3394a;
        AtomAction.ComposerAction composerAction;
        InterfaceC3394a interfaceC3394a2;
        RateItemsV2ViewModel rateItemsV2ViewModel;
        InterfaceC3394a interfaceC3394a3;
        ActionV2Repository actionV2Repository;
        Object mo479requestActionResult0E7RQCE;
        InterfaceC3394a interfaceC3394a4;
        Object obj2;
        InterfaceC3394a interfaceC3394a5;
        Object obj3;
        Throwable b11;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                s.b(obj);
                interfaceC3394a = this.this$0$inline_fun.actionExecutionMutex;
                AtomAction.ComposerAction composerAction2 = this.$action;
                RateItemsV2ViewModel rateItemsV2ViewModel2 = this.this$0$inline_fun;
                this.L$0 = interfaceC3394a;
                this.L$1 = composerAction2;
                this.L$2 = rateItemsV2ViewModel2;
                this.label = 1;
                if (interfaceC3394a.a(this) != aVar) {
                    composerAction = composerAction2;
                    interfaceC3394a2 = interfaceC3394a;
                    rateItemsV2ViewModel = rateItemsV2ViewModel2;
                }
                return aVar;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        interfaceC3394a3 = (InterfaceC3394a) this.L$0;
                        try {
                            s.b(obj);
                            Unit unit = Unit.f71690a;
                            interfaceC3394a3.c(null);
                            return Unit.f71690a;
                        } catch (Throwable th2) {
                            th = th2;
                            interfaceC3394a3.c(null);
                            throw th;
                        }
                    }
                    obj3 = this.L$1;
                    interfaceC3394a5 = (InterfaceC3394a) this.L$0;
                    try {
                        s.b(obj);
                        obj2 = obj3;
                        b11 = r.b(obj2);
                        if (b11 != null) {
                            if (b11 instanceof CancellationException) {
                                throw b11;
                            }
                            Lm0.a.f17149a.e(b11);
                            C10720e0 c10720e0 = C10720e0.f105451a;
                            L0 l02 = De.s.f6650a;
                            AnonymousClass2 anonymousClass2 = new AnonymousClass2(b11, null, this.this$0, this.$productId$inlined$1);
                            this.L$0 = interfaceC3394a5;
                            this.L$1 = obj2;
                            this.label = 4;
                        }
                        interfaceC3394a3 = interfaceC3394a5;
                        Unit unit2 = Unit.f71690a;
                        interfaceC3394a3.c(null);
                        return Unit.f71690a;
                    } catch (Throwable th3) {
                        th = th3;
                        interfaceC3394a3 = interfaceC3394a5;
                        interfaceC3394a3.c(null);
                        throw th;
                    }
                }
                interfaceC3394a4 = (InterfaceC3394a) this.L$0;
                try {
                    s.b(obj);
                    mo479requestActionResult0E7RQCE = ((r) obj).getF26106a();
                    r.Companion companion = r.INSTANCE;
                    if (!(mo479requestActionResult0E7RQCE instanceof r.b)) {
                        try {
                            mo479requestActionResult0E7RQCE = ((ActionV2Response) mo479requestActionResult0E7RQCE).getData();
                        } catch (Throwable th4) {
                            r.Companion companion2 = r.INSTANCE;
                            mo479requestActionResult0E7RQCE = s.a(th4);
                        }
                    }
                    obj2 = mo479requestActionResult0E7RQCE;
                    if (!(obj2 instanceof r.b)) {
                        interfaceC3394a5 = interfaceC3394a4;
                        b11 = r.b(obj2);
                        if (b11 != null) {
                        }
                        interfaceC3394a3 = interfaceC3394a5;
                        Unit unit22 = Unit.f71690a;
                        interfaceC3394a3.c(null);
                        return Unit.f71690a;
                    }
                    C10720e0 c10720e02 = C10720e0.f105451a;
                    L0 l03 = De.s.f6650a;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(obj2, null, this.$productId$inlined, this.this$0, this.$action$inlined, this.$widgetId$inlined, this.$needToShowNext$inlined);
                    this.L$0 = interfaceC3394a4;
                    this.L$1 = obj2;
                    this.label = 3;
                    if (C10727i.f(l03, anonymousClass1, this) != aVar) {
                        interfaceC3394a5 = interfaceC3394a4;
                        obj3 = obj2;
                        obj2 = obj3;
                        b11 = r.b(obj2);
                        if (b11 != null) {
                        }
                        interfaceC3394a3 = interfaceC3394a5;
                        Unit unit222 = Unit.f71690a;
                        interfaceC3394a3.c(null);
                        return Unit.f71690a;
                    }
                    return aVar;
                } catch (Throwable th5) {
                    th = th5;
                    interfaceC3394a3 = interfaceC3394a4;
                    interfaceC3394a3.c(null);
                    throw th;
                }
            }
            rateItemsV2ViewModel = (RateItemsV2ViewModel) this.L$2;
            composerAction = (AtomAction.ComposerAction) this.L$1;
            interfaceC3394a2 = (InterfaceC3394a) this.L$0;
            s.b(obj);
            String actionName = composerAction.getActionName();
            Map<String, String> params = composerAction.getParams();
            if (params == null) {
                params = U.c();
            }
            ActionV2Request actionV2Request = new ActionV2Request(params, actionName, false, 4, null);
            actionV2Repository = rateItemsV2ViewModel.actionV2Repository;
            this.L$0 = interfaceC3394a2;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 2;
            mo479requestActionResult0E7RQCE = actionV2Repository.mo479requestActionResult0E7RQCE(actionV2Request, CreateReviewResponse.class, this);
            if (mo479requestActionResult0E7RQCE != aVar) {
                interfaceC3394a4 = interfaceC3394a2;
                r.Companion companion3 = r.INSTANCE;
                if (!(mo479requestActionResult0E7RQCE instanceof r.b)) {
                }
                obj2 = mo479requestActionResult0E7RQCE;
                if (!(obj2 instanceof r.b)) {
                }
            }
            return aVar;
        } catch (Throwable th6) {
            th = th6;
            interfaceC3394a3 = interfaceC3394a2;
            interfaceC3394a3.c(null);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((RateItemsV2ViewModel$createReviewFromRateItemsWidget$$inlined$executeAction$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
