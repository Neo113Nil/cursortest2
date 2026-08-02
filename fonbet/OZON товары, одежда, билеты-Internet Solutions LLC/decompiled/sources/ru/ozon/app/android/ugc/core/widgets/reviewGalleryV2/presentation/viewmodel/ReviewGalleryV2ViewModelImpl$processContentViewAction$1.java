package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewmodel;

import Ge.f;
import Sc.s;
import Wc.a;
import io.reactivex.y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewmodel.ReviewGalleryV2ViewModelImpl$processContentViewAction$1", f = "ReviewGalleryV2ViewModel.kt", l = {158}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ReviewGalleryV2ViewModelImpl$processContentViewAction$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AtomAction.ComposerAction $action;
    int label;
    final /* synthetic */ ReviewGalleryV2ViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewGalleryV2ViewModelImpl$processContentViewAction$1(ReviewGalleryV2ViewModelImpl reviewGalleryV2ViewModelImpl, AtomAction.ComposerAction composerAction, d<? super ReviewGalleryV2ViewModelImpl$processContentViewAction$1> dVar) {
        super(2, dVar);
        this.this$0 = reviewGalleryV2ViewModelImpl;
        this.$action = composerAction;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ReviewGalleryV2ViewModelImpl$processContentViewAction$1(this.this$0, this.$action, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ActionV2Repository actionV2Repository;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            actionV2Repository = this.this$0.actionV2Repository;
            String id2 = this.$action.getId();
            if (id2 == null) {
                id2 = "";
            }
            y callAction = actionV2Repository.callAction(new ActionV2Request(this.$action.getParams(), id2, false, 4, null), Object.class);
            this.label = 1;
            if (f.b(callAction, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ReviewGalleryV2ViewModelImpl$processContentViewAction$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
