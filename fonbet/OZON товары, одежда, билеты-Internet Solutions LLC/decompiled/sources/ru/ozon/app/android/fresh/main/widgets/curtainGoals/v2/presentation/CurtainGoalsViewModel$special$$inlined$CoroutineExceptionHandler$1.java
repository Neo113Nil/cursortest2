package ru.ozon.app.android.fresh.main.widgets.curtainGoals.v2.presentation;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.a;
import ru.ozon.app.android.fresh.main.widgets.curtainGoals.v2.api.CurtainGoalsResponse;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import xe.J;

@Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"ru/ozon/app/android/fresh/main/widgets/curtainGoals/v2/presentation/CurtainGoalsViewModel$special$$inlined$CoroutineExceptionHandler$1", "Lkotlin/coroutines/a;", "Lxe/J;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "handleException", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CurtainGoalsViewModel$special$$inlined$CoroutineExceptionHandler$1 extends a implements J {
    final /* synthetic */ CurtainGoalsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CurtainGoalsViewModel$special$$inlined$CoroutineExceptionHandler$1(J.a aVar, CurtainGoalsViewModel curtainGoalsViewModel) {
        super(aVar);
        this.this$0 = curtainGoalsViewModel;
    }

    @Override // xe.J
    public void handleException(CoroutineContext context, Throwable exception) {
        SingleLiveEvent singleLiveEvent;
        CurtainGoalsResponse curtainGoalsResponse;
        singleLiveEvent = this.this$0._appliedCouponResult;
        curtainGoalsResponse = this.this$0.errorResponse;
        singleLiveEvent.postValue(curtainGoalsResponse);
    }
}
