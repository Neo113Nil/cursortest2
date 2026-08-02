package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormSubmitButton;

import Sc.s;
import WZ.g;
import WZ.l;
import WZ.m;
import WZ.t;
import i10.l;
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
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.pdp.ui.configurators.NotificationsKt;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation.SingleEvent;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "event", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/SingleEvent;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormSubmitButton.ReviewSubmitButtonViewHolder$observeSingleEvent$1", f = "ReviewSubmitButtonViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ReviewSubmitButtonViewHolder$observeSingleEvent$1 extends j implements Function2<SingleEvent, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ReviewSubmitButtonViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewSubmitButtonViewHolder$observeSingleEvent$1(ReviewSubmitButtonViewHolder reviewSubmitButtonViewHolder, d<? super ReviewSubmitButtonViewHolder$observeSingleEvent$1> dVar) {
        super(2, dVar);
        this.this$0 = reviewSubmitButtonViewHolder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g invokeSuspend$lambda$2$lambda$1$lambda$0(SingleEvent singleEvent, UZ.a aVar, g gVar) {
        return g.a(gVar, ((SingleEvent.PassResult) singleEvent).getCustomTrackingInfo(), null, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g invokeSuspend$lambda$5$lambda$4$lambda$3(SingleEvent singleEvent, UZ.a aVar, g gVar) {
        return g.a(gVar, ((SingleEvent.ProcessValidationAction) singleEvent).getCustomTrackingInfo(), null, 2);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        ReviewSubmitButtonViewHolder$observeSingleEvent$1 reviewSubmitButtonViewHolder$observeSingleEvent$1 = new ReviewSubmitButtonViewHolder$observeSingleEvent$1(this.this$0, dVar);
        reviewSubmitButtonViewHolder$observeSingleEvent$1.L$0 = obj;
        return reviewSubmitButtonViewHolder$observeSingleEvent$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        AtomAction atomAction;
        Function1 actionHandler;
        t mapToTokenizedEvent$default;
        l lVar;
        t mapToTokenizedEvent$default2;
        l lVar2;
        t submitErrorEvent;
        l lVar3;
        i iVar;
        boolean z11;
        i iVar2;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        final SingleEvent singleEvent = (SingleEvent) this.L$0;
        if (singleEvent instanceof SingleEvent.UpdateLoader) {
            if (((SingleEvent.UpdateLoader) singleEvent).getShow()) {
                z11 = this.this$0.isSelect;
                l.a.b bVar = z11 ? new l.a.b(0L, new Integer(0), 1) : new l.a.b(0L, null, 3);
                iVar2 = this.this$0.container;
                iVar2.M().e(bVar);
            } else {
                iVar = this.this$0.container;
                iVar.M().hideLoader();
            }
        } else if (singleEvent instanceof SingleEvent.ShowError) {
            ReviewSubmitButtonViewHolder reviewSubmitButtonViewHolder = this.this$0;
            SingleEvent.ShowError showError = (SingleEvent.ShowError) singleEvent;
            NotificationDTO notification = showError.getNotification();
            if (notification == null) {
                notification = NotificationsKt.createUnknownErrorNotification();
            }
            ReviewSubmitButtonViewHolder.showNotification$default(reviewSubmitButtonViewHolder, notification, showError.getNotificationHaptic(), false, 4, null);
            ReviewFormSubmitButtonVO reviewFormSubmitButtonVO = (ReviewFormSubmitButtonVO) this.this$0.getBoundData();
            if (reviewFormSubmitButtonVO != null && (submitErrorEvent = reviewFormSubmitButtonVO.getSubmitErrorEvent()) != null) {
                lVar3 = this.this$0.tokenizedAnalytics;
                m.a(lVar3, submitErrorEvent, null);
            }
        } else if (singleEvent instanceof SingleEvent.ShowNotification) {
            SingleEvent.ShowNotification showNotification = (SingleEvent.ShowNotification) singleEvent;
            this.this$0.showNotification(showNotification.getNotification(), showNotification.getNotificationHaptic(), showNotification.getIsError());
        } else if (singleEvent instanceof SingleEvent.PassResult) {
            ReviewFormSubmitButtonVO reviewFormSubmitButtonVO2 = (ReviewFormSubmitButtonVO) this.this$0.getBoundData();
            if (reviewFormSubmitButtonVO2 != null) {
                long id2 = reviewFormSubmitButtonVO2.getId();
                ReviewSubmitButtonViewHolder reviewSubmitButtonViewHolder2 = this.this$0;
                Map<String, TokenizedTrackingInfo> trackingInfo = ((SingleEvent.PassResult) singleEvent).getTrackingInfo();
                if (trackingInfo != null && (mapToTokenizedEvent$default2 = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, new Long(id2), null, 2, null)) != null) {
                    lVar2 = reviewSubmitButtonViewHolder2.tokenizedAnalytics;
                    m.a(lVar2, mapToTokenizedEvent$default2, new WZ.e() { // from class: ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormSubmitButton.a
                        @Override // WZ.e
                        public final g modifyParams(UZ.a aVar2, g gVar) {
                            g invokeSuspend$lambda$2$lambda$1$lambda$0;
                            invokeSuspend$lambda$2$lambda$1$lambda$0 = ReviewSubmitButtonViewHolder$observeSingleEvent$1.invokeSuspend$lambda$2$lambda$1$lambda$0(SingleEvent.this, (UZ.d) aVar2, gVar);
                            return invokeSuspend$lambda$2$lambda$1$lambda$0;
                        }
                    });
                }
            }
            this.this$0.onSubmitResult(((SingleEvent.PassResult) singleEvent).getLink());
        } else if (singleEvent instanceof SingleEvent.ProcessValidationAction) {
            ReviewFormSubmitButtonVO reviewFormSubmitButtonVO3 = (ReviewFormSubmitButtonVO) this.this$0.getBoundData();
            if (reviewFormSubmitButtonVO3 != null) {
                long id3 = reviewFormSubmitButtonVO3.getId();
                ReviewSubmitButtonViewHolder reviewSubmitButtonViewHolder3 = this.this$0;
                Map<String, TokenizedTrackingInfo> trackingInfo2 = ((SingleEvent.ProcessValidationAction) singleEvent).getTrackingInfo();
                if (trackingInfo2 != null && (mapToTokenizedEvent$default = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo2, new Long(id3), null, 2, null)) != null) {
                    lVar = reviewSubmitButtonViewHolder3.tokenizedAnalytics;
                    TokenizedAnalyticsExtensionsKt.processViewEvents(lVar, mapToTokenizedEvent$default, new WZ.e() { // from class: ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormSubmitButton.b
                        @Override // WZ.e
                        public final g modifyParams(UZ.a aVar2, g gVar) {
                            g invokeSuspend$lambda$5$lambda$4$lambda$3;
                            invokeSuspend$lambda$5$lambda$4$lambda$3 = ReviewSubmitButtonViewHolder$observeSingleEvent$1.invokeSuspend$lambda$5$lambda$4$lambda$3(SingleEvent.this, (UZ.d) aVar2, gVar);
                            return invokeSuspend$lambda$5$lambda$4$lambda$3;
                        }
                    });
                }
            }
            SingleEvent.ProcessValidationAction processValidationAction = (SingleEvent.ProcessValidationAction) singleEvent;
            AtomActionDTO action = processValidationAction.getAction();
            if (action != null && (atomAction = AtomActionMapperKt.toAtomAction(action, processValidationAction.getTrackingInfo())) != null) {
                actionHandler = this.this$0.getActionHandler();
                actionHandler.invoke(atomAction);
            }
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SingleEvent singleEvent, d<? super Unit> dVar) {
        return ((ReviewSubmitButtonViewHolder$observeSingleEvent$1) create(singleEvent, dVar)).invokeSuspend(Unit.f71690a);
    }
}
