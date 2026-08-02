package ru.ozon.app.android.ugc.widgets.selectionItemForm.submitButton;

import An.C2439a;
import Sc.s;
import WZ.g;
import WZ.l;
import WZ.m;
import WZ.t;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import l10.i;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.pdp.ui.configurators.ugc.common.SubmitButtonAvailabilityUpdate;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.presentation.SingleEvent;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "event", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/SingleEvent;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.ugc.widgets.selectionItemForm.submitButton.SelectionFormSubmitButtonVH$observeSingleEvent$1", f = "SelectionFormSubmitButtonVH.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SelectionFormSubmitButtonVH$observeSingleEvent$1 extends j implements Function2<SingleEvent, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SelectionFormSubmitButtonVH this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectionFormSubmitButtonVH$observeSingleEvent$1(SelectionFormSubmitButtonVH selectionFormSubmitButtonVH, d<? super SelectionFormSubmitButtonVH$observeSingleEvent$1> dVar) {
        super(2, dVar);
        this.this$0 = selectionFormSubmitButtonVH;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g invokeSuspend$lambda$2$lambda$1$lambda$0(SingleEvent singleEvent, UZ.a aVar, g gVar) {
        return g.a(gVar, ((SingleEvent.HandleResponseAction) singleEvent).getCustomTrackingInfo(), null, 2);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        SelectionFormSubmitButtonVH$observeSingleEvent$1 selectionFormSubmitButtonVH$observeSingleEvent$1 = new SelectionFormSubmitButtonVH$observeSingleEvent$1(this.this$0, dVar);
        selectionFormSubmitButtonVH$observeSingleEvent$1.L$0 = obj;
        return selectionFormSubmitButtonVH$observeSingleEvent$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        i iVar;
        Function1 actionHandler;
        t mapToTokenizedEvent$default;
        l lVar;
        i iVar2;
        i iVar3;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        final SingleEvent singleEvent = (SingleEvent) this.L$0;
        if (singleEvent instanceof SingleEvent.UpdateLoader) {
            if (((SingleEvent.UpdateLoader) singleEvent).getShow()) {
                iVar3 = this.this$0.container;
                C2439a.b(0L, null, 3, iVar3.M());
            } else {
                iVar2 = this.this$0.container;
                iVar2.M().hideLoader();
            }
        } else if (singleEvent instanceof SingleEvent.HandleResponseAction) {
            SelectionFormSubmitButtonVO selectionFormSubmitButtonVO = (SelectionFormSubmitButtonVO) this.this$0.getBoundData();
            if (selectionFormSubmitButtonVO != null) {
                long id2 = selectionFormSubmitButtonVO.getId();
                SelectionFormSubmitButtonVH selectionFormSubmitButtonVH = this.this$0;
                Map<String, TokenizedTrackingInfo> trackingInfo = ((SingleEvent.HandleResponseAction) singleEvent).getTrackingInfo();
                if (trackingInfo != null && (mapToTokenizedEvent$default = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, new Long(id2), null, 2, null)) != null) {
                    lVar = selectionFormSubmitButtonVH.tokenizedAnalytics;
                    m.a(lVar, mapToTokenizedEvent$default, new WZ.e() { // from class: ru.ozon.app.android.ugc.widgets.selectionItemForm.submitButton.a
                        @Override // WZ.e
                        public final g modifyParams(UZ.a aVar2, g gVar) {
                            g invokeSuspend$lambda$2$lambda$1$lambda$0;
                            invokeSuspend$lambda$2$lambda$1$lambda$0 = SelectionFormSubmitButtonVH$observeSingleEvent$1.invokeSuspend$lambda$2$lambda$1$lambda$0(SingleEvent.this, (UZ.d) aVar2, gVar);
                            return invokeSuspend$lambda$2$lambda$1$lambda$0;
                        }
                    });
                }
            }
            SingleEvent.HandleResponseAction handleResponseAction = (SingleEvent.HandleResponseAction) singleEvent;
            this.this$0.refreshBloggerPage(handleResponseAction.getAction());
            actionHandler = this.this$0.getActionHandler();
            actionHandler.invoke(AtomActionMapperKt.toAtomAction(handleResponseAction.getAction(), null));
        } else if (singleEvent instanceof SingleEvent.ShowError) {
            SelectionFormSubmitButtonVH selectionFormSubmitButtonVH2 = this.this$0;
            NotificationDTO notification = ((SingleEvent.ShowError) singleEvent).getNotification();
            if (notification == null) {
                notification = this.this$0.getDefaultNotificationDTO();
            }
            selectionFormSubmitButtonVH2.showNotification(notification);
        } else if (singleEvent instanceof SingleEvent.ShowNotification) {
            this.this$0.showNotification(((SingleEvent.ShowNotification) singleEvent).getNotification());
        } else if (singleEvent instanceof SingleEvent.SubmitButtonAvailability) {
            iVar = this.this$0.container;
            iVar.M().update(new SubmitButtonAvailabilityUpdate(((SingleEvent.SubmitButtonAvailability) singleEvent).getEnable()));
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SingleEvent singleEvent, d<? super Unit> dVar) {
        return ((SelectionFormSubmitButtonVH$observeSingleEvent$1) create(singleEvent, dVar)).invokeSuspend(Unit.f71690a);
    }
}
