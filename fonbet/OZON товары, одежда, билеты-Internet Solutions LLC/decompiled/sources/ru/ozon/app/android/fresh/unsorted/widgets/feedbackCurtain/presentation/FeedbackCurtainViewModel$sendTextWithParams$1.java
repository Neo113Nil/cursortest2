package ru.ozon.app.android.fresh.unsorted.widgets.feedbackCurtain.presentation;

import Sc.s;
import Wc.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import retrofit2.Response;
import ru.ozon.app.android.fresh.unsorted.widgets.feedbackCurtain.data.FeedbackCurtainApi;
import ru.ozon.app.android.fresh.unsorted.widgets.feedbackCurtain.data.FeedbackEvent;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.unsorted.widgets.feedbackCurtain.presentation.FeedbackCurtainViewModel$sendTextWithParams$1", f = "FeedbackCurtainViewModel.kt", l = {32}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class FeedbackCurtainViewModel$sendTextWithParams$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Map<String, String> $params;
    int label;
    final /* synthetic */ FeedbackCurtainViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FeedbackCurtainViewModel$sendTextWithParams$1(FeedbackCurtainViewModel feedbackCurtainViewModel, Map<String, String> map, d<? super FeedbackCurtainViewModel$sendTextWithParams$1> dVar) {
        super(2, dVar);
        this.this$0 = feedbackCurtainViewModel;
        this.$params = map;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new FeedbackCurtainViewModel$sendTextWithParams$1(this.this$0, this.$params, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        FeedbackCurtainApi feedbackCurtainApi;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                s.b(obj);
                feedbackCurtainApi = this.this$0.api;
                Map<String, String> map = this.$params;
                this.label = 1;
                obj = feedbackCurtainApi.sendFeedback(map, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            this.this$0.getEvents().setValue(((Response) obj).code() == 200 ? FeedbackEvent.SUCCESS : FeedbackEvent.FAILURE);
        } catch (Exception unused) {
            this.this$0.getEvents().setValue(FeedbackEvent.FAILURE);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((FeedbackCurtainViewModel$sendTextWithParams$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
