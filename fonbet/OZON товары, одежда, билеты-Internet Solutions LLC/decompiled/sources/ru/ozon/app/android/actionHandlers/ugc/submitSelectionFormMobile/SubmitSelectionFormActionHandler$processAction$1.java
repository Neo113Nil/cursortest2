package ru.ozon.app.android.actionHandlers.ugc.submitSelectionFormMobile;

import Sc.r;
import Sc.s;
import WZ.g;
import WZ.l;
import WZ.m;
import WZ.t;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import i10.l;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import l10.InterfaceC7851b;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xe.C10720e0;
import xe.C10727i;
import xe.L0;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.actionHandlers.ugc.submitSelectionFormMobile.SubmitSelectionFormActionHandler$processAction$1", f = "SubmitSelectionFormActionHandler.kt", l = {67, ModuleDescriptor.MODULE_VERSION, 84}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class SubmitSelectionFormActionHandler$processAction$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AtomAction $action;
    final /* synthetic */ InterfaceC7851b $controller;
    final /* synthetic */ CustomActionHandler.HandlerReferences $handlerRefs;
    final /* synthetic */ ActionV2Request $request;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ SubmitSelectionFormActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubmitSelectionFormActionHandler$processAction$1(InterfaceC7851b interfaceC7851b, SubmitSelectionFormActionHandler submitSelectionFormActionHandler, ActionV2Request actionV2Request, AtomAction atomAction, CustomActionHandler.HandlerReferences handlerReferences, d<? super SubmitSelectionFormActionHandler$processAction$1> dVar) {
        super(2, dVar);
        this.$controller = interfaceC7851b;
        this.this$0 = submitSelectionFormActionHandler;
        this.$request = actionV2Request;
        this.$action = atomAction;
        this.$handlerRefs = handlerReferences;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g invokeSuspend$lambda$3$lambda$2$lambda$1(SubmitSelectionFormActionHandler submitSelectionFormActionHandler, UZ.a aVar, g gVar) {
        return g.a(gVar, U.i(new Pair("index", Integer.valueOf(submitSelectionFormActionHandler.getProductIds().size()))), null, 2);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        SubmitSelectionFormActionHandler$processAction$1 submitSelectionFormActionHandler$processAction$1 = new SubmitSelectionFormActionHandler$processAction$1(this.$controller, this.this$0, this.$request, this.$action, this.$handlerRefs, dVar);
        submitSelectionFormActionHandler$processAction$1.L$0 = obj;
        return submitSelectionFormActionHandler$processAction$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00eb  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a11;
        Object obj2;
        final SubmitSelectionFormActionHandler submitSelectionFormActionHandler;
        AtomAction atomAction;
        Object obj3;
        CustomActionHandler.HandlerReferences handlerReferences;
        Map<String, TokenizedTrackingInfo> trackingInfo;
        t mapToTokenizedEvent$default;
        l tokenizedAnalytics;
        Throwable b11;
        NotificationDTO errorNotificationDTO;
        ActionV2Repository actionV2Repository;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
        } catch (Throwable th2) {
            r.Companion companion = r.INSTANCE;
            a11 = s.a(th2);
        }
        if (i11 == 0) {
            s.b(obj);
            this.$controller.e(new l.a.C1079a(0L, null, 3));
            SubmitSelectionFormActionHandler submitSelectionFormActionHandler2 = this.this$0;
            ActionV2Request actionV2Request = this.$request;
            r.Companion companion2 = r.INSTANCE;
            actionV2Repository = submitSelectionFormActionHandler2.actionV2Repository;
            this.label = 1;
            obj = actionV2Repository.callActionSuspend(actionV2Request, SubmitSelectionResponse.class, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    submitSelectionFormActionHandler = (SubmitSelectionFormActionHandler) this.L$1;
                    obj2 = this.L$0;
                    s.b(obj);
                    submitSelectionFormActionHandler.setTokenizedAnalytics(null);
                    InterfaceC7851b interfaceC7851b = this.$controller;
                    SubmitSelectionFormActionHandler submitSelectionFormActionHandler3 = this.this$0;
                    CustomActionHandler.HandlerReferences handlerReferences2 = this.$handlerRefs;
                    b11 = r.b(obj2);
                    if (b11 != null) {
                        interfaceC7851b.hideLoader();
                        Lm0.a.f17149a.e(b11);
                        errorNotificationDTO = submitSelectionFormActionHandler3.getErrorNotificationDTO();
                        submitSelectionFormActionHandler3.showNotification(errorNotificationDTO, handlerReferences2.getRefs());
                        submitSelectionFormActionHandler3.setTokenizedAnalytics(null);
                    }
                    return Unit.f71690a;
                }
                submitSelectionFormActionHandler = (SubmitSelectionFormActionHandler) this.L$3;
                handlerReferences = (CustomActionHandler.HandlerReferences) this.L$2;
                atomAction = (AtomAction) this.L$1;
                obj3 = this.L$0;
                s.b(obj);
                trackingInfo = ((AtomAction.ComposerAction) atomAction).getTrackingInfo();
                if (trackingInfo != null && (mapToTokenizedEvent$default = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, handlerReferences.getVoId(), null, 2, null)) != null && (tokenizedAnalytics = submitSelectionFormActionHandler.getTokenizedAnalytics()) != null) {
                    m.a(tokenizedAnalytics, mapToTokenizedEvent$default, new WZ.e() { // from class: ru.ozon.app.android.actionHandlers.ugc.submitSelectionFormMobile.a
                        @Override // WZ.e
                        public final g modifyParams(UZ.a aVar2, g gVar) {
                            g invokeSuspend$lambda$3$lambda$2$lambda$1;
                            invokeSuspend$lambda$3$lambda$2$lambda$1 = SubmitSelectionFormActionHandler$processAction$1.invokeSuspend$lambda$3$lambda$2$lambda$1(SubmitSelectionFormActionHandler.this, (UZ.d) aVar2, gVar);
                            return invokeSuspend$lambda$3$lambda$2$lambda$1;
                        }
                    });
                }
                obj2 = obj3;
                submitSelectionFormActionHandler.setTokenizedAnalytics(null);
                InterfaceC7851b interfaceC7851b2 = this.$controller;
                SubmitSelectionFormActionHandler submitSelectionFormActionHandler32 = this.this$0;
                CustomActionHandler.HandlerReferences handlerReferences22 = this.$handlerRefs;
                b11 = r.b(obj2);
                if (b11 != null) {
                }
                return Unit.f71690a;
            }
            s.b(obj);
        }
        a11 = (SubmitSelectionResponse) ((ActionV2Response) obj).getData();
        r.Companion companion3 = r.INSTANCE;
        obj2 = a11;
        InterfaceC7851b interfaceC7851b3 = this.$controller;
        AtomAction atomAction2 = this.$action;
        CustomActionHandler.HandlerReferences handlerReferences3 = this.$handlerRefs;
        SubmitSelectionFormActionHandler submitSelectionFormActionHandler4 = this.this$0;
        if (!(obj2 instanceof r.b)) {
            SubmitSelectionResponse submitSelectionResponse = (SubmitSelectionResponse) obj2;
            interfaceC7851b3.hideLoader();
            if (submitSelectionResponse != null) {
                C10720e0 c10720e0 = C10720e0.f105451a;
                L0 l02 = De.s.f6650a;
                SubmitSelectionFormActionHandler$processAction$1$2$1 submitSelectionFormActionHandler$processAction$1$2$1 = new SubmitSelectionFormActionHandler$processAction$1$2$1(submitSelectionResponse, submitSelectionFormActionHandler4, handlerReferences3, null);
                this.L$0 = obj2;
                this.L$1 = atomAction2;
                this.L$2 = handlerReferences3;
                this.L$3 = submitSelectionFormActionHandler4;
                this.label = 2;
                if (C10727i.f(l02, submitSelectionFormActionHandler$processAction$1$2$1, this) != aVar) {
                    atomAction = atomAction2;
                    submitSelectionFormActionHandler = submitSelectionFormActionHandler4;
                    obj3 = obj2;
                    handlerReferences = handlerReferences3;
                    trackingInfo = ((AtomAction.ComposerAction) atomAction).getTrackingInfo();
                    if (trackingInfo != null) {
                        m.a(tokenizedAnalytics, mapToTokenizedEvent$default, new WZ.e() { // from class: ru.ozon.app.android.actionHandlers.ugc.submitSelectionFormMobile.a
                            @Override // WZ.e
                            public final g modifyParams(UZ.a aVar2, g gVar) {
                                g invokeSuspend$lambda$3$lambda$2$lambda$1;
                                invokeSuspend$lambda$3$lambda$2$lambda$1 = SubmitSelectionFormActionHandler$processAction$1.invokeSuspend$lambda$3$lambda$2$lambda$1(SubmitSelectionFormActionHandler.this, (UZ.d) aVar2, gVar);
                                return invokeSuspend$lambda$3$lambda$2$lambda$1;
                            }
                        });
                    }
                    obj2 = obj3;
                    submitSelectionFormActionHandler.setTokenizedAnalytics(null);
                }
            } else {
                C10720e0 c10720e02 = C10720e0.f105451a;
                L0 l03 = De.s.f6650a;
                SubmitSelectionFormActionHandler$processAction$1$2$3 submitSelectionFormActionHandler$processAction$1$2$3 = new SubmitSelectionFormActionHandler$processAction$1$2$3(submitSelectionFormActionHandler4, handlerReferences3, null);
                this.L$0 = obj2;
                this.L$1 = submitSelectionFormActionHandler4;
                this.label = 3;
                if (C10727i.f(l03, submitSelectionFormActionHandler$processAction$1$2$3, this) != aVar) {
                    submitSelectionFormActionHandler = submitSelectionFormActionHandler4;
                    submitSelectionFormActionHandler.setTokenizedAnalytics(null);
                }
            }
            return aVar;
        }
        InterfaceC7851b interfaceC7851b22 = this.$controller;
        SubmitSelectionFormActionHandler submitSelectionFormActionHandler322 = this.this$0;
        CustomActionHandler.HandlerReferences handlerReferences222 = this.$handlerRefs;
        b11 = r.b(obj2);
        if (b11 != null) {
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((SubmitSelectionFormActionHandler$processAction$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
