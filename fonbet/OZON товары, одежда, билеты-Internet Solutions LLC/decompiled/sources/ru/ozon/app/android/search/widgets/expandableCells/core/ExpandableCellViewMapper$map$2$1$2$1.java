package ru.ozon.app.android.search.widgets.expandableCells.core;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.search.widgets.expandableCells.data.api.GetWarlockSectionResponse;
import ru.ozon.app.android.search.widgets.expandableCells.presentation.ExpandableCellVO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.search.widgets.expandableCells.core.ExpandableCellViewMapper$map$2$1$2$1", f = "ExpandableCellViewMapper.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class ExpandableCellViewMapper$map$2$1$2$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ ExpandableCellVO $expandableCellVO;
    final /* synthetic */ ActionV2Response<GetWarlockSectionResponse> $response;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ExpandableCellViewMapper$map$2$1$2$1(ExpandableCellVO expandableCellVO, ActionV2Response<GetWarlockSectionResponse> actionV2Response, d<? super ExpandableCellViewMapper$map$2$1$2$1> dVar) {
        super(2, dVar);
        this.$expandableCellVO = expandableCellVO;
        this.$response = actionV2Response;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ExpandableCellViewMapper$map$2$1$2$1(this.$expandableCellVO, this.$response, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        this.$expandableCellVO.setWarlockSectionResponse(this.$response.getData());
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ExpandableCellViewMapper$map$2$1$2$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
