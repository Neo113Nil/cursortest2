package ru.ozon.app.android.travel.utils.asyncWidget;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.composer.widgets.async.data.api.ComposerAsyncWidgetResponse;
import xe.M;

/* JADX INFO: Add missing generic type declarations: [VO] */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"VO", "Lxe/M;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;", "<anonymous>", "(Lxe/M;)Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.utils.asyncWidget.AbstractAsyncWidgetViewModel$mapAsyncWidgetResponse$2", f = "AbstractAsyncWidgetViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AbstractAsyncWidgetViewModel$mapAsyncWidgetResponse$2<VO> extends j implements Function2<M, d<? super AsyncWidgetFetchedModel<VO>>, Object> {
    final /* synthetic */ ComposerAsyncWidgetResponse<DTO> $response;
    int label;
    final /* synthetic */ AbstractAsyncWidgetViewModel<DTO, VO> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbstractAsyncWidgetViewModel$mapAsyncWidgetResponse$2(AbstractAsyncWidgetViewModel<DTO, VO> abstractAsyncWidgetViewModel, ComposerAsyncWidgetResponse<DTO> composerAsyncWidgetResponse, d<? super AbstractAsyncWidgetViewModel$mapAsyncWidgetResponse$2> dVar) {
        super(2, dVar);
        this.this$0 = abstractAsyncWidgetViewModel;
        this.$response = composerAsyncWidgetResponse;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AbstractAsyncWidgetViewModel$mapAsyncWidgetResponse$2(this.this$0, this.$response, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        AsyncWidgetStateMapper asyncWidgetStateMapper;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        asyncWidgetStateMapper = ((AbstractAsyncWidgetViewModel) this.this$0).stateMapper;
        return new AsyncWidgetFetchedModel(asyncWidgetStateMapper.mapAsyncState(this.$response.getState()), this.$response.getTrackingPayloads(), this.$response.getMetrics());
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super AsyncWidgetFetchedModel<VO>> dVar) {
        return ((AbstractAsyncWidgetViewModel$mapAsyncWidgetResponse$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
