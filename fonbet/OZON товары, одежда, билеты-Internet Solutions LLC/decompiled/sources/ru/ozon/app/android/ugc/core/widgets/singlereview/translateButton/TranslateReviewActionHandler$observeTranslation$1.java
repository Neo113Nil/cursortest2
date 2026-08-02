package ru.ozon.app.android.ugc.core.widgets.singlereview.translateButton;

import Sc.o;
import Sc.s;
import Wc.a;
import androidx.fragment.app.r;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.storefrontcommonwidgets.core.appType.AppTypeResolver;
import ru.ozon.app.android.ugc.core.widgets.singlereview.translateButton.TranslateButtonViewMapper;
import ru.ozon.app.android.ugc.core.widgets.singlereview.translateButton.presentation.TranslateButtonVO;
import ru.ozon.app.android.ugc.core.widgets.singlereview.translateButton.presentation.TranslateViewModel;
import ru.ozon.app.android.uikit.utils.NotificationBarHelperKt;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, d2 = {"<anonymous>", "", "state", "", "", "Lru/ozon/app/android/ugc/core/widgets/singlereview/translateButton/presentation/TranslateViewModel$TranslateState;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.ugc.core.widgets.singlereview.translateButton.TranslateReviewActionHandler$observeTranslation$1", f = "TranslateReviewActionHandler.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class TranslateReviewActionHandler$observeTranslation$1 extends j implements Function2<Map<Long, ? extends TranslateViewModel.TranslateState>, d<? super Unit>, Object> {
    final /* synthetic */ CustomActionHandler.HandlerReferences $handlerRefs;
    final /* synthetic */ TranslateButtonVO $vo;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TranslateReviewActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TranslateReviewActionHandler$observeTranslation$1(TranslateButtonVO translateButtonVO, TranslateReviewActionHandler translateReviewActionHandler, CustomActionHandler.HandlerReferences handlerReferences, d<? super TranslateReviewActionHandler$observeTranslation$1> dVar) {
        super(2, dVar);
        this.$vo = translateButtonVO;
        this.this$0 = translateReviewActionHandler;
        this.$handlerRefs = handlerReferences;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        TranslateReviewActionHandler$observeTranslation$1 translateReviewActionHandler$observeTranslation$1 = new TranslateReviewActionHandler$observeTranslation$1(this.$vo, this.this$0, this.$handlerRefs, dVar);
        translateReviewActionHandler$observeTranslation$1.L$0 = obj;
        return translateReviewActionHandler$observeTranslation$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        TranslateViewModel.TranslateState translateState = (TranslateViewModel.TranslateState) ((Map) this.L$0).get(new Long(this.$vo.getId()));
        if (translateState instanceof TranslateViewModel.TranslateState.Error) {
            this.this$0.handleError(this.$handlerRefs, this.$vo, ((TranslateViewModel.TranslateState.Error) translateState).getNotificationDTO());
        } else {
            if (translateState instanceof TranslateViewModel.TranslateState.NetworkError) {
                TranslateReviewActionHandler translateReviewActionHandler = this.this$0;
                CustomActionHandler.HandlerReferences handlerReferences = this.$handlerRefs;
                TranslateButtonVO translateButtonVO = this.$vo;
                r a11 = handlerReferences.getRefs().getContainer().a();
                translateReviewActionHandler.handleError(handlerReferences, translateButtonVO, NotificationBarHelperKt.createNetworkErrorNotificationDTO(a11 != null && AppTypeResolver.INSTANCE.isSelect(a11)));
            } else if (Intrinsics.d(translateState, TranslateViewModel.TranslateState.Loading.INSTANCE)) {
                this.$handlerRefs.getRefs().getController().update(new TranslateShowLoadingUpdateKey(this.$vo.getId(), true));
            } else {
                if (!(translateState instanceof TranslateViewModel.TranslateState.Success)) {
                    if (translateState == null) {
                        return Unit.f71690a;
                    }
                    throw new o();
                }
                this.$handlerRefs.getRefs().getController().update(new TranslateButtonViewMapper.TranslatedUpdateKey(this.$vo.getReviewId(), ((TranslateViewModel.TranslateState.Success) translateState).getAtoms(), false, 4, null));
                this.this$0.releaseStateListenerJob();
            }
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Map<Long, ? extends TranslateViewModel.TranslateState> map, d<? super Unit> dVar) {
        return ((TranslateReviewActionHandler$observeTranslation$1) create(map, dVar)).invokeSuspend(Unit.f71690a);
    }
}
