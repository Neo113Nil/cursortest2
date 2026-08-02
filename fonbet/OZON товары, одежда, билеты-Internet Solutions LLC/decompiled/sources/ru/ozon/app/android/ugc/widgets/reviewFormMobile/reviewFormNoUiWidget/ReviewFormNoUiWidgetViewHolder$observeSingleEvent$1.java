package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormNoUiWidget;

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
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation.SingleEvent;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormHeader.ReviewFormHeaderVO;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormNoUiWidget.ReviewFormNoUiWidgetViewHolder$onBackPressedCallback$2;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "event", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/SingleEvent;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormNoUiWidget.ReviewFormNoUiWidgetViewHolder$observeSingleEvent$1", f = "ReviewFormNoUiWidgetViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ReviewFormNoUiWidgetViewHolder$observeSingleEvent$1 extends j implements Function2<SingleEvent, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ReviewFormNoUiWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewFormNoUiWidgetViewHolder$observeSingleEvent$1(ReviewFormNoUiWidgetViewHolder reviewFormNoUiWidgetViewHolder, d<? super ReviewFormNoUiWidgetViewHolder$observeSingleEvent$1> dVar) {
        super(2, dVar);
        this.this$0 = reviewFormNoUiWidgetViewHolder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g invokeSuspend$lambda$3$lambda$2(SingleEvent singleEvent, UZ.a aVar, g gVar) {
        return g.a(gVar, ((SingleEvent.UpdateClosingTrackingInfo) singleEvent).getCustomTrackingInfo(), null, 2);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        ReviewFormNoUiWidgetViewHolder$observeSingleEvent$1 reviewFormNoUiWidgetViewHolder$observeSingleEvent$1 = new ReviewFormNoUiWidgetViewHolder$observeSingleEvent$1(this.this$0, dVar);
        reviewFormNoUiWidgetViewHolder$observeSingleEvent$1.L$0 = obj;
        return reviewFormNoUiWidgetViewHolder$observeSingleEvent$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ReviewFormNoUiWidgetViewHolder$onBackPressedCallback$2.AnonymousClass1 onBackPressedCallback;
        ReviewFormHeaderVO.PlaceholdersSheetConfigVO placeholdersSheetConfig;
        AtomAction action;
        Function1 actionHandler;
        ReviewFormHeaderVO.SubmitOnBackConfigVO submitOnBackConfig;
        Function1 actionHandler2;
        Function1 actionHandler3;
        ComposerNavigator composerNavigator;
        t closeReviewFormEvent;
        l lVar;
        Function1 actionHandler4;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        final SingleEvent singleEvent = (SingleEvent) this.L$0;
        if (singleEvent instanceof SingleEvent.UpdateClosingTrackingInfo) {
            AtomAction action2 = ((SingleEvent.UpdateClosingTrackingInfo) singleEvent).getAction();
            AtomAction.Dismiss dismiss = action2 instanceof AtomAction.Dismiss ? (AtomAction.Dismiss) action2 : null;
            if (dismiss != null) {
                actionHandler4 = this.this$0.getActionHandler();
                actionHandler4.invoke(dismiss.mutateTrackingInfo((Map<String, TokenizedTrackingInfo>) null));
            } else {
                composerNavigator = this.this$0.composerNavigator;
                composerNavigator.popBackStack();
            }
            ReviewFormNoUiParamsVO boundData = this.this$0.getBoundData();
            if (boundData != null && (closeReviewFormEvent = boundData.getCloseReviewFormEvent()) != null) {
                lVar = this.this$0.tokenizedAnalytics;
                m.a(lVar, closeReviewFormEvent, new WZ.e() { // from class: ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormNoUiWidget.a
                    @Override // WZ.e
                    public final g modifyParams(UZ.a aVar2, g gVar) {
                        g invokeSuspend$lambda$3$lambda$2;
                        invokeSuspend$lambda$3$lambda$2 = ReviewFormNoUiWidgetViewHolder$observeSingleEvent$1.invokeSuspend$lambda$3$lambda$2(SingleEvent.this, (UZ.d) aVar2, gVar);
                        return invokeSuspend$lambda$3$lambda$2;
                    }
                });
            }
        } else if (singleEvent instanceof SingleEvent.SubmitAndCloseReview) {
            ReviewFormNoUiParamsVO boundData2 = this.this$0.getBoundData();
            if (boundData2 != null && (submitOnBackConfig = boundData2.getSubmitOnBackConfig()) != null) {
                ReviewFormNoUiWidgetViewHolder reviewFormNoUiWidgetViewHolder = this.this$0;
                actionHandler2 = reviewFormNoUiWidgetViewHolder.getActionHandler();
                actionHandler2.invoke(submitOnBackConfig.getSubmitAction());
                actionHandler3 = reviewFormNoUiWidgetViewHolder.getActionHandler();
                actionHandler3.invoke(submitOnBackConfig.getBackAction());
            }
        } else if (singleEvent instanceof SingleEvent.ShowActionsSheet) {
            ReviewFormNoUiParamsVO boundData3 = this.this$0.getBoundData();
            if (boundData3 == null || (placeholdersSheetConfig = boundData3.getPlaceholdersSheetConfig()) == null || (action = placeholdersSheetConfig.getAction()) == null) {
                return Unit.f71690a;
            }
            actionHandler = this.this$0.getActionHandler();
            actionHandler.invoke(action);
        } else if (singleEvent instanceof SingleEvent.UpdateLoader) {
            onBackPressedCallback = this.this$0.getOnBackPressedCallback();
            onBackPressedCallback.setEnabled(!((SingleEvent.UpdateLoader) singleEvent).getShow());
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SingleEvent singleEvent, d<? super Unit> dVar) {
        return ((ReviewFormNoUiWidgetViewHolder$observeSingleEvent$1) create(singleEvent, dVar)).invokeSuspend(Unit.f71690a);
    }
}
