package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormPointsProgress;

import Ae.InterfaceC2397i;
import Ae.M0;
import Sc.C4005g;
import Sc.s;
import Wc.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation.ReviewFormViewModel;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormPointsProgress.ReviewFormPointsProgressDTO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormPointsProgress.ReviewFormPointsProgressVH$observePointsEvent$1", f = "ReviewFormPointsProgressVH.kt", l = {42}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ReviewFormPointsProgressVH$observePointsEvent$1 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ ReviewFormPointsProgressVH this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewFormPointsProgressVH$observePointsEvent$1(ReviewFormPointsProgressVH reviewFormPointsProgressVH, d<? super ReviewFormPointsProgressVH$observePointsEvent$1> dVar) {
        super(2, dVar);
        this.this$0 = reviewFormPointsProgressVH;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ReviewFormPointsProgressVH$observePointsEvent$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ReviewFormViewModel reviewFormViewModel;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            reviewFormViewModel = this.this$0.formViewModel;
            M0<ReviewFormPointsProgressDTO.FieldType> bonusKey = reviewFormViewModel.getBonusKey();
            final ReviewFormPointsProgressVH reviewFormPointsProgressVH = this.this$0;
            InterfaceC2397i<? super ReviewFormPointsProgressDTO.FieldType> interfaceC2397i = new InterfaceC2397i() { // from class: ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormPointsProgress.ReviewFormPointsProgressVH$observePointsEvent$1.1
                @Override // Ae.InterfaceC2397i
                public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                    return emit((ReviewFormPointsProgressDTO.FieldType) obj2, (d<? super Unit>) dVar);
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final Object emit(ReviewFormPointsProgressDTO.FieldType fieldType, d<? super Unit> dVar) {
                    ReviewFormPointsProgressView reviewFormPointsProgressView;
                    Map<ReviewFormPointsProgressDTO.FieldType, Integer> pointsMap;
                    Integer num;
                    reviewFormPointsProgressView = ReviewFormPointsProgressVH.this.pointsView;
                    ReviewFormPointsProgressVO reviewFormPointsProgressVO = (ReviewFormPointsProgressVO) ReviewFormPointsProgressVH.this.getBoundData();
                    if (reviewFormPointsProgressVO == null || (pointsMap = reviewFormPointsProgressVO.getPointsMap()) == null || (num = pointsMap.get(fieldType)) == null) {
                        return Unit.f71690a;
                    }
                    reviewFormPointsProgressView.setProgress(num.intValue());
                    return Unit.f71690a;
                }
            };
            this.label = 1;
            if (bonusKey.collect(interfaceC2397i, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        throw new C4005g();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ReviewFormPointsProgressVH$observePointsEvent$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
