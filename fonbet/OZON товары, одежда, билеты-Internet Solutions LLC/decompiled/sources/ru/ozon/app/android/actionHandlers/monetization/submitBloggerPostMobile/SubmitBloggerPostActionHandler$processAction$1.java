package ru.ozon.app.android.actionHandlers.monetization.submitBloggerPostMobile;

import Sc.r;
import Sc.s;
import Wc.a;
import i10.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import l10.InterfaceC7851b;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xe.C10720e0;
import xe.L0;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.actionHandlers.monetization.submitBloggerPostMobile.SubmitBloggerPostActionHandler$processAction$1", f = "SubmitBloggerPostActionHandler.kt", l = {49, 55, 61}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class SubmitBloggerPostActionHandler$processAction$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ InterfaceC7851b $controller;
    final /* synthetic */ CustomActionHandler.HandlerReferences $handlerRefs;
    final /* synthetic */ ActionV2Request $request;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SubmitBloggerPostActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubmitBloggerPostActionHandler$processAction$1(InterfaceC7851b interfaceC7851b, SubmitBloggerPostActionHandler submitBloggerPostActionHandler, ActionV2Request actionV2Request, CustomActionHandler.HandlerReferences handlerReferences, d<? super SubmitBloggerPostActionHandler$processAction$1> dVar) {
        super(2, dVar);
        this.$controller = interfaceC7851b;
        this.this$0 = submitBloggerPostActionHandler;
        this.$request = actionV2Request;
        this.$handlerRefs = handlerReferences;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        SubmitBloggerPostActionHandler$processAction$1 submitBloggerPostActionHandler$processAction$1 = new SubmitBloggerPostActionHandler$processAction$1(this.$controller, this.this$0, this.$request, this.$handlerRefs, dVar);
        submitBloggerPostActionHandler$processAction$1.L$0 = obj;
        return submitBloggerPostActionHandler$processAction$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x007e, code lost:
    
        if (xe.C10727i.f(r2, r7, r8) == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0092, code lost:
    
        if (xe.C10727i.f(r3, r6, r8) == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a1  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a11;
        Object obj2;
        Throwable b11;
        NotificationDTO errorNotificationDTO;
        ActionV2Repository actionV2Repository;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
        } catch (Throwable th2) {
            r.Companion companion = r.INSTANCE;
            a11 = s.a(th2);
        }
        if (i11 == 0) {
            s.b(obj);
            this.$controller.e(new l.a.C1079a(0L, null, 3));
            SubmitBloggerPostActionHandler submitBloggerPostActionHandler = this.this$0;
            ActionV2Request actionV2Request = this.$request;
            r.Companion companion2 = r.INSTANCE;
            actionV2Repository = submitBloggerPostActionHandler.actionV2Repository;
            this.label = 1;
            obj = actionV2Repository.callActionSuspend(actionV2Request, SubmitBloggerPostResponse.class, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                if (i11 != 2 && i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.L$0;
                s.b(obj);
                InterfaceC7851b interfaceC7851b = this.$controller;
                SubmitBloggerPostActionHandler submitBloggerPostActionHandler2 = this.this$0;
                CustomActionHandler.HandlerReferences handlerReferences = this.$handlerRefs;
                b11 = r.b(obj2);
                if (b11 != null) {
                    interfaceC7851b.hideLoader();
                    Lm0.a.f17149a.e(b11);
                    errorNotificationDTO = submitBloggerPostActionHandler2.getErrorNotificationDTO();
                    SubmitBloggerPostActionHandler.showNotification$default(submitBloggerPostActionHandler2, errorNotificationDTO, handlerReferences.getRefs(), null, 4, null);
                }
                return Unit.f71690a;
            }
            s.b(obj);
        }
        a11 = (SubmitBloggerPostResponse) ((ActionV2Response) obj).getData();
        r.Companion companion3 = r.INSTANCE;
        obj2 = a11;
        InterfaceC7851b interfaceC7851b2 = this.$controller;
        SubmitBloggerPostActionHandler submitBloggerPostActionHandler3 = this.this$0;
        CustomActionHandler.HandlerReferences handlerReferences2 = this.$handlerRefs;
        if (!(obj2 instanceof r.b)) {
            SubmitBloggerPostResponse submitBloggerPostResponse = (SubmitBloggerPostResponse) obj2;
            interfaceC7851b2.hideLoader();
            if (submitBloggerPostResponse != null) {
                C10720e0 c10720e0 = C10720e0.f105451a;
                L0 l02 = De.s.f6650a;
                SubmitBloggerPostActionHandler$processAction$1$2$1 submitBloggerPostActionHandler$processAction$1$2$1 = new SubmitBloggerPostActionHandler$processAction$1$2$1(submitBloggerPostResponse, submitBloggerPostActionHandler3, handlerReferences2, null);
                this.L$0 = obj2;
                this.label = 2;
            } else {
                C10720e0 c10720e02 = C10720e0.f105451a;
                L0 l03 = De.s.f6650a;
                SubmitBloggerPostActionHandler$processAction$1$2$2 submitBloggerPostActionHandler$processAction$1$2$2 = new SubmitBloggerPostActionHandler$processAction$1$2$2(submitBloggerPostActionHandler3, handlerReferences2, null);
                this.L$0 = obj2;
                this.label = 3;
            }
        }
        InterfaceC7851b interfaceC7851b3 = this.$controller;
        SubmitBloggerPostActionHandler submitBloggerPostActionHandler22 = this.this$0;
        CustomActionHandler.HandlerReferences handlerReferences3 = this.$handlerRefs;
        b11 = r.b(obj2);
        if (b11 != null) {
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((SubmitBloggerPostActionHandler$processAction$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
