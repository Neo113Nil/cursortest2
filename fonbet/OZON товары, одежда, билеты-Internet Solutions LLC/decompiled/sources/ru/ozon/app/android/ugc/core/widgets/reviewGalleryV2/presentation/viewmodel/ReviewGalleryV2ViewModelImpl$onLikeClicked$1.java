package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewmodel;

import Sc.r;
import Sc.s;
import Wc.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.pdp.ui.configurators.ugc.data.ProductReviewRepository;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryComposerAction;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewmodel.ReviewGalleryV2ViewModel;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewmodel.ReviewGalleryV2ViewModelImpl$onLikeClicked$1", f = "ReviewGalleryV2ViewModel.kt", l = {175}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ReviewGalleryV2ViewModelImpl$onLikeClicked$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AtomAction.ComposerAction $action;
    int label;
    final /* synthetic */ ReviewGalleryV2ViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewGalleryV2ViewModelImpl$onLikeClicked$1(ReviewGalleryV2ViewModelImpl reviewGalleryV2ViewModelImpl, AtomAction.ComposerAction composerAction, d<? super ReviewGalleryV2ViewModelImpl$onLikeClicked$1> dVar) {
        super(2, dVar);
        this.this$0 = reviewGalleryV2ViewModelImpl;
        this.$action = composerAction;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ReviewGalleryV2ViewModelImpl$onLikeClicked$1(this.this$0, this.$action, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ProductReviewRepository productReviewRepository;
        Object m874processAction0E7RQCE;
        ReviewGalleryComposerAction fromValue;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            this.this$0.isLikeChangeRequestRunning = true;
            productReviewRepository = this.this$0.productReviewRepository;
            String actionName = this.$action.getActionName();
            Map<String, String> params = this.$action.getParams();
            this.label = 1;
            m874processAction0E7RQCE = productReviewRepository.m874processAction0E7RQCE(actionName, params, this);
            if (m874processAction0E7RQCE == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            m874processAction0E7RQCE = ((r) obj).getF26106a();
        }
        AtomAction.ComposerAction composerAction = this.$action;
        ReviewGalleryV2ViewModelImpl reviewGalleryV2ViewModelImpl = this.this$0;
        r.Companion companion = r.INSTANCE;
        if (!(m874processAction0E7RQCE instanceof r.b) && (fromValue = ReviewGalleryComposerAction.INSTANCE.fromValue(composerAction.getId())) != null) {
            reviewGalleryV2ViewModelImpl.getActionResult().setValue(new ReviewGalleryV2ViewModel.ActionResult.Success(fromValue));
        }
        AtomAction.ComposerAction composerAction2 = this.$action;
        ReviewGalleryV2ViewModelImpl reviewGalleryV2ViewModelImpl2 = this.this$0;
        Throwable b11 = r.b(m874processAction0E7RQCE);
        if (b11 != null) {
            ReviewGalleryComposerAction fromValue2 = ReviewGalleryComposerAction.INSTANCE.fromValue(composerAction2.getId());
            if (fromValue2 != null) {
                reviewGalleryV2ViewModelImpl2.getActionResult().setValue(new ReviewGalleryV2ViewModel.ActionResult.Error(fromValue2, b11));
            }
            Lm0.a.f17149a.e(b11);
        }
        this.this$0.isLikeChangeRequestRunning = false;
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ReviewGalleryV2ViewModelImpl$onLikeClicked$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
