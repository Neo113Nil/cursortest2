package ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation;

import Je.InterfaceC3394a;
import Sc.r;
import Sc.s;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.ugc.widgets.rateItemsV2.data.RateItemsV2DTO;
import ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.model.RateItemsV2ViewState;
import ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.model.RateItemsWidgetUiEffect;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xe.C10720e0;
import xe.L0;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.RateItemsV2ViewModel$onIgnoreItemAction$$inlined$executeAction$1", f = "RateItemsV2ViewModel.kt", l = {281, 284, 246, 255}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class RateItemsV2ViewModel$onIgnoreItemAction$$inlined$executeAction$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AtomAction.ComposerAction $action;
    final /* synthetic */ AtomAction.ComposerAction $action$inlined;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ RateItemsV2ViewModel this$0;
    final /* synthetic */ RateItemsV2ViewModel this$0$inline_fun;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.RateItemsV2ViewModel$onIgnoreItemAction$$inlined$executeAction$1$1", f = "RateItemsV2ViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.RateItemsV2ViewModel$onIgnoreItemAction$$inlined$executeAction$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        final /* synthetic */ AtomAction.ComposerAction $action$inlined;
        final /* synthetic */ Object $data;
        int label;
        final /* synthetic */ RateItemsV2ViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Object obj, d dVar, RateItemsV2ViewModel rateItemsV2ViewModel, AtomAction.ComposerAction composerAction) {
            super(2, dVar);
            this.$data = obj;
            this.this$0 = rateItemsV2ViewModel;
            this.$action$inlined = composerAction;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.$data, dVar, this.this$0, this.$action$inlined);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String productId;
            Set set;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            RateItemsV2ViewState value = this.this$0.getViewState().getValue();
            RateItemsV2ViewState.Content content = value instanceof RateItemsV2ViewState.Content ? (RateItemsV2ViewState.Content) value : null;
            if (content != null) {
                productId = this.this$0.productId(this.$action$inlined);
                if (productId == null) {
                    productId = this.this$0.firstProductSku(content.getData().getItems());
                }
                if (productId != null) {
                    set = this.this$0.ignoredSkus;
                    set.add(productId);
                }
                if (content.getData().getScrollType() == RateItemsV2DTO.ScrollType.ONE_BY_ONE_WITH_SCROLL) {
                    this.this$0.sendEffect(RateItemsWidgetUiEffect.AnimateIgnoreItem.INSTANCE);
                } else {
                    this.this$0.removeItem(productId);
                }
            }
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.RateItemsV2ViewModel$onIgnoreItemAction$$inlined$executeAction$1$2", f = "RateItemsV2ViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.RateItemsV2ViewModel$onIgnoreItemAction$$inlined$executeAction$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends j implements Function2<M, d<? super Unit>, Object> {
        final /* synthetic */ Throwable $error;
        int label;
        final /* synthetic */ RateItemsV2ViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Throwable th2, d dVar, RateItemsV2ViewModel rateItemsV2ViewModel) {
            super(2, dVar);
            this.$error = th2;
            this.this$0 = rateItemsV2ViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass2(this.$error, dVar, this.this$0);
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
            createErrorNotification = this.this$0.createErrorNotification(th2);
            rateItemsV2ViewModel.sendEffect(new RateItemsWidgetUiEffect.ShowNotification(createErrorNotification, null, 2, null));
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RateItemsV2ViewModel$onIgnoreItemAction$$inlined$executeAction$1(RateItemsV2ViewModel rateItemsV2ViewModel, AtomAction.ComposerAction composerAction, d dVar, RateItemsV2ViewModel rateItemsV2ViewModel2, AtomAction.ComposerAction composerAction2, RateItemsV2ViewModel rateItemsV2ViewModel3) {
        super(2, dVar);
        this.this$0$inline_fun = rateItemsV2ViewModel;
        this.$action = composerAction;
        this.this$0 = rateItemsV2ViewModel2;
        this.$action$inlined = composerAction2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        RateItemsV2ViewModel rateItemsV2ViewModel = this.this$0$inline_fun;
        AtomAction.ComposerAction composerAction = this.$action;
        RateItemsV2ViewModel rateItemsV2ViewModel2 = this.this$0;
        return new RateItemsV2ViewModel$onIgnoreItemAction$$inlined$executeAction$1(rateItemsV2ViewModel, composerAction, dVar, rateItemsV2ViewModel2, this.$action$inlined, rateItemsV2ViewModel2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x010a, code lost:
    
        if (xe.C10727i.f(r4, r5, r13) == r1) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e2, code lost:
    
        if (xe.C10727i.f(r14, r5, r13) == r1) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ec A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:23:0x002f, B:24:0x00e6, B:26:0x00ec, B:28:0x00f0, B:31:0x010d), top: B:22:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cb A[Catch: all -> 0x0049, TRY_LEAVE, TryCatch #1 {all -> 0x0049, blocks: (B:37:0x003e, B:38:0x00b0, B:40:0x00c5, B:42:0x00cb, B:51:0x00bf, B:47:0x00b6), top: B:36:0x003e, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC3394a interfaceC3394a;
        AtomAction.ComposerAction composerAction;
        RateItemsV2ViewModel rateItemsV2ViewModel;
        InterfaceC3394a interfaceC3394a2;
        ActionV2Repository actionV2Repository;
        InterfaceC3394a interfaceC3394a3;
        Object obj2;
        Throwable th2;
        Object obj3;
        InterfaceC3394a interfaceC3394a4;
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
                    rateItemsV2ViewModel = rateItemsV2ViewModel2;
                }
                return aVar;
            }
            if (i11 != 1) {
                if (i11 == 2) {
                    interfaceC3394a3 = (InterfaceC3394a) this.L$0;
                    try {
                        s.b(obj);
                        obj2 = ((r) obj).getF26106a();
                        r.Companion companion = r.INSTANCE;
                        if (!(obj2 instanceof r.b)) {
                            try {
                                obj2 = ((ActionV2Response) obj2).getData();
                            } catch (Throwable th3) {
                                r.Companion companion2 = r.INSTANCE;
                                obj2 = s.a(th3);
                            }
                        }
                        obj3 = obj2;
                        if (!(obj3 instanceof r.b)) {
                            C10720e0 c10720e0 = C10720e0.f105451a;
                            L0 l02 = De.s.f6650a;
                            AnonymousClass1 anonymousClass1 = new AnonymousClass1(obj3, null, this.this$0, this.$action$inlined);
                            this.L$0 = interfaceC3394a3;
                            this.L$1 = obj3;
                            this.label = 3;
                        }
                        interfaceC3394a4 = interfaceC3394a3;
                        b11 = r.b(obj3);
                        if (b11 != null) {
                        }
                        interfaceC3394a2 = interfaceC3394a4;
                        Unit unit = Unit.f71690a;
                        interfaceC3394a2.c(null);
                        return Unit.f71690a;
                    } catch (Throwable th4) {
                        th2 = th4;
                        interfaceC3394a2 = interfaceC3394a3;
                        interfaceC3394a2.c(null);
                        throw th2;
                    }
                }
                if (i11 != 3) {
                    if (i11 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC3394a2 = (InterfaceC3394a) this.L$0;
                    try {
                        s.b(obj);
                        Unit unit2 = Unit.f71690a;
                        interfaceC3394a2.c(null);
                        return Unit.f71690a;
                    } catch (Throwable th5) {
                        th = th5;
                        th2 = th;
                        interfaceC3394a2.c(null);
                        throw th2;
                    }
                }
                obj3 = this.L$1;
                interfaceC3394a4 = (InterfaceC3394a) this.L$0;
                try {
                    s.b(obj);
                    b11 = r.b(obj3);
                    if (b11 != null) {
                        if (b11 instanceof CancellationException) {
                            throw b11;
                        }
                        Lm0.a.f17149a.e(b11);
                        C10720e0 c10720e02 = C10720e0.f105451a;
                        L0 l03 = De.s.f6650a;
                        AnonymousClass2 anonymousClass2 = new AnonymousClass2(b11, null, this.this$0);
                        this.L$0 = interfaceC3394a4;
                        this.L$1 = obj3;
                        this.label = 4;
                    }
                    interfaceC3394a2 = interfaceC3394a4;
                    Unit unit22 = Unit.f71690a;
                    interfaceC3394a2.c(null);
                    return Unit.f71690a;
                } catch (Throwable th6) {
                    th2 = th6;
                    interfaceC3394a2 = interfaceC3394a4;
                    interfaceC3394a2.c(null);
                    throw th2;
                }
            }
            rateItemsV2ViewModel = (RateItemsV2ViewModel) this.L$2;
            composerAction = (AtomAction.ComposerAction) this.L$1;
            InterfaceC3394a interfaceC3394a5 = (InterfaceC3394a) this.L$0;
            s.b(obj);
            interfaceC3394a = interfaceC3394a5;
            String actionName = composerAction.getActionName();
            Map<String, String> params = composerAction.getParams();
            if (params == null) {
                params = U.c();
            }
            ActionV2Request actionV2Request = new ActionV2Request(params, actionName, false, 4, null);
            actionV2Repository = rateItemsV2ViewModel.actionV2Repository;
            this.L$0 = interfaceC3394a;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 2;
            Object mo479requestActionResult0E7RQCE = actionV2Repository.mo479requestActionResult0E7RQCE(actionV2Request, Object.class, this);
            if (mo479requestActionResult0E7RQCE != aVar) {
                interfaceC3394a3 = interfaceC3394a;
                obj2 = mo479requestActionResult0E7RQCE;
                r.Companion companion3 = r.INSTANCE;
                if (!(obj2 instanceof r.b)) {
                }
                obj3 = obj2;
                if (!(obj3 instanceof r.b)) {
                }
                interfaceC3394a4 = interfaceC3394a3;
                b11 = r.b(obj3);
                if (b11 != null) {
                }
                interfaceC3394a2 = interfaceC3394a4;
                Unit unit222 = Unit.f71690a;
                interfaceC3394a2.c(null);
                return Unit.f71690a;
            }
            return aVar;
        } catch (Throwable th7) {
            th = th7;
            interfaceC3394a2 = interfaceC3394a;
            th2 = th;
            interfaceC3394a2.c(null);
            throw th2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((RateItemsV2ViewModel$onIgnoreItemAction$$inlined$executeAction$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
