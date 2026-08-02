package ru.ozon.app.android.authCustomActionHandlers.email;

import Ge.f;
import Sc.s;
import W10.c;
import Wc.a;
import a00.C4911f;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import i10.l;
import io.reactivex.y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import l10.InterfaceC7851b;
import ru.ozon.app.android.account.eventBus.EmailActualizedEventBus;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.authCustomActionHandlers.email.ActionDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.authCustomActionHandlers.email.EmailActionHandler$processAction$1", f = "EmailActionHandler.kt", l = {54, 59, RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH, 70}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class EmailActionHandler$processAction$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ C4911f $container;
    final /* synthetic */ InterfaceC7851b $controller;
    final /* synthetic */ CustomActionHandler.HandlerReferences $handlerRefs;
    final /* synthetic */ ActionV2Request $request;
    Object L$0;
    int label;
    final /* synthetic */ EmailActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EmailActionHandler$processAction$1(InterfaceC7851b interfaceC7851b, EmailActionHandler emailActionHandler, ActionV2Request actionV2Request, CustomActionHandler.HandlerReferences handlerReferences, C4911f c4911f, d<? super EmailActionHandler$processAction$1> dVar) {
        super(2, dVar);
        this.$controller = interfaceC7851b;
        this.this$0 = emailActionHandler;
        this.$request = actionV2Request;
        this.$handlerRefs = handlerReferences;
        this.$container = c4911f;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new EmailActionHandler$processAction$1(this.$controller, this.this$0, this.$request, this.$handlerRefs, this.$container, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b3, code lost:
    
        if (r10.emit(r9) == r0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00cc, code lost:
    
        if (r10 != r0) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008f A[Catch: Exception -> 0x0025, TryCatch #0 {Exception -> 0x0025, blocks: (B:14:0x0020, B:16:0x002c, B:17:0x0089, B:19:0x008f, B:21:0x0097, B:22:0x00a3, B:24:0x00ab, B:28:0x0030, B:29:0x0061, B:31:0x0071, B:33:0x0074, B:35:0x007a, B:39:0x0037, B:41:0x004c, B:42:0x0051), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0097 A[Catch: Exception -> 0x0025, TryCatch #0 {Exception -> 0x0025, blocks: (B:14:0x0020, B:16:0x002c, B:17:0x0089, B:19:0x008f, B:21:0x0097, B:22:0x00a3, B:24:0x00ab, B:28:0x0030, B:29:0x0061, B:31:0x0071, B:33:0x0074, B:35:0x007a, B:39:0x0037, B:41:0x004c, B:42:0x0051), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a3 A[Catch: Exception -> 0x0025, TryCatch #0 {Exception -> 0x0025, blocks: (B:14:0x0020, B:16:0x002c, B:17:0x0089, B:19:0x008f, B:21:0x0097, B:22:0x00a3, B:24:0x00ab, B:28:0x0030, B:29:0x0061, B:31:0x0071, B:33:0x0074, B:35:0x007a, B:39:0x0037, B:41:0x004c, B:42:0x0051), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0094  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object showError;
        ActionV2Repository actionV2Repository;
        ActionDTO actionDTO;
        Object showMessage;
        AtomAction atomAction;
        EmailActualizedEventBus emailActualizedEventBus;
        Function1 createActionHandler;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
        } catch (Exception e11) {
            this.$controller.hideLoader();
            Lm0.a.f17149a.e(e11);
            EmailActionHandler emailActionHandler = this.this$0;
            C4911f c4911f = this.$container;
            this.L$0 = null;
            this.label = 4;
            showError = emailActionHandler.showError(c4911f, this);
        }
        if (i11 == 0) {
            s.b(obj);
            this.$controller.e(new l.a.C1079a(0L, null, 3));
            actionV2Repository = this.this$0.actionV2Repository;
            ActionV2Request actionV2Request = this.$request;
            c trackingData = this.$handlerRefs.getTrackingData();
            if (trackingData == null) {
                trackingData = new c(null, null, null);
            }
            y callActionWithTracking = actionV2Repository.callActionWithTracking(actionV2Request, trackingData, ActionDTO.class);
            this.label = 1;
            obj = f.b(callActionWithTracking, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        s.b(obj);
                    } else {
                        if (i11 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                    }
                    return Unit.f71690a;
                }
                actionDTO = (ActionDTO) this.L$0;
                s.b(obj);
                AtomActionDTO action = actionDTO.getAction();
                atomAction = action == null ? AtomActionMapperKt.toAtomAction(action, null) : null;
                if (atomAction == null) {
                    createActionHandler = this.this$0.createActionHandler(this.$handlerRefs);
                    createActionHandler.invoke(atomAction);
                } else {
                    emailActualizedEventBus = this.this$0.emailActualizedEventBus;
                    if (emailActualizedEventBus != null) {
                        this.L$0 = null;
                        this.label = 3;
                    }
                }
                return Unit.f71690a;
            }
            s.b(obj);
        }
        this.$controller.hideLoader();
        actionDTO = (ActionDTO) ((ActionV2Response) obj).getData();
        if (actionDTO == null) {
            return Unit.f71690a;
        }
        ActionDTO.MessageDTO message = actionDTO.getMessage();
        if (message != null) {
            EmailActionHandler emailActionHandler2 = this.this$0;
            C4911f c4911f2 = this.$container;
            this.L$0 = actionDTO;
            this.label = 2;
            showMessage = emailActionHandler2.showMessage(c4911f2, message, this);
            if (showMessage == aVar) {
                return aVar;
            }
        }
        AtomActionDTO action2 = actionDTO.getAction();
        if (action2 == null) {
        }
        if (atomAction == null) {
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((EmailActionHandler$processAction$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
